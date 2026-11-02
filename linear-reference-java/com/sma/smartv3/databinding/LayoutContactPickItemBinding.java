package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.contactpicker.RoundLetterView;

/* JADX INFO: loaded from: classes19.dex */
public final class LayoutContactPickItemBinding implements ViewBinding {

    @NonNull
    public final AppCompatCheckBox cbSelectedState;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final TextView tvContactName;

    @NonNull
    public final TextView tvNumber;

    @NonNull
    public final RoundLetterView vRoundLetterView;

    private LayoutContactPickItemBinding(@NonNull RelativeLayout rootView, @NonNull AppCompatCheckBox cbSelectedState, @NonNull TextView tvContactName, @NonNull TextView tvNumber, @NonNull RoundLetterView vRoundLetterView) {
        this.rootView = rootView;
        this.cbSelectedState = cbSelectedState;
        this.tvContactName = tvContactName;
        this.tvNumber = tvNumber;
        this.vRoundLetterView = vRoundLetterView;
    }

    @NonNull
    public static LayoutContactPickItemBinding bind(@NonNull View rootView) {
        int r0 = R.id.cbSelectedState;
        AppCompatCheckBox r4 = (AppCompatCheckBox) ViewBindings.findChildViewById(rootView, R.id.cbSelectedState);
        if (r4 == null) goto L13;
        r0 = R.id.tvContactName;
        TextView r5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvContactName);
        if (r5 == null) goto L13;
        r0 = R.id.tvNumber;
        TextView r6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvNumber);
        if (r6 == null) goto L13;
        r0 = R.id.vRoundLetterView;
        RoundLetterView r7 = (RoundLetterView) ViewBindings.findChildViewById(rootView, R.id.vRoundLetterView);
        if (r7 == null) goto L13;
        return new LayoutContactPickItemBinding((RelativeLayout) rootView, r4, r5, r6, r7);
    L13:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static LayoutContactPickItemBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static LayoutContactPickItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.layout_contact_pick_item, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
