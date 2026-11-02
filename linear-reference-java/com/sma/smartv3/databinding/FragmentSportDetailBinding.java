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

    @NonNull
    public final GridLayout gl;

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
        this.gl = gl;
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
        int r1 = R.id.airpressure_panel;
        LinearLayout r5 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.airpressure_panel);
        if (r5 == null) goto L61;
        r1 = R.id.altitude_panel;
        LinearLayout r6 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.altitude_panel);
        if (r6 == null) goto L61;
        r1 = R.id.calories_panel;
        LinearLayout r7 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.calories_panel);
        if (r7 == null) goto L61;
        r1 = R.id.distance_panel;
        LinearLayout r8 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.distance_panel);
        if (r8 == null) goto L61;
        r1 = R.id.gl;
        GridLayout r9 = (GridLayout) ViewBindings.findChildViewById(rootView, R.id.gl);
        if (r9 == null) goto L61;
        r1 = R.id.hr_panel;
        LinearLayout r10 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.hr_panel);
        if (r10 == null) goto L61;
        r1 = R.id.pace_panel;
        LinearLayout r11 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.pace_panel);
        if (r11 == null) goto L61;
        r1 = R.id.pressure_panel;
        LinearLayout r12 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.pressure_panel);
        if (r12 == null) goto L61;
        NestedScrollView r4 = (NestedScrollView) rootView;
        r1 = R.id.speed_panel;
        LinearLayout r14 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.speed_panel);
        if (r14 == null) goto L61;
        r1 = R.id.spm_panel;
        LinearLayout r15 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.spm_panel);
        if (r15 == null) goto L61;
        r1 = R.id.step_panel;
        LinearLayout r16 = (LinearLayout) ViewBindings.findChildViewById(rootView, R.id.step_panel);
        if (r16 == null) goto L61;
        r1 = R.id.tv_airpressure_unit;
        PFMedium r17 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_airpressure_unit);
        if (r17 == null) goto L61;
        r1 = R.id.tv_airpressure_value;
        PFMedium r18 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_airpressure_value);
        if (r18 == null) goto L61;
        r1 = R.id.tv_altitude_unit;
        PFMedium r19 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_altitude_unit);
        if (r19 == null) goto L61;
        r1 = R.id.tv_altitude_value;
        PFMedium r20 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_altitude_value);
        if (r20 == null) goto L61;
        r1 = R.id.tv_calories_value;
        PFMedium r21 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_calories_value);
        if (r21 == null) goto L61;
        r1 = R.id.tv_dateTime;
        PFMedium r22 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_dateTime);
        if (r22 == null) goto L61;
        r1 = R.id.tv_distance_unit;
        PFMedium r23 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_distance_unit);
        if (r23 == null) goto L61;
        r1 = R.id.tv_distance_value;
        PFMedium r24 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_distance_value);
        if (r24 == null) goto L61;
        r1 = R.id.tv_duration;
        PFMedium r25 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_duration);
        if (r25 == null) goto L61;
        r1 = R.id.tv_hr_value;
        PFMedium r26 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_hr_value);
        if (r26 == null) goto L61;
        r1 = R.id.tv_pace_unit;
        PFMedium r27 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_pace_unit);
        if (r27 == null) goto L61;
        r1 = R.id.tv_pace_value;
        PFMedium r28 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_pace_value);
        if (r28 == null) goto L61;
        r1 = R.id.tv_pressure_value;
        PFMedium r29 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_pressure_value);
        if (r29 == null) goto L61;
        r1 = R.id.tv_speed_unit;
        PFMedium r30 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_speed_unit);
        if (r30 == null) goto L61;
        r1 = R.id.tv_speed_value;
        PFMedium r31 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_speed_value);
        if (r31 == null) goto L61;
        r1 = R.id.tv_spm_value;
        PFMedium r32 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_spm_value);
        if (r32 == null) goto L61;
        r1 = R.id.tv_step_value;
        PFMedium r33 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_step_value);
        if (r33 == null) goto L61;
        return new FragmentSportDetailBinding(r4, r5, r6, r7, r8, r9, r10, r11, r12, r4, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33);
    L61:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r1)));
    }

    @NonNull
    public static FragmentSportDetailBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static FragmentSportDetailBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.fragment_sport_detail, parent, false);
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
