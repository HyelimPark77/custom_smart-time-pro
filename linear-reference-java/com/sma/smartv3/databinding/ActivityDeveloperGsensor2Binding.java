package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.github.mikephil.charting.charts.LineChart;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityDeveloperGsensor2Binding implements ViewBinding {

    @NonNull
    public final AppCompatButton btnClear;

    @NonNull
    public final AppCompatButton btnCopy;

    @NonNull
    public final AppCompatButton btnShare;

    @NonNull
    public final AppCompatButton btnStart;

    @NonNull
    public final LineChart lineChart;

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final TextView tvInfo;

    @NonNull
    public final TextView tvTime;

    private ActivityDeveloperGsensor2Binding(@NonNull FrameLayout rootView, @NonNull AppCompatButton btnClear, @NonNull AppCompatButton btnCopy, @NonNull AppCompatButton btnShare, @NonNull AppCompatButton btnStart, @NonNull LineChart lineChart, @NonNull TextView tvInfo, @NonNull TextView tvTime) {
        this.rootView = rootView;
        this.btnClear = btnClear;
        this.btnCopy = btnCopy;
        this.btnShare = btnShare;
        this.btnStart = btnStart;
        this.lineChart = lineChart;
        this.tvInfo = tvInfo;
        this.tvTime = tvTime;
    }

    @NonNull
    public static ActivityDeveloperGsensor2Binding bind(@NonNull View rootView) {
        int r0 = R.id.btn_clear;
        AppCompatButton r4 = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.btn_clear);
        if (r4 == null) goto L19;
        r0 = R.id.btn_copy;
        AppCompatButton r5 = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.btn_copy);
        if (r5 == null) goto L19;
        r0 = R.id.btn_share;
        AppCompatButton r6 = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.btn_share);
        if (r6 == null) goto L19;
        r0 = R.id.btn_start;
        AppCompatButton r7 = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.btn_start);
        if (r7 == null) goto L19;
        r0 = R.id.line_chart;
        LineChart r8 = (LineChart) ViewBindings.findChildViewById(rootView, R.id.line_chart);
        if (r8 == null) goto L19;
        r0 = R.id.tv_info;
        TextView r9 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_info);
        if (r9 == null) goto L19;
        r0 = R.id.tv_time;
        TextView r10 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_time);
        if (r10 == null) goto L19;
        return new ActivityDeveloperGsensor2Binding((FrameLayout) rootView, r4, r5, r6, r7, r8, r9, r10);
    L19:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivityDeveloperGsensor2Binding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityDeveloperGsensor2Binding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_developer_gsensor_2, parent, false);
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
