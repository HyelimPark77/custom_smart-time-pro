package com.jieli.jl_rcsp.model.response;

import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_rcsp.model.base.CommonResponse;

/* JADX INFO: loaded from: classes17.dex */
public class ExitUpdateModeResponse extends CommonResponse {
    private final int result;

    public ExitUpdateModeResponse(int i) {
        this.result = i;
    }

    public int getResult() {
        return this.result;
    }

    @Override // com.jieli.jl_rcsp.model.base.CommonResponse
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ExitUpdateModeResponse{rawData size =");
        sb.append(getRawData() == null ? 0 : getRawData().length);
        sb.append("\nxmOpCode=");
        sb.append(getXmOpCode());
        sb.append("\nresult=");
        sb.append(this.result);
        sb.append(i0XO1.f7442IO);
        return sb.toString();
    }
}
