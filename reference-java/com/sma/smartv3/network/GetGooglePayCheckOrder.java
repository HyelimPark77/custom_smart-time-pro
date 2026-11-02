package com.sma.smartv3.network;

import com.android.mltcode.paycertificationapi.aa1;

/* JADX INFO: loaded from: classes19.dex */
public final class GetGooglePayCheckOrder {

    @aa1
    public static final String APPLICATION_NAME = "applicationName";

    @aa1
    public static final GetGooglePayCheckOrder INSTANCE = new GetGooglePayCheckOrder();

    @aa1
    public static final String ORDER_NUM = "orderNum";

    @aa1
    public static final String PACKAGE_NAME = "packageName";

    @aa1
    public static final String PRODUCT_IT = "productId";

    @aa1
    public static final String PURCHASE_TOKEN = "purchaseToken";

    @aa1
    public static final String URL = "/aliPay/google/checkOrder";

    private GetGooglePayCheckOrder() {
    }
}
