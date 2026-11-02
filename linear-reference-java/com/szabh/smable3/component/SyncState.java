package com.szabh.smable3.component;

import com.android.mltcode.paycertificationapi.aa1;
import com.facebook.internal.AnalyticsEvents;

/* JADX INFO: loaded from: classes3.dex */
public final class SyncState {
    public static final int COMPLETED = 0;
    public static final int DISCONNECTED = -2;

    @aa1
    public static final SyncState INSTANCE = null;
    public static final int SYNCING = 1;
    public static final int TIMEOUT = -1;

    static {
        INSTANCE = new SyncState();
    }

    private SyncState() {
    }

    @aa1
    public final String getState(int r2) {
        if (r2 != (-2)) goto L5;
        return "Disconnected";
    L5:
        if (r2 == (-1)) goto L15;
        if (r2 != 0) goto L8;
        return "completed";
    L8:
        if (r2 == 1) goto L11;
        return AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
    L11:
        return "Syncing";
    L15:
        return "Timeout";
    }
}
