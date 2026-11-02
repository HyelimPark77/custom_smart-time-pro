package com.sma.smartv3.view.picker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.CallSuper;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.dg1;
import com.android.mltcode.paycertificationapi.tb1;
import com.google.android.material.timepicker.TimeModel;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.WheelView.WheelView;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public final class DurationPicker extends LinearLayout {

    /* JADX INFO: renamed from: I1 */
    @aa1
    public final WheelView f55078I1;

    /* JADX INFO: renamed from: IO */
    @aa1
    public final WheelView f55079IO;
    public int X11iII1O1;

    @tb1
    public Function1<? super Integer, Unit> XXX11i;
    public int iX1O1;

    public class OXO1 implements dg1 {
        public OXO1() {
        }

        @Override // com.android.mltcode.paycertificationapi.dg1
        @CallSuper
        public void OXO1(int i) {
            Function1<Integer, Unit> mListener = DurationPicker.this.getMListener();
            if (mListener != null) {
                mListener.invoke2(Integer.valueOf((DurationPicker.this.iX1O1 * 60) + DurationPicker.this.X11iII1O1));
            }
        }
    }

    public static final class XIi00iiXO extends OXO1 {
        public XIi00iiXO() {
            super();
        }

        @Override // com.sma.smartv3.view.picker.DurationPicker.OXO1, com.android.mltcode.paycertificationapi.dg1
        public void OXO1(int i) {
            DurationPicker.this.iX1O1 = i;
            super.OXO1(i);
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.view.picker.DurationPicker$iO */
    public static final class C19074iO extends OXO1 {
        public C19074iO() {
            super();
        }

        @Override // com.sma.smartv3.view.picker.DurationPicker.OXO1, com.android.mltcode.paycertificationapi.dg1
        public void OXO1(int i) {
            DurationPicker.this.X11iII1O1 = i;
            super.OXO1(i);
        }
    }

    @JvmOverloads
    public DurationPicker(@tb1 Context context) {
        this(context, null, 0, 6, null);
    }

    public final void O00() {
        WheelView wheelView = this.f55079IO;
        ArrayList arrayList = new ArrayList(100);
        for (int i = 0; i < 100; i++) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.OXO1;
            String str = String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
            Intrinsics.O10IXXX0X(str, "format(...)");
            arrayList.add(str);
        }
        wheelView.setItems(arrayList);
        wheelView.setListener(new XIi00iiXO());
        WheelView wheelView2 = this.f55078I1;
        ArrayList arrayList2 = new ArrayList(60);
        for (int i2 = 0; i2 < 60; i2++) {
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.OXO1;
            String str2 = String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(i2)}, 1));
            Intrinsics.O10IXXX0X(str2, "format(...)");
            arrayList2.add(str2);
        }
        wheelView2.setItems(arrayList2);
        wheelView2.setListener(new C19074iO());
    }

    @tb1
    public final Function1<Integer, Unit> getMListener() {
        return this.XXX11i;
    }

    public final void setDuration(int i) {
        int i2 = i / 60;
        this.iX1O1 = i2;
        this.X11iII1O1 = i % 60;
        this.f55079IO.setInitPosition(i2);
        this.f55078I1.setInitPosition(this.X11iII1O1);
    }

    public final void setMListener(@tb1 Function1<? super Integer, Unit> function1) {
        this.XXX11i = function1;
    }

    public final void setVisibleCount(int i) {
        this.f55079IO.setVisibleCount(i);
        this.f55078I1.setVisibleCount(i);
    }

    @JvmOverloads
    public DurationPicker(@tb1 Context context, @tb1 AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ DurationPicker(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DurationPicker(@tb1 Context context, @tb1 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.XXI(context);
        LayoutInflater.from(context).inflate(R.layout.view_duration_pickers, (ViewGroup) this, true);
        View viewFindViewById = findViewById(R.id.wv1);
        Intrinsics.O10IXXX0X(viewFindViewById, "findViewById(...)");
        this.f55079IO = (WheelView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.wv2);
        Intrinsics.O10IXXX0X(viewFindViewById2, "findViewById(...)");
        this.f55078I1 = (WheelView) viewFindViewById2;
        O00();
    }
}
