package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.github.mikephil.charting.charts.BarChart;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.TintImageView;
import com.sma.smartv3.view.text.DINCondBold;
import com.sma.smartv3.view.text.MHFont;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class V2StatusItemPressureBinding implements ViewBinding {

    @NonNull
    public final LinearLayout dataPanel;

    @NonNull
    public final LinearLayout emptyPanel;

    @NonNull
    public final TintImageView ivPressure;

    @NonNull
    public final LinearLayout llValue;

    @NonNull
    public final BarChart pressureBarChart;

    @NonNull
    public final DINCondBold pressureLastTime;

    @NonNull
    public final MHFont pressureLastValue;

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final PFMedium tvChartBottomText;

    @NonNull
    public final PFMedium tvNoData;

    private V2StatusItemPressureBinding(@NonNull FrameLayout rootView, @NonNull LinearLayout dataPanel, @NonNull LinearLayout emptyPanel, @NonNull TintImageView ivPressure, @NonNull LinearLayout llValue, @NonNull BarChart pressureBarChart, @NonNull DINCondBold pressureLastTime, @NonNull MHFont pressureLastValue, @NonNull PFMedium tvChartBottomText, @NonNull PFMedium tvNoData) {
        this.rootView = rootView;
        this.dataPanel = dataPanel;
        this.emptyPanel = emptyPanel;
        this.ivPressure = ivPressure;
        this.llValue = llValue;
        this.pressureBarChart = pressureBarChart;
        this.pressureLastTime = pressureLastTime;
        this.pressureLastValue = pressureLastValue;
        this.tvChartBottomText = tvChartBottomText;
        this.tvNoData = tvNoData;
    }

    @NonNull
    public static V2StatusItemPressureBinding bind(@NonNull View rootView) {
        int i = R.id.data_panel;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.data_panel);
        if (linearLayout != null) {
            i = R.id.empty_panel;
            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.empty_panel);
            if (linearLayout2 != null) {
                i = R.id.iv_pressure;
                TintImageView tintImageView = (TintImageView) ViewBindings.findChildViewById(rootView, R.id.iv_pressure);
                if (tintImageView != null) {
                    i = R.id.ll_value;
                    LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_value);
                    if (linearLayout3 != null) {
                        i = R.id.pressureBarChart;
                        BarChart barChart = (BarChart) ViewBindings.findChildViewById(rootView, R.id.pressureBarChart);
                        if (barChart != null) {
                            i = R.id.pressureLastTime;
                            DINCondBold dINCondBold = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.pressureLastTime);
                            if (dINCondBold != null) {
                                i = R.id.pressureLastValue;
                                MHFont mHFont = (MHFont) ViewBindings.findChildViewById(rootView, R.id.pressureLastValue);
                                if (mHFont != null) {
                                    i = R.id.tv_chart_bottom_text;
                                    PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_chart_bottom_text);
                                    if (pFMedium != null) {
                                        i = R.id.tv_no_data;
                                        PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_no_data);
                                        if (pFMedium2 != null) {
                                            return new V2StatusItemPressureBinding((FrameLayout) rootView, linearLayout, linearLayout2, tintImageView, linearLayout3, barChart, dINCondBold, mHFont, pFMedium, pFMedium2);
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
    public static V2StatusItemPressureBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static V2StatusItemPressureBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.v2_status_item_pressure, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
