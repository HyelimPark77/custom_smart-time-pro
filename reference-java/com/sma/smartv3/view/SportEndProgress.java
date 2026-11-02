package com.sma.smartv3.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.SizeUtils;
import com.sma.smartv3.C15429R;
import com.sma.smartv3.view.SportEndProgress;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class SportEndProgress extends View {

    /* JADX INFO: renamed from: I1 */
    public float f55044I1;

    /* JADX INFO: renamed from: IO */
    public int f55045IO;
    public int Ii1iii0;
    public final float O001I;

    /* JADX INFO: renamed from: OO */
    public final float f55046OO;
    public long OX110i;

    @tb1
    public OXO1 X00XIX1;

    @aa1
    public final Paint X0i1O;

    @aa1
    public ValueAnimator X100O;
    public boolean X11I;
    public float X11iII1O1;

    @aa1
    public final Paint X1IX;
    public float XOX0O0;
    public float XX1Oi;
    public float XXO;

    @aa1
    public final Paint XXX11i;
    public boolean i0X000X0O;

    @aa1
    public final RectF iIXi1iiXI;

    @tb1
    public XIi00iiXO iOiXi11II;
    public float iX1O1;
    public final float iXiX011;
    public int iXiiiO;
    public int iiiO;

    public interface OXO1 {
        void end();
    }

    public interface XIi00iiXO {
        void start(boolean z);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SportEndProgress(@aa1 Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.X0O(context, "context");
    }

    public static final void O00(SportEndProgress sportEndProgress, ValueAnimator animation) {
        OXO1 oxo1;
        Intrinsics.X0O(animation, "animation");
        Object animatedValue = animation.getAnimatedValue();
        Intrinsics.X1ii(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float fFloatValue = ((Float) animatedValue).floatValue();
        sportEndProgress.XX1Oi = fFloatValue;
        sportEndProgress.XOX0O0 = fFloatValue * sportEndProgress.f55046OO;
        sportEndProgress.invalidate();
        if (sportEndProgress.XOX0O0 == sportEndProgress.f55046OO && sportEndProgress.i0X000X0O && (oxo1 = sportEndProgress.X00XIX1) != null) {
            oxo1.end();
        }
    }

    private final void setProgress(float f) {
        float f2 = this.f55046OO;
        if (f > f2) {
            f = f2;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.XX1Oi, f / f2);
        Intrinsics.O10IXXX0X(valueAnimatorOfFloat, "ofFloat(...)");
        this.X100O = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(this.OX110i);
        this.X100O.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.android.mltcode.paycertificationapi.sz4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                SportEndProgress.O00(this.f11161IO, valueAnimator);
            }
        });
        this.X100O.start();
    }

    public final void IiI10X(@aa1 XIi00iiXO callback) {
        Intrinsics.X0O(callback, "callback");
        this.iOiXi11II = callback;
    }

    public final float XIi00iiXO(int i) {
        return SizeUtils.dp2px(i);
    }

    public final void XO0O10(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C15429R.styleable.SportEndProgress);
        Intrinsics.O10IXXX0X(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.X11I = typedArrayObtainStyledAttributes.getBoolean(0, true);
        this.iXiiiO = typedArrayObtainStyledAttributes.getColor(4, -1);
        this.Ii1iii0 = typedArrayObtainStyledAttributes.getColor(2, -65536);
        this.iiiO = typedArrayObtainStyledAttributes.getColor(3, -1);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: iO */
    public final void m38912iO(@aa1 OXO1 callback) {
        Intrinsics.X0O(callback, "callback");
        this.X00XIX1 = callback;
    }

    @Override // android.view.View
    public void onDraw(@aa1 Canvas canvas) {
        Intrinsics.X0O(canvas, "canvas");
        super.onDraw(canvas);
        canvas.save();
        float f = this.f55044I1;
        canvas.drawCircle(f, f, this.iX1O1, this.X1IX);
        float f2 = this.f55044I1;
        float f3 = this.X11iII1O1;
        float f4 = f2 - f3;
        float f5 = f2 - f3;
        float f6 = this.iX1O1;
        canvas.drawRect(f4, f5, f6 + f3, f6 + f3, this.XXX11i);
        float f7 = (this.XOX0O0 / this.f55046OO) * 360.0f;
        this.XXO = f7;
        canvas.drawArc(this.iIXi1iiXI, 270.0f, f7, false, this.X0i1O);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int iMin = Math.min(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        this.f55045IO = iMin;
        setMeasuredDimension(iMin, iMin);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        int i5 = this.f55045IO;
        float f = i5 / 2.0f;
        this.f55044I1 = f;
        this.iX1O1 = f;
        this.X11iII1O1 = (i5 / 3.0f) / 2.0f;
        RectF rectF = this.iIXi1iiXI;
        float f2 = this.O001I;
        rectF.set(f2, f2, getWidth() - this.O001I, getWidth() - this.O001I);
    }

    @Override // android.view.View
    public boolean onTouchEvent(@aa1 MotionEvent event) {
        Intrinsics.X0O(event, "event");
        int action = event.getAction();
        if (action == 0) {
            this.i0X000X0O = true;
            LogUtils.m11128d("ACTION_DOWN");
            this.OX110i = 2000L;
            setProgress(5.0f);
            XIi00iiXO xIi00iiXO = this.iOiXi11II;
            if (xIi00iiXO != null) {
                xIi00iiXO.start(true);
            }
        } else if (action == 1 || action == 3) {
            this.i0X000X0O = false;
            LogUtils.m11128d("ACTION_UP");
            this.X100O.cancel();
            this.OX110i = 1L;
            setProgress(0.0f);
            XIi00iiXO xIi00iiXO2 = this.iOiXi11II;
            if (xIi00iiXO2 != null) {
                xIi00iiXO2.start(false);
            }
        }
        return super.onTouchEvent(event);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SportEndProgress(@aa1 Context context, @tb1 AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.X0O(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SportEndProgress(@aa1 Context context, @tb1 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.X0O(context, "context");
        this.iX1O1 = XIi00iiXO(60);
        this.X11iII1O1 = XIi00iiXO(60);
        Paint paint = new Paint();
        this.XXX11i = paint;
        Paint paint2 = new Paint();
        this.X1IX = paint2;
        Paint paint3 = new Paint();
        this.X0i1O = paint3;
        this.iIXi1iiXI = new RectF();
        float fXIi00iiXO = XIi00iiXO(4);
        this.iXiX011 = fXIi00iiXO;
        this.O001I = XIi00iiXO(6);
        this.X11I = true;
        this.X100O = new ValueAnimator();
        this.OX110i = 2000L;
        this.f55046OO = 5.0f;
        XO0O10(context, attributeSet);
        paint.setAntiAlias(this.X11I);
        paint.setColor(this.iXiiiO);
        paint2.setAntiAlias(this.X11I);
        paint2.setColor(this.Ii1iii0);
        paint3.setAntiAlias(this.X11I);
        paint3.setColor(this.iiiO);
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeWidth(fXIi00iiXO);
    }

    public /* synthetic */ SportEndProgress(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
