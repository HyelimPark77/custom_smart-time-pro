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
import com.android.mltcode.paycertificationapi.Oi0111I;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.blankj.utilcode.util.SizeUtils;
import com.sma.smartv3.R;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import skin.support.widget.SkinCompatView;

/* JADX INFO: loaded from: classes3.dex */
public final class Goal5ProgressBar extends SkinCompatView {
    public final float I1;
    public float Ii0X0X;

    @aa1
    public final Paint Ii1iii0;

    @aa1
    public final Paint O001I;
    public int OO;
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

    @JvmOverloads
    public Goal5ProgressBar(@aa1 Context r8) {
        Intrinsics.X0O(r8, "context");
        AttributeSet r3 = null;
        int r4 = 0;
        this(r8, r3, r4, 6, null);
    }

    private final void O00(Context r2, AttributeSet r3) {
        TypedArray r4 = r2.obtainStyledAttributes(r3, R.styleable.GoalProgressBar);
        Intrinsics.O10IXXX0X(r4, "obtainStyledAttributes(...)");
        this.XXX11i = r4.getBoolean(0, true);
        this.XX1Oi = r4.getColor(10, 0);
        this.OX110i = r4.getColor(11, 0);
        this.OO = r4.getColor(2, 0);
        this.XOX0O0 = r4.getColor(3, 0);
        this.iOiXi11II = r4.getColor(5, 0);
        this.X00XIX1 = r4.getColor(6, 0);
        r4.recycle();
    }

    public static /* synthetic */ void OXO1(Goal5ProgressBar r0, float r1, float r2, float r3, ValueAnimator r4) {
        XOO0ii0(r0, r1, r2, r3, r4);
    }

    private final float XO0O10(int r1) {
        return SizeUtils.dp2px(r1);
    }

    public static final void XOO0ii0(Goal5ProgressBar r1, float r2, float r3, float r4, ValueAnimator r5) {
        Intrinsics.X0O(r5, "animation");
        Object r6 = r5.getAnimatedValue();
        Intrinsics.X1ii(r6, "null cannot be cast to non-null type kotlin.Float");
        float r7 = ((Float) r6).floatValue();
        r1.i11I = r2 * r7;
        r1.Ii0X0X = r3 * r7;
        r1.X00Xi1X = r7 * r4;
        r1.invalidate();
    }

    public static /* synthetic */ int iO(Goal5ProgressBar r0, int r1, float r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L6;
        r2 = 0.3f;
    L6:
        return r0.XIi00iiXO(r1, r2);
    }

    private final void setProgressColor(float r9) {
        Matrix r0 = new Matrix();
        r0.postRotate(90.0f, r9, r9);
        Paint r1 = this.iIXi1iiXI;
        SweepGradient r2 = new SweepGradient(r9, r9, new int[]{this.XX1Oi, this.OX110i}, new float[]{0.166f, 0.833f});
        r2.setLocalMatrix(r0);
        r1.setShader(r2);
        Paint r3 = this.iXiX011;
        SweepGradient r4 = new SweepGradient(r9, r9, new int[]{iO(this, this.XX1Oi, 0.0f, 2, null), iO(this, this.OX110i, 0.0f, 2, null)}, new float[]{0.166f, 0.833f});
        r4.setLocalMatrix(r0);
        r3.setShader(r4);
        Paint r5 = this.O001I;
        SweepGradient r6 = new SweepGradient(r9, r9, new int[]{this.OO, this.XOX0O0}, new float[]{0.166f, 0.833f});
        r6.setLocalMatrix(r0);
        r5.setShader(r6);
        Paint r7 = this.XXO;
        SweepGradient r8 = new SweepGradient(r9, r9, new int[]{iO(this, this.OO, 0.0f, 2, null), iO(this, this.XOX0O0, 0.0f, 2, null)}, new float[]{0.166f, 0.833f});
        r8.setLocalMatrix(r0);
        r7.setShader(r8);
        Paint r10 = this.iXiiiO;
        SweepGradient r11 = new SweepGradient(r9, r9, new int[]{this.iOiXi11II, this.X00XIX1}, new float[]{0.166f, 0.833f});
        r11.setLocalMatrix(r0);
        r10.setShader(r11);
        Paint r12 = this.Ii1iii0;
        SweepGradient r13 = new SweepGradient(r9, r9, new int[]{iO(this, this.iOiXi11II, 0.0f, 2, null), iO(this, this.X00XIX1, 0.0f, 2, null)}, new float[]{0.166f, 0.833f});
        r13.setLocalMatrix(r0);
        r12.setShader(r13);
    }

