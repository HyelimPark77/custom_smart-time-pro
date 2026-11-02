package com.sma.smartv3.network;

import com.android.mltcode.paycertificationapi.aa1;

/* JADX INFO: loaded from: classes19.dex */
public final class BleFirmwareVersionList {

    @aa1
    public static final String FIRMWARE_ID = "firmwareId";

    @aa1
    public static final BleFirmwareVersionList INSTANCE = null;

    @aa1
    public static final String URL = "/ble_firmware_version/list";

    static {
        INSTANCE = new BleFirmwareVersionList();
    }

    private BleFirmwareVersionList() {
    }
}
