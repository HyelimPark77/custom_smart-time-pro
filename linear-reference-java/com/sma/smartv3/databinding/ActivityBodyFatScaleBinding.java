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
        int r0 = R.id.btn_measure_weight;
        Button r4 = (Button) ViewBindings.findChildViewById(rootView, R.id.btn_measure_weight);
        if (r4 == null) goto L25;
        r0 = R.id.ll_weight_measure;
        LinearLayout r5 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_weight_measure);
        if (r5 == null) goto L25;
        r0 = R.id.ll_weight_measure_info;
        RelativeLayout r6 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.ll_weight_measure_info);
        if (r6 == null) goto L25;
        r0 = R.id.measure_panel;
        FrameLayout r7 = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.measure_panel);
        if (r7 == null) goto L25;
        LinearLayout r3 = (LinearLayout) rootView;
        r0 = R.id.scrollView;
        NestedScrollView r9 = (NestedScrollView) ViewBindings.findChildViewById(rootView, R.id.scrollView);
        if (r9 == null) goto L25;
        r0 = R.id.tv_greet;
        PFMedium r10 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_greet);
        if (r10 == null) goto L25;
        r0 = R.id.tv_measure_tip;
        PFMedium r11 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_measure_tip);
        if (r11 == null) goto L25;
        r0 = R.id.tv_tip;
        PFMedium r12 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_tip);
        if (r12 == null) goto L25;
        r0 = R.id.tv_weightUnit;
        PFMedium r13 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_weightUnit);
        if (r13 == null) goto L25;
        r0 = R.id.tv_weightValue;
        DINCondBold r14 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.tv_weightValue);
        if (r14 == null) goto L25;
        return new ActivityBodyFatScaleBinding(r3, r4, r5, r6, r7, r3, r9, r10, r11, r12, r13, r14);
    L25:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivityBodyFatScaleBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityBodyFatScaleBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_body_fat_scale, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView_;
    }
}
