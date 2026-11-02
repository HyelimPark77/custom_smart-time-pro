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
import androidx.core.content.ContextCompat;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.blankj.utilcode.util.ConvertUtils;
import com.blankj.utilcode.util.SizeUtils;
import com.sma.smartv3.C15429R;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.ProgressButton2;
import java.util.Arrays;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public final class ProgressButton2 extends View {

    /* JADX INFO: renamed from: I1 */
    public int f55026I1;

    /* JADX INFO: renamed from: IO */
    public int f55027IO;
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

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ProgressButton2(@aa1 Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.X0O(context, "context");
    }

    public static /* synthetic */ void IiI10X(ProgressButton2 progressButton2, int i, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        progressButton2.XO0O10(i, z);
    }

    public static final void OIi0(ProgressButton2 progressButton2, ValueAnimator it) {
        Intrinsics.X0O(it, "it");
        Object animatedValue = it.getAnimatedValue();
        Intrinsics.X1ii(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        progressButton2.iiiO = ((Float) animatedValue).floatValue();
        progressButton2.invalidate();
    }

    public static /* synthetic */ void XOO0ii0(ProgressButton2 progressButton2, String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        progressButton2.O00(str, z);
    }

    public final void I0IIOi() {
        m38904IO();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 360.0f);
        valueAnimatorOfFloat.setDuration(1000L);
        valueAnimatorOfFloat.setRepeatCount(-1);
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.android.mltcode.paycertificationapi.b72
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ProgressButton2.OIi0(this.f5681IO, valueAnimator);
            }
        });
        valueAnimatorOfFloat.start();
        this.X100O = valueAnimatorOfFloat;
    }

    /* JADX INFO: renamed from: IO */
    public final void m38904IO() {
        ValueAnimator valueAnimator = this.X100O;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.X100O = null;
    }

    public final void O00(@aa1 String string, boolean z) {
        Intrinsics.X0O(string, "string");
        if (z) {
            this.iXiX011.setColor(this.XXO);
            this.Ii1iii0 = 1.0f;
        } else {
            this.Ii1iii0 = 0.0f;
            this.iXiX011.setColor(this.O001I);
        }
        this.iXiiiO = string;
        invalidate();
    }

    public final void XIi00iiXO(Context context, AttributeSet attributeSet) {
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

    public final void XO0O10(int i, boolean z) {
        if (z) {
            this.iXiX011.setColor(this.XXO);
            this.Ii1iii0 = 1.0f;
        } else {
            this.Ii1iii0 = 0.0f;
            this.iXiX011.setColor(this.O001I);
        }
        String string = getContext().getString(i);
        Intrinsics.O10IXXX0X(string, "getString(...)");
        this.iXiiiO = string;
        invalidate();
    }

    /* JADX INFO: renamed from: iO */
    public final void m38905iO(@aa1 String text, float f) {
        Intrinsics.X0O(text, "text");
        this.Ii1iii0 = f;
        this.iXiiiO = text;
        this.iXiX011.setColor(this.XXO);
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
        rectF.set(f, f, this.f55027IO - f, this.f55026I1 - f);
        RectF rectF2 = this.X11iII1O1;
        int i = this.f55026I1;
        canvas.drawRoundRect(rectF2, i / 2.0f, i / 2.0f, this.iX1O1);
        Paint paint2 = this.iX1O1;
        paint2.setXfermode(this.X0i1O);
        paint2.setColor(this.XXX11i);
        this.X11iII1O1.set(0.0f, 0.0f, this.f55027IO * this.Ii1iii0, this.f55026I1);
        canvas.drawRect(this.X11iII1O1, this.iX1O1);
        canvas.restoreToCount(iSaveLayer);
        float f2 = this.f55026I1 / 2.0f;
        float textSize = (this.iXiX011.getTextSize() / 2.5f) + f2;
        if (!this.X11I) {
            canvas.drawText(this.iXiiiO, this.f55027IO / 2.0f, textSize, this.iXiX011);
            return;
        }
        float textSize2 = this.iXiX011.getTextSize();
        float fDp2px = SizeUtils.dp2px(10.0f);
        float fMeasureText = (this.f55027IO - ((textSize2 + fDp2px) + this.iXiX011.measureText(this.iXiiiO))) / 2.0f;
        Paint paint3 = this.iX1O1;
        paint3.setColor(this.iXiX011.getColor());
        paint3.setStrokeWidth(SizeUtils.dp2px(2.0f));
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeCap(Paint.Cap.ROUND);
        float f3 = textSize2 / 2;
        float f4 = textSize2 + fMeasureText;
        this.X11iII1O1.set(fMeasureText, f2 - f3, f4, f2 + f3);
        canvas.drawArc(this.X11iII1O1, this.iiiO, 330.0f, false, this.iX1O1);
        this.iX1O1.setStyle(Paint.Style.FILL);
        Paint.Align textAlign = this.iXiX011.getTextAlign();
        this.iXiX011.setTextAlign(Paint.Align.LEFT);
        canvas.drawText(this.iXiiiO, f4 + fDp2px, textSize, this.iXiX011);
        this.iXiX011.setTextAlign(textAlign);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f55027IO = i;
        this.f55026I1 = i2;
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

    public final void setShowProgressBar(boolean z) {
        this.X11I = z;
        if (z) {
            I0IIOi();
        } else {
            m38904IO();
        }
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ProgressButton2(@aa1 Context context, @tb1 AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.X0O(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public ProgressButton2(@aa1 Context context, @tb1 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.X0O(context, "context");
        Paint paint = new Paint();
        this.iX1O1 = paint;
        this.X11iII1O1 = new RectF();
        this.XXX11i = ContextCompat.getColor(context, R.color.colorAccent);
        this.X1IX = ContextCompat.getColor(context, R.color.view_page_secondary_bg);
        this.X0i1O = new PorterDuffXfermode(PorterDuff.Mode.SRC_IN);
        this.iIXi1iiXI = SizeUtils.dp2px(0.0f);
        Paint paint2 = new Paint();
        this.iXiX011 = paint2;
        this.O001I = ContextCompat.getColor(context, R.color.colorAccent);
        this.XXO = ContextCompat.getColor(context, R.color.line_color);
        this.iXiiiO = "";
        XIi00iiXO(context, attributeSet);
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint2.setAntiAlias(true);
        paint2.setDither(true);
        paint2.setTextSize(ConvertUtils.dp2px(15.0f));
        paint2.setTextAlign(Paint.Align.CENTER);
    }

    public /* synthetic */ ProgressButton2(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
