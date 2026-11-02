package com.jieli.jl_bt_ota.model.response;

import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_bt_ota.model.base.CommonResponse;

/* JADX INFO: loaded from: classes17.dex */
public class GetDevMD5Response extends CommonResponse {
    private String md5;

    public GetDevMD5Response(String str) {
        setMd5(str);
    }

    public String getMd5() {
        return this.md5;
    }

    public void setMd5(String str) {
        this.md5 = str;
    }

    @Override // com.jieli.jl_bt_ota.model.base.CommonResponse
    public String toString() {
        return "GetDevMD5Response{md5='" + this.md5 + '\'' + i0XO1.f7442IO;
    }
}
