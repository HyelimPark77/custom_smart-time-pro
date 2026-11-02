package com.bestmafen.androidbase.viewpager;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;

/* JADX INFO: loaded from: classes13.dex */
public class NoSlideViewPager extends ViewPager {
    public NoSlideViewPager(Context r1, AttributeSet r2) {
        super(r1, r2);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent r1) {
        return false;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent r1) {
        return false;
    }

    public NoSlideViewPager(Context r1) {
        super(r1);
    }
}
