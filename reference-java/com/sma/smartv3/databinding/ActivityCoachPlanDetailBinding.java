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
        LinearLayout linearLayout = (LinearLayout) rootView;
        int i = R.id.plan_detail_recycler;
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.plan_detail_recycler);
        if (recyclerView != null) {
            i = R.id.plan_detail_title;
            PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.plan_detail_title);
            if (pFMedium != null) {
                i = R.id.plan_detail_value;
                PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.plan_detail_value);
                if (pFMedium2 != null) {
                    return new ActivityCoachPlanDetailBinding(linearLayout, linearLayout, recyclerView, pFMedium, pFMedium2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityCoachPlanDetailBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityCoachPlanDetailBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_coach_plan_detail, parent, false);
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
