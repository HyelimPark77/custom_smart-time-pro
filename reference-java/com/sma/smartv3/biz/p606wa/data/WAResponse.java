package com.sma.smartv3.biz.p606wa.data;

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
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @aa1
    public final String getError() {
        return this.error;
    }

    @aa1
    public final String getStatus() {
        return this.status;
    }

    public final void setError(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.error = str;
    }

    public final void setStatus(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.status = str;
    }

    public WAResponse(@aa1 String status, @aa1 String error) {
        Intrinsics.X0O(status, "status");
        Intrinsics.X0O(error, "error");
        this.status = status;
        this.error = error;
    }

    public /* synthetic */ WAResponse(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
