package com.sma.smartv3.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.view.ViewCompat;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.blankj.utilcode.util.SizeUtils;
import com.sma.smartv3.R;
import java.util.Arrays;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import skin.support.widget.SkinCompatView;

/* JADX INFO: loaded from: classes3.dex */
public final class SportGoalProgressBar extends SkinCompatView {
    public float I1;
    public int IO0II0i;

    @aa1
    public final Paint IO0iXO0O;

    @aa1
    public String IX0IXOi;
    public float IX1XiI;
    public float IXI;
    public int IXOIIIO;
    public int Ii0X0X;
    public final float Ii0i;

    @aa1
    public final Paint Ii1iii0;
    public float IiiXiI0I;

    @aa1
    public final Paint O001I;
    public int O0O0X0iOi;

    @aa1
    public final RectF OO;

    @aa1
    public final RectF OX110i;

    @tb1
    public Bitmap Oi;

    @aa1
    public final RectF X00XIX1;
    public int X00Xi1X;

    @aa1
    public final Paint X0i1O;
    public int X1;

    @aa1
    public final Paint X100O;

    @aa1
    public final Paint X11I;
    public float X11iII1O1;

    @aa1
    public final Paint X1IX;
    public int XO0X10iO;
    public float XOIX;
    public float XOO0XOOii;

    @aa1
    public final RectF XOX0O0;
    public float XOXiX0;
    public int XX00i10X;

    @aa1
    public final RectF XX1Oi;

    @aa1
    public final Paint XXO;
    public float XXX11i;
    public int XXiIiX10;

    @aa1
    public String XXiO0i;
    public int i0X000X0O;
    public int i11I;

    @aa1
    public final Paint iIXi1iiXI;
    public float iOI;

    @aa1
    public final RectF iOiXi11II;
    public boolean iX1O1;

    @aa1
    public final Paint iXiX011;

    @aa1
    public final Paint iXiiiO;

    @tb1
    public Bitmap iiIOiX;

    @aa1
    public final Paint iiiO;

    @JvmOverloads
    public SportGoalProgressBar(@aa1 Context r8) {
        Intrinsics.X0O(r8, "context");
        AttributeSet r3 = null;
        int r4 = 0;
        this(r8, r3, r4, 6, null);
    }

    private final float OXO1(int r1) {
        return SizeUtils.dp2px(r1);
    }

    private final void XIi00iiXO(Context r3, AttributeSet r4) {
        TypedArray r5 = r3.obtainStyledAttributes(r4, R.styleable.GoalProgressBar);
        Intrinsics.O10IXXX0X(r5, "obtainStyledAttributes(...)");
        this.iX1O1 = r5.getBoolean(0, true);
        this.i0X000X0O = r5.getColor(10, 0);
        this.i11I = r5.getColor(9, 0);
        this.XO0X10iO = r5.getColor(2, 0);
        this.Ii0X0X = r5.getColor(1, 0);
        this.XXiIiX10 = r5.getColor(5, 0);
        this.X00Xi1X = r5.getColor(4, 0);
        r5.recycle();
    }

