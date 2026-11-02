package com.jieli.jl_bt_ota.interfaces;

import android.bluetooth.BluetoothDevice;
import com.jieli.jl_bt_ota.interfaces.bt.IBluetoothCallback;
import com.jieli.jl_bt_ota.model.BleScanMessage;
import com.jieli.jl_bt_ota.model.base.BaseError;
import com.jieli.jl_bt_ota.model.base.CommandBase;

/* JADX INFO: loaded from: classes17.dex */
public abstract class BtEventCallback implements IBluetoothCallback {
    public BtEventCallback() {
    }

    @Override // com.jieli.jl_bt_ota.interfaces.bt.IBtAssistantCallback
    public void onA2dpStatus(BluetoothDevice r1, int r2) {
    }

    @Override // com.jieli.jl_bt_ota.interfaces.bt.IBtAssistantCallback
    public void onAdapterStatus(boolean r1, boolean r2) {
    }

    @Override // com.jieli.jl_bt_ota.interfaces.bt.IBluetoothCallback
    public void onBleDataBlockChanged(BluetoothDevice r1, int r2, int r3) {
    }

    @Override // com.jieli.jl_bt_ota.interfaces.bt.IBtAssistantCallback
    public void onBtDeviceConnection(BluetoothDevice r1, int r2) {
    }

    @Override // com.jieli.jl_bt_ota.interfaces.bt.IBluetoothCallback
    public void onConnection(BluetoothDevice r1, int r2) {
    }

    @Override // com.jieli.jl_bt_ota.interfaces.bt.IBtAssistantCallback
    public void onDiscovery(BluetoothDevice r1, BleScanMessage r2) {
    }

    @Override // com.jieli.jl_bt_ota.interfaces.bt.IBtAssistantCallback
    public void onDiscoveryStatus(boolean r1, boolean r2) {
    }

    @Override // com.jieli.jl_bt_ota.interfaces.bt.IBluetoothCallback
    public void onError(BaseError r1) {
    }

    @Override // com.jieli.jl_bt_ota.interfaces.bt.IBtAssistantCallback
    public void onHfpStatus(BluetoothDevice r1, int r2) {
    }

    @Override // com.jieli.jl_bt_ota.interfaces.bt.IBluetoothCallback
    public void onMandatoryUpgrade(BluetoothDevice r1) {
    }

    @Override // com.jieli.jl_bt_ota.interfaces.bt.IBluetoothCallback
    public void onReceiveCommand(BluetoothDevice r1, CommandBase r2) {
    }
}
