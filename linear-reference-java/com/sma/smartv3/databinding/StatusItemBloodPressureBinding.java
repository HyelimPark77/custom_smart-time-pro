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
        int r0 = R.id.bpChart;
        BarChart r4 = (BarChart) ViewBindings.findChildViewById(rootView, R.id.bpChart);
        if (r4 == null) goto L21;
        r0 = R.id.bpIv;
        TintImageView r5 = (TintImageView) ViewBindings.findChildViewById(rootView, R.id.bpIv);
        if (r5 == null) goto L21;
        r0 = R.id.bpLastTime;
        DINCondBold r6 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.bpLastTime);
        if (r6 == null) goto L21;
        r0 = R.id.dbp;
        DINCondBold r7 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.dbp);
        if (r7 == null) goto L21;
        r0 = R.id.noData;
        DINCondBold r8 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.noData);
        if (r8 == null) goto L21;
        r0 = R.id.sbp;
        DINCondBold r9 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.sbp);
        if (r9 == null) goto L21;
        r0 = R.id.tv_blood_pressure;
        PFMedium r10 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_blood_pressure);
        if (r10 == null) goto L21;
        r0 = R.id.value_panel;
        LinearLayout r11 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.value_panel);
        if (r11 == null) goto L21;
        return new StatusItemBloodPressureBinding((LinearLayout) rootView, r4, r5, r6, r7, r8, r9, r10, r11);
    L21:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static StatusItemBloodPressureBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static StatusItemBloodPressureBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.status_item_blood_pressure, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
