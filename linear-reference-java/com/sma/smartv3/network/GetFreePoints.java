package com.sma.smartv3.network;

import com.android.mltcode.paycertificationapi.aa1;

/* JADX INFO: loaded from: classes19.dex */
public final class GetFreePoints {

    @aa1
    public static final String IDENTITY = "identity";

    @aa1
    public static final GetFreePoints INSTANCE = null;

    @aa1
    public static final String URL = "/getPoints";

    static {
        INSTANCE = new GetFreePoints();
    }

    private GetFreePoints() {
    }
}
