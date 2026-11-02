package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.github.mikephil.charting.charts.BarChart;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.TintImageView;
import com.sma.smartv3.view.text.DINCondBold;

/* JADX INFO: loaded from: classes19.dex */
public final class StatusItemSleepBinding implements ViewBinding {

    @NonNull
    public final DINCondBold noData;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final BarChart sleepBarChart;

    @NonNull
    public final RelativeLayout sleepBarChartRl;

    @NonNull
    public final TextView sleepEndTime;

    @NonNull
    public final DINCondBold sleepHour;

    @NonNull
    public final TintImageView sleepIv;

    @NonNull
    public final DINCondBold sleepMinute;

    @NonNull
    public final TextView sleepStartTime;

    @NonNull
    public final DINCondBold sleepTime;

    private StatusItemSleepBinding(@NonNull LinearLayout rootView, @NonNull DINCondBold noData, @NonNull BarChart sleepBarChart, @NonNull RelativeLayout sleepBarChartRl, @NonNull TextView sleepEndTime, @NonNull DINCondBold sleepHour, @NonNull TintImageView sleepIv, @NonNull DINCondBold sleepMinute, @NonNull TextView sleepStartTime, @NonNull DINCondBold sleepTime) {
        this.rootView = rootView;
        this.noData = noData;
        this.sleepBarChart = sleepBarChart;
        this.sleepBarChartRl = sleepBarChartRl;
        this.sleepEndTime = sleepEndTime;
        this.sleepHour = sleepHour;
        this.sleepIv = sleepIv;
        this.sleepMinute = sleepMinute;
        this.sleepStartTime = sleepStartTime;
        this.sleepTime = sleepTime;
    }

    @NonNull
    public static StatusItemSleepBinding bind(@NonNull View rootView) {
        int i = R.id.noData;
        DINCondBold dINCondBold = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.noData);
        if (dINCondBold != null) {
            i = R.id.sleepBarChart;
            BarChart barChart = (BarChart) ViewBindings.findChildViewById(rootView, R.id.sleepBarChart);
            if (barChart != null) {
                i = R.id.sleepBarChartRl;
                RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.sleepBarChartRl);
                if (relativeLayout != null) {
                    i = R.id.sleepEndTime;
                    TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.sleepEndTime);
                    if (textView != null) {
                        i = R.id.sleepHour;
                        DINCondBold dINCondBold2 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.sleepHour);
                        if (dINCondBold2 != null) {
                            i = R.id.sleepIv;
                            TintImageView tintImageView = (TintImageView) ViewBindings.findChildViewById(rootView, R.id.sleepIv);
                            if (tintImageView != null) {
                                i = R.id.sleepMinute;
                                DINCondBold dINCondBold3 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.sleepMinute);
                                if (dINCondBold3 != null) {
                                    i = R.id.sleepStartTime;
                                    TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.sleepStartTime);
                                    if (textView2 != null) {
                                        i = R.id.sleepTime;
                                        DINCondBold dINCondBold4 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.sleepTime);
                                        if (dINCondBold4 != null) {
                                            return new StatusItemSleepBinding((LinearLayout) rootView, dINCondBold, barChart, relativeLayout, textView, dINCondBold2, tintImageView, dINCondBold3, textView2, dINCondBold4);
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
    public static StatusItemSleepBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static StatusItemSleepBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.status_item_sleep, parent, false);
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
