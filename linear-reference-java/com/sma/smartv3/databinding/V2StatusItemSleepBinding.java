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
        int r0 = R.id.data_panel;
        LinearLayout r4 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.data_panel);
        if (r4 == null) goto L27;
        r0 = R.id.empty_panel;
        LinearLayout r5 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.empty_panel);
        if (r5 == null) goto L27;
        r0 = R.id.ll_value;
        LinearLayout r6 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_value);
        if (r6 == null) goto L27;
        r0 = R.id.sleepBarChart;
        BarChart r7 = (BarChart) ViewBindings.findChildViewById(rootView, R.id.sleepBarChart);
        if (r7 == null) goto L27;
        r0 = R.id.sleepEndTime;
        TextView r8 = (TextView) ViewBindings.findChildViewById(rootView, R.id.sleepEndTime);
        if (r8 == null) goto L27;
        r0 = R.id.sleepHour;
        MHFont r9 = (MHFont) ViewBindings.findChildViewById(rootView, R.id.sleepHour);
        if (r9 == null) goto L27;
        r0 = R.id.sleepIv;
        TintImageView r10 = (TintImageView) ViewBindings.findChildViewById(rootView, R.id.sleepIv);
        if (r10 == null) goto L27;
        r0 = R.id.sleepMinute;
        MHFont r11 = (MHFont) ViewBindings.findChildViewById(rootView, R.id.sleepMinute);
        if (r11 == null) goto L27;
        r0 = R.id.sleepStartTime;
        TextView r12 = (TextView) ViewBindings.findChildViewById(rootView, R.id.sleepStartTime);
        if (r12 == null) goto L27;
        r0 = R.id.sleepTime;
        DINCondBold r13 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.sleepTime);
        if (r13 == null) goto L27;
        r0 = R.id.tv_no_data;
        PFMedium r14 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_no_data);
        if (r14 == null) goto L27;
        return new V2StatusItemSleepBinding((FrameLayout) rootView, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14);
    L27:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static V2StatusItemSleepBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static V2StatusItemSleepBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.v2_status_item_sleep, parent, false);
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
