package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.charts.PieChart;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.DINCondBold;
import com.sma.smartv3.view.text.PFMedium;
import com.sma.smartv3.view.text.PFRegular;

/* JADX INFO: loaded from: classes19.dex */
public final class FragmentSportDetailChartBinding implements ViewBinding {

    @NonNull
    public final LineChart altitudeLineChart;

    @NonNull
    public final LinearLayout altitudePanel;

    @NonNull
    public final PFMedium altitudeUnitTv;

    @NonNull
    public final LineChart hrLineChart;

    @NonNull
    public final LinearLayout hrPanel;

    @NonNull
    public final PieChart hrPieChart;

    @NonNull
    public final LinearLayout llHeartRateRange;

    @NonNull
    public final LineChart paceLineChart;

    @NonNull
    public final LinearLayout pacePanel;

    @NonNull
    public final LineChart pressureLineChart;

    @NonNull
    public final LinearLayout pressurePanel;

    @NonNull
    public final NestedScrollView rootView;

    @NonNull
    private final NestedScrollView rootView_;

    @NonNull
    public final LineChart speedLineChart;

    @NonNull
    public final LinearLayout speedPanel;

    @NonNull
    public final LineChart spmLineChart;

    @NonNull
    public final LinearLayout spmPanel;

    @NonNull
    public final DINCondBold sportRecordAerobic;

    @NonNull
    public final LinearLayout sportRecordAerobicRl;

    @NonNull
    public final DINCondBold sportRecordAnaerobic;

    @NonNull
    public final LinearLayout sportRecordAnaerobicRl;

    @NonNull
    public final DINCondBold sportRecordFatBurning;

    @NonNull
    public final LinearLayout sportRecordFatBurningRl;

    @NonNull
    public final DINCondBold sportRecordStrenuous;

    @NonNull
    public final LinearLayout sportRecordStrenuousRl;

    @NonNull
    public final DINCondBold sportRecordWarmUp;

    @NonNull
    public final LinearLayout sportRecordWarmUpRl;

    @NonNull
    public final PFMedium tvAvgBpmValue;

    @NonNull
    public final PFMedium tvAvgPaceValue;

    @NonNull
    public final PFMedium tvAvgPressureValue;

    @NonNull
    public final PFMedium tvAvgSpeedTitle;

    @NonNull
    public final PFMedium tvAvgSpeedValue;

    @NonNull
    public final PFMedium tvAvgSpmValue;

    @NonNull
    public final PFMedium tvFastSpeedValue;

    @NonNull
    public final PFRegular tvHeartRateRange;

    @NonNull
    public final PFMedium tvMaxAltitudeValue;

    @NonNull
    public final PFMedium tvMaxBpmValue;

    @NonNull
    public final PFMedium tvMaxPressureValue;

    @NonNull
    public final PFMedium tvMaxSpmValue;

    @NonNull
    public final PFMedium tvMinAltitudeValue;

    @NonNull
    public final PFMedium tvMinPaceValue;

