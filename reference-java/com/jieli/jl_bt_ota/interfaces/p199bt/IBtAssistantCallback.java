package com.jieli.jl_bt_ota.interfaces.p199bt;

import android.bluetooth.BluetoothDevice;
import com.jieli.jl_bt_ota.model.BleScanMessage;

/* JADX INFO: loaded from: classes17.dex */
public interface IBtAssistantCallback {
    void onA2dpStatus(BluetoothDevice bluetoothDevice, int i);

    void onAdapterStatus(boolean z, boolean z2);

    void onBtDeviceConnection(BluetoothDevice bluetoothDevice, int i);

    void onDiscovery(BluetoothDevice bluetoothDevice, BleScanMessage bleScanMessage);

    void onDiscoveryStatus(boolean z, boolean z2);

    void onHfpStatus(BluetoothDevice bluetoothDevice, int i);
}
