package com.sma.smartv3.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.android.mltcode.paycertificationapi.I0111i;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.blankj.utilcode.util.SizeUtils;
import com.sma.smartv3.R;
import kotlin.Pair;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import skin.support.widget.SkinCompatView;

/* JADX INFO: loaded from: classes3.dex */
public final class CircularProgressBar extends SkinCompatView {

    @aa1
    public final String I1;
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

    @JvmOverloads
    public CircularProgressBar(@aa1 Context r8) {
        Intrinsics.X0O(r8, "context");
        AttributeSet r3 = null;
        int r4 = 0;
        this(r8, r3, r4, 6, null);
    }

    private final void O00(Context r4, AttributeSet r5) {
        TypedArray r6 = r4.obtainStyledAttributes(r5, R.styleable.CircularProgressBar);
        Intrinsics.O10IXXX0X(r6, "obtainStyledAttributes(...)");
        this.iXiiiO = r6.getColor(1, -65536);
        this.Ii1iii0 = r6.getColor(0, -16776961);
        this.X0i1O = r6.getDimension(2, 0.0f);
        this.X11iII1O1 = r6.getFloat(3, 270.0f);
        float r7 = r6.getFloat(4, 360.0f);
        this.iX1O1 = r7;
        if (r7 < 360.0f) goto L5;
    L7:
        r6.recycle();
        return;
    L5:
        if (this.X11iII1O1 != 270.0f) goto L7;
        this.X11iII1O1 = ((360 - r7) / 2) + 90.0f;
        goto L7
    }

    public static /* synthetic */ void OXO1(CircularProgressBar r0, float r1, ValueAnimator r2) {
        XOO0ii0(r0, r1, r2);
    }

    public static final void XOO0ii0(CircularProgressBar r1, float r2, ValueAnimator r3) {
        Intrinsics.X0O(r3, "animation");
        Object r4 = r3.getAnimatedValue();
        Intrinsics.X1ii(r4, "null cannot be cast to non-null type kotlin.Float");
        r1.X11I = ((Float) r4).floatValue() * r2;
        r1.invalidate();
    }

    public final void I0IIOi(int r2, int r3) {
        if (r3 != 0) goto L4;
        r3 = 10000;
    L4:
        float r4 = (r2 / r3) * 100;
        float r5 = this.iiiO;
        if (r4 <= r5) goto L7;
        r4 = r5;
    L7:
        this.X11I = r4;
        invalidate();
    }

    public final void IiI10X() {
        final float r0 = this.X11I;
        ValueAnimator r1 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        r1.setDuration(1000);
        r1.addUpdateListener(new I0111i(this, r0));
        r1.start();
    }

    public final float XIi00iiXO(float r1) {
        return SizeUtils.dp2px(r1);
    }

    @aa1
    public final Pair<Float, Float> XO0O10(float r5, float r6, float r7, float r8) {
        double r0 = Math.toRadians(r8);
        return new Pair(Float.valueOf(r5 + (((float) Math.cos(r0)) * r7)), Float.valueOf(r6 + (r7 * ((float) Math.sin(r0)))));
    }

    @Override // skin.support.widget.SkinCompatView, com.android.mltcode.paycertificationapi.ik4
    public void applySkin() {
        super.applySkin();
        invalidate();
    }

    public final boolean getEnableDot() {
        return this.X100O;
    }

    public final void iO(Canvas r8) {
        float r1 = 2;
        Pair<Float, Float> r0 = XO0O10(this.XXO.width() / r1, this.XXO.width() / r1, this.XXO.width() / r1, this.X11iII1O1);
        Pair<Float, Float> r2 = XO0O10(this.XXO.width() / r1, this.XXO.width() / r1, this.XXO.width() / r1, this.X11iII1O1 + this.XXX11i);
        float r3 = this.X0i1O / 4;
        r8.drawCircle(r0.getFirst().floatValue() + (this.X0i1O / r1), r0.getSecond().floatValue() + (this.X0i1O / r1), r3, this.O001I);
        r8.drawCircle(r2.getFirst().floatValue() + (this.X0i1O / r1), r2.getSecond().floatValue() + (this.X0i1O / r1), r3, this.O001I);
    }

    @Override // android.view.View
    public void onDraw(@aa1 Canvas r14) {
        Intrinsics.X0O(r14, "canvas");
        super.onDraw(r14);
        r14.save();
        r14.drawArc(this.XXO, this.X11iII1O1, this.iX1O1, false, this.iXiX011);
        float r10 = (this.X11I / this.iiiO) * this.iX1O1;
        this.XXX11i = r10;
        r14.drawArc(this.XXO, this.X11iII1O1, r10, false, this.iIXi1iiXI);
        if (this.X100O == false) goto L6;
        iO(r14);
        return;
    }

    @Override // android.view.View
    public void onMeasure(int r2, int r3) {
        super.onMeasure(r2, r3);
        int r4 = getMeasuredWidth();
        setMeasuredDimension(r4, r4);
        if (this.X0i1O != 0.0f) goto L6;
        this.X0i1O = r4 / 10.0f;
        return;
    }

    @Override // android.view.View
    public void onSizeChanged(int r1, int r2, int r3, int r4) {
        super.onSizeChanged(r1, r2, r3, r4);
        float r5 = this.X0i1O;
        float r6 = r5 / 2;
        this.iIXi1iiXI.setStrokeWidth(r5);
        this.iXiX011.setStrokeWidth(this.X0i1O);
        float r7 = r1 - r6;
        this.XXO.set(r6, r6, r7, r7);
        applySkin();
    }

    public final void setEnableDot(boolean r1) {
        this.X100O = r1;
    }

    @JvmOverloads
    public CircularProgressBar(@aa1 Context r8, @tb1 AttributeSet r9) {
        Intrinsics.X0O(r8, "context");
        int r4 = 0;
        this(r8, r9, r4, 4, null);
    }

    @JvmOverloads
    public CircularProgressBar(@aa1 Context r5, @tb1 AttributeSet r6, int r7) {
        Intrinsics.X0O(r5, "context");
        super(r5, r6, r7);
        this.I1 = "CircularProgressBar";
        this.iX1O1 = 360.0f;
        this.X11iII1O1 = 270.0f;
        this.XXX11i = 50.0f;
        this.X1IX = true;
        Paint r0 = new Paint();
        this.iIXi1iiXI = r0;
        Paint r1 = new Paint();
        this.iXiX011 = r1;
        Paint r2 = new Paint();
        this.O001I = r2;
        this.XXO = new RectF();
        this.iXiiiO = -65536;
        this.Ii1iii0 = -16776961;
        this.iiiO = 100.0f;
        this.X11I = 34.0f;
        O00(r5, r6);
        r0.setAntiAlias(this.X1IX);
        Paint.Style r8 = Paint.Style.STROKE;
        r0.setStyle(r8);
        Paint.Cap r9 = Paint.Cap.ROUND;
        r0.setStrokeCap(r9);
        r0.setStrokeWidth(this.X0i1O);
        r0.setColor(this.iXiiiO);
        r1.setAntiAlias(this.X1IX);
        r1.setStyle(r8);
        r1.setStrokeCap(r9);
        r1.setStrokeWidth(this.X0i1O);
        r1.setColor(this.Ii1iii0);
        r2.setColor(-1);
        r2.setStyle(Paint.Style.FILL);
        r2.setAntiAlias(true);
        applySkin();
    }

    public /* synthetic */ CircularProgressBar(Context r1, AttributeSet r2, int r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = null;
    L6:
        if ((r4 & 4) == 0) goto L8;
        r3 = 0;
    L8:
        this(r1, r2, r3);
    }
}
