package com.sma.smartv3.network;

import com.android.mltcode.paycertificationapi.aa1;

/* JADX INFO: loaded from: classes19.dex */
public final class GetAccountOrderList {

    @aa1
    public static final String IDENTITY = "identity";

    @aa1
    public static final GetAccountOrderList INSTANCE = new GetAccountOrderList();

    @aa1
    public static final String ORDER_PAGE_NUM = "pageNum";

    @aa1
    public static final String ORDER_TYPE = "orderType";

    @aa1
    public static final String URL = "/order/select";

    private GetAccountOrderList() {
    }
}
