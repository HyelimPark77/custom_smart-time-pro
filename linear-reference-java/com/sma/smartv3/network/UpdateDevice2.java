package com.sma.smartv3.network;

import com.android.mltcode.paycertificationapi.aa1;

/* JADX INFO: loaded from: classes19.dex */
public final class UpdateDevice2 {

    @aa1
    public static final String BLE_NAME = "bleName";

    @aa1
    public static final String FIRMWARE_FLAG = "flag";

    @aa1
    public static final String FIRMWARE_VERSION = "firmwareVersion";

    @aa1
    public static final String FONT_VERSION = "fontVersion";

    @aa1
    public static final String IDENTITY = "identity";

    @aa1
    public static final UpdateDevice2 INSTANCE = null;

    @aa1
    public static final String MAC_ADDRESS = "macAddress";

    @aa1
    public static final String PLATFORM = "platform";

    @aa1
    public static final String PROJECT_ID = "projectId";

    @aa1
    public static final String PROTOTYPE = "devicePrototype";

    @aa1
    public static final String UI_VERSION = "uiVersion";

    @aa1
    public static final String URL = "/ble_device/update2";

    static {
        INSTANCE = new UpdateDevice2();
    }

    private UpdateDevice2() {
    }
}
