package com.jieli.jl_bt_ota.model.response;

import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_bt_ota.model.base.CommonResponse;

/* JADX INFO: loaded from: classes17.dex */
public class EnterUpdateModeResponse extends CommonResponse {
    private int canUpdateFlag;

    public EnterUpdateModeResponse(int i) {
        this.canUpdateFlag = i;
    }

    public int getCanUpdateFlag() {
        return this.canUpdateFlag;
    }

    @Override // com.jieli.jl_bt_ota.model.base.CommonResponse
    public String toString() {
        return "EnterUpdateModeResponse{canUpdateFlag=" + this.canUpdateFlag + i0XO1.f7442IO;
    }
}
