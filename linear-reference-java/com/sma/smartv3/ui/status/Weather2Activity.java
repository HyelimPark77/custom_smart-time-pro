package com.sma.smartv3.ui.status;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.ar6;
import com.android.mltcode.paycertificationapi.as6;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.br6;
import com.android.mltcode.paycertificationapi.bs6;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.cr6;
import com.android.mltcode.paycertificationapi.cs6;
import com.android.mltcode.paycertificationapi.dr6;
import com.android.mltcode.paycertificationapi.ds6;
import com.android.mltcode.paycertificationapi.er6;
import com.android.mltcode.paycertificationapi.fr6;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.gr6;
import com.android.mltcode.paycertificationapi.hr6;
import com.android.mltcode.paycertificationapi.ir6;
import com.android.mltcode.paycertificationapi.jr6;
import com.android.mltcode.paycertificationapi.kr6;
import com.android.mltcode.paycertificationapi.lr6;
import com.android.mltcode.paycertificationapi.mr6;
import com.android.mltcode.paycertificationapi.nr6;
import com.android.mltcode.paycertificationapi.or6;
import com.android.mltcode.paycertificationapi.pr6;
import com.android.mltcode.paycertificationapi.qr6;
import com.android.mltcode.paycertificationapi.rr6;
import com.android.mltcode.paycertificationapi.sq6;
import com.android.mltcode.paycertificationapi.sr6;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.tq6;
import com.android.mltcode.paycertificationapi.tr6;
import com.android.mltcode.paycertificationapi.uq6;
import com.android.mltcode.paycertificationapi.ur6;
import com.android.mltcode.paycertificationapi.vq6;
import com.android.mltcode.paycertificationapi.vr6;
import com.android.mltcode.paycertificationapi.wq6;
import com.android.mltcode.paycertificationapi.wr6;
import com.android.mltcode.paycertificationapi.xq6;
import com.android.mltcode.paycertificationapi.xr6;
import com.android.mltcode.paycertificationapi.yq6;
import com.android.mltcode.paycertificationapi.yr6;
import com.android.mltcode.paycertificationapi.zq6;
import com.android.mltcode.paycertificationapi.zr6;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.BarUtils;
import com.blankj.utilcode.util.SPUtils;
import com.google.gson.Gson;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.model.WeatherRealtime;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nWeather2Activity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Weather2Activity.kt\ncom/sma/smartv3/ui/status/Weather2Activity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,239:1\n19#2:240\n15#2:241\n19#2:242\n15#2:243\n90#2:244\n*S KotlinDebug\n*F\n+ 1 Weather2Activity.kt\ncom/sma/smartv3/ui/status/Weather2Activity\n*L\n76#1:240\n76#1:241\n78#1:242\n78#1:243\n211#1:244\n*E\n"})
public final class Weather2Activity extends BaseActivity {

    @aa1
    private final Lazy abhTitleCenter$delegate;

    @aa1
    private final Lazy bg$delegate;

    @aa1
    private final Lazy ivWeather$delegate;

    @aa1
    private final Lazy ivWeather1$delegate;

    @aa1
    private final Lazy ivWeather2$delegate;

    @aa1
    private final Lazy ivWeather3$delegate;

    @aa1
    private final Lazy ivWeather4$delegate;

    @aa1
    private final Lazy ivWeather5$delegate;

    @aa1
    private final Lazy ivWeather6$delegate;

    @aa1
    private final Lazy ivWeather7$delegate;

    @aa1
    private AppUser mAppUser;

    @aa1
    private final Lazy tvHumidityValue$delegate;

    @aa1
    private final Lazy tvPrecipitationUnit$delegate;

    @aa1
    private final Lazy tvPrecipitationValue$delegate;

    @aa1
    private final Lazy tvTemperatureMax$delegate;

    @aa1
    private final Lazy tvTemperatureMin$delegate;

    @aa1
    private final Lazy tvTemperatureUnit$delegate;

    @aa1
    private final Lazy tvTemperatureValue$delegate;

    @aa1
    private final Lazy tvUviValue$delegate;

    @aa1
    private final Lazy tvVisibilityUnit$delegate;

    @aa1
    private final Lazy tvVisibilityValue$delegate;

    @aa1
    private final Lazy tvWeatherDate1$delegate;

    @aa1
    private final Lazy tvWeatherDate2$delegate;

    @aa1
    private final Lazy tvWeatherDate3$delegate;

    @aa1
    private final Lazy tvWeatherDate4$delegate;

