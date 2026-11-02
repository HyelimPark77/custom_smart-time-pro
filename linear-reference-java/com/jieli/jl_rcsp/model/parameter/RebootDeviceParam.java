package com.jieli.jl_rcsp.model.parameter;

import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_rcsp.model.base.BaseParameter;

/* JADX INFO: loaded from: classes17.dex */
public class RebootDeviceParam extends BaseParameter {
    private final int flag;

    public RebootDeviceParam(int r1) {
        this.flag = r1;
    }

    public int getFlag() {
        return this.flag;
    }

    @Override // com.jieli.jl_rcsp.model.base.BaseParameter, com.jieli.jl_rcsp.interfaces.cmd.IParamBase
    public byte[] getParamData() {
        return new byte[]{(byte) this.flag};
    }

    @Override // com.jieli.jl_rcsp.model.base.BaseParameter
    public String toString() {
        return "RebootDeviceParam{flag=" + this.flag + i0XO1.IO;
    }
}
