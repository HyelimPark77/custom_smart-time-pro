package com.jieli.jl_rcsp.model.parameter;

import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_rcsp.model.base.BaseParameter;
import com.jieli.jl_rcsp.util.CHexConver;

/* JADX INFO: loaded from: classes17.dex */
public class CustomParam extends BaseParameter {
    private byte[] data;

    public CustomParam(byte[] r1) {
        this.data = r1;
    }

    public byte[] getData() {
        return this.data;
    }

    @Override // com.jieli.jl_rcsp.model.base.BaseParameter, com.jieli.jl_rcsp.interfaces.cmd.IParamBase
    public byte[] getParamData() {
        byte[] r0 = this.data;
        if (r0 == null) goto L5;
        return r0;
    L5:
        return new byte[0];
    }

    public CustomParam setData(byte[] r1) {
        this.data = r1;
        return this;
    }

    @Override // com.jieli.jl_rcsp.model.base.BaseParameter
    public String toString() {
        return "CustomParam{data=" + CHexConver.byte2HexStr(this.data) + i0XO1.IO;
    }

    public CustomParam() {
    }
}
