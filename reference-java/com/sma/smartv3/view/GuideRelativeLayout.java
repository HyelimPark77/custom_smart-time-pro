package com.sma.smartv3.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.blankj.utilcode.util.LogUtils;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class GuideRelativeLayout extends RelativeLayout {

    /* JADX INFO: renamed from: IO */
    public boolean f54996IO;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GuideRelativeLayout(@aa1 Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.X0O(context, "context");
    }

    public final boolean OXO1() {
        return this.f54996IO;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@tb1 MotionEvent motionEvent) {
        if (this.f54996IO) {
            return true;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(@aa1 MotionEvent event) {
        Intrinsics.X0O(event, "event");
        int action = event.getAction();
        if (action == 0) {
            LogUtils.m11130i("onTouchEvent" + event.getAction());
        } else if (action == 1) {
            LogUtils.m11130i("onTouchEvent" + event.getAction());
        }
        return this.f54996IO;
    }

    public final void setIntercept(boolean z) {
        this.f54996IO = z;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GuideRelativeLayout(@aa1 Context context, @tb1 AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.X0O(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GuideRelativeLayout(@aa1 Context context, @tb1 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.X0O(context, "context");
    }

    public /* synthetic */ GuideRelativeLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
