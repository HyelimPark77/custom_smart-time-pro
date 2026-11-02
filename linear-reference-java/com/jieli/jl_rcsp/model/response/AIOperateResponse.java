package com.jieli.jl_rcsp.model.response;

import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_rcsp.model.base.CommonResponse;
import com.jieli.jl_rcsp.util.CHexConver;

/* JADX INFO: loaded from: classes17.dex */
public class AIOperateResponse extends CommonResponse {
    private byte[] data;
    private int result;

    public AIOperateResponse(int r1) {
        setResult(r1);
    }

    public byte[] getData() {
        return this.data;
    }

    public int getResult() {
        return this.result;
    }

    public AIOperateResponse setData(byte[] r1) {
        this.data = r1;
        return this;
    }

    public AIOperateResponse setResult(int r1) {
        this.result = r1;
        return this;
    }

    @Override // com.jieli.jl_rcsp.model.base.CommonResponse
    public String toString() {
        return "AIOperateResponse{result=" + this.result + ", data=" + CHexConver.byte2HexStr(this.data) + i0XO1.IO;
    }
}
