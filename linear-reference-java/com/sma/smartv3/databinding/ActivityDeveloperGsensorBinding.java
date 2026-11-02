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
        int r0 = R.id.btn_start;
        AppCompatButton r1 = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.btn_start);
        if (r1 == null) goto L9;
        r0 = R.id.line_chart;
        LineChart r2 = (LineChart) ViewBindings.findChildViewById(rootView, R.id.line_chart);
        if (r2 == null) goto L9;
        return new ActivityDeveloperGsensorBinding((LinearLayout) rootView, r1, r2);
    L9:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r0)));
    }

    @NonNull
    public static ActivityDeveloperGsensorBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityDeveloperGsensorBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_developer_gsensor, parent, false);
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
