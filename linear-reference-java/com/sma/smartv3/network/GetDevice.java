package com.sma.smartv3.network;

import com.android.mltcode.paycertificationapi.aa1;

/* JADX INFO: loaded from: classes19.dex */
public final class GetDevice {

    @aa1
    public static final String IDENTITY = "identity";

    @aa1
    public static final GetDevice INSTANCE = null;

    @aa1
    public static final String URL = "/ble_device/get";

    static {
        INSTANCE = new GetDevice();
    }

    private GetDevice() {
    }
}
