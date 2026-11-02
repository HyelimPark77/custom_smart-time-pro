package com.sma.smartv3.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.hl4;
import com.android.mltcode.paycertificationapi.iiOI111I;
import com.android.mltcode.paycertificationapi.tb1;
import com.blankj.utilcode.util.SizeUtils;
import com.sma.smartv3.R;
import com.sma.smartv3.view.text.MyTypeface;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import skin.support.widget.SkinCompatView;

/* JADX INFO: loaded from: classes3.dex */
public final class BmiProgressBar extends SkinCompatView {
    public boolean I1;
    public float IXOIIIO;
    public float Ii0X0X;
    public float Ii1iii0;
    public float O001I;
    public int OO;
    public int OX110i;
    public int X00XIX1;
    public final float X00Xi1X;

    @aa1
    public final Paint X0i1O;

    @aa1
    public Paint.FontMetrics X1;
    public float X100O;
    public float X11I;

    @aa1
    public final Paint X11iII1O1;
    public float X1IX;
    public float XO0X10iO;
    public int XOX0O0;
    public int XX1Oi;
    public float XXO;
    public final float XXX11i;
    public final float XXiIiX10;
    public int i0X000X0O;

    @aa1
    public List<String> i11I;

    @aa1
    public final Paint iIXi1iiXI;
    public int iOiXi11II;

    @aa1
    public final Paint iX1O1;
    public int iXiX011;
    public float iXiiiO;
    public float iiiO;

    @JvmOverloads
    public BmiProgressBar(@aa1 Context r8) {
        Intrinsics.X0O(r8, "context");
        AttributeSet r3 = null;
        int r4 = 0;
        this(r8, r3, r4, 6, null);
    }

    private final void iO(Context r3, AttributeSet r4) {
        TypedArray r5 = r3.obtainStyledAttributes(r4, R.styleable.BmiProgressBar);
        Intrinsics.O10IXXX0X(r5, "obtainStyledAttributes(...)");
        this.I1 = r5.getBoolean(0, true);
        this.XX1Oi = r5.getResourceId(6, 0);
        this.OX110i = r5.getColor(1, -1);
        this.OO = r5.getColor(4, -1);
        this.XOX0O0 = r5.getColor(3, -1);
        this.iOiXi11II = r5.getColor(7, -1);
        this.X00XIX1 = r5.getColor(5, -1);
        this.i0X000X0O = r5.getColor(2, -1);
        r5.recycle();
    }

    public final void OXO1() {
        float r0 = this.Ii0X0X;
        if (r0 > 16.4f) goto L7;
        this.XO0X10iO = (this.Ii1iii0 / 2) / this.iXiX011;
        return;
    L7:
        if (r0 > 18.4f) goto L11;
        this.XO0X10iO = (((r0 - 16.4f) / 2.0f) * this.iiiO) / this.iXiX011;
        return;
    L11:
        if (r0 > 24.9f) goto L15;
        float r1 = this.iiiO;
        this.XO0X10iO = (r1 + (((r0 - 18.4f) / 6.5f) * r1)) / this.iXiX011;
        return;
    L15:
        if (r0 > 29.9f) goto L19;
        this.XO0X10iO = (this.X11I + (((r0 - 24.9f) / 5.0f) * this.iiiO)) / this.iXiX011;
        return;
    L19:
        if (r0 > 34.9f) goto L22;
        this.XO0X10iO = (this.X100O + (((r0 - 29.9f) / 5.000002f) * this.iiiO)) / this.iXiX011;
        return;
    L22:
        int r2 = this.iXiX011;
        this.XO0X10iO = (r2 - (this.Ii1iii0 / 2)) / r2;
    }

    public final float XIi00iiXO(int r1) {
        return SizeUtils.dp2px(r1);
    }

    public final float XO0O10(int r1) {
        return SizeUtils.sp2px(r1);
    }

