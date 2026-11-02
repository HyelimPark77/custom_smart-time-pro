package com.sma.smartv3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.view.text.PFMedium;

/* JADX INFO: loaded from: classes19.dex */
public final class ActivityWeather2NewBinding implements ViewBinding {

    @NonNull
    public final TextView nowWeatherCity;

    @NonNull
    public final TextView nowWeatherDescribe;

    @NonNull
    public final TextView nowWeatherDescribeTemp;

    @NonNull
    public final TextView nowWeatherTemp;

    @NonNull
    public final LinearLayout root;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final AppCompatImageView todayIcon;

    @NonNull
    public final PFMedium tvHumidityValue;

    @NonNull
    public final PFMedium tvPrecipitationUnit;

    @NonNull
    public final PFMedium tvPrecipitationValue;

    @NonNull
    public final PFMedium tvUviValue;

    @NonNull
    public final PFMedium tvVisibilityUnit;

    @NonNull
    public final PFMedium tvVisibilityValue;

    @NonNull
    public final PFMedium tvWindSpeedUnit;

    @NonNull
    public final PFMedium tvWindSpeedValue;

    @NonNull
    public final TextView weather1Date;

    @NonNull
    public final AppCompatImageView weather1Icon;

    @NonNull
    public final TextView weather1MaxTemp;

    @NonNull
    public final TextView weather1MinTemp;

    @NonNull
    public final TextView weather2Date;

    @NonNull
    public final AppCompatImageView weather2Icon;

    @NonNull
    public final TextView weather2MaxTemp;

    @NonNull
    public final TextView weather2MinTemp;

    @NonNull
    public final TextView weather3Date;

    @NonNull
    public final AppCompatImageView weather3Icon;

    @NonNull
    public final TextView weather3MaxTemp;

    @NonNull
    public final TextView weather3MinTemp;

    @NonNull
    public final TextView weather4Date;

    @NonNull
    public final AppCompatImageView weather4Icon;

    @NonNull
    public final TextView weather4MaxTemp;

    @NonNull
    public final TextView weather4MinTemp;

    @NonNull
    public final TextView weather5Date;

    @NonNull
    public final AppCompatImageView weather5Icon;

    @NonNull
    public final TextView weather5MaxTemp;

    @NonNull
    public final TextView weather5MinTemp;

    @NonNull
    public final TextView weather6Date;

    @NonNull
    public final AppCompatImageView weather6Icon;

    @NonNull
    public final TextView weather6MaxTemp;

    @NonNull
    public final TextView weather6MinTemp;

    @NonNull
    public final TextView weather7Date;

    @NonNull
    public final AppCompatImageView weather7Icon;

    @NonNull
    public final TextView weather7MaxTemp;

    @NonNull
    public final TextView weather7MinTemp;

