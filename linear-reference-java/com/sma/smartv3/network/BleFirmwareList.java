package com.sma.smartv3.network;

import com.android.mltcode.paycertificationapi.aa1;

/* JADX INFO: loaded from: classes19.dex */
public final class BleFirmwareList {

    @aa1
    public static final String FILTER = "filter";

    @aa1
    public static final BleFirmwareList INSTANCE = null;

    @aa1
    public static final String LIMIT = "limit";

    @aa1
    public static final String PAGE = "page";

    @aa1
    public static final String URL = "/ble_firmware/list_no_verify";

    static {
        INSTANCE = new BleFirmwareList();
    }

    private BleFirmwareList() {
    }
}
