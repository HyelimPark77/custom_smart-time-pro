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
import com.sma.smartv3.R;
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
    public static final OXO1 iiiO = null;

    @aa1
    public final Paint I1;

    @aa1
    public final Paint IO;
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
        public /* synthetic */ OXO1(DefaultConstructorMarker r1) {
            this();
        }

        public OXO1() {
        }
    }

    static {
        iiiO = new OXO1(null);
    }

    @JvmOverloads
    public EnergySegmentProgressView(@aa1 Context r8) {
        Intrinsics.X0O(r8, "context");
        AttributeSet r3 = null;
        int r4 = 0;
        this(r8, r3, r4, 6, null);
    }

    public final void OXO1() {
        int r0 = 0;
    L4:
        if (r0 >= 5) goto L6;
        int r1 = this.XXO[r0];
        this.iXiiiO[r0] = Color.argb(51, Color.red(r1), Color.green(r1), Color.blue(r1));
        r0 = r0 + 1;
        goto L4
    }

    public final void XIi00iiXO(Canvas r7, float r8, float r9, int r10) {
        this.X11iII1O1.reset();
        float r0 = this.iIXi1iiXI / 2.0f;
        float r1 = r9 - this.iXiX011;
        float r2 = this.O001I;
        float r3 = r8 - r2;
        float r4 = r8 + r2;
        float r11 = r9 - r2;
        float r5 = (r8 + r0) - r2;
        float r6 = r1 + r2;
        float r12 = (r8 - r0) + r2;
        this.X11iII1O1.moveTo(r3, r11);
        this.X11iII1O1.lineTo(r4, r11);
        this.X11iII1O1.lineTo(r5, r6);
        this.X11iII1O1.lineTo(r12, r6);
        this.X11iII1O1.close();
        this.IO.setColor(r10);
        r7.drawPath(this.X11iII1O1, this.IO);
        r7.drawPath(this.X11iII1O1, this.I1);
    }

    public final int getSelectIndex() {
        return this.Ii1iii0;
    }

    public final void iO(AttributeSet r13) {
        TypedArray r14 = getContext().obtainStyledAttributes(r13, R.styleable.SegmentProgressView);
        Intrinsics.O10IXXX0X(r14, "obtainStyledAttributes(...)");
        this.XXX11i = r14.getDimension(2, 8.0f);
        this.X1IX = r14.getDimension(1, 6.0f);
        this.X0i1O = r14.getDimension(5, 2.0f);
        this.iIXi1iiXI = r14.getDimension(9, 30.0f);
        this.iXiX011 = r14.getDimension(8, 30.0f);
        int r4 = 0;
        this.O001I = r14.getDimension(0, 2.0f);
        setSelectIndex(r14.getInt(4, -1));
        this.I1.setStrokeWidth(this.X0i1O);
        String r6 = r14.getString(3);
        if (r6 != null) goto L5;
    L13:
        int[] r0 = this.XXO;
        r0[0] = -1754827;
        r0[1] = -291840;
        r0[2] = -141259;
        r0[3] = -12345273;
        r0[4] = -14776091;
    L14:
        r14.recycle();
        return;
    L5:
        if (r6.length() == 0) goto L13;
        List r1 = StringsKt__StringsKt.i1I(r6, new String[]{I000IiI1O.iO.XO0O10}, false, 0, 6, null);
    L8:
        if (r4 >= 5) goto L14;
        if (r4 >= r1.size()) goto L12;
        this.XXO[r4] = Color.parseColor(StringsKt__StringsKt.iX1X1((String) r1.get(r4)).toString());
    L12:
        r4 = r4 + 1;
        goto L8
    }

    @Override // android.view.View
    public void onDraw(@aa1 Canvas r25) {
        Intrinsics.X0O(r25, "canvas");
        super.onDraw(r25);
        float r8 = getWidth();
        float r9 = this.iXiX011;
        float r10 = 30.0f + r9;
        float r11 = 15.0f + r9;
        int r13 = 4;
        int r12 = 5;
        float r14 = (r8 - (this.XXX11i * 4)) / 5;
        int r2 = 0;
        float r3 = 0.0f;
        float r4 = 0.0f;
    L3:
        if (r2 >= r12) goto L18;
        float r5 = r3 + r14;
        this.iX1O1.set(r3, r9, r5, r10);
        Paint r7 = this.IO;
        int r21 = r12;
        if (r2 != this.Ii1iii0) goto L7;
        int r15 = this.XXO[r2];
    L8:
        r7.setColor(r15);
        this.X11iII1O1.reset();
        if (r2 == 0) goto L13;
        if (r2 == r13) goto L12;
        r25.drawRect(this.iX1O1, this.IO);
        int r22 = r13;
    L15:
        if (r2 != this.Ii1iii0) goto L17;
        r4 = (r14 / 2.0f) + r3;
    L17:
        r3 = this.XXX11i + r5;
        r2 = r2 + 1;
        r12 = r21;
        r13 = r22;
        goto L3
    L12:
        Path r16 = this.X11iII1O1;
        RectF r17 = this.iX1O1;
        r22 = r13;
        float r18 = this.X1IX;
        float[] r19 = new float[8];
        r19[0] = 0.0f;
        r19[1] = 0.0f;
        r19[2] = r18;
        r19[3] = r18;
        r19[r22] = r18;
        r19[r21] = r18;
        r19[6] = 0.0f;
        r19[7] = 0.0f;
        r16.addRoundRect(r17, r19, Path.Direction.CW);
        r25.drawPath(this.X11iII1O1, this.IO);
        goto L15
    L13:
        r22 = r13;
        Path r20 = this.X11iII1O1;
        RectF r110 = this.iX1O1;
        float r111 = this.X1IX;
        float[] r112 = new float[8];
        r112[0] = r111;
        r112[1] = r111;
        r112[2] = 0.0f;
        r112[3] = 0.0f;
        r112[r22] = 0.0f;
        r112[r21] = 0.0f;
        r112[6] = r111;
        r112[7] = r111;
        r20.addRoundRect(r110, r112, Path.Direction.CW);
        r25.drawPath(this.X11iII1O1, this.IO);
        goto L15
    L7:
        r15 = this.iXiiiO[r2];
        goto L8
    L18:
        int r6 = this.Ii1iii0;
        if (r6 < 0) goto L25;
        XIi00iiXO(r25, r4, r11, this.XXO[r6]);
        return;
    }

    @Override // android.view.View
    public void onMeasure(int r2, int r3) {
        float r0 = this.iXiX011 + 30.0f;
        setMeasuredDimension(View.MeasureSpec.getSize(r2), (int) r0);
    }

    public final void setSelectColorList(@aa1 List<Integer> r4) {
        Intrinsics.X0O(r4, "colors");
        int r0 = 0;
    L4:
        if (r0 >= 5) goto L9;
        if (r0 >= r4.size()) goto L8;
        this.XXO[r0] = r4.get(r0).intValue();
    L8:
        r0 = r0 + 1;
        goto L4
    L9:
        OXO1();
        invalidate();
    }

    public final void setSelectIndex(int r2) {
        if ((-1) <= r2) goto L5;
        return;
    L5:
        if (r2 >= 5) goto L9;
        this.Ii1iii0 = r2;
        invalidate();
        return;
    }

    @JvmOverloads
    public EnergySegmentProgressView(@aa1 Context r8, @tb1 AttributeSet r9) {
        Intrinsics.X0O(r8, "context");
        int r4 = 0;
        this(r8, r9, r4, 4, null);
    }

    @JvmOverloads
    public EnergySegmentProgressView(@aa1 Context r2, @tb1 AttributeSet r3, int r4) {
        Intrinsics.X0O(r2, "context");
        super(r2, r3, r4);
        Paint r5 = new Paint(1);
        r5.setStyle(Paint.Style.FILL);
        this.IO = r5;
        Paint r6 = new Paint(1);
        r6.setStyle(Paint.Style.STROKE);
        r6.setColor(-1);
        r6.setStrokeCap(Paint.Cap.ROUND);
        r6.setStrokeJoin(Paint.Join.ROUND);
        this.I1 = r6;
        this.iX1O1 = new RectF();
        this.X11iII1O1 = new Path();
        this.XXO = new int[5];
        this.iXiiiO = new int[5];
        this.Ii1iii0 = -1;
        iO(r3);
        OXO1();
    }

    public /* synthetic */ EnergySegmentProgressView(Context r1, AttributeSet r2, int r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = null;
    L6:
        if ((r4 & 4) == 0) goto L8;
        r3 = 0;
    L8:
        this(r1, r2, r3);
    }
}
