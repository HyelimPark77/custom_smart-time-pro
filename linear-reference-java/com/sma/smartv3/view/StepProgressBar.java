package com.sma.smartv3.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.view.View;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.hl4;
import com.android.mltcode.paycertificationapi.iiOI111I;
import com.android.mltcode.paycertificationapi.la5;
import com.android.mltcode.paycertificationapi.tb1;
import com.blankj.utilcode.util.SizeUtils;
import com.sma.smartv3.R;
import com.sma.smartv3.view.text.MyTypeface;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import skin.support.widget.SkinCompatView;

/* JADX INFO: loaded from: classes3.dex */
public final class StepProgressBar extends SkinCompatView {
    public float I1;
    public int IO0II0i;
    public float IO0iXO0O;
    public final float IX0IXOi;
    public float IX1XiI;
    public int IXI;
    public int IXOIIIO;
    public int Ii0X0X;

    @aa1
    public final Paint Ii0i;

    @aa1
    public final DashPathEffect Ii1iii0;

    @aa1
    public final Paint IiiXiI0I;
    public float O001I;

    @aa1
    public String O0O;
    public int O0O0X0iOi;
    public int OO;
    public int OX110i;

    @aa1
    public Paint Oi;
    public int X00XIX1;
    public float X00Xi1X;

    @aa1
    public final Paint X0i1O;
    public float X1;
    public float X100O;

    @aa1
    public final RectF X11I;
    public float X11iII1O1;
    public int X1IX;
    public final float XO0X10iO;
    public int XOIX;

    @aa1
    public Bitmap XOO0XOOii;
    public int XOX0O0;
    public int XOXiX0;

    @aa1
    public String XX00i10X;
    public int XX1Oi;
    public int XXO;
    public boolean XXX11i;

    @aa1
    public final Paint XXiIiX10;
    public final long XXiO0i;

    @aa1
    public final Paint i0X000X0O;
    public final float i11I;
    public float iIXi1iiXI;

    @aa1
    public ValueAnimator iOI;
    public int iOiXi11II;
    public float iX1O1;
    public float iXi;
    public float iXiX011;
    public float iXiiiO;

    @aa1
    public Paint iiIOiX;

    @aa1
    public final Paint iiiO;

    @JvmOverloads
    public StepProgressBar(@aa1 Context r8) {
        Intrinsics.X0O(r8, "context");
        AttributeSet r3 = null;
        int r4 = 0;
        this(r8, r3, r4, 6, null);
    }

    private final void IiI10X(float r3, float r4, long r5) {
        ValueAnimator r6 = ValueAnimator.ofFloat(new float[]{r3, r4});
        Intrinsics.O10IXXX0X(r6, "ofFloat(...)");
        this.iOI = r6;
        r6.setDuration(r5);
        this.iOI.addUpdateListener(new la5(this));
        this.iOI.start();
    }

    private final float O00(int r1) {
        return SizeUtils.sp2px(r1);
    }

    public static /* synthetic */ void OXO1(StepProgressBar r0, ValueAnimator r1) {
        XOO0ii0(r0, r1);
    }

    private final float XIi00iiXO(int r1) {
        return SizeUtils.dp2px(r1);
    }

    public static final void XOO0ii0(StepProgressBar r1, ValueAnimator r2) {
        Intrinsics.X0O(r2, "animation");
        Object r3 = r2.getAnimatedValue();
        Intrinsics.X1ii(r3, "null cannot be cast to non-null type kotlin.Float");
        float r4 = ((Float) r3).floatValue();
        r1.IX1XiI = r4;
        r1.iXi = r4 * r1.IX0IXOi;
        r1.invalidate();
    }

