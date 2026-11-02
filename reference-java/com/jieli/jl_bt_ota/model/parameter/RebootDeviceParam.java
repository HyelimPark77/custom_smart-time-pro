package com.jieli.jl_bt_ota.model.parameter;

import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_bt_ota.model.base.BaseParameter;

/* JADX INFO: loaded from: classes17.dex */
public class RebootDeviceParam extends BaseParameter {
    private int param;

    public RebootDeviceParam(int i) {
        this.param = i;
    }

    @Override // com.jieli.jl_bt_ota.model.base.BaseParameter, com.jieli.jl_bt_ota.interfaces.command.IParamBase
    public byte[] getParamData() {
        return new byte[]{(byte) this.param};
    }

    @Override // com.jieli.jl_bt_ota.model.base.BaseParameter
    public String toString() {
        return "RebootDeviceParam{param=" + this.param + i0XO1.f7442IO;
    }
}
