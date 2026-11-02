package com.jieli.jl_bt_ota.model.response;

import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_bt_ota.model.base.CommonResponse;

/* JADX INFO: loaded from: classes17.dex */
public class ExitUpdateModeResponse extends CommonResponse {
    private int result;

    public ExitUpdateModeResponse(int r1) {
        this.result = r1;
    }

    public int getResult() {
        return this.result;
    }

    @Override // com.jieli.jl_bt_ota.model.base.CommonResponse
    public String toString() {
        return "ExitUpdateModeResponse{result=" + this.result + i0XO1.IO;
    }
}
