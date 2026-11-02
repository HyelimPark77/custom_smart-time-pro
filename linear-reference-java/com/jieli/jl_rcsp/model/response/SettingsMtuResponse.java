package com.jieli.jl_rcsp.model.response;

import com.jieli.jl_rcsp.model.base.CommonResponse;

/* JADX INFO: loaded from: classes17.dex */
public class SettingsMtuResponse extends CommonResponse {
    private int realMtu;

    public SettingsMtuResponse(int r1) {
        this.realMtu = r1;
    }

    public int getRealMtu() {
        return this.realMtu;
    }

    public SettingsMtuResponse setRealMtu(int r1) {
        this.realMtu = r1;
        return this;
    }
}
