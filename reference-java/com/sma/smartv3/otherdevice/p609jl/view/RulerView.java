package com.sma.smartv3.otherdevice.p609jl.view;

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
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.SizeUtils;
import com.sma.smartv3.C15429R;
import com.sma.smartv3.otherdevice.p609jl.view.RulerView;
import java.lang.ref.WeakReference;
import java.math.BigDecimal;

/* JADX INFO: loaded from: classes19.dex */
public class RulerView extends View {
    public static final String iiII = "RulerView";

    /* JADX INFO: renamed from: I1 */
    public int f51359I1;

    /* JADX INFO: renamed from: IO */
    public int f51360IO;
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

    /* JADX INFO: renamed from: OO */
    public int f51361OO;
    public int OX110i;

    /* JADX INFO: renamed from: Oi */
    public Rect f51362Oi;
    public float X00O0;
    public int X00XIX1;
    public float X00Xi1X;
    public float X0i1O;
    public float X0iO;

    /* JADX INFO: renamed from: X1 */
    public ValueAnimator f51363X1;
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
        public OXO1() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator animation) {
            RulerView.this.Xii11I += ((Integer) animation.getAnimatedValue()).intValue();
            if (RulerView.this.Xii11I >= RulerView.this.IX1XiI / 2) {
                RulerView rulerView = RulerView.this;
                rulerView.Xii11I = rulerView.IX1XiI / 2;
            } else {
                float f = RulerView.this.Xii11I;
                RulerView rulerView2 = RulerView.this;
                if (f <= rulerView2.iIiiO(rulerView2.iIXi1iiXI)) {
                    RulerView rulerView3 = RulerView.this;
                    rulerView3.Xii11I = rulerView3.iIiiO(rulerView3.iIXi1iiXI);
                }
            }
            RulerView rulerView4 = RulerView.this;
            rulerView4.X00O0 = rulerView4.Xii11I;
            RulerView.this.invalidate();
        }
    }

    public class XIi00iiXO extends AnimatorListenerAdapter {
        public XIi00iiXO() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            RulerView.this.X111IO = true;
            RulerView.this.invalidate();
        }
    }

    public class XO0O10 extends AnimatorListenerAdapter {
        public XO0O10() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            super.onAnimationEnd(animation);
            if (RulerView.this.Ii0X0X != null) {
                RulerView.this.Ii0X0X.OXO1(RulerView.this.IO0II0i);
            }
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.otherdevice.jl.view.RulerView$iO */
    public class C18637iO extends AnimatorListenerAdapter {
        public C18637iO() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            super.onAnimationEnd(animation);
            RulerView rulerView = RulerView.this;
            if (rulerView.X00Xi1X != rulerView.XXiIiX10) {
                RulerView rulerView2 = RulerView.this;
                rulerView2.Xii11I = rulerView2.iIiiO(rulerView2.XXiIiX10);
                RulerView rulerView3 = RulerView.this;
                rulerView3.X00O0 = rulerView3.Xii11I;
                RulerView.this.Xii = true;
            } else if (RulerView.this.Ii0X0X != null) {
                RulerView.this.Ii0X0X.OXO1(RulerView.this.IO0II0i);
            }
            RulerView.this.XXiIiX10 = -1.0f;
        }
    }

    public RulerView(Context context) {
        this(context, null);
    }

    public static /* synthetic */ void OXO1(RulerView rulerView, ValueAnimator valueAnimator) {
        rulerView.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        rulerView.Xii11I = fFloatValue;
        rulerView.X00O0 = fFloatValue;
        rulerView.invalidate();
    }

    public static /* synthetic */ void XIi00iiXO(RulerView rulerView, ValueAnimator valueAnimator) {
        rulerView.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        rulerView.Xii11I = fFloatValue;
        rulerView.X00O0 = fFloatValue;
        rulerView.invalidate();
    }

    public final void I1XOi1(Canvas canvas) {
        this.O0O0X0iOi.set(0.0f, 0.0f, this.IX1XiI, this.iOI);
        if (this.XO0X10iO) {
            canvas.drawRoundRect(this.O0O0X0iOi, 20.0f, 20.0f, this.Ii0i);
        } else {
            canvas.drawRect(this.O0O0X0iOi, this.Ii0i);
        }
    }

    public final void IIX1OXO(Canvas canvas, String resultText) {
        if (this.i11I) {
            canvas.translate(0.0f, (-this.IO0iXO0O.height()) - (this.iX1O1 / 2));
            this.XOO0XOOii.getTextBounds(resultText, 0, resultText.length(), this.IO0iXO0O);
            canvas.drawText(resultText, (this.IX1XiI / 2) - (this.IO0iXO0O.width() / 2), this.IO0iXO0O.height(), this.XOO0XOOii);
            int iWidth = (this.IX1XiI / 2) + (this.IO0iXO0O.width() / 2) + 10;
            this.Xi1i0XOX0 = iWidth;
            canvas.drawText(this.X100O, iWidth, this.XX00i10X.height() + 2, this.iiIOiX);
        }
    }

    public final void O10IXXX0X(int xVelocity) {
        if (Math.abs(xVelocity) < 50) {
            this.X111IO = true;
            return;
        }
        if (this.f51363X1.isRunning()) {
            return;
        }
        ValueAnimator duration = ValueAnimator.ofInt(0, xVelocity / 20).setDuration(Math.abs(xVelocity / 10));
        this.f51363X1 = duration;
        duration.setInterpolator(new DecelerateInterpolator());
        this.f51363X1.addUpdateListener(new OXO1());
        this.f51363X1.addListener(new XIi00iiXO());
        this.f51363X1.start();
    }

    public final void OiIIX101O(AttributeSet attrs, int defStyleAttr) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attrs, C15429R.styleable.RulerView, defStyleAttr, 0);
        this.f51360IO = typedArrayObtainStyledAttributes.getInt(16, this.f51360IO);
        this.f51359I1 = typedArrayObtainStyledAttributes.getDimensionPixelSize(11, (int) TypedValue.applyDimension(1, this.f51359I1, getResources().getDisplayMetrics()));
        this.iX1O1 = typedArrayObtainStyledAttributes.getDimensionPixelSize(13, (int) TypedValue.applyDimension(1, this.iX1O1, getResources().getDisplayMetrics()));
        this.X11iII1O1 = typedArrayObtainStyledAttributes.getInt(14, this.X11iII1O1);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(15, (int) TypedValue.applyDimension(1, this.XXX11i, getResources().getDisplayMetrics()));
        this.XXX11i = dimensionPixelSize;
        this.XXX11i = SizeUtils.dp2px(dimensionPixelSize);
        this.X1IX = typedArrayObtainStyledAttributes.getInt(7, this.X1IX) / this.f51360IO;
        this.X0i1O = typedArrayObtainStyledAttributes.getFloat(0, this.X0i1O) / this.f51360IO;
        this.iIXi1iiXI = typedArrayObtainStyledAttributes.getFloat(4, this.iIXi1iiXI) / this.f51360IO;
        this.O001I = typedArrayObtainStyledAttributes.getColor(10, this.O001I);
        this.XXO = typedArrayObtainStyledAttributes.getColor(12, this.XXO);
        this.iXiiiO = typedArrayObtainStyledAttributes.getColor(5, this.iXiiiO);
        this.Ii1iii0 = typedArrayObtainStyledAttributes.getColor(2, this.Ii1iii0);
        this.iiiO = typedArrayObtainStyledAttributes.getColor(17, this.iiiO);
        this.X11I = typedArrayObtainStyledAttributes.getColor(8, this.X11I);
        this.XX1Oi = typedArrayObtainStyledAttributes.getColor(22, this.XX1Oi);
        String str = this.X100O;
        String string = typedArrayObtainStyledAttributes.getString(21);
        this.X100O = string;
        if (TextUtils.isEmpty(string)) {
            this.X100O = str;
        }
        this.OX110i = typedArrayObtainStyledAttributes.getDimensionPixelSize(20, (int) TypedValue.applyDimension(1, this.OX110i, getResources().getDisplayMetrics()));
        this.f51361OO = typedArrayObtainStyledAttributes.getDimensionPixelSize(6, (int) TypedValue.applyDimension(1, this.f51361OO, getResources().getDisplayMetrics()));
        this.XOX0O0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(3, (int) TypedValue.applyDimension(1, this.XOX0O0, getResources().getDisplayMetrics()));
        this.iOiXi11II = typedArrayObtainStyledAttributes.getDimensionPixelSize(9, (int) TypedValue.applyDimension(2, this.iOiXi11II, getResources().getDisplayMetrics()));
        this.X00XIX1 = typedArrayObtainStyledAttributes.getDimensionPixelSize(18, (int) TypedValue.applyDimension(2, this.X00XIX1, getResources().getDisplayMetrics()));
        this.i0X000X0O = typedArrayObtainStyledAttributes.getDimensionPixelSize(23, (int) TypedValue.applyDimension(2, this.i0X000X0O, getResources().getDisplayMetrics()));
        this.i11I = typedArrayObtainStyledAttributes.getBoolean(19, this.i11I);
        this.XO0X10iO = typedArrayObtainStyledAttributes.getBoolean(1, this.XO0X10iO);
        typedArrayObtainStyledAttributes.recycle();
    }

    public void X0O(float scale) {
        float f = scale / this.f51360IO;
        if (f < this.X1IX || f > this.iIXi1iiXI) {
            return;
        }
        this.XXiIiX10 = f;
        invalidate();
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
        Paint paint = this.XOO0XOOii;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.iiIOiX.setStyle(style);
        this.Ii0i.setStyle(style);
        this.IXI.setStyle(style);
        this.IiiXiI0I.setStyle(style);
        this.XOIX.setStyle(style);
        Paint paint2 = this.XOIX;
        Paint.Cap cap = Paint.Cap.ROUND;
        paint2.setStrokeCap(cap);
        this.IiiXiI0I.setStrokeCap(cap);
        this.IXI.setStrokeCap(cap);
        this.IXI.setStrokeWidth(this.OX110i);
        this.IiiXiI0I.setStrokeWidth(this.f51361OO);
        this.XOIX.setStrokeWidth(this.XOX0O0);
        this.XOO0XOOii.setTextSize(this.iOiXi11II);
        this.iiIOiX.setTextSize(this.i0X000X0O);
        this.XOXiX0.setTextSize(this.X00XIX1);
        this.O0O0X0iOi = new RectF();
        this.IO0iXO0O = new Rect();
        this.f51362Oi = new Rect();
        this.XX00i10X = new Rect();
        Paint paint3 = this.XOO0XOOii;
        String str = this.IO0II0i;
        paint3.getTextBounds(str, 0, str.length(), this.IO0iXO0O);
        this.iiIOiX.getTextBounds(this.IO0II0i, 0, 1, this.XX00i10X);
        int i = this.f51359I1;
        this.XXiO0i = i / 4;
        this.IX0IXOi = i / 2;
        this.iXi = i;
        this.iIX0i = i / 2;
        this.f51363X1 = new ValueAnimator();
    }

    public final void XiOIO(Canvas canvas) {
        boolean z = true;
        canvas.translate(0.0f, (this.i11I ? this.IO0iXO0O.height() : 0) + this.iX1O1);
        float f = this.X0i1O;
        if (f != -1.0f) {
            float fIIiiO = iIiiO(f);
            this.Xii11I = fIIiiO;
            this.X00O0 = fIIiiO;
            this.X0i1O = -1.0f;
        }
        if (this.XXiIiX10 != -1.0f) {
            Log.d(iiII, "moveX 000 >> " + this.Xii11I + ", computeScale >> " + this.XXiIiX10);
            this.X00O0 = this.Xii11I;
            ValueAnimator valueAnimator = this.f51363X1;
            if (valueAnimator != null && !valueAnimator.isRunning()) {
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.X00O0, iIiiO(this.XXiIiX10));
                this.f51363X1 = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.android.mltcode.paycertificationapi.yp3
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        RulerView.OXO1(this.f12422IO, valueAnimator2);
                    }
                });
                this.f51363X1.addListener(new C18637iO());
                this.f51363X1.setDuration(Math.abs((long) (iIiiO(this.XXiIiX10) - this.X00O0)));
                this.f51363X1.start();
            }
        }
        float f2 = this.Xii11I;
        int i = this.XXX11i;
        int i2 = -((int) (f2 / i));
        float f3 = f2 % i;
        canvas.save();
        this.O0O = 0;
        if (this.X111IO) {
            float f4 = this.Xii11I;
            int i3 = this.IX1XiI / 2;
            int i4 = this.XXX11i;
            float fAbs = (f4 - (i3 % i4)) % i4;
            if (fAbs <= 0.0f) {
                fAbs = i4 - Math.abs(fAbs);
            }
            this.iIi1 = (int) Math.abs(fAbs);
            int iAbs = (int) (this.XXX11i - Math.abs(fAbs));
            this.i100IXOX = iAbs;
            float f5 = fAbs <= ((float) (this.XXX11i / 2)) ? this.Xii11I - this.iIi1 : this.Xii11I + iAbs;
            ValueAnimator valueAnimator2 = this.f51363X1;
            if (valueAnimator2 != null && !valueAnimator2.isRunning()) {
                ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(this.Xii11I, f5);
                this.f51363X1 = valueAnimatorOfFloat2;
                valueAnimatorOfFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.android.mltcode.paycertificationapi.zp3
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                        RulerView.XIi00iiXO(this.f12664IO, valueAnimator3);
                    }
                });
                this.f51363X1.addListener(new XO0O10());
                this.f51363X1.setDuration(300L);
                this.f51363X1.start();
                this.X111IO = false;
            }
            float f6 = this.Xii11I;
            int i5 = this.XXX11i;
            i2 = (int) (-(f6 / i5));
            f3 = f6 % i5;
        }
        canvas.translate(f3, 0.0f);
        float fFloatValue = ((BigDecimal) new WeakReference(new BigDecimal(((((this.IX1XiI / 2) - this.Xii11I) / (this.XXX11i * this.X11iII1O1)) + this.X1IX) * this.f51360IO)).get()).setScale(1, 4).floatValue();
        this.X00Xi1X = fFloatValue;
        String strValueOf = String.valueOf(fFloatValue);
        this.IO0II0i = strValueOf;
        O00 o00 = this.Ii0X0X;
        if (o00 != null) {
            o00.XIi00iiXO(strValueOf);
        }
        if (this.Xii) {
            this.Xii = false;
            O00 o01 = this.Ii0X0X;
            if (o01 != null) {
                o01.OXO1(this.IO0II0i);
            }
        }
        float f7 = this.IX1XiI;
        float f8 = this.iIXi1iiXI;
        int iRound = f8 > ((float) Math.round(f8)) ? Math.round(this.iIXi1iiXI) + 1 : Math.round(this.iIXi1iiXI);
        float f9 = f7;
        int i6 = i2;
        float f10 = 0.0f;
        while (true) {
            int i7 = this.O0O;
            int i8 = this.IX1XiI;
            if (i7 >= i8) {
                canvas.restore();
                int i9 = this.IX1XiI;
                canvas.drawLine(i9 / 2, 0.0f, i9 / 2, this.f51359I1, this.XOIX);
                int i10 = this.iIX0i;
                canvas.drawLine(f10, i10, f9, i10, this.IXI);
                return;
            }
            if (i6 % this.X11iII1O1 == 0) {
                float f11 = this.Xii11I;
                if ((f11 < 0.0f || i7 >= f11 - this.XXX11i) && (i8 / 2) - i7 > iIiiO(iRound + 1) - this.Xii11I) {
                    float f12 = (i6 / this.X11iII1O1) + this.X1IX;
                    int i11 = this.f51360IO;
                    float f13 = f12 * i11;
                    if (f13 <= this.iIXi1iiXI * i11) {
                        int i12 = this.iIX0i;
                        canvas.drawLine(0.0f, i12, 0.0f, i12 + this.IX0IXOi, this.IiiXiI0I);
                        this.XOXiX0.getTextBounds(((i6 / this.XXX11i) + this.X1IX) + "", 0, (((i6 / this.XXX11i) + this.X1IX) + "").length(), this.f51362Oi);
                        float f14 = (-this.f51362Oi.width()) / 2;
                        int i13 = this.iXi;
                        canvas.drawText(((int) f13) + "", f14, i13 + ((this.f51359I1 - i13) / 2) + this.f51362Oi.height() + SizeUtils.dp2px(10.0f), this.XOXiX0);
                    }
                    int i14 = this.X1IX;
                    int i15 = this.f51360IO;
                    if (f13 == i14 * i15) {
                        f10 = (this.IX1XiI >> 1) - ((((this.X00Xi1X - f13) * this.XXX11i) / i15) * this.X11iII1O1);
                    } else if (f13 == iRound * i15) {
                        f9 = ((((f13 - this.X00Xi1X) * this.XXX11i) / i15) * this.X11iII1O1) + (this.IX1XiI / 2);
                    }
                } else {
                    z = z;
                }
            } else {
                z = z;
                float f15 = this.Xii11I;
                if ((f15 < 0.0f || i7 >= f15) && (i8 / 2) - i7 >= iIiiO(iRound) - this.Xii11I) {
                    float f16 = (i6 / this.X11iII1O1) + this.X1IX;
                    int i16 = this.f51360IO;
                    if (f16 * i16 <= this.iIXi1iiXI * i16) {
                        int i17 = this.iIX0i;
                        canvas.drawLine(0.0f, i17, 0.0f, i17 + this.XXiO0i, this.IXI);
                    }
                }
            }
            i6++;
            int i18 = this.O0O;
            int i19 = this.XXX11i;
            this.O0O = i18 + i19;
            canvas.translate(i19, 0.0f);
            z = z;
        }
    }

    public void XiOIii1(int minScale, float maxScale, float firstScale) {
        int i = this.f51360IO;
        this.X1IX = minScale / i;
        this.iIXi1iiXI = maxScale / i;
        this.X0i1O = firstScale / i;
        this.iXiX011 = maxScale;
        invalidate();
    }

    public float getMaxScale() {
        return this.iIXi1iiXI * this.f51360IO;
    }

    public float getMaxScaleValue() {
        return this.iXiX011;
    }

    public int getMinScale() {
        return this.X1IX * this.f51360IO;
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
        int mode = View.MeasureSpec.getMode(heightMeasureSpec);
        int size = View.MeasureSpec.getSize(heightMeasureSpec);
        int size2 = View.MeasureSpec.getSize(widthMeasureSpec);
        if (mode == Integer.MIN_VALUE || mode == 0) {
            this.iOI = this.f51359I1 + (this.i11I ? this.IO0iXO0O.height() : 0) + (this.iX1O1 * 2) + getPaddingTop() + getPaddingBottom() + SizeUtils.dp2px(20.0f);
        } else if (mode == 1073741824) {
            this.iOI = size + getPaddingTop() + getPaddingBottom();
        }
        int paddingLeft = size2 + getPaddingLeft() + getPaddingRight();
        this.IX1XiI = paddingLeft;
        setMeasuredDimension(paddingLeft, this.iOI);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        this.X0iO = event.getX();
        this.X111IO = false;
        this.IXOIIIO.computeCurrentVelocity(500);
        this.IXOIIIO.addMovement(event);
        int action = event.getAction();
        if (action == 0) {
            ValueAnimator valueAnimator = this.f51363X1;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f51363X1.end();
                this.f51363X1.cancel();
            }
            this.iii0 = event.getX();
        } else if (action == 1) {
            this.X00O0 = this.Xii11I;
            int xVelocity = (int) this.IXOIIIO.getXVelocity();
            this.iI0I = xVelocity;
            O10IXXX0X(xVelocity);
            this.IXOIIIO.clear();
        } else if (action == 2) {
            float f = (this.X0iO - this.iii0) + this.X00O0;
            this.Xii11I = f;
            int i = this.IX1XiI;
            if (f >= i / 2) {
                this.Xii11I = i / 2;
            } else if (f <= iIiiO(this.iIXi1iiXI)) {
                this.Xii11I = iIiiO(this.iIXi1iiXI);
                LogUtils.m11128d(iiII, "moveX = " + this.Xii11I + ", max = " + iIiiO(this.iIXi1iiXI));
            }
        }
        invalidate();
        return true;
    }

    public void setBgColor(int bgColor) {
        this.O001I = bgColor;
        invalidate();
    }

    public void setFirstScale(float firstScale) {
        this.X0i1O = firstScale / this.f51360IO;
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
        this.iIXi1iiXI = maxScale / this.f51360IO;
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
        this.f51361OO = midScaleStroke;
        invalidate();
    }

    public void setMinScale(int minScale) {
        this.X1IX = minScale / this.f51360IO;
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
        this.f51359I1 = rulerHeight;
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
        this.f51360IO = scaleLimit;
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
        this.f51360IO = 1;
        this.f51359I1 = 50;
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
        this.f51361OO = 2;
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
