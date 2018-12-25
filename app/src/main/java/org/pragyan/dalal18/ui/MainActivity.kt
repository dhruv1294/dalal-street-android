package org.pragyan.dalal18.ui

import android.content.*
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.GravityCompat
import androidx.localbroadcastmanager.content.LocalBroadcastManager
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import dalalstreet.api.DalalActionServiceGrpc
import dalalstreet.api.DalalStreamServiceGrpc
import dalalstreet.api.actions.LogoutRequest
import dalalstreet.api.actions.LogoutResponse
import dalalstreet.api.datastreams.*
import dalalstreet.api.models.TransactionType
import io.grpc.stub.StreamObserver
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.uiThread
import org.pragyan.dalal18.R
import org.pragyan.dalal18.dagger.ContextModule
import org.pragyan.dalal18.dagger.DaggerDalalStreetApplicationComponent
import org.pragyan.dalal18.data.GlobalStockDetails
import org.pragyan.dalal18.data.StockDetails
import org.pragyan.dalal18.notifications.NotificationService
import org.pragyan.dalal18.ui.LoginActivity.EMAIL_KEY
import org.pragyan.dalal18.ui.LoginActivity.PASSWORD_KEY
import org.pragyan.dalal18.utils.*
import java.text.DecimalFormat
import java.util.*
import javax.inject.Inject

/* Subscribes to GetTransactions*/
class MainActivity : AppCompatActivity(), ConnectionUtils.OnNetworkDownHandler {

    @Inject
    lateinit var actionServiceBlockingStub: DalalActionServiceGrpc.DalalActionServiceBlockingStub

    @Inject
    lateinit var streamServiceStub: DalalStreamServiceGrpc.DalalStreamServiceStub

    @Inject
    lateinit var streamServiceBlockingStub: DalalStreamServiceGrpc.DalalStreamServiceBlockingStub

    @Inject
    lateinit var preferences: SharedPreferences

    private val subscriptionIds = ArrayList<SubscriptionId>()

    private var helpDialog: AlertDialog? = null
    private var logoutDialog: AlertDialog? = null

    private var notifIntent: Intent? = null

    private var shouldUnsubscribe = true

