package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.github.mikephil.charting.charts.BarChart;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.DINCondBold;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class FragmentStatusDayV2Binding implements ViewBinding {

    @NonNull
    public final BarChart barChart;

    @NonNull
    public final ImageButton beforeTime;

    @NonNull
    public final LinearLayout dataContent;

    @NonNull
    public final ImageView image;

    @NonNull
    public final RelativeLayout loading;

    @NonNull
    public final ImageButton nextTime;

    @NonNull
    public final PFMedium nowTime;

    @NonNull
    public final DINCondBold nowTimeDetails;

    @NonNull
    public final DINCondBold nowValue;

    @NonNull
    public final PFMedium oneTV;

    @NonNull
    public final PFMedium oneUnit;

    @NonNull
    public final DINCondBold oneValue;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final NestedScrollView scrollView;

    @NonNull
    public final DINCondBold stepV2CaloriesValue;

    @NonNull
    public final DINCondBold stepV2CaloriesValue2;

    @NonNull
    public final DINCondBold stepV2DistanceValue;

    @NonNull
    public final DINCondBold stepV2DistanceValue2;

    @NonNull
    public final ProgressBar stepV2GoalPbProgress;

    @NonNull
    public final PFMedium stepV2GoalTip;

    @NonNull
    public final PFMedium stepV2GoalValue;

    @NonNull
    public final LinearLayout stepV2SetGoal;

    @NonNull
    public final PFMedium twoTV;

    @NonNull
    public final PFMedium twoUnit;

    @NonNull
    public final DINCondBold twoValue;

    @NonNull
    public final PFMedium valueUnit;

    private FragmentStatusDayV2Binding(@NonNull LinearLayout rootView, @NonNull BarChart barChart, @NonNull ImageButton beforeTime, @NonNull LinearLayout dataContent, @NonNull ImageView image, @NonNull RelativeLayout loading, @NonNull ImageButton nextTime, @NonNull PFMedium nowTime, @NonNull DINCondBold nowTimeDetails, @NonNull DINCondBold nowValue, @NonNull PFMedium oneTV, @NonNull PFMedium oneUnit, @NonNull DINCondBold oneValue, @NonNull NestedScrollView scrollView, @NonNull DINCondBold stepV2CaloriesValue, @NonNull DINCondBold stepV2CaloriesValue2, @NonNull DINCondBold stepV2DistanceValue, @NonNull DINCondBold stepV2DistanceValue2, @NonNull ProgressBar stepV2GoalPbProgress, @NonNull PFMedium stepV2GoalTip, @NonNull PFMedium stepV2GoalValue, @NonNull LinearLayout stepV2SetGoal, @NonNull PFMedium twoTV, @NonNull PFMedium twoUnit, @NonNull DINCondBold twoValue, @NonNull PFMedium valueUnit) {
        this.rootView = rootView;
        this.barChart = barChart;
        this.beforeTime = beforeTime;
        this.dataContent = dataContent;
        this.image = image;
        this.loading = loading;
        this.nextTime = nextTime;
        this.nowTime = nowTime;
        this.nowTimeDetails = nowTimeDetails;
        this.nowValue = nowValue;
        this.oneTV = oneTV;
        this.oneUnit = oneUnit;
        this.oneValue = oneValue;
        this.scrollView = scrollView;
        this.stepV2CaloriesValue = stepV2CaloriesValue;
        this.stepV2CaloriesValue2 = stepV2CaloriesValue2;
        this.stepV2DistanceValue = stepV2DistanceValue;
        this.stepV2DistanceValue2 = stepV2DistanceValue2;
        this.stepV2GoalPbProgress = stepV2GoalPbProgress;
        this.stepV2GoalTip = stepV2GoalTip;
        this.stepV2GoalValue = stepV2GoalValue;
        this.stepV2SetGoal = stepV2SetGoal;
        this.twoTV = twoTV;
        this.twoUnit = twoUnit;
        this.twoValue = twoValue;
        this.valueUnit = valueUnit;
    }

    @NonNull
    public static FragmentStatusDayV2Binding bind(@NonNull View rootView) {
        int r1 = R.id.barChart;
        BarChart r5 = (BarChart) ViewBindings.findChildViewById(rootView, R.id.barChart);
        if (r5 == null) goto L55;
        r1 = R.id.beforeTime;
        ImageButton r6 = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.beforeTime);
        if (r6 == null) goto L55;
        r1 = R.id.dataContent;
        LinearLayout r7 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.dataContent);
        if (r7 == null) goto L55;
        r1 = R.id.image;
        ImageView r8 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.image);
        if (r8 == null) goto L55;
        r1 = R.id.loading;
        RelativeLayout r9 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.loading);
        if (r9 == null) goto L55;
        r1 = R.id.nextTime;
        ImageButton r10 = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.nextTime);
        if (r10 == null) goto L55;
        r1 = R.id.nowTime;
        PFMedium r11 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.nowTime);
        if (r11 == null) goto L55;
        r1 = R.id.nowTimeDetails;
        DINCondBold r12 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.nowTimeDetails);
        if (r12 == null) goto L55;
        r1 = R.id.nowValue;
        DINCondBold r13 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.nowValue);
        if (r13 == null) goto L55;
        r1 = R.id.oneTV;
        PFMedium r14 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.oneTV);
        if (r14 == null) goto L55;
        r1 = R.id.oneUnit;
        PFMedium r15 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.oneUnit);
        if (r15 == null) goto L55;
        r1 = R.id.oneValue;
        DINCondBold r16 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.oneValue);
        if (r16 == null) goto L55;
        r1 = R.id.scrollView;
        NestedScrollView r17 = (NestedScrollView) ViewBindings.findChildViewById(rootView, R.id.scrollView);
        if (r17 == null) goto L55;
        r1 = R.id.step_v2_calories_value;
        DINCondBold r18 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.step_v2_calories_value);
        if (r18 == null) goto L55;
        r1 = R.id.step_v2_calories_value2;
        DINCondBold r19 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.step_v2_calories_value2);
        if (r19 == null) goto L55;
        r1 = R.id.step_v2_distance_value;
        DINCondBold r20 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.step_v2_distance_value);
        if (r20 == null) goto L55;
        r1 = R.id.step_v2_distance_value2;
        DINCondBold r21 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.step_v2_distance_value2);
        if (r21 == null) goto L55;
        r1 = R.id.step_v2_goal_pb_progress;
        ProgressBar r22 = (ProgressBar) ViewBindings.findChildViewById(rootView, R.id.step_v2_goal_pb_progress);
        if (r22 == null) goto L55;
        r1 = R.id.step_v2_goal_tip;
        PFMedium r23 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.step_v2_goal_tip);
        if (r23 == null) goto L55;
        r1 = R.id.step_v2_goal_value;
        PFMedium r24 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.step_v2_goal_value);
        if (r24 == null) goto L55;
        r1 = R.id.step_v2_set_goal;
        LinearLayout r25 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.step_v2_set_goal);
        if (r25 == null) goto L55;
        r1 = R.id.twoTV;
        PFMedium r26 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.twoTV);
        if (r26 == null) goto L55;
        r1 = R.id.twoUnit;
        PFMedium r27 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.twoUnit);
        if (r27 == null) goto L55;
        r1 = R.id.twoValue;
        DINCondBold r28 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.twoValue);
        if (r28 == null) goto L55;
        r1 = R.id.valueUnit;
        PFMedium r29 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.valueUnit);
        if (r29 == null) goto L55;
        return new FragmentStatusDayV2Binding((LinearLayout) rootView, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29);
    L55:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r1)));
    }

    @NonNull
    public static FragmentStatusDayV2Binding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static FragmentStatusDayV2Binding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.fragment_status_day_v2, parent, false);
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
