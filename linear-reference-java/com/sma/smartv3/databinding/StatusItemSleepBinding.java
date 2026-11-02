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
        int r0 = R.id.noData;
        DINCondBold r4 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.noData);
        if (r4 == null) goto L23;
        r0 = R.id.sleepBarChart;
        BarChart r5 = (BarChart) ViewBindings.findChildViewById(rootView, R.id.sleepBarChart);
        if (r5 == null) goto L23;
        r0 = R.id.sleepBarChartRl;
        RelativeLayout r6 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.sleepBarChartRl);
        if (r6 == null) goto L23;
        r0 = R.id.sleepEndTime;
        TextView r7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.sleepEndTime);
        if (r7 == null) goto L23;
        r0 = R.id.sleepHour;
        DINCondBold r8 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.sleepHour);
        if (r8 == null) goto L23;
        r0 = R.id.sleepIv;
        TintImageView r9 = (TintImageView) ViewBindings.findChildViewById(rootView, R.id.sleepIv);
        if (r9 == null) goto L23;
        r0 = R.id.sleepMinute;
        DINCondBold r10 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.sleepMinute);
        if (r10 == null) goto L23;
        r0 = R.id.sleepStartTime;
        TextView r11 = (TextView) ViewBindings.findChildViewById(rootView, R.id.sleepStartTime);
        if (r11 == null) goto L23;
        r0 = R.id.sleepTime;
        DINCondBold r12 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.sleepTime);
        if (r12 == null) goto L23;
        return new StatusItemSleepBinding((LinearLayout) rootView, r4, r5, r6, r7, r8, r9, r10, r11, r12);
    L23:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static StatusItemSleepBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static StatusItemSleepBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.status_item_sleep, parent, false);
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
