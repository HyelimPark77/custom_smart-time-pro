package com.sma.smartv3.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class MaskView extends View {
    public float I1;

    @aa1
    public HollowShape IO;

    @aa1
    public final Paint Ii1iii0;

    @aa1
    public final Paint O001I;
    public int OO;

    @tb1
    public OXO1 OX110i;

    @aa1
    public String X00XIX1;
    public float X0i1O;

    @tb1
    public RectF X100O;

    @aa1
    public final Paint X11I;
    public int X11iII1O1;
    public int X1IX;
    public int XOX0O0;

    @tb1
    public RectF XX1Oi;

    @aa1
    public final Paint XXO;
    public float XXX11i;
    public float iIXi1iiXI;

    @aa1
    public String iOiXi11II;
    public int iX1O1;
    public float iXiX011;

    @aa1
    public final Paint iXiiiO;

    @aa1
    public final Paint iiiO;

    public static final enum HollowShape extends Enum<HollowShape> {
        private static final /* synthetic */ EnumEntries $ENTRIES = null;
        private static final /* synthetic */ HollowShape[] $VALUES = null;
        public static final HollowShape CIRCLE = null;
        public static final HollowShape SQUARE = null;

        private static final /* synthetic */ HollowShape[] $values() {
            return new HollowShape[]{SQUARE, CIRCLE};
        }

        static {
            SQUARE = new HollowShape("SQUARE", 0);
            CIRCLE = new HollowShape("CIRCLE", 1);
            HollowShape[] r0 = $values();
            $VALUES = r0;
            $ENTRIES = EnumEntriesKt.iO(r0);
        }

        private HollowShape(String r1, int r2) {
            super(r1, r2);
        }

        @aa1
        public static EnumEntries<HollowShape> getEntries() {
            return $ENTRIES;
        }

        public static HollowShape valueOf(String r1) {
            return (HollowShape) Enum.valueOf(HollowShape.class, r1);
        }

        public static HollowShape[] values() {
            return (HollowShape[]) $VALUES.clone();
        }
    }

    public static final class OXO1 {
        public final float OXO1;
        public final float XIi00iiXO;
        public final float XO0O10;
        public final float iO;

        public OXO1(float r1, float r2, float r3, float r4) {
            this.OXO1 = r1;
            this.XIi00iiXO = r2;
            this.iO = r3;
            this.XO0O10 = r4;
        }

        public static /* synthetic */ OXO1 IiI10X(OXO1 r0, float r1, float r2, float r3, float r4, int r5, Object r6) {
            if ((r5 & 1) == 0) goto L6;
            r1 = r0.OXO1;
        L6:
            if ((r5 & 2) == 0) goto L9;
            r2 = r0.XIi00iiXO;
        L9:
            if ((r5 & 4) == 0) goto L12;
            r3 = r0.iO;
        L12:
            if ((r5 & 8) == 0) goto L15;
            r4 = r0.XO0O10;
        L15:
            return r0.O00(r1, r2, r3, r4);
        }

        public final float I0IIOi() {
            return (this.OXO1 + this.iO) / 2;
        }

        public final float I0iXXO() {
            return this.iO;
        }

        public final float IO() {
            return this.XO0O10 - this.XIi00iiXO;
        }

        @aa1
        public final OXO1 O00(float r2, float r3, float r4, float r5) {
            return new OXO1(r2, r3, r4, r5);
        }

        public final float OIX0iXi() {
            return this.OXO1;
        }

        public final float OIi0() {
            return (this.XIi00iiXO + this.XO0O10) / 2;
        }

        public final float OXO1() {
            return this.OXO1;
        }

        public final float X1ii() {
            return this.iO - this.OXO1;
        }

        public final float XIi00iiXO() {
            return this.XIi00iiXO;
        }

        public final float XO0O10() {
            return this.XO0O10;
        }

        public final float XOO0ii0() {
            return this.XO0O10;
        }

        public final float XXI() {
            return this.XIi00iiXO;
        }

        public boolean equals(@tb1 Object r5) {
            if (this != r5) goto L6;
            return true;
        L6:
            if ((r5 instanceof OXO1) == true) goto L8;
            return false;
        L8:
            OXO1 r6 = (OXO1) r5;
            if (Float.compare(this.OXO1, r6.OXO1) == 0) goto L12;
            return false;
        L12:
            if (Float.compare(this.XIi00iiXO, r6.XIi00iiXO) == 0) goto L15;
            return false;
        L15:
            if (Float.compare(this.iO, r6.iO) == 0) goto L18;
            return false;
        L18:
            if (Float.compare(this.XO0O10, r6.XO0O10) == 0) goto L20;
            return false;
        L20:
            return true;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.OXO1) * 31) + Float.hashCode(this.XIi00iiXO)) * 31) + Float.hashCode(this.iO)) * 31) + Float.hashCode(this.XO0O10);
        }

        public final float iO() {
            return this.iO;
        }

        @aa1
        public String toString() {
            return "Coordinates(left=" + this.OXO1 + ", top=" + this.XIi00iiXO + ", right=" + this.iO + ", bottom=" + this.XO0O10 + I000IiI1O.iO.iO;
        }
    }

    public static final /* synthetic */ class XIi00iiXO {
        public static final /* synthetic */ int[] OXO1 = null;

        static {
            int[] r0 = new int[HollowShape.values().length];
            r0[HollowShape.SQUARE.ordinal()] = 1;     // Catch: NoSuchFieldError -> L7
        L9:
            r0[HollowShape.CIRCLE.ordinal()] = 2;     // Catch: NoSuchFieldError -> L8
        L5:
            OXO1 = r0;
        }
    }

    @JvmOverloads
    public MaskView(@aa1 Context r8) {
        Intrinsics.X0O(r8, "context");
        AttributeSet r3 = null;
        int r4 = 0;
        this(r8, r3, r4, 6, null);
    }

    public final void OXO1(Canvas r14, OXO1 r15, RectF r16) {
        float r0 = r16.top;
        float r7 = r0 - this.iXiX011;
        float r2 = r0 - this.iIXi1iiXI;
        Rect r8 = new Rect();
        Paint r1 = this.XXO;
        String r3 = this.iOiXi11II;
        r1.getTextBounds(r3, 0, r3.length(), r8);
        float r10 = 2;
        float r4 = r8.width() / r10;
        float r5 = (r15.I0IIOi() - r4) - 60.0f;
        float r12 = (r15.I0IIOi() + r4) + 60.0f;
        float r6 = r16.left;
        if (r5 <= r6) goto L5;
        r14.drawLine(r6, r2, r5, r2, this.Ii1iii0);
    L5:
        float r9 = r16.right;
        if (r12 >= r9) goto L8;
        r14.drawLine(r12, r2, r9, r2, this.Ii1iii0);
    L8:
        float r11 = r16.left;
        float r13 = 15.0f / r10;
        float r17 = r2 - r13;
        float r18 = r2 + r13;
        r14.drawLine(r11, r17, r11, r18, this.iiiO);
        float r19 = r16.right;
        r14.drawLine(r19, r17, r19, r18, this.iiiO);
        r14.drawText(this.iOiXi11II, r15.I0IIOi(), r7, this.XXO);
        float r20 = r16.left;
        float r21 = r20 - this.iXiX011;
        float r22 = r20 - this.iIXi1iiXI;
        r14.save();
        Paint r23 = this.XXO;
        String r24 = this.X00XIX1;
        r23.getTextBounds(r24, 0, r24.length(), r8);
        float r25 = r8.width() / r10;
        float r26 = (r15.OIi0() - r25) - 60.0f;
        float r27 = (r15.OIi0() + r25) + 60.0f;
        float r28 = r16.top;
        if (r26 <= r28) goto L11;
        r14.drawLine(r22, r28, r22, r26, this.Ii1iii0);
    L11:
        float r29 = r16.bottom;
        if (r27 >= r29) goto L14;
        r14.drawLine(r22, r27, r22, r29, this.Ii1iii0);
    L14:
        float r30 = r22 - r13;
        float r31 = r16.top;
        float r32 = r22 + r13;
        r14.drawLine(r30, r31, r32, r31, this.iiiO);
        float r33 = r16.bottom;
        r14.drawLine(r30, r33, r32, r33, this.iiiO);
        r14.translate(r21, r15.OIi0());
        r14.rotate(-90.0f);
        r14.drawText(this.X00XIX1, 0.0f, 0.0f, this.XXO);
        r14.restore();
    }

    public final void XIi00iiXO(int r3, int r4, int r5) {
        this.OO = r3 * 2;
        this.iOiXi11II = "";
        this.X00XIX1 = "";
        float r0 = r4 - r3;
        float r1 = r5 - r3;
        float r6 = r4 + r3;
        float r7 = r5 + r3;
        this.XX1Oi = new RectF(r0, r1, r6, r7);
        this.X100O = null;
        this.OX110i = new OXO1(r0, r1, r6, r7);
        invalidate();
    }

    public final int getBorderColor() {
        return this.X11iII1O1;
    }

    public final float getBorderWidth() {
        return this.XXX11i;
    }

    @tb1
    public final OXO1 getCoordinates() {
        return this.OX110i;
    }

    public final float getCornerRadius() {
        return this.I1;
    }

    public final float getGuideLineOffset() {
        return this.iIXi1iiXI;
    }

    @aa1
    public final HollowShape getHollowShape() {
        return this.IO;
    }

    public final int getMaskColor() {
        return this.iX1O1;
    }

    @aa1
    public final String getNorthText() {
        return this.iOiXi11II;
    }

    public final int getTextColor() {
        return this.X1IX;
    }

    public final float getTextMargin() {
        return this.iXiX011;
    }

    public final float getTextSize() {
        return this.X0i1O;
    }

    @aa1
    public final String getWestText() {
        return this.X00XIX1;
    }

    public final void iO(int r2, int r3) {
        this.OO = r2;
        this.XOX0O0 = r3;
        setHollowShape(HollowShape.SQUARE);
        this.iOiXi11II = "";
        this.X00XIX1 = "";
        float r4 = r3;
        float r5 = r2 + r4;
        this.X100O = new RectF(r4, r4, r5, r5);
        this.XX1Oi = null;
        this.OX110i = new OXO1(r4, r4, r5, r5);
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(@aa1 Canvas r8) {
        Intrinsics.X0O(r8, "canvas");
        super.onDraw(r8);
        int r9 = r8.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
        r8.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.O001I);
        this.O001I.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        HollowShape r1 = this.IO;
        int[] r2 = XIi00iiXO.OXO1;
        int r3 = r2[r1.ordinal()];
        if (r3 == 1) goto L10;
        if (r3 != 2) goto L9;
        RectF r4 = this.XX1Oi;
        if (r4 == null) goto L13;
        r8.drawOval(r4, this.O001I);
    L13:
        this.O001I.setXfermode(null);
        r8.restoreToCount(r9);
        int r10 = r2[this.IO.ordinal()];
        if (r10 == 1) goto L24;
        if (r10 != 2) goto L23;
        RectF r11 = this.XX1Oi;
        if (r11 == null) goto L30;
        r8.drawOval(r11, this.iXiiiO);
        OXO1 r5 = this.OX110i;
        if (r5 == null) goto L31;
        OXO1(r8, r5, r11);
        return;
    L31:
        return;
    L30:
        return;
    L23:
        throw new NoWhenBranchMatchedException();
    L24:
        RectF r12 = this.X100O;
        if (r12 == null) goto L32;
        float r6 = this.I1;
        r8.drawRoundRect(r12, r6, r6, this.iXiiiO);
        OXO1 r7 = this.OX110i;
        if (r7 == null) goto L33;
        OXO1(r8, r7, r12);
        return;
    L33:
        return;
    L32:
        return;
    L9:
        throw new NoWhenBranchMatchedException();
    L10:
        RectF r13 = this.X100O;
        if (r13 == null) goto L13;
        float r14 = this.I1;
        r8.drawRoundRect(r13, r14, r14, this.O001I);
        goto L13
    }

    public final void setBorderColor(int r2) {
        this.X11iII1O1 = r2;
        this.iXiiiO.setColor(r2);
        this.Ii1iii0.setColor(r2);
        this.iiiO.setColor(r2);
        invalidate();
    }

    public final void setBorderWidth(float r2) {
        this.XXX11i = r2;
        this.iXiiiO.setStrokeWidth(r2);
        this.Ii1iii0.setStrokeWidth(r2);
        invalidate();
    }

    public final void setCircleHollow(int r3) {
        XIi00iiXO(r3, getWidth() / 2, getHeight() / 2);
    }

    public final void setCornerRadius(float r1) {
        this.I1 = r1;
        invalidate();
    }

    public final void setDirectionsText(@aa1 String r2) {
        Intrinsics.X0O(r2, "str");
        this.iOiXi11II = r2;
        this.X00XIX1 = r2;
        invalidate();
    }

    public final void setGuideLineOffset(float r1) {
        this.iIXi1iiXI = r1;
        invalidate();
    }

    public final void setHollowShape(@aa1 HollowShape r2) {
        Intrinsics.X0O(r2, "value");
        this.IO = r2;
        invalidate();
    }

    public final void setMaskColor(int r2) {
        this.iX1O1 = r2;
        this.O001I.setColor(r2);
        invalidate();
    }

    public final void setNorthText(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.iOiXi11II = r2;
    }

    public final void setTextColor(int r2) {
        this.X1IX = r2;
        this.XXO.setColor(r2);
        invalidate();
    }

    public final void setTextMargin(float r1) {
        this.iXiX011 = r1;
        invalidate();
    }

    public final void setTextSize(float r2) {
        this.X0i1O = r2;
        this.XXO.setTextSize(r2);
        invalidate();
    }

    public final void setWestText(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.X00XIX1 = r2;
    }

    @JvmOverloads
    public MaskView(@aa1 Context r8, @tb1 AttributeSet r9) {
        Intrinsics.X0O(r8, "context");
        int r4 = 0;
        this(r8, r9, r4, 4, null);
    }

    @JvmOverloads
    public MaskView(@aa1 Context r13, @tb1 AttributeSet r14, int r15) {
        Intrinsics.X0O(r13, "context");
        super(r13, r14, r15);
        HollowShape r16 = HollowShape.SQUARE;
        this.IO = r16;
        this.I1 = 16.0f;
        this.iX1O1 = Color.parseColor("#80000000");
        this.X11iII1O1 = Color.parseColor("#2878FD");
        this.XXX11i = 3.0f;
        this.X1IX = -1;
        this.X0i1O = 42.0f;
        this.iIXi1iiXI = 40.0f;
        this.iXiX011 = 30.0f;
        Paint r8 = new Paint();
        r8.setColor(this.iX1O1);
        r8.setAntiAlias(true);
        this.O001I = r8;
        Paint r9 = new Paint();
        r9.setColor(this.X1IX);
        r9.setTextSize(42.0f);
        r9.setAntiAlias(true);
        r9.setTextAlign(Paint.Align.CENTER);
        this.XXO = r9;
        Paint r10 = new Paint();
        r10.setColor(this.X11iII1O1);
        Paint.Style r11 = Paint.Style.STROKE;
        r10.setStyle(r11);
        r10.setStrokeWidth(this.XXX11i);
        r10.setAntiAlias(true);
        this.iXiiiO = r10;
        Paint r12 = new Paint();
        r12.setColor(this.X11iII1O1);
        r12.setStyle(r11);
        r12.setStrokeWidth(this.XXX11i);
        r12.setAntiAlias(true);
        this.Ii1iii0 = r12;
        Paint r17 = new Paint();
        r17.setColor(this.X11iII1O1);
        r17.setStyle(r11);
        r17.setStrokeWidth(4.0f);
        r17.setAntiAlias(true);
        this.iiiO = r17;
        Paint r18 = new Paint();
        r18.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        r18.setAntiAlias(true);
        this.X11I = r18;
        this.OO = 300;
        this.XOX0O0 = 50;
        if (r14 == null) goto L14;
        TypedArray r19 = r13.obtainStyledAttributes(r14, R.styleable.MapMaskView);
        Intrinsics.O10IXXX0X(r19, "obtainStyledAttributes(...)");
    L8:
        th = move-exception;
        r19.recycle();
        throw th;
    L6:
        if (r19.getInt(5, 0) != 1) goto L10;
        r16 = HollowShape.CIRCLE;     // Catch: Throwable -> L8
    L10:
        setHollowShape(r16);     // Catch: Throwable -> L8
        setCornerRadius(r19.getDimension(3, 16.0f));     // Catch: Throwable -> L8
        setMaskColor(r19.getColor(0, Color.parseColor("#80000000")));     // Catch: Throwable -> L8
        setBorderColor(r19.getColor(1, Color.parseColor("#2878FD")));     // Catch: Throwable -> L8
        setBorderWidth(r19.getDimension(2, 3.0f));     // Catch: Throwable -> L8
        setTextColor(r19.getColor(6, -1));     // Catch: Throwable -> L8
        setTextSize(r19.getDimension(8, 42.0f));     // Catch: Throwable -> L8
        setGuideLineOffset(r19.getDimension(4, 40.0f));     // Catch: Throwable -> L8
        setTextMargin(r19.getDimension(7, 30.0f));     // Catch: Throwable -> L8
        r19.recycle();
    L14:
        this.iOiXi11II = "";
        this.X00XIX1 = "";
    }

    public /* synthetic */ MaskView(Context r1, AttributeSet r2, int r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = null;
    L6:
        if ((r4 & 4) == 0) goto L8;
        r3 = 0;
    L8:
        this(r1, r2, r3);
    }
}
