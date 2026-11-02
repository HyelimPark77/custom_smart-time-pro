package com.jieli.jl_bt_ota.interfaces.bt;

import android.bluetooth.BluetoothDevice;
import java.util.UUID;

/* JADX INFO: loaded from: classes17.dex */
public interface OnBleSendDataCallback {
    void onResult(BluetoothDevice r1, UUID r2, UUID r3, boolean r4, byte[] r5);
}
