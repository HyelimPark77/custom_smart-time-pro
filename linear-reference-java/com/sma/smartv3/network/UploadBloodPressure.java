package com.sma.smartv3.network;

import com.android.mltcode.paycertificationapi.aa1;

/* JADX INFO: loaded from: classes19.dex */
public final class UploadBloodPressure {

    @aa1
    public static final UploadBloodPressure INSTANCE = null;

    @aa1
    public static final String URL = "/ble_blood_pressure/upload";

    static {
        INSTANCE = new UploadBloodPressure();
    }

    private UploadBloodPressure() {
    }
}
