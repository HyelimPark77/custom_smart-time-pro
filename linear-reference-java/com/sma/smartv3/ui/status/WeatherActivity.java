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
import com.android.mltcode.paycertificationapi.au6;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.bu6;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.cu6;
import com.android.mltcode.paycertificationapi.du6;
import com.android.mltcode.paycertificationapi.eu6;
import com.android.mltcode.paycertificationapi.fu6;
import com.android.mltcode.paycertificationapi.gk4;
import com.android.mltcode.paycertificationapi.gu6;
import com.android.mltcode.paycertificationapi.hu6;
import com.android.mltcode.paycertificationapi.iu6;
import com.android.mltcode.paycertificationapi.ju6;
import com.android.mltcode.paycertificationapi.ku6;
import com.android.mltcode.paycertificationapi.lu6;
import com.android.mltcode.paycertificationapi.mu6;
import com.android.mltcode.paycertificationapi.nu6;
import com.android.mltcode.paycertificationapi.ou6;
import com.android.mltcode.paycertificationapi.pu6;
import com.android.mltcode.paycertificationapi.qu6;
import com.android.mltcode.paycertificationapi.ru6;
import com.android.mltcode.paycertificationapi.su6;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.tu6;
import com.android.mltcode.paycertificationapi.uu6;
import com.android.mltcode.paycertificationapi.vu6;
import com.android.mltcode.paycertificationapi.wu6;
import com.android.mltcode.paycertificationapi.xt6;
import com.android.mltcode.paycertificationapi.yt6;
import com.android.mltcode.paycertificationapi.zt6;
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
import com.szabh.smable3.entity.BleWeather;
import com.szabh.smable3.entity.BleWeatherForecast;
import com.szabh.smable3.entity.BleWeatherRealtime;
import com.tenmeter.smlibrary.utils.DateFormatUtils;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nWeatherActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WeatherActivity.kt\ncom/sma/smartv3/ui/status/WeatherActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,166:1\n19#2:167\n15#2:168\n19#2:169\n15#2:170\n90#2:171\n*S KotlinDebug\n*F\n+ 1 WeatherActivity.kt\ncom/sma/smartv3/ui/status/WeatherActivity\n*L\n61#1:167\n61#1:168\n63#1:169\n63#1:170\n149#1:171\n*E\n"})
public final class WeatherActivity extends BaseActivity {

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
    private final Lazy tvWeatherName$delegate;

    @aa1
    private final Lazy tvWeatherValue1$delegate;

    @aa1
    private final Lazy tvWeatherValue2$delegate;

    @aa1
    private final Lazy tvWeatherValue3$delegate;

    @aa1
    private final Lazy tvWindSpeedUnit$delegate;

    @aa1
    private final Lazy tvWindSpeedValue$delegate;

    @aa1
    private final Lazy tv_city_name$delegate;

    @aa1
    private final AppUser userProfile;

