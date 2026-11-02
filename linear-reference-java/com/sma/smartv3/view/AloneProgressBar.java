package com.sma.smartv3.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.tb1;
import com.blankj.utilcode.util.SizeUtils;
import com.google.firebase.crashlytics.buildtools.reloc.org.apache.commons.cli.HelpFormatter;
import com.sma.smartv3.R;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class AloneProgressBar extends View {
    public boolean I1;
    public float IO;
    public int Ii1iii0;

    @aa1
    public final RectF O001I;
    public float OO;
    public float OX110i;
    public int X00XIX1;

    @aa1
    public final Paint X0i1O;
    public int X100O;
    public int X11I;

    @aa1
    public final Paint X11iII1O1;

    @aa1
    public final Paint X1IX;

    @aa1
    public String XOX0O0;
    public int XX1Oi;
    public int XXO;

    @aa1
    public final Paint XXX11i;

    @aa1
    public final Paint iIXi1iiXI;
    public int iOiXi11II;
    public float iX1O1;

    @aa1
    public final RectF iXiX011;
    public int iXiiiO;
    public int iiiO;

    @JvmOverloads
    public AloneProgressBar(@aa1 Context r8) {
        Intrinsics.X0O(r8, "context");
        AttributeSet r3 = null;
        int r4 = 0;
        this(r8, r3, r4, 6, null);
    }

    public static /* synthetic */ void XO0O10(AloneProgressBar r0, int r1, int r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = 0;
    L5:
        r0.iO(r1, r2);
    }

    public final float OXO1(int r1) {
        return SizeUtils.dp2px(r1);
    }

    public final void XIi00iiXO(Context r3, AttributeSet r4) {
        TypedArray r5 = r3.obtainStyledAttributes(r4, R.styleable.GoalProgressBar);
        Intrinsics.O10IXXX0X(r5, "obtainStyledAttributes(...)");
        this.I1 = r5.getBoolean(0, true);
        this.XXO = r5.getColor(10, 0);
        this.iXiiiO = r5.getColor(9, 0);
        this.Ii1iii0 = r5.getColor(2, 0);
        this.iiiO = r5.getColor(1, 0);
        this.X11I = r5.getColor(5, 0);
        this.X100O = r5.getColor(4, 0);
        this.iX1O1 = r5.getDimension(7, 4.0f);
        r5.recycle();
    }

    public final void iO(int r1, int r2) {
        if (r2 == 0) goto L4;
        setRingWidth(r2);
    L4:
        this.OO = r1;
        this.OX110i = 100.0f;
        this.XOX0O0 = String.valueOf(r1);
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(@aa1 Canvas r14) {
        Intrinsics.X0O(r14, "canvas");
        super.onDraw(r14);
        r14.drawArc(this.iXiX011, 270.0f, 360.0f, false, this.XXX11i);
        float r10 = (this.OO / this.OX110i) * 360.0f;
        this.IO = r10;
        r14.drawArc(this.iXiX011, 270.0f, r10, false, this.X11iII1O1);
        float r15 = this.iOiXi11II / 2.0f;
        float r2 = this.X00XIX1 / 2.0f;
        Rect r0 = new Rect();
        Paint r3 = this.X1IX;
        String r4 = this.XOX0O0;
        r3.getTextBounds(r4, 0, r4.length(), r0);
        r14.drawText(this.XOX0O0, r15, r2 - r0.exactCenterY(), this.X1IX);
    }

    @Override // android.view.View
    public void onMeasure(int r1, int r2) {
        super.onMeasure(r1, r2);
        setMeasuredDimension(View.MeasureSpec.getSize(r1), View.MeasureSpec.getSize(r2));
    }

    @Override // android.view.View
    public void onSizeChanged(int r3, int r4, int r5, int r6) {
        super.onSizeChanged(r3, r4, r5, r6);
        this.iOiXi11II = r3;
        this.X00XIX1 = r4;
        this.X11iII1O1.setStrokeWidth(this.iX1O1);
        this.XXX11i.setStrokeWidth(this.iX1O1);
        float r7 = Math.min(this.iOiXi11II, this.X00XIX1) - this.iX1O1;
        float r8 = (this.iOiXi11II - r7) / 2.0f;
        float r9 = (this.X00XIX1 - r7) / 2.0f;
        float r0 = r8 + r7;
        float r10 = r7 + r9;
        this.O001I.set(r8, r9, r0, r10);
        float r1 = this.iX1O1 / 2.0f;
        this.iXiX011.set(r8 + r1, r9 + r1, r0 - r1, r10 - r1);
    }

    public final void setProgressSelectedBgColor(int r2) {
        this.Ii1iii0 = r2;
        this.X11iII1O1.setColor(r2);
    }

    public final void setRingWidth(int r1) {
        this.iX1O1 = OXO1(r1);
    }

    public final void setValue(int r2) {
        this.OO = r2;
        this.OX110i = 100.0f;
        this.XOX0O0 = r2 + "%";
        invalidate();
    }

    @JvmOverloads
    public AloneProgressBar(@aa1 Context r8, @tb1 AttributeSet r9) {
        Intrinsics.X0O(r8, "context");
        int r4 = 0;
        this(r8, r9, r4, 4, null);
    }

    @JvmOverloads
    public AloneProgressBar(@aa1 Context r7, @tb1 AttributeSet r8, int r9) {
        Intrinsics.X0O(r7, "context");
        super(r7, r8, r9);
        this.IO = 50.0f;
        this.I1 = true;
        this.iX1O1 = OXO1(4);
        Paint r10 = new Paint();
        this.X11iII1O1 = r10;
        Paint r0 = new Paint();
        this.XXX11i = r0;
        Paint r1 = new Paint();
        this.X1IX = r1;
        Paint r2 = new Paint();
        this.X0i1O = r2;
        Paint r3 = new Paint();
        this.iIXi1iiXI = r3;
        this.iXiX011 = new RectF();
        this.O001I = new RectF();
        this.XX1Oi = -16776961;
        this.OX110i = 100.0f;
        this.OO = 100.0f;
        this.XOX0O0 = HelpFormatter.DEFAULT_LONG_OPT_PREFIX;
        XIi00iiXO(r7, r8);
        r10.setAntiAlias(this.I1);
        Paint.Style r11 = Paint.Style.STROKE;
        r10.setStyle(r11);
        Paint.Cap r4 = Paint.Cap.ROUND;
        r10.setStrokeCap(r4);
        r10.setStrokeWidth(this.iX1O1);
        r10.setColor(this.Ii1iii0);
        r0.setAntiAlias(this.I1);
        r0.setStyle(r11);
        r0.setStrokeCap(r4);
        r0.setStrokeWidth(this.iX1O1);
        r0.setColor(this.iiiO);
        r2.setAntiAlias(this.I1);
        r2.setStyle(Paint.Style.FILL);
        r2.setStrokeWidth(this.iX1O1);
        r2.setColor(this.XX1Oi);
        r1.setAntiAlias(this.I1);
        r1.setColor(gk4.iO(r7, com.sma.smartv3.pro.R.color.text_color));
        r1.setTextSize(SizeUtils.dp2px(34.0f));
        Paint.Align r12 = Paint.Align.CENTER;
        r1.setTextAlign(r12);
        r3.setAntiAlias(this.I1);
        r3.setColor(gk4.iO(r7, com.sma.smartv3.pro.R.color.text_color));
        r3.setTextSize(SizeUtils.dp2px(14.0f));
        r3.setTextAlign(r12);
    }

    public /* synthetic */ AloneProgressBar(Context r1, AttributeSet r2, int r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = null;
    L6:
        if ((r4 & 4) == 0) goto L8;
        r3 = 0;
    L8:
        this(r1, r2, r3);
    }
}
