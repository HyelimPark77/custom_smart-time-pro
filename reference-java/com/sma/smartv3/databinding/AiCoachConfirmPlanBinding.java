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

    /* JADX INFO: renamed from: rv */
    @NonNull
    public final RecyclerView f51007rv;

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
        this.f51007rv = rv;
    }

    @NonNull
    public static AiCoachConfirmPlanBinding bind(@NonNull View rootView) {
        int i = R.id.coach_confirm_plan;
        Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.coach_confirm_plan);
        if (button != null) {
            i = R.id.coach_modify_plan;
            Button button2 = (Button) ViewBindings.findChildViewById(rootView, R.id.coach_modify_plan);
            if (button2 != null) {
                i = R.id.confirm_plan_ll_img;
                ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.confirm_plan_ll_img);
                if (imageView != null) {
                    i = R.id.create_plan_btn_layout;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.create_plan_btn_layout);
                    if (linearLayout != null) {
                        i = R.id.create_plan_confirm_layout;
                        RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.create_plan_confirm_layout);
                        if (relativeLayout != null) {
                            i = R.id.create_plan_loading_layout;
                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.create_plan_loading_layout);
                            if (linearLayout2 != null) {
                                i = R.id.create_plan_title;
                                View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.create_plan_title);
                                if (viewFindChildViewById != null) {
                                    LayoutTitleIvTvIvBinding layoutTitleIvTvIvBindingBind = LayoutTitleIvTvIvBinding.bind(viewFindChildViewById);
                                    RelativeLayout relativeLayout2 = (RelativeLayout) rootView;
                                    i = R.id.f51422rv;
                                    RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.f51422rv);
                                    if (recyclerView != null) {
                                        return new AiCoachConfirmPlanBinding(relativeLayout2, button, button2, imageView, linearLayout, relativeLayout, linearLayout2, layoutTitleIvTvIvBindingBind, relativeLayout2, recyclerView);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static AiCoachConfirmPlanBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static AiCoachConfirmPlanBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.ai_coach_confirm_plan, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView_;
    }
}
