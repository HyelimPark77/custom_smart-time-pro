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

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VerticalScrollImageView(@aa1 Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.X0O(context, "context");
    }

    @Override // android.view.View
    public void computeScroll() {
        Scroller scroller = this.mScroller;
        Scroller scroller2 = null;
        if (scroller == null) {
            Intrinsics.XXO("mScroller");
            scroller = null;
        }
        if (scroller.computeScrollOffset()) {
            Scroller scroller3 = this.mScroller;
            if (scroller3 == null) {
                Intrinsics.XXO("mScroller");
            } else {
                scroller2 = scroller3;
            }
            int currY = scroller2.getCurrY();
            layout(getLeft(), currY, getRight(), getHeight() + currY);
            postInvalidate();
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        Object parent = getParent();
        if (parent instanceof View) {
            ((View) parent).getHitRect(this.mParentBounds);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(@tb1 MotionEvent motionEvent) {
        Scroller scroller = null;
        Float fValueOf = motionEvent != null ? Float.valueOf(motionEvent.getRawY()) : null;
        Integer numValueOf = motionEvent != null ? Integer.valueOf(motionEvent.getAction()) : null;
        int height = 0;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            this.isDragging = false;
            Intrinsics.XXI(fValueOf);
            this.mLastY = fValueOf.floatValue();
            Scroller scroller2 = this.mScroller;
            if (scroller2 == null) {
                Intrinsics.XXO("mScroller");
            } else {
                scroller = scroller2;
            }
            scroller.forceFinished(true);
            this.haveMove = false;
        } else if (numValueOf != null && numValueOf.intValue() == 2) {
            Intrinsics.XXI(fValueOf);
            float fFloatValue = fValueOf.floatValue() - this.mLastY;
            if (Math.abs(fFloatValue) > this.mTouchSlop) {
                this.isDragging = true;
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            if (this.isDragging) {
                int top = getTop() + ((int) fFloatValue);
                if (top >= 0) {
                    int height2 = getHeight() + top;
                    Rect rect = this.mParentBounds;
                    int i = rect.bottom;
                    int i2 = rect.top;
                    height = height2 > i - i2 ? (i - i2) - getHeight() : top;
                }
                layout(getLeft(), height, getRight(), getHeight() + height);
                this.haveMove = true;
                this.mLastY = fValueOf.floatValue();
            }
        } else if (numValueOf != null && numValueOf.intValue() == 1) {
            if (!this.haveMove) {
                performClick();
            }
        } else if (numValueOf != null && numValueOf.intValue() == 3) {
            this.isDragging = false;
        }
        return true;
    }

    public final void smoothScrollTo(int i) {
        int top = getTop();
        int i2 = i - top;
        Scroller scroller = this.mScroller;
        if (scroller == null) {
            Intrinsics.XXO("mScroller");
            scroller = null;
        }
        scroller.startScroll(0, top, 0, i2, 500);
        invalidate();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VerticalScrollImageView(@aa1 Context context, @tb1 AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.X0O(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VerticalScrollImageView(@aa1 Context context, @tb1 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.X0O(context, "context");
        this.TAG = "VerticalScrollImageView";
        this.mParentBounds = new Rect();
        this.mScroller = new Scroller(context);
        this.mTouchSlop = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public /* synthetic */ VerticalScrollImageView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
