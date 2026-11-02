package com.szabh.smable3.component;

import com.android.mltcode.paycertificationapi.aa1;
import com.facebook.internal.AnalyticsEvents;
import com.google.firebase.crashlytics.buildtools.reloc.org.apache.http.protocol.HTTP;

/* JADX INFO: loaded from: classes3.dex */
public final class PowerSaveModeState {
    public static final int CLOSE = 0;

    @aa1
    public static final PowerSaveModeState INSTANCE = new PowerSaveModeState();
    public static final int OPEN = 1;

    private PowerSaveModeState() {
    }

    @aa1
    public final String getState(int i) {
        if (i != 0) {
            return i != 1 ? AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN : "Open";
        }
        return HTTP.CONN_CLOSE;
    }
}
