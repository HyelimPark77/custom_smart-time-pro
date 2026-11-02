package com.sma.smartv3.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.view.ViewCompat;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.C15429R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nPillTabView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PillTabView.kt\ncom/sma/smartv3/view/PillTabView\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,181:1\n1#2:182\n*E\n"})
public final class PillTabView extends View {

    /* JADX INFO: renamed from: I1 */
    @aa1
    public final Paint f55022I1;

    /* JADX INFO: renamed from: IO */
    @aa1
    public final Paint f55023IO;

    @tb1
    public String X11iII1O1;

    @tb1
    public Function1<? super Boolean, Unit> X1IX;

    @tb1
    public String XXX11i;
    public boolean iX1O1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PillTabView(@aa1 Context context, @tb1 AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.X0O(context, "context");
        Paint paint = new Paint(1);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.f55023IO = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(style);
        this.f55022I1 = paint2;
        this.iX1O1 = true;
        this.X11iII1O1 = "";
        this.XXX11i = "";
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C15429R.styleable.PillTabView);
        Intrinsics.O10IXXX0X(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            this.X11iII1O1 = OXO1(typedArrayObtainStyledAttributes, 0);
            this.XXX11i = OXO1(typedArrayObtainStyledAttributes, 1);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final String OXO1(TypedArray typedArray, int i) {
        int resourceId = typedArray.getResourceId(i, -1);
        return resourceId != -1 ? getContext().getString(resourceId) : typedArray.getString(i);
    }

    public final void XIi00iiXO() {
        if (this.iX1O1) {
            return;
        }
        this.iX1O1 = true;
        invalidate();
        Function1<? super Boolean, Unit> function1 = this.X1IX;
        if (function1 != null) {
            function1.invoke2(Boolean.valueOf(this.iX1O1));
        }
    }

    public final void XO0O10(boolean z) {
        this.iX1O1 = z;
        invalidate();
    }

    @tb1
    public final Function1<Boolean, Unit> getOnTabSelected() {
        return this.X1IX;
    }

    /* JADX INFO: renamed from: iO */
    public final void m38902iO() {
        if (this.iX1O1) {
            this.iX1O1 = false;
            invalidate();
            Function1<? super Boolean, Unit> function1 = this.X1IX;
            if (function1 != null) {
                function1.invoke2(Boolean.valueOf(this.iX1O1));
            }
        }
    }

    @Override // android.view.View
    public void onDraw(@aa1 Canvas canvas) {
        float f;
        float f2;
        float f3;
        Path path;
        float f4;
        Intrinsics.X0O(canvas, "canvas");
        super.onDraw(canvas);
        float width = getWidth();
        float height = getHeight();
        float f5 = 2;
        float f6 = height / f5;
        float f7 = (7 * width) / 10;
        Path path2 = new Path();
        if (this.iX1O1) {
            f2 = 90.0f;
            f = 180.0f;
            path2.addRoundRect(0.0f, 0.0f, f7, height, new float[]{f6, f6, f6, f6, f6, f6, f6, f6}, Path.Direction.CW);
            path = path2;
            f3 = f7;
            f4 = height;
        } else {
            f = 180.0f;
            f2 = 90.0f;
            f3 = f7;
            path = path2;
            f4 = height;
            path.moveTo(0.0f, 0.0f);
            path.lineTo(f3 - f6, 0.0f);
            float f8 = f5 * f6;
            path.arcTo(new RectF(f3 - f8, 0.0f, f3, f4), 270.0f, -180.0f, false);
            path.lineTo(0.0f, f4);
            path.arcTo(new RectF(0.0f, 0.0f, f8, f4), 90.0f, 180.0f, false);
            path.close();
        }
        this.f55023IO.setColor(this.iX1O1 ? Color.parseColor("#FF7400") : Color.parseColor("#C9C9C9"));
        canvas.drawPath(path, this.f55023IO);
        float f9 = 18.0f + f3;
        Path path3 = new Path();
        if (this.iX1O1) {
            float f10 = f9 - f6;
            path3.moveTo(f10, 0.0f);
            path3.lineTo(width - f6, 0.0f);
            float f11 = f5 * f6;
            path3.arcTo(new RectF(width - f11, 0.0f, width, f4), 270.0f, f, false);
            path3.lineTo(f10, f4);
            path3.arcTo(new RectF(f9 - f11, 0.0f, f9, f4), f2, -180.0f, false);
            path3.close();
        } else {
            path3.addRoundRect(f9 - (f5 * f6), 0.0f, width, f4, new float[]{f6, f6, f6, f6, f6, f6, f6, f6}, Path.Direction.CW);
        }
        this.f55022I1.setColor(this.iX1O1 ? Color.parseColor("#C9C9C9") : Color.parseColor("#FF7400"));
        canvas.drawPath(path3, this.f55022I1);
        Paint paint = new Paint(1);
        paint.setTextSize(40.0f);
        Paint.Align align = Paint.Align.CENTER;
        paint.setTextAlign(align);
        boolean z = this.iX1O1;
        int i = ViewCompat.MEASURED_STATE_MASK;
        paint.setColor(z ? -1 : -16777216);
        Typeface typeface = Typeface.DEFAULT;
        paint.setTypeface(Typeface.create(typeface, this.iX1O1 ? 1 : 0));
        Paint paint2 = new Paint(1);
        paint2.setTextSize(40.0f);
        paint2.setTextAlign(align);
        if (!this.iX1O1) {
            i = -1;
        }
        paint2.setColor(i);
        paint2.setTypeface(Typeface.create(typeface, !this.iX1O1 ? 1 : 0));
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        float f12 = fontMetrics.bottom;
        float f13 = (f6 + ((f12 - fontMetrics.top) / f5)) - f12;
        float f14 = f3 / f5;
        float f15 = f3 + ((width - f3) / f5);
        String str = this.X11iII1O1;
        if (str == null) {
            str = "";
        }
        canvas.drawText(str, f14, f13, paint);
        String str2 = this.XXX11i;
        canvas.drawText(str2 != null ? str2 : "", f15, f13, paint2);
    }

    @Override // android.view.View
    public boolean onTouchEvent(@aa1 MotionEvent event) {
        Intrinsics.X0O(event, "event");
        int action = event.getAction();
        if (action == 0) {
            return true;
        }
        if (action == 1) {
            boolean z = event.getX() < ((float) ((getWidth() * 7) / 10));
            if (z) {
                XIi00iiXO();
            } else {
                m38902iO();
            }
            this.iX1O1 = z;
        }
        return super.onTouchEvent(event);
    }

    public final void setOnTabSelected(@tb1 Function1<? super Boolean, Unit> function1) {
        this.X1IX = function1;
    }
}
