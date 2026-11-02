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
import com.android.mltcode.paycertificationapi.ei5;
import com.blankj.utilcode.util.SizeUtils;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes3.dex */
public class SwipeLayout extends LinearLayout {
    public View I1;
    public View IO;
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
        public final /* synthetic */ SwipeLayout IO;

        public OXO1(final SwipeLayout this$0) {
            this.IO = this$0;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator animation) {
            SwipeLayout.XO0O10(this.IO, (int) ((Float) animation.getAnimatedValue()).floatValue());
            SwipeLayout.XIi00iiXO(this.IO).setTranslationX((SwipeLayout.iO(this.IO) * 3.0f) / 4.0f);
        }
    }

    public interface XIi00iiXO {
        void OXO1();

        void onDelete();
    }

    public SwipeLayout(Context context) {
        this(context, null);
    }

    public static /* synthetic */ void OXO1(SwipeLayout r0, View r1) {
        XIi00iiXO r2 = r0.O001I;
        if (r2 != null) goto L5;
        return;
    L5:
        r2.onDelete();
    }

    public static /* bridge */ /* synthetic */ View XIi00iiXO(SwipeLayout r0) {
        return r0.IO;
    }

    public static /* bridge */ /* synthetic */ void XO0O10(SwipeLayout r0, int r1) {
        r0.iX1O1 = r1;
    }

    public static /* bridge */ /* synthetic */ int iO(SwipeLayout r0) {
        return r0.iX1O1;
    }

    public void O00(boolean isClose) {
        View r0 = this.I1;
        float r1 = r0.getTranslationX();
        if (isClose == false) goto L5;
        float r5 = 0.0f;
    L6:
        ObjectAnimator r6 = ObjectAnimator.ofFloat(r0, "translationX", new float[]{r1, r5}).setDuration(100);
        this.iXiX011 = r6;
        r6.addUpdateListener(new OXO1(this));
        this.iXiX011.start();
        return;
    L5:
        r5 = this.X11iII1O1;
        goto L6
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
        if (getChildCount() != 1) goto L7;
        this.IO = getChildAt(0);
        View r0 = View.inflate(getContext(), R.layout.layout_swipe_delete, null);
        this.I1 = r0;
        r0.setOnClickListener(new ei5(this));
        addView(this.I1, new LinearLayout.LayoutParams(SizeUtils.dp2px(72.0f), -1));
        return;
    L7:
        throw new IllegalStateException("SwipeDeleteLayout must host only one direct child");
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        this.X11iII1O1 = -this.I1.getMeasuredWidth();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        int r0 = (int) event.getX();
        this.XXO.addMovement(event);
        int r10 = event.getAction();
        boolean r1 = false;
        if (r10 != 0) goto L5;
        this.X1IX = 0.0d;
        ObjectAnimator r11 = this.iXiX011;
        if (r11 == null) goto L50;
        r11.cancel();
    L50:
        requestDisallowInterceptTouchEvent(false);
    L51:
        this.XXX11i = r0;
        return true;
    L5:
        if (r10 == 1) goto L27;
        if (r10 != 2) goto L8;
        this.X1IX += (double) Math.abs(r0 - this.XXX11i);
        this.XXO.computeCurrentVelocity(1000);
        float r12 = this.XXO.getXVelocity();
        float r3 = this.XXO.getYVelocity();
        int r4 = this.iX1O1 + (r0 - this.XXX11i);
        this.iX1O1 = r4;
        int r5 = this.X11iII1O1;
        if (r4 >= r5) goto L17;
        this.iX1O1 = r5;
    L17:
        if (this.iX1O1 <= 0) goto L20;
        this.iX1O1 = 0;
    L20:
        if (this.X1IX < this.X0i1O) goto L22;
    L25:
        this.I1.setTranslationX(this.iX1O1);
        this.IO.setTranslationX((this.iX1O1 * 3.0f) / 4.0f);
        requestDisallowInterceptTouchEvent(true);
        goto L51
    L22:
        if (Math.abs(r12) <= this.iIXi1iiXI) goto L51;
        if (Math.abs(r12) <= (Math.abs(r3) * 2.0f)) goto L51;
    L8:
        if (r10 != 3) goto L51;
        if (this.iX1O1 == 0) goto L51;
        O00(true);
        goto L51
    L27:
        if (this.X1IX < this.X0i1O) goto L29;
        int r13 = this.iX1O1;
        if (r13 == this.X11iII1O1) goto L51;
        if (r13 == 0) goto L51;
        this.XXO.computeCurrentVelocity(1000);
        float r14 = this.XXO.getXVelocity();
        int r6 = this.iIXi1iiXI;
        if (r14 <= r6) goto L41;
    L39:
        r1 = true;
    L46:
        O00(r1);
        goto L51
    L41:
        if (r14 < (-r6)) goto L46;
        if (this.iX1O1 <= (this.X11iII1O1 / 2)) goto L46;
    L29:
        if (this.iX1O1 != this.X11iII1O1) goto L31;
        O00(true);
        goto L51
    L31:
        XIi00iiXO r15 = this.O001I;
        if (r15 == null) goto L51;
        r15.OXO1();
        O00(true);
        goto L51
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
