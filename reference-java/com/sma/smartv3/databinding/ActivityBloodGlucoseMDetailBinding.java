package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.segmentedbar.SegmentedBarView2;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityBloodGlucoseMDetailBinding implements ViewBinding {

    @NonNull
    public final SegmentedBarView2 barView;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final PFMedium tvMeasureDate;

    private ActivityBloodGlucoseMDetailBinding(@NonNull LinearLayout rootView, @NonNull SegmentedBarView2 barView, @NonNull PFMedium tvMeasureDate) {
        this.rootView = rootView;
        this.barView = barView;
        this.tvMeasureDate = tvMeasureDate;
    }

    @NonNull
    public static ActivityBloodGlucoseMDetailBinding bind(@NonNull View rootView) {
        int i = R.id.bar_view;
        SegmentedBarView2 segmentedBarView2 = (SegmentedBarView2) ViewBindings.findChildViewById(rootView, R.id.bar_view);
        if (segmentedBarView2 != null) {
            i = R.id.tv_measure_date;
            PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_measure_date);
            if (pFMedium != null) {
                return new ActivityBloodGlucoseMDetailBinding((LinearLayout) rootView, segmentedBarView2, pFMedium);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityBloodGlucoseMDetailBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityBloodGlucoseMDetailBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_blood_glucose_m_detail, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
