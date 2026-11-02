package com.sma.smartv3.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.iiOI111I;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.C15429R;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.MyTypeface;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import skin.support.widget.SkinCompatLinearLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class AbhSettingsItem extends SkinCompatLinearLayout {

    /* JADX INFO: renamed from: I1 */
    @aa1
    public final TextView f54947I1;

    @tb1
    public View X0i1O;

    @aa1
    public final EditText X11iII1O1;
    public final boolean X1IX;

    @aa1
    public final ImageView XXX11i;

    @tb1
    public View iIXi1iiXI;

    @aa1
    public final TextView iX1O1;

    @aa1
    public String iXiX011;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AbhSettingsItem(@aa1 Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.X0O(context, "context");
    }

    @aa1
    public final EditText getEdtValue() {
        return this.X11iII1O1;
    }

    @aa1
    public final String getMLeftText() {
        return this.iXiX011;
    }

    @aa1
    public final String getMRightText() {
        return this.X1IX ? this.X11iII1O1.getText().toString() : this.iX1O1.getText().toString();
    }

    @aa1
    public final String getRightText() {
        return this.X1IX ? this.X11iII1O1.getText().toString() : this.iX1O1.getText().toString();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.f54947I1.setEnabled(z);
        this.iX1O1.setEnabled(z);
        this.X11iII1O1.setEnabled(z);
        this.XXX11i.setEnabled(z);
    }

    public final void setMLeftText(@aa1 String value) {
        Intrinsics.X0O(value, "value");
        this.f54947I1.setText(value);
    }

    public final void setMRightText(@aa1 String value) {
        Intrinsics.X0O(value, "value");
        if (this.X1IX) {
            this.X11iII1O1.setText(value);
        } else {
            this.iX1O1.setText(value);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AbhSettingsItem(@aa1 Context context, @tb1 AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.X0O(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AbhSettingsItem(@aa1 Context context, @tb1 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.X0O(context, "context");
        this.iXiX011 = "";
        LayoutInflater.from(context).inflate(R.layout.abh_settings_item_view, (ViewGroup) this, true);
        View viewFindViewById = findViewById(R.id.tv_label);
        Intrinsics.O10IXXX0X(viewFindViewById, "findViewById(...)");
        TextView textView = (TextView) viewFindViewById;
        this.f54947I1 = textView;
        View viewFindViewById2 = findViewById(R.id.tv_value);
        Intrinsics.O10IXXX0X(viewFindViewById2, "findViewById(...)");
        TextView textView2 = (TextView) viewFindViewById2;
        this.iX1O1 = textView2;
        View viewFindViewById3 = findViewById(R.id.edt_value);
        Intrinsics.O10IXXX0X(viewFindViewById3, "findViewById(...)");
        EditText editText = (EditText) viewFindViewById3;
        this.X11iII1O1 = editText;
        View viewFindViewById4 = findViewById(R.id.iv_enter);
        Intrinsics.O10IXXX0X(viewFindViewById4, "findViewById(...)");
        this.XXX11i = (ImageView) viewFindViewById4;
        this.X0i1O = findViewById(R.id.top_line);
        this.iIXi1iiXI = findViewById(R.id.bottom_line);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C15429R.styleable.AbhSettingsItem);
        Intrinsics.O10IXXX0X(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        String string = typedArrayObtainStyledAttributes.getString(2);
        string = string == null ? "" : string;
        String string2 = typedArrayObtainStyledAttributes.getString(3);
        String str = string2 != null ? string2 : "";
        boolean z = typedArrayObtainStyledAttributes.getBoolean(1, false);
        this.X1IX = z;
        View view = this.X0i1O;
        if (view != null) {
            view.setVisibility(typedArrayObtainStyledAttributes.getBoolean(4, true) ? 0 : 8);
        }
        View view2 = this.iIXi1iiXI;
        if (view2 != null) {
            view2.setVisibility(typedArrayObtainStyledAttributes.getBoolean(0, true) ? 0 : 8);
        }
        textView.setText(string);
        if (z) {
            textView2.setVisibility(8);
            editText.setVisibility(0);
            editText.setTypeface(iiOI111I.OXO1.OXO1(MyTypeface.PF_MEDIUM, context));
            editText.setText(str);
        } else {
            editText.setVisibility(8);
            textView2.setVisibility(0);
            textView2.setText(str);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public /* synthetic */ AbhSettingsItem(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
