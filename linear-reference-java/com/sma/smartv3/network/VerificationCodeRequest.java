package com.sma.smartv3.network;

import com.android.mltcode.paycertificationapi.aa1;

/* JADX INFO: loaded from: classes19.dex */
public final class VerificationCodeRequest {

    @aa1
    public static final VerificationCodeRequest INSTANCE = null;

    @aa1
    public static final String LANGUAGE = "language";

    @aa1
    public static final String PROJECT_ID = "projectId";

    @aa1
    public static final String URL = "/verification_code/request";

    @aa1
    public static final String USER_NAME = "userName";

    @aa1
    public static final String VERIFICATION_TYPE = "verificationType";

    static {
        INSTANCE = new VerificationCodeRequest();
    }

    private VerificationCodeRequest() {
    }
}