    private val refreshCashStockReceiver = object : BroadcastReceiver() {
        override fun onReceive(context: Context, intent: Intent) {
            when (intent.action) {
                Constants.REFRESH_WORTH_TEXTVIEW_ACTION -> {
                    changeTextViewValue(stockWorthTextView, intent.getIntExtra(TOTAL_WORTH_KEY, 0), false)
                    changeTextViewValue(cashWorthTextView, intent.getIntExtra(TOTAL_WORTH_KEY, 0), true)
                }

                Constants.REFRESH_DIVIDEND_ACTION -> {
                    changeTextViewValue(totalWorthTextView, intent.getIntExtra(TOTAL_WORTH_KEY, 0), true)
                    changeTextViewValue(cashWorthTextView, intent.getIntExtra(TOTAL_WORTH_KEY, 0), true)
                }

                Constants.UPDATE_WORTH_VIA_STREAM_ACTION -> updateStockWorthViaStreamUpdates()
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tinyDB = TinyDB(this)
        tinyDB.remove(Constants.NOTIFICATION_SHARED_PREF)
        tinyDB.remove(Constants.NOTIFICATION_NEWS_SHARED_PREF)
        DaggerDalalStreetApplicationComponent.builder().contextModule(ContextModule(this)).build().inject(this)

        setSupportActionBar(mainToolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeAsUpIndicator(ContextCompat.getDrawable(this, R.drawable.hamburger_icon))

        setupNavigationDrawer()

        ownedStockDetails = intent.getParcelableArrayListExtra(STOCKS_OWNED_KEY)
        globalStockDetails = intent.getParcelableArrayListExtra(GLOBAL_STOCKS_KEY)
        StockUtils.createCompanyArrayFromGlobalStockDetails()

        updateValues()

        subscribeToStreamsAsynchronously()

        startMakingButtonsTransparent()
        updateStockWorthViaStreamUpdates()

        if (!intent.getBooleanExtra(SplashActivity.MARKET_OPEN_KEY, false)) {
            AlertDialog.Builder(this)
                    .setTitle("Market Closed")
                    .setMessage("Please check notifications for market opening time. Sorry for the inconvenience.")
                    .setCancelable(true)
                    .setPositiveButton("CLOSE") { dI, _ -> dI.dismiss() }
                    .show()
        }

        drawerEdgeButton.setOnClickListener { mainDrawerLayout.openDrawer(GravityCompat.START, true) }

        notifIntent = Intent(this, NotificationService::class.java)
        startService(notifIntent)
    }

    // Adding and setting up Navigation drawer
    private fun setupNavigationDrawer() {

        val host = supportFragmentManager.findFragmentById(R.id.main_host_fragment) as NavHostFragment
        navigationViewLeft.setupWithNavController(host.navController)

        //usernameTextView.text = intent.getStringExtra(LoginActivity.USERNAME_KEY)
        MiscellaneousUtils.username = intent.getStringExtra(LoginActivity.USERNAME_KEY)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        val id = item.itemId

        when (id) {
            R.id.action_help -> {
                val builder = AlertDialog.Builder(this)
                builder
                        .setCustomTitle(layoutInflater.inflate(R.layout.help_title, null))
                        .setView(layoutInflater.inflate(R.layout.help_box, null))
                        .setCancelable(true)
                        .show()
                helpDialog = builder.create()
                return true
            }

            R.id.action_logout -> {
                val logOutBuilder = AlertDialog.Builder(this)
                logOutBuilder
                        .setMessage("Do you want to logout ?")
                        .setPositiveButton("Logout") { _, _ -> logout() }
                        .setNegativeButton(getString(R.string.cancel)) { dialogInterface, _ -> dialogInterface.dismiss() }
                        .setTitle("Confirm Logout")
                        .setCancelable(true)
                        .show()
                logoutDialog = logOutBuilder.create()
                return true
            }

            android.R.id.home -> {
                mainDrawerLayout!!.openDrawer(GravityCompat.START)  // OPEN DRAWER
                return true
            }
        }

        return super.onOptionsItemSelected(item)
    }

    fun logout() {

        doAsync {
            if (ConnectionUtils.getConnectionInfo(this@MainActivity) && ConnectionUtils.isReachableByTcp(Constants.HOST, Constants.PORT)) {
                if (shouldUnsubscribe) {
                    for (subscriptionId in subscriptionIds) {
                        streamServiceBlockingStub.unsubscribe(UnsubscribeRequest.newBuilder().setSubscriptionId(subscriptionId).build())
                    }
                }

                val logoutResponse = actionServiceBlockingStub.logout(LogoutRequest.newBuilder().build())

                uiThread {
                    if (logoutResponse.statusCode == LogoutResponse.StatusCode.OK) {

                        val stopNotificationIntent = Intent(Constants.STOP_NOTIFICATION_ACTION)
                        LocalBroadcastManager.getInstance(this@MainActivity).sendBroadcast(stopNotificationIntent)

                        preferences.edit().putString(EMAIL_KEY, null).putString(PASSWORD_KEY, null).putString(LoginActivity.SESSION_KEY, null).apply()
                    }

                    startActivity(Intent(this@MainActivity, LoginActivity::class.java))
                    finish()
                }
            } else {
                uiThread { onNetworkDownError() }
            }
        }
    }

    private fun updateValues() {

        val cashWorth = intent.getIntExtra(CASH_WORTH_KEY, -1)
        val totalWorth = intent.getIntExtra(TOTAL_WORTH_KEY, -1)
        val stockWorth = totalWorth - cashWorth

        val formatter = DecimalFormat("##,##,###")
        cashWorthTextView.text = formatter.format(cashWorth.toLong())
        stockWorthTextView.text = formatter.format(stockWorth.toLong())
        totalWorthTextView.text = formatter.format(totalWorth.toLong())
    }

    // Subscribes to transaction stream and gets updates (TESTED)
    private fun subscribeToTransactionsStream(transactionsSubscriptionId: SubscriptionId) {

        streamServiceStub.getTransactionUpdates(transactionsSubscriptionId,
                object : StreamObserver<TransactionUpdate> {
                    override fun onNext(value: TransactionUpdate) {

                        val transaction = value.transaction

                        when (transaction.type) {
                            TransactionType.DIVIDEND_TRANSACTION -> {

                                val intent = Intent(Constants.REFRESH_DIVIDEND_ACTION)
                                intent.putExtra(TOTAL_WORTH_KEY, transaction.total)
                                LocalBroadcastManager.getInstance(this@MainActivity).sendBroadcast(intent)

                            }
                            TransactionType.ORDER_FILL_TRANSACTION -> {

                                updateOwnedStockIdAndQuantity(transaction.stockId, Math.abs(transaction.stockQuantity), transaction.stockQuantity > 0)

                                val intent = Intent(Constants.REFRESH_WORTH_TEXTVIEW_ACTION)
                                intent.putExtra(TOTAL_WORTH_KEY, transaction.total)
                                LocalBroadcastManager.getInstance(this@MainActivity).sendBroadcast(intent)
                                LocalBroadcastManager.getInstance(this@MainActivity).sendBroadcast(Intent(Constants.REFRESH_OWNED_STOCKS_ACTION))

                            }
                            TransactionType.FROM_EXCHANGE_TRANSACTION -> {

                                updateOwnedStockIdAndQuantity(transaction.stockId, transaction.stockQuantity, true)

                                val intent = Intent(Constants.REFRESH_WORTH_TEXTVIEW_ACTION)
                                intent.putExtra(TOTAL_WORTH_KEY, transaction.total)
                                LocalBroadcastManager.getInstance(this@MainActivity).sendBroadcast(intent)

                            }
                            else -> {

                                updateOwnedStockIdAndQuantity(transaction.stockId, transaction.stockQuantity, transaction.stockQuantity > 0)

                                val intent = Intent(Constants.REFRESH_WORTH_TEXTVIEW_ACTION)
                                intent.putExtra(TOTAL_WORTH_KEY, transaction.total)
                                LocalBroadcastManager.getInstance(this@MainActivity).sendBroadcast(intent)
                            }
                        }
                    }

                    override fun onError(t: Throwable) {

                    }

                    override fun onCompleted() {

                    }
                })
    }

    // Subscribes to market events stream and gets updates (TESTED)
    private fun subscribeToMarketEventsUpdateStream(marketEventsSubscriptionId: SubscriptionId) {

        streamServiceStub.getMarketEventUpdates(marketEventsSubscriptionId,
                object : StreamObserver<MarketEventUpdate> {
                    override fun onNext(value: MarketEventUpdate) {
                        val refreshNewsIntent = Intent(Constants.REFRESH_NEWS_ACTION)
                        LocalBroadcastManager.getInstance(this@MainActivity).sendBroadcast(refreshNewsIntent)
                    }

                    override fun onError(t: Throwable) {

                    }

                    override fun onCompleted() {

                    }
                })
    }

    // Subscribes to stock prices stream and gets updates (TESTED)
    private fun subscribeToStockPricesStream(stockPricesSubscriptionId: SubscriptionId) {
        streamServiceStub.getStockPricesUpdates(stockPricesSubscriptionId,
                object : StreamObserver<StockPricesUpdate> {
                    override fun onNext(value: StockPricesUpdate) {
                        for (i in 1..Constants.NUMBER_OF_COMPANIES) {
                            if (value.pricesMap.containsKey(i)) {
                                globalStockDetails[i - 1].price = value.pricesMap[i]?:0
                                LocalBroadcastManager.getInstance(this@MainActivity).sendBroadcast(Intent(Constants.REFRESH_PRICE_TICKER_ACTION))
                                LocalBroadcastManager.getInstance(this@MainActivity).sendBroadcast(Intent(Constants.REFRESH_STOCK_PRICES_ACTION))
                                LocalBroadcastManager.getInstance(this@MainActivity).sendBroadcast(Intent(Constants.UPDATE_WORTH_VIA_STREAM_ACTION))
                            }
                        }
                    }

                    override fun onError(t: Throwable) {

                    }

                    override fun onCompleted() {

                    }
                })
    }

    // Subscribes to stock exchange stream and gets updates globalStockDetails (TESTED)
    private fun subscribeToStockExchangeStream(stockExchangeSubscriptionId: SubscriptionId) {

        streamServiceStub.getStockExchangeUpdates(stockExchangeSubscriptionId,
                object : StreamObserver<StockExchangeUpdate> {
                    override fun onNext(value: StockExchangeUpdate) {
                        val stockExchangeDataPointMap = value.stocksInExchangeMap

                        for (x in 1..Constants.NUMBER_OF_COMPANIES) {
                            if (stockExchangeDataPointMap.containsKey(x)) {
                                val currentDataPoint = value.stocksInExchangeMap[x]

                                var position = -1
                                for (i in globalStockDetails.indices) {
                                    if (x == globalStockDetails[i].stockId) {
                                        position = i
                                        break
                                    }
                                }
                                MainActivity.globalStockDetails[position].price = currentDataPoint!!.price
                                MainActivity.globalStockDetails[position].quantityInMarket = currentDataPoint.stocksInMarket
                                MainActivity.globalStockDetails[position].quantityInExchange = currentDataPoint.stocksInExchange
                                LocalBroadcastManager.getInstance(this@MainActivity).sendBroadcast(Intent(Constants.REFRESH_STOCKS_EXCHANGE_ACTION))
                                LocalBroadcastManager.getInstance(this@MainActivity).sendBroadcast(Intent(Constants.UPDATE_WORTH_VIA_STREAM_ACTION))
                            }
                        }
                    }

                    override fun onError(t: Throwable) {

                    }

                    override fun onCompleted() {

                    }
                })
    }

    // Method called when user's stock quantity changes (called from Transactions stream update)
    private fun updateOwnedStockIdAndQuantity(stockId: Int, stockQuantity: Int, increase: Boolean) {

        var isPresentInList = false

        for (currentOwnedStockDetails in ownedStockDetails) {
            if (currentOwnedStockDetails.stockId == stockId) {
                val newQuantity: Int

                if (increase)
                    newQuantity = currentOwnedStockDetails.quantity + stockQuantity
                else
                    newQuantity = currentOwnedStockDetails.quantity - stockQuantity

                isPresentInList = true

                currentOwnedStockDetails.quantity = newQuantity
                break
            }
        }

        if (!isPresentInList && increase) {
            ownedStockDetails.add(StockDetails(stockId, stockQuantity))
        }
    }

    // Method is called when stock price update is received
    private fun updateStockWorthViaStreamUpdates() {
        var netStockWorth = 0
        var rate = 0
        for ((stockId, quantity) in ownedStockDetails) {
            for ((_, _, stockId1, price) in globalStockDetails) {
                if (stockId1 == stockId) {
                    rate = price
                    break
                }
            }
            netStockWorth += quantity * rate
        }

        val formatter = DecimalFormat("##,##,###")
        stockWorthTextView.text = formatter.format(netStockWorth.toLong())

        var temp = cashWorthTextView.text.toString()
        temp = temp.replace(",", "")
        totalWorthTextView.text = formatter.format((netStockWorth + Integer.parseInt(temp)).toLong())
    }

    private fun changeTextViewValue(textView: TextView, value: Int, increase: Boolean) {
        var temp = textView.text.toString()
        temp = temp.replace(",", "")
        val previousValue = Integer.parseInt(temp)
        textView.text = DecimalFormat("##,##,###").format((previousValue + if (increase) value else -1 * value).toLong())
    }

    // Starts making drawer button translucent
    private fun startMakingButtonsTransparent() {

        object : Thread() {
            override fun run() {

                while (drawerEdgeButton!!.alpha > 0.70) {
                    try {
                        Thread.sleep(175)
                        runOnUiThread { drawerEdgeButton!!.alpha = (drawerEdgeButton!!.alpha - 0.01).toFloat() }
                    } catch (e: InterruptedException) {
                        e.printStackTrace()
                    }

                }

            }
        }.start()
    }

    override fun onBackPressed() {
        if (mainDrawerLayout.isDrawerOpen(GravityCompat.START)) {
            mainDrawerLayout.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }
    }

    public override fun onResume() {
        super.onResume()
        val intentFilter = IntentFilter(Constants.REFRESH_DIVIDEND_ACTION)
        intentFilter.addAction(Constants.REFRESH_WORTH_TEXTVIEW_ACTION)
        intentFilter.addAction(Constants.UPDATE_WORTH_VIA_STREAM_ACTION)
        LocalBroadcastManager.getInstance(this).registerReceiver(refreshCashStockReceiver, IntentFilter(intentFilter))
    }

    public override fun onPause() {
        super.onPause()
        preferences.edit().remove(LAST_TRANSACTION_ID).remove(LAST_NOTIFICATION_ID).apply()
        LocalBroadcastManager.getInstance(this).unregisterReceiver(refreshCashStockReceiver)
        helpDialog?.dismiss()
        logoutDialog?.dismiss()
    }

    private fun subscribeToStreamsAsynchronously() {
        doAsync {
            if (ConnectionUtils.getConnectionInfo(this@MainActivity) && ConnectionUtils.isReachableByTcp(Constants.HOST, Constants.PORT)) {

                var response: SubscribeResponse = streamServiceBlockingStub.subscribe(SubscribeRequest.newBuilder().setDataStreamType(DataStreamType.STOCK_EXCHANGE).setDataStreamId("").build())
                uiThread {
                    subscriptionIds.add(response.subscriptionId)
                    subscribeToStockExchangeStream(response.subscriptionId)
                }

                response = streamServiceBlockingStub.subscribe(SubscribeRequest.newBuilder().setDataStreamType(DataStreamType.STOCK_PRICES).setDataStreamId("").build())
                uiThread {
                    subscriptionIds.add(response.subscriptionId)
                    subscribeToStockPricesStream(response.subscriptionId)
                }

                response = streamServiceBlockingStub.subscribe(SubscribeRequest.newBuilder().setDataStreamType(DataStreamType.MARKET_EVENTS).setDataStreamId("").build())
                uiThread {
                    subscriptionIds.add(response.subscriptionId)
                    subscribeToMarketEventsUpdateStream(response.subscriptionId)
                }

                response = streamServiceBlockingStub.subscribe(SubscribeRequest.newBuilder().setDataStreamType(DataStreamType.TRANSACTIONS).setDataStreamId("").build())
                uiThread {
                    subscriptionIds.add(response.subscriptionId)
                    subscribeToTransactionsStream(response.subscriptionId)
                }

            } else {
                onNetworkDownError()
            }
        }
    }

    override fun onNetworkDownError() {
        shouldUnsubscribe = false
        startActivity(Intent(this, SplashActivity::class.java))
        finish()
    }

    // Unsubscribes from all the streams subscribed in this activity.
    override fun onDestroy() {
        stopService(notifIntent)
        preferences.edit().remove(LAST_TRANSACTION_ID).remove(LAST_NOTIFICATION_ID).apply()
        super.onDestroy()
    }

    companion object {

        private const val LAST_TRANSACTION_ID = "last_transaction_id"
        private const val LAST_NOTIFICATION_ID = "last_notification_id"

        const val CASH_WORTH_KEY = "cash-worth-key"
        const val TOTAL_WORTH_KEY = "total-worth-key"
        const val STOCKS_OWNED_KEY = "stocks-owned-key"
        const val GLOBAL_STOCKS_KEY = "global-stocks-key"

        var ownedStockDetails: MutableList<StockDetails> = ArrayList()
        var globalStockDetails: List<GlobalStockDetails> = ArrayList()
    }
}