package com.sma.smartv3.view.picker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.android.mltcode.paycertificationapi.Ii01O;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.OIi1iX;
import com.android.mltcode.paycertificationapi.XII0011II;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.pro.R;
import java.util.Calendar;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class DateTimePicker extends LinearLayout {

    @aa1
    public final TimePicker I1;

    @aa1
    public final DatePicker IO;
    public int X0i1O;
    public int X11iII1O1;
    public int X1IX;
    public int XXX11i;

    @tb1
    public Function5<? super Integer, ? super Integer, ? super Integer, ? super Integer, ? super Integer, Unit> iIXi1iiXI;
    public int iX1O1;
    public boolean iXiX011;

    @JvmOverloads
    public DateTimePicker(@tb1 Context r7) {
        AttributeSet r2 = null;
        int r3 = 0;
        this(r7, r2, r3, 6, null);
    }

    public static final Unit O00(DateTimePicker r6, int r7, int r8) {
        r6.X1IX = r7;
        r6.X0i1O = r8;
        Function5<? super Integer, ? super Integer, ? super Integer, ? super Integer, ? super Integer, Unit> r0 = r6.iIXi1iiXI;
        if (r0 == null) goto L6;
        r0.invoke(Integer.valueOf(r6.iX1O1), Integer.valueOf(r6.X11iII1O1), Integer.valueOf(r6.XXX11i), Integer.valueOf(r6.X1IX), Integer.valueOf(r6.X0i1O));
    L6:
        return Unit.OXO1;
    }

    public static /* synthetic */ Unit OXO1(DateTimePicker r0, int r1, int r2) {
        return O00(r0, r1, r2);
    }

    public static /* synthetic */ Unit XIi00iiXO(DateTimePicker r0, int r1, int r2, int r3) {
        return XO0O10(r0, r1, r2, r3);
    }

    public static final Unit XO0O10(DateTimePicker r6, int r7, int r8, int r9) {
        r6.iX1O1 = r7;
        r6.X11iII1O1 = r8;
        r6.XXX11i = r9;
        Function5<? super Integer, ? super Integer, ? super Integer, ? super Integer, ? super Integer, Unit> r0 = r6.iIXi1iiXI;
        if (r0 == null) goto L6;
        r0.invoke(Integer.valueOf(r7), Integer.valueOf(r6.X11iII1O1), Integer.valueOf(r6.XXX11i), Integer.valueOf(r6.X1IX), Integer.valueOf(r6.X0i1O));
    L6:
        return Unit.OXO1;
    }

    public final boolean IiI10X() {
        return this.iXiX011;
    }

    public final void XOO0ii0(int r2, int r3, int r4, int r5, int r6) {
        this.IO.IO(r2, r3, r4);
        this.I1.IO(r5, r6);
    }

    @tb1
    public final Function5<Integer, Integer, Integer, Integer, Integer, Unit> getMListener() {
        return this.iIXi1iiXI;
    }

    public final void iO() {
        this.IO.setMListener(new Ii01O(this));
        this.I1.set24Hourly(this.iXiX011);
        this.I1.setMListener(new XII0011II(this));
    }

    public final void set24Hourly(boolean r1) {
        this.iXiX011 = r1;
        iO();
    }

    public final void setMListener(@tb1 Function5<? super Integer, ? super Integer, ? super Integer, ? super Integer, ? super Integer, Unit> r1) {
        this.iIXi1iiXI = r1;
    }

    public final void setVisibleCount(int r2) {
        this.IO.setVisibleCount(r2);
        this.I1.setVisibleCount(r2);
    }

    @JvmOverloads
    public DateTimePicker(@tb1 Context r7, @tb1 AttributeSet r8) {
        int r3 = 0;
        this(r7, r8, r3, 4, null);
    }

    public /* synthetic */ DateTimePicker(Context r1, AttributeSet r2, int r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = null;
    L6:
        if ((r4 & 4) == 0) goto L8;
        r3 = 0;
    L8:
        this(r1, r2, r3);
    }

    @JvmOverloads
    public DateTimePicker(@tb1 Context r1, @tb1 AttributeSet r2, int r3) {
        Intrinsics.XXI(r1);
        super(r1, r2, r3);
        this.iXiX011 = O0X11OiO.X11iII1O1();
        LayoutInflater.from(r1).inflate(R.layout.view_date_time_picker, this, true);
        View r4 = findViewById(R.id.time_picker);
        Intrinsics.O10IXXX0X(r4, "findViewById(...)");
        this.I1 = (TimePicker) r4;
        View r5 = findViewById(R.id.date_picker);
        Intrinsics.O10IXXX0X(r5, "findViewById(...)");
        DatePicker r6 = (DatePicker) r5;
        this.IO = r6;
        Calendar r7 = Calendar.getInstance();
        Intrinsics.O10IXXX0X(r7, "getInstance(...)");
        int r8 = OIi1iX.O10IXXX0X(r7);
        r6.OIX0iXi(r8 + 1, r8);
        iO();
    }
}
