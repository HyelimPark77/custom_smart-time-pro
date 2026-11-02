package com.jieli.jl_bt_ota.interfaces.p199bt;

import android.bluetooth.BluetoothDevice;
import com.jieli.jl_bt_ota.model.base.BaseError;
import com.jieli.jl_bt_ota.model.base.CommandBase;

/* JADX INFO: loaded from: classes17.dex */
public interface IBluetoothCallback extends IBtAssistantCallback {
    void onBleDataBlockChanged(BluetoothDevice bluetoothDevice, int i, int i2);

    void onConnection(BluetoothDevice bluetoothDevice, int i);

    void onError(BaseError baseError);

    void onMandatoryUpgrade(BluetoothDevice bluetoothDevice);

    void onReceiveCommand(BluetoothDevice bluetoothDevice, CommandBase commandBase);
}
