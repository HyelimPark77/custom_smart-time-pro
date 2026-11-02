package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class CoachItemPlanDetailBinding implements ViewBinding {

    @NonNull
    public final ImageView ivPlanDetailImage;

    @NonNull
    public final PFMedium planCumulativeCaloriesTv;

    @NonNull
    public final PFMedium planCumulativeExerciseTimeTv;

    @NonNull
    public final PFMedium planCumulativeMetsTv;

    @NonNull
    public final ImageView planDetailArrowIv;

    @NonNull
    public final PFMedium planDetailCompletedTv;

    @NonNull
    public final PFMedium planDetailDayTv;

    @NonNull
    public final ProgressBar planDetailProgress;

    @NonNull
    private final LinearLayout rootView;

    private CoachItemPlanDetailBinding(@NonNull LinearLayout rootView, @NonNull ImageView ivPlanDetailImage, @NonNull PFMedium planCumulativeCaloriesTv, @NonNull PFMedium planCumulativeExerciseTimeTv, @NonNull PFMedium planCumulativeMetsTv, @NonNull ImageView planDetailArrowIv, @NonNull PFMedium planDetailCompletedTv, @NonNull PFMedium planDetailDayTv, @NonNull ProgressBar planDetailProgress) {
        this.rootView = rootView;
        this.ivPlanDetailImage = ivPlanDetailImage;
        this.planCumulativeCaloriesTv = planCumulativeCaloriesTv;
        this.planCumulativeExerciseTimeTv = planCumulativeExerciseTimeTv;
        this.planCumulativeMetsTv = planCumulativeMetsTv;
        this.planDetailArrowIv = planDetailArrowIv;
        this.planDetailCompletedTv = planDetailCompletedTv;
        this.planDetailDayTv = planDetailDayTv;
        this.planDetailProgress = planDetailProgress;
    }

    @NonNull
    public static CoachItemPlanDetailBinding bind(@NonNull View rootView) {
        int i = R.id.iv_plan_detail_image;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_plan_detail_image);
        if (imageView != null) {
            i = R.id.plan_cumulative_calories_tv;
            PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.plan_cumulative_calories_tv);
            if (pFMedium != null) {
                i = R.id.plan_cumulative_exercise_time_tv;
                PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.plan_cumulative_exercise_time_tv);
                if (pFMedium2 != null) {
                    i = R.id.plan_cumulative_mets_tv;
                    PFMedium pFMedium3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.plan_cumulative_mets_tv);
                    if (pFMedium3 != null) {
                        i = R.id.plan_detail_arrow_iv;
                        ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.plan_detail_arrow_iv);
                        if (imageView2 != null) {
                            i = R.id.plan_detail_completed_tv;
                            PFMedium pFMedium4 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.plan_detail_completed_tv);
                            if (pFMedium4 != null) {
                                i = R.id.plan_detail_day_tv;
                                PFMedium pFMedium5 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.plan_detail_day_tv);
                                if (pFMedium5 != null) {
                                    i = R.id.plan_detail_progress;
                                    ProgressBar progressBar = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.plan_detail_progress);
                                    if (progressBar != null) {
                                        return new CoachItemPlanDetailBinding((LinearLayout) rootView, imageView, pFMedium, pFMedium2, pFMedium3, imageView2, pFMedium4, pFMedium5, progressBar);
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
    public static CoachItemPlanDetailBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static CoachItemPlanDetailBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.coach_item_plan_detail, parent, false);
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
