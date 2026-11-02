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

    /* JADX INFO: renamed from: I1 */
    @aa1
    public final ArrayList<OXO1> f55009I1;

    /* JADX INFO: renamed from: IO */
    @tb1
    public Paint f55010IO;
    public int X11iII1O1;

    @tb1
    public RectF XXX11i;
    public int iX1O1;

    public static final class OXO1 {
        public long OXO1;
        public int XIi00iiXO;
        public float XO0O10;

        /* JADX INFO: renamed from: iO */
        public float f55011iO;

        public OXO1(long j, int i, float f, float f2) {
            this.OXO1 = j;
            this.XIi00iiXO = i;
            this.f55011iO = f;
            this.XO0O10 = f2;
        }

        public static /* synthetic */ OXO1 IiI10X(OXO1 oxo1, long j, int i, float f, float f2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                j = oxo1.OXO1;
            }
            long j2 = j;
            if ((i2 & 2) != 0) {
                i = oxo1.XIi00iiXO;
            }
            int i3 = i;
            if ((i2 & 4) != 0) {
                f = oxo1.f55011iO;
            }
            float f3 = f;
            if ((i2 & 8) != 0) {
                f2 = oxo1.XO0O10;
            }
            return oxo1.O00(j2, i3, f3, f2);
        }

        public final int I0IIOi() {
            return this.XIi00iiXO;
        }

        public final void I0iXXO(int i) {
            this.XIi00iiXO = i;
        }

        /* JADX INFO: renamed from: IO */
        public final long m38896IO() {
            return this.OXO1;
        }

        @aa1
        public final OXO1 O00(long j, int i, float f, float f2) {
            return new OXO1(j, i, f, f2);
        }

        public final void OIX0iXi(float f) {
            this.XO0O10 = f;
        }

        public final float OIi0() {
            return this.f55011iO;
        }

        public final long OXO1() {
            return this.OXO1;
        }

        public final void X1ii(long j) {
            this.OXO1 = j;
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

        public final void XXI(float f) {
            this.f55011iO = f;
        }

        public boolean equals(@tb1 Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof OXO1)) {
                return false;
            }
            OXO1 oxo1 = (OXO1) obj;
            return this.OXO1 == oxo1.OXO1 && this.XIi00iiXO == oxo1.XIi00iiXO && Float.compare(this.f55011iO, oxo1.f55011iO) == 0 && Float.compare(this.XO0O10, oxo1.XO0O10) == 0;
        }

        public int hashCode() {
            return (((((Long.hashCode(this.OXO1) * 31) + Integer.hashCode(this.XIi00iiXO)) * 31) + Float.hashCode(this.f55011iO)) * 31) + Float.hashCode(this.XO0O10);
        }

        /* JADX INFO: renamed from: iO */
        public final float m38897iO() {
            return this.f55011iO;
        }

        @aa1
        public String toString() {
            return "PieChartViewData(value=" + this.OXO1 + ", color=" + this.XIi00iiXO + ", percentage=" + this.f55011iO + ", angle=" + this.XO0O10 + I000IiI1O.C2156iO.f1007iO;
        }

        public /* synthetic */ OXO1(long j, int i, float f, float f2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, (i2 & 2) != 0 ? -16711936 : i, (i2 & 4) != 0 ? 0.0f : f, (i2 & 8) != 0 ? 0.0f : f2);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MyPieChart(@aa1 Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.X0O(context, "context");
    }

    public final void OXO1(@aa1 ArrayList<OXO1> datas) {
        Intrinsics.X0O(datas, "datas");
        if (datas.size() == 0) {
            invalidate();
            return;
        }
        int size = datas.size();
        float fM38896IO = 0.0f;
        for (int i = 0; i < size; i++) {
            OXO1 oxo1 = datas.get(i);
            Intrinsics.O10IXXX0X(oxo1, "get(...)");
            fM38896IO += oxo1.m38896IO();
        }
        if (fM38896IO == 0.0f) {
            for (OXO1 oxo2 : datas) {
                oxo2.X1ii(1L);
                fM38896IO += oxo2.m38896IO();
            }
        }
        Iterator<OXO1> it = datas.iterator();
        Intrinsics.O10IXXX0X(it, "iterator(...)");
        while (it.hasNext()) {
            OXO1 next = it.next();
            Intrinsics.O10IXXX0X(next, "next(...)");
            OXO1 oxo3 = next;
            float fM38896IO2 = oxo3.m38896IO() / fM38896IO;
            oxo3.XXI(fM38896IO2);
            oxo3.OIX0iXi(360 * fM38896IO2);
        }
        this.f55009I1.clear();
        this.f55009I1.addAll(datas);
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(@aa1 Canvas canvas) {
        Intrinsics.X0O(canvas, "canvas");
        super.onDraw(canvas);
        canvas.translate(this.iX1O1 / 2.0f, this.X11iII1O1 / 2.0f);
        float fMin = Math.min(this.iX1O1, this.X11iII1O1) / 4;
        float f = 2;
        float size = (fMin / this.f55009I1.size()) / f;
        int size2 = this.f55009I1.size();
        float fXOO0ii0 = 100.0f;
        for (int i = 0; i < size2; i++) {
            OXO1 oxo1 = this.f55009I1.get(i);
            Intrinsics.O10IXXX0X(oxo1, "get(...)");
            OXO1 oxo2 = oxo1;
            Paint paint = this.f55010IO;
            if (paint != null) {
                paint.setColor(oxo2.I0IIOi());
            }
            RectF rectF = this.XXX11i;
            if (rectF != null) {
                float f2 = i * size;
                float f3 = ((-fMin) * f) + f2;
                float f4 = (fMin * f) - f2;
                rectF.set(f3, f3, f4, f4);
            }
            RectF rectF2 = this.XXX11i;
            Intrinsics.XXI(rectF2);
            float f5 = -oxo2.XOO0ii0();
            Paint paint2 = this.f55010IO;
            Intrinsics.XXI(paint2);
            canvas.drawArc(rectF2, 360 - fXOO0ii0, f5, true, paint2);
            fXOO0ii0 += oxo2.XOO0ii0();
        }
        Paint paint3 = this.f55010IO;
        if (paint3 != null) {
            paint3.setColor(gk4.m1859iO(getContext(), R.color.view_page_secondary_bg));
        }
        RectF rectF3 = this.XXX11i;
        if (rectF3 != null) {
            float f6 = (-fMin) - 15.0f;
            float f7 = fMin - (-15.0f);
            rectF3.set(f6, f6, f7, f7);
        }
        RectF rectF4 = this.XXX11i;
        Intrinsics.XXI(rectF4);
        Paint paint4 = this.f55010IO;
        Intrinsics.XXI(paint4);
        canvas.drawArc(rectF4, 0.0f, 360.0f, true, paint4);
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.iX1O1 = i;
        this.X11iII1O1 = i2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MyPieChart(@aa1 Context context, @tb1 AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.X0O(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MyPieChart(@aa1 Context context, @tb1 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.X0O(context, "context");
        ArrayList<OXO1> arrayList = new ArrayList<>();
        this.f55009I1 = arrayList;
        Paint paint = new Paint();
        this.f55010IO = paint;
        paint.setColor(-1);
        Paint paint2 = this.f55010IO;
        if (paint2 != null) {
            paint2.setStyle(Paint.Style.FILL);
        }
        Paint paint3 = this.f55010IO;
        if (paint3 != null) {
            paint3.setTextSize(30.0f);
        }
        this.XXX11i = new RectF();
        arrayList.add(new OXO1(1L, getResources().getColor(R.color.hr_scope_color_4), 0.0f, 0.0f, 12, null));
    }

    public /* synthetic */ MyPieChart(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
