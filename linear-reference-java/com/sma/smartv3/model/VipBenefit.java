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
        String r1 = null;
        int r2 = 0;
        int r3 = 0;
        this(r1, r2, r3, 7, null);
    }

    public static /* synthetic */ VipBenefit copy$default(VipBenefit r0, String r1, int r2, int r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r0.title;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r0.ivIcon;
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = r0.type;
    L12:
        return r0.copy(r1, r2, r3);
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
    public final VipBenefit copy(@aa1 String r2, int r3, int r4) {
        Intrinsics.X0O(r2, "title");
        return new VipBenefit(r2, r3, r4);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof VipBenefit) == true) goto L8;
        return false;
    L8:
        VipBenefit r6 = (VipBenefit) r5;
        if (Intrinsics.XOO0ii0(this.title, r6.title) == true) goto L12;
        return false;
    L12:
        if (this.ivIcon == r6.ivIcon) goto L15;
        return false;
    L15:
        if (this.type == r6.type) goto L17;
        return false;
    L17:
        return true;
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

    public final void setIvIcon(int r1) {
        this.ivIcon = r1;
    }

    public final void setTitle(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.title = r2;
    }

    public final void setType(int r1) {
        this.type = r1;
    }

    @aa1
    public String toString() {
        return "VipBenefit(title=" + this.title + ", ivIcon=" + this.ivIcon + ", type=" + this.type + I000IiI1O.iO.iO;
    }

    public VipBenefit(@aa1 String r2, int r3, int r4) {
        Intrinsics.X0O(r2, "title");
        this.title = r2;
        this.ivIcon = r3;
        this.type = r4;
    }

    public /* synthetic */ VipBenefit(String r2, int r3, int r4, int r5, DefaultConstructorMarker r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = "";
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r5 & 4) == 0) goto L11;
        r4 = 0;
    L11:
        this(r2, r3, r4);
    }
}
