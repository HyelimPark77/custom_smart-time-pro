package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityBloodGlucoseMeasurementBinding implements ViewBinding {

    @NonNull
    public final ImageView ivIcMeasurement;

    @NonNull
    public final LinearLayout llMeasurement;

    @NonNull
    public final LinearLayout rootView;

    @NonNull
    private final LinearLayout rootView_;

    @NonNull
    public final PFMedium tvInfo;

    @NonNull
    public final PFMedium tvUnit;

    @NonNull
    public final PFMedium tvValue;

    private ActivityBloodGlucoseMeasurementBinding(@NonNull LinearLayout rootView_, @NonNull ImageView ivIcMeasurement, @NonNull LinearLayout llMeasurement, @NonNull LinearLayout rootView, @NonNull PFMedium tvInfo, @NonNull PFMedium tvUnit, @NonNull PFMedium tvValue) {
        this.rootView_ = rootView_;
        this.ivIcMeasurement = ivIcMeasurement;
        this.llMeasurement = llMeasurement;
        this.rootView = rootView;
        this.tvInfo = tvInfo;
        this.tvUnit = tvUnit;
        this.tvValue = tvValue;
    }

    @NonNull
    public static ActivityBloodGlucoseMeasurementBinding bind(@NonNull View rootView) {
        int r0 = R.id.iv_ic_measurement;
        ImageView r4 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_ic_measurement);
        if (r4 == null) goto L15;
        r0 = R.id.ll_measurement;
        LinearLayout r5 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_measurement);
        if (r5 == null) goto L15;
        LinearLayout r3 = (LinearLayout) rootView;
        r0 = R.id.tv_info;
        PFMedium r7 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_info);
        if (r7 == null) goto L15;
        r0 = R.id.tv_unit;
        PFMedium r8 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_unit);
        if (r8 == null) goto L15;
        r0 = R.id.tv_value;
        PFMedium r9 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_value);
        if (r9 == null) goto L15;
        return new ActivityBloodGlucoseMeasurementBinding(r3, r4, r5, r3, r7, r8, r9);
    L15:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivityBloodGlucoseMeasurementBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityBloodGlucoseMeasurementBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_blood_glucose_measurement, parent, false);
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
