package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class UserExtra extends JsonField {

    @aa1
    private String countryCode;

    /* JADX WARN: Multi-variable type inference failed */
    public UserExtra() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ UserExtra copy$default(UserExtra r0, String r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L6;
        r1 = r0.countryCode;
    L6:
        return r0.copy(r1);
    }

    @aa1
    public final String component1() {
        return this.countryCode;
    }

    @aa1
    public final UserExtra copy(@aa1 String r2) {
        Intrinsics.X0O(r2, "countryCode");
        return new UserExtra(r2);
    }

    public boolean equals(@tb1 Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof UserExtra) == true) goto L9;
        return false;
    L9:
        if (Intrinsics.XOO0ii0(this.countryCode, ((UserExtra) r4).countryCode) == true) goto L11;
        return false;
    L11:
        return true;
    }

    @aa1
    public final String getCountryCode() {
        return this.countryCode;
    }

    public int hashCode() {
        return this.countryCode.hashCode();
    }

    public final void setCountryCode(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.countryCode = r2;
    }

    @aa1
    public String toString() {
        return "UserExtra(countryCode=" + this.countryCode + I000IiI1O.iO.iO;
    }

    public UserExtra(@aa1 String r2) {
        Intrinsics.X0O(r2, "countryCode");
        this.countryCode = r2;
    }

    public /* synthetic */ UserExtra(String r1, int r2, DefaultConstructorMarker r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = "";
    L5:
        this(r1);
    }
}
