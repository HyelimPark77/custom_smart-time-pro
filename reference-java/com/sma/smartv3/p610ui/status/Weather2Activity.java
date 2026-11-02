package com.sma.smartv3.p610ui.status;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.BarUtils;
import com.blankj.utilcode.util.SPUtils;
import com.google.gson.Gson;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.model.WeatherRealtime;
import com.sma.smartv3.p610ui.status.Weather2Activity;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.UtilsKt;
import com.sma.smartv3.view.text.PFMedium;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.component.BaseBleCache;
import com.szabh.smable3.component.BleCache;
import com.szabh.smable3.entity.BleWeather2;
import com.szabh.smable3.entity.BleWeatherForecast2;
import com.szabh.smable3.entity.BleWeatherRealtime2;
import com.tenmeter.smlibrary.utils.DateFormatUtils;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nWeather2Activity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Weather2Activity.kt\ncom/sma/smartv3/ui/status/Weather2Activity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,239:1\n19#2:240\n15#2:241\n19#2:242\n15#2:243\n90#2:244\n*S KotlinDebug\n*F\n+ 1 Weather2Activity.kt\ncom/sma/smartv3/ui/status/Weather2Activity\n*L\n76#1:240\n76#1:241\n78#1:242\n78#1:243\n211#1:244\n*E\n"})
public final class Weather2Activity extends BaseActivity {

    @aa1
    private AppUser mAppUser;

    @aa1
    private final AppUser userProfile;

