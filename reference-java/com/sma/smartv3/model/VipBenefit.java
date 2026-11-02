package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class VipBenefit extends JsonFieldContainer implements Serializable {
    private int ivIcon;

    @aa1
    private String title;
    private int type;

    public VipBenefit() {
        this(null, 0, 0, 7, null);
    }

    public static /* synthetic */ VipBenefit copy$default(VipBenefit vipBenefit, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = vipBenefit.title;
        }
        if ((i3 & 2) != 0) {
            i = vipBenefit.ivIcon;
        }
        if ((i3 & 4) != 0) {
            i2 = vipBenefit.type;
        }
        return vipBenefit.copy(str, i, i2);
    }

    @aa1
    public final String component1() {
        return this.title;
    }

    public final int component2() {
        return this.ivIcon;
    }

    public final int component3() {
        return this.type;
    }

    @aa1
    public final VipBenefit copy(@aa1 String title, int i, int i2) {
        Intrinsics.X0O(title, "title");
        return new VipBenefit(title, i, i2);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VipBenefit)) {
            return false;
        }
        VipBenefit vipBenefit = (VipBenefit) obj;
        return Intrinsics.XOO0ii0(this.title, vipBenefit.title) && this.ivIcon == vipBenefit.ivIcon && this.type == vipBenefit.type;
    }

    public final int getIvIcon() {
        return this.ivIcon;
    }

    @aa1
    public final String getTitle() {
        return this.title;
    }

    public final int getType() {
        return this.type;
    }

    public int hashCode() {
        return (((this.title.hashCode() * 31) + Integer.hashCode(this.ivIcon)) * 31) + Integer.hashCode(this.type);
    }

    public final void setIvIcon(int i) {
        this.ivIcon = i;
    }

    public final void setTitle(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.title = str;
    }

    public final void setType(int i) {
        this.type = i;
    }

    @aa1
    public String toString() {
        return "VipBenefit(title=" + this.title + ", ivIcon=" + this.ivIcon + ", type=" + this.type + I000IiI1O.C2156iO.f1007iO;
    }

    public VipBenefit(@aa1 String title, int i, int i2) {
        Intrinsics.X0O(title, "title");
        this.title = title;
        this.ivIcon = i;
        this.type = i2;
    }

    public /* synthetic */ VipBenefit(String str, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2);
    }
}
