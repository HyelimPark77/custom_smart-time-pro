package com.jieli.jl_bt_ota.model.parameter.tws;

import com.jieli.jl_bt_ota.model.base.BaseParameter;
import com.jieli.jl_bt_ota.util.CHexConver;

/* JADX INFO: loaded from: classes17.dex */
public class RequestAdvOpParam extends BaseParameter {

    /* JADX INFO: renamed from: op */
    private int f37613op;

    public RequestAdvOpParam(int i) {
        this.f37613op = i;
    }

    public int getOp() {
        return this.f37613op;
    }

    @Override // com.jieli.jl_bt_ota.model.base.BaseParameter, com.jieli.jl_bt_ota.interfaces.command.IParamBase
    public byte[] getParamData() {
        return new byte[CHexConver.intToByte(this.f37613op)];
    }

    public RequestAdvOpParam setOp(int i) {
        this.f37613op = i;
        return this;
    }

    @Override // com.jieli.jl_bt_ota.model.base.BaseParameter
    public String toString() {
        return "RequestAdvOpParam{op=" + this.f37613op + "} ";
    }
}
