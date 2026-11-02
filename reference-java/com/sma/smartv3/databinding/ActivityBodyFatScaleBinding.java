package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.DINCondBold;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityBodyFatScaleBinding implements ViewBinding {

    @NonNull
    public final Button btnMeasureWeight;

    @NonNull
    public final LinearLayout llWeightMeasure;

    @NonNull
    public final RelativeLayout llWeightMeasureInfo;

    @NonNull
    public final FrameLayout measurePanel;

    @NonNull
    public final LinearLayout rootView;

    @NonNull
    private final LinearLayout rootView_;

    @NonNull
    public final NestedScrollView scrollView;

    @NonNull
    public final PFMedium tvGreet;

    @NonNull
    public final PFMedium tvMeasureTip;

    @NonNull
    public final PFMedium tvTip;

    @NonNull
    public final PFMedium tvWeightUnit;

    @NonNull
    public final DINCondBold tvWeightValue;

    private ActivityBodyFatScaleBinding(@NonNull LinearLayout rootView_, @NonNull Button btnMeasureWeight, @NonNull LinearLayout llWeightMeasure, @NonNull RelativeLayout llWeightMeasureInfo, @NonNull FrameLayout measurePanel, @NonNull LinearLayout rootView, @NonNull NestedScrollView scrollView, @NonNull PFMedium tvGreet, @NonNull PFMedium tvMeasureTip, @NonNull PFMedium tvTip, @NonNull PFMedium tvWeightUnit, @NonNull DINCondBold tvWeightValue) {
        this.rootView_ = rootView_;
        this.btnMeasureWeight = btnMeasureWeight;
        this.llWeightMeasure = llWeightMeasure;
        this.llWeightMeasureInfo = llWeightMeasureInfo;
        this.measurePanel = measurePanel;
        this.rootView = rootView;
        this.scrollView = scrollView;
        this.tvGreet = tvGreet;
        this.tvMeasureTip = tvMeasureTip;
        this.tvTip = tvTip;
        this.tvWeightUnit = tvWeightUnit;
        this.tvWeightValue = tvWeightValue;
    }

    @NonNull
    public static ActivityBodyFatScaleBinding bind(@NonNull View rootView) {
        int i = R.id.btn_measure_weight;
        Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.btn_measure_weight);
        if (button != null) {
            i = R.id.ll_weight_measure;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_weight_measure);
            if (linearLayout != null) {
                i = R.id.ll_weight_measure_info;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.ll_weight_measure_info);
                if (relativeLayout != null) {
                    i = R.id.measure_panel;
                    FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.measure_panel);
                    if (frameLayout != null) {
                        LinearLayout linearLayout2 = (LinearLayout) rootView;
                        i = R.id.scrollView;
                        NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(rootView, R.id.scrollView);
                        if (nestedScrollView != null) {
                            i = R.id.tv_greet;
                            PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_greet);
                            if (pFMedium != null) {
                                i = R.id.tv_measure_tip;
                                PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_measure_tip);
                                if (pFMedium2 != null) {
                                    i = R.id.tv_tip;
                                    PFMedium pFMedium3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_tip);
                                    if (pFMedium3 != null) {
                                        i = R.id.tv_weightUnit;
                                        PFMedium pFMedium4 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_weightUnit);
                                        if (pFMedium4 != null) {
                                            i = R.id.tv_weightValue;
                                            DINCondBold dINCondBold = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.tv_weightValue);
                                            if (dINCondBold != null) {
                                                return new ActivityBodyFatScaleBinding(linearLayout2, button, linearLayout, relativeLayout, frameLayout, linearLayout2, nestedScrollView, pFMedium, pFMedium2, pFMedium3, pFMedium4, dINCondBold);
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
    public static ActivityBodyFatScaleBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityBodyFatScaleBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_body_fat_scale, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView_;
    }
}
