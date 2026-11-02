package com.sma.smartv3.network;

import com.android.mltcode.paycertificationapi.aa1;

/* JADX INFO: loaded from: classes19.dex */
public final class GetDeviceState {

    @aa1
    public static final String BLE_NAME = "bleName";

    @aa1
    public static final String FLAG = "flag";

    @aa1
    public static final GetDeviceState INSTANCE = new GetDeviceState();

    @aa1
    public static final String MAC_ADDRESS = "macAddress";

    @aa1
    public static final String URL = "/pay/getDeviceState";

    private GetDeviceState() {
    }
}
