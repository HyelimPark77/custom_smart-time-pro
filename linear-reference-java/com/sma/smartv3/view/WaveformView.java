package com.sma.smartv3.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.tb1;
import com.blankj.utilcode.util.SizeUtils;
import com.sma.smartv3.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nWaveformView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WaveformView.kt\ncom/sma/smartv3/view/WaveformView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,89:1\n1878#2,3:90\n*S KotlinDebug\n*F\n+ 1 WaveformView.kt\ncom/sma/smartv3/view/WaveformView\n*L\n66#1:90,3\n*E\n"})
public final class WaveformView extends View {

    @aa1
    public final List<Float> I1;

    @aa1
    public final Paint IO;
    public final int iX1O1;

    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public WaveformView(@aa1 Context r3) {
        Intrinsics.X0O(r3, "context");
        this(r3, null, 2, 0 == true ? 1 : 0);
    }

    public final void OXO1(float r5) {
        this.I1.add(Float.valueOf(r5));
        if (this.I1.size() <= this.iX1O1) goto L5;
        this.I1.remove(0);
    L5:
        i1O0OXO1O.OXO1.OXO1("WaveformView amplitudes: " + this.I1.size() + " " + this.I1.get(0));
        invalidate();
    }

    public final float XIi00iiXO(int r1) {
        return SizeUtils.dp2px(r1);
    }

    public final float XO0O10(int r1) {
        return SizeUtils.sp2px(r1);
    }

    public final void iO(Context r3, AttributeSet r4) {
        TypedArray r5 = r3.obtainStyledAttributes(r4, R.styleable.WaveformView);
        Intrinsics.O10IXXX0X(r5, "obtainStyledAttributes(...)");
        this.IO.setColor(r5.getColor(0, Color.parseColor("#FF8C33")));     // Catch: Throwable -> L6
        r5.recycle();
        return;
    L6:
        th = move-exception;
        r5.recycle();
        throw th;
    }

    @Override // android.view.View
    public void onDraw(@aa1 Canvas r11) {
        Intrinsics.X0O(r11, "canvas");
        super.onDraw(r11);
        if (this.I1.isEmpty() == false) goto L5;
        return;
    L5:
        Path r0 = new Path();
        float r1 = getWidth() / this.iX1O1;
        Iterator<T> r2 = this.I1.iterator();
        int r3 = 0;
    L7:
        if (r2.hasNext() == false) goto L12;
        Object r4 = r2.next();
        int r5 = r3 + 1;
        if (r3 >= 0) goto L11;
        CollectionsKt__CollectionsKt.XOX0O0();
    L11:
        float r6 = r3 * r1;
        float r7 = ((Number) r4).floatValue() % getHeight();
        float r8 = r7 / 2;
        r0.moveTo(r6, ((getHeight() / 2) - XIi00iiXO(4)) - r8);
        r0.lineTo(r6, ((getHeight() / 2) + XIi00iiXO(4)) + r8);
        r3 = r5;
        goto L7
    L12:
        i1O0OXO1O.OXO1.OXO1("WaveformView amplitudes: " + this.I1.size() + " width " + getWidth() + " height " + getHeight());
        r11.drawPath(r0, this.IO);
    }

    @JvmOverloads
    public WaveformView(@aa1 Context r3, @tb1 AttributeSet r4) {
        Intrinsics.X0O(r3, "context");
        super(r3, r4);
        Paint r0 = new Paint();
        r0.setColor(Color.parseColor("#FF8C33"));
        r0.setStyle(Paint.Style.STROKE);
        r0.setStrokeWidth(XIi00iiXO(2));
        r0.setAntiAlias(true);
        this.IO = r0;
        this.I1 = new ArrayList();
        this.iX1O1 = 25;
        iO(r3, r4);
        int r5 = 0;
    L3:
        if (r5 >= 25) goto L5;
        this.I1.add(Float.valueOf(0.0f));
        r5 = r5 + 1;
        goto L3
    }

    public /* synthetic */ WaveformView(Context r1, AttributeSet r2, int r3, DefaultConstructorMarker r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = null;
    L5:
        this(r1, r2);
    }
}
