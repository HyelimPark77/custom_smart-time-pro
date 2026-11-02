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
        int r0 = R.id.popup_make_plans_again;
        PFMedium r1 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.popup_make_plans_again);
        if (r1 == null) goto L11;
        r0 = R.id.popup_switch_ai_model_view;
        View r2 = ViewBindings.findChildViewById(rootView, R.id.popup_switch_ai_model_view);
        if (r2 == null) goto L11;
        r0 = R.id.popup_terminate_plan;
        PFMedium r3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.popup_terminate_plan);
        if (r3 == null) goto L11;
        return new PopupPlanLayoutBinding((LinearLayout) rootView, r1, r2, r3);
    L11:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static PopupPlanLayoutBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static PopupPlanLayoutBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.popup_plan_layout, parent, false);
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
