package com.szabh.smable3.component;

import com.android.mltcode.paycertificationapi.aa1;
import com.facebook.internal.AnalyticsEvents;

/* JADX INFO: loaded from: classes3.dex */
public final class CameraState {
    public static final int CAPTURE = 2;
    public static final int ENTER = 1;
    public static final int EXCHANGE = 3;
    public static final int EXIT = 0;

    @aa1
    public static final CameraState INSTANCE = new CameraState();

    private CameraState() {
    }

    @aa1
    public final String getState(int i) {
        if (i == 0) {
            return "Exit";
        }
        if (i == 1) {
            return "Enter";
        }
        if (i != 2) {
            return i != 3 ? AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN : "Exchange";
        }
        return "Capture";
    }
}
