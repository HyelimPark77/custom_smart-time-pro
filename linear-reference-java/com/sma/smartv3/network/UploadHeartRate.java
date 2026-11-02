package com.sma.smartv3.network;

import com.android.mltcode.paycertificationapi.aa1;

/* JADX INFO: loaded from: classes19.dex */
public final class UploadHeartRate {

    @aa1
    public static final UploadHeartRate INSTANCE = null;

    @aa1
    public static final String URL = "/ble_heart_rate/upload";

    static {
        INSTANCE = new UploadHeartRate();
    }

    private UploadHeartRate() {
    }
}
