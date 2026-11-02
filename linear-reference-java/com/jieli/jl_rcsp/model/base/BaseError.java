package com.jieli.jl_rcsp.model.base;

import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_rcsp.constant.RcspErrorCode;

/* JADX INFO: loaded from: classes17.dex */
public class BaseError {
    private int code;
    private String message;
    private int opCode;
    private int subCode;

    public BaseError() {
        this(0, 0, "");
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

    public BaseError setCode(int r1) {
        this.code = r1;
        return this;
    }

    public BaseError setMessage(String r1) {
        this.message = r1;
        return this;
    }

    public BaseError setOpCode(int r1) {
        this.opCode = r1;
        return this;
    }

    public BaseError setSubCode(int r1) {
        this.subCode = r1;
        return this;
    }

    public String toString() {
        return "BaseError{code=" + this.code + ", subCode=" + this.subCode + ", opCode=" + this.opCode + ", message='" + this.message + '\'' + i0XO1.IO;
    }

    public BaseError(int r2) {
        this(r2, RcspErrorCode.getErrorDesc(r2));
    }

    public BaseError(int r2, String r3) {
        this(0, r2, r3);
    }

    public BaseError(int r1, int r2, String r3) {
        this.code = r1;
        this.subCode = r2;
        this.message = r3;
    }
}
