package com.sma.smartv3.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b72;
import com.android.mltcode.paycertificationapi.tb1;
import com.blankj.utilcode.util.ConvertUtils;
import com.blankj.utilcode.util.SizeUtils;
import com.sma.smartv3.R;
import java.util.Arrays;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public final class ProgressButton2 extends View {
    public int I1;
    public int IO;
    public float Ii1iii0;
    public int O001I;

    @aa1
    public final Xfermode X0i1O;

    @tb1
    public ValueAnimator X100O;
    public boolean X11I;

    @aa1
    public final RectF X11iII1O1;
    public int X1IX;
    public int XXO;
    public int XXX11i;
    public final float iIXi1iiXI;

    @aa1
    public final Paint iX1O1;

    @aa1
    public final Paint iXiX011;

    @aa1
    public String iXiiiO;
    public float iiiO;

    @JvmOverloads
    public ProgressButton2(@aa1 Context r8) {
        Intrinsics.X0O(r8, "context");
        AttributeSet r3 = null;
        int r4 = 0;
        this(r8, r3, r4, 6, null);
    }

    public static /* synthetic */ void IiI10X(ProgressButton2 r0, int r1, boolean r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = false;
    L5:
        r0.XO0O10(r1, r2);
    }

    public static final void OIi0(ProgressButton2 r1, ValueAnimator r2) {
        Intrinsics.X0O(r2, "it");
        Object r3 = r2.getAnimatedValue();
        Intrinsics.X1ii(r3, "null cannot be cast to non-null type kotlin.Float");
        r1.iiiO = ((Float) r3).floatValue();
        r1.invalidate();
    }

    public static /* synthetic */ void OXO1(ProgressButton2 r0, ValueAnimator r1) {
        OIi0(r0, r1);
    }

    public static /* synthetic */ void XOO0ii0(ProgressButton2 r0, String r1, boolean r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = false;
    L5:
        r0.O00(r1, r2);
    }

    public final void I0IIOi() {
        IO();
        ValueAnimator r0 = ValueAnimator.ofFloat(new float[]{0.0f, 360.0f});
        r0.setDuration(1000);
        r0.setRepeatCount(-1);
        r0.setInterpolator(new LinearInterpolator());
        r0.addUpdateListener(new b72(this));
        r0.start();
        this.X100O = r0;
    }

    public final void IO() {
        ValueAnimator r0 = this.X100O;
        if (r0 == null) goto L5;
        r0.cancel();
    L5:
        this.X100O = null;
    }

    public final void O00(@aa1 String r2, boolean r3) {
        Intrinsics.X0O(r2, TypedValues.Custom.S_STRING);
        if (r3 == false) goto L5;
        this.iXiX011.setColor(this.XXO);
        this.Ii1iii0 = 1.0f;
    L6:
        this.iXiiiO = r2;
        invalidate();
        return;
    L5:
        this.Ii1iii0 = 0.0f;
        this.iXiX011.setColor(this.O001I);
        goto L6
    }

    public final void XIi00iiXO(Context r2, AttributeSet r3) {
        TypedArray r4 = r2.obtainStyledAttributes(r3, R.styleable.ProgressButton);
        Intrinsics.O10IXXX0X(r4, "obtainStyledAttributes(...)");
        if (r4.hasValue(1) == false) goto L6;
        this.XXX11i = r4.getColor(1, this.XXX11i);
    L6:
        if (r4.hasValue(0) == false) goto L9;
        this.X1IX = r4.getColor(0, this.X1IX);
    L9:
        if (r4.hasValue(3) == false) goto L12;
        this.O001I = r4.getColor(3, this.O001I);
    L12:
        if (r4.hasValue(2) == false) goto L15;
        this.XXO = r4.getColor(2, this.XXO);
        return;
    }

    public final void XO0O10(int r2, boolean r3) {
        if (r3 == false) goto L4;
        this.iXiX011.setColor(this.XXO);
        this.Ii1iii0 = 1.0f;
    L5:
        String r4 = getContext().getString(r2);
        Intrinsics.O10IXXX0X(r4, "getString(...)");
        this.iXiiiO = r4;
        invalidate();
        return;
    L4:
        this.Ii1iii0 = 0.0f;
        this.iXiX011.setColor(this.O001I);
        goto L5
    }

    public final void iO(@aa1 String r2, float r3) {
        Intrinsics.X0O(r2, "text");
        this.Ii1iii0 = r3;
        this.iXiiiO = r2;
        this.iXiX011.setColor(this.XXO);
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(@aa1 Canvas r15) {
        Intrinsics.X0O(r15, "canvas");
        int r0 = r15.saveLayer(null, null, 31);
        Paint r2 = this.iX1O1;
        r2.setXfermode(null);
        r2.setColor(this.X1IX);
        RectF r1 = this.X11iII1O1;
        float r3 = this.iIXi1iiXI;
        r1.set(r3, r3, this.IO - r3, this.I1 - r3);
        RectF r4 = this.X11iII1O1;
        int r5 = this.I1;
        r15.drawRoundRect(r4, r5 / 2.0f, r5 / 2.0f, this.iX1O1);
        Paint r6 = this.iX1O1;
        r6.setXfermode(this.X0i1O);
        r6.setColor(this.XXX11i);
        this.X11iII1O1.set(0.0f, 0.0f, this.IO * this.Ii1iii0, this.I1);
        r15.drawRect(this.X11iII1O1, this.iX1O1);
        r15.restoreToCount(r0);
        float r7 = this.I1 / 2.0f;
        float r8 = (this.iXiX011.getTextSize() / 2.5f) + r7;
        if (this.X11I == false) goto L6;
        float r9 = this.iXiX011.getTextSize();
        float r10 = SizeUtils.dp2px(10.0f);
        float r11 = (this.IO - ((r9 + r10) + this.iXiX011.measureText(this.iXiiiO))) / 2.0f;
        Paint r12 = this.iX1O1;
        r12.setColor(this.iXiX011.getColor());
        r12.setStrokeWidth(SizeUtils.dp2px(2.0f));
        r12.setStyle(Paint.Style.STROKE);
        r12.setStrokeCap(Paint.Cap.ROUND);
        float r13 = r9 / 2;
        float r14 = r9 + r11;
        this.X11iII1O1.set(r11, r7 - r13, r14, r7 + r13);
        r15.drawArc(this.X11iII1O1, this.iiiO, 330.0f, false, this.iX1O1);
        this.iX1O1.setStyle(Paint.Style.FILL);
        Paint.Align r16 = this.iXiX011.getTextAlign();
        this.iXiX011.setTextAlign(Paint.Align.LEFT);
        r15.drawText(this.iXiiiO, r14 + r10, r8, this.iXiX011);
        this.iXiX011.setTextAlign(r16);
        return;
    L6:
        r15.drawText(this.iXiiiO, this.IO / 2.0f, r8, this.iXiX011);
    }

    @Override // android.view.View
    public void onSizeChanged(int r1, int r2, int r3, int r4) {
        super.onSizeChanged(r1, r2, r3, r4);
        this.IO = r1;
        this.I1 = r2;
    }

    public final void setProgress(float r2) {
        this.Ii1iii0 = r2;
        StringCompanionObject r0 = StringCompanionObject.OXO1;
        String r3 = String.format("%d%%", Arrays.copyOf(new Object[]{Integer.valueOf((int) (r2 * 100))}, 1));
        Intrinsics.O10IXXX0X(r3, "format(...)");
        this.iXiiiO = r3;
        this.iXiX011.setColor(this.XXO);
        invalidate();
    }

    public final void setProgressDecimalPlaces(float r2) {
        this.Ii1iii0 = r2;
        String r3 = String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(r2 * 100)}, 1));
        Intrinsics.O10IXXX0X(r3, "format(...)");
        this.iXiiiO = r3 + "%";
        this.iXiX011.setColor(this.XXO);
        invalidate();
    }

    public final void setShowProgressBar(boolean r1) {
        this.X11I = r1;
        if (r1 == false) goto L5;
        I0IIOi();
    L6:
        invalidate();
        return;
    L5:
        IO();
        goto L6
    }

    @JvmOverloads
    public ProgressButton2(@aa1 Context r8, @tb1 AttributeSet r9) {
        Intrinsics.X0O(r8, "context");
        int r4 = 0;
        this(r8, r9, r4, 4, null);
    }

    @JvmOverloads
    public ProgressButton2(@aa1 Context r4, @tb1 AttributeSet r5, int r6) {
        Intrinsics.X0O(r4, "context");
        super(r4, r5, r6);
        Paint r7 = new Paint();
        this.iX1O1 = r7;
        this.X11iII1O1 = new RectF();
        this.XXX11i = ContextCompat.getColor(r4, com.sma.smartv3.pro.R.color.colorAccent);
        this.X1IX = ContextCompat.getColor(r4, com.sma.smartv3.pro.R.color.view_page_secondary_bg);
        this.X0i1O = new PorterDuffXfermode(PorterDuff.Mode.SRC_IN);
        this.iIXi1iiXI = SizeUtils.dp2px(0.0f);
        Paint r1 = new Paint();
        this.iXiX011 = r1;
        this.O001I = ContextCompat.getColor(r4, com.sma.smartv3.pro.R.color.colorAccent);
        this.XXO = ContextCompat.getColor(r4, com.sma.smartv3.pro.R.color.line_color);
        this.iXiiiO = "";
        XIi00iiXO(r4, r5);
        r7.setAntiAlias(true);
        r7.setDither(true);
        r1.setAntiAlias(true);
        r1.setDither(true);
        r1.setTextSize(ConvertUtils.dp2px(15.0f));
        r1.setTextAlign(Paint.Align.CENTER);
    }

    public /* synthetic */ ProgressButton2(Context r1, AttributeSet r2, int r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = null;
    L6:
        if ((r4 & 4) == 0) goto L8;
        r3 = 0;
    L8:
        this(r1, r2, r3);
    }
}
