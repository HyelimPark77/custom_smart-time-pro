package com.sma.smartv3.util.net;

import androidx.annotation.Keep;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
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
        this(0, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ApiResponse copy$default(ApiResponse apiResponse, int i, String str, String str2, Object obj, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            i = apiResponse.code;
        }
        if ((i2 & 2) != 0) {
            str = apiResponse.mesg;
        }
        if ((i2 & 4) != 0) {
            str2 = apiResponse.requestID;
        }
        if ((i2 & 8) != 0) {
            obj = apiResponse.data;
        }
        return apiResponse.copy(i, str, str2, obj);
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
    public final ApiResponse<T> copy(int i, @aa1 String mesg, @aa1 String requestID, @tb1 T t) {
        Intrinsics.X0O(mesg, "mesg");
        Intrinsics.X0O(requestID, "requestID");
        return new ApiResponse<>(i, mesg, requestID, t);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ApiResponse)) {
            return false;
        }
        ApiResponse apiResponse = (ApiResponse) obj;
        return this.code == apiResponse.code && Intrinsics.XOO0ii0(this.mesg, apiResponse.mesg) && Intrinsics.XOO0ii0(this.requestID, apiResponse.requestID) && Intrinsics.XOO0ii0(this.data, apiResponse.data);
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
        int iHashCode = ((((Integer.hashCode(this.code) * 31) + this.mesg.hashCode()) * 31) + this.requestID.hashCode()) * 31;
        T t = this.data;
        return iHashCode + (t == null ? 0 : t.hashCode());
    }

    public final boolean isSuccess() {
        return this.data != null && this.code == 0;
    }

    public final void setCode(int i) {
        this.code = i;
    }

    @aa1
    public String toString() {
        return "ApiResponse(code=" + this.code + ", mesg=" + this.mesg + ", requestID=" + this.requestID + ", data=" + this.data + I000IiI1O.C2156iO.f1007iO;
    }

    public ApiResponse(int i, @aa1 String mesg, @aa1 String requestID, @tb1 T t) {
        Intrinsics.X0O(mesg, "mesg");
        Intrinsics.X0O(requestID, "requestID");
        this.code = i;
        this.mesg = mesg;
        this.requestID = requestID;
        this.data = t;
    }

    public /* synthetic */ ApiResponse(int i, String str, String str2, Object obj, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? null : obj);
    }
}
