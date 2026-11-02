package com.sma.smartv3.network;

import com.android.mltcode.paycertificationapi.aa1;

/* JADX INFO: loaded from: classes19.dex */
public final class StockSearch {

    @aa1
    public static final String IDENTITY = "identity";

    @aa1
    public static final StockSearch INSTANCE = null;

    @aa1
    public static final String PROJECT_ID = "projectId";

    @aa1
    public static final String QUERYKEY = "queryKey";

    @aa1
    public static final String URL = "/finance_stock/search";

    static {
        INSTANCE = new StockSearch();
    }

    private StockSearch() {
    }
}
