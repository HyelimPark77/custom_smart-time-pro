package com.sma.smartv3.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.iiOI111I;
import com.android.mltcode.paycertificationapi.tb1;
import com.blankj.utilcode.util.SizeUtils;
import com.sma.smartv3.R;
import com.sma.smartv3.view.text.MyTypeface;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class DfuProgress extends View {
    public float I1;
    public float IO;
    public float O001I;
    public final float X0i1O;

    @aa1
    public final RectF X11iII1O1;
    public int X1IX;
    public int XXX11i;
    public final float iIXi1iiXI;

    @aa1
    public final Paint iX1O1;
    public boolean iXiX011;

    @JvmOverloads
    public DfuProgress(@aa1 Context r8) {
        Intrinsics.X0O(r8, "context");
        AttributeSet r3 = null;
        int r4 = 0;
        this(r8, r3, r4, 6, null);
    }

    public final void OXO1(Context r2, AttributeSet r3) {
        TypedArray r4 = r2.obtainStyledAttributes(r3, R.styleable.DfuProgress);
        Intrinsics.O10IXXX0X(r4, "obtainStyledAttributes(...)");
        this.iXiX011 = r4.getBoolean(2, this.iXiX011);
        if (r4.hasValue(1) == false) goto L6;
        this.X1IX = r4.getColor(1, this.X1IX);
    L6:
        if (r4.hasValue(0) == false) goto L9;
        this.XXX11i = r4.getColor(0, this.XXX11i);
        return;
    }

    @Override // android.view.View
    public void onDraw(@aa1 Canvas r14) {
        Intrinsics.X0O(r14, "canvas");
        Paint r0 = this.iX1O1;
        r0.setStyle(Paint.Style.STROKE);
        r0.setStrokeWidth(this.X0i1O);
        r0.setColor(this.XXX11i);
        float r1 = this.I1;
        float r2 = 2;
        r14.drawCircle(r1, r1, r1 - (this.X0i1O / r2), this.iX1O1);
        r14.save();
        float r3 = this.I1;
        r14.rotate(-90.0f, r3, r3);
        this.iX1O1.setColor(this.X1IX);
        RectF r4 = this.X11iII1O1;
        float r5 = this.X0i1O;
        float r6 = this.IO;
        r4.set(r5 / r2, r5 / r2, r6 - (r5 / r2), r6 - (r5 / r2));
        r14.drawArc(this.X11iII1O1, 0.0f, this.O001I * 360, false, this.iX1O1);
        r14.restore();
        if (this.iXiX011 == false) goto L5;
        this.iX1O1.setStrokeWidth(this.iIXi1iiXI);
        float r15 = this.I1;
        r14.drawCircle(r15, r15, r15 - (this.X0i1O * 2.0f), this.iX1O1);
    L5:
        this.iX1O1.setStyle(Paint.Style.FILL);
        String r16 = ((int) (this.O001I * 100)) + "%";
        float r7 = this.I1;
        r14.drawText(r16, r7, (this.iX1O1.getTextSize() / r2) + r7, this.iX1O1);
    }

    @Override // android.view.View
    public void onSizeChanged(int r1, int r2, int r3, int r4) {
        super.onSizeChanged(r1, r2, r3, r4);
        float r5 = r1;
        this.IO = r5;
        float r6 = r5 / 2;
        this.I1 = r6;
        this.iX1O1.setTextSize(r6 / 4);
    }

    public final void setProgress(float r1) {
        this.O001I = r1;
        invalidate();
    }

    @JvmOverloads
    public DfuProgress(@aa1 Context r8, @tb1 AttributeSet r9) {
        Intrinsics.X0O(r8, "context");
        int r4 = 0;
        this(r8, r9, r4, 4, null);
    }

    @JvmOverloads
    public DfuProgress(@aa1 Context r2, @tb1 AttributeSet r3, int r4) {
        Intrinsics.X0O(r2, "context");
        super(r2, r3, r4);
        Paint r5 = new Paint();
        this.iX1O1 = r5;
        this.X11iII1O1 = new RectF();
        this.XXX11i = ContextCompat.getColor(r2, com.sma.smartv3.pro.R.color.line_color);
        this.X1IX = ContextCompat.getColor(r2, com.sma.smartv3.pro.R.color.colorAccent);
        this.X0i1O = SizeUtils.dp2px(12.0f);
        this.iIXi1iiXI = SizeUtils.dp2px(1.0f);
        this.iXiX011 = true;
        OXO1(r2, r3);
        r5.setAntiAlias(true);
        r5.setDither(true);
        r5.setTypeface(iiOI111I.OXO1.OXO1(MyTypeface.PF_MEDIUM, r2));
        r5.setTextAlign(Paint.Align.CENTER);
        r5.setStrokeCap(Paint.Cap.ROUND);
    }

    public /* synthetic */ DfuProgress(Context r1, AttributeSet r2, int r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = null;
    L6:
        if ((r4 & 4) == 0) goto L8;
        r3 = 0;
    L8:
        this(r1, r2, r3);
    }
}
