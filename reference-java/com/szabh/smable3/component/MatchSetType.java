package com.szabh.smable3.component;

import com.android.mltcode.paycertificationapi.aa1;

/* JADX INFO: loaded from: classes3.dex */
public final class MatchSetType {
    public static final int CLASSIC_MATCH = 1;
    public static final int CLASSIC_MATCH_V3 = 7;
    public static final int FIELD_HOCKEY_MATCH = 11;
    public static final int FUTSAL_MATCH = 10;
    public static final int GUEST_TEAM_PLAYER_LIST = 5;
    public static final int HOME_TEAM_PLAYER_LIST = 4;

    @aa1
    public static final MatchSetType INSTANCE = new MatchSetType();
    public static final int INTERVAL_TRAINING = 3;
    public static final int INTERVAL_TRAINING_V3 = 9;
    public static final int PLAYER_LIST_V3 = 255;
    public static final int PRO_MATCH = 2;
    public static final int PRO_MATCH_V3 = 8;
    public static final int RUGBY_MATCH = 12;
    public static final int YOUTH_MATCH = 0;
    public static final int YOUTH_MATCH_V3 = 6;

    private MatchSetType() {
    }
}
