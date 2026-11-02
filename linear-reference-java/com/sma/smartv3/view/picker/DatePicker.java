package com.sma.smartv3.view.picker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
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

    @aa1
    public final WheelView I1;

    @aa1
    public final WheelView IO;

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
        public final /* synthetic */ DatePicker OXO1;

        public OXO1(DatePicker r1) {
            this.OXO1 = r1;
        }

        @Override // com.android.mltcode.paycertificationapi.dg1
        @CallSuper
        public void OXO1(int r4) {
            Function3<Integer, Integer, Integer, Unit> r5 = this.OXO1.getMListener();
            if (r5 == null) goto L6;
            r5.invoke(Integer.valueOf(DatePicker.XO0O10(this.OXO1)), Integer.valueOf(DatePicker.iO(this.OXO1)), Integer.valueOf(DatePicker.OXO1(this.OXO1)));
            return;
        }
    }

    public static final class XIi00iiXO extends OXO1 {
        public final /* synthetic */ DatePicker XIi00iiXO;

        public XIi00iiXO(DatePicker r1) {
            this.XIi00iiXO = r1;
            super(r1);
        }

        @Override // com.sma.smartv3.view.picker.DatePicker.OXO1, com.android.mltcode.paycertificationapi.dg1
        public void OXO1(int r3) {
            DatePicker r0 = this.XIi00iiXO;
            DatePicker.XOO0ii0(r0, DatePicker.XIi00iiXO(r0) + r3);
            DatePicker.I0IIOi(this.XIi00iiXO);
            super.OXO1(r3);
        }
    }

    public static final class XO0O10 extends OXO1 {
        public final /* synthetic */ DatePicker XIi00iiXO;

        public XO0O10(DatePicker r1) {
            this.XIi00iiXO = r1;
            super(r1);
        }

        @Override // com.sma.smartv3.view.picker.DatePicker.OXO1, com.android.mltcode.paycertificationapi.dg1
        public void OXO1(int r3) {
            DatePicker.O00(this.XIi00iiXO, r3 + 1);
            super.OXO1(r3);
        }
    }

    public static final class iO extends OXO1 {
        public final /* synthetic */ DatePicker XIi00iiXO;

        public iO(DatePicker r1) {
            this.XIi00iiXO = r1;
            super(r1);
        }

        @Override // com.sma.smartv3.view.picker.DatePicker.OXO1, com.android.mltcode.paycertificationapi.dg1
        public void OXO1(int r3) {
            DatePicker.IiI10X(this.XIi00iiXO, r3 + 1);
            DatePicker.I0IIOi(this.XIi00iiXO);
            super.OXO1(r3);
        }
    }

    @JvmOverloads
    public DatePicker(@tb1 Context r7) {
        AttributeSet r2 = null;
        int r3 = 0;
        this(r7, r2, r3, 6, null);
    }

    public static final /* synthetic */ void I0IIOi(DatePicker r0) {
        r0.I0iXXO();
    }

    public static final /* synthetic */ void IiI10X(DatePicker r0, int r1) {
        r0.X0i1O = r1;
    }

    public static final /* synthetic */ void O00(DatePicker r0, int r1) {
        r0.iIXi1iiXI = r1;
    }

    public static final /* synthetic */ int OXO1(DatePicker r0) {
        return r0.iIXi1iiXI;
    }

    public static final /* synthetic */ int XIi00iiXO(DatePicker r0) {
        return r0.XXX11i;
    }

    public static final /* synthetic */ int XO0O10(DatePicker r0) {
        return r0.X1IX;
    }

    public static final /* synthetic */ void XOO0ii0(DatePicker r0, int r1) {
        r0.X1IX = r1;
    }

    public static final /* synthetic */ int iO(DatePicker r0) {
        return r0.X0i1O;
    }

    public final void I0iXXO() {
        Calendar r0 = Calendar.getInstance();
        Intrinsics.XXI(r0);
        OIi1iX.X01IiOiIi(r0, this.X1IX);
        OIi1iX.OII(r0, this.X0i1O);
        OIi1iX.IIX1OXO(r0, 1);
        Intrinsics.O10IXXX0X(r0, "also(...)");
        int r1 = OIi1iX.XO0O10(r0);
        if (this.iIXi1iiXI <= r1) goto L5;
        this.iIXi1iiXI = r1;
    L5:
        this.iX1O1.setInitPosition(this.iIXi1iiXI - 1);
        WheelView r2 = this.iX1O1;
        ArrayList r3 = new ArrayList(r1);
        int r4 = 0;
        int r5 = 0;
    L6:
        if (r5 >= r1) goto L8;
        r5 = r5 + 1;
        r3.add(String.valueOf(r5));
        goto L6
    L8:
        r2.setItems(r3);
        this.I1.setInitPosition(this.X0i1O - 1);
        WheelView r6 = this.I1;
        ArrayList r7 = new ArrayList(12);
        int r8 = 0;
    L9:
        if (r8 >= 12) goto L11;
        r8 = r8 + 1;
        r7.add(String.valueOf(r8));
        goto L9
    L11:
        r6.setItems(r7);
        Calendar r9 = this.O001I;
        if (r9 != null) goto L14;
        return;
    L14:
        if (OIi1iX.O10IXXX0X(r9) != this.X1IX) goto L32;
        int r10 = Math.min(this.X0i1O, OIi1iX.IO(r9) + 1);
        this.X0i1O = r10;
        this.I1.setInitPosition(r10 - 1);
        WheelView r11 = this.I1;
        int r12 = OIi1iX.IO(r9) + 1;
        ArrayList r13 = new ArrayList(r12);
        int r14 = 0;
    L17:
        if (r14 >= r12) goto L19;
        r14 = r14 + 1;
        r13.add(String.valueOf(r14));
        goto L17
    L19:
        r11.setItems(r13);
        if (this.X0i1O != (OIi1iX.IO(r9) + 1)) goto L31;
        int r15 = Math.min(this.iIXi1iiXI, OIi1iX.XIi00iiXO(r9));
        this.iIXi1iiXI = r15;
        this.iX1O1.setInitPosition(r15 - 1);
        WheelView r16 = this.iX1O1;
        int r17 = OIi1iX.XIi00iiXO(r9);
        ArrayList r18 = new ArrayList(r17);
    L22:
        if (r4 >= r17) goto L24;
        r4 = r4 + 1;
        r18.add(String.valueOf(r4));
        goto L22
    L24:
        r16.setItems(r18);
        return;
    L31:
        return;
    }

    public final void IO(int r2, int r3, int r4) {
        Calendar r0 = Calendar.getInstance();
        Intrinsics.XXI(r0);
        OIi1iX.X01IiOiIi(r0, r2);
        OIi1iX.OII(r0, r3);
        OIi1iX.IIX1OXO(r0, r4);
        Intrinsics.XXI(r0);
        this.X1IX = OIi1iX.O10IXXX0X(r0);
        this.X0i1O = OIi1iX.OIX0iXi(r0);
        this.iIXi1iiXI = OIi1iX.XIi00iiXO(r0);
        this.IO.setInitPosition(this.X1IX - this.XXX11i);
        this.I1.setInitPosition(this.X0i1O - 1);
        I0iXXO();
    }

    public final void OIX0iXi(int r4, int r5) {
        this.X11iII1O1 = r4;
        this.XXX11i = r5;
        WheelView r0 = this.IO;
        int r6 = (r4 - r5) + 1;
        ArrayList r7 = new ArrayList(r6);
        int r1 = 0;
    L3:
        if (r1 >= r6) goto L5;
        r7.add(String.valueOf(this.XXX11i + r1));
        r1 = r1 + 1;
        goto L3
    L5:
        r0.setItems(r7);
    }

    public final void OIi0() {
        this.IO.OIi0();
        WheelView r0 = this.IO;
        int r1 = (this.X11iII1O1 - this.XXX11i) + 1;
        ArrayList r2 = new ArrayList(r1);
        int r3 = 0;
        int r4 = 0;
    L3:
        if (r4 >= r1) goto L5;
        r2.add(String.valueOf(this.XXX11i + r4));
        r4 = r4 + 1;
        goto L3
    L5:
        r0.setItems(r2);
        this.IO.setListener(new XIi00iiXO(this));
        WheelView r5 = this.I1;
        ArrayList r6 = new ArrayList(12);
    L6:
        if (r3 >= 12) goto L8;
        r3 = r3 + 1;
        r6.add(String.valueOf(r3));
        goto L6
    L8:
        r5.setItems(r6);
        this.I1.setListener(new iO(this));
        this.iX1O1.setListener(new XO0O10(this));
    }

    @tb1
    public final Function3<Integer, Integer, Integer, Unit> getMListener() {
        return this.iXiX011;
    }

    public final void setMListener(@tb1 Function3<? super Integer, ? super Integer, ? super Integer, Unit> r1) {
        this.iXiX011 = r1;
    }

    public final void setMaxDate(long r1) {
    }

    public final void setVisibleCount(int r2) {
        this.I1.setVisibleCount(r2);
        this.iX1O1.setVisibleCount(r2);
        this.IO.setVisibleCount(r2);
    }

    @JvmOverloads
    public DatePicker(@tb1 Context r7, @tb1 AttributeSet r8) {
        int r3 = 0;
        this(r7, r8, r3, 4, null);
    }

    public /* synthetic */ DatePicker(Context r1, AttributeSet r2, int r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = null;
    L6:
        if ((r4 & 4) == 0) goto L8;
        r3 = 0;
    L8:
        this(r1, r2, r3);
    }

    @JvmOverloads
    public DatePicker(@tb1 Context r4, @tb1 AttributeSet r5, int r6) {
        Intrinsics.XXI(r4);
        super(r4, r5, r6);
        Calendar r7 = Calendar.getInstance();
        Intrinsics.O10IXXX0X(r7, "getInstance(...)");
        this.X11iII1O1 = OIi1iX.O10IXXX0X(r7);
        this.XXX11i = 1920;
        LayoutInflater.from(r4).inflate(R.layout.view_three_pickser2, this, true);
        if (gk4.I0IIOi == true) goto L10;
        i72 r8 = i72.OXO1;
        if (r8.IiXIIX1O1() == false) goto L10;
        if (r8.XiOIO() != DateTimeFormat.ddMMyyyy) goto L10;
        View r9 = findViewById(R.id.wv3);
        Intrinsics.O10IXXX0X(r9, "findViewById(...)");
        this.IO = (WheelView) r9;
        View r10 = findViewById(R.id.wv1);
        Intrinsics.O10IXXX0X(r10, "findViewById(...)");
        this.iX1O1 = (WheelView) r10;
        View r11 = findViewById(R.id.wv2);
        Intrinsics.O10IXXX0X(r11, "findViewById(...)");
        this.I1 = (WheelView) r11;
    L17:
        OIi0();
        return;
    L10:
        if (gk4.I0IIOi == true) goto L16;
        i72 r12 = i72.OXO1;
        if (r12.IiXIIX1O1() == false) goto L16;
        if (r12.XiOIO() != DateTimeFormat.yyyyMMdd) goto L16;
        View r13 = findViewById(R.id.wv1);
        Intrinsics.O10IXXX0X(r13, "findViewById(...)");
        this.IO = (WheelView) r13;
        View r14 = findViewById(R.id.wv2);
        Intrinsics.O10IXXX0X(r14, "findViewById(...)");
        this.I1 = (WheelView) r14;
        View r15 = findViewById(R.id.wv3);
        Intrinsics.O10IXXX0X(r15, "findViewById(...)");
        this.iX1O1 = (WheelView) r15;
    L16:
        View r16 = findViewById(R.id.wv3);
        Intrinsics.O10IXXX0X(r16, "findViewById(...)");
        this.IO = (WheelView) r16;
        View r17 = findViewById(R.id.wv1);
        Intrinsics.O10IXXX0X(r17, "findViewById(...)");
        this.I1 = (WheelView) r17;
        View r18 = findViewById(R.id.wv2);
        Intrinsics.O10IXXX0X(r18, "findViewById(...)");
        this.iX1O1 = (WheelView) r18;
        goto L17
    }
}
