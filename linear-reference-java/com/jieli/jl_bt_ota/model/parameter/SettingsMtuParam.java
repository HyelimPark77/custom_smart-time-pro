package com.jieli.jl_bt_ota.model.parameter;

import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_bt_ota.model.base.BaseParameter;
import com.jieli.jl_bt_ota.util.CHexConver;

/* JADX INFO: loaded from: classes17.dex */
public class SettingsMtuParam extends BaseParameter {
    private int mtu;

    public SettingsMtuParam(int r1) {
        this.mtu = r1;
    }

    public int getMtu() {
        return this.mtu;
    }

    @Override // com.jieli.jl_bt_ota.model.base.BaseParameter, com.jieli.jl_bt_ota.interfaces.command.IParamBase
    public byte[] getParamData() {
        return CHexConver.int2byte2(this.mtu);
    }

    public void setMtu(int r1) {
        this.mtu = r1;
    }

    @Override // com.jieli.jl_bt_ota.model.base.BaseParameter
    public String toString() {
        return "SettingsMtuParam{mtu=" + this.mtu + i0XO1.IO;
    }
}
