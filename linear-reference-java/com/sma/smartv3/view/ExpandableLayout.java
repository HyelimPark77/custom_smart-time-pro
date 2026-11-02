package com.sma.smartv3.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.RotateAnimation;
import android.widget.LinearLayout;
import com.android.mltcode.paycertificationapi.bd6;
import com.android.mltcode.paycertificationapi.nw3;
import com.android.mltcode.paycertificationapi.o54;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes3.dex */
public class ExpandableLayout extends LinearLayout {
    public int I1;
    public o54 IO;
    public iO O001I;
    public boolean X0i1O;
    public ValueAnimator X11iII1O1;
    public int X1IX;
    public View XXO;
    public AnimatorSet XXX11i;
    public boolean iIXi1iiXI;
    public ValueAnimator iX1O1;
    public nw3 iXiX011;

    public class OXO1 implements ValueAnimator.AnimatorUpdateListener {
        public final /* synthetic */ ExpandableLayout I1;
        public final /* synthetic */ View IO;

        public OXO1(final ExpandableLayout this$0, final View val$target) {
            this.I1 = this$0;
            this.IO = val$target;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator animation) {
            ViewGroup.LayoutParams r0 = this.IO.getLayoutParams();
            r0.height = ((Integer) animation.getAnimatedValue()).intValue();
            this.IO.requestLayout();
        }
    }

    public class XIi00iiXO extends AnimatorListenerAdapter {
        public final /* synthetic */ int I1;
        public final /* synthetic */ int IO;
        public final /* synthetic */ ExpandableLayout iX1O1;

        public XIi00iiXO(final ExpandableLayout this$0, final int val$endHeight, final int val$startHeight) {
            this.iX1O1 = this$0;
            this.IO = val$endHeight;
            this.I1 = val$startHeight;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            super.onAnimationEnd(animation);
            if ((this.IO - this.I1) >= 0) goto L8;
            ExpandableLayout.XIi00iiXO(this.iX1O1, 0);
            if (ExpandableLayout.OXO1(this.iX1O1) == null) goto L12;
            ExpandableLayout.OXO1(this.iX1O1).OXO1(false);
            return;
        L12:
            return;
        L8:
            ExpandableLayout.XIi00iiXO(this.iX1O1, 1);
            if (ExpandableLayout.OXO1(this.iX1O1) == null) goto L13;
            ExpandableLayout.OXO1(this.iX1O1).OXO1(true);
            return;
        }
    }

    public interface iO {
        void OXO1(boolean expanded);
    }

    public ExpandableLayout(Context context) {
        super(context);
        this.X0i1O = true;
        this.iIXi1iiXI = true;
        IiI10X(null);
    }

    public static /* bridge */ /* synthetic */ iO OXO1(ExpandableLayout r0) {
        return r0.O001I;
    }

    public static /* bridge */ /* synthetic */ void XIi00iiXO(ExpandableLayout r0, int r1) {
        r0.I1 = r1;
    }

    private int getParentScrollDistance() {
        int r1 = 0;
        if (this.iXiX011 != null) goto L5;
        return 0;
    L5:
        int r0 = (int) (((getY() + getMeasuredHeight()) + this.X1IX) - this.iXiX011.OXO1.getMeasuredHeight());
    L7:
        if (r1 >= this.iXiX011.XIi00iiXO) goto L9;
        r0 = (int) (r0 + ((ViewGroup) getParent()).getY());
        r1 = r1 + 1;
        goto L7
    L9:
        return r0;
    }

    public final void I0IIOi() {
        if (this.XXO != null) goto L5;
        this.XXO = findViewById(R.id.switcher);
    L5:
        View r0 = this.XXO;
        if (r0 == null) goto L9;
        RotateAnimation r1 = XO0O10(r0, this.IO.OXO1);
        this.XXO.startAnimation(r1);
        return;
    }

    public final void IO(final int startHeight, final int endHeight) {
        int r1 = getParentScrollDistance();
        View r3 = getChildAt(1);
        ValueAnimator r4 = ValueAnimator.ofInt(new int[]{startHeight, endHeight});
        this.iX1O1 = r4;
        r4.addUpdateListener(new OXO1(this, r3));
        this.iX1O1.addListener(new XIi00iiXO(this, endHeight, startHeight));
        if (this.I1 != 1) goto L5;
        int r7 = 3;
    L6:
        this.I1 = r7;
        this.iX1O1.setDuration(this.IO.OXO1);
        if (this.I1 != 2) goto L17;
        o54 r8 = this.IO;
        if (r8.XIi00iiXO == false) goto L17;
        if (r1 <= 0) goto L17;
        this.X11iII1O1 = bd6.OXO1(this.iXiX011.OXO1, r1, r8.OXO1);
        AnimatorSet r9 = new AnimatorSet();
        this.XXX11i = r9;
        if (this.IO.iO == false) goto L14;
        r9.playTogether(new Animator[]{this.iX1O1, this.X11iII1O1});
    L15:
        this.XXX11i.start();
        return;
    L14:
        r9.playSequentially(new Animator[]{this.iX1O1, this.X11iII1O1});
    L17:
        this.iX1O1.start();
        return;
    L5:
        r7 = 2;
        goto L6
    }

