package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.github.mikephil.charting.charts.LineChart;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.DINCondBold;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class FragmentStatusBloodGlucoseMonthBinding implements ViewBinding {

    @NonNull
    public final DINCondBold avValue;

    @NonNull
    public final PFMedium avValueTV;

    @NonNull
    public final PFMedium avValueUnit;

    @NonNull
    public final ImageButton beforeTime;

    @NonNull
    public final LinearLayout dataContent;

    @NonNull
    public final ImageView image;

    @NonNull
    public final LineChart lineChart;

    @NonNull
    public final LinearLayout llAvgValue;

    @NonNull
    public final LinearLayout llMaxValue;

    @NonNull
    public final LinearLayout llMinValue;

    @NonNull
    public final LinearLayout llMonitoringResultsValue;

    @NonNull
    public final RelativeLayout loading;

    @NonNull
    public final DINCondBold maxValue;

    @NonNull
    public final PFMedium maxValueTV;

    @NonNull
    public final PFMedium maxValueUnit;

    @NonNull
    public final DINCondBold minValue;

    @NonNull
    public final PFMedium minValueTV;

    @NonNull
    public final PFMedium minValueUnit;

    @NonNull
    public final DINCondBold monitoringResultsValue;

    @NonNull
    public final ImageButton nextTime;

    @NonNull
    public final PFMedium nowTime;

    @NonNull
    public final DINCondBold nowTimeDetails;

    @NonNull
    public final DINCondBold nowValue;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final NestedScrollView scrollView;

    @NonNull
    public final PFMedium valueUnit;

    private FragmentStatusBloodGlucoseMonthBinding(@NonNull LinearLayout rootView, @NonNull DINCondBold avValue, @NonNull PFMedium avValueTV, @NonNull PFMedium avValueUnit, @NonNull ImageButton beforeTime, @NonNull LinearLayout dataContent, @NonNull ImageView image, @NonNull LineChart lineChart, @NonNull LinearLayout llAvgValue, @NonNull LinearLayout llMaxValue, @NonNull LinearLayout llMinValue, @NonNull LinearLayout llMonitoringResultsValue, @NonNull RelativeLayout loading, @NonNull DINCondBold maxValue, @NonNull PFMedium maxValueTV, @NonNull PFMedium maxValueUnit, @NonNull DINCondBold minValue, @NonNull PFMedium minValueTV, @NonNull PFMedium minValueUnit, @NonNull DINCondBold monitoringResultsValue, @NonNull ImageButton nextTime, @NonNull PFMedium nowTime, @NonNull DINCondBold nowTimeDetails, @NonNull DINCondBold nowValue, @NonNull NestedScrollView scrollView, @NonNull PFMedium valueUnit) {
        this.rootView = rootView;
        this.avValue = avValue;
        this.avValueTV = avValueTV;
        this.avValueUnit = avValueUnit;
        this.beforeTime = beforeTime;
        this.dataContent = dataContent;
        this.image = image;
        this.lineChart = lineChart;
        this.llAvgValue = llAvgValue;
        this.llMaxValue = llMaxValue;
        this.llMinValue = llMinValue;
        this.llMonitoringResultsValue = llMonitoringResultsValue;
        this.loading = loading;
        this.maxValue = maxValue;
        this.maxValueTV = maxValueTV;
        this.maxValueUnit = maxValueUnit;
        this.minValue = minValue;
        this.minValueTV = minValueTV;
        this.minValueUnit = minValueUnit;
        this.monitoringResultsValue = monitoringResultsValue;
        this.nextTime = nextTime;
        this.nowTime = nowTime;
        this.nowTimeDetails = nowTimeDetails;
        this.nowValue = nowValue;
        this.scrollView = scrollView;
        this.valueUnit = valueUnit;
    }

    @NonNull
    public static FragmentStatusBloodGlucoseMonthBinding bind(@NonNull View rootView) {
        int r1 = R.id.avValue;
        DINCondBold r5 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.avValue);
        if (r5 == null) goto L55;
        r1 = R.id.avValueTV;
        PFMedium r6 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.avValueTV);
        if (r6 == null) goto L55;
        r1 = R.id.avValueUnit;
        PFMedium r7 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.avValueUnit);
        if (r7 == null) goto L55;
        r1 = R.id.beforeTime;
        ImageButton r8 = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.beforeTime);
        if (r8 == null) goto L55;
        r1 = R.id.dataContent;
        LinearLayout r9 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.dataContent);
        if (r9 == null) goto L55;
        r1 = R.id.image;
        ImageView r10 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.image);
        if (r10 == null) goto L55;
        r1 = R.id.lineChart;
        LineChart r11 = (LineChart) ViewBindings.findChildViewById(rootView, R.id.lineChart);
        if (r11 == null) goto L55;
        r1 = R.id.ll_avg_value;
        LinearLayout r12 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_avg_value);
        if (r12 == null) goto L55;
        r1 = R.id.ll_max_value;
        LinearLayout r13 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_max_value);
        if (r13 == null) goto L55;
        r1 = R.id.ll_min_value;
        LinearLayout r14 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_min_value);
        if (r14 == null) goto L55;
        r1 = R.id.ll_monitoring_results_value;
        LinearLayout r15 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_monitoring_results_value);
        if (r15 == null) goto L55;
        r1 = R.id.loading;
        RelativeLayout r16 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.loading);
        if (r16 == null) goto L55;
        r1 = R.id.maxValue;
        DINCondBold r17 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.maxValue);
        if (r17 == null) goto L55;
        r1 = R.id.maxValueTV;
        PFMedium r18 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.maxValueTV);
        if (r18 == null) goto L55;
        r1 = R.id.maxValueUnit;
        PFMedium r19 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.maxValueUnit);
        if (r19 == null) goto L55;
        r1 = R.id.minValue;
        DINCondBold r20 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.minValue);
        if (r20 == null) goto L55;
        r1 = R.id.minValueTV;
        PFMedium r21 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.minValueTV);
        if (r21 == null) goto L55;
        r1 = R.id.minValueUnit;
        PFMedium r22 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.minValueUnit);
        if (r22 == null) goto L55;
        r1 = R.id.monitoring_results_value;
        DINCondBold r23 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.monitoring_results_value);
        if (r23 == null) goto L55;
        r1 = R.id.nextTime;
        ImageButton r24 = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.nextTime);
        if (r24 == null) goto L55;
        r1 = R.id.nowTime;
        PFMedium r25 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.nowTime);
        if (r25 == null) goto L55;
        r1 = R.id.nowTimeDetails;
        DINCondBold r26 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.nowTimeDetails);
        if (r26 == null) goto L55;
        r1 = R.id.nowValue;
        DINCondBold r27 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.nowValue);
        if (r27 == null) goto L55;
        r1 = R.id.scrollView;
        NestedScrollView r28 = (NestedScrollView) ViewBindings.findChildViewById(rootView, R.id.scrollView);
        if (r28 == null) goto L55;
        r1 = R.id.valueUnit;
        PFMedium r29 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.valueUnit);
        if (r29 == null) goto L55;
        return new FragmentStatusBloodGlucoseMonthBinding((LinearLayout) rootView, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29);
    L55:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r1)));
    }

    @NonNull
    public static FragmentStatusBloodGlucoseMonthBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static FragmentStatusBloodGlucoseMonthBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.fragment_status_blood_glucose_month, parent, false);
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
