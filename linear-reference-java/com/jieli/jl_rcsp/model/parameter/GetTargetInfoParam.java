package com.jieli.jl_rcsp.model.parameter;

import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_rcsp.model.base.BaseParameter;
import com.jieli.jl_rcsp.util.CHexConver;

/* JADX INFO: loaded from: classes17.dex */
public class GetTargetInfoParam extends BaseParameter {
    private int mask;
    private byte platform;

    public GetTargetInfoParam(int r1) {
        this.mask = r1;
        setPlatform((byte) 0);
    }

    public int getMask() {
        return this.mask;
    }

    @Override // com.jieli.jl_rcsp.model.base.BaseParameter, com.jieli.jl_rcsp.interfaces.cmd.IParamBase
    public byte[] getParamData() {
        byte[] r0 = new byte[5];
        byte[] r1 = CHexConver.intToBigBytes(this.mask);
        System.arraycopy(r1, 0, r0, 0, r1.length);
        r0[4] = this.platform;
        return r0;
    }

    public byte getPlatform() {
        return this.platform;
    }

    public GetTargetInfoParam setMask(int r1) {
        this.mask = r1;
        return this;
    }

    public GetTargetInfoParam setPlatform(byte r1) {
        this.platform = r1;
        return this;
    }

    @Override // com.jieli.jl_rcsp.model.base.BaseParameter
    public String toString() {
        return "GetTargetInfoParam{mask=" + this.mask + i0XO1.IO;
    }
}
