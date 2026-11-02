package com.sma.smartv3.network;

import com.android.mltcode.paycertificationapi.aa1;

/* JADX INFO: loaded from: classes19.dex */
public final class ExtraPackVersionLatest {

    @aa1
    public static final String FIRMWARE_VERSION = "firmwareVersion";

    @aa1
    public static final String GPS_PACK_VERSION = "gpsPackVersion";

    @aa1
    public static final ExtraPackVersionLatest INSTANCE = null;

    @aa1
    public static final String LANGUAGE_CODE = "languageCode";

    @aa1
    public static final String LANGUAGE_PACK_VERSION = "languagePackVersion";

    @aa1
    public static final String NETWORK_PACK_VERSION = "networkPackVersion";

    @aa1
    public static final String UI_PACK_VERSION = "uiPackVersion";

    @aa1
    public static final String URL = "/ble_extra_pack_version/latest";

    @aa1
    public static final String VALID = "valid";

    static {
        INSTANCE = new ExtraPackVersionLatest();
    }

    private ExtraPackVersionLatest() {
    }
}