    private ActivityWeather2NewBinding(@NonNull LinearLayout rootView, @NonNull TextView nowWeatherCity, @NonNull TextView nowWeatherDescribe, @NonNull TextView nowWeatherDescribeTemp, @NonNull TextView nowWeatherTemp, @NonNull LinearLayout root, @NonNull AppCompatImageView todayIcon, @NonNull PFMedium tvHumidityValue, @NonNull PFMedium tvPrecipitationUnit, @NonNull PFMedium tvPrecipitationValue, @NonNull PFMedium tvUviValue, @NonNull PFMedium tvVisibilityUnit, @NonNull PFMedium tvVisibilityValue, @NonNull PFMedium tvWindSpeedUnit, @NonNull PFMedium tvWindSpeedValue, @NonNull TextView weather1Date, @NonNull AppCompatImageView weather1Icon, @NonNull TextView weather1MaxTemp, @NonNull TextView weather1MinTemp, @NonNull TextView weather2Date, @NonNull AppCompatImageView weather2Icon, @NonNull TextView weather2MaxTemp, @NonNull TextView weather2MinTemp, @NonNull TextView weather3Date, @NonNull AppCompatImageView weather3Icon, @NonNull TextView weather3MaxTemp, @NonNull TextView weather3MinTemp, @NonNull TextView weather4Date, @NonNull AppCompatImageView weather4Icon, @NonNull TextView weather4MaxTemp, @NonNull TextView weather4MinTemp, @NonNull TextView weather5Date, @NonNull AppCompatImageView weather5Icon, @NonNull TextView weather5MaxTemp, @NonNull TextView weather5MinTemp, @NonNull TextView weather6Date, @NonNull AppCompatImageView weather6Icon, @NonNull TextView weather6MaxTemp, @NonNull TextView weather6MinTemp, @NonNull TextView weather7Date, @NonNull AppCompatImageView weather7Icon, @NonNull TextView weather7MaxTemp, @NonNull TextView weather7MinTemp) {
        this.rootView = rootView;
        this.nowWeatherCity = nowWeatherCity;
        this.nowWeatherDescribe = nowWeatherDescribe;
        this.nowWeatherDescribeTemp = nowWeatherDescribeTemp;
        this.nowWeatherTemp = nowWeatherTemp;
        this.root = root;
        this.todayIcon = todayIcon;
        this.tvHumidityValue = tvHumidityValue;
        this.tvPrecipitationUnit = tvPrecipitationUnit;
        this.tvPrecipitationValue = tvPrecipitationValue;
        this.tvUviValue = tvUviValue;
        this.tvVisibilityUnit = tvVisibilityUnit;
        this.tvVisibilityValue = tvVisibilityValue;
        this.tvWindSpeedUnit = tvWindSpeedUnit;
        this.tvWindSpeedValue = tvWindSpeedValue;
        this.weather1Date = weather1Date;
        this.weather1Icon = weather1Icon;
        this.weather1MaxTemp = weather1MaxTemp;
        this.weather1MinTemp = weather1MinTemp;
        this.weather2Date = weather2Date;
        this.weather2Icon = weather2Icon;
        this.weather2MaxTemp = weather2MaxTemp;
        this.weather2MinTemp = weather2MinTemp;
        this.weather3Date = weather3Date;
        this.weather3Icon = weather3Icon;
        this.weather3MaxTemp = weather3MaxTemp;
        this.weather3MinTemp = weather3MinTemp;
        this.weather4Date = weather4Date;
        this.weather4Icon = weather4Icon;
        this.weather4MaxTemp = weather4MaxTemp;
        this.weather4MinTemp = weather4MinTemp;
        this.weather5Date = weather5Date;
        this.weather5Icon = weather5Icon;
        this.weather5MaxTemp = weather5MaxTemp;
        this.weather5MinTemp = weather5MinTemp;
        this.weather6Date = weather6Date;
        this.weather6Icon = weather6Icon;
        this.weather6MaxTemp = weather6MaxTemp;
        this.weather6MinTemp = weather6MinTemp;
        this.weather7Date = weather7Date;
        this.weather7Icon = weather7Icon;
        this.weather7MaxTemp = weather7MaxTemp;
        this.weather7MinTemp = weather7MinTemp;
    }

