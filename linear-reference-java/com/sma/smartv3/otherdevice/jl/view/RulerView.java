package com.sma.smartv3.otherdevice.jl.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.annotation.Nullable;
import com.android.mltcode.paycertificationapi.yp3;
import com.android.mltcode.paycertificationapi.zp3;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.SizeUtils;
import com.sma.smartv3.R;
import java.lang.ref.WeakReference;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes19.dex */
public class RulerView extends View {
    public static final String iiII = "RulerView";
    public int I1;
    public int IO;
    public String IO0II0i;
    public Rect IO0iXO0O;
    public int IX0IXOi;
    public int IX1XiI;
    public Paint IXI;
    public final VelocityTracker IXOIIIO;
    public O00 Ii0X0X;
    public Paint Ii0i;
    public int Ii1iii0;
    public Paint IiiXiI0I;
    public int O001I;
    public int O0O;
    public RectF O0O0X0iOi;
    public int OO;
    public int OX110i;
    public Rect Oi;
    public float X00O0;
    public int X00XIX1;
    public float X00Xi1X;
    public float X0i1O;
    public float X0iO;
    public ValueAnimator X1;
    public String X100O;
    public boolean X111IO;
    public int X11I;
    public int X11iII1O1;
    public int X1IX;
    public int X1OI;
    public boolean XO0X10iO;
    public Paint XOIX;
    public Paint XOO0XOOii;
    public int XOX0O0;
    public Paint XOXiX0;
    public Rect XX00i10X;
    public int XX1Oi;
    public int XXO;
    public int XXX11i;
    public float XXiIiX10;
    public int XXiO0i;
    public int Xi1i0XOX0;
    public boolean Xii;
    public float Xii11I;
    public int i0X000X0O;
    public int i100IXOX;
    public boolean i11I;
    public int iI0I;
    public int iIX0i;
    public float iIXi1iiXI;
    public int iIi1;
    public int iOI;
    public int iOiXi11II;
    public int iX1O1;
    public int iXi;
    public float iXiX011;
    public int iXiiiO;
    public Paint iiIOiX;
    public float iii0;
    public int iiiO;

    public interface O00 {
        void OXO1(String result);

        void XIi00iiXO(String result);
    }

    public class OXO1 implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ RulerView IO;

