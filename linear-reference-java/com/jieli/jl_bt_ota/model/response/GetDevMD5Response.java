package com.jieli.jl_bt_ota.model.response;

import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_bt_ota.model.base.CommonResponse;

/* JADX INFO: loaded from: classes17.dex */
public class GetDevMD5Response extends CommonResponse {
    private String md5;

    public GetDevMD5Response(String r1) {
        setMd5(r1);
    }

    public String getMd5() {
        return this.md5;
    }

    public void setMd5(String r1) {
        this.md5 = r1;
    }

    @Override // com.jieli.jl_bt_ota.model.base.CommonResponse
    public String toString() {
        return "GetDevMD5Response{md5='" + this.md5 + '\'' + i0XO1.IO;
    }
}
