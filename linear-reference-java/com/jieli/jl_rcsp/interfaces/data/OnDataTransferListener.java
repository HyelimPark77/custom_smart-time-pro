package com.jieli.jl_rcsp.interfaces.data;

import android.bluetooth.BluetoothDevice;
import com.jieli.jl_rcsp.model.base.BaseError;

/* JADX INFO: loaded from: classes17.dex */
public interface OnDataTransferListener {
    void onError(BluetoothDevice r1, BaseError r2);

    void onReceiveData(BluetoothDevice r1, int r2, byte[] r3);
}