    @Override // skin.support.widget.SkinCompatView, com.android.mltcode.paycertificationapi.ik4
    public void applySkin() {
        super.applySkin();
        Context r0 = getContext();
        Intrinsics.O10IXXX0X(r0, "getContext(...)");
        hl4.OXO1(r0, this.X11iII1O1, this.XX1Oi);
        Context r1 = getContext();
        Intrinsics.O10IXXX0X(r1, "getContext(...)");
        hl4.OXO1(r1, this.X0i1O, this.XX1Oi);
        invalidate();
    }

    @Override // android.view.View
    @SuppressLint({"DrawAllocation"})
    public void onDraw(@aa1 Canvas r9) {
        Intrinsics.X0O(r9, "canvas");
        super.onDraw(r9);
        r9.save();
        if (this.i11I.size() <= 1) goto L5;
        float r4 = 20;
        r9.drawText(this.i11I.get(0), this.iiiO - r4, this.XXX11i, this.X11iII1O1);
        r9.drawText(this.i11I.get(1), this.X11I - r4, this.XXX11i, this.X11iII1O1);
        r9.drawText(this.i11I.get(2), this.X100O - r4, this.XXX11i, this.X11iII1O1);
        float r2 = this.X00Xi1X;
        RectF r1 = new RectF(0.0f, r2, this.iiiO, this.XXiIiX10 + r2);
        float r3 = r1.centerY() + this.IXOIIIO;
        String r5 = getContext().getResources().getString(com.sma.smartv3.pro.R.string.thin);
        Intrinsics.O10IXXX0X(r5, "getString(...)");
        r9.drawText(r5, r1.centerX(), r3, this.X0i1O);
        float r6 = this.iiiO;
        float r7 = this.X00Xi1X;
        RectF r8 = new RectF(r6, r7, this.X11I, this.XXiIiX10 + r7);
        float r10 = r8.centerY() + this.IXOIIIO;
        String r11 = getContext().getResources().getString(com.sma.smartv3.pro.R.string.normal);
        Intrinsics.O10IXXX0X(r11, "getString(...)");
        r9.drawText(r11, r8.centerX(), r10, this.X0i1O);
        float r12 = this.X11I;
        float r13 = this.X00Xi1X;
        RectF r14 = new RectF(r12, r13, this.X100O, this.XXiIiX10 + r13);
        float r15 = r14.centerY() + this.IXOIIIO;
        String r16 = getContext().getResources().getString(com.sma.smartv3.pro.R.string.too_heavy);
        Intrinsics.O10IXXX0X(r16, "getString(...)");
        r9.drawText(r16, r14.centerX(), r15, this.X0i1O);
        float r17 = this.X100O;
        float r18 = this.X00Xi1X;
        RectF r19 = new RectF(r17, r18, this.iXiX011, this.XXiIiX10 + r18);
        float r20 = r19.centerY() + this.IXOIIIO;
        String r21 = getContext().getResources().getString(com.sma.smartv3.pro.R.string.class_1_obesity);
        Intrinsics.O10IXXX0X(r21, "getString(...)");
        r9.drawText(r21, r19.centerX(), r20, this.X0i1O);
    L5:
        this.iX1O1.setColor(this.XOX0O0);
        r9.drawRect(0.0f, this.O001I, this.iiiO, this.iXiiiO, this.iX1O1);
        this.iX1O1.setColor(this.iOiXi11II);
        r9.drawRect(this.iiiO, this.O001I, this.X11I, this.iXiiiO, this.iX1O1);
        this.iX1O1.setColor(this.X00XIX1);
        r9.drawRect(this.X11I, this.O001I, this.X100O, this.iXiiiO, this.iX1O1);
        this.iX1O1.setColor(this.i0X000X0O);
        r9.drawRect(this.X100O, this.O001I, this.iXiX011, this.iXiiiO, this.iX1O1);
        this.iIXi1iiXI.setColor(this.OO);
        float r22 = this.iXiX011 * this.XO0X10iO;
        float r23 = this.O001I;
        float r24 = 2;
        r9.drawCircle(r22, r23 + ((this.iXiiiO - r23) / r24), this.Ii1iii0 / r24, this.iIXi1iiXI);
        this.iIXi1iiXI.setColor(this.OX110i);
        float r25 = this.iXiX011 * this.XO0X10iO;
        float r26 = this.O001I;
        r9.drawCircle(r25, r26 + ((this.iXiiiO - r26) / r24), (this.Ii1iii0 / r24) - r24, this.iIXi1iiXI);
    }

