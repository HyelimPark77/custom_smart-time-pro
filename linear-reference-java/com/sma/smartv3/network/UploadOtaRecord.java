package com.sma.smartv3.network;

import com.android.mltcode.paycertificationapi.aa1;

/* JADX INFO: loaded from: classes19.dex */
public final class UploadOtaRecord {

    @aa1
    public static final String CURRENT_VERSION = "currentVersion";

    @aa1
    public static final String FLAG_FAILED = "-1";

    @aa1
    public static final String FLAG_SUCCESS = "0";

    @aa1
    public static final UploadOtaRecord INSTANCE = null;

    @aa1
    public static final String OTA_TYPE = "otaType";

    @aa1
    public static final String REMARK = "remark";

    @aa1
    public static final String SUCCESS_FLAG = "successFlag";

    @aa1
    public static final String TARGET_VERSION = "trargetVersion";

    @aa1
    public static final String TYPE_FIRMWARE = "1";

    @aa1
    public static final String TYPE_OTHER = "2";

    @aa1
    public static final String URL = "/ble_device/addOtaRecord";

    static {
        INSTANCE = new UploadOtaRecord();
    }

    private UploadOtaRecord() {
    }
}
