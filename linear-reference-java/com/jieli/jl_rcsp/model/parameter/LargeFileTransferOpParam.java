package com.jieli.jl_rcsp.model.parameter;

import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_rcsp.model.base.BaseParameter;
import com.jieli.jl_rcsp.util.CHexConver;

/* JADX INFO: loaded from: classes17.dex */
public class LargeFileTransferOpParam extends BaseParameter {
    private short buffer;
    private int offset;
    private byte op;

    public LargeFileTransferOpParam(byte r1, short r2, int r3) {
        this.buffer = r2;
        this.offset = r3;
        this.op = r1;
    }

    public short getBuffer() {
        return this.buffer;
    }

    public int getOffset() {
        return this.offset;
    }

    public byte getOp() {
        return this.op;
    }

    @Override // com.jieli.jl_rcsp.model.base.BaseParameter, com.jieli.jl_rcsp.interfaces.cmd.IParamBase
    public byte[] getParamData() {
        byte[] r0 = new byte[7];
        r0[0] = this.op;
        System.arraycopy(CHexConver.shortToBigBytes(this.buffer), 0, r0, 1, 2);
        System.arraycopy(CHexConver.intToBigBytes(this.offset), 0, r0, 3, 4);
        return r0;
    }

    public void setBuffer(short r1) {
        this.buffer = r1;
    }

    public void setOffset(int r1) {
        this.offset = r1;
    }

    public void setOp(byte r1) {
        this.op = r1;
    }

    @Override // com.jieli.jl_rcsp.model.base.BaseParameter
    public String toString() {
        return "LargeFileTransferOpParam{buffer=" + this.buffer + ", offset=" + this.offset + ", op=" + this.op + i0XO1.IO;
    }
}
