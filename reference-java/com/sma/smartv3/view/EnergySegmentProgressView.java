package com.sma.smartv3.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.C15429R;
import java.util.List;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class EnergySegmentProgressView extends View {

    @Deprecated
    public static final float OX110i = 30.0f;

    @Deprecated
    public static final int X100O = 51;

    @Deprecated
    public static final int X11I = 5;

    @Deprecated
    public static final float XX1Oi = 30.0f;

    @aa1
    public static final OXO1 iiiO = new OXO1(null);

    /* JADX INFO: renamed from: I1 */
    @aa1
    public final Paint f54973I1;

    /* JADX INFO: renamed from: IO */
    @aa1
    public final Paint f54974IO;
    public int Ii1iii0;
    public float O001I;
    public float X0i1O;

    @aa1
    public final Path X11iII1O1;
    public float X1IX;

    @aa1
    public final int[] XXO;
    public float XXX11i;
    public float iIXi1iiXI;

    @aa1
    public final RectF iX1O1;
    public float iXiX011;

    @aa1
    public final int[] iXiiiO;

    public static final class OXO1 {
        public /* synthetic */ OXO1(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public OXO1() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public EnergySegmentProgressView(@aa1 Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.X0O(context, "context");
    }

    public final void OXO1() {
        for (int i = 0; i < 5; i++) {
            int i2 = this.XXO[i];
            this.iXiiiO[i] = Color.argb(51, Color.red(i2), Color.green(i2), Color.blue(i2));
        }
    }

    public final void XIi00iiXO(Canvas canvas, float f, float f2, int i) {
        this.X11iII1O1.reset();
        float f3 = this.iIXi1iiXI / 2.0f;
        float f4 = f2 - this.iXiX011;
        float f5 = this.O001I;
        float f6 = f - f5;
        float f7 = f + f5;
        float f8 = f2 - f5;
        float f9 = (f + f3) - f5;
        float f10 = f4 + f5;
        this.X11iII1O1.moveTo(f6, f8);
        this.X11iII1O1.lineTo(f7, f8);
        this.X11iII1O1.lineTo(f9, f10);
        this.X11iII1O1.lineTo((f - f3) + f5, f10);
        this.X11iII1O1.close();
        this.f54974IO.setColor(i);
        canvas.drawPath(this.X11iII1O1, this.f54974IO);
        canvas.drawPath(this.X11iII1O1, this.f54973I1);
    }

    public final int getSelectIndex() {
        return this.Ii1iii0;
    }

    /* JADX INFO: renamed from: iO */
    public final void m38879iO(AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C15429R.styleable.SegmentProgressView);
        Intrinsics.O10IXXX0X(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.XXX11i = typedArrayObtainStyledAttributes.getDimension(2, 8.0f);
        this.X1IX = typedArrayObtainStyledAttributes.getDimension(1, 6.0f);
        this.X0i1O = typedArrayObtainStyledAttributes.getDimension(5, 2.0f);
        this.iIXi1iiXI = typedArrayObtainStyledAttributes.getDimension(9, 30.0f);
        this.iXiX011 = typedArrayObtainStyledAttributes.getDimension(8, 30.0f);
        this.O001I = typedArrayObtainStyledAttributes.getDimension(0, 2.0f);
        setSelectIndex(typedArrayObtainStyledAttributes.getInt(4, -1));
        this.f54973I1.setStrokeWidth(this.X0i1O);
        String string = typedArrayObtainStyledAttributes.getString(3);
        if (string == null || string.length() == 0) {
            int[] iArr = this.XXO;
            iArr[0] = -1754827;
            iArr[1] = -291840;
            iArr[2] = -141259;
            iArr[3] = -12345273;
            iArr[4] = -14776091;
        } else {
            List listI1I = StringsKt__StringsKt.i1I(string, new String[]{I000IiI1O.C2156iO.XO0O10}, false, 0, 6, null);
            for (int i = 0; i < 5; i++) {
                if (i < listI1I.size()) {
                    this.XXO[i] = Color.parseColor(StringsKt__StringsKt.iX1X1((String) listI1I.get(i)).toString());
                }
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public void onDraw(@aa1 Canvas canvas) {
        int i;
        Intrinsics.X0O(canvas, "canvas");
        super.onDraw(canvas);
        float width = getWidth();
        float f = this.iXiX011;
        float f2 = 30.0f + f;
        float f3 = 15.0f + f;
        int i2 = 4;
        int i3 = 5;
        float f4 = (width - (this.XXX11i * 4)) / 5;
        int i4 = 0;
        float f5 = 0.0f;
        float f6 = 0.0f;
        while (i4 < i3) {
            float f7 = f5 + f4;
            this.iX1O1.set(f5, f, f7, f2);
            int i5 = i3;
            this.f54974IO.setColor(i4 == this.Ii1iii0 ? this.XXO[i4] : this.iXiiiO[i4]);
            this.X11iII1O1.reset();
            if (i4 == 0) {
                i = i2;
                Path path = this.X11iII1O1;
                RectF rectF = this.iX1O1;
                float f8 = this.X1IX;
                float[] fArr = new float[8];
                fArr[0] = f8;
                fArr[1] = f8;
                fArr[2] = 0.0f;
                fArr[3] = 0.0f;
                fArr[i] = 0.0f;
                fArr[i5] = 0.0f;
                fArr[6] = f8;
                fArr[7] = f8;
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                canvas.drawPath(this.X11iII1O1, this.f54974IO);
            } else if (i4 != i2) {
                canvas.drawRect(this.iX1O1, this.f54974IO);
                i = i2;
            } else {
                Path path2 = this.X11iII1O1;
                RectF rectF2 = this.iX1O1;
                i = i2;
                float f9 = this.X1IX;
                float[] fArr2 = new float[8];
                fArr2[0] = 0.0f;
                fArr2[1] = 0.0f;
                fArr2[2] = f9;
                fArr2[3] = f9;
                fArr2[i] = f9;
                fArr2[i5] = f9;
                fArr2[6] = 0.0f;
                fArr2[7] = 0.0f;
                path2.addRoundRect(rectF2, fArr2, Path.Direction.CW);
                canvas.drawPath(this.X11iII1O1, this.f54974IO);
            }
            if (i4 == this.Ii1iii0) {
                f6 = (f4 / 2.0f) + f5;
            }
            f5 = this.XXX11i + f7;
            i4++;
            i3 = i5;
            i2 = i;
        }
        int i6 = this.Ii1iii0;
        if (i6 >= 0) {
            XIi00iiXO(canvas, f6, f3, this.XXO[i6]);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), (int) (this.iXiX011 + 30.0f));
    }

    public final void setSelectColorList(@aa1 List<Integer> colors) {
        Intrinsics.X0O(colors, "colors");
        for (int i = 0; i < 5; i++) {
            if (i < colors.size()) {
                this.XXO[i] = colors.get(i).intValue();
            }
        }
        OXO1();
        invalidate();
    }

    public final void setSelectIndex(int i) {
        if (-1 > i || i >= 5) {
            return;
        }
        this.Ii1iii0 = i;
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public EnergySegmentProgressView(@aa1 Context context, @tb1 AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.X0O(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public EnergySegmentProgressView(@aa1 Context context, @tb1 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.X0O(context, "context");
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        this.f54974IO = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setColor(-1);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setStrokeJoin(Paint.Join.ROUND);
        this.f54973I1 = paint2;
        this.iX1O1 = new RectF();
        this.X11iII1O1 = new Path();
        this.XXO = new int[5];
        this.iXiiiO = new int[5];
        this.Ii1iii0 = -1;
        m38879iO(attributeSet);
        OXO1();
    }

    public /* synthetic */ EnergySegmentProgressView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
