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
public final class ActivityWeather2Binding implements ViewBinding {

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
    public final ImageView ivWeather4;

    @NonNull
    public final ImageView ivWeather5;

    @NonNull
    public final ImageView ivWeather6;

    @NonNull
    public final ImageView ivWeather7;

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
    public final PFMedium tvWeatherDate4;

    @NonNull
    public final PFMedium tvWeatherDate5;

    @NonNull
    public final PFMedium tvWeatherDate6;

    @NonNull
    public final PFMedium tvWeatherDate7;

    @NonNull
    public final PFMedium tvWeatherName;

    @NonNull
    public final PFMedium tvWeatherValue1;

    @NonNull
    public final PFMedium tvWeatherValue2;

    @NonNull
    public final PFMedium tvWeatherValue3;

    @NonNull
    public final PFMedium tvWeatherValue4;

    @NonNull
    public final PFMedium tvWeatherValue5;

    @NonNull
    public final PFMedium tvWeatherValue6;

    @NonNull
    public final PFMedium tvWeatherValue7;

    @NonNull
    public final PFMedium tvWindSpeedUnit;

    @NonNull
    public final PFMedium tvWindSpeedValue;

    private ActivityWeather2Binding(@NonNull FrameLayout rootView, @NonNull FrameLayout flBg, @NonNull FrameLayout flContainer, @NonNull ImageView ivWeather, @NonNull ImageView ivWeather1, @NonNull ImageView ivWeather2, @NonNull ImageView ivWeather3, @NonNull ImageView ivWeather4, @NonNull ImageView ivWeather5, @NonNull ImageView ivWeather6, @NonNull ImageView ivWeather7, @NonNull DINCondBold tvCityName, @NonNull PFMedium tvHumidityValue, @NonNull PFMedium tvPrecipitationUnit, @NonNull PFMedium tvPrecipitationValue, @NonNull DINCondBold tvTemperatureMax, @NonNull DINCondBold tvTemperatureMin, @NonNull PFMedium tvTemperatureUnit, @NonNull DINCondBold tvTemperatureValue, @NonNull PFMedium tvUviValue, @NonNull PFMedium tvVisibilityUnit, @NonNull PFMedium tvVisibilityValue, @NonNull PFMedium tvWeatherDate1, @NonNull PFMedium tvWeatherDate2, @NonNull PFMedium tvWeatherDate3, @NonNull PFMedium tvWeatherDate4, @NonNull PFMedium tvWeatherDate5, @NonNull PFMedium tvWeatherDate6, @NonNull PFMedium tvWeatherDate7, @NonNull PFMedium tvWeatherName, @NonNull PFMedium tvWeatherValue1, @NonNull PFMedium tvWeatherValue2, @NonNull PFMedium tvWeatherValue3, @NonNull PFMedium tvWeatherValue4, @NonNull PFMedium tvWeatherValue5, @NonNull PFMedium tvWeatherValue6, @NonNull PFMedium tvWeatherValue7, @NonNull PFMedium tvWindSpeedUnit, @NonNull PFMedium tvWindSpeedValue) {
        this.rootView = rootView;
        this.flBg = flBg;
        this.flContainer = flContainer;
        this.ivWeather = ivWeather;
        this.ivWeather1 = ivWeather1;
        this.ivWeather2 = ivWeather2;
        this.ivWeather3 = ivWeather3;
        this.ivWeather4 = ivWeather4;
        this.ivWeather5 = ivWeather5;
        this.ivWeather6 = ivWeather6;
        this.ivWeather7 = ivWeather7;
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
        this.tvWeatherDate4 = tvWeatherDate4;
        this.tvWeatherDate5 = tvWeatherDate5;
        this.tvWeatherDate6 = tvWeatherDate6;
        this.tvWeatherDate7 = tvWeatherDate7;
        this.tvWeatherName = tvWeatherName;
        this.tvWeatherValue1 = tvWeatherValue1;
        this.tvWeatherValue2 = tvWeatherValue2;
        this.tvWeatherValue3 = tvWeatherValue3;
        this.tvWeatherValue4 = tvWeatherValue4;
        this.tvWeatherValue5 = tvWeatherValue5;
        this.tvWeatherValue6 = tvWeatherValue6;
        this.tvWeatherValue7 = tvWeatherValue7;
        this.tvWindSpeedUnit = tvWindSpeedUnit;
        this.tvWindSpeedValue = tvWindSpeedValue;
    }

