package com.sma.smartv3.otherdevice.jl.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

/* JADX INFO: loaded from: classes19.dex */
public class ViewPager2RecycleView extends RecyclerView {
    private MotionEvent mDownEvent;
    private float mStartX;

    public ViewPager2RecycleView(@NonNull Context context) {
        super(context);
        this.mDownEvent = null;
    }

    private ViewPager2 getViewPager2() {
        ViewParent r0 = this;
    L3:
        r0 = r0.getParent();
        if (r0 == null) goto L9;
        if ((r0 instanceof ViewPager2) == false) goto L3;
        return (ViewPager2) r0;
    L9:
        return null;
    }

    private void setViewPager2InputEnable(boolean enable) {
        ViewPager2 r0 = getViewPager2();
        if (r0 == null) goto L6;
        r0.setUserInputEnabled(enable);
        return;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent e) {
        int r0 = e.getAction();
        if (r0 != 0) goto L6;
        this.mDownEvent = e;
        this.mStartX = e.getX();
        setViewPager2InputEnable(false);
    L21:
        return super.dispatchTouchEvent(e);
    L6:
        if (r0 != 1) goto L8;
    L19:
        setViewPager2InputEnable(true);
        this.mDownEvent = null;
        goto L21
    L8:
        if (r0 == 3) goto L19;
        if (r0 != 2) goto L21;
        if (this.mDownEvent == null) goto L21;
        float r1 = e.getX() - this.mStartX;
        boolean r3 = canScrollHorizontally(1);
        boolean r4 = canScrollHorizontally(-1);
        if (r1 >= 0.0f) goto L17;
        setViewPager2InputEnable(!r3);
    L18:
        this.mDownEvent = null;
        goto L21
    L17:
        setViewPager2InputEnable(!r4);
        goto L18
    }

    public ViewPager2RecycleView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        this.mDownEvent = null;
    }

    public ViewPager2RecycleView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mDownEvent = null;
    }
}
