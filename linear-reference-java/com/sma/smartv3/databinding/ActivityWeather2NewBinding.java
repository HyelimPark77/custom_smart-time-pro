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
        int r1 = R.id.nowWeather_city;
        TextView r5 = (TextView) ViewBindings.findChildViewById(rootView, R.id.nowWeather_city);
        if (r5 == null) goto L87;
        r1 = R.id.nowWeather_describe;
        TextView r6 = (TextView) ViewBindings.findChildViewById(rootView, R.id.nowWeather_describe);
        if (r6 == null) goto L87;
        r1 = R.id.nowWeather_describe_temp;
        TextView r7 = (TextView) ViewBindings.findChildViewById(rootView, R.id.nowWeather_describe_temp);
        if (r7 == null) goto L87;
        r1 = R.id.nowWeather_temp;
        TextView r8 = (TextView) ViewBindings.findChildViewById(rootView, R.id.nowWeather_temp);
        if (r8 == null) goto L87;
        LinearLayout r4 = (LinearLayout) rootView;
        r1 = R.id.today_icon;
        AppCompatImageView r10 = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.today_icon);
        if (r10 == null) goto L87;
        r1 = R.id.tv_humidity_value;
        PFMedium r11 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_humidity_value);
        if (r11 == null) goto L87;
        r1 = R.id.tv_precipitation_unit;
        PFMedium r12 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_precipitation_unit);
        if (r12 == null) goto L87;
        r1 = R.id.tv_precipitation_value;
        PFMedium r13 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_precipitation_value);
        if (r13 == null) goto L87;
        r1 = R.id.tv_uvi_value;
        PFMedium r14 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_uvi_value);
        if (r14 == null) goto L87;
        r1 = R.id.tv_visibility_unit;
        PFMedium r15 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_visibility_unit);
        if (r15 == null) goto L87;
        r1 = R.id.tv_visibility_value;
        PFMedium r16 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_visibility_value);
        if (r16 == null) goto L87;
        r1 = R.id.tv_wind_speed_unit;
        PFMedium r17 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_wind_speed_unit);
        if (r17 == null) goto L87;
        r1 = R.id.tv_wind_speed_value;
        PFMedium r18 = (PFMedium) ViewBindings.findChildViewById(rootView, R.id.tv_wind_speed_value);
        if (r18 == null) goto L87;
        r1 = R.id.weather1_date;
        TextView r19 = (TextView) ViewBindings.findChildViewById(rootView, R.id.weather1_date);
        if (r19 == null) goto L87;
        r1 = R.id.weather1_icon;
        AppCompatImageView r20 = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.weather1_icon);
        if (r20 == null) goto L87;
        r1 = R.id.weather1_max_temp;
        TextView r21 = (TextView) ViewBindings.findChildViewById(rootView, R.id.weather1_max_temp);
        if (r21 == null) goto L87;
        r1 = R.id.weather1_min_temp;
        TextView r22 = (TextView) ViewBindings.findChildViewById(rootView, R.id.weather1_min_temp);
        if (r22 == null) goto L87;
        r1 = R.id.weather2_date;
        TextView r23 = (TextView) ViewBindings.findChildViewById(rootView, R.id.weather2_date);
        if (r23 == null) goto L87;
        r1 = R.id.weather2_icon;
        AppCompatImageView r24 = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.weather2_icon);
        if (r24 == null) goto L87;
        r1 = R.id.weather2_max_temp;
        TextView r25 = (TextView) ViewBindings.findChildViewById(rootView, R.id.weather2_max_temp);
        if (r25 == null) goto L87;
        r1 = R.id.weather2_min_temp;
        TextView r26 = (TextView) ViewBindings.findChildViewById(rootView, R.id.weather2_min_temp);
        if (r26 == null) goto L87;
        r1 = R.id.weather3_date;
        TextView r27 = (TextView) ViewBindings.findChildViewById(rootView, R.id.weather3_date);
        if (r27 == null) goto L87;
        r1 = R.id.weather3_icon;
        AppCompatImageView r28 = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.weather3_icon);
        if (r28 == null) goto L87;
        r1 = R.id.weather3_max_temp;
        TextView r29 = (TextView) ViewBindings.findChildViewById(rootView, R.id.weather3_max_temp);
        if (r29 == null) goto L87;
        r1 = R.id.weather3_min_temp;
        TextView r30 = (TextView) ViewBindings.findChildViewById(rootView, R.id.weather3_min_temp);
        if (r30 == null) goto L87;
        r1 = R.id.weather4_date;
        TextView r31 = (TextView) ViewBindings.findChildViewById(rootView, R.id.weather4_date);
        if (r31 == null) goto L87;
        r1 = R.id.weather4_icon;
        AppCompatImageView r32 = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.weather4_icon);
        if (r32 == null) goto L87;
        r1 = R.id.weather4_max_temp;
        TextView r33 = (TextView) ViewBindings.findChildViewById(rootView, R.id.weather4_max_temp);
        if (r33 == null) goto L87;
        r1 = R.id.weather4_min_temp;
        TextView r34 = (TextView) ViewBindings.findChildViewById(rootView, R.id.weather4_min_temp);
        if (r34 == null) goto L87;
        r1 = R.id.weather5_date;
        TextView r35 = (TextView) ViewBindings.findChildViewById(rootView, R.id.weather5_date);
        if (r35 == null) goto L87;
        r1 = R.id.weather5_icon;
        AppCompatImageView r36 = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.weather5_icon);
        if (r36 == null) goto L87;
        r1 = R.id.weather5_max_temp;
        TextView r37 = (TextView) ViewBindings.findChildViewById(rootView, R.id.weather5_max_temp);
        if (r37 == null) goto L87;
        r1 = R.id.weather5_min_temp;
        TextView r38 = (TextView) ViewBindings.findChildViewById(rootView, R.id.weather5_min_temp);
        if (r38 == null) goto L87;
        r1 = R.id.weather6_date;
        TextView r39 = (TextView) ViewBindings.findChildViewById(rootView, R.id.weather6_date);
        if (r39 == null) goto L87;
        r1 = R.id.weather6_icon;
        AppCompatImageView r40 = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.weather6_icon);
        if (r40 == null) goto L87;
        r1 = R.id.weather6_max_temp;
        TextView r41 = (TextView) ViewBindings.findChildViewById(rootView, R.id.weather6_max_temp);
        if (r41 == null) goto L87;
        r1 = R.id.weather6_min_temp;
        TextView r42 = (TextView) ViewBindings.findChildViewById(rootView, R.id.weather6_min_temp);
        if (r42 == null) goto L87;
        r1 = R.id.weather7_date;
        TextView r43 = (TextView) ViewBindings.findChildViewById(rootView, R.id.weather7_date);
        if (r43 == null) goto L87;
        r1 = R.id.weather7_icon;
        AppCompatImageView r44 = (AppCompatImageView) ViewBindings.findChildViewById(rootView, R.id.weather7_icon);
        if (r44 == null) goto L87;
        r1 = R.id.weather7_max_temp;
        TextView r45 = (TextView) ViewBindings.findChildViewById(rootView, R.id.weather7_max_temp);
        if (r45 == null) goto L87;
        r1 = R.id.weather7_min_temp;
        TextView r46 = (TextView) ViewBindings.findChildViewById(rootView, R.id.weather7_min_temp);
        if (r46 == null) goto L87;
        return new ActivityWeather2NewBinding(r4, r5, r6, r7, r8, r4, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46);
    L87:
        throw new NullPointerException("Missing required view with ID: ".concat(rootView.getResources().getResourceName(r1)));
    }

    @NonNull
    public static ActivityWeather2NewBinding inflate(@NonNull LayoutInflater inflater) {
        return inflate(inflater, null, false);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public /* bridge */ /* synthetic */ View getRoot() {
        return getRoot();
    }

    @NonNull
    public static ActivityWeather2NewBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent, boolean attachToParent) {
        View r2 = inflater.inflate(R.layout.activity_weather2_new, parent, false);
        if (attachToParent == false) goto L6;
        parent.addView(r2);
    L6:
        return bind(r2);
    }

    @Override // androidx.viewbinding.ViewBinding
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
