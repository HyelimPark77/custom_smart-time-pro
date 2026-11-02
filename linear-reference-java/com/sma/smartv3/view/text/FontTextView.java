package com.sma.smartv3.view.text;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.iiOI111I;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.R;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import skin.support.widget.SkinCompatTextView;

/* JADX INFO: loaded from: classes3.dex */
public class FontTextView extends SkinCompatTextView {

    @aa1
    public static final OXO1 Companion = null;

    public static final class OXO1 {
        public /* synthetic */ OXO1(DefaultConstructorMarker r1) {
            this();
        }

        @tb1
        public final Typeface OXO1(@aa1 Context r3, @tb1 AttributeSet r4) {
            Intrinsics.X0O(r3, "context");
            TypedArray r5 = r3.obtainStyledAttributes(r4, R.styleable.FontTextView);
            Intrinsics.O10IXXX0X(r5, "obtainStyledAttributes(...)");
            int r0 = r5.getInteger(0, 0);
            if (r0 != 1) goto L5;
            Typeface r6 = iiOI111I.OXO1.OXO1(MyTypeface.DIN_COND_BOLD, r3);
        L18:
            r5.recycle();
            return r6;
        L5:
            if (r0 != 2) goto L7;
            r6 = iiOI111I.OXO1.OXO1(MyTypeface.PF_BOLD, r3);
            goto L18
        L7:
            if (r0 != 3) goto L9;
            r6 = iiOI111I.OXO1.OXO1(MyTypeface.PF_EXTRA_LIGHT, r3);
            goto L18
        L9:
            if (r0 != 4) goto L11;
            r6 = iiOI111I.OXO1.OXO1(MyTypeface.PF_MEDIUM, r3);
            goto L18
        L11:
            if (r0 == 5) goto L13;
            r6 = null;
            goto L18
        L13:
            r6 = iiOI111I.OXO1.OXO1(MyTypeface.PF_REGULAR, r3);
            goto L18
        }

        public OXO1() {
        }
    }

    static {
        Companion = new OXO1(null);
    }

    @JvmOverloads
    public FontTextView(@aa1 Context r8) {
        Intrinsics.X0O(r8, "context");
        AttributeSet r3 = null;
        int r4 = 0;
        this(r8, r3, r4, 6, null);
    }

    @JvmOverloads
    public FontTextView(@aa1 Context r8, @tb1 AttributeSet r9) {
        Intrinsics.X0O(r8, "context");
        int r4 = 0;
        this(r8, r9, r4, 4, null);
    }

    @JvmOverloads
    public FontTextView(@aa1 Context r2, @tb1 AttributeSet r3, int r4) {
        Intrinsics.X0O(r2, "context");
        super(r2, r3, r4);
        setTypeface(Companion.OXO1(r2, r3));
    }

    public /* synthetic */ FontTextView(Context r1, AttributeSet r2, int r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = null;
    L6:
        if ((r4 & 4) == 0) goto L8;
        r3 = 0;
    L8:
        this(r1, r2, r3);
    }
}
