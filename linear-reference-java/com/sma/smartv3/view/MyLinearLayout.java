package com.sma.smartv3.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.R;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import skin.support.widget.SkinCompatLinearLayout;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nMyLinearLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MyLinearLayout.kt\ncom/sma/smartv3/view/MyLinearLayout\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,46:1\n176#2,2:47\n*S KotlinDebug\n*F\n+ 1 MyLinearLayout.kt\ncom/sma/smartv3/view/MyLinearLayout\n*L\n43#1:47,2\n*E\n"})
public final class MyLinearLayout extends SkinCompatLinearLayout {
    public int I1;

    @JvmOverloads
    public MyLinearLayout(@aa1 Context r8) {
        Intrinsics.X0O(r8, "context");
        AttributeSet r3 = null;
        int r4 = 0;
        this(r8, r3, r4, 6, null);
    }

    @Override // skin.support.widget.SkinCompatLinearLayout, com.android.mltcode.paycertificationapi.ik4
    public void applySkin() {
        super.applySkin();
        if (this.I1 == 0) goto L6;
        TypedValue r0 = new TypedValue();
        gk4.XiOIO(getContext(), this.I1, r0, true);
        int r1 = (int) r0.getDimension(getContext().getResources().getDisplayMetrics());
        setPadding(r1, r1, r1, r1);
        return;
    }

    @JvmOverloads
    public MyLinearLayout(@aa1 Context r8, @tb1 AttributeSet r9) {
        Intrinsics.X0O(r8, "context");
        int r4 = 0;
        this(r8, r9, r4, 4, null);
    }

    @JvmOverloads
    public MyLinearLayout(@aa1 Context r3, @tb1 AttributeSet r4, int r5) {
        Intrinsics.X0O(r3, "context");
        super(r3, r4, r5);
        TypedArray r6 = getContext().obtainStyledAttributes(r4, R.styleable.SkinTintHelper, r5, 0);
        Intrinsics.O10IXXX0X(r6, "obtainStyledAttributes(...)");
    L7:
        th = move-exception;
        r6.recycle();
        throw th;
    L4:
        if (r6.hasValue(0) == false) goto L9;
        this.I1 = r6.getResourceId(0, 0);     // Catch: Throwable -> L7
    L9:
        r6.recycle();
        applySkin();
    }

    public /* synthetic */ MyLinearLayout(Context r1, AttributeSet r2, int r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = null;
    L6:
        if ((r4 & 4) == 0) goto L8;
        r3 = 0;
    L8:
        this(r1, r2, r3);
    }
}
