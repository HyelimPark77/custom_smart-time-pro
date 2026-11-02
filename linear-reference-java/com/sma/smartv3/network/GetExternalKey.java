package com.sma.smartv3.network;

import com.android.mltcode.paycertificationapi.aa1;

/* JADX INFO: loaded from: classes19.dex */
public final class GetExternalKey {

    @aa1
    public static final GetExternalKey INSTANCE = null;

    @aa1
    public static final String KEY = "key";

    @aa1
    public static final String URL = "/key_vault/get";

    static {
        INSTANCE = new GetExternalKey();
    }

    private GetExternalKey() {
    }
}
