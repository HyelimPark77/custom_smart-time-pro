package com.jieli.jl_rcsp.model.base;

import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_rcsp.interfaces.cmd.IParamBase;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes17.dex */
public class BaseParameter implements IParamBase {
    private byte[] paramData;
    private int xmOpCode;

    public BaseParameter() {
        this.xmOpCode = -1;
    }

    @Override // com.jieli.jl_rcsp.interfaces.cmd.IParamBase
    public byte[] getParamData() {
        ByteArrayOutputStream r0 = new ByteArrayOutputStream();
        int r1 = this.xmOpCode;
        if (r1 == (-1)) goto L5;
        r0.write(r1);
    L5:
        byte[] r2 = this.paramData;
        if (r2 == null) goto L14;
        if (r2.length <= 0) goto L14;
        r0.write(r2);     // Catch: IOException -> L11
    L11:
        e = move-exception;
        e.printStackTrace();
    L14:
        return r0.toByteArray();
    }

    public byte[] getPayload() {
        return this.paramData;
    }

    public int getXmOpCode() {
        return this.xmOpCode;
    }

    public BaseParameter setParamData(byte[] r1) {
        this.paramData = r1;
        return this;
    }

    public BaseParameter setXmOpCode(int r1) {
        this.xmOpCode = r1;
        return this;
    }

    public String toString() {
        return "BaseParameter{xmOpCode=" + this.xmOpCode + i0XO1.IO;
    }
}
