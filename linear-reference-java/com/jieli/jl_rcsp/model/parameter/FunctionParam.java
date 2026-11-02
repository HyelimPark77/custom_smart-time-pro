package com.jieli.jl_rcsp.model.parameter;

import com.jieli.jl_rcsp.model.base.BaseParameter;

/* JADX INFO: loaded from: classes17.dex */
public class FunctionParam extends BaseParameter {
    private byte cmd;
    private byte[] extend;
    private byte function;

    public FunctionParam(byte r1, byte r2) {
        this.function = r1;
        this.cmd = r2;
    }

    public byte getCmd() {
        return this.cmd;
    }

    public byte[] getExtend() {
        return this.extend;
    }

    public byte getFunction() {
        return this.function;
    }

    @Override // com.jieli.jl_rcsp.model.base.BaseParameter, com.jieli.jl_rcsp.interfaces.cmd.IParamBase
    public byte[] getParamData() {
        byte[] r0 = this.extend;
        if (r0 == null) goto L10;
        if (r0.length == 0) goto L10;
        byte[] r4 = new byte[r0.length + 2];
        r4[0] = this.function;
        r4[1] = this.cmd;
        System.arraycopy(r0, 0, r4, 2, r0.length);
        return r4;
    L10:
        return new byte[]{this.function, this.cmd};
    }

    public FunctionParam setCmd(byte r1) {
        this.cmd = r1;
        return this;
    }

    public FunctionParam setExtend(byte[] r1) {
        this.extend = r1;
        return this;
    }

    public FunctionParam setFunction(byte r1) {
        this.function = r1;
        return this;
    }

    public FunctionParam() {
    }
}
