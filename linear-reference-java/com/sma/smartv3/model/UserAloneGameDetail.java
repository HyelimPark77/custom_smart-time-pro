package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.network.GetGameDetail;
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
        String r1 = null;
        float r2 = 0.0f;
        float r3 = 0.0f;
        float r4 = 0.0f;
        String r5 = null;
        String r6 = null;
        this(r1, r2, r3, r4, r5, r6, 63, null);
    }

    public static /* synthetic */ UserAloneGameDetail copy$default(UserAloneGameDetail r0, String r1, float r2, float r3, float r4, String r5, String r6, int r7, Object r8) {
        if ((r7 & 1) == 0) goto L6;
        r1 = r0.gid;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r2 = r0.amount;
    L9:
        if ((r7 & 4) == 0) goto L12;
        r3 = r0.dollar;
    L12:
        if ((r7 & 8) == 0) goto L15;
        r4 = r0.originalAmount;
    L15:
        if ((r7 & 16) == 0) goto L18;
        r5 = r0.priceUnit;
    L18:
        if ((r7 & 32) == 0) goto L20;
        r6 = r0.payStatus;
    L20:
        String r9 = r5;
        String r10 = r6;
        float r11 = r3;
        float r12 = r4;
        return r0.copy(r1, r2, r11, r12, r9, r10);
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
    public final UserAloneGameDetail copy(@aa1 String r9, float r10, float r11, float r12, @aa1 String r13, @aa1 String r14) {
        Intrinsics.X0O(r9, GetGameDetail.GAME_ID);
        Intrinsics.X0O(r13, "priceUnit");
        Intrinsics.X0O(r14, "payStatus");
        return new UserAloneGameDetail(r9, r10, r11, r12, r13, r14);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof UserAloneGameDetail) == true) goto L8;
        return false;
    L8:
        UserAloneGameDetail r6 = (UserAloneGameDetail) r5;
        if (Intrinsics.XOO0ii0(this.gid, r6.gid) == true) goto L12;
        return false;
    L12:
        if (Float.compare(this.amount, r6.amount) == 0) goto L15;
        return false;
    L15:
        if (Float.compare(this.dollar, r6.dollar) == 0) goto L18;
        return false;
    L18:
        if (Float.compare(this.originalAmount, r6.originalAmount) == 0) goto L21;
        return false;
    L21:
        if (Intrinsics.XOO0ii0(this.priceUnit, r6.priceUnit) == true) goto L24;
        return false;
    L24:
        if (Intrinsics.XOO0ii0(this.payStatus, r6.payStatus) == true) goto L26;
        return false;
    L26:
        return true;
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

    public final void setAmount(float r1) {
        this.amount = r1;
    }

    public final void setDollar(float r1) {
        this.dollar = r1;
    }

    public final void setGid(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.gid = r2;
    }

    public final void setOriginalAmount(float r1) {
        this.originalAmount = r1;
    }

    public final void setPayStatus(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.payStatus = r2;
    }

    public final void setPriceUnit(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.priceUnit = r2;
    }

    @aa1
    public String toString() {
        return "UserAloneGameDetail(gid=" + this.gid + ", amount=" + this.amount + ", dollar=" + this.dollar + ", originalAmount=" + this.originalAmount + ", priceUnit=" + this.priceUnit + ", payStatus=" + this.payStatus + I000IiI1O.iO.iO;
    }

    public UserAloneGameDetail(@aa1 String r2, float r3, float r4, float r5, @aa1 String r6, @aa1 String r7) {
        Intrinsics.X0O(r2, GetGameDetail.GAME_ID);
        Intrinsics.X0O(r6, "priceUnit");
        Intrinsics.X0O(r7, "payStatus");
        this.gid = r2;
        this.amount = r3;
        this.dollar = r4;
        this.originalAmount = r5;
        this.priceUnit = r6;
        this.payStatus = r7;
    }

    public /* synthetic */ UserAloneGameDetail(String r2, float r3, float r4, float r5, String r6, String r7, int r8, DefaultConstructorMarker r9) {
        if ((r8 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r8 & 2) == 0) goto L9;
        r3 = 6.0f;
    L9:
        if ((r8 & 4) == 0) goto L12;
        r4 = 0.99f;
    L12:
        if ((r8 & 8) == 0) goto L15;
        r5 = 9.0f;
    L15:
        if ((r8 & 16) == 0) goto L18;
        r6 = "";
    L18:
        if ((r8 & 32) == 0) goto L20;
        r7 = "Undefined";
    L20:
        String r10 = r7;
        String r11 = r6;
        float r12 = r5;
        float r13 = r4;
        float r14 = r3;
        this(r2, r14, r13, r12, r11, r10);
    }
}
