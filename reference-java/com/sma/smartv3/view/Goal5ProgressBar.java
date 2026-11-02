package com.sma.smartv3.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.blankj.utilcode.util.SizeUtils;
import com.sma.smartv3.C15429R;
import com.sma.smartv3.view.Goal5ProgressBar;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import skin.support.widget.SkinCompatView;

/* JADX INFO: loaded from: classes3.dex */
public final class Goal5ProgressBar extends SkinCompatView {

    /* JADX INFO: renamed from: I1 */
    public final float f54992I1;
    public float Ii0X0X;

    @aa1
    public final Paint Ii1iii0;

    @aa1
    public final Paint O001I;

    /* JADX INFO: renamed from: OO */
    public int f54993OO;
    public int OX110i;
    public int X00XIX1;
    public float X00Xi1X;
    public float X0i1O;

    @aa1
    public final RectF X100O;

    @aa1
    public final RectF X11I;
    public float X11iII1O1;
    public float X1IX;
    public final float XO0X10iO;
    public int XOX0O0;
    public int XX1Oi;

    @aa1
    public final Paint XXO;
    public boolean XXX11i;
    public final float XXiIiX10;
    public final float i0X000X0O;
    public float i11I;

    @aa1
    public final Paint iIXi1iiXI;
    public int iOiXi11II;
    public final float iX1O1;

    @aa1
    public final Paint iXiX011;

    @aa1
    public final Paint iXiiiO;

    @aa1
    public final RectF iiiO;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Goal5ProgressBar(@aa1 Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.X0O(context, "context");
    }

