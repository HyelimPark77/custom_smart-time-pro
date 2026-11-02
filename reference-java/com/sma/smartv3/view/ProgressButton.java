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
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.i72;
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
public final class ProgressButton extends View {

    /* JADX INFO: renamed from: I1 */
    public int f55024I1;

    /* JADX INFO: renamed from: IO */
    public int f55025IO;
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

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ProgressButton(@aa1 Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.X0O(context, "context");
    }

    public static /* synthetic */ void IiI10X(ProgressButton progressButton, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        progressButton.XO0O10(str, z);
    }

    public static /* synthetic */ void O00(ProgressButton progressButton, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        progressButton.m38903iO(i, z);
    }

    private final int getBackgroundColor() {
        return i72.OXO1.I00() ? R.color.colorAccent : R.color.view_page_secondary_bg;
    }

    private final int getProgressColor() {
        return i72.OXO1.I00() ? R.color.line_color : R.color.colorAccent;
    }

    private final int getTextColor() {
        return i72.OXO1.I00() ? R.color.white : R.color.line_color;
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
            this.O001I = typedArrayObtainStyledAttributes.getColor(3, this.O001I);
        }
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            this.XXO = typedArrayObtainStyledAttributes.getColor(2, this.XXO);
        }
    }

    public final void XIi00iiXO(@aa1 String text, float f) {
        Intrinsics.X0O(text, "text");
        this.Ii1iii0 = f;
        this.iXiiiO = text;
        this.iXiX011.setColor(this.XXO);
        invalidate();
    }

    public final void XO0O10(@aa1 String string, boolean z) {
        Intrinsics.X0O(string, "string");
        if (z) {
            this.iXiX011.setColor(this.XXO);
            this.Ii1iii0 = 1.0f;
        } else {
            this.Ii1iii0 = 0.0f;
            if (i72.OXO1.I00()) {
                this.iXiX011.setColor(this.XXO);
            } else {
                this.iXiX011.setColor(this.O001I);
            }
        }
        this.iXiiiO = string;
        invalidate();
    }

    /* JADX INFO: renamed from: iO */
    public final void m38903iO(int i, boolean z) {
        if (z) {
            this.iXiX011.setColor(this.XXO);
            this.Ii1iii0 = 1.0f;
        } else {
            this.Ii1iii0 = 0.0f;
            if (i72.OXO1.I00()) {
                this.iXiX011.setColor(this.XXO);
            } else {
                this.iXiX011.setColor(this.O001I);
            }
        }
        String string = getContext().getString(i);
        Intrinsics.O10IXXX0X(string, "getString(...)");
        this.iXiiiO = string;
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
        rectF.set(f, f, this.f55025IO - f, this.f55024I1 - f);
        RectF rectF2 = this.X11iII1O1;
        int i = this.f55024I1;
        canvas.drawRoundRect(rectF2, i / 2.0f, i / 2.0f, this.iX1O1);
        Paint paint2 = this.iX1O1;
        paint2.setXfermode(this.X0i1O);
        paint2.setColor(this.XXX11i);
        this.X11iII1O1.set(0.0f, 0.0f, this.f55025IO * this.Ii1iii0, this.f55024I1);
        canvas.drawRect(this.X11iII1O1, this.iX1O1);
        canvas.restoreToCount(iSaveLayer);
        canvas.drawText(this.iXiiiO, this.f55025IO / 2.0f, (this.f55024I1 / 2.0f) + (this.iXiX011.getTextSize() / 2.5f), this.iXiX011);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f55025IO = i;
        this.f55024I1 = i2;
    }

    public final void setProgress(float f) {
        this.Ii1iii0 = f;
        StringCompanionObject stringCompanionObject = StringCompanionObject.OXO1;
        String str = String.format("%d%%", Arrays.copyOf(new Object[]{Integer.valueOf((int) (f * 100))}, 1));
        Intrinsics.O10IXXX0X(str, "format(...)");
        this.iXiiiO = str;
        this.iXiX011.setColor(this.XXO);
        invalidate();
    }

    public final void setProgressDecimalPlaces(float f) {
        this.Ii1iii0 = f;
        String str = String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(f * 100)}, 1));
        Intrinsics.O10IXXX0X(str, "format(...)");
        this.iXiiiO = str + "%";
        this.iXiX011.setColor(this.XXO);
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ProgressButton(@aa1 Context context, @tb1 AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.X0O(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ProgressButton(@aa1 Context context, @tb1 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.X0O(context, "context");
        Paint paint = new Paint();
        this.iX1O1 = paint;
        this.X11iII1O1 = new RectF();
        this.XXX11i = gk4.m1859iO(context, getProgressColor());
        this.X1IX = gk4.m1859iO(context, getBackgroundColor());
        this.X0i1O = new PorterDuffXfermode(PorterDuff.Mode.SRC_IN);
        this.iIXi1iiXI = SizeUtils.dp2px(1.0f);
        Paint paint2 = new Paint();
        this.iXiX011 = paint2;
        this.O001I = gk4.m1859iO(context, getProgressColor());
        this.XXO = gk4.m1859iO(context, getTextColor());
        this.iXiiiO = "";
        gk4.I0IIOi = isInEditMode();
        OXO1(context, attributeSet);
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint2.setAntiAlias(true);
        paint2.setDither(true);
        paint2.setTextSize(ConvertUtils.dp2px(13.0f));
        paint2.setTypeface(iiOI111I.OXO1.OXO1(MyTypeface.PF_MEDIUM, context));
        paint2.setTextAlign(Paint.Align.CENTER);
    }

    public /* synthetic */ ProgressButton(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