    @aa1
    private final Lazy abhTitleCenter$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.sq6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return Weather2Activity.abhTitleCenter_delegate$lambda$0(this.f11108IO);
        }
    });

    @aa1
    private final Lazy bg$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.uq6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return Weather2Activity.bg_delegate$lambda$0(this.f11549IO);
        }
    });

    @aa1
    private final Lazy ivWeather$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.gr6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return Weather2Activity.ivWeather_delegate$lambda$0(this.f6943IO);
        }
    });

    @aa1
    private final Lazy tvTemperatureValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.qr6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return Weather2Activity.tvTemperatureValue_delegate$lambda$0(this.f10664IO);
        }
    });

    @aa1
    private final Lazy tvTemperatureUnit$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.rr6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return Weather2Activity.tvTemperatureUnit_delegate$lambda$0(this.f10890IO);
        }
    });

    @aa1
    private final Lazy tvTemperatureMin$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.sr6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return Weather2Activity.tvTemperatureMin_delegate$lambda$0(this.f11112IO);
        }
    });

    @aa1
    private final Lazy tvTemperatureMax$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.tr6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return Weather2Activity.tvTemperatureMax_delegate$lambda$0(this.f11343IO);
        }
    });

    @aa1
    private final Lazy tvWeatherName$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ur6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return Weather2Activity.tvWeatherName_delegate$lambda$0(this.f11555IO);
        }
    });

    @aa1
    private final Lazy tvUviValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.vr6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return Weather2Activity.tvUviValue_delegate$lambda$0(this.f11795IO);
        }
    });

    @aa1
    private final Lazy tvHumidityValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.wr6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return Weather2Activity.tvHumidityValue_delegate$lambda$0(this.f12022IO);
        }
    });

    @aa1
    private final Lazy tvVisibilityValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.dr6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return Weather2Activity.tvVisibilityValue_delegate$lambda$0(this.f6254IO);
        }
    });

    @aa1
    private final Lazy tvVisibilityUnit$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.or6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return Weather2Activity.tvVisibilityUnit_delegate$lambda$0(this.f10202IO);
        }
    });

    @aa1
    private final Lazy tvWindSpeedValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.xr6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return Weather2Activity.tvWindSpeedValue_delegate$lambda$0(this.f12224IO);
        }
    });

    @aa1
    private final Lazy tvWindSpeedUnit$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.yr6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return Weather2Activity.tvWindSpeedUnit_delegate$lambda$0(this.f12437IO);
        }
    });

    @aa1
    private final Lazy tvPrecipitationValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.zr6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return Weather2Activity.tvPrecipitationValue_delegate$lambda$0(this.f12682IO);
        }
    });

    @aa1
    private final Lazy tvPrecipitationUnit$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.as6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return Weather2Activity.tvPrecipitationUnit_delegate$lambda$0(this.f5557IO);
        }
    });

    @aa1
    private final Lazy ivWeather1$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.bs6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return Weather2Activity.ivWeather1_delegate$lambda$0(this.f5808IO);
        }
    });

    @aa1
    private final Lazy tvWeatherValue1$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.cs6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return Weather2Activity.tvWeatherValue1_delegate$lambda$0(this.f6045IO);
        }
    });

    @aa1
    private final Lazy tvWeatherDate1$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ds6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return Weather2Activity.tvWeatherDate1_delegate$lambda$0(this.f6258IO);
        }
    });

    @aa1
    private final Lazy ivWeather2$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.tq6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return Weather2Activity.ivWeather2_delegate$lambda$0(this.f11337IO);
        }
    });

    @aa1
    private final Lazy tvWeatherValue2$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.vq6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return Weather2Activity.tvWeatherValue2_delegate$lambda$0(this.f11790IO);
        }
    });

    @aa1
    private final Lazy tvWeatherDate2$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.wq6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return Weather2Activity.tvWeatherDate2_delegate$lambda$0(this.f12019IO);
        }
    });

    @aa1
    private final Lazy ivWeather3$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.xq6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return Weather2Activity.ivWeather3_delegate$lambda$0(this.f12219IO);
        }
    });

    @aa1
    private final Lazy tvWeatherValue3$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.yq6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return Weather2Activity.tvWeatherValue3_delegate$lambda$0(this.f12431IO);
        }
    });

    @aa1
    private final Lazy tvWeatherDate3$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.zq6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return Weather2Activity.tvWeatherDate3_delegate$lambda$0(this.f12676IO);
        }
    });

    @aa1
    private final Lazy ivWeather4$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ar6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return Weather2Activity.ivWeather4_delegate$lambda$0(this.f5550IO);
        }
    });

    @aa1
    private final Lazy tvWeatherValue4$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.br6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return Weather2Activity.tvWeatherValue4_delegate$lambda$0(this.f5800IO);
        }
    });

    @aa1
    private final Lazy tvWeatherDate4$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.cr6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return Weather2Activity.tvWeatherDate4_delegate$lambda$0(this.f6039IO);
        }
    });

    @aa1
    private final Lazy ivWeather5$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.er6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return Weather2Activity.ivWeather5_delegate$lambda$0(this.f6471IO);
        }
    });

    @aa1
    private final Lazy tvWeatherValue5$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.fr6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return Weather2Activity.tvWeatherValue5_delegate$lambda$0(this.f6713IO);
        }
    });

    @aa1
    private final Lazy tvWeatherDate5$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.hr6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return Weather2Activity.tvWeatherDate5_delegate$lambda$0(this.f7187IO);
        }
    });

    @aa1
    private final Lazy ivWeather6$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ir6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return Weather2Activity.ivWeather6_delegate$lambda$0(this.f8745IO);
        }
    });

    @aa1
    private final Lazy tvWeatherValue6$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.jr6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return Weather2Activity.tvWeatherValue6_delegate$lambda$0(this.f9029IO);
        }
    });

    @aa1
    private final Lazy tvWeatherDate6$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.kr6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return Weather2Activity.tvWeatherDate6_delegate$lambda$0(this.f9264IO);
        }
    });

    @aa1
    private final Lazy ivWeather7$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.lr6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return Weather2Activity.ivWeather7_delegate$lambda$0(this.f9503IO);
        }
    });

    @aa1
    private final Lazy tvWeatherValue7$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.mr6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return Weather2Activity.tvWeatherValue7_delegate$lambda$0(this.f9772IO);
        }
    });

    @aa1
    private final Lazy tvWeatherDate7$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.nr6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return Weather2Activity.tvWeatherDate7_delegate$lambda$0(this.f10003IO);
        }
    });

    @aa1
    private final Lazy tv_city_name$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.pr6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return Weather2Activity.tv_city_name_delegate$lambda$0(this.f10425IO);
        }
    });

    public Weather2Activity() {
        a01 a01Var = a01.OXO1;
        SPUtils sPUtilsIiI10X = a01Var.IiI10X();
        Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
        this.userProfile = (AppUser) (objFromJson != null ? objFromJson : appUser);
        SPUtils sPUtilsIiI10X2 = a01Var.IiI10X();
        Object appUser2 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object objFromJson2 = new Gson().fromJson(sPUtilsIiI10X2.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
        this.mAppUser = (AppUser) (objFromJson2 != null ? objFromJson2 : appUser2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PFMedium abhTitleCenter_delegate$lambda$0(Weather2Activity weather2Activity) {
        return (PFMedium) weather2Activity.findViewById(R.id.abh_title_center);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View bg_delegate$lambda$0(Weather2Activity weather2Activity) {
        return weather2Activity.findViewById(R.id.fl_bg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView ivWeather1_delegate$lambda$0(Weather2Activity weather2Activity) {
        return (ImageView) weather2Activity.findViewById(R.id.iv_weather1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView ivWeather2_delegate$lambda$0(Weather2Activity weather2Activity) {
        return (ImageView) weather2Activity.findViewById(R.id.iv_weather2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView ivWeather3_delegate$lambda$0(Weather2Activity weather2Activity) {
        return (ImageView) weather2Activity.findViewById(R.id.iv_weather3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView ivWeather4_delegate$lambda$0(Weather2Activity weather2Activity) {
        return (ImageView) weather2Activity.findViewById(R.id.iv_weather4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView ivWeather5_delegate$lambda$0(Weather2Activity weather2Activity) {
        return (ImageView) weather2Activity.findViewById(R.id.iv_weather5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView ivWeather6_delegate$lambda$0(Weather2Activity weather2Activity) {
        return (ImageView) weather2Activity.findViewById(R.id.iv_weather6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView ivWeather7_delegate$lambda$0(Weather2Activity weather2Activity) {
        return (ImageView) weather2Activity.findViewById(R.id.iv_weather7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView ivWeather_delegate$lambda$0(Weather2Activity weather2Activity) {
        return (ImageView) weather2Activity.findViewById(R.id.iv_weather);
    }

    private final void setWeatherView(BleWeatherForecast2 bleWeatherForecast2, ImageView imageView, TextView textView) {
        BleWeather2 mWeather3 = bleWeatherForecast2.getMWeather3();
        Intrinsics.XXI(mWeather3);
        imageView.setImageResource(UtilsKt.X00XIX1(this, mWeather3.getMWeatherCode()));
        BleWeather2 mWeather4 = bleWeatherForecast2.getMWeather3();
        Intrinsics.XXI(mWeather4);
        String temp = getTemp(mWeather4.getMMinTemperature());
        BleWeather2 mWeather5 = bleWeatherForecast2.getMWeather3();
        Intrinsics.XXI(mWeather5);
        textView.setText(temp + "/" + getTemp(mWeather5.getMMaxTemperature()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvHumidityValue_delegate$lambda$0(Weather2Activity weather2Activity) {
        return (TextView) weather2Activity.findViewById(R.id.tv_humidity_value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvPrecipitationUnit_delegate$lambda$0(Weather2Activity weather2Activity) {
        return (TextView) weather2Activity.findViewById(R.id.tv_precipitation_unit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvPrecipitationValue_delegate$lambda$0(Weather2Activity weather2Activity) {
        return (TextView) weather2Activity.findViewById(R.id.tv_precipitation_value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvTemperatureMax_delegate$lambda$0(Weather2Activity weather2Activity) {
        return (TextView) weather2Activity.findViewById(R.id.tv_temperature_max);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvTemperatureMin_delegate$lambda$0(Weather2Activity weather2Activity) {
        return (TextView) weather2Activity.findViewById(R.id.tv_temperature_min);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvTemperatureUnit_delegate$lambda$0(Weather2Activity weather2Activity) {
        return (TextView) weather2Activity.findViewById(R.id.tv_temperature_unit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvTemperatureValue_delegate$lambda$0(Weather2Activity weather2Activity) {
        return (TextView) weather2Activity.findViewById(R.id.tv_temperature_value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvUviValue_delegate$lambda$0(Weather2Activity weather2Activity) {
        return (TextView) weather2Activity.findViewById(R.id.tv_uvi_value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvVisibilityUnit_delegate$lambda$0(Weather2Activity weather2Activity) {
        return (TextView) weather2Activity.findViewById(R.id.tv_visibility_unit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvVisibilityValue_delegate$lambda$0(Weather2Activity weather2Activity) {
        return (TextView) weather2Activity.findViewById(R.id.tv_visibility_value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvWeatherDate1_delegate$lambda$0(Weather2Activity weather2Activity) {
        return (TextView) weather2Activity.findViewById(R.id.tv_weather_date1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvWeatherDate2_delegate$lambda$0(Weather2Activity weather2Activity) {
        return (TextView) weather2Activity.findViewById(R.id.tv_weather_date2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvWeatherDate3_delegate$lambda$0(Weather2Activity weather2Activity) {
        return (TextView) weather2Activity.findViewById(R.id.tv_weather_date3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvWeatherDate4_delegate$lambda$0(Weather2Activity weather2Activity) {
        return (TextView) weather2Activity.findViewById(R.id.tv_weather_date4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvWeatherDate5_delegate$lambda$0(Weather2Activity weather2Activity) {
        return (TextView) weather2Activity.findViewById(R.id.tv_weather_date5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvWeatherDate6_delegate$lambda$0(Weather2Activity weather2Activity) {
        return (TextView) weather2Activity.findViewById(R.id.tv_weather_date6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvWeatherDate7_delegate$lambda$0(Weather2Activity weather2Activity) {
        return (TextView) weather2Activity.findViewById(R.id.tv_weather_date7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvWeatherName_delegate$lambda$0(Weather2Activity weather2Activity) {
        return (TextView) weather2Activity.findViewById(R.id.tv_weather_name);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvWeatherValue1_delegate$lambda$0(Weather2Activity weather2Activity) {
        return (TextView) weather2Activity.findViewById(R.id.tv_weather_value1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvWeatherValue2_delegate$lambda$0(Weather2Activity weather2Activity) {
        return (TextView) weather2Activity.findViewById(R.id.tv_weather_value2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvWeatherValue3_delegate$lambda$0(Weather2Activity weather2Activity) {
        return (TextView) weather2Activity.findViewById(R.id.tv_weather_value3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvWeatherValue4_delegate$lambda$0(Weather2Activity weather2Activity) {
        return (TextView) weather2Activity.findViewById(R.id.tv_weather_value4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvWeatherValue5_delegate$lambda$0(Weather2Activity weather2Activity) {
        return (TextView) weather2Activity.findViewById(R.id.tv_weather_value5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvWeatherValue6_delegate$lambda$0(Weather2Activity weather2Activity) {
        return (TextView) weather2Activity.findViewById(R.id.tv_weather_value6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvWeatherValue7_delegate$lambda$0(Weather2Activity weather2Activity) {
        return (TextView) weather2Activity.findViewById(R.id.tv_weather_value7);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvWindSpeedUnit_delegate$lambda$0(Weather2Activity weather2Activity) {
        return (TextView) weather2Activity.findViewById(R.id.tv_wind_speed_unit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvWindSpeedValue_delegate$lambda$0(Weather2Activity weather2Activity) {
        return (TextView) weather2Activity.findViewById(R.id.tv_wind_speed_value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tv_city_name_delegate$lambda$0(Weather2Activity weather2Activity) {
        return (TextView) weather2Activity.findViewById(R.id.tv_city_name);
    }

    public final PFMedium getAbhTitleCenter() {
        return (PFMedium) this.abhTitleCenter$delegate.getValue();
    }

    public final View getBg() {
        return (View) this.bg$delegate.getValue();
    }

    public final ImageView getIvWeather() {
        return (ImageView) this.ivWeather$delegate.getValue();
    }

    public final ImageView getIvWeather1() {
        return (ImageView) this.ivWeather1$delegate.getValue();
    }

    public final ImageView getIvWeather2() {
        return (ImageView) this.ivWeather2$delegate.getValue();
    }

    public final ImageView getIvWeather3() {
        return (ImageView) this.ivWeather3$delegate.getValue();
    }

    public final ImageView getIvWeather4() {
        return (ImageView) this.ivWeather4$delegate.getValue();
    }

    public final ImageView getIvWeather5() {
        return (ImageView) this.ivWeather5$delegate.getValue();
    }

    public final ImageView getIvWeather6() {
        return (ImageView) this.ivWeather6$delegate.getValue();
    }

    public final ImageView getIvWeather7() {
        return (ImageView) this.ivWeather7$delegate.getValue();
    }

    @aa1
    public final String getTemp(int i) {
        return cp5.X01IiOiIi(this, i, cp5.II1Xi0(this.mAppUser.getUnit()) == 1);
    }

    public final TextView getTvHumidityValue() {
        return (TextView) this.tvHumidityValue$delegate.getValue();
    }

    public final TextView getTvPrecipitationUnit() {
        return (TextView) this.tvPrecipitationUnit$delegate.getValue();
    }

    public final TextView getTvPrecipitationValue() {
        return (TextView) this.tvPrecipitationValue$delegate.getValue();
    }

    public final TextView getTvTemperatureMax() {
        return (TextView) this.tvTemperatureMax$delegate.getValue();
    }

    public final TextView getTvTemperatureMin() {
        return (TextView) this.tvTemperatureMin$delegate.getValue();
    }

    public final TextView getTvTemperatureUnit() {
        return (TextView) this.tvTemperatureUnit$delegate.getValue();
    }

    public final TextView getTvTemperatureValue() {
        return (TextView) this.tvTemperatureValue$delegate.getValue();
    }

    public final TextView getTvUviValue() {
        return (TextView) this.tvUviValue$delegate.getValue();
    }

    public final TextView getTvVisibilityUnit() {
        return (TextView) this.tvVisibilityUnit$delegate.getValue();
    }

    public final TextView getTvVisibilityValue() {
        return (TextView) this.tvVisibilityValue$delegate.getValue();
    }

    public final TextView getTvWeatherDate1() {
        return (TextView) this.tvWeatherDate1$delegate.getValue();
    }

    public final TextView getTvWeatherDate2() {
        return (TextView) this.tvWeatherDate2$delegate.getValue();
    }

    public final TextView getTvWeatherDate3() {
        return (TextView) this.tvWeatherDate3$delegate.getValue();
    }

    public final TextView getTvWeatherDate4() {
        return (TextView) this.tvWeatherDate4$delegate.getValue();
    }

    public final TextView getTvWeatherDate5() {
        return (TextView) this.tvWeatherDate5$delegate.getValue();
    }

    public final TextView getTvWeatherDate6() {
        return (TextView) this.tvWeatherDate6$delegate.getValue();
    }

    public final TextView getTvWeatherDate7() {
        return (TextView) this.tvWeatherDate7$delegate.getValue();
    }

    public final TextView getTvWeatherName() {
        return (TextView) this.tvWeatherName$delegate.getValue();
    }

    public final TextView getTvWeatherValue1() {
        return (TextView) this.tvWeatherValue1$delegate.getValue();
    }

    public final TextView getTvWeatherValue2() {
        return (TextView) this.tvWeatherValue2$delegate.getValue();
    }

    public final TextView getTvWeatherValue3() {
        return (TextView) this.tvWeatherValue3$delegate.getValue();
    }

    public final TextView getTvWeatherValue4() {
        return (TextView) this.tvWeatherValue4$delegate.getValue();
    }

    public final TextView getTvWeatherValue5() {
        return (TextView) this.tvWeatherValue5$delegate.getValue();
    }

    public final TextView getTvWeatherValue6() {
        return (TextView) this.tvWeatherValue6$delegate.getValue();
    }

    public final TextView getTvWeatherValue7() {
        return (TextView) this.tvWeatherValue7$delegate.getValue();
    }

    public final TextView getTvWindSpeedUnit() {
        return (TextView) this.tvWindSpeedUnit$delegate.getValue();
    }

    public final TextView getTvWindSpeedValue() {
        return (TextView) this.tvWindSpeedValue$delegate.getValue();
    }

    public final TextView getTv_city_name() {
        return (TextView) this.tv_city_name$delegate.getValue();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    @SuppressLint({"SetTextI18n"})
    public void initView() {
        Object objValueOf;
        Activity mContext;
        int i;
        transparentStatusBar();
        BarUtils.setStatusBarLightMode((Activity) this, false);
        setNavBarColor(this, gk4.m1859iO(getMContext(), R.color.black));
        BarUtils.addMarginTopEqualStatusBarHeight(findViewById(R.id.fl_container));
        getAbhTitleCenter().setText(R.string.weather);
        BleCache bleCache = BleCache.INSTANCE;
        BleWeatherRealtime2 bleWeatherRealtime2 = (BleWeatherRealtime2) BaseBleCache.getObject$default(bleCache, BleKey.WEATHER_REALTIME2, BleWeatherRealtime2.class, null, 4, null);
        if (bleWeatherRealtime2 != null) {
            BleWeather2 mWeather = bleWeatherRealtime2.getMWeather();
            Intrinsics.XXI(mWeather);
            int mWeatherCode = mWeather.getMWeatherCode();
            getBg().setBackgroundResource(UtilsKt.m38843OO(this, mWeatherCode));
            getIvWeather().setImageResource(UtilsKt.X00XIX1(this, mWeatherCode));
            TextView tvTemperatureValue = getTvTemperatureValue();
            if (cp5.II1Xi0(this.mAppUser.getUnit()) == 1) {
                BleWeather2 mWeather2 = bleWeatherRealtime2.getMWeather();
                Intrinsics.XXI(mWeather2);
                objValueOf = Float.valueOf(cp5.I0iXXO(mWeather2.getMCurrentTemperature()));
            } else {
                BleWeather2 mWeather3 = bleWeatherRealtime2.getMWeather();
                Intrinsics.XXI(mWeather3);
                objValueOf = Integer.valueOf(mWeather3.getMCurrentTemperature());
            }
            tvTemperatureValue.setText(String.valueOf(objValueOf));
            TextView tvTemperatureUnit = getTvTemperatureUnit();
            if (cp5.II1Xi0(this.mAppUser.getUnit()) == 1) {
                mContext = getMContext();
                i = R.string.fahrenheit;
            } else {
                mContext = getMContext();
                i = R.string.degree_centigrade;
            }
            tvTemperatureUnit.setText(mContext.getString(i));
            getTvWeatherName().setText(UtilsKt.i0X000X0O(this, mWeatherCode));
            TextView tvHumidityValue = getTvHumidityValue();
            BleWeather2 mWeather4 = bleWeatherRealtime2.getMWeather();
            Intrinsics.XXI(mWeather4);
            tvHumidityValue.setText(String.valueOf(mWeather4.getMHumidity()));
            TextView tvVisibilityValue = getTvVisibilityValue();
            BleWeather2 mWeather5 = bleWeatherRealtime2.getMWeather();
            Intrinsics.XXI(mWeather5);
            tvVisibilityValue.setText(String.valueOf(cp5.X1ii(mWeather5.getMVisibility() * 1000, this.userProfile.getUnit(), false, 4, null)));
            getTvVisibilityUnit().setText(getString(cp5.OiIIX101O(this.userProfile.getUnit())));
            TextView tvWindSpeedValue = getTvWindSpeedValue();
            BleWeather2 mWeather6 = bleWeatherRealtime2.getMWeather();
            Intrinsics.XXI(mWeather6);
            tvWindSpeedValue.setText(String.valueOf(cp5.i11I(mWeather6.getMWindSpeed(), this.userProfile.getUnit())));
            getTvWindSpeedUnit().setText(getString(this.userProfile.getUnit() == 0 ? R.string.km_h : R.string.mi_h));
        }
        BleWeatherForecast2 bleWeatherForecast2 = (BleWeatherForecast2) BaseBleCache.getObject$default(bleCache, BleKey.WEATHER_FORECAST2, BleWeatherForecast2.class, null, 4, null);
        if (bleWeatherForecast2 != null) {
            TextView tvTemperatureMin = getTvTemperatureMin();
            BleWeather2 mWeather1 = bleWeatherForecast2.getMWeather1();
            Intrinsics.XXI(mWeather1);
            tvTemperatureMin.setText(getTemp(mWeather1.getMMinTemperature()));
            TextView tvTemperatureMax = getTvTemperatureMax();
            BleWeather2 mWeather7 = bleWeatherForecast2.getMWeather1();
            Intrinsics.XXI(mWeather7);
            tvTemperatureMax.setText(getTemp(mWeather7.getMMaxTemperature()));
            TextView tvUviValue = getTvUviValue();
            BleWeather2 mWeather8 = bleWeatherForecast2.getMWeather1();
            Intrinsics.XXI(mWeather8);
            tvUviValue.setText(UtilsKt.X100O(mWeather8.getMUltraVioletIntensity()));
            TextView tvPrecipitationValue = getTvPrecipitationValue();
            BleWeather2 mWeather9 = bleWeatherForecast2.getMWeather1();
            Intrinsics.XXI(mWeather9);
            tvPrecipitationValue.setText(cp5.Ii0X0X(mWeather9.getMPrecipitation(), this.userProfile.getUnit()));
            getTvPrecipitationUnit().setText(this.userProfile.getUnit() == 0 ? DateFormatUtils.MIN : "in");
            ImageView ivWeather1 = getIvWeather1();
            BleWeather2 mWeather10 = bleWeatherForecast2.getMWeather1();
            Intrinsics.XXI(mWeather10);
            ivWeather1.setImageResource(UtilsKt.X00XIX1(this, mWeather10.getMWeatherCode()));
            TextView tvWeatherValue1 = getTvWeatherValue1();
            BleWeather2 mWeather11 = bleWeatherForecast2.getMWeather1();
            Intrinsics.XXI(mWeather11);
            String temp = getTemp(mWeather11.getMMinTemperature());
            BleWeather2 mWeather12 = bleWeatherForecast2.getMWeather1();
            Intrinsics.XXI(mWeather12);
            tvWeatherValue1.setText(temp + "/" + getTemp(mWeather12.getMMaxTemperature()));
            getTvWeatherDate1().setText(O0X11OiO.iOO1ii1(((long) bleWeatherForecast2.getMTime()) * 1000, 0).IiI10X());
            ImageView ivWeather2 = getIvWeather2();
            BleWeather2 mWeather13 = bleWeatherForecast2.getMWeather2();
            Intrinsics.XXI(mWeather13);
            ivWeather2.setImageResource(UtilsKt.X00XIX1(this, mWeather13.getMWeatherCode()));
            TextView tvWeatherValue2 = getTvWeatherValue2();
            BleWeather2 mWeather14 = bleWeatherForecast2.getMWeather2();
            Intrinsics.XXI(mWeather14);
            String temp2 = getTemp(mWeather14.getMMinTemperature());
            BleWeather2 mWeather15 = bleWeatherForecast2.getMWeather2();
            Intrinsics.XXI(mWeather15);
            tvWeatherValue2.setText(temp2 + "/" + getTemp(mWeather15.getMMaxTemperature()));
            getTvWeatherDate2().setText(O0X11OiO.iOO1ii1(((long) bleWeatherForecast2.getMTime()) * 1000, 1).IiI10X());
            ImageView ivWeather3 = getIvWeather3();
            Intrinsics.O10IXXX0X(ivWeather3, "<get-ivWeather3>(...)");
            TextView tvWeatherValue3 = getTvWeatherValue3();
            Intrinsics.O10IXXX0X(tvWeatherValue3, "<get-tvWeatherValue3>(...)");
            setWeatherView(bleWeatherForecast2, ivWeather3, tvWeatherValue3);
            getTvWeatherDate3().setText(O0X11OiO.iOO1ii1(((long) bleWeatherForecast2.getMTime()) * 1000, 2).IiI10X());
            if (bleWeatherForecast2.getMWeather4() == null) {
                ImageView ivWeather4 = getIvWeather4();
                Intrinsics.O10IXXX0X(ivWeather4, "<get-ivWeather4>(...)");
                TextView tvWeatherValue4 = getTvWeatherValue4();
                Intrinsics.O10IXXX0X(tvWeatherValue4, "<get-tvWeatherValue4>(...)");
                setWeatherView(bleWeatherForecast2, ivWeather4, tvWeatherValue4);
                ImageView ivWeather5 = getIvWeather5();
                Intrinsics.O10IXXX0X(ivWeather5, "<get-ivWeather5>(...)");
                TextView tvWeatherValue5 = getTvWeatherValue5();
                Intrinsics.O10IXXX0X(tvWeatherValue5, "<get-tvWeatherValue5>(...)");
                setWeatherView(bleWeatherForecast2, ivWeather5, tvWeatherValue5);
                ImageView ivWeather6 = getIvWeather6();
                Intrinsics.O10IXXX0X(ivWeather6, "<get-ivWeather6>(...)");
                TextView tvWeatherValue6 = getTvWeatherValue6();
                Intrinsics.O10IXXX0X(tvWeatherValue6, "<get-tvWeatherValue6>(...)");
                setWeatherView(bleWeatherForecast2, ivWeather6, tvWeatherValue6);
                ImageView ivWeather7 = getIvWeather7();
                Intrinsics.O10IXXX0X(ivWeather7, "<get-ivWeather7>(...)");
                TextView tvWeatherValue7 = getTvWeatherValue7();
                Intrinsics.O10IXXX0X(tvWeatherValue7, "<get-tvWeatherValue7>(...)");
                setWeatherView(bleWeatherForecast2, ivWeather7, tvWeatherValue7);
                return;
            }
            ImageView ivWeather8 = getIvWeather4();
            BleWeather2 mWeather16 = bleWeatherForecast2.getMWeather4();
            Intrinsics.XXI(mWeather16);
            ivWeather8.setImageResource(UtilsKt.X00XIX1(this, mWeather16.getMWeatherCode()));
            TextView tvWeatherValue8 = getTvWeatherValue4();
            BleWeather2 mWeather17 = bleWeatherForecast2.getMWeather4();
            Intrinsics.XXI(mWeather17);
            String temp3 = getTemp(mWeather17.getMMinTemperature());
            BleWeather2 mWeather18 = bleWeatherForecast2.getMWeather4();
            Intrinsics.XXI(mWeather18);
            tvWeatherValue8.setText(temp3 + "/" + getTemp(mWeather18.getMMaxTemperature()));
            getTvWeatherDate4().setText(O0X11OiO.iOO1ii1(((long) bleWeatherForecast2.getMTime()) * 1000, 3).IiI10X());
            ImageView ivWeather9 = getIvWeather5();
            BleWeather2 mWeather19 = bleWeatherForecast2.getMWeather5();
            Intrinsics.XXI(mWeather19);
            ivWeather9.setImageResource(UtilsKt.X00XIX1(this, mWeather19.getMWeatherCode()));
            TextView tvWeatherValue9 = getTvWeatherValue5();
            BleWeather2 mWeather20 = bleWeatherForecast2.getMWeather5();
            Intrinsics.XXI(mWeather20);
            String temp4 = getTemp(mWeather20.getMMinTemperature());
            BleWeather2 mWeather21 = bleWeatherForecast2.getMWeather5();
            Intrinsics.XXI(mWeather21);
            tvWeatherValue9.setText(temp4 + "/" + getTemp(mWeather21.getMMaxTemperature()));
            getTvWeatherDate5().setText(O0X11OiO.iOO1ii1(((long) bleWeatherForecast2.getMTime()) * 1000, 4).IiI10X());
            ImageView ivWeather10 = getIvWeather6();
            BleWeather2 mWeather22 = bleWeatherForecast2.getMWeather6();
            Intrinsics.XXI(mWeather22);
            ivWeather10.setImageResource(UtilsKt.X00XIX1(this, mWeather22.getMWeatherCode()));
            TextView tvWeatherValue10 = getTvWeatherValue6();
            BleWeather2 mWeather23 = bleWeatherForecast2.getMWeather6();
            Intrinsics.XXI(mWeather23);
            String temp5 = getTemp(mWeather23.getMMinTemperature());
            BleWeather2 mWeather24 = bleWeatherForecast2.getMWeather6();
            Intrinsics.XXI(mWeather24);
            tvWeatherValue10.setText(temp5 + "/" + getTemp(mWeather24.getMMaxTemperature()));
            getTvWeatherDate6().setText(O0X11OiO.iOO1ii1(((long) bleWeatherForecast2.getMTime()) * 1000, 5).IiI10X());
            ImageView ivWeather11 = getIvWeather7();
            BleWeather2 mWeather25 = bleWeatherForecast2.getMWeather7();
            Intrinsics.XXI(mWeather25);
            ivWeather11.setImageResource(UtilsKt.X00XIX1(this, mWeather25.getMWeatherCode()));
            TextView tvWeatherValue11 = getTvWeatherValue7();
            BleWeather2 mWeather26 = bleWeatherForecast2.getMWeather7();
            Intrinsics.XXI(mWeather26);
            String temp6 = getTemp(mWeather26.getMMinTemperature());
            BleWeather2 mWeather27 = bleWeatherForecast2.getMWeather7();
            Intrinsics.XXI(mWeather27);
            tvWeatherValue11.setText(temp6 + "/" + getTemp(mWeather27.getMMaxTemperature()));
            getTvWeatherDate7().setText(O0X11OiO.iOO1ii1(((long) bleWeatherForecast2.getMTime()) * 1000, 6).IiI10X());
        }
        SPUtils sPUtilsOXO1 = a01.OXO1.OXO1();
        WeatherRealtime weatherRealtime = (WeatherRealtime) new Gson().fromJson(sPUtilsOXO1.getString(b01.X111IO + '_' + WeatherRealtime.class.getName()), WeatherRealtime.class);
        if (weatherRealtime == null) {
            getTv_city_name().setVisibility(8);
        } else {
            getTv_city_name().setVisibility(0);
            getTv_city_name().setText(weatherRealtime.getName());
        }
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_weather2;
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        finish();
    }
}
