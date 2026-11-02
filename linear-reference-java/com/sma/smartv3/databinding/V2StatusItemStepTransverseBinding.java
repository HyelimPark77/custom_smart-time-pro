package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.Goal2ProgressBar;
import com.sma.smartv3.view.MarqueeTextView;
import com.sma.smartv3.view.text.MHFont;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class V2StatusItemStepTransverseBinding implements ViewBinding {

    @NonNull
    public final PFMedium distanceUnit;

    @NonNull
    public final ImageView ivRight;

    @NonNull
    public final ImageView ivWeather;

    @NonNull
    public final LinearLayout llCalories;

    @NonNull
    public final LinearLayout llDistance;

    @NonNull
    public final RelativeLayout llGoalSet;

    @NonNull
    public final LinearLayout llSteps;

    @NonNull
    public final RelativeLayout rlTipContent;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final Goal2ProgressBar stepPB;

    @NonNull
    public final ImageView tabSwitchImg;

    @NonNull
    public final MHFont transverseGoal;

    @NonNull
    public final MHFont tvCalorie;

    @NonNull
    public final MHFont tvDistance;

    @NonNull
    public final MarqueeTextView tvMarquee;

    @NonNull
    public final MHFont tvStep;

    @NonNull
    public final MHFont tvTemperature;

    @NonNull
    public final MHFont tvWeatherTime;

    private V2StatusItemStepTransverseBinding(@NonNull LinearLayout rootView, @NonNull PFMedium distanceUnit, @NonNull ImageView ivRight, @NonNull ImageView ivWeather, @NonNull LinearLayout llCalories, @NonNull LinearLayout llDistance, @NonNull RelativeLayout llGoalSet, @NonNull LinearLayout llSteps, @NonNull RelativeLayout rlTipContent, @NonNull Goal2ProgressBar stepPB, @NonNull ImageView tabSwitchImg, @NonNull MHFont transverseGoal, @NonNull MHFont tvCalorie, @NonNull MHFont tvDistance, @NonNull MarqueeTextView tvMarquee, @NonNull MHFont tvStep, @NonNull MHFont tvTemperature, @NonNull MHFont tvWeatherTime) {
        this.rootView = rootView;
        this.distanceUnit = distanceUnit;
        this.ivRight = ivRight;
        this.ivWeather = ivWeather;
        this.llCalories = llCalories;
        this.llDistance = llDistance;
        this.llGoalSet = llGoalSet;
        this.llSteps = llSteps;
        this.rlTipContent = rlTipContent;
        this.stepPB = stepPB;
        this.tabSwitchImg = tabSwitchImg;
        this.transverseGoal = transverseGoal;
        this.tvCalorie = tvCalorie;
        this.tvDistance = tvDistance;
        this.tvMarquee = tvMarquee;
        this.tvStep = tvStep;
        this.tvTemperature = tvTemperature;
        this.tvWeatherTime = tvWeatherTime;
    }

    @NonNull
    public static V2StatusItemStepTransverseBinding bind(@NonNull View rootView) {
        int r1 = R.id.distanceUnit;
        PFMedium r5 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.distanceUnit);
        if (r5 == null) goto L39;
        r1 = R.id.iv_right;
        ImageView r6 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_right);
        if (r6 == null) goto L39;
        r1 = R.id.ivWeather;
        ImageView r7 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.ivWeather);
        if (r7 == null) goto L39;
        r1 = R.id.llCalories;
        LinearLayout r8 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.llCalories);
        if (r8 == null) goto L39;
        r1 = R.id.llDistance;
        LinearLayout r9 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.llDistance);
        if (r9 == null) goto L39;
        r1 = R.id.ll_goal_set;
        RelativeLayout r10 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.ll_goal_set);
        if (r10 == null) goto L39;
        r1 = R.id.llSteps;
        LinearLayout r11 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.llSteps);
        if (r11 == null) goto L39;
        r1 = R.id.rlTipContent;
        RelativeLayout r12 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.rlTipContent);
        if (r12 == null) goto L39;
        r1 = R.id.stepPB;
        Goal2ProgressBar r13 = (Goal2ProgressBar) ViewBindings.findChildViewById(rootView, R.id.stepPB);
        if (r13 == null) goto L39;
        r1 = R.id.tab_switch_img;
        ImageView r14 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.tab_switch_img);
        if (r14 == null) goto L39;
        r1 = R.id.transverse_goal;
        MHFont r15 = (MHFont) ViewBindings.findChildViewById(rootView, R.id.transverse_goal);
        if (r15 == null) goto L39;
        r1 = R.id.tvCalorie;
        MHFont r16 = (MHFont) ViewBindings.findChildViewById(rootView, R.id.tvCalorie);
        if (r16 == null) goto L39;
        r1 = R.id.tvDistance;
        MHFont r17 = (MHFont) ViewBindings.findChildViewById(rootView, R.id.tvDistance);
        if (r17 == null) goto L39;
        r1 = R.id.tv_marquee;
        MarqueeTextView r18 = (MarqueeTextView) ViewBindings.findChildViewById(rootView, R.id.tv_marquee);
        if (r18 == null) goto L39;
        r1 = R.id.tvStep;
        MHFont r19 = (MHFont) ViewBindings.findChildViewById(rootView, R.id.tvStep);
        if (r19 == null) goto L39;
        r1 = R.id.tvTemperature;
        MHFont r20 = (MHFont) ViewBindings.findChildViewById(rootView, R.id.tvTemperature);
        if (r20 == null) goto L39;
        r1 = R.id.tvWeatherTime;
        MHFont r21 = (MHFont) ViewBindings.findChildViewById(rootView, R.id.tvWeatherTime);
        if (r21 == null) goto L39;
        return new V2StatusItemStepTransverseBinding((LinearLayout) rootView, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21);
    L39:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r1)));
    }

    @NonNull
    public static V2StatusItemStepTransverseBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static V2StatusItemStepTransverseBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.v2_status_item_step_transverse, parent, false);
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
