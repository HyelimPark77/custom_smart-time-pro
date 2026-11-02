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
import com.sma.smartv3.C15429R;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.MyTypeface;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import skin.support.widget.SkinCompatView;

/* JADX INFO: loaded from: classes3.dex */
public final class BmiProgressBar extends SkinCompatView {

    /* JADX INFO: renamed from: I1 */
    public boolean f54957I1;
    public float IXOIIIO;
    public float Ii0X0X;
    public float Ii1iii0;
    public float O001I;

    /* JADX INFO: renamed from: OO */
    public int f54958OO;
    public int OX110i;
    public int X00XIX1;
    public final float X00Xi1X;

    @aa1
    public final Paint X0i1O;

    /* JADX INFO: renamed from: X1 */
    @aa1
    public Paint.FontMetrics f54959X1;
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

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BmiProgressBar(@aa1 Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.X0O(context, "context");
    }

    /* JADX INFO: renamed from: iO */
    private final void m38874iO(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C15429R.styleable.BmiProgressBar);
        Intrinsics.O10IXXX0X(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.f54957I1 = typedArrayObtainStyledAttributes.getBoolean(0, true);
        this.XX1Oi = typedArrayObtainStyledAttributes.getResourceId(6, 0);
        this.OX110i = typedArrayObtainStyledAttributes.getColor(1, -1);
        this.f54958OO = typedArrayObtainStyledAttributes.getColor(4, -1);
        this.XOX0O0 = typedArrayObtainStyledAttributes.getColor(3, -1);
        this.iOiXi11II = typedArrayObtainStyledAttributes.getColor(7, -1);
        this.X00XIX1 = typedArrayObtainStyledAttributes.getColor(5, -1);
        this.i0X000X0O = typedArrayObtainStyledAttributes.getColor(2, -1);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void OXO1() {
        float f = this.Ii0X0X;
        if (f <= 16.4f) {
            this.XO0X10iO = (this.Ii1iii0 / 2) / this.iXiX011;
            return;
        }
        if (f <= 18.4f) {
            this.XO0X10iO = (((f - 16.4f) / 2.0f) * this.iiiO) / this.iXiX011;
            return;
        }
        if (f <= 24.9f) {
            float f2 = this.iiiO;
            this.XO0X10iO = (f2 + (((f - 18.4f) / 6.5f) * f2)) / this.iXiX011;
        } else if (f <= 29.9f) {
            this.XO0X10iO = (this.X11I + (((f - 24.9f) / 5.0f) * this.iiiO)) / this.iXiX011;
        } else if (f <= 34.9f) {
            this.XO0X10iO = (this.X100O + (((f - 29.9f) / 5.000002f) * this.iiiO)) / this.iXiX011;
        } else {
            int i = this.iXiX011;
            this.XO0X10iO = (i - (this.Ii1iii0 / 2)) / i;
        }
    }

    public final float XIi00iiXO(int i) {
        return SizeUtils.dp2px(i);
    }

    public final float XO0O10(int i) {
        return SizeUtils.sp2px(i);
    }

    @Override // skin.support.widget.SkinCompatView, com.android.mltcode.paycertificationapi.ik4
    public void applySkin() {
        super.applySkin();
        Context context = getContext();
        Intrinsics.O10IXXX0X(context, "getContext(...)");
        hl4.OXO1(context, this.X11iII1O1, this.XX1Oi);
        Context context2 = getContext();
        Intrinsics.O10IXXX0X(context2, "getContext(...)");
        hl4.OXO1(context2, this.X0i1O, this.XX1Oi);
        invalidate();
    }

    @Override // android.view.View
    @SuppressLint({"DrawAllocation"})
    public void onDraw(@aa1 Canvas canvas) {
        Intrinsics.X0O(canvas, "canvas");
        super.onDraw(canvas);
        canvas.save();
        if (this.i11I.size() > 1) {
            float f = 20;
            canvas.drawText(this.i11I.get(0), this.iiiO - f, this.XXX11i, this.X11iII1O1);
            canvas.drawText(this.i11I.get(1), this.X11I - f, this.XXX11i, this.X11iII1O1);
            canvas.drawText(this.i11I.get(2), this.X100O - f, this.XXX11i, this.X11iII1O1);
            float f2 = this.X00Xi1X;
            RectF rectF = new RectF(0.0f, f2, this.iiiO, this.XXiIiX10 + f2);
            float fCenterY = rectF.centerY() + this.IXOIIIO;
            String string = getContext().getResources().getString(R.string.thin);
            Intrinsics.O10IXXX0X(string, "getString(...)");
            canvas.drawText(string, rectF.centerX(), fCenterY, this.X0i1O);
            float f3 = this.iiiO;
            float f4 = this.X00Xi1X;
            RectF rectF2 = new RectF(f3, f4, this.X11I, this.XXiIiX10 + f4);
            float fCenterY2 = rectF2.centerY() + this.IXOIIIO;
            String string2 = getContext().getResources().getString(R.string.normal);
            Intrinsics.O10IXXX0X(string2, "getString(...)");
            canvas.drawText(string2, rectF2.centerX(), fCenterY2, this.X0i1O);
            float f5 = this.X11I;
            float f6 = this.X00Xi1X;
            RectF rectF3 = new RectF(f5, f6, this.X100O, this.XXiIiX10 + f6);
            float fCenterY3 = rectF3.centerY() + this.IXOIIIO;
            String string3 = getContext().getResources().getString(R.string.too_heavy);
            Intrinsics.O10IXXX0X(string3, "getString(...)");
            canvas.drawText(string3, rectF3.centerX(), fCenterY3, this.X0i1O);
            float f7 = this.X100O;
            float f8 = this.X00Xi1X;
            RectF rectF4 = new RectF(f7, f8, this.iXiX011, this.XXiIiX10 + f8);
            float fCenterY4 = rectF4.centerY() + this.IXOIIIO;
            String string4 = getContext().getResources().getString(R.string.class_1_obesity);
            Intrinsics.O10IXXX0X(string4, "getString(...)");
            canvas.drawText(string4, rectF4.centerX(), fCenterY4, this.X0i1O);
        }
        this.iX1O1.setColor(this.XOX0O0);
        canvas.drawRect(0.0f, this.O001I, this.iiiO, this.iXiiiO, this.iX1O1);
        this.iX1O1.setColor(this.iOiXi11II);
        canvas.drawRect(this.iiiO, this.O001I, this.X11I, this.iXiiiO, this.iX1O1);
        this.iX1O1.setColor(this.X00XIX1);
        canvas.drawRect(this.X11I, this.O001I, this.X100O, this.iXiiiO, this.iX1O1);
        this.iX1O1.setColor(this.i0X000X0O);
        canvas.drawRect(this.X100O, this.O001I, this.iXiX011, this.iXiiiO, this.iX1O1);
        this.iIXi1iiXI.setColor(this.f54958OO);
        float f9 = this.iXiX011 * this.XO0X10iO;
        float f10 = this.O001I;
        float f11 = 2;
        canvas.drawCircle(f9, f10 + ((this.iXiiiO - f10) / f11), this.Ii1iii0 / f11, this.iIXi1iiXI);
        this.iIXi1iiXI.setColor(this.OX110i);
        float f12 = this.iXiX011 * this.XO0X10iO;
        float f13 = this.O001I;
        canvas.drawCircle(f12, f13 + ((this.iXiiiO - f13) / f11), (this.Ii1iii0 / f11) - f11, this.iIXi1iiXI);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        this.iXiX011 = size;
        float f = size * 0.25f;
        this.iiiO = f;
        this.X11I = 2 * f;
        this.X100O = f * 3;
        OXO1();
    }

    public final void setBmi(float f) {
        this.Ii0X0X = f;
        this.i11I.clear();
        this.i11I.add("18.4");
        this.i11I.add("24.9");
        this.i11I.add("29.9");
        OXO1();
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BmiProgressBar(@aa1 Context context, @tb1 AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.X0O(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public BmiProgressBar(@aa1 Context context, @tb1 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.X0O(context, "context");
        this.f54957I1 = true;
        Paint paint = new Paint();
        this.iX1O1 = paint;
        Paint paint2 = new Paint();
        this.X11iII1O1 = paint2;
        float fXO0O10 = XO0O10(10);
        this.XXX11i = fXO0O10;
        this.X1IX = XIi00iiXO(6);
        Paint paint3 = new Paint();
        this.X0i1O = paint3;
        Paint paint4 = new Paint();
        this.iIXi1iiXI = paint4;
        this.O001I = XIi00iiXO(12) + this.X1IX;
        float fXIi00iiXO = XIi00iiXO(2);
        this.XXO = fXIi00iiXO;
        this.iXiiiO = this.O001I + fXIi00iiXO;
        this.Ii1iii0 = XIi00iiXO(4) + this.XXO;
        this.i11I = new ArrayList();
        float fXO0O11 = XO0O10(11);
        this.XXiIiX10 = fXO0O11;
        this.X00Xi1X = this.iXiiiO + XIi00iiXO(12);
        m38874iO(context, attributeSet);
        paint.setAntiAlias(this.f54957I1);
        paint2.setAntiAlias(this.f54957I1);
        iiOI111I iioi111i = iiOI111I.OXO1;
        paint2.setTypeface(iioi111i.OXO1(MyTypeface.DIN_COND_BOLD, context));
        paint2.setColor(this.XX1Oi);
        paint2.setTextSize(fXO0O10);
        paint3.setAntiAlias(this.f54957I1);
        paint3.setTypeface(iioi111i.OXO1(MyTypeface.PF_MEDIUM, context));
        paint3.setColor(this.XX1Oi);
        paint3.setTextSize(fXO0O11);
        paint3.setTextAlign(Paint.Align.CENTER);
        Paint.FontMetrics fontMetrics = paint3.getFontMetrics();
        Intrinsics.O10IXXX0X(fontMetrics, "getFontMetrics(...)");
        this.f54959X1 = fontMetrics;
        float f = fontMetrics.bottom;
        this.IXOIIIO = ((f - fontMetrics.top) / 2) - f;
        paint4.setAntiAlias(this.f54957I1);
        applySkin();
    }

    public /* synthetic */ BmiProgressBar(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
