package com.sma.smartv3.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.util.UtilsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class SettingsPanel extends LinearLayout {

    /* JADX INFO: renamed from: IO */
    public boolean f55034IO;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SettingsPanel(@aa1 Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.X0O(context, "context");
    }

    public final void OXO1(boolean z) {
        this.f55034IO = z;
        UtilsKt.Xii11I(this, z);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@aa1 MotionEvent ev) {
        Intrinsics.X0O(ev, "ev");
        if (this.f55034IO) {
            return true;
        }
        return super.onInterceptTouchEvent(ev);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SettingsPanel(@aa1 Context context, @tb1 AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.X0O(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SettingsPanel(@aa1 Context context, @tb1 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.X0O(context, "context");
    }

    public /* synthetic */ SettingsPanel(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
