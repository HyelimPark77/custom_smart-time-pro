package com.sma.smartv3.view.text;

import android.content.Context;
import android.util.AttributeSet;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.pro.R;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import skin.support.widget.SkinCompatEditText;

/* JADX INFO: loaded from: classes3.dex */
public final class FontEditText extends SkinCompatEditText {

    @tb1
    private AttributeSet attrs;

    @JvmOverloads
    public FontEditText(@aa1 Context r8) {
        Intrinsics.X0O(r8, "context");
        AttributeSet r3 = null;
        int r4 = 0;
        this(r8, r3, r4, 6, null);
    }

    @tb1
    public final AttributeSet getAttrs() {
        return this.attrs;
    }

    public final void setAttrs(@tb1 AttributeSet r1) {
        this.attrs = r1;
    }

    @JvmOverloads
    public FontEditText(@aa1 Context r8, @tb1 AttributeSet r9) {
        Intrinsics.X0O(r8, "context");
        int r4 = 0;
        this(r8, r9, r4, 4, null);
    }

    @JvmOverloads
    public FontEditText(@aa1 Context r2, @tb1 AttributeSet r3, int r4) {
        Intrinsics.X0O(r2, "context");
        super(r2, r3, r4);
        this.attrs = r3;
        setTypeface(FontTextView.Companion.OXO1(r2, r3));
    }

    public /* synthetic */ FontEditText(Context r1, AttributeSet r2, int r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = null;
    L6:
        if ((r4 & 4) == 0) goto L8;
        r3 = R.attr.editTextStyle;
    L8:
        this(r1, r2, r3);
    }
}
