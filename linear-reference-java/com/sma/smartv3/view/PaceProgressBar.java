package com.sma.smartv3.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.android.mltcode.paycertificationapi.aa1;
import com.sma.smartv3.R;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class PaceProgressBar extends View {
    public int I1;
    public int IO;
    public int O001I;
    public float X0i1O;

    @aa1
    public final Paint X11iII1O1;
    public float X1IX;

    @aa1
    public final Paint XXX11i;
    public float iIXi1iiXI;
    public boolean iX1O1;
    public int iXiX011;

    @JvmOverloads
    public PaceProgressBar(@aa1 Context r8, @aa1 AttributeSet r9) {
        Intrinsics.X0O(r8, "context");
        Intrinsics.X0O(r9, "attrs");
        int r4 = 0;
        this(r8, r9, r4, 4, null);
    }

    public final void OXO1(Context r2, AttributeSet r3) {
        TypedArray r4 = r2.obtainStyledAttributes(r3, R.styleable.PaceProgressBar);
        Intrinsics.O10IXXX0X(r4, "obtainStyledAttributes(...)");
        this.iX1O1 = r4.getBoolean(0, true);
        this.iXiX011 = r4.getColor(1, -1);
        this.O001I = r4.getColor(2, -256);
        r4.recycle();
    }

    @Override // android.view.View
    public void onDraw(@aa1 Canvas r15) {
        Intrinsics.X0O(r15, "canvas");
        super.onDraw(r15);
        r15.save();
        r15.drawRect(0.0f, 0.0f, this.IO - this.X1IX, this.I1, this.X11iII1O1);
        float r16 = this.IO;
        float r0 = this.X1IX;
        r15.drawCircle(r16 - r0, r0, r0, this.X11iII1O1);
        if (this.iIXi1iiXI != 0.0f) goto L5;
        this.iIXi1iiXI = this.X0i1O * this.IO;
    L5:
        r15.drawRect(0.0f, 0.0f, this.iIXi1iiXI - this.X1IX, this.I1, this.XXX11i);
        float r17 = this.iIXi1iiXI;
        float r1 = this.X1IX;
        r15.drawCircle(r17 - r1, r1, r1, this.XXX11i);
    }

    @Override // android.view.View
    public void onMeasure(int r1, int r2) {
        super.onMeasure(r1, r2);
        this.IO = View.MeasureSpec.getSize(r1);
        int r3 = View.MeasureSpec.getSize(r2);
        this.I1 = r3;
        this.X1IX = r3 / 2.0f;
    }

    public final void setPB(float r4) {
        if (r4 >= 0.0f) goto L6;
        r4 = 0.0f;
    L8:
        this.X0i1O = r4;
        this.iIXi1iiXI = 0.0f;
        invalidate();
        return;
    L6:
        if (r4 <= 1.0f) goto L8;
        r4 = 1.0f;
        goto L8
    }

    @JvmOverloads
    public PaceProgressBar(@aa1 Context r2, @aa1 AttributeSet r3, int r4) {
        Intrinsics.X0O(r2, "context");
        Intrinsics.X0O(r3, "attrs");
        super(r2, r3, r4);
        this.iX1O1 = true;
        Paint r5 = new Paint();
        this.X11iII1O1 = r5;
        Paint r0 = new Paint();
        this.XXX11i = r0;
        OXO1(r2, r3);
        r5.setAntiAlias(this.iX1O1);
        r5.setColor(this.iXiX011);
        r0.setAntiAlias(this.iX1O1);
        r0.setColor(this.O001I);
    }

    public /* synthetic */ PaceProgressBar(Context r1, AttributeSet r2, int r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 4) == 0) goto L5;
        r3 = 0;
    L5:
        this(r1, r2, r3);
    }
}
