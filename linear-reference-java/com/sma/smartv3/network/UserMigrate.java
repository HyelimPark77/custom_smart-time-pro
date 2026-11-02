package com.sma.smartv3.network;

import com.android.mltcode.paycertificationapi.aa1;

/* JADX INFO: loaded from: classes19.dex */
public final class UserMigrate {

    @aa1
    public static final String GOALSERVER = "goalServer";

    @aa1
    public static final String IDENTITY = "identity";

    @aa1
    public static final UserMigrate INSTANCE = null;

    @aa1
    public static final String URL = "/appuser/user_migrate";

    static {
        INSTANCE = new UserMigrate();
    }

    private UserMigrate() {
    }
}
