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
import com.sma.smartv3.C15429R;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.MyTypeface;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class DfuProgress extends View {

    /* JADX INFO: renamed from: I1 */
    public float f54971I1;

    /* JADX INFO: renamed from: IO */
    public float f54972IO;
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

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DfuProgress(@aa1 Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.X0O(context, "context");
    }

    public final void OXO1(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C15429R.styleable.DfuProgress);
        Intrinsics.O10IXXX0X(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.iXiX011 = typedArrayObtainStyledAttributes.getBoolean(2, this.iXiX011);
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            this.X1IX = typedArrayObtainStyledAttributes.getColor(1, this.X1IX);
        }
        if (typedArrayObtainStyledAttributes.hasValue(0)) {
            this.XXX11i = typedArrayObtainStyledAttributes.getColor(0, this.XXX11i);
        }
    }

    @Override // android.view.View
    public void onDraw(@aa1 Canvas canvas) {
        Intrinsics.X0O(canvas, "canvas");
        Paint paint = this.iX1O1;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(this.X0i1O);
        paint.setColor(this.XXX11i);
        float f = this.f54971I1;
        float f2 = 2;
        canvas.drawCircle(f, f, f - (this.X0i1O / f2), this.iX1O1);
        canvas.save();
        float f3 = this.f54971I1;
        canvas.rotate(-90.0f, f3, f3);
        this.iX1O1.setColor(this.X1IX);
        RectF rectF = this.X11iII1O1;
        float f4 = this.X0i1O;
        float f5 = this.f54972IO;
        rectF.set(f4 / f2, f4 / f2, f5 - (f4 / f2), f5 - (f4 / f2));
        canvas.drawArc(this.X11iII1O1, 0.0f, this.O001I * 360, false, this.iX1O1);
        canvas.restore();
        if (this.iXiX011) {
            this.iX1O1.setStrokeWidth(this.iIXi1iiXI);
            float f6 = this.f54971I1;
            canvas.drawCircle(f6, f6, f6 - (this.X0i1O * 2.0f), this.iX1O1);
        }
        this.iX1O1.setStyle(Paint.Style.FILL);
        String str = ((int) (this.O001I * 100)) + "%";
        float f7 = this.f54971I1;
        canvas.drawText(str, f7, (this.iX1O1.getTextSize() / f2) + f7, this.iX1O1);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        float f = i;
        this.f54972IO = f;
        float f2 = f / 2;
        this.f54971I1 = f2;
        this.iX1O1.setTextSize(f2 / 4);
    }

    public final void setProgress(float f) {
        this.O001I = f;
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DfuProgress(@aa1 Context context, @tb1 AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.X0O(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DfuProgress(@aa1 Context context, @tb1 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.X0O(context, "context");
        Paint paint = new Paint();
        this.iX1O1 = paint;
        this.X11iII1O1 = new RectF();
        this.XXX11i = ContextCompat.getColor(context, R.color.line_color);
        this.X1IX = ContextCompat.getColor(context, R.color.colorAccent);
        this.X0i1O = SizeUtils.dp2px(12.0f);
        this.iIXi1iiXI = SizeUtils.dp2px(1.0f);
        this.iXiX011 = true;
        OXO1(context, attributeSet);
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setTypeface(iiOI111I.OXO1.OXO1(MyTypeface.PF_MEDIUM, context));
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    public /* synthetic */ DfuProgress(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
