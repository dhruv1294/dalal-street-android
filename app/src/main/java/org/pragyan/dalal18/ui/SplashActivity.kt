package org.pragyan.dalal18.ui

import android.content.Intent
import android.content.SharedPreferences
import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.google.android.gms.common.ConnectionResult
import com.google.android.gms.common.GoogleApiAvailability
import com.google.android.material.snackbar.Snackbar
import dalalstreet.api.DalalActionServiceGrpc
import dalalstreet.api.actions.LoginRequest
import dalalstreet.api.actions.LoginResponse
import io.grpc.ManagedChannel
import io.grpc.Metadata
import io.grpc.stub.MetadataUtils
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.async
import kotlinx.coroutines.withContext
import org.pragyan.dalal18.R
import org.pragyan.dalal18.dagger.ContextModule
import org.pragyan.dalal18.dagger.DaggerDalalStreetApplicationComponent
import org.pragyan.dalal18.data.GlobalStockDetails
import org.pragyan.dalal18.databinding.ActivitySplashBinding
import org.pragyan.dalal18.utils.*
import org.pragyan.dalal18.utils.Constants.MARKET_OPEN_KEY
import java.util.*
import javax.inject.Inject

class SplashActivity : AppCompatActivity() {

    private val binding by viewLifecycle(ActivitySplashBinding::inflate)

    /* Not injecting stub directly into this context to prevent empty/null metadata attached to stub since user has not logged in. */
    @Inject
    lateinit var channel: ManagedChannel

    @Inject
    lateinit var preferences: SharedPreferences

    private var drawingThread: Thread? = null

    private val isGooglePlayServicesAvailable: Boolean
        get() {
            val resultCode = GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(this)
            return resultCode == ConnectionResult.SUCCESS
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        if (isGooglePlayServicesAvailable) {
            DaggerDalalStreetApplicationComponent.builder().contextModule(ContextModule(this)).build().inject(this)
            startLoginProcess(preferences.getString(EMAIL_KEY, null), preferences.getString(PASSWORD_KEY, null))

        } else {
            val playServicesBuilder = AlertDialog.Builder(this, R.style.AlertDialogTheme)
            playServicesBuilder
                    .setMessage("Dalal Street requires latest version of google play services.")
                    .setPositiveButton("Close") { _, _ -> finish() }
                    .setTitle("Update PlayServices")
                    .setCancelable(true)
                    .show()
        }
    }

    override fun onStart() {
        super.onStart()
        drawingThread = Thread(binding.graphDrawer)
        drawingThread?.start()
    }

    private fun startLoginProcess(email: String?, password: String?) {

        binding.splashTextView.text = getString(R.string.signing_in)

        if (email != null && password != null && email != "") {
            loginAsynchronously(email, password)
        } else {
            startLoginActivity()
        }
    }

