package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.github.mikephil.charting.charts.LineChart;
import com.github.mikephil.charting.charts.PieChart;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.MyPieChart;
import com.sma.smartv3.view.SportGoalProgressBar;
import com.sma.smartv3.view.segmentedbar.SegmentedBarView;
import com.sma.smartv3.view.text.DINCondBold;
import com.sma.smartv3.view.text.PFMedium;
import com.sma.smartv3.view.text.PFRegular;

/* JADX INFO: loaded from: classes19.dex */
public final class FragmentSportDetailChartV2Binding implements ViewBinding {

    @NonNull
    public final LineChart altitudeLineChart;

    @NonNull
    public final LinearLayout altitudePanel;

    @NonNull
    public final PFMedium altitudeUnitTv;

    @NonNull
    public final SegmentedBarView ateLevel;

    @NonNull
    public final PFMedium cadenceAvgTitle;

    @NonNull
    public final PFMedium cadenceMaxTitle;

    @NonNull
    public final PFMedium cadenceMaxTitleUnit;

    @NonNull
    public final PFMedium cadenceTitle;

    @NonNull
    public final ImageView deviceImg;

    @NonNull
    public final PFMedium deviceName;

    @NonNull
    public final ImageView deviceQrCode;

    @NonNull
    public final LinearLayout deviceQrCodeLl;

    @NonNull
    public final LinearLayout deviceSources;

    @NonNull
    public final LinearLayout deviceSportDetailTip;

    @NonNull
    public final LineChart hrLineChart;

    @NonNull
    public final LinearLayout hrPanel;

    @NonNull
    public final PieChart hrPieChart;

    @NonNull
    public final LinearLayout llHeartRateRange;

    @NonNull
    public final MyPieChart myPieChart;

    @NonNull
    public final LineChart paceLineChart;

    @NonNull
    public final LinearLayout pacePanel;

    @NonNull
    public final PFMedium pacePanelUnit;

    @NonNull
    public final LineChart pressureLineChart;

    @NonNull
    public final LinearLayout pressurePanel;

    @NonNull
    public final NestedScrollView rootView;

    @NonNull
    private final NestedScrollView rootView_;

    @NonNull
    public final LinearLayout segmentationDetailLl;

    @NonNull
    public final RecyclerView segmentationDetailRl;

    @NonNull
    public final PFMedium segmentationDetailTitle;

    @NonNull
    public final LineChart speedLineChart;

    @NonNull
    public final LinearLayout speedPanel;

    @NonNull
    public final PFMedium speedPanelUnit;

    @NonNull
    public final LinearLayout speedPerKilometerLl;

    @NonNull
    public final PFMedium speedPerKilometerLlUnit;

    @NonNull
    public final RecyclerView speedPerKilometerRl;

    @NonNull
    public final PFMedium speedPerKilometerTitle;

    @NonNull
    public final LineChart spmLineChart;

    @NonNull
    public final LinearLayout spmPanel;

    @NonNull
    public final SportGoalProgressBar sportGoalProgressBar;

    @NonNull
    public final PFMedium sportMaxvO2;

    @NonNull
    public final PFMedium sportMaxvO2Level;

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
    public final PFMedium sportRecoveryTime;

    @NonNull
    public final PFMedium sportRecoveryTimeEstimate;

    @NonNull
    public final PFMedium sportTrainingLoad;

    @NonNull
    public final PFMedium trainingExperienceHintTv;

    @NonNull
    public final ImageView trainingExperienceImgResult;

    @NonNull
    public final LinearLayout trainingExperienceLayout;

    @NonNull
    public final LinearLayout trainingExperienceLayout1;

    @NonNull
    public final LinearLayout trainingExperienceLayout2;

    @NonNull
    public final LinearLayout trainingExperienceLayout3;

    @NonNull
    public final LinearLayout trainingExperienceLayout4;

    @NonNull
    public final LinearLayout trainingExperienceLayout5;

    @NonNull
    public final LinearLayout trainingExperienceLayoutResult;

    @NonNull
    public final LinearLayout trainingExperienceLayoutSelect;

    @NonNull
    public final PFMedium trainingExperienceTvResult;

