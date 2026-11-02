package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class AiCoachConfirmPlanBinding implements ViewBinding {

    @NonNull
    public final Button coachConfirmPlan;

    @NonNull
    public final Button coachModifyPlan;

    @NonNull
    public final ImageView confirmPlanLlImg;

    @NonNull
    public final LinearLayout createPlanBtnLayout;

    @NonNull
    public final RelativeLayout createPlanConfirmLayout;

    @NonNull
    public final LinearLayout createPlanLoadingLayout;

    @NonNull
    public final LayoutTitleIvTvIvBinding createPlanTitle;

    @NonNull
    public final RelativeLayout rootView;

    @NonNull
    private final RelativeLayout rootView_;

    @NonNull
    public final RecyclerView rv;

    private AiCoachConfirmPlanBinding(@NonNull RelativeLayout rootView_, @NonNull Button coachConfirmPlan, @NonNull Button coachModifyPlan, @NonNull ImageView confirmPlanLlImg, @NonNull LinearLayout createPlanBtnLayout, @NonNull RelativeLayout createPlanConfirmLayout, @NonNull LinearLayout createPlanLoadingLayout, @NonNull LayoutTitleIvTvIvBinding createPlanTitle, @NonNull RelativeLayout rootView, @NonNull RecyclerView rv) {
        this.rootView_ = rootView_;
        this.coachConfirmPlan = coachConfirmPlan;
        this.coachModifyPlan = coachModifyPlan;
        this.confirmPlanLlImg = confirmPlanLlImg;
        this.createPlanBtnLayout = createPlanBtnLayout;
        this.createPlanConfirmLayout = createPlanConfirmLayout;
        this.createPlanLoadingLayout = createPlanLoadingLayout;
        this.createPlanTitle = createPlanTitle;
        this.rootView = rootView;
        this.rv = rv;
    }

    @NonNull
    public static AiCoachConfirmPlanBinding bind(@NonNull View rootView) {
        int r0 = R.id.coach_confirm_plan;
        Button r4 = (Button) ViewBindings.findChildViewById(rootView, R.id.coach_confirm_plan);
        if (r4 == null) goto L21;
        r0 = R.id.coach_modify_plan;
        Button r5 = (Button) ViewBindings.findChildViewById(rootView, R.id.coach_modify_plan);
        if (r5 == null) goto L21;
        r0 = R.id.confirm_plan_ll_img;
        ImageView r6 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.confirm_plan_ll_img);
        if (r6 == null) goto L21;
        r0 = R.id.create_plan_btn_layout;
        LinearLayout r7 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.create_plan_btn_layout);
        if (r7 == null) goto L21;
        r0 = R.id.create_plan_confirm_layout;
        RelativeLayout r8 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.create_plan_confirm_layout);
        if (r8 == null) goto L21;
        r0 = R.id.create_plan_loading_layout;
        LinearLayout r9 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.create_plan_loading_layout);
        if (r9 == null) goto L21;
        r0 = R.id.create_plan_title;
        View r1 = ViewBindings.findChildViewById(rootView, R.id.create_plan_title);
        if (r1 == null) goto L21;
        LayoutTitleIvTvIvBinding r10 = LayoutTitleIvTvIvBinding.bind(r1);
        RelativeLayout r3 = (RelativeLayout) rootView;
        r0 = R.id.rv;
        RecyclerView r12 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.rv);
        if (r12 == null) goto L21;
        return new AiCoachConfirmPlanBinding(r3, r4, r5, r6, r7, r8, r9, r10, r3, r12);
    L21:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static AiCoachConfirmPlanBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static AiCoachConfirmPlanBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.ai_coach_confirm_plan, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView_;
    }
}
