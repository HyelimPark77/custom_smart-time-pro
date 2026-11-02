package com.sma.smartv3.network;

import com.android.mltcode.paycertificationapi.aa1;

/* JADX INFO: loaded from: classes19.dex */
public final class GetCourseTypeList {

    @aa1
    public static final String DICT_TYPE = "dictType";

    @aa1
    public static final GetCourseTypeList INSTANCE = null;

    @aa1
    public static final String LANGUAGE = "language";

    @aa1
    public static final String URL = "/system/dict/data/type";

    static {
        INSTANCE = new GetCourseTypeList();
    }

    private GetCourseTypeList() {
    }
}
