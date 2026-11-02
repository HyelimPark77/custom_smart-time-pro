package com.sma.smartv3.network;

import com.android.mltcode.paycertificationapi.aa1;

/* JADX INFO: loaded from: classes19.dex */
public final class GetOrderStatus {

    @aa1
    public static final String IDENTITY = "identity";

    @aa1
    public static final GetOrderStatus INSTANCE = new GetOrderStatus();

    @aa1
    public static final String ORDER_NUM = "orderNum";

    @aa1
    public static final String ORDER_TYPE = "orderType";

    @aa1
    public static final String URL = "/order/selectByOrderNum";

    private GetOrderStatus() {
    }
}
