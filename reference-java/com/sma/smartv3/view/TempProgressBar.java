package com.sma.smartv3.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.hl4;
import com.android.mltcode.paycertificationapi.iiOI111I;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tb1;
import com.blankj.utilcode.util.SizeUtils;
import com.sma.smartv3.C15429R;
import com.sma.smartv3.view.text.MyTypeface;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import skin.support.widget.SkinCompatView;

/* JADX INFO: loaded from: classes3.dex */
public final class TempProgressBar extends SkinCompatView {

    /* JADX INFO: renamed from: I1 */
    @aa1
    public final Float[] f55056I1;
    public float Ii1iii0;
    public int O001I;

    /* JADX INFO: renamed from: OO */
    public int f55057OO;
    public int OX110i;
    public int X00XIX1;
    public float X0i1O;
    public float X100O;
    public float X11I;

    @aa1
    public final Paint X11iII1O1;
    public final float X1IX;
    public float XO0X10iO;
    public int XOX0O0;
    public float XX1Oi;
    public float XXO;

    @aa1
    public final Paint XXX11i;
    public int i0X000X0O;

    @aa1
    public List<String> i11I;

    @aa1
    public final Paint iIXi1iiXI;
    public int iOiXi11II;
    public boolean iX1O1;

    @aa1
    public final Paint iXiX011;
    public float iXiiiO;
    public float iiiO;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TempProgressBar(@aa1 Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.X0O(context, "context");
    }

    private final float OXO1(int i) {
        return SizeUtils.dp2px(i);
    }

    private final void XIi00iiXO(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C15429R.styleable.TempProgressBar);
        Intrinsics.O10IXXX0X(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.iX1O1 = typedArrayObtainStyledAttributes.getBoolean(0, true);
        this.OX110i = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.f55057OO = typedArrayObtainStyledAttributes.getColor(1, -1);
        this.XOX0O0 = typedArrayObtainStyledAttributes.getColor(3, -1);
        this.iOiXi11II = typedArrayObtainStyledAttributes.getColor(2, -1);
        this.X00XIX1 = typedArrayObtainStyledAttributes.getColor(6, -1);
        this.i0X000X0O = typedArrayObtainStyledAttributes.getColor(4, -1);
        typedArrayObtainStyledAttributes.recycle();
    }

    private final float XO0O10(int i) {
        return SizeUtils.sp2px(i);
    }

    @Override // skin.support.widget.SkinCompatView, com.android.mltcode.paycertificationapi.ik4
    public void applySkin() {
        super.applySkin();
        Context context = getContext();
        Intrinsics.O10IXXX0X(context, "getContext(...)");
        hl4.OXO1(context, this.XXX11i, this.OX110i);
        invalidate();
    }

