package com.sma.smartv3.network;

import com.android.mltcode.paycertificationapi.aa1;

/* JADX INFO: loaded from: classes19.dex */
public final class CreateOrder {

    @aa1
    public static final String IDENTITY = "identity";

    @aa1
    public static final CreateOrder INSTANCE = null;

    @aa1
    public static final String ORDER_ELE_ID = "eleId";

    @aa1
    public static final String ORDER_TYPE = "orderType";

    @aa1
    public static final String PROJECT_ID = "projectId";

    @aa1
    public static final String URL = "/order/create";

    static {
        INSTANCE = new CreateOrder();
    }

    private CreateOrder() {
    }
}
