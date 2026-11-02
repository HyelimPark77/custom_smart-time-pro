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
        int r1 = R.id.btn_input_weight;
        ImageButton r5 = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.btn_input_weight);
        if (r5 == null) goto L33;
        r1 = R.id.btn_measure_weight;
        Button r6 = (Button) ViewBindings.findChildViewById(rootView, R.id.btn_measure_weight);
        if (r6 == null) goto L33;
        r1 = R.id.ll_weight_measure_no_date_panel;
        FrameLayout r7 = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.ll_weight_measure_no_date_panel);
        if (r7 == null) goto L33;
        r1 = R.id.ll_weight_measure_report_panel;
        View r2 = ViewBindings.findChildViewById(rootView, R.id.ll_weight_measure_report_panel);
        if (r2 == null) goto L33;
        LayoutWeightMeasureReportBinding r8 = LayoutWeightMeasureReportBinding.bind(r2);
        r1 = R.id.ll_weight_measure_title_panel;
        LinearLayout r9 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_weight_measure_title_panel);
        if (r9 == null) goto L33;
        r1 = R.id.ll_weight_measure_top_panel;
        LinearLayout r10 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_weight_measure_top_panel);
        if (r10 == null) goto L33;
        r1 = R.id.scrollView;
        NestedScrollView r11 = (NestedScrollView) ViewBindings.findChildViewById(rootView, R.id.scrollView);
        if (r11 == null) goto L33;
        r1 = R.id.tv_measure_date;
        PFMedium r12 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_measure_date);
        if (r12 == null) goto L33;
        r1 = R.id.tv_no_date_tip;
        PFMedium r13 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_no_date_tip);
        if (r13 == null) goto L33;
        r1 = R.id.tv_topBfrUnit;
        PFMedium r14 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_topBfrUnit);
        if (r14 == null) goto L33;
        r1 = R.id.tv_topBfrValue;
        DINCondBold r15 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.tv_topBfrValue);
        if (r15 == null) goto L33;
        r1 = R.id.tv_topBmiValue;
        DINCondBold r16 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.tv_topBmiValue);
        if (r16 == null) goto L33;
        r1 = R.id.tv_topWeightUnit;
        PFMedium r17 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_topWeightUnit);
        if (r17 == null) goto L33;
        r1 = R.id.tv_topWeightValue;
        DINCondBold r18 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.tv_topWeightValue);
        if (r18 == null) goto L33;
        return new FragmentWeightMeasureBinding((LinearLayout) rootView, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18);
    L33:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r1)));
    }

    @NonNull
    public static FragmentWeightMeasureBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static FragmentWeightMeasureBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.fragment_weight_measure, parent, false);
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
