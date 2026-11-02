package com.sma.smartv3.network;

import com.android.mltcode.paycertificationapi.aa1;

/* JADX INFO: loaded from: classes19.dex */
public final class GetUserMember {

    @aa1
    public static final String IDENTITY = "identity";

    @aa1
    public static final GetUserMember INSTANCE = null;

    @aa1
    public static final String URL = "/user/memberships/account";

    static {
        INSTANCE = new GetUserMember();
    }

    private GetUserMember() {
    }
}
