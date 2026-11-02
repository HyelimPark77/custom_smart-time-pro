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
import com.android.mltcode.paycertificationapi.OXI0;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.hl4;
import com.android.mltcode.paycertificationapi.tb1;
import com.blankj.utilcode.util.SizeUtils;
import com.sma.smartv3.R;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import skin.support.widget.SkinCompatView;

/* JADX INFO: loaded from: classes3.dex */
public final class ArcProgressBar extends SkinCompatView {
    public int I1;
    public int Ii1iii0;
    public float O001I;
    public final long OO;
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

    @JvmOverloads
    public ArcProgressBar(@aa1 Context r8) {
        Intrinsics.X0O(r8, "context");
        AttributeSet r3 = null;
        int r4 = 0;
        this(r8, r3, r4, 6, null);
    }

    public static final void O00(ArcProgressBar r1, ValueAnimator r2) {
        Intrinsics.X0O(r2, "animation");
        Object r3 = r2.getAnimatedValue();
        Intrinsics.X1ii(r3, "null cannot be cast to non-null type kotlin.Float");
        float r4 = ((Float) r3).floatValue();
        r1.OX110i = r4;
        r1.setProgress(r4);
    }

    public static /* synthetic */ void OXO1(ArcProgressBar r0, ValueAnimator r1) {
        O00(r0, r1);
    }

    public final void XIi00iiXO(Context r3, AttributeSet r4) {
        TypedArray r5 = r3.obtainStyledAttributes(r4, R.styleable.ArcProgressBar);
        Intrinsics.O10IXXX0X(r5, "obtainStyledAttributes(...)");
        this.iiiO = r5.getResourceId(5, 0);
        this.X100O = r5.getResourceId(2, 0);
        this.iXiX011 = r5.getDimensionPixelSize(1, this.iXiX011);
        this.iIXi1iiXI = r5.getDimensionPixelSize(3, this.iIXi1iiXI);
        this.O001I = r5.getFloat(4, this.O001I);
        this.iXiiiO = r5.getResourceId(0, 0);
        r5.recycle();
    }

    public final void XO0O10(float r3, float r4, long r5) {
        ValueAnimator r6 = ValueAnimator.ofFloat(new float[]{r3, r4});
        Intrinsics.O10IXXX0X(r6, "ofFloat(...)");
        this.XX1Oi = r6;
        r6.setDuration(r5);
        this.XX1Oi.addUpdateListener(new OXI0(this));
        this.XX1Oi.start();
    }

    @Override // skin.support.widget.SkinCompatView, com.android.mltcode.paycertificationapi.ik4
    public void applySkin() {
        super.applySkin();
        Context r0 = getContext();
        Intrinsics.O10IXXX0X(r0, "getContext(...)");
        this.XXO = hl4.XIi00iiXO(r0, this.iXiiiO);
        Context r1 = getContext();
        Intrinsics.O10IXXX0X(r1, "getContext(...)");
        this.Ii1iii0 = hl4.XIi00iiXO(r1, this.iiiO);
        Context r2 = getContext();
        Intrinsics.O10IXXX0X(r2, "getContext(...)");
        this.X11I = hl4.XIi00iiXO(r2, this.X100O);
    }

    public final void iO(int r4, int r5) {
        float r6 = (r4 / r5) * 100;
        float r7 = this.XOX0O0;
        if (r6 <= r7) goto L5;
        r6 = r7;
    L5:
        XO0O10(this.OX110i, r6 / r7, this.OO);
    }

    @Override // android.view.View
    public void onDraw(@aa1 Canvas r14) {
        Intrinsics.X0O(r14, "canvas");
        int r0 = r14.saveLayer(null, null, 31);
        Paint r2 = this.X11iII1O1;
        r2.setXfermode(null);
        r2.setColor(this.XXO);
        r2.setShader(null);
        RectF r1 = this.XXX11i;
        float r3 = this.X0i1O;
        r1.set(r3, r3, this.I1 - r3, this.iX1O1 - r3);
        RectF r4 = this.XXX11i;
        int r5 = this.iXiX011;
        r14.drawRoundRect(r4, r5, r5, this.X11iII1O1);
        Paint r6 = this.X11iII1O1;
        r6.setXfermode(this.X1IX);
        float r7 = this.X0i1O;
        r6.setShader(new LinearGradient(r7, r7, (this.I1 - r7) * this.O001I, this.iX1O1 - r7, this.Ii1iii0, this.X11I, Shader.TileMode.CLAMP));
        RectF r8 = this.XXX11i;
        float r9 = this.X0i1O;
        r8.set(r9, r9, (this.I1 - r9) * this.O001I, this.iX1O1 - r9);
        RectF r10 = this.XXX11i;     // Catch: Exception -> L9
        int r11 = this.iIXi1iiXI;     // Catch: Exception -> L9
        r14.drawRoundRect(r10, r11, r11, this.X11iII1O1);     // Catch: Exception -> L9
        if (this.O001I != 1.0f) goto L6;
        RectF r12 = this.XXX11i;     // Catch: Exception -> L9
        int r13 = this.iXiX011;     // Catch: Exception -> L9
        r14.drawRoundRect(r12, r13, r13, this.X11iII1O1);     // Catch: Exception -> L9
    L10:
        goto L7
    L6:
        Path r15 = new Path();     // Catch: Exception -> L9
        RectF r16 = this.XXX11i;     // Catch: Exception -> L9
        int r17 = this.iXiX011;     // Catch: Exception -> L9
        int r18 = this.iIXi1iiXI;     // Catch: Exception -> L9
        r15.addRoundRect(r16, new float[]{r17, r17, r18, r18, r18, r18, r17, r17}, Path.Direction.CW);     // Catch: Exception -> L9
        r14.drawPath(r15, this.X11iII1O1);     // Catch: Exception -> L9
    L7:
        r14.restoreToCount(r0);
    }

    @Override // android.view.View
    public void onSizeChanged(int r1, int r2, int r3, int r4) {
        super.onSizeChanged(r1, r2, r3, r4);
        this.I1 = r1;
        this.iX1O1 = r2;
        applySkin();
    }

    public final void setProgress(float r1) {
        this.O001I = r1;
        invalidate();
    }

    @JvmOverloads
    public ArcProgressBar(@aa1 Context r8, @tb1 AttributeSet r9) {
        Intrinsics.X0O(r8, "context");
        int r4 = 0;
        this(r8, r9, r4, 4, null);
    }

    @JvmOverloads
    public ArcProgressBar(@aa1 Context r3, @tb1 AttributeSet r4, int r5) {
        Intrinsics.X0O(r3, "context");
        super(r3, r4, r5);
        Paint r6 = new Paint();
        this.X11iII1O1 = r6;
        this.XXX11i = new RectF();
        this.X1IX = new PorterDuffXfermode(PorterDuff.Mode.SRC_IN);
        this.X0i1O = SizeUtils.dp2px(1.0f);
        this.iIXi1iiXI = SizeUtils.dp2px(1.0f);
        this.iXiX011 = SizeUtils.dp2px(1.0f);
        this.O001I = 0.05f;
        this.XX1Oi = new ValueAnimator();
        this.OO = 1000;
        this.XOX0O0 = 100.0f;
        XIi00iiXO(r3, r4);
        r6.setAntiAlias(true);
        r6.setDither(true);
        applySkin();
    }

    public /* synthetic */ ArcProgressBar(Context r1, AttributeSet r2, int r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = null;
    L6:
        if ((r4 & 4) == 0) goto L8;
        r3 = 0;
    L8:
        this(r1, r2, r3);
    }
}
