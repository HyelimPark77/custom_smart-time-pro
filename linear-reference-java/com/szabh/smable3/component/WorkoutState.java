package com.szabh.smable3.component;

import com.android.mltcode.paycertificationapi.aa1;
import com.facebook.internal.AnalyticsEvents;

/* JADX INFO: loaded from: classes3.dex */
public final class WorkoutState {
    public static final int END = 4;

    @aa1
    public static final WorkoutState INSTANCE = null;
    public static final int ONGOING = 2;
    public static final int PAUSE = 3;
    public static final int RESUME = 5;
    public static final int START = 1;

    static {
        INSTANCE = new WorkoutState();
    }

    private WorkoutState() {
    }

    @aa1
    public final String getState(int r2) {
        if (r2 != 1) goto L5;
        return "Start";
    L5:
        if (r2 != 2) goto L7;
        return "Ongoing";
    L7:
        if (r2 != 3) goto L9;
        return "Pause";
    L9:
        if (r2 != 4) goto L11;
        return "End";
    L11:
        if (r2 == 5) goto L14;
        return AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
    L14:
        return "Resume";
    }
}
