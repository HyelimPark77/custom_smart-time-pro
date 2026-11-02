package com.sma.smartv3.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.android.mltcode.paycertificationapi.aa1;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ViewPagerForScrollView extends NoScollViewPager {
    @JvmOverloads
    public ViewPagerForScrollView(@aa1 Context r2, @aa1 AttributeSet r3) {
        Intrinsics.X0O(r2, "context");
        Intrinsics.X0O(r3, "attrs");
        super(r2, r3);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public void onMeasure(int r6, int r7) {
        int r8 = getChildCount();
        int r1 = 0;
        int r2 = 0;
    L3:
        if (r1 >= r8) goto L8;
        View r3 = getChildAt(r1);
        r3.measure(r6, View.MeasureSpec.makeMeasureSpec(0, 0));
        int r4 = r3.getMeasuredHeight();
        if (r4 <= r2) goto L7;
        r2 = r4;
    L7:
        r1 = r1 + 1;
        goto L3
    L8:
        super.onMeasure(r6, View.MeasureSpec.makeMeasureSpec(r2, 1073741824));
    }
}
