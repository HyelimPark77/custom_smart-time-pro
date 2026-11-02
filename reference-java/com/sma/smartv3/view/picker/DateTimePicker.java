package com.sma.smartv3.view.picker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.OIi1iX;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.picker.DateTimePicker;
import java.util.Calendar;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class DateTimePicker extends LinearLayout {

    /* JADX INFO: renamed from: I1 */
    @aa1
    public final TimePicker f55076I1;

    /* JADX INFO: renamed from: IO */
    @aa1
    public final DatePicker f55077IO;
    public int X0i1O;
    public int X11iII1O1;
    public int X1IX;
    public int XXX11i;

    @tb1
    public Function5<? super Integer, ? super Integer, ? super Integer, ? super Integer, ? super Integer, Unit> iIXi1iiXI;
    public int iX1O1;
    public boolean iXiX011;

    @JvmOverloads
    public DateTimePicker(@tb1 Context context) {
        this(context, null, 0, 6, null);
    }

    public static final Unit O00(DateTimePicker dateTimePicker, int i, int i2) {
        dateTimePicker.X1IX = i;
        dateTimePicker.X0i1O = i2;
        Function5<? super Integer, ? super Integer, ? super Integer, ? super Integer, ? super Integer, Unit> function5 = dateTimePicker.iIXi1iiXI;
        if (function5 != null) {
            function5.invoke(Integer.valueOf(dateTimePicker.iX1O1), Integer.valueOf(dateTimePicker.X11iII1O1), Integer.valueOf(dateTimePicker.XXX11i), Integer.valueOf(dateTimePicker.X1IX), Integer.valueOf(dateTimePicker.X0i1O));
        }
        return Unit.OXO1;
    }

    public static final Unit XO0O10(DateTimePicker dateTimePicker, int i, int i2, int i3) {
        dateTimePicker.iX1O1 = i;
        dateTimePicker.X11iII1O1 = i2;
        dateTimePicker.XXX11i = i3;
        Function5<? super Integer, ? super Integer, ? super Integer, ? super Integer, ? super Integer, Unit> function5 = dateTimePicker.iIXi1iiXI;
        if (function5 != null) {
            function5.invoke(Integer.valueOf(i), Integer.valueOf(dateTimePicker.X11iII1O1), Integer.valueOf(dateTimePicker.XXX11i), Integer.valueOf(dateTimePicker.X1IX), Integer.valueOf(dateTimePicker.X0i1O));
        }
        return Unit.OXO1;
    }

    public final boolean IiI10X() {
        return this.iXiX011;
    }

    public final void XOO0ii0(int i, int i2, int i3, int i4, int i5) {
        this.f55077IO.m38933IO(i, i2, i3);
        this.f55076I1.m38939IO(i4, i5);
    }

    @tb1
    public final Function5<Integer, Integer, Integer, Integer, Integer, Unit> getMListener() {
        return this.iIXi1iiXI;
    }

    /* JADX INFO: renamed from: iO */
    public final void m38934iO() {
        this.f55077IO.setMListener(new Function3() { // from class: com.android.mltcode.paycertificationapi.Ii01O
            @Override // kotlin.jvm.functions.Function3
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return DateTimePicker.XO0O10(this.f2165IO, ((Integer) obj).intValue(), ((Integer) obj2).intValue(), ((Integer) obj3).intValue());
            }
        });
        this.f55076I1.set24Hourly(this.iXiX011);
        this.f55076I1.setMListener(new Function2() { // from class: com.android.mltcode.paycertificationapi.XII0011II
            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj, Object obj2) {
                return DateTimePicker.O00(this.f4494IO, ((Integer) obj).intValue(), ((Integer) obj2).intValue());
            }
        });
    }

    public final void set24Hourly(boolean z) {
        this.iXiX011 = z;
        m38934iO();
    }

    public final void setMListener(@tb1 Function5<? super Integer, ? super Integer, ? super Integer, ? super Integer, ? super Integer, Unit> function5) {
        this.iIXi1iiXI = function5;
    }

    public final void setVisibleCount(int i) {
        this.f55077IO.setVisibleCount(i);
        this.f55076I1.setVisibleCount(i);
    }

    @JvmOverloads
    public DateTimePicker(@tb1 Context context, @tb1 AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ DateTimePicker(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DateTimePicker(@tb1 Context context, @tb1 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.XXI(context);
        this.iXiX011 = O0X11OiO.X11iII1O1();
        LayoutInflater.from(context).inflate(R.layout.view_date_time_picker, (ViewGroup) this, true);
        View viewFindViewById = findViewById(R.id.time_picker);
        Intrinsics.O10IXXX0X(viewFindViewById, "findViewById(...)");
        this.f55076I1 = (TimePicker) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.date_picker);
        Intrinsics.O10IXXX0X(viewFindViewById2, "findViewById(...)");
        DatePicker datePicker = (DatePicker) viewFindViewById2;
        this.f55077IO = datePicker;
        Calendar calendar = Calendar.getInstance();
        Intrinsics.O10IXXX0X(calendar, "getInstance(...)");
        int iO10IXXX0X = OIi1iX.O10IXXX0X(calendar);
        datePicker.OIX0iXi(iO10IXXX0X + 1, iO10IXXX0X);
        m38934iO();
    }
}
