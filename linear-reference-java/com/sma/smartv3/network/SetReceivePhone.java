package com.sma.smartv3.network;

import com.android.mltcode.paycertificationapi.aa1;

/* JADX INFO: loaded from: classes19.dex */
public final class SetReceivePhone {

    @aa1
    public static final String IDENTITY = "identity";

    @aa1
    public static final SetReceivePhone INSTANCE = null;

    @aa1
    public static final String RECEIVE_PHONE = "receivePhone";

    @aa1
    public static final String URL = "/appuser/set_receivephone";

    static {
        INSTANCE = new SetReceivePhone();
    }

    private SetReceivePhone() {
    }
}