    private FragmentSportDetailChartBinding(@NonNull NestedScrollView rootView_, @NonNull LineChart altitudeLineChart, @NonNull LinearLayout altitudePanel, @NonNull PFMedium altitudeUnitTv, @NonNull LineChart hrLineChart, @NonNull LinearLayout hrPanel, @NonNull PieChart hrPieChart, @NonNull LinearLayout llHeartRateRange, @NonNull LineChart paceLineChart, @NonNull LinearLayout pacePanel, @NonNull LineChart pressureLineChart, @NonNull LinearLayout pressurePanel, @NonNull NestedScrollView rootView, @NonNull LineChart speedLineChart, @NonNull LinearLayout speedPanel, @NonNull LineChart spmLineChart, @NonNull LinearLayout spmPanel, @NonNull DINCondBold sportRecordAerobic, @NonNull LinearLayout sportRecordAerobicRl, @NonNull DINCondBold sportRecordAnaerobic, @NonNull LinearLayout sportRecordAnaerobicRl, @NonNull DINCondBold sportRecordFatBurning, @NonNull LinearLayout sportRecordFatBurningRl, @NonNull DINCondBold sportRecordStrenuous, @NonNull LinearLayout sportRecordStrenuousRl, @NonNull DINCondBold sportRecordWarmUp, @NonNull LinearLayout sportRecordWarmUpRl, @NonNull PFMedium tvAvgBpmValue, @NonNull PFMedium tvAvgPaceValue, @NonNull PFMedium tvAvgPressureValue, @NonNull PFMedium tvAvgSpeedTitle, @NonNull PFMedium tvAvgSpeedValue, @NonNull PFMedium tvAvgSpmValue, @NonNull PFMedium tvFastSpeedValue, @NonNull PFRegular tvHeartRateRange, @NonNull PFMedium tvMaxAltitudeValue, @NonNull PFMedium tvMaxBpmValue, @NonNull PFMedium tvMaxPressureValue, @NonNull PFMedium tvMaxSpmValue, @NonNull PFMedium tvMinAltitudeValue, @NonNull PFMedium tvMinPaceValue) {
        this.rootView_ = rootView_;
        this.altitudeLineChart = altitudeLineChart;
        this.altitudePanel = altitudePanel;
        this.altitudeUnitTv = altitudeUnitTv;
        this.hrLineChart = hrLineChart;
        this.hrPanel = hrPanel;
        this.hrPieChart = hrPieChart;
        this.llHeartRateRange = llHeartRateRange;
        this.paceLineChart = paceLineChart;
        this.pacePanel = pacePanel;
        this.pressureLineChart = pressureLineChart;
        this.pressurePanel = pressurePanel;
        this.rootView = rootView;
        this.speedLineChart = speedLineChart;
        this.speedPanel = speedPanel;
        this.spmLineChart = spmLineChart;
        this.spmPanel = spmPanel;
        this.sportRecordAerobic = sportRecordAerobic;
        this.sportRecordAerobicRl = sportRecordAerobicRl;
        this.sportRecordAnaerobic = sportRecordAnaerobic;
        this.sportRecordAnaerobicRl = sportRecordAnaerobicRl;
        this.sportRecordFatBurning = sportRecordFatBurning;
        this.sportRecordFatBurningRl = sportRecordFatBurningRl;
        this.sportRecordStrenuous = sportRecordStrenuous;
        this.sportRecordStrenuousRl = sportRecordStrenuousRl;
        this.sportRecordWarmUp = sportRecordWarmUp;
        this.sportRecordWarmUpRl = sportRecordWarmUpRl;
        this.tvAvgBpmValue = tvAvgBpmValue;
        this.tvAvgPaceValue = tvAvgPaceValue;
        this.tvAvgPressureValue = tvAvgPressureValue;
        this.tvAvgSpeedTitle = tvAvgSpeedTitle;
        this.tvAvgSpeedValue = tvAvgSpeedValue;
        this.tvAvgSpmValue = tvAvgSpmValue;
        this.tvFastSpeedValue = tvFastSpeedValue;
        this.tvHeartRateRange = tvHeartRateRange;
        this.tvMaxAltitudeValue = tvMaxAltitudeValue;
        this.tvMaxBpmValue = tvMaxBpmValue;
        this.tvMaxPressureValue = tvMaxPressureValue;
        this.tvMaxSpmValue = tvMaxSpmValue;
        this.tvMinAltitudeValue = tvMinAltitudeValue;
        this.tvMinPaceValue = tvMinPaceValue;
    }

