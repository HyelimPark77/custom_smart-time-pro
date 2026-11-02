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
        int r0 = R.id.ivWeather;
        ImageView r4 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.ivWeather);
        if (r4 == null) goto L15;
        r0 = R.id.rl_step_context;
        RelativeLayout r5 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.rl_step_context);
        if (r5 == null) goto L15;
        r0 = R.id.stepPB;
        StepProgressBar r6 = (StepProgressBar) ViewBindings.findChildViewById(rootView, R.id.stepPB);
        if (r6 == null) goto L15;
        r0 = R.id.tvTemperature;
        DINCondBold r7 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.tvTemperature);
        if (r7 == null) goto L15;
        r0 = R.id.tvWeatherTime;
        DINCondBold r8 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.tvWeatherTime);
        if (r8 == null) goto L15;
        return new StatusItemStepBinding((LinearLayout) rootView, r4, r5, r6, r7, r8);
    L15:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static StatusItemStepBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static StatusItemStepBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.status_item_step, parent, false);
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
