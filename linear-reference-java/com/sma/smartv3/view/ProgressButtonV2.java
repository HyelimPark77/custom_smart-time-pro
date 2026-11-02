package com.sma.smartv3.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.util.AttributeSet;
import android.view.View;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
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
public final class ProgressButtonV2 extends View {
    public int I1;
    public int IO;
    public int Ii1iii0;

    @aa1
    public final Paint O001I;

    @aa1
    public final Xfermode X0i1O;

    @aa1
    public String X100O;
    public float X11I;

    @aa1
    public final RectF X11iII1O1;
    public int X1IX;
    public int XX1Oi;
    public int XXO;
    public int XXX11i;
    public final float iIXi1iiXI;

    @aa1
    public final Paint iX1O1;

    @aa1
    public final Paint iXiX011;
    public int iXiiiO;

    @aa1
    public String iiiO;

    @JvmOverloads
    public ProgressButtonV2(@aa1 Context r8) {
        Intrinsics.X0O(r8, "context");
        AttributeSet r3 = null;
        int r4 = 0;
        this(r8, r3, r4, 6, null);
    }

    public static /* synthetic */ void IiI10X(ProgressButtonV2 r1, int r2, boolean r3, int r4, boolean r5, int r6, String r7, int r8, Object r9) {
        if ((r8 & 2) == 0) goto L6;
        r3 = false;
    L6:
        if ((r8 & 4) == 0) goto L9;
        r4 = 0;
    L9:
        if ((r8 & 8) == 0) goto L12;
        r5 = true;
    L12:
        if ((r8 & 16) == 0) goto L15;
        r6 = 0;
    L15:
        if ((r8 & 32) == 0) goto L17;
        r7 = "";
    L17:
        r1.XO0O10(r2, r3, r4, r5, r6, r7);
    }

    public static /* synthetic */ void XIi00iiXO(ProgressButtonV2 r0, int r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = R.drawable.limited_time_icon;
    L5:
        r0.setDrawablesLift(r1);
    }

    public static /* synthetic */ void XOO0ii0(ProgressButtonV2 r1, String r2, boolean r3, int r4, boolean r5, int r6, String r7, int r8, Object r9) {
        if ((r8 & 2) == 0) goto L6;
        r3 = false;
    L6:
        if ((r8 & 4) == 0) goto L9;
        r4 = 0;
    L9:
        if ((r8 & 8) == 0) goto L12;
        r5 = true;
    L12:
        if ((r8 & 16) == 0) goto L15;
        r6 = 0;
    L15:
        if ((r8 & 32) == 0) goto L17;
        r7 = "";
    L17:
        r1.O00(r2, r3, r4, r5, r6, r7);
    }

    public final void O00(@aa1 String r2, boolean r3, int r4, boolean r5, int r6, @aa1 String r7) {
        Intrinsics.X0O(r2, "text");
        Intrinsics.X0O(r7, "originalPrice");
        if (r5 == false) goto L5;
        this.XX1Oi = 0;
    L5:
        if (r3 == false) goto L7;
        this.iXiX011.setColor(this.iXiiiO);
        this.X11I = 1.0f;
    L15:
        this.iiiO = r2;
        this.X100O = r7;
        invalidate();
        return;
    L7:
        this.X11I = 0.0f;
        Paint r8 = this.iXiX011;
        if (r6 == 0) goto L11;
        int r9 = gk4.iO(getContext(), r6);
    L14:
        r8.setColor(r9);
        goto L15
    L11:
        if (r4 != 1) goto L13;
        r9 = this.Ii1iii0;
        goto L14
    L13:
        r9 = this.XXO;
        goto L14
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
        this.XXO = r4.getColor(3, this.XXO);
    L12:
        if (r4.hasValue(2) == false) goto L15;
        this.iXiiiO = r4.getColor(2, this.iXiiiO);
        return;
    }

    public final void XO0O10(int r2, boolean r3, int r4, boolean r5, int r6, @aa1 String r7) {
        Intrinsics.X0O(r7, "originalPrice");
        if (r5 == false) goto L5;
        this.XX1Oi = 0;
    L5:
        if (r3 == false) goto L7;
        this.iXiX011.setColor(this.iXiiiO);
        this.X11I = 1.0f;
    L15:
        String r8 = getContext().getString(r2);
        Intrinsics.O10IXXX0X(r8, "getString(...)");
        this.iiiO = r8;
        this.X100O = r7;
        invalidate();
        return;
    L7:
        this.X11I = 0.0f;
        Paint r9 = this.iXiX011;
        if (r6 == 0) goto L11;
        int r10 = gk4.iO(getContext(), r6);
    L14:
        r9.setColor(r10);
        goto L15
    L11:
        if (r4 != 1) goto L13;
        r10 = this.Ii1iii0;
        goto L14
    L13:
        r10 = this.XXO;
        goto L14
    }

    public final int getMDrawablesLiftId() {
        return this.XX1Oi;
    }

    @aa1
    public final String getMOriginalPrice() {
        return this.X100O;
    }

