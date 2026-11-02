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
import com.sma.smartv3.p610ui.status.WeatherActivity;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.UtilsKt;
import com.sma.smartv3.view.text.PFMedium;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.component.BaseBleCache;
import com.szabh.smable3.component.BleCache;
import com.szabh.smable3.entity.BleWeather;
import com.szabh.smable3.entity.BleWeatherForecast;
import com.szabh.smable3.entity.BleWeatherRealtime;
import com.tenmeter.smlibrary.utils.DateFormatUtils;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nWeatherActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WeatherActivity.kt\ncom/sma/smartv3/ui/status/WeatherActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,166:1\n19#2:167\n15#2:168\n19#2:169\n15#2:170\n90#2:171\n*S KotlinDebug\n*F\n+ 1 WeatherActivity.kt\ncom/sma/smartv3/ui/status/WeatherActivity\n*L\n61#1:167\n61#1:168\n63#1:169\n63#1:170\n149#1:171\n*E\n"})
public final class WeatherActivity extends BaseActivity {

    @aa1
    private AppUser mAppUser;

    @aa1
    private final AppUser userProfile;

    @aa1
    private final Lazy abhTitleCenter$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.xt6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WeatherActivity.abhTitleCenter_delegate$lambda$0(this.f12232IO);
        }
    });

    @aa1
    private final Lazy bg$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.zt6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WeatherActivity.bg_delegate$lambda$0(this.f12691IO);
        }
    });

    @aa1
    private final Lazy ivWeather$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.gu6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WeatherActivity.ivWeather_delegate$lambda$0(this.f6964IO);
        }
    });

    @aa1
    private final Lazy tvTemperatureValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.hu6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WeatherActivity.tvTemperatureValue_delegate$lambda$0(this.f7207IO);
        }
    });

    @aa1
    private final Lazy tvTemperatureUnit$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ju6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WeatherActivity.tvTemperatureUnit_delegate$lambda$0(this.f9045IO);
        }
    });

    @aa1
    private final Lazy tvTemperatureMin$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ku6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WeatherActivity.tvTemperatureMin_delegate$lambda$0(this.f9286IO);
        }
    });

    @aa1
    private final Lazy tvTemperatureMax$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.lu6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WeatherActivity.tvTemperatureMax_delegate$lambda$0(this.f9526IO);
        }
    });

    @aa1
    private final Lazy tvWeatherName$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.mu6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WeatherActivity.tvWeatherName_delegate$lambda$0(this.f9793IO);
        }
    });

    @aa1
    private final Lazy tvUviValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.nu6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WeatherActivity.tvUviValue_delegate$lambda$0(this.f10017IO);
        }
    });

    @aa1
    private final Lazy tvHumidityValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ou6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WeatherActivity.tvHumidityValue_delegate$lambda$0(this.f10227IO);
        }
    });

    @aa1
    private final Lazy tvVisibilityValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.iu6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WeatherActivity.tvVisibilityValue_delegate$lambda$0(this.f8760IO);
        }
    });

    @aa1
    private final Lazy tvVisibilityUnit$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.pu6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WeatherActivity.tvVisibilityUnit_delegate$lambda$0(this.f10442IO);
        }
    });

    @aa1
    private final Lazy tvWindSpeedValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.qu6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WeatherActivity.tvWindSpeedValue_delegate$lambda$0(this.f10684IO);
        }
    });

    @aa1
    private final Lazy tvWindSpeedUnit$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ru6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WeatherActivity.tvWindSpeedUnit_delegate$lambda$0(this.f10908IO);
        }
    });

    @aa1
    private final Lazy tvPrecipitationValue$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.su6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WeatherActivity.tvPrecipitationValue_delegate$lambda$0(this.f11134IO);
        }
    });

    @aa1
    private final Lazy tvPrecipitationUnit$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.tu6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WeatherActivity.tvPrecipitationUnit_delegate$lambda$0(this.f11364IO);
        }
    });

    @aa1
    private final Lazy ivWeather1$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.uu6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WeatherActivity.ivWeather1_delegate$lambda$0(this.f11574IO);
        }
    });

    @aa1
    private final Lazy tvWeatherValue1$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.vu6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WeatherActivity.tvWeatherValue1_delegate$lambda$0(this.f11818IO);
        }
    });

    @aa1
    private final Lazy tvWeatherDate1$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.wu6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WeatherActivity.tvWeatherDate1_delegate$lambda$0(this.f12041IO);
        }
    });

    @aa1
    private final Lazy ivWeather2$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.yt6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WeatherActivity.ivWeather2_delegate$lambda$0(this.f12450IO);
        }
    });

    @aa1
    private final Lazy tvWeatherValue2$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.au6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WeatherActivity.tvWeatherValue2_delegate$lambda$0(this.f5577IO);
        }
    });

    @aa1
    private final Lazy tvWeatherDate2$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.bu6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WeatherActivity.tvWeatherDate2_delegate$lambda$0(this.f5825IO);
        }
    });

    @aa1
    private final Lazy ivWeather3$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.cu6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WeatherActivity.ivWeather3_delegate$lambda$0(this.f6057IO);
        }
    });

    @aa1
    private final Lazy tvWeatherValue3$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.du6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WeatherActivity.tvWeatherValue3_delegate$lambda$0(this.f6272IO);
        }
    });

    @aa1
    private final Lazy tvWeatherDate3$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.eu6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WeatherActivity.tvWeatherDate3_delegate$lambda$0(this.f6490IO);
        }
    });

    @aa1
    private final Lazy tv_city_name$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.fu6
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return WeatherActivity.tv_city_name_delegate$lambda$0(this.f6737IO);
        }
    });

    public WeatherActivity() {
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
    public static final PFMedium abhTitleCenter_delegate$lambda$0(WeatherActivity weatherActivity) {
        return (PFMedium) weatherActivity.findViewById(R.id.abh_title_center);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View bg_delegate$lambda$0(WeatherActivity weatherActivity) {
        return weatherActivity.findViewById(R.id.fl_bg);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView ivWeather1_delegate$lambda$0(WeatherActivity weatherActivity) {
        return (ImageView) weatherActivity.findViewById(R.id.iv_weather1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView ivWeather2_delegate$lambda$0(WeatherActivity weatherActivity) {
        return (ImageView) weatherActivity.findViewById(R.id.iv_weather2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView ivWeather3_delegate$lambda$0(WeatherActivity weatherActivity) {
        return (ImageView) weatherActivity.findViewById(R.id.iv_weather3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView ivWeather_delegate$lambda$0(WeatherActivity weatherActivity) {
        return (ImageView) weatherActivity.findViewById(R.id.iv_weather);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvHumidityValue_delegate$lambda$0(WeatherActivity weatherActivity) {
        return (TextView) weatherActivity.findViewById(R.id.tv_humidity_value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvPrecipitationUnit_delegate$lambda$0(WeatherActivity weatherActivity) {
        return (TextView) weatherActivity.findViewById(R.id.tv_precipitation_unit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvPrecipitationValue_delegate$lambda$0(WeatherActivity weatherActivity) {
        return (TextView) weatherActivity.findViewById(R.id.tv_precipitation_value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvTemperatureMax_delegate$lambda$0(WeatherActivity weatherActivity) {
        return (TextView) weatherActivity.findViewById(R.id.tv_temperature_max);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvTemperatureMin_delegate$lambda$0(WeatherActivity weatherActivity) {
        return (TextView) weatherActivity.findViewById(R.id.tv_temperature_min);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvTemperatureUnit_delegate$lambda$0(WeatherActivity weatherActivity) {
        return (TextView) weatherActivity.findViewById(R.id.tv_temperature_unit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvTemperatureValue_delegate$lambda$0(WeatherActivity weatherActivity) {
        return (TextView) weatherActivity.findViewById(R.id.tv_temperature_value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvUviValue_delegate$lambda$0(WeatherActivity weatherActivity) {
        return (TextView) weatherActivity.findViewById(R.id.tv_uvi_value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvVisibilityUnit_delegate$lambda$0(WeatherActivity weatherActivity) {
        return (TextView) weatherActivity.findViewById(R.id.tv_visibility_unit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvVisibilityValue_delegate$lambda$0(WeatherActivity weatherActivity) {
        return (TextView) weatherActivity.findViewById(R.id.tv_visibility_value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvWeatherDate1_delegate$lambda$0(WeatherActivity weatherActivity) {
        return (TextView) weatherActivity.findViewById(R.id.tv_weather_date1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvWeatherDate2_delegate$lambda$0(WeatherActivity weatherActivity) {
        return (TextView) weatherActivity.findViewById(R.id.tv_weather_date2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvWeatherDate3_delegate$lambda$0(WeatherActivity weatherActivity) {
        return (TextView) weatherActivity.findViewById(R.id.tv_weather_date3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvWeatherName_delegate$lambda$0(WeatherActivity weatherActivity) {
        return (TextView) weatherActivity.findViewById(R.id.tv_weather_name);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvWeatherValue1_delegate$lambda$0(WeatherActivity weatherActivity) {
        return (TextView) weatherActivity.findViewById(R.id.tv_weather_value1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvWeatherValue2_delegate$lambda$0(WeatherActivity weatherActivity) {
        return (TextView) weatherActivity.findViewById(R.id.tv_weather_value2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvWeatherValue3_delegate$lambda$0(WeatherActivity weatherActivity) {
        return (TextView) weatherActivity.findViewById(R.id.tv_weather_value3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvWindSpeedUnit_delegate$lambda$0(WeatherActivity weatherActivity) {
        return (TextView) weatherActivity.findViewById(R.id.tv_wind_speed_unit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tvWindSpeedValue_delegate$lambda$0(WeatherActivity weatherActivity) {
        return (TextView) weatherActivity.findViewById(R.id.tv_wind_speed_value);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView tv_city_name_delegate$lambda$0(WeatherActivity weatherActivity) {
        return (TextView) weatherActivity.findViewById(R.id.tv_city_name);
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
        BleWeatherRealtime bleWeatherRealtime = (BleWeatherRealtime) BaseBleCache.getObject$default(bleCache, BleKey.WEATHER_REALTIME, BleWeatherRealtime.class, null, 4, null);
        if (bleWeatherRealtime != null) {
            BleWeather mWeather = bleWeatherRealtime.getMWeather();
            Intrinsics.XXI(mWeather);
            int mWeatherCode = mWeather.getMWeatherCode();
            getBg().setBackgroundResource(UtilsKt.m38843OO(this, mWeatherCode));
            getIvWeather().setImageResource(UtilsKt.X00XIX1(this, mWeatherCode));
            TextView tvTemperatureValue = getTvTemperatureValue();
            if (cp5.II1Xi0(this.mAppUser.getUnit()) == 1) {
                BleWeather mWeather2 = bleWeatherRealtime.getMWeather();
                Intrinsics.XXI(mWeather2);
                objValueOf = Float.valueOf(cp5.I0iXXO(mWeather2.getMCurrentTemperature()));
            } else {
                BleWeather mWeather3 = bleWeatherRealtime.getMWeather();
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
            BleWeather mWeather4 = bleWeatherRealtime.getMWeather();
            Intrinsics.XXI(mWeather4);
            tvHumidityValue.setText(String.valueOf(mWeather4.getMHumidity()));
            TextView tvVisibilityValue = getTvVisibilityValue();
            BleWeather mWeather5 = bleWeatherRealtime.getMWeather();
            Intrinsics.XXI(mWeather5);
            tvVisibilityValue.setText(String.valueOf(cp5.X1ii(mWeather5.getMVisibility() * 1000, this.userProfile.getUnit(), false, 4, null)));
            getTvVisibilityUnit().setText(getString(cp5.OiIIX101O(this.userProfile.getUnit())));
            TextView tvWindSpeedValue = getTvWindSpeedValue();
            BleWeather mWeather6 = bleWeatherRealtime.getMWeather();
            Intrinsics.XXI(mWeather6);
            tvWindSpeedValue.setText(String.valueOf(cp5.i11I(mWeather6.getMWindSpeed(), this.userProfile.getUnit())));
            getTvWindSpeedUnit().setText(getString(this.userProfile.getUnit() == 0 ? R.string.km_h : R.string.mi_h));
        }
        BleWeatherForecast bleWeatherForecast = (BleWeatherForecast) BaseBleCache.getObject$default(bleCache, BleKey.WEATHER_FORECAST, BleWeatherForecast.class, null, 4, null);
        if (bleWeatherForecast != null) {
            TextView tvTemperatureMin = getTvTemperatureMin();
            BleWeather mWeather1 = bleWeatherForecast.getMWeather1();
            Intrinsics.XXI(mWeather1);
            tvTemperatureMin.setText(getTemp(mWeather1.getMMinTemperature()));
            TextView tvTemperatureMax = getTvTemperatureMax();
            BleWeather mWeather7 = bleWeatherForecast.getMWeather1();
            Intrinsics.XXI(mWeather7);
            tvTemperatureMax.setText(getTemp(mWeather7.getMMaxTemperature()));
            TextView tvUviValue = getTvUviValue();
            BleWeather mWeather8 = bleWeatherForecast.getMWeather1();
            Intrinsics.XXI(mWeather8);
            tvUviValue.setText(UtilsKt.X100O(mWeather8.getMUltraVioletIntensity()));
            TextView tvPrecipitationValue = getTvPrecipitationValue();
            BleWeather mWeather9 = bleWeatherForecast.getMWeather1();
            Intrinsics.XXI(mWeather9);
            tvPrecipitationValue.setText(cp5.Ii0X0X(mWeather9.getMPrecipitation(), this.userProfile.getUnit()));
            getTvPrecipitationUnit().setText(this.userProfile.getUnit() == 0 ? DateFormatUtils.MIN : "in");
            ImageView ivWeather1 = getIvWeather1();
            BleWeather mWeather10 = bleWeatherForecast.getMWeather1();
            Intrinsics.XXI(mWeather10);
            ivWeather1.setImageResource(UtilsKt.X00XIX1(this, mWeather10.getMWeatherCode()));
            TextView tvWeatherValue1 = getTvWeatherValue1();
            BleWeather mWeather11 = bleWeatherForecast.getMWeather1();
            Intrinsics.XXI(mWeather11);
            String temp = getTemp(mWeather11.getMMinTemperature());
            BleWeather mWeather12 = bleWeatherForecast.getMWeather1();
            Intrinsics.XXI(mWeather12);
            tvWeatherValue1.setText(temp + "/" + getTemp(mWeather12.getMMaxTemperature()));
            getTvWeatherDate1().setText(O0X11OiO.iOO1ii1(((long) bleWeatherForecast.getMTime()) * 1000, 0).IiI10X());
            ImageView ivWeather2 = getIvWeather2();
            BleWeather mWeather13 = bleWeatherForecast.getMWeather2();
            Intrinsics.XXI(mWeather13);
            ivWeather2.setImageResource(UtilsKt.X00XIX1(this, mWeather13.getMWeatherCode()));
            TextView tvWeatherValue2 = getTvWeatherValue2();
            BleWeather mWeather14 = bleWeatherForecast.getMWeather2();
            Intrinsics.XXI(mWeather14);
            String temp2 = getTemp(mWeather14.getMMinTemperature());
            BleWeather mWeather15 = bleWeatherForecast.getMWeather2();
            Intrinsics.XXI(mWeather15);
            tvWeatherValue2.setText(temp2 + "/" + getTemp(mWeather15.getMMaxTemperature()));
            getTvWeatherDate2().setText(O0X11OiO.iOO1ii1(((long) bleWeatherForecast.getMTime()) * 1000, 1).IiI10X());
            ImageView ivWeather3 = getIvWeather3();
            BleWeather mWeather16 = bleWeatherForecast.getMWeather3();
            Intrinsics.XXI(mWeather16);
            ivWeather3.setImageResource(UtilsKt.X00XIX1(this, mWeather16.getMWeatherCode()));
            TextView tvWeatherValue3 = getTvWeatherValue3();
            BleWeather mWeather17 = bleWeatherForecast.getMWeather3();
            Intrinsics.XXI(mWeather17);
            String temp3 = getTemp(mWeather17.getMMinTemperature());
            BleWeather mWeather18 = bleWeatherForecast.getMWeather3();
            Intrinsics.XXI(mWeather18);
            tvWeatherValue3.setText(temp3 + "/" + getTemp(mWeather18.getMMaxTemperature()));
            getTvWeatherDate3().setText(O0X11OiO.iOO1ii1(((long) bleWeatherForecast.getMTime()) * 1000, 2).IiI10X());
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
        return R.layout.activity_weather;
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        finish();
    }
}
