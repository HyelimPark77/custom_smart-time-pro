package com.jieli.jl_rcsp.model.response;

import com.jieli.jl_rcsp.model.base.CommonResponse;

/* JADX INFO: loaded from: classes17.dex */
public class StopFileTransferResponse extends CommonResponse {
    private int reason;

    public StopFileTransferResponse() {
        this.reason = 0;
    }

    public int getReason() {
        return this.reason;
    }

    public StopFileTransferResponse setReason(int r1) {
        this.reason = r1;
        return this;
    }
}
