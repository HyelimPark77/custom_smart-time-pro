package com.jieli.jl_bt_ota.interfaces.p199bt;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;

/* JADX INFO: loaded from: classes17.dex */
public abstract class OnBtBleListener extends BluetoothGattCallback {
    public abstract void onBleConnection(BluetoothDevice bluetoothDevice, int i);

    public void onConnectionUpdatedCallback(BluetoothGatt bluetoothGatt, int i, int i2, int i3, int i4) {
    }

    public void onSwitchBleDevice(BluetoothDevice bluetoothDevice) {
    }
}
