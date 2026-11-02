package com.jieli.jl_rcsp.interfaces.setting;

import android.bluetooth.BluetoothDevice;
import com.jieli.jl_rcsp.model.device.settings.SettingData;
import com.jieli.jl_rcsp.model.device.settings.v0.SettingFunction;

/* JADX INFO: loaded from: classes17.dex */
public interface OnSettingFunctionListener {
    void onSettingData(BluetoothDevice r1, SettingData r2);

    void onSettingFunction(BluetoothDevice r1, SettingFunction r2);
}
