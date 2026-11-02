package com.sma.smartv3.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewGroupKt;
import com.android.mltcode.paycertificationapi.Oii1X1iO;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.pro.R;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import skin.support.widget.SkinCompatLinearLayout;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nAbhSettingsHeader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbhSettingsHeader.kt\ncom/sma/smartv3/view/AbhSettingsHeader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,77:1\n1#2:78\n*E\n"})
public final class AbhSettingsHeader extends SkinCompatLinearLayout {

    @aa1
    public final TextView I1;

    @tb1
    public Function1<? super Boolean, Unit> X0i1O;

    @aa1
    public final CheckBox X11iII1O1;
    public boolean X1IX;
    public boolean XXX11i;

    @aa1
    public String iIXi1iiXI;

    @aa1
    public final TextView iX1O1;
    public int iXiX011;

    @JvmOverloads
    public AbhSettingsHeader(@aa1 Context r8) {
        Intrinsics.X0O(r8, "context");
        AttributeSet r3 = null;
        int r4 = 0;
        this(r8, r3, r4, 6, null);
    }

    public static /* synthetic */ void OXO1(AbhSettingsHeader r0, View r1) {
        XIi00iiXO(r0, r1);
    }

    public static final void XIi00iiXO(AbhSettingsHeader r0, View r1) {
        r0.setChecked(!r0.X1IX);
    }

    @aa1
    public final CheckBox getCheckEnabled() {
        return this.X11iII1O1;
    }

    @aa1
    public final String getMDescription() {
        return this.iIXi1iiXI;
    }

    public final int getMDescriptionColor() {
        return this.iXiX011;
    }

    @tb1
    public final Function1<Boolean, Unit> getMListener() {
        return this.X0i1O;
    }

    @aa1
    public final TextView getTvTitle() {
        return this.I1;
    }

    public final boolean iO() {
        return this.X1IX;
    }

    public final void setChecked(boolean r4) {
        this.X1IX = r4;
        this.I1.setEnabled(r4);
        this.X11iII1O1.setChecked(r4);
        ViewParent r0 = getParent();
        Intrinsics.X1ii(r0, "null cannot be cast to non-null type android.view.ViewGroup");
        Iterator<View> r1 = ViewGroupKt.getChildren((ViewGroup) r0).iterator();
    L4:
        if (r1.hasNext() == false) goto L9;
        View r2 = r1.next();
        if ((r2 instanceof AbhSettingsItem) == false) goto L4;
        ((AbhSettingsItem) r2).setEnabled(r4);
        goto L4
    L9:
        if (this.XXX11i == false) goto L11;
        return;
    L11:
        this.XXX11i = true;
        Function1<? super Boolean, Unit> r5 = this.X0i1O;
        if (r5 == null) goto L14;
        r5.invoke(Boolean.valueOf(this.X1IX));
    L14:
        this.XXX11i = false;
    }

    public final void setMDescription(@aa1 String r2) {
        Intrinsics.X0O(r2, "value");
        this.iIXi1iiXI = r2;
        this.iX1O1.setText(r2);
    }

    public final void setMDescriptionColor(int r2) {
        this.iXiX011 = r2;
        this.iX1O1.setTextColor(r2);
    }

    public final void setMListener(@tb1 Function1<? super Boolean, Unit> r1) {
        this.X0i1O = r1;
    }

    @JvmOverloads
    public AbhSettingsHeader(@aa1 Context r8, @tb1 AttributeSet r9) {
        Intrinsics.X0O(r8, "context");
        int r4 = 0;
        this(r8, r9, r4, 4, null);
    }

    @JvmOverloads
    public AbhSettingsHeader(@aa1 Context r4, @tb1 AttributeSet r5, int r6) {
        Intrinsics.X0O(r4, "context");
        super(r4, r5, r6);
        this.X1IX = true;
        String r0 = "";
        this.iIXi1iiXI = "";
        this.iXiX011 = ViewCompat.MEASURED_STATE_MASK;
        LayoutInflater.from(r4).inflate(R.layout.abh_settings_header, this, true);
        TypedArray r7 = r4.obtainStyledAttributes(r5, com.sma.smartv3.R.styleable.AbhSettingsHeader);
        Intrinsics.O10IXXX0X(r7, "obtainStyledAttributes(...)");
        String r8 = r7.getString(1);
        if (r8 != null) goto L5;
        r8 = "";
    L5:
        int r9 = 0;
        String r1 = r7.getString(0);
        if (r1 == null) goto L9;
        r0 = r1;
    L9:
        View r2 = findViewById(R.id.tv_title);
        TextView r3 = (TextView) r2;
        r3.setText(r8);
        Intrinsics.O10IXXX0X(r2, "apply(...)");
        this.I1 = r3;
        View r10 = findViewById(R.id.tv_description);
        TextView r11 = (TextView) r10;
        r11.setText(r0);
        if (TextUtils.isEmpty(r0) == false) goto L12;
        r9 = 8;
    L12:
        r11.setVisibility(r9);
        Intrinsics.O10IXXX0X(r10, "apply(...)");
        this.iX1O1 = r11;
        View r12 = findViewById(R.id.check_enabled);
        Intrinsics.O10IXXX0X(r12, "findViewById(...)");
        this.X11iII1O1 = (CheckBox) r12;
        r7.recycle();
        setOnClickListener(new Oii1X1iO(this));
    }

    public /* synthetic */ AbhSettingsHeader(Context r1, AttributeSet r2, int r3, int r4, DefaultConstructorMarker r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = null;
    L6:
        if ((r4 & 4) == 0) goto L8;
        r3 = 0;
    L8:
        this(r1, r2, r3);
    }
}
