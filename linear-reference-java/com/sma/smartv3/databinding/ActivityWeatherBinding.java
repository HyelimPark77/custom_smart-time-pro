package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.DINCondBold;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityWeatherBinding implements ViewBinding {

    @NonNull
    public final FrameLayout flBg;

    @NonNull
    public final FrameLayout flContainer;

    @NonNull
    public final ImageView ivWeather;

    @NonNull
    public final ImageView ivWeather1;

    @NonNull
    public final ImageView ivWeather2;

    @NonNull
    public final ImageView ivWeather3;

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final DINCondBold tvCityName;

    @NonNull
    public final PFMedium tvHumidityValue;

    @NonNull
    public final PFMedium tvPrecipitationUnit;

    @NonNull
    public final PFMedium tvPrecipitationValue;

    @NonNull
    public final DINCondBold tvTemperatureMax;

    @NonNull
    public final DINCondBold tvTemperatureMin;

    @NonNull
    public final PFMedium tvTemperatureUnit;

    @NonNull
    public final DINCondBold tvTemperatureValue;

    @NonNull
    public final PFMedium tvUviValue;

    @NonNull
    public final PFMedium tvVisibilityUnit;

    @NonNull
    public final PFMedium tvVisibilityValue;

    @NonNull
    public final PFMedium tvWeatherDate1;

    @NonNull
    public final PFMedium tvWeatherDate2;

    @NonNull
    public final PFMedium tvWeatherDate3;

    @NonNull
    public final PFMedium tvWeatherName;

    @NonNull
    public final PFMedium tvWeatherValue1;

    @NonNull
    public final PFMedium tvWeatherValue2;

    @NonNull
    public final PFMedium tvWeatherValue3;

    @NonNull
    public final PFMedium tvWindSpeedUnit;

    @NonNull
    public final PFMedium tvWindSpeedValue;

    private ActivityWeatherBinding(@NonNull FrameLayout rootView, @NonNull FrameLayout flBg, @NonNull FrameLayout flContainer, @NonNull ImageView ivWeather, @NonNull ImageView ivWeather1, @NonNull ImageView ivWeather2, @NonNull ImageView ivWeather3, @NonNull DINCondBold tvCityName, @NonNull PFMedium tvHumidityValue, @NonNull PFMedium tvPrecipitationUnit, @NonNull PFMedium tvPrecipitationValue, @NonNull DINCondBold tvTemperatureMax, @NonNull DINCondBold tvTemperatureMin, @NonNull PFMedium tvTemperatureUnit, @NonNull DINCondBold tvTemperatureValue, @NonNull PFMedium tvUviValue, @NonNull PFMedium tvVisibilityUnit, @NonNull PFMedium tvVisibilityValue, @NonNull PFMedium tvWeatherDate1, @NonNull PFMedium tvWeatherDate2, @NonNull PFMedium tvWeatherDate3, @NonNull PFMedium tvWeatherName, @NonNull PFMedium tvWeatherValue1, @NonNull PFMedium tvWeatherValue2, @NonNull PFMedium tvWeatherValue3, @NonNull PFMedium tvWindSpeedUnit, @NonNull PFMedium tvWindSpeedValue) {
        this.rootView = rootView;
        this.flBg = flBg;
        this.flContainer = flContainer;
        this.ivWeather = ivWeather;
        this.ivWeather1 = ivWeather1;
        this.ivWeather2 = ivWeather2;
        this.ivWeather3 = ivWeather3;
        this.tvCityName = tvCityName;
        this.tvHumidityValue = tvHumidityValue;
        this.tvPrecipitationUnit = tvPrecipitationUnit;
        this.tvPrecipitationValue = tvPrecipitationValue;
        this.tvTemperatureMax = tvTemperatureMax;
        this.tvTemperatureMin = tvTemperatureMin;
        this.tvTemperatureUnit = tvTemperatureUnit;
        this.tvTemperatureValue = tvTemperatureValue;
        this.tvUviValue = tvUviValue;
        this.tvVisibilityUnit = tvVisibilityUnit;
        this.tvVisibilityValue = tvVisibilityValue;
        this.tvWeatherDate1 = tvWeatherDate1;
        this.tvWeatherDate2 = tvWeatherDate2;
        this.tvWeatherDate3 = tvWeatherDate3;
        this.tvWeatherName = tvWeatherName;
        this.tvWeatherValue1 = tvWeatherValue1;
        this.tvWeatherValue2 = tvWeatherValue2;
        this.tvWeatherValue3 = tvWeatherValue3;
        this.tvWindSpeedUnit = tvWindSpeedUnit;
        this.tvWindSpeedValue = tvWindSpeedValue;
    }

    @NonNull
    public static ActivityWeatherBinding bind(@NonNull View rootView) {
        FrameLayout r1 = (FrameLayout) rootView;
        int r2 = R.id.fl_container;
        FrameLayout r3 = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.fl_container);
        if (r3 == null) goto L55;
        r2 = R.id.iv_weather;
        ImageView r4 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_weather);
        if (r4 == null) goto L55;
        r2 = R.id.iv_weather1;
        ImageView r5 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_weather1);
        if (r5 == null) goto L55;
        r2 = R.id.iv_weather2;
        ImageView r6 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_weather2);
        if (r6 == null) goto L55;
        r2 = R.id.iv_weather3;
        ImageView r7 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_weather3);
        if (r7 == null) goto L55;
        r2 = R.id.tv_city_name;
        DINCondBold r8 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.tv_city_name);
        if (r8 == null) goto L55;
        r2 = R.id.tv_humidity_value;
        PFMedium r9 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_humidity_value);
        if (r9 == null) goto L55;
        r2 = R.id.tv_precipitation_unit;
        PFMedium r10 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_precipitation_unit);
        if (r10 == null) goto L55;
        r2 = R.id.tv_precipitation_value;
        PFMedium r11 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_precipitation_value);
        if (r11 == null) goto L55;
        r2 = R.id.tv_temperature_max;
        DINCondBold r12 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.tv_temperature_max);
        if (r12 == null) goto L55;
        r2 = R.id.tv_temperature_min;
        DINCondBold r13 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.tv_temperature_min);
        if (r13 == null) goto L55;
        r2 = R.id.tv_temperature_unit;
        PFMedium r14 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_temperature_unit);
        if (r14 == null) goto L55;
        r2 = R.id.tv_temperature_value;
        DINCondBold r15 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.tv_temperature_value);
        if (r15 == null) goto L55;
        r2 = R.id.tv_uvi_value;
        PFMedium r16 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_uvi_value);
        if (r16 == null) goto L55;
        r2 = R.id.tv_visibility_unit;
        PFMedium r17 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_visibility_unit);
        if (r17 == null) goto L55;
        r2 = R.id.tv_visibility_value;
        PFMedium r18 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_visibility_value);
        if (r18 == null) goto L55;
        r2 = R.id.tv_weather_date1;
        PFMedium r19 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_weather_date1);
        if (r19 == null) goto L55;
        r2 = R.id.tv_weather_date2;
        PFMedium r20 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_weather_date2);
        if (r20 == null) goto L55;
        r2 = R.id.tv_weather_date3;
        PFMedium r21 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_weather_date3);
        if (r21 == null) goto L55;
        r2 = R.id.tv_weather_name;
        PFMedium r22 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_weather_name);
        if (r22 == null) goto L55;
        r2 = R.id.tv_weather_value1;
        PFMedium r23 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_weather_value1);
        if (r23 == null) goto L55;
        r2 = R.id.tv_weather_value2;
        PFMedium r24 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_weather_value2);
        if (r24 == null) goto L55;
        r2 = R.id.tv_weather_value3;
        PFMedium r25 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_weather_value3);
        if (r25 == null) goto L55;
        r2 = R.id.tv_wind_speed_unit;
        PFMedium r26 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_wind_speed_unit);
        if (r26 == null) goto L55;
        r2 = R.id.tv_wind_speed_value;
        PFMedium r27 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_wind_speed_value);
        if (r27 == null) goto L55;
        return new ActivityWeatherBinding(r1, r1, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27);
    L55:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r2)));
    }

    @NonNull
    public static ActivityWeatherBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityWeatherBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_weather, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
