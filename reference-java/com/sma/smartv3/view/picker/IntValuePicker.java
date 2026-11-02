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

    /* JADX INFO: renamed from: I1 */
    @aa1
    public final TextView f55082I1;

    /* JADX INFO: renamed from: IO */
    @aa1
    public final WheelView f55083IO;

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
        public OXO1() {
        }

        @Override // com.android.mltcode.paycertificationapi.dg1
        @CallSuper
        public void OXO1(int i) {
            Function1<Integer, Unit> mListener = IntValuePicker.this.getMListener();
            if (mListener != null) {
                mListener.invoke2(Integer.valueOf(IntValuePicker.this.XO0O10(i)));
            }
        }
    }

    public static final class XIi00iiXO extends OXO1 {
        public XIi00iiXO() {
            super();
        }

        @Override // com.sma.smartv3.view.picker.IntValuePicker.OXO1, com.android.mltcode.paycertificationapi.dg1
        public void OXO1(int i) {
            IntValuePicker intValuePicker = IntValuePicker.this;
            intValuePicker.iX1O1 = intValuePicker.XO0O10(i);
            IntValuePicker.this.IiI10X(i);
            super.OXO1(i);
        }
    }

    @JvmOverloads
    public IntValuePicker(@tb1 Context context) {
        this(context, null, 0, 6, null);
    }

    public final void IiI10X(int i) {
        if (this.X1IX) {
            TextView textView = this.f55082I1;
            int i2 = 8;
            if (this.iIXi1iiXI != 0 && i != 0) {
                i2 = 0;
            }
            textView.setVisibility(i2);
        }
    }

    public final void O00(int i, int i2) {
        String strValueOf;
        this.X11iII1O1 = i;
        this.XXX11i = i2;
        boolean z = this.X1IX;
        if (z && i == 0) {
            throw new IllegalArgumentException("when setUseZero is true, the min is not zero!");
        }
        WheelView wheelView = this.f55083IO;
        int i3 = (i2 - i) + (z ? 2 : 1);
        ArrayList arrayList = new ArrayList(i3);
        int i4 = 0;
        while (i4 < i3) {
            if (this.X1IX) {
                strValueOf = i4 == 0 ? this.X0i1O : String.valueOf((i4 - 1) + this.X11iII1O1);
            } else {
                strValueOf = String.valueOf(this.X11iII1O1 + i4);
            }
            arrayList.add(strValueOf);
            i4++;
        }
        wheelView.setItems(arrayList);
    }

    public final int XO0O10(int i) {
        int i2;
        if (!this.X1IX) {
            i2 = this.X11iII1O1;
        } else {
            if (i == 0) {
                return 0;
            }
            i--;
            i2 = this.X11iII1O1;
        }
        return i + i2;
    }

    public final int XOO0ii0(int i) {
        if (!this.X1IX) {
            return i - this.X11iII1O1;
        }
        if (i == 0) {
            return 0;
        }
        return (i - this.X11iII1O1) + 1;
    }

    @tb1
    public final Function1<Integer, Unit> getMListener() {
        return this.iXiX011;
    }

    /* JADX INFO: renamed from: iO */
    public final void m38937iO() {
        this.f55083IO.setListener(new XIi00iiXO());
    }

    public final void setMListener(@tb1 Function1<? super Integer, Unit> function1) {
        this.iXiX011 = function1;
    }

    public final void setUnit(int i) {
        this.iIXi1iiXI = i;
        if (i == 0) {
            this.f55082I1.setVisibility(8);
        } else {
            this.f55082I1.setVisibility(0);
            this.f55082I1.setText(i);
        }
    }

    public final void setUseZero(boolean z) {
        this.X1IX = z;
    }

    public final void setValuse(int i) {
        this.iX1O1 = i;
        IiI10X(i);
        this.f55083IO.setInitPosition(XOO0ii0(this.iX1O1));
    }

    public final void setVisibleCount(int i) {
        this.f55083IO.setVisibleCount(i);
    }

    public final void setZeroText(@aa1 String text) {
        Intrinsics.X0O(text, "text");
        this.X0i1O = text;
    }

    @JvmOverloads
    public IntValuePicker(@tb1 Context context, @tb1 AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ IntValuePicker(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public IntValuePicker(@tb1 Context context, @tb1 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.XXI(context);
        this.X0i1O = "0";
        LayoutInflater.from(context).inflate(R.layout.view_value_picker, (ViewGroup) this, true);
        View viewFindViewById = findViewById(R.id.wv1);
        Intrinsics.O10IXXX0X(viewFindViewById, "findViewById(...)");
        this.f55083IO = (WheelView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.tv_picker_unit);
        Intrinsics.O10IXXX0X(viewFindViewById2, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById2;
        this.f55082I1 = textView;
        textView.setVisibility(8);
        m38937iO();
    }
}
