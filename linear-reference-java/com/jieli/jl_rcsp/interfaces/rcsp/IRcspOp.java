package com.jieli.jl_rcsp.interfaces.rcsp;

import android.bluetooth.BluetoothDevice;
import com.jieli.jl_rcsp.model.base.CommandBase;

/* JADX INFO: loaded from: classes17.dex */
public interface IRcspOp {
    void registerOnRcspCallback(OnRcspCallback r1);

    void registerOnRcspEventListener(OnRcspEventListener r1);

    void release();

    <T extends CommandBase> void sendCommandAsync(BluetoothDevice r1, CommandBase r2, int r3, RcspCommandCallback<T> r4);

    <T extends CommandBase> void sendCommandResponse(BluetoothDevice r1, CommandBase r2, RcspCommandCallback<T> r3);

    void switchConnectedDevice(BluetoothDevice r1);

    void unregisterOnRcspCallback(OnRcspCallback r1);

    void unregisterOnRcspEventListener(OnRcspEventListener r1);
}