    private fun loginAsynchronously(email: String, password: String) {
        GlobalScope.async(Dispatchers.Default) {
            if (ConnectionUtils.getConnectionInfo(this@SplashActivity)) {
                if (ConnectionUtils.isReachableByTcp(Constants.HOST, Constants.PORT)) {
                    val sessionId = preferences.getString(Constants.SESSION_KEY, null)

                    if (sessionId != null) {

                        val customStub = MetadataUtils.attachHeaders(DalalActionServiceGrpc.newBlockingStub(channel), getStubMetadata(sessionId))
                        val loginResponse = customStub.login(LoginRequest.newBuilder().setEmail(email).setPassword(password).build())

                        withContext(Dispatchers.Main) {

                            if (loginResponse.statusCode == LoginResponse.StatusCode.OK && !loginResponse.user.isBlocked) {

                                MiscellaneousUtils.sessionId = loginResponse.sessionId

                                // Adding user's stock details
                                val ownedStockDetailsMap = hashMapOf<Int, Long>()
                                for ((stockId, quantity) in loginResponse.stocksOwnedMap) {
                                    ownedStockDetailsMap[stockId] = quantity
                                }

                                // Adding user's reserved assets details
                                val reservedStockDetailsMap = hashMapOf<Int, Long>()
                                for ((stockId, quantity) in loginResponse.reservedStocksOwnedMap) {
                                    reservedStockDetailsMap[stockId] = quantity
                                }

                                // Adding global stock details
                                val globalStockDetailsMap = hashMapOf<Int, GlobalStockDetails>()

                                for ((stockId, currentStock) in loginResponse.stockListMap) {

                                    globalStockDetailsMap[stockId] = GlobalStockDetails(
                                            currentStock.fullName,
                                            currentStock.shortName,
                                            stockId,
                                            currentStock.description,
                                            currentStock.currentPrice,
                                            currentStock.stocksInMarket,
                                            currentStock.stocksInExchange,
                                            currentStock.previousDayClose,
                                            if (currentStock.upOrDown) 1 else 0,
                                            currentStock.isBankrupt,
                                            currentStock.givesDividends,
                                            Constants.COMPANY_IMAGES_BASE_URL + currentStock.shortName.toUpperCase(Locale.ROOT) + ".png")
                                }

                                val intent: Intent = if (loginResponse.user.isPhoneVerified)
                                    Intent(this@SplashActivity, MainActivity::class.java)
                                else
                                    Intent(this@SplashActivity, VerifyPhoneActivity::class.java)

                                with(intent) {
                                    putExtra(USERNAME_KEY, loginResponse.user.name)
                                    putExtra(MainActivity.CASH_WORTH_KEY, loginResponse.user.cash)
                                    putExtra(MainActivity.TOTAL_WORTH_KEY, loginResponse.user.total)
                                    putExtra(MainActivity.RESERVED_CASH_KEY, loginResponse.user.reservedCash)
                                    putExtra(MARKET_OPEN_KEY, loginResponse.isMarketOpen)

                                    putExtra(MainActivity.GLOBAL_STOCKS_KEY, globalStockDetailsMap)
                                    putExtra(MainActivity.RESERVED_STOCKS_KEY, reservedStockDetailsMap)
                                    putExtra(MainActivity.STOCKS_OWNED_KEY, ownedStockDetailsMap)
                                }

                                // Checking for constants
                                for ((key, value) in loginResponse.constantsMap) {
                                    when (key) {
                                        "MORTGAGE_DEPOSIT_RATE" -> Constants.MORTGAGE_DEPOSIT_RATE = value.toDouble()
                                        "MORTGAGE_RETRIEVE_RATE" -> Constants.MORTGAGE_RETRIEVE_RATE = value.toDouble()
                                        "ORDER_FEE_PERCENT" -> Constants.ORDER_FEE_RATE = (value.toDouble() / 100)
                                        "ORDER_PRICE_WINDOW" -> Constants.ORDER_PRICE_WINDOW = value
                                        "ASK_LIMIT" -> Constants.ASK_LIMIT = value
                                        "BID_LIMIT" -> Constants.BID_LIMIT = value
                                    }
                                }

                                preferences.edit().putString(Constants.MARKET_OPEN_TEXT_KEY, loginResponse.marketIsOpenHackyNotif)
                                        .putString(Constants.MARKET_CLOSED_TEXT_KEY, loginResponse.marketIsClosedHackyNotif).apply()

                                startActivity(intent)
                                finish()
                            } else {
                                toast(getString(R.string.please_try_again))
                                preferences.edit().putString(EMAIL_KEY, null).putString(PASSWORD_KEY, null).apply()
                                startActivity(Intent(this@SplashActivity, LoginActivity::class.java))
                                finish()
                            }

                        }
                    } else {
                        withContext(Dispatchers.Main) { startLoginActivity() }
                    }
                } else {
                    val snackBar = Snackbar.make(findViewById<View>(android.R.id.content), resources.getString(R.string.error_server_down), Snackbar.LENGTH_INDEFINITE)
                            .setAction("RETRY") {
                                startLoginProcess(email, password)
                            }

                    snackBar.setActionTextColor(ContextCompat.getColor(this@SplashActivity, R.color.neon_green))
                    snackBar.view.setBackgroundColor(Color.parseColor("#20202C"))
                    snackBar.show()
                    binding.splashTextView.setText(R.string.error_signing_in)
                }

            } else /* No internet available */ {
                withContext(Dispatchers.Main) {

                    val snackBar = Snackbar.make(findViewById<View>(android.R.id.content), "Please check internet connection", Snackbar.LENGTH_INDEFINITE)
                            .setAction("RETRY") {
                                startLoginProcess(email, password)
                                binding.splashTextView.setText(R.string.error_signing_in)
                            }

                    snackBar.setActionTextColor(ContextCompat.getColor(this@SplashActivity, R.color.neon_green))
                    snackBar.view.setBackgroundColor(Color.parseColor("#20202C"))
                    snackBar.show()
                    binding.splashTextView.setText(R.string.error_signing_in)
                }
            }
        }
    }

    private fun startLoginActivity() {
        preferences.edit().putString(EMAIL_KEY, null).putString(PASSWORD_KEY, null).apply()
        startActivity(Intent(this, LoginActivity::class.java))
        finish()
    }

    override fun onPause() {
        super.onPause()
        if (drawingThread != null && drawingThread!!.isAlive)
            drawingThread?.interrupt()
    }

    private fun getStubMetadata(sessionId: String): Metadata {
        val metadata = Metadata()
        val metadataKey = Metadata.Key.of("sessionid", Metadata.ASCII_STRING_MARSHALLER)
        metadata.put(metadataKey, sessionId)
        return metadata
    }

    companion object {
        const val USERNAME_KEY = "username-key"
        const val EMAIL_KEY = "email-key"
        internal const val PASSWORD_KEY = "password-key"
    }
}