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
public final class PopupPlanLayoutBinding implements ViewBinding {

    @NonNull
    public final PFMedium popupMakePlansAgain;

    @NonNull
    public final View popupSwitchAiModelView;

    @NonNull
    public final PFMedium popupTerminatePlan;

    @NonNull
    private final LinearLayout rootView;

    private PopupPlanLayoutBinding(@NonNull LinearLayout rootView, @NonNull PFMedium popupMakePlansAgain, @NonNull View popupSwitchAiModelView, @NonNull PFMedium popupTerminatePlan) {
        this.rootView = rootView;
        this.popupMakePlansAgain = popupMakePlansAgain;
        this.popupSwitchAiModelView = popupSwitchAiModelView;
        this.popupTerminatePlan = popupTerminatePlan;
    }

    @NonNull
    public static PopupPlanLayoutBinding bind(@NonNull View rootView) {
        int i = R.id.popup_make_plans_again;
        PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.popup_make_plans_again);
        if (pFMedium != null) {
            i = R.id.popup_switch_ai_model_view;
            View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.popup_switch_ai_model_view);
            if (viewFindChildViewById != null) {
                i = R.id.popup_terminate_plan;
                PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.popup_terminate_plan);
                if (pFMedium2 != null) {
                    return new PopupPlanLayoutBinding((LinearLayout) rootView, pFMedium, viewFindChildViewById, pFMedium2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static PopupPlanLayoutBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static PopupPlanLayoutBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.popup_plan_layout, parent, false);
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