    private final void iO(Context r3, AttributeSet r4) {
        TypedArray r5 = r3.obtainStyledAttributes(r4, R.styleable.StepProgressBar);
        Intrinsics.O10IXXX0X(r5, "obtainStyledAttributes(...)");
        this.XXX11i = r5.getBoolean(0, true);
        this.XX1Oi = r5.getResourceId(9, 0);
        this.iOiXi11II = r5.getResourceId(7, 0);
        this.OO = r5.getResourceId(8, 0);
        this.XXO = r5.getResourceId(1, 0);
        this.Ii0X0X = r5.getResourceId(3, 0);
        this.XOIX = r5.getResourceId(6, 0);
        int r0 = r5.getResourceId(4, 0);
        this.IXOIIIO = r0;
        this.IO0II0i = r5.getResourceId(5, r0);
        this.IXI = r5.getResourceId(2, 0);
        this.XX00i10X = r5.getText(11).toString();
        this.XOXiX0 = r5.getResourceId(10, 0);
        r5.recycle();
    }

    public final void XO0O10(int r4, int r5) {
        this.O0O = String.valueOf(r4);
        if (r5 != 0) goto L5;
        r5 = 10000;
    L5:
        float r6 = (r4 / r5) * 100;
        float r7 = this.IX0IXOi;
        if (r6 <= r7) goto L8;
        r6 = r7;
    L8:
        IiI10X(this.IX1XiI, r6 / r7, this.XXiO0i);
    }

