package com.sma.smartv3.util.net;

import androidx.annotation.Keep;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public final class ApiResponse<T> {
    private int code;

    @tb1
    private final T data;

    @aa1
    private final String mesg;

    @aa1
    private final String requestID;

    public ApiResponse() {
        int r1 = 0;
        String r2 = null;
        String r3 = null;
        Object r4 = null;
        this(r1, r2, r3, r4, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ApiResponse copy$default(ApiResponse r0, int r1, String r2, String r3, Object r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = r0.code;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r2 = r0.mesg;
    L9:
        if ((r5 & 4) == 0) goto L12;
        r3 = r0.requestID;
    L12:
        if ((r5 & 8) == 0) goto L15;
        r4 = r0.data;
    L15:
        return r0.copy(r1, r2, r3, r4);
    }

    public final int component1() {
        return this.code;
    }

    @aa1
    public final String component2() {
        return this.mesg;
    }

    @aa1
    public final String component3() {
        return this.requestID;
    }

    @tb1
    public final T component4() {
        return this.data;
    }

    @aa1
    public final ApiResponse<T> copy(int r2, @aa1 String r3, @aa1 String r4, @tb1 T r5) {
        Intrinsics.X0O(r3, "mesg");
        Intrinsics.X0O(r4, SDKConstants.REQUEST_ID);
        return new ApiResponse(r2, r3, r4, r5);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof ApiResponse) == true) goto L8;
        return false;
    L8:
        ApiResponse r6 = (ApiResponse) r5;
        if (this.code == r6.code) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.mesg, r6.mesg) == true) goto L15;
        return false;
    L15:
        if (Intrinsics.XOO0ii0(this.requestID, r6.requestID) == true) goto L18;
        return false;
    L18:
        if (Intrinsics.XOO0ii0(this.data, r6.data) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public final int getCode() {
        return this.code;
    }

    @tb1
    public final T getData() {
        return this.data;
    }

    @aa1
    public final String getMesg() {
        return this.mesg;
    }

    @aa1
    public final String getRequestID() {
        return this.requestID;
    }

    public int hashCode() {
        int r0 = ((((Integer.hashCode(this.code) * 31) + this.mesg.hashCode()) * 31) + this.requestID.hashCode()) * 31;
        T r1 = this.data;
        if (r1 != null) goto L5;
        int r2 = 0;
    L7:
        return r0 + r2;
    L5:
        r2 = r1.hashCode();
        goto L7
    }

    public final boolean isSuccess() {
        if (this.data != null) goto L5;
        return false;
    L5:
        if (this.code != 0) goto L10;
        return true;
    L10:
        return false;
    }

    public final void setCode(int r1) {
        this.code = r1;
    }

    @aa1
    public String toString() {
        return "ApiResponse(code=" + this.code + ", mesg=" + this.mesg + ", requestID=" + this.requestID + ", data=" + this.data + I000IiI1O.iO.iO;
    }

    public ApiResponse(int r2, @aa1 String r3, @aa1 String r4, @tb1 T r5) {
        Intrinsics.X0O(r3, "mesg");
        Intrinsics.X0O(r4, SDKConstants.REQUEST_ID);
        this.code = r2;
        this.mesg = r3;
        this.requestID = r4;
        this.data = r5;
    }

    public /* synthetic */ ApiResponse(int r2, String r3, String r4, Object r5, int r6, DefaultConstructorMarker r7) {
        if ((r6 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r3 = "";
    L9:
        if ((r6 & 4) == 0) goto L12;
        r4 = "";
    L12:
        if ((r6 & 8) == 0) goto L14;
        r5 = null;
    L14:
        this(r2, r3, r4, r5);
    }
}
