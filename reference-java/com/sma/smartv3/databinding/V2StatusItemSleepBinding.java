package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
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
public final class V2StatusItemSleepBinding implements ViewBinding {

    @NonNull
    public final LinearLayout dataPanel;

    @NonNull
    public final LinearLayout emptyPanel;

    @NonNull
    public final LinearLayout llValue;

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final BarChart sleepBarChart;

    @NonNull
    public final TextView sleepEndTime;

    @NonNull
    public final MHFont sleepHour;

    @NonNull
    public final TintImageView sleepIv;

    @NonNull
    public final MHFont sleepMinute;

    @NonNull
    public final TextView sleepStartTime;

    @NonNull
    public final DINCondBold sleepTime;

    @NonNull
    public final PFMedium tvNoData;

    private V2StatusItemSleepBinding(@NonNull FrameLayout rootView, @NonNull LinearLayout dataPanel, @NonNull LinearLayout emptyPanel, @NonNull LinearLayout llValue, @NonNull BarChart sleepBarChart, @NonNull TextView sleepEndTime, @NonNull MHFont sleepHour, @NonNull TintImageView sleepIv, @NonNull MHFont sleepMinute, @NonNull TextView sleepStartTime, @NonNull DINCondBold sleepTime, @NonNull PFMedium tvNoData) {
        this.rootView = rootView;
        this.dataPanel = dataPanel;
        this.emptyPanel = emptyPanel;
        this.llValue = llValue;
        this.sleepBarChart = sleepBarChart;
        this.sleepEndTime = sleepEndTime;
        this.sleepHour = sleepHour;
        this.sleepIv = sleepIv;
        this.sleepMinute = sleepMinute;
        this.sleepStartTime = sleepStartTime;
        this.sleepTime = sleepTime;
        this.tvNoData = tvNoData;
    }

    @NonNull
    public static V2StatusItemSleepBinding bind(@NonNull View rootView) {
        int i = R.id.data_panel;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.data_panel);
        if (linearLayout != null) {
            i = R.id.empty_panel;
            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.empty_panel);
            if (linearLayout2 != null) {
                i = R.id.ll_value;
                LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_value);
                if (linearLayout3 != null) {
                    i = R.id.sleepBarChart;
                    BarChart barChart = (BarChart) ViewBindings.findChildViewById(rootView, R.id.sleepBarChart);
                    if (barChart != null) {
                        i = R.id.sleepEndTime;
                        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.sleepEndTime);
                        if (textView != null) {
                            i = R.id.sleepHour;
                            MHFont mHFont = (MHFont) ViewBindings.findChildViewById(rootView, R.id.sleepHour);
                            if (mHFont != null) {
                                i = R.id.sleepIv;
                                TintImageView tintImageView = (TintImageView) ViewBindings.findChildViewById(rootView, R.id.sleepIv);
                                if (tintImageView != null) {
                                    i = R.id.sleepMinute;
                                    MHFont mHFont2 = (MHFont) ViewBindings.findChildViewById(rootView, R.id.sleepMinute);
                                    if (mHFont2 != null) {
                                        i = R.id.sleepStartTime;
                                        TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.sleepStartTime);
                                        if (textView2 != null) {
                                            i = R.id.sleepTime;
                                            DINCondBold dINCondBold = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.sleepTime);
                                            if (dINCondBold != null) {
                                                i = R.id.tv_no_data;
                                                PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_no_data);
                                                if (pFMedium != null) {
                                                    return new V2StatusItemSleepBinding((FrameLayout) rootView, linearLayout, linearLayout2, linearLayout3, barChart, textView, mHFont, tintImageView, mHFont2, textView2, dINCondBold, pFMedium);
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
    public static V2StatusItemSleepBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static V2StatusItemSleepBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.v2_status_item_sleep, parent, false);
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
