package com.jieli.jl_bt_ota.interfaces.bt;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import com.jieli.jl_bt_ota.interfaces.BtEventCallback;
import com.jieli.jl_bt_ota.interfaces.rcsp.OnRcspCallback;
import com.jieli.jl_bt_ota.model.base.BaseError;

/* JADX INFO: loaded from: classes17.dex */
public interface IBluetoothManager {
    void addOnRcspCallback(OnRcspCallback r1);

    void connectBluetoothDevice(BluetoothDevice r1);

    void disconnectBluetoothDevice(BluetoothDevice r1);

    BluetoothGatt getConnectedBluetoothGatt();

    BluetoothDevice getConnectedDevice();

    void onBtDeviceConnection(BluetoothDevice r1, int r2);

    void onError(BaseError r1);

    void onMtuChanged(BluetoothGatt r1, int r2, int r3);

    void onReceiveDeviceData(BluetoothDevice r1, byte[] r2);

    void registerBluetoothCallback(BtEventCallback r1);

    void removeRcspCallback(OnRcspCallback r1);

    boolean sendDataToDevice(BluetoothDevice r1, byte[] r2);

    void unregisterBluetoothCallback(BtEventCallback r1);
}