    @aa1
    private final Lazy tvWeatherDate5$delegate;

    @aa1
    private final Lazy tvWeatherDate6$delegate;

    @aa1
    private final Lazy tvWeatherDate7$delegate;

    @aa1
    private final Lazy tvWeatherName$delegate;

    @aa1
    private final Lazy tvWeatherValue1$delegate;

    @aa1
    private final Lazy tvWeatherValue2$delegate;

    @aa1
    private final Lazy tvWeatherValue3$delegate;

    @aa1
    private final Lazy tvWeatherValue4$delegate;

    @aa1
    private final Lazy tvWeatherValue5$delegate;

    @aa1
    private final Lazy tvWeatherValue6$delegate;

    @aa1
    private final Lazy tvWeatherValue7$delegate;

    @aa1
    private final Lazy tvWindSpeedUnit$delegate;

    @aa1
    private final Lazy tvWindSpeedValue$delegate;

    @aa1
    private final Lazy tv_city_name$delegate;

    @aa1
    private final AppUser userProfile;

    public Weather2Activity() {
        this.abhTitleCenter$delegate = LazyKt__LazyJVMKt.iO(new sq6(this));
        this.bg$delegate = LazyKt__LazyJVMKt.iO(new uq6(this));
        this.ivWeather$delegate = LazyKt__LazyJVMKt.iO(new gr6(this));
        this.tvTemperatureValue$delegate = LazyKt__LazyJVMKt.iO(new qr6(this));
        this.tvTemperatureUnit$delegate = LazyKt__LazyJVMKt.iO(new rr6(this));
        this.tvTemperatureMin$delegate = LazyKt__LazyJVMKt.iO(new sr6(this));
        this.tvTemperatureMax$delegate = LazyKt__LazyJVMKt.iO(new tr6(this));
        this.tvWeatherName$delegate = LazyKt__LazyJVMKt.iO(new ur6(this));
        this.tvUviValue$delegate = LazyKt__LazyJVMKt.iO(new vr6(this));
        this.tvHumidityValue$delegate = LazyKt__LazyJVMKt.iO(new wr6(this));
        this.tvVisibilityValue$delegate = LazyKt__LazyJVMKt.iO(new dr6(this));
        this.tvVisibilityUnit$delegate = LazyKt__LazyJVMKt.iO(new or6(this));
        this.tvWindSpeedValue$delegate = LazyKt__LazyJVMKt.iO(new xr6(this));
        this.tvWindSpeedUnit$delegate = LazyKt__LazyJVMKt.iO(new yr6(this));
        this.tvPrecipitationValue$delegate = LazyKt__LazyJVMKt.iO(new zr6(this));
        this.tvPrecipitationUnit$delegate = LazyKt__LazyJVMKt.iO(new as6(this));
        this.ivWeather1$delegate = LazyKt__LazyJVMKt.iO(new bs6(this));
        this.tvWeatherValue1$delegate = LazyKt__LazyJVMKt.iO(new cs6(this));
        this.tvWeatherDate1$delegate = LazyKt__LazyJVMKt.iO(new ds6(this));
        this.ivWeather2$delegate = LazyKt__LazyJVMKt.iO(new tq6(this));
        this.tvWeatherValue2$delegate = LazyKt__LazyJVMKt.iO(new vq6(this));
        this.tvWeatherDate2$delegate = LazyKt__LazyJVMKt.iO(new wq6(this));
        this.ivWeather3$delegate = LazyKt__LazyJVMKt.iO(new xq6(this));
        this.tvWeatherValue3$delegate = LazyKt__LazyJVMKt.iO(new yq6(this));
        this.tvWeatherDate3$delegate = LazyKt__LazyJVMKt.iO(new zq6(this));
        this.ivWeather4$delegate = LazyKt__LazyJVMKt.iO(new ar6(this));
        this.tvWeatherValue4$delegate = LazyKt__LazyJVMKt.iO(new br6(this));
        this.tvWeatherDate4$delegate = LazyKt__LazyJVMKt.iO(new cr6(this));
        this.ivWeather5$delegate = LazyKt__LazyJVMKt.iO(new er6(this));
        this.tvWeatherValue5$delegate = LazyKt__LazyJVMKt.iO(new fr6(this));
        this.tvWeatherDate5$delegate = LazyKt__LazyJVMKt.iO(new hr6(this));
        this.ivWeather6$delegate = LazyKt__LazyJVMKt.iO(new ir6(this));
        this.tvWeatherValue6$delegate = LazyKt__LazyJVMKt.iO(new jr6(this));
        this.tvWeatherDate6$delegate = LazyKt__LazyJVMKt.iO(new kr6(this));
        this.ivWeather7$delegate = LazyKt__LazyJVMKt.iO(new lr6(this));
        this.tvWeatherValue7$delegate = LazyKt__LazyJVMKt.iO(new mr6(this));
        this.tvWeatherDate7$delegate = LazyKt__LazyJVMKt.iO(new nr6(this));
        this.tv_city_name$delegate = LazyKt__LazyJVMKt.iO(new pr6(this));
        a01 r1 = a01.OXO1;
        SPUtils r2 = r1.IiI10X();
        Object r3 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r4 = new Gson().fromJson(r2.getString(AppUser.class.getName()), AppUser.class);
        if (r4 == null) goto L6;
        r3 = r4;
    L6:
        this.userProfile = (AppUser) r3;
        SPUtils r5 = r1.IiI10X();
        Object r6 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r7 = new Gson().fromJson(r5.getString(AppUser.class.getName()), AppUser.class);
        if (r7 == null) goto L10;
        r6 = r7;
    L10:
        this.mAppUser = (AppUser) r6;
    }

