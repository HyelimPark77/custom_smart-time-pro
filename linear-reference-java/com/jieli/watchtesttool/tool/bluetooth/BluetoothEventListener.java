package com.jieli.watchtesttool.tool.bluetooth;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import com.jieli.bluetooth_connect.bean.ErrorInfo;
import com.jieli.bluetooth_connect.bean.ble.BleScanMessage;

/* JADX INFO: loaded from: classes17.dex */
public abstract class BluetoothEventListener {
    public BluetoothEventListener() {
    }

    public void onAdapterStatus(boolean r1) {
    }

    public void onBleMtuChange(BluetoothGatt r1, int r2, int r3) {
    }

    public void onBtDiscovery(BluetoothDevice r1, BleScanMessage r2) {
    }

    public void onBtDiscoveryStatus(boolean r1, boolean r2) {
    }

    public void onConnection(BluetoothDevice r1, int r2) {
    }

    public void onError(ErrorInfo r1) {
    }

    public void onReceiveData(BluetoothDevice r1, byte[] r2) {
    }

    public void onShowDialog(BluetoothDevice r1, BleScanMessage r2) {
    }

    public void onSwitchConnectedDevice(BluetoothDevice r1) {
    }
}
