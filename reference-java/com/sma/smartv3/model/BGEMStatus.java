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
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ BGEMStatus copy$default(BGEMStatus bGEMStatus, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = bGEMStatus.success;
        }
        if ((i & 2) != 0) {
            str = bGEMStatus.message;
        }
        return bGEMStatus.copy(z, str);
    }

    public final boolean component1() {
        return this.success;
    }

    @aa1
    public final String component2() {
        return this.message;
    }

    @aa1
    public final BGEMStatus copy(boolean z, @aa1 String message) {
        Intrinsics.X0O(message, "message");
        return new BGEMStatus(z, message);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BGEMStatus)) {
            return false;
        }
        BGEMStatus bGEMStatus = (BGEMStatus) obj;
        return this.success == bGEMStatus.success && Intrinsics.XOO0ii0(this.message, bGEMStatus.message);
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

    public final void setMessage(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.message = str;
    }

    public final void setSuccess(boolean z) {
        this.success = z;
    }

    @aa1
    public String toString() {
        return "BGEMStatus(success=" + this.success + ", message=" + this.message + I000IiI1O.C2156iO.f1007iO;
    }

    public BGEMStatus(boolean z, @aa1 String message) {
        Intrinsics.X0O(message, "message");
        this.success = z;
        this.message = message;
    }

    public /* synthetic */ BGEMStatus(boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str);
    }
}
