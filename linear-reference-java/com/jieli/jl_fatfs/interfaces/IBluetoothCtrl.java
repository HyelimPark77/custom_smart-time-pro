package com.jieli.jl_fatfs.interfaces;

import android.bluetooth.BluetoothDevice;

/* JADX INFO: loaded from: classes17.dex */
public interface IBluetoothCtrl {
    BluetoothDevice getConnectedDevice();

    void readFatDataFromDevice(BluetoothDevice r1, int r2, int r3);

    void release();

    void sendWriteFlag(BluetoothDevice r1, boolean r2);

    void writeFatDataToDevice(BluetoothDevice r1, int r2, byte[] r3);
}