    @NonNull
    public static ActivityWeather2NewBinding bind(@NonNull View rootView) {
        int i = R.id.nowWeather_city;
        TextView textView = (TextView) ViewBindings.findChildViewById(rootView, R.id.nowWeather_city);
        if (textView != null) {
            i = R.id.nowWeather_describe;
            TextView textView2 = (TextView) ViewBindings.findChildViewById(rootView, R.id.nowWeather_describe);
            if (textView2 != null) {
                i = R.id.nowWeather_describe_temp;
                TextView textView3 = (TextView) ViewBindings.findChildViewById(rootView, R.id.nowWeather_describe_temp);
                if (textView3 != null) {
                    i = R.id.nowWeather_temp;
                    TextView textView4 = (TextView) ViewBindings.findChildViewById(rootView, R.id.nowWeather_temp);
                    if (textView4 != null) {
                        LinearLayout linearLayout = (LinearLayout) rootView;
                        i = R.id.today_icon;
                        AppCompatImageView appCompatImageView = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.today_icon);
                        if (appCompatImageView != null) {
                            i = R.id.tv_humidity_value;
                            PFMedium pFMedium = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_humidity_value);
                            if (pFMedium != null) {
                                i = R.id.tv_precipitation_unit;
                                PFMedium pFMedium2 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_precipitation_unit);
                                if (pFMedium2 != null) {
                                    i = R.id.tv_precipitation_value;
                                    PFMedium pFMedium3 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_precipitation_value);
                                    if (pFMedium3 != null) {
                                        i = R.id.tv_uvi_value;
                                        PFMedium pFMedium4 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_uvi_value);
                                        if (pFMedium4 != null) {
                                            i = R.id.tv_visibility_unit;
                                            PFMedium pFMedium5 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_visibility_unit);
                                            if (pFMedium5 != null) {
                                                i = R.id.tv_visibility_value;
                                                PFMedium pFMedium6 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_visibility_value);
                                                if (pFMedium6 != null) {
                                                    i = R.id.tv_wind_speed_unit;
                                                    PFMedium pFMedium7 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_wind_speed_unit);
                                                    if (pFMedium7 != null) {
                                                        i = R.id.tv_wind_speed_value;
                                                        PFMedium pFMedium8 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_wind_speed_value);
                                                        if (pFMedium8 != null) {
                                                            i = R.id.weather1_date;
                                                            TextView textView5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.weather1_date);
                                                            if (textView5 != null) {
                                                                i = R.id.weather1_icon;
                                                                AppCompatImageView appCompatImageView2 = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.weather1_icon);
                                                                if (appCompatImageView2 != null) {
                                                                    i = R.id.weather1_max_temp;
                                                                    TextView textView6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.weather1_max_temp);
                                                                    if (textView6 != null) {
                                                                        i = R.id.weather1_min_temp;
                                                                        TextView textView7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.weather1_min_temp);
                                                                        if (textView7 != null) {
                                                                            i = R.id.weather2_date;
                                                                            TextView textView8 = (TextView) ViewBindings.findChildViewById(rootView, R.id.weather2_date);
                                                                            if (textView8 != null) {
                                                                                i = R.id.weather2_icon;
                                                                                AppCompatImageView appCompatImageView3 = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.weather2_icon);
                                                                                if (appCompatImageView3 != null) {
                                                                                    i = R.id.weather2_max_temp;
                                                                                    TextView textView9 = (TextView) ViewBindings.findChildViewById(rootView, R.id.weather2_max_temp);
                                                                                    if (textView9 != null) {
                                                                                        i = R.id.weather2_min_temp;
                                                                                        TextView textView10 = (TextView) ViewBindings.findChildViewById(rootView, R.id.weather2_min_temp);
                                                                                        if (textView10 != null) {
                                                                                            i = R.id.weather3_date;
                                                                                            TextView textView11 = (TextView) ViewBindings.findChildViewById(rootView, R.id.weather3_date);
                                                                                            if (textView11 != null) {
                                                                                                i = R.id.weather3_icon;
                                                                                                AppCompatImageView appCompatImageView4 = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.weather3_icon);
                                                                                                if (appCompatImageView4 != null) {
                                                                                                    i = R.id.weather3_max_temp;
                                                                                                    TextView textView12 = (TextView) ViewBindings.findChildViewById(rootView, R.id.weather3_max_temp);
                                                                                                    if (textView12 != null) {
                                                                                                        i = R.id.weather3_min_temp;
                                                                                                        TextView textView13 = (TextView) ViewBindings.findChildViewById(rootView, R.id.weather3_min_temp);
                                                                                                        if (textView13 != null) {
                                                                                                            i = R.id.weather4_date;
                                                                                                            TextView textView14 = (TextView) ViewBindings.findChildViewById(rootView, R.id.weather4_date);
                                                                                                            if (textView14 != null) {
                                                                                                                i = R.id.weather4_icon;
                                                                                                                AppCompatImageView appCompatImageView5 = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.weather4_icon);
                                                                                                                if (appCompatImageView5 != null) {
                                                                                                                    i = R.id.weather4_max_temp;
                                                                                                                    TextView textView15 = (TextView) ViewBindings.findChildViewById(rootView, R.id.weather4_max_temp);
                                                                                                                    if (textView15 != null) {
                                                                                                                        i = R.id.weather4_min_temp;
                                                                                                                        TextView textView16 = (TextView) ViewBindings.findChildViewById(rootView, R.id.weather4_min_temp);
                                                                                                                        if (textView16 != null) {
                                                                                                                            i = R.id.weather5_date;
                                                                                                                            TextView textView17 = (TextView) ViewBindings.findChildViewById(rootView, R.id.weather5_date);
                                                                                                                            if (textView17 != null) {
                                                                                                                                i = R.id.weather5_icon;
                                                                                                                                AppCompatImageView appCompatImageView6 = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.weather5_icon);
                                                                                                                                if (appCompatImageView6 != null) {
                                                                                                                                    i = R.id.weather5_max_temp;
                                                                                                                                    TextView textView18 = (TextView) ViewBindings.findChildViewById(rootView, R.id.weather5_max_temp);
                                                                                                                                    if (textView18 != null) {
                                                                                                                                        i = R.id.weather5_min_temp;
                                                                                                                                        TextView textView19 = (TextView) ViewBindings.findChildViewById(rootView, R.id.weather5_min_temp);
                                                                                                                                        if (textView19 != null) {
                                                                                                                                            i = R.id.weather6_date;
                                                                                                                                            TextView textView20 = (TextView) ViewBindings.findChildViewById(rootView, R.id.weather6_date);
                                                                                                                                            if (textView20 != null) {
                                                                                                                                                i = R.id.weather6_icon;
                                                                                                                                                AppCompatImageView appCompatImageView7 = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.weather6_icon);
                                                                                                                                                if (appCompatImageView7 != null) {
                                                                                                                                                    i = R.id.weather6_max_temp;
                                                                                                                                                    TextView textView21 = (TextView) ViewBindings.findChildViewById(rootView, R.id.weather6_max_temp);
                                                                                                                                                    if (textView21 != null) {
                                                                                                                                                        i = R.id.weather6_min_temp;
                                                                                                                                                        TextView textView22 = (TextView) ViewBindings.findChildViewById(rootView, R.id.weather6_min_temp);
                                                                                                                                                        if (textView22 != null) {
                                                                                                                                                            i = R.id.weather7_date;
                                                                                                                                                            TextView textView23 = (TextView) ViewBindings.findChildViewById(rootView, R.id.weather7_date);
                                                                                                                                                            if (textView23 != null) {
                                                                                                                                                                i = R.id.weather7_icon;
                                                                                                                                                                AppCompatImageView appCompatImageView8 = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.weather7_icon);
                                                                                                                                                                if (appCompatImageView8 != null) {
                                                                                                                                                                    i = R.id.weather7_max_temp;
                                                                                                                                                                    TextView textView24 = (TextView) ViewBindings.findChildViewById(rootView, R.id.weather7_max_temp);
                                                                                                                                                                    if (textView24 != null) {
                                                                                                                                                                        i = R.id.weather7_min_temp;
                                                                                                                                                                        TextView textView25 = (TextView) ViewBindings.findChildViewById(rootView, R.id.weather7_min_temp);
                                                                                                                                                                        if (textView25 != null) {
                                                                                                                                                                            return new ActivityWeather2NewBinding(linearLayout, textView, textView2, textView3, textView4, linearLayout, appCompatImageView, pFMedium, pFMedium2, pFMedium3, pFMedium4, pFMedium5, pFMedium6, pFMedium7, pFMedium8, textView5, appCompatImageView2, textView6, textView7, textView8, appCompatImageView3, textView9, textView10, textView11, appCompatImageView4, textView12, textView13, textView14, appCompatImageView5, textView15, textView16, textView17, appCompatImageView6, textView18, textView19, textView20, appCompatImageView7, textView21, textView22, textView23, appCompatImageView8, textView24, textView25);
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
    public static ActivityWeather2NewBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @NonNull
    public static ActivityWeather2NewBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View viewInflate = inflater.inflate(R.layout.activity_weather2_new, parent, false);
        if (attachToParent) {
            parent.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