    /* JADX INFO: renamed from: iO */
    public final void m38915iO(int i, boolean z) {
        float fIIiiO = cp5.iIiiO(i, z);
        this.i11I.clear();
        List<String> list = this.i11I;
        Context context = getContext();
        Intrinsics.O10IXXX0X(context, "getContext(...)");
        list.add(cp5.iOOX010X(context, this.f55056I1[1].floatValue(), z));
        List<String> list2 = this.i11I;
        Context context2 = getContext();
        Intrinsics.O10IXXX0X(context2, "getContext(...)");
        list2.add(cp5.iOOX010X(context2, this.f55056I1[2].floatValue(), z));
        float fI010I = cp5.i010I(this.f55056I1[0].floatValue(), z);
        float fI010I2 = cp5.i010I(this.f55056I1[3].floatValue(), z);
        if (fIIiiO < fI010I) {
            fIIiiO = fI010I;
        }
        if (fIIiiO > fI010I2) {
            fIIiiO = fI010I2;
        }
        this.XO0X10iO = (fIIiiO - fI010I) / (fI010I2 - fI010I);
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(@aa1 Canvas canvas) {
        Intrinsics.X0O(canvas, "canvas");
        super.onDraw(canvas);
        canvas.save();
        if (this.i11I.size() > 1) {
            float f = 20;
            canvas.drawText(this.i11I.get(0), this.X11I - f, this.X1IX, this.XXX11i);
            canvas.drawText(this.i11I.get(1), this.X100O - f, this.X1IX, this.XXX11i);
        }
        this.X11iII1O1.setColor(this.iOiXi11II);
        canvas.drawRect(0.0f, this.XXO, this.X11I, this.Ii1iii0, this.X11iII1O1);
        this.X11iII1O1.setColor(this.X00XIX1);
        canvas.drawRect(this.X11I, this.XXO, this.X100O, this.Ii1iii0, this.X11iII1O1);
        this.X11iII1O1.setColor(this.i0X000X0O);
        canvas.drawRect(this.X100O, this.XXO, this.XX1Oi, this.Ii1iii0, this.X11iII1O1);
        this.iXiX011.setColor(this.XOX0O0);
        float f2 = this.O001I * this.XO0X10iO;
        float f3 = this.iiiO;
        float f4 = 2;
        float f5 = this.XXO;
        canvas.drawCircle(f2 - (f3 / f4), f5 + ((this.Ii1iii0 - f5) / f4), f3 / f4, this.iXiX011);
        this.iXiX011.setColor(this.f55057OO);
        float f6 = this.O001I * this.XO0X10iO;
        float f7 = this.iiiO;
        float f8 = this.XXO;
        canvas.drawCircle(f6 - (f7 / f4), f8 + ((this.Ii1iii0 - f8) / f4), (f7 / f4) - f4, this.iXiX011);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.O001I = View.MeasureSpec.getSize(i);
        float fFloatValue = this.f55056I1[3].floatValue() - this.f55056I1[0].floatValue();
        this.X11I = ((this.f55056I1[1].floatValue() - this.f55056I1[0].floatValue()) / fFloatValue) * this.O001I;
        this.X100O = ((this.f55056I1[2].floatValue() - this.f55056I1[0].floatValue()) / fFloatValue) * this.O001I;
        this.XX1Oi = ((this.f55056I1[3].floatValue() - this.f55056I1[0].floatValue()) / fFloatValue) * this.O001I;
        float f = this.Ii1iii0;
        float f2 = this.iXiiiO;
        this.Ii1iii0 = f + f2;
        this.iiiO += f2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TempProgressBar(@aa1 Context context, @tb1 AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.X0O(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TempProgressBar(@aa1 Context context, @tb1 AttributeSet attributeSet, int i) {
        Float[] fArr;
        super(context, attributeSet, i);
        Intrinsics.X0O(context, "context");
        if (q62.OXO1.XI1OX0IO()) {
            fArr = new Float[]{Float.valueOf(24.0f), Float.valueOf(28.0f), Float.valueOf(34.0f), Float.valueOf(37.0f)};
        } else {
            fArr = new Float[]{Float.valueOf(35.0f), Float.valueOf(36.0f), Float.valueOf(37.4f), Float.valueOf(38.0f)};
        }
        this.f55056I1 = fArr;
        this.iX1O1 = true;
        Paint paint = new Paint();
        this.X11iII1O1 = paint;
        Paint paint2 = new Paint();
        this.XXX11i = paint2;
        float fXO0O10 = XO0O10(10);
        this.X1IX = fXO0O10;
        this.X0i1O = OXO1(6);
        Paint paint3 = new Paint();
        this.iIXi1iiXI = paint3;
        Paint paint4 = new Paint();
        this.iXiX011 = paint4;
        this.XXO = OXO1(12) + this.X0i1O;
        this.iXiiiO = OXO1(1);
        this.Ii1iii0 = this.XXO;
        this.iiiO = OXO1(4);
        this.i11I = new ArrayList();
        XIi00iiXO(context, attributeSet);
        paint.setAntiAlias(this.iX1O1);
        paint2.setAntiAlias(this.iX1O1);
        iiOI111I iioi111i = iiOI111I.OXO1;
        paint2.setTypeface(iioi111i.OXO1(MyTypeface.DIN_COND_BOLD, context));
        paint2.setColor(this.OX110i);
        paint2.setTextSize(fXO0O10);
        paint3.setAntiAlias(this.iX1O1);
        paint3.setTypeface(iioi111i.OXO1(MyTypeface.PF_MEDIUM, context));
        paint3.setTextSize(fXO0O10);
        paint4.setAntiAlias(this.iX1O1);
        applySkin();
    }

    public /* synthetic */ TempProgressBar(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
