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
        int i = R.id.altitudeLineChart;
        LineChart lineChart = (LineChart) ViewBindings.findChildViewById(rootView, R.id.altitudeLineChart);
        if (lineChart != null) {
            i = R.id.altitude_panel;
            LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.altitude_panel);
            if (linearLayout != null) {
                i = R.id.altitude_unit_tv;
                PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.altitude_unit_tv);
                if (pFMedium != null) {
                    i = R.id.hrLineChart;
                    LineChart lineChart2 = (LineChart) ViewBindings.findChildViewById(rootView, R.id.hrLineChart);
                    if (lineChart2 != null) {
                        i = R.id.hr_panel;
                        LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.hr_panel);
                        if (linearLayout2 != null) {
                            i = R.id.hrPieChart;
                            PieChart pieChart = (PieChart) ViewBindings.findChildViewById(rootView, R.id.hrPieChart);
                            if (pieChart != null) {
                                i = R.id.ll_heart_rate_range;
                                LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.ll_heart_rate_range);
                                if (linearLayout3 != null) {
                                    i = R.id.paceLineChart;
                                    LineChart lineChart3 = (LineChart) ViewBindings.findChildViewById(rootView, R.id.paceLineChart);
                                    if (lineChart3 != null) {
                                        i = R.id.pace_panel;
                                        LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.pace_panel);
                                        if (linearLayout4 != null) {
                                            i = R.id.pressureLineChart;
                                            LineChart lineChart4 = (LineChart) ViewBindings.findChildViewById(rootView, R.id.pressureLineChart);
                                            if (lineChart4 != null) {
                                                i = R.id.pressure_panel;
                                                LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.pressure_panel);
                                                if (linearLayout5 != null) {
                                                    NestedScrollView nestedScrollView = (NestedScrollView) rootView;
                                                    i = R.id.speedLineChart;
                                                    LineChart lineChart5 = (LineChart) ViewBindings.findChildViewById(rootView, R.id.speedLineChart);
                                                    if (lineChart5 != null) {
                                                        i = R.id.speed_panel;
                                                        LinearLayout linearLayout6 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.speed_panel);
                                                        if (linearLayout6 != null) {
                                                            i = R.id.spmLineChart;
                                                            LineChart lineChart6 = (LineChart) ViewBindings.findChildViewById(rootView, R.id.spmLineChart);
                                                            if (lineChart6 != null) {
                                                                i = R.id.spm_panel;
                                                                LinearLayout linearLayout7 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.spm_panel);
                                                                if (linearLayout7 != null) {
                                                                    i = R.id.sportRecordAerobic;
                                                                    DINCondBold dINCondBold = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.sportRecordAerobic);
                                                                    if (dINCondBold != null) {
                                                                        i = R.id.sportRecordAerobicRl;
                                                                        LinearLayout linearLayout8 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.sportRecordAerobicRl);
                                                                        if (linearLayout8 != null) {
                                                                            i = R.id.sportRecordAnaerobic;
                                                                            DINCondBold dINCondBold2 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.sportRecordAnaerobic);
                                                                            if (dINCondBold2 != null) {
                                                                                i = R.id.sportRecordAnaerobicRl;
                                                                                LinearLayout linearLayout9 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.sportRecordAnaerobicRl);
                                                                                if (linearLayout9 != null) {
                                                                                    i = R.id.sportRecordFatBurning;
                                                                                    DINCondBold dINCondBold3 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.sportRecordFatBurning);
                                                                                    if (dINCondBold3 != null) {
                                                                                        i = R.id.sportRecordFatBurningRl;
                                                                                        LinearLayout linearLayout10 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.sportRecordFatBurningRl);
                                                                                        if (linearLayout10 != null) {
                                                                                            i = R.id.sportRecordStrenuous;
                                                                                            DINCondBold dINCondBold4 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.sportRecordStrenuous);
                                                                                            if (dINCondBold4 != null) {
                                                                                                i = R.id.sportRecordStrenuousRl;
                                                                                                LinearLayout linearLayout11 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.sportRecordStrenuousRl);
                                                                                                if (linearLayout11 != null) {
                                                                                                    i = R.id.sportRecordWarmUp;
                                                                                                    DINCondBold dINCondBold5 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.sportRecordWarmUp);
                                                                                                    if (dINCondBold5 != null) {
                                                                                                        i = R.id.sportRecordWarmUpRl;
                                                                                                        LinearLayout linearLayout12 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.sportRecordWarmUpRl);
                                                                                                        if (linearLayout12 != null) {
                                                                                                            i = R.id.tv_avg_bpm_value;
                                                                                                            PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_avg_bpm_value);
                                                                                                            if (pFMedium2 != null) {
                                                                                                                i = R.id.tv_avg_pace_value;
                                                                                                                PFMedium pFMedium3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_avg_pace_value);
                                                                                                                if (pFMedium3 != null) {
                                                                                                                    i = R.id.tv_avg_pressure_value;
                                                                                                                    PFMedium pFMedium4 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_avg_pressure_value);
                                                                                                                    if (pFMedium4 != null) {
                                                                                                                        i = R.id.tv_avg_speed_title;
                                                                                                                        PFMedium pFMedium5 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_avg_speed_title);
                                                                                                                        if (pFMedium5 != null) {
                                                                                                                            i = R.id.tv_avg_speed_value;
                                                                                                                            PFMedium pFMedium6 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_avg_speed_value);
                                                                                                                            if (pFMedium6 != null) {
                                                                                                                                i = R.id.tv_avg_spm_value;
                                                                                                                                PFMedium pFMedium7 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_avg_spm_value);
                                                                                                                                if (pFMedium7 != null) {
                                                                                                                                    i = R.id.tv_fast_speed_value;
                                                                                                                                    PFMedium pFMedium8 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_fast_speed_value);
                                                                                                                                    if (pFMedium8 != null) {
                                                                                                                                        i = R.id.tv_heart_rate_range;
                                                                                                                                        PFRegular pFRegular = (PFRegular) ViewBindings.findChildViewById(rootView, R.id.tv_heart_rate_range);
                                                                                                                                        if (pFRegular != null) {
                                                                                                                                            i = R.id.tv_max_altitude_value;
                                                                                                                                            PFMedium pFMedium9 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_max_altitude_value);
                                                                                                                                            if (pFMedium9 != null) {
                                                                                                                                                i = R.id.tv_max_bpm_value;
                                                                                                                                                PFMedium pFMedium10 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_max_bpm_value);
                                                                                                                                                if (pFMedium10 != null) {
                                                                                                                                                    i = R.id.tv_max_pressure_value;
                                                                                                                                                    PFMedium pFMedium11 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_max_pressure_value);
                                                                                                                                                    if (pFMedium11 != null) {
                                                                                                                                                        i = R.id.tv_max_spm_value;
                                                                                                                                                        PFMedium pFMedium12 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_max_spm_value);
                                                                                                                                                        if (pFMedium12 != null) {
                                                                                                                                                            i = R.id.tv_min_altitude_value;
                                                                                                                                                            PFMedium pFMedium13 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_min_altitude_value);
                                                                                                                                                            if (pFMedium13 != null) {
                                                                                                                                                                i = R.id.tv_min_pace_value;
                                                                                                                                                                PFMedium pFMedium14 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_min_pace_value);
                                                                                                                                                                if (pFMedium14 != null) {
                                                                                                                                                                    return new FragmentSportDetailChartBinding(nestedScrollView, lineChart, linearLayout, pFMedium, lineChart2, linearLayout2, pieChart, linearLayout3, lineChart3, linearLayout4, lineChart4, linearLayout5, nestedScrollView, lineChart5, linearLayout6, lineChart6, linearLayout7, dINCondBold, linearLayout8, dINCondBold2, linearLayout9, dINCondBold3, linearLayout10, dINCondBold4, linearLayout11, dINCondBold5, linearLayout12, pFMedium2, pFMedium3, pFMedium4, pFMedium5, pFMedium6, pFMedium7, pFMedium8, pFRegular, pFMedium9, pFMedium10, pFMedium11, pFMedium12, pFMedium13, pFMedium14);
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
    public static FragmentSportDetailChartBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentSportDetailChartBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_sport_detail_chart, parent, false);
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
