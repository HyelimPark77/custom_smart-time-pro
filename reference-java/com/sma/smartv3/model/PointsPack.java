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

    /* JADX INFO: renamed from: id */
    private int f51317id;
    private boolean isSelect;
    private float originalAmount;

    @aa1
    private String packName;
    private boolean recommend;

    public PointsPack() {
        this(0, null, 0.0f, 0.0f, false, false, 63, null);
    }

    public static /* synthetic */ PointsPack copy$default(PointsPack pointsPack, int i, String str, float f, float f2, boolean z, boolean z2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = pointsPack.f51317id;
        }
        if ((i2 & 2) != 0) {
            str = pointsPack.packName;
        }
        if ((i2 & 4) != 0) {
            f = pointsPack.originalAmount;
        }
        if ((i2 & 8) != 0) {
            f2 = pointsPack.amount;
        }
        if ((i2 & 16) != 0) {
            z = pointsPack.recommend;
        }
        if ((i2 & 32) != 0) {
            z2 = pointsPack.isSelect;
        }
        boolean z3 = z;
        boolean z4 = z2;
        return pointsPack.copy(i, str, f, f2, z3, z4);
    }

    public final int component1() {
        return this.f51317id;
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
    public final PointsPack copy(int i, @aa1 String packName, float f, float f2, boolean z, boolean z2) {
        Intrinsics.X0O(packName, "packName");
        return new PointsPack(i, packName, f, f2, z, z2);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PointsPack)) {
            return false;
        }
        PointsPack pointsPack = (PointsPack) obj;
        return this.f51317id == pointsPack.f51317id && Intrinsics.XOO0ii0(this.packName, pointsPack.packName) && Float.compare(this.originalAmount, pointsPack.originalAmount) == 0 && Float.compare(this.amount, pointsPack.amount) == 0 && this.recommend == pointsPack.recommend && this.isSelect == pointsPack.isSelect;
    }

    public final float getAmount() {
        return this.amount;
    }

    public final int getId() {
        return this.f51317id;
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
        return (((((((((Integer.hashCode(this.f51317id) * 31) + this.packName.hashCode()) * 31) + Float.hashCode(this.originalAmount)) * 31) + Float.hashCode(this.amount)) * 31) + Boolean.hashCode(this.recommend)) * 31) + Boolean.hashCode(this.isSelect);
    }

    public final boolean isSelect() {
        return this.isSelect;
    }

    public final void setAmount(float f) {
        this.amount = f;
    }

    public final void setId(int i) {
        this.f51317id = i;
    }

    public final void setOriginalAmount(float f) {
        this.originalAmount = f;
    }

    public final void setPackName(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.packName = str;
    }

    public final void setRecommend(boolean z) {
        this.recommend = z;
    }

    public final void setSelect(boolean z) {
        this.isSelect = z;
    }

    @aa1
    public String toString() {
        return "PointsPack(id=" + this.f51317id + ", packName=" + this.packName + ", originalAmount=" + this.originalAmount + ", amount=" + this.amount + ", recommend=" + this.recommend + ", isSelect=" + this.isSelect + I000IiI1O.C2156iO.f1007iO;
    }

    public PointsPack(int i, @aa1 String packName, float f, float f2, boolean z, boolean z2) {
        Intrinsics.X0O(packName, "packName");
        this.f51317id = i;
        this.packName = packName;
        this.originalAmount = f;
        this.amount = f2;
        this.recommend = z;
        this.isSelect = z2;
    }

    public /* synthetic */ PointsPack(int i, String str, float f, float f2, boolean z, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? 0.0f : f, (i2 & 8) != 0 ? 0.0f : f2, (i2 & 16) != 0 ? false : z, (i2 & 32) != 0 ? false : z2);
    }
}
