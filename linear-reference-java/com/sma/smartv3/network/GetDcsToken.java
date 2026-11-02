package com.sma.smartv3.network;

import com.android.mltcode.paycertificationapi.aa1;

/* JADX INFO: loaded from: classes19.dex */
public final class GetDcsToken {

    @aa1
    public static final String APP_VERSION = "appVersion";

    @aa1
    public static final String BLE_NAME = "bleName";

    @aa1
    public static final String FIRMWARE_VERSION = "bleVersion";

    @aa1
    public static final String FLAG = "flag";

    @aa1
    public static final GetDcsToken INSTANCE = null;

    @aa1
    public static final String MAC_ADDRESS = "macAddress";

    @aa1
    public static final String PROJECT_ID = "projectId";

    @aa1
    private static final String URL = null;

    static {
        INSTANCE = new GetDcsToken();
        URL = "/baiduApi/getDcsTokenV2";
    }

    private GetDcsToken() {
    }

    @aa1
    public final String getURL() {
        return URL;
    }
}
