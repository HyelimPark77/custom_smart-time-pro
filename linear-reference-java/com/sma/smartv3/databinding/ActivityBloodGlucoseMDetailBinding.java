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
        int r0 = R.id.bar_view;
        SegmentedBarView2 r1 = (SegmentedBarView2) ViewBindings.findChildViewById(rootView, R.id.bar_view);
        if (r1 == null) goto L9;
        r0 = R.id.tv_measure_date;
        PFMedium r2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_measure_date);
        if (r2 == null) goto L9;
        return new ActivityBloodGlucoseMDetailBinding((LinearLayout) rootView, r1, r2);
    L9:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivityBloodGlucoseMDetailBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityBloodGlucoseMDetailBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_blood_glucose_m_detail, parent, false);
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
