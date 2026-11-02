package com.sma.smartv3.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.view.View;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.hl4;
import com.android.mltcode.paycertificationapi.iiOI111I;
import com.android.mltcode.paycertificationapi.tb1;
import com.blankj.utilcode.util.SizeUtils;
import com.sma.smartv3.C15429R;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.StepProgressBar;
import com.sma.smartv3.view.text.MyTypeface;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import skin.support.widget.SkinCompatView;

/* JADX INFO: loaded from: classes3.dex */
public final class StepProgressBar extends SkinCompatView {

    /* JADX INFO: renamed from: I1 */
    public float f55052I1;
    public int IO0II0i;
    public float IO0iXO0O;
    public final float IX0IXOi;
    public float IX1XiI;
    public int IXI;
    public int IXOIIIO;
    public int Ii0X0X;

    @aa1
    public final Paint Ii0i;

    @aa1
    public final DashPathEffect Ii1iii0;

    @aa1
    public final Paint IiiXiI0I;
    public float O001I;

    @aa1
    public String O0O;
    public int O0O0X0iOi;

    /* JADX INFO: renamed from: OO */
    public int f55053OO;
    public int OX110i;

    /* JADX INFO: renamed from: Oi */
    @aa1
    public Paint f55054Oi;
    public int X00XIX1;
    public float X00Xi1X;

    @aa1
    public final Paint X0i1O;

    /* JADX INFO: renamed from: X1 */
    public float f55055X1;
    public float X100O;

    @aa1
    public final RectF X11I;
    public float X11iII1O1;
    public int X1IX;
    public final float XO0X10iO;
    public int XOIX;

    @aa1
    public Bitmap XOO0XOOii;
    public int XOX0O0;
    public int XOXiX0;

    @aa1
    public String XX00i10X;
    public int XX1Oi;
    public int XXO;
    public boolean XXX11i;

    @aa1
    public final Paint XXiIiX10;
    public final long XXiO0i;

    @aa1
    public final Paint i0X000X0O;
    public final float i11I;
    public float iIXi1iiXI;

    @aa1
    public ValueAnimator iOI;
    public int iOiXi11II;
    public float iX1O1;
    public float iXi;
    public float iXiX011;
    public float iXiiiO;

    @aa1
    public Paint iiIOiX;

    @aa1
    public final Paint iiiO;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public StepProgressBar(@aa1 Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.X0O(context, "context");
    }

