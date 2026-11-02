package com.sma.smartv3.view.dial;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.BounceInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import androidx.core.widget.NestedScrollView;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.blankj.utilcode.util.ToastUtils;
import com.sma.smartv3.pro.R;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class DialElementView extends RelativeLayout {
    public boolean I1;
    public boolean IO;
    public int Ii1iii0;
    public int O001I;

    @tb1
    public NestedScrollView OO;

    @tb1
    public ImageView OX110i;
    public int X0i1O;
    public float X100O;
    public float X11I;
    public int X11iII1O1;
    public boolean X1IX;
    public boolean XOX0O0;

    @tb1
    public TextView XX1Oi;
    public int XXO;
    public int XXX11i;
    public int iIXi1iiXI;
    public float iOiXi11II;

    @tb1
    public String iX1O1;
    public int iXiX011;
    public int iXiiiO;
    public int iiiO;

    @JvmOverloads
    public DialElementView(@aa1 Context r8) {
        Intrinsics.X0O(r8, "context");
        AttributeSet r3 = null;
        int r4 = 0;
        this(r8, r3, r4, 6, null);
    }

    public final boolean IiI10X(float r7, float r8) {
        if (XO0O10(r8) == true) goto L5;
        return false;
    L5:
        boolean r0 = O00(this.iXiiiO - (this.XXO + r7), this.Ii1iii0 - (this.O001I + r8));
        boolean r2 = O00(this.iXiiiO - (this.XXO + r7), this.Ii1iii0 - ((this.O001I + r8) + getHeight()));
        boolean r3 = O00(this.iXiiiO - ((this.XXO + r7) + getWidth()), this.Ii1iii0 - (this.O001I + r8));
        boolean r9 = O00(this.iXiiiO - ((r7 + this.XXO) + getWidth()), this.Ii1iii0 - ((r8 + this.O001I) + getHeight()));
        if (r0 == false) goto L12;
        if (r2 == false) goto L12;
        if (r3 == false) goto L12;
        if (r9 == false) goto L12;
        return true;
    L12:
        return false;
    }

    public final boolean O00(float r3, float r4) {
        if (Math.sqrt((r3 * r3) + (r4 * r4)) > this.iiiO) goto L6;
        return true;
    L6:
        return false;
    }

    public final void OXO1(Context r4) {
        if (this.X0i1O != 1) goto L6;
        View r5 = LayoutInflater.from(r4).inflate(this.XXX11i, null);
        this.OX110i = (ImageView) r5.findViewById(R.id.iv);
        addView(r5);
        return;
    L6:
        View r6 = LayoutInflater.from(r4).inflate(this.XXX11i, null);
        ((ImageView) r6.findViewById(R.id.controlIv)).setImageResource(this.X11iII1O1);
        TextView r0 = (TextView) r6.findViewById(R.id.tv);
        this.XX1Oi = r0;
        if (r0 == null) goto L9;
        r0.setText(this.iX1O1);
    L9:
        addView(r6);
    }

    public final void XIi00iiXO(Context r3, AttributeSet r4) {
        TypedArray r5 = r3.obtainStyledAttributes(r4, com.sma.smartv3.R.styleable.DialElementView);
        Intrinsics.O10IXXX0X(r5, "obtainStyledAttributes(...)");
        this.IO = r5.getBoolean(0, this.IO);
        this.I1 = r5.getBoolean(1, this.I1);
        int r6 = r5.getInteger(2, this.X0i1O);
        this.X0i1O = r6;
        if (r6 != 1) goto L5;
        int r7 = R.layout.dial_time_digital_content;
    L6:
        this.XXX11i = r5.getResourceId(4, r7);
        this.X11iII1O1 = r5.getResourceId(3, R.drawable.dial_control_pop_0);
        this.iX1O1 = r5.getString(5);
        r5.recycle();
        return;
    L5:
        r7 = R.layout.dial_control_content;
        goto L6
    }

    public final boolean XO0O10(float r3) {
        if (((this.iXiX011 * this.iOiXi11II) - (r3 + getHeight())) < 0.0f) goto L6;
        return true;
    L6:
        return false;
    }

    public final void XOO0ii0() {
        if (XO0O10(getY()) == true) goto L6;
        setY((this.iXiX011 * this.iOiXi11II) - getHeight());
        return;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(@aa1 MotionEvent r3) {
        Intrinsics.X0O(r3, NotificationCompat.CATEGORY_EVENT);
        super.dispatchTouchEvent(r3);
        if (r3.getAction() != 1) goto L7;
        NestedScrollView r4 = this.OO;
        if (r4 == null) goto L10;
        r4.requestDisallowInterceptTouchEvent(false);
    L10:
        return true;
    L7:
        NestedScrollView r5 = this.OO;
        if (r5 == null) goto L10;
        r5.requestDisallowInterceptTouchEvent(true);
        goto L10
    }

    public final void iO() {
        if ((getParent() instanceof ViewGroup) == false) goto L13;
        ViewParent r0 = getParent();
        Intrinsics.X1ii(r0, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup r1 = (ViewGroup) r0;
        int[] r2 = new int[2];
        r1.getLocationInWindow(r2);
        this.iXiX011 = r1.getMeasuredHeight();
        int r3 = r1.getMeasuredWidth();
        this.iIXi1iiXI = r3;
        if (this.XOX0O0 == false) goto L11;
        int r4 = this.iXiX011;
        if (r4 == r3) goto L11;
        if (r4 >= r3) goto L10;
        this.iIXi1iiXI = r4;
        goto L11
    L10:
        this.iXiX011 = r3;
    L11:
        int r5 = r2[0];
        this.XXO = r5;
        int r6 = r2[1];
        this.O001I = r6;
        int r7 = this.iIXi1iiXI / 2;
        this.iiiO = r7;
        this.iXiiiO = r5 + r7;
        this.Ii1iii0 = r6 + r7;
        return;
    }

    @Override // android.view.View
    public void onSizeChanged(int r1, int r2, int r3, int r4) {
        super.onSizeChanged(r1, r2, r3, r4);
        iO();
        XOO0ii0();
    }

    @Override // android.view.View
    public boolean onTouchEvent(@tb1 MotionEvent r12) {
        if (r12 != null) goto L4;
    L57:
        boolean r0 = this.X1IX;
        if (r0 == false) goto L61;
        return r0;
    L61:
        return super.onTouchEvent(r12);
    L4:
        if (this.I1 == false) goto L57;
        float r1 = r12.getRawX();
        float r2 = r12.getRawY();
        int r3 = r12.getAction();
        if (r3 == 0) goto L56;
        boolean r5 = true;
        float r6 = 0.0f;
        if (r3 == 1) goto L49;
        if (r3 != 2) goto L57;
        int r4 = this.XXO;
        if (r1 < r4) goto L57;
        if (r1 > (this.iIXi1iiXI + r4)) goto L57;
        int r7 = this.O001I;
        if (r2 < r7) goto L57;
        if (r2 > (this.iXiX011 + r7)) goto L57;
        float r8 = r1 - this.X11I;
        float r9 = r2 - this.X100O;
        if (this.X1IX == false) goto L22;
    L28:
        float r10 = getX() + r8;
        float r11 = getY() + r9;
        float r13 = this.iIXi1iiXI - getWidth();
        float r14 = this.iXiX011 - getHeight();
        if (r10 >= 0.0f) goto L32;
        r10 = 0.0f;
    L35:
        if (r11 < 0.0f) goto L42;
        if (r11 <= r14) goto L40;
        r6 = r14;
        goto L42
    L40:
        r6 = r11;
    L42:
        if (this.XOX0O0 == true) goto L44;
        setX(r10);
        setY(r6);
        this.X11I = r1;
        this.X100O = r2;
        goto L57
    L44:
        if (IiI10X(r10, r6) == false) goto L46;
        setX(r10);
        setY(r6);
        this.X11I = r1;
        this.X100O = r2;
        ToastUtils.cancel();
        goto L57
    L46:
        ToastUtils.showLong(getContext().getString(R.string.unable_move), new Object[0]);
        goto L57
    L32:
        if (r10 <= r13) goto L35;
        r10 = r13;
        goto L35
    L22:
        if (this.IO == false) goto L28;
        if (Math.sqrt((r8 * r8) + (r9 * r9)) >= 2.0d) goto L27;
        r5 = false;
    L27:
        this.X1IX = r5;
        goto L28
    L49:
        if (this.IO == false) goto L57;
        if (this.X1IX == false) goto L57;
        if (this.X11I > (this.iIXi1iiXI / 2)) goto L55;
        animate().setInterpolator(new BounceInterpolator()).setDuration(500).x(0.0f).start();
        goto L57
    L55:
        animate().setInterpolator(new BounceInterpolator()).setDuration(500).x(this.iIXi1iiXI - getWidth()).start();
        goto L57
    L56:
        this.X1IX = false;
        this.X11I = r1;
        this.X100O = r2;
        goto L57
    }

    public final void setBottomRangeScale(float r1) {
        this.iOiXi11II = r1;
    }

    public final void setImageRes(int r2) {
        ImageView r0 = this.OX110i;
        if (r0 == null) goto L6;
        r0.setImageResource(r2);
        return;
    }

    public final void setIsRangeCircle(boolean r1) {
        this.XOX0O0 = r1;
    }

    public final void setScrollView(@aa1 NestedScrollView r2) {
        Intrinsics.X0O(r2, "view");
        this.OO = r2;
    }

    public final void setTextColor(int r2) {
        TextView r0 = this.XX1Oi;
        if (r0 == null) goto L6;
        r0.setTextColor(r2);
        return;
    }

    @JvmOverloads
    public DialElementView(@aa1 Context r8, @tb1 AttributeSet r9) {
        Intrinsics.X0O(r8, "context");
        int r4 = 0;
        this(r8, r9, r4, 4, null);
    }

    @JvmOverloads
    public DialElementView(@aa1 Context r2, @tb1 AttributeSet r3, int r4) {
        Intrinsics.X0O(r2, "context");
        super(r2, r3, r4);
        this.IO = true;
        this.I1 = true;
        this.iX1O1 = "80";
        this.XOX0O0 = true;
        this.iOiXi11II = 1.0f;
        XIi00iiXO(r2, r3);
        OXO1(r2);
    }

    public /* synthetic */ DialElementView(Context r1, AttributeSet r2, int r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = null;
    L6:
        if ((r4 & 4) == 0) goto L8;
        r3 = 0;
    L8:
        this(r1, r2, r3);
    }
}
