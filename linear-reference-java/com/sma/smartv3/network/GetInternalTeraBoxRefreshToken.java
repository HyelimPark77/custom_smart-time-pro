package com.sma.smartv3.network;

import com.android.mltcode.paycertificationapi.aa1;

/* JADX INFO: loaded from: classes19.dex */
public final class GetInternalTeraBoxRefreshToken {

    @aa1
    public static final GetInternalTeraBoxRefreshToken INSTANCE = null;

    @aa1
    public static final String TOKEN = "token";

    @aa1
    public static final String URL = "/terabox/internal/refreshToken";

    static {
        INSTANCE = new GetInternalTeraBoxRefreshToken();
    }

    private GetInternalTeraBoxRefreshToken() {
    }
}
