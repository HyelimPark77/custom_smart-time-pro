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
public final class V2StatusItemStepBinding implements ViewBinding {

    @NonNull
    public final PFMedium distanceUnit;

    @NonNull
    public final ImageView ivCalories;

    @NonNull
    public final ImageView ivDistance;

    @NonNull
    public final ImageView ivRight;

    @NonNull
    public final ImageView ivStep;

    @NonNull
    public final ImageView ivWeather;

    @NonNull
    public final RelativeLayout llCalories;

    @NonNull
    public final RelativeLayout llDistance;

    @NonNull
    public final LinearLayout llGoalSet;

    @NonNull
    public final RelativeLayout llSteps;

    @NonNull
    public final RelativeLayout rlStepContext;

    @NonNull
    public final RelativeLayout rlTipContent;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final Goal2ProgressBar stepPB;

    @NonNull
    public final ImageView tabSwitchImg;

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

    private V2StatusItemStepBinding(@NonNull LinearLayout rootView, @NonNull PFMedium distanceUnit, @NonNull ImageView ivCalories, @NonNull ImageView ivDistance, @NonNull ImageView ivRight, @NonNull ImageView ivStep, @NonNull ImageView ivWeather, @NonNull RelativeLayout llCalories, @NonNull RelativeLayout llDistance, @NonNull LinearLayout llGoalSet, @NonNull RelativeLayout llSteps, @NonNull RelativeLayout rlStepContext, @NonNull RelativeLayout rlTipContent, @NonNull Goal2ProgressBar stepPB, @NonNull ImageView tabSwitchImg, @NonNull MHFont tvCalorie, @NonNull MHFont tvDistance, @NonNull MarqueeTextView tvMarquee, @NonNull MHFont tvStep, @NonNull MHFont tvTemperature, @NonNull MHFont tvWeatherTime) {
        this.rootView = rootView;
        this.distanceUnit = distanceUnit;
        this.ivCalories = ivCalories;
        this.ivDistance = ivDistance;
        this.ivRight = ivRight;
        this.ivStep = ivStep;
        this.ivWeather = ivWeather;
        this.llCalories = llCalories;
        this.llDistance = llDistance;
        this.llGoalSet = llGoalSet;
        this.llSteps = llSteps;
        this.rlStepContext = rlStepContext;
        this.rlTipContent = rlTipContent;
        this.stepPB = stepPB;
        this.tabSwitchImg = tabSwitchImg;
        this.tvCalorie = tvCalorie;
        this.tvDistance = tvDistance;
        this.tvMarquee = tvMarquee;
        this.tvStep = tvStep;
        this.tvTemperature = tvTemperature;
        this.tvWeatherTime = tvWeatherTime;
    }

    @NonNull
    public static V2StatusItemStepBinding bind(@NonNull View rootView) {
        int i = R.id.distanceUnit;
        PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.distanceUnit);
        if (pFMedium != null) {
            i = R.id.iv_calories;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_calories);
            if (imageView != null) {
                i = R.id.iv_distance;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_distance);
                if (imageView2 != null) {
                    i = R.id.iv_right;
                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_right);
                    if (imageView3 != null) {
                        i = R.id.iv_step;
                        ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_step);
                        if (imageView4 != null) {
                            i = R.id.ivWeather;
                            ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.ivWeather);
                            if (imageView5 != null) {
                                i = R.id.llCalories;
                                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.llCalories);
                                if (relativeLayout != null) {
                                    i = R.id.llDistance;
                                    RelativeLayout relativeLayout2 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.llDistance);
                                    if (relativeLayout2 != null) {
                                        i = R.id.ll_goal_set;
                                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_goal_set);
                                        if (linearLayout != null) {
                                            i = R.id.llSteps;
                                            RelativeLayout relativeLayout3 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.llSteps);
                                            if (relativeLayout3 != null) {
                                                i = R.id.rl_step_context;
                                                RelativeLayout relativeLayout4 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.rl_step_context);
                                                if (relativeLayout4 != null) {
                                                    i = R.id.rlTipContent;
                                                    RelativeLayout relativeLayout5 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.rlTipContent);
                                                    if (relativeLayout5 != null) {
                                                        i = R.id.stepPB;
                                                        Goal2ProgressBar goal2ProgressBar = (Goal2ProgressBar) ViewBindings.findChildViewById(rootView, R.id.stepPB);
                                                        if (goal2ProgressBar != null) {
                                                            i = R.id.tab_switch_img;
                                                            ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.tab_switch_img);
                                                            if (imageView6 != null) {
                                                                i = R.id.tvCalorie;
                                                                MHFont mHFont = (MHFont) ViewBindings.findChildViewById(rootView, R.id.tvCalorie);
                                                                if (mHFont != null) {
                                                                    i = R.id.tvDistance;
                                                                    MHFont mHFont2 = (MHFont) ViewBindings.findChildViewById(rootView, R.id.tvDistance);
                                                                    if (mHFont2 != null) {
                                                                        i = R.id.tv_marquee;
                                                                        MarqueeTextView marqueeTextView = (MarqueeTextView) ViewBindings.findChildViewById(rootView, R.id.tv_marquee);
                                                                        if (marqueeTextView != null) {
                                                                            i = R.id.tvStep;
                                                                            MHFont mHFont3 = (MHFont) ViewBindings.findChildViewById(rootView, R.id.tvStep);
                                                                            if (mHFont3 != null) {
                                                                                i = R.id.tvTemperature;
                                                                                MHFont mHFont4 = (MHFont) ViewBindings.findChildViewById(rootView, R.id.tvTemperature);
                                                                                if (mHFont4 != null) {
                                                                                    i = R.id.tvWeatherTime;
                                                                                    MHFont mHFont5 = (MHFont) ViewBindings.findChildViewById(rootView, R.id.tvWeatherTime);
                                                                                    if (mHFont5 != null) {
                                                                                        return new V2StatusItemStepBinding((LinearLayout) rootView, pFMedium, imageView, imageView2, imageView3, imageView4, imageView5, relativeLayout, relativeLayout2, linearLayout, relativeLayout3, relativeLayout4, relativeLayout5, goal2ProgressBar, imageView6, mHFont, mHFont2, marqueeTextView, mHFont3, mHFont4, mHFont5);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static V2StatusItemStepBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static V2StatusItemStepBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.v2_status_item_step, parent, false);
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
