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
        int i = R.id.altitudeLineChart;
        LineChart lineChart = (LineChart) ViewBindings.findChildViewById(rootView, R.id.altitudeLineChart);
        if (lineChart != null) {
            i = R.id.altitude_panel;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.altitude_panel);
            if (linearLayout != null) {
                i = R.id.altitude_unit_tv;
                PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.altitude_unit_tv);
                if (pFMedium != null) {
                    i = R.id.ateLevel;
                    SegmentedBarView segmentedBarView = (SegmentedBarView) ViewBindings.findChildViewById(rootView, R.id.ateLevel);
                    if (segmentedBarView != null) {
                        i = R.id.cadence_avg_title;
                        PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.cadence_avg_title);
                        if (pFMedium2 != null) {
                            i = R.id.cadence_max_title;
                            PFMedium pFMedium3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.cadence_max_title);
                            if (pFMedium3 != null) {
                                i = R.id.cadence_max_title_unit;
                                PFMedium pFMedium4 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.cadence_max_title_unit);
                                if (pFMedium4 != null) {
                                    i = R.id.cadence_title;
                                    PFMedium pFMedium5 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.cadence_title);
                                    if (pFMedium5 != null) {
                                        i = R.id.device_img;
                                        ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.device_img);
                                        if (imageView != null) {
                                            i = R.id.device_name;
                                            PFMedium pFMedium6 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.device_name);
                                            if (pFMedium6 != null) {
                                                i = R.id.device_qr_code;
                                                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.device_qr_code);
                                                if (imageView2 != null) {
                                                    i = R.id.device_qr_code_ll;
                                                    LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.device_qr_code_ll);
                                                    if (linearLayout2 != null) {
                                                        i = R.id.device_sources;
                                                        LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.device_sources);
                                                        if (linearLayout3 != null) {
                                                            i = R.id.device_sport_detail_tip;
                                                            LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.device_sport_detail_tip);
                                                            if (linearLayout4 != null) {
                                                                i = R.id.hrLineChart;
                                                                LineChart lineChart2 = (LineChart) ViewBindings.findChildViewById(rootView, R.id.hrLineChart);
                                                                if (lineChart2 != null) {
                                                                    i = R.id.hr_panel;
                                                                    LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.hr_panel);
                                                                    if (linearLayout5 != null) {
                                                                        i = R.id.hrPieChart;
                                                                        PieChart pieChart = (PieChart) ViewBindings.findChildViewById(rootView, R.id.hrPieChart);
                                                                        if (pieChart != null) {
                                                                            i = R.id.ll_heart_rate_range;
                                                                            LinearLayout linearLayout6 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_heart_rate_range);
                                                                            if (linearLayout6 != null) {
                                                                                i = R.id.myPieChart;
                                                                                MyPieChart myPieChart = (MyPieChart) ViewBindings.findChildViewById(rootView, R.id.myPieChart);
                                                                                if (myPieChart != null) {
                                                                                    i = R.id.paceLineChart;
                                                                                    LineChart lineChart3 = (LineChart) ViewBindings.findChildViewById(rootView, R.id.paceLineChart);
                                                                                    if (lineChart3 != null) {
                                                                                        i = R.id.pace_panel;
                                                                                        LinearLayout linearLayout7 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.pace_panel);
                                                                                        if (linearLayout7 != null) {
                                                                                            i = R.id.pace_panel_unit;
                                                                                            PFMedium pFMedium7 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.pace_panel_unit);
                                                                                            if (pFMedium7 != null) {
                                                                                                i = R.id.pressureLineChart;
                                                                                                LineChart lineChart4 = (LineChart) ViewBindings.findChildViewById(rootView, R.id.pressureLineChart);
                                                                                                if (lineChart4 != null) {
                                                                                                    i = R.id.pressure_panel;
                                                                                                    LinearLayout linearLayout8 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.pressure_panel);
                                                                                                    if (linearLayout8 != null) {
                                                                                                        NestedScrollView nestedScrollView = (NestedScrollView) rootView;
                                                                                                        i = R.id.segmentation_detail_ll;
                                                                                                        LinearLayout linearLayout9 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.segmentation_detail_ll);
                                                                                                        if (linearLayout9 != null) {
                                                                                                            i = R.id.segmentation_detail_rl;
                                                                                                            RecyclerView recyclerView = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.segmentation_detail_rl);
                                                                                                            if (recyclerView != null) {
                                                                                                                i = R.id.segmentation_detail_title;
                                                                                                                PFMedium pFMedium8 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.segmentation_detail_title);
                                                                                                                if (pFMedium8 != null) {
                                                                                                                    i = R.id.speedLineChart;
                                                                                                                    LineChart lineChart5 = (LineChart) ViewBindings.findChildViewById(rootView, R.id.speedLineChart);
                                                                                                                    if (lineChart5 != null) {
                                                                                                                        i = R.id.speed_panel;
                                                                                                                        LinearLayout linearLayout10 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.speed_panel);
                                                                                                                        if (linearLayout10 != null) {
                                                                                                                            i = R.id.speed_panel_unit;
                                                                                                                            PFMedium pFMedium9 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.speed_panel_unit);
                                                                                                                            if (pFMedium9 != null) {
                                                                                                                                i = R.id.speed_per_kilometer_ll;
                                                                                                                                LinearLayout linearLayout11 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.speed_per_kilometer_ll);
                                                                                                                                if (linearLayout11 != null) {
                                                                                                                                    i = R.id.speed_per_kilometer_ll_unit;
                                                                                                                                    PFMedium pFMedium10 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.speed_per_kilometer_ll_unit);
                                                                                                                                    if (pFMedium10 != null) {
                                                                                                                                        i = R.id.speed_per_kilometer_rl;
                                                                                                                                        RecyclerView recyclerView2 = (RecyclerView) ViewBindings.findChildViewById(rootView, R.id.speed_per_kilometer_rl);
                                                                                                                                        if (recyclerView2 != null) {
                                                                                                                                            i = R.id.speed_per_kilometer_title;
                                                                                                                                            PFMedium pFMedium11 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.speed_per_kilometer_title);
                                                                                                                                            if (pFMedium11 != null) {
                                                                                                                                                i = R.id.spmLineChart;
                                                                                                                                                LineChart lineChart6 = (LineChart) ViewBindings.findChildViewById(rootView, R.id.spmLineChart);
                                                                                                                                                if (lineChart6 != null) {
                                                                                                                                                    i = R.id.spm_panel;
                                                                                                                                                    LinearLayout linearLayout12 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.spm_panel);
                                                                                                                                                    if (linearLayout12 != null) {
                                                                                                                                                        i = R.id.sport_goal_progressBar;
                                                                                                                                                        SportGoalProgressBar sportGoalProgressBar = (SportGoalProgressBar) ViewBindings.findChildViewById(rootView, R.id.sport_goal_progressBar);
                                                                                                                                                        if (sportGoalProgressBar != null) {
                                                                                                                                                            i = R.id.sport_maxvO2;
                                                                                                                                                            PFMedium pFMedium12 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.sport_maxvO2);
                                                                                                                                                            if (pFMedium12 != null) {
                                                                                                                                                                i = R.id.sport_maxvO2_level;
                                                                                                                                                                PFMedium pFMedium13 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.sport_maxvO2_level);
                                                                                                                                                                if (pFMedium13 != null) {
                                                                                                                                                                    i = R.id.sportRecordAerobic;
                                                                                                                                                                    DINCondBold dINCondBold = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.sportRecordAerobic);
                                                                                                                                                                    if (dINCondBold != null) {
                                                                                                                                                                        i = R.id.sportRecordAerobicRl;
                                                                                                                                                                        LinearLayout linearLayout13 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.sportRecordAerobicRl);
                                                                                                                                                                        if (linearLayout13 != null) {
                                                                                                                                                                            i = R.id.sportRecordAnaerobic;
                                                                                                                                                                            DINCondBold dINCondBold2 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.sportRecordAnaerobic);
                                                                                                                                                                            if (dINCondBold2 != null) {
                                                                                                                                                                                i = R.id.sportRecordAnaerobicRl;
                                                                                                                                                                                LinearLayout linearLayout14 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.sportRecordAnaerobicRl);
                                                                                                                                                                                if (linearLayout14 != null) {
                                                                                                                                                                                    i = R.id.sportRecordFatBurning;
                                                                                                                                                                                    DINCondBold dINCondBold3 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.sportRecordFatBurning);
                                                                                                                                                                                    if (dINCondBold3 != null) {
                                                                                                                                                                                        i = R.id.sportRecordFatBurningRl;
                                                                                                                                                                                        LinearLayout linearLayout15 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.sportRecordFatBurningRl);
                                                                                                                                                                                        if (linearLayout15 != null) {
                                                                                                                                                                                            i = R.id.sportRecordStrenuous;
                                                                                                                                                                                            DINCondBold dINCondBold4 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.sportRecordStrenuous);
                                                                                                                                                                                            if (dINCondBold4 != null) {
                                                                                                                                                                                                i = R.id.sportRecordStrenuousRl;
                                                                                                                                                                                                LinearLayout linearLayout16 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.sportRecordStrenuousRl);
                                                                                                                                                                                                if (linearLayout16 != null) {
                                                                                                                                                                                                    i = R.id.sportRecordWarmUp;
                                                                                                                                                                                                    DINCondBold dINCondBold5 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.sportRecordWarmUp);
                                                                                                                                                                                                    if (dINCondBold5 != null) {
                                                                                                                                                                                                        i = R.id.sportRecordWarmUpRl;
                                                                                                                                                                                                        LinearLayout linearLayout17 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.sportRecordWarmUpRl);
                                                                                                                                                                                                        if (linearLayout17 != null) {
                                                                                                                                                                                                            i = R.id.sport_recoveryTime;
                                                                                                                                                                                                            PFMedium pFMedium14 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.sport_recoveryTime);
                                                                                                                                                                                                            if (pFMedium14 != null) {
                                                                                                                                                                                                                i = R.id.sport_recoveryTime_estimate;
                                                                                                                                                                                                                PFMedium pFMedium15 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.sport_recoveryTime_estimate);
                                                                                                                                                                                                                if (pFMedium15 != null) {
                                                                                                                                                                                                                    i = R.id.sport_trainingLoad;
                                                                                                                                                                                                                    PFMedium pFMedium16 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.sport_trainingLoad);
                                                                                                                                                                                                                    if (pFMedium16 != null) {
                                                                                                                                                                                                                        i = R.id.training_experience_hint_tv;
                                                                                                                                                                                                                        PFMedium pFMedium17 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.training_experience_hint_tv);
                                                                                                                                                                                                                        if (pFMedium17 != null) {
                                                                                                                                                                                                                            i = R.id.training_experience_img_result;
                                                                                                                                                                                                                            ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.training_experience_img_result);
                                                                                                                                                                                                                            if (imageView3 != null) {
                                                                                                                                                                                                                                i = R.id.training_experience_layout;
                                                                                                                                                                                                                                LinearLayout linearLayout18 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.training_experience_layout);
                                                                                                                                                                                                                                if (linearLayout18 != null) {
                                                                                                                                                                                                                                    i = R.id.training_experience_layout_1;
                                                                                                                                                                                                                                    LinearLayout linearLayout19 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.training_experience_layout_1);
                                                                                                                                                                                                                                    if (linearLayout19 != null) {
                                                                                                                                                                                                                                        i = R.id.training_experience_layout_2;
                                                                                                                                                                                                                                        LinearLayout linearLayout20 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.training_experience_layout_2);
                                                                                                                                                                                                                                        if (linearLayout20 != null) {
                                                                                                                                                                                                                                            i = R.id.training_experience_layout_3;
                                                                                                                                                                                                                                            LinearLayout linearLayout21 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.training_experience_layout_3);
                                                                                                                                                                                                                                            if (linearLayout21 != null) {
                                                                                                                                                                                                                                                i = R.id.training_experience_layout_4;
                                                                                                                                                                                                                                                LinearLayout linearLayout22 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.training_experience_layout_4);
                                                                                                                                                                                                                                                if (linearLayout22 != null) {
                                                                                                                                                                                                                                                    i = R.id.training_experience_layout_5;
                                                                                                                                                                                                                                                    LinearLayout linearLayout23 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.training_experience_layout_5);
                                                                                                                                                                                                                                                    if (linearLayout23 != null) {
                                                                                                                                                                                                                                                        i = R.id.training_experience_layout_result;
                                                                                                                                                                                                                                                        LinearLayout linearLayout24 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.training_experience_layout_result);
                                                                                                                                                                                                                                                        if (linearLayout24 != null) {
                                                                                                                                                                                                                                                            i = R.id.training_experience_layout_select;
                                                                                                                                                                                                                                                            LinearLayout linearLayout25 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.training_experience_layout_select);
                                                                                                                                                                                                                                                            if (linearLayout25 != null) {
                                                                                                                                                                                                                                                                i = R.id.training_experience_tv_result;
                                                                                                                                                                                                                                                                PFMedium pFMedium18 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.training_experience_tv_result);
                                                                                                                                                                                                                                                                if (pFMedium18 != null) {
                                                                                                                                                                                                                                                                    i = R.id.training_performance_layout;
                                                                                                                                                                                                                                                                    RelativeLayout relativeLayout = (RelativeLayout) ViewBindings.findChildViewById(rootView, R.id.training_performance_layout);
                                                                                                                                                                                                                                                                    if (relativeLayout != null) {
                                                                                                                                                                                                                                                                        i = R.id.tv_avg_bpm_value;
                                                                                                                                                                                                                                                                        PFMedium pFMedium19 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_avg_bpm_value);
                                                                                                                                                                                                                                                                        if (pFMedium19 != null) {
                                                                                                                                                                                                                                                                            i = R.id.tv_avg_pace_value;
                                                                                                                                                                                                                                                                            PFMedium pFMedium20 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_avg_pace_value);
                                                                                                                                                                                                                                                                            if (pFMedium20 != null) {
                                                                                                                                                                                                                                                                                i = R.id.tv_avg_pressure_value;
                                                                                                                                                                                                                                                                                PFMedium pFMedium21 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_avg_pressure_value);
                                                                                                                                                                                                                                                                                if (pFMedium21 != null) {
                                                                                                                                                                                                                                                                                    i = R.id.tv_avg_speed_title;
                                                                                                                                                                                                                                                                                    PFMedium pFMedium22 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_avg_speed_title);
                                                                                                                                                                                                                                                                                    if (pFMedium22 != null) {
                                                                                                                                                                                                                                                                                        i = R.id.tv_avg_speed_value;
                                                                                                                                                                                                                                                                                        PFMedium pFMedium23 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_avg_speed_value);
                                                                                                                                                                                                                                                                                        if (pFMedium23 != null) {
                                                                                                                                                                                                                                                                                            i = R.id.tv_avg_spm_value;
                                                                                                                                                                                                                                                                                            PFMedium pFMedium24 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_avg_spm_value);
                                                                                                                                                                                                                                                                                            if (pFMedium24 != null) {
                                                                                                                                                                                                                                                                                                i = R.id.tv_fast_speed_value;
                                                                                                                                                                                                                                                                                                PFMedium pFMedium25 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_fast_speed_value);
                                                                                                                                                                                                                                                                                                if (pFMedium25 != null) {
                                                                                                                                                                                                                                                                                                    i = R.id.tv_heart_rate_range;
                                                                                                                                                                                                                                                                                                    PFRegular pFRegular = (PFRegular) ViewBindings.findChildViewById(rootView, R.id.tv_heart_rate_range);
                                                                                                                                                                                                                                                                                                    if (pFRegular != null) {
                                                                                                                                                                                                                                                                                                        i = R.id.tv_max_altitude_value;
                                                                                                                                                                                                                                                                                                        PFMedium pFMedium26 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_max_altitude_value);
                                                                                                                                                                                                                                                                                                        if (pFMedium26 != null) {
                                                                                                                                                                                                                                                                                                            i = R.id.tv_max_bpm_value;
                                                                                                                                                                                                                                                                                                            PFMedium pFMedium27 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_max_bpm_value);
                                                                                                                                                                                                                                                                                                            if (pFMedium27 != null) {
                                                                                                                                                                                                                                                                                                                i = R.id.tv_max_pressure_value;
                                                                                                                                                                                                                                                                                                                PFMedium pFMedium28 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_max_pressure_value);
                                                                                                                                                                                                                                                                                                                if (pFMedium28 != null) {
                                                                                                                                                                                                                                                                                                                    i = R.id.tv_max_spm_value;
                                                                                                                                                                                                                                                                                                                    PFMedium pFMedium29 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_max_spm_value);
                                                                                                                                                                                                                                                                                                                    if (pFMedium29 != null) {
                                                                                                                                                                                                                                                                                                                        i = R.id.tv_min_altitude_value;
                                                                                                                                                                                                                                                                                                                        PFMedium pFMedium30 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_min_altitude_value);
                                                                                                                                                                                                                                                                                                                        if (pFMedium30 != null) {
                                                                                                                                                                                                                                                                                                                            i = R.id.tv_min_pace_value;
                                                                                                                                                                                                                                                                                                                            PFMedium pFMedium31 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_min_pace_value);
                                                                                                                                                                                                                                                                                                                            if (pFMedium31 != null) {
                                                                                                                                                                                                                                                                                                                                i = R.id.tv_training_performance_explanation;
                                                                                                                                                                                                                                                                                                                                PFMedium pFMedium32 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_training_performance_explanation);
                                                                                                                                                                                                                                                                                                                                if (pFMedium32 != null) {
                                                                                                                                                                                                                                                                                                                                    i = R.id.understand_situation_cadence;
                                                                                                                                                                                                                                                                                                                                    ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.understand_situation_cadence);
                                                                                                                                                                                                                                                                                                                                    if (imageView4 != null) {
                                                                                                                                                                                                                                                                                                                                        return new FragmentSportDetailChartV2Binding(nestedScrollView, lineChart, linearLayout, pFMedium, segmentedBarView, pFMedium2, pFMedium3, pFMedium4, pFMedium5, imageView, pFMedium6, imageView2, linearLayout2, linearLayout3, linearLayout4, lineChart2, linearLayout5, pieChart, linearLayout6, myPieChart, lineChart3, linearLayout7, pFMedium7, lineChart4, linearLayout8, nestedScrollView, linearLayout9, recyclerView, pFMedium8, lineChart5, linearLayout10, pFMedium9, linearLayout11, pFMedium10, recyclerView2, pFMedium11, lineChart6, linearLayout12, sportGoalProgressBar, pFMedium12, pFMedium13, dINCondBold, linearLayout13, dINCondBold2, linearLayout14, dINCondBold3, linearLayout15, dINCondBold4, linearLayout16, dINCondBold5, linearLayout17, pFMedium14, pFMedium15, pFMedium16, pFMedium17, imageView3, linearLayout18, linearLayout19, linearLayout20, linearLayout21, linearLayout22, linearLayout23, linearLayout24, linearLayout25, pFMedium18, relativeLayout, pFMedium19, pFMedium20, pFMedium21, pFMedium22, pFMedium23, pFMedium24, pFMedium25, pFRegular, pFMedium26, pFMedium27, pFMedium28, pFMedium29, pFMedium30, pFMedium31, pFMedium32, imageView4);
                                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                        }
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                }
                                                                                                                                                                                                            }
                                                                                                                                                                                                        }
                                                                                                                                                                                                    }
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
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
    public static FragmentSportDetailChartV2Binding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentSportDetailChartV2Binding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_sport_detail_chart_v2, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public NestedScrollView getRoot() {
        return this.rootView_;
    }
}
