package com.sma.smartv3.network;

import com.android.mltcode.paycertificationapi.aa1;

/* JADX INFO: loaded from: classes19.dex */
public final class BindPhoneHYKY {

    @aa1
    public static final String CODE = "code";

    @aa1
    public static final String IDENTITY = "identity";

    @aa1
    public static final BindPhoneHYKY INSTANCE = null;

    @aa1
    public static final String PHONE = "phone";

    @aa1
    public static final String URL = "/appuser/force_bind_phone";

    static {
        INSTANCE = new BindPhoneHYKY();
    }

    private BindPhoneHYKY() {
    }
}
