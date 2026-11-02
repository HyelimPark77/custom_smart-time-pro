package com.jieli.jl_bt_ota.model.response;

import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_bt_ota.model.base.CommonResponse;

/* JADX INFO: loaded from: classes17.dex */
public class SetDeviceNotifyAdvInfoResponse extends CommonResponse {
    private int result;

    public SetDeviceNotifyAdvInfoResponse(int r1) {
        this.result = r1;
    }

    public int getResult() {
        return this.result;
    }

    public SetDeviceNotifyAdvInfoResponse setResult(int r1) {
        this.result = r1;
        return this;
    }

    @Override // com.jieli.jl_bt_ota.model.base.CommonResponse
    public String toString() {
        return "SetDeviceNotifyAdvInfoResponse{result=" + this.result + i0XO1.IO;
    }
}
