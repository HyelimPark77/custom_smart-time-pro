package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.segmentedbar.SegmentedBarView2;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityBloodGlucose2Binding implements ViewBinding {

    @NonNull
    public final SegmentedBarView2 barView;

    @NonNull
    public final PFMedium btnMeasure;

    @NonNull
    public final PFMedium btnRiskLevel;

    @NonNull
    public final ImageView ivRiskLevel;

    @NonNull
    public final LinearLayout llDiabeticRiskInsight;

    @NonNull
    public final LinearLayout llNoMeasurement;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final RecyclerView rvRiskLevel;

    @NonNull
    public final PFMedium tvDiabeticRiskInsight;

    @NonNull
    public final PFMedium tvDiabeticRiskTips;

    @NonNull
    public final PFMedium tvMeasureDate;

    @NonNull
    public final PFMedium tvNoRecord;

    @NonNull
    public final PFMedium tvRiskDate;

    @NonNull
    public final PFMedium tvRiskRangeDate;

    private ActivityBloodGlucose2Binding(@NonNull LinearLayout rootView, @NonNull SegmentedBarView2 barView, @NonNull PFMedium btnMeasure, @NonNull PFMedium btnRiskLevel, @NonNull ImageView ivRiskLevel, @NonNull LinearLayout llDiabeticRiskInsight, @NonNull LinearLayout llNoMeasurement, @NonNull RecyclerView rvRiskLevel, @NonNull PFMedium tvDiabeticRiskInsight, @NonNull PFMedium tvDiabeticRiskTips, @NonNull PFMedium tvMeasureDate, @NonNull PFMedium tvNoRecord, @NonNull PFMedium tvRiskDate, @NonNull PFMedium tvRiskRangeDate) {
        this.rootView = rootView;
        this.barView = barView;
        this.btnMeasure = btnMeasure;
        this.btnRiskLevel = btnRiskLevel;
        this.ivRiskLevel = ivRiskLevel;
        this.llDiabeticRiskInsight = llDiabeticRiskInsight;
        this.llNoMeasurement = llNoMeasurement;
        this.rvRiskLevel = rvRiskLevel;
        this.tvDiabeticRiskInsight = tvDiabeticRiskInsight;
        this.tvDiabeticRiskTips = tvDiabeticRiskTips;
        this.tvMeasureDate = tvMeasureDate;
        this.tvNoRecord = tvNoRecord;
        this.tvRiskDate = tvRiskDate;
        this.tvRiskRangeDate = tvRiskRangeDate;
    }

    @NonNull
    public static ActivityBloodGlucose2Binding bind(@NonNull View rootView) {
        int i = R.id.bar_view;
        SegmentedBarView2 segmentedBarView2 = (SegmentedBarView2) ViewBindings.findChildViewById(rootView, R.id.bar_view);
        if (segmentedBarView2 != null) {
            i = R.id.btn_measure;
            PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.btn_measure);
            if (pFMedium != null) {
                i = R.id.btn_risk_level;
                PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.btn_risk_level);
                if (pFMedium2 != null) {
                    i = R.id.iv_risk_level;
                    ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_risk_level);
                    if (imageView != null) {
                        i = R.id.ll_diabetic_risk_insight;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_diabetic_risk_insight);
                        if (linearLayout != null) {
                            i = R.id.ll_no_measurement;
                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_no_measurement);
                            if (linearLayout2 != null) {
                                i = R.id.rv_risk_level;
                                RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.rv_risk_level);
                                if (recyclerView != null) {
                                    i = R.id.tv_diabetic_risk_insight;
                                    PFMedium pFMedium3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_diabetic_risk_insight);
                                    if (pFMedium3 != null) {
                                        i = R.id.tv_diabetic_risk_tips;
                                        PFMedium pFMedium4 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_diabetic_risk_tips);
                                        if (pFMedium4 != null) {
                                            i = R.id.tv_measure_date;
                                            PFMedium pFMedium5 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_measure_date);
                                            if (pFMedium5 != null) {
                                                i = R.id.tv_no_record;
                                                PFMedium pFMedium6 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_no_record);
                                                if (pFMedium6 != null) {
                                                    i = R.id.tv_risk_date;
                                                    PFMedium pFMedium7 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_risk_date);
                                                    if (pFMedium7 != null) {
                                                        i = R.id.tv_risk_range_date;
                                                        PFMedium pFMedium8 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_risk_range_date);
                                                        if (pFMedium8 != null) {
                                                            return new ActivityBloodGlucose2Binding((LinearLayout) rootView, segmentedBarView2, pFMedium, pFMedium2, imageView, linearLayout, linearLayout2, recyclerView, pFMedium3, pFMedium4, pFMedium5, pFMedium6, pFMedium7, pFMedium8);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityBloodGlucose2Binding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityBloodGlucose2Binding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_blood_glucose2, parent, false);
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
