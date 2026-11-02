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
        int i = R.id.bar_view;
        SegmentedBarView2 segmentedBarView2 = (SegmentedBarView2) ViewBindings.findChildViewById(rootView, R.id.bar_view);
        if (segmentedBarView2 != null) {
            i = R.id.iv_bad;
            AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.iv_bad);
            if (appCompatImageView != null) {
                i = R.id.iv_general;
                AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.iv_general);
                if (appCompatImageView2 != null) {
                    i = R.id.iv_good;
                    AppCompatImageView appCompatImageView3 = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.iv_good);
                    if (appCompatImageView3 != null) {
                        i = R.id.iv_highest;
                        AppCompatImageView appCompatImageView4 = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.iv_highest);
                        if (appCompatImageView4 != null) {
                            i = R.id.ll_bar_view;
                            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_bar_view);
                            if (linearLayout != null) {
                                i = R.id.sbv_bmi;
                                CircleThumbSegmentedBarView circleThumbSegmentedBarView = (CircleThumbSegmentedBarView) ViewBindings.findChildViewById(rootView, R.id.sbv_bmi);
                                if (circleThumbSegmentedBarView != null) {
                                    i = R.id.tv_ai_analysis;
                                    TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_ai_analysis);
                                    if (textView != null) {
                                        i = R.id.tv_ai_analysis_content;
                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_ai_analysis_content);
                                        if (textView2 != null) {
                                            i = R.id.tv_ave_value;
                                            TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_ave_value);
                                            if (textView3 != null) {
                                                i = R.id.tv_avg_bpm_value;
                                                TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_avg_bpm_value);
                                                if (textView4 != null) {
                                                    i = R.id.tv_bad;
                                                    TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_bad);
                                                    if (textView5 != null) {
                                                        i = R.id.tv_general;
                                                        TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_general);
                                                        if (textView6 != null) {
                                                            i = R.id.tv_generate_report;
                                                            TextView textView7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_generate_report);
                                                            if (textView7 != null) {
                                                                i = R.id.tv_good;
                                                                TextView textView8 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_good);
                                                                if (textView8 != null) {
                                                                    i = R.id.tv_heart_rate;
                                                                    TextView textView9 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_heart_rate);
                                                                    if (textView9 != null) {
                                                                        i = R.id.tv_heart_rate_value;
                                                                        TextView textView10 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_heart_rate_value);
                                                                        if (textView10 != null) {
                                                                            i = R.id.tv_highest;
                                                                            TextView textView11 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_highest);
                                                                            if (textView11 != null) {
                                                                                i = R.id.tv_hr_zone;
                                                                                TextView textView12 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_hr_zone);
                                                                                if (textView12 != null) {
                                                                                    return new V2StatusItemHeartRateHeathBinding((ConstraintLayout) rootView, segmentedBarView2, appCompatImageView, appCompatImageView2, appCompatImageView3, appCompatImageView4, linearLayout, circleThumbSegmentedBarView, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12);
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
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static V2StatusItemHeartRateHeathBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static V2StatusItemHeartRateHeathBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.v2_status_item_heart_rate_heath, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
