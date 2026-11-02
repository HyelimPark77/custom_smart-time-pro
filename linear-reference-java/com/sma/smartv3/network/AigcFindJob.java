package com.sma.smartv3.network;

import com.android.mltcode.paycertificationapi.aa1;

/* JADX INFO: loaded from: classes19.dex */
public final class AigcFindJob {

    @aa1
    public static final String BLE_NAME = "bleName";

    @aa1
    public static final AigcFindJob INSTANCE = null;

    @aa1
    public static final String JOBID = "jobId";

    @aa1
    public static final String PROJECT_ID = "projectId";

    @aa1
    public static final String URL = "/baiduDuer/aigc_find_job";

    static {
        INSTANCE = new AigcFindJob();
    }

    private AigcFindJob() {
    }
}
