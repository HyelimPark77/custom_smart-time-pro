package com.sma.smartv3.network;

import com.android.mltcode.paycertificationapi.aa1;

/* JADX INFO: loaded from: classes19.dex */
public final class StockList {

    @aa1
    public static final String IDENTITY = "identity";

    @aa1
    public static final StockList INSTANCE = null;

    @aa1
    public static final String PROJECT_ID = "projectId";

    @aa1
    public static final String URL = "/finance_stock/user_show";

    static {
        INSTANCE = new StockList();
    }

    private StockList() {
    }
}
