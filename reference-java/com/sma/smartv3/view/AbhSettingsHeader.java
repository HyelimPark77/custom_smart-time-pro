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
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.C15429R;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.AbhSettingsHeader;
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

    /* JADX INFO: renamed from: I1 */
    @aa1
    public final TextView f54946I1;

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

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AbhSettingsHeader(@aa1 Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.X0O(context, "context");
    }

    public static final void XIi00iiXO(AbhSettingsHeader abhSettingsHeader, View view) {
        abhSettingsHeader.setChecked(!abhSettingsHeader.X1IX);
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
        return this.f54946I1;
    }

    /* JADX INFO: renamed from: iO */
    public final boolean m38868iO() {
        return this.X1IX;
    }

    public final void setChecked(boolean z) {
        this.X1IX = z;
        this.f54946I1.setEnabled(z);
        this.X11iII1O1.setChecked(z);
        ViewParent parent = getParent();
        Intrinsics.X1ii(parent, "null cannot be cast to non-null type android.view.ViewGroup");
        for (View view : ViewGroupKt.getChildren((ViewGroup) parent)) {
            if (view instanceof AbhSettingsItem) {
                ((AbhSettingsItem) view).setEnabled(z);
            }
        }
        if (this.XXX11i) {
            return;
        }
        this.XXX11i = true;
        Function1<? super Boolean, Unit> function1 = this.X0i1O;
        if (function1 != null) {
            function1.invoke2(Boolean.valueOf(this.X1IX));
        }
        this.XXX11i = false;
    }

    public final void setMDescription(@aa1 String value) {
        Intrinsics.X0O(value, "value");
        this.iIXi1iiXI = value;
        this.iX1O1.setText(value);
    }

    public final void setMDescriptionColor(int i) {
        this.iXiX011 = i;
        this.iX1O1.setTextColor(i);
    }

    public final void setMListener(@tb1 Function1<? super Boolean, Unit> function1) {
        this.X0i1O = function1;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AbhSettingsHeader(@aa1 Context context, @tb1 AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.X0O(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AbhSettingsHeader(@aa1 Context context, @tb1 AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.X0O(context, "context");
        this.X1IX = true;
        this.iIXi1iiXI = "";
        this.iXiX011 = ViewCompat.MEASURED_STATE_MASK;
        LayoutInflater.from(context).inflate(R.layout.abh_settings_header, (ViewGroup) this, true);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C15429R.styleable.AbhSettingsHeader);
        Intrinsics.O10IXXX0X(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        String string = typedArrayObtainStyledAttributes.getString(1);
        string = string == null ? "" : string;
        String string2 = typedArrayObtainStyledAttributes.getString(0);
        String str = string2 != null ? string2 : "";
        View viewFindViewById = findViewById(R.id.tv_title);
        TextView textView = (TextView) viewFindViewById;
        textView.setText(string);
        Intrinsics.O10IXXX0X(viewFindViewById, "apply(...)");
        this.f54946I1 = textView;
        View viewFindViewById2 = findViewById(R.id.tv_description);
        TextView textView2 = (TextView) viewFindViewById2;
        textView2.setText(str);
        textView2.setVisibility(TextUtils.isEmpty(str) ? 8 : 0);
        Intrinsics.O10IXXX0X(viewFindViewById2, "apply(...)");
        this.iX1O1 = textView2;
        View viewFindViewById3 = findViewById(R.id.check_enabled);
        Intrinsics.O10IXXX0X(viewFindViewById3, "findViewById(...)");
        this.X11iII1O1 = (CheckBox) viewFindViewById3;
        typedArrayObtainStyledAttributes.recycle();
        setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.Oii1X1iO
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AbhSettingsHeader.XIi00iiXO(this.f3821IO, view);
            }
        });
    }

    public /* synthetic */ AbhSettingsHeader(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
