package com.sma.smartv3.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.ik4;
import com.android.mltcode.paycertificationapi.xj4;
import com.sma.smartv3.C15429R;
import com.sma.smartv3.pro.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class MarqueeTextView extends FrameLayout implements ik4 {

    /* JADX INFO: renamed from: I1 */
    public TextView f54997I1;

    /* JADX INFO: renamed from: IO */
    public Context f54998IO;
    public xj4 O001I;
    public long X0i1O;
    public List<String> X11iII1O1;
    public long X1IX;
    public InterfaceC19065iO XXO;
    public int XXX11i;
    public Handler iIXi1iiXI;
    public TextView iX1O1;
    public boolean iXiX011;
    public final Runnable iXiiiO;

    public class OXO1 implements Runnable {
        public OXO1() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MarqueeTextView.this.OIi0();
            MarqueeTextView.this.iIXi1iiXI.postDelayed(this, MarqueeTextView.this.X1IX);
        }
    }

    public class XIi00iiXO extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: IO */
        public final /* synthetic */ int f55001IO;

        public XIi00iiXO(final int val$nextIndex) {
            this.f55001IO = val$nextIndex;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            TextView textView = MarqueeTextView.this.f54997I1;
            MarqueeTextView marqueeTextView = MarqueeTextView.this;
            marqueeTextView.f54997I1 = marqueeTextView.iX1O1;
            MarqueeTextView.this.iX1O1 = textView;
            MarqueeTextView marqueeTextView2 = MarqueeTextView.this;
            marqueeTextView2.XXX11i = this.f55001IO;
            marqueeTextView2.iX1O1.setTranslationY(MarqueeTextView.this.getHeight());
            if (MarqueeTextView.this.XXO != null) {
                MarqueeTextView.this.XXO.OXO1(MarqueeTextView.this.XXX11i);
            }
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.view.MarqueeTextView$iO */
    public interface InterfaceC19065iO {
        void OXO1(int position);
    }

    public MarqueeTextView(@NonNull Context context) {
        this(context, null);
    }

    public void I0iXXO() {
        if (this.iXiX011 || this.X11iII1O1.size() <= 1) {
            return;
        }
        this.iXiX011 = true;
        this.iIXi1iiXI.postDelayed(this.iXiiiO, this.X1IX);
    }

    /* JADX INFO: renamed from: IO */
    public final TextView m38891IO(float textSize, int textColor) {
        TextView textView = new TextView(this.f54998IO);
        textView.setTextSize(OIX0iXi(textSize));
        textView.setTextColor(textColor);
        textView.setSingleLine(true);
        textView.setTextColor(gk4.m1859iO(this.f54998IO, R.color.text_color));
        textView.setEllipsize(TextUtils.TruncateAt.END);
        return textView;
    }

    public final float OIX0iXi(float px) {
        return px / this.f54998IO.getResources().getDisplayMetrics().scaledDensity;
    }

    public final void OIi0() {
        int size = (this.XXX11i + 1) % this.X11iII1O1.size();
        this.iX1O1.setText(this.X11iII1O1.get(size));
        this.iX1O1.setTranslationY(getHeight());
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.f54997I1, "translationY", 0.0f, -getHeight());
        objectAnimatorOfFloat.setDuration(this.X0i1O);
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.iX1O1, "translationY", getHeight(), 0.0f);
        objectAnimatorOfFloat2.setDuration(this.X0i1O);
        objectAnimatorOfFloat.start();
        objectAnimatorOfFloat2.start();
        objectAnimatorOfFloat2.addListener(new XIi00iiXO(size));
    }

    public void XXI() {
        if (this.iXiX011) {
            this.iXiX011 = false;
            this.iIXi1iiXI.removeCallbacks(this.iXiiiO);
        }
    }

    @Override // com.android.mltcode.paycertificationapi.ik4
    public void applySkin() {
        xj4 xj4Var = this.O001I;
        if (xj4Var != null) {
            xj4Var.OXO1();
        }
    }

    public TextView getCurrentView() {
        return this.f54997I1;
    }

    public TextView getNextView() {
        return this.iX1O1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.iXiX011) {
            return;
        }
        I0iXXO();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        XXI();
    }

    @Override // android.view.View
    public void setBackgroundResource(int resId) {
        super.setBackgroundResource(resId);
        xj4 xj4Var = this.O001I;
        if (xj4Var != null) {
            xj4Var.XO0O10(resId);
        }
    }

    public void setCurrentView(TextView currentView) {
        this.f54997I1 = currentView;
    }

    public void setMarqueeListener(InterfaceC19065iO listener) {
        this.XXO = listener;
    }

    public void setNextView(TextView nextView) {
        this.iX1O1 = nextView;
    }

    public void setTextList(List<String> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        this.X11iII1O1.clear();
        this.X11iII1O1.addAll(list);
        this.XXX11i = 0;
        this.f54997I1.setText(this.X11iII1O1.get(0));
        InterfaceC19065iO interfaceC19065iO = this.XXO;
        if (interfaceC19065iO != null) {
            interfaceC19065iO.OXO1(this.XXX11i);
        }
    }

    public MarqueeTextView(@NonNull Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public MarqueeTextView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.X11iII1O1 = new ArrayList();
        this.XXX11i = 0;
        this.X1IX = 3000L;
        this.X0i1O = 500L;
        this.iIXi1iiXI = new Handler();
        this.iXiX011 = false;
        this.iXiiiO = new OXO1();
        xj4 xj4Var = new xj4(this);
        this.O001I = xj4Var;
        xj4Var.m3306iO(attrs, defStyleAttr);
        this.f54998IO = context;
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attrs, C15429R.styleable.MarqueTextView, 0, 0);
        this.X1IX = typedArrayObtainStyledAttributes.getInt(1, (int) this.X1IX);
        this.X0i1O = typedArrayObtainStyledAttributes.getInt(0, (int) this.X0i1O);
        float dimension = typedArrayObtainStyledAttributes.getDimension(3, 16.0f);
        int color = typedArrayObtainStyledAttributes.getColor(2, -13421773);
        typedArrayObtainStyledAttributes.recycle();
        this.f54997I1 = m38891IO(dimension, color);
        this.iX1O1 = m38891IO(dimension, color);
        addView(this.f54997I1, new FrameLayout.LayoutParams(-1, -2));
        addView(this.iX1O1, new FrameLayout.LayoutParams(-1, -2));
        this.iX1O1.setTranslationY(getHeight());
    }
}
