package com.sma.smartv3.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.R;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import skin.support.widget.SkinCompatImageButton;

/* JADX INFO: loaded from: classes3.dex */
public final class TintImageButton extends SkinCompatImageButton {
    private int mBackgroundTintResId;

    @JvmOverloads
    public TintImageButton(@aa1 Context r8) {
        Intrinsics.X0O(r8, "context");
        AttributeSet r3 = null;
        int r4 = 0;
        this(r8, r3, r4, 6, null);
    }

    @Override // skin.support.widget.SkinCompatImageButton, com.android.mltcode.paycertificationapi.ik4
    public void applySkin() {
        super.applySkin();
        if (this.mBackgroundTintResId == 0) goto L6;
        setBackgroundTintList(gk4.O00(getContext(), this.mBackgroundTintResId));
        return;
    }

    @JvmOverloads
    public TintImageButton(@aa1 Context r8, @tb1 AttributeSet r9) {
        Intrinsics.X0O(r8, "context");
        int r4 = 0;
        this(r8, r9, r4, 4, null);
    }

    @JvmOverloads
    public TintImageButton(@aa1 Context r3, @tb1 AttributeSet r4, int r5) {
        Intrinsics.X0O(r3, "context");
        super(r3, r4, r5);
        TypedArray r6 = getContext().obtainStyledAttributes(r4, R.styleable.SkinTintHelper, r5, 0);
        Intrinsics.O10IXXX0X(r6, "obtainStyledAttributes(...)");
    L7:
        th = move-exception;
        r6.recycle();
        throw th;
    L4:
        if (r6.hasValue(2) == false) goto L9;
        this.mBackgroundTintResId = r6.getResourceId(2, 0);     // Catch: Throwable -> L7
    L9:
        r6.recycle();
        applySkin();
    }

    public /* synthetic */ TintImageButton(Context r1, AttributeSet r2, int r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = null;
    L6:
        if ((r4 & 4) == 0) goto L8;
        r3 = 0;
    L8:
        this(r1, r2, r3);
    }
}
