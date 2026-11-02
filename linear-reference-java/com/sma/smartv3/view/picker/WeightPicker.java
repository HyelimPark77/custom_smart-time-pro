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
import com.android.mltcode.paycertificationapi.l76;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.WheelView.WheelView;
import com.tenmeter.smlibrary.utils.FileUtils;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class WeightPicker extends LinearLayout {
    public static final int O001I = 440;

    @aa1
    public static final OXO1 X0i1O = null;
    public static final int XXO = 44;
    public static final int iIXi1iiXI = 150;
    public static final int iXiX011 = 20;

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
        public final /* synthetic */ WeightPicker OXO1;

        public XIi00iiXO(WeightPicker r1) {
            this.OXO1 = r1;
        }

        @Override // com.android.mltcode.paycertificationapi.dg1
        @CallSuper
        public void OXO1(int r4) {
            if (WeightPicker.OXO1(this.OXO1) != 0) goto L9;
            Function1<Float, Unit> r5 = this.OXO1.getMListener();
            if (r5 == null) goto L15;
            r5.invoke(Float.valueOf(l76.XOO0ii0(WeightPicker.XIi00iiXO(this.OXO1)[0] + 20, WeightPicker.XIi00iiXO(this.OXO1)[1], WeightPicker.OXO1(this.OXO1))));
            return;
        L15:
            return;
        L9:
            if (WeightPicker.XIi00iiXO(this.OXO1)[1] != 10) goto L11;
            WeightPicker.XIi00iiXO(this.OXO1)[1] = 0;
        L11:
            Function1<Float, Unit> r6 = this.OXO1.getMListener();
            if (r6 == null) goto L16;
            r6.invoke(Float.valueOf(l76.XOO0ii0(WeightPicker.XIi00iiXO(this.OXO1)[0] + 44, WeightPicker.XIi00iiXO(this.OXO1)[1], WeightPicker.OXO1(this.OXO1))));
            return;
        }
    }

    public static final class XO0O10 extends XIi00iiXO {
        public final /* synthetic */ WeightPicker XIi00iiXO;

        public XO0O10(WeightPicker r1) {
            this.XIi00iiXO = r1;
            super(r1);
        }

        @Override // com.sma.smartv3.view.picker.WeightPicker.XIi00iiXO, com.android.mltcode.paycertificationapi.dg1
        public void OXO1(int r3) {
            WeightPicker.XIi00iiXO(this.XIi00iiXO)[1] = r3;
            super.OXO1(r3);
        }
    }

    public static final class iO extends XIi00iiXO {
        public final /* synthetic */ WeightPicker XIi00iiXO;

        public iO(WeightPicker r1) {
            this.XIi00iiXO = r1;
            super(r1);
        }

        @Override // com.sma.smartv3.view.picker.WeightPicker.XIi00iiXO, com.android.mltcode.paycertificationapi.dg1
        public void OXO1(int r3) {
            WeightPicker.XIi00iiXO(this.XIi00iiXO)[0] = r3;
            super.OXO1(r3);
        }
    }

    static {
        X0i1O = new OXO1(null);
    }

    @JvmOverloads
    public WeightPicker(@tb1 Context r7) {
        AttributeSet r2 = null;
        int r3 = 0;
        this(r7, r2, r3, 6, null);
    }

    public static final /* synthetic */ int OXO1(WeightPicker r0) {
        return r0.XXX11i;
    }

    public static final /* synthetic */ int[] XIi00iiXO(WeightPicker r0) {
        return r0.X11iII1O1;
    }

    @tb1
    public final Function1<Float, Unit> getMListener() {
        return this.X1IX;
    }

    public final void iO() {
        this.IO.setListener(new iO(this));
        this.I1.setListener(new XO0O10(this));
    }

    public final void setMListener(@tb1 Function1<? super Float, Unit> r1) {
        this.X1IX = r1;
    }

    public final void setUnit(int r8) {
        this.XXX11i = r8;
        WheelView r0 = this.I1;
        ArrayList r1 = new ArrayList(10);
        int r3 = 0;
        int r4 = 0;
    L3:
        if (r4 >= 10) goto L5;
        r1.add(FileUtils.FILE_EXTENSION_SEPARATOR + r4);
        r4 = r4 + 1;
        goto L3
    L5:
        r0.setItems(r1);
        if (r8 != 0) goto L12;
        WheelView r9 = this.IO;
        ArrayList r2 = new ArrayList(131);
    L8:
        if (r3 >= 131) goto L10;
        r2.add(String.valueOf(r3 + 20));
        r3 = r3 + 1;
        goto L8
    L10:
        r9.setItems(r2);
        this.iX1O1.setText(R.string.kg);
        return;
    L12:
        WheelView r10 = this.IO;
        ArrayList r5 = new ArrayList(397);
    L13:
        if (r3 >= 397) goto L15;
        r5.add(String.valueOf(r3 + 44));
        r3 = r3 + 1;
        goto L13
    L15:
        r10.setItems(r5);
        this.iX1O1.setText(R.string.lbs);
    }

    public final void setVisibleCount(int r2) {
        this.IO.setVisibleCount(r2);
        this.I1.setVisibleCount(r2);
    }

    public final void setWeight(float r6) {
        int[] r7 = l76.I0IIOi(r6, this.XXX11i);
        if (this.XXX11i != 0) goto L5;
        int[] r0 = this.X11iII1O1;
        r0[0] = r7[0] - 20;
        r0[1] = r7[1];
    L10:
        this.IO.setInitPosition(this.X11iII1O1[0]);
        this.I1.setInitPosition(this.X11iII1O1[1]);
        return;
    L5:
        int r1 = r7[1];
        if (r1 != 10) goto L8;
        int r3 = 1;
        r1 = 0;
    L9:
        int[] r4 = this.X11iII1O1;
        r4[0] = (r7[0] - 44) + r3;
        r4[1] = r1;
        goto L10
    L8:
        r3 = 0;
        goto L9
    }

    @JvmOverloads
    public WeightPicker(@tb1 Context r7, @tb1 AttributeSet r8) {
        int r3 = 0;
        this(r7, r8, r3, 4, null);
    }

    public /* synthetic */ WeightPicker(Context r1, AttributeSet r2, int r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = null;
    L6:
        if ((r4 & 4) == 0) goto L8;
        r3 = 0;
    L8:
        this(r1, r2, r3);
    }

    @JvmOverloads
    public WeightPicker(@tb1 Context r1, @tb1 AttributeSet r2, int r3) {
        Intrinsics.XXI(r1);
        super(r1, r2, r3);
        this.X11iII1O1 = new int[2];
        LayoutInflater.from(r1).inflate(R.layout.view_weight_picker, this, true);
        View r4 = findViewById(R.id.wv1);
        Intrinsics.O10IXXX0X(r4, "findViewById(...)");
        this.IO = (WheelView) r4;
        View r5 = findViewById(R.id.wv2);
        Intrinsics.O10IXXX0X(r5, "findViewById(...)");
        this.I1 = (WheelView) r5;
        View r6 = findViewById(R.id.tv_picker_unit);
        Intrinsics.O10IXXX0X(r6, "findViewById(...)");
        this.iX1O1 = (TextView) r6;
        iO();
    }
}
