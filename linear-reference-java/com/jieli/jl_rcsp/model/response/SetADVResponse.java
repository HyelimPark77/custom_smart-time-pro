package com.jieli.jl_rcsp.model.response;

import com.jieli.jl_rcsp.model.base.CommonResponse;

/* JADX INFO: loaded from: classes17.dex */
public class SetADVResponse extends CommonResponse {
    private int result;

    public SetADVResponse() {
    }

    public int getResult() {
        return this.result;
    }

    public SetADVResponse setResult(int r1) {
        this.result = r1;
        return this;
    }

    @Override // com.jieli.jl_rcsp.model.base.CommonResponse
    public String toString() {
        return "SetADVResponse{result=" + this.result + "} " + super.toString();
    }

    public SetADVResponse(int r1) {
        setResult(r1);
    }
}
