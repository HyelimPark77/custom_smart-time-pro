package com.sma.smartv3.network;

import com.android.mltcode.paycertificationapi.aa1;

/* JADX INFO: loaded from: classes19.dex */
public final class GetTranslationOrderList {

    @aa1
    public static final String IDENTITY = "identity";

    @aa1
    public static final GetTranslationOrderList INSTANCE = null;

    @aa1
    public static final String ORDER_TYPE = "orderType";

    @aa1
    public static final String PAGE_NUM = "pageNum";

    @aa1
    public static final String PAGE_SIZE = "pageSize";

    @aa1
    public static final String URL = "/order/select";

    static {
        INSTANCE = new GetTranslationOrderList();
    }

    private GetTranslationOrderList() {
    }
}
