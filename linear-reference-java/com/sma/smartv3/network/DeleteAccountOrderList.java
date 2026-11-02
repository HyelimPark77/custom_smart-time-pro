package com.sma.smartv3.network;

import com.android.mltcode.paycertificationapi.aa1;

/* JADX INFO: loaded from: classes19.dex */
public final class DeleteAccountOrderList {

    @aa1
    public static final String IDENTITY = "identity";

    @aa1
    public static final DeleteAccountOrderList INSTANCE = null;

    @aa1
    public static final String ORDER_NUM = "orderNum";

    @aa1
    public static final String URL = "/order/delete";

    static {
        INSTANCE = new DeleteAccountOrderList();
    }

    private DeleteAccountOrderList() {
    }
}