    @NonNull
    public static FragmentSportDetailChartBinding bind(@NonNull View rootView) {
        int r1 = R.id.altitudeLineChart;
        LineChart r5 = (LineChart) ViewBindings.findChildViewById(rootView, R.id.altitudeLineChart);
        if (r5 == null) goto L83;
        r1 = R.id.altitude_panel;
        LinearLayout r6 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.altitude_panel);
        if (r6 == null) goto L83;
        r1 = R.id.altitude_unit_tv;
        PFMedium r7 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.altitude_unit_tv);
        if (r7 == null) goto L83;
        r1 = R.id.hrLineChart;
        LineChart r8 = (LineChart) ViewBindings.findChildViewById(rootView, R.id.hrLineChart);
        if (r8 == null) goto L83;
        r1 = R.id.hr_panel;
        LinearLayout r9 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.hr_panel);
        if (r9 == null) goto L83;
        r1 = R.id.hrPieChart;
        PieChart r10 = (PieChart) ViewBindings.findChildViewById(rootView, R.id.hrPieChart);
        if (r10 == null) goto L83;
        r1 = R.id.ll_heart_rate_range;
        LinearLayout r11 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_heart_rate_range);
        if (r11 == null) goto L83;
        r1 = R.id.paceLineChart;
        LineChart r12 = (LineChart) ViewBindings.findChildViewById(rootView, R.id.paceLineChart);
        if (r12 == null) goto L83;
        r1 = R.id.pace_panel;
        LinearLayout r13 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.pace_panel);
        if (r13 == null) goto L83;
        r1 = R.id.pressureLineChart;
        LineChart r14 = (LineChart) ViewBindings.findChildViewById(rootView, R.id.pressureLineChart);
        if (r14 == null) goto L83;
        r1 = R.id.pressure_panel;
        LinearLayout r15 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.pressure_panel);
        if (r15 == null) goto L83;
        NestedScrollView r4 = (NestedScrollView) rootView;
        r1 = R.id.speedLineChart;
        LineChart r17 = (LineChart) ViewBindings.findChildViewById(rootView, R.id.speedLineChart);
        if (r17 == null) goto L83;
        r1 = R.id.speed_panel;
        LinearLayout r18 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.speed_panel);
        if (r18 == null) goto L83;
        r1 = R.id.spmLineChart;
        LineChart r19 = (LineChart) ViewBindings.findChildViewById(rootView, R.id.spmLineChart);
        if (r19 == null) goto L83;
        r1 = R.id.spm_panel;
        LinearLayout r20 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.spm_panel);
        if (r20 == null) goto L83;
        r1 = R.id.sportRecordAerobic;
        DINCondBold r21 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.sportRecordAerobic);
        if (r21 == null) goto L83;
        r1 = R.id.sportRecordAerobicRl;
        LinearLayout r22 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.sportRecordAerobicRl);
        if (r22 == null) goto L83;
        r1 = R.id.sportRecordAnaerobic;
        DINCondBold r23 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.sportRecordAnaerobic);
        if (r23 == null) goto L83;
        r1 = R.id.sportRecordAnaerobicRl;
        LinearLayout r24 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.sportRecordAnaerobicRl);
        if (r24 == null) goto L83;
        r1 = R.id.sportRecordFatBurning;
        DINCondBold r25 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.sportRecordFatBurning);
        if (r25 == null) goto L83;
        r1 = R.id.sportRecordFatBurningRl;
        LinearLayout r26 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.sportRecordFatBurningRl);
        if (r26 == null) goto L83;
        r1 = R.id.sportRecordStrenuous;
        DINCondBold r27 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.sportRecordStrenuous);
        if (r27 == null) goto L83;
        r1 = R.id.sportRecordStrenuousRl;
        LinearLayout r28 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.sportRecordStrenuousRl);
        if (r28 == null) goto L83;
        r1 = R.id.sportRecordWarmUp;
        DINCondBold r29 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.sportRecordWarmUp);
        if (r29 == null) goto L83;
        r1 = R.id.sportRecordWarmUpRl;
        LinearLayout r30 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.sportRecordWarmUpRl);
        if (r30 == null) goto L83;
        r1 = R.id.tv_avg_bpm_value;
        PFMedium r31 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_avg_bpm_value);
        if (r31 == null) goto L83;
        r1 = R.id.tv_avg_pace_value;
        PFMedium r32 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_avg_pace_value);
        if (r32 == null) goto L83;
        r1 = R.id.tv_avg_pressure_value;
        PFMedium r33 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_avg_pressure_value);
        if (r33 == null) goto L83;
        r1 = R.id.tv_avg_speed_title;
        PFMedium r34 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_avg_speed_title);
        if (r34 == null) goto L83;
        r1 = R.id.tv_avg_speed_value;
        PFMedium r35 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_avg_speed_value);
        if (r35 == null) goto L83;
        r1 = R.id.tv_avg_spm_value;
        PFMedium r36 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_avg_spm_value);
        if (r36 == null) goto L83;
        r1 = R.id.tv_fast_speed_value;
        PFMedium r37 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_fast_speed_value);
        if (r37 == null) goto L83;
        r1 = R.id.tv_heart_rate_range;
        PFRegular r38 = (PFRegular) ViewBindings.findChildViewById(rootView, R.id.tv_heart_rate_range);
        if (r38 == null) goto L83;
        r1 = R.id.tv_max_altitude_value;
        PFMedium r39 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_max_altitude_value);
        if (r39 == null) goto L83;
        r1 = R.id.tv_max_bpm_value;
        PFMedium r40 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_max_bpm_value);
        if (r40 == null) goto L83;
        r1 = R.id.tv_max_pressure_value;
        PFMedium r41 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_max_pressure_value);
        if (r41 == null) goto L83;
        r1 = R.id.tv_max_spm_value;
        PFMedium r42 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_max_spm_value);
        if (r42 == null) goto L83;
        r1 = R.id.tv_min_altitude_value;
        PFMedium r43 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_min_altitude_value);
        if (r43 == null) goto L83;
        r1 = R.id.tv_min_pace_value;
        PFMedium r44 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_min_pace_value);
        if (r44 == null) goto L83;
        return new FragmentSportDetailChartBinding(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r4, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44);
    L83:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r1)));
    }

    @NonNull
    public static FragmentSportDetailChartBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static FragmentSportDetailChartBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.fragment_sport_detail_chart, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.rootView_;
    }
}
