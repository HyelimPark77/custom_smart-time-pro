package com.sma.smartv3.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.IOiXIi0;
import com.android.mltcode.paycertificationapi.OX1XIiX11;
import com.android.mltcode.paycertificationapi.X0O0iX0;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.iIO000111;
import com.android.mltcode.paycertificationapi.tb1;
import com.google.android.material.timepicker.TimeModel;
import com.sma.smartv3.pro.R;
import java.util.Arrays;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public final class CompletionValueView extends FrameLayout {

    @aa1
    public final Lazy I1;

    @aa1
    public final Lazy IO;

    @aa1
    public final Lazy X11iII1O1;
    public int X1IX;
    public int XXX11i;

    @aa1
    public final Lazy iX1O1;

    @JvmOverloads
    public CompletionValueView(@aa1 Context r8) {
        Intrinsics.X0O(r8, "context");
        AttributeSet r3 = null;
        int r4 = 0;
        this(r8, r3, r4, 6, null);
    }

    public static final TextView I0IIOi(CompletionValueView r1) {
        return (TextView) r1.findViewById(R.id.tv4);
    }

    public static final TextView IiI10X(CompletionValueView r1) {
        return (TextView) r1.findViewById(R.id.tv2);
    }

    public static final TextView O00(CompletionValueView r1) {
        return (TextView) r1.findViewById(R.id.tv1);
    }

    public static /* synthetic */ TextView OXO1(CompletionValueView r0) {
        return I0IIOi(r0);
    }

    public static /* synthetic */ TextView XIi00iiXO(CompletionValueView r0) {
        return IiI10X(r0);
    }

    public static /* synthetic */ TextView XO0O10(CompletionValueView r0) {
        return O00(r0);
    }

    public static final TextView XOO0ii0(CompletionValueView r1) {
        return (TextView) r1.findViewById(R.id.tv3);
    }

    private final TextView getTv1() {
        return (TextView) getValue();
    }

    private final TextView getTv2() {
        return (TextView) getValue();
    }

    private final TextView getTv3() {
        return (TextView) getValue();
    }

    private final TextView getTv4() {
        return (TextView) getValue();
    }

    public static /* synthetic */ TextView iO(CompletionValueView r0) {
        return XOO0ii0(r0);
    }

    public final int getMBpm() {
        return this.X1IX;
    }

    public final int getMDuration() {
        return this.XXX11i;
    }

    public final void setMBpm(int r3) {
        this.X1IX = r3;
        getTv1().setVisibility(0);
        getTv2().setVisibility(0);
        getTv3().setVisibility(8);
        getTv4().setVisibility(8);
        getTv1().setText(String.valueOf(this.X1IX));
        getTv2().setText(getContext().getString(R.string.bpm));
    }

    public final void setMDuration(int r7) {
        this.XXX11i = r7;
        getTv1().setVisibility(0);
        getTv2().setVisibility(0);
        getTv3().setVisibility(0);
        getTv4().setVisibility(0);
        TextView r0 = getTv1();
        StringCompanionObject r1 = StringCompanionObject.OXO1;
        String r2 = String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(r7 / 60)}, 1));
        Intrinsics.O10IXXX0X(r2, "format(...)");
        r0.setText(r2);
        getTv2().setText(getContext().getString(R.string.minute_abrv));
        TextView r3 = getTv3();
        String r8 = String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(r7 % 60)}, 1));
        Intrinsics.O10IXXX0X(r8, "format(...)");
        r3.setText(r8);
        getTv4().setText(getContext().getString(R.string.second_abrv));
    }

    @JvmOverloads
    public CompletionValueView(@aa1 Context r8, @tb1 AttributeSet r9) {
        Intrinsics.X0O(r8, "context");
        int r4 = 0;
        this(r8, r9, r4, 4, null);
    }

    @JvmOverloads
    public CompletionValueView(@aa1 Context r2, @tb1 AttributeSet r3, int r4) {
        Intrinsics.X0O(r2, "context");
        super(r2, r3, r4);
        this.IO = LazyKt__LazyJVMKt.iO(new IOiXIi0(this));
        this.I1 = LazyKt__LazyJVMKt.iO(new iIO000111(this));
        this.iX1O1 = LazyKt__LazyJVMKt.iO(new OX1XIiX11(this));
        this.X11iII1O1 = LazyKt__LazyJVMKt.iO(new X0O0iX0(this));
        LayoutInflater.from(r2).inflate(R.layout.completion_value_view, this, true);
    }

    public /* synthetic */ CompletionValueView(Context r1, AttributeSet r2, int r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = null;
    L6:
        if ((r4 & 4) == 0) goto L8;
        r3 = 0;
    L8:
        this(r1, r2, r3);
    }
}
