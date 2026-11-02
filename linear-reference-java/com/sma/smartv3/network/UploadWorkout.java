package com.sma.smartv3.network;

import com.android.mltcode.paycertificationapi.aa1;

/* JADX INFO: loaded from: classes19.dex */
public final class UploadWorkout {

    @aa1
    public static final UploadWorkout INSTANCE = null;

    @aa1
    public static final String URL = "/ble_workout/upload";

    static {
        INSTANCE = new UploadWorkout();
    }

    private UploadWorkout() {
    }
}
