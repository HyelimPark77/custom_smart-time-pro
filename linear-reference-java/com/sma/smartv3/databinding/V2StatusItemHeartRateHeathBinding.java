package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.segmentedbar.CircleThumbSegmentedBarView;
import com.sma.smartv3.view.segmentedbar.SegmentedBarView2;

/* JADX INFO: loaded from: classes19.dex */
public final class V2StatusItemHeartRateHeathBinding implements ViewBinding {

    @NonNull
    public final SegmentedBarView2 barView;

    @NonNull
    public final AppCompatImageView ivBad;

    @NonNull
    public final AppCompatImageView ivGeneral;

    @NonNull
    public final AppCompatImageView ivGood;

    @NonNull
    public final AppCompatImageView ivHighest;

    @NonNull
    public final LinearLayout llBarView;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final CircleThumbSegmentedBarView sbvBmi;

    @NonNull
    public final TextView tvAiAnalysis;

    @NonNull
    public final TextView tvAiAnalysisContent;

    @NonNull
    public final TextView tvAveValue;

    @NonNull
    public final TextView tvAvgBpmValue;

    @NonNull
    public final TextView tvBad;

    @NonNull
    public final TextView tvGeneral;

    @NonNull
    public final TextView tvGenerateReport;

    @NonNull
    public final TextView tvGood;

    @NonNull
    public final TextView tvHeartRate;

    @NonNull
    public final TextView tvHeartRateValue;

    @NonNull
    public final TextView tvHighest;

    @NonNull
    public final TextView tvHrZone;

    private V2StatusItemHeartRateHeathBinding(@NonNull ConstraintLayout rootView, @NonNull SegmentedBarView2 barView, @NonNull AppCompatImageView ivBad, @NonNull AppCompatImageView ivGeneral, @NonNull AppCompatImageView ivGood, @NonNull AppCompatImageView ivHighest, @NonNull LinearLayout llBarView, @NonNull CircleThumbSegmentedBarView sbvBmi, @NonNull TextView tvAiAnalysis, @NonNull TextView tvAiAnalysisContent, @NonNull TextView tvAveValue, @NonNull TextView tvAvgBpmValue, @NonNull TextView tvBad, @NonNull TextView tvGeneral, @NonNull TextView tvGenerateReport, @NonNull TextView tvGood, @NonNull TextView tvHeartRate, @NonNull TextView tvHeartRateValue, @NonNull TextView tvHighest, @NonNull TextView tvHrZone) {
        this.rootView = rootView;
        this.barView = barView;
        this.ivBad = ivBad;
        this.ivGeneral = ivGeneral;
        this.ivGood = ivGood;
        this.ivHighest = ivHighest;
        this.llBarView = llBarView;
        this.sbvBmi = sbvBmi;
        this.tvAiAnalysis = tvAiAnalysis;
        this.tvAiAnalysisContent = tvAiAnalysisContent;
        this.tvAveValue = tvAveValue;
        this.tvAvgBpmValue = tvAvgBpmValue;
        this.tvBad = tvBad;
        this.tvGeneral = tvGeneral;
        this.tvGenerateReport = tvGenerateReport;
        this.tvGood = tvGood;
        this.tvHeartRate = tvHeartRate;
        this.tvHeartRateValue = tvHeartRateValue;
        this.tvHighest = tvHighest;
        this.tvHrZone = tvHrZone;
    }

    @NonNull
    public static V2StatusItemHeartRateHeathBinding bind(@NonNull View rootView) {
        int r1 = R.id.bar_view;
        SegmentedBarView2 r5 = (SegmentedBarView2) ViewBindings.findChildViewById(rootView, R.id.bar_view);
        if (r5 == null) goto L43;
        r1 = R.id.iv_bad;
        AppCompatImageView r6 = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.iv_bad);
        if (r6 == null) goto L43;
        r1 = R.id.iv_general;
        AppCompatImageView r7 = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.iv_general);
        if (r7 == null) goto L43;
        r1 = R.id.iv_good;
        AppCompatImageView r8 = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.iv_good);
        if (r8 == null) goto L43;
        r1 = R.id.iv_highest;
        AppCompatImageView r9 = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.iv_highest);
        if (r9 == null) goto L43;
        r1 = R.id.ll_bar_view;
        LinearLayout r10 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_bar_view);
        if (r10 == null) goto L43;
        r1 = R.id.sbv_bmi;
        CircleThumbSegmentedBarView r11 = (CircleThumbSegmentedBarView) ViewBindings.findChildViewById(rootView, R.id.sbv_bmi);
        if (r11 == null) goto L43;
        r1 = R.id.tv_ai_analysis;
        TextView r12 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_ai_analysis);
        if (r12 == null) goto L43;
        r1 = R.id.tv_ai_analysis_content;
        TextView r13 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_ai_analysis_content);
        if (r13 == null) goto L43;
        r1 = R.id.tv_ave_value;
        TextView r14 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_ave_value);
        if (r14 == null) goto L43;
        r1 = R.id.tv_avg_bpm_value;
        TextView r15 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_avg_bpm_value);
        if (r15 == null) goto L43;
        r1 = R.id.tv_bad;
        TextView r16 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_bad);
        if (r16 == null) goto L43;
        r1 = R.id.tv_general;
        TextView r17 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_general);
        if (r17 == null) goto L43;
        r1 = R.id.tv_generate_report;
        TextView r18 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_generate_report);
        if (r18 == null) goto L43;
        r1 = R.id.tv_good;
        TextView r19 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_good);
        if (r19 == null) goto L43;
        r1 = R.id.tv_heart_rate;
        TextView r20 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_heart_rate);
        if (r20 == null) goto L43;
        r1 = R.id.tv_heart_rate_value;
        TextView r21 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_heart_rate_value);
        if (r21 == null) goto L43;
        r1 = R.id.tv_highest;
        TextView r22 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_highest);
        if (r22 == null) goto L43;
        r1 = R.id.tv_hr_zone;
        TextView r23 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_hr_zone);
        if (r23 == null) goto L43;
        return new V2StatusItemHeartRateHeathBinding((ConstraintLayout) rootView, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23);
    L43:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r1)));
    }

    @NonNull
    public static V2StatusItemHeartRateHeathBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static V2StatusItemHeartRateHeathBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.v2_status_item_heart_rate_heath, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
