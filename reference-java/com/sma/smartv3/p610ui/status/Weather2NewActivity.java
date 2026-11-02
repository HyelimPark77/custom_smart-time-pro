package com.sma.smartv3.p610ui.status;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.OiOX0i;
import com.android.mltcode.paycertificationapi.X0IOiX1O;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.SPUtils;
import com.google.gson.Gson;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.model.WeatherRealtime;
import com.sma.smartv3.p610ui.status.Weather2NewActivity;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.UtilsKt;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.BleKeyFlag;
import com.szabh.smable3.component.BaseBleCache;
import com.szabh.smable3.component.BaseBleConnector;
import com.szabh.smable3.component.BleCache;
import com.szabh.smable3.component.BleConnector;
import com.szabh.smable3.entity.BleWeather2;
import com.szabh.smable3.entity.BleWeatherForecast2;
import com.szabh.smable3.entity.BleWeatherRealtime2;
import com.tenmeter.smlibrary.utils.DateFormatUtils;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nWeather2NewActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Weather2NewActivity.kt\ncom/sma/smartv3/ui/status/Weather2NewActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,263:1\n19#2:264\n15#2:265\n90#2:266\n*S KotlinDebug\n*F\n+ 1 Weather2NewActivity.kt\ncom/sma/smartv3/ui/status/Weather2NewActivity\n*L\n105#1:264\n105#1:265\n127#1:266\n*E\n"})
public final class Weather2NewActivity extends BaseActivity {

    @aa1
    private AppUser mAppUser;
    private boolean mUnit;

