package com.jieli.jl_rcsp.interfaces.record;

import android.bluetooth.BluetoothDevice;
import com.jieli.jl_rcsp.model.RecordState;

/* JADX INFO: loaded from: classes17.dex */
public interface OnRecordStateCallback {
    void onStateChange(BluetoothDevice r1, RecordState r2);
}
