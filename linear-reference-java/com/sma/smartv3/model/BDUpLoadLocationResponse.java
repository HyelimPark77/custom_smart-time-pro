package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class BDUpLoadLocationResponse {

    @aa1
    private Object fail_info;

    @aa1
    private String message;
    private int status;
    private int success_num;

    public BDUpLoadLocationResponse() {
        this.message = "";
        this.fail_info = new BDUpLoadLocationResponse$fail_info$1();
    }

    @aa1
    public final Object getFail_info() {
        return this.fail_info;
    }

    @aa1
    public final String getMessage() {
        return this.message;
    }

    public final int getStatus() {
        return this.status;
    }

    public final int getSuccess_num() {
        return this.success_num;
    }

    public final void setFail_info(@aa1 Object r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.fail_info = r2;
    }

    public final void setMessage(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.message = r2;
    }

    public final void setStatus(int r1) {
        this.status = r1;
    }

    public final void setSuccess_num(int r1) {
        this.success_num = r1;
    }

    @aa1
    public String toString() {
        return "BDUpLoadLocationResponse(status=" + this.status + ", message='" + this.message + "', success_num=" + this.success_num + ", fail_info=" + this.fail_info + I000IiI1O.iO.iO;
    }
}
