package com.sma.smartv3.network;

import com.android.mltcode.paycertificationapi.aa1;

/* JADX INFO: loaded from: classes19.dex */
public final class AppUserUpdate {

    @aa1
    public static final String AVATAR = "avatar";

    @aa1
    public static final String BIRTHDAY = "birthday";

    @aa1
    public static final String EXTRA_INFO = "extraInfo";

    @aa1
    public static final String GENDER = "gender";

    @aa1
    public static final String HEIGHT = "height";

    @aa1
    public static final String IDENTITY = "identity";

    @aa1
    public static final AppUserUpdate INSTANCE = null;

    @aa1
    public static final String NICK_NAME = "nickname";

    @aa1
    public static final String URL = "/appuser/update";

    @aa1
    public static final String WEIGHT = "weight";

    static {
        INSTANCE = new AppUserUpdate();
    }

    private AppUserUpdate() {
    }
}
