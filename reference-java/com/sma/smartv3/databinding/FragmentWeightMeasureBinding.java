package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.DINCondBold;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class FragmentWeightMeasureBinding implements ViewBinding {

    @NonNull
    public final ImageButton btnInputWeight;

    @NonNull
    public final Button btnMeasureWeight;

    @NonNull
    public final FrameLayout llWeightMeasureNoDatePanel;

    @NonNull
    public final LayoutWeightMeasureReportBinding llWeightMeasureReportPanel;

    @NonNull
    public final LinearLayout llWeightMeasureTitlePanel;

    @NonNull
    public final LinearLayout llWeightMeasureTopPanel;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final NestedScrollView scrollView;

    @NonNull
    public final PFMedium tvMeasureDate;

    @NonNull
    public final PFMedium tvNoDateTip;

    @NonNull
    public final PFMedium tvTopBfrUnit;

    @NonNull
    public final DINCondBold tvTopBfrValue;

    @NonNull
    public final DINCondBold tvTopBmiValue;

    @NonNull
    public final PFMedium tvTopWeightUnit;

    @NonNull
    public final DINCondBold tvTopWeightValue;

    private FragmentWeightMeasureBinding(@NonNull LinearLayout rootView, @NonNull ImageButton btnInputWeight, @NonNull Button btnMeasureWeight, @NonNull FrameLayout llWeightMeasureNoDatePanel, @NonNull LayoutWeightMeasureReportBinding llWeightMeasureReportPanel, @NonNull LinearLayout llWeightMeasureTitlePanel, @NonNull LinearLayout llWeightMeasureTopPanel, @NonNull NestedScrollView scrollView, @NonNull PFMedium tvMeasureDate, @NonNull PFMedium tvNoDateTip, @NonNull PFMedium tvTopBfrUnit, @NonNull DINCondBold tvTopBfrValue, @NonNull DINCondBold tvTopBmiValue, @NonNull PFMedium tvTopWeightUnit, @NonNull DINCondBold tvTopWeightValue) {
        this.rootView = rootView;
        this.btnInputWeight = btnInputWeight;
        this.btnMeasureWeight = btnMeasureWeight;
        this.llWeightMeasureNoDatePanel = llWeightMeasureNoDatePanel;
        this.llWeightMeasureReportPanel = llWeightMeasureReportPanel;
        this.llWeightMeasureTitlePanel = llWeightMeasureTitlePanel;
        this.llWeightMeasureTopPanel = llWeightMeasureTopPanel;
        this.scrollView = scrollView;
        this.tvMeasureDate = tvMeasureDate;
        this.tvNoDateTip = tvNoDateTip;
        this.tvTopBfrUnit = tvTopBfrUnit;
        this.tvTopBfrValue = tvTopBfrValue;
        this.tvTopBmiValue = tvTopBmiValue;
        this.tvTopWeightUnit = tvTopWeightUnit;
        this.tvTopWeightValue = tvTopWeightValue;
    }

    @NonNull
    public static FragmentWeightMeasureBinding bind(@NonNull View rootView) {
        int i = R.id.btn_input_weight;
        ImageButton imageButton = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.btn_input_weight);
        if (imageButton != null) {
            i = R.id.btn_measure_weight;
            Button button = (Button) ViewBindings.findChildViewById(rootView, R.id.btn_measure_weight);
            if (button != null) {
                i = R.id.ll_weight_measure_no_date_panel;
                FrameLayout frameLayout = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.ll_weight_measure_no_date_panel);
                if (frameLayout != null) {
                    i = R.id.ll_weight_measure_report_panel;
                    View viewFindChildViewById = ViewBindings.findChildViewById(rootView, R.id.ll_weight_measure_report_panel);
                    if (viewFindChildViewById != null) {
                        LayoutWeightMeasureReportBinding layoutWeightMeasureReportBindingBind = LayoutWeightMeasureReportBinding.bind(viewFindChildViewById);
                        i = R.id.ll_weight_measure_title_panel;
                        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_weight_measure_title_panel);
                        if (linearLayout != null) {
                            i = R.id.ll_weight_measure_top_panel;
                            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_weight_measure_top_panel);
                            if (linearLayout2 != null) {
                                i = R.id.scrollView;
                                NestedScrollView nestedScrollView = (NestedScrollView) ViewBindings.findChildViewById(rootView, R.id.scrollView);
                                if (nestedScrollView != null) {
                                    i = R.id.tv_measure_date;
                                    PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_measure_date);
                                    if (pFMedium != null) {
                                        i = R.id.tv_no_date_tip;
                                        PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_no_date_tip);
                                        if (pFMedium2 != null) {
                                            i = R.id.tv_topBfrUnit;
                                            PFMedium pFMedium3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_topBfrUnit);
                                            if (pFMedium3 != null) {
                                                i = R.id.tv_topBfrValue;
                                                DINCondBold dINCondBold = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.tv_topBfrValue);
                                                if (dINCondBold != null) {
                                                    i = R.id.tv_topBmiValue;
                                                    DINCondBold dINCondBold2 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.tv_topBmiValue);
                                                    if (dINCondBold2 != null) {
                                                        i = R.id.tv_topWeightUnit;
                                                        PFMedium pFMedium4 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_topWeightUnit);
                                                        if (pFMedium4 != null) {
                                                            i = R.id.tv_topWeightValue;
                                                            DINCondBold dINCondBold3 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.tv_topWeightValue);
                                                            if (dINCondBold3 != null) {
                                                                return new FragmentWeightMeasureBinding((LinearLayout) rootView, imageButton, button, frameLayout, layoutWeightMeasureReportBindingBind, linearLayout, linearLayout2, nestedScrollView, pFMedium, pFMedium2, pFMedium3, dINCondBold, dINCondBold2, pFMedium4, dINCondBold3);
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
    public static FragmentWeightMeasureBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentWeightMeasureBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_weight_measure, parent, false);
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
