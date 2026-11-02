package com.sma.smartv3.network;

import com.android.mltcode.paycertificationapi.aa1;

/* JADX INFO: loaded from: classes19.dex */
public final class GetTeraBoxRefreshToken {

    @aa1
    public static final GetTeraBoxRefreshToken INSTANCE = null;

    @aa1
    public static final String TOKEN = "token";

    @aa1
    public static final String URL = "/terabox/refreshToken";

    static {
        INSTANCE = new GetTeraBoxRefreshToken();
    }

    private GetTeraBoxRefreshToken() {
    }
}
