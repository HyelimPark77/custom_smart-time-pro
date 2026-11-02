package com.sma.smartv3.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.blankj.utilcode.util.SizeUtils;
import com.sma.smartv3.C15429R;
import com.sma.smartv3.pro.R;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import skin.support.widget.SkinCompatView;

/* JADX INFO: loaded from: classes3.dex */
public final class Goal4ProgressBar extends SkinCompatView {

    /* JADX INFO: renamed from: I1 */
    public float f54989I1;

    @aa1
    public final Paint IO0II0i;

    @tb1
    public Bitmap IXOIIIO;
    public float Ii0X0X;
    public int Ii0i;

    @aa1
    public final RectF Ii1iii0;

    @aa1
    public final Paint O001I;

    /* JADX INFO: renamed from: OO */
    public int f54990OO;
    public int OX110i;
    public float X00XIX1;

    @tb1
    public Bitmap X00Xi1X;

    @aa1
    public final Paint X0i1O;

    /* JADX INFO: renamed from: X1 */
    @tb1
    public Bitmap f54991X1;
    public int X100O;
    public int X11I;
    public float X11iII1O1;

    @aa1
    public final Paint X1IX;
    public final float XO0X10iO;
    public int XOX0O0;
    public int XX1Oi;

    @aa1
    public final Paint XXO;
    public float XXX11i;
    public int XXiIiX10;
    public final float i0X000X0O;
    public float i11I;

    @aa1
    public final Paint iIXi1iiXI;
    public final float iOiXi11II;
    public boolean iX1O1;

    @aa1
    public final Paint iXiX011;

    @aa1
    public final RectF iXiiiO;

    @aa1
    public final RectF iiiO;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Goal4ProgressBar(@aa1 Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.X0O(context, "context");
    }

    private final float OXO1(int i) {
        return SizeUtils.dp2px(i);
    }

