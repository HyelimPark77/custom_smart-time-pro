package com.jieli.jl_bt_ota.interfaces.rcsp;

import com.jieli.jl_bt_ota.interfaces.CommandCallback;
import com.jieli.jl_bt_ota.interfaces.IActionCallback;
import com.jieli.jl_bt_ota.model.FileOffset;
import com.jieli.jl_bt_ota.model.base.BaseParameter;
import com.jieli.jl_bt_ota.model.base.CommandBase;
import com.jieli.jl_bt_ota.model.base.CommonResponse;

/* JADX INFO: loaded from: classes17.dex */
public interface IRcspOTA {
    void changeCommunicationWay(int r1, int r2, IActionCallback<Integer> r3);

    void enterUpdateMode(IActionCallback<Integer> r1);

    void exitUpdateMode(IActionCallback<Integer> r1);

    void inquiryDeviceCanOTA(byte[] r1, IActionCallback<Integer> r2);

    void queryUpdateResult(IActionCallback<Integer> r1);

    void readUpgradeFileFlag(IActionCallback<FileOffset> r1);

    void rebootDevice(IActionCallback<Boolean> r1);

    <T extends CommandBase<? extends BaseParameter, ? extends CommonResponse>> void sendCommandResponse(T r1);

    <T extends CommandBase<? extends BaseParameter, ? extends CommonResponse>> void sendCommandResponse(T r1, CommandCallback<T> r2);

    void stopADVInfo(IActionCallback<Boolean> r1);
}
