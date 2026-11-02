package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class BDUpLoadLocationResponse {
    private int status;
    private int success_num;

    @aa1
    private String message = "";

    @aa1
    private Object fail_info = new Object() { // from class: com.sma.smartv3.model.BDUpLoadLocationResponse$fail_info$1
    };

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

    public final void setFail_info(@aa1 Object obj) {
        Intrinsics.X0O(obj, "<set-?>");
        this.fail_info = obj;
    }

    public final void setMessage(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.message = str;
    }

    public final void setStatus(int i) {
        this.status = i;
    }

    public final void setSuccess_num(int i) {
        this.success_num = i;
    }

    @aa1
    public String toString() {
        return "BDUpLoadLocationResponse(status=" + this.status + ", message='" + this.message + "', success_num=" + this.success_num + ", fail_info=" + this.fail_info + I000IiI1O.C2156iO.f1007iO;
    }
}
