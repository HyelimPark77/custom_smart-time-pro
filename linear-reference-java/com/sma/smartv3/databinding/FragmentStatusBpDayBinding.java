package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.github.mikephil.charting.charts.BarChart;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.DINCondBold;
import com.sma.smartv3.view.text.PFMedium;
import com.sma.smartv3.view.text.PFRegular;

/* JADX INFO: loaded from: classes19.dex */
public final class FragmentStatusBpDayBinding implements ViewBinding {

    @NonNull
    public final BarChart barChart;

    @NonNull
    public final ImageButton beforeTime;

    @NonNull
    public final Button btnCalibration;

    @NonNull
    public final LinearLayout calibrationPanel;

    @NonNull
    public final LinearLayout dataContent;

    @NonNull
    public final DINCondBold dbpAvgValue;

    @NonNull
    public final DINCondBold dbpValue;

    @NonNull
    public final ImageView image;

    @NonNull
    public final RelativeLayout loading;

    @NonNull
    public final View measureView;

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
    public final DINCondBold sbpAvgValue;

    @NonNull
    public final DINCondBold sbpValue;

    @NonNull
    public final NestedScrollView scrollView;

    @NonNull
    public final PFRegular tvHigh;

    @NonNull
    public final PFRegular tvLow;

    @NonNull
    public final PFMedium valueUnit;

    private FragmentStatusBpDayBinding(@NonNull LinearLayout rootView, @NonNull BarChart barChart, @NonNull ImageButton beforeTime, @NonNull Button btnCalibration, @NonNull LinearLayout calibrationPanel, @NonNull LinearLayout dataContent, @NonNull DINCondBold dbpAvgValue, @NonNull DINCondBold dbpValue, @NonNull ImageView image, @NonNull RelativeLayout loading, @NonNull View measureView, @NonNull ImageButton nextTime, @NonNull PFMedium nowTime, @NonNull DINCondBold nowTimeDetails, @NonNull DINCondBold nowValue, @NonNull DINCondBold sbpAvgValue, @NonNull DINCondBold sbpValue, @NonNull NestedScrollView scrollView, @NonNull PFRegular tvHigh, @NonNull PFRegular tvLow, @NonNull PFMedium valueUnit) {
        this.rootView = rootView;
        this.barChart = barChart;
        this.beforeTime = beforeTime;
        this.btnCalibration = btnCalibration;
        this.calibrationPanel = calibrationPanel;
        this.dataContent = dataContent;
        this.dbpAvgValue = dbpAvgValue;
        this.dbpValue = dbpValue;
        this.image = image;
        this.loading = loading;
        this.measureView = measureView;
        this.nextTime = nextTime;
        this.nowTime = nowTime;
        this.nowTimeDetails = nowTimeDetails;
        this.nowValue = nowValue;
        this.sbpAvgValue = sbpAvgValue;
        this.sbpValue = sbpValue;
        this.scrollView = scrollView;
        this.tvHigh = tvHigh;
        this.tvLow = tvLow;
        this.valueUnit = valueUnit;
    }

    @NonNull
    public static FragmentStatusBpDayBinding bind(@NonNull View rootView) {
        int r1 = R.id.barChart;
        BarChart r5 = (BarChart) ViewBindings.findChildViewById(rootView, R.id.barChart);
        if (r5 == null) goto L45;
        r1 = R.id.beforeTime;
        ImageButton r6 = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.beforeTime);
        if (r6 == null) goto L45;
        r1 = R.id.btn_calibration;
        Button r7 = (Button) ViewBindings.findChildViewById(rootView, R.id.btn_calibration);
        if (r7 == null) goto L45;
        r1 = R.id.calibration_panel;
        LinearLayout r8 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.calibration_panel);
        if (r8 == null) goto L45;
        r1 = R.id.dataContent;
        LinearLayout r9 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.dataContent);
        if (r9 == null) goto L45;
        r1 = R.id.dbpAvgValue;
        DINCondBold r10 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.dbpAvgValue);
        if (r10 == null) goto L45;
        r1 = R.id.dbpValue;
        DINCondBold r11 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.dbpValue);
        if (r11 == null) goto L45;
        r1 = R.id.image;
        ImageView r12 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.image);
        if (r12 == null) goto L45;
        r1 = R.id.loading;
        RelativeLayout r13 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.loading);
        if (r13 == null) goto L45;
        r1 = R.id.measure_view;
        View r14 = ViewBindings.findChildViewById(rootView, R.id.measure_view);
        if (r14 == null) goto L45;
        r1 = R.id.nextTime;
        ImageButton r15 = (ImageButton) ViewBindings.findChildViewById(rootView, R.id.nextTime);
        if (r15 == null) goto L45;
        r1 = R.id.nowTime;
        PFMedium r16 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.nowTime);
        if (r16 == null) goto L45;
        r1 = R.id.nowTimeDetails;
        DINCondBold r17 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.nowTimeDetails);
        if (r17 == null) goto L45;
        r1 = R.id.nowValue;
        DINCondBold r18 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.nowValue);
        if (r18 == null) goto L45;
        r1 = R.id.sbpAvgValue;
        DINCondBold r19 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.sbpAvgValue);
        if (r19 == null) goto L45;
        r1 = R.id.sbpValue;
        DINCondBold r20 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.sbpValue);
        if (r20 == null) goto L45;
        r1 = R.id.scrollView;
        NestedScrollView r21 = (NestedScrollView) ViewBindings.findChildViewById(rootView, R.id.scrollView);
        if (r21 == null) goto L45;
        r1 = R.id.tv_high;
        PFRegular r22 = (PFRegular) ViewBindings.findChildViewById(rootView, R.id.tv_high);
        if (r22 == null) goto L45;
        r1 = R.id.tv_low;
        PFRegular r23 = (PFRegular) ViewBindings.findChildViewById(rootView, R.id.tv_low);
        if (r23 == null) goto L45;
        r1 = R.id.valueUnit;
        PFMedium r24 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.valueUnit);
        if (r24 == null) goto L45;
        return new FragmentStatusBpDayBinding((LinearLayout) rootView, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24);
    L45:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r1)));
    }

    @NonNull
    public static FragmentStatusBpDayBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static FragmentStatusBpDayBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.fragment_status_bp_day, parent, false);
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
