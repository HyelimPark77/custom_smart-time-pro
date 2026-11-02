package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class LayoutQiblaMethodItemBinding implements ViewBinding {

    @NonNull
    public final AppCompatRadioButton rbSelectedState;

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final PFMedium tvFajr;

    @NonNull
    public final PFMedium tvIsha;

    @NonNull
    public final PFMedium tvName;

    private LayoutQiblaMethodItemBinding(@NonNull RelativeLayout rootView, @NonNull AppCompatRadioButton rbSelectedState, @NonNull PFMedium tvFajr, @NonNull PFMedium tvIsha, @NonNull PFMedium tvName) {
        this.rootView = rootView;
        this.rbSelectedState = rbSelectedState;
        this.tvFajr = tvFajr;
        this.tvIsha = tvIsha;
        this.tvName = tvName;
    }

    @NonNull
    public static LayoutQiblaMethodItemBinding bind(@NonNull View rootView) {
        int r0 = R.id.rbSelectedState;
        AppCompatRadioButton r4 = (AppCompatRadioButton) ViewBindings.findChildViewById(rootView, R.id.rbSelectedState);
        if (r4 == null) goto L13;
        r0 = R.id.tv_fajr;
        PFMedium r5 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_fajr);
        if (r5 == null) goto L13;
        r0 = R.id.tv_isha;
        PFMedium r6 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_isha);
        if (r6 == null) goto L13;
        r0 = R.id.tv_name;
        PFMedium r7 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_name);
        if (r7 == null) goto L13;
        return new LayoutQiblaMethodItemBinding((RelativeLayout) rootView, r4, r5, r6, r7);
    L13:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static LayoutQiblaMethodItemBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static LayoutQiblaMethodItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.layout_qibla_method_item, parent, false);
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
