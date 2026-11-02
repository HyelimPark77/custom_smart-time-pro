package com.jieli.jl_rcsp.model.parameter;

import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_rcsp.model.base.BaseParameter;

/* JADX INFO: loaded from: classes17.dex */
public class CustomCommonParam extends BaseParameter {
    private final int customOp;

    public CustomCommonParam(int r1) {
        this.customOp = r1;
    }

    public int getCustomOp() {
        return this.customOp;
    }

    @Override // com.jieli.jl_rcsp.model.base.BaseParameter, com.jieli.jl_rcsp.interfaces.cmd.IParamBase
    public byte[] getParamData() {
        return new byte[]{(byte) this.customOp};
    }

    @Override // com.jieli.jl_rcsp.model.base.BaseParameter
    public String toString() {
        return "CustomCommonParam{xmOpCode=" + getXmOpCode() + "\ncustomOp=" + this.customOp + i0XO1.IO;
    }
}
