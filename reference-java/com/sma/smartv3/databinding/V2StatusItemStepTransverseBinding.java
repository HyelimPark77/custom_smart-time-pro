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
        int i = R.id.distanceUnit;
        PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.distanceUnit);
        if (pFMedium != null) {
            i = R.id.iv_right;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_right);
            if (imageView != null) {
                i = R.id.ivWeather;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.ivWeather);
                if (imageView2 != null) {
                    i = R.id.llCalories;
                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.llCalories);
                    if (linearLayout != null) {
                        i = R.id.llDistance;
                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.llDistance);
                        if (linearLayout2 != null) {
                            i = R.id.ll_goal_set;
                            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.ll_goal_set);
                            if (relativeLayout != null) {
                                i = R.id.llSteps;
                                LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.llSteps);
                                if (linearLayout3 != null) {
                                    i = R.id.rlTipContent;
                                    RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.rlTipContent);
                                    if (relativeLayout2 != null) {
                                        i = R.id.stepPB;
                                        Goal2ProgressBar goal2ProgressBar = (Goal2ProgressBar) ViewBindings.findChildViewById(rootView, R.id.stepPB);
                                        if (goal2ProgressBar != null) {
                                            i = R.id.tab_switch_img;
                                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.tab_switch_img);
                                            if (imageView3 != null) {
                                                i = R.id.transverse_goal;
                                                MHFont mHFont = (MHFont) ViewBindings.findChildViewById(rootView, R.id.transverse_goal);
                                                if (mHFont != null) {
                                                    i = R.id.tvCalorie;
                                                    MHFont mHFont2 = (MHFont) ViewBindings.findChildViewById(rootView, R.id.tvCalorie);
                                                    if (mHFont2 != null) {
                                                        i = R.id.tvDistance;
                                                        MHFont mHFont3 = (MHFont) ViewBindings.findChildViewById(rootView, R.id.tvDistance);
                                                        if (mHFont3 != null) {
                                                            i = R.id.tv_marquee;
                                                            MarqueeTextView marqueeTextView = (MarqueeTextView) ViewBindings.findChildViewById(rootView, R.id.tv_marquee);
                                                            if (marqueeTextView != null) {
                                                                i = R.id.tvStep;
                                                                MHFont mHFont4 = (MHFont) ViewBindings.findChildViewById(rootView, R.id.tvStep);
                                                                if (mHFont4 != null) {
                                                                    i = R.id.tvTemperature;
                                                                    MHFont mHFont5 = (MHFont) ViewBindings.findChildViewById(rootView, R.id.tvTemperature);
                                                                    if (mHFont5 != null) {
                                                                        i = R.id.tvWeatherTime;
                                                                        MHFont mHFont6 = (MHFont) ViewBindings.findChildViewById(rootView, R.id.tvWeatherTime);
                                                                        if (mHFont6 != null) {
                                                                            return new V2StatusItemStepTransverseBinding((LinearLayout) rootView, pFMedium, imageView, imageView2, linearLayout, linearLayout2, relativeLayout, linearLayout3, relativeLayout2, goal2ProgressBar, imageView3, mHFont, mHFont2, mHFont3, marqueeTextView, mHFont4, mHFont5, mHFont6);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
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
    public static V2StatusItemStepTransverseBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static V2StatusItemStepTransverseBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.v2_status_item_step_transverse, parent, false);
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
