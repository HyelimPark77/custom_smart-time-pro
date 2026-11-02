package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.segmentedbar.CircleThumbSegmentedBarView;

/* JADX INFO: loaded from: classes19.dex */
public final class V2StatusItemWeightHeathBinding implements ViewBinding {

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final CircleThumbSegmentedBarView sbvBmi;

    @NonNull
    public final TextView tvAiAnalysis;

    @NonNull
    public final TextView tvAiAnalysisContent;

    @NonNull
    public final TextView tvHrZone;

    @NonNull
    public final TextView tvWeight;

    @NonNull
    public final TextView tvWeightValue;

    private V2StatusItemWeightHeathBinding(@NonNull ConstraintLayout rootView, @NonNull CircleThumbSegmentedBarView sbvBmi, @NonNull TextView tvAiAnalysis, @NonNull TextView tvAiAnalysisContent, @NonNull TextView tvHrZone, @NonNull TextView tvWeight, @NonNull TextView tvWeightValue) {
        this.rootView = rootView;
        this.sbvBmi = sbvBmi;
        this.tvAiAnalysis = tvAiAnalysis;
        this.tvAiAnalysisContent = tvAiAnalysisContent;
        this.tvHrZone = tvHrZone;
        this.tvWeight = tvWeight;
        this.tvWeightValue = tvWeightValue;
    }

    @NonNull
    public static V2StatusItemWeightHeathBinding bind(@NonNull View rootView) {
        int i = R.id.sbv_bmi;
        CircleThumbSegmentedBarView circleThumbSegmentedBarView = (CircleThumbSegmentedBarView) ViewBindings.findChildViewById(rootView, R.id.sbv_bmi);
        if (circleThumbSegmentedBarView != null) {
            i = R.id.tv_ai_analysis;
            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_ai_analysis);
            if (textView != null) {
                i = R.id.tv_ai_analysis_content;
                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_ai_analysis_content);
                if (textView2 != null) {
                    i = R.id.tv_hr_zone;
                    TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_hr_zone);
                    if (textView3 != null) {
                        i = R.id.tv_weight;
                        TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_weight);
                        if (textView4 != null) {
                            i = R.id.tv_weight_value;
                            TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_weight_value);
                            if (textView5 != null) {
                                return new V2StatusItemWeightHeathBinding((ConstraintLayout) rootView, circleThumbSegmentedBarView, textView, textView2, textView3, textView4, textView5);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static V2StatusItemWeightHeathBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static V2StatusItemWeightHeathBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.v2_status_item_weight_heath, parent, false);
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
