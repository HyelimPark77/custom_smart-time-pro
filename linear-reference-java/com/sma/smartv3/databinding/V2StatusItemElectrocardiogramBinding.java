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
public final class V2StatusItemElectrocardiogramBinding implements ViewBinding {

    @NonNull
    public final LinearLayout dataPanel;

    @NonNull
    public final LinearLayout emptyPanel;

    @NonNull
    public final TintImageView hrIv;

    @NonNull
    public final DINCondBold hrLastTime;

    @NonNull
    public final MHFont hrLastValue;

    @NonNull
    public final LineChart hrLineChart;

    @NonNull
    public final LinearLayout llValue;

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final PFMedium tvChartBottomText;

    @NonNull
    public final PFMedium tvNoData;

    private V2StatusItemElectrocardiogramBinding(@NonNull FrameLayout rootView, @NonNull LinearLayout dataPanel, @NonNull LinearLayout emptyPanel, @NonNull TintImageView hrIv, @NonNull DINCondBold hrLastTime, @NonNull MHFont hrLastValue, @NonNull LineChart hrLineChart, @NonNull LinearLayout llValue, @NonNull PFMedium tvChartBottomText, @NonNull PFMedium tvNoData) {
        this.rootView = rootView;
        this.dataPanel = dataPanel;
        this.emptyPanel = emptyPanel;
        this.hrIv = hrIv;
        this.hrLastTime = hrLastTime;
        this.hrLastValue = hrLastValue;
        this.hrLineChart = hrLineChart;
        this.llValue = llValue;
        this.tvChartBottomText = tvChartBottomText;
        this.tvNoData = tvNoData;
    }

    @NonNull
    public static V2StatusItemElectrocardiogramBinding bind(@NonNull View rootView) {
        int r0 = R.id.data_panel;
        LinearLayout r4 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.data_panel);
        if (r4 == null) goto L23;
        r0 = R.id.empty_panel;
        LinearLayout r5 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.empty_panel);
        if (r5 == null) goto L23;
        r0 = R.id.hrIv;
        TintImageView r6 = (TintImageView) ViewBindings.findChildViewById(rootView, R.id.hrIv);
        if (r6 == null) goto L23;
        r0 = R.id.hrLastTime;
        DINCondBold r7 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.hrLastTime);
        if (r7 == null) goto L23;
        r0 = R.id.hrLastValue;
        MHFont r8 = (MHFont) ViewBindings.findChildViewById(rootView, R.id.hrLastValue);
        if (r8 == null) goto L23;
        r0 = R.id.hrLineChart;
        LineChart r9 = (LineChart) ViewBindings.findChildViewById(rootView, R.id.hrLineChart);
        if (r9 == null) goto L23;
        r0 = R.id.ll_value;
        LinearLayout r10 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_value);
        if (r10 == null) goto L23;
        r0 = R.id.tv_chart_bottom_text;
        PFMedium r11 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_chart_bottom_text);
        if (r11 == null) goto L23;
        r0 = R.id.tv_no_data;
        PFMedium r12 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_no_data);
        if (r12 == null) goto L23;
        return new V2StatusItemElectrocardiogramBinding((FrameLayout) rootView, r4, r5, r6, r7, r8, r9, r10, r11, r12);
    L23:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static V2StatusItemElectrocardiogramBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static V2StatusItemElectrocardiogramBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.v2_status_item_electrocardiogram, parent, false);
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
