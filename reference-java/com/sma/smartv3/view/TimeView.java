package com.sma.smartv3.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.OIi1iX;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.TimeView;
import java.util.Arrays;
import java.util.Calendar;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public final class TimeView extends FrameLayout {

    /* JADX INFO: renamed from: I1 */
    @aa1
    public final Lazy f55058I1;

    /* JADX INFO: renamed from: IO */
    @aa1
    public final Lazy f55059IO;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TimeView(@aa1 Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.X0O(context, "context");
    }

    public static final TextView O00(TimeView timeView) {
        return (TextView) timeView.findViewById(R.id.tv2);
    }

    public static final TextView XO0O10(TimeView timeView) {
        return (TextView) timeView.findViewById(R.id.tv1);
    }

    private final TextView getTv1() {
        return (TextView) this.f55059IO.getValue();
    }

    private final TextView getTv2() {
        return (TextView) this.f55058I1.getValue();
    }

    /* JADX INFO: renamed from: iO */
    public final void m38916iO(int i, int i2, int i3, int i4, int i5) {
        Context context;
        int i6;
        Calendar calendar = Calendar.getInstance();
        Intrinsics.XXI(calendar);
        OIi1iX.X01IiOiIi(calendar, i);
        OIi1iX.OII(calendar, i2);
        OIi1iX.IIX1OXO(calendar, i3);
        OIi1iX.iIiiO(calendar, i4);
        OIi1iX.OiIIX101O(calendar, i5);
        if (O0X11OiO.X11iII1O1()) {
            TextView tv1 = getTv1();
            StringCompanionObject stringCompanionObject = StringCompanionObject.OXO1;
            Intrinsics.XXI(calendar);
            String str = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(OIi1iX.XOO0ii0(calendar)), Integer.valueOf(OIi1iX.OIi0(calendar))}, 2));
            Intrinsics.O10IXXX0X(str, "format(...)");
            tv1.setText(str);
            getTv2().setText("");
            return;
        }
        TextView tv2 = getTv1();
        StringCompanionObject stringCompanionObject2 = StringCompanionObject.OXO1;
        Intrinsics.XXI(calendar);
        String str2 = String.format("%d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(OIi1iX.IiI10X(calendar)), Integer.valueOf(OIi1iX.OIi0(calendar))}, 2));
        Intrinsics.O10IXXX0X(str2, "format(...)");
        tv2.setText(str2);
        TextView tv3 = getTv2();
        if (OIi1iX.X0O(calendar)) {
            context = getContext();
            i6 = R.string.f54351am;
        } else {
            context = getContext();
            i6 = R.string.f54364pm;
        }
        tv3.setText(context.getString(i6));
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        getTv1().setEnabled(z);
        getTv2().setEnabled(z);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TimeView(@aa1 Context context, @tb1 AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.X0O(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TimeView(@aa1 Context context, @tb1 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.X0O(context, "context");
        this.f55059IO = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.tt5
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return TimeView.XO0O10(this.f11354IO);
            }
        });
        this.f55058I1 = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ut5
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return TimeView.O00(this.f11569IO);
            }
        });
        LayoutInflater.from(context).inflate(R.layout.clock_view, (ViewGroup) this, true);
    }

    public /* synthetic */ TimeView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
