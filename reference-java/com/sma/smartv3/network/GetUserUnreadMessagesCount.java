package com.sma.smartv3.network;

import com.android.mltcode.paycertificationapi.aa1;

/* JADX INFO: loaded from: classes19.dex */
public final class GetUserUnreadMessagesCount {

    @aa1
    public static final GetUserUnreadMessagesCount INSTANCE = new GetUserUnreadMessagesCount();

    @aa1
    public static final String URL = "/messages/count";

    @aa1
    public static final String USER_ID = "userId";

    private GetUserUnreadMessagesCount() {
    }
}
