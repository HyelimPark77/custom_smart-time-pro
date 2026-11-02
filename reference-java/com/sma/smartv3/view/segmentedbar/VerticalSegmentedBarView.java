package com.sma.smartv3.view.segmentedbar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.iz3;
import com.android.mltcode.paycertificationapi.tb1;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nVerticalSegmentedBarView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VerticalSegmentedBarView.kt\ncom/sma/smartv3/view/segmentedbar/VerticalSegmentedBarView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,73:1\n1878#2,3:74\n1878#2,3:77\n*S KotlinDebug\n*F\n+ 1 VerticalSegmentedBarView.kt\ncom/sma/smartv3/view/segmentedbar/VerticalSegmentedBarView\n*L\n40#1:74,3\n47#1:77,3\n*E\n"})
public final class VerticalSegmentedBarView extends View {

    /* JADX INFO: renamed from: I1 */
    @aa1
    public final Set<Pair<Integer, RectF>> f55105I1;

    /* JADX INFO: renamed from: IO */
    @aa1
    public List<? extends iz3> f55106IO;

    @aa1
    public final RectF X11iII1O1;
    public float X1IX;
    public int XXX11i;

    @aa1
    public final Paint iX1O1;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VerticalSegmentedBarView(@aa1 Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.X0O(context, "context");
    }

    @Override // android.view.View
    public void onDraw(@aa1 Canvas canvas) {
        Intrinsics.X0O(canvas, "canvas");
        super.onDraw(canvas);
        if (this.f55106IO.isEmpty()) {
            return;
        }
        this.f55105I1.clear();
        this.X11iII1O1.set(0.0f, 0.0f, getWidth(), getHeight());
        float fXO0O10 = ((iz3) CollectionsKt___CollectionsKt.Xi1XO00(this.f55106IO)).XO0O10();
        float fO00 = ((iz3) CollectionsKt___CollectionsKt.IIII0iI(this.f55106IO)).O00();
        RectF rectF = this.X11iII1O1;
        float f = (rectF.bottom - rectF.top) / (fXO0O10 - fO00);
        int i = 0;
        int i2 = 0;
        for (Object obj : this.f55106IO) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt__CollectionsKt.XOX0O0();
            }
            iz3 iz3Var = (iz3) obj;
            float fXO0O11 = this.X11iII1O1.bottom - ((iz3Var.XO0O10() - fO00) * f);
            float fO01 = this.X11iII1O1.bottom - ((iz3Var.O00() - fO00) * f);
            RectF rectF2 = this.X11iII1O1;
            this.f55105I1.add(TuplesKt.OXO1(Integer.valueOf(iz3Var.OXO1()), new RectF(rectF2.left, fXO0O11, rectF2.right, fO01)));
            i2 = i3;
        }
        int size = this.f55105I1.size();
        for (Object obj2 : this.f55105I1) {
            int i4 = i + 1;
            if (i < 0) {
                CollectionsKt__CollectionsKt.XOX0O0();
            }
            Pair pair = (Pair) obj2;
            this.iX1O1.setColor(((Number) pair.getFirst()).intValue());
            RectF rectF3 = new RectF((RectF) pair.getSecond());
            if (i == 0 || i == size - 1) {
                float f2 = this.X1IX;
                canvas.drawRoundRect(rectF3, f2, f2, this.iX1O1);
                if (size > 1) {
                    if (i == 0) {
                        canvas.drawRect(rectF3.left, rectF3.top, rectF3.right, rectF3.bottom - this.X1IX, this.iX1O1);
                    } else if (i == size - 1) {
                        canvas.drawRect(rectF3.left, rectF3.top + this.X1IX, rectF3.right, rectF3.bottom, this.iX1O1);
                    }
                }
            } else {
                canvas.drawRect(rectF3, this.iX1O1);
            }
            i = i4;
        }
    }

    public final void setSegments(@aa1 List<? extends iz3> segments) {
        Intrinsics.X0O(segments, "segments");
        this.f55106IO = segments;
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VerticalSegmentedBarView(@aa1 Context context, @tb1 AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.X0O(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VerticalSegmentedBarView(@aa1 Context context, @tb1 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.X0O(context, "context");
        this.f55106IO = CollectionsKt__CollectionsKt.m39402iI();
        this.f55105I1 = new LinkedHashSet();
        Paint paint = new Paint(1);
        this.iX1O1 = paint;
        this.X11iII1O1 = new RectF();
        this.XXX11i = -16776961;
        this.X1IX = 20.0f;
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(this.XXX11i);
    }

    public /* synthetic */ VerticalSegmentedBarView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
