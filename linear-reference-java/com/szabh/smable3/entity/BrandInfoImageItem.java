package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BrandInfoImageItem {
    private int mAnchor;

    @aa1
    private BrandInfoImage[] mImageInfos;
    private int mPlayInterval;
    private int mX;
    private int mY;

    public BrandInfoImageItem() {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        BrandInfoImage[] r5 = null;
        this(r1, r2, r3, r4, r5, 31, null);
    }

    public static /* synthetic */ BrandInfoImageItem copy$default(BrandInfoImageItem r0, int r1, int r2, int r3, int r4, BrandInfoImage[] r5, int r6, Object r7) {
        if ((r6 & 1) == 0) goto L6;
        r1 = r0.mX;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r2 = r0.mY;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r3 = r0.mAnchor;
    L12:
        if ((r6 & 8) == 0) goto L15;
        r4 = r0.mPlayInterval;
    L15:
        if ((r6 & 16) == 0) goto L17;
        r5 = r0.mImageInfos;
    L17:
        int r8 = r4;
        BrandInfoImage[] r9 = r5;
        int r10 = r3;
        int r11 = r1;
        return r0.copy(r11, r2, r10, r8, r9);
    }

    public final int component1() {
        return this.mX;
    }

    public final int component2() {
        return this.mY;
    }

    public final int component3() {
        return this.mAnchor;
    }

    public final int component4() {
        return this.mPlayInterval;
    }

    @aa1
    public final BrandInfoImage[] component5() {
        return this.mImageInfos;
    }

    @aa1
    public final BrandInfoImageItem copy(int r8, int r9, int r10, int r11, @aa1 BrandInfoImage[] r12) {
        Intrinsics.X0O(r12, "mImageInfos");
        return new BrandInfoImageItem(r8, r9, r10, r11, r12);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BrandInfoImageItem) == true) goto L8;
        return false;
    L8:
        BrandInfoImageItem r6 = (BrandInfoImageItem) r5;
        if (this.mX == r6.mX) goto L12;
        return false;
    L12:
        if (this.mY == r6.mY) goto L15;
        return false;
    L15:
        if (this.mAnchor == r6.mAnchor) goto L18;
        return false;
    L18:
        if (this.mPlayInterval == r6.mPlayInterval) goto L21;
        return false;
    L21:
        if (Intrinsics.XOO0ii0(this.mImageInfos, r6.mImageInfos) == true) goto L23;
        return false;
    L23:
        return true;
    }

    public final int getMAnchor() {
        return this.mAnchor;
    }

    @aa1
    public final BrandInfoImage[] getMImageInfos() {
        return this.mImageInfos;
    }

    public final int getMPlayInterval() {
        return this.mPlayInterval;
    }

    public final int getMX() {
        return this.mX;
    }

    public final int getMY() {
        return this.mY;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.mX) * 31) + Integer.hashCode(this.mY)) * 31) + Integer.hashCode(this.mAnchor)) * 31) + Integer.hashCode(this.mPlayInterval)) * 31) + Arrays.hashCode(this.mImageInfos);
    }

    public final void setMAnchor(int r1) {
        this.mAnchor = r1;
    }

    public final void setMImageInfos(@aa1 BrandInfoImage[] r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mImageInfos = r2;
    }

    public final void setMPlayInterval(int r1) {
        this.mPlayInterval = r1;
    }

    public final void setMX(int r1) {
        this.mX = r1;
    }

    public final void setMY(int r1) {
        this.mY = r1;
    }

    @aa1
    public String toString() {
        return "BrandInfoImageItem(mX=" + this.mX + ", mY=" + this.mY + ", mAnchor=" + this.mAnchor + ", mPlayInterval=" + this.mPlayInterval + ", mImageInfos=" + Arrays.toString(this.mImageInfos) + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BrandInfoImageItem(int r2, int r3, int r4, int r5, @aa1 BrandInfoImage[] r6) {
        Intrinsics.X0O(r6, "mImageInfos");
        this.mX = r2;
        this.mY = r3;
        this.mAnchor = r4;
        this.mPlayInterval = r5;
        this.mImageInfos = r6;
    }

    public /* synthetic */ BrandInfoImageItem(int r2, int r3, int r4, int r5, BrandInfoImage[] r6, int r7, DefaultConstructorMarker r8) {
        if ((r7 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r7 & 4) == 0) goto L12;
        r4 = 0;
    L12:
        if ((r7 & 8) == 0) goto L15;
        r5 = 0;
    L15:
        if ((r7 & 16) == 0) goto L17;
        r6 = new BrandInfoImage[0];
    L17:
        BrandInfoImage[] r9 = r6;
        int r10 = r5;
        int r11 = r4;
        this(r2, r3, r11, r10, r9);
    }
}
