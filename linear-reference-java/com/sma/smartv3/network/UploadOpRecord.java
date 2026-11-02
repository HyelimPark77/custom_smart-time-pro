package com.sma.smartv3.network;

import com.android.mltcode.paycertificationapi.aa1;

/* JADX INFO: loaded from: classes19.dex */
public final class UploadOpRecord {

    @aa1
    public static final String BLE_NAME = "bleName";

    @aa1
    public static final UploadOpRecord INSTANCE = null;

    @aa1
    public static final String MAC_ADDRESS = "mac";

    @aa1
    public static final String TYPE = "type";

    @aa1
    public static final String URL = "/ble_device/mark";

    static {
        INSTANCE = new UploadOpRecord();
    }

    private UploadOpRecord() {
    }
}
