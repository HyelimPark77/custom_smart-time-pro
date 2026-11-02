package com.jieli.jl_rcsp.model.base;

import com.android.mltcode.paycertificationapi.i0XO1;

/* JADX INFO: loaded from: classes17.dex */
public class CommonResponse extends BaseResponse {
    private int xmOpCode;

    public CommonResponse() {
        this.xmOpCode = -1;
    }

    public int getXmOpCode() {
        return this.xmOpCode;
    }

    public void setXmOpCode(int r1) {
        this.xmOpCode = r1;
    }

    public String toString() {
        return "CommonResponse{xmOpCode=" + this.xmOpCode + i0XO1.IO;
    }
}
