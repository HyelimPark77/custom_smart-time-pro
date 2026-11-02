package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityMeasureUnitSettingsBinding implements ViewBinding {

    @NonNull
    public final LinearLayout llDistanceUnit;

    @NonNull
    public final LinearLayout llTemperatureUnit;

    @NonNull
    public final LinearLayout rootView;

    @NonNull
    private final LinearLayout rootView_;

    @NonNull
    public final NestedScrollView scrollView;

    @NonNull
    public final PFMedium tvDistanceUnit;

    @NonNull
    public final PFMedium tvTemperatureUnit;

    private ActivityMeasureUnitSettingsBinding(@NonNull LinearLayout rootView_, @NonNull LinearLayout llDistanceUnit, @NonNull LinearLayout llTemperatureUnit, @NonNull LinearLayout rootView, @NonNull NestedScrollView scrollView, @NonNull PFMedium tvDistanceUnit, @NonNull PFMedium tvTemperatureUnit) {
        this.rootView_ = rootView_;
        this.llDistanceUnit = llDistanceUnit;
        this.llTemperatureUnit = llTemperatureUnit;
        this.rootView = rootView;
        this.scrollView = scrollView;
        this.tvDistanceUnit = tvDistanceUnit;
        this.tvTemperatureUnit = tvTemperatureUnit;
    }

    @NonNull
    public static ActivityMeasureUnitSettingsBinding bind(@NonNull View rootView) {
        int i = R.id.ll_distance_unit;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_distance_unit);
        if (linearLayout != null) {
            i = R.id.ll_temperature_unit;
            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_temperature_unit);
            if (linearLayout2 != null) {
                LinearLayout linearLayout3 = (LinearLayout) rootView;
                i = R.id.scrollView;
                NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(rootView, R.id.scrollView);
                if (nestedScrollView != null) {
                    i = R.id.tv_distance_unit;
                    PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_distance_unit);
                    if (pFMedium != null) {
                        i = R.id.tv_temperature_unit;
                        PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_temperature_unit);
                        if (pFMedium2 != null) {
                            return new ActivityMeasureUnitSettingsBinding(linearLayout3, linearLayout, linearLayout2, linearLayout3, nestedScrollView, pFMedium, pFMedium2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityMeasureUnitSettingsBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityMeasureUnitSettingsBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_measure_unit_settings, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView_;
    }
}
