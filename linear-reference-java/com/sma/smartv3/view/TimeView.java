package com.sma.smartv3.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.OIi1iX;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.tt5;
import com.android.mltcode.paycertificationapi.ut5;
import com.sma.smartv3.pro.R;
import java.util.Arrays;
import java.util.Calendar;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public final class TimeView extends FrameLayout {

    @aa1
    public final Lazy I1;

    @aa1
    public final Lazy IO;

    @JvmOverloads
    public TimeView(@aa1 Context r8) {
        Intrinsics.X0O(r8, "context");
        AttributeSet r3 = null;
        int r4 = 0;
        this(r8, r3, r4, 6, null);
    }

    public static final TextView O00(TimeView r1) {
        return (TextView) r1.findViewById(R.id.tv2);
    }

    public static /* synthetic */ TextView OXO1(TimeView r0) {
        return XO0O10(r0);
    }

    public static /* synthetic */ TextView XIi00iiXO(TimeView r0) {
        return O00(r0);
    }

    public static final TextView XO0O10(TimeView r1) {
        return (TextView) r1.findViewById(R.id.tv1);
    }

    private final TextView getTv1() {
        return (TextView) getValue();
    }

    private final TextView getTv2() {
        return (TextView) getValue();
    }

    public final void iO(int r2, int r3, int r4, int r5, int r6) {
        Calendar r0 = Calendar.getInstance();
        Intrinsics.XXI(r0);
        OIi1iX.X01IiOiIi(r0, r2);
        OIi1iX.OII(r0, r3);
        OIi1iX.IIX1OXO(r0, r4);
        OIi1iX.iIiiO(r0, r5);
        OIi1iX.OiIIX101O(r0, r6);
        if (O0X11OiO.X11iII1O1() == false) goto L6;
        TextView r7 = getTv1();
        StringCompanionObject r8 = StringCompanionObject.OXO1;
        Intrinsics.XXI(r0);
        String r9 = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(OIi1iX.XOO0ii0(r0)), Integer.valueOf(OIi1iX.OIi0(r0))}, 2));
        Intrinsics.O10IXXX0X(r9, "format(...)");
        r7.setText(r9);
        getTv2().setText("");
        return;
    L6:
        TextView r10 = getTv1();
        StringCompanionObject r11 = StringCompanionObject.OXO1;
        Intrinsics.XXI(r0);
        String r12 = String.format("%d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(OIi1iX.IiI10X(r0)), Integer.valueOf(OIi1iX.OIi0(r0))}, 2));
        Intrinsics.O10IXXX0X(r12, "format(...)");
        r10.setText(r12);
        TextView r13 = getTv2();
        if (OIi1iX.X0O(r0) == false) goto L10;
        Context r14 = getContext();
        int r15 = R.string.am;
    L11:
        r13.setText(r14.getString(r15));
        return;
    L10:
        r14 = getContext();
        r15 = R.string.pm;
        goto L11
    }

    @Override // android.view.View
    public void setEnabled(boolean r2) {
        super.setEnabled(r2);
        getTv1().setEnabled(r2);
        getTv2().setEnabled(r2);
    }

    @JvmOverloads
    public TimeView(@aa1 Context r8, @tb1 AttributeSet r9) {
        Intrinsics.X0O(r8, "context");
        int r4 = 0;
        this(r8, r9, r4, 4, null);
    }

    @JvmOverloads
    public TimeView(@aa1 Context r2, @tb1 AttributeSet r3, int r4) {
        Intrinsics.X0O(r2, "context");
        super(r2, r3, r4);
        this.IO = LazyKt__LazyJVMKt.iO(new tt5(this));
        this.I1 = LazyKt__LazyJVMKt.iO(new ut5(this));
        LayoutInflater.from(r2).inflate(R.layout.clock_view, this, true);
    }

    public /* synthetic */ TimeView(Context r1, AttributeSet r2, int r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = null;
    L6:
        if ((r4 & 4) == 0) goto L8;
        r3 = 0;
    L8:
        this(r1, r2, r3);
    }
}
