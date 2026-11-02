package com.sma.smartv3.network;

import com.android.mltcode.paycertificationapi.aa1;

/* JADX INFO: loaded from: classes19.dex */
public final class GetCourseCollectList {

    @aa1
    public static final GetCourseCollectList INSTANCE = null;

    @aa1
    public static final String URL = "/course/appCollectSearch";

    @aa1
    public static final String USER_ID = "uid";

    static {
        INSTANCE = new GetCourseCollectList();
    }

    private GetCourseCollectList() {
    }
}
