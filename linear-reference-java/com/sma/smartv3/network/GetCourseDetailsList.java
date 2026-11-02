package com.sma.smartv3.network;

import com.android.mltcode.paycertificationapi.aa1;

/* JADX INFO: loaded from: classes19.dex */
public final class GetCourseDetailsList {

    @aa1
    public static final String ID = "id";

    @aa1
    public static final GetCourseDetailsList INSTANCE = null;

    @aa1
    public static final String URL = "/course/findInfoById";

    @aa1
    public static final String USER_ID = "uid";

    static {
        INSTANCE = new GetCourseDetailsList();
    }

    private GetCourseDetailsList() {
    }
}
