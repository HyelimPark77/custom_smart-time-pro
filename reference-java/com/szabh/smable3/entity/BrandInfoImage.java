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
        this(0, 0, 0, 0, 0, null, 63, null);
    }

    public static /* synthetic */ BrandInfoImage copy$default(BrandInfoImage brandInfoImage, int i, int i2, int i3, int i4, int i5, byte[] bArr, int i6, Object obj) {
        if ((i6 & 1) != 0) {
            i = brandInfoImage.mWidth;
        }
        if ((i6 & 2) != 0) {
            i2 = brandInfoImage.mHeight;
        }
        if ((i6 & 4) != 0) {
            i3 = brandInfoImage.mCompression;
        }
        if ((i6 & 8) != 0) {
            i4 = brandInfoImage.mPixelFormat;
        }
        if ((i6 & 16) != 0) {
            i5 = brandInfoImage.hasAlpha;
        }
        if ((i6 & 32) != 0) {
            bArr = brandInfoImage.mImageBuffer;
        }
        int i7 = i5;
        byte[] bArr2 = bArr;
        return brandInfoImage.copy(i, i2, i3, i4, i7, bArr2);
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
    public final BrandInfoImage copy(int i, int i2, int i3, int i4, int i5, @aa1 byte[] mImageBuffer) {
        Intrinsics.X0O(mImageBuffer, "mImageBuffer");
        return new BrandInfoImage(i, i2, i3, i4, i5, mImageBuffer);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BrandInfoImage)) {
            return false;
        }
        BrandInfoImage brandInfoImage = (BrandInfoImage) obj;
        return this.mWidth == brandInfoImage.mWidth && this.mHeight == brandInfoImage.mHeight && this.mCompression == brandInfoImage.mCompression && this.mPixelFormat == brandInfoImage.mPixelFormat && this.hasAlpha == brandInfoImage.hasAlpha && Intrinsics.XOO0ii0(this.mImageBuffer, brandInfoImage.mImageBuffer);
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

    public final void setHasAlpha(int i) {
        this.hasAlpha = i;
    }

    public final void setMCompression(int i) {
        this.mCompression = i;
    }

    public final void setMHeight(int i) {
        this.mHeight = i;
    }

    public final void setMImageBuffer(@aa1 byte[] bArr) {
        Intrinsics.X0O(bArr, "<set-?>");
        this.mImageBuffer = bArr;
    }

    public final void setMPixelFormat(int i) {
        this.mPixelFormat = i;
    }

    public final void setMWidth(int i) {
        this.mWidth = i;
    }

    @aa1
    public String toString() {
        return "BrandInfoImage(mWidth=" + this.mWidth + ", mHeight=" + this.mHeight + ", mCompression=" + this.mCompression + ", mPixelFormat=" + this.mPixelFormat + ", hasAlpha=" + this.hasAlpha + ", mImageBuffer=" + Arrays.toString(this.mImageBuffer) + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BrandInfoImage(int i, int i2, int i3, int i4, int i5, @aa1 byte[] mImageBuffer) {
        Intrinsics.X0O(mImageBuffer, "mImageBuffer");
        this.mWidth = i;
        this.mHeight = i2;
        this.mCompression = i3;
        this.mPixelFormat = i4;
        this.hasAlpha = i5;
        this.mImageBuffer = mImageBuffer;
    }

    public /* synthetic */ BrandInfoImage(int i, int i2, int i3, int i4, int i5, byte[] bArr, int i6, DefaultConstructorMarker defaultConstructorMarker) {
        this((i6 & 1) != 0 ? 0 : i, (i6 & 2) != 0 ? 0 : i2, (i6 & 4) != 0 ? 0 : i3, (i6 & 8) != 0 ? 0 : i4, (i6 & 16) != 0 ? 0 : i5, (i6 & 32) != 0 ? new byte[0] : bArr);
    }
}