    public final void I0IIOi(int r2, int r3) {
        if (r3 != 0) goto L4;
        r3 = 10000;
    L4:
        float r4 = (r2 / r3) * 100;
        float r5 = this.i0X000X0O;
        if (r4 <= r5) goto L7;
        r4 = r5;
    L7:
        this.i11I = r4;
        invalidate();
    }

    public final void IO(int r2, int r3) {
        if (r3 != 0) goto L4;
        r3 = 10000;
    L4:
        float r4 = (r2 / r3) * 100;
        float r5 = this.XXiIiX10;
        if (r4 <= r5) goto L7;
        r4 = r5;
    L7:
        this.X00Xi1X = r4;
        invalidate();
    }

    public final void IiI10X() {
        final float r0 = this.i11I;
        final float r1 = this.Ii0X0X;
        final float r2 = this.X00Xi1X;
        ValueAnimator r3 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        r3.setDuration(1000);
        r3.addUpdateListener(new Oi0111I(this, r0, r1, r2));
        r3.start();
    }

    public final void OIi0(int r2, int r3) {
        if (r3 != 0) goto L4;
        r3 = 10000;
    L4:
        float r4 = (r2 / r3) * 100;
        float r5 = this.XO0X10iO;
        if (r4 <= r5) goto L7;
        r4 = r5;
    L7:
        this.Ii0X0X = r4;
        invalidate();
    }

    public final int XIi00iiXO(int r3, float r4) {
        return Color.argb((int) (Color.alpha(r3) * r4), Color.red(r3), Color.green(r3), Color.blue(r3));
    }

