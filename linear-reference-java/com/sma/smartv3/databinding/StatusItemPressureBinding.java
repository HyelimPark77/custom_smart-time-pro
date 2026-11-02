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
        int r0 = R.id.iv_pressure;
        TintImageView r4 = (TintImageView) ViewBindings.findChildViewById(rootView, R.id.iv_pressure);
        if (r4 == null) goto L15;
        r0 = R.id.noData;
        DINCondBold r5 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.noData);
        if (r5 == null) goto L15;
        r0 = R.id.pressureBarChart;
        BarChart r6 = (BarChart) ViewBindings.findChildViewById(rootView, R.id.pressureBarChart);
        if (r6 == null) goto L15;
        r0 = R.id.pressureLastTime;
        DINCondBold r7 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.pressureLastTime);
        if (r7 == null) goto L15;
        r0 = R.id.pressureLastValue;
        DINCondBold r8 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.pressureLastValue);
        if (r8 == null) goto L15;
        return new StatusItemPressureBinding((LinearLayout) rootView, r4, r5, r6, r7, r8);
    L15:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static StatusItemPressureBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static StatusItemPressureBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.status_item_pressure, parent, false);
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
