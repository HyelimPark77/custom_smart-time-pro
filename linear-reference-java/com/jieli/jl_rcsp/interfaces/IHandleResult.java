package com.jieli.jl_rcsp.interfaces;

import android.bluetooth.BluetoothDevice;
import com.jieli.jl_rcsp.model.base.CommandBase;

/* JADX INFO: loaded from: classes17.dex */
public interface IHandleResult<T, C extends CommandBase> {
    T handleResult(BluetoothDevice r1, C r2);

    int hasResult(BluetoothDevice r1, C r2);
}
