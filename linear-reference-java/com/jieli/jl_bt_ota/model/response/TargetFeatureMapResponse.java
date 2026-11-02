package com.jieli.jl_bt_ota.model.response;

import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_bt_ota.model.base.CommonResponse;

/* JADX INFO: loaded from: classes17.dex */
public class TargetFeatureMapResponse extends CommonResponse {
    private int mask;

    public TargetFeatureMapResponse() {
        this(0);
    }

    public int getMask() {
        return this.mask;
    }

    public void setMask(int r1) {
        this.mask = r1;
    }

    @Override // com.jieli.jl_bt_ota.model.base.CommonResponse
    public String toString() {
        return "TargetFeatureMapResponse{mask=" + this.mask + i0XO1.IO;
    }

    public TargetFeatureMapResponse(int r1) {
        setMask(r1);
    }
}
