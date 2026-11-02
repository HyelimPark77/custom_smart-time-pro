package com.sma.smartv3.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.android.mltcode.paycertificationapi.aa1;
import com.blankj.utilcode.util.SizeUtils;
import com.sma.smartv3.R;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class PaceProgressBarV2 extends View {
    public int I1;
    public int IO;
    public int Ii1iii0;
    public float O001I;

    @aa1
    public String X0i1O;
    public final float X11I;

    @aa1
    public final Paint X11iII1O1;

    @aa1
    public final Paint X1IX;
    public float XXO;

    @aa1
    public final Paint XXX11i;
    public int iIXi1iiXI;
    public boolean iX1O1;
    public float iXiX011;
    public int iXiiiO;
    public int iiiO;

    @JvmOverloads
    public PaceProgressBarV2(@aa1 Context r8, @aa1 AttributeSet r9) {
        Intrinsics.X0O(r8, "context");
        Intrinsics.X0O(r9, "attrs");
        int r4 = 0;
        this(r8, r9, r4, 4, null);
    }

    public final float OXO1(int r1) {
        return SizeUtils.dp2px(r1);
    }

    public final void XIi00iiXO(Context r2, AttributeSet r3) {
        TypedArray r4 = r2.obtainStyledAttributes(r3, R.styleable.PaceProgressBar);
        Intrinsics.O10IXXX0X(r4, "obtainStyledAttributes(...)");
        this.iX1O1 = r4.getBoolean(0, true);
        this.iXiiiO = r4.getColor(1, -1);
        this.iiiO = r4.getColor(3, -256);
        this.Ii1iii0 = r4.getColor(2, -256);
        r4.recycle();
    }

    public final void iO(float r6, @aa1 String r7, int r8) {
        Intrinsics.X0O(r7, "str");
        if (r6 >= 0.0f) goto L6;
        r6 = 0.0f;
    L16:
        this.O001I = r6;
        this.XXO = 0.0f;
        this.X0i1O = r7;
        this.iIXi1iiXI = r8;
        invalidate();
        return;
    L6:
        if (0.0f >= r6) goto L11;
        if (r6 >= 0.25d) goto L11;
        r6 = 0.25f;
    L11:
        if (r6 <= 1.0f) goto L14;
        r6 = 1.0f;
        goto L16
    L14:
        if (r6 <= 0.9d) goto L16;
        r6 = (r6 / 10) + 0.9f;
        goto L16
    }

    @Override // android.view.View
    public void onDraw(@aa1 Canvas r8) {
        Intrinsics.X0O(r8, "canvas");
        super.onDraw(r8);
        r8.save();
        if (this.iXiX011 != 0.0f) goto L5;
        this.iXiX011 = this.I1 / 2.0f;
    L5:
        float r1 = this.iXiX011;
        r8.drawCircle(r1, r1, r1, this.X11iII1O1);
        float r2 = this.iXiX011;
        r8.drawRect(r2, 0.0f, this.IO - r2, this.I1, this.X11iII1O1);
        float r3 = this.IO;
        float r4 = this.iXiX011;
        r8.drawCircle(r3 - r4, r4, r4, this.X11iII1O1);
        if (this.XXO != 0.0f) goto L9;
        this.XXO = this.O001I * this.IO;
    L9:
        if (this.X0i1O.length() > 0) goto L11;
    L17:
        r8.restore();
        return;
    L11:
        if (this.iIXi1iiXI != 0) goto L13;
        this.XXX11i.setColor(this.iiiO);
    L16:
        float r5 = this.iXiX011;
        r8.drawCircle(r5, r5, r5, this.XXX11i);
        float r6 = this.iXiX011;
        r8.drawRect(r6, 0.0f, this.XXO - r6, this.I1, this.XXX11i);
        float r7 = this.XXO;
        float r9 = this.iXiX011;
        r8.drawCircle(r7 - r9, r9, r9, this.XXX11i);
        String r10 = this.X0i1O;
        r8.drawText(r10, (this.XXO - this.iXiX011) - this.X1IX.measureText(r10), this.I1 - OXO1(4), this.X1IX);
        goto L17
    L13:
        int r11 = this.XXX11i.getColor();
        int r12 = this.Ii1iii0;
        if (r11 == r12) goto L16;
        this.XXX11i.setColor(r12);
        goto L16
    }

    @Override // android.view.View
    public void onMeasure(int r1, int r2) {
        super.onMeasure(r1, r2);
        this.IO = View.MeasureSpec.getSize(r1);
        int r3 = View.MeasureSpec.getSize(r2);
        this.I1 = r3;
        this.iXiX011 = r3 / 2.0f;
    }

    @JvmOverloads
    public PaceProgressBarV2(@aa1 Context r4, @aa1 AttributeSet r5, int r6) {
        Intrinsics.X0O(r4, "context");
        Intrinsics.X0O(r5, "attrs");
        super(r4, r5, r6);
        this.iX1O1 = true;
        Paint r7 = new Paint();
        this.X11iII1O1 = r7;
        Paint r0 = new Paint();
        this.XXX11i = r0;
        Paint r1 = new Paint();
        this.X1IX = r1;
        this.X0i1O = "";
        float r2 = OXO1(12);
        this.X11I = r2;
        XIi00iiXO(r4, r5);
        r7.setAntiAlias(this.iX1O1);
        r7.setColor(this.iXiiiO);
        r0.setAntiAlias(this.iX1O1);
        r0.setColor(this.Ii1iii0);
        r1.setAntiAlias(this.iX1O1);
        r1.setColor(-1);
        r1.setTextSize(r2);
    }

    public /* synthetic */ PaceProgressBarV2(Context r1, AttributeSet r2, int r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 4) == 0) goto L5;
        r3 = 0;
    L5:
        this(r1, r2, r3);
    }
}
