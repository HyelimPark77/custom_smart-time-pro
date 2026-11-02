package com.szabh.smable3.component;

import com.android.mltcode.paycertificationapi.aa1;
import com.facebook.internal.AnalyticsEvents;

/* JADX INFO: loaded from: classes3.dex */
public final class HIDValue {
    public static final int HOME = 5;

    @aa1
    public static final HIDValue INSTANCE = null;
    public static final int NEXT_TRACK = 0;
    public static final int PLAY_OR_PAUSE = 2;
    public static final int PREVIOUS_TRACK = 1;
    public static final int VOLUME_DEC = 4;
    public static final int VOLUME_INC = 3;

    static {
        INSTANCE = new HIDValue();
    }

    private HIDValue() {
    }

    @aa1
    public final String getValue(int r2) {
        if (r2 != 0) goto L4;
        return "NEXT_TRACK";
    L4:
        if (r2 != 1) goto L6;
        return "PREVIOUS_TRACK";
    L6:
        if (r2 != 2) goto L8;
        return "PLAY_OR_PAUSE";
    L8:
        if (r2 != 3) goto L10;
        return "VOLUME_INC";
    L10:
        if (r2 != 4) goto L12;
        return "VOLUME_DEC";
    L12:
        if (r2 == 5) goto L15;
        return AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
    L15:
        return "HOME";
    }
}
