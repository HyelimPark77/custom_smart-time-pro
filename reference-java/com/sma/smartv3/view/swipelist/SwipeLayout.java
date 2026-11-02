package com.sma.smartv3.view.swipelist;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.LinearLayout;
import com.blankj.utilcode.util.SizeUtils;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.swipelist.SwipeLayout;

/* JADX INFO: loaded from: classes3.dex */
public class SwipeLayout extends LinearLayout {

    /* JADX INFO: renamed from: I1 */
    public View f55110I1;

    /* JADX INFO: renamed from: IO */
    public View f55111IO;
    public XIi00iiXO O001I;
    public int X0i1O;
    public int X11iII1O1;
    public double X1IX;
    public VelocityTracker XXO;
    public int XXX11i;
    public int iIXi1iiXI;
    public int iX1O1;
    public ObjectAnimator iXiX011;

    public class OXO1 implements ValueAnimator.AnimatorUpdateListener {
        public OXO1() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator animation) {
            SwipeLayout.this.iX1O1 = (int) ((Float) animation.getAnimatedValue()).floatValue();
            SwipeLayout.this.f55111IO.setTranslationX((SwipeLayout.this.iX1O1 * 3.0f) / 4.0f);
        }
    }

    public interface XIi00iiXO {
        void OXO1();

        void onDelete();
    }

    public SwipeLayout(Context context) {
        this(context, null);
    }

    public static /* synthetic */ void OXO1(SwipeLayout swipeLayout, View view) {
        XIi00iiXO xIi00iiXO = swipeLayout.O001I;
        if (xIi00iiXO == null) {
            return;
        }
        xIi00iiXO.onDelete();
    }

    public void O00(boolean isClose) {
        View view = this.f55110I1;
        ObjectAnimator duration = ObjectAnimator.ofFloat(view, "translationX", view.getTranslationX(), isClose ? 0.0f : this.X11iII1O1).setDuration(100L);
        this.iXiX011 = duration;
        duration.addUpdateListener(new OXO1());
        this.iXiX011.start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.XXO = VelocityTracker.obtain();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.XXO.recycle();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        if (getChildCount() != 1) {
            throw new IllegalStateException("SwipeDeleteLayout must host only one direct child");
        }
        this.f55111IO = getChildAt(0);
        View viewInflate = View.inflate(getContext(), R.layout.layout_swipe_delete, null);
        this.f55110I1 = viewInflate;
        viewInflate.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.ei5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SwipeLayout.OXO1(this.f6423IO, view);
            }
        });
        addView(this.f55110I1, new LinearLayout.LayoutParams(SizeUtils.dp2px(72.0f), -1));
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        this.X11iII1O1 = -this.f55110I1.getMeasuredWidth();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        int x = (int) event.getX();
        this.XXO.addMovement(event);
        int action = event.getAction();
        boolean z = false;
        if (action == 0) {
            this.X1IX = 0.0d;
            ObjectAnimator objectAnimator = this.iXiX011;
            if (objectAnimator != null) {
                objectAnimator.cancel();
            }
            requestDisallowInterceptTouchEvent(false);
        } else if (action != 1) {
            if (action == 2) {
                this.X1IX += (double) Math.abs(x - this.XXX11i);
                this.XXO.computeCurrentVelocity(1000);
                float xVelocity = this.XXO.getXVelocity();
                float yVelocity = this.XXO.getYVelocity();
                int i = this.iX1O1 + (x - this.XXX11i);
                this.iX1O1 = i;
                int i2 = this.X11iII1O1;
                if (i < i2) {
                    this.iX1O1 = i2;
                }
                if (this.iX1O1 > 0) {
                    this.iX1O1 = 0;
                }
                if (this.X1IX >= this.X0i1O || (Math.abs(xVelocity) > this.iIXi1iiXI && Math.abs(xVelocity) > Math.abs(yVelocity) * 2.0f)) {
                    this.f55110I1.setTranslationX(this.iX1O1);
                    this.f55111IO.setTranslationX((this.iX1O1 * 3.0f) / 4.0f);
                    requestDisallowInterceptTouchEvent(true);
                }
            } else if (action == 3 && this.iX1O1 != 0) {
                O00(true);
            }
        } else if (this.X1IX >= this.X0i1O) {
            int i3 = this.iX1O1;
            if (i3 != this.X11iII1O1 && i3 != 0) {
                this.XXO.computeCurrentVelocity(1000);
                float xVelocity2 = this.XXO.getXVelocity();
                int i4 = this.iIXi1iiXI;
                if (xVelocity2 > i4 || (xVelocity2 >= (-i4) && this.iX1O1 > this.X11iII1O1 / 2)) {
                    z = true;
                }
                O00(z);
            }
        } else if (this.iX1O1 == this.X11iII1O1) {
            O00(true);
        } else {
            XIi00iiXO xIi00iiXO = this.O001I;
            if (xIi00iiXO != null) {
                xIi00iiXO.OXO1();
                O00(true);
            }
        }
        this.XXX11i = x;
        return true;
    }

    public void setSwipeListener(XIi00iiXO listener) {
        this.O001I = listener;
    }

    public SwipeLayout(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public SwipeLayout(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.X0i1O = ViewConfiguration.get(context).getScaledTouchSlop();
        this.iIXi1iiXI = ViewConfiguration.get(context).getScaledMinimumFlingVelocity();
    }
}
