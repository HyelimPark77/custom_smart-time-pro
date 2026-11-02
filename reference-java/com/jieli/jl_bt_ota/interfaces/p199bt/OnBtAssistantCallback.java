package com.jieli.jl_bt_ota.interfaces.p199bt;

import android.bluetooth.BluetoothDevice;
import com.jieli.jl_bt_ota.model.BleScanMessage;

/* JADX INFO: loaded from: classes17.dex */
public abstract class OnBtAssistantCallback implements IBtAssistantCallback {
    @Override // com.jieli.jl_bt_ota.interfaces.p199bt.IBtAssistantCallback
    public void onA2dpStatus(BluetoothDevice bluetoothDevice, int i) {
    }

    @Override // com.jieli.jl_bt_ota.interfaces.p199bt.IBtAssistantCallback
    public void onAdapterStatus(boolean z, boolean z2) {
    }

    @Override // com.jieli.jl_bt_ota.interfaces.p199bt.IBtAssistantCallback
    public void onBtDeviceConnection(BluetoothDevice bluetoothDevice, int i) {
    }

    @Override // com.jieli.jl_bt_ota.interfaces.p199bt.IBtAssistantCallback
    public void onDiscovery(BluetoothDevice bluetoothDevice, BleScanMessage bleScanMessage) {
    }

    @Override // com.jieli.jl_bt_ota.interfaces.p199bt.IBtAssistantCallback
    public void onDiscoveryStatus(boolean z, boolean z2) {
    }

    @Override // com.jieli.jl_bt_ota.interfaces.p199bt.IBtAssistantCallback
    public void onHfpStatus(BluetoothDevice bluetoothDevice, int i) {
    }
}
