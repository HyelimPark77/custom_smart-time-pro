package com.jieli.jl_bt_ota.interfaces.bt;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;

/* JADX INFO: loaded from: classes17.dex */
public abstract class OnBtBleListener extends BluetoothGattCallback {
    public OnBtBleListener() {
    }

    public abstract void onBleConnection(BluetoothDevice r1, int r2);

    public void onConnectionUpdatedCallback(BluetoothGatt r1, int r2, int r3, int r4, int r5) {
    }

    public void onSwitchBleDevice(BluetoothDevice r1) {
    }
}
