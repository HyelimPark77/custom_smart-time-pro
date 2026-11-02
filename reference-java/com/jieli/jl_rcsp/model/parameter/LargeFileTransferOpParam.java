package com.jieli.jl_rcsp.model.parameter;

import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_rcsp.model.base.BaseParameter;
import com.jieli.jl_rcsp.util.CHexConver;

/* JADX INFO: loaded from: classes17.dex */
public class LargeFileTransferOpParam extends BaseParameter {
    private short buffer;
    private int offset;

    /* JADX INFO: renamed from: op */
    private byte f38033op;

    public LargeFileTransferOpParam(byte b, short s, int i) {
        this.buffer = s;
        this.offset = i;
        this.f38033op = b;
    }

    public short getBuffer() {
        return this.buffer;
    }

    public int getOffset() {
        return this.offset;
    }

    public byte getOp() {
        return this.f38033op;
    }

    @Override // com.jieli.jl_rcsp.model.base.BaseParameter, com.jieli.jl_rcsp.interfaces.cmd.IParamBase
    public byte[] getParamData() {
        byte[] bArr = new byte[7];
        bArr[0] = this.f38033op;
        System.arraycopy(CHexConver.shortToBigBytes(this.buffer), 0, bArr, 1, 2);
        System.arraycopy(CHexConver.intToBigBytes(this.offset), 0, bArr, 3, 4);
        return bArr;
    }

    public void setBuffer(short s) {
        this.buffer = s;
    }

    public void setOffset(int i) {
        this.offset = i;
    }

    public void setOp(byte b) {
        this.f38033op = b;
    }

    @Override // com.jieli.jl_rcsp.model.base.BaseParameter
    public String toString() {
        return "LargeFileTransferOpParam{buffer=" + ((int) this.buffer) + ", offset=" + this.offset + ", op=" + ((int) this.f38033op) + i0XO1.f7442IO;
    }
}
