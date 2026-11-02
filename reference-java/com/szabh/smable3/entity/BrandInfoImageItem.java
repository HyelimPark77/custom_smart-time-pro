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

    /* JADX INFO: renamed from: mX */
    private int f55348mX;

    /* JADX INFO: renamed from: mY */
    private int f55349mY;

    public BrandInfoImageItem() {
        this(0, 0, 0, 0, null, 31, null);
    }

    public static /* synthetic */ BrandInfoImageItem copy$default(BrandInfoImageItem brandInfoImageItem, int i, int i2, int i3, int i4, BrandInfoImage[] brandInfoImageArr, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = brandInfoImageItem.f55348mX;
        }
        if ((i5 & 2) != 0) {
            i2 = brandInfoImageItem.f55349mY;
        }
        if ((i5 & 4) != 0) {
            i3 = brandInfoImageItem.mAnchor;
        }
        if ((i5 & 8) != 0) {
            i4 = brandInfoImageItem.mPlayInterval;
        }
        if ((i5 & 16) != 0) {
            brandInfoImageArr = brandInfoImageItem.mImageInfos;
        }
        BrandInfoImage[] brandInfoImageArr2 = brandInfoImageArr;
        int i6 = i3;
        return brandInfoImageItem.copy(i, i2, i6, i4, brandInfoImageArr2);
    }

    public final int component1() {
        return this.f55348mX;
    }

    public final int component2() {
        return this.f55349mY;
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
    public final BrandInfoImageItem copy(int i, int i2, int i3, int i4, @aa1 BrandInfoImage[] mImageInfos) {
        Intrinsics.X0O(mImageInfos, "mImageInfos");
        return new BrandInfoImageItem(i, i2, i3, i4, mImageInfos);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BrandInfoImageItem)) {
            return false;
        }
        BrandInfoImageItem brandInfoImageItem = (BrandInfoImageItem) obj;
        return this.f55348mX == brandInfoImageItem.f55348mX && this.f55349mY == brandInfoImageItem.f55349mY && this.mAnchor == brandInfoImageItem.mAnchor && this.mPlayInterval == brandInfoImageItem.mPlayInterval && Intrinsics.XOO0ii0(this.mImageInfos, brandInfoImageItem.mImageInfos);
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
        return this.f55348mX;
    }

    public final int getMY() {
        return this.f55349mY;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.f55348mX) * 31) + Integer.hashCode(this.f55349mY)) * 31) + Integer.hashCode(this.mAnchor)) * 31) + Integer.hashCode(this.mPlayInterval)) * 31) + Arrays.hashCode(this.mImageInfos);
    }

    public final void setMAnchor(int i) {
        this.mAnchor = i;
    }

    public final void setMImageInfos(@aa1 BrandInfoImage[] brandInfoImageArr) {
        Intrinsics.X0O(brandInfoImageArr, "<set-?>");
        this.mImageInfos = brandInfoImageArr;
    }

    public final void setMPlayInterval(int i) {
        this.mPlayInterval = i;
    }

    public final void setMX(int i) {
        this.f55348mX = i;
    }

    public final void setMY(int i) {
        this.f55349mY = i;
    }

    @aa1
    public String toString() {
        return "BrandInfoImageItem(mX=" + this.f55348mX + ", mY=" + this.f55349mY + ", mAnchor=" + this.mAnchor + ", mPlayInterval=" + this.mPlayInterval + ", mImageInfos=" + Arrays.toString(this.mImageInfos) + HexStringBuilder.COMMENT_END_CHAR;
    }

    public BrandInfoImageItem(int i, int i2, int i3, int i4, @aa1 BrandInfoImage[] mImageInfos) {
        Intrinsics.X0O(mImageInfos, "mImageInfos");
        this.f55348mX = i;
        this.f55349mY = i2;
        this.mAnchor = i3;
        this.mPlayInterval = i4;
        this.mImageInfos = mImageInfos;
    }

    public /* synthetic */ BrandInfoImageItem(int i, int i2, int i3, int i4, BrandInfoImage[] brandInfoImageArr, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? 0 : i2, (i5 & 4) != 0 ? 0 : i3, (i5 & 8) != 0 ? 0 : i4, (i5 & 16) != 0 ? new BrandInfoImage[0] : brandInfoImageArr);
    }
}
