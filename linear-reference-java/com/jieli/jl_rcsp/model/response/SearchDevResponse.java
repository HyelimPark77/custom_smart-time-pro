package com.jieli.jl_rcsp.model.response;

import com.jieli.jl_rcsp.model.base.CommonResponse;

/* JADX INFO: loaded from: classes17.dex */
public class SearchDevResponse extends CommonResponse {
    private int result;

    public SearchDevResponse(int r1) {
        this.result = r1;
    }

    public int getResult() {
        return this.result;
    }

    public SearchDevResponse setResult(int r1) {
        this.result = r1;
        return this;
    }

    @Override // com.jieli.jl_rcsp.model.base.CommonResponse
    public String toString() {
        return "SearchDevResponse{result=" + this.result + "} " + super.toString();
    }
}