    private final void IiI10X(float f, float f2, long j) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
        Intrinsics.O10IXXX0X(valueAnimatorOfFloat, "ofFloat(...)");
        this.iOI = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(j);
        this.iOI.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.android.mltcode.paycertificationapi.la5
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                StepProgressBar.XOO0ii0(this.f9396IO, valueAnimator);
            }
        });
        this.iOI.start();
    }

    private final float O00(int i) {
        return SizeUtils.sp2px(i);
    }

    private final float XIi00iiXO(int i) {
        return SizeUtils.dp2px(i);
    }

    public static final void XOO0ii0(StepProgressBar stepProgressBar, ValueAnimator animation) {
        Intrinsics.X0O(animation, "animation");
        Object animatedValue = animation.getAnimatedValue();
        Intrinsics.X1ii(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float fFloatValue = ((Float) animatedValue).floatValue();
        stepProgressBar.IX1XiI = fFloatValue;
        stepProgressBar.iXi = fFloatValue * stepProgressBar.IX0IXOi;
        stepProgressBar.invalidate();
    }

    /* JADX INFO: renamed from: iO */
    private final void m38914iO(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C15429R.styleable.StepProgressBar);
        Intrinsics.O10IXXX0X(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.XXX11i = typedArrayObtainStyledAttributes.getBoolean(0, true);
        this.XX1Oi = typedArrayObtainStyledAttributes.getResourceId(9, 0);
        this.iOiXi11II = typedArrayObtainStyledAttributes.getResourceId(7, 0);
        this.f55053OO = typedArrayObtainStyledAttributes.getResourceId(8, 0);
        this.XXO = typedArrayObtainStyledAttributes.getResourceId(1, 0);
        this.Ii0X0X = typedArrayObtainStyledAttributes.getResourceId(3, 0);
        this.XOIX = typedArrayObtainStyledAttributes.getResourceId(6, 0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.IXOIIIO = resourceId;
        this.IO0II0i = typedArrayObtainStyledAttributes.getResourceId(5, resourceId);
        this.IXI = typedArrayObtainStyledAttributes.getResourceId(2, 0);
        this.XX00i10X = typedArrayObtainStyledAttributes.getText(11).toString();
        this.XOXiX0 = typedArrayObtainStyledAttributes.getResourceId(10, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void XO0O10(int i, int i2) {
        this.O0O = String.valueOf(i);
        if (i2 == 0) {
            i2 = 10000;
        }
        float f = (i / i2) * 100;
        float f2 = this.IX0IXOi;
        if (f > f2) {
            f = f2;
        }
        IiI10X(this.IX1XiI, f / f2, this.XXiO0i);
    }

    @Override // skin.support.widget.SkinCompatView, com.android.mltcode.paycertificationapi.ik4
    public void applySkin() {
        super.applySkin();
        Context context = getContext();
        Intrinsics.O10IXXX0X(context, "getContext(...)");
        hl4.OXO1(context, this.X0i1O, this.XXO);
        Context context2 = getContext();
        Intrinsics.O10IXXX0X(context2, "getContext(...)");
        hl4.OXO1(context2, this.i0X000X0O, this.Ii0X0X);
        Context context3 = getContext();
        Intrinsics.O10IXXX0X(context3, "getContext(...)");
        hl4.OXO1(context3, this.IiiXiI0I, this.XOIX);
        Context context4 = getContext();
        Intrinsics.O10IXXX0X(context4, "getContext(...)");
        hl4.OXO1(context4, this.XXiIiX10, this.IXOIIIO);
        Context context5 = getContext();
        Intrinsics.O10IXXX0X(context5, "getContext(...)");
        hl4.OXO1(context5, this.f55054Oi, this.IO0II0i);
        Context context6 = getContext();
        Intrinsics.O10IXXX0X(context6, "getContext(...)");
        hl4.OXO1(context6, this.Ii0i, this.IXI);
        Context context7 = getContext();
        Intrinsics.O10IXXX0X(context7, "getContext(...)");
        hl4.OXO1(context7, this.iiIOiX, this.XOXiX0);
        Context context8 = getContext();
        Intrinsics.O10IXXX0X(context8, "getContext(...)");
        this.OX110i = hl4.XIi00iiXO(context8, this.XX1Oi);
        Context context9 = getContext();
        Intrinsics.O10IXXX0X(context9, "getContext(...)");
        this.X00XIX1 = hl4.XIi00iiXO(context9, this.iOiXi11II);
        Context context10 = getContext();
        Intrinsics.O10IXXX0X(context10, "getContext(...)");
        this.XOX0O0 = hl4.XIi00iiXO(context10, this.f55053OO);
        Paint paint = this.iiiO;
        float f = this.X1IX / 2;
        int i = this.OX110i;
        int i2 = this.XOX0O0;
        int i3 = this.X00XIX1;
        paint.setShader(new SweepGradient(f, 1.0f, new int[]{i, i2, i3, i3}, new float[]{0.0f, 0.3f, 0.5f, 1.0f}));
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(@aa1 Canvas canvas) {
        Intrinsics.X0O(canvas, "canvas");
        super.onDraw(canvas);
        canvas.save();
        float f = this.f55052I1;
        canvas.drawCircle(f, f, this.iX1O1, this.X0i1O);
        float f2 = (this.iXi / this.IX0IXOi) * 360.0f;
        this.X11iII1O1 = f2;
        canvas.drawArc(this.X11I, 270.0f, f2, false, this.iiiO);
        float f3 = this.f55052I1;
        canvas.drawCircle(f3, f3, this.iX1O1 - this.i11I, this.i0X000X0O);
        canvas.drawText("0%", this.f55052I1 - XIi00iiXO(6), this.X00Xi1X, this.XXiIiX10);
        canvas.drawText("25%", (this.O0O0X0iOi - this.X00Xi1X) - XIi00iiXO(4), this.f55052I1, this.XXiIiX10);
        canvas.drawText("50%", this.f55052I1 - XIi00iiXO(8), (this.O0O0X0iOi - this.X00Xi1X) + XIi00iiXO(8), this.XXiIiX10);
        canvas.drawText("75%", this.X00Xi1X - XIi00iiXO(18), this.f55052I1, this.XXiIiX10);
        float f4 = this.O0O0X0iOi;
        float f5 = this.f55055X1;
        canvas.drawCircle(f4 - f5, f5, 10.0f, this.Ii0i);
        int i = this.O0O0X0iOi;
        float f6 = this.f55055X1;
        canvas.drawCircle(i - f6, i - f6, 10.0f, this.Ii0i);
        float f7 = this.f55055X1;
        canvas.drawCircle(f7, this.O0O0X0iOi - f7, 10.0f, this.Ii0i);
        float f8 = this.f55055X1;
        canvas.drawCircle(f8, f8, 10.0f, this.Ii0i);
        float f9 = this.f55052I1;
        canvas.drawCircle(f9, f9, ((this.iX1O1 - this.i11I) - this.XO0X10iO) + XIi00iiXO(1), this.IiiXiI0I);
        canvas.drawBitmap(this.XOO0XOOii, this.f55052I1 - XIi00iiXO(12), (this.f55052I1 / 2) + XIi00iiXO(10), this.IiiXiI0I);
        String str = this.O0O;
        float f10 = this.f55052I1;
        canvas.drawText(str, f10, XIi00iiXO(8) + f10, this.iiIOiX);
        canvas.drawText(this.XX00i10X, this.f55052I1 - this.IO0iXO0O, ((this.O0O0X0iOi - this.i11I) - this.XO0X10iO) - XIi00iiXO(6), this.f55054Oi);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int iMin = Math.min(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        this.O0O0X0iOi = iMin;
        setMeasuredDimension(iMin, iMin);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.X1IX = i;
        float f = this.O0O0X0iOi / 2.0f;
        this.f55052I1 = f;
        this.iX1O1 = f - (this.iIXi1iiXI / 2);
        RectF rectF = this.X11I;
        float f2 = this.X100O;
        rectF.set(f2, f2, getWidth() - this.X100O, getWidth() - this.X100O);
        applySkin();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public StepProgressBar(@aa1 Context context, @tb1 AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.X0O(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public StepProgressBar(@aa1 Context context, @tb1 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.X0O(context, "context");
        this.XXX11i = true;
        Paint paint = new Paint();
        this.X0i1O = paint;
        this.iIXi1iiXI = XIi00iiXO(10);
        this.iXiX011 = XIi00iiXO(1);
        float fXIi00iiXO = XIi00iiXO(4);
        this.O001I = fXIi00iiXO;
        this.iXiiiO = this.iXiX011 + fXIi00iiXO + 1;
        DashPathEffect dashPathEffect = new DashPathEffect(new float[]{this.iXiX011, this.O001I}, this.iXiiiO);
        this.Ii1iii0 = dashPathEffect;
        Paint paint2 = new Paint();
        this.iiiO = paint2;
        this.X11I = new RectF();
        float f = 2;
        this.X100O = (this.iIXi1iiXI * f) + XIi00iiXO(4);
        Paint paint3 = new Paint();
        this.i0X000X0O = paint3;
        float fXIi00iiXO2 = this.X100O + this.iIXi1iiXI + XIi00iiXO(12);
        this.i11I = fXIi00iiXO2;
        float fXIi00iiXO3 = (this.iIXi1iiXI * f) + XIi00iiXO(8);
        this.XO0X10iO = fXIi00iiXO3;
        Paint paint4 = new Paint();
        this.XXiIiX10 = paint4;
        float fXIi00iiXO4 = (fXIi00iiXO2 + (fXIi00iiXO3 / f)) - XIi00iiXO(2);
        this.X00Xi1X = fXIi00iiXO4;
        this.f55055X1 = fXIi00iiXO4 + XIi00iiXO(14);
        Paint paint5 = new Paint();
        this.Ii0i = paint5;
        Paint paint6 = new Paint();
        this.IiiXiI0I = paint6;
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(context.getResources(), R.drawable.icon_step_progress_content);
        Intrinsics.O10IXXX0X(bitmapDecodeResource, "decodeResource(...)");
        this.XOO0XOOii = bitmapDecodeResource;
        this.iiIOiX = new Paint();
        this.f55054Oi = new Paint();
        this.XX00i10X = "Steps";
        this.iOI = new ValueAnimator();
        this.XXiO0i = 1000L;
        this.IX0IXOi = 100.0f;
        this.iXi = 90.0f;
        this.O0O = "0";
        m38914iO(context, attributeSet);
        paint.setAntiAlias(this.XXX11i);
        paint.setColor(this.XXO);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        paint.setStrokeWidth(this.iIXi1iiXI);
        paint.setPathEffect(dashPathEffect);
        paint2.setAntiAlias(this.XXX11i);
        paint2.setStyle(style);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeWidth(this.iIXi1iiXI);
        paint3.setAntiAlias(this.XXX11i);
        paint3.setStyle(style);
        paint3.setColor(this.Ii0X0X);
        paint3.setStrokeWidth(fXIi00iiXO3);
        paint4.setAntiAlias(this.XXX11i);
        paint4.setColor(this.IXOIIIO);
        paint4.setTextSize(O00(12));
        iiOI111I iioi111i = iiOI111I.OXO1;
        MyTypeface myTypeface = MyTypeface.DIN_COND_BOLD;
        paint4.setTypeface(iioi111i.OXO1(myTypeface, context));
        paint5.setAntiAlias(this.XXX11i);
        paint5.setStyle(Paint.Style.FILL);
        paint5.setColor(this.IXI);
        paint6.setAntiAlias(this.XXX11i);
        paint6.setStyle(Paint.Style.FILL_AND_STROKE);
        paint6.setColor(this.XOIX);
        paint6.setStrokeWidth(fXIi00iiXO3);
        this.iiIOiX.setAntiAlias(this.XXX11i);
        this.iiIOiX.setColor(this.XOXiX0);
        this.iiIOiX.setTextSize(O00(32));
        this.iiIOiX.setTextAlign(Paint.Align.CENTER);
        this.iiIOiX.setTypeface(iioi111i.OXO1(myTypeface, context));
        this.f55054Oi.setAntiAlias(this.XXX11i);
        this.f55054Oi.setColor(this.IO0II0i);
        this.f55054Oi.setTextSize(O00(14));
        this.f55054Oi.setTypeface(iioi111i.OXO1(MyTypeface.PF_REGULAR, context));
        this.IO0iXO0O = this.f55054Oi.measureText(this.XX00i10X) / f;
        applySkin();
    }

    public /* synthetic */ StepProgressBar(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
