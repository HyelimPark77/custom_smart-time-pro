package com.sma.smartv3.view.picker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.CallSuper;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.pro.R;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class TimeRangePicker extends LinearLayout {

    /* JADX INFO: renamed from: I1 */
    @aa1
    public final TimePicker f55086I1;

    /* JADX INFO: renamed from: IO */
    @aa1
    public final TimePicker f55087IO;

    @tb1
    public Function4<? super Integer, ? super Integer, ? super Integer, ? super Integer, Unit> X0i1O;
    public int X11iII1O1;
    public int X1IX;
    public int XXX11i;
    public boolean iIXi1iiXI;
    public int iX1O1;

    public class OXO1 implements Function2<Integer, Integer, Unit> {
        public OXO1() {
        }

        @CallSuper
        public void OXO1(int i, int i2) {
            Function4<Integer, Integer, Integer, Integer, Unit> mListener = TimeRangePicker.this.getMListener();
            if (mListener != null) {
                mListener.invoke(Integer.valueOf(TimeRangePicker.this.iX1O1), Integer.valueOf(TimeRangePicker.this.X11iII1O1), Integer.valueOf(TimeRangePicker.this.XXX11i), Integer.valueOf(TimeRangePicker.this.X1IX));
            }
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit invoke2(Integer num, Integer num2) {
            OXO1(num.intValue(), num2.intValue());
            return Unit.OXO1;
        }
    }

    public static final class XIi00iiXO extends OXO1 {
        public XIi00iiXO() {
            super();
        }

        @Override // com.sma.smartv3.view.picker.TimeRangePicker.OXO1
        public void OXO1(int i, int i2) {
            TimeRangePicker.this.iX1O1 = i;
            TimeRangePicker.this.X11iII1O1 = i2;
            super.OXO1(i, i2);
        }

        @Override // com.sma.smartv3.view.picker.TimeRangePicker.OXO1, kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit invoke2(Integer num, Integer num2) {
            OXO1(num.intValue(), num2.intValue());
            return Unit.OXO1;
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.view.picker.TimeRangePicker$iO */
    public static final class C19077iO extends OXO1 {
        public C19077iO() {
            super();
        }

        @Override // com.sma.smartv3.view.picker.TimeRangePicker.OXO1
        public void OXO1(int i, int i2) {
            TimeRangePicker.this.XXX11i = i;
            TimeRangePicker.this.X1IX = i2;
            super.OXO1(i, i2);
        }

        @Override // com.sma.smartv3.view.picker.TimeRangePicker.OXO1, kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Unit invoke2(Integer num, Integer num2) {
            OXO1(num.intValue(), num2.intValue());
            return Unit.OXO1;
        }
    }

    @JvmOverloads
    public TimeRangePicker(@tb1 Context context) {
        this(context, null, 0, 6, null);
    }

    /* JADX INFO: renamed from: IO */
    public final boolean m38941IO() {
        return this.iIXi1iiXI;
    }

    public final void OIX0iXi(int i, int i2, int i3, int i4) {
        this.f55087IO.m38939IO(i, i2);
        this.f55086I1.m38939IO(i3, i4);
        this.iX1O1 = i;
        this.X11iII1O1 = i2;
        this.XXX11i = i3;
        this.X1IX = i4;
    }

    public final void OIi0() {
        this.f55087IO.set24Hourly(this.iIXi1iiXI);
        this.f55087IO.setMListener(new XIi00iiXO());
        this.f55086I1.set24Hourly(this.iIXi1iiXI);
        this.f55086I1.setMListener(new C19077iO());
    }

    @tb1
    public final Function4<Integer, Integer, Integer, Integer, Unit> getMListener() {
        return this.X0i1O;
    }

    public final void set24Hourly(boolean z) {
        this.iIXi1iiXI = z;
        OIi0();
    }

    public final void setMListener(@tb1 Function4<? super Integer, ? super Integer, ? super Integer, ? super Integer, Unit> function4) {
        this.X0i1O = function4;
    }

    public final void setVisibleCount(int i) {
        this.f55087IO.setVisibleCount(i);
        this.f55086I1.setVisibleCount(i);
    }

    @JvmOverloads
    public TimeRangePicker(@tb1 Context context, @tb1 AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @JvmOverloads
    public TimeRangePicker(@tb1 Context context, @tb1 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.iIXi1iiXI = O0X11OiO.X11iII1O1();
        LayoutInflater.from(context).inflate(R.layout.view_time_range_picker, (ViewGroup) this, true);
        View viewFindViewById = findViewById(R.id.picker_start);
        Intrinsics.O10IXXX0X(viewFindViewById, "findViewById(...)");
        this.f55087IO = (TimePicker) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.picker_end);
        Intrinsics.O10IXXX0X(viewFindViewById2, "findViewById(...)");
        this.f55086I1 = (TimePicker) viewFindViewById2;
        OIi0();
    }

    public /* synthetic */ TimeRangePicker(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
