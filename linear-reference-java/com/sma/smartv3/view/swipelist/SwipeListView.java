package com.sma.smartv3.view.swipelist;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ListView;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes3.dex */
public class SwipeListView extends ListView {
    public boolean IO;

    public SwipeListView(Context context) {
        super(context);
        this.IO = true;
    }

    public void OXO1() {
        if (this.IO == false) goto L10;
        int r0 = 0;
        this.IO = false;
        int r1 = getChildCount();
    L5:
        if (r0 >= r1) goto L14;
        SwipeLayout r2 = (SwipeLayout) getChildAt(r0).findViewById(R.id.swipe_layout);
        if (r2 == null) goto L9;
        r2.O00(true);
    L9:
        r0 = r0 + 1;
        goto L5
    L14:
        return;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent ev) {
        if (ev.getAction() != 0) goto L7;
        this.IO = true;
    L7:
        return super.dispatchTouchEvent(ev);
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent ev) {
        if (ev.getAction() != 2) goto L7;
        OXO1();
    L7:
        return super.onTouchEvent(ev);
    }

    public SwipeListView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.IO = true;
    }

    public SwipeListView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.IO = true;
    }
}
