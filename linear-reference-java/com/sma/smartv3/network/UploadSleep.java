package com.sma.smartv3.network;

import com.android.mltcode.paycertificationapi.aa1;

/* JADX INFO: loaded from: classes19.dex */
public final class UploadSleep {

    @aa1
    public static final UploadSleep INSTANCE = null;

    @aa1
    public static final String URL = "/ble_sleep/upload";

    static {
        INSTANCE = new UploadSleep();
    }

    private UploadSleep() {
    }
}
