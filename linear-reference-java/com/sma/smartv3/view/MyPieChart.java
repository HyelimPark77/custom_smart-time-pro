package com.sma.smartv3.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.pro.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nMyPieChart.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MyPieChart.kt\ncom/sma/smartv3/view/MyPieChart\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,101:1\n1869#2,2:102\n*S KotlinDebug\n*F\n+ 1 MyPieChart.kt\ncom/sma/smartv3/view/MyPieChart\n*L\n82#1:102,2\n*E\n"})
public final class MyPieChart extends View {

    @aa1
    public final ArrayList<OXO1> I1;

    @tb1
    public Paint IO;
    public int X11iII1O1;

    @tb1
    public RectF XXX11i;
    public int iX1O1;

    public static final class OXO1 {
        public long OXO1;
        public int XIi00iiXO;
        public float XO0O10;
        public float iO;

        public OXO1(long r1, int r3, float r4, float r5) {
            this.OXO1 = r1;
            this.XIi00iiXO = r3;
            this.iO = r4;
            this.XO0O10 = r5;
        }

        public static /* synthetic */ OXO1 IiI10X(OXO1 r6, long r7, int r9, float r10, float r11, int r12, Object r13) {
            if ((r12 & 1) == 0) goto L5;
            r7 = r6.OXO1;
        L5:
            long r1 = r7;
            if ((r12 & 2) == 0) goto L8;
            r9 = r6.XIi00iiXO;
        L8:
            int r3 = r9;
            if ((r12 & 4) == 0) goto L11;
            r10 = r6.iO;
        L11:
            float r4 = r10;
            if ((r12 & 8) == 0) goto L15;
            r11 = r6.XO0O10;
        L15:
            return r6.O00(r1, r3, r4, r11);
        }

        public final int I0IIOi() {
            return this.XIi00iiXO;
        }

        public final void I0iXXO(int r1) {
            this.XIi00iiXO = r1;
        }

        public final long IO() {
            return this.OXO1;
        }

        @aa1
        public final OXO1 O00(long r7, int r9, float r10, float r11) {
            return new OXO1(r7, r9, r10, r11);
        }

        public final void OIX0iXi(float r1) {
            this.XO0O10 = r1;
        }

        public final float OIi0() {
            return this.iO;
        }

        public final long OXO1() {
            return this.OXO1;
        }

        public final void X1ii(long r1) {
            this.OXO1 = r1;
        }

        public final int XIi00iiXO() {
            return this.XIi00iiXO;
        }

        public final float XO0O10() {
            return this.XO0O10;
        }

        public final float XOO0ii0() {
            return this.XO0O10;
        }

        public final void XXI(float r1) {
            this.iO = r1;
        }

        public boolean equals(@tb1 Object r8) {
            if (this != r8) goto L6;
            return true;
        L6:
            if ((r8 instanceof OXO1) == true) goto L8;
            return false;
        L8:
            OXO1 r9 = (OXO1) r8;
            if (this.OXO1 == r9.OXO1) goto L12;
            return false;
        L12:
            if (this.XIi00iiXO == r9.XIi00iiXO) goto L15;
            return false;
        L15:
            if (Float.compare(this.iO, r9.iO) == 0) goto L18;
            return false;
        L18:
            if (Float.compare(this.XO0O10, r9.XO0O10) == 0) goto L20;
            return false;
        L20:
            return true;
        }

        public int hashCode() {
            return (((((Long.hashCode(this.OXO1) * 31) + Integer.hashCode(this.XIi00iiXO)) * 31) + Float.hashCode(this.iO)) * 31) + Float.hashCode(this.XO0O10);
        }

        public final float iO() {
            return this.iO;
        }

        @aa1
        public String toString() {
            return "PieChartViewData(value=" + this.OXO1 + ", color=" + this.XIi00iiXO + ", percentage=" + this.iO + ", angle=" + this.XO0O10 + I000IiI1O.iO.iO;
        }

        public /* synthetic */ OXO1(long r7, int r9, float r10, float r11, int r12, DefaultConstructorMarker r13) {
            if ((r12 & 2) == 0) goto L5;
            r9 = -16711936;
        L5:
            int r3 = r9;
            if ((r12 & 4) == 0) goto L8;
            float r4 = 0.0f;
        L10:
            if ((r12 & 8) == 0) goto L13;
            float r5 = 0.0f;
        L14:
            this(r7, r3, r4, r5);
            return;
        L13:
            r5 = r11;
            goto L14
        L8:
            r4 = r10;
            goto L10
        }
    }

    @JvmOverloads
    public MyPieChart(@aa1 Context r8) {
        Intrinsics.X0O(r8, "context");
        AttributeSet r3 = null;
        int r4 = 0;
        this(r8, r3, r4, 6, null);
    }

