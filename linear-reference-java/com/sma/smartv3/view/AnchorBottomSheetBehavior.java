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
import com.android.mltcode.paycertificationapi.XIXIXi;
import com.google.android.material.R;
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
    private AnchorBottomSheetBehavior<V>.iO mScrollVelocityTracker;
    private int mState;
    private boolean mTouchingScrollingChild;
    private ViewDragHelper mViewDragHelper;
    private WeakReference<V> mViewRef;

    @Retention(RetentionPolicy.SOURCE)
    public @interface O00 {
    }

    public class OXO1 extends ViewDragHelper.Callback {
        public final /* synthetic */ AnchorBottomSheetBehavior OXO1;

        public OXO1(final AnchorBottomSheetBehavior this$0) {
            this.OXO1 = this$0;
        }

        public int OXO1(int amount, int low, int high) {
            if (amount >= low) goto L4;
            return low;
        L4:
            if (amount <= high) goto L6;
            return high;
        L6:
            return amount;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int clampViewPositionHorizontal(View child, int left, int dx) {
            return child.getLeft();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int clampViewPositionVertical(View child, int top, int dy) {
            int r1 = AnchorBottomSheetBehavior.IiI10X(this.OXO1);
            if (AnchorBottomSheetBehavior.XO0O10(this.OXO1) == false) goto L5;
            int r3 = AnchorBottomSheetBehavior.I0IIOi(this.OXO1);
        L7:
            return OXO1(top, r1, r3);
        L5:
            r3 = AnchorBottomSheetBehavior.O00(this.OXO1);
            goto L7
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int getViewVerticalDragRange(View child) {
            if (AnchorBottomSheetBehavior.XO0O10(this.OXO1) == false) goto L7;
            int r2 = AnchorBottomSheetBehavior.I0IIOi(this.OXO1);
            int r0 = AnchorBottomSheetBehavior.IiI10X(this.OXO1);
        L6:
            return r2 - r0;
        L7:
            r2 = AnchorBottomSheetBehavior.O00(this.OXO1);
            r0 = AnchorBottomSheetBehavior.IiI10X(this.OXO1);
            goto L6
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewDragStateChanged(int state) {
            if (state != 1) goto L6;
            AnchorBottomSheetBehavior.X1ii(this.OXO1, 1);
            return;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewPositionChanged(View changedView, int left, int top, int dx, int dy) {
            AnchorBottomSheetBehavior.XXI(this.OXO1, top);
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void onViewReleased(View releasedChild, float xvel, float yvel) {
            int r1 = 4;
            if (yvel >= 0.0f) goto L6;
            int r5 = AnchorBottomSheetBehavior.IiI10X(this.OXO1);
        L19:
            if (AnchorBottomSheetBehavior.iO(this.OXO1) == true) goto L23;
            if (r1 != 5) goto L23;
            r5 = AnchorBottomSheetBehavior.XIi00iiXO(this.OXO1);
            r1 = 3;
        L23:
            if (AnchorBottomSheetBehavior.OIX0iXi(this.OXO1).settleCapturedViewAt(releasedChild.getLeft(), r5) == false) goto L26;
            AnchorBottomSheetBehavior.X1ii(this.OXO1, 2);
            ViewCompat.postOnAnimation(releasedChild, new XO0O10(this.OXO1, releasedChild, r1));
            return;
        L26:
            AnchorBottomSheetBehavior.X1ii(this.OXO1, r1);
            return;
        L6:
            if (AnchorBottomSheetBehavior.XO0O10(this.OXO1) == false) goto L11;
            if (AnchorBottomSheetBehavior.O10IXXX0X(this.OXO1, releasedChild, yvel) == false) goto L11;
            r5 = AnchorBottomSheetBehavior.I0IIOi(this.OXO1);
            r1 = 6;
        L11:
            if (yvel != 0.0f) goto L16;
            int r6 = releasedChild.getTop();
            if (Math.abs(r6 - AnchorBottomSheetBehavior.IiI10X(this.OXO1)) >= Math.abs(r6 - AnchorBottomSheetBehavior.O00(this.OXO1))) goto L15;
            r5 = AnchorBottomSheetBehavior.IiI10X(this.OXO1);
            goto L19
        L15:
            r5 = AnchorBottomSheetBehavior.O00(this.OXO1);
        L17:
            r1 = 5;
            goto L19
        L16:
            r5 = AnchorBottomSheetBehavior.O00(this.OXO1);
            goto L17
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public boolean tryCaptureView(View child, int pointerId) {
            if (AnchorBottomSheetBehavior.OIi0(this.OXO1) != 1) goto L6;
            return false;
        L6:
            if (AnchorBottomSheetBehavior.IO(this.OXO1) == false) goto L9;
            return false;
        L9:
            if (AnchorBottomSheetBehavior.OIi0(this.OXO1) != 4) goto L18;
            if (AnchorBottomSheetBehavior.OXO1(this.OXO1) != pointerId) goto L18;
            View r6 = (View) AnchorBottomSheetBehavior.XOO0ii0(this.OXO1).get();
            if (r6 == null) goto L18;
            if (r6.canScrollVertically(-1) == false) goto L18;
            return false;
        L18:
            if (AnchorBottomSheetBehavior.I0iXXO(this.OXO1) != null) goto L20;
        L22:
            return false;
        L20:
            if (AnchorBottomSheetBehavior.I0iXXO(this.OXO1).get() != child) goto L22;
            return true;
        }
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = null;
        public final int IO;

        public class OXO1 implements Parcelable.Creator<SavedState> {
            public OXO1() {
            }

            public SavedState OXO1(Parcel source) {
                return new SavedState(source);
            }

            public SavedState[] XIi00iiXO(int size) {
                return new SavedState[size];
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ SavedState createFromParcel(Parcel source) {
                return OXO1(source);
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ SavedState[] newArray(int size) {
                return XIi00iiXO(size);
            }
        }

        static {
            CREATOR = new OXO1();
        }

        public SavedState(Parcel source) {
            super(source);
            this.IO = source.readInt();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel out, int flags) {
            super.writeToParcel(out, flags);
            out.writeInt(this.IO);
        }

        public SavedState(Parcelable superState, int state) {
            super(superState);
            this.IO = state;
        }
    }

    public static abstract class XIi00iiXO {
        public XIi00iiXO() {
        }

        public abstract void OXO1(@NonNull View bottomSheet, float slideOffset);

        public abstract void XIi00iiXO(@NonNull View bottomSheet, int newState);
    }

    public class XO0O10 implements Runnable {
        public final int I1;
        public final View IO;
        public final /* synthetic */ AnchorBottomSheetBehavior iX1O1;

        public XO0O10(final AnchorBottomSheetBehavior this$0, View view, int targetState) {
            this.iX1O1 = this$0;
            this.IO = view;
            this.I1 = targetState;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (AnchorBottomSheetBehavior.OIX0iXi(this.iX1O1) != null) goto L5;
        L8:
            AnchorBottomSheetBehavior.X1ii(this.iX1O1, this.I1);
            return;
        L5:
            if (AnchorBottomSheetBehavior.OIX0iXi(this.iX1O1).continueSettling(true) == false) goto L8;
            ViewCompat.postOnAnimation(this.IO, this);
        }
    }

    public class iO {
        public long OXO1;
        public float XIi00iiXO;
        public final /* synthetic */ AnchorBottomSheetBehavior iO;

        public /* synthetic */ iO(AnchorBottomSheetBehavior r1, XIXIXi r2) {
            this(r1);
        }

        public void OXO1() {
            this.OXO1 = 0;
            this.XIi00iiXO = 0.0f;
        }

        public float XIi00iiXO() {
            return this.XIi00iiXO;
        }

        public void iO(int dy) {
            long r0 = System.currentTimeMillis();
            long r2 = this.OXO1;
            if (r2 == 0) goto L5;
            this.XIi00iiXO = (dy / (r0 - r2)) * 1000.0f;
        L5:
            this.OXO1 = r0;
        }

        public iO(final AnchorBottomSheetBehavior this$0) {
            this.iO = this$0;
            this.OXO1 = 0;
            this.XIi00iiXO = 0.0f;
        }
    }

    public AnchorBottomSheetBehavior() {
        this.mState = 3;
        this.mLastStableState = 3;
        this.mScrollVelocityTracker = new iO(this, null);
        this.mDragCallback = new OXO1(this);
    }

    public static /* bridge */ /* synthetic */ int I0IIOi(AnchorBottomSheetBehavior r0) {
        return r0.mParentHeight;
    }

    public static /* bridge */ /* synthetic */ WeakReference I0iXXO(AnchorBottomSheetBehavior r0) {
        return r0.mViewRef;
    }

    public static /* bridge */ /* synthetic */ boolean IO(AnchorBottomSheetBehavior r0) {
        return r0.mTouchingScrollingChild;
    }

    public static /* bridge */ /* synthetic */ int IiI10X(AnchorBottomSheetBehavior r0) {
        return r0.mMinOffset;
    }

    public static /* bridge */ /* synthetic */ int O00(AnchorBottomSheetBehavior r0) {
        return r0.mMaxOffset;
    }

    public static /* bridge */ /* synthetic */ boolean O10IXXX0X(AnchorBottomSheetBehavior r0, View r1, float r2) {
        return r0.shouldHide(r1, r2);
    }

    public static /* bridge */ /* synthetic */ ViewDragHelper OIX0iXi(AnchorBottomSheetBehavior r0) {
        return r0.mViewDragHelper;
    }

    public static /* bridge */ /* synthetic */ int OIi0(AnchorBottomSheetBehavior r0) {
        return r0.mState;
    }

    public static /* bridge */ /* synthetic */ int OXO1(AnchorBottomSheetBehavior r0) {
        return r0.mActivePointerId;
    }

    public static /* bridge */ /* synthetic */ void X1ii(AnchorBottomSheetBehavior r0, int r1) {
        r0.setStateInternal(r1);
    }

    public static /* bridge */ /* synthetic */ int XIi00iiXO(AnchorBottomSheetBehavior r0) {
        return r0.mAnchorPoint;
    }

    public static /* bridge */ /* synthetic */ boolean XO0O10(AnchorBottomSheetBehavior r0) {
        return r0.mHideable;
    }

    public static /* bridge */ /* synthetic */ WeakReference XOO0ii0(AnchorBottomSheetBehavior r0) {
        return r0.mNestedScrollingChildRef;
    }

    public static /* bridge */ /* synthetic */ void XXI(AnchorBottomSheetBehavior r0, int r1) {
        r0.dispatchOnSlide(r1);
    }

    private void dispatchOnSlide(int top) {
        V r0 = this.mViewRef.get();
        if (r0 != null) goto L5;
        return;
    L5:
        if (this.mCallback == null) goto L13;
        int r1 = this.mMaxOffset;
        if (top <= r1) goto L10;
        notifyOnSlideToListeners(r0, (r1 - top) / this.mPeekHeight);
        return;
    L10:
        notifyOnSlideToListeners(r0, (r1 - top) / (r1 - this.mMinOffset));
        return;
    }

    private View findScrollingChild(View view) {
        if ((view instanceof NestedScrollingChild) == false) goto L6;
        return view;
    L6:
        if ((view instanceof ViewGroup) == false) goto L13;
        ViewGroup r4 = (ViewGroup) view;
        int r0 = r4.getChildCount();
        int r1 = 0;
    L8:
        if (r1 >= r0) goto L17;
        View r2 = findScrollingChild(r4.getChildAt(r1));
        if (r2 != null) goto L11;
        r1 = r1 + 1;
        goto L8
    L11:
        return r2;
    L17:
        return null;
    L13:
        return null;
    }

    public static <V extends View> AnchorBottomSheetBehavior<V> from(V view) {
        ViewGroup.LayoutParams r1 = view.getLayoutParams();
        if ((r1 instanceof CoordinatorLayout.LayoutParams) == false) goto L11;
        CoordinatorLayout.Behavior r2 = ((CoordinatorLayout.LayoutParams) r1).getBehavior();
        if ((r2 instanceof AnchorBottomSheetBehavior) == false) goto L9;
        return (AnchorBottomSheetBehavior) r2;
    L9:
        throw new IllegalArgumentException("The view is not associated with AnchorBottomSheetBehavior");
    L11:
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    public static /* bridge */ /* synthetic */ boolean iO(AnchorBottomSheetBehavior r0) {
        return r0.mCollapsible;
    }

    private void notifyOnSlideToListeners(@NonNull View bottomSheet, float slideOffset) {
        Iterator<XIi00iiXO> r0 = this.mCallback.iterator();
    L4:
        if (r0.hasNext() == false) goto L6;
        r0.next().OXO1(bottomSheet, slideOffset);
        goto L4
    }

    private void notifyStateChangedToListeners(@NonNull View bottomSheet, int newState) {
        Iterator<XIi00iiXO> r0 = this.mCallback.iterator();
    L4:
        if (r0.hasNext() == false) goto L6;
        r0.next().XIi00iiXO(bottomSheet, newState);
        goto L4
    }

    private void reset() {
        this.mActivePointerId = -1;
    }

    private void setStateInternal(int state) {
        if (this.mState == state) goto L13;
        this.mState = state;
        V r0 = this.mViewRef.get();
        if (r0 != null) goto L8;
        return;
    L8:
        if (this.mCallback == null) goto L12;
        notifyStateChangedToListeners(r0, state);
        return;
    L12:
        return;
    }

    private boolean shouldHide(View child, float yvel) {
        if (child.getTop() >= this.mMaxOffset) goto L6;
        return false;
    L6:
        if ((Math.abs((child.getTop() + (yvel * 0.1f)) - this.mMaxOffset) / this.mPeekHeight) <= 0.5f) goto L9;
        return true;
    L9:
        return false;
    }

    public void addBottomSheetCallback(XIi00iiXO callback) {
        if (this.mCallback != null) goto L5;
        this.mCallback = new Vector();
    L5:
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
        if (child.isShown() == true) goto L6;
        this.mIgnoreEvents = true;
        return false;
    L6:
        int r0 = event.getActionMasked();
        if (r0 != 0) goto L10;
        reset();
    L10:
        if (r0 == 0) goto L18;
        if (r0 == 1) goto L14;
        if (r0 == 3) goto L14;
    L34:
        if (this.mIgnoreEvents == false) goto L36;
    L38:
        View r9 = this.mNestedScrollingChildRef.get();
        if (r0 != 2) goto L50;
        if (r9 == null) goto L50;
        if (this.mIgnoreEvents == true) goto L50;
        if (this.mState == 1) goto L50;
        if (parent.isPointInChildBounds(r9, (int) event.getX(), (int) event.getY()) == true) goto L50;
        if (Math.abs(this.mInitialY - event.getY()) <= getTouchSlop()) goto L50;
        return true;
    L50:
        return false;
    L36:
        if (shouldInterceptTouchEvent(event) == false) goto L38;
        return true;
    L14:
        this.mTouchingScrollingChild = false;
        this.mActivePointerId = -1;
        if (this.mIgnoreEvents == false) goto L34;
        this.mIgnoreEvents = false;
        return false;
    L18:
        this.mScrollVelocityTracker.OXO1();
        int r5 = (int) event.getX();
        this.mInitialY = (int) event.getY();
        if (this.mState != 3) goto L21;
        this.mActivePointerId = event.getPointerId(event.getActionIndex());
        this.mTouchingScrollingChild = true;
    L27:
        if (this.mActivePointerId == (-1)) goto L29;
    L31:
        boolean r10 = false;
    L32:
        this.mIgnoreEvents = r10;
        goto L34
    L29:
        if (parent.isPointInChildBounds(child, r5, this.mInitialY) == true) goto L31;
        r10 = true;
        goto L32
    L21:
        View r4 = this.mNestedScrollingChildRef.get();
        if (r4 == null) goto L27;
        if (parent.isPointInChildBounds(r4, r5, this.mInitialY) == false) goto L27;
        this.mActivePointerId = event.getPointerId(event.getActionIndex());
        this.mTouchingScrollingChild = true;
        goto L27
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onLayoutChild(CoordinatorLayout parent, V child, int layoutDirection) {
        int r0 = this.mState;
        if (r0 != 1) goto L5;
    L12:
        int r6 = parent.getHeight();
        this.mParentHeight = r6;
        int r7 = Math.max(0, r6 - child.getHeight());
        this.mMinOffset = r7;
        int r8 = Math.max(this.mParentHeight - this.mPeekHeight, r7);
        this.mMaxOffset = r8;
        int r1 = this.mState;
        if (r1 != 3) goto L16;
        ViewCompat.offsetTopAndBottom(child, this.mAnchorPoint);
    L27:
        if (this.mViewDragHelper != null) goto L29;
        this.mViewDragHelper = ViewDragHelper.create(parent, this.mDragCallback);
    L29:
        this.mViewRef = new WeakReference(child);
        this.mNestedScrollingChildRef = new WeakReference(findScrollingChild(child));
        return true;
    L16:
        if (r1 != 4) goto L19;
        ViewCompat.offsetTopAndBottom(child, this.mMinOffset);
        goto L27
    L19:
        if (this.mHideable == false) goto L24;
        if (r1 != 6) goto L24;
        ViewCompat.offsetTopAndBottom(child, this.mParentHeight);
    L24:
        if (r1 != 5) goto L27;
        ViewCompat.offsetTopAndBottom(child, r8);
        goto L27
    L5:
        if (r0 == 2) goto L12;
        if (parent.getFitsSystemWindows() == true) goto L9;
    L11:
        parent.onLayoutChild(child, layoutDirection);
        goto L12
    L9:
        if (child.getFitsSystemWindows() == true) goto L11;
        child.setFitsSystemWindows(true);
        goto L11
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onNestedPreFling(CoordinatorLayout coordinatorLayout, V child, View target, float velocityX, float velocityY) {
        if (target == this.mNestedScrollingChildRef.get()) goto L5;
        return false;
    L5:
        if (this.mState == 4) goto L7;
        return true;
    L7:
        if (super.onNestedPreFling(coordinatorLayout, child, target, velocityX, velocityY) == false) goto L13;
        return true;
    L13:
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onNestedPreScroll(CoordinatorLayout coordinatorLayout, V child, View target, int dx, int dy, int[] consumed, int type) {
        if (target == this.mNestedScrollingChildRef.get()) goto L5;
        return;
    L5:
        this.mScrollVelocityTracker.iO(dy);
        int r4 = child.getTop();
        int r7 = r4 - dy;
        int r10 = this.mLastStableState;
        if (r10 != 5) goto L10;
        if (r7 >= this.mAnchorPoint) goto L10;
    L13:
        consumed[1] = dy;
        ViewCompat.offsetTopAndBottom(child, this.mAnchorPoint - r4);
        dispatchOnSlide(child.getTop());
        this.mNestedScrolled = true;
        return;
    L10:
        if (r10 == 4) goto L12;
    L15:
        if (dy <= 0) goto L20;
        int r6 = this.mMinOffset;
        if (r7 >= r6) goto L19;
        int r5 = r4 - r6;
        consumed[1] = r5;
        ViewCompat.offsetTopAndBottom(child, -r5);
        setStateInternal(4);
    L35:
        dispatchOnSlide(child.getTop());
        this.mNestedScrolled = true;
        return;
    L19:
        consumed[1] = dy;
        ViewCompat.offsetTopAndBottom(child, -dy);
        setStateInternal(1);
        goto L35
    L20:
        if (dy >= 0) goto L35;
        if (ViewCompat.canScrollVertically(target, -1) == true) goto L35;
        int r8 = this.mMaxOffset;
        if (r7 > r8) goto L26;
    L29:
        boolean r9 = this.mCollapsible;
        if (r9 == true) goto L34;
        if (r9 == true) goto L35;
        if ((this.mAnchorPoint - r7) < 0) goto L35;
    L34:
        consumed[1] = dy;
        ViewCompat.offsetTopAndBottom(child, -dy);
        setStateInternal(1);
        goto L35
    L26:
        if (this.mHideable == true) goto L29;
        int r11 = r4 - r8;
        consumed[1] = r11;
        ViewCompat.offsetTopAndBottom(child, -r11);
        setStateInternal(5);
        goto L35
    L12:
        if (r7 <= this.mAnchorPoint) goto L15;
        goto L13
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onRestoreInstanceState(CoordinatorLayout parent, V child, Parcelable state) {
        SavedState r4 = (SavedState) state;
        super.onRestoreInstanceState(parent, child, r4.getSuperState());
        int r2 = r4.IO;
        if (r2 != 1) goto L5;
    L8:
        this.mState = 5;
    L9:
        this.mLastStableState = this.mState;
        return;
    L5:
        if (r2 == 2) goto L8;
        this.mState = r2;
        goto L9
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public Parcelable onSaveInstanceState(CoordinatorLayout parent, V child) {
        return new SavedState(super.onSaveInstanceState(parent, child), this.mState);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onStartNestedScroll(CoordinatorLayout coordinatorLayout, V child, View directTargetChild, View target, int nestedScrollAxes, int type) {
        this.mNestedScrolled = false;
        if ((nestedScrollAxes & 2) == 0) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void onStopNestedScroll(CoordinatorLayout coordinatorLayout, V child, View target, int type) {
        int r0 = 4;
        if (child.getTop() != this.mMinOffset) goto L7;
        setStateInternal(4);
        this.mLastStableState = 4;
        return;
    L7:
        if (target == this.mNestedScrollingChildRef.get()) goto L9;
        return;
    L9:
        if (this.mNestedScrolled == false) goto L47;
        float r10 = this.mScrollVelocityTracker.XIi00iiXO();
        float r12 = this.mMinimumVelocity;
        if (r10 <= r12) goto L21;
        int r11 = this.mLastStableState;
        if (r11 != 5) goto L17;
        int r13 = this.mAnchorPoint;
    L16:
        r0 = 3;
    L40:
        this.mLastStableState = r0;
        if (smoothSlideViewTo(child, child.getLeft(), r13) == false) goto L43;
        setStateInternal(2);
        ViewCompat.postOnAnimation(child, new XO0O10(this, child, r0));
    L44:
        this.mNestedScrolled = false;
        return;
    L43:
        setStateInternal(r0);
        goto L44
    L17:
        if (r11 != 3) goto L19;
        r13 = this.mMinOffset;
        goto L40
    L19:
        r13 = this.mMinOffset;
        goto L40
    L21:
        if (r10 >= (-r12)) goto L32;
        int r14 = this.mLastStableState;
        if (r14 != 4) goto L26;
        r13 = this.mAnchorPoint;
        goto L16
    L26:
        if (this.mCollapsible != true) goto L31;
        if (r14 != 3) goto L30;
        r13 = this.mMaxOffset;
    L29:
        r0 = 5;
        goto L40
    L30:
        r13 = this.mMaxOffset;
        goto L29
    L31:
        r13 = this.mAnchorPoint;
        goto L16
    L32:
        double r3 = child.getTop();
        r13 = this.mAnchorPoint;
        if (r3 <= (((double) r13) * 1.25d)) goto L38;
        if (this.mCollapsible != true) goto L38;
        r13 = this.mMaxOffset;
    L38:
        if (r3 >= (((double) r13) * 0.5d)) goto L16;
        r13 = this.mMinOffset;
        goto L40
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean onTouchEvent(CoordinatorLayout parent, V child, MotionEvent event) {
        if (child.isShown() == true) goto L5;
        return false;
    L5:
        int r0 = event.getActionMasked();
        if (this.mState != 1) goto L10;
        if (r0 != 0) goto L10;
        return true;
    L10:
        if (this.mLastStableState != 3) goto L19;
        if (r0 != 2) goto L19;
        if (event.getY() <= this.mInitialY) goto L19;
        if (this.mCollapsible == true) goto L19;
        reset();
        return false;
    L19:
        if (this.mViewDragHelper != null) goto L21;
        this.mViewDragHelper = ViewDragHelper.create(parent, this.mDragCallback);
    L21:
        processTouchEvent(event);
        if (r0 != 0) goto L24;
        reset();
    L24:
        if (r0 != 2) goto L31;
        if (this.mIgnoreEvents == true) goto L31;
        if (Math.abs(this.mInitialY - event.getY()) <= getTouchSlop()) goto L31;
        captureChildView(child, event.getPointerId(event.getActionIndex()));
    L31:
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
        if (state != this.mState) goto L6;
        return;
    L6:
        if (state == 5) goto L12;
        if (state == 4) goto L12;
        if (state == 3) goto L12;
        if (this.mHideable == false) goto L13;
        if (state == 6) goto L12;
    L13:
        WeakReference<V> r4 = this.mViewRef;
        if (r4 != null) goto L16;
        V r5 = null;
    L17:
        if (r5 == null) goto L37;
        if (state != 5) goto L21;
        int r0 = this.mMaxOffset;
    L29:
        setStateInternal(2);
        if (smoothSlideViewTo(r5, r5.getLeft(), r0) == false) goto L35;
        ViewCompat.postOnAnimation(r5, new XO0O10(this, r5, state));
        return;
    L35:
        return;
    L21:
        if (state != 3) goto L23;
        r0 = this.mAnchorPoint;
        goto L29
    L23:
        if (state != 4) goto L26;
        r0 = this.mMinOffset;
        goto L29
    L26:
        if (this.mHideable == false) goto L34;
        if (state != 6) goto L34;
        r0 = this.mParentHeight;
    L34:
        throw new IllegalArgumentException("Illegal state argument: " + state);
    L37:
        return;
    L16:
        r5 = r4.get();
    L12:
        this.mState = state;
        this.mLastStableState = state;
        goto L13
    }

    public AnchorBottomSheetBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.mState = 3;
        this.mLastStableState = 3;
        this.mScrollVelocityTracker = new iO(this, null);
        this.mDragCallback = new OXO1(this);
        TypedArray r1 = context.obtainStyledAttributes(attrs, R.styleable.BottomSheetBehavior_Layout);
        setPeekHeight(r1.getDimensionPixelSize(9, 0));
        setHideable(r1.getBoolean(8, false));
        r1.recycle();
        this.mAnchorPoint = 700;
        this.mCollapsible = true;
        TypedArray r2 = context.obtainStyledAttributes(attrs, com.sma.smartv3.R.styleable.AnchorBottomSheetBehavior);
        if (attrs == null) goto L5;
        this.mAnchorPoint = (int) r2.getDimension(0, 0.0f);
        this.mState = r2.getInt(1, 3);
    L5:
        r2.recycle();
        this.mMinimumVelocity = ViewConfiguration.get(context).getScaledMinimumFlingVelocity();
    }
}
