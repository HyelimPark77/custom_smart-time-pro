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
import com.github.mikephil.charting.charts.LineChart;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.TintImageView;
import com.sma.smartv3.view.text.DINCondBold;
import com.sma.smartv3.view.text.MHFont;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class V2StatusItemHrvBinding implements ViewBinding {

    @NonNull
    public final LinearLayout dataPanel;

    @NonNull
    public final LinearLayout emptyPanel;

    @NonNull
    public final TintImageView hrvIv;

    @NonNull
    public final DINCondBold hrvLastTime;

    @NonNull
    public final MHFont hrvLastValue;

    @NonNull
    public final LineChart hrvLineChart;

    @NonNull
    public final LinearLayout llValue;

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final PFMedium tvChartBottomText;

    @NonNull
    public final PFMedium tvNoData;

    @NonNull
    public final PFMedium tvTitle1;

    @NonNull
    public final PFMedium tvTitle2;

    private V2StatusItemHrvBinding(@NonNull FrameLayout rootView, @NonNull LinearLayout dataPanel, @NonNull LinearLayout emptyPanel, @NonNull TintImageView hrvIv, @NonNull DINCondBold hrvLastTime, @NonNull MHFont hrvLastValue, @NonNull LineChart hrvLineChart, @NonNull LinearLayout llValue, @NonNull PFMedium tvChartBottomText, @NonNull PFMedium tvNoData, @NonNull PFMedium tvTitle1, @NonNull PFMedium tvTitle2) {
        this.rootView = rootView;
        this.dataPanel = dataPanel;
        this.emptyPanel = emptyPanel;
        this.hrvIv = hrvIv;
        this.hrvLastTime = hrvLastTime;
        this.hrvLastValue = hrvLastValue;
        this.hrvLineChart = hrvLineChart;
        this.llValue = llValue;
        this.tvChartBottomText = tvChartBottomText;
        this.tvNoData = tvNoData;
        this.tvTitle1 = tvTitle1;
        this.tvTitle2 = tvTitle2;
    }

    @NonNull
    public static V2StatusItemHrvBinding bind(@NonNull View rootView) {
        int r0 = R.id.data_panel;
        LinearLayout r4 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.data_panel);
        if (r4 == null) goto L27;
        r0 = R.id.empty_panel;
        LinearLayout r5 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.empty_panel);
        if (r5 == null) goto L27;
        r0 = R.id.hrvIv;
        TintImageView r6 = (TintImageView) ViewBindings.findChildViewById(rootView, R.id.hrvIv);
        if (r6 == null) goto L27;
        r0 = R.id.hrvLastTime;
        DINCondBold r7 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.hrvLastTime);
        if (r7 == null) goto L27;
        r0 = R.id.hrvLastValue;
        MHFont r8 = (MHFont) ViewBindings.findChildViewById(rootView, R.id.hrvLastValue);
        if (r8 == null) goto L27;
        r0 = R.id.hrvLineChart;
        LineChart r9 = (LineChart) ViewBindings.findChildViewById(rootView, R.id.hrvLineChart);
        if (r9 == null) goto L27;
        r0 = R.id.ll_value;
        LinearLayout r10 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_value);
        if (r10 == null) goto L27;
        r0 = R.id.tv_chart_bottom_text;
        PFMedium r11 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_chart_bottom_text);
        if (r11 == null) goto L27;
        r0 = R.id.tv_no_data;
        PFMedium r12 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_no_data);
        if (r12 == null) goto L27;
        r0 = R.id.tv_title1;
        PFMedium r13 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_title1);
        if (r13 == null) goto L27;
        r0 = R.id.tv_title2;
        PFMedium r14 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_title2);
        if (r14 == null) goto L27;
        return new V2StatusItemHrvBinding((FrameLayout) rootView, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14);
    L27:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static V2StatusItemHrvBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static V2StatusItemHrvBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.v2_status_item_hrv, parent, false);
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
