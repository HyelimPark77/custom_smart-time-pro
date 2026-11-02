package com.jieli.jl_bt_ota.model.response;

import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_bt_ota.model.base.CommonResponse;
import com.jieli.jl_bt_ota.util.CHexConver;

/* JADX INFO: loaded from: classes17.dex */
public class CustomResponse extends CommonResponse {
    private byte[] data;

    public CustomResponse(byte[] r1) {
        this.data = r1;
    }

    public byte[] getData() {
        return this.data;
    }

    public CustomResponse setData(byte[] r1) {
        this.data = r1;
        return this;
    }

    @Override // com.jieli.jl_bt_ota.model.base.CommonResponse
    public String toString() {
        return "CustomResponse{data=" + CHexConver.byte2HexStr(this.data) + i0XO1.IO;
    }

    public CustomResponse() {
        this(new byte[0]);
    }
}
