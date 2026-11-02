package com.sma.smartv3.model;

import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uz0;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class JobDetailV2 extends JsonFieldContainer {

    @aa1
    private String imageSign;

    @aa1
    private String[] images;

    public JobDetailV2(@aa1 String r2, @aa1 String[] r3) {
        Intrinsics.X0O(r2, "imageSign");
        Intrinsics.X0O(r3, uz0.iO);
        this.imageSign = r2;
        this.images = r3;
    }

    public static /* synthetic */ JobDetailV2 copy$default(JobDetailV2 r0, String r1, String[] r2, int r3, Object r4) {
        if ((r3 & 1) == 0) goto L6;
        r1 = r0.imageSign;
    L6:
        if ((r3 & 2) == 0) goto L9;
        r2 = r0.images;
    L9:
        return r0.copy(r1, r2);
    }

    @aa1
    public final String component1() {
        return this.imageSign;
    }

    @aa1
    public final String[] component2() {
        return this.images;
    }

    @aa1
    public final JobDetailV2 copy(@aa1 String r2, @aa1 String[] r3) {
        Intrinsics.X0O(r2, "imageSign");
        Intrinsics.X0O(r3, uz0.iO);
        return new JobDetailV2(r2, r3);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof JobDetailV2) == true) goto L8;
        return false;
    L8:
        JobDetailV2 r6 = (JobDetailV2) r5;
        if (Intrinsics.XOO0ii0(this.imageSign, r6.imageSign) == true) goto L12;
        return false;
    L12:
        if (Intrinsics.XOO0ii0(this.images, r6.images) == true) goto L14;
        return false;
    L14:
        return true;
    }

    @aa1
    public final String getImageSign() {
        return this.imageSign;
    }

    @aa1
    public final String[] getImages() {
        return this.images;
    }

    public int hashCode() {
        return (this.imageSign.hashCode() * 31) + Arrays.hashCode(this.images);
    }

    public final void setImageSign(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.imageSign = r2;
    }

    public final void setImages(@aa1 String[] r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.images = r2;
    }

    @aa1
    public String toString() {
        return "JobDetailV2(imageSign=" + this.imageSign + ", images=" + Arrays.toString(this.images) + I000IiI1O.iO.iO;
    }

    public /* synthetic */ JobDetailV2(String r1, String[] r2, int r3, DefaultConstructorMarker r4) {
        if ((r3 & 1) == 0) goto L5;
        r1 = "";
    L5:
        this(r1, r2);
    }
}
