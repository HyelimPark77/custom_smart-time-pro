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
public final class ItemPopSingle2Binding implements ViewBinding {

    @NonNull
    public final AppCompatCheckBox checkbox;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final PFMedium tvSubTitle;

    @NonNull
    public final PFMedium tvTitle;

    private ItemPopSingle2Binding(@NonNull LinearLayout rootView, @NonNull AppCompatCheckBox checkbox, @NonNull PFMedium tvSubTitle, @NonNull PFMedium tvTitle) {
        this.rootView = rootView;
        this.checkbox = checkbox;
        this.tvSubTitle = tvSubTitle;
        this.tvTitle = tvTitle;
    }

    @NonNull
    public static ItemPopSingle2Binding bind(@NonNull View rootView) {
        int r0 = R.id.checkbox;
        AppCompatCheckBox r1 = (AppCompatCheckBox) ViewBindings.findChildViewById(rootView, R.id.checkbox);
        if (r1 == null) goto L11;
        r0 = R.id.tv_sub_title;
        PFMedium r2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_sub_title);
        if (r2 == null) goto L11;
        r0 = R.id.tv_title;
        PFMedium r3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_title);
        if (r3 == null) goto L11;
        return new ItemPopSingle2Binding((LinearLayout) rootView, r1, r2, r3);
    L11:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ItemPopSingle2Binding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ItemPopSingle2Binding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.item_pop_single_2, parent, false);
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
