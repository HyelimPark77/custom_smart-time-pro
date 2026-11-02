package com.sma.smartv3.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.google.android.material.timepicker.TimeModel;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.CompletionValueView;
import java.util.Arrays;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public final class CompletionValueView extends FrameLayout {

    /* JADX INFO: renamed from: I1 */
    @aa1
    public final Lazy f54965I1;

    /* JADX INFO: renamed from: IO */
    @aa1
    public final Lazy f54966IO;

    @aa1
    public final Lazy X11iII1O1;
    public int X1IX;
    public int XXX11i;

    @aa1
    public final Lazy iX1O1;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CompletionValueView(@aa1 Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.X0O(context, "context");
    }

    public static final TextView I0IIOi(CompletionValueView completionValueView) {
        return (TextView) completionValueView.findViewById(R.id.tv4);
    }

    public static final TextView IiI10X(CompletionValueView completionValueView) {
        return (TextView) completionValueView.findViewById(R.id.tv2);
    }

    public static final TextView O00(CompletionValueView completionValueView) {
        return (TextView) completionValueView.findViewById(R.id.tv1);
    }

    public static final TextView XOO0ii0(CompletionValueView completionValueView) {
        return (TextView) completionValueView.findViewById(R.id.tv3);
    }

    private final TextView getTv1() {
        return (TextView) this.f54966IO.getValue();
    }

    private final TextView getTv2() {
        return (TextView) this.f54965I1.getValue();
    }

    private final TextView getTv3() {
        return (TextView) this.iX1O1.getValue();
    }

    private final TextView getTv4() {
        return (TextView) this.X11iII1O1.getValue();
    }

    public final int getMBpm() {
        return this.X1IX;
    }

    public final int getMDuration() {
        return this.XXX11i;
    }

    public final void setMBpm(int i) {
        this.X1IX = i;
        getTv1().setVisibility(0);
        getTv2().setVisibility(0);
        getTv3().setVisibility(8);
        getTv4().setVisibility(8);
        getTv1().setText(String.valueOf(this.X1IX));
        getTv2().setText(getContext().getString(R.string.bpm));
    }

    public final void setMDuration(int i) {
        this.XXX11i = i;
        getTv1().setVisibility(0);
        getTv2().setVisibility(0);
        getTv3().setVisibility(0);
        getTv4().setVisibility(0);
        TextView tv1 = getTv1();
        StringCompanionObject stringCompanionObject = StringCompanionObject.OXO1;
        String str = String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(i / 60)}, 1));
        Intrinsics.O10IXXX0X(str, "format(...)");
        tv1.setText(str);
        getTv2().setText(getContext().getString(R.string.minute_abrv));
        TextView tv3 = getTv3();
        String str2 = String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(i % 60)}, 1));
        Intrinsics.O10IXXX0X(str2, "format(...)");
        tv3.setText(str2);
        getTv4().setText(getContext().getString(R.string.second_abrv));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CompletionValueView(@aa1 Context context, @tb1 AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.X0O(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CompletionValueView(@aa1 Context context, @tb1 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.X0O(context, "context");
        this.f54966IO = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IOiXIi0
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return CompletionValueView.O00(this.f1922IO);
            }
        });
        this.f54965I1 = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iIO000111
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return CompletionValueView.IiI10X(this.f7861IO);
            }
        });
        this.iX1O1 = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.OX1XIiX11
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return CompletionValueView.XOO0ii0(this.f3442IO);
            }
        });
        this.X11iII1O1 = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.X0O0iX0
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return CompletionValueView.I0IIOi(this.f3980IO);
            }
        });
        LayoutInflater.from(context).inflate(R.layout.completion_value_view, (ViewGroup) this, true);
    }

    public /* synthetic */ CompletionValueView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
