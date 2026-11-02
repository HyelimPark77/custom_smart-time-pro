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
    public static final OXO1 X0i1O = new OXO1(null);
    public static final int XXO = 3;
    public static final int iIXi1iiXI = 218;
    public static final int iXiX011;

    /* JADX INFO: renamed from: I1 */
    @aa1
    public final WheelView f55080I1;

    /* JADX INFO: renamed from: IO */
    @aa1
    public final WheelView f55081IO;

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
            if (HeightPicker.this.XXX11i == 0) {
                Function1<Float, Unit> mListener = HeightPicker.this.getMListener();
                if (mListener != null) {
                    mListener.invoke2(Float.valueOf(HeightPicker.this.X11iII1O1[0] + HeightPicker.iXiX011));
                    return;
                }
                return;
            }
            Function1<Float, Unit> mListener2 = HeightPicker.this.getMListener();
            if (mListener2 != null) {
                mListener2.invoke2(Float.valueOf(l76.XIi00iiXO(HeightPicker.this.X11iII1O1[0] + 3, HeightPicker.this.X11iII1O1[1])));
            }
        }
    }

    public static final class XO0O10 extends XIi00iiXO {
        public XO0O10() {
            super();
        }

        @Override // com.sma.smartv3.view.picker.HeightPicker.XIi00iiXO, com.android.mltcode.paycertificationapi.dg1
        public void OXO1(int i) {
            HeightPicker.this.X11iII1O1[1] = i;
            super.OXO1(i);
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.view.picker.HeightPicker$iO */
    public static final class C19075iO extends XIi00iiXO {
        public C19075iO() {
            super();
        }

        @Override // com.sma.smartv3.view.picker.HeightPicker.XIi00iiXO, com.android.mltcode.paycertificationapi.dg1
        public void OXO1(int i) {
            HeightPicker.this.X11iII1O1[0] = i;
            super.OXO1(i);
        }
    }

    static {
        iXiX011 = gk4.I0IIOi ? 108 : i72.OXO1.iX1O1();
    }

    @JvmOverloads
    public HeightPicker(@tb1 Context context) {
        this(context, null, 0, 6, null);
    }

    public final void XO0O10() {
        this.f55081IO.setListener(new C19075iO());
        this.f55080I1.setListener(new XO0O10());
    }

    @tb1
    public final Function1<Float, Unit> getMListener() {
        return this.X1IX;
    }

    public final void setHeight(float f) {
        if (this.XXX11i == 0) {
            this.X11iII1O1[0] = mc0.i100IXOX(f - iXiX011);
            this.f55081IO.setInitPosition(this.X11iII1O1[0]);
            return;
        }
        int[] iArrOXO1 = l76.OXO1(f);
        int[] iArr = this.X11iII1O1;
        int i = iArrOXO1[0] - 3;
        iArr[0] = i;
        iArr[1] = iArrOXO1[1];
        this.f55081IO.setInitPosition(i);
        this.f55080I1.setInitPosition(this.X11iII1O1[1]);
    }

    public final void setMListener(@tb1 Function1<? super Float, Unit> function1) {
        this.X1IX = function1;
    }

    public final void setUnit(int i) {
        this.XXX11i = i;
        if (i == 0) {
            WheelView wheelView = this.f55081IO;
            int i2 = 219 - iXiX011;
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = 0; i3 < i2; i3++) {
                arrayList.add(String.valueOf(iXiX011 + i3));
            }
            wheelView.setItems(arrayList);
            this.f55081IO.OIi0();
            this.f55080I1.setVisibility(8);
            this.iX1O1.setVisibility(0);
            return;
        }
        WheelView wheelView2 = this.f55081IO;
        ArrayList arrayList2 = new ArrayList(5);
        for (int i4 = 0; i4 < 5; i4++) {
            arrayList2.add((i4 + 3) + "′");
        }
        wheelView2.setItems(arrayList2);
        this.f55081IO.OIi0();
        WheelView wheelView3 = this.f55080I1;
        ArrayList arrayList3 = new ArrayList(12);
        for (int i5 = 0; i5 < 12; i5++) {
            arrayList3.add(i5 + "″");
        }
        wheelView3.setItems(arrayList3);
        this.f55080I1.OIi0();
        this.f55080I1.setVisibility(0);
        this.iX1O1.setVisibility(8);
    }

    public final void setVisibleCount(int i) {
        this.f55081IO.setVisibleCount(i);
        this.f55080I1.setVisibleCount(i);
    }

    @JvmOverloads
    public HeightPicker(@tb1 Context context, @tb1 AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ HeightPicker(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HeightPicker(@tb1 Context context, @tb1 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.XXI(context);
        this.X11iII1O1 = new int[2];
        LayoutInflater.from(context).inflate(R.layout.view_height_picker, (ViewGroup) this, true);
        View viewFindViewById = findViewById(R.id.wv1);
        Intrinsics.O10IXXX0X(viewFindViewById, "findViewById(...)");
        this.f55081IO = (WheelView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.wv2);
        Intrinsics.O10IXXX0X(viewFindViewById2, "findViewById(...)");
        this.f55080I1 = (WheelView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.tv_picker_unit);
        Intrinsics.O10IXXX0X(viewFindViewById3, "findViewById(...)");
        this.iX1O1 = (TextView) viewFindViewById3;
        XO0O10();
    }
}
