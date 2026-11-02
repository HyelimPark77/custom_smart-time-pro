package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.segmentedbar.CircleThumbSegmentedBarView;
import com.sma.smartv3.view.text.DINCondBold;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class LayoutWeightMeasureReportBinding implements ViewBinding {

    @NonNull
    public final LinearLayout llWeightMeasureItemPanel;

    @NonNull
    public final RecyclerView recyclerView;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final CircleThumbSegmentedBarView sbvBmi;

    @NonNull
    public final TabItem tabAll;

    @NonNull
    public final TabItem tabHigh;

    @NonNull
    public final TabItem tabLow;

    @NonNull
    public final TabItem tabStandard;

    @NonNull
    public final TabLayout table;

    @NonNull
    public final DINCondBold tvBfrValue;

    @NonNull
    public final PFMedium tvWeightUnit;

    @NonNull
    public final DINCondBold tvWeightValue;

    private LayoutWeightMeasureReportBinding(@NonNull LinearLayout rootView, @NonNull LinearLayout llWeightMeasureItemPanel, @NonNull RecyclerView recyclerView, @NonNull CircleThumbSegmentedBarView sbvBmi, @NonNull TabItem tabAll, @NonNull TabItem tabHigh, @NonNull TabItem tabLow, @NonNull TabItem tabStandard, @NonNull TabLayout table, @NonNull DINCondBold tvBfrValue, @NonNull PFMedium tvWeightUnit, @NonNull DINCondBold tvWeightValue) {
        this.rootView = rootView;
        this.llWeightMeasureItemPanel = llWeightMeasureItemPanel;
        this.recyclerView = recyclerView;
        this.sbvBmi = sbvBmi;
        this.tabAll = tabAll;
        this.tabHigh = tabHigh;
        this.tabLow = tabLow;
        this.tabStandard = tabStandard;
        this.table = table;
        this.tvBfrValue = tvBfrValue;
        this.tvWeightUnit = tvWeightUnit;
        this.tvWeightValue = tvWeightValue;
    }

    @NonNull
    public static LayoutWeightMeasureReportBinding bind(@NonNull View rootView) {
        int r0 = R.id.ll_weight_measure_item_panel;
        LinearLayout r4 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_weight_measure_item_panel);
        if (r4 == null) goto L27;
        r0 = R.id.recyclerView;
        RecyclerView r5 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.recyclerView);
        if (r5 == null) goto L27;
        r0 = R.id.sbv_bmi;
        CircleThumbSegmentedBarView r6 = (CircleThumbSegmentedBarView) ViewBindings.findChildViewById(rootView, R.id.sbv_bmi);
        if (r6 == null) goto L27;
        r0 = R.id.tab_all;
        TabItem r7 = (TabItem) ViewBindings.findChildViewById(rootView, R.id.tab_all);
        if (r7 == null) goto L27;
        r0 = R.id.tab_high;
        TabItem r8 = (TabItem) ViewBindings.findChildViewById(rootView, R.id.tab_high);
        if (r8 == null) goto L27;
        r0 = R.id.tab_low;
        TabItem r9 = (TabItem) ViewBindings.findChildViewById(rootView, R.id.tab_low);
        if (r9 == null) goto L27;
        r0 = R.id.tab_standard;
        TabItem r10 = (TabItem) ViewBindings.findChildViewById(rootView, R.id.tab_standard);
        if (r10 == null) goto L27;
        r0 = R.id.table;
        TabLayout r11 = (TabLayout) ViewBindings.findChildViewById(rootView, R.id.table);
        if (r11 == null) goto L27;
        r0 = R.id.tv_bfrValue;
        DINCondBold r12 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.tv_bfrValue);
        if (r12 == null) goto L27;
        r0 = R.id.tv_weightUnit;
        PFMedium r13 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_weightUnit);
        if (r13 == null) goto L27;
        r0 = R.id.tv_weightValue;
        DINCondBold r14 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.tv_weightValue);
        if (r14 == null) goto L27;
        return new LayoutWeightMeasureReportBinding((LinearLayout) rootView, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14);
    L27:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static LayoutWeightMeasureReportBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static LayoutWeightMeasureReportBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.layout_weight_measure_report, parent, false);
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
