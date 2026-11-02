package com.jieli.jl_bt_ota.interfaces;

import com.jieli.jl_bt_ota.model.BluetoothOTAConfigure;
import com.jieli.jl_bt_ota.model.response.TargetInfoResponse;

/* JADX INFO: loaded from: classes17.dex */
public interface IUpgradeManager {
    void cancelOTA();

    void configure(BluetoothOTAConfigure r1);

    BluetoothOTAConfigure getBluetoothOption();

    TargetInfoResponse getDeviceInfo();

    void queryMandatoryUpdate(IActionCallback<TargetInfoResponse> r1);

    void release();

    void startOTA(IUpgradeCallback r1);
}
