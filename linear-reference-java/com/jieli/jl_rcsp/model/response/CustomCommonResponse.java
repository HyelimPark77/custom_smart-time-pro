package com.jieli.jl_rcsp.model.response;

import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_rcsp.model.base.CommonResponse;
import com.jieli.jl_rcsp.util.CHexConver;

/* JADX INFO: loaded from: classes17.dex */
public class CustomCommonResponse extends CommonResponse {
    private int jlOpCode;

    public CustomCommonResponse() {
    }

    public int getJlOpCode() {
        return this.jlOpCode;
    }

    public CustomCommonResponse setJlOpCode(int r1) {
        this.jlOpCode = r1;
        return this;
    }

    @Override // com.jieli.jl_rcsp.model.base.CommonResponse
    public String toString() {
        return "CustomCommonResponse{rawData=" + CHexConver.byte2HexStr(getRawData()) + "\nxmOpCode=" + getXmOpCode() + "\njlOpCode=" + this.jlOpCode + i0XO1.IO;
    }
}
