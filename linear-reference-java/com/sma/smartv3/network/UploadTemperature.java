package com.sma.smartv3.network;

import com.android.mltcode.paycertificationapi.aa1;

/* JADX INFO: loaded from: classes19.dex */
public final class UploadTemperature {

    @aa1
    public static final UploadTemperature INSTANCE = null;

    @aa1
    public static final String URL = "/ble_temperature/upload";

    static {
        INSTANCE = new UploadTemperature();
    }

    private UploadTemperature() {
    }
}
