package com.jieli.jl_bt_ota.model.response;

import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_bt_ota.model.base.CommonResponse;

/* JADX INFO: loaded from: classes17.dex */
public class RebootDeviceResponse extends CommonResponse {
    private int result;

    public RebootDeviceResponse(int i) {
        this.result = i;
    }

    public int getResult() {
        return this.result;
    }

    @Override // com.jieli.jl_bt_ota.model.base.CommonResponse
    public String toString() {
        return "RebootDeviceResponse{result=" + this.result + i0XO1.f7442IO;
    }
}
