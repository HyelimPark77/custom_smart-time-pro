package com.sma.smartv3.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.view.View;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.hl4;
import com.android.mltcode.paycertificationapi.iiOI111I;
import com.android.mltcode.paycertificationapi.tb1;
import com.blankj.utilcode.util.SizeUtils;
import com.sma.smartv3.C15429R;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.SimpleStepProgressBar;
import com.sma.smartv3.view.text.MyTypeface;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import skin.support.widget.SkinCompatView;

/* JADX INFO: loaded from: classes3.dex */
public final class SimpleStepProgressBar extends SkinCompatView {

    /* JADX INFO: renamed from: I1 */
    public float f55035I1;
    public final long IO0II0i;
    public float IXI;
    public float IXOIIIO;
    public float Ii0X0X;
    public final float Ii0i;
    public int Ii1iii0;

    @aa1
    public String IiiXiI0I;

    @aa1
    public final Paint O001I;

    /* JADX INFO: renamed from: OO */
    @aa1
    public final Paint f55036OO;
    public int OX110i;
    public int X00XIX1;
    public int X00Xi1X;
    public float X0i1O;

    /* JADX INFO: renamed from: X1 */
    @aa1
    public ValueAnimator f55037X1;
    public int X100O;
    public int X11I;
    public float X11iII1O1;
    public int X1IX;

    @aa1
    public Paint XO0X10iO;
    public int XOX0O0;
    public int XX1Oi;

    @aa1
    public final Paint XXO;
    public boolean XXX11i;

    @aa1
    public String XXiIiX10;

    @aa1
    public Bitmap i0X000X0O;

    @aa1
    public Paint i11I;
    public final float iIXi1iiXI;
    public int iOiXi11II;
    public float iX1O1;
    public float iXiX011;

    @aa1
    public final RectF iXiiiO;
    public int iiiO;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SimpleStepProgressBar(@aa1 Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.X0O(context, "context");
    }

