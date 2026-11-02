package com.jieli.jl_bt_ota.model.response;

import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_bt_ota.model.base.CommonResponse;

/* JADX INFO: loaded from: classes17.dex */
public class NotifyCommunicationWayResponse extends CommonResponse {
    private int flag;

    public NotifyCommunicationWayResponse() {
    }

    public int getFlag() {
        return this.flag;
    }

    public void setFlag(int r1) {
        this.flag = r1;
    }

    @Override // com.jieli.jl_bt_ota.model.base.CommonResponse
    public String toString() {
        return "NotifyCommunicationWayResponse{flag=" + this.flag + i0XO1.IO;
    }
}
