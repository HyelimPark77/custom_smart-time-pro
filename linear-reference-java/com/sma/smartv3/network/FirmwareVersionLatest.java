package com.sma.smartv3.network;

import com.android.mltcode.paycertificationapi.aa1;

/* JADX INFO: loaded from: classes19.dex */
public final class FirmwareVersionLatest {

    @aa1
    public static final String APP_PLATFORM = "appPlatform";

    @aa1
    public static final String APP_VERSION = "androidVersion";

    @aa1
    public static final String BLE_NAME = "bleName";

    @aa1
    public static final String FLAG = "flag";

    @aa1
    public static final FirmwareVersionLatest INSTANCE = null;

    @aa1
    public static final String MAC_ADDRESS = "macAddress";

    @aa1
    public static final String PROJECT_ID = "projectId";

    @aa1
    public static final String UI_PACK_VERSION = "uiPackVersion";

    @aa1
    public static final String URL = "/ble_firmware_version/latest";

    @aa1
    public static final String VALID = "valid";

    @aa1
    public static final String VERSION = "version";

    static {
        INSTANCE = new FirmwareVersionLatest();
    }

    private FirmwareVersionLatest() {
    }
}
