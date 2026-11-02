package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityCoachPlanDetailBinding implements ViewBinding {

    @NonNull
    public final LinearLayout background;

    @NonNull
    public final RecyclerView planDetailRecycler;

    @NonNull
    public final PFMedium planDetailTitle;

    @NonNull
    public final PFMedium planDetailValue;

    @NonNull
    private final LinearLayout rootView;

    private ActivityCoachPlanDetailBinding(@NonNull LinearLayout rootView, @NonNull LinearLayout background, @NonNull RecyclerView planDetailRecycler, @NonNull PFMedium planDetailTitle, @NonNull PFMedium planDetailValue) {
        this.rootView = rootView;
        this.background = background;
        this.planDetailRecycler = planDetailRecycler;
        this.planDetailTitle = planDetailTitle;
        this.planDetailValue = planDetailValue;
    }

    @NonNull
    public static ActivityCoachPlanDetailBinding bind(@NonNull View rootView) {
        LinearLayout r1 = (LinearLayout) rootView;
        int r0 = R.id.plan_detail_recycler;
        RecyclerView r3 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.plan_detail_recycler);
        if (r3 == null) goto L11;
        r0 = R.id.plan_detail_title;
        PFMedium r4 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.plan_detail_title);
        if (r4 == null) goto L11;
        r0 = R.id.plan_detail_value;
        PFMedium r5 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.plan_detail_value);
        if (r5 == null) goto L11;
        return new ActivityCoachPlanDetailBinding(r1, r1, r3, r4, r5);
    L11:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivityCoachPlanDetailBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityCoachPlanDetailBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_coach_plan_detail, parent, false);
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