    private final void XIi00iiXO(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C15429R.styleable.GoalProgressBar);
        Intrinsics.O10IXXX0X(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.iX1O1 = typedArrayObtainStyledAttributes.getBoolean(0, true);
        this.X11I = typedArrayObtainStyledAttributes.getColor(10, 0);
        this.X100O = typedArrayObtainStyledAttributes.getColor(9, 0);
        this.XX1Oi = typedArrayObtainStyledAttributes.getColor(2, 0);
        this.OX110i = typedArrayObtainStyledAttributes.getColor(1, 0);
        this.f54990OO = typedArrayObtainStyledAttributes.getColor(5, 0);
        this.XOX0O0 = typedArrayObtainStyledAttributes.getColor(4, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void O00(int i, int i2) {
        if (i2 == 0) {
            i2 = 10000;
        }
        float f = (i / i2) * 100;
        float f2 = this.iOiXi11II;
        if (f > f2) {
            f = f2;
        }
        if (f != 0.0f) {
            this.X00XIX1 = f;
        }
        invalidate();
    }

    public final void XO0O10(int i, int i2) {
        if (i2 == 0) {
            i2 = 10000;
        }
        float f = (i / i2) * 100;
        float f2 = this.XO0X10iO;
        if (f > f2) {
            f = f2;
        }
        if (f != 0.0f) {
            this.Ii0X0X = f;
        }
        invalidate();
    }

    @Override // skin.support.widget.SkinCompatView, com.android.mltcode.paycertificationapi.ik4
    public void applySkin() {
        super.applySkin();
        invalidate();
        if (this.XXiIiX10 > 0) {
            Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(getContext().getResources(), R.drawable.ic_gpb_step);
            int i = this.XXiIiX10;
            this.X00Xi1X = Bitmap.createScaledBitmap(bitmapDecodeResource, i, i, true);
            Bitmap bitmapDecodeResource2 = BitmapFactory.decodeResource(getContext().getResources(), R.drawable.ic_gpb_dis);
            int i2 = this.XXiIiX10;
            this.f54991X1 = Bitmap.createScaledBitmap(bitmapDecodeResource2, i2, i2, true);
            Bitmap bitmapDecodeResource3 = BitmapFactory.decodeResource(getContext().getResources(), R.drawable.ic_gpb_kcal);
            int i3 = this.XXiIiX10;
            this.IXOIIIO = Bitmap.createScaledBitmap(bitmapDecodeResource3, i3, i3, true);
        }
    }

    public final int getViewWidth() {
        return this.Ii0i;
    }

    /* JADX INFO: renamed from: iO */
    public final void m38886iO(int i, int i2) {
        if (i2 == 0) {
            i2 = 10000;
        }
        float f = (i / i2) * 100;
        float f2 = this.i0X000X0O;
        if (f > f2) {
            f = f2;
        }
        if (f != 0.0f) {
            this.i11I = f;
        }
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(@aa1 Canvas canvas) {
        Intrinsics.X0O(canvas, "canvas");
        super.onDraw(canvas);
        canvas.save();
        canvas.drawArc(this.iXiiiO, 270.0f, 360.0f, false, this.X0i1O);
        float f = (this.X00XIX1 / this.iOiXi11II) * 360.0f;
        this.f54989I1 = f;
        canvas.drawArc(this.iXiiiO, 270.0f, f, false, this.X1IX);
        canvas.drawArc(this.Ii1iii0, 270.0f, 360.0f, false, this.iXiX011);
        float f2 = (this.i11I / this.i0X000X0O) * 360.0f;
        this.f54989I1 = f2;
        canvas.drawArc(this.Ii1iii0, 270.0f, f2, false, this.iIXi1iiXI);
        canvas.drawArc(this.iiiO, 270.0f, 360.0f, false, this.XXO);
        float f3 = (this.Ii0X0X / this.XO0X10iO) * 360.0f;
        this.f54989I1 = f3;
        canvas.drawArc(this.iiiO, 270.0f, f3, false, this.O001I);
        Bitmap bitmap = this.X00Xi1X;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, this.Ii0i / 2.0f, this.iXiiiO.top - (bitmap.getHeight() / 2), this.IO0II0i);
        }
        Bitmap bitmap2 = this.IXOIIIO;
        if (bitmap2 != null) {
            canvas.drawBitmap(bitmap2, this.Ii0i / 2.0f, this.Ii1iii0.top - (bitmap2.getHeight() / 2), this.IO0II0i);
        }
        Bitmap bitmap3 = this.f54991X1;
        if (bitmap3 != null) {
            canvas.drawBitmap(bitmap3, this.Ii0i / 2.0f, this.iiiO.top - (bitmap3.getHeight() / 2), this.IO0II0i);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        View.MeasureSpec.getSize(i);
        int size = View.MeasureSpec.getSize(i2);
        float f = size;
        float f2 = (f - (this.XXX11i * 4)) / 8;
        this.X11iII1O1 = f2;
        setMeasuredDimension((int) (f + f2), size);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.Ii0i = i;
        float f = this.X11iII1O1;
        float f2 = f / 2;
        this.X1IX.setStrokeWidth(f);
        this.X0i1O.setStrokeWidth(this.X11iII1O1);
        this.iIXi1iiXI.setStrokeWidth(this.X11iII1O1);
        this.iXiX011.setStrokeWidth(this.X11iII1O1);
        this.O001I.setStrokeWidth(this.X11iII1O1);
        this.XXO.setStrokeWidth(this.X11iII1O1);
        this.iXiiiO.set((i - i2) + f2, f2, i - f2, i2 - f2);
        RectF rectF = this.Ii1iii0;
        RectF rectF2 = this.iXiiiO;
        float f3 = rectF2.left;
        float f4 = this.X11iII1O1;
        float f5 = this.XXX11i;
        rectF.set(f3 + f4 + f5, rectF2.top + f4 + f5, (rectF2.right - f4) - f5, (rectF2.bottom - f4) - f5);
        RectF rectF3 = this.iiiO;
        RectF rectF4 = this.Ii1iii0;
        float f6 = rectF4.left;
        float f7 = this.X11iII1O1;
        float f8 = this.XXX11i;
        rectF3.set(f6 + f7 + f8, rectF4.top + f7 + f8, (rectF4.right - f7) - f8, (rectF4.bottom - f7) - f8);
        this.XXiIiX10 = (int) (((double) this.X11iII1O1) * 0.9d);
        applySkin();
    }

    public final void setViewWidth(int i) {
        this.Ii0i = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Goal4ProgressBar(@aa1 Context context, @tb1 AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.X0O(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public Goal4ProgressBar(@aa1 Context context, @tb1 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.X0O(context, "context");
        this.f54989I1 = 50.0f;
        this.iX1O1 = true;
        this.X11iII1O1 = OXO1(10);
        this.XXX11i = OXO1(4);
        Paint paint = new Paint();
        this.X1IX = paint;
        Paint paint2 = new Paint();
        this.X0i1O = paint2;
        Paint paint3 = new Paint();
        this.iIXi1iiXI = paint3;
        Paint paint4 = new Paint();
        this.iXiX011 = paint4;
        Paint paint5 = new Paint();
        this.O001I = paint5;
        Paint paint6 = new Paint();
        this.XXO = paint6;
        this.iXiiiO = new RectF();
        this.Ii1iii0 = new RectF();
        this.iiiO = new RectF();
        this.iOiXi11II = 100.0f;
        this.i0X000X0O = 100.0f;
        this.XO0X10iO = 100.0f;
        this.XXiIiX10 = SizeUtils.dp2px(50.0f);
        this.IO0II0i = new Paint();
        XIi00iiXO(context, attributeSet);
        paint.setAntiAlias(this.iX1O1);
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint.setStrokeWidth(this.X11iII1O1);
        paint.setColor(this.X11I);
        paint2.setAntiAlias(this.iX1O1);
        paint2.setStyle(style);
        paint2.setStrokeCap(cap);
        paint2.setStrokeWidth(this.X11iII1O1);
        paint2.setColor(this.X100O);
        paint3.setAntiAlias(this.iX1O1);
        paint3.setStyle(style);
        paint3.setStrokeCap(cap);
        paint3.setStrokeWidth(this.X11iII1O1);
        paint3.setColor(this.XX1Oi);
        paint4.setAntiAlias(this.iX1O1);
        paint4.setStyle(style);
        paint4.setStrokeCap(cap);
        paint4.setStrokeWidth(this.X11iII1O1);
        paint4.setColor(this.OX110i);
        paint5.setAntiAlias(this.iX1O1);
        paint5.setStyle(style);
        paint5.setStrokeCap(cap);
        paint5.setStrokeWidth(this.X11iII1O1);
        paint5.setColor(this.f54990OO);
        paint6.setAntiAlias(this.iX1O1);
        paint6.setStyle(style);
        paint6.setStrokeCap(cap);
        paint6.setStrokeWidth(this.X11iII1O1);
        paint6.setColor(this.XOX0O0);
        applySkin();
    }

    public /* synthetic */ Goal4ProgressBar(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
