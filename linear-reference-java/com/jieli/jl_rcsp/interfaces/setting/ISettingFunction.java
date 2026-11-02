package com.jieli.jl_rcsp.interfaces.setting;

import android.bluetooth.BluetoothDevice;
import com.jieli.jl_rcsp.interfaces.OnOperationCallback;
import com.jieli.jl_rcsp.model.command.setting.PublicSettingsCmd;

/* JADX INFO: loaded from: classes17.dex */
public interface ISettingFunction {
    void addOnSettingFunctionListener(OnSettingFunctionListener r1);

    void removeOnSettingFunctionListener(OnSettingFunctionListener r1);

    void settingFunction(BluetoothDevice r1, PublicSettingsCmd.Param r2, OnOperationCallback<PublicSettingsCmd.Response> r3);
}
