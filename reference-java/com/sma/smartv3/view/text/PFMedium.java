package com.sma.smartv3.view.text;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.core.widget.TextViewCompat;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.iiOI111I;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.C15429R;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import skin.support.widget.SkinCompatTextView;

/* JADX INFO: loaded from: classes3.dex */
public class PFMedium extends SkinCompatTextView {
    private int mDrawableTintResId;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PFMedium(@aa1 Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.X0O(context, "context");
    }

    public void applyCustomFont(@tb1 Context context) {
        if (context != null) {
            setTypeface(iiOI111I.OXO1.OXO1(MyTypeface.PF_MEDIUM, context));
        }
    }

    @Override // skin.support.widget.SkinCompatTextView, com.android.mltcode.paycertificationapi.ik4
    public void applySkin() {
        super.applySkin();
        if (this.mDrawableTintResId != 0) {
            TextViewCompat.setCompoundDrawableTintList(this, gk4.O00(getContext(), this.mDrawableTintResId));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PFMedium(@aa1 Context context, @tb1 AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.X0O(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PFMedium(@aa1 Context context, @tb1 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.X0O(context, "context");
        applyCustomFont(context);
        setFontFeatureSettings("\"liga\"=0");
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C15429R.styleable.SkinTintHelper, i, 0);
        Intrinsics.O10IXXX0X(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            if (typedArrayObtainStyledAttributes.hasValue(3)) {
                this.mDrawableTintResId = typedArrayObtainStyledAttributes.getResourceId(3, 0);
            }
            typedArrayObtainStyledAttributes.recycle();
            applySkin();
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public /* synthetic */ PFMedium(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
