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
import java.util.Iterator;
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

    @aa1
    public final Set<Pair<Integer, RectF>> I1;

    @aa1
    public List<? extends iz3> IO;

    @aa1
    public final RectF X11iII1O1;
    public float X1IX;
    public int XXX11i;

    @aa1
    public final Paint iX1O1;

    @JvmOverloads
    public VerticalSegmentedBarView(@aa1 Context r8) {
        Intrinsics.X0O(r8, "context");
        AttributeSet r3 = null;
        int r4 = 0;
        this(r8, r3, r4, 6, null);
    }

    @Override // android.view.View
    public void onDraw(@aa1 Canvas r13) {
        Intrinsics.X0O(r13, "canvas");
        super.onDraw(r13);
        if (this.IO.isEmpty() == true) goto L32;
        this.I1.clear();
        this.X11iII1O1.set(0.0f, 0.0f, getWidth(), getHeight());
        float r1 = ((iz3) CollectionsKt___CollectionsKt.Xi1XO00(this.IO)).XO0O10();
        float r2 = ((iz3) CollectionsKt___CollectionsKt.IIII0iI(this.IO)).O00();
        RectF r3 = this.X11iII1O1;
        float r4 = (r3.bottom - r3.top) / (r1 - r2);
        Iterator<T> r5 = this.IO.iterator();
        int r6 = 0;
        int r7 = 0;
    L7:
        if (r5.hasNext() == false) goto L12;
        Object r8 = r5.next();
        int r9 = r7 + 1;
        if (r7 >= 0) goto L11;
        CollectionsKt__CollectionsKt.XOX0O0();
    L11:
        iz3 r10 = (iz3) r8;
        float r11 = this.X11iII1O1.bottom - ((r10.XO0O10() - r2) * r4);
        float r12 = this.X11iII1O1.bottom - ((r10.O00() - r2) * r4);
        RectF r14 = this.X11iII1O1;
        this.I1.add(TuplesKt.OXO1(Integer.valueOf(r10.OXO1()), new RectF(r14.left, r11, r14.right, r12)));
        r7 = r9;
        goto L7
    L12:
        int r15 = this.I1.size();
        Iterator<T> r16 = this.I1.iterator();
    L14:
        if (r16.hasNext() == false) goto L42;
        Object r17 = r16.next();
        int r18 = r6 + 1;
        if (r6 >= 0) goto L18;
        CollectionsKt__CollectionsKt.XOX0O0();
    L18:
        Pair r19 = (Pair) r17;
        this.iX1O1.setColor(((Number) r19.getFirst()).intValue());
        RectF r20 = new RectF((RectF) r19.getSecond());
        if (r6 != 0) goto L21;
    L24:
        float r21 = this.X1IX;
        r13.drawRoundRect(r20, r21, r21, this.iX1O1);
        if (r15 <= 1) goto L31;
        if (r6 != 0) goto L29;
        r13.drawRect(r20.left, r20.top, r20.right, r20.bottom - this.X1IX, this.iX1O1);
        goto L31
    L29:
        if (r6 != (r15 - 1)) goto L31;
        r13.drawRect(r20.left, r20.top + this.X1IX, r20.right, r20.bottom, this.iX1O1);
    L31:
        r6 = r18;
        goto L14
    L21:
        if (r6 == (r15 - 1)) goto L24;
        r13.drawRect(r20, this.iX1O1);
        goto L31
    L42:
        return;
    }

    public final void setSegments(@aa1 List<? extends iz3> r2) {
        Intrinsics.X0O(r2, "segments");
        this.IO = r2;
        invalidate();
    }

    @JvmOverloads
    public VerticalSegmentedBarView(@aa1 Context r8, @tb1 AttributeSet r9) {
        Intrinsics.X0O(r8, "context");
        int r4 = 0;
        this(r8, r9, r4, 4, null);
    }

    @JvmOverloads
    public VerticalSegmentedBarView(@aa1 Context r2, @tb1 AttributeSet r3, int r4) {
        Intrinsics.X0O(r2, "context");
        super(r2, r3, r4);
        this.IO = CollectionsKt__CollectionsKt.iI();
        this.I1 = new LinkedHashSet();
        Paint r5 = new Paint(1);
        this.iX1O1 = r5;
        this.X11iII1O1 = new RectF();
        this.XXX11i = -16776961;
        this.X1IX = 20.0f;
        r5.setStyle(Paint.Style.FILL);
        r5.setColor(this.XXX11i);
    }

    public /* synthetic */ VerticalSegmentedBarView(Context r1, AttributeSet r2, int r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = null;
    L6:
        if ((r4 & 4) == 0) goto L8;
        r3 = 0;
    L8:
        this(r1, r2, r3);
    }
}