    @NonNull
    public final RelativeLayout trainingPerformanceLayout;

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

    @NonNull
    public final PFMedium tvTrainingPerformanceExplanation;

    @NonNull
    public final ImageView understandSituationCadence;

    private FragmentSportDetailChartV2Binding(@NonNull NestedScrollView rootView_, @NonNull LineChart altitudeLineChart, @NonNull LinearLayout altitudePanel, @NonNull PFMedium altitudeUnitTv, @NonNull SegmentedBarView ateLevel, @NonNull PFMedium cadenceAvgTitle, @NonNull PFMedium cadenceMaxTitle, @NonNull PFMedium cadenceMaxTitleUnit, @NonNull PFMedium cadenceTitle, @NonNull ImageView deviceImg, @NonNull PFMedium deviceName, @NonNull ImageView deviceQrCode, @NonNull LinearLayout deviceQrCodeLl, @NonNull LinearLayout deviceSources, @NonNull LinearLayout deviceSportDetailTip, @NonNull LineChart hrLineChart, @NonNull LinearLayout hrPanel, @NonNull PieChart hrPieChart, @NonNull LinearLayout llHeartRateRange, @NonNull MyPieChart myPieChart, @NonNull LineChart paceLineChart, @NonNull LinearLayout pacePanel, @NonNull PFMedium pacePanelUnit, @NonNull LineChart pressureLineChart, @NonNull LinearLayout pressurePanel, @NonNull NestedScrollView rootView, @NonNull LinearLayout segmentationDetailLl, @NonNull RecyclerView segmentationDetailRl, @NonNull PFMedium segmentationDetailTitle, @NonNull LineChart speedLineChart, @NonNull LinearLayout speedPanel, @NonNull PFMedium speedPanelUnit, @NonNull LinearLayout speedPerKilometerLl, @NonNull PFMedium speedPerKilometerLlUnit, @NonNull RecyclerView speedPerKilometerRl, @NonNull PFMedium speedPerKilometerTitle, @NonNull LineChart spmLineChart, @NonNull LinearLayout spmPanel, @NonNull SportGoalProgressBar sportGoalProgressBar, @NonNull PFMedium sportMaxvO2, @NonNull PFMedium sportMaxvO2Level, @NonNull DINCondBold sportRecordAerobic, @NonNull LinearLayout sportRecordAerobicRl, @NonNull DINCondBold sportRecordAnaerobic, @NonNull LinearLayout sportRecordAnaerobicRl, @NonNull DINCondBold sportRecordFatBurning, @NonNull LinearLayout sportRecordFatBurningRl, @NonNull DINCondBold sportRecordStrenuous, @NonNull LinearLayout sportRecordStrenuousRl, @NonNull DINCondBold sportRecordWarmUp, @NonNull LinearLayout sportRecordWarmUpRl, @NonNull PFMedium sportRecoveryTime, @NonNull PFMedium sportRecoveryTimeEstimate, @NonNull PFMedium sportTrainingLoad, @NonNull PFMedium trainingExperienceHintTv, @NonNull ImageView trainingExperienceImgResult, @NonNull LinearLayout trainingExperienceLayout, @NonNull LinearLayout trainingExperienceLayout1, @NonNull LinearLayout trainingExperienceLayout2, @NonNull LinearLayout trainingExperienceLayout3, @NonNull LinearLayout trainingExperienceLayout4, @NonNull LinearLayout trainingExperienceLayout5, @NonNull LinearLayout trainingExperienceLayoutResult, @NonNull LinearLayout trainingExperienceLayoutSelect, @NonNull PFMedium trainingExperienceTvResult, @NonNull RelativeLayout trainingPerformanceLayout, @NonNull PFMedium tvAvgBpmValue, @NonNull PFMedium tvAvgPaceValue, @NonNull PFMedium tvAvgPressureValue, @NonNull PFMedium tvAvgSpeedTitle, @NonNull PFMedium tvAvgSpeedValue, @NonNull PFMedium tvAvgSpmValue, @NonNull PFMedium tvFastSpeedValue, @NonNull PFRegular tvHeartRateRange, @NonNull PFMedium tvMaxAltitudeValue, @NonNull PFMedium tvMaxBpmValue, @NonNull PFMedium tvMaxPressureValue, @NonNull PFMedium tvMaxSpmValue, @NonNull PFMedium tvMinAltitudeValue, @NonNull PFMedium tvMinPaceValue, @NonNull PFMedium tvTrainingPerformanceExplanation, @NonNull ImageView understandSituationCadence) {
        this.rootView_ = rootView_;
        this.altitudeLineChart = altitudeLineChart;
        this.altitudePanel = altitudePanel;
        this.altitudeUnitTv = altitudeUnitTv;
        this.ateLevel = ateLevel;
        this.cadenceAvgTitle = cadenceAvgTitle;
        this.cadenceMaxTitle = cadenceMaxTitle;
        this.cadenceMaxTitleUnit = cadenceMaxTitleUnit;
        this.cadenceTitle = cadenceTitle;
        this.deviceImg = deviceImg;
        this.deviceName = deviceName;
        this.deviceQrCode = deviceQrCode;
        this.deviceQrCodeLl = deviceQrCodeLl;
        this.deviceSources = deviceSources;
        this.deviceSportDetailTip = deviceSportDetailTip;
        this.hrLineChart = hrLineChart;
        this.hrPanel = hrPanel;
        this.hrPieChart = hrPieChart;
        this.llHeartRateRange = llHeartRateRange;
        this.myPieChart = myPieChart;
        this.paceLineChart = paceLineChart;
        this.pacePanel = pacePanel;
        this.pacePanelUnit = pacePanelUnit;
        this.pressureLineChart = pressureLineChart;
        this.pressurePanel = pressurePanel;
        this.rootView = rootView;
        this.segmentationDetailLl = segmentationDetailLl;
        this.segmentationDetailRl = segmentationDetailRl;
        this.segmentationDetailTitle = segmentationDetailTitle;
        this.speedLineChart = speedLineChart;
        this.speedPanel = speedPanel;
        this.speedPanelUnit = speedPanelUnit;
        this.speedPerKilometerLl = speedPerKilometerLl;
        this.speedPerKilometerLlUnit = speedPerKilometerLlUnit;
        this.speedPerKilometerRl = speedPerKilometerRl;
        this.speedPerKilometerTitle = speedPerKilometerTitle;
        this.spmLineChart = spmLineChart;
        this.spmPanel = spmPanel;
        this.sportGoalProgressBar = sportGoalProgressBar;
        this.sportMaxvO2 = sportMaxvO2;
        this.sportMaxvO2Level = sportMaxvO2Level;
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
        this.sportRecoveryTime = sportRecoveryTime;
        this.sportRecoveryTimeEstimate = sportRecoveryTimeEstimate;
        this.sportTrainingLoad = sportTrainingLoad;
        this.trainingExperienceHintTv = trainingExperienceHintTv;
        this.trainingExperienceImgResult = trainingExperienceImgResult;
        this.trainingExperienceLayout = trainingExperienceLayout;
        this.trainingExperienceLayout1 = trainingExperienceLayout1;
        this.trainingExperienceLayout2 = trainingExperienceLayout2;
        this.trainingExperienceLayout3 = trainingExperienceLayout3;
        this.trainingExperienceLayout4 = trainingExperienceLayout4;
        this.trainingExperienceLayout5 = trainingExperienceLayout5;
        this.trainingExperienceLayoutResult = trainingExperienceLayoutResult;
        this.trainingExperienceLayoutSelect = trainingExperienceLayoutSelect;
        this.trainingExperienceTvResult = trainingExperienceTvResult;
        this.trainingPerformanceLayout = trainingPerformanceLayout;
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
        this.tvTrainingPerformanceExplanation = tvTrainingPerformanceExplanation;
        this.understandSituationCadence = understandSituationCadence;
    }