    public WeatherActivity() {
        this.abhTitleCenter$delegate = LazyKt__LazyJVMKt.iO(new xt6(this));
        this.bg$delegate = LazyKt__LazyJVMKt.iO(new zt6(this));
        this.ivWeather$delegate = LazyKt__LazyJVMKt.iO(new gu6(this));
        this.tvTemperatureValue$delegate = LazyKt__LazyJVMKt.iO(new hu6(this));
        this.tvTemperatureUnit$delegate = LazyKt__LazyJVMKt.iO(new ju6(this));
        this.tvTemperatureMin$delegate = LazyKt__LazyJVMKt.iO(new ku6(this));
        this.tvTemperatureMax$delegate = LazyKt__LazyJVMKt.iO(new lu6(this));
        this.tvWeatherName$delegate = LazyKt__LazyJVMKt.iO(new mu6(this));
        this.tvUviValue$delegate = LazyKt__LazyJVMKt.iO(new nu6(this));
        this.tvHumidityValue$delegate = LazyKt__LazyJVMKt.iO(new ou6(this));
        this.tvVisibilityValue$delegate = LazyKt__LazyJVMKt.iO(new iu6(this));
        this.tvVisibilityUnit$delegate = LazyKt__LazyJVMKt.iO(new pu6(this));
        this.tvWindSpeedValue$delegate = LazyKt__LazyJVMKt.iO(new qu6(this));
        this.tvWindSpeedUnit$delegate = LazyKt__LazyJVMKt.iO(new ru6(this));
        this.tvPrecipitationValue$delegate = LazyKt__LazyJVMKt.iO(new su6(this));
        this.tvPrecipitationUnit$delegate = LazyKt__LazyJVMKt.iO(new tu6(this));
        this.ivWeather1$delegate = LazyKt__LazyJVMKt.iO(new uu6(this));
        this.tvWeatherValue1$delegate = LazyKt__LazyJVMKt.iO(new vu6(this));
        this.tvWeatherDate1$delegate = LazyKt__LazyJVMKt.iO(new wu6(this));
        this.ivWeather2$delegate = LazyKt__LazyJVMKt.iO(new yt6(this));
        this.tvWeatherValue2$delegate = LazyKt__LazyJVMKt.iO(new au6(this));
        this.tvWeatherDate2$delegate = LazyKt__LazyJVMKt.iO(new bu6(this));
        this.ivWeather3$delegate = LazyKt__LazyJVMKt.iO(new cu6(this));
        this.tvWeatherValue3$delegate = LazyKt__LazyJVMKt.iO(new du6(this));
        this.tvWeatherDate3$delegate = LazyKt__LazyJVMKt.iO(new eu6(this));
        this.tv_city_name$delegate = LazyKt__LazyJVMKt.iO(new fu6(this));
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

    public static /* synthetic */ TextView I0iXXO(WeatherActivity r0) {
        return tvPrecipitationUnit_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView I1(WeatherActivity r0) {
        return tvWeatherDate2_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView I1XOi1(WeatherActivity r0) {
        return tvTemperatureUnit_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView II1Xi0(WeatherActivity r0) {
        return tvTemperatureMin_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView IIX1OXO(WeatherActivity r0) {
        return tvTemperatureValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView IXXOO(WeatherActivity r0) {
        return tvPrecipitationValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ PFMedium O10IXXX0X(WeatherActivity r0) {
        return abhTitleCenter_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView O1O(WeatherActivity r0) {
        return tvWeatherDate1_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageView OII(WeatherActivity r0) {
        return ivWeather2_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView OIX0iXi(WeatherActivity r0) {
        return tvHumidityValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView OX(WeatherActivity r0) {
        return tvVisibilityUnit_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView OiIIX101O(WeatherActivity r0) {
        return tvWeatherDate3_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageView X01IiOiIi(WeatherActivity r0) {
        return ivWeather3_delegate$lambda$0(r0);
    }

    public static /* synthetic */ View X0O(WeatherActivity r0) {
        return bg_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageView X1ii(WeatherActivity r0) {
        return ivWeather1_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView XX0(WeatherActivity r0) {
        return tvWeatherValue3_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView XXI(WeatherActivity r0) {
        return tvWindSpeedUnit_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView XXIIO1i11(WeatherActivity r0) {
        return tvWeatherValue2_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView XiOIO(WeatherActivity r0) {
        return tvWindSpeedValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView XiOIii1(WeatherActivity r0) {
        return tvTemperatureMax_delegate$lambda$0(r0);
    }

    private static final PFMedium abhTitleCenter_delegate$lambda$0(WeatherActivity r1) {
        return (PFMedium) r1.findViewById(R.id.abh_title_center);
    }

    private static final View bg_delegate$lambda$0(WeatherActivity r1) {
        return r1.findViewById(R.id.fl_bg);
    }

    public static /* synthetic */ ImageView i010I(WeatherActivity r0) {
        return ivWeather_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView iI(WeatherActivity r0) {
        return tvWeatherName_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView iIiiO(WeatherActivity r0) {
        return tvVisibilityValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView iOO1ii1(WeatherActivity r0) {
        return tv_city_name_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView iOOX010X(WeatherActivity r0) {
        return tvUviValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView iX(WeatherActivity r0) {
        return tvWeatherValue1_delegate$lambda$0(r0);
    }

    private static final ImageView ivWeather1_delegate$lambda$0(WeatherActivity r1) {
        return (ImageView) r1.findViewById(R.id.iv_weather1);
    }

    private static final ImageView ivWeather2_delegate$lambda$0(WeatherActivity r1) {
        return (ImageView) r1.findViewById(R.id.iv_weather2);
    }

    private static final ImageView ivWeather3_delegate$lambda$0(WeatherActivity r1) {
        return (ImageView) r1.findViewById(R.id.iv_weather3);
    }

    private static final ImageView ivWeather_delegate$lambda$0(WeatherActivity r1) {
        return (ImageView) r1.findViewById(R.id.iv_weather);
    }

    private static final TextView tvHumidityValue_delegate$lambda$0(WeatherActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_humidity_value);
    }

    private static final TextView tvPrecipitationUnit_delegate$lambda$0(WeatherActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_precipitation_unit);
    }

    private static final TextView tvPrecipitationValue_delegate$lambda$0(WeatherActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_precipitation_value);
    }

    private static final TextView tvTemperatureMax_delegate$lambda$0(WeatherActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_temperature_max);
    }

    private static final TextView tvTemperatureMin_delegate$lambda$0(WeatherActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_temperature_min);
    }

    private static final TextView tvTemperatureUnit_delegate$lambda$0(WeatherActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_temperature_unit);
    }

    private static final TextView tvTemperatureValue_delegate$lambda$0(WeatherActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_temperature_value);
    }

    private static final TextView tvUviValue_delegate$lambda$0(WeatherActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_uvi_value);
    }

    private static final TextView tvVisibilityUnit_delegate$lambda$0(WeatherActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_visibility_unit);
    }

    private static final TextView tvVisibilityValue_delegate$lambda$0(WeatherActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_visibility_value);
    }

    private static final TextView tvWeatherDate1_delegate$lambda$0(WeatherActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_weather_date1);
    }

    private static final TextView tvWeatherDate2_delegate$lambda$0(WeatherActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_weather_date2);
    }

    private static final TextView tvWeatherDate3_delegate$lambda$0(WeatherActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_weather_date3);
    }

    private static final TextView tvWeatherName_delegate$lambda$0(WeatherActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_weather_name);
    }

    private static final TextView tvWeatherValue1_delegate$lambda$0(WeatherActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_weather_value1);
    }

    private static final TextView tvWeatherValue2_delegate$lambda$0(WeatherActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_weather_value2);
    }

    private static final TextView tvWeatherValue3_delegate$lambda$0(WeatherActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_weather_value3);
    }

    private static final TextView tvWindSpeedUnit_delegate$lambda$0(WeatherActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_wind_speed_unit);
    }

    private static final TextView tvWindSpeedValue_delegate$lambda$0(WeatherActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_wind_speed_value);
    }

    private static final TextView tv_city_name_delegate$lambda$0(WeatherActivity r1) {
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
        BleWeatherRealtime r1 = (BleWeatherRealtime) BaseBleCache.getObject$default(r3, BleKey.WEATHER_REALTIME, BleWeatherRealtime.class, null, 4, null);
        if (r1 == null) goto L18;
        BleWeather r4 = r1.getMWeather();
        Intrinsics.XXI(r4);
        int r5 = r4.getMWeatherCode();
        getBg().setBackgroundResource(UtilsKt.OO(this, r5));
        getIvWeather().setImageResource(UtilsKt.X00XIX1(this, r5));
        TextView r6 = getTvTemperatureValue();
        if (cp5.II1Xi0(this.mAppUser.getUnit()) != 1) goto L7;
        BleWeather r7 = r1.getMWeather();
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
        BleWeather r13 = r1.getMWeather();
        Intrinsics.XXI(r13);
        r12.setText(String.valueOf(r13.getMHumidity()));
        TextView r14 = getTvVisibilityValue();
        BleWeather r15 = r1.getMWeather();
        Intrinsics.XXI(r15);
        r14.setText(String.valueOf(cp5.X1ii(r15.getMVisibility() * 1000, this.userProfile.getUnit(), false, 4, null)));
        getTvVisibilityUnit().setText(getString(cp5.OiIIX101O(this.userProfile.getUnit())));
        TextView r16 = getTvWindSpeedValue();
        BleWeather r2 = r1.getMWeather();
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
        BleWeather r19 = r1.getMWeather();
        Intrinsics.XXI(r19);
        r8 = Integer.valueOf(r19.getMCurrentTemperature());
    L18:
        BleWeatherForecast r20 = (BleWeatherForecast) BaseBleCache.getObject$default(r3, BleKey.WEATHER_FORECAST, BleWeatherForecast.class, null, 4, null);
        if (r20 == null) goto L25;
        TextView r21 = getTvTemperatureMin();
        BleWeather r22 = r20.getMWeather1();
        Intrinsics.XXI(r22);
        r21.setText(getTemp(r22.getMMinTemperature()));
        TextView r23 = getTvTemperatureMax();
        BleWeather r24 = r20.getMWeather1();
        Intrinsics.XXI(r24);
        r23.setText(getTemp(r24.getMMaxTemperature()));
        TextView r25 = getTvUviValue();
        BleWeather r26 = r20.getMWeather1();
        Intrinsics.XXI(r26);
        r25.setText(UtilsKt.X100O(r26.getMUltraVioletIntensity()));
        TextView r27 = getTvPrecipitationValue();
        BleWeather r28 = r20.getMWeather1();
        Intrinsics.XXI(r28);
        r27.setText(cp5.Ii0X0X(r28.getMPrecipitation(), this.userProfile.getUnit()));
        TextView r29 = getTvPrecipitationUnit();
        if (this.userProfile.getUnit() != 0) goto L23;
        String r30 = DateFormatUtils.MIN;
    L24:
        r29.setText(r30);
        ImageView r31 = getIvWeather1();
        BleWeather r32 = r20.getMWeather1();
        Intrinsics.XXI(r32);
        r31.setImageResource(UtilsKt.X00XIX1(this, r32.getMWeatherCode()));
        TextView r33 = getTvWeatherValue1();
        BleWeather r34 = r20.getMWeather1();
        Intrinsics.XXI(r34);
        String r35 = getTemp(r34.getMMinTemperature());
        BleWeather r36 = r20.getMWeather1();
        Intrinsics.XXI(r36);
        r33.setText(r35 + "/" + getTemp(r36.getMMaxTemperature()));
        getTvWeatherDate1().setText(O0X11OiO.iOO1ii1(((long) r20.getMTime()) * 1000, 0).IiI10X());
        ImageView r37 = getIvWeather2();
        BleWeather r38 = r20.getMWeather2();
        Intrinsics.XXI(r38);
        r37.setImageResource(UtilsKt.X00XIX1(this, r38.getMWeatherCode()));
        TextView r39 = getTvWeatherValue2();
        BleWeather r40 = r20.getMWeather2();
        Intrinsics.XXI(r40);
        String r41 = getTemp(r40.getMMinTemperature());
        BleWeather r42 = r20.getMWeather2();
        Intrinsics.XXI(r42);
        r39.setText(r41 + "/" + getTemp(r42.getMMaxTemperature()));
        getTvWeatherDate2().setText(O0X11OiO.iOO1ii1(((long) r20.getMTime()) * 1000, 1).IiI10X());
        ImageView r43 = getIvWeather3();
        BleWeather r44 = r20.getMWeather3();
        Intrinsics.XXI(r44);
        r43.setImageResource(UtilsKt.X00XIX1(this, r44.getMWeatherCode()));
        TextView r45 = getTvWeatherValue3();
        BleWeather r46 = r20.getMWeather3();
        Intrinsics.XXI(r46);
        String r47 = getTemp(r46.getMMinTemperature());
        BleWeather r48 = r20.getMWeather3();
        Intrinsics.XXI(r48);
        r45.setText(r47 + "/" + getTemp(r48.getMMaxTemperature()));
        getTvWeatherDate3().setText(O0X11OiO.iOO1ii1(((long) r20.getMTime()) * 1000, 2).IiI10X());
        goto L25
    L23:
        r30 = "in";
    L25:
        SPUtils r49 = a01.OXO1.OXO1();
        WeatherRealtime r50 = (WeatherRealtime) new Gson().fromJson(r49.getString(b01.X111IO + '_' + WeatherRealtime.class.getName()), WeatherRealtime.class);
        if (r50 == null) goto L29;
        getTv_city_name().setVisibility(0);
        getTv_city_name().setText(r50.getName());
        return;
    L29:
        getTv_city_name().setVisibility(8);
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_weather;
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        finish();
    }
}
