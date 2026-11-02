package com.szabh.smable3.component;

import com.android.mltcode.paycertificationapi.aa1;
import com.facebook.internal.AnalyticsEvents;

/* JADX INFO: loaded from: classes3.dex */
public final class HIDValue {
    public static final int HOME = 5;

    @aa1
    public static final HIDValue INSTANCE = new HIDValue();
    public static final int NEXT_TRACK = 0;
    public static final int PLAY_OR_PAUSE = 2;
    public static final int PREVIOUS_TRACK = 1;
    public static final int VOLUME_DEC = 4;
    public static final int VOLUME_INC = 3;

    private HIDValue() {
    }

    @aa1
    public final String getValue(int i) {
        if (i == 0) {
            return "NEXT_TRACK";
        }
        if (i == 1) {
            return "PREVIOUS_TRACK";
        }
        if (i == 2) {
            return "PLAY_OR_PAUSE";
        }
        if (i == 3) {
            return "VOLUME_INC";
        }
        if (i != 4) {
            return i != 5 ? AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN : "HOME";
        }
        return "VOLUME_DEC";
    }
}
