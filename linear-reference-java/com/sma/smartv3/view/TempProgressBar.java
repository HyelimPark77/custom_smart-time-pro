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
import com.sma.smartv3.R;
import com.sma.smartv3.view.text.MyTypeface;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import skin.support.widget.SkinCompatView;

/* JADX INFO: loaded from: classes3.dex */
public final class TempProgressBar extends SkinCompatView {

    @aa1
    public final Float[] I1;
    public float Ii1iii0;
    public int O001I;
    public int OO;
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

    @JvmOverloads
    public TempProgressBar(@aa1 Context r8) {
        Intrinsics.X0O(r8, "context");
        AttributeSet r3 = null;
        int r4 = 0;
        this(r8, r3, r4, 6, null);
    }

    private final float OXO1(int r1) {
        return SizeUtils.dp2px(r1);
    }

    private final void XIi00iiXO(Context r3, AttributeSet r4) {
        TypedArray r5 = r3.obtainStyledAttributes(r4, R.styleable.TempProgressBar);
        Intrinsics.O10IXXX0X(r5, "obtainStyledAttributes(...)");
        this.iX1O1 = r5.getBoolean(0, true);
        this.OX110i = r5.getResourceId(5, 0);
        this.OO = r5.getColor(1, -1);
        this.XOX0O0 = r5.getColor(3, -1);
        this.iOiXi11II = r5.getColor(2, -1);
        this.X00XIX1 = r5.getColor(6, -1);
        this.i0X000X0O = r5.getColor(4, -1);
        r5.recycle();
    }

    private final float XO0O10(int r1) {
        return SizeUtils.sp2px(r1);
    }

    @Override // skin.support.widget.SkinCompatView, com.android.mltcode.paycertificationapi.ik4
    public void applySkin() {
        super.applySkin();
        Context r0 = getContext();
        Intrinsics.O10IXXX0X(r0, "getContext(...)");
        hl4.OXO1(r0, this.XXX11i, this.OX110i);
        invalidate();
    }

