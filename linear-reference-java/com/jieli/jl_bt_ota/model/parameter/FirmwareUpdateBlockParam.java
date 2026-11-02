package com.jieli.jl_bt_ota.model.parameter;

import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_bt_ota.model.base.BaseParameter;
import com.jieli.jl_bt_ota.util.CHexConver;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes17.dex */
public class FirmwareUpdateBlockParam extends BaseParameter {
    private int nextUpdateBlockLen;
    private int nextUpdateBlockOffsetAddr;

    public FirmwareUpdateBlockParam() {
    }

    public int getNextUpdateBlockLen() {
        return this.nextUpdateBlockLen;
    }

    public int getNextUpdateBlockOffsetAddr() {
        return this.nextUpdateBlockOffsetAddr;
    }

    @Override // com.jieli.jl_bt_ota.model.base.BaseParameter, com.jieli.jl_bt_ota.interfaces.command.IParamBase
    public byte[] getParamData() {
        ByteBuffer r0 = ByteBuffer.allocate(6);
        r0.order(ByteOrder.BIG_ENDIAN);
        r0.put(CHexConver.intToBigBytes(this.nextUpdateBlockOffsetAddr));
        r0.put(CHexConver.int2byte2(this.nextUpdateBlockLen));
        return r0.array();
    }

    public FirmwareUpdateBlockParam setNextUpdateBlockLen(int r1) {
        this.nextUpdateBlockLen = r1;
        return this;
    }

    public FirmwareUpdateBlockParam setNextUpdateBlockOffsetAddr(int r1) {
        this.nextUpdateBlockOffsetAddr = r1;
        return this;
    }

    @Override // com.jieli.jl_bt_ota.model.base.BaseParameter
    public String toString() {
        return "FirmwareUpdateBlockParam{nextUpdateBlockOffsetAddr=" + this.nextUpdateBlockOffsetAddr + ", nextUpdateBlockLen=" + this.nextUpdateBlockLen + i0XO1.IO;
    }

    public FirmwareUpdateBlockParam(int r1, int r2) {
        setNextUpdateBlockOffsetAddr(r1).setNextUpdateBlockLen(r2);
    }
}
