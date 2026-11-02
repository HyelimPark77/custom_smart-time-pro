package com.sma.smartv3.view.swipelist;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ListView;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes3.dex */
public class SwipeListView extends ListView {

    /* JADX INFO: renamed from: IO */
    public boolean f55113IO;

    public SwipeListView(Context context) {
        super(context);
        this.f55113IO = true;
    }

    public void OXO1() {
        if (this.f55113IO) {
            this.f55113IO = false;
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                SwipeLayout swipeLayout = (SwipeLayout) getChildAt(i).findViewById(R.id.swipe_layout);
                if (swipeLayout != null) {
                    swipeLayout.O00(true);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent ev) {
        if (ev.getAction() == 0) {
            this.f55113IO = true;
        }
        return super.dispatchTouchEvent(ev);
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent ev) {
        if (ev.getAction() == 2) {
            OXO1();
        }
        return super.onTouchEvent(ev);
    }

    public SwipeListView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f55113IO = true;
    }

    public SwipeListView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.f55113IO = true;
    }
}
