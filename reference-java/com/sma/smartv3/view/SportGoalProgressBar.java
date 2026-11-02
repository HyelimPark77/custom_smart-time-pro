package com.sma.smartv3.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.view.ViewCompat;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.blankj.utilcode.util.SizeUtils;
import com.sma.smartv3.C15429R;
import com.sma.smartv3.pro.R;
import java.util.Arrays;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import skin.support.widget.SkinCompatView;

/* JADX INFO: loaded from: classes3.dex */
public final class SportGoalProgressBar extends SkinCompatView {

    /* JADX INFO: renamed from: I1 */
    public float f55047I1;
    public int IO0II0i;

    @aa1
    public final Paint IO0iXO0O;

    @aa1
    public String IX0IXOi;
    public float IX1XiI;
    public float IXI;
    public int IXOIIIO;
    public int Ii0X0X;
    public final float Ii0i;

    @aa1
    public final Paint Ii1iii0;
    public float IiiXiI0I;

    @aa1
    public final Paint O001I;
    public int O0O0X0iOi;

    /* JADX INFO: renamed from: OO */
    @aa1
    public final RectF f55048OO;

    @aa1
    public final RectF OX110i;

    /* JADX INFO: renamed from: Oi */
    @tb1
    public Bitmap f55049Oi;

    @aa1
    public final RectF X00XIX1;
    public int X00Xi1X;

    @aa1
    public final Paint X0i1O;

    /* JADX INFO: renamed from: X1 */
    public int f55050X1;

    @aa1
    public final Paint X100O;

    @aa1
    public final Paint X11I;
    public float X11iII1O1;

    @aa1
    public final Paint X1IX;
    public int XO0X10iO;
    public float XOIX;
    public float XOO0XOOii;

    @aa1
    public final RectF XOX0O0;
    public float XOXiX0;
    public int XX00i10X;

    @aa1
    public final RectF XX1Oi;

    @aa1
    public final Paint XXO;
    public float XXX11i;
    public int XXiIiX10;

    @aa1
    public String XXiO0i;
    public int i0X000X0O;
    public int i11I;

    @aa1
    public final Paint iIXi1iiXI;
    public float iOI;

    @aa1
    public final RectF iOiXi11II;
    public boolean iX1O1;

    @aa1
    public final Paint iXiX011;

    @aa1
    public final Paint iXiiiO;

    @tb1
    public Bitmap iiIOiX;

    @aa1
    public final Paint iiiO;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SportGoalProgressBar(@aa1 Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.X0O(context, "context");
    }

    private final float OXO1(int i) {
        return SizeUtils.dp2px(i);
    }

    private final void XIi00iiXO(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C15429R.styleable.GoalProgressBar);
        Intrinsics.O10IXXX0X(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.iX1O1 = typedArrayObtainStyledAttributes.getBoolean(0, true);
        this.i0X000X0O = typedArrayObtainStyledAttributes.getColor(10, 0);
        this.i11I = typedArrayObtainStyledAttributes.getColor(9, 0);
        this.XO0X10iO = typedArrayObtainStyledAttributes.getColor(2, 0);
        this.Ii0X0X = typedArrayObtainStyledAttributes.getColor(1, 0);
        this.XXiIiX10 = typedArrayObtainStyledAttributes.getColor(5, 0);
        this.X00Xi1X = typedArrayObtainStyledAttributes.getColor(4, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void XO0O10(float f, float f2) {
        this.XOO0XOOii = f;
        StringCompanionObject stringCompanionObject = StringCompanionObject.OXO1;
        String str = String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1));
        Intrinsics.O10IXXX0X(str, "format(...)");
        this.IX0IXOi = str;
        this.XOXiX0 = f2;
        invalidate();
    }

    @Override // skin.support.widget.SkinCompatView, com.android.mltcode.paycertificationapi.ik4
    public void applySkin() {
        super.applySkin();
        invalidate();
    }

    public final float getCenterPoint() {
        return this.IX1XiI;
    }

    @aa1
    public final String getMDistance() {
        return this.XXiO0i;
    }

    @aa1
    public final String getMKcal() {
        return this.IX0IXOi;
    }

    public final float getRectWidth() {
        return this.iOI;
    }

    public final int getViewHeight() {
        return this.O0O0X0iOi;
    }

    public final int getViewWidth() {
        return this.XX00i10X;
    }

