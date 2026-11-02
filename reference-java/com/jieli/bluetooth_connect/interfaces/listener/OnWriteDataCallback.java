package com.jieli.bluetooth_connect.interfaces.listener;

import android.bluetooth.BluetoothDevice;
import java.util.UUID;

/* JADX INFO: loaded from: classes17.dex */
public interface OnWriteDataCallback {
    void onBleResult(BluetoothDevice device, UUID serviceUUID, UUID characteristicUUID, boolean result, byte[] data);
}
