package com.szabh.smable3.component;

import com.android.mltcode.paycertificationapi.aa1;

/* JADX INFO: loaded from: classes3.dex */
public final class BleState {
    public static final int CONNECTED = 0;
    public static final int DISCONNECTED = -1;

    @aa1
    public static final BleState INSTANCE = new BleState();
    public static final int READY = 1;

    private BleState() {
    }
}
