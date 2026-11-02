package com.jieli.jl_rcsp.model.parameter;

import com.jieli.jl_rcsp.model.base.BaseParameter;

/* JADX INFO: loaded from: classes17.dex */
public class SetDeviceNotifyAdvInfoParam extends BaseParameter {

    /* JADX INFO: renamed from: op */
    private int f38037op;

    public SetDeviceNotifyAdvInfoParam(int i) {
        this.f38037op = i;
    }

    public int getOp() {
        return this.f38037op;
    }

    @Override // com.jieli.jl_rcsp.model.base.BaseParameter, com.jieli.jl_rcsp.interfaces.cmd.IParamBase
    public byte[] getParamData() {
        return new byte[]{(byte) this.f38037op};
    }

    public SetDeviceNotifyAdvInfoParam setOp(int i) {
        this.f38037op = i;
        return this;
    }

    @Override // com.jieli.jl_rcsp.model.base.BaseParameter
    public String toString() {
        return "SetDeviceNotifyAdvInfoParam{op=" + this.f38037op + "} " + super.toString();
    }
}
