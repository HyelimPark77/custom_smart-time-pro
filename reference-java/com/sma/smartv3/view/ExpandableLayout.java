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
import com.sma.smartv3.C15429R;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes3.dex */
public class ExpandableLayout extends LinearLayout {

    /* JADX INFO: renamed from: I1 */
    public int f54975I1;

    /* JADX INFO: renamed from: IO */
    public o54 f54976IO;
    public InterfaceC19064iO O001I;
    public boolean X0i1O;
    public ValueAnimator X11iII1O1;
    public int X1IX;
    public View XXO;
    public AnimatorSet XXX11i;
    public boolean iIXi1iiXI;
    public ValueAnimator iX1O1;
    public nw3 iXiX011;

    public class OXO1 implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: IO */
        public final /* synthetic */ View f54978IO;

        public OXO1(final View val$target) {
            this.f54978IO = val$target;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator animation) {
            this.f54978IO.getLayoutParams().height = ((Integer) animation.getAnimatedValue()).intValue();
            this.f54978IO.requestLayout();
        }
    }

    public class XIi00iiXO extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: I1 */
        public final /* synthetic */ int f54979I1;

        /* JADX INFO: renamed from: IO */
        public final /* synthetic */ int f54980IO;

        public XIi00iiXO(final int val$endHeight, final int val$startHeight) {
            this.f54980IO = val$endHeight;
            this.f54979I1 = val$startHeight;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            super.onAnimationEnd(animation);
            if (this.f54980IO - this.f54979I1 < 0) {
                ExpandableLayout.this.f54975I1 = 0;
                if (ExpandableLayout.this.O001I != null) {
                    ExpandableLayout.this.O001I.OXO1(false);
                    return;
                }
                return;
            }
            ExpandableLayout.this.f54975I1 = 1;
            if (ExpandableLayout.this.O001I != null) {
                ExpandableLayout.this.O001I.OXO1(true);
            }
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.view.ExpandableLayout$iO */
    public interface InterfaceC19064iO {
        void OXO1(boolean expanded);
    }

    public ExpandableLayout(Context context) {
        super(context);
        this.X0i1O = true;
        this.iIXi1iiXI = true;
        IiI10X(null);
    }

    private int getParentScrollDistance() {
        if (this.iXiX011 == null) {
            return 0;
        }
        int y = (int) (((getY() + getMeasuredHeight()) + this.X1IX) - this.iXiX011.OXO1.getMeasuredHeight());
        for (int i = 0; i < this.iXiX011.XIi00iiXO; i++) {
            y = (int) (y + ((ViewGroup) getParent()).getY());
        }
        return y;
    }

    public final void I0IIOi() {
        if (this.XXO == null) {
            this.XXO = findViewById(R.id.switcher);
        }
        View view = this.XXO;
        if (view != null) {
            this.XXO.startAnimation(XO0O10(view, this.f54976IO.OXO1));
        }
    }

    /* JADX INFO: renamed from: IO */
    public final void m38880IO(final int startHeight, final int endHeight) {
        int parentScrollDistance = getParentScrollDistance();
        View childAt = getChildAt(1);
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(startHeight, endHeight);
        this.iX1O1 = valueAnimatorOfInt;
        valueAnimatorOfInt.addUpdateListener(new OXO1(childAt));
        this.iX1O1.addListener(new XIi00iiXO(endHeight, startHeight));
        this.f54975I1 = this.f54975I1 == 1 ? 3 : 2;
        this.iX1O1.setDuration(this.f54976IO.OXO1);
        if (this.f54975I1 == 2) {
            o54 o54Var = this.f54976IO;
            if (o54Var.XIi00iiXO && parentScrollDistance > 0) {
                this.X11iII1O1 = bd6.OXO1(this.iXiX011.OXO1, parentScrollDistance, o54Var.OXO1);
                AnimatorSet animatorSet = new AnimatorSet();
                this.XXX11i = animatorSet;
                if (this.f54976IO.f10076iO) {
                    animatorSet.playTogether(this.iX1O1, this.X11iII1O1);
                } else {
                    animatorSet.playSequentially(this.iX1O1, this.X11iII1O1);
                }
                this.XXX11i.start();
                return;
            }
        }
        this.iX1O1.start();
    }

    public final void IiI10X(AttributeSet attrs) {
        setClickable(true);
        setOrientation(1);
        setClipChildren(false);
        setClipToPadding(false);
        this.f54975I1 = -1;
        this.f54976IO = new o54();
        if (attrs != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attrs, C15429R.styleable.ExpandableLayout);
            this.f54976IO.OXO1 = typedArrayObtainStyledAttributes.getInt(0, 300);
            this.f54976IO.XIi00iiXO = typedArrayObtainStyledAttributes.getBoolean(2, false);
            this.f54976IO.f10076iO = typedArrayObtainStyledAttributes.getBoolean(1, true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void O00() {
        m38880IO(0, this.X1IX);
    }

    public void OIi0() {
        int i = this.f54975I1;
        if (i == 1) {
            m38881iO();
        } else if (i == 0) {
            O00();
        }
        I0IIOi();
    }

    public final RotateAnimation XO0O10(final View view, int duration) {
        int width = view.getWidth() >> 1;
        int height = view.getHeight() >> 1;
        int i = this.f54975I1;
        RotateAnimation rotateAnimation = new RotateAnimation(i == 2 ? 0.0f : -180.0f, i != 2 ? 0.0f : -180.0f, width, height);
        rotateAnimation.setDuration(duration);
        rotateAnimation.setFillAfter(true);
        return rotateAnimation;
    }

    public boolean XOO0ii0() {
        return this.f54975I1 == 1;
    }

    /* JADX INFO: renamed from: iO */
    public void m38881iO() {
        m38880IO(this.X1IX, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.iX1O1;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.iX1O1.cancel();
            this.iX1O1.removeAllUpdateListeners();
        }
        ValueAnimator valueAnimator2 = this.X11iII1O1;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            this.X11iII1O1.cancel();
            this.X11iII1O1.removeAllUpdateListeners();
        }
        AnimatorSet animatorSet = this.XXX11i;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        if (getChildCount() != 2) {
            throw new IllegalStateException("ExpandableLayout must has two child view !");
        }
        if (this.X0i1O) {
            ((ViewGroup.MarginLayoutParams) getChildAt(0).getLayoutParams()).bottomMargin = 0;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getChildAt(1).getLayoutParams();
            marginLayoutParams.bottomMargin = 0;
            marginLayoutParams.topMargin = 0;
            marginLayoutParams.height = 0;
            this.X1IX = getChildAt(1).getMeasuredHeight();
            this.X0i1O = false;
            this.f54975I1 = 0;
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        if (this.f54976IO.XIi00iiXO) {
            this.iXiX011 = bd6.XIi00iiXO(this);
        }
    }

    @Override // android.view.View
    public boolean performClick() {
        if (this.iIXi1iiXI) {
            OIi0();
        }
        return super.performClick();
    }

    public void setExpand(boolean z) {
        if (this.f54975I1 == -1) {
            return;
        }
        getChildAt(1).getLayoutParams().height = z ? this.X1IX : 0;
        requestLayout();
        this.f54975I1 = z ? 1 : 0;
    }

    public void setExpandDuration(int expandDuration) {
        this.f54976IO.OXO1 = expandDuration;
    }

    public void setExpandEnable(boolean isExpandEnable) {
        this.iIXi1iiXI = isExpandEnable;
    }

    public void setExpandScrollTogether(boolean expandScrollTogether) {
        this.f54976IO.f10076iO = expandScrollTogether;
    }

    public void setExpandWithParentScroll(boolean expandWithParentScroll) {
        this.f54976IO.XIi00iiXO = expandWithParentScroll;
    }

    public void setOnExpandListener(InterfaceC19064iO onExpandListener) {
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
