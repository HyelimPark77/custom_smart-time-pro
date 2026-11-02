package com.jieli.jl_bt_ota.interfaces.p199bt;

import android.bluetooth.BluetoothDevice;

/* JADX INFO: loaded from: classes17.dex */
public interface OnBtListener {
    void onConnection(BluetoothDevice bluetoothDevice, int i);

    void onReceivedData(BluetoothDevice bluetoothDevice, byte[] bArr);
}
