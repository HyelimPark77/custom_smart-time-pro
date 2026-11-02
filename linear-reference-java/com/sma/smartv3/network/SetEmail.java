package com.sma.smartv3.network;

import com.android.mltcode.paycertificationapi.aa1;

/* JADX INFO: loaded from: classes19.dex */
public final class SetEmail {

    @aa1
    public static final String COUNTRY = "country";

    @aa1
    public static final String EMAIL = "email";

    @aa1
    public static final String IDENTITY = "identity";

    @aa1
    public static final SetEmail INSTANCE = null;

    @aa1
    public static final String URL = "/appuser/set_email";

    @aa1
    public static final String VERIFICATION_CODE = "verificationCode";

    static {
        INSTANCE = new SetEmail();
    }

    private SetEmail() {
    }
}
