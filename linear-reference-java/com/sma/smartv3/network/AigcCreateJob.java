package com.sma.smartv3.network;

import com.android.mltcode.paycertificationapi.aa1;

/* JADX INFO: loaded from: classes19.dex */
public final class AigcCreateJob {

    @aa1
    public static final String BLE_NAME = "bleName";

    @aa1
    public static final String IMAGE_COUNT = "imageCount";

    @aa1
    public static final AigcCreateJob INSTANCE = null;

    @aa1
    public static final String PROJECT_ID = "projectId";

    @aa1
    public static final String QUERY = "query";

    @aa1
    public static final String STYLE = "style";

    @aa1
    public static final String URL = "/baiduDuer/aigc_create_job";

    static {
        INSTANCE = new AigcCreateJob();
    }

    private AigcCreateJob() {
    }
}
