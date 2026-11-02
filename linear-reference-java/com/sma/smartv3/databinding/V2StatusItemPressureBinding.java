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
        int r0 = R.id.data_panel;
        LinearLayout r4 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.data_panel);
        if (r4 == null) goto L23;
        r0 = R.id.empty_panel;
        LinearLayout r5 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.empty_panel);
        if (r5 == null) goto L23;
        r0 = R.id.iv_pressure;
        TintImageView r6 = (TintImageView) ViewBindings.findChildViewById(rootView, R.id.iv_pressure);
        if (r6 == null) goto L23;
        r0 = R.id.ll_value;
        LinearLayout r7 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_value);
        if (r7 == null) goto L23;
        r0 = R.id.pressureBarChart;
        BarChart r8 = (BarChart) ViewBindings.findChildViewById(rootView, R.id.pressureBarChart);
        if (r8 == null) goto L23;
        r0 = R.id.pressureLastTime;
        DINCondBold r9 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.pressureLastTime);
        if (r9 == null) goto L23;
        r0 = R.id.pressureLastValue;
        MHFont r10 = (MHFont) ViewBindings.findChildViewById(rootView, R.id.pressureLastValue);
        if (r10 == null) goto L23;
        r0 = R.id.tv_chart_bottom_text;
        PFMedium r11 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_chart_bottom_text);
        if (r11 == null) goto L23;
        r0 = R.id.tv_no_data;
        PFMedium r12 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_no_data);
        if (r12 == null) goto L23;
        return new V2StatusItemPressureBinding((FrameLayout) rootView, r4, r5, r6, r7, r8, r9, r10, r11, r12);
    L23:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static V2StatusItemPressureBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static V2StatusItemPressureBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.v2_status_item_pressure, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
