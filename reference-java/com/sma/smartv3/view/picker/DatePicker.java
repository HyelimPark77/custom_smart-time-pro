package com.sma.smartv3.view.picker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.CallSuper;
import com.android.mltcode.paycertificationapi.OIi1iX;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.dg1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.DateTimeFormat;
import com.sma.smartv3.view.WheelView.WheelView;
import java.util.ArrayList;
import java.util.Calendar;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nDatePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePicker.kt\ncom/sma/smartv3/view/picker/DatePicker\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,172:1\n1#2:173\n*E\n"})
public final class DatePicker extends LinearLayout {

    /* JADX INFO: renamed from: I1 */
    @aa1
    public final WheelView f55074I1;

    /* JADX INFO: renamed from: IO */
    @aa1
    public final WheelView f55075IO;

    @tb1
    public Calendar O001I;
    public int X0i1O;
    public int X11iII1O1;
    public int X1IX;
    public int XXX11i;
    public int iIXi1iiXI;

    @aa1
    public final WheelView iX1O1;

    @tb1
    public Function3<? super Integer, ? super Integer, ? super Integer, Unit> iXiX011;

    public class OXO1 implements dg1 {
        public OXO1() {
        }

        @Override // com.android.mltcode.paycertificationapi.dg1
        @CallSuper
        public void OXO1(int i) {
            Function3<Integer, Integer, Integer, Unit> mListener = DatePicker.this.getMListener();
            if (mListener != null) {
                mListener.invoke(Integer.valueOf(DatePicker.this.X1IX), Integer.valueOf(DatePicker.this.X0i1O), Integer.valueOf(DatePicker.this.iIXi1iiXI));
            }
        }
    }

    public static final class XIi00iiXO extends OXO1 {
        public XIi00iiXO() {
            super();
        }

        @Override // com.sma.smartv3.view.picker.DatePicker.OXO1, com.android.mltcode.paycertificationapi.dg1
        public void OXO1(int i) {
            DatePicker datePicker = DatePicker.this;
            datePicker.X1IX = datePicker.XXX11i + i;
            DatePicker.this.I0iXXO();
            super.OXO1(i);
        }
    }

    public static final class XO0O10 extends OXO1 {
        public XO0O10() {
            super();
        }

