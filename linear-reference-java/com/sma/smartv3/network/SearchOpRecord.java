package com.sma.smartv3.network;

import com.android.mltcode.paycertificationapi.aa1;

/* JADX INFO: loaded from: classes19.dex */
public final class SearchOpRecord {

    @aa1
    public static final String BLE_NAME = "bleName";

    @aa1
    public static final SearchOpRecord INSTANCE = null;

    @aa1
    public static final String MAC_ADDRESS = "mac";

    @aa1
    public static final String TYPE = "type";

    @aa1
    public static final String URL = "/ble_device/markSearch";

    static {
        INSTANCE = new SearchOpRecord();
    }

    private SearchOpRecord() {
    }
}
