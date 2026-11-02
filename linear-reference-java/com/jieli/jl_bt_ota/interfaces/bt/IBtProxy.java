package com.jieli.jl_bt_ota.interfaces.bt;

import android.bluetooth.BluetoothDevice;

/* JADX INFO: loaded from: classes17.dex */
public interface IBtProxy {
    void setOnBtListener(OnBtListener r1);

    boolean writeData(BluetoothDevice r1, byte[] r2);
}
