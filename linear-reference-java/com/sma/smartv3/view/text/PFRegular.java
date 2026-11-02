package com.sma.smartv3.view.text;

import android.content.Context;
import android.util.AttributeSet;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.iiOI111I;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import skin.support.widget.SkinCompatTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class PFRegular extends SkinCompatTextView {
    @JvmOverloads
    public PFRegular(@aa1 Context r8) {
        Intrinsics.X0O(r8, "context");
        AttributeSet r3 = null;
        int r4 = 0;
        this(r8, r3, r4, 6, null);
    }

    private final void applyCustomFont(Context r3) {
        if (r3 == null) goto L5;
        setTypeface(iiOI111I.OXO1.OXO1(MyTypeface.PF_REGULAR, r3));
        return;
    }

    @JvmOverloads
    public PFRegular(@aa1 Context r8, @tb1 AttributeSet r9) {
        Intrinsics.X0O(r8, "context");
        int r4 = 0;
        this(r8, r9, r4, 4, null);
    }

    @JvmOverloads
    public PFRegular(@aa1 Context r2, @tb1 AttributeSet r3, int r4) {
        Intrinsics.X0O(r2, "context");
        super(r2, r3, r4);
        applyCustomFont(r2);
    }

    public /* synthetic */ PFRegular(Context r1, AttributeSet r2, int r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = null;
    L6:
        if ((r4 & 4) == 0) goto L8;
        r3 = 0;
    L8:
        this(r1, r2, r3);
    }
}
