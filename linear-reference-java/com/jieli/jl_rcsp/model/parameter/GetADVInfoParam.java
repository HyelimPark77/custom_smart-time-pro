package com.jieli.jl_rcsp.model.parameter;

import com.jieli.jl_rcsp.model.base.BaseParameter;
import com.jieli.jl_rcsp.util.CHexConver;

/* JADX INFO: loaded from: classes17.dex */
public class GetADVInfoParam extends BaseParameter {
    private int mask;

    public GetADVInfoParam(int r1) {
        this.mask = r1;
    }

    public int getMask() {
        return this.mask;
    }

    @Override // com.jieli.jl_rcsp.model.base.BaseParameter, com.jieli.jl_rcsp.interfaces.cmd.IParamBase
    public byte[] getParamData() {
        return CHexConver.intToBigBytes(this.mask);
    }

    public GetADVInfoParam setMask(int r1) {
        this.mask = r1;
        return this;
    }

    @Override // com.jieli.jl_rcsp.model.base.BaseParameter
    public String toString() {
        return "GetADVInfoParam{mask=" + this.mask + "} " + super.toString();
    }
}
