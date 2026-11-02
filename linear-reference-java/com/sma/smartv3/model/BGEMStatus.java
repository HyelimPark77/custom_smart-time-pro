package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class BGEMStatus {

    @aa1
    private String message;
    private boolean success;

    /* JADX WARN: Multi-variable type inference failed */
    public BGEMStatus() {
        boolean r2 = false;
        this(r2, null, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BGEMStatus copy$default(BGEMStatus r0, boolean r1, String r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r0.success;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r0.message;
    L9:
        return r0.copy(r1, r2);
    }

    public final boolean component1() {
        return this.success;
    }

    @aa1
    public final String component2() {
        return this.message;
    }

    @aa1
    public final BGEMStatus copy(boolean r2, @aa1 String r3) {
        Intrinsics.X0O(r3, "message");
        return new BGEMStatus(r2, r3);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BGEMStatus) == true) goto L8;
        return false;
    L8:
        BGEMStatus r6 = (BGEMStatus) r5;
        if (this.success == r6.success) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.message, r6.message) == true) goto L14;
        return false;
    L14:
        return true;
    }

    @aa1
    public final String getMessage() {
        return this.message;
    }

    public final boolean getSuccess() {
        return this.success;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.success) * 31) + this.message.hashCode();
    }

    public final void setMessage(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.message = r2;
    }

    public final void setSuccess(boolean r1) {
        this.success = r1;
    }

    @aa1
    public String toString() {
        return "BGEMStatus(success=" + this.success + ", message=" + this.message + I000IiI1O.iO.iO;
    }

    public BGEMStatus(boolean r2, @aa1 String r3) {
        Intrinsics.X0O(r3, "message");
        this.success = r2;
        this.message = r3;
    }

    public /* synthetic */ BGEMStatus(boolean r1, String r2, int r3, DefaultConstructorMarker r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = false;
    L6:
        if ((r3 & 2) == 0) goto L8;
        r2 = "";
    L8:
        this(r1, r2);
    }
}
