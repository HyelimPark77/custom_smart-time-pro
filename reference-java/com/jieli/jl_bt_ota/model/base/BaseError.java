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

    public BaseError(int i, String str) {
        this(i, i, str);
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

    public BaseError setCmdSn(int i) {
        this.cmdSn = i;
        return this;
    }

    public BaseError setOpCode(int i) {
        this.opCode = i;
        return this;
    }

    public String toString() {
        return "BaseError{subCode=" + this.subCode + ", code=" + this.code + ", message='" + this.message + "', opCode=" + CommonUtil.formatInt(this.opCode) + ", cmdSn=" + CommonUtil.formatInt(this.cmdSn) + i0XO1.f7442IO;
    }

    public BaseError(int i, int i2, String str) {
        this.opCode = -1;
        this.cmdSn = -1;
        this.code = i;
        this.subCode = i2;
        this.message = str;
    }
}
