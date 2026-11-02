package com.sma.smartv3.view.picker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

    /* JADX INFO: renamed from: I1 */
    @aa1
    public final WheelView f55072I1;

    /* JADX INFO: renamed from: IO */
    @aa1
    public final WheelView f55073IO;
    public int X11iII1O1;

    @tb1
    public Function2<? super Integer, ? super Integer, Unit> X1IX;
    public int XXX11i;
    public int iX1O1;

    public class OXO1 implements dg1 {
        public OXO1() {
        }

        @Override // com.android.mltcode.paycertificationapi.dg1
        @CallSuper
        public void OXO1(int i) {
            Function2<Integer, Integer, Unit> mListener = CalibrationPicker.this.getMListener();
            if (mListener != null) {
                mListener.invoke2(Integer.valueOf(CalibrationPicker.this.iX1O1), Integer.valueOf(CalibrationPicker.this.X11iII1O1));
            }
        }
    }

    public static final class XIi00iiXO extends OXO1 {
        public XIi00iiXO() {
            super();
        }

        @Override // com.sma.smartv3.view.picker.CalibrationPicker.OXO1, com.android.mltcode.paycertificationapi.dg1
        public void OXO1(int i) {
            CalibrationPicker calibrationPicker = CalibrationPicker.this;
            calibrationPicker.iX1O1 = calibrationPicker.XXX11i + i;
            super.OXO1(i);
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.view.picker.CalibrationPicker$iO */
    public static final class C19072iO extends OXO1 {
        public C19072iO() {
            super();
        }

        @Override // com.sma.smartv3.view.picker.CalibrationPicker.OXO1, com.android.mltcode.paycertificationapi.dg1
        public void OXO1(int i) {
            CalibrationPicker calibrationPicker = CalibrationPicker.this;
            calibrationPicker.X11iII1O1 = calibrationPicker.XXX11i + i;
            super.OXO1(i);
        }
    }

    @JvmOverloads
    public CalibrationPicker(@tb1 Context context) {
        this(context, null, 0, 6, null);
    }

    public final void IiI10X() {
        WheelView wheelView = this.f55073IO;
        ArrayList arrayList = new ArrayList(130);
        for (int i = 0; i < 130; i++) {
            arrayList.add(String.valueOf(this.XXX11i + i));
        }
        wheelView.setItems(arrayList);
        this.f55073IO.setListener(new XIi00iiXO());
        WheelView wheelView2 = this.f55072I1;
        ArrayList arrayList2 = new ArrayList(130);
        for (int i2 = 0; i2 < 130; i2++) {
            arrayList2.add(String.valueOf(this.XXX11i + i2));
        }
        wheelView2.setItems(arrayList2);
        this.f55072I1.setListener(new C19072iO());
    }

    public final void XOO0ii0(int i, int i2) {
        this.iX1O1 = i;
        this.X11iII1O1 = i2;
        this.f55073IO.setInitPosition(i - this.XXX11i);
        this.f55072I1.setInitPosition(i2 - this.XXX11i);
    }

    @tb1
    public final Function2<Integer, Integer, Unit> getMListener() {
        return this.X1IX;
    }

    public final void setMListener(@tb1 Function2<? super Integer, ? super Integer, Unit> function2) {
        this.X1IX = function2;
    }

    public final void setVisibleCount(int i) {
        this.f55072I1.setVisibleCount(i);
        this.f55073IO.setVisibleCount(i);
    }

    @JvmOverloads
    public CalibrationPicker(@tb1 Context context, @tb1 AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ CalibrationPicker(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CalibrationPicker(@tb1 Context context, @tb1 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.XXI(context);
        this.XXX11i = 65;
        LayoutInflater.from(context).inflate(R.layout.view_two_calibration, (ViewGroup) this, true);
        View viewFindViewById = findViewById(R.id.wv1);
        Intrinsics.O10IXXX0X(viewFindViewById, "findViewById(...)");
        this.f55073IO = (WheelView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.wv2);
        Intrinsics.O10IXXX0X(viewFindViewById2, "findViewById(...)");
        this.f55072I1 = (WheelView) viewFindViewById2;
        IiI10X();
    }
}
