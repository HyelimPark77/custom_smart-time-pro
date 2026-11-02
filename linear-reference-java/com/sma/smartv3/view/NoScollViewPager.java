package com.sma.smartv3.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;
import com.android.mltcode.paycertificationapi.aa1;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public class NoScollViewPager extends ViewPager {
    private boolean canScoll;

    @JvmOverloads
    public NoScollViewPager(@aa1 Context r2, @aa1 AttributeSet r3) {
        Intrinsics.X0O(r2, "context");
        Intrinsics.X0O(r3, "attrs");
        super(r2, r3);
        this.canScoll = true;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(@aa1 MotionEvent r2) {
        Intrinsics.X0O(r2, "ev");
        if (this.canScoll == true) goto L5;
        return false;
    L5:
        if (super.onInterceptTouchEvent(r2) == false) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(@aa1 MotionEvent r2) {
        Intrinsics.X0O(r2, "ev");
        if (this.canScoll == true) goto L5;
        return false;
    L5:
        if (super.onTouchEvent(r2) == false) goto L10;
        return true;
    L10:
        return false;
    }

    public final void setCanScoll(boolean r1) {
        this.canScoll = r1;
    }
}
