package com.sma.smartv3.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.iiOI111I;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.MyTypeface;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import skin.support.widget.SkinCompatLinearLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class AbhSettingsItem extends SkinCompatLinearLayout {

    @aa1
    public final TextView I1;

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

    @JvmOverloads
    public AbhSettingsItem(@aa1 Context r8) {
        Intrinsics.X0O(r8, "context");
        AttributeSet r3 = null;
        int r4 = 0;
        this(r8, r3, r4, 6, null);
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
        if (this.X1IX == false) goto L7;
        return this.X11iII1O1.getText().toString();
    L7:
        return this.iX1O1.getText().toString();
    }

    @aa1
    public final String getRightText() {
        if (this.X1IX == false) goto L7;
        return this.X11iII1O1.getText().toString();
    L7:
        return this.iX1O1.getText().toString();
    }

    @Override // android.view.View
    public void setEnabled(boolean r2) {
        super.setEnabled(r2);
        this.I1.setEnabled(r2);
        this.iX1O1.setEnabled(r2);
        this.X11iII1O1.setEnabled(r2);
        this.XXX11i.setEnabled(r2);
    }

    public final void setMLeftText(@aa1 String r2) {
        Intrinsics.X0O(r2, "value");
        this.I1.setText(r2);
    }

    public final void setMRightText(@aa1 String r2) {
        Intrinsics.X0O(r2, "value");
        if (this.X1IX == false) goto L6;
        this.X11iII1O1.setText(r2);
        return;
    L6:
        this.iX1O1.setText(r2);
    }

    @JvmOverloads
    public AbhSettingsItem(@aa1 Context r8, @tb1 AttributeSet r9) {
        Intrinsics.X0O(r8, "context");
        int r4 = 0;
        this(r8, r9, r4, 4, null);
    }

    @JvmOverloads
    public AbhSettingsItem(@aa1 Context r11, @tb1 AttributeSet r12, int r13) {
        Intrinsics.X0O(r11, "context");
        super(r11, r12, r13);
        String r14 = "";
        this.iXiX011 = "";
        LayoutInflater.from(r11).inflate(R.layout.abh_settings_item_view, this, true);
        View r0 = findViewById(R.id.tv_label);
        Intrinsics.O10IXXX0X(r0, "findViewById(...)");
        TextView r1 = (TextView) r0;
        this.I1 = r1;
        View r3 = findViewById(R.id.tv_value);
        Intrinsics.O10IXXX0X(r3, "findViewById(...)");
        TextView r4 = (TextView) r3;
        this.iX1O1 = r4;
        View r5 = findViewById(R.id.edt_value);
        Intrinsics.O10IXXX0X(r5, "findViewById(...)");
        EditText r6 = (EditText) r5;
        this.X11iII1O1 = r6;
        View r7 = findViewById(R.id.iv_enter);
        Intrinsics.O10IXXX0X(r7, "findViewById(...)");
        this.XXX11i = (ImageView) r7;
        this.X0i1O = findViewById(R.id.top_line);
        this.iIXi1iiXI = findViewById(R.id.bottom_line);
        TypedArray r15 = r11.obtainStyledAttributes(r12, com.sma.smartv3.R.styleable.AbhSettingsItem);
        Intrinsics.O10IXXX0X(r15, "obtainStyledAttributes(...)");
        String r2 = r15.getString(2);
        if (r2 != null) goto L5;
        r2 = "";
    L5:
        String r8 = r15.getString(3);
        if (r8 == null) goto L9;
        r14 = r8;
    L9:
        boolean r9 = r15.getBoolean(1, false);
        this.X1IX = r9;
        View r10 = this.X0i1O;
        if (r10 != null) goto L12;
    L16:
        View r16 = this.iIXi1iiXI;
        if (r16 != null) goto L19;
    L23:
        r1.setText(r2);
        if (r9 == false) goto L26;
        r4.setVisibility(8);
        r6.setVisibility(0);
        r6.setTypeface(iiOI111I.OXO1.OXO1(MyTypeface.PF_MEDIUM, r11));
        r6.setText(r14);
    L27:
        r15.recycle();
        return;
    L26:
        r6.setVisibility(8);
        r4.setVisibility(0);
        r4.setText(r14);
        goto L27
    L19:
        if (r15.getBoolean(0, true) == false) goto L21;
        int r17 = 0;
    L22:
        r16.setVisibility(r17);
        goto L23
    L21:
        r17 = 8;
        goto L22
    L12:
        if (r15.getBoolean(4, true) == false) goto L14;
        int r18 = 0;
    L15:
        r10.setVisibility(r18);
        goto L16
    L14:
        r18 = 8;
        goto L15
    }

    public /* synthetic */ AbhSettingsItem(Context r1, AttributeSet r2, int r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = null;
    L6:
        if ((r4 & 4) == 0) goto L8;
        r3 = 0;
    L8:
        this(r1, r2, r3);
    }
}