        public OXO1(final RulerView this$0) {
            this.IO = this$0;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator animation) {
            RulerView r0 = this.IO;
            RulerView.XXI(r0, RulerView.O00(r0) + ((Integer) animation.getAnimatedValue()).intValue());
            if (RulerView.O00(this.IO) < (RulerView.I0IIOi(this.IO) / 2)) goto L5;
            RulerView r3 = this.IO;
            RulerView.XXI(r3, RulerView.I0IIOi(r3) / 2);
        L8:
            RulerView r4 = this.IO;
            RulerView.I0iXXO(r4, RulerView.O00(r4));
            this.IO.invalidate();
            return;
        L5:
            float r5 = RulerView.O00(this.IO);
            RulerView r1 = this.IO;
            if (r5 > RulerView.X1ii(r1, RulerView.XO0O10(r1))) goto L8;
            RulerView r6 = this.IO;
            RulerView.XXI(r6, RulerView.X1ii(r6, RulerView.XO0O10(r6)));
            goto L8
        }
    }

    public class XIi00iiXO extends AnimatorListenerAdapter {
        public final /* synthetic */ RulerView IO;

        public XIi00iiXO(final RulerView this$0) {
            this.IO = this$0;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            RulerView.OIX0iXi(this.IO, true);
            this.IO.invalidate();
        }
    }

    public class XO0O10 extends AnimatorListenerAdapter {
        public final /* synthetic */ RulerView IO;

        public XO0O10(final RulerView this$0) {
            this.IO = this$0;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            super.onAnimationEnd(animation);
            if (RulerView.IiI10X(this.IO) == null) goto L6;
            RulerView.IiI10X(this.IO).OXO1(RulerView.XOO0ii0(this.IO));
            return;
        }
    }

    public class iO extends AnimatorListenerAdapter {
        public final /* synthetic */ RulerView IO;

        public iO(final RulerView this$0) {
            this.IO = this$0;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            super.onAnimationEnd(animation);
            RulerView r2 = this.IO;
            if (r2.X00Xi1X == RulerView.iO(r2)) goto L5;
            RulerView r3 = this.IO;
            RulerView.XXI(r3, RulerView.X1ii(r3, RulerView.iO(r3)));
            RulerView r4 = this.IO;
            RulerView.I0iXXO(r4, RulerView.O00(r4));
            RulerView.IO(this.IO, true);
        L8:
            RulerView.OIi0(this.IO, -1.0f);
            return;
        L5:
            if (RulerView.IiI10X(this.IO) == null) goto L8;
            RulerView.IiI10X(this.IO).OXO1(RulerView.XOO0ii0(this.IO));
            goto L8
        }
    }

    public RulerView(Context context) {
        this(context, null);
    }

    public static /* bridge */ /* synthetic */ int I0IIOi(RulerView r0) {
        return r0.IX1XiI;
    }

    public static /* bridge */ /* synthetic */ void I0iXXO(RulerView r0, float r1) {
        r0.X00O0 = r1;
    }

    public static /* bridge */ /* synthetic */ void IO(RulerView r0, boolean r1) {
        r0.Xii = r1;
    }

    public static /* bridge */ /* synthetic */ O00 IiI10X(RulerView r0) {
        return r0.Ii0X0X;
    }

    public static /* bridge */ /* synthetic */ float O00(RulerView r0) {
        return r0.Xii11I;
    }

    public static /* bridge */ /* synthetic */ void OIX0iXi(RulerView r0, boolean r1) {
        r0.X111IO = r1;
    }

    public static /* bridge */ /* synthetic */ void OIi0(RulerView r0, float r1) {
        r0.XXiIiX10 = r1;
    }

    public static /* synthetic */ void OXO1(RulerView r0, ValueAnimator r1) {
        r0.getClass();
        float r2 = ((Float) r1.getAnimatedValue()).floatValue();
        r0.Xii11I = r2;
        r0.X00O0 = r2;
        r0.invalidate();
    }

    public static /* bridge */ /* synthetic */ float X1ii(RulerView r0, float r1) {
        return r0.iIiiO(r1);
    }

    public static /* synthetic */ void XIi00iiXO(RulerView r0, ValueAnimator r1) {
        r0.getClass();
        float r2 = ((Float) r1.getAnimatedValue()).floatValue();
        r0.Xii11I = r2;
        r0.X00O0 = r2;
        r0.invalidate();
    }

    public static /* bridge */ /* synthetic */ float XO0O10(RulerView r0) {
        return r0.iIXi1iiXI;
    }

    public static /* bridge */ /* synthetic */ String XOO0ii0(RulerView r0) {
        return r0.IO0II0i;
    }

    public static /* bridge */ /* synthetic */ void XXI(RulerView r0, float r1) {
        r0.Xii11I = r1;
    }

    public static /* bridge */ /* synthetic */ float iO(RulerView r0) {
        return r0.XXiIiX10;
    }

    public final void I1XOi1(Canvas canvas) {
        this.O0O0X0iOi.set(0.0f, 0.0f, this.IX1XiI, this.iOI);
        if (this.XO0X10iO == false) goto L6;
        canvas.drawRoundRect(this.O0O0X0iOi, 20.0f, 20.0f, this.Ii0i);
        return;
    L6:
        canvas.drawRect(this.O0O0X0iOi, this.Ii0i);
    }

    public final void IIX1OXO(Canvas canvas, String resultText) {
        if (this.i11I == true) goto L5;
        return;
    L5:
        canvas.translate(0.0f, (-this.IO0iXO0O.height()) - (this.iX1O1 / 2));
        this.XOO0XOOii.getTextBounds(resultText, 0, resultText.length(), this.IO0iXO0O);
        canvas.drawText(resultText, (this.IX1XiI / 2) - (this.IO0iXO0O.width() / 2), this.IO0iXO0O.height(), this.XOO0XOOii);
        int r6 = ((this.IX1XiI / 2) + (this.IO0iXO0O.width() / 2)) + 10;
        this.Xi1i0XOX0 = r6;
        canvas.drawText(this.X100O, r6, this.XX00i10X.height() + 2, this.iiIOiX);
    }

    public final void O10IXXX0X(int xVelocity) {
        if (Math.abs(xVelocity) >= 50) goto L7;
        this.X111IO = true;
        return;
    L7:
        if (this.X1.isRunning() == false) goto L9;
        return;
    L9:
        ValueAnimator r4 = ValueAnimator.ofInt(new int[]{0, xVelocity / 20}).setDuration(Math.abs(xVelocity / 10));
        this.X1 = r4;
        r4.setInterpolator(new DecelerateInterpolator());
        this.X1.addUpdateListener(new OXO1(this));
        this.X1.addListener(new XIi00iiXO(this));
        this.X1.start();
    }

    public final void OiIIX101O(AttributeSet attrs, int defStyleAttr) {
        TypedArray r4 = getContext().getTheme().obtainStyledAttributes(attrs, R.styleable.RulerView, defStyleAttr, 0);
        this.IO = r4.getInt(16, this.IO);
        this.I1 = r4.getDimensionPixelSize(11, (int) TypedValue.applyDimension(1, this.I1, getResources().getDisplayMetrics()));
        this.iX1O1 = r4.getDimensionPixelSize(13, (int) TypedValue.applyDimension(1, this.iX1O1, getResources().getDisplayMetrics()));
        this.X11iII1O1 = r4.getInt(14, this.X11iII1O1);
        int r5 = r4.getDimensionPixelSize(15, (int) TypedValue.applyDimension(1, this.XXX11i, getResources().getDisplayMetrics()));
        this.XXX11i = r5;
        this.XXX11i = SizeUtils.dp2px(r5);
        this.X1IX = r4.getInt(7, this.X1IX) / this.IO;
        this.X0i1O = r4.getFloat(0, this.X0i1O) / this.IO;
        this.iIXi1iiXI = r4.getFloat(4, this.iIXi1iiXI) / this.IO;
        this.O001I = r4.getColor(10, this.O001I);
        this.XXO = r4.getColor(12, this.XXO);
        this.iXiiiO = r4.getColor(5, this.iXiiiO);
        this.Ii1iii0 = r4.getColor(2, this.Ii1iii0);
        this.iiiO = r4.getColor(17, this.iiiO);
        this.X11I = r4.getColor(8, this.X11I);
        this.XX1Oi = r4.getColor(22, this.XX1Oi);
        String r6 = this.X100O;
        String r2 = r4.getString(21);
        this.X100O = r2;
        if (TextUtils.isEmpty(r2) == false) goto L5;
        this.X100O = r6;
    L5:
        this.OX110i = r4.getDimensionPixelSize(20, (int) TypedValue.applyDimension(1, this.OX110i, getResources().getDisplayMetrics()));
        this.OO = r4.getDimensionPixelSize(6, (int) TypedValue.applyDimension(1, this.OO, getResources().getDisplayMetrics()));
        this.XOX0O0 = r4.getDimensionPixelSize(3, (int) TypedValue.applyDimension(1, this.XOX0O0, getResources().getDisplayMetrics()));
        this.iOiXi11II = r4.getDimensionPixelSize(9, (int) TypedValue.applyDimension(2, this.iOiXi11II, getResources().getDisplayMetrics()));
        this.X00XIX1 = r4.getDimensionPixelSize(18, (int) TypedValue.applyDimension(2, this.X00XIX1, getResources().getDisplayMetrics()));
        this.i0X000X0O = r4.getDimensionPixelSize(23, (int) TypedValue.applyDimension(2, this.i0X000X0O, getResources().getDisplayMetrics()));
        this.i11I = r4.getBoolean(19, this.i11I);
        this.XO0X10iO = r4.getBoolean(1, this.XO0X10iO);
        r4.recycle();
    }

    public void X0O(float scale) {
        float r2 = scale / this.IO;
        if (r2 >= this.X1IX) goto L5;
        return;
    L5:
        if (r2 > this.iIXi1iiXI) goto L10;
        this.XXiIiX10 = r2;
        invalidate();
        return;
    }

    public final void XX0() {
        this.Ii0i = new Paint(1);
        this.IXI = new Paint(1);
        this.IiiXiI0I = new Paint(1);
        this.XOIX = new Paint(1);
        this.XOXiX0 = new Paint(1);
        this.XOO0XOOii = new Paint(1);
        this.iiIOiX = new Paint(1);
        this.Ii0i.setColor(this.O001I);
        this.IXI.setColor(this.XXO);
        this.IiiXiI0I.setColor(this.iXiiiO);
        this.XOIX.setColor(this.Ii1iii0);
        this.XOXiX0.setColor(this.iiiO);
        this.XOO0XOOii.setColor(this.X11I);
        this.iiIOiX.setColor(this.XX1Oi);
        Paint r0 = this.XOO0XOOii;
        Paint.Style r2 = Paint.Style.FILL;
        r0.setStyle(r2);
        this.iiIOiX.setStyle(r2);
        this.Ii0i.setStyle(r2);
        this.IXI.setStyle(r2);
        this.IiiXiI0I.setStyle(r2);
        this.XOIX.setStyle(r2);
        Paint r1 = this.XOIX;
        Paint.Cap r3 = Paint.Cap.ROUND;
        r1.setStrokeCap(r3);
        this.IiiXiI0I.setStrokeCap(r3);
        this.IXI.setStrokeCap(r3);
        this.IXI.setStrokeWidth(this.OX110i);
        this.IiiXiI0I.setStrokeWidth(this.OO);
        this.XOIX.setStrokeWidth(this.XOX0O0);
        this.XOO0XOOii.setTextSize(this.iOiXi11II);
        this.iiIOiX.setTextSize(this.i0X000X0O);
        this.XOXiX0.setTextSize(this.X00XIX1);
        this.O0O0X0iOi = new RectF();
        this.IO0iXO0O = new Rect();
        this.Oi = new Rect();
        this.XX00i10X = new Rect();
        Paint r4 = this.XOO0XOOii;
        String r5 = this.IO0II0i;
        r4.getTextBounds(r5, 0, r5.length(), this.IO0iXO0O);
        this.iiIOiX.getTextBounds(this.IO0II0i, 0, 1, this.XX00i10X);
        int r6 = this.I1;
        this.XXiO0i = r6 / 4;
        this.IX0IXOi = r6 / 2;
        this.iXi = r6;
        this.iIX0i = r6 / 2;
        this.X1 = new ValueAnimator();
    }

    public final void XiOIO(Canvas canvas) {
        boolean r7 = true;
        if (this.i11I == false) goto L5;
        int r2 = this.IO0iXO0O.height();
    L6:
        canvas.translate(0.0f, r2 + this.iX1O1);
        float r3 = this.X0i1O;
        if (r3 == (-1.0f)) goto L10;
        float r4 = iIiiO(r3);
        this.Xii11I = r4;
        this.X00O0 = r4;
        this.X0i1O = -1.0f;
    L10:
        if (this.XXiIiX10 == (-1.0f)) goto L16;
        Log.d(iiII, "moveX 000 >> " + this.Xii11I + ", computeScale >> " + this.XXiIiX10);
        this.X00O0 = this.Xii11I;
        ValueAnimator r5 = this.X1;
        if (r5 == null) goto L16;
        if (r5.isRunning() == true) goto L16;
        ValueAnimator r6 = ValueAnimator.ofFloat(new float[]{this.X00O0, iIiiO(this.XXiIiX10)});
        this.X1 = r6;
        r6.addUpdateListener(new yp3(this));
        this.X1.addListener(new iO(this));
        this.X1.setDuration(Math.abs((long) (iIiiO(this.XXiIiX10) - this.X00O0)));
        this.X1.start();
    L16:
        float r8 = this.Xii11I;
        int r9 = this.XXX11i;
        int r10 = -((int) (r8 / r9));
        float r11 = r8 % r9;
        canvas.save();
        this.O0O = 0;
        if (this.X111IO == false) goto L31;
        float r12 = this.Xii11I;
        int r13 = this.IX1XiI / 2;
        int r14 = this.XXX11i;
        float r15 = (r12 - (r13 % r14)) % r14;
        if (r15 > 0.0f) goto L21;
        r15 = r14 - Math.abs(r15);
    L21:
        this.iIi1 = (int) Math.abs(r15);
        int r16 = (int) (this.XXX11i - Math.abs(r15));
        this.i100IXOX = r16;
        if (r15 > (this.XXX11i / 2)) goto L24;
        float r17 = this.Xii11I - this.iIi1;
    L25:
        ValueAnimator r18 = this.X1;
        if (r18 != null) goto L28;
    L30:
        float r19 = this.Xii11I;
        int r20 = this.XXX11i;
        r10 = (int) (-(r19 / r20));
        r11 = r19 % r20;
        goto L31
    L28:
        if (r18.isRunning() == true) goto L30;
        ValueAnimator r21 = ValueAnimator.ofFloat(new float[]{this.Xii11I, r17});
        this.X1 = r21;
        r21.addUpdateListener(new zp3(this));
        this.X1.addListener(new XO0O10(this));
        this.X1.setDuration(300);
        this.X1.start();
        this.X111IO = false;
        goto L30
    L24:
        r17 = this.Xii11I + r16;
    L31:
        canvas.translate(r11, 0.0f);
        float r22 = ((BigDecimal) new WeakReference(new BigDecimal(((((this.IX1XiI / 2) - this.Xii11I) / (this.XXX11i * this.X11iII1O1)) + this.X1IX) * this.IO)).get()).setScale(1, 4).floatValue();
        this.X00Xi1X = r22;
        String r23 = String.valueOf(r22);
        this.IO0II0i = r23;
        O00 r24 = this.Ii0X0X;
        if (r24 == null) goto L35;
        r24.XIi00iiXO(r23);
    L35:
        if (this.Xii == false) goto L39;
        this.Xii = false;
        O00 r25 = this.Ii0X0X;
        if (r25 == null) goto L39;
        r25.OXO1(this.IO0II0i);
    L39:
        float r26 = this.IX1XiI;
        float r27 = this.iIXi1iiXI;
        if (r27 <= Math.round(r27)) goto L43;
        int r28 = Math.round(this.iIXi1iiXI) + 1;
    L42:
        int r110 = r28;
        float r111 = r26;
        int r112 = r10;
        float r113 = 0.0f;
    L45:
        int r29 = this.O0O;
        int r30 = this.IX1XiI;
        if (r29 >= r30) goto L79;
        if ((r112 % this.X11iII1O1) != 0) goto L68;
        float r31 = this.Xii11I;
        if (r31 < 0.0f) goto L56;
        if (r29 >= (r31 - this.XXX11i)) goto L56;
    L54:
        r7 = r7;
    L78:
        r112 = r112 + 1;
        int r32 = this.O0O;
        int r33 = this.XXX11i;
        this.O0O = r32 + r33;
        canvas.translate(r33, 0.0f);
        r7 = r7;
    L56:
        if (((r30 / 2) - r29) <= (iIiiO(r110 + 1) - this.Xii11I)) goto L54;
        float r34 = (r112 / this.X11iII1O1) + this.X1IX;
        int r35 = this.IO;
        float r114 = r34 * r35;
        if (r114 > (this.iIXi1iiXI * r35)) goto L62;
        int r36 = this.iIX0i;
        canvas.drawLine(0.0f, r36, 0.0f, r36 + this.IX0IXOi, this.IiiXiI0I);
        this.XOXiX0.getTextBounds(((r112 / this.XXX11i) + this.X1IX) + "", 0, (((r112 / this.XXX11i) + this.X1IX) + "").length(), this.Oi);
        float r37 = (-this.Oi.width()) / 2;
        int r38 = this.iXi;
        canvas.drawText(((int) r114) + "", r37, ((r38 + ((this.I1 - r38) / 2)) + this.Oi.height()) + SizeUtils.dp2px(10.0f), this.XOXiX0);
    L62:
        int r39 = this.X1IX;
        int r40 = this.IO;
        if (r114 != (r39 * r40)) goto L66;
        r113 = (this.IX1XiI >> 1) - ((((this.X00Xi1X - r114) * this.XXX11i) / r40) * this.X11iII1O1);
        goto L78
    L66:
        if (r114 != (r110 * r40)) goto L78;
        r111 = ((((r114 - this.X00Xi1X) * this.XXX11i) / r40) * this.X11iII1O1) + (this.IX1XiI / 2);
        goto L78
    L68:
        r7 = r7;
        float r41 = this.Xii11I;
        if (r41 < 0.0f) goto L73;
        if (r29 < r41) goto L78;
    L73:
        if (((r30 / 2) - r29) < (iIiiO(r110) - this.Xii11I)) goto L78;
        float r42 = (r112 / this.X11iII1O1) + this.X1IX;
        int r43 = this.IO;
        if ((r42 * r43) > (this.iIXi1iiXI * r43)) goto L78;
        int r44 = this.iIX0i;
        canvas.drawLine(0.0f, r44, 0.0f, r44 + this.XXiO0i, this.IXI);
        goto L78
    L79:
        canvas.restore();
        int r45 = this.IX1XiI;
        canvas.drawLine(r45 / 2, 0.0f, r45 / 2, this.I1, this.XOIX);
        int r1 = this.iIX0i;
        canvas.drawLine(r113, r1, r111, r1, this.IXI);
        return;
    L43:
        r28 = Math.round(this.iIXi1iiXI);
        goto L42
    L5:
        r2 = 0;
        goto L6
    }

    public void XiOIii1(int minScale, float maxScale, float firstScale) {
        int r0 = this.IO;
        this.X1IX = minScale / r0;
        this.iIXi1iiXI = maxScale / r0;
        this.X0i1O = firstScale / r0;
        this.iXiX011 = maxScale;
        invalidate();
    }

    public float getMaxScale() {
        return this.iIXi1iiXI * this.IO;
    }

    public float getMaxScaleValue() {
        return this.iXiX011;
    }

    public int getMinScale() {
        return this.X1IX * this.IO;
    }

    public final float iIiiO(float scale) {
        return (this.IX1XiI / 2) - ((this.XXX11i * this.X11iII1O1) * (scale - this.X1IX));
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        I1XOi1(canvas);
        XiOIO(canvas);
        IIX1OXO(canvas, this.IO0II0i);
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        int r0 = View.MeasureSpec.getMode(heightMeasureSpec);
        int r4 = View.MeasureSpec.getSize(heightMeasureSpec);
        int r3 = View.MeasureSpec.getSize(widthMeasureSpec);
        if (r0 == Integer.MIN_VALUE) goto L9;
        if (r0 == 0) goto L9;
        if (r0 != 1073741824) goto L14;
        this.iOI = (r4 + getPaddingTop()) + getPaddingBottom();
    L14:
        int r5 = (r3 + getPaddingLeft()) + getPaddingRight();
        this.IX1XiI = r5;
        setMeasuredDimension(r5, this.iOI);
        return;
    L9:
        int r6 = this.I1;
        if (this.i11I == false) goto L12;
        int r1 = this.IO0iXO0O.height();
    L13:
        this.iOI = ((((r6 + r1) + (this.iX1O1 * 2)) + getPaddingTop()) + getPaddingBottom()) + SizeUtils.dp2px(20.0f);
        goto L14
    L12:
        r1 = 0;
        goto L13
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        this.X0iO = event.getX();
        this.X111IO = false;
        this.IXOIIIO.computeCurrentVelocity(500);
        this.IXOIIIO.addMovement(event);
        int r0 = event.getAction();
        if (r0 == 0) goto L15;
        if (r0 != 1) goto L6;
        this.X00O0 = this.Xii11I;
        int r5 = (int) this.IXOIIIO.getXVelocity();
        this.iI0I = r5;
        O10IXXX0X(r5);
        this.IXOIIIO.clear();
    L21:
        invalidate();
        return true;
    L6:
        if (r0 != 2) goto L21;
        float r1 = (this.X0iO - this.iii0) + this.X00O0;
        this.Xii11I = r1;
        int r2 = this.IX1XiI;
        if (r1 < (r2 / 2)) goto L12;
        this.Xii11I = r2 / 2;
        goto L21
    L12:
        if (r1 > iIiiO(this.iIXi1iiXI)) goto L21;
        this.Xii11I = iIiiO(this.iIXi1iiXI);
        LogUtils.d(new Object[]{iiII, "moveX = " + this.Xii11I + ", max = " + iIiiO(this.iIXi1iiXI)});
        goto L21
    L15:
        ValueAnimator r3 = this.X1;
        if (r3 != null) goto L18;
    L20:
        this.iii0 = event.getX();
        goto L21
    L18:
        if (r3.isRunning() == false) goto L20;
        this.X1.end();
        this.X1.cancel();
        goto L20
    }

    public void setBgColor(int bgColor) {
        this.O001I = bgColor;
        invalidate();
    }

    public void setFirstScale(float firstScale) {
        this.X0i1O = firstScale / this.IO;
        invalidate();
    }

    public void setIsBgRoundRect(boolean bgRoundRect) {
        this.XO0X10iO = bgRoundRect;
        invalidate();
    }

    public void setLargeScaleColor(int largeScaleColor) {
        this.Ii1iii0 = largeScaleColor;
    }

    public void setLargeScaleStroke(int largeScaleStroke) {
        this.XOX0O0 = largeScaleStroke;
        invalidate();
    }

    public void setMaxScale(float maxScale) {
        this.iIXi1iiXI = maxScale / this.IO;
        this.iXiX011 = maxScale;
        invalidate();
    }

    public void setMaxScaleValue(float maxScaleValue) {
        this.iXiX011 = maxScaleValue;
    }

    public void setMidScaleColor(int midScaleColor) {
        this.iXiiiO = midScaleColor;
        invalidate();
    }

    public void setMidScaleStroke(int midScaleStroke) {
        this.OO = midScaleStroke;
        invalidate();
    }

    public void setMinScale(int minScale) {
        this.X1IX = minScale / this.IO;
        invalidate();
    }

    public void setOnChooseResulterListener(O00 onChooseResulterListener) {
        this.Ii0X0X = onChooseResulterListener;
    }

    public void setResultNumColor(int resultNumColor) {
        this.X11I = resultNumColor;
        invalidate();
    }

    public void setResultNumTextSize(int resultNumTextSize) {
        this.iOiXi11II = resultNumTextSize;
        invalidate();
    }

    public void setRulerHeight(int rulerHeight) {
        this.I1 = rulerHeight;
        invalidate();
    }

    public void setRulerToResultgap(int rulerToResultgap) {
        this.iX1O1 = rulerToResultgap;
        invalidate();
    }

    public void setScaleCount(int scaleCount) {
        this.X11iII1O1 = scaleCount;
        invalidate();
    }

    public void setScaleGap(int scaleGap) {
        this.XXX11i = scaleGap;
        invalidate();
    }

    public void setScaleLimit(int scaleLimit) {
        this.IO = scaleLimit;
        invalidate();
    }

    public void setScaleNumColor(int scaleNumColor) {
        this.iiiO = scaleNumColor;
        invalidate();
    }

    public void setScaleNumTextSize(int scaleNumTextSize) {
        this.X00XIX1 = scaleNumTextSize;
        invalidate();
    }

    public void setShowScaleResult(boolean showScaleResult) {
        this.i11I = showScaleResult;
        invalidate();
    }

    public void setSmallScaleColor(int smallScaleColor) {
        this.XXO = smallScaleColor;
        invalidate();
    }

    public void setSmallScaleStroke(int smallScaleStroke) {
        this.OX110i = smallScaleStroke;
        invalidate();
    }

    public void setUnit(String unit) {
        this.X100O = unit;
        invalidate();
    }

    public void setUnitColor(int unitColor) {
        this.XX1Oi = unitColor;
        invalidate();
    }

    public void setUnitTextSize(int unitTextSize) {
        this.i0X000X0O = unitTextSize;
        invalidate();
    }

    public RulerView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public RulerView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.IO = 1;
        this.I1 = 50;
        this.iX1O1 = 50 / 4;
        this.X11iII1O1 = 10;
        this.XXX11i = 20;
        this.X1IX = 0;
        this.X0i1O = 50.0f;
        this.iIXi1iiXI = 100.0f;
        this.iXiX011 = 100.0f;
        this.O001I = -196612;
        this.XXO = -6710887;
        this.iXiiiO = -10066330;
        this.Ii1iii0 = -11487866;
        this.iiiO = -13421773;
        this.X11I = -11487866;
        this.X100O = "kg";
        this.XX1Oi = -11487866;
        this.OX110i = 1;
        this.OO = 2;
        this.XOX0O0 = 3;
        this.iOiXi11II = 20;
        this.X00XIX1 = 16;
        this.i0X000X0O = 13;
        this.i11I = true;
        this.XO0X10iO = true;
        this.XXiIiX10 = -1.0f;
        this.X00Xi1X = 50.0f;
        this.IXOIIIO = VelocityTracker.obtain();
        this.IO0II0i = String.valueOf(this.X0i1O);
        this.O0O = 0;
        this.Xii11I = 0.0f;
        this.X00O0 = 0.0f;
        this.X111IO = false;
        OiIIX101O(attrs, defStyleAttr);
        XX0();
    }
}
