package com.jieli.jl_rcsp.model.response;

import com.jieli.jl_rcsp.model.base.CommonResponse;

/* JADX INFO: loaded from: classes17.dex */
public class NotifyPhoneNumberPlayModeResponse extends CommonResponse {
    private int reason;

    public NotifyPhoneNumberPlayModeResponse() {
        this.reason = -1;
    }

    public int getReason() {
        return this.reason;
    }

    public NotifyPhoneNumberPlayModeResponse setReason(int r1) {
        this.reason = r1;
        return this;
    }

    @Override // com.jieli.jl_rcsp.model.base.CommonResponse
    public String toString() {
        return "NotifyPhoneNumberPlayModeResponse{reason=" + this.reason + "} " + super.toString();
    }

    public NotifyPhoneNumberPlayModeResponse(int r2) {
        this.reason = -1;
        setReason(r2);
    }
}
