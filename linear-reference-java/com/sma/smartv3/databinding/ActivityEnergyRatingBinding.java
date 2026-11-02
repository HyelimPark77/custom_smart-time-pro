package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.github.mikephil.charting.charts.LineChart;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.AloneProgressBar;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityEnergyRatingBinding implements ViewBinding {

    @NonNull
    public final AloneProgressBar energyRatingAloneBar;

    @NonNull
    public final PFMedium energyScoreEvaluation;

    @NonNull
    public final PFMedium energyScoreEvaluationTip;

    @NonNull
    public final PFMedium energyScoreTodaySuggestions;

    @NonNull
    public final PFMedium energyScoreValue;

    @NonNull
    public final LineChart lineChart;

    @NonNull
    public final ScrollView rootView;

    @NonNull
    private final LinearLayout rootView_;

    private ActivityEnergyRatingBinding(@NonNull LinearLayout rootView_, @NonNull AloneProgressBar energyRatingAloneBar, @NonNull PFMedium energyScoreEvaluation, @NonNull PFMedium energyScoreEvaluationTip, @NonNull PFMedium energyScoreTodaySuggestions, @NonNull PFMedium energyScoreValue, @NonNull LineChart lineChart, @NonNull ScrollView rootView) {
        this.rootView_ = rootView_;
        this.energyRatingAloneBar = energyRatingAloneBar;
        this.energyScoreEvaluation = energyScoreEvaluation;
        this.energyScoreEvaluationTip = energyScoreEvaluationTip;
        this.energyScoreTodaySuggestions = energyScoreTodaySuggestions;
        this.energyScoreValue = energyScoreValue;
        this.lineChart = lineChart;
        this.rootView = rootView;
    }

    @NonNull
    public static ActivityEnergyRatingBinding bind(@NonNull View rootView) {
        int r0 = R.id.energy_rating_alone_bar;
        AloneProgressBar r4 = (AloneProgressBar) ViewBindings.findChildViewById(rootView, R.id.energy_rating_alone_bar);
        if (r4 == null) goto L19;
        r0 = R.id.energy_score_evaluation;
        PFMedium r5 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.energy_score_evaluation);
        if (r5 == null) goto L19;
        r0 = R.id.energy_score_evaluation_tip;
        PFMedium r6 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.energy_score_evaluation_tip);
        if (r6 == null) goto L19;
        r0 = R.id.energy_score_today_suggestions;
        PFMedium r7 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.energy_score_today_suggestions);
        if (r7 == null) goto L19;
        r0 = R.id.energy_score_value;
        PFMedium r8 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.energy_score_value);
        if (r8 == null) goto L19;
        r0 = R.id.lineChart;
        LineChart r9 = (LineChart) ViewBindings.findChildViewById(rootView, R.id.lineChart);
        if (r9 == null) goto L19;
        r0 = R.id.rootView;
        ScrollView r10 = (ScrollView) ViewBindings.findChildViewById(rootView, R.id.rootView);
        if (r10 == null) goto L19;
        return new ActivityEnergyRatingBinding((LinearLayout) rootView, r4, r5, r6, r7, r8, r9, r10);
    L19:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivityEnergyRatingBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityEnergyRatingBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_energy_rating, parent, false);
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
