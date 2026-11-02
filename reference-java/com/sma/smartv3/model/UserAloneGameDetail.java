package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class UserAloneGameDetail extends JsonFieldContainer implements Serializable {
    private float amount;
    private float dollar;

    @aa1
    private String gid;
    private float originalAmount;

    @aa1
    private String payStatus;

    @aa1
    private String priceUnit;

    public UserAloneGameDetail() {
        this(null, 0.0f, 0.0f, 0.0f, null, null, 63, null);
    }

    public static /* synthetic */ UserAloneGameDetail copy$default(UserAloneGameDetail userAloneGameDetail, String str, float f, float f2, float f3, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = userAloneGameDetail.gid;
        }
        if ((i & 2) != 0) {
            f = userAloneGameDetail.amount;
        }
        if ((i & 4) != 0) {
            f2 = userAloneGameDetail.dollar;
        }
        if ((i & 8) != 0) {
            f3 = userAloneGameDetail.originalAmount;
        }
        if ((i & 16) != 0) {
            str2 = userAloneGameDetail.priceUnit;
        }
        if ((i & 32) != 0) {
            str3 = userAloneGameDetail.payStatus;
        }
        String str4 = str2;
        String str5 = str3;
        return userAloneGameDetail.copy(str, f, f2, f3, str4, str5);
    }

    @aa1
    public final String component1() {
        return this.gid;
    }

    public final float component2() {
        return this.amount;
    }

    public final float component3() {
        return this.dollar;
    }

    public final float component4() {
        return this.originalAmount;
    }

    @aa1
    public final String component5() {
        return this.priceUnit;
    }

    @aa1
    public final String component6() {
        return this.payStatus;
    }

    @aa1
    public final UserAloneGameDetail copy(@aa1 String gid, float f, float f2, float f3, @aa1 String priceUnit, @aa1 String payStatus) {
        Intrinsics.X0O(gid, "gid");
        Intrinsics.X0O(priceUnit, "priceUnit");
        Intrinsics.X0O(payStatus, "payStatus");
        return new UserAloneGameDetail(gid, f, f2, f3, priceUnit, payStatus);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserAloneGameDetail)) {
            return false;
        }
        UserAloneGameDetail userAloneGameDetail = (UserAloneGameDetail) obj;
        return Intrinsics.XOO0ii0(this.gid, userAloneGameDetail.gid) && Float.compare(this.amount, userAloneGameDetail.amount) == 0 && Float.compare(this.dollar, userAloneGameDetail.dollar) == 0 && Float.compare(this.originalAmount, userAloneGameDetail.originalAmount) == 0 && Intrinsics.XOO0ii0(this.priceUnit, userAloneGameDetail.priceUnit) && Intrinsics.XOO0ii0(this.payStatus, userAloneGameDetail.payStatus);
    }

    public final float getAmount() {
        return this.amount;
    }

    public final float getDollar() {
        return this.dollar;
    }

    @aa1
    public final String getGid() {
        return this.gid;
    }

    public final float getOriginalAmount() {
        return this.originalAmount;
    }

    @aa1
    public final String getPayStatus() {
        return this.payStatus;
    }

    @aa1
    public final String getPriceUnit() {
        return this.priceUnit;
    }

    public int hashCode() {
        return (((((((((this.gid.hashCode() * 31) + Float.hashCode(this.amount)) * 31) + Float.hashCode(this.dollar)) * 31) + Float.hashCode(this.originalAmount)) * 31) + this.priceUnit.hashCode()) * 31) + this.payStatus.hashCode();
    }

    public final void setAmount(float f) {
        this.amount = f;
    }

    public final void setDollar(float f) {
        this.dollar = f;
    }

    public final void setGid(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.gid = str;
    }

    public final void setOriginalAmount(float f) {
        this.originalAmount = f;
    }

    public final void setPayStatus(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.payStatus = str;
    }

    public final void setPriceUnit(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.priceUnit = str;
    }

    @aa1
    public String toString() {
        return "UserAloneGameDetail(gid=" + this.gid + ", amount=" + this.amount + ", dollar=" + this.dollar + ", originalAmount=" + this.originalAmount + ", priceUnit=" + this.priceUnit + ", payStatus=" + this.payStatus + I000IiI1O.C2156iO.f1007iO;
    }

    public UserAloneGameDetail(@aa1 String gid, float f, float f2, float f3, @aa1 String priceUnit, @aa1 String payStatus) {
        Intrinsics.X0O(gid, "gid");
        Intrinsics.X0O(priceUnit, "priceUnit");
        Intrinsics.X0O(payStatus, "payStatus");
        this.gid = gid;
        this.amount = f;
        this.dollar = f2;
        this.originalAmount = f3;
        this.priceUnit = priceUnit;
        this.payStatus = payStatus;
    }

    public /* synthetic */ UserAloneGameDetail(String str, float f, float f2, float f3, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 6.0f : f, (i & 4) != 0 ? 0.99f : f2, (i & 8) != 0 ? 9.0f : f3, (i & 16) != 0 ? "" : str2, (i & 32) != 0 ? "Undefined" : str3);
    }
}
