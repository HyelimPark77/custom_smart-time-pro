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
import com.sma.smartv3.C15429R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class MaskView extends View {

    /* JADX INFO: renamed from: I1 */
    public float f55002I1;

    /* JADX INFO: renamed from: IO */
    @aa1
    public HollowShape f55003IO;

    @aa1
    public final Paint Ii1iii0;

    @aa1
    public final Paint O001I;

    /* JADX INFO: renamed from: OO */
    public int f55004OO;

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

    public enum HollowShape {
        SQUARE,
        CIRCLE;

        private static final /* synthetic */ EnumEntries $ENTRIES = EnumEntriesKt.m39477iO(values());

        @aa1
        public static EnumEntries<HollowShape> getEntries() {
            return $ENTRIES;
        }
    }

    public static final class OXO1 {
        public final float OXO1;
        public final float XIi00iiXO;
        public final float XO0O10;

        /* JADX INFO: renamed from: iO */
        public final float f55005iO;

        public OXO1(float f, float f2, float f3, float f4) {
            this.OXO1 = f;
            this.XIi00iiXO = f2;
            this.f55005iO = f3;
            this.XO0O10 = f4;
        }

        public static /* synthetic */ OXO1 IiI10X(OXO1 oxo1, float f, float f2, float f3, float f4, int i, Object obj) {
            if ((i & 1) != 0) {
                f = oxo1.OXO1;
            }
            if ((i & 2) != 0) {
                f2 = oxo1.XIi00iiXO;
            }
            if ((i & 4) != 0) {
                f3 = oxo1.f55005iO;
            }
            if ((i & 8) != 0) {
                f4 = oxo1.XO0O10;
            }
            return oxo1.O00(f, f2, f3, f4);
        }

        public final float I0IIOi() {
            return (this.OXO1 + this.f55005iO) / 2;
        }

        public final float I0iXXO() {
            return this.f55005iO;
        }

        /* JADX INFO: renamed from: IO */
        public final float m38893IO() {
            return this.XO0O10 - this.XIi00iiXO;
        }

        @aa1
        public final OXO1 O00(float f, float f2, float f3, float f4) {
            return new OXO1(f, f2, f3, f4);
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
            return this.f55005iO - this.OXO1;
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

        public boolean equals(@tb1 Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OXO1)) {
                return false;
            }
            OXO1 oxo1 = (OXO1) obj;
            return Float.compare(this.OXO1, oxo1.OXO1) == 0 && Float.compare(this.XIi00iiXO, oxo1.XIi00iiXO) == 0 && Float.compare(this.f55005iO, oxo1.f55005iO) == 0 && Float.compare(this.XO0O10, oxo1.XO0O10) == 0;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.OXO1) * 31) + Float.hashCode(this.XIi00iiXO)) * 31) + Float.hashCode(this.f55005iO)) * 31) + Float.hashCode(this.XO0O10);
        }

        /* JADX INFO: renamed from: iO */
        public final float m38894iO() {
            return this.f55005iO;
        }

        @aa1
        public String toString() {
            return "Coordinates(left=" + this.OXO1 + ", top=" + this.XIi00iiXO + ", right=" + this.f55005iO + ", bottom=" + this.XO0O10 + I000IiI1O.C2156iO.f1007iO;
        }
    }

    public static final /* synthetic */ class XIi00iiXO {
        public static final /* synthetic */ int[] OXO1;

        static {
            int[] iArr = new int[HollowShape.values().length];
            try {
                iArr[HollowShape.SQUARE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[HollowShape.CIRCLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            OXO1 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MaskView(@aa1 Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.X0O(context, "context");
    }

    public final void OXO1(Canvas canvas, OXO1 oxo1, RectF rectF) {
        float f = rectF.top;
        float f2 = f - this.iXiX011;
        float f3 = f - this.iIXi1iiXI;
        Rect rect = new Rect();
        Paint paint = this.XXO;
        String str = this.iOiXi11II;
        paint.getTextBounds(str, 0, str.length(), rect);
        float f4 = 2;
        float fWidth = rect.width() / f4;
        float fI0IIOi = (oxo1.I0IIOi() - fWidth) - 60.0f;
        float fI0IIOi2 = oxo1.I0IIOi() + fWidth + 60.0f;
        float f5 = rectF.left;
        if (fI0IIOi > f5) {
            canvas.drawLine(f5, f3, fI0IIOi, f3, this.Ii1iii0);
        }
        float f6 = rectF.right;
        if (fI0IIOi2 < f6) {
            canvas.drawLine(fI0IIOi2, f3, f6, f3, this.Ii1iii0);
        }
        float f7 = rectF.left;
        float f8 = 15.0f / f4;
        float f9 = f3 - f8;
        float f10 = f3 + f8;
        canvas.drawLine(f7, f9, f7, f10, this.iiiO);
        float f11 = rectF.right;
        canvas.drawLine(f11, f9, f11, f10, this.iiiO);
        canvas.drawText(this.iOiXi11II, oxo1.I0IIOi(), f2, this.XXO);
        float f12 = rectF.left;
        float f13 = f12 - this.iXiX011;
        float f14 = f12 - this.iIXi1iiXI;
        canvas.save();
        Paint paint2 = this.XXO;
        String str2 = this.X00XIX1;
        paint2.getTextBounds(str2, 0, str2.length(), rect);
        float fWidth2 = rect.width() / f4;
        float fOIi0 = (oxo1.OIi0() - fWidth2) - 60.0f;
        float fOIi1 = oxo1.OIi0() + fWidth2 + 60.0f;
        float f15 = rectF.top;
        if (fOIi0 > f15) {
            canvas.drawLine(f14, f15, f14, fOIi0, this.Ii1iii0);
        }
        float f16 = rectF.bottom;
        if (fOIi1 < f16) {
            canvas.drawLine(f14, fOIi1, f14, f16, this.Ii1iii0);
        }
        float f17 = f14 - f8;
        float f18 = rectF.top;
        float f19 = f14 + f8;
        canvas.drawLine(f17, f18, f19, f18, this.iiiO);
        float f20 = rectF.bottom;
        canvas.drawLine(f17, f20, f19, f20, this.iiiO);
        canvas.translate(f13, oxo1.OIi0());
        canvas.rotate(-90.0f);
        canvas.drawText(this.X00XIX1, 0.0f, 0.0f, this.XXO);
        canvas.restore();
    }

    public final void XIi00iiXO(int i, int i2, int i3) {
        this.f55004OO = i * 2;
        this.iOiXi11II = "";
        this.X00XIX1 = "";
        float f = i2 - i;
        float f2 = i3 - i;
        float f3 = i2 + i;
        float f4 = i3 + i;
        this.XX1Oi = new RectF(f, f2, f3, f4);
        this.X100O = null;
        this.OX110i = new OXO1(f, f2, f3, f4);
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
        return this.f55002I1;
    }

    public final float getGuideLineOffset() {
        return this.iIXi1iiXI;
    }

    @aa1
    public final HollowShape getHollowShape() {
        return this.f55003IO;
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

    /* JADX INFO: renamed from: iO */
    public final void m38892iO(int i, int i2) {
        this.f55004OO = i;
        this.XOX0O0 = i2;
        setHollowShape(HollowShape.SQUARE);
        this.iOiXi11II = "";
        this.X00XIX1 = "";
        float f = i2;
        float f2 = i + f;
        this.X100O = new RectF(f, f, f2, f2);
        this.XX1Oi = null;
        this.OX110i = new OXO1(f, f, f2, f2);
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(@aa1 Canvas canvas) {
        Intrinsics.X0O(canvas, "canvas");
        super.onDraw(canvas);
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null);
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.O001I);
        this.O001I.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        HollowShape hollowShape = this.f55003IO;
        int[] iArr = XIi00iiXO.OXO1;
        int i = iArr[hollowShape.ordinal()];
        if (i == 1) {
            RectF rectF = this.X100O;
            if (rectF != null) {
                float f = this.f55002I1;
                canvas.drawRoundRect(rectF, f, f, this.O001I);
            }
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            RectF rectF2 = this.XX1Oi;
            if (rectF2 != null) {
                canvas.drawOval(rectF2, this.O001I);
            }
        }
        this.O001I.setXfermode(null);
        canvas.restoreToCount(iSaveLayer);
        int i2 = iArr[this.f55003IO.ordinal()];
        if (i2 == 1) {
            RectF rectF3 = this.X100O;
            if (rectF3 != null) {
                float f2 = this.f55002I1;
                canvas.drawRoundRect(rectF3, f2, f2, this.iXiiiO);
                OXO1 oxo1 = this.OX110i;
                if (oxo1 != null) {
                    OXO1(canvas, oxo1, rectF3);
                    return;
                }
                return;
            }
            return;
        }
        if (i2 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        RectF rectF4 = this.XX1Oi;
        if (rectF4 != null) {
            canvas.drawOval(rectF4, this.iXiiiO);
            OXO1 oxo2 = this.OX110i;
            if (oxo2 != null) {
                OXO1(canvas, oxo2, rectF4);
            }
        }
    }

    public final void setBorderColor(int i) {
        this.X11iII1O1 = i;
        this.iXiiiO.setColor(i);
        this.Ii1iii0.setColor(i);
        this.iiiO.setColor(i);
        invalidate();
    }

    public final void setBorderWidth(float f) {
        this.XXX11i = f;
        this.iXiiiO.setStrokeWidth(f);
        this.Ii1iii0.setStrokeWidth(f);
        invalidate();
    }

    public final void setCircleHollow(int i) {
        XIi00iiXO(i, getWidth() / 2, getHeight() / 2);
    }

    public final void setCornerRadius(float f) {
        this.f55002I1 = f;
        invalidate();
    }

    public final void setDirectionsText(@aa1 String str) {
        Intrinsics.X0O(str, "str");
        this.iOiXi11II = str;
        this.X00XIX1 = str;
        invalidate();
    }

    public final void setGuideLineOffset(float f) {
        this.iIXi1iiXI = f;
        invalidate();
    }

    public final void setHollowShape(@aa1 HollowShape value) {
        Intrinsics.X0O(value, "value");
        this.f55003IO = value;
        invalidate();
    }

    public final void setMaskColor(int i) {
        this.iX1O1 = i;
        this.O001I.setColor(i);
        invalidate();
    }

    public final void setNorthText(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.iOiXi11II = str;
    }

    public final void setTextColor(int i) {
        this.X1IX = i;
        this.XXO.setColor(i);
        invalidate();
    }

    public final void setTextMargin(float f) {
        this.iXiX011 = f;
        invalidate();
    }

    public final void setTextSize(float f) {
        this.X0i1O = f;
        this.XXO.setTextSize(f);
        invalidate();
    }

    public final void setWestText(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.X00XIX1 = str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MaskView(@aa1 Context context, @tb1 AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.X0O(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MaskView(@aa1 Context context, @tb1 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.X0O(context, "context");
        HollowShape hollowShape = HollowShape.SQUARE;
        this.f55003IO = hollowShape;
        this.f55002I1 = 16.0f;
        this.iX1O1 = Color.parseColor("#80000000");
        this.X11iII1O1 = Color.parseColor("#2878FD");
        this.XXX11i = 3.0f;
        this.X1IX = -1;
        this.X0i1O = 42.0f;
        this.iIXi1iiXI = 40.0f;
        this.iXiX011 = 30.0f;
        Paint paint = new Paint();
        paint.setColor(this.iX1O1);
        paint.setAntiAlias(true);
        this.O001I = paint;
        Paint paint2 = new Paint();
        paint2.setColor(this.X1IX);
        paint2.setTextSize(42.0f);
        paint2.setAntiAlias(true);
        paint2.setTextAlign(Paint.Align.CENTER);
        this.XXO = paint2;
        Paint paint3 = new Paint();
        paint3.setColor(this.X11iII1O1);
        Paint.Style style = Paint.Style.STROKE;
        paint3.setStyle(style);
        paint3.setStrokeWidth(this.XXX11i);
        paint3.setAntiAlias(true);
        this.iXiiiO = paint3;
        Paint paint4 = new Paint();
        paint4.setColor(this.X11iII1O1);
        paint4.setStyle(style);
        paint4.setStrokeWidth(this.XXX11i);
        paint4.setAntiAlias(true);
        this.Ii1iii0 = paint4;
        Paint paint5 = new Paint();
        paint5.setColor(this.X11iII1O1);
        paint5.setStyle(style);
        paint5.setStrokeWidth(4.0f);
        paint5.setAntiAlias(true);
        this.iiiO = paint5;
        Paint paint6 = new Paint();
        paint6.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint6.setAntiAlias(true);
        this.X11I = paint6;
        this.f55004OO = 300;
        this.XOX0O0 = 50;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C15429R.styleable.MapMaskView);
            Intrinsics.O10IXXX0X(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            try {
                setHollowShape(typedArrayObtainStyledAttributes.getInt(5, 0) == 1 ? HollowShape.CIRCLE : hollowShape);
                setCornerRadius(typedArrayObtainStyledAttributes.getDimension(3, 16.0f));
                setMaskColor(typedArrayObtainStyledAttributes.getColor(0, Color.parseColor("#80000000")));
                setBorderColor(typedArrayObtainStyledAttributes.getColor(1, Color.parseColor("#2878FD")));
                setBorderWidth(typedArrayObtainStyledAttributes.getDimension(2, 3.0f));
                setTextColor(typedArrayObtainStyledAttributes.getColor(6, -1));
                setTextSize(typedArrayObtainStyledAttributes.getDimension(8, 42.0f));
                setGuideLineOffset(typedArrayObtainStyledAttributes.getDimension(4, 40.0f));
                setTextMargin(typedArrayObtainStyledAttributes.getDimension(7, 30.0f));
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
        this.iOiXi11II = "";
        this.X00XIX1 = "";
    }

    public /* synthetic */ MaskView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
