package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class LayoutTimezonePickItemBinding implements ViewBinding {

    @NonNull
    public final AppCompatCheckBox cbSelectedState;

    @NonNull
    public final AppCompatRadioButton rbSelectedState;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final TextView tvName;

    @NonNull
    public final TextView tvTip;

    @NonNull
    public final TextView tvTitle;

    private LayoutTimezonePickItemBinding(@NonNull RelativeLayout rootView, @NonNull AppCompatCheckBox cbSelectedState, @NonNull AppCompatRadioButton rbSelectedState, @NonNull TextView tvName, @NonNull TextView tvTip, @NonNull TextView tvTitle) {
        this.rootView = rootView;
        this.cbSelectedState = cbSelectedState;
        this.rbSelectedState = rbSelectedState;
        this.tvName = tvName;
        this.tvTip = tvTip;
        this.tvTitle = tvTitle;
    }

    @NonNull
    public static LayoutTimezonePickItemBinding bind(@NonNull View rootView) {
        int r0 = R.id.cbSelectedState;
        AppCompatCheckBox r4 = (AppCompatCheckBox) ViewBindings.findChildViewById(rootView, R.id.cbSelectedState);
        if (r4 == null) goto L15;
        r0 = R.id.rbSelectedState;
        AppCompatRadioButton r5 = (AppCompatRadioButton) ViewBindings.findChildViewById(rootView, R.id.rbSelectedState);
        if (r5 == null) goto L15;
        r0 = R.id.tvName;
        TextView r6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvName);
        if (r6 == null) goto L15;
        r0 = R.id.tvTip;
        TextView r7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvTip);
        if (r7 == null) goto L15;
        r0 = R.id.tvTitle;
        TextView r8 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvTitle);
        if (r8 == null) goto L15;
        return new LayoutTimezonePickItemBinding((RelativeLayout) rootView, r4, r5, r6, r7, r8);
    L15:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static LayoutTimezonePickItemBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static LayoutTimezonePickItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.layout_timezone_pick_item, parent, false);
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