    @NonNull
    public static FragmentSportDetailChartV2Binding bind(@NonNull View rootView) {
        int r1 = R.id.altitudeLineChart;
        LineChart r5 = (LineChart) ViewBindings.findChildViewById(rootView, R.id.altitudeLineChart);
        if (r5 == null) goto L165;
        r1 = R.id.altitude_panel;
        LinearLayout r6 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.altitude_panel);
        if (r6 == null) goto L165;
        r1 = R.id.altitude_unit_tv;
        PFMedium r7 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.altitude_unit_tv);
        if (r7 == null) goto L165;
        r1 = R.id.ateLevel;
        SegmentedBarView r8 = (SegmentedBarView) ViewBindings.findChildViewById(rootView, R.id.ateLevel);
        if (r8 == null) goto L165;
        r1 = R.id.cadence_avg_title;
        PFMedium r9 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.cadence_avg_title);
        if (r9 == null) goto L165;
        r1 = R.id.cadence_max_title;
        PFMedium r10 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.cadence_max_title);
        if (r10 == null) goto L165;
        r1 = R.id.cadence_max_title_unit;
        PFMedium r11 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.cadence_max_title_unit);
        if (r11 == null) goto L165;
        r1 = R.id.cadence_title;
        PFMedium r12 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.cadence_title);
        if (r12 == null) goto L165;
        r1 = R.id.device_img;
        ImageView r13 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.device_img);
        if (r13 == null) goto L165;
        r1 = R.id.device_name;
        PFMedium r14 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.device_name);
        if (r14 == null) goto L165;
        r1 = R.id.device_qr_code;
        ImageView r15 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.device_qr_code);
        if (r15 == null) goto L165;
        r1 = R.id.device_qr_code_ll;
        LinearLayout r16 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.device_qr_code_ll);
        if (r16 == null) goto L165;
        r1 = R.id.device_sources;
        LinearLayout r17 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.device_sources);
        if (r17 == null) goto L165;
        r1 = R.id.device_sport_detail_tip;
        LinearLayout r18 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.device_sport_detail_tip);
        if (r18 == null) goto L165;
        r1 = R.id.hrLineChart;
        LineChart r19 = (LineChart) ViewBindings.findChildViewById(rootView, R.id.hrLineChart);
        if (r19 == null) goto L165;
        r1 = R.id.hr_panel;
        LinearLayout r20 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.hr_panel);
        if (r20 == null) goto L165;
        r1 = R.id.hrPieChart;
        PieChart r21 = (PieChart) ViewBindings.findChildViewById(rootView, R.id.hrPieChart);
        if (r21 == null) goto L165;
        r1 = R.id.ll_heart_rate_range;
        LinearLayout r22 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_heart_rate_range);
        if (r22 == null) goto L165;
        r1 = R.id.myPieChart;
        MyPieChart r23 = (MyPieChart) ViewBindings.findChildViewById(rootView, R.id.myPieChart);
        if (r23 == null) goto L165;
        r1 = R.id.paceLineChart;
        LineChart r24 = (LineChart) ViewBindings.findChildViewById(rootView, R.id.paceLineChart);
        if (r24 == null) goto L165;
        r1 = R.id.pace_panel;
        LinearLayout r25 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.pace_panel);
        if (r25 == null) goto L165;
        r1 = R.id.pace_panel_unit;
        PFMedium r26 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.pace_panel_unit);
        if (r26 == null) goto L165;
        r1 = R.id.pressureLineChart;
        LineChart r27 = (LineChart) ViewBindings.findChildViewById(rootView, R.id.pressureLineChart);
        if (r27 == null) goto L165;
        r1 = R.id.pressure_panel;
        LinearLayout r28 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.pressure_panel);
        if (r28 == null) goto L165;
        NestedScrollView r4 = (NestedScrollView) rootView;
        r1 = R.id.segmentation_detail_ll;
        LinearLayout r30 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.segmentation_detail_ll);
        if (r30 == null) goto L165;
        r1 = R.id.segmentation_detail_rl;
        RecyclerView r31 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.segmentation_detail_rl);
        if (r31 == null) goto L165;
        r1 = R.id.segmentation_detail_title;
        PFMedium r32 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.segmentation_detail_title);
        if (r32 == null) goto L165;
        r1 = R.id.speedLineChart;
        LineChart r33 = (LineChart) ViewBindings.findChildViewById(rootView, R.id.speedLineChart);
        if (r33 == null) goto L165;
        r1 = R.id.speed_panel;
        LinearLayout r34 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.speed_panel);
        if (r34 == null) goto L165;
        r1 = R.id.speed_panel_unit;
        PFMedium r35 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.speed_panel_unit);
        if (r35 == null) goto L165;
        r1 = R.id.speed_per_kilometer_ll;
        LinearLayout r36 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.speed_per_kilometer_ll);
        if (r36 == null) goto L165;
        r1 = R.id.speed_per_kilometer_ll_unit;
        PFMedium r37 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.speed_per_kilometer_ll_unit);
        if (r37 == null) goto L165;
        r1 = R.id.speed_per_kilometer_rl;
        RecyclerView r38 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.speed_per_kilometer_rl);
        if (r38 == null) goto L165;
        r1 = R.id.speed_per_kilometer_title;
        PFMedium r39 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.speed_per_kilometer_title);
        if (r39 == null) goto L165;
        r1 = R.id.spmLineChart;
        LineChart r40 = (LineChart) ViewBindings.findChildViewById(rootView, R.id.spmLineChart);
        if (r40 == null) goto L165;
        r1 = R.id.spm_panel;
        LinearLayout r41 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.spm_panel);
        if (r41 == null) goto L165;
        r1 = R.id.sport_goal_progressBar;
        SportGoalProgressBar r42 = (SportGoalProgressBar) ViewBindings.findChildViewById(rootView, R.id.sport_goal_progressBar);
        if (r42 == null) goto L165;
        r1 = R.id.sport_maxvO2;
        PFMedium r43 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.sport_maxvO2);
        if (r43 == null) goto L165;
        r1 = R.id.sport_maxvO2_level;
        PFMedium r44 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.sport_maxvO2_level);
        if (r44 == null) goto L165;
        r1 = R.id.sportRecordAerobic;
        DINCondBold r45 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.sportRecordAerobic);
        if (r45 == null) goto L165;
        r1 = R.id.sportRecordAerobicRl;
        LinearLayout r46 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.sportRecordAerobicRl);
        if (r46 == null) goto L165;
        r1 = R.id.sportRecordAnaerobic;
        DINCondBold r47 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.sportRecordAnaerobic);
        if (r47 == null) goto L165;
        r1 = R.id.sportRecordAnaerobicRl;
        LinearLayout r48 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.sportRecordAnaerobicRl);
        if (r48 == null) goto L165;
        r1 = R.id.sportRecordFatBurning;
        DINCondBold r49 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.sportRecordFatBurning);
        if (r49 == null) goto L165;
        r1 = R.id.sportRecordFatBurningRl;
        LinearLayout r50 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.sportRecordFatBurningRl);
        if (r50 == null) goto L165;
        r1 = R.id.sportRecordStrenuous;
        DINCondBold r51 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.sportRecordStrenuous);
        if (r51 == null) goto L165;
        r1 = R.id.sportRecordStrenuousRl;
        LinearLayout r52 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.sportRecordStrenuousRl);
        if (r52 == null) goto L165;
        r1 = R.id.sportRecordWarmUp;
        DINCondBold r53 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.sportRecordWarmUp);
        if (r53 == null) goto L165;
        r1 = R.id.sportRecordWarmUpRl;
        LinearLayout r54 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.sportRecordWarmUpRl);
        if (r54 == null) goto L165;
        r1 = R.id.sport_recoveryTime;
        PFMedium r55 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.sport_recoveryTime);
        if (r55 == null) goto L165;
        r1 = R.id.sport_recoveryTime_estimate;
        PFMedium r56 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.sport_recoveryTime_estimate);
        if (r56 == null) goto L165;
        r1 = R.id.sport_trainingLoad;
        PFMedium r57 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.sport_trainingLoad);
        if (r57 == null) goto L165;
        r1 = R.id.training_experience_hint_tv;
        PFMedium r58 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.training_experience_hint_tv);
        if (r58 == null) goto L165;
        r1 = R.id.training_experience_img_result;
        ImageView r59 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.training_experience_img_result);
        if (r59 == null) goto L165;
        r1 = R.id.training_experience_layout;
        LinearLayout r60 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.training_experience_layout);
        if (r60 == null) goto L165;
        r1 = R.id.training_experience_layout_1;
        LinearLayout r61 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.training_experience_layout_1);
        if (r61 == null) goto L165;
        r1 = R.id.training_experience_layout_2;
        LinearLayout r62 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.training_experience_layout_2);
        if (r62 == null) goto L165;
        r1 = R.id.training_experience_layout_3;
        LinearLayout r63 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.training_experience_layout_3);
        if (r63 == null) goto L165;
        r1 = R.id.training_experience_layout_4;
        LinearLayout r64 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.training_experience_layout_4);
        if (r64 == null) goto L165;
        r1 = R.id.training_experience_layout_5;
        LinearLayout r65 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.training_experience_layout_5);
        if (r65 == null) goto L165;
        r1 = R.id.training_experience_layout_result;
        LinearLayout r66 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.training_experience_layout_result);
        if (r66 == null) goto L165;
        r1 = R.id.training_experience_layout_select;
        LinearLayout r67 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.training_experience_layout_select);
        if (r67 == null) goto L165;
        r1 = R.id.training_experience_tv_result;
        PFMedium r68 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.training_experience_tv_result);
        if (r68 == null) goto L165;
        r1 = R.id.training_performance_layout;
        RelativeLayout r69 = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.training_performance_layout);
        if (r69 == null) goto L165;
        r1 = R.id.tv_avg_bpm_value;
        PFMedium r70 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_avg_bpm_value);
        if (r70 == null) goto L165;
        r1 = R.id.tv_avg_pace_value;
        PFMedium r71 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_avg_pace_value);
        if (r71 == null) goto L165;
        r1 = R.id.tv_avg_pressure_value;
        PFMedium r72 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_avg_pressure_value);
        if (r72 == null) goto L165;
        r1 = R.id.tv_avg_speed_title;
        PFMedium r73 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_avg_speed_title);
        if (r73 == null) goto L165;
        r1 = R.id.tv_avg_speed_value;
        PFMedium r74 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_avg_speed_value);
        if (r74 == null) goto L165;
        r1 = R.id.tv_avg_spm_value;
        PFMedium r75 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_avg_spm_value);
        if (r75 == null) goto L165;
        r1 = R.id.tv_fast_speed_value;
        PFMedium r76 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_fast_speed_value);
        if (r76 == null) goto L165;
        r1 = R.id.tv_heart_rate_range;
        PFRegular r77 = (PFRegular) ViewBindings.findChildViewById(rootView, R.id.tv_heart_rate_range);
        if (r77 == null) goto L165;
        r1 = R.id.tv_max_altitude_value;
        PFMedium r78 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_max_altitude_value);
        if (r78 == null) goto L165;
        r1 = R.id.tv_max_bpm_value;
        PFMedium r79 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_max_bpm_value);
        if (r79 == null) goto L165;
        r1 = R.id.tv_max_pressure_value;
        PFMedium r80 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_max_pressure_value);
        if (r80 == null) goto L165;
        r1 = R.id.tv_max_spm_value;
        PFMedium r81 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_max_spm_value);
        if (r81 == null) goto L165;
        r1 = R.id.tv_min_altitude_value;
        PFMedium r82 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_min_altitude_value);
        if (r82 == null) goto L165;
        r1 = R.id.tv_min_pace_value;
        PFMedium r83 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_min_pace_value);
        if (r83 == null) goto L165;
        r1 = R.id.tv_training_performance_explanation;
        PFMedium r84 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_training_performance_explanation);
        if (r84 == null) goto L165;
        r1 = R.id.understand_situation_cadence;
        ImageView r85 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.understand_situation_cadence);
        if (r85 == null) goto L165;
        return new FragmentSportDetailChartV2Binding(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r4, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r84, r85);
    L165:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r1)));
    }

    @NonNull
    public static FragmentSportDetailChartV2Binding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static FragmentSportDetailChartV2Binding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.fragment_sport_detail_chart_v2, parent, false);
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
