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
        int i = R.id.data_panel;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.data_panel);
        if (linearLayout != null) {
            i = R.id.empty_panel;
            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.empty_panel);
            if (linearLayout2 != null) {
                i = R.id.hrvIv;
                TintImageView tintImageView = (TintImageView) ViewBindings.findChildViewById(rootView, R.id.hrvIv);
                if (tintImageView != null) {
                    i = R.id.hrvLastTime;
                    DINCondBold dINCondBold = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.hrvLastTime);
                    if (dINCondBold != null) {
                        i = R.id.hrvLastValue;
                        MHFont mHFont = (MHFont) ViewBindings.findChildViewById(rootView, R.id.hrvLastValue);
                        if (mHFont != null) {
                            i = R.id.hrvLineChart;
                            LineChart lineChart = (LineChart) ViewBindings.findChildViewById(rootView, R.id.hrvLineChart);
                            if (lineChart != null) {
                                i = R.id.ll_value;
                                LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_value);
                                if (linearLayout3 != null) {
                                    i = R.id.tv_chart_bottom_text;
                                    PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_chart_bottom_text);
                                    if (pFMedium != null) {
                                        i = R.id.tv_no_data;
                                        PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_no_data);
                                        if (pFMedium2 != null) {
                                            i = R.id.tv_title1;
                                            PFMedium pFMedium3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_title1);
                                            if (pFMedium3 != null) {
                                                i = R.id.tv_title2;
                                                PFMedium pFMedium4 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_title2);
                                                if (pFMedium4 != null) {
                                                    return new V2StatusItemHrvBinding((FrameLayout) rootView, linearLayout, linearLayout2, tintImageView, dINCondBold, mHFont, lineChart, linearLayout3, pFMedium, pFMedium2, pFMedium3, pFMedium4);
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
    public static V2StatusItemHrvBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static V2StatusItemHrvBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.v2_status_item_hrv, parent, false);
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
