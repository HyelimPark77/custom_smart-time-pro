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
public final class IntValuePicker extends LinearLayout {

    @aa1
    public final TextView I1;

    @aa1
    public final WheelView IO;

    @aa1
    public String X0i1O;
    public int X11iII1O1;
    public boolean X1IX;
    public int XXX11i;
    public int iIXi1iiXI;
    public int iX1O1;

    @tb1
    public Function1<? super Integer, Unit> iXiX011;

    public class OXO1 implements dg1 {
        public final /* synthetic */ IntValuePicker OXO1;

        public OXO1(IntValuePicker r1) {
            this.OXO1 = r1;
        }

        @Override // com.android.mltcode.paycertificationapi.dg1
        @CallSuper
        public void OXO1(int r3) {
            Function1<Integer, Unit> r0 = this.OXO1.getMListener();
            if (r0 == null) goto L6;
            r0.invoke(Integer.valueOf(this.OXO1.XO0O10(r3)));
            return;
        }
    }

    public static final class XIi00iiXO extends OXO1 {
        public final /* synthetic */ IntValuePicker XIi00iiXO;

        public XIi00iiXO(IntValuePicker r1) {
            this.XIi00iiXO = r1;
            super(r1);
        }

        @Override // com.sma.smartv3.view.picker.IntValuePicker.OXO1, com.android.mltcode.paycertificationapi.dg1
        public void OXO1(int r3) {
            IntValuePicker r0 = this.XIi00iiXO;
            IntValuePicker.OXO1(r0, r0.XO0O10(r3));
            IntValuePicker.XIi00iiXO(this.XIi00iiXO, r3);
            super.OXO1(r3);
        }
    }

    @JvmOverloads
    public IntValuePicker(@tb1 Context r7) {
        AttributeSet r2 = null;
        int r3 = 0;
        this(r7, r2, r3, 6, null);
    }

    public static final /* synthetic */ void OXO1(IntValuePicker r0, int r1) {
        r0.iX1O1 = r1;
    }

    public static final /* synthetic */ void XIi00iiXO(IntValuePicker r0, int r1) {
        r0.IiI10X(r1);
    }

    public final void IiI10X(int r4) {
        if (this.X1IX == false) goto L11;
        TextView r0 = this.I1;
        int r2 = 8;
        if (this.iIXi1iiXI == 0) goto L9;
        if (r4 == 0) goto L9;
        r2 = 0;
    L9:
        r0.setVisibility(r2);
        return;
    }

    public final void O00(int r5, int r6) {
        this.X11iII1O1 = r5;
        this.XXX11i = r6;
        boolean r0 = this.X1IX;
        if (r0 == false) goto L8;
        if (r5 != 0) goto L8;
        throw new IllegalArgumentException("when setUseZero is true, the min is not zero!");
    L8:
        WheelView r1 = this.IO;
        int r7 = r6 - r5;
        if (r0 == false) goto L11;
        int r8 = 2;
    L12:
        int r9 = r7 + r8;
        ArrayList r10 = new ArrayList(r9);
        int r2 = 0;
    L13:
        if (r2 >= r9) goto L21;
        if (this.X1IX == false) goto L19;
        if (r2 != 0) goto L18;
        String r3 = this.X0i1O;
    L20:
        r10.add(r3);
        r2 = r2 + 1;
        goto L13
    L18:
        r3 = String.valueOf((r2 - 1) + this.X11iII1O1);
        goto L20
    L19:
        r3 = String.valueOf(this.X11iII1O1 + r2);
        goto L20
    L21:
        r1.setItems(r10);
        return;
    L11:
        r8 = 1;
        goto L12
    }

    public final int XO0O10(int r2) {
        if (this.X1IX == false) goto L10;
        if (r2 != 0) goto L7;
        return 0;
    L7:
        r2 = r2 - 1;
        int r0 = this.X11iII1O1;
    L9:
        return r2 + r0;
    L10:
        r0 = this.X11iII1O1;
        goto L9
    }

    public final int XOO0ii0(int r2) {
        if (this.X1IX == false) goto L10;
        if (r2 != 0) goto L8;
        return 0;
    L8:
        return (r2 - this.X11iII1O1) + 1;
    L10:
        return r2 - this.X11iII1O1;
    }

    @tb1
    public final Function1<Integer, Unit> getMListener() {
        return this.iXiX011;
    }

    public final void iO() {
        this.IO.setListener(new XIi00iiXO(this));
    }

    public final void setMListener(@tb1 Function1<? super Integer, Unit> r1) {
        this.iXiX011 = r1;
    }

    public final void setUnit(int r3) {
        this.iIXi1iiXI = r3;
        if (r3 != 0) goto L6;
        this.I1.setVisibility(8);
        return;
    L6:
        this.I1.setVisibility(0);
        this.I1.setText(r3);
    }

    public final void setUseZero(boolean r1) {
        this.X1IX = r1;
    }

    public final void setValuse(int r2) {
        this.iX1O1 = r2;
        IiI10X(r2);
        this.IO.setInitPosition(XOO0ii0(this.iX1O1));
    }

    public final void setVisibleCount(int r2) {
        this.IO.setVisibleCount(r2);
    }

    public final void setZeroText(@aa1 String r2) {
        Intrinsics.X0O(r2, "text");
        this.X0i1O = r2;
    }

    @JvmOverloads
    public IntValuePicker(@tb1 Context r7, @tb1 AttributeSet r8) {
        int r3 = 0;
        this(r7, r8, r3, 4, null);
    }

    public /* synthetic */ IntValuePicker(Context r1, AttributeSet r2, int r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = null;
    L6:
        if ((r4 & 4) == 0) goto L8;
        r3 = 0;
    L8:
        this(r1, r2, r3);
    }

    @JvmOverloads
    public IntValuePicker(@tb1 Context r1, @tb1 AttributeSet r2, int r3) {
        Intrinsics.XXI(r1);
        super(r1, r2, r3);
        this.X0i1O = "0";
        LayoutInflater.from(r1).inflate(R.layout.view_value_picker, this, true);
        View r4 = findViewById(R.id.wv1);
        Intrinsics.O10IXXX0X(r4, "findViewById(...)");
        this.IO = (WheelView) r4;
        View r5 = findViewById(R.id.tv_picker_unit);
        Intrinsics.O10IXXX0X(r5, "findViewById(...)");
        TextView r6 = (TextView) r5;
        this.I1 = r6;
        r6.setVisibility(8);
        iO();
    }
}
