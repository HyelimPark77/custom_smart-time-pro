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
        int i = R.id.ll_weight_measure_item_panel;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_weight_measure_item_panel);
        if (linearLayout != null) {
            i = R.id.recyclerView;
            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.recyclerView);
            if (recyclerView != null) {
                i = R.id.sbv_bmi;
                CircleThumbSegmentedBarView circleThumbSegmentedBarView = (CircleThumbSegmentedBarView) ViewBindings.findChildViewById(rootView, R.id.sbv_bmi);
                if (circleThumbSegmentedBarView != null) {
                    i = R.id.tab_all;
                    TabItem tabItem = (TabItem) ViewBindings.findChildViewById(rootView, R.id.tab_all);
                    if (tabItem != null) {
                        i = R.id.tab_high;
                        TabItem tabItem2 = (TabItem) ViewBindings.findChildViewById(rootView, R.id.tab_high);
                        if (tabItem2 != null) {
                            i = R.id.tab_low;
                            TabItem tabItem3 = (TabItem) ViewBindings.findChildViewById(rootView, R.id.tab_low);
                            if (tabItem3 != null) {
                                i = R.id.tab_standard;
                                TabItem tabItem4 = (TabItem) ViewBindings.findChildViewById(rootView, R.id.tab_standard);
                                if (tabItem4 != null) {
                                    i = R.id.table;
                                    TabLayout tabLayout = (TabLayout) ViewBindings.findChildViewById(rootView, R.id.table);
                                    if (tabLayout != null) {
                                        i = R.id.tv_bfrValue;
                                        DINCondBold dINCondBold = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.tv_bfrValue);
                                        if (dINCondBold != null) {
                                            i = R.id.tv_weightUnit;
                                            PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_weightUnit);
                                            if (pFMedium != null) {
                                                i = R.id.tv_weightValue;
                                                DINCondBold dINCondBold2 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.tv_weightValue);
                                                if (dINCondBold2 != null) {
                                                    return new LayoutWeightMeasureReportBinding((LinearLayout) rootView, linearLayout, recyclerView, circleThumbSegmentedBarView, tabItem, tabItem2, tabItem3, tabItem4, tabLayout, dINCondBold, pFMedium, dINCondBold2);
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
    public static LayoutWeightMeasureReportBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static LayoutWeightMeasureReportBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.layout_weight_measure_report, parent, false);
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
