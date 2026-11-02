package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class JobV2Extra {

    @aa1
    private String img_n;

    @aa1
    private String img_style;

    /* JADX WARN: Multi-variable type inference failed */
    public JobV2Extra() {
        Object[] r0 = 0 == true ? 1 : 0;
        this(null, r0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ JobV2Extra copy$default(JobV2Extra r0, String r1, String r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r0.img_style;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r0.img_n;
    L9:
        return r0.copy(r1, r2);
    }

    @aa1
    public final String component1() {
        return this.img_style;
    }

    @aa1
    public final String component2() {
        return this.img_n;
    }

    @aa1
    public final JobV2Extra copy(@aa1 String r2, @aa1 String r3) {
        Intrinsics.X0O(r2, "img_style");
        Intrinsics.X0O(r3, "img_n");
        return new JobV2Extra(r2, r3);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof JobV2Extra) == true) goto L8;
        return false;
    L8:
        JobV2Extra r6 = (JobV2Extra) r5;
        if (Intrinsics.XOO0ii0(this.img_style, r6.img_style) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.img_n, r6.img_n) == true) goto L14;
        return false;
    L14:
        return true;
    }

    @aa1
    public final String getImg_n() {
        return this.img_n;
    }

    @aa1
    public final String getImg_style() {
        return this.img_style;
    }

    public int hashCode() {
        return (this.img_style.hashCode() * 31) + this.img_n.hashCode();
    }

    public final void setImg_n(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.img_n = r2;
    }

    public final void setImg_style(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.img_style = r2;
    }

    @aa1
    public String toString() {
        return "JobV2Extra(img_style=" + this.img_style + ", img_n=" + this.img_n + I000IiI1O.iO.iO;
    }

    public JobV2Extra(@aa1 String r2, @aa1 String r3) {
        Intrinsics.X0O(r2, "img_style");
        Intrinsics.X0O(r3, "img_n");
        this.img_style = r2;
        this.img_n = r3;
    }

    public /* synthetic */ JobV2Extra(String r1, String r2, int r3, DefaultConstructorMarker r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = "default";
    L6:
        if ((r3 & 2) == 0) goto L8;
        r2 = "1";
    L8:
        this(r1, r2);
    }
}
