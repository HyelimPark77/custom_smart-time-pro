package com.szabh.smable3.component;

import com.android.mltcode.paycertificationapi.X01O0O1;
import com.android.mltcode.paycertificationapi.aa1;

/* JADX INFO: loaded from: classes3.dex */
public interface BleMessengerCallback {
    void onRetry();

    void onTimeout(@aa1 X01O0O1 x01o0o1);
}
