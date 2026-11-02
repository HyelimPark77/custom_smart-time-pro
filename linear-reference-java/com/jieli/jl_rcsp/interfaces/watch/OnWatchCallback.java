package com.jieli.jl_rcsp.interfaces.watch;

import android.bluetooth.BluetoothDevice;
import com.jieli.jl_rcsp.interfaces.rcsp.OnRcspCallback;
import com.jieli.jl_rcsp.model.base.BaseError;
import com.jieli.jl_rcsp.model.device.BatteryInfo;
import com.jieli.jl_rcsp.model.device.settings.v0.NetworkInfo;
import com.jieli.jl_rcsp.model.response.ExternalFlashMsgResponse;

/* JADX INFO: loaded from: classes17.dex */
public abstract class OnWatchCallback extends OnRcspCallback {
    public OnWatchCallback() {
    }

    public void onBigDataError(BluetoothDevice r1, BaseError r2) {
    }

    public void onCurrentWatchInfo(BluetoothDevice r1, String r2) {
    }

    public void onDevicePower(BluetoothDevice r1, BatteryInfo r2) {
    }

    public void onExternalFlashMsg(BluetoothDevice r1, ExternalFlashMsgResponse r2) {
    }

    public void onExternalFlashWriteFlag(BluetoothDevice r1, boolean r2) {
    }

    public void onNetworkModuleException(BluetoothDevice r1, NetworkInfo r2) {
    }

    public void onReceiveBigData(BluetoothDevice r1, int r2, byte[] r3) {
    }

    public void onResourceUpdateUnfinished(BluetoothDevice r1) {
    }

    public void onWatchSystemException(BluetoothDevice r1, int r2) {
    }

    public void onWatchSystemInit(int r1) {
    }
}
