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
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class StatusItemBloodPressureBinding implements ViewBinding {

    @NonNull
    public final BarChart bpChart;

    @NonNull
    public final TintImageView bpIv;

    @NonNull
    public final DINCondBold bpLastTime;

    @NonNull
    public final DINCondBold dbp;

    @NonNull
    public final DINCondBold noData;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final DINCondBold sbp;

    @NonNull
    public final PFMedium tvBloodPressure;

    @NonNull
    public final LinearLayout valuePanel;

    private StatusItemBloodPressureBinding(@NonNull LinearLayout rootView, @NonNull BarChart bpChart, @NonNull TintImageView bpIv, @NonNull DINCondBold bpLastTime, @NonNull DINCondBold dbp, @NonNull DINCondBold noData, @NonNull DINCondBold sbp, @NonNull PFMedium tvBloodPressure, @NonNull LinearLayout valuePanel) {
        this.rootView = rootView;
        this.bpChart = bpChart;
        this.bpIv = bpIv;
        this.bpLastTime = bpLastTime;
        this.dbp = dbp;
        this.noData = noData;
        this.sbp = sbp;
        this.tvBloodPressure = tvBloodPressure;
        this.valuePanel = valuePanel;
    }

    @NonNull
    public static StatusItemBloodPressureBinding bind(@NonNull View rootView) {
        int i = R.id.bpChart;
        BarChart barChart = (BarChart) ViewBindings.findChildViewById(rootView, R.id.bpChart);
        if (barChart != null) {
            i = R.id.bpIv;
            TintImageView tintImageView = (TintImageView) ViewBindings.findChildViewById(rootView, R.id.bpIv);
            if (tintImageView != null) {
                i = R.id.bpLastTime;
                DINCondBold dINCondBold = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.bpLastTime);
                if (dINCondBold != null) {
                    i = R.id.dbp;
                    DINCondBold dINCondBold2 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.dbp);
                    if (dINCondBold2 != null) {
                        i = R.id.noData;
                        DINCondBold dINCondBold3 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.noData);
                        if (dINCondBold3 != null) {
                            i = R.id.sbp;
                            DINCondBold dINCondBold4 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.sbp);
                            if (dINCondBold4 != null) {
                                i = R.id.tv_blood_pressure;
                                PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_blood_pressure);
                                if (pFMedium != null) {
                                    i = R.id.value_panel;
                                    LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.value_panel);
                                    if (linearLayout != null) {
                                        return new StatusItemBloodPressureBinding((LinearLayout) rootView, barChart, tintImageView, dINCondBold, dINCondBold2, dINCondBold3, dINCondBold4, pFMedium, linearLayout);
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
    public static StatusItemBloodPressureBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static StatusItemBloodPressureBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.status_item_blood_pressure, parent, false);
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
