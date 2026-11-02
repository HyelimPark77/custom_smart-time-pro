package com.jieli.jl_bt_ota.model.response;

import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_bt_ota.model.base.CommonResponse;

/* JADX INFO: loaded from: classes17.dex */
public class InquireUpdateResponse extends CommonResponse {
    private int canUpdateFlag;

    public InquireUpdateResponse(int r1) {
        this.canUpdateFlag = r1;
    }

    public int getCanUpdateFlag() {
        return this.canUpdateFlag;
    }

    @Override // com.jieli.jl_bt_ota.model.base.CommonResponse
    public String toString() {
        return "InquireUpdateResponse{canUpdateFlag=" + this.canUpdateFlag + i0XO1.IO;
    }
}
