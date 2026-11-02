package com.sma.smartv3.view;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Scroller;
import androidx.appcompat.widget.AppCompatImageView;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public class VerticalScrollImageView extends AppCompatImageView {

    @aa1
    private final String TAG;
    private boolean haveMove;
    private boolean isDragging;
    private float mLastY;

    @aa1
    private Rect mParentBounds;
    private Scroller mScroller;
    private int mTouchSlop;

    @JvmOverloads
    public VerticalScrollImageView(@aa1 Context r8) {
        Intrinsics.X0O(r8, "context");
        AttributeSet r3 = null;
        int r4 = 0;
        this(r8, r3, r4, 6, null);
    }

    @Override // android.view.View
    public void computeScroll() {
        Scroller r0 = this.mScroller;
        Scroller r1 = null;
        if (r0 != null) goto L6;
        Intrinsics.XXO("mScroller");
        r0 = null;
    L6:
        if (r0.computeScrollOffset() == false) goto L13;
        Scroller r2 = this.mScroller;
        if (r2 != null) goto L10;
        Intrinsics.XXO("mScroller");
    L11:
        int r3 = r1.getCurrY();
        layout(getLeft(), r3, getRight(), getHeight() + r3);
        postInvalidate();
        return;
    L10:
        r1 = r2;
        goto L11
    }

    @Override // android.view.View
    public void onSizeChanged(int r1, int r2, int r3, int r4) {
        super.onSizeChanged(r1, r2, r3, r4);
        Object r5 = getParent();
        if ((r5 instanceof View) == false) goto L6;
        ((View) r5).getHitRect(this.mParentBounds);
        return;
    }

    @Override // android.view.View
    public boolean onTouchEvent(@tb1 MotionEvent r7) {
        Scroller r0 = null;
        if (r7 == null) goto L5;
        Float r1 = Float.valueOf(r7.getRawY());
    L6:
        if (r7 == null) goto L8;
        Integer r8 = Integer.valueOf(r7.getAction());
    L9:
        int r2 = 0;
        if (r8 != null) goto L13;
    L19:
        if (r8 != null) goto L22;
    L36:
        if (r8 != null) goto L39;
    L43:
        if (r8 != null) goto L46;
    L48:
        return true;
    L46:
        if (r8.intValue() != 3) goto L48;
        this.isDragging = false;
        goto L48
    L39:
        if (r8.intValue() != 1) goto L43;
        if (this.haveMove == true) goto L48;
        performClick();
        goto L48
    L22:
        if (r8.intValue() != 2) goto L36;
        Intrinsics.XXI(r1);
        float r9 = r1.floatValue() - this.mLastY;
        if (Math.abs(r9) <= this.mTouchSlop) goto L27;
        this.isDragging = true;
        getParent().requestDisallowInterceptTouchEvent(true);
    L27:
        if (this.isDragging == false) goto L48;
        int r3 = getTop() + ((int) r9);
        if (r3 < 0) goto L35;
        int r10 = getHeight() + r3;
        Rect r4 = this.mParentBounds;
        int r5 = r4.bottom;
        int r6 = r4.top;
        if (r10 <= (r5 - r6)) goto L34;
        r2 = (r5 - r6) - getHeight();
        goto L35
    L34:
        r2 = r3;
    L35:
        layout(getLeft(), r2, getRight(), getHeight() + r2);
        this.haveMove = true;
        this.mLastY = r1.floatValue();
        goto L48
    L13:
        if (r8.intValue() != 0) goto L19;
        this.isDragging = false;
        Intrinsics.XXI(r1);
        this.mLastY = r1.floatValue();
        Scroller r11 = this.mScroller;
        if (r11 != null) goto L17;
        Intrinsics.XXO("mScroller");
    L18:
        r0.forceFinished(true);
        this.haveMove = false;
        goto L48
    L17:
        r0 = r11;
        goto L18
    L8:
        r8 = null;
        goto L9
    L5:
        r1 = null;
        goto L6
    }

    public final void smoothScrollTo(int r7) {
        int r2 = getTop();
        int r4 = r7 - r2;
        Scroller r8 = this.mScroller;
        if (r8 != null) goto L5;
        Intrinsics.XXO("mScroller");
        r8 = null;
    L5:
        r8.startScroll(0, r2, 0, r4, 500);
        invalidate();
    }

    @JvmOverloads
    public VerticalScrollImageView(@aa1 Context r8, @tb1 AttributeSet r9) {
        Intrinsics.X0O(r8, "context");
        int r4 = 0;
        this(r8, r9, r4, 4, null);
    }

    @JvmOverloads
    public VerticalScrollImageView(@aa1 Context r2, @tb1 AttributeSet r3, int r4) {
        Intrinsics.X0O(r2, "context");
        super(r2, r3, r4);
        this.TAG = "VerticalScrollImageView";
        this.mParentBounds = new Rect();
        this.mScroller = new Scroller(r2);
        this.mTouchSlop = ViewConfiguration.get(r2).getScaledTouchSlop();
    }

    public /* synthetic */ VerticalScrollImageView(Context r1, AttributeSet r2, int r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = null;
    L6:
        if ((r4 & 4) == 0) goto L8;
        r3 = 0;
    L8:
        this(r1, r2, r3);
    }
}