    @aa1
    private final Lazy tvTemperatureValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ps6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return Weather2NewActivity.tvTemperatureValue_delegate$lambda$0(this.f10430IO);
        }
    });

    @aa1
    private final Lazy tvWeatherName$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.hs6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return Weather2NewActivity.tvWeatherName_delegate$lambda$0(this.f7194IO);
        }
    });

    @aa1
    private final Lazy tvWeatherTemp$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ts6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return Weather2NewActivity.tvWeatherTemp_delegate$lambda$0(this.f11349IO);
        }
    });

    @aa1
    private final Lazy tv_city_name$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ft6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return Weather2NewActivity.tv_city_name_delegate$lambda$0(this.f6730IO);
        }
    });

    @aa1
    private final Lazy tvUviValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.kt6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return Weather2NewActivity.tvUviValue_delegate$lambda$0(this.f9278IO);
        }
    });

    @aa1
    private final Lazy tvHumidityValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.mt6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return Weather2NewActivity.tvHumidityValue_delegate$lambda$0(this.f9783IO);
        }
    });

    @aa1
    private final Lazy tvVisibilityValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.nt6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return Weather2NewActivity.tvVisibilityValue_delegate$lambda$0(this.f10012IO);
        }
    });

    @aa1
    private final Lazy tvVisibilityUnit$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ot6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return Weather2NewActivity.tvVisibilityUnit_delegate$lambda$0(this.f10221IO);
        }
    });

    @aa1
    private final Lazy tvWindSpeedValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.pt6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return Weather2NewActivity.tvWindSpeedValue_delegate$lambda$0(this.f10436IO);
        }
    });

    @aa1
    private final Lazy tvWindSpeedUnit$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.qt6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return Weather2NewActivity.tvWindSpeedUnit_delegate$lambda$0(this.f10677IO);
        }
    });

    @aa1
    private final Lazy tvPrecipitationValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.at6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return Weather2NewActivity.tvPrecipitationValue_delegate$lambda$0(this.f5564IO);
        }
    });

    @aa1
    private final Lazy tvPrecipitationUnit$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.lt6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return Weather2NewActivity.tvPrecipitationUnit_delegate$lambda$0(this.f9517IO);
        }
    });

    @aa1
    private final Lazy todayIcon$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.rt6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return Weather2NewActivity.todayIcon_delegate$lambda$0(this.f10906IO);
        }
    });

    @aa1
    private final Lazy ivWeather1$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.st6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return Weather2NewActivity.ivWeather1_delegate$lambda$0(this.f11125IO);
        }
    });

    @aa1
    private final Lazy tvWeatherMinValue1$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.tt6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return Weather2NewActivity.tvWeatherMinValue1_delegate$lambda$0(this.f11355IO);
        }
    });

    @aa1
    private final Lazy tvWeatherMaxValue1$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ut6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return Weather2NewActivity.tvWeatherMaxValue1_delegate$lambda$0(this.f11570IO);
        }
    });

    @aa1
    private final Lazy tvWeatherDate1$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.vt6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return Weather2NewActivity.tvWeatherDate1_delegate$lambda$0(this.f11810IO);
        }
    });

    @aa1
    private final Lazy ivWeather2$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.wt6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return Weather2NewActivity.ivWeather2_delegate$lambda$0(this.f12033IO);
        }
    });

    @aa1
    private final Lazy tvWeatherMinValue2$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.fs6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return Weather2NewActivity.tvWeatherMinValue2_delegate$lambda$0(this.f6723IO);
        }
    });

    @aa1
    private final Lazy tvWeatherMaxValue2$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.gs6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return Weather2NewActivity.tvWeatherMaxValue2_delegate$lambda$0(this.f6951IO);
        }
    });

    @aa1
    private final Lazy tvWeatherDate2$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.is6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return Weather2NewActivity.tvWeatherDate2_delegate$lambda$0(this.f8750IO);
        }
    });

    @aa1
    private final Lazy ivWeather3$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.js6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return Weather2NewActivity.ivWeather3_delegate$lambda$0(this.f9033IO);
        }
    });

    @aa1
    private final Lazy tvWeatherMinValue3$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ks6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return Weather2NewActivity.tvWeatherMinValue3_delegate$lambda$0(this.f9274IO);
        }
    });

    @aa1
    private final Lazy tvWeatherMaxValue3$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ls6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return Weather2NewActivity.tvWeatherMaxValue3_delegate$lambda$0(this.f9508IO);
        }
    });

    @aa1
    private final Lazy tvWeatherDate3$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ms6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return Weather2NewActivity.tvWeatherDate3_delegate$lambda$0(this.f9780IO);
        }
    });

    @aa1
    private final Lazy ivWeather4$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ns6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return Weather2NewActivity.ivWeather4_delegate$lambda$0(this.f10008IO);
        }
    });

    @aa1
    private final Lazy tvWeatherMinValue4$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.os6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return Weather2NewActivity.tvWeatherMinValue4_delegate$lambda$0(this.f10214IO);
        }
    });

    @aa1
    private final Lazy tvWeatherMaxValue4$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.qs6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return Weather2NewActivity.tvWeatherMaxValue4_delegate$lambda$0(this.f10669IO);
        }
    });

    @aa1
    private final Lazy tvWeatherDate4$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.rs6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return Weather2NewActivity.tvWeatherDate4_delegate$lambda$0(this.f10897IO);
        }
    });

    @aa1
    private final Lazy ivWeather5$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ss6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return Weather2NewActivity.ivWeather5_delegate$lambda$0(this.f11118IO);
        }
    });

    @aa1
    private final Lazy tvWeatherMinValue5$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.us6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return Weather2NewActivity.tvWeatherMinValue5_delegate$lambda$0(this.f11563IO);
        }
    });

    @aa1
    private final Lazy tvWeatherMaxValue5$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.vs6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return Weather2NewActivity.tvWeatherMaxValue5_delegate$lambda$0(this.f11805IO);
        }
    });

    @aa1
    private final Lazy tvWeatherDate5$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ws6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return Weather2NewActivity.tvWeatherDate5_delegate$lambda$0(this.f12027IO);
        }
    });

    @aa1
    private final Lazy ivWeather6$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.xs6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return Weather2NewActivity.ivWeather6_delegate$lambda$0(this.f12229IO);
        }
    });

    @aa1
    private final Lazy tvWeatherMinValue6$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ys6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return Weather2NewActivity.tvWeatherMinValue6_delegate$lambda$0(this.f12445IO);
        }
    });

    @aa1
    private final Lazy tvWeatherMaxValue6$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.zs6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return Weather2NewActivity.tvWeatherMaxValue6_delegate$lambda$0(this.f12687IO);
        }
    });

    @aa1
    private final Lazy tvWeatherDate6$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.bt6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return Weather2NewActivity.tvWeatherDate6_delegate$lambda$0(this.f5813IO);
        }
    });

    @aa1
    private final Lazy ivWeather7$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ct6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return Weather2NewActivity.ivWeather7_delegate$lambda$0(this.f6049IO);
        }
    });

    @aa1
    private final Lazy tvWeatherMinValue7$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.dt6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return Weather2NewActivity.tvWeatherMinValue7_delegate$lambda$0(this.f6265IO);
        }
    });

    @aa1
    private final Lazy tvWeatherMaxValue7$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.et6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return Weather2NewActivity.tvWeatherMaxValue7_delegate$lambda$0(this.f6484IO);
        }
    });

    @aa1
    private final Lazy tvWeatherDate7$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.gt6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return Weather2NewActivity.tvWeatherDate7_delegate$lambda$0(this.f6957IO);
        }
    });

    @aa1
    private final Lazy abhTitleCenter$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ht6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return Weather2NewActivity.abhTitleCenter_delegate$lambda$0(this.f7200IO);
        }
    });

    @aa1
    private final Lazy abhTitleRight$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.it6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return Weather2NewActivity.abhTitleRight_delegate$lambda$0(this.f8755IO);
        }
    });

    @aa1
    private final Lazy abhTitleLeft$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.jt6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return Weather2NewActivity.abhTitleLeft_delegate$lambda$0(this.f9039IO);
        }
    });

    public Weather2NewActivity() {
        SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
        Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
        this.mAppUser = (AppUser) (objFromJson != null ? objFromJson : appUser);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView abhTitleCenter_delegate$lambda$0(Weather2NewActivity weather2NewActivity) {
        return (TextView) weather2NewActivity.findViewById(R.id.abh_title_center);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView abhTitleLeft_delegate$lambda$0(Weather2NewActivity weather2NewActivity) {
        return (ImageView) weather2NewActivity.findViewById(R.id.abh_title_left);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView abhTitleRight_delegate$lambda$0(Weather2NewActivity weather2NewActivity) {
        return (ImageView) weather2NewActivity.findViewById(R.id.abh_title_right);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView ivWeather1_delegate$lambda$0(Weather2NewActivity weather2NewActivity) {
        return (ImageView) weather2NewActivity.findViewById(R.id.weather1_icon);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView ivWeather2_delegate$lambda$0(Weather2NewActivity weather2NewActivity) {
        return (ImageView) weather2NewActivity.findViewById(R.id.weather2_icon);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView ivWeather3_delegate$lambda$0(Weather2NewActivity weather2NewActivity) {
        return (ImageView) weather2NewActivity.findViewById(R.id.weather3_icon);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView ivWeather4_delegate$lambda$0(Weather2NewActivity weather2NewActivity) {
        return (ImageView) weather2NewActivity.findViewById(R.id.weather4_icon);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView ivWeather5_delegate$lambda$0(Weather2NewActivity weather2NewActivity) {
        return (ImageView) weather2NewActivity.findViewById(R.id.weather5_icon);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView ivWeather6_delegate$lambda$0(Weather2NewActivity weather2NewActivity) {
        return (ImageView) weather2NewActivity.findViewById(R.id.weather6_icon);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView ivWeather7_delegate$lambda$0(Weather2NewActivity weather2NewActivity) {
        return (ImageView) weather2NewActivity.findViewById(R.id.weather7_icon);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onTitleRightClick$lambda$0(Weather2NewActivity weather2NewActivity, BleConnector it) {
        Intrinsics.X0O(it, "it");
        BaseBleConnector.sendInt8$default(it, BleKey.TEMPERATURE_UNIT, BleKeyFlag.UPDATE, OiOX0i.m1037iO(weather2NewActivity.mUnit), false, false, 24, null);
        weather2NewActivity.setDayData();
        weather2NewActivity.setRealData();
        weather2NewActivity.getAbhTitleRight().setImageResource(weather2NewActivity.mUnit ? R.mipmap.abh_weather_right_icon_f : R.mipmap.abh_weather_right_icon_c);
        return Unit.OXO1;
    }

    private final void setCityData() {
        SPUtils sPUtilsOXO1 = a01.OXO1.OXO1();
        WeatherRealtime weatherRealtime = (WeatherRealtime) new Gson().fromJson(sPUtilsOXO1.getString(b01.X111IO + '_' + WeatherRealtime.class.getName()), WeatherRealtime.class);
        if (weatherRealtime == null) {
            getTv_city_name().setVisibility(8);
        } else {
            getTv_city_name().setVisibility(0);
            getTv_city_name().setText(weatherRealtime.getName());
        }
    }

    private final void setDayData() {
        BleWeatherForecast2 bleWeatherForecast2 = (BleWeatherForecast2) BaseBleCache.getObject$default(BleCache.INSTANCE, BleKey.WEATHER_FORECAST2, BleWeatherForecast2.class, null, 4, null);
        if (bleWeatherForecast2 != null) {
            BleWeather2 mWeather1 = bleWeatherForecast2.getMWeather1();
            Intrinsics.XXI(mWeather1);
            int mMinTemperature = mWeather1.getMMinTemperature();
            BleWeather2 mWeather2 = bleWeatherForecast2.getMWeather1();
            Intrinsics.XXI(mWeather2);
            int mMaxTemperature = mWeather2.getMMaxTemperature();
            getTvWeatherTemp().setText(weatherCentigradeToFahrenheit(mMinTemperature) + weatherUnit() + "/" + weatherCentigradeToFahrenheit(mMaxTemperature) + weatherUnit());
            TextView tvUviValue = getTvUviValue();
            BleWeather2 mWeather3 = bleWeatherForecast2.getMWeather1();
            Intrinsics.XXI(mWeather3);
            tvUviValue.setText(UtilsKt.X100O(mWeather3.getMUltraVioletIntensity()));
            TextView tvPrecipitationValue = getTvPrecipitationValue();
            BleWeather2 mWeather4 = bleWeatherForecast2.getMWeather1();
            Intrinsics.XXI(mWeather4);
            tvPrecipitationValue.setText(cp5.Ii0X0X(mWeather4.getMPrecipitation(), this.mAppUser.getUnit()));
            getTvPrecipitationUnit().setText(this.mAppUser.getUnit() == 0 ? DateFormatUtils.MIN : "in");
            TextView tvWeatherMinValue1 = getTvWeatherMinValue1();
            BleWeather2 mWeather5 = bleWeatherForecast2.getMWeather1();
            Intrinsics.XXI(mWeather5);
            tvWeatherMinValue1.setText(getTemp(mWeather5.getMMinTemperature()));
            TextView tvWeatherMaxValue1 = getTvWeatherMaxValue1();
            BleWeather2 mWeather6 = bleWeatherForecast2.getMWeather1();
            Intrinsics.XXI(mWeather6);
            tvWeatherMaxValue1.setText(getTemp(mWeather6.getMMaxTemperature()));
            ImageView ivWeather1 = getIvWeather1();
            BleWeather2 mWeather7 = bleWeatherForecast2.getMWeather1();
            Intrinsics.XXI(mWeather7);
            ivWeather1.setImageResource(UtilsKt.iOiXi11II(this, mWeather7.getMWeatherCode()));
            getTvWeatherDate1().setText(getString(R.string.today));
            TextView tvWeatherMinValue2 = getTvWeatherMinValue2();
            BleWeather2 mWeather8 = bleWeatherForecast2.getMWeather2();
            Intrinsics.XXI(mWeather8);
            tvWeatherMinValue2.setText(getTemp(mWeather8.getMMinTemperature()));
            TextView tvWeatherMaxValue2 = getTvWeatherMaxValue2();
            BleWeather2 mWeather9 = bleWeatherForecast2.getMWeather2();
            Intrinsics.XXI(mWeather9);
            tvWeatherMaxValue2.setText(getTemp(mWeather9.getMMaxTemperature()));
            ImageView ivWeather2 = getIvWeather2();
            BleWeather2 mWeather10 = bleWeatherForecast2.getMWeather2();
            Intrinsics.XXI(mWeather10);
            ivWeather2.setImageResource(UtilsKt.iOiXi11II(this, mWeather10.getMWeatherCode()));
            getTvWeatherDate2().setText(O0X11OiO.iOO1ii1(((long) bleWeatherForecast2.getMTime()) * 1000, 1).IiI10X());
            TextView tvWeatherMinValue3 = getTvWeatherMinValue3();
            BleWeather2 mWeather11 = bleWeatherForecast2.getMWeather3();
            Intrinsics.XXI(mWeather11);
            tvWeatherMinValue3.setText(getTemp(mWeather11.getMMinTemperature()));
            TextView tvWeatherMaxValue3 = getTvWeatherMaxValue3();
            BleWeather2 mWeather12 = bleWeatherForecast2.getMWeather3();
            Intrinsics.XXI(mWeather12);
            tvWeatherMaxValue3.setText(getTemp(mWeather12.getMMaxTemperature()));
            ImageView ivWeather3 = getIvWeather3();
            BleWeather2 mWeather13 = bleWeatherForecast2.getMWeather3();
            Intrinsics.XXI(mWeather13);
            ivWeather3.setImageResource(UtilsKt.iOiXi11II(this, mWeather13.getMWeatherCode()));
            getTvWeatherDate3().setText(O0X11OiO.iOO1ii1(((long) bleWeatherForecast2.getMTime()) * 1000, 2).IiI10X());
            TextView tvWeatherMinValue4 = getTvWeatherMinValue4();
            BleWeather2 mWeather14 = bleWeatherForecast2.getMWeather4();
            Intrinsics.XXI(mWeather14);
            tvWeatherMinValue4.setText(getTemp(mWeather14.getMMinTemperature()));
            TextView tvWeatherMaxValue4 = getTvWeatherMaxValue4();
            BleWeather2 mWeather15 = bleWeatherForecast2.getMWeather4();
            Intrinsics.XXI(mWeather15);
            tvWeatherMaxValue4.setText(getTemp(mWeather15.getMMaxTemperature()));
            ImageView ivWeather4 = getIvWeather4();
            BleWeather2 mWeather16 = bleWeatherForecast2.getMWeather4();
            Intrinsics.XXI(mWeather16);
            ivWeather4.setImageResource(UtilsKt.iOiXi11II(this, mWeather16.getMWeatherCode()));
            getTvWeatherDate4().setText(O0X11OiO.iOO1ii1(((long) bleWeatherForecast2.getMTime()) * 1000, 3).IiI10X());
            TextView tvWeatherMinValue5 = getTvWeatherMinValue5();
            BleWeather2 mWeather17 = bleWeatherForecast2.getMWeather5();
            Intrinsics.XXI(mWeather17);
            tvWeatherMinValue5.setText(getTemp(mWeather17.getMMinTemperature()));
            TextView tvWeatherMaxValue5 = getTvWeatherMaxValue5();
            BleWeather2 mWeather18 = bleWeatherForecast2.getMWeather5();
            Intrinsics.XXI(mWeather18);
            tvWeatherMaxValue5.setText(getTemp(mWeather18.getMMaxTemperature()));
            ImageView ivWeather5 = getIvWeather5();
            BleWeather2 mWeather19 = bleWeatherForecast2.getMWeather5();
            Intrinsics.XXI(mWeather19);
            ivWeather5.setImageResource(UtilsKt.iOiXi11II(this, mWeather19.getMWeatherCode()));
            getTvWeatherDate5().setText(O0X11OiO.iOO1ii1(((long) bleWeatherForecast2.getMTime()) * 1000, 4).IiI10X());
            TextView tvWeatherMinValue6 = getTvWeatherMinValue6();
            BleWeather2 mWeather20 = bleWeatherForecast2.getMWeather6();
            Intrinsics.XXI(mWeather20);
            tvWeatherMinValue6.setText(getTemp(mWeather20.getMMinTemperature()));
            TextView tvWeatherMaxValue6 = getTvWeatherMaxValue6();
            BleWeather2 mWeather21 = bleWeatherForecast2.getMWeather6();
            Intrinsics.XXI(mWeather21);
            tvWeatherMaxValue6.setText(getTemp(mWeather21.getMMaxTemperature()));
            ImageView ivWeather6 = getIvWeather6();
            BleWeather2 mWeather22 = bleWeatherForecast2.getMWeather6();
            Intrinsics.XXI(mWeather22);
            ivWeather6.setImageResource(UtilsKt.iOiXi11II(this, mWeather22.getMWeatherCode()));
            getTvWeatherDate6().setText(O0X11OiO.iOO1ii1(((long) bleWeatherForecast2.getMTime()) * 1000, 5).IiI10X());
            TextView tvWeatherMinValue7 = getTvWeatherMinValue7();
            BleWeather2 mWeather23 = bleWeatherForecast2.getMWeather7();
            Intrinsics.XXI(mWeather23);
            tvWeatherMinValue7.setText(getTemp(mWeather23.getMMinTemperature()));
            TextView tvWeatherMaxValue7 = getTvWeatherMaxValue7();
            BleWeather2 mWeather24 = bleWeatherForecast2.getMWeather7();
            Intrinsics.XXI(mWeather24);
            tvWeatherMaxValue7.setText(getTemp(mWeather24.getMMaxTemperature()));
            ImageView ivWeather7 = getIvWeather7();
            BleWeather2 mWeather25 = bleWeatherForecast2.getMWeather7();
            Intrinsics.XXI(mWeather25);
            ivWeather7.setImageResource(UtilsKt.iOiXi11II(this, mWeather25.getMWeatherCode()));
            getTvWeatherDate7().setText(O0X11OiO.iOO1ii1(((long) bleWeatherForecast2.getMTime()) * 1000, 6).IiI10X());
        }
    }

    private final void setRealData() {
        Object objValueOf;
        BleWeatherRealtime2 bleWeatherRealtime2 = (BleWeatherRealtime2) BaseBleCache.getObject$default(BleCache.INSTANCE, BleKey.WEATHER_REALTIME2, BleWeatherRealtime2.class, null, 4, null);
        if (bleWeatherRealtime2 != null) {
            BleWeather2 mWeather = bleWeatherRealtime2.getMWeather();
            Intrinsics.XXI(mWeather);
            int mWeatherCode = mWeather.getMWeatherCode();
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
            BleWeather2 mWeather4 = bleWeatherRealtime2.getMWeather();
            Intrinsics.XXI(mWeather4);
            int mCurrentTemperature = mWeather4.getMCurrentTemperature();
            getTvTemperatureValue().setText(weatherCentigradeToFahrenheit(mCurrentTemperature) + getString(R.string.degree));
            getTodayIcon().setImageResource(UtilsKt.iOiXi11II(this, mWeatherCode));
            getTvWeatherName().setText(UtilsKt.i0X000X0O(this, mWeatherCode));
            TextView tvHumidityValue = getTvHumidityValue();
            BleWeather2 mWeather5 = bleWeatherRealtime2.getMWeather();
            Intrinsics.XXI(mWeather5);
            tvHumidityValue.setText(String.valueOf(mWeather5.getMHumidity()));
            TextView tvVisibilityValue = getTvVisibilityValue();
            BleWeather2 mWeather6 = bleWeatherRealtime2.getMWeather();
            Intrinsics.XXI(mWeather6);
            tvVisibilityValue.setText(String.valueOf(cp5.X1ii(mWeather6.getMVisibility() * 1000, this.mAppUser.getUnit(), false, 4, null)));
            getTvVisibilityUnit().setText(getString(cp5.OiIIX101O(this.mAppUser.getUnit())));
            TextView tvWindSpeedValue = getTvWindSpeedValue();
            BleWeather2 mWeather7 = bleWeatherRealtime2.getMWeather();
            Intrinsics.XXI(mWeather7);
            tvWindSpeedValue.setText(String.valueOf(cp5.i11I(mWeather7.getMWindSpeed(), this.mAppUser.getUnit())));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView todayIcon_delegate$lambda$0(Weather2NewActivity weather2NewActivity) {
        return (ImageView) weather2NewActivity.findViewById(R.id.today_icon);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvHumidityValue_delegate$lambda$0(Weather2NewActivity weather2NewActivity) {
        return (TextView) weather2NewActivity.findViewById(R.id.tv_humidity_value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvPrecipitationUnit_delegate$lambda$0(Weather2NewActivity weather2NewActivity) {
        return (TextView) weather2NewActivity.findViewById(R.id.tv_precipitation_unit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvPrecipitationValue_delegate$lambda$0(Weather2NewActivity weather2NewActivity) {
        return (TextView) weather2NewActivity.findViewById(R.id.tv_precipitation_value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvTemperatureValue_delegate$lambda$0(Weather2NewActivity weather2NewActivity) {
        return (TextView) weather2NewActivity.findViewById(R.id.nowWeather_temp);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvUviValue_delegate$lambda$0(Weather2NewActivity weather2NewActivity) {
        return (TextView) weather2NewActivity.findViewById(R.id.tv_uvi_value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvVisibilityUnit_delegate$lambda$0(Weather2NewActivity weather2NewActivity) {
        return (TextView) weather2NewActivity.findViewById(R.id.tv_visibility_unit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvVisibilityValue_delegate$lambda$0(Weather2NewActivity weather2NewActivity) {
        return (TextView) weather2NewActivity.findViewById(R.id.tv_visibility_value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvWeatherDate1_delegate$lambda$0(Weather2NewActivity weather2NewActivity) {
        return (TextView) weather2NewActivity.findViewById(R.id.weather1_date);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvWeatherDate2_delegate$lambda$0(Weather2NewActivity weather2NewActivity) {
        return (TextView) weather2NewActivity.findViewById(R.id.weather2_date);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvWeatherDate3_delegate$lambda$0(Weather2NewActivity weather2NewActivity) {
        return (TextView) weather2NewActivity.findViewById(R.id.weather3_date);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvWeatherDate4_delegate$lambda$0(Weather2NewActivity weather2NewActivity) {
        return (TextView) weather2NewActivity.findViewById(R.id.weather4_date);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvWeatherDate5_delegate$lambda$0(Weather2NewActivity weather2NewActivity) {
        return (TextView) weather2NewActivity.findViewById(R.id.weather5_date);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvWeatherDate6_delegate$lambda$0(Weather2NewActivity weather2NewActivity) {
        return (TextView) weather2NewActivity.findViewById(R.id.weather6_date);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvWeatherDate7_delegate$lambda$0(Weather2NewActivity weather2NewActivity) {
        return (TextView) weather2NewActivity.findViewById(R.id.weather7_date);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvWeatherMaxValue1_delegate$lambda$0(Weather2NewActivity weather2NewActivity) {
        return (TextView) weather2NewActivity.findViewById(R.id.weather1_max_temp);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvWeatherMaxValue2_delegate$lambda$0(Weather2NewActivity weather2NewActivity) {
        return (TextView) weather2NewActivity.findViewById(R.id.weather2_max_temp);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvWeatherMaxValue3_delegate$lambda$0(Weather2NewActivity weather2NewActivity) {
        return (TextView) weather2NewActivity.findViewById(R.id.weather3_max_temp);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvWeatherMaxValue4_delegate$lambda$0(Weather2NewActivity weather2NewActivity) {
        return (TextView) weather2NewActivity.findViewById(R.id.weather4_max_temp);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvWeatherMaxValue5_delegate$lambda$0(Weather2NewActivity weather2NewActivity) {
        return (TextView) weather2NewActivity.findViewById(R.id.weather5_max_temp);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvWeatherMaxValue6_delegate$lambda$0(Weather2NewActivity weather2NewActivity) {
        return (TextView) weather2NewActivity.findViewById(R.id.weather6_max_temp);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvWeatherMaxValue7_delegate$lambda$0(Weather2NewActivity weather2NewActivity) {
        return (TextView) weather2NewActivity.findViewById(R.id.weather7_max_temp);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvWeatherMinValue1_delegate$lambda$0(Weather2NewActivity weather2NewActivity) {
        return (TextView) weather2NewActivity.findViewById(R.id.weather1_min_temp);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvWeatherMinValue2_delegate$lambda$0(Weather2NewActivity weather2NewActivity) {
        return (TextView) weather2NewActivity.findViewById(R.id.weather2_min_temp);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvWeatherMinValue3_delegate$lambda$0(Weather2NewActivity weather2NewActivity) {
        return (TextView) weather2NewActivity.findViewById(R.id.weather3_min_temp);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvWeatherMinValue4_delegate$lambda$0(Weather2NewActivity weather2NewActivity) {
        return (TextView) weather2NewActivity.findViewById(R.id.weather4_min_temp);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvWeatherMinValue5_delegate$lambda$0(Weather2NewActivity weather2NewActivity) {
        return (TextView) weather2NewActivity.findViewById(R.id.weather5_min_temp);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvWeatherMinValue6_delegate$lambda$0(Weather2NewActivity weather2NewActivity) {
        return (TextView) weather2NewActivity.findViewById(R.id.weather6_min_temp);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvWeatherMinValue7_delegate$lambda$0(Weather2NewActivity weather2NewActivity) {
        return (TextView) weather2NewActivity.findViewById(R.id.weather7_min_temp);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvWeatherName_delegate$lambda$0(Weather2NewActivity weather2NewActivity) {
        return (TextView) weather2NewActivity.findViewById(R.id.nowWeather_describe);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvWeatherTemp_delegate$lambda$0(Weather2NewActivity weather2NewActivity) {
        return (TextView) weather2NewActivity.findViewById(R.id.nowWeather_describe_temp);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvWindSpeedUnit_delegate$lambda$0(Weather2NewActivity weather2NewActivity) {
        return (TextView) weather2NewActivity.findViewById(R.id.tv_wind_speed_unit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvWindSpeedValue_delegate$lambda$0(Weather2NewActivity weather2NewActivity) {
        return (TextView) weather2NewActivity.findViewById(R.id.tv_wind_speed_value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tv_city_name_delegate$lambda$0(Weather2NewActivity weather2NewActivity) {
        return (TextView) weather2NewActivity.findViewById(R.id.nowWeather_city);
    }

    private final int weatherCentigradeToFahrenheit(int i) {
        return this.mUnit ? (int) cp5.I0iXXO(i) : i;
    }

    private final String weatherUnit() {
        if (this.mUnit) {
            String string = getString(R.string.fahrenheit);
            Intrinsics.XXI(string);
            return string;
        }
        String string2 = getString(R.string.degree_centigrade);
        Intrinsics.XXI(string2);
        return string2;
    }

    public final TextView getAbhTitleCenter() {
        return (TextView) this.abhTitleCenter$delegate.getValue();
    }

    public final ImageView getAbhTitleLeft() {
        return (ImageView) this.abhTitleLeft$delegate.getValue();
    }

    public final ImageView getAbhTitleRight() {
        return (ImageView) this.abhTitleRight$delegate.getValue();
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

    public final boolean getMUnit() {
        return this.mUnit;
    }

    @aa1
    public final String getTemp(int i) {
        return cp5.X01IiOiIi(this, i, cp5.II1Xi0(this.mAppUser.getUnit()) == 1);
    }

    public final ImageView getTodayIcon() {
        return (ImageView) this.todayIcon$delegate.getValue();
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

    public final TextView getTvWeatherMaxValue1() {
        return (TextView) this.tvWeatherMaxValue1$delegate.getValue();
    }

    public final TextView getTvWeatherMaxValue2() {
        return (TextView) this.tvWeatherMaxValue2$delegate.getValue();
    }

    public final TextView getTvWeatherMaxValue3() {
        return (TextView) this.tvWeatherMaxValue3$delegate.getValue();
    }

    public final TextView getTvWeatherMaxValue4() {
        return (TextView) this.tvWeatherMaxValue4$delegate.getValue();
    }

    public final TextView getTvWeatherMaxValue5() {
        return (TextView) this.tvWeatherMaxValue5$delegate.getValue();
    }

    public final TextView getTvWeatherMaxValue6() {
        return (TextView) this.tvWeatherMaxValue6$delegate.getValue();
    }

    public final TextView getTvWeatherMaxValue7() {
        return (TextView) this.tvWeatherMaxValue7$delegate.getValue();
    }

    public final TextView getTvWeatherMinValue1() {
        return (TextView) this.tvWeatherMinValue1$delegate.getValue();
    }

    public final TextView getTvWeatherMinValue2() {
        return (TextView) this.tvWeatherMinValue2$delegate.getValue();
    }

    public final TextView getTvWeatherMinValue3() {
        return (TextView) this.tvWeatherMinValue3$delegate.getValue();
    }

    public final TextView getTvWeatherMinValue4() {
        return (TextView) this.tvWeatherMinValue4$delegate.getValue();
    }

    public final TextView getTvWeatherMinValue5() {
        return (TextView) this.tvWeatherMinValue5$delegate.getValue();
    }

    public final TextView getTvWeatherMinValue6() {
        return (TextView) this.tvWeatherMinValue6$delegate.getValue();
    }

    public final TextView getTvWeatherMinValue7() {
        return (TextView) this.tvWeatherMinValue7$delegate.getValue();
    }

    public final TextView getTvWeatherName() {
        return (TextView) this.tvWeatherName$delegate.getValue();
    }

    public final TextView getTvWeatherTemp() {
        return (TextView) this.tvWeatherTemp$delegate.getValue();
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
        ImageView abhTitleRight;
        int i;
        getAbhTitleRight().setVisibility(0);
        boolean zXIi00iiXO = OiOX0i.XIi00iiXO(BaseBleCache.getInt$default(BleCache.INSTANCE, BleKey.TEMPERATURE_UNIT, 0, null, 6, null));
        this.mUnit = zXIi00iiXO;
        if (zXIi00iiXO) {
            abhTitleRight = getAbhTitleRight();
            i = R.mipmap.abh_weather_right_icon_f;
        } else {
            abhTitleRight = getAbhTitleRight();
            i = R.mipmap.abh_weather_right_icon_c;
        }
        abhTitleRight.setImageResource(i);
        setCityData();
        setRealData();
        setDayData();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_weather2_new;
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        finish();
    }

    public final void onTitleRightClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        this.mUnit = !this.mUnit;
        X0IOiX1O.XIi00iiXO(false, new Function1() { // from class: com.android.mltcode.paycertificationapi.es6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return Weather2NewActivity.onTitleRightClick$lambda$0(this.f6478IO, (BleConnector) obj);
            }
        }, 1, null);
    }

    public final void setMUnit(boolean z) {
        this.mUnit = z;
    }
}
