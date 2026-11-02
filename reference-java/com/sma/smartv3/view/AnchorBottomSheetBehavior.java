package com.sma.smartv3.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.NestedScrollingChild;
import androidx.core.view.ViewCompat;
import androidx.customview.widget.ViewDragHelper;
import com.google.android.material.C9757R;
import com.sma.smartv3.C15429R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Vector;

/* JADX INFO: loaded from: classes3.dex */
public class AnchorBottomSheetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {
    private static final int DEFAULT_ANCHOR_POINT = 700;
    private static final float HIDE_FRICTION = 0.1f;
    private static final float HIDE_THRESHOLD = 0.5f;
    public static final int STATE_ANCHOR_POINT = 3;
    public static final int STATE_COLLAPSED = 5;
    public static final int STATE_DRAGGING = 1;
    public static final int STATE_EXPANDED = 4;
    public static final int STATE_HIDDEN = 6;
    public static final int STATE_SETTLING = 2;
    private int mActivePointerId;
    private int mAnchorPoint;
    private Vector<XIi00iiXO> mCallback;
    private boolean mCollapsible;
    private final ViewDragHelper.Callback mDragCallback;
    private boolean mHideable;
    private boolean mIgnoreEvents;
    private int mInitialY;
    private int mLastStableState;
    private int mMaxOffset;
    private int mMinOffset;
    private float mMinimumVelocity;
    private boolean mNestedScrolled;
    private WeakReference<View> mNestedScrollingChildRef;
    private int mParentHeight;
    private int mPeekHeight;
    private AnchorBottomSheetBehavior<V>.C19063iO mScrollVelocityTracker;
    private int mState;
    private boolean mTouchingScrollingChild;
    private ViewDragHelper mViewDragHelper;
    private WeakReference<V> mViewRef;

    @Retention(RetentionPolicy.SOURCE)
    public @interface O00 {
    }

    public class OXO1 extends ViewDragHelper.Callback {
        public OXO1() {
        }

