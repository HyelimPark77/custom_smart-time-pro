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
    public boolean IO;

    @JvmOverloads
    public SettingsPanel(@aa1 Context r8) {
        Intrinsics.X0O(r8, "context");
        AttributeSet r3 = null;
        int r4 = 0;
        this(r8, r3, r4, 6, null);
    }

    public final void OXO1(boolean r1) {
        this.IO = r1;
        UtilsKt.Xii11I(this, r1);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@aa1 MotionEvent r2) {
        Intrinsics.X0O(r2, "ev");
        if (this.IO == false) goto L7;
        return true;
    L7:
        return super.onInterceptTouchEvent(r2);
    }

    @JvmOverloads
    public SettingsPanel(@aa1 Context r8, @tb1 AttributeSet r9) {
        Intrinsics.X0O(r8, "context");
        int r4 = 0;
        this(r8, r9, r4, 4, null);
    }

    @JvmOverloads
    public SettingsPanel(@aa1 Context r2, @tb1 AttributeSet r3, int r4) {
        Intrinsics.X0O(r2, "context");
        super(r2, r3, r4);
    }

    public /* synthetic */ SettingsPanel(Context r1, AttributeSet r2, int r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = null;
    L6:
        if ((r4 & 4) == 0) goto L8;
        r3 = 0;
    L8:
        this(r1, r2, r3);
    }
}
