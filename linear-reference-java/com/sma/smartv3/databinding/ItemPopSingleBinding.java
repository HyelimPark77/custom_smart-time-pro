package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ItemPopSingleBinding implements ViewBinding {

    @NonNull
    public final AppCompatCheckBox checkbox;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final PFMedium tvValue;

    private ItemPopSingleBinding(@NonNull LinearLayout rootView, @NonNull AppCompatCheckBox checkbox, @NonNull PFMedium tvValue) {
        this.rootView = rootView;
        this.checkbox = checkbox;
        this.tvValue = tvValue;
    }

    @NonNull
    public static ItemPopSingleBinding bind(@NonNull View rootView) {
        int r0 = R.id.checkbox;
        AppCompatCheckBox r1 = (AppCompatCheckBox) ViewBindings.findChildViewById(rootView, R.id.checkbox);
        if (r1 == null) goto L9;
        r0 = R.id.tv_value;
        PFMedium r2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_value);
        if (r2 == null) goto L9;
        return new ItemPopSingleBinding((LinearLayout) rootView, r1, r2);
    L9:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ItemPopSingleBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ItemPopSingleBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.item_pop_single, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