    @Override // skin.support.widget.SkinCompatView, com.android.mltcode.paycertificationapi.ik4
    public void applySkin() {
        super.applySkin();
        Context r0 = getContext();
        Intrinsics.O10IXXX0X(r0, "getContext(...)");
        hl4.OXO1(r0, this.X0i1O, this.XXO);
        Context r1 = getContext();
        Intrinsics.O10IXXX0X(r1, "getContext(...)");
        hl4.OXO1(r1, this.i0X000X0O, this.Ii0X0X);
        Context r2 = getContext();
        Intrinsics.O10IXXX0X(r2, "getContext(...)");
        hl4.OXO1(r2, this.IiiXiI0I, this.XOIX);
        Context r3 = getContext();
        Intrinsics.O10IXXX0X(r3, "getContext(...)");
        hl4.OXO1(r3, this.XXiIiX10, this.IXOIIIO);
        Context r4 = getContext();
        Intrinsics.O10IXXX0X(r4, "getContext(...)");
        hl4.OXO1(r4, this.Oi, this.IO0II0i);
        Context r5 = getContext();
        Intrinsics.O10IXXX0X(r5, "getContext(...)");
        hl4.OXO1(r5, this.Ii0i, this.IXI);
        Context r6 = getContext();
        Intrinsics.O10IXXX0X(r6, "getContext(...)");
        hl4.OXO1(r6, this.iiIOiX, this.XOXiX0);
        Context r7 = getContext();
        Intrinsics.O10IXXX0X(r7, "getContext(...)");
        this.OX110i = hl4.XIi00iiXO(r7, this.XX1Oi);
        Context r8 = getContext();
        Intrinsics.O10IXXX0X(r8, "getContext(...)");
        this.X00XIX1 = hl4.XIi00iiXO(r8, this.iOiXi11II);
        Context r9 = getContext();
        Intrinsics.O10IXXX0X(r9, "getContext(...)");
        this.XOX0O0 = hl4.XIi00iiXO(r9, this.OO);
        Paint r10 = this.iiiO;
        float r11 = this.X1IX / 2;
        int r12 = this.OX110i;
        int r13 = this.XOX0O0;
        int r14 = this.X00XIX1;
        r10.setShader(new SweepGradient(r11, 1.0f, new int[]{r12, r13, r14, r14}, new float[]{0.0f, 0.3f, 0.5f, 1.0f}));
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(@aa1 Canvas r9) {
        Intrinsics.X0O(r9, "canvas");
        super.onDraw(r9);
        r9.save();
        float r0 = this.I1;
        r9.drawCircle(r0, r0, this.iX1O1, this.X0i1O);
        float r5 = (this.iXi / this.IX0IXOi) * 360.0f;
        this.X11iII1O1 = r5;
        r9.drawArc(this.X11I, 270.0f, r5, false, this.iiiO);
        float r10 = this.I1;
        r9.drawCircle(r10, r10, this.iX1O1 - this.i11I, this.i0X000X0O);
        r9.drawText("0%", this.I1 - XIi00iiXO(6), this.X00Xi1X, this.XXiIiX10);
        r9.drawText("25%", (this.O0O0X0iOi - this.X00Xi1X) - XIi00iiXO(4), this.I1, this.XXiIiX10);
        r9.drawText("50%", this.I1 - XIi00iiXO(8), (this.O0O0X0iOi - this.X00Xi1X) + XIi00iiXO(8), this.XXiIiX10);
        r9.drawText("75%", this.X00Xi1X - XIi00iiXO(18), this.I1, this.XXiIiX10);
        float r11 = this.O0O0X0iOi;
        float r3 = this.X1;
        r9.drawCircle(r11 - r3, r3, 10.0f, this.Ii0i);
        int r12 = this.O0O0X0iOi;
        float r4 = this.X1;
        r9.drawCircle(r12 - r4, r12 - r4, 10.0f, this.Ii0i);
        float r13 = this.X1;
        r9.drawCircle(r13, this.O0O0X0iOi - r13, 10.0f, this.Ii0i);
        float r14 = this.X1;
        r9.drawCircle(r14, r14, 10.0f, this.Ii0i);
        float r15 = this.I1;
        r9.drawCircle(r15, r15, ((this.iX1O1 - this.i11I) - this.XO0X10iO) + XIi00iiXO(1), this.IiiXiI0I);
        r9.drawBitmap(this.XOO0XOOii, this.I1 - XIi00iiXO(12), (this.I1 / 2) + XIi00iiXO(10), this.IiiXiI0I);
        String r16 = this.O0O;
        float r6 = this.I1;
        r9.drawText(r16, r6, XIi00iiXO(8) + r6, this.iiIOiX);
        r9.drawText(this.XX00i10X, this.I1 - this.IO0iXO0O, ((this.O0O0X0iOi - this.i11I) - this.XO0X10iO) - XIi00iiXO(6), this.Oi);
    }

    @Override // android.view.View
    public void onMeasure(int r1, int r2) {
        super.onMeasure(r1, r2);
        int r3 = Math.min(View.MeasureSpec.getSize(r1), View.MeasureSpec.getSize(r2));
        this.O0O0X0iOi = r3;
        setMeasuredDimension(r3, r3);
    }

    @Override // android.view.View
    public void onSizeChanged(int r2, int r3, int r4, int r5) {
        super.onSizeChanged(r2, r3, r4, r5);
        this.X1IX = r2;
        float r6 = this.O0O0X0iOi / 2.0f;
        this.I1 = r6;
        this.iX1O1 = r6 - (this.iIXi1iiXI / 2);
        RectF r7 = this.X11I;
        float r8 = this.X100O;
        r7.set(r8, r8, getWidth() - this.X100O, getWidth() - this.X100O);
        applySkin();
    }

    @JvmOverloads
    public StepProgressBar(@aa1 Context r8, @tb1 AttributeSet r9) {
        Intrinsics.X0O(r8, "context");
        int r4 = 0;
        this(r8, r9, r4, 4, null);
    }

    @JvmOverloads
    public StepProgressBar(@aa1 Context r13, @tb1 AttributeSet r14, int r15) {
        Intrinsics.X0O(r13, "context");
        super(r13, r14, r15);
        this.XXX11i = true;
        Paint r0 = new Paint();
        this.X0i1O = r0;
        this.iIXi1iiXI = XIi00iiXO(10);
        this.iXiX011 = XIi00iiXO(1);
        float r2 = XIi00iiXO(4);
        this.O001I = r2;
        this.iXiiiO = (this.iXiX011 + r2) + 1;
        DashPathEffect r3 = new DashPathEffect(new float[]{this.iXiX011, this.O001I}, this.iXiiiO);
        this.Ii1iii0 = r3;
        Paint r16 = new Paint();
        this.iiiO = r16;
        this.X11I = new RectF();
        float r4 = 2;
        this.X100O = (this.iIXi1iiXI * r4) + XIi00iiXO(4);
        Paint r1 = new Paint();
        this.i0X000X0O = r1;
        float r5 = (this.X100O + this.iIXi1iiXI) + XIi00iiXO(12);
        this.i11I = r5;
        float r7 = (this.iIXi1iiXI * r4) + XIi00iiXO(8);
        this.XO0X10iO = r7;
        Paint r8 = new Paint();
        this.XXiIiX10 = r8;
        float r6 = (r5 + (r7 / r4)) - XIi00iiXO(2);
        this.X00Xi1X = r6;
        this.X1 = r6 + XIi00iiXO(14);
        Paint r9 = new Paint();
        this.Ii0i = r9;
        Paint r10 = new Paint();
        this.IiiXiI0I = r10;
        Bitmap r11 = BitmapFactory.decodeResource(r13.getResources(), com.sma.smartv3.pro.R.drawable.icon_step_progress_content);
        Intrinsics.O10IXXX0X(r11, "decodeResource(...)");
        this.XOO0XOOii = r11;
        this.iiIOiX = new Paint();
        this.Oi = new Paint();
        this.XX00i10X = "Steps";
        this.iOI = new ValueAnimator();
        this.XXiO0i = 1000;
        this.IX0IXOi = 100.0f;
        this.iXi = 90.0f;
        this.O0O = "0";
        iO(r13, r14);
        r0.setAntiAlias(this.XXX11i);
        r0.setColor(this.XXO);
        Paint.Style r17 = Paint.Style.STROKE;
        r0.setStyle(r17);
        r0.setStrokeWidth(this.iIXi1iiXI);
        r0.setPathEffect(r3);
        r16.setAntiAlias(this.XXX11i);
        r16.setStyle(r17);
        r16.setStrokeCap(Paint.Cap.ROUND);
        r16.setStrokeWidth(this.iIXi1iiXI);
        r1.setAntiAlias(this.XXX11i);
        r1.setStyle(r17);
        r1.setColor(this.Ii0X0X);
        r1.setStrokeWidth(r7);
        r8.setAntiAlias(this.XXX11i);
        r8.setColor(this.IXOIIIO);
        r8.setTextSize(O00(12));
        iiOI111I r18 = iiOI111I.OXO1;
        MyTypeface r19 = MyTypeface.DIN_COND_BOLD;
        r8.setTypeface(r18.OXO1(r19, r13));
        r9.setAntiAlias(this.XXX11i);
        r9.setStyle(Paint.Style.FILL);
        r9.setColor(this.IXI);
        r10.setAntiAlias(this.XXX11i);
        r10.setStyle(Paint.Style.FILL_AND_STROKE);
        r10.setColor(this.XOIX);
        r10.setStrokeWidth(r7);
        this.iiIOiX.setAntiAlias(this.XXX11i);
        this.iiIOiX.setColor(this.XOXiX0);
        this.iiIOiX.setTextSize(O00(32));
        this.iiIOiX.setTextAlign(Paint.Align.CENTER);
        this.iiIOiX.setTypeface(r18.OXO1(r19, r13));
        this.Oi.setAntiAlias(this.XXX11i);
        this.Oi.setColor(this.IO0II0i);
        this.Oi.setTextSize(O00(14));
        this.Oi.setTypeface(r18.OXO1(MyTypeface.PF_REGULAR, r13));
        this.IO0iXO0O = this.Oi.measureText(this.XX00i10X) / r4;
        applySkin();
    }

    public /* synthetic */ StepProgressBar(Context r1, AttributeSet r2, int r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = null;
    L6:
        if ((r4 & 4) == 0) goto L8;
        r3 = 0;
    L8:
        this(r1, r2, r3);
    }
}
