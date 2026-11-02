package com.jieli.jl_bt_ota.model.base;

import com.android.mltcode.paycertificationapi.i0XO1;

/* JADX INFO: loaded from: classes17.dex */
public class CommonResponse extends BaseResponse {
    private int xmOpCode = -1;

    public int getXmOpCode() {
        return this.xmOpCode;
    }

    public CommonResponse setXmOpCode(int i) {
        this.xmOpCode = i;
        return this;
    }

    public String toString() {
        return "CommonResponse{xmOpCode=" + this.xmOpCode + i0XO1.f7442IO;
    }
}
