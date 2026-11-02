package com.sma.smartv3.view.picker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.CallSuper;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.dg1;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.l76;
import com.android.mltcode.paycertificationapi.mc0;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.WheelView.WheelView;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class HeightPicker extends LinearLayout {
    public static final int O001I = 7;

    @aa1
    public static final OXO1 X0i1O = null;
    public static final int XXO = 3;
    public static final int iIXi1iiXI = 218;
    public static final int iXiX011 = 0;

    @aa1
    public final WheelView I1;

    @aa1
    public final WheelView IO;

    @aa1
    public final int[] X11iII1O1;

    @tb1
    public Function1<? super Float, Unit> X1IX;
    public int XXX11i;

    @aa1
    public final TextView iX1O1;

    public static final class OXO1 {
        public /* synthetic */ OXO1(DefaultConstructorMarker r1) {
            this();
        }

        public OXO1() {
        }
    }

    public class XIi00iiXO implements dg1 {
        public final /* synthetic */ HeightPicker OXO1;

        public XIi00iiXO(HeightPicker r1) {
            this.OXO1 = r1;
        }

        @Override // com.android.mltcode.paycertificationapi.dg1
        @CallSuper
        public void OXO1(int r4) {
            if (HeightPicker.XIi00iiXO(this.OXO1) != 0) goto L8;
            Function1<Float, Unit> r5 = this.OXO1.getMListener();
            if (r5 == null) goto L12;
            r5.invoke(Float.valueOf(HeightPicker.iO(this.OXO1)[0] + HeightPicker.OXO1()));
            return;
        L12:
            return;
        L8:
            Function1<Float, Unit> r6 = this.OXO1.getMListener();
            if (r6 == null) goto L13;
            r6.invoke(Float.valueOf(l76.XIi00iiXO(HeightPicker.iO(this.OXO1)[0] + 3, HeightPicker.iO(this.OXO1)[1])));
            return;
        }
    }

    public static final class XO0O10 extends XIi00iiXO {
        public final /* synthetic */ HeightPicker XIi00iiXO;

        public XO0O10(HeightPicker r1) {
            this.XIi00iiXO = r1;
            super(r1);
        }

        @Override // com.sma.smartv3.view.picker.HeightPicker.XIi00iiXO, com.android.mltcode.paycertificationapi.dg1
        public void OXO1(int r3) {
            HeightPicker.iO(this.XIi00iiXO)[1] = r3;
            super.OXO1(r3);
        }
    }

    public static final class iO extends XIi00iiXO {
        public final /* synthetic */ HeightPicker XIi00iiXO;

        public iO(HeightPicker r1) {
            this.XIi00iiXO = r1;
            super(r1);
        }

        @Override // com.sma.smartv3.view.picker.HeightPicker.XIi00iiXO, com.android.mltcode.paycertificationapi.dg1
        public void OXO1(int r3) {
            HeightPicker.iO(this.XIi00iiXO)[0] = r3;
            super.OXO1(r3);
        }
    }

    static {
        X0i1O = new OXO1(null);
        if (gk4.I0IIOi == false) goto L5;
        int r0 = 108;
    L6:
        iXiX011 = r0;
        return;
    L5:
        r0 = i72.OXO1.iX1O1();
        goto L6
    }

    @JvmOverloads
    public HeightPicker(@tb1 Context r7) {
        AttributeSet r2 = null;
        int r3 = 0;
        this(r7, r2, r3, 6, null);
    }

    public static final /* synthetic */ int OXO1() {
        return iXiX011;
    }

    public static final /* synthetic */ int XIi00iiXO(HeightPicker r0) {
        return r0.XXX11i;
    }

    public static final /* synthetic */ int[] iO(HeightPicker r0) {
        return r0.X11iII1O1;
    }

    public final void XO0O10() {
        this.IO.setListener(new iO(this));
        this.I1.setListener(new XO0O10(this));
    }

    @tb1
    public final Function1<Float, Unit> getMListener() {
        return this.X1IX;
    }

    public final void setHeight(float r4) {
        if (this.XXX11i != 0) goto L6;
        this.X11iII1O1[0] = mc0.i100IXOX(r4 - iXiX011);
        this.IO.setInitPosition(this.X11iII1O1[0]);
        return;
    L6:
        int[] r5 = l76.OXO1(r4);
        int[] r0 = this.X11iII1O1;
        int r2 = r5[0] - 3;
        r0[0] = r2;
        r0[1] = r5[1];
        this.IO.setInitPosition(r2);
        this.I1.setInitPosition(this.X11iII1O1[1]);
    }

    public final void setMListener(@tb1 Function1<? super Float, Unit> r1) {
        this.X1IX = r1;
    }

    public final void setUnit(int r8) {
        this.XXX11i = r8;
        if (r8 != 0) goto L9;
        WheelView r9 = this.IO;
        int r2 = 219 - iXiX011;
        ArrayList r3 = new ArrayList(r2);
        int r4 = 0;
    L5:
        if (r4 >= r2) goto L7;
        r3.add(String.valueOf(iXiX011 + r4));
        r4 = r4 + 1;
        goto L5
    L7:
        r9.setItems(r3);
        this.IO.OIi0();
        this.I1.setVisibility(8);
        this.iX1O1.setVisibility(0);
        return;
    L9:
        WheelView r10 = this.IO;
        ArrayList r5 = new ArrayList(5);
        int r6 = 0;
    L10:
        if (r6 >= 5) goto L12;
        r5.add((r6 + 3) + "′");
        r6 = r6 + 1;
        goto L10
    L12:
        r10.setItems(r5);
        this.IO.OIi0();
        WheelView r11 = this.I1;
        ArrayList r7 = new ArrayList(12);
        int r12 = 0;
    L13:
        if (r12 >= 12) goto L15;
        r7.add(r12 + "″");
        r12 = r12 + 1;
        goto L13
    L15:
        r11.setItems(r7);
        this.I1.OIi0();
        this.I1.setVisibility(0);
        this.iX1O1.setVisibility(8);
    }

    public final void setVisibleCount(int r2) {
        this.IO.setVisibleCount(r2);
        this.I1.setVisibleCount(r2);
    }

    @JvmOverloads
    public HeightPicker(@tb1 Context r7, @tb1 AttributeSet r8) {
        int r3 = 0;
        this(r7, r8, r3, 4, null);
    }

    public /* synthetic */ HeightPicker(Context r1, AttributeSet r2, int r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = null;
    L6:
        if ((r4 & 4) == 0) goto L8;
        r3 = 0;
    L8:
        this(r1, r2, r3);
    }

    @JvmOverloads
    public HeightPicker(@tb1 Context r1, @tb1 AttributeSet r2, int r3) {
        Intrinsics.XXI(r1);
        super(r1, r2, r3);
        this.X11iII1O1 = new int[2];
        LayoutInflater.from(r1).inflate(R.layout.view_height_picker, this, true);
        View r4 = findViewById(R.id.wv1);
        Intrinsics.O10IXXX0X(r4, "findViewById(...)");
        this.IO = (WheelView) r4;
        View r5 = findViewById(R.id.wv2);
        Intrinsics.O10IXXX0X(r5, "findViewById(...)");
        this.I1 = (WheelView) r5;
        View r6 = findViewById(R.id.tv_picker_unit);
        Intrinsics.O10IXXX0X(r6, "findViewById(...)");
        this.iX1O1 = (TextView) r6;
        XO0O10();
    }
}
