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
import com.sma.smartv3.pro.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class MarqueeTextView extends FrameLayout implements ik4 {
    public TextView I1;
    public Context IO;
    public xj4 O001I;
    public long X0i1O;
    public List<String> X11iII1O1;
    public long X1IX;
    public iO XXO;
    public int XXX11i;
    public Handler iIXi1iiXI;
    public TextView iX1O1;
    public boolean iXiX011;
    public final Runnable iXiiiO;

    public class OXO1 implements Runnable {
        public final /* synthetic */ MarqueeTextView IO;

        public OXO1(final MarqueeTextView this$0) {
            this.IO = this$0;
        }

        @Override // java.lang.Runnable
        public void run() {
            MarqueeTextView.I0IIOi(this.IO);
            MarqueeTextView.XIi00iiXO(this.IO).postDelayed(this, MarqueeTextView.iO(this.IO));
        }
    }

    public class XIi00iiXO extends AnimatorListenerAdapter {
        public final /* synthetic */ MarqueeTextView I1;
        public final /* synthetic */ int IO;

        public XIi00iiXO(final MarqueeTextView this$0, final int val$nextIndex) {
            this.I1 = this$0;
            this.IO = val$nextIndex;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            TextView r3 = MarqueeTextView.OXO1(this.I1);
            MarqueeTextView r0 = this.I1;
            MarqueeTextView.IiI10X(r0, MarqueeTextView.O00(r0));
            MarqueeTextView.XOO0ii0(this.I1, r3);
            MarqueeTextView r4 = this.I1;
            r4.XXX11i = this.IO;
            MarqueeTextView.O00(r4).setTranslationY(this.I1.getHeight());
            if (MarqueeTextView.XO0O10(this.I1) == null) goto L6;
            MarqueeTextView.XO0O10(this.I1).OXO1(this.I1.XXX11i);
            return;
        }
    }

    public interface iO {
        void OXO1(int position);
    }

    public MarqueeTextView(@NonNull Context context) {
        this(context, null);
    }

    public static /* bridge */ /* synthetic */ void I0IIOi(MarqueeTextView r0) {
        r0.OIi0();
    }

    public static /* bridge */ /* synthetic */ void IiI10X(MarqueeTextView r0, TextView r1) {
        r0.I1 = r1;
    }

    public static /* bridge */ /* synthetic */ TextView O00(MarqueeTextView r0) {
        return r0.iX1O1;
    }

    public static /* bridge */ /* synthetic */ TextView OXO1(MarqueeTextView r0) {
        return r0.I1;
    }

    public static /* bridge */ /* synthetic */ Handler XIi00iiXO(MarqueeTextView r0) {
        return r0.iIXi1iiXI;
    }

    public static /* bridge */ /* synthetic */ iO XO0O10(MarqueeTextView r0) {
        return r0.XXO;
    }

    public static /* bridge */ /* synthetic */ void XOO0ii0(MarqueeTextView r0, TextView r1) {
        r0.iX1O1 = r1;
    }

    public static /* bridge */ /* synthetic */ long iO(MarqueeTextView r2) {
        return r2.X1IX;
    }

    public void I0iXXO() {
        if (this.iXiX011 == false) goto L5;
        return;
    L5:
        if (this.X11iII1O1.size() <= 1) goto L10;
        this.iXiX011 = true;
        this.iIXi1iiXI.postDelayed(this.iXiiiO, this.X1IX);
        return;
    }

    public final TextView IO(float textSize, int textColor) {
        TextView r0 = new TextView(this.IO);
        r0.setTextSize(OIX0iXi(textSize));
        r0.setTextColor(textColor);
        r0.setSingleLine(true);
        r0.setTextColor(gk4.iO(this.IO, R.color.text_color));
        r0.setEllipsize(TextUtils.TruncateAt.END);
        return r0;
    }

    public final float OIX0iXi(float px) {
        return px / this.IO.getResources().getDisplayMetrics().scaledDensity;
    }

    public final void OIi0() {
        int r0 = (this.XXX11i + 1) % this.X11iII1O1.size();
        this.iX1O1.setText(this.X11iII1O1.get(r0));
        this.iX1O1.setTranslationY(getHeight());
        ObjectAnimator r2 = ObjectAnimator.ofFloat(this.I1, "translationY", new float[]{0.0f, -getHeight()});
        r2.setDuration(this.X0i1O);
        ObjectAnimator r1 = ObjectAnimator.ofFloat(this.iX1O1, "translationY", new float[]{getHeight(), 0.0f});
        r1.setDuration(this.X0i1O);
        r2.start();
        r1.start();
        r1.addListener(new XIi00iiXO(this, r0));
    }

    public void XXI() {
        if (this.iXiX011 == true) goto L5;
        return;
    L5:
        this.iXiX011 = false;
        this.iIXi1iiXI.removeCallbacks(this.iXiiiO);
    }

    @Override // com.android.mltcode.paycertificationapi.ik4
    public void applySkin() {
        xj4 r0 = this.O001I;
        if (r0 == null) goto L6;
        r0.OXO1();
        return;
    }

    public TextView getCurrentView() {
        return this.I1;
    }

    public TextView getNextView() {
        return this.iX1O1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.iXiX011 == true) goto L6;
        I0iXXO();
        return;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        XXI();
    }

    @Override // android.view.View
    public void setBackgroundResource(int resId) {
        super.setBackgroundResource(resId);
        xj4 r0 = this.O001I;
        if (r0 == null) goto L6;
        r0.XO0O10(resId);
        return;
    }

    public void setCurrentView(TextView currentView) {
        this.I1 = currentView;
    }

    public void setMarqueeListener(iO listener) {
        this.XXO = listener;
    }

    public void setNextView(TextView nextView) {
        this.iX1O1 = nextView;
    }

    public void setTextList(List<String> list) {
        if (list != null) goto L4;
        return;
    L4:
        if (list.isEmpty() == true) goto L12;
        this.X11iII1O1.clear();
        this.X11iII1O1.addAll(list);
        this.XXX11i = 0;
        this.I1.setText(this.X11iII1O1.get(0));
        iO r3 = this.XXO;
        if (r3 == null) goto L11;
        r3.OXO1(this.XXX11i);
        return;
    L11:
        return;
    }

    public MarqueeTextView(@NonNull Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public MarqueeTextView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.X11iII1O1 = new ArrayList();
        this.XXX11i = 0;
        this.X1IX = 3000;
        this.X0i1O = 500;
        this.iIXi1iiXI = new Handler();
        this.iXiX011 = false;
        this.iXiiiO = new OXO1(this);
        xj4 r1 = new xj4(this);
        this.O001I = r1;
        r1.iO(attrs, defStyleAttr);
        this.IO = context;
        TypedArray r4 = context.getTheme().obtainStyledAttributes(attrs, com.sma.smartv3.R.styleable.MarqueTextView, 0, 0);
        this.X1IX = r4.getInt(1, (int) this.X1IX);
        this.X0i1O = r4.getInt(0, (int) this.X0i1O);
        float r5 = r4.getDimension(3, 16.0f);
        int r6 = r4.getColor(2, -13421773);
        r4.recycle();
        this.I1 = IO(r5, r6);
        this.iX1O1 = IO(r5, r6);
        addView(this.I1, new FrameLayout.LayoutParams(-1, -2));
        addView(this.iX1O1, new FrameLayout.LayoutParams(-1, -2));
        this.iX1O1.setTranslationY(getHeight());
    }
}
