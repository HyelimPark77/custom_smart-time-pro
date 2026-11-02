package com.jieli.jl_rcsp.model.response;

import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_rcsp.model.base.CommonResponse;

/* JADX INFO: loaded from: classes17.dex */
public class ExitUpdateModeResponse extends CommonResponse {
    private final int result;

    public ExitUpdateModeResponse(int r1) {
        this.result = r1;
    }

    public int getResult() {
        return this.result;
    }

    @Override // com.jieli.jl_rcsp.model.base.CommonResponse
    public String toString() {
        StringBuilder r0 = new StringBuilder();
        r0.append("ExitUpdateModeResponse{rawData size =");
        if (getRawData() != null) goto L5;
        int r1 = 0;
    L6:
        r0.append(r1);
        r0.append("\nxmOpCode=");
        r0.append(getXmOpCode());
        r0.append("\nresult=");
        r0.append(this.result);
        r0.append(i0XO1.IO);
        return r0.toString();
    L5:
        r1 = getRawData().length;
        goto L6
    }
}