    @NonNull
    public static ActivityWeather2Binding bind(@NonNull View rootView) {
        FrameLayout frameLayout = (FrameLayout) rootView;
        int i = R.id.fl_container;
        FrameLayout frameLayout2 = (FrameLayout) ViewBindings.findChildViewById(rootView, R.id.fl_container);
        if (frameLayout2 != null) {
            i = R.id.iv_weather;
            ImageView imageView = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_weather);
            if (imageView != null) {
                i = R.id.iv_weather1;
                ImageView imageView2 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_weather1);
                if (imageView2 != null) {
                    i = R.id.iv_weather2;
                    ImageView imageView3 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_weather2);
                    if (imageView3 != null) {
                        i = R.id.iv_weather3;
                        ImageView imageView4 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_weather3);
                        if (imageView4 != null) {
                            i = R.id.iv_weather4;
                            ImageView imageView5 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_weather4);
                            if (imageView5 != null) {
                                i = R.id.iv_weather5;
                                ImageView imageView6 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_weather5);
                                if (imageView6 != null) {
                                    i = R.id.iv_weather6;
                                    ImageView imageView7 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_weather6);
                                    if (imageView7 != null) {
                                        i = R.id.iv_weather7;
                                        ImageView imageView8 = (ImageView) ViewBindings.findChildViewById(rootView, R.id.iv_weather7);
                                        if (imageView8 != null) {
                                            i = R.id.tv_city_name;
                                            DINCondBold dINCondBold = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.tv_city_name);
                                            if (dINCondBold != null) {
                                                i = R.id.tv_humidity_value;
                                                PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_humidity_value);
                                                if (pFMedium != null) {
                                                    i = R.id.tv_precipitation_unit;
                                                    PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_precipitation_unit);
                                                    if (pFMedium2 != null) {
                                                        i = R.id.tv_precipitation_value;
                                                        PFMedium pFMedium3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_precipitation_value);
                                                        if (pFMedium3 != null) {
                                                            i = R.id.tv_temperature_max;
                                                            DINCondBold dINCondBold2 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.tv_temperature_max);
                                                            if (dINCondBold2 != null) {
                                                                i = R.id.tv_temperature_min;
                                                                DINCondBold dINCondBold3 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.tv_temperature_min);
                                                                if (dINCondBold3 != null) {
                                                                    i = R.id.tv_temperature_unit;
                                                                    PFMedium pFMedium4 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_temperature_unit);
                                                                    if (pFMedium4 != null) {
                                                                        i = R.id.tv_temperature_value;
                                                                        DINCondBold dINCondBold4 = (DINCondBold) ViewBindings.findChildViewById(rootView, R.id.tv_temperature_value);
                                                                        if (dINCondBold4 != null) {
                                                                            i = R.id.tv_uvi_value;
                                                                            PFMedium pFMedium5 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_uvi_value);
                                                                            if (pFMedium5 != null) {
                                                                                i = R.id.tv_visibility_unit;
                                                                                PFMedium pFMedium6 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_visibility_unit);
                                                                                if (pFMedium6 != null) {
                                                                                    i = R.id.tv_visibility_value;
                                                                                    PFMedium pFMedium7 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_visibility_value);
                                                                                    if (pFMedium7 != null) {
                                                                                        i = R.id.tv_weather_date1;
                                                                                        PFMedium pFMedium8 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_weather_date1);
                                                                                        if (pFMedium8 != null) {
                                                                                            i = R.id.tv_weather_date2;
                                                                                            PFMedium pFMedium9 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_weather_date2);
                                                                                            if (pFMedium9 != null) {
                                                                                                i = R.id.tv_weather_date3;
                                                                                                PFMedium pFMedium10 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_weather_date3);
                                                                                                if (pFMedium10 != null) {
                                                                                                    i = R.id.tv_weather_date4;
                                                                                                    PFMedium pFMedium11 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_weather_date4);
                                                                                                    if (pFMedium11 != null) {
                                                                                                        i = R.id.tv_weather_date5;
                                                                                                        PFMedium pFMedium12 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_weather_date5);
                                                                                                        if (pFMedium12 != null) {
                                                                                                            i = R.id.tv_weather_date6;
                                                                                                            PFMedium pFMedium13 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_weather_date6);
                                                                                                            if (pFMedium13 != null) {
                                                                                                                i = R.id.tv_weather_date7;
                                                                                                                PFMedium pFMedium14 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_weather_date7);
                                                                                                                if (pFMedium14 != null) {
                                                                                                                    i = R.id.tv_weather_name;
                                                                                                                    PFMedium pFMedium15 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_weather_name);
                                                                                                                    if (pFMedium15 != null) {
                                                                                                                        i = R.id.tv_weather_value1;
                                                                                                                        PFMedium pFMedium16 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_weather_value1);
                                                                                                                        if (pFMedium16 != null) {
                                                                                                                            i = R.id.tv_weather_value2;
                                                                                                                            PFMedium pFMedium17 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_weather_value2);
                                                                                                                            if (pFMedium17 != null) {
                                                                                                                                i = R.id.tv_weather_value3;
                                                                                                                                PFMedium pFMedium18 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_weather_value3);
                                                                                                                                if (pFMedium18 != null) {
                                                                                                                                    i = R.id.tv_weather_value4;
                                                                                                                                    PFMedium pFMedium19 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_weather_value4);
                                                                                                                                    if (pFMedium19 != null) {
                                                                                                                                        i = R.id.tv_weather_value5;
                                                                                                                                        PFMedium pFMedium20 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_weather_value5);
                                                                                                                                        if (pFMedium20 != null) {
                                                                                                                                            i = R.id.tv_weather_value6;
                                                                                                                                            PFMedium pFMedium21 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_weather_value6);
                                                                                                                                            if (pFMedium21 != null) {
                                                                                                                                                i = R.id.tv_weather_value7;
                                                                                                                                                PFMedium pFMedium22 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_weather_value7);
                                                                                                                                                if (pFMedium22 != null) {
                                                                                                                                                    i = R.id.tv_wind_speed_unit;
                                                                                                                                                    PFMedium pFMedium23 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_wind_speed_unit);
                                                                                                                                                    if (pFMedium23 != null) {
                                                                                                                                                        i = R.id.tv_wind_speed_value;
                                                                                                                                                        PFMedium pFMedium24 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_wind_speed_value);
                                                                                                                                                        if (pFMedium24 != null) {
                                                                                                                                                            return new ActivityWeather2Binding(frameLayout, frameLayout, frameLayout2, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8, dINCondBold, pFMedium, pFMedium2, pFMedium3, dINCondBold2, dINCondBold3, pFMedium4, dINCondBold4, pFMedium5, pFMedium6, pFMedium7, pFMedium8, pFMedium9, pFMedium10, pFMedium11, pFMedium12, pFMedium13, pFMedium14, pFMedium15, pFMedium16, pFMedium17, pFMedium18, pFMedium19, pFMedium20, pFMedium21, pFMedium22, pFMedium23, pFMedium24);
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
    public static ActivityWeather2Binding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityWeather2Binding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_weather2, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
