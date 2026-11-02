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
public final class V2StatusItemHeartRateBinding implements ViewBinding {

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

    private V2StatusItemHeartRateBinding(@NonNull FrameLayout rootView, @NonNull LinearLayout dataPanel, @NonNull LinearLayout emptyPanel, @NonNull TintImageView hrIv, @NonNull DINCondBold hrLastTime, @NonNull MHFont hrLastValue, @NonNull LineChart hrLineChart, @NonNull LinearLayout llValue, @NonNull PFMedium tvChartBottomText, @NonNull PFMedium tvNoData) {
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
    public static V2StatusItemHeartRateBinding bind(@NonNull View rootView) {
        int i = R.id.data_panel;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.data_panel);
        if (linearLayout != null) {
            i = R.id.empty_panel;
            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.empty_panel);
            if (linearLayout2 != null) {
                i = R.id.hrIv;
                TintImageView tintImageView = (TintImageView) ViewBindings.findChildViewById(rootView, R.id.hrIv);
                if (tintImageView != null) {
                    i = R.id.hrLastTime;
                    DINCondBold dINCondBold = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.hrLastTime);
                    if (dINCondBold != null) {
                        i = R.id.hrLastValue;
                        MHFont mHFont = (MHFont) ViewBindings.findChildViewById(rootView, R.id.hrLastValue);
                        if (mHFont != null) {
                            i = R.id.hrLineChart;
                            LineChart lineChart = (LineChart) ViewBindings.findChildViewById(rootView, R.id.hrLineChart);
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
                                            return new V2StatusItemHeartRateBinding((FrameLayout) rootView, linearLayout, linearLayout2, tintImageView, dINCondBold, mHFont, lineChart, linearLayout3, pFMedium, pFMedium2);
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
    public static V2StatusItemHeartRateBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static V2StatusItemHeartRateBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.v2_status_item_heart_rate, parent, false);
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