    @Override // skin.support.widget.SkinCompatView, com.android.mltcode.paycertificationapi.ik4
    public void applySkin() {
        super.applySkin();
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(@aa1 Canvas r14) {
        Intrinsics.X0O(r14, "canvas");
        super.onDraw(r14);
        r14.save();
        r14.drawArc(this.iiiO, this.iX1O1, this.I1, false, this.iXiX011);
        float r10 = (this.i11I / this.i0X000X0O) * this.I1;
        this.X11iII1O1 = r10;
        r14.drawArc(this.iiiO, this.iX1O1, r10, false, this.iIXi1iiXI);
        r14.drawArc(this.X11I, this.iX1O1, this.I1, false, this.XXO);
        float r11 = (this.Ii0X0X / this.XO0X10iO) * this.I1;
        this.X11iII1O1 = r11;
        r14.drawArc(this.X11I, this.iX1O1, r11, false, this.O001I);
        r14.drawArc(this.X100O, this.iX1O1, this.I1, false, this.Ii1iii0);
        float r12 = (this.X00Xi1X / this.XXiIiX10) * this.I1;
        this.X11iII1O1 = r12;
        r14.drawArc(this.X100O, this.iX1O1, r12, false, this.iXiiiO);
    }

    @Override // android.view.View
    public void onMeasure(int r3, int r4) {
        super.onMeasure(r3, r4);
        int r5 = getMeasuredWidth();
        float r6 = r5;
        float r0 = r6 / 9.6f;
        this.X1IX = r0;
        setMeasuredDimension(r5, (int) ((((r6 * this.I1) / 360) + r0) + 15));
        this.X0i1O = this.X1IX * 0.4f;
    }

    @Override // android.view.View
    public void onSizeChanged(int r5, int r6, int r7, int r8) {
        super.onSizeChanged(r5, r6, r7, r8);
        float r9 = this.X1IX;
        float r10 = r9 / 2;
        this.iIXi1iiXI.setStrokeWidth(r9);
        this.iXiX011.setStrokeWidth(this.X1IX);
        this.O001I.setStrokeWidth(this.X1IX);
        this.XXO.setStrokeWidth(this.X1IX);
        this.iXiiiO.setStrokeWidth(this.X1IX);
        this.Ii1iii0.setStrokeWidth(this.X1IX);
        float r11 = r5;
        float r12 = r11 - r10;
        this.iiiO.set(r10, r10, r12, r12);
        RectF r13 = this.X11I;
        RectF r14 = this.iiiO;
        float r15 = r14.left;
        float r0 = this.X1IX;
        float r1 = this.X0i1O;
        r13.set((r15 + r0) + r1, (r14.top + r0) + r1, (r14.right - r0) - r1, (r14.bottom - r0) - r1);
        RectF r16 = this.X100O;
        RectF r17 = this.X11I;
        float r18 = r17.left;
        float r2 = this.X1IX;
        float r3 = this.X0i1O;
        r16.set((r18 + r2) + r3, (r17.top + r2) + r3, (r17.right - r2) - r3, (r17.bottom - r2) - r3);
        setProgressColor(r11 / 2.0f);
        applySkin();
    }

    @JvmOverloads
    public Goal5ProgressBar(@aa1 Context r8, @tb1 AttributeSet r9) {
        Intrinsics.X0O(r8, "context");
        int r4 = 0;
        this(r8, r9, r4, 4, null);
    }

    @JvmOverloads
    public Goal5ProgressBar(@aa1 Context r8, @tb1 AttributeSet r9, int r10) {
        Intrinsics.X0O(r8, "context");
        super(r8, r9, r10);
        this.I1 = 240.0f;
        this.iX1O1 = ((360 - 240.0f) / 2) + 90.0f;
        this.X11iII1O1 = 50.0f;
        this.XXX11i = true;
        this.X1IX = XO0O10(10);
        this.X0i1O = XO0O10(4);
        Paint r11 = new Paint();
        this.iIXi1iiXI = r11;
        Paint r0 = new Paint();
        this.iXiX011 = r0;
        Paint r1 = new Paint();
        this.O001I = r1;
        Paint r2 = new Paint();
        this.XXO = r2;
        Paint r3 = new Paint();
        this.iXiiiO = r3;
        Paint r4 = new Paint();
        this.Ii1iii0 = r4;
        this.iiiO = new RectF();
        this.X11I = new RectF();
        this.X100O = new RectF();
        this.i0X000X0O = 100.0f;
        this.i11I = 34.0f;
        this.XO0X10iO = 100.0f;
        this.Ii0X0X = 34.0f;
        this.XXiIiX10 = 100.0f;
        this.X00Xi1X = 34.0f;
        O00(r8, r9);
        r11.setAntiAlias(this.XXX11i);
        Paint.Style r12 = Paint.Style.STROKE;
        r11.setStyle(r12);
        Paint.Cap r13 = Paint.Cap.ROUND;
        r11.setStrokeCap(r13);
        r11.setStrokeWidth(this.X1IX);
        r0.setAntiAlias(this.XXX11i);
        r0.setStyle(r12);
        r0.setStrokeCap(r13);
        r0.setStrokeWidth(this.X1IX);
        r1.setAntiAlias(this.XXX11i);
        r1.setStyle(r12);
        r1.setStrokeCap(r13);
        r1.setStrokeWidth(this.X1IX);
        r2.setAntiAlias(this.XXX11i);
        r2.setStyle(r12);
        r2.setStrokeCap(r13);
        r2.setStrokeWidth(this.X1IX);
        r3.setAntiAlias(this.XXX11i);
        r3.setStyle(r12);
        r3.setStrokeCap(r13);
        r3.setStrokeWidth(this.X1IX);
        r4.setAntiAlias(this.XXX11i);
        r4.setStyle(r12);
        r4.setStrokeCap(r13);
        r4.setStrokeWidth(this.X1IX);
        applySkin();
    }

    public /* synthetic */ Goal5ProgressBar(Context r1, AttributeSet r2, int r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = null;
    L6:
        if ((r4 & 4) == 0) goto L8;
        r3 = 0;
    L8:
        this(r1, r2, r3);
    }
}