    public final void XO0O10(float r2, float r3) {
        this.XOO0XOOii = r2;
        StringCompanionObject r0 = StringCompanionObject.OXO1;
        String r4 = String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(r2)}, 1));
        Intrinsics.O10IXXX0X(r4, "format(...)");
        this.IX0IXOi = r4;
        this.XOXiX0 = r3;
        invalidate();
    }

    @Override // skin.support.widget.SkinCompatView, com.android.mltcode.paycertificationapi.ik4
    public void applySkin() {
        super.applySkin();
        invalidate();
    }

    public final float getCenterPoint() {
        return this.IX1XiI;
    }

    @aa1
    public final String getMDistance() {
        return this.XXiO0i;
    }

    @aa1
    public final String getMKcal() {
        return this.IX0IXOi;
    }

    public final float getRectWidth() {
        return this.iOI;
    }

    public final int getViewHeight() {
        return this.O0O0X0iOi;
    }

    public final int getViewWidth() {
        return this.XX00i10X;
    }

    public final void iO(float r2, float r3) {
        this.XOIX = r2;
        StringCompanionObject r0 = StringCompanionObject.OXO1;
        String r4 = String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(r2)}, 1));
        Intrinsics.O10IXXX0X(r4, "format(...)");
        this.XXiO0i = r4;
        this.IiiXiI0I = r3;
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(@aa1 Canvas r14) {
        Intrinsics.X0O(r14, "canvas");
        super.onDraw(r14);
        r14.save();
        r14.drawArc(this.iOiXi11II, 0.0f, 360.0f, false, this.iiiO);
        r14.drawArc(this.OX110i, 90.0f, 360.0f, false, this.iXiX011);
        float r10 = (this.XOIX / this.IiiXiI0I) * 360.0f;
        this.I1 = r10;
        r14.drawArc(this.OX110i, 90.0f, r10, false, this.iIXi1iiXI);
        r14.drawArc(this.X00XIX1, 0.0f, 360.0f, false, this.X11I);
        r14.drawArc(this.OO, 90.0f, 360.0f, false, this.XXO);
        float r11 = (this.XOO0XOOii / this.XOXiX0) * 360.0f;
        this.I1 = r11;
        r14.drawArc(this.OO, 90.0f, r11, false, this.O001I);
        float r2 = 2;
        float r15 = ((this.XX00i10X / 2) - this.XXX11i) - (this.OX110i.width() / r2);
        float r1 = ((this.X11iII1O1 + this.IX1XiI) + (this.OX110i.height() / r2)) + OXO1(10);
        String r4 = this.XXiO0i;
        r14.drawText(r4, r15 - (this.iXiiiO.measureText(r4) / r2), r1, this.iXiiiO);
        String r5 = getContext().getString(com.sma.smartv3.pro.R.string.aerobic_training_effect);
        Intrinsics.O10IXXX0X(r5, "getString(...)");
        r14.drawText(r5, r15 - (this.X100O.measureText(r5) / r2), r1 + OXO1(30), this.X100O);
        float r16 = ((this.XX00i10X / 2) + this.XXX11i) + (this.OX110i.width() / r2);
        float r0 = ((this.X11iII1O1 + this.IX1XiI) + (this.OO.height() / r2)) + OXO1(10);
        String r3 = this.IX0IXOi;
        r14.drawText(r3, r16 - (this.iXiiiO.measureText(r3) / r2), r0, this.iXiiiO);
        String r6 = getContext().getString(com.sma.smartv3.pro.R.string.effect_of_anaerobic_training);
        Intrinsics.O10IXXX0X(r6, "getString(...)");
        r14.drawText(r6, r16 - (this.X100O.measureText(r6) / r2), r0 + OXO1(30), this.X100O);
    }

    @Override // android.view.View
    public void onMeasure(int r1, int r2) {
        super.onMeasure(r1, r2);
        setMeasuredDimension(View.MeasureSpec.getSize(r1), View.MeasureSpec.getSize(r2));
    }

    @Override // android.view.View
    public void onSizeChanged(int r6, int r7, int r8, int r9) {
        super.onSizeChanged(r6, r7, r8, r9);
        this.XX00i10X = r6;
        this.O0O0X0iOi = r7;
        this.iIXi1iiXI.setStrokeWidth(this.X11iII1O1);
        this.iXiX011.setStrokeWidth(this.X11iII1O1);
        this.O001I.setStrokeWidth(this.X11iII1O1);
        this.XXO.setStrokeWidth(this.X11iII1O1);
        int r10 = this.XX00i10X;
        float r11 = this.XXX11i;
        float r0 = 2;
        float r2 = this.X11iII1O1;
        float r12 = (r10 / 2.0f) - ((r11 * r0) + r2);
        this.iOI = r12;
        this.OX110i.set(((r10 / 2) - r11) - r12, r2 * r0, (r10 / 2) - r11, r12 + (r2 * r0));
        RectF r13 = this.OO;
        int r14 = this.XX00i10X;
        float r1 = this.XXX11i;
        float r3 = this.X11iII1O1;
        float r15 = this.iOI;
        r13.set((r14 / 2) + r1, r3 * r0, ((r14 / 2) + r1) + r15, r15 + (r3 * r0));
        applySkin();
    }

    public final void setCenterPoint(float r1) {
        this.IX1XiI = r1;
    }

    public final void setMDistance(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.XXiO0i = r2;
    }

    public final void setMKcal(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.IX0IXOi = r2;
    }

    public final void setRectWidth(float r1) {
        this.iOI = r1;
    }

    public final void setViewHeight(int r1) {
        this.O0O0X0iOi = r1;
    }

    public final void setViewWidth(int r1) {
        this.XX00i10X = r1;
    }

    @JvmOverloads
    public SportGoalProgressBar(@aa1 Context r8, @tb1 AttributeSet r9) {
        Intrinsics.X0O(r8, "context");
        int r4 = 0;
        this(r8, r9, r4, 4, null);
    }

    @JvmOverloads
    public SportGoalProgressBar(@aa1 Context r13, @tb1 AttributeSet r14, int r15) {
        Intrinsics.X0O(r13, "context");
        super(r13, r14, r15);
        this.I1 = 50.0f;
        this.iX1O1 = true;
        this.X11iII1O1 = OXO1(12);
        this.XXX11i = OXO1(15);
        Paint r16 = new Paint();
        this.X1IX = r16;
        Paint r0 = new Paint();
        this.X0i1O = r0;
        Paint r1 = new Paint();
        this.iIXi1iiXI = r1;
        Paint r2 = new Paint();
        this.iXiX011 = r2;
        Paint r3 = new Paint();
        this.O001I = r3;
        Paint r4 = new Paint();
        this.XXO = r4;
        Paint r5 = new Paint();
        this.iXiiiO = r5;
        Paint r6 = new Paint();
        this.Ii1iii0 = r6;
        Paint r7 = new Paint();
        this.iiiO = r7;
        Paint r8 = new Paint();
        this.X11I = r8;
        Paint r9 = new Paint();
        this.X100O = r9;
        this.XX1Oi = new RectF();
        this.OX110i = new RectF();
        this.OO = new RectF();
        this.XOX0O0 = new RectF();
        this.iOiXi11II = new RectF();
        this.X00XIX1 = new RectF();
        this.X1 = Color.parseColor("#FFF3EE");
        this.IXOIIIO = Color.parseColor("#EAF3F8");
        this.IO0II0i = Color.parseColor("#FBE8EB");
        this.Ii0i = 100.0f;
        this.IXI = 1.0f;
        this.IiiXiI0I = 100.0f;
        this.XOIX = 1.0f;
        this.XOXiX0 = 100.0f;
        this.XOO0XOOii = 1.0f;
        this.IO0iXO0O = new Paint();
        XIi00iiXO(r13, r14);
        r16.setAntiAlias(this.iX1O1);
        Paint.Style r17 = Paint.Style.STROKE;
        r16.setStyle(r17);
        Paint.Cap r18 = Paint.Cap.ROUND;
        r16.setStrokeCap(r18);
        r16.setStrokeWidth(this.X11iII1O1);
        r16.setColor(this.i0X000X0O);
        r0.setAntiAlias(this.iX1O1);
        r0.setStyle(r17);
        r0.setStrokeCap(r18);
        r0.setStrokeWidth(this.X11iII1O1);
        r0.setColor(this.i11I);
        r1.setAntiAlias(this.iX1O1);
        r1.setStyle(r17);
        r1.setStrokeCap(r18);
        r1.setStrokeWidth(this.X11iII1O1);
        r1.setColor(this.XO0X10iO);
        r2.setAntiAlias(this.iX1O1);
        r2.setStyle(r17);
        r2.setStrokeCap(r18);
        r2.setStrokeWidth(this.X11iII1O1);
        r2.setColor(this.Ii0X0X);
        r3.setAntiAlias(this.iX1O1);
        r3.setStyle(r17);
        r3.setStrokeCap(r18);
        r3.setStrokeWidth(this.X11iII1O1);
        r3.setColor(this.XXiIiX10);
        r4.setAntiAlias(this.iX1O1);
        r4.setStyle(r17);
        r4.setStrokeCap(r18);
        r4.setStrokeWidth(this.X11iII1O1);
        r4.setColor(this.X00Xi1X);
        r6.setAntiAlias(this.iX1O1);
        Paint.Style r19 = Paint.Style.FILL;
        r6.setStyle(r19);
        r6.setColor(this.X1);
        r7.setAntiAlias(this.iX1O1);
        r7.setStyle(r19);
        r7.setStrokeWidth(this.X11iII1O1);
        r7.setColor(this.IXOIIIO);
        r8.setAntiAlias(this.iX1O1);
        r8.setStyle(r19);
        r8.setStrokeWidth(this.X11iII1O1);
        r8.setColor(this.IO0II0i);
        r5.setAntiAlias(this.iX1O1);
        r5.setColor(ViewCompat.MEASURED_STATE_MASK);
        r5.setTextSize(SizeUtils.dp2px(32.0f));
        r9.setAntiAlias(this.iX1O1);
        r9.setColor(ViewCompat.MEASURED_STATE_MASK);
        r9.setTextSize(SizeUtils.dp2px(14.0f));
        applySkin();
        this.XXiO0i = "0.0";
        this.IX0IXOi = "0.0";
    }

    public /* synthetic */ SportGoalProgressBar(Context r1, AttributeSet r2, int r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = null;
    L6:
        if ((r4 & 4) == 0) goto L8;
        r3 = 0;
    L8:
        this(r1, r2, r3);
    }
}
