package com.jieli.jl_rcsp.model.base;

import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_rcsp.util.CHexConver;

/* JADX INFO: loaded from: classes17.dex */
public class BasePacket {
    public static final int FALG_HAVE_RESPONSE = 1;
    public static final int FALG_NO_RESPONSE = 0;
    public static final int TYPE_COMMAND = 1;
    public static final int TYPE_RESPONSE = 0;
    private int hasResponse;
    private int opCode;
    private int opCodeSn;
    private byte[] paramData;
    private int paramLen;
    private int status;
    private int type;
    private int unused;
    private int xmOpCode;

    public BasePacket() {
        this.opCodeSn = -1;
        this.xmOpCode = -1;
    }

    public int getHasResponse() {
        return this.hasResponse;
    }

    public int getOpCode() {
        return this.opCode;
    }

    public int getOpCodeSn() {
        return this.opCodeSn;
    }

    public byte[] getParamData() {
        return this.paramData;
    }

    public int getParamLen() {
        return this.paramLen;
    }

    public int getStatus() {
        return this.status;
    }

    public int getType() {
        return this.type;
    }

    public int getUnused() {
        return this.unused;
    }

    public int getXmOpCode() {
        return this.xmOpCode;
    }

    public BasePacket setHasResponse(int r1) {
        this.hasResponse = r1;
        return this;
    }

    public BasePacket setOpCode(int r1) {
        this.opCode = r1;
        return this;
    }

    public BasePacket setOpCodeSn(int r1) {
        this.opCodeSn = r1;
        return this;
    }

    public BasePacket setParamData(byte[] r1) {
        this.paramData = r1;
        return this;
    }

    public BasePacket setParamLen(int r1) {
        this.paramLen = r1;
        return this;
    }

    public BasePacket setStatus(int r1) {
        this.status = r1;
        return this;
    }

    public BasePacket setType(int r1) {
        this.type = r1;
        return this;
    }

    public BasePacket setXmOpCode(int r1) {
        this.xmOpCode = r1;
        return this;
    }

    public String toString() {
        return "BasePacket{type=" + this.type + ", hasResponse=" + this.hasResponse + ", unused=" + this.unused + ", opCode=" + this.opCode + ", paramLen=" + this.paramLen + ", status=" + this.status + ", opCodeSn=" + this.opCodeSn + ", xmOpCode=" + this.xmOpCode + ", paramData=" + CHexConver.byte2HexStr(this.paramData) + i0XO1.IO;
    }
}
