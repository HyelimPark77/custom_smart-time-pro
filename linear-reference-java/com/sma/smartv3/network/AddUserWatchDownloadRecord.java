package com.sma.smartv3.network;

import com.android.mltcode.paycertificationapi.aa1;

/* JADX INFO: loaded from: classes19.dex */
public final class AddUserWatchDownloadRecord {

    @aa1
    public static final String IDENTITY = "identity";

    @aa1
    public static final AddUserWatchDownloadRecord INSTANCE = null;

    @aa1
    public static final String URL = "/watchFace/install";

    @aa1
    public static final String WID = "wid";

    static {
        INSTANCE = new AddUserWatchDownloadRecord();
    }

    private AddUserWatchDownloadRecord() {
    }
}
