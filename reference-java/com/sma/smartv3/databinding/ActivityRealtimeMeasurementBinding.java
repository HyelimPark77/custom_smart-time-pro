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
public final class ActivityRealtimeMeasurementBinding implements ViewBinding {

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

    private ActivityRealtimeMeasurementBinding(@NonNull LinearLayout rootView_, @NonNull ImageView ivIcMeasurement, @NonNull LinearLayout llMeasurement, @NonNull LinearLayout rootView, @NonNull PFMedium tvInfo, @NonNull PFMedium tvUnit, @NonNull PFMedium tvValue) {
        this.rootView_ = rootView_;
        this.ivIcMeasurement = ivIcMeasurement;
        this.llMeasurement = llMeasurement;
        this.rootView = rootView;
        this.tvInfo = tvInfo;
        this.tvUnit = tvUnit;
        this.tvValue = tvValue;
    }

    @NonNull
    public static ActivityRealtimeMeasurementBinding bind(@NonNull View rootView) {
        int i = R.id.iv_ic_measurement;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_ic_measurement);
        if (imageView != null) {
            i = R.id.ll_measurement;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_measurement);
            if (linearLayout != null) {
                LinearLayout linearLayout2 = (LinearLayout) rootView;
                i = R.id.tv_info;
                PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_info);
                if (pFMedium != null) {
                    i = R.id.tv_unit;
                    PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_unit);
                    if (pFMedium2 != null) {
                        i = R.id.tv_value;
                        PFMedium pFMedium3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_value);
                        if (pFMedium3 != null) {
                            return new ActivityRealtimeMeasurementBinding(linearLayout2, imageView, linearLayout, linearLayout2, pFMedium, pFMedium2, pFMedium3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityRealtimeMeasurementBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityRealtimeMeasurementBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_realtime_measurement, parent, false);
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