    public final void iO(@aa1 String r2, float r3) {
        Intrinsics.X0O(r2, "text");
        this.X11I = r3;
        this.iiiO = r2;
        this.iXiX011.setColor(this.iXiiiO);
        invalidate();
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
        this.X11iII1O1.set(0.0f, 0.0f, this.IO * this.X11I, this.I1);
        r7.drawRect(this.X11iII1O1, this.iX1O1);
        r7.restoreToCount(r0);
        if (this.XX1Oi == 0) goto L8;
        Bitmap r8 = BitmapFactory.decodeResource(getResources(), this.XX1Oi);
        r7.drawBitmap(r8, (this.IO / 2) - ((this.iXiX011.measureText(this.iiiO) + r8.getWidth()) / 2.0f), (this.I1 / 2.0f) - (r8.getHeight() / 2), this.iXiX011);
        r7.drawText(this.iiiO, (this.IO / 2.0f) + (r8.getWidth() / 2.0f), (this.I1 / 2.0f) + (this.iXiX011.getTextSize() / 2.5f), this.iXiX011);
        if (this.X100O.length() <= 0) goto L10;
        r7.drawText(this.X100O, this.IO - (this.O001I.measureText(this.X100O) * 0.8f), ((this.I1 / 2.0f) + (this.iXiX011.getTextSize() / 2.5f)) + (this.O001I.getTextSize() / 3.5f), this.O001I);
        return;
    L10:
        return;
    L8:
        r7.drawText(this.iiiO, this.IO / 2.0f, (this.I1 / 2.0f) + (this.iXiX011.getTextSize() / 2.5f), this.iXiX011);
    }

    @Override // android.view.View
    public void onSizeChanged(int r1, int r2, int r3, int r4) {
        super.onSizeChanged(r1, r2, r3, r4);
        this.IO = r1;
        this.I1 = r2;
    }

    public final void setDrawablesLift(int r1) {
        this.XX1Oi = r1;
    }

    public final void setMDrawablesLiftId(int r1) {
        this.XX1Oi = r1;
    }

    public final void setMOriginalPrice(@aa1 String r2) {
        Intrinsics.X0O(r2, "<set-?>");
        this.X100O = r2;
    }

    public final void setProgress(float r2) {
        this.X11I = r2;
        StringCompanionObject r0 = StringCompanionObject.OXO1;
        String r3 = String.format("%d%%", Arrays.copyOf(new Object[]{Integer.valueOf((int) (r2 * 100))}, 1));
        Intrinsics.O10IXXX0X(r3, "format(...)");
        this.iiiO = r3;
        this.iXiX011.setColor(this.iXiiiO);
        invalidate();
    }

    public final void setProgressDecimalPlaces(float r2) {
        this.X11I = r2;
        String r3 = String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(r2 * 100)}, 1));
        Intrinsics.O10IXXX0X(r3, "format(...)");
        this.iiiO = r3 + "%";
        this.iXiX011.setColor(this.iXiiiO);
        invalidate();
    }

    @JvmOverloads
    public ProgressButtonV2(@aa1 Context r8, @tb1 AttributeSet r9) {
        Intrinsics.X0O(r8, "context");
        int r4 = 0;
        this(r8, r9, r4, 4, null);
    }

    @JvmOverloads
    public ProgressButtonV2(@aa1 Context r5, @tb1 AttributeSet r6, int r7) {
        Intrinsics.X0O(r5, "context");
        super(r5, r6, r7);
        Paint r8 = new Paint();
        this.iX1O1 = r8;
        this.X11iII1O1 = new RectF();
        this.XXX11i = gk4.iO(r5, R.color.colorAccent);
        this.X1IX = gk4.iO(r5, R.color.progress_v2_button_bg);
        this.X0i1O = new PorterDuffXfermode(PorterDuff.Mode.SRC_IN);
        this.iIXi1iiXI = SizeUtils.dp2px(1.0f);
        Paint r1 = new Paint();
        this.iXiX011 = r1;
        Paint r2 = new Paint();
        this.O001I = r2;
        this.XXO = gk4.iO(r5, R.color.colorAccent);
        this.iXiiiO = gk4.iO(r5, R.color.white);
        this.Ii1iii0 = gk4.iO(r5, R.color.line_color);
        this.iiiO = "";
        this.X100O = "";
        gk4.I0IIOi = isInEditMode();
        OXO1(r5, r6);
        r8.setAntiAlias(true);
        r8.setDither(true);
        r2.setAntiAlias(true);
        r2.setDither(true);
        r2.setTextSize(ConvertUtils.dp2px(8.0f));
        iiOI111I r9 = iiOI111I.OXO1;
        MyTypeface r0 = MyTypeface.PF_MEDIUM;
        r2.setTypeface(r9.OXO1(r0, r5));
        Paint.Align r3 = Paint.Align.CENTER;
        r2.setTextAlign(r3);
        r2.setStrikeThruText(true);
        r1.setAntiAlias(true);
        r1.setDither(true);
        r1.setTextSize(ConvertUtils.dp2px(13.0f));
        r1.setTypeface(r9.OXO1(r0, r5));
        r1.setTextAlign(r3);
    }

    public /* synthetic */ ProgressButtonV2(Context r1, AttributeSet r2, int r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = null;
    L6:
        if ((r4 & 4) == 0) goto L8;
        r3 = 0;
    L8:
        this(r1, r2, r3);
    }
}
