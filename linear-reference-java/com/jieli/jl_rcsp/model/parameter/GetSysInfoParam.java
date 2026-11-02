package com.jieli.jl_rcsp.model.parameter;

import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_rcsp.model.base.BaseParameter;
import com.jieli.jl_rcsp.util.CHexConver;

/* JADX INFO: loaded from: classes17.dex */
public class GetSysInfoParam extends BaseParameter {
    private byte function;
    private int mask;

    public GetSysInfoParam(byte r1, int r2) {
        this.mask = r2;
        this.function = r1;
    }

    public byte getFunction() {
        return this.function;
    }

    public int getMask() {
        return this.mask;
    }

    @Override // com.jieli.jl_rcsp.model.base.BaseParameter, com.jieli.jl_rcsp.interfaces.cmd.IParamBase
    public byte[] getParamData() {
        byte[] r0 = new byte[5];
        r0[0] = this.function;
        System.arraycopy(CHexConver.intToBigBytes(this.mask), 0, r0, 1, 4);
        return r0;
    }

    public GetSysInfoParam setFunction(byte r1) {
        this.function = r1;
        return this;
    }

    public GetSysInfoParam setMask(int r1) {
        this.mask = r1;
        return this;
    }

    @Override // com.jieli.jl_rcsp.model.base.BaseParameter
    public String toString() {
        return "GetSysInfoParam{function=" + this.function + "mask=" + this.mask + i0XO1.IO;
    }
}
