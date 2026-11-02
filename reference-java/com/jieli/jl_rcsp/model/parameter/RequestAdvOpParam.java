package com.jieli.jl_rcsp.model.parameter;

import com.jieli.jl_rcsp.model.base.BaseParameter;
import com.jieli.jl_rcsp.util.CHexConver;

/* JADX INFO: loaded from: classes17.dex */
public class RequestAdvOpParam extends BaseParameter {

    /* JADX INFO: renamed from: op */
    private int f38035op;

    public RequestAdvOpParam(int i) {
        this.f38035op = i;
    }

    public int getOp() {
        return this.f38035op;
    }

    @Override // com.jieli.jl_rcsp.model.base.BaseParameter, com.jieli.jl_rcsp.interfaces.cmd.IParamBase
    public byte[] getParamData() {
        return new byte[CHexConver.intToByte(this.f38035op)];
    }

    public RequestAdvOpParam setOp(int i) {
        this.f38035op = i;
        return this;
    }

    @Override // com.jieli.jl_rcsp.model.base.BaseParameter
    public String toString() {
        return "RequestAdvOpParam{op=" + this.f38035op + "} " + super.toString();
    }
}
