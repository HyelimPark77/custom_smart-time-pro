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
        int r1 = R.id.bar_view;
        SegmentedBarView2 r5 = (SegmentedBarView2) ViewBindings.findChildViewById(rootView, R.id.bar_view);
        if (r5 == null) goto L31;
        r1 = R.id.btn_measure;
        PFMedium r6 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.btn_measure);
        if (r6 == null) goto L31;
        r1 = R.id.btn_risk_level;
        PFMedium r7 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.btn_risk_level);
        if (r7 == null) goto L31;
        r1 = R.id.iv_risk_level;
        ImageView r8 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_risk_level);
        if (r8 == null) goto L31;
        r1 = R.id.ll_diabetic_risk_insight;
        LinearLayout r9 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_diabetic_risk_insight);
        if (r9 == null) goto L31;
        r1 = R.id.ll_no_measurement;
        LinearLayout r10 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_no_measurement);
        if (r10 == null) goto L31;
        r1 = R.id.rv_risk_level;
        RecyclerView r11 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.rv_risk_level);
        if (r11 == null) goto L31;
        r1 = R.id.tv_diabetic_risk_insight;
        PFMedium r12 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_diabetic_risk_insight);
        if (r12 == null) goto L31;
        r1 = R.id.tv_diabetic_risk_tips;
        PFMedium r13 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_diabetic_risk_tips);
        if (r13 == null) goto L31;
        r1 = R.id.tv_measure_date;
        PFMedium r14 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_measure_date);
        if (r14 == null) goto L31;
        r1 = R.id.tv_no_record;
        PFMedium r15 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_no_record);
        if (r15 == null) goto L31;
        r1 = R.id.tv_risk_date;
        PFMedium r16 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_risk_date);
        if (r16 == null) goto L31;
        r1 = R.id.tv_risk_range_date;
        PFMedium r17 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_risk_range_date);
        if (r17 == null) goto L31;
        return new ActivityBloodGlucose2Binding((LinearLayout) rootView, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17);
    L31:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r1)));
    }

    @NonNull
    public static ActivityBloodGlucose2Binding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityBloodGlucose2Binding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_blood_glucose2, parent, false);
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
