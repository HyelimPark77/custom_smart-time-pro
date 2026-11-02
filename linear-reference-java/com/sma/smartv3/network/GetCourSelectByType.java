package com.sma.smartv3.network;

import com.android.mltcode.paycertificationapi.aa1;

/* JADX INFO: loaded from: classes19.dex */
public final class GetCourSelectByType {

    @aa1
    public static final String COURSE_DIFF = "course_diff";

    @aa1
    public static final String COURSE_PART = "course_part";

    @aa1
    public static final String COURSE_SORT_TYPE = "course_sortType";

    @aa1
    public static final GetCourSelectByType INSTANCE = null;

    @aa1
    public static final String LANGUAGE = "language";

    @aa1
    public static final String URL = "/dict-data/selectByType";

    static {
        INSTANCE = new GetCourSelectByType();
    }

    private GetCourSelectByType() {
    }
}
