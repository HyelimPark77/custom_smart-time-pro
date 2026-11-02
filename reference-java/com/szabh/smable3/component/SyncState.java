package com.szabh.smable3.component;

import com.android.mltcode.paycertificationapi.aa1;
import com.facebook.internal.AnalyticsEvents;

/* JADX INFO: loaded from: classes3.dex */
public final class SyncState {
    public static final int COMPLETED = 0;
    public static final int DISCONNECTED = -2;

    @aa1
    public static final SyncState INSTANCE = new SyncState();
    public static final int SYNCING = 1;
    public static final int TIMEOUT = -1;

    private SyncState() {
    }

    @aa1
    public final String getState(int i) {
        if (i == -2) {
            return "Disconnected";
        }
        if (i == -1) {
            return "Timeout";
        }
        if (i != 0) {
            return i != 1 ? AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN : "Syncing";
        }
        return "completed";
    }
}
