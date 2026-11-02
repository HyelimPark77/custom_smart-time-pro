package com.sma.smartv3.network;

import com.android.mltcode.paycertificationapi.aa1;

/* JADX INFO: loaded from: classes19.dex */
public final class ChangeDeviceState {

    @aa1
    public static final String BLE_NAME = "bleName";

    @aa1
    public static final String FLAG = "flag";

    @aa1
    public static final ChangeDeviceState INSTANCE = new ChangeDeviceState();

    @aa1
    public static final String MAC_ADDRESS = "macAddress";

    @aa1
    public static final String STATE = "state";

    @aa1
    public static final String URL = "/pay/changeDeviceState";

    private ChangeDeviceState() {
    }
}
