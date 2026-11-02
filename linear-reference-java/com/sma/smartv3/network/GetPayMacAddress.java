package com.sma.smartv3.network;

import com.android.mltcode.paycertificationapi.aa1;

/* JADX INFO: loaded from: classes19.dex */
public final class GetPayMacAddress {

    @aa1
    public static final String APP_VERSION = "androidVersion";

    @aa1
    public static final String BLE_NAME = "bleName";

    @aa1
    public static final String FLAG = "flag";

    @aa1
    public static final GetPayMacAddress INSTANCE = null;

    @aa1
    public static final String OLD_MAC_ADDRESS = "oldMacAddress";

    @aa1
    public static final String URL = "/pay/getPayMacAddress";

    @aa1
    public static final String VERSION = "version";

    static {
        INSTANCE = new GetPayMacAddress();
    }

    private GetPayMacAddress() {
    }
}
