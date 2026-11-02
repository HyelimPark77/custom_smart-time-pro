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
import androidx.core.app.NotificationCompat;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.sz4;
import com.android.mltcode.paycertificationapi.tb1;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.SizeUtils;
import com.sma.smartv3.R;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class SportEndProgress extends View {
    public float I1;
    public int IO;
    public int Ii1iii0;
    public final float O001I;
    public final float OO;
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
        void start(boolean r1);
    }

    @JvmOverloads
    public SportEndProgress(@aa1 Context r8) {
        Intrinsics.X0O(r8, "context");
        AttributeSet r3 = null;
        int r4 = 0;
        this(r8, r3, r4, 6, null);
    }

    public static final void O00(SportEndProgress r1, ValueAnimator r2) {
        Intrinsics.X0O(r2, "animation");
        Object r3 = r2.getAnimatedValue();
        Intrinsics.X1ii(r3, "null cannot be cast to non-null type kotlin.Float");
        float r4 = ((Float) r3).floatValue();
        r1.XX1Oi = r4;
        r1.XOX0O0 = r4 * r1.OO;
        r1.invalidate();
        if (r1.XOX0O0 == r1.OO) goto L5;
        return;
    L5:
        if (r1.i0X000X0O == false) goto L11;
        OXO1 r5 = r1.X00XIX1;
        if (r5 == null) goto L12;
        r5.end();
        return;
    L12:
        return;
    }

    public static /* synthetic */ void OXO1(SportEndProgress r0, ValueAnimator r1) {
        O00(r0, r1);
    }

    private final void setProgress(float r4) {
        float r0 = this.OO;
        if (r4 <= r0) goto L5;
        r4 = r0;
    L5:
        ValueAnimator r5 = ValueAnimator.ofFloat(new float[]{this.XX1Oi, r4 / r0});
        Intrinsics.O10IXXX0X(r5, "ofFloat(...)");
        this.X100O = r5;
        r5.setDuration(this.OX110i);
        this.X100O.addUpdateListener(new sz4(this));
        this.X100O.start();
    }

    public final void IiI10X(@aa1 XIi00iiXO r2) {
        Intrinsics.X0O(r2, "callback");
        this.iOiXi11II = r2;
    }

    public final float XIi00iiXO(int r1) {
        return SizeUtils.dp2px(r1);
    }

    public final void XO0O10(Context r3, AttributeSet r4) {
        TypedArray r5 = r3.obtainStyledAttributes(r4, R.styleable.SportEndProgress);
        Intrinsics.O10IXXX0X(r5, "obtainStyledAttributes(...)");
        this.X11I = r5.getBoolean(0, true);
        this.iXiiiO = r5.getColor(4, -1);
        this.Ii1iii0 = r5.getColor(2, -65536);
        this.iiiO = r5.getColor(3, -1);
        r5.recycle();
    }

    public final void iO(@aa1 OXO1 r2) {
        Intrinsics.X0O(r2, "callback");
        this.X00XIX1 = r2;
    }

    @Override // android.view.View
    public void onDraw(@aa1 Canvas r15) {
        Intrinsics.X0O(r15, "canvas");
        super.onDraw(r15);
        r15.save();
        float r0 = this.I1;
        r15.drawCircle(r0, r0, this.iX1O1, this.X1IX);
        float r1 = this.I1;
        float r2 = this.X11iII1O1;
        float r3 = r1 - r2;
        float r4 = r1 - r2;
        float r5 = this.iX1O1;
        r15.drawRect(r3, r4, r5 + r2, r5 + r2, this.XXX11i);
        float r11 = (this.XOX0O0 / this.OO) * 360.0f;
        this.XXO = r11;
        r15.drawArc(this.iIXi1iiXI, 270.0f, r11, false, this.X0i1O);
    }

    @Override // android.view.View
    public void onMeasure(int r1, int r2) {
        super.onMeasure(r1, r2);
        int r3 = Math.min(View.MeasureSpec.getSize(r1), View.MeasureSpec.getSize(r2));
        this.IO = r3;
        setMeasuredDimension(r3, r3);
    }

    @Override // android.view.View
    public void onSizeChanged(int r2, int r3, int r4, int r5) {
        super.onSizeChanged(r2, r3, r4, r5);
        int r6 = this.IO;
        float r7 = r6 / 2.0f;
        this.I1 = r7;
        this.iX1O1 = r7;
        this.X11iII1O1 = (r6 / 3.0f) / 2.0f;
        RectF r8 = this.iIXi1iiXI;
        float r9 = this.O001I;
        r8.set(r9, r9, getWidth() - this.O001I, getWidth() - this.O001I);
    }

    @Override // android.view.View
    public boolean onTouchEvent(@aa1 MotionEvent r5) {
        Intrinsics.X0O(r5, NotificationCompat.CATEGORY_EVENT);
        int r0 = r5.getAction();
        if (r0 == 0) goto L11;
        if (r0 != 1) goto L6;
    L8:
        this.i0X000X0O = false;
        LogUtils.d(new Object[]{"ACTION_UP"});
        this.X100O.cancel();
        this.OX110i = 1;
        setProgress(0.0f);
        XIi00iiXO r1 = this.iOiXi11II;
        if (r1 == null) goto L15;
        r1.start(false);
    L15:
        return super.onTouchEvent(r5);
    L6:
        if (r0 == 3) goto L8;
    L11:
        this.i0X000X0O = true;
        LogUtils.d(new Object[]{"ACTION_DOWN"});
        this.OX110i = 2000;
        setProgress(5.0f);
        XIi00iiXO r2 = this.iOiXi11II;
        if (r2 == null) goto L15;
        r2.start(true);
        goto L15
    }

    @JvmOverloads
    public SportEndProgress(@aa1 Context r8, @tb1 AttributeSet r9) {
        Intrinsics.X0O(r8, "context");
        int r4 = 0;
        this(r8, r9, r4, 4, null);
    }

    @JvmOverloads
    public SportEndProgress(@aa1 Context r6, @tb1 AttributeSet r7, int r8) {
        Intrinsics.X0O(r6, "context");
        super(r6, r7, r8);
        this.iX1O1 = XIi00iiXO(60);
        this.X11iII1O1 = XIi00iiXO(60);
        Paint r9 = new Paint();
        this.XXX11i = r9;
        Paint r0 = new Paint();
        this.X1IX = r0;
        Paint r1 = new Paint();
        this.X0i1O = r1;
        this.iIXi1iiXI = new RectF();
        float r2 = XIi00iiXO(4);
        this.iXiX011 = r2;
        this.O001I = XIi00iiXO(6);
        this.X11I = true;
        this.X100O = new ValueAnimator();
        this.OX110i = 2000;
        this.OO = 5.0f;
        XO0O10(r6, r7);
        r9.setAntiAlias(this.X11I);
        r9.setColor(this.iXiiiO);
        r0.setAntiAlias(this.X11I);
        r0.setColor(this.Ii1iii0);
        r1.setAntiAlias(this.X11I);
        r1.setColor(this.iiiO);
        r1.setStyle(Paint.Style.STROKE);
        r1.setStrokeWidth(r2);
    }

    public /* synthetic */ SportEndProgress(Context r1, AttributeSet r2, int r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = null;
    L6:
        if ((r4 & 4) == 0) goto L8;
        r3 = 0;
    L8:
        this(r1, r2, r3);
    }
}
