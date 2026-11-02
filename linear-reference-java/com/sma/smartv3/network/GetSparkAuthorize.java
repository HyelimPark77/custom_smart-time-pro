package com.sma.smartv3.network;

import com.android.mltcode.paycertificationapi.aa1;

/* JADX INFO: loaded from: classes19.dex */
public final class GetSparkAuthorize {

    @aa1
    public static final String BLE_NAME = "bleName";

    @aa1
    public static final String FLAG = "flag";

    @aa1
    public static final GetSparkAuthorize INSTANCE = null;

    @aa1
    public static final String MAC_ADDRESS = "mac";

    @aa1
    public static final String URL = "/ble_device_mac/spark/exist";

    static {
        INSTANCE = new GetSparkAuthorize();
    }

    private GetSparkAuthorize() {
    }
}
