package com.sma.smartv3.network;

import com.android.mltcode.paycertificationapi.aa1;

/* JADX INFO: loaded from: classes19.dex */
public final class SignInByVerificationCode {

    @aa1
    public static final String COUNTRY = "country";

    @aa1
    public static final SignInByVerificationCode INSTANCE = new SignInByVerificationCode();

    @aa1
    public static final String PROJECT_ID = "projectId";

    @aa1
    public static final String URL = "/appuser/signin_verification_code";

    @aa1
    public static final String USER_NAME = "userName";

    @aa1
    public static final String VERIFICATION_CODE = "verificationCode";

    private SignInByVerificationCode() {
    }
}
