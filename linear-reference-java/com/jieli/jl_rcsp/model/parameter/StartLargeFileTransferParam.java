package com.jieli.jl_rcsp.model.parameter;

import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_rcsp.model.base.BaseParameter;
import com.jieli.jl_rcsp.util.CHexConver;

/* JADX INFO: loaded from: classes17.dex */
public class StartLargeFileTransferParam extends BaseParameter {
    public short crc16;
    public byte[] hash;
    public int size;

    public StartLargeFileTransferParam(byte[] r1, int r2, short r3) {
        this.hash = r1;
        this.size = r2;
        this.crc16 = r3;
    }

    @Override // com.jieli.jl_rcsp.model.base.BaseParameter, com.jieli.jl_rcsp.interfaces.cmd.IParamBase
    public byte[] getParamData() {
        byte[] r0 = new byte[this.hash.length + 6];
        System.arraycopy(CHexConver.intToBigBytes(this.size), 0, r0, 0, 4);
        System.arraycopy(CHexConver.shortToBigBytes(this.crc16), 0, r0, 4, 2);
        byte[] r2 = this.hash;
        System.arraycopy(r2, 0, r0, 6, r2.length);
        return r0;
    }

    public int getSize() {
        return this.size;
    }

    public StartLargeFileTransferParam setSize(int r1) {
        this.size = r1;
        return this;
    }

    @Override // com.jieli.jl_rcsp.model.base.BaseParameter
    public String toString() {
        return "StartLargeFileTransferParam{, hash='" + CHexConver.byte2HexStr(this.hash) + "', size=" + this.size + ", crc16=" + this.crc16 + i0XO1.IO + "\n" + super.toString();
    }
}
