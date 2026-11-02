package com.sma.smartv3.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.blankj.utilcode.util.ImageUtils;
import com.blankj.utilcode.util.SizeUtils;
import com.sma.smartv3.R;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import skin.support.widget.SkinCompatView;

/* JADX INFO: loaded from: classes3.dex */
public final class Goal2ProgressBar extends SkinCompatView {
    public float I1;

    @tb1
    public Bitmap IO0II0i;

    @tb1
    public Bitmap IXOIIIO;
    public float Ii0X0X;

    @aa1
    public final Paint Ii0i;

    @aa1
    public final RectF Ii1iii0;

    @aa1
    public final Paint O001I;
    public int OO;
    public int OX110i;
    public float X00XIX1;
    public int X00Xi1X;

    @aa1
    public final Paint X0i1O;

    @tb1
    public Bitmap X1;
    public int X100O;
    public int X11I;
    public float X11iII1O1;

    @aa1
    public final Paint X1IX;
    public final float XO0X10iO;
    public int XOX0O0;
    public int XX1Oi;

    @aa1
    public final Paint XXO;
    public float XXX11i;
    public float XXiIiX10;
    public final float i0X000X0O;
    public float i11I;

    @aa1
    public final Paint iIXi1iiXI;
    public final float iOiXi11II;
    public boolean iX1O1;

    @aa1
    public final Paint iXiX011;

    @aa1
    public final RectF iXiiiO;

    @aa1
    public final RectF iiiO;

    @JvmOverloads
    public Goal2ProgressBar(@aa1 Context r8) {
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
        this.X11I = r5.getColor(10, 0);
        this.X100O = r5.getColor(9, 0);
        this.XX1Oi = r5.getColor(2, 0);
        this.OX110i = r5.getColor(1, 0);
        this.OO = r5.getColor(5, 0);
        this.XOX0O0 = r5.getColor(4, 0);
        this.XXiIiX10 = r5.getDimension(12, 0.0f);
        r5.recycle();
    }

    public final void IiI10X(int r2, int r3) {
        if (r3 != 0) goto L4;
        r3 = 10000;
    L4:
        float r4 = (r2 / r3) * 100;
        float r5 = this.iOiXi11II;
        if (r4 <= r5) goto L8;
        r4 = r5;
    L8:
        if (r4 == 0.0f) goto L11;
        this.X00XIX1 = r4;
    L11:
        invalidate();
    }

    public final void O00(int r2, int r3) {
        if (r3 != 0) goto L4;
        r3 = 10000;
    L4:
        float r4 = (r2 / r3) * 100;
        float r5 = this.XO0X10iO;
        if (r4 <= r5) goto L8;
        r4 = r5;
    L8:
        if (r4 == 0.0f) goto L11;
        this.Ii0X0X = r4;
    L11:
        invalidate();
    }

    public final void XO0O10(int r2, int r3) {
        if (r3 != 0) goto L4;
        r3 = 10000;
    L4:
        float r4 = (r2 / r3) * 100;
        float r5 = this.i0X000X0O;
        if (r4 <= r5) goto L8;
        r4 = r5;
    L8:
        if (r4 == 0.0f) goto L11;
        this.i11I = r4;
    L11:
        invalidate();
    }

    @Override // skin.support.widget.SkinCompatView, com.android.mltcode.paycertificationapi.ik4
    public void applySkin() {
        super.applySkin();
        invalidate();
        if (this.X00Xi1X <= 0) goto L6;
        this.X1 = Bitmap.createScaledBitmap(BitmapFactory.decodeResource(getContext().getResources(), com.sma.smartv3.pro.R.drawable.ic_gpb_step), this.X00Xi1X + SizeUtils.dp2px(1.0f), this.X00Xi1X + SizeUtils.dp2px(1.0f), true);
        Bitmap r0 = BitmapFactory.decodeResource(getContext().getResources(), com.sma.smartv3.pro.R.drawable.ic_gpb_dis);
        int r1 = this.X00Xi1X;
        this.IXOIIIO = Bitmap.createScaledBitmap(r0, r1, r1, true);
        Bitmap r2 = BitmapFactory.decodeResource(getContext().getResources(), com.sma.smartv3.pro.R.drawable.ic_gpb_kcal);
        int r3 = this.X00Xi1X;
        this.IO0II0i = Bitmap.createScaledBitmap(r2, r3, r3, true);
        return;
    }