    public final void IiI10X(AttributeSet attrs) {
        setClickable(true);
        setOrientation(1);
        setClipChildren(false);
        setClipToPadding(false);
        this.I1 = -1;
        this.IO = new o54();
        if (attrs == null) goto L6;
        TypedArray r5 = getContext().obtainStyledAttributes(attrs, com.sma.smartv3.R.styleable.ExpandableLayout);
        o54 r2 = this.IO;
        r2.OXO1 = r5.getInt(0, 300);
        o54 r3 = this.IO;
        r3.XIi00iiXO = r5.getBoolean(2, false);
        o54 r1 = this.IO;
        r1.iO = r5.getBoolean(1, true);
        r5.recycle();
        return;
    }

    public void O00() {
        IO(0, this.X1IX);
    }

    public void OIi0() {
        int r0 = this.I1;
        if (r0 != 1) goto L5;
        iO();
    L7:
        I0IIOi();
        return;
    L5:
        if (r0 != 0) goto L7;
        O00();
        goto L7
    }

    public final RotateAnimation XO0O10(final View view, int duration) {
        int r0 = view.getWidth() >> 1;
        int r9 = view.getHeight() >> 1;
        int r3 = this.I1;
        float r4 = -180.0f;
        if (r3 != 2) goto L5;
        float r7 = 0.0f;
    L6:
        if (r3 == 2) goto L9;
        r4 = 0.0f;
    L9:
        RotateAnimation r2 = new RotateAnimation(r7, r4, r0, r9);
        r2.setDuration(duration);
        r2.setFillAfter(true);
        return r2;
    L5:
        r7 = -180.0f;
        goto L6
    }

    public boolean XOO0ii0() {
        if (this.I1 != 1) goto L5;
        return true;
    L5:
        return false;
    }

    public void iO() {
        IO(this.X1IX, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator r0 = this.iX1O1;
        if (r0 != null) goto L5;
    L7:
        ValueAnimator r1 = this.X11iII1O1;
        if (r1 != null) goto L10;
    L12:
        AnimatorSet r2 = this.XXX11i;
        if (r2 == null) goto L16;
        r2.cancel();
        return;
    L16:
        return;
    L10:
        if (r1.isRunning() == false) goto L12;
        this.X11iII1O1.cancel();
        this.X11iII1O1.removeAllUpdateListeners();
        goto L12
    L5:
        if (r0.isRunning() == false) goto L7;
        this.iX1O1.cancel();
        this.iX1O1.removeAllUpdateListeners();
        goto L7
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        if (getChildCount() != 2) goto L9;
        if (this.X0i1O == false) goto L10;
        ((ViewGroup.MarginLayoutParams) getChildAt(0).getLayoutParams()).bottomMargin = 0;
        ViewGroup.MarginLayoutParams r2 = (ViewGroup.MarginLayoutParams) getChildAt(1).getLayoutParams();
        r2.bottomMargin = 0;
        r2.topMargin = 0;
        r2.height = 0;
        this.X1IX = getChildAt(1).getMeasuredHeight();
        this.X0i1O = false;
        this.I1 = 0;
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        return;
    L10:
        return;
    L9:
        throw new IllegalStateException("ExpandableLayout must has two child view !");
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        if (this.IO.XIi00iiXO == false) goto L6;
        this.iXiX011 = bd6.XIi00iiXO(this);
        return;
    }

    @Override // android.view.View
    public boolean performClick() {
        if (this.iIXi1iiXI == false) goto L6;
        OIi0();
    L6:
        return super.performClick();
    }

    public void setExpand(boolean r3) {
        if (this.I1 != (-1)) goto L5;
        return;
    L5:
        ViewGroup.LayoutParams r0 = getChildAt(1).getLayoutParams();
        if (r3 == false) goto L8;
        int r1 = this.X1IX;
    L9:
        r0.height = r1;
        requestLayout();
        this.I1 = r3 ? 1 : 0;
        return;
    L8:
        r1 = 0;
        goto L9
    }

    public void setExpandDuration(int expandDuration) {
        this.IO.OXO1 = expandDuration;
    }

    public void setExpandEnable(boolean isExpandEnable) {
        this.iIXi1iiXI = isExpandEnable;
    }

    public void setExpandScrollTogether(boolean expandScrollTogether) {
        this.IO.iO = expandScrollTogether;
    }

    public void setExpandWithParentScroll(boolean expandWithParentScroll) {
        this.IO.XIi00iiXO = expandWithParentScroll;
    }

    public void setOnExpandListener(iO onExpandListener) {
        this.O001I = onExpandListener;
    }

    public void setSwitcher(View switcher) {
        this.XXO = switcher;
    }

    public ExpandableLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.X0i1O = true;
        this.iIXi1iiXI = true;
        IiI10X(attrs);
    }

    public ExpandableLayout(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.X0i1O = true;
        this.iIXi1iiXI = true;
    }
}
