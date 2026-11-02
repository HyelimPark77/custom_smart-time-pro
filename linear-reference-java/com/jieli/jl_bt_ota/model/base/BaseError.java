package com.jieli.jl_bt_ota.model.base;

import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_bt_ota.util.CommonUtil;

/* JADX INFO: loaded from: classes17.dex */
public class BaseError {
    private int cmdSn;
    private final int code;
    private final String message;
    private int opCode;
    private final int subCode;

    public BaseError(int r1, String r2) {
        this(r1, r1, r2);
    }

    public int getCmdSn() {
        return this.cmdSn;
    }

    public int getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public int getOpCode() {
        return this.opCode;
    }

    public int getSubCode() {
        return this.subCode;
    }

    public BaseError setCmdSn(int r1) {
        this.cmdSn = r1;
        return this;
    }

    public BaseError setOpCode(int r1) {
        this.opCode = r1;
        return this;
    }

    public String toString() {
        return "BaseError{subCode=" + this.subCode + ", code=" + this.code + ", message='" + this.message + "', opCode=" + CommonUtil.formatInt(this.opCode) + ", cmdSn=" + CommonUtil.formatInt(this.cmdSn) + i0XO1.IO;
    }

    public BaseError(int r2, int r3, String r4) {
        this.opCode = -1;
        this.cmdSn = -1;
        this.code = r2;
        this.subCode = r3;
        this.message = r4;
    }
}
