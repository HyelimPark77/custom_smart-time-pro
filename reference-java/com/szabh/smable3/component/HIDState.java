package com.szabh.smable3.component;

import com.android.mltcode.paycertificationapi.aa1;
import com.facebook.internal.AnalyticsEvents;

/* JADX INFO: loaded from: classes3.dex */
public final class HIDState {
    public static final int CONNECTED = 1;
    public static final int DISCONNECTED = 0;

    @aa1
    public static final HIDState INSTANCE = new HIDState();

    private HIDState() {
    }

    @aa1
    public final String getState(int i) {
        if (i != 0) {
            return i != 1 ? AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN : "Connected";
        }
        return "Disconnected";
    }
}
