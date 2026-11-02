package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class PointsPack extends JsonFieldContainer implements Serializable {
    private float amount;
    private int id;
    private boolean isSelect;
    private float originalAmount;

    @aa1
    private String packName;
    private boolean recommend;

    public PointsPack() {
        int r1 = 0;
        String r2 = null;
        float r3 = 0.0f;
        float r4 = 0.0f;
        boolean r5 = false;
        boolean r6 = false;
        this(r1, r2, r3, r4, r5, r6, 63, null);
    }

    public static /* synthetic */ PointsPack copy$default(PointsPack r0, int r1, String r2, float r3, float r4, boolean r5, boolean r6, int r7, Object r8) {
        if ((r7 & 1) == 0) goto L6;
        r1 = r0.id;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r2 = r0.packName;
    L9:
        if ((r7 & 4) == 0) goto L12;
        r3 = r0.originalAmount;
    L12:
        if ((r7 & 8) == 0) goto L15;
        r4 = r0.amount;
    L15:
        if ((r7 & 16) == 0) goto L18;
        r5 = r0.recommend;
    L18:
        if ((r7 & 32) == 0) goto L20;
        r6 = r0.isSelect;
    L20:
        boolean r9 = r5;
        boolean r10 = r6;
        float r11 = r3;
        float r12 = r4;
        return r0.copy(r1, r2, r11, r12, r9, r10);
    }

    public final int component1() {
        return this.id;
    }

    @aa1
    public final String component2() {
        return this.packName;
    }

    public final float component3() {
        return this.originalAmount;
    }

    public final float component4() {
        return this.amount;
    }

    public final boolean component5() {
        return this.recommend;
    }

    public final boolean component6() {
        return this.isSelect;
    }

    @aa1
    public final PointsPack copy(int r9, @aa1 String r10, float r11, float r12, boolean r13, boolean r14) {
        Intrinsics.X0O(r10, "packName");
        return new PointsPack(r9, r10, r11, r12, r13, r14);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof PointsPack) == true) goto L8;
        return false;
    L8:
        PointsPack r6 = (PointsPack) r5;
        if (this.id == r6.id) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.packName, r6.packName) == true) goto L15;
        return false;
    L15:
        if (Float.compare(this.originalAmount, r6.originalAmount) == 0) goto L18;
        return false;
    L18:
        if (Float.compare(this.amount, r6.amount) == 0) goto L21;
        return false;
    L21:
        if (this.recommend == r6.recommend) goto L24;
        return false;
    L24:
        if (this.isSelect == r6.isSelect) goto L26;
        return false;
    L26:
        return true;
    }

    public final float getAmount() {
        return this.amount;
    }

    public final int getId() {
        return this.id;
    }

    public final float getOriginalAmount() {
        return this.originalAmount;
    }

    @aa1
    public final String getPackName() {
        return this.packName;
    }

    public final boolean getRecommend() {
        return this.recommend;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.id) * 31) + this.packName.hashCode()) * 31) + Float.hashCode(this.originalAmount)) * 31) + Float.hashCode(this.amount)) * 31) + Boolean.hashCode(this.recommend)) * 31) + Boolean.hashCode(this.isSelect);
    }

    public final boolean isSelect() {
        return this.isSelect;
    }

    public final void setAmount(float r1) {
        this.amount = r1;
    }

    public final void setId(int r1) {
        this.id = r1;
    }

    public final void setOriginalAmount(float r1) {
        this.originalAmount = r1;
    }

    public final void setPackName(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.packName = r2;
    }

    public final void setRecommend(boolean r1) {
        this.recommend = r1;
    }

    public final void setSelect(boolean r1) {
        this.isSelect = r1;
    }

    @aa1
    public String toString() {
        return "PointsPack(id=" + this.id + ", packName=" + this.packName + ", originalAmount=" + this.originalAmount + ", amount=" + this.amount + ", recommend=" + this.recommend + ", isSelect=" + this.isSelect + I000IiI1O.iO.iO;
    }

    public PointsPack(int r2, @aa1 String r3, float r4, float r5, boolean r6, boolean r7) {
        Intrinsics.X0O(r3, "packName");
        this.id = r2;
        this.packName = r3;
        this.originalAmount = r4;
        this.amount = r5;
        this.recommend = r6;
        this.isSelect = r7;
    }

    public /* synthetic */ PointsPack(int r3, String r4, float r5, float r6, boolean r7, boolean r8, int r9, DefaultConstructorMarker r10) {
        if ((r9 & 1) == 0) goto L6;
        r3 = 0;
    L6:
        if ((r9 & 2) == 0) goto L9;
        r4 = "";
    L9:
        if ((r9 & 4) == 0) goto L12;
        r5 = 0.0f;
    L12:
        if ((r9 & 8) == 0) goto L15;
        r6 = 0.0f;
    L15:
        if ((r9 & 16) == 0) goto L18;
        r7 = false;
    L18:
        if ((r9 & 32) == 0) goto L21;
        boolean r11 = false;
    L20:
        boolean r12 = r7;
        float r13 = r6;
        float r14 = r5;
        this(r3, r4, r14, r13, r12, r11);
        return;
    L21:
        r11 = r8;
        goto L20
    }
}
