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
public final class ItemPopMultiPlanGoalBinding implements ViewBinding {

    @NonNull
    public final View itemLineView;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final PFMedium tvTime;

    @NonNull
    public final PFMedium tvValue;

    private ItemPopMultiPlanGoalBinding(@NonNull LinearLayout rootView, @NonNull View itemLineView, @NonNull PFMedium tvTime, @NonNull PFMedium tvValue) {
        this.rootView = rootView;
        this.itemLineView = itemLineView;
        this.tvTime = tvTime;
        this.tvValue = tvValue;
    }

    @NonNull
    public static ItemPopMultiPlanGoalBinding bind(@NonNull View rootView) {
        int i = R.id.item_line_view;
        View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.item_line_view);
        if (viewFindChildViewById != null) {
            i = R.id.tv_time;
            PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_time);
            if (pFMedium != null) {
                i = R.id.tv_value;
                PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_value);
                if (pFMedium2 != null) {
                    return new ItemPopMultiPlanGoalBinding((LinearLayout) rootView, viewFindChildViewById, pFMedium, pFMedium2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ItemPopMultiPlanGoalBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ItemPopMultiPlanGoalBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.item_pop_multi_plan_goal, parent, false);
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
