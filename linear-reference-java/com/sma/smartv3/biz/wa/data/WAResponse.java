package com.sma.smartv3.biz.wa.data;

import com.android.mltcode.paycertificationapi.aa1;
import com.sma.smartv3.model.JsonFieldContainer;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
public class WAResponse extends JsonFieldContainer implements Serializable {

    @aa1
    private String error;

    @aa1
    private String status;

    /* JADX WARN: Multi-variable type inference failed */
    public WAResponse() {
        Object[] r0 = 0 == true ? 1 : 0;
        this(null, r0, 3, 0 == true ? 1 : 0);
    }

    @aa1
    public final String getError() {
        return this.error;
    }

    @aa1
    public final String getStatus() {
        return this.status;
    }

    public final void setError(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.error = r2;
    }

    public final void setStatus(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.status = r2;
    }

    public WAResponse(@aa1 String r2, @aa1 String r3) {
        Intrinsics.X0O(r2, "status");
        Intrinsics.X0O(r3, "error");
        this.status = r2;
        this.error = r3;
    }

    public /* synthetic */ WAResponse(String r2, String r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r4 & 2) == 0) goto L8;
        r3 = "";
    L8:
        this(r2, r3);
    }
}
