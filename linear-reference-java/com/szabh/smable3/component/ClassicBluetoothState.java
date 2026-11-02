package com.szabh.smable3.component;

import com.android.mltcode.paycertificationapi.aa1;
import com.facebook.internal.AnalyticsEvents;
import com.google.firebase.crashlytics.buildtools.reloc.org.apache.http.protocol.HTTP;

/* JADX INFO: loaded from: classes3.dex */
public final class ClassicBluetoothState {
    public static final int CLOSE = 0;
    public static final int CLOSE_SUCCESSFULLY = 2;

    @aa1
    public static final ClassicBluetoothState INSTANCE = null;
    public static final int OPEN = 1;
    public static final int OPEN_SUCCESSFULLY = 3;

    static {
        INSTANCE = new ClassicBluetoothState();
    }

    private ClassicBluetoothState() {
    }

    @aa1
    public final String getState(int r2) {
        if (r2 != 0) goto L4;
        return HTTP.CONN_CLOSE;
    L4:
        if (r2 != 1) goto L6;
        return "Open";
    L6:
        if (r2 != 2) goto L8;
        return "Close Successfully";
    L8:
        if (r2 == 3) goto L11;
        return AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
    L11:
        return "Open Successfully";
    }
}
