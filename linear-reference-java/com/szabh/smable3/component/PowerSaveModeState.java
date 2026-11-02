package com.szabh.smable3.component;

import com.android.mltcode.paycertificationapi.aa1;
import com.facebook.internal.AnalyticsEvents;
import com.google.firebase.crashlytics.buildtools.reloc.org.apache.http.protocol.HTTP;

/* JADX INFO: loaded from: classes3.dex */
public final class PowerSaveModeState {
    public static final int CLOSE = 0;

    @aa1
    public static final PowerSaveModeState INSTANCE = null;
    public static final int OPEN = 1;

    static {
        INSTANCE = new PowerSaveModeState();
    }

    private PowerSaveModeState() {
    }

    @aa1
    public final String getState(int r2) {
        if (r2 != 0) goto L4;
        return HTTP.CONN_CLOSE;
    L4:
        if (r2 == 1) goto L7;
        return AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
    L7:
        return "Open";
    }
}
