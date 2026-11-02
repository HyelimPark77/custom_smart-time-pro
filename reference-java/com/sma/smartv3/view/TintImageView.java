package com.sma.smartv3.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.C15429R;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import skin.support.widget.SkinCompatImageView;

/* JADX INFO: loaded from: classes3.dex */
public final class TintImageView extends SkinCompatImageView {
    private int mTintResId;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TintImageView(@aa1 Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.X0O(context, "context");
    }

    @Override // skin.support.widget.SkinCompatImageView, com.android.mltcode.paycertificationapi.ik4
    public void applySkin() {
        super.applySkin();
        if (this.mTintResId != 0) {
            setImageTintList(gk4.O00(getContext(), this.mTintResId));
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TintImageView(@aa1 Context context, @tb1 AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.X0O(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TintImageView(@aa1 Context context, @tb1 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.X0O(context, "context");
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C15429R.styleable.SkinTintHelper, i, 0);
        Intrinsics.O10IXXX0X(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            if (typedArrayObtainStyledAttributes.hasValue(1)) {
                this.mTintResId = typedArrayObtainStyledAttributes.getResourceId(1, 0);
            }
            typedArrayObtainStyledAttributes.recycle();
            applySkin();
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public /* synthetic */ TintImageView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
