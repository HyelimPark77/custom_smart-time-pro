package com.sma.smartv3.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.core.app.NotificationCompat;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.github.mikephil.charting.charts.BarChart;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class CustomBarChartView extends BarChart {

    @tb1
    public OXO1 XIO11I;

    public interface OXO1 {
        void OXO1(@aa1 MotionEvent r1);
    }

    @JvmOverloads
    public CustomBarChartView(@aa1 Context r8) {
        Intrinsics.X0O(r8, "context");
        AttributeSet r3 = null;
        int r4 = 0;
        this(r8, r3, r4, 6, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(@aa1 MotionEvent r2) {
        Intrinsics.X0O(r2, NotificationCompat.CATEGORY_EVENT);
        OXO1 r0 = this.XIO11I;
        if (r0 == null) goto L6;
        r0.OXO1(r2);
    L6:
        return super.dispatchTouchEvent(r2);
    }

    public final void setOnChartTouchListener(@tb1 OXO1 r1) {
        this.XIO11I = r1;
    }

    @JvmOverloads
    public CustomBarChartView(@aa1 Context r8, @tb1 AttributeSet r9) {
        Intrinsics.X0O(r8, "context");
        int r4 = 0;
        this(r8, r9, r4, 4, null);
    }

    @JvmOverloads
    public CustomBarChartView(@aa1 Context r2, @tb1 AttributeSet r3, int r4) {
        Intrinsics.X0O(r2, "context");
        super(r2, r3, r4);
    }

    public /* synthetic */ CustomBarChartView(Context r1, AttributeSet r2, int r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = null;
    L6:
        if ((r4 & 4) == 0) goto L8;
        r3 = 0;
    L8:
        this(r1, r2, r3);
    }
}
