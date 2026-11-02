package com.jieli.jl_bt_ota.interfaces.bt;

import android.bluetooth.BluetoothDevice;
import com.jieli.jl_bt_ota.model.base.BaseError;
import com.jieli.jl_bt_ota.model.base.CommandBase;

/* JADX INFO: loaded from: classes17.dex */
public interface IBluetoothCallback extends IBtAssistantCallback {
    void onBleDataBlockChanged(BluetoothDevice r1, int r2, int r3);

    void onConnection(BluetoothDevice r1, int r2);

    void onError(BaseError r1);

    void onMandatoryUpgrade(BluetoothDevice r1);

    void onReceiveCommand(BluetoothDevice r1, CommandBase r2);
}
