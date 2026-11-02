package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.github.mikephil.charting.charts.LineChart;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityDeveloperGsensorBinding implements ViewBinding {

    @NonNull
    public final AppCompatButton btnStart;

    @NonNull
    public final LineChart lineChart;

    @NonNull
    private final LinearLayout rootView;

    private ActivityDeveloperGsensorBinding(@NonNull LinearLayout rootView, @NonNull AppCompatButton btnStart, @NonNull LineChart lineChart) {
        this.rootView = rootView;
        this.btnStart = btnStart;
        this.lineChart = lineChart;
    }

    @NonNull
    public static ActivityDeveloperGsensorBinding bind(@NonNull View rootView) {
        int i = R.id.btn_start;
        AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.btn_start);
        if (appCompatButton != null) {
            i = R.id.line_chart;
            LineChart lineChart = (LineChart) ViewBindings.findChildViewById(rootView, R.id.line_chart);
            if (lineChart != null) {
                return new ActivityDeveloperGsensorBinding((LinearLayout) rootView, appCompatButton, lineChart);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(i)));
    }

    @NonNull
    public static ActivityDeveloperGsensorBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityDeveloperGsensorBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_developer_gsensor, parent, false);
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
