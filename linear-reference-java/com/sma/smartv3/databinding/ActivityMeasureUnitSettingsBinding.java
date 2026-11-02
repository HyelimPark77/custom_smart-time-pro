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
        int r0 = R.id.ll_distance_unit;
        LinearLayout r4 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_distance_unit);
        if (r4 == null) goto L15;
        r0 = R.id.ll_temperature_unit;
        LinearLayout r5 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_temperature_unit);
        if (r5 == null) goto L15;
        LinearLayout r3 = (LinearLayout) rootView;
        r0 = R.id.scrollView;
        NestedScrollView r7 = (NestedScrollView) ViewBindings.findChildViewById(rootView, R.id.scrollView);
        if (r7 == null) goto L15;
        r0 = R.id.tv_distance_unit;
        PFMedium r8 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_distance_unit);
        if (r8 == null) goto L15;
        r0 = R.id.tv_temperature_unit;
        PFMedium r9 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_temperature_unit);
        if (r9 == null) goto L15;
        return new ActivityMeasureUnitSettingsBinding(r3, r4, r5, r3, r7, r8, r9);
    L15:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivityMeasureUnitSettingsBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityMeasureUnitSettingsBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_measure_unit_settings, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView_;
    }
}
