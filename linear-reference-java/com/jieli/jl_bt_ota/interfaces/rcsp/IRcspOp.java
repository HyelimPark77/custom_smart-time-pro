package com.jieli.jl_bt_ota.interfaces.rcsp;

import android.bluetooth.BluetoothDevice;
import com.jieli.jl_bt_ota.interfaces.CommandCallback;
import com.jieli.jl_bt_ota.model.BluetoothOTAConfigure;
import com.jieli.jl_bt_ota.model.base.BaseParameter;
import com.jieli.jl_bt_ota.model.base.CommandBase;
import com.jieli.jl_bt_ota.model.base.CommonResponse;
import com.jieli.jl_bt_ota.model.response.TargetInfoResponse;

/* JADX INFO: loaded from: classes17.dex */
public interface IRcspOp {
    void configure(BluetoothOTAConfigure r1);

    BluetoothOTAConfigure getBluetoothOption();

    TargetInfoResponse getDeviceInfo(BluetoothDevice r1);

    BluetoothDevice getTargetDevice();

    void registerOnRcspCallback(OnRcspCallback r1);

    void release();

    <T extends CommandBase<? extends BaseParameter, ? extends CommonResponse>> void sendCommandAsync(BluetoothDevice r1, T r2, int r3, CommandCallback<T> r4);

    <T extends CommandBase<? extends BaseParameter, ? extends CommonResponse>> void sendCommandResponse(BluetoothDevice r1, T r2, CommandCallback<T> r3);

    void unregisterOnRcspCallback(OnRcspCallback r1);
}
