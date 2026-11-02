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

    /* JADX INFO: renamed from: I1 */
    public float f54981I1;

    /* JADX INFO: renamed from: IO */
    public int f54982IO;

    @tb1
    public Function2<? super View, ? super MotionEvent, Unit> X11iII1O1;
    public float iX1O1;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FloatFrameLayout(@aa1 Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.X0O(context, "context");
    }

    @tb1
    public final Function2<View, MotionEvent, Unit> getOnTouchList() {
        return this.X11iII1O1;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@aa1 MotionEvent ev) {
        Intrinsics.X0O(ev, "ev");
        float x = ev.getX();
        float y = ev.getY();
        Function2<? super View, ? super MotionEvent, Unit> function2 = this.X11iII1O1;
        if (function2 != null) {
            function2.invoke2(this, ev);
        }
        int action = ev.getAction();
        if (action == 0) {
            this.f54981I1 = x;
            this.iX1O1 = y;
            return false;
        }
        if (action != 1 && action == 2) {
            float fAbs = (float) Math.abs(x - this.f54981I1);
            float fAbs2 = (float) Math.abs(y - this.iX1O1);
            int i = this.f54982IO;
            if (fAbs > i || fAbs2 > i) {
                return true;
            }
        }
        return false;
    }

    public final void setOnTouchList(@tb1 Function2<? super View, ? super MotionEvent, Unit> function2) {
        this.X11iII1O1 = function2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FloatFrameLayout(@aa1 Context context, @tb1 AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.X0O(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FloatFrameLayout(@aa1 Context context, @tb1 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.X0O(context, "context");
        this.f54982IO = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public /* synthetic */ FloatFrameLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
