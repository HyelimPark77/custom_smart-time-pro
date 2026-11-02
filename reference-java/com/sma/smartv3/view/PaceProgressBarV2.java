package com.sma.smartv3.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.android.mltcode.paycertificationapi.aa1;
import com.blankj.utilcode.util.SizeUtils;
import com.sma.smartv3.C15429R;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class PaceProgressBarV2 extends View {

    /* JADX INFO: renamed from: I1 */
    public int f55017I1;

    /* JADX INFO: renamed from: IO */
    public int f55018IO;
    public int Ii1iii0;
    public float O001I;

    @aa1
    public String X0i1O;
    public final float X11I;

    @aa1
    public final Paint X11iII1O1;

    @aa1
    public final Paint X1IX;
    public float XXO;

    @aa1
    public final Paint XXX11i;
    public int iIXi1iiXI;
    public boolean iX1O1;
    public float iXiX011;
    public int iXiiiO;
    public int iiiO;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PaceProgressBarV2(@aa1 Context context, @aa1 AttributeSet attrs) {
        this(context, attrs, 0, 4, null);
        Intrinsics.X0O(context, "context");
        Intrinsics.X0O(attrs, "attrs");
    }

    public final float OXO1(int i) {
        return SizeUtils.dp2px(i);
    }

    public final void XIi00iiXO(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C15429R.styleable.PaceProgressBar);
        Intrinsics.O10IXXX0X(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.iX1O1 = typedArrayObtainStyledAttributes.getBoolean(0, true);
        this.iXiiiO = typedArrayObtainStyledAttributes.getColor(1, -1);
        this.iiiO = typedArrayObtainStyledAttributes.getColor(3, -256);
        this.Ii1iii0 = typedArrayObtainStyledAttributes.getColor(2, -256);
        typedArrayObtainStyledAttributes.recycle();
    }

    /* JADX INFO: renamed from: iO */
    public final void m38900iO(float f, @aa1 String str, int i) {
        Intrinsics.X0O(str, "str");
        if (f < 0.0f) {
            f = 0.0f;
        } else if (0.0f < f && f < 0.25d) {
            f = 0.25f;
        } else if (f > 1.0f) {
            f = 1.0f;
        } else if (f > 0.9d) {
            f = (f / 10) + 0.9f;
        }
        this.O001I = f;
        this.XXO = 0.0f;
        this.X0i1O = str;
        this.iIXi1iiXI = i;
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(@aa1 Canvas canvas) {
        Intrinsics.X0O(canvas, "canvas");
        super.onDraw(canvas);
        canvas.save();
        if (this.iXiX011 == 0.0f) {
            this.iXiX011 = this.f55017I1 / 2.0f;
        }
        float f = this.iXiX011;
        canvas.drawCircle(f, f, f, this.X11iII1O1);
        float f2 = this.iXiX011;
        canvas.drawRect(f2, 0.0f, this.f55018IO - f2, this.f55017I1, this.X11iII1O1);
        float f3 = this.f55018IO;
        float f4 = this.iXiX011;
        canvas.drawCircle(f3 - f4, f4, f4, this.X11iII1O1);
        if (this.XXO == 0.0f) {
            this.XXO = this.O001I * this.f55018IO;
        }
        if (this.X0i1O.length() > 0) {
            if (this.iIXi1iiXI == 0) {
                this.XXX11i.setColor(this.iiiO);
            } else {
                int color = this.XXX11i.getColor();
                int i = this.Ii1iii0;
                if (color != i) {
                    this.XXX11i.setColor(i);
                }
            }
            float f5 = this.iXiX011;
            canvas.drawCircle(f5, f5, f5, this.XXX11i);
            float f6 = this.iXiX011;
            canvas.drawRect(f6, 0.0f, this.XXO - f6, this.f55017I1, this.XXX11i);
            float f7 = this.XXO;
            float f8 = this.iXiX011;
            canvas.drawCircle(f7 - f8, f8, f8, this.XXX11i);
            String str = this.X0i1O;
            canvas.drawText(str, (this.XXO - this.iXiX011) - this.X1IX.measureText(str), this.f55017I1 - OXO1(4), this.X1IX);
        }
        canvas.restore();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f55018IO = View.MeasureSpec.getSize(i);
        int size = View.MeasureSpec.getSize(i2);
        this.f55017I1 = size;
        this.iXiX011 = size / 2.0f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PaceProgressBarV2(@aa1 Context context, @aa1 AttributeSet attrs, int i) {
        super(context, attrs, i);
        Intrinsics.X0O(context, "context");
        Intrinsics.X0O(attrs, "attrs");
        this.iX1O1 = true;
        Paint paint = new Paint();
        this.X11iII1O1 = paint;
        Paint paint2 = new Paint();
        this.XXX11i = paint2;
        Paint paint3 = new Paint();
        this.X1IX = paint3;
        this.X0i1O = "";
        float fOXO1 = OXO1(12);
        this.X11I = fOXO1;
        XIi00iiXO(context, attrs);
        paint.setAntiAlias(this.iX1O1);
        paint.setColor(this.iXiiiO);
        paint2.setAntiAlias(this.iX1O1);
        paint2.setColor(this.Ii1iii0);
        paint3.setAntiAlias(this.iX1O1);
        paint3.setColor(-1);
        paint3.setTextSize(fOXO1);
    }

    public /* synthetic */ PaceProgressBarV2(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
