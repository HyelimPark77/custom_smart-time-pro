package com.sma.smartv3.view.picker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.CallSuper;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.dg1;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.WheelView.WheelView;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nCalibrationPicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CalibrationPicker.kt\ncom/sma/smartv3/view/picker/CalibrationPicker\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,77:1\n1#2:78\n*E\n"})
public final class CalibrationPicker extends LinearLayout {

    @aa1
    public final WheelView I1;

    @aa1
    public final WheelView IO;
    public int X11iII1O1;

    @tb1
    public Function2<? super Integer, ? super Integer, Unit> X1IX;
    public int XXX11i;
    public int iX1O1;

    public class OXO1 implements dg1 {
        public final /* synthetic */ CalibrationPicker OXO1;

        public OXO1(CalibrationPicker r1) {
            this.OXO1 = r1;
        }

        @Override // com.android.mltcode.paycertificationapi.dg1
        @CallSuper
        public void OXO1(int r3) {
            Function2<Integer, Integer, Unit> r4 = this.OXO1.getMListener();
            if (r4 == null) goto L6;
            r4.invoke(Integer.valueOf(CalibrationPicker.XIi00iiXO(this.OXO1)), Integer.valueOf(CalibrationPicker.OXO1(this.OXO1)));
            return;
        }
    }

    public static final class XIi00iiXO extends OXO1 {
        public final /* synthetic */ CalibrationPicker XIi00iiXO;

        public XIi00iiXO(CalibrationPicker r1) {
            this.XIi00iiXO = r1;
            super(r1);
        }

        @Override // com.sma.smartv3.view.picker.CalibrationPicker.OXO1, com.android.mltcode.paycertificationapi.dg1
        public void OXO1(int r3) {
            CalibrationPicker r0 = this.XIi00iiXO;
            CalibrationPicker.O00(r0, CalibrationPicker.iO(r0) + r3);
            super.OXO1(r3);
        }
    }

    public static final class iO extends OXO1 {
        public final /* synthetic */ CalibrationPicker XIi00iiXO;

        public iO(CalibrationPicker r1) {
            this.XIi00iiXO = r1;
            super(r1);
        }

        @Override // com.sma.smartv3.view.picker.CalibrationPicker.OXO1, com.android.mltcode.paycertificationapi.dg1
        public void OXO1(int r3) {
            CalibrationPicker r0 = this.XIi00iiXO;
            CalibrationPicker.XO0O10(r0, CalibrationPicker.iO(r0) + r3);
            super.OXO1(r3);
        }
    }

    @JvmOverloads
    public CalibrationPicker(@tb1 Context r7) {
        AttributeSet r2 = null;
        int r3 = 0;
        this(r7, r2, r3, 6, null);
    }

    public static final /* synthetic */ void O00(CalibrationPicker r0, int r1) {
        r0.iX1O1 = r1;
    }

    public static final /* synthetic */ int OXO1(CalibrationPicker r0) {
        return r0.X11iII1O1;
    }

    public static final /* synthetic */ int XIi00iiXO(CalibrationPicker r0) {
        return r0.iX1O1;
    }

    public static final /* synthetic */ void XO0O10(CalibrationPicker r0, int r1) {
        r0.X11iII1O1 = r1;
    }

    public static final /* synthetic */ int iO(CalibrationPicker r0) {
        return r0.XXX11i;
    }

    public final void IiI10X() {
        WheelView r0 = this.IO;
        ArrayList r1 = new ArrayList(130);
        int r3 = 0;
        int r4 = 0;
    L3:
        if (r4 >= 130) goto L5;
        r1.add(String.valueOf(this.XXX11i + r4));
        r4 = r4 + 1;
        goto L3
    L5:
        r0.setItems(r1);
        this.IO.setListener(new XIi00iiXO(this));
        WheelView r2 = this.I1;
        ArrayList r5 = new ArrayList(130);
    L6:
        if (r3 >= 130) goto L8;
        r5.add(String.valueOf(this.XXX11i + r3));
        r3 = r3 + 1;
        goto L6
    L8:
        r2.setItems(r5);
        this.I1.setListener(new iO(this));
    }

    public final void XOO0ii0(int r3, int r4) {
        this.iX1O1 = r3;
        this.X11iII1O1 = r4;
        this.IO.setInitPosition(r3 - this.XXX11i);
        this.I1.setInitPosition(r4 - this.XXX11i);
    }

    @tb1
    public final Function2<Integer, Integer, Unit> getMListener() {
        return this.X1IX;
    }

    public final void setMListener(@tb1 Function2<? super Integer, ? super Integer, Unit> r1) {
        this.X1IX = r1;
    }

    public final void setVisibleCount(int r2) {
        this.I1.setVisibleCount(r2);
        this.IO.setVisibleCount(r2);
    }

    @JvmOverloads
    public CalibrationPicker(@tb1 Context r7, @tb1 AttributeSet r8) {
        int r3 = 0;
        this(r7, r8, r3, 4, null);
    }

    public /* synthetic */ CalibrationPicker(Context r1, AttributeSet r2, int r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = null;
    L6:
        if ((r4 & 4) == 0) goto L8;
        r3 = 0;
    L8:
        this(r1, r2, r3);
    }

    @JvmOverloads
    public CalibrationPicker(@tb1 Context r1, @tb1 AttributeSet r2, int r3) {
        Intrinsics.XXI(r1);
        super(r1, r2, r3);
        this.XXX11i = 65;
        LayoutInflater.from(r1).inflate(R.layout.view_two_calibration, this, true);
        View r4 = findViewById(R.id.wv1);
        Intrinsics.O10IXXX0X(r4, "findViewById(...)");
        this.IO = (WheelView) r4;
        View r5 = findViewById(R.id.wv2);
        Intrinsics.O10IXXX0X(r5, "findViewById(...)");
        this.I1 = (WheelView) r5;
        IiI10X();
    }
}
