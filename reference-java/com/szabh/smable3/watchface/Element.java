package com.szabh.smable3.watchface;

import com.android.mltcode.paycertificationapi.OOXXi;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.bo0;
import com.android.mltcode.paycertificationapi.iiIXIii;
import com.android.mltcode.paycertificationapi.tb1;
import com.goodix.ble.libcomx.util.HexStringBuilder;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class Element {
    private final int bottomOffset;
    private final int gravity;

    /* JADX INFO: renamed from: h */
    private final int f55354h;
    private final int hasAlpha;
    private final int ignoreBlack;

    @aa1
    private final byte[][] imageBuffers;
    private final int leftOffset;
    private final int playInterval;
    private final int type;

    /* JADX INFO: renamed from: w */
    private final int f55355w;

    /* JADX INFO: renamed from: x */
    private final int f55356x;

    /* JADX INFO: renamed from: y */
    private final int f55357y;

    public Element() {
        this(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, bo0.f5772iO, null);
    }

    public static /* synthetic */ Element copy$default(Element element, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, byte[][] bArr, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i = element.type;
        }
        if ((i12 & 2) != 0) {
            i2 = element.hasAlpha;
        }
        if ((i12 & 4) != 0) {
            i3 = element.f55355w;
        }
        if ((i12 & 8) != 0) {
            i4 = element.f55354h;
        }
        if ((i12 & 16) != 0) {
            i5 = element.gravity;
        }
        if ((i12 & 32) != 0) {
            i6 = element.ignoreBlack;
        }
        if ((i12 & 64) != 0) {
            i7 = element.f55356x;
        }
        if ((i12 & 128) != 0) {
            i8 = element.f55357y;
        }
        if ((i12 & 256) != 0) {
            i9 = element.playInterval;
        }
        if ((i12 & 512) != 0) {
            i10 = element.bottomOffset;
        }
        if ((i12 & 1024) != 0) {
            i11 = element.leftOffset;
        }
        if ((i12 & 2048) != 0) {
            bArr = element.imageBuffers;
        }
        int i13 = i11;
        byte[][] bArr2 = bArr;
        int i14 = i9;
        int i15 = i10;
        int i16 = i7;
        int i17 = i8;
        int i18 = i5;
        int i19 = i6;
        return element.copy(i, i2, i3, i4, i18, i19, i16, i17, i14, i15, i13, bArr2);
    }

    public final int component1() {
        return this.type;
    }

    public final int component10() {
        return this.bottomOffset;
    }

    public final int component11() {
        return this.leftOffset;
    }

    @aa1
    public final byte[][] component12() {
        return this.imageBuffers;
    }

    public final int component2() {
        return this.hasAlpha;
    }

    public final int component3() {
        return this.f55355w;
    }

    public final int component4() {
        return this.f55354h;
    }

    public final int component5() {
        return this.gravity;
    }

    public final int component6() {
        return this.ignoreBlack;
    }

    public final int component7() {
        return this.f55356x;
    }

    public final int component8() {
        return this.f55357y;
    }

    public final int component9() {
        return this.playInterval;
    }

    @aa1
    public final Element copy(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, @aa1 byte[][] imageBuffers) {
        Intrinsics.X0O(imageBuffers, "imageBuffers");
        return new Element(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, imageBuffers);
    }

    public boolean equals(@tb1 Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.XOO0ii0(Element.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.X1ii(obj, "null cannot be cast to non-null type com.szabh.smable3.watchface.Element");
        Element element = (Element) obj;
        return this.type == element.type && this.hasAlpha == element.hasAlpha && this.f55355w == element.f55355w && this.f55354h == element.f55354h && this.gravity == element.gravity && this.ignoreBlack == element.ignoreBlack && this.f55356x == element.f55356x && this.f55357y == element.f55357y && this.playInterval == element.playInterval && this.bottomOffset == element.bottomOffset && this.leftOffset == element.leftOffset && iiIXIii.XOO0ii0(this.imageBuffers, element.imageBuffers);
    }

    public final int getBottomOffset() {
        return this.bottomOffset;
    }

    public final int getGravity() {
        return this.gravity;
    }

    public final int getH() {
        return this.f55354h;
    }

    public final int getHasAlpha() {
        return this.hasAlpha;
    }

    public final int getIgnoreBlack() {
        return this.ignoreBlack;
    }

    @aa1
    public final byte[][] getImageBuffers() {
        return this.imageBuffers;
    }

    public final int getLeftOffset() {
        return this.leftOffset;
    }

    public final int getPlayInterval() {
        return this.playInterval;
    }

    public final int getType() {
        return this.type;
    }

    public final int getW() {
        return this.f55355w;
    }

    public final int getX() {
        return this.f55356x;
    }

    public final int getY() {
        return this.f55357y;
    }

    public int hashCode() {
        return (((((((((((((((((((((this.type * 31) + this.hasAlpha) * 31) + this.f55355w) * 31) + this.f55354h) * 31) + this.gravity) * 31) + this.ignoreBlack) * 31) + this.f55356x) * 31) + this.f55357y) * 31) + this.playInterval) * 31) + this.bottomOffset) * 31) + this.leftOffset) * 31) + OOXXi.XIi00iiXO(this.imageBuffers);
    }

    @aa1
    public String toString() {
        return "Element(type=" + this.type + ", hasAlpha=" + this.hasAlpha + ", w=" + this.f55355w + ", h=" + this.f55354h + ", gravity=" + this.gravity + ", ignoreBlack=" + this.ignoreBlack + ", x=" + this.f55356x + ", y=" + this.f55357y + ", playInterval=" + this.playInterval + ", bottomOffset=" + this.bottomOffset + ", leftOffset=" + this.leftOffset + ", imageBuffers=" + Arrays.toString(this.imageBuffers) + HexStringBuilder.COMMENT_END_CHAR;
    }

    public Element(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, @aa1 byte[][] imageBuffers) {
        Intrinsics.X0O(imageBuffers, "imageBuffers");
        this.type = i;
        this.hasAlpha = i2;
        this.f55355w = i3;
        this.f55354h = i4;
        this.gravity = i5;
        this.ignoreBlack = i6;
        this.f55356x = i7;
        this.f55357y = i8;
        this.playInterval = i9;
        this.bottomOffset = i10;
        this.leftOffset = i11;
        this.imageBuffers = imageBuffers;
    }

    public /* synthetic */ Element(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, byte[][] bArr, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0 : i, (i12 & 2) != 0 ? 0 : i2, (i12 & 4) != 0 ? 0 : i3, (i12 & 8) != 0 ? 0 : i4, (i12 & 16) != 0 ? 0 : i5, (i12 & 32) != 0 ? 0 : i6, (i12 & 64) != 0 ? 0 : i7, (i12 & 128) != 0 ? 0 : i8, (i12 & 256) != 0 ? 0 : i9, (i12 & 512) != 0 ? 0 : i10, (i12 & 1024) != 0 ? 0 : i11, (i12 & 2048) != 0 ? new byte[0][] : bArr);
    }
}