    public final void iO(@aa1 Canvas r4, @aa1 Bitmap r5, float r6, float r7) {
        Intrinsics.X0O(r4, "canvas");
        Intrinsics.X0O(r5, "it");
        if (this.XXiIiX10 <= 0.0f) goto L6;
        r4.drawBitmap(ImageUtils.rotate(r5, 90, (r5.getWidth() / 2) + r7, (r5.getHeight() / 2) + r6), r7, r6, this.Ii0i);
        return;
    L6:
        r4.drawBitmap(r5, r7, r6, this.Ii0i);
    }

    @Override // android.view.View
    public void onDraw(@aa1 Canvas r14) {
        Intrinsics.X0O(r14, "canvas");
        super.onDraw(r14);
        r14.save();
        r14.drawArc(this.iXiiiO, 270.0f, 180.0f, false, this.X0i1O);
        float r10 = (this.X00XIX1 / this.iOiXi11II) * 180.0f;
        this.I1 = r10;
        r14.drawArc(this.iXiiiO, 270.0f, r10, false, this.X1IX);
        r14.drawArc(this.Ii1iii0, 270.0f, 180.0f, false, this.iXiX011);
        float r11 = (this.i11I / this.i0X000X0O) * 180.0f;
        this.I1 = r11;
        r14.drawArc(this.Ii1iii0, 270.0f, r11, false, this.iIXi1iiXI);
        r14.drawArc(this.iiiO, 270.0f, 180.0f, false, this.XXO);
        float r12 = (this.Ii0X0X / this.XO0X10iO) * 180.0f;
        this.I1 = r12;
        r14.drawArc(this.iiiO, 270.0f, r12, false, this.O001I);
        Bitmap r15 = this.X1;
        if (r15 == null) goto L5;
        iO(r14, r15, this.iXiiiO.top - (r15.getHeight() / 2), ((this.iXiiiO.width() / 2) - Math.abs(this.iXiiiO.left)) - (r15.getWidth() / 2));
    L5:
        Bitmap r16 = this.IXOIIIO;
        if (r16 == null) goto L8;
        iO(r14, r16, this.Ii1iii0.top - (r16.getHeight() / 2), ((this.Ii1iii0.width() / 2) - Math.abs(this.Ii1iii0.left)) - (r16.getWidth() / 2));
    L8:
        Bitmap r17 = this.IO0II0i;
        if (r17 == null) goto L12;
        iO(r14, r17, this.iiiO.top - (r17.getHeight() / 2), ((this.iiiO.width() / 2) - Math.abs(this.iiiO.left)) - (r17.getWidth() / 2));
        return;
    }

    @Override // android.view.View
    public void onMeasure(int r3, int r4) {
        super.onMeasure(r3, r4);
        View.MeasureSpec.getSize(r3);
        int r5 = View.MeasureSpec.getSize(r4);
        float r6 = r5;
        float r0 = (r6 - (this.XXX11i * 4)) / 8;
        this.X11iII1O1 = r0;
        setMeasuredDimension((int) ((r6 + r0) / 2), r5);
    }

