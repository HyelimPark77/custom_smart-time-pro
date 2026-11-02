package com.szabh.smable3.component;

import com.android.mltcode.paycertificationapi.aa1;
import com.facebook.internal.AnalyticsEvents;
import com.google.firebase.crashlytics.buildtools.reloc.org.apache.http.protocol.HTTP;

/* JADX INFO: loaded from: classes3.dex */
public final class ClassicBluetoothState {
    public static final int CLOSE = 0;
    public static final int CLOSE_SUCCESSFULLY = 2;

    @aa1
    public static final ClassicBluetoothState INSTANCE = new ClassicBluetoothState();
    public static final int OPEN = 1;
    public static final int OPEN_SUCCESSFULLY = 3;

    private ClassicBluetoothState() {
    }

    @aa1
    public final String getState(int i) {
        if (i == 0) {
            return HTTP.CONN_CLOSE;
        }
        if (i == 1) {
            return "Open";
        }
        if (i != 2) {
            return i != 3 ? AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN : "Open Successfully";
        }
        return "Close Successfully";
    }
}
