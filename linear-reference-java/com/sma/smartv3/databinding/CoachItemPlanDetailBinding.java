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
        int r0 = R.id.iv_plan_detail_image;
        ImageView r4 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_plan_detail_image);
        if (r4 == null) goto L21;
        r0 = R.id.plan_cumulative_calories_tv;
        PFMedium r5 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.plan_cumulative_calories_tv);
        if (r5 == null) goto L21;
        r0 = R.id.plan_cumulative_exercise_time_tv;
        PFMedium r6 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.plan_cumulative_exercise_time_tv);
        if (r6 == null) goto L21;
        r0 = R.id.plan_cumulative_mets_tv;
        PFMedium r7 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.plan_cumulative_mets_tv);
        if (r7 == null) goto L21;
        r0 = R.id.plan_detail_arrow_iv;
        ImageView r8 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.plan_detail_arrow_iv);
        if (r8 == null) goto L21;
        r0 = R.id.plan_detail_completed_tv;
        PFMedium r9 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.plan_detail_completed_tv);
        if (r9 == null) goto L21;
        r0 = R.id.plan_detail_day_tv;
        PFMedium r10 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.plan_detail_day_tv);
        if (r10 == null) goto L21;
        r0 = R.id.plan_detail_progress;
        ProgressBar r11 = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.plan_detail_progress);
        if (r11 == null) goto L21;
        return new CoachItemPlanDetailBinding((LinearLayout) rootView, r4, r5, r6, r7, r8, r9, r10, r11);
    L21:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static CoachItemPlanDetailBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static CoachItemPlanDetailBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.coach_item_plan_detail, parent, false);
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
