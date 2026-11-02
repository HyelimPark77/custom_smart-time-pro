package com.sma.smartv3.view.text;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.core.widget.TextViewCompat;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.iiOI111I;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.R;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import skin.support.widget.SkinCompatTextView;

/* JADX INFO: loaded from: classes3.dex */
public class PFMedium extends SkinCompatTextView {
    private int mDrawableTintResId;

    @JvmOverloads
    public PFMedium(@aa1 Context r8) {
        Intrinsics.X0O(r8, "context");
        AttributeSet r3 = null;
        int r4 = 0;
        this(r8, r3, r4, 6, null);
    }

    public void applyCustomFont(@tb1 Context r3) {
        if (r3 == null) goto L5;
        setTypeface(iiOI111I.OXO1.OXO1(MyTypeface.PF_MEDIUM, r3));
        return;
    }

    @Override // skin.support.widget.SkinCompatTextView, com.android.mltcode.paycertificationapi.ik4
    public void applySkin() {
        super.applySkin();
        if (this.mDrawableTintResId == 0) goto L6;
        TextViewCompat.setCompoundDrawableTintList(this, gk4.O00(getContext(), this.mDrawableTintResId));
        return;
    }

    @JvmOverloads
    public PFMedium(@aa1 Context r8, @tb1 AttributeSet r9) {
        Intrinsics.X0O(r8, "context");
        int r4 = 0;
        this(r8, r9, r4, 4, null);
    }

    @JvmOverloads
    public PFMedium(@aa1 Context r3, @tb1 AttributeSet r4, int r5) {
        Intrinsics.X0O(r3, "context");
        super(r3, r4, r5);
        applyCustomFont(r3);
        setFontFeatureSettings("\"liga\"=0");
        TypedArray r6 = getContext().obtainStyledAttributes(r4, R.styleable.SkinTintHelper, r5, 0);
        Intrinsics.O10IXXX0X(r6, "obtainStyledAttributes(...)");
    L7:
        th = move-exception;
        r6.recycle();
        throw th;
    L4:
        if (r6.hasValue(3) == false) goto L9;
        this.mDrawableTintResId = r6.getResourceId(3, 0);     // Catch: Throwable -> L7
    L9:
        r6.recycle();
        applySkin();
    }

    public /* synthetic */ PFMedium(Context r1, AttributeSet r2, int r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = null;
    L6:
        if ((r4 & 4) == 0) goto L8;
        r3 = 0;
    L8:
        this(r1, r2, r3);
    }
}
