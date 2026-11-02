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

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FontEditText(@aa1 Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.X0O(context, "context");
    }

    @tb1
    public final AttributeSet getAttrs() {
        return this.attrs;
    }

    public final void setAttrs(@tb1 AttributeSet attributeSet) {
        this.attrs = attributeSet;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FontEditText(@aa1 Context context, @tb1 AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.X0O(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FontEditText(@aa1 Context context, @tb1 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.X0O(context, "context");
        this.attrs = attributeSet;
        setTypeface(FontTextView.Companion.OXO1(context, attributeSet));
    }

    public /* synthetic */ FontEditText(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R.attr.editTextStyle : i);
    }
}
