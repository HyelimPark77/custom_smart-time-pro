package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityDeveloperBinding implements ViewBinding {

    @NonNull
    public final AppCompatButton btnOta;

    @NonNull
    public final AppCompatButton btnOtaFromConfig;

    @NonNull
    public final AppCompatCheckBox checkShowAd;

    @NonNull
    public final EditText etAlipayAddress;

    @NonNull
    public final EditText etDrinkWater;

    @NonNull
    public final EditText etHrMonitoring;

    @NonNull
    public final EditText etMtu;

    @NonNull
    public final EditText etSedentariness;

    @NonNull
    public final EditText etStepGoal;

    @NonNull
    public final EditText etTemperatureValue;

    @NonNull
    public final EditText etWeatherForecast;

    @NonNull
    public final EditText etWeatherRealtime;

    @NonNull
    public final LinearLayout rootView;

    @NonNull
    private final LinearLayout rootView_;

    @NonNull
    public final TextView tvLocationInfo;

    @NonNull
    public final TextView tvOpenRuntimeLog;

    @NonNull
    public final TextView tvVersion;

    private ActivityDeveloperBinding(@NonNull LinearLayout rootView_, @NonNull AppCompatButton btnOta, @NonNull AppCompatButton btnOtaFromConfig, @NonNull AppCompatCheckBox checkShowAd, @NonNull EditText etAlipayAddress, @NonNull EditText etDrinkWater, @NonNull EditText etHrMonitoring, @NonNull EditText etMtu, @NonNull EditText etSedentariness, @NonNull EditText etStepGoal, @NonNull EditText etTemperatureValue, @NonNull EditText etWeatherForecast, @NonNull EditText etWeatherRealtime, @NonNull LinearLayout rootView, @NonNull TextView tvLocationInfo, @NonNull TextView tvOpenRuntimeLog, @NonNull TextView tvVersion) {
        this.rootView_ = rootView_;
        this.btnOta = btnOta;
        this.btnOtaFromConfig = btnOtaFromConfig;
        this.checkShowAd = checkShowAd;
        this.etAlipayAddress = etAlipayAddress;
        this.etDrinkWater = etDrinkWater;
        this.etHrMonitoring = etHrMonitoring;
        this.etMtu = etMtu;
        this.etSedentariness = etSedentariness;
        this.etStepGoal = etStepGoal;
        this.etTemperatureValue = etTemperatureValue;
        this.etWeatherForecast = etWeatherForecast;
        this.etWeatherRealtime = etWeatherRealtime;
        this.rootView = rootView;
        this.tvLocationInfo = tvLocationInfo;
        this.tvOpenRuntimeLog = tvOpenRuntimeLog;
        this.tvVersion = tvVersion;
    }

    @NonNull
    public static ActivityDeveloperBinding bind(@NonNull View rootView) {
        int r1 = R.id.btn_ota;
        AppCompatButton r5 = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.btn_ota);
        if (r5 == null) goto L35;
        r1 = R.id.btn_ota_from_config;
        AppCompatButton r6 = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.btn_ota_from_config);
        if (r6 == null) goto L35;
        r1 = R.id.check_show_ad;
        AppCompatCheckBox r7 = (AppCompatCheckBox) ViewBindings.findChildViewById(rootView, R.id.check_show_ad);
        if (r7 == null) goto L35;
        r1 = R.id.et_alipay_address;
        EditText r8 = (EditText) ViewBindings.findChildViewById(rootView, R.id.et_alipay_address);
        if (r8 == null) goto L35;
        r1 = R.id.et_drinkWater;
        EditText r9 = (EditText) ViewBindings.findChildViewById(rootView, R.id.et_drinkWater);
        if (r9 == null) goto L35;
        r1 = R.id.et_hr_monitoring;
        EditText r10 = (EditText) ViewBindings.findChildViewById(rootView, R.id.et_hr_monitoring);
        if (r10 == null) goto L35;
        r1 = R.id.et_mtu;
        EditText r11 = (EditText) ViewBindings.findChildViewById(rootView, R.id.et_mtu);
        if (r11 == null) goto L35;
        r1 = R.id.et_sedentariness;
        EditText r12 = (EditText) ViewBindings.findChildViewById(rootView, R.id.et_sedentariness);
        if (r12 == null) goto L35;
        r1 = R.id.et_step_goal;
        EditText r13 = (EditText) ViewBindings.findChildViewById(rootView, R.id.et_step_goal);
        if (r13 == null) goto L35;
        r1 = R.id.et_temperature_value;
        EditText r14 = (EditText) ViewBindings.findChildViewById(rootView, R.id.et_temperature_value);
        if (r14 == null) goto L35;
        r1 = R.id.et_weather_forecast;
        EditText r15 = (EditText) ViewBindings.findChildViewById(rootView, R.id.et_weather_forecast);
        if (r15 == null) goto L35;
        r1 = R.id.et_weather_realtime;
        EditText r16 = (EditText) ViewBindings.findChildViewById(rootView, R.id.et_weather_realtime);
        if (r16 == null) goto L35;
        LinearLayout r4 = (LinearLayout) rootView;
        r1 = R.id.tv_location_info;
        TextView r18 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_location_info);
        if (r18 == null) goto L35;
        r1 = R.id.tv_open_runtime_log;
        TextView r19 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_open_runtime_log);
        if (r19 == null) goto L35;
        r1 = R.id.tvVersion;
        TextView r20 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvVersion);
        if (r20 == null) goto L35;
        return new ActivityDeveloperBinding(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r4, r18, r19, r20);
    L35:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r1)));
    }

    @NonNull
    public static ActivityDeveloperBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityDeveloperBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_developer, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView_;
    }
}