        @Override // com.sma.smartv3.view.picker.DatePicker.OXO1, com.android.mltcode.paycertificationapi.dg1
        public void OXO1(int i) {
            DatePicker.this.iIXi1iiXI = i + 1;
            super.OXO1(i);
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.view.picker.DatePicker$iO */
    public static final class C19073iO extends OXO1 {
        public C19073iO() {
            super();
        }

        @Override // com.sma.smartv3.view.picker.DatePicker.OXO1, com.android.mltcode.paycertificationapi.dg1
        public void OXO1(int i) {
            DatePicker.this.X0i1O = i + 1;
            DatePicker.this.I0iXXO();
            super.OXO1(i);
        }
    }

    @JvmOverloads
    public DatePicker(@tb1 Context context) {
        this(context, null, 0, 6, null);
    }

    public final void I0iXXO() {
        Calendar calendar = Calendar.getInstance();
        Intrinsics.XXI(calendar);
        OIi1iX.X01IiOiIi(calendar, this.X1IX);
        OIi1iX.OII(calendar, this.X0i1O);
        OIi1iX.IIX1OXO(calendar, 1);
        Intrinsics.O10IXXX0X(calendar, "also(...)");
        int iXO0O10 = OIi1iX.XO0O10(calendar);
        if (this.iIXi1iiXI > iXO0O10) {
            this.iIXi1iiXI = iXO0O10;
        }
        this.iX1O1.setInitPosition(this.iIXi1iiXI - 1);
        WheelView wheelView = this.iX1O1;
        ArrayList arrayList = new ArrayList(iXO0O10);
        int i = 0;
        int i2 = 0;
        while (i2 < iXO0O10) {
            i2++;
            arrayList.add(String.valueOf(i2));
        }
        wheelView.setItems(arrayList);
        this.f55074I1.setInitPosition(this.X0i1O - 1);
        WheelView wheelView2 = this.f55074I1;
        ArrayList arrayList2 = new ArrayList(12);
        int i3 = 0;
        while (i3 < 12) {
            i3++;
            arrayList2.add(String.valueOf(i3));
        }
        wheelView2.setItems(arrayList2);
        Calendar calendar2 = this.O001I;
        if (calendar2 == null || OIi1iX.O10IXXX0X(calendar2) != this.X1IX) {
            return;
        }
        int iMin = Math.min(this.X0i1O, OIi1iX.m891IO(calendar2) + 1);
        this.X0i1O = iMin;
        this.f55074I1.setInitPosition(iMin - 1);
        WheelView wheelView3 = this.f55074I1;
        int iM891IO = OIi1iX.m891IO(calendar2) + 1;
        ArrayList arrayList3 = new ArrayList(iM891IO);
        int i4 = 0;
        while (i4 < iM891IO) {
            i4++;
            arrayList3.add(String.valueOf(i4));
        }
        wheelView3.setItems(arrayList3);
        if (this.X0i1O == OIi1iX.m891IO(calendar2) + 1) {
            int iMin2 = Math.min(this.iIXi1iiXI, OIi1iX.XIi00iiXO(calendar2));
            this.iIXi1iiXI = iMin2;
            this.iX1O1.setInitPosition(iMin2 - 1);
            WheelView wheelView4 = this.iX1O1;
            int iXIi00iiXO = OIi1iX.XIi00iiXO(calendar2);
            ArrayList arrayList4 = new ArrayList(iXIi00iiXO);
            while (i < iXIi00iiXO) {
                i++;
                arrayList4.add(String.valueOf(i));
            }
            wheelView4.setItems(arrayList4);
        }
    }

    /* JADX INFO: renamed from: IO */
    public final void m38933IO(int i, int i2, int i3) {
        Calendar calendar = Calendar.getInstance();
        Intrinsics.XXI(calendar);
        OIi1iX.X01IiOiIi(calendar, i);
        OIi1iX.OII(calendar, i2);
        OIi1iX.IIX1OXO(calendar, i3);
        Intrinsics.XXI(calendar);
        this.X1IX = OIi1iX.O10IXXX0X(calendar);
        this.X0i1O = OIi1iX.OIX0iXi(calendar);
        this.iIXi1iiXI = OIi1iX.XIi00iiXO(calendar);
        this.f55075IO.setInitPosition(this.X1IX - this.XXX11i);
        this.f55074I1.setInitPosition(this.X0i1O - 1);
        I0iXXO();
    }

    public final void OIX0iXi(int i, int i2) {
        this.X11iII1O1 = i;
        this.XXX11i = i2;
        WheelView wheelView = this.f55075IO;
        int i3 = (i - i2) + 1;
        ArrayList arrayList = new ArrayList(i3);
        for (int i4 = 0; i4 < i3; i4++) {
            arrayList.add(String.valueOf(this.XXX11i + i4));
        }
        wheelView.setItems(arrayList);
    }

    public final void OIi0() {
        this.f55075IO.OIi0();
        WheelView wheelView = this.f55075IO;
        int i = (this.X11iII1O1 - this.XXX11i) + 1;
        ArrayList arrayList = new ArrayList(i);
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            arrayList.add(String.valueOf(this.XXX11i + i3));
        }
        wheelView.setItems(arrayList);
        this.f55075IO.setListener(new XIi00iiXO());
        WheelView wheelView2 = this.f55074I1;
        ArrayList arrayList2 = new ArrayList(12);
        while (i2 < 12) {
            i2++;
            arrayList2.add(String.valueOf(i2));
        }
        wheelView2.setItems(arrayList2);
        this.f55074I1.setListener(new C19073iO());
        this.iX1O1.setListener(new XO0O10());
    }

    @tb1
    public final Function3<Integer, Integer, Integer, Unit> getMListener() {
        return this.iXiX011;
    }

    public final void setMListener(@tb1 Function3<? super Integer, ? super Integer, ? super Integer, Unit> function3) {
        this.iXiX011 = function3;
    }

    public final void setMaxDate(long j) {
    }

    public final void setVisibleCount(int i) {
        this.f55074I1.setVisibleCount(i);
        this.iX1O1.setVisibleCount(i);
        this.f55075IO.setVisibleCount(i);
    }

