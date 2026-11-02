package com.sma.smartv3.network;

import com.android.mltcode.paycertificationapi.aa1;

/* JADX INFO: loaded from: classes19.dex */
public final class AccountIntegralDetails {

    @aa1
    public static final String IDENTITY = "identity";

    @aa1
    public static final AccountIntegralDetails INSTANCE = null;

    @aa1
    public static final String ORDER_PAGE_NUM = "pageNum";

    @aa1
    public static final String URL = "/accountDetails";

    static {
        INSTANCE = new AccountIntegralDetails();
    }

    private AccountIntegralDetails() {
    }
}
