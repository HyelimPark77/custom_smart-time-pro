package com.sma.smartv3.network;

import com.android.mltcode.paycertificationapi.aa1;

/* JADX INFO: loaded from: classes19.dex */
public final class UploadLocation {

    @aa1
    public static final UploadLocation INSTANCE = null;

    @aa1
    public static final String URL = "/ble_location/upload";

    static {
        INSTANCE = new UploadLocation();
    }

    private UploadLocation() {
    }
}
