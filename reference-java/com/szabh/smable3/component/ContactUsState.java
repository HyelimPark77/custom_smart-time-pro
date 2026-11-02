package com.szabh.smable3.component;

import com.android.mltcode.paycertificationapi.aa1;
import com.facebook.internal.AnalyticsEvents;

/* JADX INFO: loaded from: classes3.dex */
public final class ContactUsState {
    public static final int ENTER = 1;
    public static final int EXIT = 0;

    @aa1
    public static final ContactUsState INSTANCE = new ContactUsState();

    private ContactUsState() {
    }

    @aa1
    public final String getState(int i) {
        if (i != 0) {
            return i != 1 ? AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN : "Enter";
        }
        return "Exit";
    }
}