    @Override // android.view.View
    public void onSizeChanged(int r4, int r5, int r6, int r7) {
        super.onSizeChanged(r4, r5, r6, r7);
        float r8 = this.X11iII1O1;
        float r9 = r8 / 2;
        this.X1IX.setStrokeWidth(r8);
        this.X0i1O.setStrokeWidth(this.X11iII1O1);
        this.iIXi1iiXI.setStrokeWidth(this.X11iII1O1);
        this.iXiX011.setStrokeWidth(this.X11iII1O1);
        this.O001I.setStrokeWidth(this.X11iII1O1);
        this.XXO.setStrokeWidth(this.X11iII1O1);
        this.iXiiiO.set((r4 - r5) + r9, r9, r4 - r9, r5 - r9);
        RectF r10 = this.Ii1iii0;
        RectF r11 = this.iXiiiO;
        float r12 = r11.left;
        float r13 = this.X11iII1O1;
        float r0 = this.XXX11i;
        r10.set((r12 + r13) + r0, (r11.top + r13) + r0, (r11.right - r13) - r0, (r11.bottom - r13) - r0);
        RectF r14 = this.iiiO;
        RectF r15 = this.Ii1iii0;
        float r16 = r15.left;
        float r17 = this.X11iII1O1;
        float r1 = this.XXX11i;
        r14.set((r16 + r17) + r1, (r15.top + r17) + r1, (r15.right - r17) - r1, (r15.bottom - r17) - r1);
        this.X00Xi1X = (int) (((double) this.X11iII1O1) * 0.6d);
        applySkin();
    }

    @JvmOverloads
    public Goal2ProgressBar(@aa1 Context r8, @tb1 AttributeSet r9) {
        Intrinsics.X0O(r8, "context");
        int r4 = 0;
        this(r8, r9, r4, 4, null);
    }

    @JvmOverloads
    public Goal2ProgressBar(@aa1 Context r8, @tb1 AttributeSet r9, int r10) {
        Intrinsics.X0O(r8, "context");
        super(r8, r9, r10);
        this.I1 = 50.0f;
        this.iX1O1 = true;
        this.X11iII1O1 = OXO1(10);
        this.XXX11i = OXO1(4);
        Paint r11 = new Paint();
        this.X1IX = r11;
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
        this.iXiiiO = new RectF();
        this.Ii1iii0 = new RectF();
        this.iiiO = new RectF();
        this.iOiXi11II = 100.0f;
        this.X00XIX1 = 1.0f;
        this.i0X000X0O = 100.0f;
        this.i11I = 1.0f;
        this.XO0X10iO = 100.0f;
        this.Ii0X0X = 1.0f;
        this.X00Xi1X = SizeUtils.dp2px(20.0f);
        this.Ii0i = new Paint();
        XIi00iiXO(r8, r9);
        r11.setAntiAlias(this.iX1O1);
        Paint.Style r12 = Paint.Style.STROKE;
        r11.setStyle(r12);
        Paint.Cap r13 = Paint.Cap.ROUND;
        r11.setStrokeCap(r13);
        r11.setStrokeWidth(this.X11iII1O1);
        r11.setColor(this.X11I);
        r0.setAntiAlias(this.iX1O1);
        r0.setStyle(r12);
        r0.setStrokeCap(r13);
        r0.setStrokeWidth(this.X11iII1O1);
        r0.setColor(this.X100O);
        r1.setAntiAlias(this.iX1O1);
        r1.setStyle(r12);
        r1.setStrokeCap(r13);
        r1.setStrokeWidth(this.X11iII1O1);
        r1.setColor(this.XX1Oi);
        r2.setAntiAlias(this.iX1O1);
        r2.setStyle(r12);
        r2.setStrokeCap(r13);
        r2.setStrokeWidth(this.X11iII1O1);
        r2.setColor(this.OX110i);
        r3.setAntiAlias(this.iX1O1);
        r3.setStyle(r12);
        r3.setStrokeCap(r13);
        r3.setStrokeWidth(this.X11iII1O1);
        r3.setColor(this.OO);
        r4.setAntiAlias(this.iX1O1);
        r4.setStyle(r12);
        r4.setStrokeCap(r13);
        r4.setStrokeWidth(this.X11iII1O1);
        r4.setColor(this.XOX0O0);
        applySkin();
    }

    public /* synthetic */ Goal2ProgressBar(Context r1, AttributeSet r2, int r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = null;
    L6:
        if ((r4 & 4) == 0) goto L8;
        r3 = 0;
    L8:
        this(r1, r2, r3);
    }
}
