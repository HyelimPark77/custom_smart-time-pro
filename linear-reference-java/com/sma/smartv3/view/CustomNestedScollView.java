package com.sma.smartv3.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.core.widget.NestedScrollView;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class CustomNestedScollView extends NestedScrollView {
    private boolean mDisableNestedInterceptTouchEvent;

    @JvmOverloads
    public CustomNestedScollView(@aa1 Context r8) {
        Intrinsics.X0O(r8, "context");
        AttributeSet r3 = null;
        int r4 = 0;
        this(r8, r3, r4, 6, null);
    }

    public final void disableNestedInterceptTouchEvent(boolean r1) {
        this.mDisableNestedInterceptTouchEvent = r1;
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(@aa1 MotionEvent r2) {
        Intrinsics.X0O(r2, "ev");
        if (this.mDisableNestedInterceptTouchEvent == false) goto L5;
        return false;
    L5:
        return super.onInterceptTouchEvent(r2);
    }

    @JvmOverloads
    public CustomNestedScollView(@aa1 Context r8, @tb1 AttributeSet r9) {
        Intrinsics.X0O(r8, "context");
        int r4 = 0;
        this(r8, r9, r4, 4, null);
    }

    @JvmOverloads
    public CustomNestedScollView(@aa1 Context r2, @tb1 AttributeSet r3, int r4) {
        Intrinsics.X0O(r2, "context");
        super(r2, r3, r4);
    }

    public /* synthetic */ CustomNestedScollView(Context r1, AttributeSet r2, int r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = null;
    L6:
        if ((r4 & 4) == 0) goto L8;
        r3 = 0;
    L8:
        this(r1, r2, r3);
    }
}
