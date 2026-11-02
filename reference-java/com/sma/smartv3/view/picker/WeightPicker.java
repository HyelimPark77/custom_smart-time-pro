package com.sma.smartv3.view.picker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
    public static final OXO1 X0i1O = new OXO1(null);
    public static final int XXO = 44;
    public static final int iIXi1iiXI = 150;
    public static final int iXiX011 = 20;

    /* JADX INFO: renamed from: I1 */
    @aa1
    public final WheelView f55091I1;

    /* JADX INFO: renamed from: IO */
    @aa1
    public final WheelView f55092IO;

    @aa1
    public final int[] X11iII1O1;

    @tb1
    public Function1<? super Float, Unit> X1IX;
    public int XXX11i;

    @aa1
    public final TextView iX1O1;

    public static final class OXO1 {
        public /* synthetic */ OXO1(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public OXO1() {
        }
    }

    public class XIi00iiXO implements dg1 {
        public XIi00iiXO() {
        }

        @Override // com.android.mltcode.paycertificationapi.dg1
        @CallSuper
        public void OXO1(int i) {
            if (WeightPicker.this.XXX11i == 0) {
                Function1<Float, Unit> mListener = WeightPicker.this.getMListener();
                if (mListener != null) {
                    mListener.invoke2(Float.valueOf(l76.XOO0ii0(WeightPicker.this.X11iII1O1[0] + 20, WeightPicker.this.X11iII1O1[1], WeightPicker.this.XXX11i)));
                    return;
                }
                return;
            }
            if (WeightPicker.this.X11iII1O1[1] == 10) {
                WeightPicker.this.X11iII1O1[1] = 0;
            }
            Function1<Float, Unit> mListener2 = WeightPicker.this.getMListener();
            if (mListener2 != null) {
                mListener2.invoke2(Float.valueOf(l76.XOO0ii0(WeightPicker.this.X11iII1O1[0] + 44, WeightPicker.this.X11iII1O1[1], WeightPicker.this.XXX11i)));
            }
        }
    }

    public static final class XO0O10 extends XIi00iiXO {
        public XO0O10() {
            super();
        }

        @Override // com.sma.smartv3.view.picker.WeightPicker.XIi00iiXO, com.android.mltcode.paycertificationapi.dg1
        public void OXO1(int i) {
            WeightPicker.this.X11iII1O1[1] = i;
            super.OXO1(i);
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.view.picker.WeightPicker$iO */
    public static final class C19078iO extends XIi00iiXO {
        public C19078iO() {
            super();
        }

        @Override // com.sma.smartv3.view.picker.WeightPicker.XIi00iiXO, com.android.mltcode.paycertificationapi.dg1
        public void OXO1(int i) {
            WeightPicker.this.X11iII1O1[0] = i;
            super.OXO1(i);
        }
    }

    @JvmOverloads
    public WeightPicker(@tb1 Context context) {
        this(context, null, 0, 6, null);
    }

    @tb1
    public final Function1<Float, Unit> getMListener() {
        return this.X1IX;
    }

    /* JADX INFO: renamed from: iO */
    public final void m38942iO() {
        this.f55092IO.setListener(new C19078iO());
        this.f55091I1.setListener(new XO0O10());
    }

    public final void setMListener(@tb1 Function1<? super Float, Unit> function1) {
        this.X1IX = function1;
    }

    public final void setUnit(int i) {
        this.XXX11i = i;
        WheelView wheelView = this.f55091I1;
        ArrayList arrayList = new ArrayList(10);
        int i2 = 0;
        for (int i3 = 0; i3 < 10; i3++) {
            arrayList.add(FileUtils.FILE_EXTENSION_SEPARATOR + i3);
        }
        wheelView.setItems(arrayList);
        if (i == 0) {
            WheelView wheelView2 = this.f55092IO;
            ArrayList arrayList2 = new ArrayList(131);
            while (i2 < 131) {
                arrayList2.add(String.valueOf(i2 + 20));
                i2++;
            }
            wheelView2.setItems(arrayList2);
            this.iX1O1.setText(R.string.f54355kg);
            return;
        }
        WheelView wheelView3 = this.f55092IO;
        ArrayList arrayList3 = new ArrayList(397);
        while (i2 < 397) {
            arrayList3.add(String.valueOf(i2 + 44));
            i2++;
        }
        wheelView3.setItems(arrayList3);
        this.iX1O1.setText(R.string.lbs);
    }

    public final void setVisibleCount(int i) {
        this.f55092IO.setVisibleCount(i);
        this.f55091I1.setVisibleCount(i);
    }

    public final void setWeight(float f) {
        int i;
        int[] iArrI0IIOi = l76.I0IIOi(f, this.XXX11i);
        if (this.XXX11i == 0) {
            int[] iArr = this.X11iII1O1;
            iArr[0] = iArrI0IIOi[0] - 20;
            iArr[1] = iArrI0IIOi[1];
        } else {
            int i2 = iArrI0IIOi[1];
            if (i2 == 10) {
                i = 1;
                i2 = 0;
            } else {
                i = 0;
            }
            int[] iArr2 = this.X11iII1O1;
            iArr2[0] = (iArrI0IIOi[0] - 44) + i;
            iArr2[1] = i2;
        }
        this.f55092IO.setInitPosition(this.X11iII1O1[0]);
        this.f55091I1.setInitPosition(this.X11iII1O1[1]);
    }

    @JvmOverloads
    public WeightPicker(@tb1 Context context, @tb1 AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ WeightPicker(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public WeightPicker(@tb1 Context context, @tb1 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.XXI(context);
        this.X11iII1O1 = new int[2];
        LayoutInflater.from(context).inflate(R.layout.view_weight_picker, (ViewGroup) this, true);
        View viewFindViewById = findViewById(R.id.wv1);
        Intrinsics.O10IXXX0X(viewFindViewById, "findViewById(...)");
        this.f55092IO = (WheelView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.wv2);
        Intrinsics.O10IXXX0X(viewFindViewById2, "findViewById(...)");
        this.f55091I1 = (WheelView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.tv_picker_unit);
        Intrinsics.O10IXXX0X(viewFindViewById3, "findViewById(...)");
        this.iX1O1 = (TextView) viewFindViewById3;
        m38942iO();
    }
}
