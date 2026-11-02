package com.sma.smartv3.network;

import com.android.mltcode.paycertificationapi.aa1;

/* JADX INFO: loaded from: classes19.dex */
public final class BleExtraPackVersionGPSFirmware {

    @aa1
    public static final String APP_PLATFORM = "appPlatform";

    @aa1
    public static final String APP_VERSION = "appVersion";

    @aa1
    public static final String BLE_NAME = "bleName";

    @aa1
    public static final String FLAG = "flag";

    @aa1
    public static final String GPS_PACK_VERSION = "agpsVersion";

    @aa1
    public static final BleExtraPackVersionGPSFirmware INSTANCE = null;

    @aa1
    public static final String MAC_ADDRESS = "mac";

    @aa1
    public static final String PROJECT_ID = "pid";

    @aa1
    public static final String URL = "/ble_extra_pack_version/latest_agps";

    @aa1
    public static final String VALID = "valid";

    @aa1
    public static final String VERSION = "firmwareVersion";

    static {
        INSTANCE = new BleExtraPackVersionGPSFirmware();
    }

    private BleExtraPackVersionGPSFirmware() {
    }
}
