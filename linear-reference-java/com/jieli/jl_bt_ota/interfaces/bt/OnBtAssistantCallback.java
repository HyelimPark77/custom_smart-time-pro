package com.jieli.jl_bt_ota.interfaces.bt;

import android.bluetooth.BluetoothDevice;
import com.jieli.jl_bt_ota.model.BleScanMessage;

/* JADX INFO: loaded from: classes17.dex */
public abstract class OnBtAssistantCallback implements IBtAssistantCallback {
    public OnBtAssistantCallback() {
    }

    @Override // com.jieli.jl_bt_ota.interfaces.bt.IBtAssistantCallback
    public void onA2dpStatus(BluetoothDevice r1, int r2) {
    }

    @Override // com.jieli.jl_bt_ota.interfaces.bt.IBtAssistantCallback
    public void onAdapterStatus(boolean r1, boolean r2) {
    }

    @Override // com.jieli.jl_bt_ota.interfaces.bt.IBtAssistantCallback
    public void onBtDeviceConnection(BluetoothDevice r1, int r2) {
    }

    @Override // com.jieli.jl_bt_ota.interfaces.bt.IBtAssistantCallback
    public void onDiscovery(BluetoothDevice r1, BleScanMessage r2) {
    }

    @Override // com.jieli.jl_bt_ota.interfaces.bt.IBtAssistantCallback
    public void onDiscoveryStatus(boolean r1, boolean r2) {
    }

    @Override // com.jieli.jl_bt_ota.interfaces.bt.IBtAssistantCallback
    public void onHfpStatus(BluetoothDevice r1, int r2) {
    }
}