    public static /* synthetic */ TextView I0iXXO(Weather2Activity r0) {
        return tv_city_name_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView I1(Weather2Activity r0) {
        return tvWeatherDate5_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView I1XOi1(Weather2Activity r0) {
        return tvTemperatureMin_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView II1Xi0(Weather2Activity r0) {
        return tvWeatherDate2_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView IIX1OXO(Weather2Activity r0) {
        return tvVisibilityUnit_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView IXXOO(Weather2Activity r0) {
        return tvTemperatureMax_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageView Ii1iii0(Weather2Activity r0) {
        return ivWeather2_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView O001I(Weather2Activity r0) {
        return tvPrecipitationValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView O10IXXX0X(Weather2Activity r0) {
        return tvWeatherValue7_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView O1O(Weather2Activity r0) {
        return tvVisibilityValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView OII(Weather2Activity r0) {
        return tvWeatherValue5_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView OIX0iXi(Weather2Activity r0) {
        return tvPrecipitationUnit_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView OX(Weather2Activity r0) {
        return tvWeatherDate7_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView OiIIX101O(Weather2Activity r0) {
        return tvWeatherValue3_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView X01IiOiIi(Weather2Activity r0) {
        return tvWeatherValue6_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView X0O(Weather2Activity r0) {
        return tvHumidityValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageView X0i1O(Weather2Activity r0) {
        return ivWeather6_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView X11iII1O1(Weather2Activity r0) {
        return tvWeatherValue1_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageView X1IX(Weather2Activity r0) {
        return ivWeather5_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageView X1ii(Weather2Activity r0) {
        return ivWeather7_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView XX0(Weather2Activity r0) {
        return tvWeatherDate1_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageView XXI(Weather2Activity r0) {
        return ivWeather4_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView XXIIO1i11(Weather2Activity r0) {
        return tvUviValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView XXO(Weather2Activity r0) {
        return tvWeatherDate3_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView XXX11i(Weather2Activity r0) {
        return tvWindSpeedValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView XiOIO(Weather2Activity r0) {
        return tvWeatherDate6_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View XiOIii1(Weather2Activity r0) {
        return bg_delegate$lambda$0(r0);
    }

    private static final PFMedium abhTitleCenter_delegate$lambda$0(Weather2Activity r1) {
        return (PFMedium) r1.findViewById(R.id.abh_title_center);
    }

    private static final View bg_delegate$lambda$0(Weather2Activity r1) {
        return r1.findViewById(R.id.fl_bg);
    }

    public static /* synthetic */ TextView i010I(Weather2Activity r0) {
        return tvTemperatureValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView iI(Weather2Activity r0) {
        return tvWeatherName_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageView iIXi1iiXI(Weather2Activity r0) {
        return ivWeather_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFMedium iIiiO(Weather2Activity r0) {
        return abhTitleCenter_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView iOO1ii1(Weather2Activity r0) {
        return tvWeatherValue2_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView iOOX010X(Weather2Activity r0) {
        return tvWeatherDate4_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView iX(Weather2Activity r0) {
        return tvWindSpeedUnit_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView iX1O1(Weather2Activity r0) {
        return tvTemperatureUnit_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView iXiX011(Weather2Activity r0) {
        return tvWeatherValue4_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageView iXiiiO(Weather2Activity r0) {
        return ivWeather1_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageView iiiO(Weather2Activity r0) {
        return ivWeather3_delegate$lambda$0(r0);
    }

    private static final ImageView ivWeather1_delegate$lambda$0(Weather2Activity r1) {
        return (ImageView) r1.findViewById(R.id.iv_weather1);
    }

    private static final ImageView ivWeather2_delegate$lambda$0(Weather2Activity r1) {
        return (ImageView) r1.findViewById(R.id.iv_weather2);
    }

    private static final ImageView ivWeather3_delegate$lambda$0(Weather2Activity r1) {
        return (ImageView) r1.findViewById(R.id.iv_weather3);
    }

    private static final ImageView ivWeather4_delegate$lambda$0(Weather2Activity r1) {
        return (ImageView) r1.findViewById(R.id.iv_weather4);
    }

    private static final ImageView ivWeather5_delegate$lambda$0(Weather2Activity r1) {
        return (ImageView) r1.findViewById(R.id.iv_weather5);
    }

    private static final ImageView ivWeather6_delegate$lambda$0(Weather2Activity r1) {
        return (ImageView) r1.findViewById(R.id.iv_weather6);
    }

    private static final ImageView ivWeather7_delegate$lambda$0(Weather2Activity r1) {
        return (ImageView) r1.findViewById(R.id.iv_weather7);
    }

    private static final ImageView ivWeather_delegate$lambda$0(Weather2Activity r1) {
        return (ImageView) r1.findViewById(R.id.iv_weather);
    }

    private final void setWeatherView(BleWeatherForecast2 r2, ImageView r3, TextView r4) {
        BleWeather2 r0 = r2.getMWeather3();
        Intrinsics.XXI(r0);
        r3.setImageResource(UtilsKt.X00XIX1(this, r0.getMWeatherCode()));
        BleWeather2 r5 = r2.getMWeather3();
        Intrinsics.XXI(r5);
        String r6 = getTemp(r5.getMMinTemperature());
        BleWeather2 r7 = r2.getMWeather3();
        Intrinsics.XXI(r7);
        r4.setText(r6 + "/" + getTemp(r7.getMMaxTemperature()));
    }

    private static final TextView tvHumidityValue_delegate$lambda$0(Weather2Activity r1) {
        return (TextView) r1.findViewById(R.id.tv_humidity_value);
    }

    private static final TextView tvPrecipitationUnit_delegate$lambda$0(Weather2Activity r1) {
        return (TextView) r1.findViewById(R.id.tv_precipitation_unit);
    }

    private static final TextView tvPrecipitationValue_delegate$lambda$0(Weather2Activity r1) {
        return (TextView) r1.findViewById(R.id.tv_precipitation_value);
    }

    private static final TextView tvTemperatureMax_delegate$lambda$0(Weather2Activity r1) {
        return (TextView) r1.findViewById(R.id.tv_temperature_max);
    }

    private static final TextView tvTemperatureMin_delegate$lambda$0(Weather2Activity r1) {
        return (TextView) r1.findViewById(R.id.tv_temperature_min);
    }

    private static final TextView tvTemperatureUnit_delegate$lambda$0(Weather2Activity r1) {
        return (TextView) r1.findViewById(R.id.tv_temperature_unit);
    }

    private static final TextView tvTemperatureValue_delegate$lambda$0(Weather2Activity r1) {
        return (TextView) r1.findViewById(R.id.tv_temperature_value);
    }

    private static final TextView tvUviValue_delegate$lambda$0(Weather2Activity r1) {
        return (TextView) r1.findViewById(R.id.tv_uvi_value);
    }

    private static final TextView tvVisibilityUnit_delegate$lambda$0(Weather2Activity r1) {
        return (TextView) r1.findViewById(R.id.tv_visibility_unit);
    }

    private static final TextView tvVisibilityValue_delegate$lambda$0(Weather2Activity r1) {
        return (TextView) r1.findViewById(R.id.tv_visibility_value);
    }

    private static final TextView tvWeatherDate1_delegate$lambda$0(Weather2Activity r1) {
        return (TextView) r1.findViewById(R.id.tv_weather_date1);
    }

    private static final TextView tvWeatherDate2_delegate$lambda$0(Weather2Activity r1) {
        return (TextView) r1.findViewById(R.id.tv_weather_date2);
    }

    private static final TextView tvWeatherDate3_delegate$lambda$0(Weather2Activity r1) {
        return (TextView) r1.findViewById(R.id.tv_weather_date3);
    }

    private static final TextView tvWeatherDate4_delegate$lambda$0(Weather2Activity r1) {
        return (TextView) r1.findViewById(R.id.tv_weather_date4);
    }

    private static final TextView tvWeatherDate5_delegate$lambda$0(Weather2Activity r1) {
        return (TextView) r1.findViewById(R.id.tv_weather_date5);
    }

    private static final TextView tvWeatherDate6_delegate$lambda$0(Weather2Activity r1) {
        return (TextView) r1.findViewById(R.id.tv_weather_date6);
    }

    private static final TextView tvWeatherDate7_delegate$lambda$0(Weather2Activity r1) {
        return (TextView) r1.findViewById(R.id.tv_weather_date7);
    }

    private static final TextView tvWeatherName_delegate$lambda$0(Weather2Activity r1) {
        return (TextView) r1.findViewById(R.id.tv_weather_name);
    }

    private static final TextView tvWeatherValue1_delegate$lambda$0(Weather2Activity r1) {
        return (TextView) r1.findViewById(R.id.tv_weather_value1);
    }

    private static final TextView tvWeatherValue2_delegate$lambda$0(Weather2Activity r1) {
        return (TextView) r1.findViewById(R.id.tv_weather_value2);
    }

    private static final TextView tvWeatherValue3_delegate$lambda$0(Weather2Activity r1) {
        return (TextView) r1.findViewById(R.id.tv_weather_value3);
    }

    private static final TextView tvWeatherValue4_delegate$lambda$0(Weather2Activity r1) {
        return (TextView) r1.findViewById(R.id.tv_weather_value4);
    }

    private static final TextView tvWeatherValue5_delegate$lambda$0(Weather2Activity r1) {
        return (TextView) r1.findViewById(R.id.tv_weather_value5);
    }

    private static final TextView tvWeatherValue6_delegate$lambda$0(Weather2Activity r1) {
        return (TextView) r1.findViewById(R.id.tv_weather_value6);
    }

    private static final TextView tvWeatherValue7_delegate$lambda$0(Weather2Activity r1) {
        return (TextView) r1.findViewById(R.id.tv_weather_value7);
    }

    private static final TextView tvWindSpeedUnit_delegate$lambda$0(Weather2Activity r1) {
        return (TextView) r1.findViewById(R.id.tv_wind_speed_unit);
    }

    private static final TextView tvWindSpeedValue_delegate$lambda$0(Weather2Activity r1) {
        return (TextView) r1.findViewById(R.id.tv_wind_speed_value);
    }

    private static final TextView tv_city_name_delegate$lambda$0(Weather2Activity r1) {
        return (TextView) r1.findViewById(R.id.tv_city_name);
    }

    public final PFMedium getAbhTitleCenter() {
        return (PFMedium) getValue();
    }

    public final View getBg() {
        return (View) getValue();
    }

    public final ImageView getIvWeather() {
        return (ImageView) getValue();
    }

    public final ImageView getIvWeather1() {
        return (ImageView) getValue();
    }

    public final ImageView getIvWeather2() {
        return (ImageView) getValue();
    }

    public final ImageView getIvWeather3() {
        return (ImageView) getValue();
    }

    public final ImageView getIvWeather4() {
        return (ImageView) getValue();
    }

    public final ImageView getIvWeather5() {
        return (ImageView) getValue();
    }

    public final ImageView getIvWeather6() {
        return (ImageView) getValue();
    }

    public final ImageView getIvWeather7() {
        return (ImageView) getValue();
    }

    @aa1
    public final String getTemp(int r3) {
        boolean r1 = true;
        if (cp5.II1Xi0(this.mAppUser.getUnit()) == 1) goto L7;
        r1 = false;
    L7:
        return cp5.X01IiOiIi(this, r3, r1);
    }

    public final TextView getTvHumidityValue() {
        return (TextView) getValue();
    }

    public final TextView getTvPrecipitationUnit() {
        return (TextView) getValue();
    }

    public final TextView getTvPrecipitationValue() {
        return (TextView) getValue();
    }

    public final TextView getTvTemperatureMax() {
        return (TextView) getValue();
    }

    public final TextView getTvTemperatureMin() {
        return (TextView) getValue();
    }

    public final TextView getTvTemperatureUnit() {
        return (TextView) getValue();
    }

    public final TextView getTvTemperatureValue() {
        return (TextView) getValue();
    }

    public final TextView getTvUviValue() {
        return (TextView) getValue();
    }

    public final TextView getTvVisibilityUnit() {
        return (TextView) getValue();
    }

    public final TextView getTvVisibilityValue() {
        return (TextView) getValue();
    }

    public final TextView getTvWeatherDate1() {
        return (TextView) getValue();
    }

    public final TextView getTvWeatherDate2() {
        return (TextView) getValue();
    }

    public final TextView getTvWeatherDate3() {
        return (TextView) getValue();
    }

    public final TextView getTvWeatherDate4() {
        return (TextView) getValue();
    }

    public final TextView getTvWeatherDate5() {
        return (TextView) getValue();
    }

    public final TextView getTvWeatherDate6() {
        return (TextView) getValue();
    }

    public final TextView getTvWeatherDate7() {
        return (TextView) getValue();
    }

    public final TextView getTvWeatherName() {
        return (TextView) getValue();
    }

    public final TextView getTvWeatherValue1() {
        return (TextView) getValue();
    }

    public final TextView getTvWeatherValue2() {
        return (TextView) getValue();
    }

    public final TextView getTvWeatherValue3() {
        return (TextView) getValue();
    }

    public final TextView getTvWeatherValue4() {
        return (TextView) getValue();
    }

    public final TextView getTvWeatherValue5() {
        return (TextView) getValue();
    }

    public final TextView getTvWeatherValue6() {
        return (TextView) getValue();
    }

    public final TextView getTvWeatherValue7() {
        return (TextView) getValue();
    }

    public final TextView getTvWindSpeedUnit() {
        return (TextView) getValue();
    }

    public final TextView getTvWindSpeedValue() {
        return (TextView) getValue();
    }

    public final TextView getTv_city_name() {
        return (TextView) getValue();
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    @SuppressLint({"SetTextI18n"})
    public void initView() {
        transparentStatusBar();
        BarUtils.setStatusBarLightMode(this, false);
        setNavBarColor(this, gk4.iO(getMContext(), R.color.black));
        BarUtils.addMarginTopEqualStatusBarHeight(findViewById(R.id.fl_container));
        getAbhTitleCenter().setText(R.string.weather);
        BleCache r3 = BleCache.INSTANCE;
        BleWeatherRealtime2 r1 = (BleWeatherRealtime2) BaseBleCache.getObject$default(r3, BleKey.WEATHER_REALTIME2, BleWeatherRealtime2.class, null, 4, null);
        if (r1 == null) goto L18;
        BleWeather2 r4 = r1.getMWeather();
        Intrinsics.XXI(r4);
        int r5 = r4.getMWeatherCode();
        getBg().setBackgroundResource(UtilsKt.OO(this, r5));
        getIvWeather().setImageResource(UtilsKt.X00XIX1(this, r5));
        TextView r6 = getTvTemperatureValue();
        if (cp5.II1Xi0(this.mAppUser.getUnit()) != 1) goto L7;
        BleWeather2 r7 = r1.getMWeather();
        Intrinsics.XXI(r7);
        Object r8 = Float.valueOf(cp5.I0iXXO(r7.getMCurrentTemperature()));
    L8:
        r6.setText(String.valueOf(r8));
        TextView r9 = getTvTemperatureUnit();
        if (cp5.II1Xi0(this.mAppUser.getUnit()) != 1) goto L12;
        Activity r10 = getMContext();
        int r11 = R.string.fahrenheit;
    L13:
        r9.setText(r10.getString(r11));
        getTvWeatherName().setText(UtilsKt.i0X000X0O(this, r5));
        TextView r12 = getTvHumidityValue();
        BleWeather2 r13 = r1.getMWeather();
        Intrinsics.XXI(r13);
        r12.setText(String.valueOf(r13.getMHumidity()));
        TextView r14 = getTvVisibilityValue();
        BleWeather2 r15 = r1.getMWeather();
        Intrinsics.XXI(r15);
        r14.setText(String.valueOf(cp5.X1ii(r15.getMVisibility() * 1000, this.userProfile.getUnit(), false, 4, null)));
        getTvVisibilityUnit().setText(getString(cp5.OiIIX101O(this.userProfile.getUnit())));
        TextView r16 = getTvWindSpeedValue();
        BleWeather2 r2 = r1.getMWeather();
        Intrinsics.XXI(r2);
        r16.setText(String.valueOf(cp5.i11I(r2.getMWindSpeed(), this.userProfile.getUnit())));
        TextView r17 = getTvWindSpeedUnit();
        if (this.userProfile.getUnit() != 0) goto L16;
        int r18 = R.string.km_h;
    L17:
        r17.setText(getString(r18));
        goto L18
    L16:
        r18 = R.string.mi_h;
        goto L17
    L12:
        r10 = getMContext();
        r11 = R.string.degree_centigrade;
        goto L13
    L7:
        BleWeather2 r19 = r1.getMWeather();
        Intrinsics.XXI(r19);
        r8 = Integer.valueOf(r19.getMCurrentTemperature());
    L18:
        BleWeatherForecast2 r20 = (BleWeatherForecast2) BaseBleCache.getObject$default(r3, BleKey.WEATHER_FORECAST2, BleWeatherForecast2.class, null, 4, null);
        if (r20 == null) goto L29;
        TextView r21 = getTvTemperatureMin();
        BleWeather2 r22 = r20.getMWeather1();
        Intrinsics.XXI(r22);
        r21.setText(getTemp(r22.getMMinTemperature()));
        TextView r23 = getTvTemperatureMax();
        BleWeather2 r24 = r20.getMWeather1();
        Intrinsics.XXI(r24);
        r23.setText(getTemp(r24.getMMaxTemperature()));
        TextView r25 = getTvUviValue();
        BleWeather2 r26 = r20.getMWeather1();
        Intrinsics.XXI(r26);
        r25.setText(UtilsKt.X100O(r26.getMUltraVioletIntensity()));
        TextView r27 = getTvPrecipitationValue();
        BleWeather2 r28 = r20.getMWeather1();
        Intrinsics.XXI(r28);
        r27.setText(cp5.Ii0X0X(r28.getMPrecipitation(), this.userProfile.getUnit()));
        TextView r29 = getTvPrecipitationUnit();
        if (this.userProfile.getUnit() != 0) goto L23;
        String r30 = DateFormatUtils.MIN;
    L24:
        r29.setText(r30);
        ImageView r31 = getIvWeather1();
        BleWeather2 r32 = r20.getMWeather1();
        Intrinsics.XXI(r32);
        r31.setImageResource(UtilsKt.X00XIX1(this, r32.getMWeatherCode()));
        TextView r33 = getTvWeatherValue1();
        BleWeather2 r34 = r20.getMWeather1();
        Intrinsics.XXI(r34);
        String r35 = getTemp(r34.getMMinTemperature());
        BleWeather2 r36 = r20.getMWeather1();
        Intrinsics.XXI(r36);
        r33.setText(r35 + "/" + getTemp(r36.getMMaxTemperature()));
        getTvWeatherDate1().setText(O0X11OiO.iOO1ii1(((long) r20.getMTime()) * 1000, 0).IiI10X());
        ImageView r37 = getIvWeather2();
        BleWeather2 r38 = r20.getMWeather2();
        Intrinsics.XXI(r38);
        r37.setImageResource(UtilsKt.X00XIX1(this, r38.getMWeatherCode()));
        TextView r39 = getTvWeatherValue2();
        BleWeather2 r40 = r20.getMWeather2();
        Intrinsics.XXI(r40);
        String r41 = getTemp(r40.getMMinTemperature());
        BleWeather2 r42 = r20.getMWeather2();
        Intrinsics.XXI(r42);
        r39.setText(r41 + "/" + getTemp(r42.getMMaxTemperature()));
        getTvWeatherDate2().setText(O0X11OiO.iOO1ii1(((long) r20.getMTime()) * 1000, 1).IiI10X());
        ImageView r43 = getIvWeather3();
        Intrinsics.O10IXXX0X(r43, "<get-ivWeather3>(...)");
        TextView r44 = getTvWeatherValue3();
        Intrinsics.O10IXXX0X(r44, "<get-tvWeatherValue3>(...)");
        setWeatherView(r20, r43, r44);
        getTvWeatherDate3().setText(O0X11OiO.iOO1ii1(((long) r20.getMTime()) * 1000, 2).IiI10X());
        if (r20.getMWeather4() != null) goto L28;
        ImageView r0 = getIvWeather4();
        Intrinsics.O10IXXX0X(r0, "<get-ivWeather4>(...)");
        TextView r45 = getTvWeatherValue4();
        Intrinsics.O10IXXX0X(r45, "<get-tvWeatherValue4>(...)");
        setWeatherView(r20, r0, r45);
        ImageView r46 = getIvWeather5();
        Intrinsics.O10IXXX0X(r46, "<get-ivWeather5>(...)");
        TextView r47 = getTvWeatherValue5();
        Intrinsics.O10IXXX0X(r47, "<get-tvWeatherValue5>(...)");
        setWeatherView(r20, r46, r47);
        ImageView r48 = getIvWeather6();
        Intrinsics.O10IXXX0X(r48, "<get-ivWeather6>(...)");
        TextView r49 = getTvWeatherValue6();
        Intrinsics.O10IXXX0X(r49, "<get-tvWeatherValue6>(...)");
        setWeatherView(r20, r48, r49);
        ImageView r50 = getIvWeather7();
        Intrinsics.O10IXXX0X(r50, "<get-ivWeather7>(...)");
        TextView r51 = getTvWeatherValue7();
        Intrinsics.O10IXXX0X(r51, "<get-tvWeatherValue7>(...)");
        setWeatherView(r20, r50, r51);
        return;
    L28:
        ImageView r52 = getIvWeather4();
        BleWeather2 r53 = r20.getMWeather4();
        Intrinsics.XXI(r53);
        r52.setImageResource(UtilsKt.X00XIX1(this, r53.getMWeatherCode()));
        TextView r54 = getTvWeatherValue4();
        BleWeather2 r55 = r20.getMWeather4();
        Intrinsics.XXI(r55);
        String r56 = getTemp(r55.getMMinTemperature());
        BleWeather2 r57 = r20.getMWeather4();
        Intrinsics.XXI(r57);
        r54.setText(r56 + "/" + getTemp(r57.getMMaxTemperature()));
        getTvWeatherDate4().setText(O0X11OiO.iOO1ii1(((long) r20.getMTime()) * 1000, 3).IiI10X());
        ImageView r58 = getIvWeather5();
        BleWeather2 r59 = r20.getMWeather5();
        Intrinsics.XXI(r59);
        r58.setImageResource(UtilsKt.X00XIX1(this, r59.getMWeatherCode()));
        TextView r60 = getTvWeatherValue5();
        BleWeather2 r61 = r20.getMWeather5();
        Intrinsics.XXI(r61);
        String r62 = getTemp(r61.getMMinTemperature());
        BleWeather2 r63 = r20.getMWeather5();
        Intrinsics.XXI(r63);
        r60.setText(r62 + "/" + getTemp(r63.getMMaxTemperature()));
        getTvWeatherDate5().setText(O0X11OiO.iOO1ii1(((long) r20.getMTime()) * 1000, 4).IiI10X());
        ImageView r64 = getIvWeather6();
        BleWeather2 r65 = r20.getMWeather6();
        Intrinsics.XXI(r65);
        r64.setImageResource(UtilsKt.X00XIX1(this, r65.getMWeatherCode()));
        TextView r66 = getTvWeatherValue6();
        BleWeather2 r67 = r20.getMWeather6();
        Intrinsics.XXI(r67);
        String r68 = getTemp(r67.getMMinTemperature());
        BleWeather2 r69 = r20.getMWeather6();
        Intrinsics.XXI(r69);
        r66.setText(r68 + "/" + getTemp(r69.getMMaxTemperature()));
        getTvWeatherDate6().setText(O0X11OiO.iOO1ii1(((long) r20.getMTime()) * 1000, 5).IiI10X());
        ImageView r70 = getIvWeather7();
        BleWeather2 r71 = r20.getMWeather7();
        Intrinsics.XXI(r71);
        r70.setImageResource(UtilsKt.X00XIX1(this, r71.getMWeatherCode()));
        TextView r72 = getTvWeatherValue7();
        BleWeather2 r73 = r20.getMWeather7();
        Intrinsics.XXI(r73);
        String r74 = getTemp(r73.getMMinTemperature());
        BleWeather2 r75 = r20.getMWeather7();
        Intrinsics.XXI(r75);
        r72.setText(r74 + "/" + getTemp(r75.getMMaxTemperature()));
        getTvWeatherDate7().setText(O0X11OiO.iOO1ii1(((long) r20.getMTime()) * 1000, 6).IiI10X());
        goto L29
    L23:
        r30 = "in";
    L29:
        SPUtils r76 = a01.OXO1.OXO1();
        WeatherRealtime r77 = (WeatherRealtime) new Gson().fromJson(r76.getString(b01.X111IO + '_' + WeatherRealtime.class.getName()), WeatherRealtime.class);
        if (r77 == null) goto L33;
        getTv_city_name().setVisibility(0);
        getTv_city_name().setText(r77.getName());
        return;
    L33:
        getTv_city_name().setVisibility(8);
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_weather2;
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        finish();
    }
}
