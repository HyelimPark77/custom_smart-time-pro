package com.szabh.smable3.component;

import com.android.mltcode.paycertificationapi.aa1;

/* JADX INFO: loaded from: classes3.dex */
public final class MatchTeamType {
    public static final int GUEST_TEAM = 1;
    public static final int HOME_TEAM = 0;

    @aa1
    public static final MatchTeamType INSTANCE = null;

    static {
        INSTANCE = new MatchTeamType();
    }

    private MatchTeamType() {
    }
}
