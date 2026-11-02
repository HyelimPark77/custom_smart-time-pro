package com.sma.smartv3.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.github.mikephil.charting.charts.LineChart;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class MyLineChart extends LineChart {
    public boolean IX0iIX;

    @JvmOverloads
    public MyLineChart(@aa1 Context r8) {
        Intrinsics.X0O(r8, "context");
        AttributeSet r3 = null;
        int r4 = 0;
        this(r8, r3, r4, 6, null);
    }

    public final boolean getDisallowIntercept() {
        return this.IX0iIX;
    }

    @Override // com.github.mikephil.charting.charts.BarLineChartBase, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(@tb1 MotionEvent r3) {
        if (r3 == null) goto L7;
        if (r3.getAction() != 2) goto L7;
        getParent().requestDisallowInterceptTouchEvent(this.IX0iIX);
    L7:
        return super.onTouchEvent(r3);
    }

    public final void setDisallowIntercept(boolean r1) {
        this.IX0iIX = r1;
    }

    @JvmOverloads
    public MyLineChart(@aa1 Context r8, @tb1 AttributeSet r9) {
        Intrinsics.X0O(r8, "context");
        int r4 = 0;
        this(r8, r9, r4, 4, null);
    }

    @JvmOverloads
    public MyLineChart(@aa1 Context r2, @tb1 AttributeSet r3, int r4) {
        Intrinsics.X0O(r2, "context");
        super(r2, r3, r4);
        this.IX0iIX = true;
    }

    public /* synthetic */ MyLineChart(Context r1, AttributeSet r2, int r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = null;
    L6:
        if ((r4 & 4) == 0) goto L8;
        r3 = 0;
    L8:
        this(r1, r2, r3);
    }
}
