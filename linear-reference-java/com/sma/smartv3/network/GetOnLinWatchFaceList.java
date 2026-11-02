package com.sma.smartv3.network;

import com.android.mltcode.paycertificationapi.aa1;

/* JADX INFO: loaded from: classes19.dex */
public final class GetOnLinWatchFaceList {

    @aa1
    public static final String BLE_NAME = "bleName";

    @aa1
    public static final String FLAG = "flag";

    @aa1
    public static final String IDENTITY = "identity";

    @aa1
    public static final GetOnLinWatchFaceList INSTANCE = null;

    @aa1
    public static final String TYP_GROUP_FLAG = "typeGroupFlag";

    @aa1
    public static final String URL = "/watchFace/appSearch";

    static {
        INSTANCE = new GetOnLinWatchFaceList();
    }

    private GetOnLinWatchFaceList() {
    }
}