    public final void iO(int r6, boolean r7) {
        float r8 = cp5.iIiiO(r6, r7);
        this.i11I.clear();
        List<String> r0 = this.i11I;
        Context r1 = getContext();
        Intrinsics.O10IXXX0X(r1, "getContext(...)");
        r0.add(cp5.iOOX010X(r1, this.I1[1].floatValue(), r7));
        List<String> r2 = this.i11I;
        Context r3 = getContext();
        Intrinsics.O10IXXX0X(r3, "getContext(...)");
        r2.add(cp5.iOOX010X(r3, this.I1[2].floatValue(), r7));
        float r4 = cp5.i010I(this.I1[0].floatValue(), r7);
        float r9 = cp5.i010I(this.I1[3].floatValue(), r7);
        if (r8 >= r4) goto L6;
        r8 = r4;
    L6:
        if (r8 <= r9) goto L8;
        r8 = r9;
    L8:
        this.XO0X10iO = (r8 - r4) / (r9 - r4);
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(@aa1 Canvas r15) {
        Intrinsics.X0O(r15, "canvas");
        super.onDraw(r15);
        r15.save();
        if (this.i11I.size() <= 1) goto L5;
        float r3 = 20;
        r15.drawText(this.i11I.get(0), this.X11I - r3, this.X1IX, this.XXX11i);
        r15.drawText(this.i11I.get(1), this.X100O - r3, this.X1IX, this.XXX11i);
    L5:
        this.X11iII1O1.setColor(this.iOiXi11II);
        r15.drawRect(0.0f, this.XXO, this.X11I, this.Ii1iii0, this.X11iII1O1);
        this.X11iII1O1.setColor(this.X00XIX1);
        r15.drawRect(this.X11I, this.XXO, this.X100O, this.Ii1iii0, this.X11iII1O1);
        this.X11iII1O1.setColor(this.i0X000X0O);
        r15.drawRect(this.X100O, this.XXO, this.XX1Oi, this.Ii1iii0, this.X11iII1O1);
        this.iXiX011.setColor(this.XOX0O0);
        float r16 = this.O001I * this.XO0X10iO;
        float r0 = this.iiiO;
        float r1 = 2;
        float r2 = this.XXO;
        r15.drawCircle(r16 - (r0 / r1), r2 + ((this.Ii1iii0 - r2) / r1), r0 / r1, this.iXiX011);
        this.iXiX011.setColor(this.OO);
        float r17 = this.O001I * this.XO0X10iO;
        float r4 = this.iiiO;
        float r5 = this.XXO;
        r15.drawCircle(r17 - (r4 / r1), r5 + ((this.Ii1iii0 - r5) / r1), (r4 / r1) - r1, this.iXiX011);
    }

    @Override // android.view.View
    public void onMeasure(int r4, int r5) {
        super.onMeasure(r4, r5);
        this.O001I = View.MeasureSpec.getSize(r4);
        float r6 = this.I1[3].floatValue() - this.I1[0].floatValue();
        this.X11I = ((this.I1[1].floatValue() - this.I1[0].floatValue()) / r6) * this.O001I;
        this.X100O = ((this.I1[2].floatValue() - this.I1[0].floatValue()) / r6) * this.O001I;
        this.XX1Oi = ((this.I1[3].floatValue() - this.I1[0].floatValue()) / r6) * this.O001I;
        float r7 = this.Ii1iii0;
        float r8 = this.iXiiiO;
        this.Ii1iii0 = r7 + r8;
        this.iiiO += r8;
    }

    @JvmOverloads
    public TempProgressBar(@aa1 Context r8, @tb1 AttributeSet r9) {
        Intrinsics.X0O(r8, "context");
        int r4 = 0;
        this(r8, r9, r4, 4, null);
    }

    @JvmOverloads
    public TempProgressBar(@aa1 Context r9, @tb1 AttributeSet r10, int r11) {
        Intrinsics.X0O(r9, "context");
        super(r9, r10, r11);
        if (q62.OXO1.XI1OX0IO() == false) goto L5;
        Float[] r12 = {Float.valueOf(24.0f), Float.valueOf(28.0f), Float.valueOf(34.0f), Float.valueOf(37.0f)};
    L6:
        this.I1 = r12;
        this.iX1O1 = true;
        Paint r13 = new Paint();
        this.X11iII1O1 = r13;
        Paint r0 = new Paint();
        this.XXX11i = r0;
        float r1 = XO0O10(10);
        this.X1IX = r1;
        this.X0i1O = OXO1(6);
        Paint r2 = new Paint();
        this.iIXi1iiXI = r2;
        Paint r5 = new Paint();
        this.iXiX011 = r5;
        this.XXO = OXO1(12) + this.X0i1O;
        this.iXiiiO = OXO1(1);
        this.Ii1iii0 = this.XXO;
        this.iiiO = OXO1(4);
        this.i11I = new ArrayList();
        XIi00iiXO(r9, r10);
        r13.setAntiAlias(this.iX1O1);
        r0.setAntiAlias(this.iX1O1);
        iiOI111I r14 = iiOI111I.OXO1;
        r0.setTypeface(r14.OXO1(MyTypeface.DIN_COND_BOLD, r9));
        r0.setColor(this.OX110i);
        r0.setTextSize(r1);
        r2.setAntiAlias(this.iX1O1);
        r2.setTypeface(r14.OXO1(MyTypeface.PF_MEDIUM, r9));
        r2.setTextSize(r1);
        r5.setAntiAlias(this.iX1O1);
        applySkin();
        return;
    L5:
        r12 = new Float[]{Float.valueOf(35.0f), Float.valueOf(36.0f), Float.valueOf(37.4f), Float.valueOf(38.0f)};
        goto L6
    }

    public /* synthetic */ TempProgressBar(Context r1, AttributeSet r2, int r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = null;
    L6:
        if ((r4 & 4) == 0) goto L8;
        r3 = 0;
    L8:
        this(r1, r2, r3);
    }
}