    @JvmOverloads
    public DatePicker(@tb1 Context context, @tb1 AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ DatePicker(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code duplicated, block: B:11:0x0069  */
    /* JADX WARN: Code duplicated, block: B:16:0x009b  */
    /* JADX WARN: Code duplicated, block: B:9:0x0065  */
    @JvmOverloads
    public DatePicker(@tb1 Context context, @tb1 AttributeSet attributeSet, int i) {
        i72 i72Var;
        super(context, attributeSet, i);
        Intrinsics.XXI(context);
        Calendar calendar = Calendar.getInstance();
        Intrinsics.O10IXXX0X(calendar, "getInstance(...)");
        this.X11iII1O1 = OIi1iX.O10IXXX0X(calendar);
        this.XXX11i = 1920;
        LayoutInflater.from(context).inflate(R.layout.view_three_pickser2, (ViewGroup) this, true);
        if (!gk4.I0IIOi) {
            i72 i72Var2 = i72.OXO1;
            if (i72Var2.IiXIIX1O1() && i72Var2.XiOIO() == DateTimeFormat.ddMMyyyy) {
                View viewFindViewById = findViewById(R.id.wv3);
                Intrinsics.O10IXXX0X(viewFindViewById, "findViewById(...)");
                this.f55075IO = (WheelView) viewFindViewById;
                View viewFindViewById2 = findViewById(R.id.wv1);
                Intrinsics.O10IXXX0X(viewFindViewById2, "findViewById(...)");
                this.iX1O1 = (WheelView) viewFindViewById2;
                View viewFindViewById3 = findViewById(R.id.wv2);
                Intrinsics.O10IXXX0X(viewFindViewById3, "findViewById(...)");
                this.f55074I1 = (WheelView) viewFindViewById3;
            } else if (gk4.I0IIOi) {
                View viewFindViewById4 = findViewById(R.id.wv3);
                Intrinsics.O10IXXX0X(viewFindViewById4, "findViewById(...)");
                this.f55075IO = (WheelView) viewFindViewById4;
                View viewFindViewById5 = findViewById(R.id.wv1);
                Intrinsics.O10IXXX0X(viewFindViewById5, "findViewById(...)");
                this.f55074I1 = (WheelView) viewFindViewById5;
                View viewFindViewById6 = findViewById(R.id.wv2);
                Intrinsics.O10IXXX0X(viewFindViewById6, "findViewById(...)");
                this.iX1O1 = (WheelView) viewFindViewById6;
            } else {
                i72Var = i72.OXO1;
                if (!i72Var.IiXIIX1O1() && i72Var.XiOIO() == DateTimeFormat.yyyyMMdd) {
                    View viewFindViewById7 = findViewById(R.id.wv1);
                    Intrinsics.O10IXXX0X(viewFindViewById7, "findViewById(...)");
                    this.f55075IO = (WheelView) viewFindViewById7;
                    View viewFindViewById8 = findViewById(R.id.wv2);
                    Intrinsics.O10IXXX0X(viewFindViewById8, "findViewById(...)");
                    this.f55074I1 = (WheelView) viewFindViewById8;
                    View viewFindViewById9 = findViewById(R.id.wv3);
                    Intrinsics.O10IXXX0X(viewFindViewById9, "findViewById(...)");
                    this.iX1O1 = (WheelView) viewFindViewById9;
                } else {
                    View viewFindViewById10 = findViewById(R.id.wv3);
                    Intrinsics.O10IXXX0X(viewFindViewById10, "findViewById(...)");
                    this.f55075IO = (WheelView) viewFindViewById10;
                    View viewFindViewById11 = findViewById(R.id.wv1);
                    Intrinsics.O10IXXX0X(viewFindViewById11, "findViewById(...)");
                    this.f55074I1 = (WheelView) viewFindViewById11;
                    View viewFindViewById12 = findViewById(R.id.wv2);
                    Intrinsics.O10IXXX0X(viewFindViewById12, "findViewById(...)");
                    this.iX1O1 = (WheelView) viewFindViewById12;
                }
            }
        } else if (gk4.I0IIOi) {
            i72Var = i72.OXO1;
            if (!i72Var.IiXIIX1O1()) {
                View viewFindViewById13 = findViewById(R.id.wv3);
                Intrinsics.O10IXXX0X(viewFindViewById13, "findViewById(...)");
                this.f55075IO = (WheelView) viewFindViewById13;
                View viewFindViewById14 = findViewById(R.id.wv1);
                Intrinsics.O10IXXX0X(viewFindViewById14, "findViewById(...)");
                this.f55074I1 = (WheelView) viewFindViewById14;
                View viewFindViewById15 = findViewById(R.id.wv2);
                Intrinsics.O10IXXX0X(viewFindViewById15, "findViewById(...)");
                this.iX1O1 = (WheelView) viewFindViewById15;
            } else {
                View viewFindViewById16 = findViewById(R.id.wv3);
                Intrinsics.O10IXXX0X(viewFindViewById16, "findViewById(...)");
                this.f55075IO = (WheelView) viewFindViewById16;
                View viewFindViewById17 = findViewById(R.id.wv1);
                Intrinsics.O10IXXX0X(viewFindViewById17, "findViewById(...)");
                this.f55074I1 = (WheelView) viewFindViewById17;
                View viewFindViewById18 = findViewById(R.id.wv2);
                Intrinsics.O10IXXX0X(viewFindViewById18, "findViewById(...)");
                this.iX1O1 = (WheelView) viewFindViewById18;
            }
        } else {
            View viewFindViewById19 = findViewById(R.id.wv3);
            Intrinsics.O10IXXX0X(viewFindViewById19, "findViewById(...)");
            this.f55075IO = (WheelView) viewFindViewById19;
            View viewFindViewById110 = findViewById(R.id.wv1);
            Intrinsics.O10IXXX0X(viewFindViewById110, "findViewById(...)");
            this.f55074I1 = (WheelView) viewFindViewById110;
            View viewFindViewById111 = findViewById(R.id.wv2);
            Intrinsics.O10IXXX0X(viewFindViewById111, "findViewById(...)");
            this.iX1O1 = (WheelView) viewFindViewById111;
        }
        OIi0();
    }
}