    private final void O00(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C15429R.styleable.GoalProgressBar);
        Intrinsics.O10IXXX0X(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.XXX11i = typedArrayObtainStyledAttributes.getBoolean(0, true);
        this.XX1Oi = typedArrayObtainStyledAttributes.getColor(10, 0);
        this.OX110i = typedArrayObtainStyledAttributes.getColor(11, 0);
        this.f54993OO = typedArrayObtainStyledAttributes.getColor(2, 0);
        this.XOX0O0 = typedArrayObtainStyledAttributes.getColor(3, 0);
        this.iOiXi11II = typedArrayObtainStyledAttributes.getColor(5, 0);
        this.X00XIX1 = typedArrayObtainStyledAttributes.getColor(6, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    private final float XO0O10(int i) {
        return SizeUtils.dp2px(i);
    }

    public static final void XOO0ii0(Goal5ProgressBar goal5ProgressBar, float f, float f2, float f3, ValueAnimator animation) {
        Intrinsics.X0O(animation, "animation");
        Object animatedValue = animation.getAnimatedValue();
        Intrinsics.X1ii(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float fFloatValue = ((Float) animatedValue).floatValue();
        goal5ProgressBar.i11I = f * fFloatValue;
        goal5ProgressBar.Ii0X0X = f2 * fFloatValue;
        goal5ProgressBar.X00Xi1X = fFloatValue * f3;
        goal5ProgressBar.invalidate();
    }

    /* JADX INFO: renamed from: iO */
    public static /* synthetic */ int m38887iO(Goal5ProgressBar goal5ProgressBar, int i, float f, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            f = 0.3f;
        }
        return goal5ProgressBar.XIi00iiXO(i, f);
    }

    private final void setProgressColor(float f) {
        Matrix matrix = new Matrix();
        matrix.postRotate(90.0f, f, f);
        Paint paint = this.iIXi1iiXI;
        SweepGradient sweepGradient = new SweepGradient(f, f, new int[]{this.XX1Oi, this.OX110i}, new float[]{0.166f, 0.833f});
        sweepGradient.setLocalMatrix(matrix);
        paint.setShader(sweepGradient);
        Paint paint2 = this.iXiX011;
        SweepGradient sweepGradient2 = new SweepGradient(f, f, new int[]{m38887iO(this, this.XX1Oi, 0.0f, 2, null), m38887iO(this, this.OX110i, 0.0f, 2, null)}, new float[]{0.166f, 0.833f});
        sweepGradient2.setLocalMatrix(matrix);
        paint2.setShader(sweepGradient2);
        Paint paint3 = this.O001I;
        SweepGradient sweepGradient3 = new SweepGradient(f, f, new int[]{this.f54993OO, this.XOX0O0}, new float[]{0.166f, 0.833f});
        sweepGradient3.setLocalMatrix(matrix);
        paint3.setShader(sweepGradient3);
        Paint paint4 = this.XXO;
        SweepGradient sweepGradient4 = new SweepGradient(f, f, new int[]{m38887iO(this, this.f54993OO, 0.0f, 2, null), m38887iO(this, this.XOX0O0, 0.0f, 2, null)}, new float[]{0.166f, 0.833f});
        sweepGradient4.setLocalMatrix(matrix);
        paint4.setShader(sweepGradient4);
        Paint paint5 = this.iXiiiO;
        SweepGradient sweepGradient5 = new SweepGradient(f, f, new int[]{this.iOiXi11II, this.X00XIX1}, new float[]{0.166f, 0.833f});
        sweepGradient5.setLocalMatrix(matrix);
        paint5.setShader(sweepGradient5);
        Paint paint6 = this.Ii1iii0;
        SweepGradient sweepGradient6 = new SweepGradient(f, f, new int[]{m38887iO(this, this.iOiXi11II, 0.0f, 2, null), m38887iO(this, this.X00XIX1, 0.0f, 2, null)}, new float[]{0.166f, 0.833f});
        sweepGradient6.setLocalMatrix(matrix);
        paint6.setShader(sweepGradient6);
    }

    public final void I0IIOi(int i, int i2) {
        if (i2 == 0) {
            i2 = 10000;
        }
        float f = (i / i2) * 100;
        float f2 = this.i0X000X0O;
        if (f > f2) {
            f = f2;
        }
        this.i11I = f;
        invalidate();
    }

    /* JADX INFO: renamed from: IO */
    public final void m38888IO(int i, int i2) {
        if (i2 == 0) {
            i2 = 10000;
        }
        float f = (i / i2) * 100;
        float f2 = this.XXiIiX10;
        if (f > f2) {
            f = f2;
        }
        this.X00Xi1X = f;
        invalidate();
    }

    public final void IiI10X() {
        final float f = this.i11I;
        final float f2 = this.Ii0X0X;
        final float f3 = this.X00Xi1X;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(1000L);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.android.mltcode.paycertificationapi.Oi0111I
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                Goal5ProgressBar.XOO0ii0(this.f3617IO, f, f2, f3, valueAnimator);
            }
        });
        valueAnimatorOfFloat.start();
    }

    public final void OIi0(int i, int i2) {
        if (i2 == 0) {
            i2 = 10000;
        }
        float f = (i / i2) * 100;
        float f2 = this.XO0X10iO;
        if (f > f2) {
            f = f2;
        }
        this.Ii0X0X = f;
        invalidate();
    }

    public final int XIi00iiXO(int i, float f) {
        return Color.argb((int) (Color.alpha(i) * f), Color.red(i), Color.green(i), Color.blue(i));
    }

    @Override // skin.support.widget.SkinCompatView, com.android.mltcode.paycertificationapi.ik4
    public void applySkin() {
        super.applySkin();
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(@aa1 Canvas canvas) {
        Intrinsics.X0O(canvas, "canvas");
        super.onDraw(canvas);
        canvas.save();
        canvas.drawArc(this.iiiO, this.iX1O1, this.f54992I1, false, this.iXiX011);
        float f = (this.i11I / this.i0X000X0O) * this.f54992I1;
        this.X11iII1O1 = f;
        canvas.drawArc(this.iiiO, this.iX1O1, f, false, this.iIXi1iiXI);
        canvas.drawArc(this.X11I, this.iX1O1, this.f54992I1, false, this.XXO);
        float f2 = (this.Ii0X0X / this.XO0X10iO) * this.f54992I1;
        this.X11iII1O1 = f2;
        canvas.drawArc(this.X11I, this.iX1O1, f2, false, this.O001I);
        canvas.drawArc(this.X100O, this.iX1O1, this.f54992I1, false, this.Ii1iii0);
        float f3 = (this.X00Xi1X / this.XXiIiX10) * this.f54992I1;
        this.X11iII1O1 = f3;
        canvas.drawArc(this.X100O, this.iX1O1, f3, false, this.iXiiiO);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        float f = measuredWidth;
        float f2 = f / 9.6f;
        this.X1IX = f2;
        setMeasuredDimension(measuredWidth, (int) (((f * this.f54992I1) / 360) + f2 + 15));
        this.X0i1O = this.X1IX * 0.4f;
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float f = this.X1IX;
        float f2 = f / 2;
        this.iIXi1iiXI.setStrokeWidth(f);
        this.iXiX011.setStrokeWidth(this.X1IX);
        this.O001I.setStrokeWidth(this.X1IX);
        this.XXO.setStrokeWidth(this.X1IX);
        this.iXiiiO.setStrokeWidth(this.X1IX);
        this.Ii1iii0.setStrokeWidth(this.X1IX);
        float f3 = i;
        float f4 = f3 - f2;
        this.iiiO.set(f2, f2, f4, f4);
        RectF rectF = this.X11I;
        RectF rectF2 = this.iiiO;
        float f5 = rectF2.left;
        float f6 = this.X1IX;
        float f7 = this.X0i1O;
        rectF.set(f5 + f6 + f7, rectF2.top + f6 + f7, (rectF2.right - f6) - f7, (rectF2.bottom - f6) - f7);
        RectF rectF3 = this.X100O;
        RectF rectF4 = this.X11I;
        float f8 = rectF4.left;
        float f9 = this.X1IX;
        float f10 = this.X0i1O;
        rectF3.set(f8 + f9 + f10, rectF4.top + f9 + f10, (rectF4.right - f9) - f10, (rectF4.bottom - f9) - f10);
        setProgressColor(f3 / 2.0f);
        applySkin();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Goal5ProgressBar(@aa1 Context context, @tb1 AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.X0O(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Goal5ProgressBar(@aa1 Context context, @tb1 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.X0O(context, "context");
        this.f54992I1 = 240.0f;
        this.iX1O1 = ((360 - 240.0f) / 2) + 90.0f;
        this.X11iII1O1 = 50.0f;
        this.XXX11i = true;
        this.X1IX = XO0O10(10);
        this.X0i1O = XO0O10(4);
        Paint paint = new Paint();
        this.iIXi1iiXI = paint;
        Paint paint2 = new Paint();
        this.iXiX011 = paint2;
        Paint paint3 = new Paint();
        this.O001I = paint3;
        Paint paint4 = new Paint();
        this.XXO = paint4;
        Paint paint5 = new Paint();
        this.iXiiiO = paint5;
        Paint paint6 = new Paint();
        this.Ii1iii0 = paint6;
        this.iiiO = new RectF();
        this.X11I = new RectF();
        this.X100O = new RectF();
        this.i0X000X0O = 100.0f;
        this.i11I = 34.0f;
        this.XO0X10iO = 100.0f;
        this.Ii0X0X = 34.0f;
        this.XXiIiX10 = 100.0f;
        this.X00Xi1X = 34.0f;
        O00(context, attributeSet);
        paint.setAntiAlias(this.XXX11i);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint.setStrokeWidth(this.X1IX);
        paint2.setAntiAlias(this.XXX11i);
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint2.setStrokeWidth(this.X1IX);
        paint3.setAntiAlias(this.XXX11i);
        paint3.setStyle(style);
        paint3.setStrokeCap(cap);
        paint3.setStrokeWidth(this.X1IX);
        paint4.setAntiAlias(this.XXX11i);
        paint4.setStyle(style);
        paint4.setStrokeCap(cap);
        paint4.setStrokeWidth(this.X1IX);
        paint5.setAntiAlias(this.XXX11i);
        paint5.setStyle(style);
        paint5.setStrokeCap(cap);
        paint5.setStrokeWidth(this.X1IX);
        paint6.setAntiAlias(this.XXX11i);
        paint6.setStyle(style);
        paint6.setStrokeCap(cap);
        paint6.setStrokeWidth(this.X1IX);
        applySkin();
    }

    public /* synthetic */ Goal5ProgressBar(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
