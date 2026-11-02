package com.sma.smartv3.network;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class UploadServiceRequestBody {

    @aa1
    private List<DataBody> data;

    @tb1
    private String identity;

    public UploadServiceRequestBody(@tb1 String r2, @aa1 List<DataBody> r3) {
        Intrinsics.X0O(r3, "data");
        this.identity = r2;
        this.data = r3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UploadServiceRequestBody copy$default(UploadServiceRequestBody r0, String r1, List r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r0.identity;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r0.data;
    L9:
        return r0.copy(r1, r2);
    }

    @tb1
    public final String component1() {
        return this.identity;
    }

    @aa1
    public final List<DataBody> component2() {
        return this.data;
    }

    @aa1
    public final UploadServiceRequestBody copy(@tb1 String r2, @aa1 List<DataBody> r3) {
        Intrinsics.X0O(r3, "data");
        return new UploadServiceRequestBody(r2, r3);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof UploadServiceRequestBody) == true) goto L8;
        return false;
    L8:
        UploadServiceRequestBody r6 = (UploadServiceRequestBody) r5;
        if (Intrinsics.XOO0ii0(this.identity, r6.identity) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.data, r6.data) == true) goto L14;
        return false;
    L14:
        return true;
    }

    @aa1
    public final List<DataBody> getData() {
        return this.data;
    }

    @tb1
    public final String getIdentity() {
        return this.identity;
    }

    public int hashCode() {
        String r0 = this.identity;
        if (r0 != null) goto L5;
        int r1 = 0;
    L7:
        return (r1 * 31) + this.data.hashCode();
    L5:
        r1 = r0.hashCode();
        goto L7
    }

    public final void setData(@aa1 List<DataBody> r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.data = r2;
    }

    public final void setIdentity(@tb1 String r1) {
        this.identity = r1;
    }

    @aa1
    public String toString() {
        return "UploadServiceRequestBody(identity=" + this.identity + ", data=" + this.data + I000IiI1O.iO.iO;
    }
}
