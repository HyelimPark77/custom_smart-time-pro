package com.sma.smartv3.network;

import com.android.mltcode.paycertificationapi.aa1;

/* JADX INFO: loaded from: classes19.dex */
public final class GetCourseList {

    @aa1
    public static final String COURSE_DIFF = "courseDiff";

    @aa1
    public static final String COURSE_PART = "coursePart";

    @aa1
    public static final String COURSE_TYPE = "courseType";

    @aa1
    public static final GetCourseList INSTANCE = new GetCourseList();

    @aa1
    public static final String URL = "/course/appSearch";

    private GetCourseList() {
    }
}
