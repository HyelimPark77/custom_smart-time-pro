package com.sma.smartv3.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.C15429R;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import skin.support.widget.SkinCompatLinearLayout;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nMyLinearLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MyLinearLayout.kt\ncom/sma/smartv3/view/MyLinearLayout\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,46:1\n176#2,2:47\n*S KotlinDebug\n*F\n+ 1 MyLinearLayout.kt\ncom/sma/smartv3/view/MyLinearLayout\n*L\n43#1:47,2\n*E\n"})
public final class MyLinearLayout extends SkinCompatLinearLayout {

    /* JADX INFO: renamed from: I1 */
    public int f55008I1;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MyLinearLayout(@aa1 Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.X0O(context, "context");
    }

    @Override // skin.support.widget.SkinCompatLinearLayout, com.android.mltcode.paycertificationapi.ik4
    public void applySkin() {
        super.applySkin();
        if (this.f55008I1 != 0) {
            TypedValue typedValue = new TypedValue();
            gk4.XiOIO(getContext(), this.f55008I1, typedValue, true);
            int dimension = (int) typedValue.getDimension(getContext().getResources().getDisplayMetrics());
            setPadding(dimension, dimension, dimension, dimension);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MyLinearLayout(@aa1 Context context, @tb1 AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.X0O(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MyLinearLayout(@aa1 Context context, @tb1 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.X0O(context, "context");
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C15429R.styleable.SkinTintHelper, i, 0);
        Intrinsics.O10IXXX0X(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        try {
            if (typedArrayObtainStyledAttributes.hasValue(0)) {
                this.f55008I1 = typedArrayObtainStyledAttributes.getResourceId(0, 0);
            }
            typedArrayObtainStyledAttributes.recycle();
            applySkin();
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public /* synthetic */ MyLinearLayout(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
