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
import com.sma.smartv3.C15429R;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.MyTypeface;
import java.util.Arrays;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public final class ProgressButtonV2 extends View {

    /* JADX INFO: renamed from: I1 */
    public int f55028I1;

    /* JADX INFO: renamed from: IO */
    public int f55029IO;
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

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ProgressButtonV2(@aa1 Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.X0O(context, "context");
    }

    public static /* synthetic */ void IiI10X(ProgressButtonV2 progressButtonV2, int i, boolean z, int i2, boolean z2, int i3, String str, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z = false;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            z2 = true;
        }
        if ((i4 & 16) != 0) {
            i3 = 0;
        }
        if ((i4 & 32) != 0) {
            str = "";
        }
        progressButtonV2.XO0O10(i, z, i2, z2, i3, str);
    }

    public static /* synthetic */ void XIi00iiXO(ProgressButtonV2 progressButtonV2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = R.drawable.limited_time_icon;
        }
        progressButtonV2.setDrawablesLift(i);
    }

    public static /* synthetic */ void XOO0ii0(ProgressButtonV2 progressButtonV2, String str, boolean z, int i, boolean z2, int i2, String str2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            z = false;
        }
        if ((i3 & 4) != 0) {
            i = 0;
        }
        if ((i3 & 8) != 0) {
            z2 = true;
        }
        if ((i3 & 16) != 0) {
            i2 = 0;
        }
        if ((i3 & 32) != 0) {
            str2 = "";
        }
        progressButtonV2.O00(str, z, i, z2, i2, str2);
    }

    public final void O00(@aa1 String text, boolean z, int i, boolean z2, int i2, @aa1 String originalPrice) {
        int iM1859iO;
        Intrinsics.X0O(text, "text");
        Intrinsics.X0O(originalPrice, "originalPrice");
        if (z2) {
            this.XX1Oi = 0;
        }
        if (z) {
            this.iXiX011.setColor(this.iXiiiO);
            this.X11I = 1.0f;
        } else {
            this.X11I = 0.0f;
            Paint paint = this.iXiX011;
            if (i2 != 0) {
                iM1859iO = gk4.m1859iO(getContext(), i2);
            } else {
                iM1859iO = i == 1 ? this.Ii1iii0 : this.XXO;
            }
            paint.setColor(iM1859iO);
        }
        this.iiiO = text;
        this.X100O = originalPrice;
        invalidate();
    }

    public final void OXO1(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C15429R.styleable.ProgressButton);
        Intrinsics.O10IXXX0X(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            this.XXX11i = typedArrayObtainStyledAttributes.getColor(1, this.XXX11i);
        }
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.X1IX = typedArrayObtainStyledAttributes.getColor(0, this.X1IX);
        }
        if (typedArrayObtainStyledAttributes.hasValue(3)) {
            this.XXO = typedArrayObtainStyledAttributes.getColor(3, this.XXO);
        }
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            this.iXiiiO = typedArrayObtainStyledAttributes.getColor(2, this.iXiiiO);
        }
    }

    public final void XO0O10(int i, boolean z, int i2, boolean z2, int i3, @aa1 String originalPrice) {
        int iM1859iO;
        Intrinsics.X0O(originalPrice, "originalPrice");
        if (z2) {
            this.XX1Oi = 0;
        }
        if (z) {
            this.iXiX011.setColor(this.iXiiiO);
            this.X11I = 1.0f;
        } else {
            this.X11I = 0.0f;
            Paint paint = this.iXiX011;
            if (i3 != 0) {
                iM1859iO = gk4.m1859iO(getContext(), i3);
            } else {
                iM1859iO = i2 == 1 ? this.Ii1iii0 : this.XXO;
            }
            paint.setColor(iM1859iO);
        }
        String string = getContext().getString(i);
        Intrinsics.O10IXXX0X(string, "getString(...)");
        this.iiiO = string;
        this.X100O = originalPrice;
        invalidate();
    }

    public final int getMDrawablesLiftId() {
        return this.XX1Oi;
    }

    @aa1
    public final String getMOriginalPrice() {
        return this.X100O;
    }

    /* JADX INFO: renamed from: iO */
    public final void m38906iO(@aa1 String text, float f) {
        Intrinsics.X0O(text, "text");
        this.X11I = f;
        this.iiiO = text;
        this.iXiX011.setColor(this.iXiiiO);
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(@aa1 Canvas canvas) {
        Intrinsics.X0O(canvas, "canvas");
        int iSaveLayer = canvas.saveLayer(null, null, 31);
        Paint paint = this.iX1O1;
        paint.setXfermode(null);
        paint.setColor(this.X1IX);
        RectF rectF = this.X11iII1O1;
        float f = this.iIXi1iiXI;
        rectF.set(f, f, this.f55029IO - f, this.f55028I1 - f);
        RectF rectF2 = this.X11iII1O1;
        int i = this.f55028I1;
        canvas.drawRoundRect(rectF2, i / 2.0f, i / 2.0f, this.iX1O1);
        Paint paint2 = this.iX1O1;
        paint2.setXfermode(this.X0i1O);
        paint2.setColor(this.XXX11i);
        this.X11iII1O1.set(0.0f, 0.0f, this.f55029IO * this.X11I, this.f55028I1);
        canvas.drawRect(this.X11iII1O1, this.iX1O1);
        canvas.restoreToCount(iSaveLayer);
        if (this.XX1Oi == 0) {
            canvas.drawText(this.iiiO, this.f55029IO / 2.0f, (this.f55028I1 / 2.0f) + (this.iXiX011.getTextSize() / 2.5f), this.iXiX011);
            return;
        }
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(getResources(), this.XX1Oi);
        canvas.drawBitmap(bitmapDecodeResource, (this.f55029IO / 2) - ((this.iXiX011.measureText(this.iiiO) + bitmapDecodeResource.getWidth()) / 2.0f), (this.f55028I1 / 2.0f) - (bitmapDecodeResource.getHeight() / 2), this.iXiX011);
        canvas.drawText(this.iiiO, (this.f55029IO / 2.0f) + (bitmapDecodeResource.getWidth() / 2.0f), (this.f55028I1 / 2.0f) + (this.iXiX011.getTextSize() / 2.5f), this.iXiX011);
        if (this.X100O.length() > 0) {
            canvas.drawText(this.X100O, this.f55029IO - (this.O001I.measureText(this.X100O) * 0.8f), (this.f55028I1 / 2.0f) + (this.iXiX011.getTextSize() / 2.5f) + (this.O001I.getTextSize() / 3.5f), this.O001I);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f55029IO = i;
        this.f55028I1 = i2;
    }

    public final void setDrawablesLift(int i) {
        this.XX1Oi = i;
    }

    public final void setMDrawablesLiftId(int i) {
        this.XX1Oi = i;
    }

    public final void setMOriginalPrice(@aa1 String str) {
        Intrinsics.X0O(str, "<set-?>");
        this.X100O = str;
    }

    public final void setProgress(float f) {
        this.X11I = f;
        StringCompanionObject stringCompanionObject = StringCompanionObject.OXO1;
        String str = String.format("%d%%", Arrays.copyOf(new Object[]{Integer.valueOf((int) (f * 100))}, 1));
        Intrinsics.O10IXXX0X(str, "format(...)");
        this.iiiO = str;
        this.iXiX011.setColor(this.iXiiiO);
        invalidate();
    }

    public final void setProgressDecimalPlaces(float f) {
        this.X11I = f;
        String str = String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(f * 100)}, 1));
        Intrinsics.O10IXXX0X(str, "format(...)");
        this.iiiO = str + "%";
        this.iXiX011.setColor(this.iXiiiO);
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ProgressButtonV2(@aa1 Context context, @tb1 AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.X0O(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ProgressButtonV2(@aa1 Context context, @tb1 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.X0O(context, "context");
        Paint paint = new Paint();
        this.iX1O1 = paint;
        this.X11iII1O1 = new RectF();
        this.XXX11i = gk4.m1859iO(context, R.color.colorAccent);
        this.X1IX = gk4.m1859iO(context, R.color.progress_v2_button_bg);
        this.X0i1O = new PorterDuffXfermode(PorterDuff.Mode.SRC_IN);
        this.iIXi1iiXI = SizeUtils.dp2px(1.0f);
        Paint paint2 = new Paint();
        this.iXiX011 = paint2;
        Paint paint3 = new Paint();
        this.O001I = paint3;
        this.XXO = gk4.m1859iO(context, R.color.colorAccent);
        this.iXiiiO = gk4.m1859iO(context, R.color.white);
        this.Ii1iii0 = gk4.m1859iO(context, R.color.line_color);
        this.iiiO = "";
        this.X100O = "";
        gk4.I0IIOi = isInEditMode();
        OXO1(context, attributeSet);
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint3.setAntiAlias(true);
        paint3.setDither(true);
        paint3.setTextSize(ConvertUtils.dp2px(8.0f));
        iiOI111I iioi111i = iiOI111I.OXO1;
        MyTypeface myTypeface = MyTypeface.PF_MEDIUM;
        paint3.setTypeface(iioi111i.OXO1(myTypeface, context));
        Paint.Align align = Paint.Align.CENTER;
        paint3.setTextAlign(align);
        paint3.setStrikeThruText(true);
        paint2.setAntiAlias(true);
        paint2.setDither(true);
        paint2.setTextSize(ConvertUtils.dp2px(13.0f));
        paint2.setTypeface(iioi111i.OXO1(myTypeface, context));
        paint2.setTextAlign(align);
    }

    public /* synthetic */ ProgressButtonV2(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
