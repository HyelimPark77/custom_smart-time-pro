package com.sma.smartv3.view.picker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
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

    @aa1
    public final TimePicker I1;

    @aa1
    public final TimePicker IO;

    @tb1
    public Function4<? super Integer, ? super Integer, ? super Integer, ? super Integer, Unit> X0i1O;
    public int X11iII1O1;
    public int X1IX;
    public int XXX11i;
    public boolean iIXi1iiXI;
    public int iX1O1;

    public class OXO1 implements Function2<Integer, Integer, Unit> {
        public final /* synthetic */ TimeRangePicker IO;

        public OXO1(TimeRangePicker r1) {
            this.IO = r1;
        }

        @CallSuper
        public void OXO1(int r4, int r5) {
            Function4<Integer, Integer, Integer, Integer, Unit> r6 = this.IO.getMListener();
            if (r6 == null) goto L6;
            r6.invoke(Integer.valueOf(TimeRangePicker.iO(this.IO)), Integer.valueOf(TimeRangePicker.XO0O10(this.IO)), Integer.valueOf(TimeRangePicker.OXO1(this.IO)), Integer.valueOf(TimeRangePicker.XIi00iiXO(this.IO)));
            return;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Integer r1, Integer r2) {
            OXO1(r1.intValue(), r2.intValue());
            return Unit.OXO1;
        }
    }

    public static final class XIi00iiXO extends OXO1 {
        public final /* synthetic */ TimeRangePicker I1;

        public XIi00iiXO(TimeRangePicker r1) {
            this.I1 = r1;
            super(r1);
        }

        @Override // com.sma.smartv3.view.picker.TimeRangePicker.OXO1
        public void OXO1(int r2, int r3) {
            TimeRangePicker.XOO0ii0(this.I1, r2);
            TimeRangePicker.I0IIOi(this.I1, r3);
            super.OXO1(r2, r3);
        }

        @Override // com.sma.smartv3.view.picker.TimeRangePicker.OXO1, kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Integer r1, Integer r2) {
            OXO1(r1.intValue(), r2.intValue());
            return Unit.OXO1;
        }
    }

    public static final class iO extends OXO1 {
        public final /* synthetic */ TimeRangePicker I1;

        public iO(TimeRangePicker r1) {
            this.I1 = r1;
            super(r1);
        }

        @Override // com.sma.smartv3.view.picker.TimeRangePicker.OXO1
        public void OXO1(int r2, int r3) {
            TimeRangePicker.O00(this.I1, r2);
            TimeRangePicker.IiI10X(this.I1, r3);
            super.OXO1(r2, r3);
        }

        @Override // com.sma.smartv3.view.picker.TimeRangePicker.OXO1, kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Integer r1, Integer r2) {
            OXO1(r1.intValue(), r2.intValue());
            return Unit.OXO1;
        }
    }

    @JvmOverloads
    public TimeRangePicker(@tb1 Context r7) {
        AttributeSet r2 = null;
        int r3 = 0;
        this(r7, r2, r3, 6, null);
    }

    public static final /* synthetic */ void I0IIOi(TimeRangePicker r0, int r1) {
        r0.X11iII1O1 = r1;
    }

    public static final /* synthetic */ void IiI10X(TimeRangePicker r0, int r1) {
        r0.X1IX = r1;
    }

    public static final /* synthetic */ void O00(TimeRangePicker r0, int r1) {
        r0.XXX11i = r1;
    }

    public static final /* synthetic */ int OXO1(TimeRangePicker r0) {
        return r0.XXX11i;
    }

    public static final /* synthetic */ int XIi00iiXO(TimeRangePicker r0) {
        return r0.X1IX;
    }

    public static final /* synthetic */ int XO0O10(TimeRangePicker r0) {
        return r0.X11iII1O1;
    }

    public static final /* synthetic */ void XOO0ii0(TimeRangePicker r0, int r1) {
        r0.iX1O1 = r1;
    }

    public static final /* synthetic */ int iO(TimeRangePicker r0) {
        return r0.iX1O1;
    }

    public final boolean IO() {
        return this.iIXi1iiXI;
    }

    public final void OIX0iXi(int r2, int r3, int r4, int r5) {
        this.IO.IO(r2, r3);
        this.I1.IO(r4, r5);
        this.iX1O1 = r2;
        this.X11iII1O1 = r3;
        this.XXX11i = r4;
        this.X1IX = r5;
    }

    public final void OIi0() {
        this.IO.set24Hourly(this.iIXi1iiXI);
        this.IO.setMListener(new XIi00iiXO(this));
        this.I1.set24Hourly(this.iIXi1iiXI);
        this.I1.setMListener(new iO(this));
    }

    @tb1
    public final Function4<Integer, Integer, Integer, Integer, Unit> getMListener() {
        return this.X0i1O;
    }

    public final void set24Hourly(boolean r1) {
        this.iIXi1iiXI = r1;
        OIi0();
    }

    public final void setMListener(@tb1 Function4<? super Integer, ? super Integer, ? super Integer, ? super Integer, Unit> r1) {
        this.X0i1O = r1;
    }

    public final void setVisibleCount(int r2) {
        this.IO.setVisibleCount(r2);
        this.I1.setVisibleCount(r2);
    }

    @JvmOverloads
    public TimeRangePicker(@tb1 Context r7, @tb1 AttributeSet r8) {
        int r3 = 0;
        this(r7, r8, r3, 4, null);
    }

    @JvmOverloads
    public TimeRangePicker(@tb1 Context r1, @tb1 AttributeSet r2, int r3) {
        super(r1, r2, r3);
        this.iIXi1iiXI = O0X11OiO.X11iII1O1();
        LayoutInflater.from(r1).inflate(R.layout.view_time_range_picker, this, true);
        View r4 = findViewById(R.id.picker_start);
        Intrinsics.O10IXXX0X(r4, "findViewById(...)");
        this.IO = (TimePicker) r4;
        View r5 = findViewById(R.id.picker_end);
        Intrinsics.O10IXXX0X(r5, "findViewById(...)");
        this.I1 = (TimePicker) r5;
        OIi0();
    }

    public /* synthetic */ TimeRangePicker(Context r1, AttributeSet r2, int r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = null;
    L6:
        if ((r4 & 4) == 0) goto L8;
        r3 = 0;
    L8:
        this(r1, r2, r3);
    }
}