    /* JADX INFO: renamed from: iO */
    public final void m38913iO(float f, float f2) {
        this.XOIX = f;
        StringCompanionObject stringCompanionObject = StringCompanionObject.OXO1;
        String str = String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1));
        Intrinsics.O10IXXX0X(str, "format(...)");
        this.XXiO0i = str;
        this.IiiXiI0I = f2;
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(@aa1 Canvas canvas) {
        Intrinsics.X0O(canvas, "canvas");
        super.onDraw(canvas);
        canvas.save();
        canvas.drawArc(this.iOiXi11II, 0.0f, 360.0f, false, this.iiiO);
        canvas.drawArc(this.OX110i, 90.0f, 360.0f, false, this.iXiX011);
        float f = (this.XOIX / this.IiiXiI0I) * 360.0f;
        this.f55047I1 = f;
        canvas.drawArc(this.OX110i, 90.0f, f, false, this.iIXi1iiXI);
        canvas.drawArc(this.X00XIX1, 0.0f, 360.0f, false, this.X11I);
        canvas.drawArc(this.f55048OO, 90.0f, 360.0f, false, this.XXO);
        float f2 = (this.XOO0XOOii / this.XOXiX0) * 360.0f;
        this.f55047I1 = f2;
        canvas.drawArc(this.f55048OO, 90.0f, f2, false, this.O001I);
        float f3 = 2;
        float fWidth = ((this.XX00i10X / 2) - this.XXX11i) - (this.OX110i.width() / f3);
        float fHeight = this.X11iII1O1 + this.IX1XiI + (this.OX110i.height() / f3) + OXO1(10);
        String str = this.XXiO0i;
        canvas.drawText(str, fWidth - (this.iXiiiO.measureText(str) / f3), fHeight, this.iXiiiO);
        String string = getContext().getString(R.string.aerobic_training_effect);
        Intrinsics.O10IXXX0X(string, "getString(...)");
        canvas.drawText(string, fWidth - (this.X100O.measureText(string) / f3), fHeight + OXO1(30), this.X100O);
        float fWidth2 = (this.XX00i10X / 2) + this.XXX11i + (this.OX110i.width() / f3);
        float fHeight2 = this.X11iII1O1 + this.IX1XiI + (this.f55048OO.height() / f3) + OXO1(10);
        String str2 = this.IX0IXOi;
        canvas.drawText(str2, fWidth2 - (this.iXiiiO.measureText(str2) / f3), fHeight2, this.iXiiiO);
        String string2 = getContext().getString(R.string.effect_of_anaerobic_training);
        Intrinsics.O10IXXX0X(string2, "getString(...)");
        canvas.drawText(string2, fWidth2 - (this.X100O.measureText(string2) / f3), fHeight2 + OXO1(30), this.X100O);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.XX00i10X = i;
        this.O0O0X0iOi = i2;
        this.iIXi1iiXI.setStrokeWidth(this.X11iII1O1);
        this.iXiX011.setStrokeWidth(this.X11iII1O1);
        this.O001I.setStrokeWidth(this.X11iII1O1);
        this.XXO.setStrokeWidth(this.X11iII1O1);
        int i5 = this.XX00i10X;
        float f = this.XXX11i;
        float f2 = 2;
        float f3 = this.X11iII1O1;
        float f4 = (i5 / 2.0f) - ((f * f2) + f3);
        this.iOI = f4;
        this.OX110i.set(((i5 / 2) - f) - f4, f3 * f2, (i5 / 2) - f, f4 + (f3 * f2));
        RectF rectF = this.f55048OO;
        int i6 = this.XX00i10X;
        float f5 = this.XXX11i;
        float f6 = this.X11iII1O1;
        float f7 = this.iOI;
        rectF.set((i6 / 2) + f5, f6 * f2, (i6 / 2) + f5 + f7, f7 + (f6 * f2));
        applySkin();
    }

    public final void setCenterPoint(float f) {
        this.IX1XiI = f;
    }

    public final void setMDistance(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.XXiO0i = str;
    }

    public final void setMKcal(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.IX0IXOi = str;
    }

    public final void setRectWidth(float f) {
        this.iOI = f;
    }

    public final void setViewHeight(int i) {
        this.O0O0X0iOi = i;
    }

    public final void setViewWidth(int i) {
        this.XX00i10X = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SportGoalProgressBar(@aa1 Context context, @tb1 AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.X0O(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SportGoalProgressBar(@aa1 Context context, @tb1 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.X0O(context, "context");
        this.f55047I1 = 50.0f;
        this.iX1O1 = true;
        this.X11iII1O1 = OXO1(12);
        this.XXX11i = OXO1(15);
        Paint paint = new Paint();
        this.X1IX = paint;
        Paint paint2 = new Paint();
        this.X0i1O = paint2;
        Paint paint3 = new Paint();
        this.iIXi1iiXI = paint3;
        Paint paint4 = new Paint();
        this.iXiX011 = paint4;
        Paint paint5 = new Paint();
        this.O001I = paint5;
        Paint paint6 = new Paint();
        this.XXO = paint6;
        Paint paint7 = new Paint();
        this.iXiiiO = paint7;
        Paint paint8 = new Paint();
        this.Ii1iii0 = paint8;
        Paint paint9 = new Paint();
        this.iiiO = paint9;
        Paint paint10 = new Paint();
        this.X11I = paint10;
        Paint paint11 = new Paint();
        this.X100O = paint11;
        this.XX1Oi = new RectF();
        this.OX110i = new RectF();
        this.f55048OO = new RectF();
        this.XOX0O0 = new RectF();
        this.iOiXi11II = new RectF();
        this.X00XIX1 = new RectF();
        this.f55050X1 = Color.parseColor("#FFF3EE");
        this.IXOIIIO = Color.parseColor("#EAF3F8");
        this.IO0II0i = Color.parseColor("#FBE8EB");
        this.Ii0i = 100.0f;
        this.IXI = 1.0f;
        this.IiiXiI0I = 100.0f;
        this.XOIX = 1.0f;
        this.XOXiX0 = 100.0f;
        this.XOO0XOOii = 1.0f;
        this.IO0iXO0O = new Paint();
        XIi00iiXO(context, attributeSet);
        paint.setAntiAlias(this.iX1O1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint.setStrokeWidth(this.X11iII1O1);
        paint.setColor(this.i0X000X0O);
        paint2.setAntiAlias(this.iX1O1);
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint2.setStrokeWidth(this.X11iII1O1);
        paint2.setColor(this.i11I);
        paint3.setAntiAlias(this.iX1O1);
        paint3.setStyle(style);
        paint3.setStrokeCap(cap);
        paint3.setStrokeWidth(this.X11iII1O1);
        paint3.setColor(this.XO0X10iO);
        paint4.setAntiAlias(this.iX1O1);
        paint4.setStyle(style);
        paint4.setStrokeCap(cap);
        paint4.setStrokeWidth(this.X11iII1O1);
        paint4.setColor(this.Ii0X0X);
        paint5.setAntiAlias(this.iX1O1);
        paint5.setStyle(style);
        paint5.setStrokeCap(cap);
        paint5.setStrokeWidth(this.X11iII1O1);
        paint5.setColor(this.XXiIiX10);
        paint6.setAntiAlias(this.iX1O1);
        paint6.setStyle(style);
        paint6.setStrokeCap(cap);
        paint6.setStrokeWidth(this.X11iII1O1);
        paint6.setColor(this.X00Xi1X);
        paint8.setAntiAlias(this.iX1O1);
        Paint.Style style2 = Paint.Style.FILL;
        paint8.setStyle(style2);
        paint8.setColor(this.f55050X1);
        paint9.setAntiAlias(this.iX1O1);
        paint9.setStyle(style2);
        paint9.setStrokeWidth(this.X11iII1O1);
        paint9.setColor(this.IXOIIIO);
        paint10.setAntiAlias(this.iX1O1);
        paint10.setStyle(style2);
        paint10.setStrokeWidth(this.X11iII1O1);
        paint10.setColor(this.IO0II0i);
        paint7.setAntiAlias(this.iX1O1);
        paint7.setColor(ViewCompat.MEASURED_STATE_MASK);
        paint7.setTextSize(SizeUtils.dp2px(32.0f));
        paint11.setAntiAlias(this.iX1O1);
        paint11.setColor(ViewCompat.MEASURED_STATE_MASK);
        paint11.setTextSize(SizeUtils.dp2px(14.0f));
        applySkin();
        this.XXiO0i = "0.0";
        this.IX0IXOi = "0.0";
    }

    public /* synthetic */ SportGoalProgressBar(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
