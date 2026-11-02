package com.jieli.jl_bt_ota.model.response;

import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_bt_ota.model.base.CommonResponse;

/* JADX INFO: loaded from: classes17.dex */
public class NotifyCommunicationWayResponse extends CommonResponse {
    private int flag;

    public int getFlag() {
        return this.flag;
    }

    public void setFlag(int i) {
        this.flag = i;
    }

    @Override // com.jieli.jl_bt_ota.model.base.CommonResponse
    public String toString() {
        return "NotifyCommunicationWayResponse{flag=" + this.flag + i0XO1.f7442IO;
    }
}
