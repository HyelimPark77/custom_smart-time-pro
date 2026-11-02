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
import com.android.mltcode.paycertificationapi.ji4;
import com.android.mltcode.paycertificationapi.tb1;
import com.blankj.utilcode.util.SizeUtils;
import com.sma.smartv3.R;
import com.sma.smartv3.view.text.MyTypeface;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import skin.support.widget.SkinCompatView;

/* JADX INFO: loaded from: classes3.dex */
public final class SimpleStepProgressBar extends SkinCompatView {
    public float I1;
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

    @aa1
    public final Paint OO;
    public int OX110i;
    public int X00XIX1;
    public int X00Xi1X;
    public float X0i1O;

    @aa1
    public ValueAnimator X1;
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

    @JvmOverloads
    public SimpleStepProgressBar(@aa1 Context r8) {
        Intrinsics.X0O(r8, "context");
        AttributeSet r3 = null;
        int r4 = 0;
        this(r8, r3, r4, 6, null);
    }

    private final void IiI10X(float r3, float r4, long r5) {
        ValueAnimator r6 = ValueAnimator.ofFloat(new float[]{r3, r4});
        Intrinsics.O10IXXX0X(r6, "ofFloat(...)");
        this.X1 = r6;
        r6.setDuration(r5);
        this.X1.addUpdateListener(new ji4(this));
        this.X1.start();
    }

    private final float O00(int r1) {
        return SizeUtils.sp2px(r1);
    }

    public static /* synthetic */ void OXO1(SimpleStepProgressBar r0, ValueAnimator r1) {
        XOO0ii0(r0, r1);
    }

    private final float XIi00iiXO(int r1) {
        return SizeUtils.dp2px(r1);
    }

    public static final void XOO0ii0(SimpleStepProgressBar r1, ValueAnimator r2) {
        Intrinsics.X0O(r2, "animation");
        Object r3 = r2.getAnimatedValue();
        Intrinsics.X1ii(r3, "null cannot be cast to non-null type kotlin.Float");
        float r4 = ((Float) r3).floatValue();
        r1.IXOIIIO = r4;
        r1.IXI = r4 * r1.Ii0i;
        r1.invalidate();
    }

    private final void iO(Context r3, AttributeSet r4) {
        TypedArray r5 = r3.obtainStyledAttributes(r4, R.styleable.SimpleStepProgressBar);
        Intrinsics.O10IXXX0X(r5, "obtainStyledAttributes(...)");
        this.XXX11i = r5.getBoolean(0, true);
        this.Ii1iii0 = r5.getResourceId(4, 0);
        this.XX1Oi = r5.getResourceId(2, 0);
        this.X11I = r5.getResourceId(3, 0);
        this.XXiIiX10 = r5.getText(6).toString();
        this.iOiXi11II = r5.getResourceId(5, 0);
        this.X00XIX1 = r5.getColor(1, 0);
        r5.recycle();
    }

    public final void XO0O10(int r4, int r5) {
        this.IiiXiI0I = String.valueOf(r4);
        if (r5 != 0) goto L5;
        r5 = 10000;
    L5:
        float r6 = (r4 / r5) * 100;
        float r7 = this.Ii0i;
        if (r6 <= r7) goto L8;
        r6 = r7;
    L8:
        IiI10X(this.IXOIIIO, r6 / r7, this.IO0II0i);
    }

