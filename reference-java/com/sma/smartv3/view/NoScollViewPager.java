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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NoScollViewPager(@aa1 Context context, @aa1 AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.X0O(context, "context");
        Intrinsics.X0O(attrs, "attrs");
        this.canScoll = true;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(@aa1 MotionEvent ev) {
        Intrinsics.X0O(ev, "ev");
        return this.canScoll && super.onInterceptTouchEvent(ev);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(@aa1 MotionEvent ev) {
        Intrinsics.X0O(ev, "ev");
        return this.canScoll && super.onTouchEvent(ev);
    }

    public final void setCanScoll(boolean z) {
        this.canScoll = z;
    }
}
