package com.sma.smartv3.network;

import com.android.mltcode.paycertificationapi.aa1;

/* JADX INFO: loaded from: classes19.dex */
public final class GetWatchFaceDetailList {

    @aa1
    public static final String BLE_NAME = "bleName";

    @aa1
    public static final String FIRMWARE_FLAG = "flag";

    @aa1
    public static final String ID = "wid";

    @aa1
    public static final String IDENTITY = "identity";

    @aa1
    public static final GetWatchFaceDetailList INSTANCE = null;

    @aa1
    public static final String URL = "/watchFace/appGuessSearch";

    static {
        INSTANCE = new GetWatchFaceDetailList();
    }

    private GetWatchFaceDetailList() {
    }
}
