package com.szabh.smable3.entity;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class BrandInfoImage {
    private int hasAlpha;
    private int mCompression;
    private int mHeight;

    @aa1
    private byte[] mImageBuffer;
    private int mPixelFormat;
    private int mWidth;

    public BrandInfoImage() {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        byte[] r6 = null;
        this(r1, r2, r3, r4, r5, r6, 63, null);
    }

    public static /* synthetic */ BrandInfoImage copy$default(BrandInfoImage r0, int r1, int r2, int r3, int r4, int r5, byte[] r6, int r7, Object r8) {
        if ((r7 & 1) == 0) goto L6;
        r1 = r0.mWidth;
    L6:
        if ((r7 & 2) == 0) goto L9;
        r2 = r0.mHeight;
    L9:
        if ((r7 & 4) == 0) goto L12;
        r3 = r0.mCompression;
    L12:
        if ((r7 & 8) == 0) goto L15;
        r4 = r0.mPixelFormat;
    L15:
        if ((r7 & 16) == 0) goto L18;
        r5 = r0.hasAlpha;
    L18:
        if ((r7 & 32) == 0) goto L20;
        r6 = r0.mImageBuffer;
    L20:
        int r9 = r5;
        byte[] r10 = r6;
        int r11 = r3;
        int r12 = r4;
        return r0.copy(r1, r2, r11, r12, r9, r10);
    }

    public final int component1() {
        return this.mWidth;
    }

    public final int component2() {
        return this.mHeight;
    }

    public final int component3() {
        return this.mCompression;
    }

    public final int component4() {
        return this.mPixelFormat;
    }

    public final int component5() {
        return this.hasAlpha;
    }

    @aa1
    public final byte[] component6() {
        return this.mImageBuffer;
    }

    @aa1
    public final BrandInfoImage copy(int r9, int r10, int r11, int r12, int r13, @aa1 byte[] r14) {
        Intrinsics.X0O(r14, "mImageBuffer");
        return new BrandInfoImage(r9, r10, r11, r12, r13, r14);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof BrandInfoImage) == true) goto L8;
        return false;
    L8:
        BrandInfoImage r6 = (BrandInfoImage) r5;
        if (this.mWidth == r6.mWidth) goto L12;
        return false;
    L12:
        if (this.mHeight == r6.mHeight) goto L15;
        return false;
    L15:
        if (this.mCompression == r6.mCompression) goto L18;
        return false;
    L18:
        if (this.mPixelFormat == r6.mPixelFormat) goto L21;
        return false;
    L21:
        if (this.hasAlpha == r6.hasAlpha) goto L24;
        return false;
    L24:
        if (Intrinsics.XOO0ii0(this.mImageBuffer, r6.mImageBuffer) == true) goto L26;
        return false;
    L26:
        return true;
    }

    public final int getHasAlpha() {
        return this.hasAlpha;
    }

    public final int getMCompression() {
        return this.mCompression;
    }

    public final int getMHeight() {
        return this.mHeight;
    }

    @aa1
    public final byte[] getMImageBuffer() {
        return this.mImageBuffer;
    }

    public final int getMPixelFormat() {
        return this.mPixelFormat;
    }

    public final int getMWidth() {
        return this.mWidth;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.mWidth) * 31) + Integer.hashCode(this.mHeight)) * 31) + Integer.hashCode(this.mCompression)) * 31) + Integer.hashCode(this.mPixelFormat)) * 31) + Integer.hashCode(this.hasAlpha)) * 31) + Arrays.hashCode(this.mImageBuffer);
    }

    public final void setHasAlpha(int r1) {
        this.hasAlpha = r1;
    }

    public final void setMCompression(int r1) {
        this.mCompression = r1;
    }

    public final void setMHeight(int r1) {
        this.mHeight = r1;
    }

    public final void setMImageBuffer(@aa1 byte[] r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.mImageBuffer = r2;
    }

    public final void setMPixelFormat(int r1) {
        this.mPixelFormat = r1;
    }

    public final void setMWidth(int r1) {
        this.mWidth = r1;
    }

    @aa1
    public String toString() {
        return "BrandInfoImage(mWidth=" + this.mWidth + ", mHeight=" + this.mHeight + ", mCompression=" + this.mCompression + ", mPixelFormat=" + this.mPixelFormat + ", hasAlpha=" + this.hasAlpha + ", mImageBuffer=" + Arrays.toString(this.mImageBuffer) + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BrandInfoImage(int r2, int r3, int r4, int r5, int r6, @aa1 byte[] r7) {
        Intrinsics.X0O(r7, "mImageBuffer");
        this.mWidth = r2;
        this.mHeight = r3;
        this.mCompression = r4;
        this.mPixelFormat = r5;
        this.hasAlpha = r6;
        this.mImageBuffer = r7;
    }

    public /* synthetic */ BrandInfoImage(int r2, int r3, int r4, int r5, int r6, byte[] r7, int r8, DefaultConstructorMarker r9) {
        if ((r8 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r8 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r8 & 4) == 0) goto L12;
        r4 = 0;
    L12:
        if ((r8 & 8) == 0) goto L15;
        r5 = 0;
    L15:
        if ((r8 & 16) == 0) goto L18;
        r6 = 0;
    L18:
        if ((r8 & 32) == 0) goto L20;
        r7 = new byte[0];
    L20:
        byte[] r10 = r7;
        int r11 = r6;
        int r12 = r5;
        int r13 = r4;
        this(r2, r3, r13, r12, r11, r10);
    }
}
