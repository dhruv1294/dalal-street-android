package org.pragyan.dalal18.loaders;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.AsyncTaskLoader;

import org.pragyan.dalal18.utils.ConnectionUtils;
import org.pragyan.dalal18.utils.Constants;

import dalalstreet.api.DalalActionServiceGrpc;
import dalalstreet.api.actions.GetTransactionsRequest;
import dalalstreet.api.actions.GetTransactionsResponse;

public class TransactionLoader extends AsyncTaskLoader<GetTransactionsResponse> {

    private DalalActionServiceGrpc.DalalActionServiceBlockingStub actionServiceBlockingStub;
    private int lastId = 0;

    public TransactionLoader(@NonNull Context context, DalalActionServiceGrpc.DalalActionServiceBlockingStub actionServiceBlockingStub,int lastId) {
        super(context);
        this.actionServiceBlockingStub = actionServiceBlockingStub;
        this.lastId = lastId;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Nullable
    @Override
    public GetTransactionsResponse loadInBackground() {
        if (ConnectionUtils.getConnectionInfo(getContext()) && ConnectionUtils.isReachableByTcp(Constants.HOST, Constants.PORT)) {
            return actionServiceBlockingStub.getTransactions(GetTransactionsRequest
                    .newBuilder()
                    .setCount(0)
                    .setLastTransactionId(lastId)
                    .build());
        } else {
            return null;
        }
    }
}