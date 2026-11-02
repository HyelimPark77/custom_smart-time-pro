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
        int r0 = R.id.sbv_bmi;
        CircleThumbSegmentedBarView r4 = (CircleThumbSegmentedBarView) ViewBindings.findChildViewById(rootView, R.id.sbv_bmi);
        if (r4 == null) goto L17;
        r0 = R.id.tv_ai_analysis;
        TextView r5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_ai_analysis);
        if (r5 == null) goto L17;
        r0 = R.id.tv_ai_analysis_content;
        TextView r6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_ai_analysis_content);
        if (r6 == null) goto L17;
        r0 = R.id.tv_hr_zone;
        TextView r7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_hr_zone);
        if (r7 == null) goto L17;
        r0 = R.id.tv_weight;
        TextView r8 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_weight);
        if (r8 == null) goto L17;
        r0 = R.id.tv_weight_value;
        TextView r9 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_weight_value);
        if (r9 == null) goto L17;
        return new V2StatusItemWeightHeathBinding((ConstraintLayout) rootView, r4, r5, r6, r7, r8, r9);
    L17:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static V2StatusItemWeightHeathBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static V2StatusItemWeightHeathBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.v2_status_item_weight_heath, parent, false);
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
