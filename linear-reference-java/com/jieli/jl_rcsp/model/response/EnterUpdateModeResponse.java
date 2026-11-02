package com.jieli.jl_rcsp.model.response;

import com.android.mltcode.paycertificationapi.i0XO1;
import com.jieli.jl_rcsp.model.base.CommonResponse;

/* JADX INFO: loaded from: classes17.dex */
public class EnterUpdateModeResponse extends CommonResponse {
    private final int canUpdateFlag;

    public EnterUpdateModeResponse(int r1) {
        this.canUpdateFlag = r1;
    }

    public int getCanUpdateFlag() {
        return this.canUpdateFlag;
    }

    @Override // com.jieli.jl_rcsp.model.base.CommonResponse
    public String toString() {
        StringBuilder r0 = new StringBuilder();
        r0.append("EnterUpdateModeResponse{rawData size =");
        if (getRawData() != null) goto L5;
        int r1 = 0;
    L6:
        r0.append(r1);
        r0.append("\nxmOpCode=");
        r0.append(getXmOpCode());
        r0.append("\ncanUpdateFlag=");
        r0.append(this.canUpdateFlag);
        r0.append(i0XO1.IO);
        return r0.toString();
    L5:
        r1 = getRawData().length;
        goto L6
    }
}
