package com.sma.smartv3.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.blankj.utilcode.util.SizeUtils;
import com.sma.smartv3.C15429R;
import com.sma.smartv3.view.CircularProgressBar;
import kotlin.Pair;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import skin.support.widget.SkinCompatView;

/* JADX INFO: loaded from: classes3.dex */
public final class CircularProgressBar extends SkinCompatView {

    /* JADX INFO: renamed from: I1 */
    @aa1
    public final String f54964I1;
    public int Ii1iii0;

    @aa1
    public final Paint O001I;
    public float X0i1O;
    public boolean X100O;
    public float X11I;
    public float X11iII1O1;
    public boolean X1IX;

    @aa1
    public final RectF XXO;
    public float XXX11i;

    @aa1
    public final Paint iIXi1iiXI;
    public float iX1O1;

    @aa1
    public final Paint iXiX011;
    public int iXiiiO;
    public final float iiiO;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CircularProgressBar(@aa1 Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.X0O(context, "context");
    }

    private final void O00(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C15429R.styleable.CircularProgressBar);
        Intrinsics.O10IXXX0X(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.iXiiiO = typedArrayObtainStyledAttributes.getColor(1, -65536);
        this.Ii1iii0 = typedArrayObtainStyledAttributes.getColor(0, -16776961);
        this.X0i1O = typedArrayObtainStyledAttributes.getDimension(2, 0.0f);
        this.X11iII1O1 = typedArrayObtainStyledAttributes.getFloat(3, 270.0f);
        float f = typedArrayObtainStyledAttributes.getFloat(4, 360.0f);
        this.iX1O1 = f;
        if (f < 360.0f && this.X11iII1O1 == 270.0f) {
            this.X11iII1O1 = ((360 - f) / 2) + 90.0f;
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public static final void XOO0ii0(CircularProgressBar circularProgressBar, float f, ValueAnimator animation) {
        Intrinsics.X0O(animation, "animation");
        Object animatedValue = animation.getAnimatedValue();
        Intrinsics.X1ii(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        circularProgressBar.X11I = ((Float) animatedValue).floatValue() * f;
        circularProgressBar.invalidate();
    }

    public final void I0IIOi(int i, int i2) {
        if (i2 == 0) {
            i2 = 10000;
        }
        float f = (i / i2) * 100;
        float f2 = this.iiiO;
        if (f > f2) {
            f = f2;
        }
        this.X11I = f;
        invalidate();
    }

    public final void IiI10X() {
        final float f = this.X11I;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(1000L);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.android.mltcode.paycertificationapi.I0111i
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                CircularProgressBar.XOO0ii0(this.f1046IO, f, valueAnimator);
            }
        });
        valueAnimatorOfFloat.start();
    }

    public final float XIi00iiXO(float f) {
        return SizeUtils.dp2px(f);
    }

    @aa1
    public final Pair<Float, Float> XO0O10(float f, float f2, float f3, float f4) {
        double radians = Math.toRadians(f4);
        return new Pair<>(Float.valueOf(f + (((float) Math.cos(radians)) * f3)), Float.valueOf(f2 + (f3 * ((float) Math.sin(radians)))));
    }

    @Override // skin.support.widget.SkinCompatView, com.android.mltcode.paycertificationapi.ik4
    public void applySkin() {
        super.applySkin();
        invalidate();
    }

    public final boolean getEnableDot() {
        return this.X100O;
    }

    /* JADX INFO: renamed from: iO */
    public final void m38877iO(Canvas canvas) {
        float f = 2;
        Pair<Float, Float> pairXO0O10 = XO0O10(this.XXO.width() / f, this.XXO.width() / f, this.XXO.width() / f, this.X11iII1O1);
        Pair<Float, Float> pairXO0O11 = XO0O10(this.XXO.width() / f, this.XXO.width() / f, this.XXO.width() / f, this.X11iII1O1 + this.XXX11i);
        float f2 = this.X0i1O / 4;
        canvas.drawCircle(pairXO0O10.getFirst().floatValue() + (this.X0i1O / f), pairXO0O10.getSecond().floatValue() + (this.X0i1O / f), f2, this.O001I);
        canvas.drawCircle(pairXO0O11.getFirst().floatValue() + (this.X0i1O / f), pairXO0O11.getSecond().floatValue() + (this.X0i1O / f), f2, this.O001I);
    }

    @Override // android.view.View
    public void onDraw(@aa1 Canvas canvas) {
        Intrinsics.X0O(canvas, "canvas");
        super.onDraw(canvas);
        canvas.save();
        canvas.drawArc(this.XXO, this.X11iII1O1, this.iX1O1, false, this.iXiX011);
        float f = (this.X11I / this.iiiO) * this.iX1O1;
        this.XXX11i = f;
        canvas.drawArc(this.XXO, this.X11iII1O1, f, false, this.iIXi1iiXI);
        if (this.X100O) {
            m38877iO(canvas);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        setMeasuredDimension(measuredWidth, measuredWidth);
        if (this.X0i1O == 0.0f) {
            this.X0i1O = measuredWidth / 10.0f;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float f = this.X0i1O;
        float f2 = f / 2;
        this.iIXi1iiXI.setStrokeWidth(f);
        this.iXiX011.setStrokeWidth(this.X0i1O);
        float f3 = i - f2;
        this.XXO.set(f2, f2, f3, f3);
        applySkin();
    }

    public final void setEnableDot(boolean z) {
        this.X100O = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CircularProgressBar(@aa1 Context context, @tb1 AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.X0O(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CircularProgressBar(@aa1 Context context, @tb1 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.X0O(context, "context");
        this.f54964I1 = "CircularProgressBar";
        this.iX1O1 = 360.0f;
        this.X11iII1O1 = 270.0f;
        this.XXX11i = 50.0f;
        this.X1IX = true;
        Paint paint = new Paint();
        this.iIXi1iiXI = paint;
        Paint paint2 = new Paint();
        this.iXiX011 = paint2;
        Paint paint3 = new Paint();
        this.O001I = paint3;
        this.XXO = new RectF();
        this.iXiiiO = -65536;
        this.Ii1iii0 = -16776961;
        this.iiiO = 100.0f;
        this.X11I = 34.0f;
        O00(context, attributeSet);
        paint.setAntiAlias(this.X1IX);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint.setStrokeWidth(this.X0i1O);
        paint.setColor(this.iXiiiO);
        paint2.setAntiAlias(this.X1IX);
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint2.setStrokeWidth(this.X0i1O);
        paint2.setColor(this.Ii1iii0);
        paint3.setColor(-1);
        paint3.setStyle(Paint.Style.FILL);
        paint3.setAntiAlias(true);
        applySkin();
    }

    public /* synthetic */ CircularProgressBar(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
