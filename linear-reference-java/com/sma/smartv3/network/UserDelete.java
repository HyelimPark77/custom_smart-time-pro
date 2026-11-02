package com.sma.smartv3.network;

import com.android.mltcode.paycertificationapi.aa1;

/* JADX INFO: loaded from: classes19.dex */
public final class UserDelete {

    @aa1
    public static final String IDENTITY = "identity";

    @aa1
    public static final UserDelete INSTANCE = null;

    @aa1
    public static final String URL = "/appuser/delete";

    static {
        INSTANCE = new UserDelete();
    }

    private UserDelete() {
    }
}
