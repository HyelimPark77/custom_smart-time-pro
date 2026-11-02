package com.sma.smartv3.network;

import com.android.mltcode.paycertificationapi.aa1;

/* JADX INFO: loaded from: classes19.dex */
public final class Signin {

    @aa1
    public static final String COUNTRY = "country";

    @aa1
    public static final Signin INSTANCE = null;

    @aa1
    public static final String PASSWORD = "password";

    @aa1
    public static final String PROJECT_ID = "projectId";

    @aa1
    public static final String URL = "/appuser/signin";

    @aa1
    public static final String USER_NAME = "userName";

    static {
        INSTANCE = new Signin();
    }

    private Signin() {
    }
}
