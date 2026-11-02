package com.szabh.smable3.component;

import com.android.mltcode.paycertificationapi.aa1;
import com.facebook.internal.AnalyticsEvents;

/* JADX INFO: loaded from: classes3.dex */
public final class HIDState {
    public static final int CONNECTED = 1;
    public static final int DISCONNECTED = 0;

    @aa1
    public static final HIDState INSTANCE = null;

    static {
        INSTANCE = new HIDState();
    }

    private HIDState() {
    }

    @aa1
    public final String getState(int r2) {
        if (r2 != 0) goto L4;
        return "Disconnected";
    L4:
        if (r2 == 1) goto L7;
        return AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
    L7:
        return "Connected";
    }
}
