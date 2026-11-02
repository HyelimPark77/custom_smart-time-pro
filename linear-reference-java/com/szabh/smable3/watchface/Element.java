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
    private final int h;
    private final int hasAlpha;
    private final int ignoreBlack;

    @aa1
    private final byte[][] imageBuffers;
    private final int leftOffset;
    private final int playInterval;
    private final int type;
    private final int w;
    private final int x;
    private final int y;

    public Element() {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        int r5 = 0;
        int r6 = 0;
        int r7 = 0;
        int r8 = 0;
        int r9 = 0;
        int r10 = 0;
        int r11 = 0;
        byte[][] r12 = null;
        this(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, bo0.iO, null);
    }

    public static /* synthetic */ Element copy$default(Element r0, int r1, int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, int r10, int r11, byte[][] r12, int r13, Object r14) {
        if ((r13 & 1) == 0) goto L6;
        r1 = r0.type;
    L6:
        if ((r13 & 2) == 0) goto L9;
        r2 = r0.hasAlpha;
    L9:
        if ((r13 & 4) == 0) goto L12;
        r3 = r0.w;
    L12:
        if ((r13 & 8) == 0) goto L15;
        r4 = r0.h;
    L15:
        if ((r13 & 16) == 0) goto L18;
        r5 = r0.gravity;
    L18:
        if ((r13 & 32) == 0) goto L21;
        r6 = r0.ignoreBlack;
    L21:
        if ((r13 & 64) == 0) goto L24;
        r7 = r0.x;
    L24:
        if ((r13 & 128) == 0) goto L27;
        r8 = r0.y;
    L27:
        if ((r13 & 256) == 0) goto L30;
        r9 = r0.playInterval;
    L30:
        if ((r13 & 512) == 0) goto L33;
        r10 = r0.bottomOffset;
    L33:
        if ((r13 & 1024) == 0) goto L36;
        r11 = r0.leftOffset;
    L36:
        if ((r13 & 2048) == 0) goto L38;
        r12 = r0.imageBuffers;
    L38:
        int r15 = r11;
        byte[][] r16 = r12;
        int r17 = r9;
        int r18 = r10;
        int r19 = r7;
        int r110 = r8;
        int r20 = r5;
        int r21 = r6;
        int r22 = r3;
        int r23 = r4;
        return r0.copy(r1, r2, r22, r23, r20, r21, r19, r110, r17, r18, r15, r16);
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
        return this.w;
    }

    public final int component4() {
        return this.h;
    }

    public final int component5() {
        return this.gravity;
    }

    public final int component6() {
        return this.ignoreBlack;
    }

    public final int component7() {
        return this.x;
    }

    public final int component8() {
        return this.y;
    }

    public final int component9() {
        return this.playInterval;
    }

    @aa1
    public final Element copy(int r15, int r16, int r17, int r18, int r19, int r20, int r21, int r22, int r23, int r24, int r25, @aa1 byte[][] r26) {
        Intrinsics.X0O(r26, "imageBuffers");
        return new Element(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26);
    }

    public boolean equals(@tb1 Object r5) {
        if (this != r5) goto L5;
        return true;
    L5:
        if (r5 == null) goto L7;
        Class<?> r1 = r5.getClass();
    L9:
        if (Intrinsics.XOO0ii0(Element.class, r1) == true) goto L11;
        return false;
    L11:
        Intrinsics.X1ii(r5, "null cannot be cast to non-null type com.szabh.smable3.watchface.Element");
        Element r6 = (Element) r5;
        if (this.type == r6.type) goto L15;
        return false;
    L15:
        if (this.hasAlpha == r6.hasAlpha) goto L18;
        return false;
    L18:
        if (this.w == r6.w) goto L21;
        return false;
    L21:
        if (this.h == r6.h) goto L24;
        return false;
    L24:
        if (this.gravity == r6.gravity) goto L27;
        return false;
    L27:
        if (this.ignoreBlack == r6.ignoreBlack) goto L30;
        return false;
    L30:
        if (this.x == r6.x) goto L33;
        return false;
    L33:
        if (this.y == r6.y) goto L36;
        return false;
    L36:
        if (this.playInterval == r6.playInterval) goto L39;
        return false;
    L39:
        if (this.bottomOffset == r6.bottomOffset) goto L42;
        return false;
    L42:
        if (this.leftOffset == r6.leftOffset) goto L45;
        return false;
    L45:
        if (iiIXIii.XOO0ii0(this.imageBuffers, r6.imageBuffers) == true) goto L47;
        return false;
    L47:
        return true;
    L7:
        r1 = null;
        goto L9
    }

    public final int getBottomOffset() {
        return this.bottomOffset;
    }

    public final int getGravity() {
        return this.gravity;
    }

    public final int getH() {
        return this.h;
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
        return this.w;
    }

    public final int getX() {
        return this.x;
    }

    public final int getY() {
        return this.y;
    }

    public int hashCode() {
        return (((((((((((((((((((((this.type * 31) + this.hasAlpha) * 31) + this.w) * 31) + this.h) * 31) + this.gravity) * 31) + this.ignoreBlack) * 31) + this.x) * 31) + this.y) * 31) + this.playInterval) * 31) + this.bottomOffset) * 31) + this.leftOffset) * 31) + OOXXi.XIi00iiXO(this.imageBuffers);
    }

    @aa1
    public String toString() {
        return "Element(type=" + this.type + ", hasAlpha=" + this.hasAlpha + ", w=" + this.w + ", h=" + this.h + ", gravity=" + this.gravity + ", ignoreBlack=" + this.ignoreBlack + ", x=" + this.x + ", y=" + this.y + ", playInterval=" + this.playInterval + ", bottomOffset=" + this.bottomOffset + ", leftOffset=" + this.leftOffset + ", imageBuffers=" + Arrays.toString(this.imageBuffers) + HexStringBuilder.COMMENT_END_CHAR;
    }

    public Element(int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, int r10, int r11, int r12, @aa1 byte[][] r13) {
        Intrinsics.X0O(r13, "imageBuffers");
        this.type = r2;
        this.hasAlpha = r3;
        this.w = r4;
        this.h = r5;
        this.gravity = r6;
        this.ignoreBlack = r7;
        this.x = r8;
        this.y = r9;
        this.playInterval = r10;
        this.bottomOffset = r11;
        this.leftOffset = r12;
        this.imageBuffers = r13;
    }

    public /* synthetic */ Element(int r2, int r3, int r4, int r5, int r6, int r7, int r8, int r9, int r10, int r11, int r12, byte[][] r13, int r14, DefaultConstructorMarker r15) {
        if ((r14 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r14 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r14 & 4) == 0) goto L12;
        r4 = 0;
    L12:
        if ((r14 & 8) == 0) goto L15;
        r5 = 0;
    L15:
        if ((r14 & 16) == 0) goto L18;
        r6 = 0;
    L18:
        if ((r14 & 32) == 0) goto L21;
        r7 = 0;
    L21:
        if ((r14 & 64) == 0) goto L24;
        r8 = 0;
    L24:
        if ((r14 & 128) == 0) goto L27;
        r9 = 0;
    L27:
        if ((r14 & 256) == 0) goto L30;
        r10 = 0;
    L30:
        if ((r14 & 512) == 0) goto L33;
        r11 = 0;
    L33:
        if ((r14 & 1024) == 0) goto L36;
        r12 = 0;
    L36:
        if ((r14 & 2048) == 0) goto L38;
        r13 = new byte[0][];
    L38:
        byte[][] r16 = r13;
        int r17 = r12;
        int r18 = r11;
        int r19 = r10;
        int r110 = r9;
        int r20 = r8;
        int r21 = r7;
        int r22 = r6;
        int r23 = r5;
        int r24 = r4;
        this(r2, r3, r24, r23, r22, r21, r20, r110, r19, r18, r17, r16);
    }
}
