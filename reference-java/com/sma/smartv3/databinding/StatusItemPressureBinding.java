package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.github.mikephil.charting.charts.BarChart;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.TintImageView;
import com.sma.smartv3.view.text.DINCondBold;

/* JADX INFO: loaded from: classes19.dex */
public final class StatusItemPressureBinding implements ViewBinding {

    @NonNull
    public final TintImageView ivPressure;

    @NonNull
    public final DINCondBold noData;

    @NonNull
    public final BarChart pressureBarChart;

    @NonNull
    public final DINCondBold pressureLastTime;

    @NonNull
    public final DINCondBold pressureLastValue;

    @NonNull
    private final LinearLayout rootView;

    private StatusItemPressureBinding(@NonNull LinearLayout rootView, @NonNull TintImageView ivPressure, @NonNull DINCondBold noData, @NonNull BarChart pressureBarChart, @NonNull DINCondBold pressureLastTime, @NonNull DINCondBold pressureLastValue) {
        this.rootView = rootView;
        this.ivPressure = ivPressure;
        this.noData = noData;
        this.pressureBarChart = pressureBarChart;
        this.pressureLastTime = pressureLastTime;
        this.pressureLastValue = pressureLastValue;
    }

    @NonNull
    public static StatusItemPressureBinding bind(@NonNull View rootView) {
        int i = R.id.iv_pressure;
        TintImageView tintImageView = (TintImageView) ViewBindings.findChildViewById(rootView, R.id.iv_pressure);
        if (tintImageView != null) {
            i = R.id.noData;
            DINCondBold dINCondBold = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.noData);
            if (dINCondBold != null) {
                i = R.id.pressureBarChart;
                BarChart barChart = (BarChart) ViewBindings.findChildViewById(rootView, R.id.pressureBarChart);
                if (barChart != null) {
                    i = R.id.pressureLastTime;
                    DINCondBold dINCondBold2 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.pressureLastTime);
                    if (dINCondBold2 != null) {
                        i = R.id.pressureLastValue;
                        DINCondBold dINCondBold3 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.pressureLastValue);
                        if (dINCondBold3 != null) {
                            return new StatusItemPressureBinding((LinearLayout) rootView, tintImageView, dINCondBold, barChart, dINCondBold2, dINCondBold3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static StatusItemPressureBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static StatusItemPressureBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.status_item_pressure, parent, false);
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
