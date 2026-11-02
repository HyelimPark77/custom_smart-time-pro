package com.jieli.jl_bt_ota.interfaces.bt;

import android.bluetooth.BluetoothDevice;
import com.jieli.jl_bt_ota.model.BleScanMessage;

/* JADX INFO: loaded from: classes17.dex */
public interface IBtAssistantCallback {
    void onA2dpStatus(BluetoothDevice r1, int r2);

    void onAdapterStatus(boolean r1, boolean r2);

    void onBtDeviceConnection(BluetoothDevice r1, int r2);

    void onDiscovery(BluetoothDevice r1, BleScanMessage r2);

    void onDiscoveryStatus(boolean r1, boolean r2);

    void onHfpStatus(BluetoothDevice r1, int r2);
}
