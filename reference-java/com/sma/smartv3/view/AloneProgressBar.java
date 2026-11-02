package com.sma.smartv3.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.tb1;
import com.blankj.utilcode.util.SizeUtils;
import com.google.firebase.crashlytics.buildtools.reloc.org.apache.commons.cli.HelpFormatter;
import com.sma.smartv3.C15429R;
import com.sma.smartv3.pro.R;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class AloneProgressBar extends View {

    /* JADX INFO: renamed from: I1 */
    public boolean f54948I1;

    /* JADX INFO: renamed from: IO */
    public float f54949IO;
    public int Ii1iii0;

    @aa1
    public final RectF O001I;

    /* JADX INFO: renamed from: OO */
    public float f54950OO;
    public float OX110i;
    public int X00XIX1;

    @aa1
    public final Paint X0i1O;
    public int X100O;
    public int X11I;

    @aa1
    public final Paint X11iII1O1;

    @aa1
    public final Paint X1IX;

    @aa1
    public String XOX0O0;
    public int XX1Oi;
    public int XXO;

    @aa1
    public final Paint XXX11i;

    @aa1
    public final Paint iIXi1iiXI;
    public int iOiXi11II;
    public float iX1O1;

    @aa1
    public final RectF iXiX011;
    public int iXiiiO;
    public int iiiO;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AloneProgressBar(@aa1 Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.X0O(context, "context");
    }

    public static /* synthetic */ void XO0O10(AloneProgressBar aloneProgressBar, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        aloneProgressBar.m38869iO(i, i2);
    }

    public final float OXO1(int i) {
        return SizeUtils.dp2px(i);
    }

    public final void XIi00iiXO(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C15429R.styleable.GoalProgressBar);
        Intrinsics.O10IXXX0X(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f54948I1 = typedArrayObtainStyledAttributes.getBoolean(0, true);
        this.XXO = typedArrayObtainStyledAttributes.getColor(10, 0);
        this.iXiiiO = typedArrayObtainStyledAttributes.getColor(9, 0);
        this.Ii1iii0 = typedArrayObtainStyledAttributes.getColor(2, 0);
        this.iiiO = typedArrayObtainStyledAttributes.getColor(1, 0);
        this.X11I = typedArrayObtainStyledAttributes.getColor(5, 0);
        this.X100O = typedArrayObtainStyledAttributes.getColor(4, 0);
        this.iX1O1 = typedArrayObtainStyledAttributes.getDimension(7, 4.0f);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: iO */
    public final void m38869iO(int i, int i2) {
        if (i2 != 0) {
            setRingWidth(i2);
        }
        this.f54950OO = i;
        this.OX110i = 100.0f;
        this.XOX0O0 = String.valueOf(i);
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(@aa1 Canvas canvas) {
        Intrinsics.X0O(canvas, "canvas");
        super.onDraw(canvas);
        canvas.drawArc(this.iXiX011, 270.0f, 360.0f, false, this.XXX11i);
        float f = (this.f54950OO / this.OX110i) * 360.0f;
        this.f54949IO = f;
        canvas.drawArc(this.iXiX011, 270.0f, f, false, this.X11iII1O1);
        float f2 = this.iOiXi11II / 2.0f;
        float f3 = this.X00XIX1 / 2.0f;
        Rect rect = new Rect();
        Paint paint = this.X1IX;
        String str = this.XOX0O0;
        paint.getTextBounds(str, 0, str.length(), rect);
        canvas.drawText(this.XOX0O0, f2, f3 - rect.exactCenterY(), this.X1IX);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.iOiXi11II = i;
        this.X00XIX1 = i2;
        this.X11iII1O1.setStrokeWidth(this.iX1O1);
        this.XXX11i.setStrokeWidth(this.iX1O1);
        float fMin = Math.min(this.iOiXi11II, this.X00XIX1) - this.iX1O1;
        float f = (this.iOiXi11II - fMin) / 2.0f;
        float f2 = (this.X00XIX1 - fMin) / 2.0f;
        float f3 = f + fMin;
        float f4 = fMin + f2;
        this.O001I.set(f, f2, f3, f4);
        float f5 = this.iX1O1 / 2.0f;
        this.iXiX011.set(f + f5, f2 + f5, f3 - f5, f4 - f5);
    }

    public final void setProgressSelectedBgColor(int i) {
        this.Ii1iii0 = i;
        this.X11iII1O1.setColor(i);
    }

    public final void setRingWidth(int i) {
        this.iX1O1 = OXO1(i);
    }

    public final void setValue(int i) {
        this.f54950OO = i;
        this.OX110i = 100.0f;
        this.XOX0O0 = i + "%";
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AloneProgressBar(@aa1 Context context, @tb1 AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.X0O(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AloneProgressBar(@aa1 Context context, @tb1 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.X0O(context, "context");
        this.f54949IO = 50.0f;
        this.f54948I1 = true;
        this.iX1O1 = OXO1(4);
        Paint paint = new Paint();
        this.X11iII1O1 = paint;
        Paint paint2 = new Paint();
        this.XXX11i = paint2;
        Paint paint3 = new Paint();
        this.X1IX = paint3;
        Paint paint4 = new Paint();
        this.X0i1O = paint4;
        Paint paint5 = new Paint();
        this.iIXi1iiXI = paint5;
        this.iXiX011 = new RectF();
        this.O001I = new RectF();
        this.XX1Oi = -16776961;
        this.OX110i = 100.0f;
        this.f54950OO = 100.0f;
        this.XOX0O0 = HelpFormatter.DEFAULT_LONG_OPT_PREFIX;
        XIi00iiXO(context, attributeSet);
        paint.setAntiAlias(this.f54948I1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint.setStrokeWidth(this.iX1O1);
        paint.setColor(this.Ii1iii0);
        paint2.setAntiAlias(this.f54948I1);
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint2.setStrokeWidth(this.iX1O1);
        paint2.setColor(this.iiiO);
        paint4.setAntiAlias(this.f54948I1);
        paint4.setStyle(Paint.Style.FILL);
        paint4.setStrokeWidth(this.iX1O1);
        paint4.setColor(this.XX1Oi);
        paint3.setAntiAlias(this.f54948I1);
        paint3.setColor(gk4.m1859iO(context, R.color.text_color));
        paint3.setTextSize(SizeUtils.dp2px(34.0f));
        Paint.Align align = Paint.Align.CENTER;
        paint3.setTextAlign(align);
        paint5.setAntiAlias(this.f54948I1);
        paint5.setColor(gk4.m1859iO(context, R.color.text_color));
        paint5.setTextSize(SizeUtils.dp2px(14.0f));
        paint5.setTextAlign(align);
    }

    public /* synthetic */ AloneProgressBar(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
