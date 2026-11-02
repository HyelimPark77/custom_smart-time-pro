package com.jieli.jl_bt_ota.interfaces.bt;

import android.bluetooth.BluetoothDevice;

/* JADX INFO: loaded from: classes17.dex */
public interface OnBtListener {
    void onConnection(BluetoothDevice r1, int r2);

    void onReceivedData(BluetoothDevice r1, byte[] r2);
}
