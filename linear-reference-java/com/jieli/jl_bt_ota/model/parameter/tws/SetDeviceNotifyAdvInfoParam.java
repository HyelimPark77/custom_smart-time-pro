package com.jieli.jl_bt_ota.model.parameter.tws;

import com.jieli.jl_bt_ota.model.base.BaseParameter;

/* JADX INFO: loaded from: classes17.dex */
public class SetDeviceNotifyAdvInfoParam extends BaseParameter {
    private int op;

    public SetDeviceNotifyAdvInfoParam(int r1) {
        this.op = r1;
    }

    public int getOp() {
        return this.op;
    }

    @Override // com.jieli.jl_bt_ota.model.base.BaseParameter, com.jieli.jl_bt_ota.interfaces.command.IParamBase
    public byte[] getParamData() {
        return new byte[]{(byte) this.op};
    }

    public SetDeviceNotifyAdvInfoParam setOp(int r1) {
        this.op = r1;
        return this;
    }

    @Override // com.jieli.jl_bt_ota.model.base.BaseParameter
    public String toString() {
        return "SetDeviceNotifyAdvInfoParam{op=" + this.op + "} ";
    }
}