    @Override // android.view.View
    public void onMeasure(int r1, int r2) {
        super.onMeasure(r1, r2);
        int r3 = View.MeasureSpec.getSize(r1);
        this.iXiX011 = r3;
        float r4 = r3 * 0.25f;
        this.iiiO = r4;
        this.X11I = 2 * r4;
        this.X100O = r4 * 3;
        OXO1();
    }

    public final void setBmi(float r2) {
        this.Ii0X0X = r2;
        this.i11I.clear();
        this.i11I.add("18.4");
        this.i11I.add("24.9");
        this.i11I.add("29.9");
        OXO1();
        invalidate();
    }

    @JvmOverloads
    public BmiProgressBar(@aa1 Context r8, @tb1 AttributeSet r9) {
        Intrinsics.X0O(r8, "context");
        int r4 = 0;
        this(r8, r9, r4, 4, null);
    }

    @JvmOverloads
    public BmiProgressBar(@aa1 Context r9, @tb1 AttributeSet r10, int r11) {
        Intrinsics.X0O(r9, "context");
        super(r9, r10, r11);
        this.I1 = true;
        Paint r12 = new Paint();
        this.iX1O1 = r12;
        Paint r0 = new Paint();
        this.X11iII1O1 = r0;
        float r1 = XO0O10(10);
        this.XXX11i = r1;
        this.X1IX = XIi00iiXO(6);
        Paint r2 = new Paint();
        this.X0i1O = r2;
        Paint r3 = new Paint();
        this.iIXi1iiXI = r3;
        this.O001I = XIi00iiXO(12) + this.X1IX;
        float r6 = XIi00iiXO(2);
        this.XXO = r6;
        this.iXiiiO = this.O001I + r6;
        this.Ii1iii0 = XIi00iiXO(4) + this.XXO;
        this.i11I = new ArrayList();
        float r7 = XO0O10(11);
        this.XXiIiX10 = r7;
        this.X00Xi1X = this.iXiiiO + XIi00iiXO(12);
        iO(r9, r10);
        r12.setAntiAlias(this.I1);
        r0.setAntiAlias(this.I1);
        iiOI111I r13 = iiOI111I.OXO1;
        r0.setTypeface(r13.OXO1(MyTypeface.DIN_COND_BOLD, r9));
        r0.setColor(this.XX1Oi);
        r0.setTextSize(r1);
        r2.setAntiAlias(this.I1);
        r2.setTypeface(r13.OXO1(MyTypeface.PF_MEDIUM, r9));
        r2.setColor(this.XX1Oi);
        r2.setTextSize(r7);
        r2.setTextAlign(Paint.Align.CENTER);
        Paint.FontMetrics r14 = r2.getFontMetrics();
        Intrinsics.O10IXXX0X(r14, "getFontMetrics(...)");
        this.X1 = r14;
        float r15 = r14.bottom;
        this.IXOIIIO = ((r15 - r14.top) / 2) - r15;
        r3.setAntiAlias(this.I1);
        applySkin();
    }

    public /* synthetic */ BmiProgressBar(Context r1, AttributeSet r2, int r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = null;
    L6:
        if ((r4 & 4) == 0) goto L8;
        r3 = 0;
    L8:
        this(r1, r2, r3);
    }
}
