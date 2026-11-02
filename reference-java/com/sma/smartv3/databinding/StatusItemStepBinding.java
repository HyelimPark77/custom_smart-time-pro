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
import com.sma.smartv3.view.StepProgressBar;
import com.sma.smartv3.view.text.DINCondBold;

/* JADX INFO: loaded from: classes19.dex */
public final class StatusItemStepBinding implements ViewBinding {

    @NonNull
    public final ImageView ivWeather;

    @NonNull
    public final RelativeLayout rlStepContext;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final StepProgressBar stepPB;

    @NonNull
    public final DINCondBold tvTemperature;

    @NonNull
    public final DINCondBold tvWeatherTime;

    private StatusItemStepBinding(@NonNull LinearLayout rootView, @NonNull ImageView ivWeather, @NonNull RelativeLayout rlStepContext, @NonNull StepProgressBar stepPB, @NonNull DINCondBold tvTemperature, @NonNull DINCondBold tvWeatherTime) {
        this.rootView = rootView;
        this.ivWeather = ivWeather;
        this.rlStepContext = rlStepContext;
        this.stepPB = stepPB;
        this.tvTemperature = tvTemperature;
        this.tvWeatherTime = tvWeatherTime;
    }

    @NonNull
    public static StatusItemStepBinding bind(@NonNull View rootView) {
        int i = R.id.ivWeather;
        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.ivWeather);
        if (imageView != null) {
            i = R.id.rl_step_context;
            RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.rl_step_context);
            if (relativeLayout != null) {
                i = R.id.stepPB;
                StepProgressBar stepProgressBar = (StepProgressBar) ViewBindings.findChildViewById(rootView, R.id.stepPB);
                if (stepProgressBar != null) {
                    i = R.id.tvTemperature;
                    DINCondBold dINCondBold = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.tvTemperature);
                    if (dINCondBold != null) {
                        i = R.id.tvWeatherTime;
                        DINCondBold dINCondBold2 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.tvWeatherTime);
                        if (dINCondBold2 != null) {
                            return new StatusItemStepBinding((LinearLayout) rootView, imageView, relativeLayout, stepProgressBar, dINCondBold, dINCondBold2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static StatusItemStepBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static StatusItemStepBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.status_item_step, parent, false);
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
