package com.sma.smartv3.view.text;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.iiOI111I;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.C15429R;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import skin.support.widget.SkinCompatTextView;

/* JADX INFO: loaded from: classes3.dex */
public class FontTextView extends SkinCompatTextView {

    @aa1
    public static final OXO1 Companion = new OXO1(null);

    public static final class OXO1 {
        public /* synthetic */ OXO1(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @tb1
        public final Typeface OXO1(@aa1 Context context, @tb1 AttributeSet attributeSet) {
            Typeface typefaceOXO1;
            Intrinsics.X0O(context, "context");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C15429R.styleable.FontTextView);
            Intrinsics.O10IXXX0X(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
            int integer = typedArrayObtainStyledAttributes.getInteger(0, 0);
            if (integer == 1) {
                typefaceOXO1 = iiOI111I.OXO1.OXO1(MyTypeface.DIN_COND_BOLD, context);
            } else if (integer == 2) {
                typefaceOXO1 = iiOI111I.OXO1.OXO1(MyTypeface.PF_BOLD, context);
            } else if (integer == 3) {
                typefaceOXO1 = iiOI111I.OXO1.OXO1(MyTypeface.PF_EXTRA_LIGHT, context);
            } else if (integer != 4) {
                typefaceOXO1 = integer != 5 ? null : iiOI111I.OXO1.OXO1(MyTypeface.PF_REGULAR, context);
            } else {
                typefaceOXO1 = iiOI111I.OXO1.OXO1(MyTypeface.PF_MEDIUM, context);
            }
            typedArrayObtainStyledAttributes.recycle();
            return typefaceOXO1;
        }

        public OXO1() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FontTextView(@aa1 Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.X0O(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FontTextView(@aa1 Context context, @tb1 AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.X0O(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public FontTextView(@aa1 Context context, @tb1 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.X0O(context, "context");
        setTypeface(Companion.OXO1(context, attributeSet));
    }

    public /* synthetic */ FontTextView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
