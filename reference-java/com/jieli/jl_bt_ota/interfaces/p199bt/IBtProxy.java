package com.jieli.jl_bt_ota.interfaces.p199bt;

import android.bluetooth.BluetoothDevice;

/* JADX INFO: loaded from: classes17.dex */
public interface IBtProxy {
    void setOnBtListener(OnBtListener onBtListener);

    boolean writeData(BluetoothDevice bluetoothDevice, byte[] bArr);
}
