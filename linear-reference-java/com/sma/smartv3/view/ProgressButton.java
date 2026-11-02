package com.sma.smartv3.view;

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
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.iiOI111I;
import com.android.mltcode.paycertificationapi.tb1;
import com.blankj.utilcode.util.ConvertUtils;
import com.blankj.utilcode.util.SizeUtils;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.MyTypeface;
import java.util.Arrays;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public final class ProgressButton extends View {
    public int I1;
    public int IO;
    public float Ii1iii0;
    public int O001I;

    @aa1
    public final Xfermode X0i1O;

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

    @JvmOverloads
    public ProgressButton(@aa1 Context r8) {
        Intrinsics.X0O(r8, "context");
        AttributeSet r3 = null;
        int r4 = 0;
        this(r8, r3, r4, 6, null);
    }

    public static /* synthetic */ void IiI10X(ProgressButton r0, String r1, boolean r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = false;
    L5:
        r0.XO0O10(r1, r2);
    }

    public static /* synthetic */ void O00(ProgressButton r0, int r1, boolean r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = false;
    L5:
        r0.iO(r1, r2);
    }

    private final int getBackgroundColor() {
        if (i72.OXO1.I00() == false) goto L6;
        return R.color.colorAccent;
    L6:
        return R.color.view_page_secondary_bg;
    }

    private final int getProgressColor() {
        if (i72.OXO1.I00() == false) goto L6;
        return R.color.line_color;
    L6:
        return R.color.colorAccent;
    }

    private final int getTextColor() {
        if (i72.OXO1.I00() == false) goto L6;
        return R.color.white;
    L6:
        return R.color.line_color;
    }

    public final void OXO1(Context r2, AttributeSet r3) {
        TypedArray r4 = r2.obtainStyledAttributes(r3, com.sma.smartv3.R.styleable.ProgressButton);
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

    public final void XIi00iiXO(@aa1 String r2, float r3) {
        Intrinsics.X0O(r2, "text");
        this.Ii1iii0 = r3;
        this.iXiiiO = r2;
        this.iXiX011.setColor(this.XXO);
        invalidate();
    }

    public final void XO0O10(@aa1 String r2, boolean r3) {
        Intrinsics.X0O(r2, TypedValues.Custom.S_STRING);
        if (r3 == false) goto L5;
        this.iXiX011.setColor(this.XXO);
        this.Ii1iii0 = 1.0f;
    L9:
        this.iXiiiO = r2;
        invalidate();
        return;
    L5:
        this.Ii1iii0 = 0.0f;
        if (i72.OXO1.I00() == false) goto L8;
        this.iXiX011.setColor(this.XXO);
        goto L9
    L8:
        this.iXiX011.setColor(this.O001I);
        goto L9
    }

    public final void iO(int r2, boolean r3) {
        if (r3 == false) goto L4;
        this.iXiX011.setColor(this.XXO);
        this.Ii1iii0 = 1.0f;
    L8:
        String r4 = getContext().getString(r2);
        Intrinsics.O10IXXX0X(r4, "getString(...)");
        this.iXiiiO = r4;
        invalidate();
        return;
    L4:
        this.Ii1iii0 = 0.0f;
        if (i72.OXO1.I00() == false) goto L7;
        this.iXiX011.setColor(this.XXO);
        goto L8
    L7:
        this.iXiX011.setColor(this.O001I);
        goto L8
    }

    @Override // android.view.View
    public void onDraw(@aa1 Canvas r7) {
        Intrinsics.X0O(r7, "canvas");
        int r0 = r7.saveLayer(null, null, 31);
        Paint r2 = this.iX1O1;
        r2.setXfermode(null);
        r2.setColor(this.X1IX);
        RectF r1 = this.X11iII1O1;
        float r3 = this.iIXi1iiXI;
        r1.set(r3, r3, this.IO - r3, this.I1 - r3);
        RectF r4 = this.X11iII1O1;
        int r5 = this.I1;
        r7.drawRoundRect(r4, r5 / 2.0f, r5 / 2.0f, this.iX1O1);
        Paint r6 = this.iX1O1;
        r6.setXfermode(this.X0i1O);
        r6.setColor(this.XXX11i);
        this.X11iII1O1.set(0.0f, 0.0f, this.IO * this.Ii1iii0, this.I1);
        r7.drawRect(this.X11iII1O1, this.iX1O1);
        r7.restoreToCount(r0);
        r7.drawText(this.iXiiiO, this.IO / 2.0f, (this.I1 / 2.0f) + (this.iXiX011.getTextSize() / 2.5f), this.iXiX011);
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

    @JvmOverloads
    public ProgressButton(@aa1 Context r8, @tb1 AttributeSet r9) {
        Intrinsics.X0O(r8, "context");
        int r4 = 0;
        this(r8, r9, r4, 4, null);
    }

    @JvmOverloads
    public ProgressButton(@aa1 Context r3, @tb1 AttributeSet r4, int r5) {
        Intrinsics.X0O(r3, "context");
        super(r3, r4, r5);
        Paint r6 = new Paint();
        this.iX1O1 = r6;
        this.X11iII1O1 = new RectF();
        this.XXX11i = gk4.iO(r3, getProgressColor());
        this.X1IX = gk4.iO(r3, getBackgroundColor());
        this.X0i1O = new PorterDuffXfermode(PorterDuff.Mode.SRC_IN);
        this.iIXi1iiXI = SizeUtils.dp2px(1.0f);
        Paint r0 = new Paint();
        this.iXiX011 = r0;
        this.O001I = gk4.iO(r3, getProgressColor());
        this.XXO = gk4.iO(r3, getTextColor());
        this.iXiiiO = "";
        gk4.I0IIOi = isInEditMode();
        OXO1(r3, r4);
        r6.setAntiAlias(true);
        r6.setDither(true);
        r0.setAntiAlias(true);
        r0.setDither(true);
        r0.setTextSize(ConvertUtils.dp2px(13.0f));
        r0.setTypeface(iiOI111I.OXO1.OXO1(MyTypeface.PF_MEDIUM, r3));
        r0.setTextAlign(Paint.Align.CENTER);
    }

    public /* synthetic */ ProgressButton(Context r1, AttributeSet r2, int r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = null;
    L6:
        if ((r4 & 4) == 0) goto L8;
        r3 = 0;
    L8:
        this(r1, r2, r3);
    }
}