        public int OXO1(int amount, int low, int high) {
            if (amount < low) {
                return low;
            }
            return amount > high ? high : amount;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int clampViewPositionHorizontal(View child, int left, int dx) {
            return child.getLeft();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int clampViewPositionVertical(View child, int top, int dy) {
            return OXO1(top, AnchorBottomSheetBehavior.this.mMinOffset, AnchorBottomSheetBehavior.this.mHideable ? AnchorBottomSheetBehavior.this.mParentHeight : AnchorBottomSheetBehavior.this.mMaxOffset);
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int getViewVerticalDragRange(View child) {
            int i;
            int i2;
            if (AnchorBottomSheetBehavior.this.mHideable) {
                i = AnchorBottomSheetBehavior.this.mParentHeight;
                i2 = AnchorBottomSheetBehavior.this.mMinOffset;
            } else {
                i = AnchorBottomSheetBehavior.this.mMaxOffset;
                i2 = AnchorBottomSheetBehavior.this.mMinOffset;
            }
            return i - i2;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewDragStateChanged(int state) {
            if (state == 1) {
                AnchorBottomSheetBehavior.this.setStateInternal(1);
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewPositionChanged(View changedView, int left, int top, int dx, int dy) {
            AnchorBottomSheetBehavior.this.dispatchOnSlide(top);
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewReleased(View releasedChild, float xvel, float yvel) {
            int i;
            int i2 = 4;
            if (yvel < 0.0f) {
                i = AnchorBottomSheetBehavior.this.mMinOffset;
            } else if (AnchorBottomSheetBehavior.this.mHideable && AnchorBottomSheetBehavior.this.shouldHide(releasedChild, yvel)) {
                i = AnchorBottomSheetBehavior.this.mParentHeight;
                i2 = 6;
            } else {
                if (yvel == 0.0f) {
                    int top = releasedChild.getTop();
                    if (Math.abs(top - AnchorBottomSheetBehavior.this.mMinOffset) < Math.abs(top - AnchorBottomSheetBehavior.this.mMaxOffset)) {
                        i = AnchorBottomSheetBehavior.this.mMinOffset;
                    } else {
                        i = AnchorBottomSheetBehavior.this.mMaxOffset;
                    }
                } else {
                    i = AnchorBottomSheetBehavior.this.mMaxOffset;
                }
                i2 = 5;
            }
            if (!AnchorBottomSheetBehavior.this.mCollapsible && i2 == 5) {
                i = AnchorBottomSheetBehavior.this.mAnchorPoint;
                i2 = 3;
            }
            if (!AnchorBottomSheetBehavior.this.mViewDragHelper.settleCapturedViewAt(releasedChild.getLeft(), i)) {
                AnchorBottomSheetBehavior.this.setStateInternal(i2);
            } else {
                AnchorBottomSheetBehavior.this.setStateInternal(2);
                ViewCompat.postOnAnimation(releasedChild, new XO0O10(releasedChild, i2));
            }
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public boolean tryCaptureView(View child, int pointerId) {
            View view;
            if (AnchorBottomSheetBehavior.this.mState == 1 || AnchorBottomSheetBehavior.this.mTouchingScrollingChild) {
                return false;
            }
            return ((AnchorBottomSheetBehavior.this.mState == 4 && AnchorBottomSheetBehavior.this.mActivePointerId == pointerId && (view = (View) AnchorBottomSheetBehavior.this.mNestedScrollingChildRef.get()) != null && view.canScrollVertically(-1)) || AnchorBottomSheetBehavior.this.mViewRef == null || AnchorBottomSheetBehavior.this.mViewRef.get() != child) ? false : true;
        }
    }

    public static abstract class XIi00iiXO {
        public abstract void OXO1(@NonNull View bottomSheet, float slideOffset);

        public abstract void XIi00iiXO(@NonNull View bottomSheet, int newState);
    }

    public class XO0O10 implements Runnable {

        /* JADX INFO: renamed from: I1 */
        public final int f54952I1;

        /* JADX INFO: renamed from: IO */
        public final View f54953IO;

        public XO0O10(View view, int targetState) {
            this.f54953IO = view;
            this.f54952I1 = targetState;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (AnchorBottomSheetBehavior.this.mViewDragHelper == null || !AnchorBottomSheetBehavior.this.mViewDragHelper.continueSettling(true)) {
                AnchorBottomSheetBehavior.this.setStateInternal(this.f54952I1);
            } else {
                ViewCompat.postOnAnimation(this.f54953IO, this);
            }
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.view.AnchorBottomSheetBehavior$iO */
    public class C19063iO {
        public long OXO1;
        public float XIi00iiXO;

        public void OXO1() {
            this.OXO1 = 0L;
            this.XIi00iiXO = 0.0f;
        }

        public float XIi00iiXO() {
            return this.XIi00iiXO;
        }

        /* JADX INFO: renamed from: iO */
        public void m38872iO(int dy) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = this.OXO1;
            if (j != 0) {
                this.XIi00iiXO = (dy / (jCurrentTimeMillis - j)) * 1000.0f;
            }
            this.OXO1 = jCurrentTimeMillis;
        }

        public C19063iO() {
            this.OXO1 = 0L;
            this.XIi00iiXO = 0.0f;
        }
    }

    public AnchorBottomSheetBehavior() {
        this.mState = 3;
        this.mLastStableState = 3;
        this.mScrollVelocityTracker = new C19063iO();
        this.mDragCallback = new OXO1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchOnSlide(int top) {
        V v = this.mViewRef.get();
        if (v == null || this.mCallback == null) {
            return;
        }
        int i = this.mMaxOffset;
        if (top > i) {
            notifyOnSlideToListeners(v, (i - top) / this.mPeekHeight);
        } else {
            notifyOnSlideToListeners(v, (i - top) / (i - this.mMinOffset));
        }
    }

    private View findScrollingChild(View view) {
        if (view instanceof NestedScrollingChild) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View viewFindScrollingChild = findScrollingChild(viewGroup.getChildAt(i));
            if (viewFindScrollingChild != null) {
                return viewFindScrollingChild;
            }
        }
        return null;
    }

    public static <V extends View> AnchorBottomSheetBehavior<V> from(V view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.LayoutParams)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior();
        if (behavior instanceof AnchorBottomSheetBehavior) {
            return (AnchorBottomSheetBehavior) behavior;
        }
        throw new IllegalArgumentException("The view is not associated with AnchorBottomSheetBehavior");
    }

    private void notifyOnSlideToListeners(@NonNull View bottomSheet, float slideOffset) {
        Iterator<XIi00iiXO> it = this.mCallback.iterator();
        while (it.hasNext()) {
            it.next().OXO1(bottomSheet, slideOffset);
        }
    }

    private void notifyStateChangedToListeners(@NonNull View bottomSheet, int newState) {
        Iterator<XIi00iiXO> it = this.mCallback.iterator();
        while (it.hasNext()) {
            it.next().XIi00iiXO(bottomSheet, newState);
        }
    }

    private void reset() {
        this.mActivePointerId = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStateInternal(int state) {
        if (this.mState == state) {
            return;
        }
        this.mState = state;
        V v = this.mViewRef.get();
        if (v == null || this.mCallback == null) {
            return;
        }
        notifyStateChangedToListeners(v, state);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean shouldHide(View child, float yvel) {
        return child.getTop() >= this.mMaxOffset && Math.abs((((float) child.getTop()) + (yvel * 0.1f)) - ((float) this.mMaxOffset)) / ((float) this.mPeekHeight) > 0.5f;
    }

    public void addBottomSheetCallback(XIi00iiXO callback) {
        if (this.mCallback == null) {
            this.mCallback = new Vector<>();
        }
        this.mCallback.add(callback);
    }

    public int getAnchorPoint() {
        return this.mAnchorPoint;
    }

    public final int getPeekHeight() {
        return this.mPeekHeight;
    }

    public final int getState() {
        return this.mState;
    }

    public boolean isCollapsible() {
        return this.mCollapsible;
    }

    public boolean isHideable() {
        return this.mHideable;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onInterceptTouchEvent(CoordinatorLayout parent, V child, MotionEvent event) {
        if (!child.isShown()) {
            this.mIgnoreEvents = true;
            return false;
        }
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            reset();
        }
        if (actionMasked == 0) {
            this.mScrollVelocityTracker.OXO1();
            int x = (int) event.getX();
            this.mInitialY = (int) event.getY();
            if (this.mState == 3) {
                this.mActivePointerId = event.getPointerId(event.getActionIndex());
                this.mTouchingScrollingChild = true;
            } else {
                View view = this.mNestedScrollingChildRef.get();
                if (view != null && parent.isPointInChildBounds(view, x, this.mInitialY)) {
                    this.mActivePointerId = event.getPointerId(event.getActionIndex());
                    this.mTouchingScrollingChild = true;
                }
            }
            this.mIgnoreEvents = this.mActivePointerId == -1 && !parent.isPointInChildBounds(child, x, this.mInitialY);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.mTouchingScrollingChild = false;
            this.mActivePointerId = -1;
            if (this.mIgnoreEvents) {
                this.mIgnoreEvents = false;
                return false;
            }
        }
        if (!this.mIgnoreEvents && this.mViewDragHelper.shouldInterceptTouchEvent(event)) {
            return true;
        }
        View view2 = this.mNestedScrollingChildRef.get();
        return (actionMasked != 2 || view2 == null || this.mIgnoreEvents || this.mState == 1 || parent.isPointInChildBounds(view2, (int) event.getX(), (int) event.getY()) || Math.abs(((float) this.mInitialY) - event.getY()) <= ((float) this.mViewDragHelper.getTouchSlop())) ? false : true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(CoordinatorLayout parent, V child, int layoutDirection) {
        int i = this.mState;
        if (i != 1 && i != 2) {
            if (parent.getFitsSystemWindows() && !child.getFitsSystemWindows()) {
                child.setFitsSystemWindows(true);
            }
            parent.onLayoutChild(child, layoutDirection);
        }
        int height = parent.getHeight();
        this.mParentHeight = height;
        int iMax = Math.max(0, height - child.getHeight());
        this.mMinOffset = iMax;
        int iMax2 = Math.max(this.mParentHeight - this.mPeekHeight, iMax);
        this.mMaxOffset = iMax2;
        int i2 = this.mState;
        if (i2 == 3) {
            ViewCompat.offsetTopAndBottom(child, this.mAnchorPoint);
        } else if (i2 == 4) {
            ViewCompat.offsetTopAndBottom(child, this.mMinOffset);
        } else if (this.mHideable && i2 == 6) {
            ViewCompat.offsetTopAndBottom(child, this.mParentHeight);
        } else if (i2 == 5) {
            ViewCompat.offsetTopAndBottom(child, iMax2);
        }
        if (this.mViewDragHelper == null) {
            this.mViewDragHelper = ViewDragHelper.create(parent, this.mDragCallback);
        }
        this.mViewRef = new WeakReference<>(child);
        this.mNestedScrollingChildRef = new WeakReference<>(findScrollingChild(child));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, V child, View target, float velocityX, float velocityY) {
        if (target == this.mNestedScrollingChildRef.get()) {
            return this.mState != 4 || super.onNestedPreFling(coordinatorLayout, child, target, velocityX, velocityY);
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, V child, View target, int dx, int dy, int[] consumed, int type) {
        if (target != this.mNestedScrollingChildRef.get()) {
            return;
        }
        this.mScrollVelocityTracker.m38872iO(dy);
        int top = child.getTop();
        int i = top - dy;
        int i2 = this.mLastStableState;
        if ((i2 == 5 && i < this.mAnchorPoint) || (i2 == 4 && i > this.mAnchorPoint)) {
            consumed[1] = dy;
            ViewCompat.offsetTopAndBottom(child, this.mAnchorPoint - top);
            dispatchOnSlide(child.getTop());
            this.mNestedScrolled = true;
            return;
        }
        if (dy > 0) {
            int i3 = this.mMinOffset;
            if (i < i3) {
                int i4 = top - i3;
                consumed[1] = i4;
                ViewCompat.offsetTopAndBottom(child, -i4);
                setStateInternal(4);
            } else {
                consumed[1] = dy;
                ViewCompat.offsetTopAndBottom(child, -dy);
                setStateInternal(1);
            }
        } else if (dy < 0 && !ViewCompat.canScrollVertically(target, -1)) {
            int i5 = this.mMaxOffset;
            if (i <= i5 || this.mHideable) {
                boolean z = this.mCollapsible;
                if (z || (!z && this.mAnchorPoint - i >= 0)) {
                    consumed[1] = dy;
                    ViewCompat.offsetTopAndBottom(child, -dy);
                    setStateInternal(1);
                }
            } else {
                int i6 = top - i5;
                consumed[1] = i6;
                ViewCompat.offsetTopAndBottom(child, -i6);
                setStateInternal(5);
            }
        }
        dispatchOnSlide(child.getTop());
        this.mNestedScrolled = true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onRestoreInstanceState(CoordinatorLayout parent, V child, Parcelable state) {
        SavedState savedState = (SavedState) state;
        super.onRestoreInstanceState(parent, child, savedState.getSuperState());
        int i = savedState.f54951IO;
        if (i == 1 || i == 2) {
            this.mState = 5;
        } else {
            this.mState = i;
        }
        this.mLastStableState = this.mState;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public Parcelable onSaveInstanceState(CoordinatorLayout parent, V child) {
        return new SavedState(super.onSaveInstanceState(parent, child), this.mState);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V child, View directTargetChild, View target, int nestedScrollAxes, int type) {
        this.mNestedScrolled = false;
        return (nestedScrollAxes & 2) != 0;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, V child, View target, int type) {
        int i;
        int i2 = 4;
        if (child.getTop() == this.mMinOffset) {
            setStateInternal(4);
            this.mLastStableState = 4;
            return;
        }
        if (target == this.mNestedScrollingChildRef.get() && this.mNestedScrolled) {
            float fXIi00iiXO = this.mScrollVelocityTracker.XIi00iiXO();
            float f = this.mMinimumVelocity;
            if (fXIi00iiXO > f) {
                int i3 = this.mLastStableState;
                if (i3 == 5) {
                    i = this.mAnchorPoint;
                    i2 = 3;
                } else {
                    i = i3 == 3 ? this.mMinOffset : this.mMinOffset;
                }
            } else if (fXIi00iiXO < (-f)) {
                int i4 = this.mLastStableState;
                if (i4 != 4 && this.mCollapsible) {
                    i = i4 == 3 ? this.mMaxOffset : this.mMaxOffset;
                    i2 = 5;
                } else {
                    i = this.mAnchorPoint;
                    i2 = 3;
                }
            } else {
                double top = child.getTop();
                i = this.mAnchorPoint;
                if (top > ((double) i) * 1.25d && this.mCollapsible) {
                    i = this.mMaxOffset;
                    i2 = 5;
                } else if (top < ((double) i) * 0.5d) {
                    i = this.mMinOffset;
                } else {
                    i2 = 3;
                }
            }
            this.mLastStableState = i2;
            if (this.mViewDragHelper.smoothSlideViewTo(child, child.getLeft(), i)) {
                setStateInternal(2);
                ViewCompat.postOnAnimation(child, new XO0O10(child, i2));
            } else {
                setStateInternal(i2);
            }
            this.mNestedScrolled = false;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onTouchEvent(CoordinatorLayout parent, V child, MotionEvent event) {
        if (!child.isShown()) {
            return false;
        }
        int actionMasked = event.getActionMasked();
        if (this.mState == 1 && actionMasked == 0) {
            return true;
        }
        if (this.mLastStableState == 3 && actionMasked == 2 && event.getY() > this.mInitialY && !this.mCollapsible) {
            reset();
            return false;
        }
        if (this.mViewDragHelper == null) {
            this.mViewDragHelper = ViewDragHelper.create(parent, this.mDragCallback);
        }
        this.mViewDragHelper.processTouchEvent(event);
        if (actionMasked == 0) {
            reset();
        }
        if (actionMasked == 2 && !this.mIgnoreEvents && Math.abs(this.mInitialY - event.getY()) > this.mViewDragHelper.getTouchSlop()) {
            this.mViewDragHelper.captureChildView(child, event.getPointerId(event.getActionIndex()));
        }
        return !this.mIgnoreEvents;
    }

    public void setAnchorPoint(int anchorPoint) {
        this.mAnchorPoint = anchorPoint;
    }

    public void setCollapsible(boolean collapsible) {
        this.mCollapsible = collapsible;
    }

    public void setHideable(boolean hideable) {
        this.mHideable = hideable;
    }

    public final void setPeekHeight(int peekHeight) {
        this.mPeekHeight = Math.max(0, peekHeight);
        this.mMaxOffset = this.mParentHeight - peekHeight;
    }

    public final void setState(int state) {
        int i;
        if (state == this.mState) {
            return;
        }
        if (state == 5 || state == 4 || state == 3 || (this.mHideable && state == 6)) {
            this.mState = state;
            this.mLastStableState = state;
        }
        WeakReference<V> weakReference = this.mViewRef;
        V v = weakReference == null ? null : weakReference.get();
        if (v == null) {
            return;
        }
        if (state == 5) {
            i = this.mMaxOffset;
        } else if (state == 3) {
            i = this.mAnchorPoint;
        } else if (state == 4) {
            i = this.mMinOffset;
        } else {
            if (!this.mHideable || state != 6) {
                throw new IllegalArgumentException("Illegal state argument: " + state);
            }
            i = this.mParentHeight;
        }
        setStateInternal(2);
        if (this.mViewDragHelper.smoothSlideViewTo(v, v.getLeft(), i)) {
            ViewCompat.postOnAnimation(v, new XO0O10(v, state));
        }
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new OXO1();

        /* JADX INFO: renamed from: IO */
        public final int f54951IO;

        public class OXO1 implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel source) {
                return new SavedState(source);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: XIi00iiXO, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int size) {
                return new SavedState[size];
            }
        }

        public SavedState(Parcel source) {
            super(source);
            this.f54951IO = source.readInt();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel out, int flags) {
            super.writeToParcel(out, flags);
            out.writeInt(this.f54951IO);
        }

        public SavedState(Parcelable superState, int state) {
            super(superState);
            this.f54951IO = state;
        }
    }

    public AnchorBottomSheetBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.mState = 3;
        this.mLastStableState = 3;
        this.mScrollVelocityTracker = new C19063iO();
        this.mDragCallback = new OXO1();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, C9757R.styleable.BottomSheetBehavior_Layout);
        setPeekHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(9, 0));
        setHideable(typedArrayObtainStyledAttributes.getBoolean(8, false));
        typedArrayObtainStyledAttributes.recycle();
        this.mAnchorPoint = 700;
        this.mCollapsible = true;
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attrs, C15429R.styleable.AnchorBottomSheetBehavior);
        if (attrs != null) {
            this.mAnchorPoint = (int) typedArrayObtainStyledAttributes2.getDimension(0, 0.0f);
            this.mState = typedArrayObtainStyledAttributes2.getInt(1, 3);
        }
        typedArrayObtainStyledAttributes2.recycle();
        this.mMinimumVelocity = ViewConfiguration.get(context).getScaledMinimumFlingVelocity();
    }
}
