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

    public static /* synthetic */ UserExtra copy$default(UserExtra userExtra, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = userExtra.countryCode;
        }
        return userExtra.copy(str);
    }

    @aa1
    public final String component1() {
        return this.countryCode;
    }

    @aa1
    public final UserExtra copy(@aa1 String countryCode) {
        Intrinsics.X0O(countryCode, "countryCode");
        return new UserExtra(countryCode);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof UserExtra) && Intrinsics.XOO0ii0(this.countryCode, ((UserExtra) obj).countryCode);
    }

    @aa1
    public final String getCountryCode() {
        return this.countryCode;
    }

    public int hashCode() {
        return this.countryCode.hashCode();
    }

    public final void setCountryCode(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.countryCode = str;
    }

    @aa1
    public String toString() {
        return "UserExtra(countryCode=" + this.countryCode + I000IiI1O.C2156iO.f1007iO;
    }

    public UserExtra(@aa1 String countryCode) {
        Intrinsics.X0O(countryCode, "countryCode");
        this.countryCode = countryCode;
    }

    public /* synthetic */ UserExtra(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str);
    }
}
