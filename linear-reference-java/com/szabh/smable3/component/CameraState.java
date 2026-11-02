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
    public static final CameraState INSTANCE = null;

    static {
        INSTANCE = new CameraState();
    }

    private CameraState() {
    }

    @aa1
    public final String getState(int r2) {
        if (r2 != 0) goto L4;
        return "Exit";
    L4:
        if (r2 != 1) goto L6;
        return "Enter";
    L6:
        if (r2 != 2) goto L8;
        return "Capture";
    L8:
        if (r2 == 3) goto L11;
        return AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
    L11:
        return "Exchange";
    }
}
