package com.sma.smartv3.network;

import com.android.mltcode.paycertificationapi.aa1;

/* JADX INFO: loaded from: classes19.dex */
public final class GetPayInfo {

    @aa1
    public static final GetPayInfo INSTANCE = null;

    @aa1
    public static final String URL = "/aliPay/wapPay";

    static {
        INSTANCE = new GetPayInfo();
    }

    private GetPayInfo() {
    }
}