    private final void IiI10X(float f, float f2, long j) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, f2);
        Intrinsics.O10IXXX0X(valueAnimatorOfFloat, "ofFloat(...)");
        this.f55037X1 = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(j);
        this.f55037X1.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.android.mltcode.paycertificationapi.ji4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                SimpleStepProgressBar.XOO0ii0(this.f8974IO, valueAnimator);
            }
        });
        this.f55037X1.start();
    }

    private final float O00(int i) {
        return SizeUtils.sp2px(i);
    }

    private final float XIi00iiXO(int i) {
        return SizeUtils.dp2px(i);
    }

    public static final void XOO0ii0(SimpleStepProgressBar simpleStepProgressBar, ValueAnimator animation) {
        Intrinsics.X0O(animation, "animation");
        Object animatedValue = animation.getAnimatedValue();
        Intrinsics.X1ii(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float fFloatValue = ((Float) animatedValue).floatValue();
        simpleStepProgressBar.IXOIIIO = fFloatValue;
        simpleStepProgressBar.IXI = fFloatValue * simpleStepProgressBar.Ii0i;
        simpleStepProgressBar.invalidate();
    }

    /* JADX INFO: renamed from: iO */
    private final void m38909iO(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C15429R.styleable.SimpleStepProgressBar);
        Intrinsics.O10IXXX0X(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.XXX11i = typedArrayObtainStyledAttributes.getBoolean(0, true);
        this.Ii1iii0 = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.XX1Oi = typedArrayObtainStyledAttributes.getResourceId(2, 0);
        this.X11I = typedArrayObtainStyledAttributes.getResourceId(3, 0);
        this.XXiIiX10 = typedArrayObtainStyledAttributes.getText(6).toString();
        this.iOiXi11II = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.X00XIX1 = typedArrayObtainStyledAttributes.getColor(1, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void XO0O10(int i, int i2) {
        this.IiiXiI0I = String.valueOf(i);
        if (i2 == 0) {
            i2 = 10000;
        }
        float f = (i / i2) * 100;
        float f2 = this.Ii0i;
        if (f > f2) {
            f = f2;
        }
        IiI10X(this.IXOIIIO, f / f2, this.IO0II0i);
    }

    @Override // skin.support.widget.SkinCompatView, com.android.mltcode.paycertificationapi.ik4
    public void applySkin() {
        super.applySkin();
        Context context = getContext();
        Intrinsics.O10IXXX0X(context, "getContext(...)");
        hl4.OXO1(context, this.f55036OO, this.XOX0O0);
        Context context2 = getContext();
        Intrinsics.O10IXXX0X(context2, "getContext(...)");
        hl4.OXO1(context2, this.XO0X10iO, this.iOiXi11II);
        Context context3 = getContext();
        Intrinsics.O10IXXX0X(context3, "getContext(...)");
        hl4.OXO1(context3, this.i11I, this.iOiXi11II);
        Context context4 = getContext();
        Intrinsics.O10IXXX0X(context4, "getContext(...)");
        this.iiiO = hl4.XIi00iiXO(context4, this.Ii1iii0);
        Context context5 = getContext();
        Intrinsics.O10IXXX0X(context5, "getContext(...)");
        this.OX110i = hl4.XIi00iiXO(context5, this.XX1Oi);
        Context context6 = getContext();
        Intrinsics.O10IXXX0X(context6, "getContext(...)");
        this.X100O = hl4.XIi00iiXO(context6, this.X11I);
        Paint paint = this.O001I;
        float f = this.X1IX / 2;
        int i = this.iiiO;
        int i2 = this.X100O;
        int i3 = this.OX110i;
        paint.setShader(new SweepGradient(f, 1.0f, new int[]{i, i2, i3, i3}, new float[]{0.0f, 0.3f, 0.5f, 1.0f}));
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(@aa1 Canvas canvas) {
        Intrinsics.X0O(canvas, "canvas");
        super.onDraw(canvas);
        canvas.save();
        canvas.drawArc(this.iXiiiO, 270.0f, 360.0f, false, this.XXO);
        float f = (this.IXI / this.Ii0i) * 360.0f;
        this.X11iII1O1 = f;
        canvas.drawArc(this.iXiiiO, 270.0f, f, false, this.O001I);
        canvas.drawBitmap(this.i0X000X0O, this.f55035I1 - XIi00iiXO(14), this.f55035I1 / 3, this.f55036OO);
        String str = this.IiiXiI0I;
        float f2 = this.f55035I1;
        canvas.drawText(str, f2, XIi00iiXO(10) + f2, this.i11I);
        String str2 = this.XXiIiX10;
        float f3 = this.f55035I1;
        canvas.drawText(str2, f3 - this.Ii0X0X, f3 + (f3 / 2), this.XO0X10iO);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int iMin = Math.min(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        this.X00Xi1X = iMin;
        setMeasuredDimension(iMin, iMin);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.X1IX = i;
        float f = this.X00Xi1X / 2.0f;
        this.f55035I1 = f;
        this.iX1O1 = f - (this.X0i1O / 2);
        RectF rectF = this.iXiiiO;
        float f2 = this.iXiX011;
        rectF.set(f2, f2, getWidth() - this.iXiX011, getWidth() - this.iXiX011);
        applySkin();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SimpleStepProgressBar(@aa1 Context context, @tb1 AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.X0O(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SimpleStepProgressBar(@aa1 Context context, @tb1 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.X0O(context, "context");
        this.XXX11i = true;
        float fXIi00iiXO = XIi00iiXO(10);
        this.X0i1O = fXIi00iiXO;
        float f = 2;
        float fXIi00iiXO2 = (fXIi00iiXO * f) + XIi00iiXO(8);
        this.iIXi1iiXI = fXIi00iiXO2;
        this.iXiX011 = XIi00iiXO(6);
        Paint paint = new Paint();
        this.O001I = paint;
        Paint paint2 = new Paint();
        this.XXO = paint2;
        this.iXiiiO = new RectF();
        Paint paint3 = new Paint();
        this.f55036OO = paint3;
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(context.getResources(), R.drawable.going_fit_icon_step);
        Intrinsics.O10IXXX0X(bitmapDecodeResource, "decodeResource(...)");
        this.i0X000X0O = bitmapDecodeResource;
        this.i11I = new Paint();
        this.XO0X10iO = new Paint();
        this.XXiIiX10 = "Steps";
        this.f55037X1 = new ValueAnimator();
        this.IO0II0i = 1000L;
        this.Ii0i = 100.0f;
        this.IXI = 90.0f;
        this.IiiXiI0I = "10000";
        m38909iO(context, attributeSet);
        paint.setAntiAlias(this.XXX11i);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint.setStrokeWidth(this.X0i1O);
        paint2.setAntiAlias(this.XXX11i);
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint2.setStrokeWidth(this.X0i1O);
        paint2.setColor(this.X00XIX1);
        paint3.setAntiAlias(this.XXX11i);
        paint3.setStyle(Paint.Style.FILL_AND_STROKE);
        paint3.setColor(-1);
        paint3.setStrokeWidth(fXIi00iiXO2);
        this.i11I.setAntiAlias(this.XXX11i);
        this.i11I.setColor(this.iOiXi11II);
        this.i11I.setTextSize(O00(36));
        this.i11I.setTextAlign(Paint.Align.CENTER);
        Paint paint4 = this.i11I;
        iiOI111I iioi111i = iiOI111I.OXO1;
        paint4.setTypeface(iioi111i.OXO1(MyTypeface.DIN_COND_BOLD, context));
        this.XO0X10iO.setAntiAlias(this.XXX11i);
        this.XO0X10iO.setColor(this.iOiXi11II);
        this.XO0X10iO.setTextSize(O00(14));
        this.XO0X10iO.setTypeface(iioi111i.OXO1(MyTypeface.PF_REGULAR, context));
        this.Ii0X0X = this.XO0X10iO.measureText(this.XXiIiX10) / f;
        applySkin();
    }

    public /* synthetic */ SimpleStepProgressBar(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
