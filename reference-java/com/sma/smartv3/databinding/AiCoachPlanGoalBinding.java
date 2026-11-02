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

/* JADX INFO: loaded from: classes19.dex */
public final class AiCoachPlanGoalBinding implements ViewBinding {

    @NonNull
    public final RecyclerView llChoices;

    @NonNull
    public final LinearLayout rootView;

    @NonNull
    private final LinearLayout rootView_;

    private AiCoachPlanGoalBinding(@NonNull LinearLayout rootView_, @NonNull RecyclerView llChoices, @NonNull LinearLayout rootView) {
        this.rootView_ = rootView_;
        this.llChoices = llChoices;
        this.rootView = rootView;
    }

    @NonNull
    public static AiCoachPlanGoalBinding bind(@NonNull View rootView) {
        RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.ll_choices);
        if (recyclerView == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(R.id.ll_choices)));
        }
        LinearLayout linearLayout = (LinearLayout) rootView;
        return new AiCoachPlanGoalBinding(linearLayout, recyclerView, linearLayout);
    }

    @NonNull
    public static AiCoachPlanGoalBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static AiCoachPlanGoalBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.ai_coach_plan_goal, parent, false);
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
