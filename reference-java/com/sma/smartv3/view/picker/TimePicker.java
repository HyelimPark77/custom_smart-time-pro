package com.sma.smartv3.view.picker;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
import com.sma.smartv3.C15429R;
import com.sma.smartv3.pro.R;
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

    /* JADX INFO: renamed from: I1 */
    @aa1
    public final WheelView f55084I1;

    /* JADX INFO: renamed from: IO */
    @aa1
    public final WheelView f55085IO;
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
        public OXO1() {
        }

        @Override // com.android.mltcode.paycertificationapi.dg1
        @CallSuper
        public void OXO1(int i) {
            Function2<Integer, Integer, Unit> mListener = TimePicker.this.getMListener();
            if (mListener != null) {
                mListener.invoke2(Integer.valueOf((TimePicker.this.X0i1O * 12) + TimePicker.this.XXX11i), Integer.valueOf(TimePicker.this.X1IX));
            }
        }
    }

    public static final class XIi00iiXO extends OXO1 {
        public XIi00iiXO() {
            super();
        }

        @Override // com.sma.smartv3.view.picker.TimePicker.OXO1, com.android.mltcode.paycertificationapi.dg1
        public void OXO1(int i) {
            TimePicker.this.X0i1O = i;
            super.OXO1(i);
        }
    }

    public static final class XO0O10 extends OXO1 {
        public XO0O10() {
            super();
        }

        @Override // com.sma.smartv3.view.picker.TimePicker.OXO1, com.android.mltcode.paycertificationapi.dg1
        public void OXO1(int i) {
            TimePicker.this.X1IX = i;
            super.OXO1(i);
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.view.picker.TimePicker$iO */
    public static final class C19076iO extends OXO1 {
        public C19076iO() {
            super();
        }

        @Override // com.sma.smartv3.view.picker.TimePicker.OXO1, com.android.mltcode.paycertificationapi.dg1
        public void OXO1(int i) {
            TimePicker.this.XXX11i = i;
            super.OXO1(i);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TimePicker(@aa1 Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.X0O(context, "context");
    }

    public final void I0IIOi(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C15429R.styleable.WheelView);
        Intrinsics.O10IXXX0X(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        float f = typedArrayObtainStyledAttributes.getFloat(3, 24.0f);
        float f2 = typedArrayObtainStyledAttributes.getFloat(2, 1.3f);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(1, false);
        set24Hourly(typedArrayObtainStyledAttributes.getBoolean(0, O0X11OiO.X11iII1O1()));
        this.f55085IO.setTextSize(f);
        this.f55085IO.setScaleX(f2);
        this.f55084I1.setTextSize(f);
        this.f55084I1.setScaleX(f2);
        this.iX1O1.setTextSize(f);
        this.iX1O1.OIi0();
        this.X11iII1O1.setTextSize(f);
        if (z) {
            this.X11iII1O1.setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: IO */
    public final void m38939IO(int i, int i2) {
        if (this.iIXi1iiXI) {
            this.f55085IO.setInitPosition(i);
            this.XXX11i = i;
        } else {
            int i3 = i / 12;
            this.iX1O1.setInitPosition(i3);
            int i4 = i % 12;
            this.f55085IO.setInitPosition(i4);
            this.X0i1O = i3;
            this.XXX11i = i4;
        }
        this.f55084I1.setInitPosition(i2);
        this.X1IX = i2;
    }

    public final boolean OIi0() {
        return this.iIXi1iiXI;
    }

    public final void XOO0ii0() {
        if (this.iIXi1iiXI) {
            this.iX1O1.setVisibility(8);
            WheelView wheelView = this.f55085IO;
            ArrayList arrayList = new ArrayList(24);
            for (int i = 0; i < 24; i++) {
                StringCompanionObject stringCompanionObject = StringCompanionObject.OXO1;
                String str = String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1));
                Intrinsics.O10IXXX0X(str, "format(...)");
                arrayList.add(str);
            }
            wheelView.setItems(arrayList);
        } else {
            this.iX1O1.setVisibility(0);
            this.iX1O1.OIi0();
            this.iX1O1.setItems(CollectionsKt__CollectionsKt.iXiX011(getContext().getString(R.string.f54351am), getContext().getString(R.string.f54364pm)));
            this.iX1O1.setListener(new XIi00iiXO());
            WheelView wheelView2 = this.f55085IO;
            ArrayList arrayList2 = new ArrayList(12);
            int i2 = 0;
            while (i2 < 12) {
                arrayList2.add(i2 == 0 ? X10i1i.f4174II : String.valueOf(i2));
                i2++;
            }
            wheelView2.setItems(arrayList2);
        }
        this.f55085IO.setListener(new C19076iO());
        WheelView wheelView3 = this.f55084I1;
        ArrayList arrayList3 = new ArrayList(60);
        for (int i3 = 0; i3 < 60; i3++) {
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.OXO1;
            String str2 = String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(i3)}, 1));
            Intrinsics.O10IXXX0X(str2, "format(...)");
            arrayList3.add(str2);
        }
        wheelView3.setItems(arrayList3);
        this.f55084I1.setListener(new XO0O10());
    }

    @tb1
    public final Function2<Integer, Integer, Unit> getMListener() {
        return this.iXiX011;
    }

    public final void set24Hourly(boolean z) {
        this.iIXi1iiXI = z;
        XOO0ii0();
    }

    public final void setMListener(@tb1 Function2<? super Integer, ? super Integer, Unit> function2) {
        this.iXiX011 = function2;
    }

    public final void setVisibleCount(int i) {
        this.f55085IO.setVisibleCount(i);
        this.f55084I1.setVisibleCount(i);
        this.iX1O1.setVisibleCount(i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TimePicker(@aa1 Context context, @tb1 AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.X0O(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TimePicker(@aa1 Context context, @tb1 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.X0O(context, "context");
        this.iIXi1iiXI = O0X11OiO.X11iII1O1();
        gk4.I0IIOi = isInEditMode();
        LayoutInflater.from(context).inflate(R.layout.view_three_pickers, (ViewGroup) this, true);
        View viewFindViewById = findViewById(R.id.wv1);
        Intrinsics.O10IXXX0X(viewFindViewById, "findViewById(...)");
        this.f55085IO = (WheelView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.wv2);
        Intrinsics.O10IXXX0X(viewFindViewById2, "findViewById(...)");
        this.f55084I1 = (WheelView) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.wv3);
        Intrinsics.O10IXXX0X(viewFindViewById3, "findViewById(...)");
        this.iX1O1 = (WheelView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.tvColon);
        Intrinsics.O10IXXX0X(viewFindViewById4, "findViewById(...)");
        this.X11iII1O1 = (TextView) viewFindViewById4;
        I0IIOi(context, attributeSet);
        XOO0ii0();
    }

    public /* synthetic */ TimePicker(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
