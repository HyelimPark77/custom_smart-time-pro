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
        int i = R.id.btn_clear;
        AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.btn_clear);
        if (appCompatButton != null) {
            i = R.id.btn_copy;
            AppCompatButton appCompatButton2 = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.btn_copy);
            if (appCompatButton2 != null) {
                i = R.id.btn_share;
                AppCompatButton appCompatButton3 = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.btn_share);
                if (appCompatButton3 != null) {
                    i = R.id.btn_start;
                    AppCompatButton appCompatButton4 = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.btn_start);
                    if (appCompatButton4 != null) {
                        i = R.id.line_chart;
                        LineChart lineChart = (LineChart) ViewBindings.findChildViewById(rootView, R.id.line_chart);
                        if (lineChart != null) {
                            i = R.id.tv_info;
                            TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_info);
                            if (textView != null) {
                                i = R.id.tv_time;
                                TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_time);
                                if (textView2 != null) {
                                    return new ActivityDeveloperGsensor2Binding((FrameLayout) rootView, appCompatButton, appCompatButton2, appCompatButton3, appCompatButton4, lineChart, textView, textView2);
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
    public static ActivityDeveloperGsensor2Binding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityDeveloperGsensor2Binding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_developer_gsensor_2, parent, false);
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