    @Override // skin.support.widget.SkinCompatView, com.android.mltcode.paycertificationapi.ik4
    public void applySkin() {
        super.applySkin();
        Context r0 = getContext();
        Intrinsics.O10IXXX0X(r0, "getContext(...)");
        hl4.OXO1(r0, this.OO, this.XOX0O0);
        Context r1 = getContext();
        Intrinsics.O10IXXX0X(r1, "getContext(...)");
        hl4.OXO1(r1, this.XO0X10iO, this.iOiXi11II);
        Context r2 = getContext();
        Intrinsics.O10IXXX0X(r2, "getContext(...)");
        hl4.OXO1(r2, this.i11I, this.iOiXi11II);
        Context r3 = getContext();
        Intrinsics.O10IXXX0X(r3, "getContext(...)");
        this.iiiO = hl4.XIi00iiXO(r3, this.Ii1iii0);
        Context r4 = getContext();
        Intrinsics.O10IXXX0X(r4, "getContext(...)");
        this.OX110i = hl4.XIi00iiXO(r4, this.XX1Oi);
        Context r5 = getContext();
        Intrinsics.O10IXXX0X(r5, "getContext(...)");
        this.X100O = hl4.XIi00iiXO(r5, this.X11I);
        Paint r6 = this.O001I;
        float r7 = this.X1IX / 2;
        int r8 = this.iiiO;
        int r9 = this.X100O;
        int r10 = this.OX110i;
        r6.setShader(new SweepGradient(r7, 1.0f, new int[]{r8, r9, r10, r10}, new float[]{0.0f, 0.3f, 0.5f, 1.0f}));
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(@aa1 Canvas r14) {
        Intrinsics.X0O(r14, "canvas");
        super.onDraw(r14);
        r14.save();
        r14.drawArc(this.iXiiiO, 270.0f, 360.0f, false, this.XXO);
        float r10 = (this.IXI / this.Ii0i) * 360.0f;
        this.X11iII1O1 = r10;
        r14.drawArc(this.iXiiiO, 270.0f, r10, false, this.O001I);
        r14.drawBitmap(this.i0X000X0O, this.I1 - XIi00iiXO(14), this.I1 / 3, this.OO);
        String r15 = this.IiiXiI0I;
        float r0 = this.I1;
        r14.drawText(r15, r0, XIi00iiXO(10) + r0, this.i11I);
        String r16 = this.XXiIiX10;
        float r1 = this.I1;
        r14.drawText(r16, r1 - this.Ii0X0X, r1 + (r1 / 2), this.XO0X10iO);
    }

    @Override // android.view.View
    public void onMeasure(int r1, int r2) {
        super.onMeasure(r1, r2);
        int r3 = Math.min(View.MeasureSpec.getSize(r1), View.MeasureSpec.getSize(r2));
        this.X00Xi1X = r3;
        setMeasuredDimension(r3, r3);
    }

    @Override // android.view.View
    public void onSizeChanged(int r2, int r3, int r4, int r5) {
        super.onSizeChanged(r2, r3, r4, r5);
        this.X1IX = r2;
        float r6 = this.X00Xi1X / 2.0f;
        this.I1 = r6;
        this.iX1O1 = r6 - (this.X0i1O / 2);
        RectF r7 = this.iXiiiO;
        float r8 = this.iXiX011;
        r7.set(r8, r8, getWidth() - this.iXiX011, getWidth() - this.iXiX011);
        applySkin();
    }

    @JvmOverloads
    public SimpleStepProgressBar(@aa1 Context r8, @tb1 AttributeSet r9) {
        Intrinsics.X0O(r8, "context");
        int r4 = 0;
        this(r8, r9, r4, 4, null);
    }

    @JvmOverloads
    public SimpleStepProgressBar(@aa1 Context r7, @tb1 AttributeSet r8, int r9) {
        Intrinsics.X0O(r7, "context");
        super(r7, r8, r9);
        this.XXX11i = true;
        float r10 = XIi00iiXO(10);
        this.X0i1O = r10;
        float r0 = 2;
        float r11 = (r10 * r0) + XIi00iiXO(8);
        this.iIXi1iiXI = r11;
        this.iXiX011 = XIi00iiXO(6);
        Paint r1 = new Paint();
        this.O001I = r1;
        Paint r2 = new Paint();
        this.XXO = r2;
        this.iXiiiO = new RectF();
        Paint r3 = new Paint();
        this.OO = r3;
        Bitmap r4 = BitmapFactory.decodeResource(r7.getResources(), com.sma.smartv3.pro.R.drawable.going_fit_icon_step);
        Intrinsics.O10IXXX0X(r4, "decodeResource(...)");
        this.i0X000X0O = r4;
        this.i11I = new Paint();
        this.XO0X10iO = new Paint();
        this.XXiIiX10 = "Steps";
        this.X1 = new ValueAnimator();
        this.IO0II0i = 1000;
        this.Ii0i = 100.0f;
        this.IXI = 90.0f;
        this.IiiXiI0I = "10000";
        iO(r7, r8);
        r1.setAntiAlias(this.XXX11i);
        Paint.Style r12 = Paint.Style.STROKE;
        r1.setStyle(r12);
        Paint.Cap r5 = Paint.Cap.ROUND;
        r1.setStrokeCap(r5);
        r1.setStrokeWidth(this.X0i1O);
        r2.setAntiAlias(this.XXX11i);
        r2.setStyle(r12);
        r2.setStrokeCap(r5);
        r2.setStrokeWidth(this.X0i1O);
        r2.setColor(this.X00XIX1);
        r3.setAntiAlias(this.XXX11i);
        r3.setStyle(Paint.Style.FILL_AND_STROKE);
        r3.setColor(-1);
        r3.setStrokeWidth(r11);
        this.i11I.setAntiAlias(this.XXX11i);
        this.i11I.setColor(this.iOiXi11II);
        this.i11I.setTextSize(O00(36));
        this.i11I.setTextAlign(Paint.Align.CENTER);
        Paint r13 = this.i11I;
        iiOI111I r14 = iiOI111I.OXO1;
        r13.setTypeface(r14.OXO1(MyTypeface.DIN_COND_BOLD, r7));
        this.XO0X10iO.setAntiAlias(this.XXX11i);
        this.XO0X10iO.setColor(this.iOiXi11II);
        this.XO0X10iO.setTextSize(O00(14));
        this.XO0X10iO.setTypeface(r14.OXO1(MyTypeface.PF_REGULAR, r7));
        this.Ii0X0X = this.XO0X10iO.measureText(this.XXiIiX10) / r0;
        applySkin();
    }

    public /* synthetic */ SimpleStepProgressBar(Context r1, AttributeSet r2, int r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = null;
    L6:
        if ((r4 & 4) == 0) goto L8;
        r3 = 0;
    L8:
        this(r1, r2, r3);
    }
}
