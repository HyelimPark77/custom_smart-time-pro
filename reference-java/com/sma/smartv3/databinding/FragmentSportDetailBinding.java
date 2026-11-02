package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.widget.NestedScrollView;
import androidx.gridlayout.widget.GridLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class FragmentSportDetailBinding implements ViewBinding {

    @NonNull
    public final LinearLayout airpressurePanel;

    @NonNull
    public final LinearLayout altitudePanel;

    @NonNull
    public final LinearLayout caloriesPanel;

    @NonNull
    public final LinearLayout distancePanel;

    /* JADX INFO: renamed from: gl */
    @NonNull
    public final GridLayout f51120gl;

    @NonNull
    public final LinearLayout hrPanel;

    @NonNull
    public final LinearLayout pacePanel;

    @NonNull
    public final LinearLayout pressurePanel;

    @NonNull
    public final NestedScrollView rootView;

    @NonNull
    private final NestedScrollView rootView_;

    @NonNull
    public final LinearLayout speedPanel;

    @NonNull
    public final LinearLayout spmPanel;

    @NonNull
    public final LinearLayout stepPanel;

    @NonNull
    public final PFMedium tvAirpressureUnit;

    @NonNull
    public final PFMedium tvAirpressureValue;

    @NonNull
    public final PFMedium tvAltitudeUnit;

    @NonNull
    public final PFMedium tvAltitudeValue;

    @NonNull
    public final PFMedium tvCaloriesValue;

    @NonNull
    public final PFMedium tvDateTime;

    @NonNull
    public final PFMedium tvDistanceUnit;

    @NonNull
    public final PFMedium tvDistanceValue;

    @NonNull
    public final PFMedium tvDuration;

    @NonNull
    public final PFMedium tvHrValue;

    @NonNull
    public final PFMedium tvPaceUnit;

    @NonNull
    public final PFMedium tvPaceValue;

    @NonNull
    public final PFMedium tvPressureValue;

    @NonNull
    public final PFMedium tvSpeedUnit;

    @NonNull
    public final PFMedium tvSpeedValue;

    @NonNull
    public final PFMedium tvSpmValue;

    @NonNull
    public final PFMedium tvStepValue;

    private FragmentSportDetailBinding(@NonNull NestedScrollView rootView_, @NonNull LinearLayout airpressurePanel, @NonNull LinearLayout altitudePanel, @NonNull LinearLayout caloriesPanel, @NonNull LinearLayout distancePanel, @NonNull GridLayout gl, @NonNull LinearLayout hrPanel, @NonNull LinearLayout pacePanel, @NonNull LinearLayout pressurePanel, @NonNull NestedScrollView rootView, @NonNull LinearLayout speedPanel, @NonNull LinearLayout spmPanel, @NonNull LinearLayout stepPanel, @NonNull PFMedium tvAirpressureUnit, @NonNull PFMedium tvAirpressureValue, @NonNull PFMedium tvAltitudeUnit, @NonNull PFMedium tvAltitudeValue, @NonNull PFMedium tvCaloriesValue, @NonNull PFMedium tvDateTime, @NonNull PFMedium tvDistanceUnit, @NonNull PFMedium tvDistanceValue, @NonNull PFMedium tvDuration, @NonNull PFMedium tvHrValue, @NonNull PFMedium tvPaceUnit, @NonNull PFMedium tvPaceValue, @NonNull PFMedium tvPressureValue, @NonNull PFMedium tvSpeedUnit, @NonNull PFMedium tvSpeedValue, @NonNull PFMedium tvSpmValue, @NonNull PFMedium tvStepValue) {
        this.rootView_ = rootView_;
        this.airpressurePanel = airpressurePanel;
        this.altitudePanel = altitudePanel;
        this.caloriesPanel = caloriesPanel;
        this.distancePanel = distancePanel;
        this.f51120gl = gl;
        this.hrPanel = hrPanel;
        this.pacePanel = pacePanel;
        this.pressurePanel = pressurePanel;
        this.rootView = rootView;
        this.speedPanel = speedPanel;
        this.spmPanel = spmPanel;
        this.stepPanel = stepPanel;
        this.tvAirpressureUnit = tvAirpressureUnit;
        this.tvAirpressureValue = tvAirpressureValue;
        this.tvAltitudeUnit = tvAltitudeUnit;
        this.tvAltitudeValue = tvAltitudeValue;
        this.tvCaloriesValue = tvCaloriesValue;
        this.tvDateTime = tvDateTime;
        this.tvDistanceUnit = tvDistanceUnit;
        this.tvDistanceValue = tvDistanceValue;
        this.tvDuration = tvDuration;
        this.tvHrValue = tvHrValue;
        this.tvPaceUnit = tvPaceUnit;
        this.tvPaceValue = tvPaceValue;
        this.tvPressureValue = tvPressureValue;
        this.tvSpeedUnit = tvSpeedUnit;
        this.tvSpeedValue = tvSpeedValue;
        this.tvSpmValue = tvSpmValue;
        this.tvStepValue = tvStepValue;
    }

    @NonNull
    public static FragmentSportDetailBinding bind(@NonNull View rootView) {
        int i = R.id.airpressure_panel;
        LinearLayout linearLayout = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.airpressure_panel);
        if (linearLayout != null) {
            i = R.id.altitude_panel;
            LinearLayout linearLayout2 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.altitude_panel);
            if (linearLayout2 != null) {
                i = R.id.calories_panel;
                LinearLayout linearLayout3 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.calories_panel);
                if (linearLayout3 != null) {
                    i = R.id.distance_panel;
                    LinearLayout linearLayout4 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.distance_panel);
                    if (linearLayout4 != null) {
                        i = R.id.f51416gl;
                        GridLayout gridLayout = (GridLayout) ViewBindings.findChildViewById(rootView, R.id.f51416gl);
                        if (gridLayout != null) {
                            i = R.id.hr_panel;
                            LinearLayout linearLayout5 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.hr_panel);
                            if (linearLayout5 != null) {
                                i = R.id.pace_panel;
                                LinearLayout linearLayout6 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.pace_panel);
                                if (linearLayout6 != null) {
                                    i = R.id.pressure_panel;
                                    LinearLayout linearLayout7 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.pressure_panel);
                                    if (linearLayout7 != null) {
                                        NestedScrollView nestedScrollView = (NestedScrollView) rootView;
                                        i = R.id.speed_panel;
                                        LinearLayout linearLayout8 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.speed_panel);
                                        if (linearLayout8 != null) {
                                            i = R.id.spm_panel;
                                            LinearLayout linearLayout9 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.spm_panel);
                                            if (linearLayout9 != null) {
                                                i = R.id.step_panel;
                                                LinearLayout linearLayout10 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.step_panel);
                                                if (linearLayout10 != null) {
                                                    i = R.id.tv_airpressure_unit;
                                                    PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_airpressure_unit);
                                                    if (pFMedium != null) {
                                                        i = R.id.tv_airpressure_value;
                                                        PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_airpressure_value);
                                                        if (pFMedium2 != null) {
                                                            i = R.id.tv_altitude_unit;
                                                            PFMedium pFMedium3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_altitude_unit);
                                                            if (pFMedium3 != null) {
                                                                i = R.id.tv_altitude_value;
                                                                PFMedium pFMedium4 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_altitude_value);
                                                                if (pFMedium4 != null) {
                                                                    i = R.id.tv_calories_value;
                                                                    PFMedium pFMedium5 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_calories_value);
                                                                    if (pFMedium5 != null) {
                                                                        i = R.id.tv_dateTime;
                                                                        PFMedium pFMedium6 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_dateTime);
                                                                        if (pFMedium6 != null) {
                                                                            i = R.id.tv_distance_unit;
                                                                            PFMedium pFMedium7 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_distance_unit);
                                                                            if (pFMedium7 != null) {
                                                                                i = R.id.tv_distance_value;
                                                                                PFMedium pFMedium8 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_distance_value);
                                                                                if (pFMedium8 != null) {
                                                                                    i = R.id.tv_duration;
                                                                                    PFMedium pFMedium9 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_duration);
                                                                                    if (pFMedium9 != null) {
                                                                                        i = R.id.tv_hr_value;
                                                                                        PFMedium pFMedium10 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_hr_value);
                                                                                        if (pFMedium10 != null) {
                                                                                            i = R.id.tv_pace_unit;
                                                                                            PFMedium pFMedium11 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_pace_unit);
                                                                                            if (pFMedium11 != null) {
                                                                                                i = R.id.tv_pace_value;
                                                                                                PFMedium pFMedium12 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_pace_value);
                                                                                                if (pFMedium12 != null) {
                                                                                                    i = R.id.tv_pressure_value;
                                                                                                    PFMedium pFMedium13 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_pressure_value);
                                                                                                    if (pFMedium13 != null) {
                                                                                                        i = R.id.tv_speed_unit;
                                                                                                        PFMedium pFMedium14 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_speed_unit);
                                                                                                        if (pFMedium14 != null) {
                                                                                                            i = R.id.tv_speed_value;
                                                                                                            PFMedium pFMedium15 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_speed_value);
                                                                                                            if (pFMedium15 != null) {
                                                                                                                i = R.id.tv_spm_value;
                                                                                                                PFMedium pFMedium16 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_spm_value);
                                                                                                                if (pFMedium16 != null) {
                                                                                                                    i = R.id.tv_step_value;
                                                                                                                    PFMedium pFMedium17 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_step_value);
                                                                                                                    if (pFMedium17 != null) {
                                                                                                                        return new FragmentSportDetailBinding(nestedScrollView, linearLayout, linearLayout2, linearLayout3, linearLayout4, gridLayout, linearLayout5, linearLayout6, linearLayout7, nestedScrollView, linearLayout8, linearLayout9, linearLayout10, pFMedium, pFMedium2, pFMedium3, pFMedium4, pFMedium5, pFMedium6, pFMedium7, pFMedium8, pFMedium9, pFMedium10, pFMedium11, pFMedium12, pFMedium13, pFMedium14, pFMedium15, pFMedium16, pFMedium17);
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
    public static FragmentSportDetailBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static FragmentSportDetailBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.fragment_sport_detail, parent, false);
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
