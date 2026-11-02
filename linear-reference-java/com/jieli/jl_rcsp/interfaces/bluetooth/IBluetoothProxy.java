package com.jieli.jl_rcsp.interfaces.bluetooth;

import android.bluetooth.BluetoothDevice;
import com.jieli.jl_rcsp.model.base.BaseError;
import com.jieli.jl_rcsp.model.base.BasePacket;

/* JADX INFO: loaded from: classes17.dex */
public interface IBluetoothProxy {
    <E extends BaseError> void callbackErrorEvent(E r1);

    BluetoothDevice getConnectedDevice();

    boolean isDeviceConnected(BluetoothDevice r1);

    void notifyBtDeviceConnection(BluetoothDevice r1, int r2);

    void notifyReceiveDeviceData(BluetoothDevice r1, byte[] r2);

    void receiveDataFromDevice(BluetoothDevice r1, BasePacket r2);

    boolean sendDataToDevice(BluetoothDevice r1, byte[] r2);

    void setCmdSnGenerator(CmdSnGenerator r1);
}
