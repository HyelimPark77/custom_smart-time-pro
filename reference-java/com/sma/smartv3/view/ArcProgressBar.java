package com.sma.smartv3.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Xfermode;
import android.util.AttributeSet;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.hl4;
import com.android.mltcode.paycertificationapi.tb1;
import com.blankj.utilcode.util.SizeUtils;
import com.sma.smartv3.C15429R;
import com.sma.smartv3.view.ArcProgressBar;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import skin.support.widget.SkinCompatView;

/* JADX INFO: loaded from: classes3.dex */
public final class ArcProgressBar extends SkinCompatView {

    /* JADX INFO: renamed from: I1 */
    public int f54955I1;
    public int Ii1iii0;
    public float O001I;

    /* JADX INFO: renamed from: OO */
    public final long f54956OO;
    public float OX110i;
    public final float X0i1O;
    public int X100O;
    public int X11I;

    @aa1
    public final Paint X11iII1O1;

    @aa1
    public final Xfermode X1IX;
    public final float XOX0O0;

    @aa1
    public ValueAnimator XX1Oi;
    public int XXO;

    @aa1
    public final RectF XXX11i;
    public int iIXi1iiXI;
    public int iX1O1;
    public int iXiX011;
    public int iXiiiO;
    public int iiiO;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ArcProgressBar(@aa1 Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.X0O(context, "context");
    }

    public static final void O00(ArcProgressBar arcProgressBar, ValueAnimator animation) {
        Intrinsics.X0O(animation, "animation");
        Object animatedValue = animation.getAnimatedValue();
        Intrinsics.X1ii(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float fFloatValue = ((Float) animatedValue).floatValue();
        arcProgressBar.OX110i = fFloatValue;
        arcProgressBar.setProgress(fFloatValue);
    }

    public final void XIi00iiXO(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C15429R.styleable.ArcProgressBar);
        Intrinsics.O10IXXX0X(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.iiiO = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.X100O = typedArrayObtainStyledAttributes.getResourceId(2, 0);
        this.iXiX011 = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, this.iXiX011);
        this.iIXi1iiXI = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, this.iIXi1iiXI);
        this.O001I = typedArrayObtainStyledAttributes.getFloat(4, this.O001I);
        this.iXiiiO = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void XO0O10(float f, float f2, long j) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
        Intrinsics.O10IXXX0X(valueAnimatorOfFloat, "ofFloat(...)");
        this.XX1Oi = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(j);
        this.XX1Oi.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.android.mltcode.paycertificationapi.OXI0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ArcProgressBar.O00(this.f3450IO, valueAnimator);
            }
        });
        this.XX1Oi.start();
    }

    @Override // skin.support.widget.SkinCompatView, com.android.mltcode.paycertificationapi.ik4
    public void applySkin() {
        super.applySkin();
        Context context = getContext();
        Intrinsics.O10IXXX0X(context, "getContext(...)");
        this.XXO = hl4.XIi00iiXO(context, this.iXiiiO);
        Context context2 = getContext();
        Intrinsics.O10IXXX0X(context2, "getContext(...)");
        this.Ii1iii0 = hl4.XIi00iiXO(context2, this.iiiO);
        Context context3 = getContext();
        Intrinsics.O10IXXX0X(context3, "getContext(...)");
        this.X11I = hl4.XIi00iiXO(context3, this.X100O);
    }

    /* JADX INFO: renamed from: iO */
    public final void m38873iO(int i, int i2) {
        float f = (i / i2) * 100;
        float f2 = this.XOX0O0;
        if (f > f2) {
            f = f2;
        }
        XO0O10(this.OX110i, f / f2, this.f54956OO);
    }

    @Override // android.view.View
    public void onDraw(@aa1 Canvas canvas) {
        Intrinsics.X0O(canvas, "canvas");
        int iSaveLayer = canvas.saveLayer(null, null, 31);
        Paint paint = this.X11iII1O1;
        paint.setXfermode(null);
        paint.setColor(this.XXO);
        paint.setShader(null);
        RectF rectF = this.XXX11i;
        float f = this.X0i1O;
        rectF.set(f, f, this.f54955I1 - f, this.iX1O1 - f);
        RectF rectF2 = this.XXX11i;
        int i = this.iXiX011;
        canvas.drawRoundRect(rectF2, i, i, this.X11iII1O1);
        Paint paint2 = this.X11iII1O1;
        paint2.setXfermode(this.X1IX);
        float f2 = this.X0i1O;
        paint2.setShader(new LinearGradient(f2, f2, (this.f54955I1 - f2) * this.O001I, this.iX1O1 - f2, this.Ii1iii0, this.X11I, Shader.TileMode.CLAMP));
        RectF rectF3 = this.XXX11i;
        float f3 = this.X0i1O;
        rectF3.set(f3, f3, (this.f54955I1 - f3) * this.O001I, this.iX1O1 - f3);
        try {
            RectF rectF4 = this.XXX11i;
            int i2 = this.iIXi1iiXI;
            canvas.drawRoundRect(rectF4, i2, i2, this.X11iII1O1);
            if (this.O001I == 1.0f) {
                RectF rectF5 = this.XXX11i;
                int i3 = this.iXiX011;
                canvas.drawRoundRect(rectF5, i3, i3, this.X11iII1O1);
            } else {
                Path path = new Path();
                RectF rectF6 = this.XXX11i;
                int i4 = this.iXiX011;
                int i5 = this.iIXi1iiXI;
                path.addRoundRect(rectF6, new float[]{i4, i4, i5, i5, i5, i5, i4, i4}, Path.Direction.CW);
                canvas.drawPath(path, this.X11iII1O1);
            }
        } catch (Exception unused) {
        }
        canvas.restoreToCount(iSaveLayer);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f54955I1 = i;
        this.iX1O1 = i2;
        applySkin();
    }

    public final void setProgress(float f) {
        this.O001I = f;
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ArcProgressBar(@aa1 Context context, @tb1 AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.X0O(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ArcProgressBar(@aa1 Context context, @tb1 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.X0O(context, "context");
        Paint paint = new Paint();
        this.X11iII1O1 = paint;
        this.XXX11i = new RectF();
        this.X1IX = new PorterDuffXfermode(PorterDuff.Mode.SRC_IN);
        this.X0i1O = SizeUtils.dp2px(1.0f);
        this.iIXi1iiXI = SizeUtils.dp2px(1.0f);
        this.iXiX011 = SizeUtils.dp2px(1.0f);
        this.O001I = 0.05f;
        this.XX1Oi = new ValueAnimator();
        this.f54956OO = 1000L;
        this.XOX0O0 = 100.0f;
        XIi00iiXO(context, attributeSet);
        paint.setAntiAlias(true);
        paint.setDither(true);
        applySkin();
    }

    public /* synthetic */ ArcProgressBar(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
