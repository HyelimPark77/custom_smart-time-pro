package com.jieli.jl_rcsp.model.response;

import com.jieli.jl_rcsp.model.base.CommonResponse;
import com.jieli.jl_rcsp.util.RcspUtil;

/* JADX INFO: loaded from: classes17.dex */
public class GetLowLatencySettingsResponse extends CommonResponse {
    private int delayMs;
    private int mtu;

    public GetLowLatencySettingsResponse() {
        this(20);
    }

    public int getDelayMs() {
        return this.delayMs;
    }

    public int getMtu() {
        return this.mtu;
    }

    public GetLowLatencySettingsResponse setDelayMs(int r1) {
        this.delayMs = r1;
        return this;
    }

    public GetLowLatencySettingsResponse setMtu(int r1) {
        this.mtu = RcspUtil.formatBleMtu(r1);
        return this;
    }

    @Override // com.jieli.jl_rcsp.model.base.CommonResponse
    public String toString() {
        return "GetLowLatencySettingsResponse{mtu=" + this.mtu + ", delayMs=" + this.delayMs + "} " + super.toString();
    }

    public GetLowLatencySettingsResponse(int r2) {
        this(r2, 50);
    }

    public GetLowLatencySettingsResponse(int r2, int r3) {
        this.mtu = 20;
        this.delayMs = 50;
        setMtu(r2);
        setDelayMs(r3);
    }
}
