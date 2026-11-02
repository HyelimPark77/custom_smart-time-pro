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
import com.google.android.material.timepicker.TimeModel;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.WheelView.WheelView;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: loaded from: classes3.dex */
public final class DurationPicker extends LinearLayout {

    @aa1
    public final WheelView I1;

    @aa1
    public final WheelView IO;
    public int X11iII1O1;

    @tb1
    public Function1<? super Integer, Unit> XXX11i;
    public int iX1O1;

    public class OXO1 implements dg1 {
        public final /* synthetic */ DurationPicker OXO1;

        public OXO1(DurationPicker r1) {
            this.OXO1 = r1;
        }

        @Override // com.android.mltcode.paycertificationapi.dg1
        @CallSuper
        public void OXO1(int r3) {
            Function1<Integer, Unit> r4 = this.OXO1.getMListener();
            if (r4 == null) goto L6;
            r4.invoke(Integer.valueOf((DurationPicker.OXO1(this.OXO1) * 60) + DurationPicker.XIi00iiXO(this.OXO1)));
            return;
        }
    }

    public static final class XIi00iiXO extends OXO1 {
        public final /* synthetic */ DurationPicker XIi00iiXO;

        public XIi00iiXO(DurationPicker r1) {
            this.XIi00iiXO = r1;
            super(r1);
        }

        @Override // com.sma.smartv3.view.picker.DurationPicker.OXO1, com.android.mltcode.paycertificationapi.dg1
        public void OXO1(int r2) {
            DurationPicker.iO(this.XIi00iiXO, r2);
            super.OXO1(r2);
        }
    }

    public static final class iO extends OXO1 {
        public final /* synthetic */ DurationPicker XIi00iiXO;

        public iO(DurationPicker r1) {
            this.XIi00iiXO = r1;
            super(r1);
        }

        @Override // com.sma.smartv3.view.picker.DurationPicker.OXO1, com.android.mltcode.paycertificationapi.dg1
        public void OXO1(int r2) {
            DurationPicker.XO0O10(this.XIi00iiXO, r2);
            super.OXO1(r2);
        }
    }

    @JvmOverloads
    public DurationPicker(@tb1 Context r7) {
        AttributeSet r2 = null;
        int r3 = 0;
        this(r7, r2, r3, 6, null);
    }

    public static final /* synthetic */ int OXO1(DurationPicker r0) {
        return r0.iX1O1;
    }

    public static final /* synthetic */ int XIi00iiXO(DurationPicker r0) {
        return r0.X11iII1O1;
    }

    public static final /* synthetic */ void XO0O10(DurationPicker r0, int r1) {
        r0.X11iII1O1 = r1;
    }

    public static final /* synthetic */ void iO(DurationPicker r0, int r1) {
        r0.iX1O1 = r1;
    }

    public final void O00() {
        WheelView r0 = this.IO;
        ArrayList r1 = new ArrayList(100);
        int r3 = 0;
        int r4 = 0;
    L4:
        if (r4 >= 100) goto L6;
        StringCompanionObject r8 = StringCompanionObject.OXO1;
        String r6 = String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(r4)}, 1));
        Intrinsics.O10IXXX0X(r6, "format(...)");
        r1.add(r6);
        r4 = r4 + 1;
        goto L4
    L6:
        r0.setItems(r1);
        r0.setListener(new XIi00iiXO(this));
        WheelView r2 = this.I1;
        ArrayList r5 = new ArrayList(60);
    L7:
        if (r3 >= 60) goto L9;
        StringCompanionObject r7 = StringCompanionObject.OXO1;
        String r9 = String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(r3)}, 1));
        Intrinsics.O10IXXX0X(r9, "format(...)");
        r5.add(r9);
        r3 = r3 + 1;
        goto L7
    L9:
        r2.setItems(r5);
        r2.setListener(new iO(this));
    }

    @tb1
    public final Function1<Integer, Unit> getMListener() {
        return this.XXX11i;
    }

    public final void setDuration(int r2) {
        int r0 = r2 / 60;
        this.iX1O1 = r0;
        this.X11iII1O1 = r2 % 60;
        this.IO.setInitPosition(r0);
        this.I1.setInitPosition(this.X11iII1O1);
    }

    public final void setMListener(@tb1 Function1<? super Integer, Unit> r1) {
        this.XXX11i = r1;
    }

    public final void setVisibleCount(int r2) {
        this.IO.setVisibleCount(r2);
        this.I1.setVisibleCount(r2);
    }

    @JvmOverloads
    public DurationPicker(@tb1 Context r7, @tb1 AttributeSet r8) {
        int r3 = 0;
        this(r7, r8, r3, 4, null);
    }

    public /* synthetic */ DurationPicker(Context r1, AttributeSet r2, int r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = null;
    L6:
        if ((r4 & 4) == 0) goto L8;
        r3 = 0;
    L8:
        this(r1, r2, r3);
    }

    @JvmOverloads
    public DurationPicker(@tb1 Context r1, @tb1 AttributeSet r2, int r3) {
        Intrinsics.XXI(r1);
        super(r1, r2, r3);
        LayoutInflater.from(r1).inflate(R.layout.view_duration_pickers, this, true);
        View r4 = findViewById(R.id.wv1);
        Intrinsics.O10IXXX0X(r4, "findViewById(...)");
        this.IO = (WheelView) r4;
        View r5 = findViewById(R.id.wv2);
        Intrinsics.O10IXXX0X(r5, "findViewById(...)");
        this.I1 = (WheelView) r5;
        O00();
    }
}
