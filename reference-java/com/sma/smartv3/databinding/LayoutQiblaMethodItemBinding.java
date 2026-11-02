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
        int i = R.id.rbSelectedState;
        AppCompatRadioButton appCompatRadioButton = (AppCompatRadioButton) ViewBindings.findChildViewById(rootView, R.id.rbSelectedState);
        if (appCompatRadioButton != null) {
            i = R.id.tv_fajr;
            PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_fajr);
            if (pFMedium != null) {
                i = R.id.tv_isha;
                PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_isha);
                if (pFMedium2 != null) {
                    i = R.id.tv_name;
                    PFMedium pFMedium3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_name);
                    if (pFMedium3 != null) {
                        return new LayoutQiblaMethodItemBinding((RelativeLayout) rootView, appCompatRadioButton, pFMedium, pFMedium2, pFMedium3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static LayoutQiblaMethodItemBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static LayoutQiblaMethodItemBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.layout_qibla_method_item, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
