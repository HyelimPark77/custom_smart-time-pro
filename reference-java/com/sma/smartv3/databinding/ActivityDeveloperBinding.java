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
        int i = R.id.btn_ota;
        AppCompatButton appCompatButton = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.btn_ota);
        if (appCompatButton != null) {
            i = R.id.btn_ota_from_config;
            AppCompatButton appCompatButton2 = (AppCompatButton) ViewBindings.findChildViewById(rootView, R.id.btn_ota_from_config);
            if (appCompatButton2 != null) {
                i = R.id.check_show_ad;
                AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) ViewBindings.findChildViewById(rootView, R.id.check_show_ad);
                if (appCompatCheckBox != null) {
                    i = R.id.et_alipay_address;
                    EditText editText = (EditText) ViewBindings.findChildViewById(rootView, R.id.et_alipay_address);
                    if (editText != null) {
                        i = R.id.et_drinkWater;
                        EditText editText2 = (EditText) ViewBindings.findChildViewById(rootView, R.id.et_drinkWater);
                        if (editText2 != null) {
                            i = R.id.et_hr_monitoring;
                            EditText editText3 = (EditText) ViewBindings.findChildViewById(rootView, R.id.et_hr_monitoring);
                            if (editText3 != null) {
                                i = R.id.et_mtu;
                                EditText editText4 = (EditText) ViewBindings.findChildViewById(rootView, R.id.et_mtu);
                                if (editText4 != null) {
                                    i = R.id.et_sedentariness;
                                    EditText editText5 = (EditText) ViewBindings.findChildViewById(rootView, R.id.et_sedentariness);
                                    if (editText5 != null) {
                                        i = R.id.et_step_goal;
                                        EditText editText6 = (EditText) ViewBindings.findChildViewById(rootView, R.id.et_step_goal);
                                        if (editText6 != null) {
                                            i = R.id.et_temperature_value;
                                            EditText editText7 = (EditText) ViewBindings.findChildViewById(rootView, R.id.et_temperature_value);
                                            if (editText7 != null) {
                                                i = R.id.et_weather_forecast;
                                                EditText editText8 = (EditText) ViewBindings.findChildViewById(rootView, R.id.et_weather_forecast);
                                                if (editText8 != null) {
                                                    i = R.id.et_weather_realtime;
                                                    EditText editText9 = (EditText) ViewBindings.findChildViewById(rootView, R.id.et_weather_realtime);
                                                    if (editText9 != null) {
                                                        LinearLayout linearLayout = (LinearLayout) rootView;
                                                        i = R.id.tv_location_info;
                                                        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_location_info);
                                                        if (textView != null) {
                                                            i = R.id.tv_open_runtime_log;
                                                            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tv_open_runtime_log);
                                                            if (textView2 != null) {
                                                                i = R.id.tvVersion;
                                                                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.tvVersion);
                                                                if (textView3 != null) {
                                                                    return new ActivityDeveloperBinding(linearLayout, appCompatButton, appCompatButton2, appCompatCheckBox, editText, editText2, editText3, editText4, editText5, editText6, editText7, editText8, editText9, linearLayout, textView, textView2, textView3);
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
    public static ActivityDeveloperBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityDeveloperBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_developer, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView_;
    }
}
