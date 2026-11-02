package com.sma.smartv3.view.picker;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.X10i1i;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.dg1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.tb1;
import com.google.android.material.timepicker.TimeModel;
import com.sma.smartv3.R;
import com.sma.smartv3.view.WheelView.WheelView;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public final class TimePicker extends LinearLayout {

    @aa1
    public final WheelView I1;

    @aa1
    public final WheelView IO;
    public int X0i1O;

    @aa1
    public final TextView X11iII1O1;
    public int X1IX;
    public int XXX11i;
    public boolean iIXi1iiXI;

    @aa1
    public final WheelView iX1O1;

    @tb1
    public Function2<? super Integer, ? super Integer, Unit> iXiX011;

    public class OXO1 implements dg1 {
        public final /* synthetic */ TimePicker OXO1;

        public OXO1(TimePicker r1) {
            this.OXO1 = r1;
        }

        @Override // com.android.mltcode.paycertificationapi.dg1
        @CallSuper
        public void OXO1(int r3) {
            Function2<Integer, Integer, Unit> r4 = this.OXO1.getMListener();
            if (r4 == null) goto L6;
            r4.invoke(Integer.valueOf((TimePicker.iO(this.OXO1) * 12) + TimePicker.OXO1(this.OXO1)), Integer.valueOf(TimePicker.XIi00iiXO(this.OXO1)));
            return;
        }
    }

    public static final class XIi00iiXO extends OXO1 {
        public final /* synthetic */ TimePicker XIi00iiXO;

        public XIi00iiXO(TimePicker r1) {
            this.XIi00iiXO = r1;
            super(r1);
        }

        @Override // com.sma.smartv3.view.picker.TimePicker.OXO1, com.android.mltcode.paycertificationapi.dg1
        public void OXO1(int r2) {
            TimePicker.IiI10X(this.XIi00iiXO, r2);
            super.OXO1(r2);
        }
    }

    public static final class XO0O10 extends OXO1 {
        public final /* synthetic */ TimePicker XIi00iiXO;

        public XO0O10(TimePicker r1) {
            this.XIi00iiXO = r1;
            super(r1);
        }

        @Override // com.sma.smartv3.view.picker.TimePicker.OXO1, com.android.mltcode.paycertificationapi.dg1
        public void OXO1(int r2) {
            TimePicker.O00(this.XIi00iiXO, r2);
            super.OXO1(r2);
        }
    }

    public static final class iO extends OXO1 {
        public final /* synthetic */ TimePicker XIi00iiXO;

        public iO(TimePicker r1) {
            this.XIi00iiXO = r1;
            super(r1);
        }

        @Override // com.sma.smartv3.view.picker.TimePicker.OXO1, com.android.mltcode.paycertificationapi.dg1
        public void OXO1(int r2) {
            TimePicker.XO0O10(this.XIi00iiXO, r2);
            super.OXO1(r2);
        }
    }

    @JvmOverloads
    public TimePicker(@aa1 Context r8) {
        Intrinsics.X0O(r8, "context");
        AttributeSet r3 = null;
        int r4 = 0;
        this(r8, r3, r4, 6, null);
    }

    public static final /* synthetic */ void IiI10X(TimePicker r0, int r1) {
        r0.X0i1O = r1;
    }

    public static final /* synthetic */ void O00(TimePicker r0, int r1) {
        r0.X1IX = r1;
    }

    public static final /* synthetic */ int OXO1(TimePicker r0) {
        return r0.XXX11i;
    }

    public static final /* synthetic */ int XIi00iiXO(TimePicker r0) {
        return r0.X1IX;
    }

    public static final /* synthetic */ void XO0O10(TimePicker r0, int r1) {
        r0.XXX11i = r1;
    }

    public static final /* synthetic */ int iO(TimePicker r0) {
        return r0.X0i1O;
    }

    public final void I0IIOi(Context r5, AttributeSet r6) {
        TypedArray r7 = r5.obtainStyledAttributes(r6, R.styleable.WheelView);
        Intrinsics.O10IXXX0X(r7, "obtainStyledAttributes(...)");
        float r8 = r7.getFloat(3, 24.0f);
        float r0 = r7.getFloat(2, 1.3f);
        boolean r1 = r7.getBoolean(1, false);
        set24Hourly(r7.getBoolean(0, O0X11OiO.X11iII1O1()));
        this.IO.setTextSize(r8);
        this.IO.setScaleX(r0);
        this.I1.setTextSize(r8);
        this.I1.setScaleX(r0);
        this.iX1O1.setTextSize(r8);
        this.iX1O1.OIi0();
        this.X11iII1O1.setTextSize(r8);
        if (r1 == false) goto L6;
        this.X11iII1O1.setVisibility(0);
        return;
    }

    public final void IO(int r3, int r4) {
        if (this.iIXi1iiXI == false) goto L5;
        this.IO.setInitPosition(r3);
        this.XXX11i = r3;
    L6:
        this.I1.setInitPosition(r4);
        this.X1IX = r4;
        return;
    L5:
        int r1 = r3 / 12;
        this.iX1O1.setInitPosition(r1);
        int r5 = r3 % 12;
        this.IO.setInitPosition(r5);
        this.X0i1O = r1;
        this.XXX11i = r5;
        goto L6
    }

    public final boolean OIi0() {
        return this.iIXi1iiXI;
    }

    public final void XOO0ii0() {
        int r3 = 0;
        if (this.iIXi1iiXI == false) goto L8;
        this.iX1O1.setVisibility(8);
        WheelView r0 = this.IO;
        ArrayList r5 = new ArrayList(24);
        int r7 = 0;
    L5:
        if (r7 >= 24) goto L7;
        StringCompanionObject r8 = StringCompanionObject.OXO1;
        String r9 = String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(r7)}, 1));
        Intrinsics.O10IXXX0X(r9, "format(...)");
        r5.add(r9);
        r7 = r7 + 1;
        goto L5
    L7:
        r0.setItems(r5);
    L15:
        this.IO.setListener(new iO(this));
        WheelView r1 = this.I1;
        ArrayList r6 = new ArrayList(60);
    L16:
        if (r3 >= 60) goto L18;
        StringCompanionObject r10 = StringCompanionObject.OXO1;
        String r11 = String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(r3)}, 1));
        Intrinsics.O10IXXX0X(r11, "format(...)");
        r6.add(r11);
        r3 = r3 + 1;
        goto L16
    L18:
        r1.setItems(r6);
        this.I1.setListener(new XO0O10(this));
        return;
    L8:
        this.iX1O1.setVisibility(0);
        this.iX1O1.OIi0();
        this.iX1O1.setItems(CollectionsKt__CollectionsKt.iXiX011(new String[]{getContext().getString(com.sma.smartv3.pro.R.string.am), getContext().getString(com.sma.smartv3.pro.R.string.pm)}));
        this.iX1O1.setListener(new XIi00iiXO(this));
        WheelView r2 = this.IO;
        ArrayList r12 = new ArrayList(12);
        int r13 = 0;
    L9:
        if (r13 >= 12) goto L14;
        if (r13 != 0) goto L12;
        String r14 = X10i1i.II;
    L13:
        r12.add(r14);
        r13 = r13 + 1;
        goto L9
    L12:
        r14 = String.valueOf(r13);
        goto L13
    L14:
        r2.setItems(r12);
        goto L15
    }

    @tb1
    public final Function2<Integer, Integer, Unit> getMListener() {
        return this.iXiX011;
    }

    public final void set24Hourly(boolean r1) {
        this.iIXi1iiXI = r1;
        XOO0ii0();
    }

    public final void setMListener(@tb1 Function2<? super Integer, ? super Integer, Unit> r1) {
        this.iXiX011 = r1;
    }

    public final void setVisibleCount(int r2) {
        this.IO.setVisibleCount(r2);
        this.I1.setVisibleCount(r2);
        this.iX1O1.setVisibleCount(r2);
    }

    @JvmOverloads
    public TimePicker(@aa1 Context r8, @tb1 AttributeSet r9) {
        Intrinsics.X0O(r8, "context");
        int r4 = 0;
        this(r8, r9, r4, 4, null);
    }

    @JvmOverloads
    public TimePicker(@aa1 Context r3, @tb1 AttributeSet r4, int r5) {
        Intrinsics.X0O(r3, "context");
        super(r3, r4, r5);
        this.iIXi1iiXI = O0X11OiO.X11iII1O1();
        gk4.I0IIOi = isInEditMode();
        LayoutInflater.from(r3).inflate(com.sma.smartv3.pro.R.layout.view_three_pickers, this, true);
        View r6 = findViewById(com.sma.smartv3.pro.R.id.wv1);
        Intrinsics.O10IXXX0X(r6, "findViewById(...)");
        this.IO = (WheelView) r6;
        View r7 = findViewById(com.sma.smartv3.pro.R.id.wv2);
        Intrinsics.O10IXXX0X(r7, "findViewById(...)");
        this.I1 = (WheelView) r7;
        View r8 = findViewById(com.sma.smartv3.pro.R.id.wv3);
        Intrinsics.O10IXXX0X(r8, "findViewById(...)");
        this.iX1O1 = (WheelView) r8;
        View r9 = findViewById(com.sma.smartv3.pro.R.id.tvColon);
        Intrinsics.O10IXXX0X(r9, "findViewById(...)");
        this.X11iII1O1 = (TextView) r9;
        I0IIOi(r3, r4);
        XOO0ii0();
    }

    public /* synthetic */ TimePicker(Context r1, AttributeSet r2, int r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = null;
    L6:
        if ((r4 & 4) == 0) goto L8;
        r3 = 0;
    L8:
        this(r1, r2, r3);
    }
}
