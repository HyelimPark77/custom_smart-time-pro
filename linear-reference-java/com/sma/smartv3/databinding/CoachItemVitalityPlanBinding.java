package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class CoachItemVitalityPlanBinding implements ViewBinding {

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final PFMedium vitalityPlanDaysTv;

    @NonNull
    public final PFMedium vitalityPlanGoalTv;

    @NonNull
    public final PFMedium vitalityPlanWeekTv;

    private CoachItemVitalityPlanBinding(@NonNull LinearLayout rootView, @NonNull PFMedium vitalityPlanDaysTv, @NonNull PFMedium vitalityPlanGoalTv, @NonNull PFMedium vitalityPlanWeekTv) {
        this.rootView = rootView;
        this.vitalityPlanDaysTv = vitalityPlanDaysTv;
        this.vitalityPlanGoalTv = vitalityPlanGoalTv;
        this.vitalityPlanWeekTv = vitalityPlanWeekTv;
    }

    @NonNull
    public static CoachItemVitalityPlanBinding bind(@NonNull View rootView) {
        int r0 = R.id.vitality_plan_days_tv;
        PFMedium r1 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.vitality_plan_days_tv);
        if (r1 == null) goto L11;
        r0 = R.id.vitality_plan_goal_tv;
        PFMedium r2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.vitality_plan_goal_tv);
        if (r2 == null) goto L11;
        r0 = R.id.vitality_plan_week_tv;
        PFMedium r3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.vitality_plan_week_tv);
        if (r3 == null) goto L11;
        return new CoachItemVitalityPlanBinding((LinearLayout) rootView, r1, r2, r3);
    L11:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static CoachItemVitalityPlanBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static CoachItemVitalityPlanBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.coach_item_vitality_plan, parent, false);
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
