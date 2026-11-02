package com.jieli.jl_bt_ota.model.response;

import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_bt_ota.model.base.CommonResponse;

/* JADX INFO: loaded from: classes17.dex */
public class SettingsMtuResponse extends CommonResponse {
    private int realMtu;

    public SettingsMtuResponse(int i) {
        this.realMtu = i;
    }

    public int getRealMtu() {
        return this.realMtu;
    }

    public SettingsMtuResponse setRealMtu(int i) {
        this.realMtu = i;
        return this;
    }

    @Override // com.jieli.jl_bt_ota.model.base.CommonResponse
    public String toString() {
        return "SettingsMtuResponse{realMtu=" + this.realMtu + i0XO1.f7442IO;
    }
}
