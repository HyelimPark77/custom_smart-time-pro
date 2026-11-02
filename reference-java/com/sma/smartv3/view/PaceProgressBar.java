package com.sma.smartv3.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.android.mltcode.paycertificationapi.aa1;
import com.sma.smartv3.C15429R;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class PaceProgressBar extends View {

    /* JADX INFO: renamed from: I1 */
    public int f55015I1;

    /* JADX INFO: renamed from: IO */
    public int f55016IO;
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

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PaceProgressBar(@aa1 Context context, @aa1 AttributeSet attrs) {
        this(context, attrs, 0, 4, null);
        Intrinsics.X0O(context, "context");
        Intrinsics.X0O(attrs, "attrs");
    }

    public final void OXO1(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C15429R.styleable.PaceProgressBar);
        Intrinsics.O10IXXX0X(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.iX1O1 = typedArrayObtainStyledAttributes.getBoolean(0, true);
        this.iXiX011 = typedArrayObtainStyledAttributes.getColor(1, -1);
        this.O001I = typedArrayObtainStyledAttributes.getColor(2, -256);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public void onDraw(@aa1 Canvas canvas) {
        Intrinsics.X0O(canvas, "canvas");
        super.onDraw(canvas);
        canvas.save();
        canvas.drawRect(0.0f, 0.0f, this.f55016IO - this.X1IX, this.f55015I1, this.X11iII1O1);
        float f = this.f55016IO;
        float f2 = this.X1IX;
        canvas.drawCircle(f - f2, f2, f2, this.X11iII1O1);
        if (this.iIXi1iiXI == 0.0f) {
            this.iIXi1iiXI = this.X0i1O * this.f55016IO;
        }
        canvas.drawRect(0.0f, 0.0f, this.iIXi1iiXI - this.X1IX, this.f55015I1, this.XXX11i);
        float f3 = this.iIXi1iiXI;
        float f4 = this.X1IX;
        canvas.drawCircle(f3 - f4, f4, f4, this.XXX11i);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f55016IO = View.MeasureSpec.getSize(i);
        int size = View.MeasureSpec.getSize(i2);
        this.f55015I1 = size;
        this.X1IX = size / 2.0f;
    }

    public final void setPB(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        } else if (f > 1.0f) {
            f = 1.0f;
        }
        this.X0i1O = f;
        this.iIXi1iiXI = 0.0f;
        invalidate();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PaceProgressBar(@aa1 Context context, @aa1 AttributeSet attrs, int i) {
        super(context, attrs, i);
        Intrinsics.X0O(context, "context");
        Intrinsics.X0O(attrs, "attrs");
        this.iX1O1 = true;
        Paint paint = new Paint();
        this.X11iII1O1 = paint;
        Paint paint2 = new Paint();
        this.XXX11i = paint2;
        OXO1(context, attrs);
        paint.setAntiAlias(this.iX1O1);
        paint.setColor(this.iXiX011);
        paint2.setAntiAlias(this.iX1O1);
        paint2.setColor(this.O001I);
    }

    public /* synthetic */ PaceProgressBar(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
