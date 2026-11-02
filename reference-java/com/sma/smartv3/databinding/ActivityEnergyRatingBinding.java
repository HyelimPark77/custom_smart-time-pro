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
        int i = R.id.energy_rating_alone_bar;
        AloneProgressBar aloneProgressBar = (AloneProgressBar) ViewBindings.findChildViewById(rootView, R.id.energy_rating_alone_bar);
        if (aloneProgressBar != null) {
            i = R.id.energy_score_evaluation;
            PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.energy_score_evaluation);
            if (pFMedium != null) {
                i = R.id.energy_score_evaluation_tip;
                PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.energy_score_evaluation_tip);
                if (pFMedium2 != null) {
                    i = R.id.energy_score_today_suggestions;
                    PFMedium pFMedium3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.energy_score_today_suggestions);
                    if (pFMedium3 != null) {
                        i = R.id.energy_score_value;
                        PFMedium pFMedium4 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.energy_score_value);
                        if (pFMedium4 != null) {
                            i = R.id.lineChart;
                            LineChart lineChart = (LineChart) ViewBindings.findChildViewById(rootView, R.id.lineChart);
                            if (lineChart != null) {
                                i = R.id.rootView;
                                ScrollView scrollView = (ScrollView) ViewBindings.findChildViewById(rootView, R.id.rootView);
                                if (scrollView != null) {
                                    return new ActivityEnergyRatingBinding((LinearLayout) rootView, aloneProgressBar, pFMedium, pFMedium2, pFMedium3, pFMedium4, lineChart, scrollView);
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
    public static ActivityEnergyRatingBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityEnergyRatingBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_energy_rating, parent, false);
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
