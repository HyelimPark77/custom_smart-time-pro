package com.jieli.jl_bt_ota.interfaces.rcsp;

import android.bluetooth.BluetoothDevice;
import com.jieli.jl_bt_ota.model.base.BaseError;
import com.jieli.jl_bt_ota.model.base.CommandBase;

/* JADX INFO: loaded from: classes17.dex */
public abstract class OnRcspCallback {
    public OnRcspCallback() {
    }

    public void onConnectStateChange(BluetoothDevice r1, int r2) {
    }

    public void onMandatoryUpgrade(BluetoothDevice r1) {
    }

    public void onRcspCommand(BluetoothDevice r1, CommandBase r2) {
    }

    public void onRcspError(BluetoothDevice r1, BaseError r2) {
    }

    public void onRcspInit(BluetoothDevice r1, boolean r2) {
    }
}
