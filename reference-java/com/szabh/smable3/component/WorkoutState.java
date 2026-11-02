package com.szabh.smable3.component;

import com.android.mltcode.paycertificationapi.aa1;
import com.facebook.internal.AnalyticsEvents;

/* JADX INFO: loaded from: classes3.dex */
public final class WorkoutState {
    public static final int END = 4;

    @aa1
    public static final WorkoutState INSTANCE = new WorkoutState();
    public static final int ONGOING = 2;
    public static final int PAUSE = 3;
    public static final int RESUME = 5;
    public static final int START = 1;

    private WorkoutState() {
    }

    @aa1
    public final String getState(int i) {
        if (i == 1) {
            return "Start";
        }
        if (i == 2) {
            return "Ongoing";
        }
        if (i == 3) {
            return "Pause";
        }
        if (i != 4) {
            return i != 5 ? AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN : "Resume";
        }
        return "End";
    }
}
