package com.sma.smartv3.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class FloatFrameLayout extends FrameLayout {
    public float I1;
    public int IO;

    @tb1
    public Function2<? super View, ? super MotionEvent, Unit> X11iII1O1;
    public float iX1O1;

    @JvmOverloads
    public FloatFrameLayout(@aa1 Context r8) {
        Intrinsics.X0O(r8, "context");
        AttributeSet r3 = null;
        int r4 = 0;
        this(r8, r3, r4, 6, null);
    }

    @tb1
    public final Function2<View, MotionEvent, Unit> getOnTouchList() {
        return this.X11iII1O1;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@aa1 MotionEvent r7) {
        Intrinsics.X0O(r7, "ev");
        float r0 = r7.getX();
        float r1 = r7.getY();
        Function2<? super View, ? super MotionEvent, Unit> r2 = this.X11iII1O1;
        if (r2 == null) goto L5;
        r2.invoke(this, r7);
    L5:
        int r8 = r7.getAction();
        if (r8 != 0) goto L8;
        this.I1 = r0;
        this.iX1O1 = r1;
        return false;
    L8:
        if (r8 != 1) goto L10;
        return false;
    L10:
        if (r8 != 2) goto L17;
        float r9 = (float) Math.abs(r0 - this.I1);
        float r3 = (float) Math.abs(r1 - this.iX1O1);
        int r4 = this.IO;
        if (r9 <= r4) goto L15;
    L18:
        return true;
    L15:
        if (r3 > r4) goto L18;
    L17:
        return false;
    }

    public final void setOnTouchList(@tb1 Function2<? super View, ? super MotionEvent, Unit> r1) {
        this.X11iII1O1 = r1;
    }

    @JvmOverloads
    public FloatFrameLayout(@aa1 Context r8, @tb1 AttributeSet r9) {
        Intrinsics.X0O(r8, "context");
        int r4 = 0;
        this(r8, r9, r4, 4, null);
    }

    @JvmOverloads
    public FloatFrameLayout(@aa1 Context r2, @tb1 AttributeSet r3, int r4) {
        Intrinsics.X0O(r2, "context");
        super(r2, r3, r4);
        this.IO = ViewConfiguration.get(r2).getScaledTouchSlop();
    }

    public /* synthetic */ FloatFrameLayout(Context r1, AttributeSet r2, int r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = null;
    L6:
        if ((r4 & 4) == 0) goto L8;
        r3 = 0;
    L8:
        this(r1, r2, r3);
    }
}
