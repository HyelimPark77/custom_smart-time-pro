package com.jieli.jl_rcsp.interfaces.network;

import android.bluetooth.BluetoothDevice;
import com.jieli.jl_rcsp.interfaces.OnOperationCallback;
import com.jieli.jl_rcsp.model.network.OTAParam;

/* JADX INFO: loaded from: classes17.dex */
public interface INetworkOp {
    void addOnNetworkListener(OnNetworkListener r1);

    void cancelNetworkOTA(BluetoothDevice r1, OnOperationCallback<Boolean> r2);

    boolean isNetworkOTA();

    void queryNetworkInfo(BluetoothDevice r1, OnOperationCallback<Boolean> r2);

    void removeOnNetworkListener(OnNetworkListener r1);

    void startNetworkOTA(BluetoothDevice r1, OTAParam r2, OnNetworkOTACallback r3);
}