    public final void OXO1(@aa1 ArrayList<OXO1> r7) {
        Intrinsics.X0O(r7, "datas");
        if (r7.size() != 0) goto L6;
        invalidate();
        return;
    L6:
        int r0 = r7.size();
        int r2 = 0;
        float r3 = 0.0f;
    L7:
        if (r2 >= r0) goto L10;
        OXO1 r4 = r7.get(r2);
        Intrinsics.O10IXXX0X(r4, "get(...)");
        r3 = r3 + r4.IO();
        r2 = r2 + 1;
        goto L7
    L10:
        if (r3 != 0.0f) goto L15;
        Iterator<T> r1 = r7.iterator();
    L13:
        if (r1.hasNext() == false) goto L15;
        OXO1 r5 = (OXO1) r1.next();
        r5.X1ii(1);
        r3 = r3 + r5.IO();
    L15:
        Iterator<OXO1> r6 = r7.iterator();
        Intrinsics.O10IXXX0X(r6, "iterator(...)");
    L17:
        if (r6.hasNext() == false) goto L19;
        OXO1 r8 = r6.next();
        Intrinsics.O10IXXX0X(r8, "next(...)");
        OXO1 r9 = r8;
        float r10 = r9.IO() / r3;
        r9.XXI(r10);
        r9.OIX0iXi(360 * r10);
        goto L17
    L19:
        this.I1.clear();
        this.I1.addAll(r7);
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(@aa1 Canvas r14) {
        Intrinsics.X0O(r14, "canvas");
        super.onDraw(r14);
        r14.translate(this.iX1O1 / 2.0f, this.X11iII1O1 / 2.0f);
        float r6 = Math.min(this.iX1O1, this.X11iII1O1) / 4;
        float r7 = 2;
        float r8 = (r6 / this.I1.size()) / r7;
        int r9 = this.I1.size();
        float r10 = 100.0f;
        int r11 = 0;
    L3:
        if (r11 >= r9) goto L11;
        OXO1 r1 = this.I1.get(r11);
        Intrinsics.O10IXXX0X(r1, "get(...)");
        OXO1 r12 = r1;
        Paint r2 = this.IO;
        if (r2 == null) goto L7;
        r2.setColor(r12.I0IIOi());
    L7:
        RectF r3 = this.XXX11i;
        if (r3 == null) goto L10;
        float r4 = r11 * r8;
        float r5 = ((-r6) * r7) + r4;
        float r13 = (r6 * r7) - r4;
        r3.set(r5, r5, r13, r13);
    L10:
        RectF r15 = this.XXX11i;
        Intrinsics.XXI(r15);
        float r16 = -r12.XOO0ii0();
        Paint r17 = this.IO;
        Intrinsics.XXI(r17);
        r14.drawArc(r15, 360 - r10, r16, true, r17);
        r10 = r10 + r12.XOO0ii0();
        r11 = r11 + 1;
        goto L3
    L11:
        Paint r0 = this.IO;
        if (r0 == null) goto L14;
        r0.setColor(gk4.iO(getContext(), R.color.view_page_secondary_bg));
    L14:
        RectF r18 = this.XXX11i;
        if (r18 == null) goto L17;
        float r19 = (-r6) - 15.0f;
        float r20 = r6 - (-15.0f);
        r18.set(r19, r19, r20, r20);
    L17:
        RectF r21 = this.XXX11i;
        Intrinsics.XXI(r21);
        Paint r22 = this.IO;
        Intrinsics.XXI(r22);
        r14.drawArc(r21, 0.0f, 360.0f, true, r22);
    }

    @Override // android.view.View
    public void onSizeChanged(int r1, int r2, int r3, int r4) {
        super.onSizeChanged(r1, r2, r3, r4);
        this.iX1O1 = r1;
        this.X11iII1O1 = r2;
    }

    @JvmOverloads
    public MyPieChart(@aa1 Context r8, @tb1 AttributeSet r9) {
        Intrinsics.X0O(r8, "context");
        int r4 = 0;
        this(r8, r9, r4, 4, null);
    }

    @JvmOverloads
    public MyPieChart(@aa1 Context r9, @tb1 AttributeSet r10, int r11) {
        Intrinsics.X0O(r9, "context");
        super(r9, r10, r11);
        ArrayList<OXO1> r12 = new ArrayList();
        this.I1 = r12;
        Paint r13 = new Paint();
        this.IO = r13;
        r13.setColor(-1);
        Paint r14 = this.IO;
        if (r14 == null) goto L5;
        r14.setStyle(Paint.Style.FILL);
    L5:
        Paint r15 = this.IO;
        if (r15 == null) goto L8;
        r15.setTextSize(30.0f);
    L8:
        this.XXX11i = new RectF();
        long r1 = 1;
        float r4 = 0.0f;
        float r5 = 0.0f;
        r12.add(new OXO1(r1, getResources().getColor(R.color.hr_scope_color_4), r4, r5, 12, null));
    }

    public /* synthetic */ MyPieChart(Context r1, AttributeSet r2, int r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = null;
    L6:
        if ((r4 & 4) == 0) goto L8;
        r3 = 0;
    L8:
        this(r1, r2, r3);
    }
}
