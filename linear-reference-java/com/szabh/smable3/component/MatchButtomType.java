package com.szabh.smable3.component;

import com.android.mltcode.paycertificationapi.aa1;

/* JADX INFO: loaded from: classes3.dex */
public final class MatchButtomType {
    public static final int DOUBLE_PRESS = 2;

    @aa1
    public static final MatchButtomType INSTANCE = null;
    public static final int LONG_PRESS = 1;
    public static final int SHORT_PRESS = 0;

    static {
        INSTANCE = new MatchButtomType();
    }

    private MatchButtomType() {
    }
}
