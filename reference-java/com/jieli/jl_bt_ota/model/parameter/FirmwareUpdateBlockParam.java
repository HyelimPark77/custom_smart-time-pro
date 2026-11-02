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
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(6);
        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
        byteBufferAllocate.put(CHexConver.intToBigBytes(this.nextUpdateBlockOffsetAddr));
        byteBufferAllocate.put(CHexConver.int2byte2(this.nextUpdateBlockLen));
        return byteBufferAllocate.array();
    }

    public FirmwareUpdateBlockParam setNextUpdateBlockLen(int i) {
        this.nextUpdateBlockLen = i;
        return this;
    }

    public FirmwareUpdateBlockParam setNextUpdateBlockOffsetAddr(int i) {
        this.nextUpdateBlockOffsetAddr = i;
        return this;
    }

    @Override // com.jieli.jl_bt_ota.model.base.BaseParameter
    public String toString() {
        return "FirmwareUpdateBlockParam{nextUpdateBlockOffsetAddr=" + this.nextUpdateBlockOffsetAddr + ", nextUpdateBlockLen=" + this.nextUpdateBlockLen + i0XO1.f7442IO;
    }

    public FirmwareUpdateBlockParam(int i, int i2) {
        setNextUpdateBlockOffsetAddr(i).setNextUpdateBlockLen(i2);
    }
}
