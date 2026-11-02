package com.jieli.jl_rcsp.interfaces.network;

import android.bluetooth.BluetoothDevice;
import com.jieli.jl_rcsp.model.device.settings.v0.NetworkInfo;
import com.jieli.jl_rcsp.model.device.settings.v0.NetworkOTAState;

/* JADX INFO: loaded from: classes17.dex */
public interface OnNetworkListener {
    void onNetworkInfo(BluetoothDevice r1, NetworkInfo r2);

    void onNetworkOTAState(BluetoothDevice r1, NetworkOTAState r2);
}
