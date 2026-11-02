package com.jieli.jl_bt_ota.interfaces.command;

import android.bluetooth.BluetoothDevice;
import com.jieli.jl_bt_ota.model.base.BaseError;
import com.jieli.jl_bt_ota.model.base.CommandBase;

/* JADX INFO: loaded from: classes17.dex */
public interface OnDataHandlerListener {
    void onRCSPError(BluetoothDevice r1, BaseError r2);

    void onReceivedCmd(BluetoothDevice r1, CommandBase r2);
}
