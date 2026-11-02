package com.sma.smartv3.ui.status;

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
import com.android.mltcode.paycertificationapi.at6;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.bt6;
import com.android.mltcode.paycertificationapi.cp5;
import com.android.mltcode.paycertificationapi.ct6;
import com.android.mltcode.paycertificationapi.dt6;
import com.android.mltcode.paycertificationapi.es6;
import com.android.mltcode.paycertificationapi.et6;
import com.android.mltcode.paycertificationapi.fs6;
import com.android.mltcode.paycertificationapi.ft6;
import com.android.mltcode.paycertificationapi.gs6;
import com.android.mltcode.paycertificationapi.gt6;
import com.android.mltcode.paycertificationapi.hs6;
import com.android.mltcode.paycertificationapi.ht6;
import com.android.mltcode.paycertificationapi.is6;
import com.android.mltcode.paycertificationapi.it6;
import com.android.mltcode.paycertificationapi.js6;
import com.android.mltcode.paycertificationapi.jt6;
import com.android.mltcode.paycertificationapi.ks6;
import com.android.mltcode.paycertificationapi.kt6;
import com.android.mltcode.paycertificationapi.ls6;
import com.android.mltcode.paycertificationapi.lt6;
import com.android.mltcode.paycertificationapi.ms6;
import com.android.mltcode.paycertificationapi.mt6;
import com.android.mltcode.paycertificationapi.ns6;
import com.android.mltcode.paycertificationapi.nt6;
import com.android.mltcode.paycertificationapi.os6;
import com.android.mltcode.paycertificationapi.ot6;
import com.android.mltcode.paycertificationapi.ps6;
import com.android.mltcode.paycertificationapi.pt6;
import com.android.mltcode.paycertificationapi.qs6;
import com.android.mltcode.paycertificationapi.qt6;
import com.android.mltcode.paycertificationapi.rs6;
import com.android.mltcode.paycertificationapi.rt6;
import com.android.mltcode.paycertificationapi.ss6;
import com.android.mltcode.paycertificationapi.st6;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.ts6;
import com.android.mltcode.paycertificationapi.tt6;
import com.android.mltcode.paycertificationapi.us6;
import com.android.mltcode.paycertificationapi.ut6;
import com.android.mltcode.paycertificationapi.vs6;
import com.android.mltcode.paycertificationapi.vt6;
import com.android.mltcode.paycertificationapi.ws6;
import com.android.mltcode.paycertificationapi.wt6;
import com.android.mltcode.paycertificationapi.xs6;
import com.android.mltcode.paycertificationapi.ys6;
import com.android.mltcode.paycertificationapi.zs6;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.SPUtils;
import com.google.gson.Gson;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.model.WeatherRealtime;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nWeather2NewActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Weather2NewActivity.kt\ncom/sma/smartv3/ui/status/Weather2NewActivity\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,263:1\n19#2:264\n15#2:265\n90#2:266\n*S KotlinDebug\n*F\n+ 1 Weather2NewActivity.kt\ncom/sma/smartv3/ui/status/Weather2NewActivity\n*L\n105#1:264\n105#1:265\n127#1:266\n*E\n"})
public final class Weather2NewActivity extends BaseActivity {

    @aa1
    private final Lazy abhTitleCenter$delegate;

    @aa1
    private final Lazy abhTitleLeft$delegate;

    @aa1
    private final Lazy abhTitleRight$delegate;

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
    private boolean mUnit;

    @aa1
    private final Lazy todayIcon$delegate;

    @aa1
    private final Lazy tvHumidityValue$delegate;

    @aa1
    private final Lazy tvPrecipitationUnit$delegate;

    @aa1
    private final Lazy tvPrecipitationValue$delegate;

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
    private final Lazy tvWeatherMaxValue1$delegate;

    @aa1
    private final Lazy tvWeatherMaxValue2$delegate;

    @aa1
    private final Lazy tvWeatherMaxValue3$delegate;

    @aa1
    private final Lazy tvWeatherMaxValue4$delegate;

    @aa1
    private final Lazy tvWeatherMaxValue5$delegate;

    @aa1
    private final Lazy tvWeatherMaxValue6$delegate;

    @aa1
    private final Lazy tvWeatherMaxValue7$delegate;

    @aa1
    private final Lazy tvWeatherMinValue1$delegate;

    @aa1
    private final Lazy tvWeatherMinValue2$delegate;

    @aa1
    private final Lazy tvWeatherMinValue3$delegate;

    @aa1
    private final Lazy tvWeatherMinValue4$delegate;

    @aa1
    private final Lazy tvWeatherMinValue5$delegate;

    @aa1
    private final Lazy tvWeatherMinValue6$delegate;

    @aa1
    private final Lazy tvWeatherMinValue7$delegate;

    @aa1
    private final Lazy tvWeatherName$delegate;

    @aa1
    private final Lazy tvWeatherTemp$delegate;

    @aa1
    private final Lazy tvWindSpeedUnit$delegate;

    @aa1
    private final Lazy tvWindSpeedValue$delegate;

    @aa1
    private final Lazy tv_city_name$delegate;

    public Weather2NewActivity() {
        this.tvTemperatureValue$delegate = LazyKt__LazyJVMKt.iO(new ps6(this));
        this.tvWeatherName$delegate = LazyKt__LazyJVMKt.iO(new hs6(this));
        this.tvWeatherTemp$delegate = LazyKt__LazyJVMKt.iO(new ts6(this));
        this.tv_city_name$delegate = LazyKt__LazyJVMKt.iO(new ft6(this));
        this.tvUviValue$delegate = LazyKt__LazyJVMKt.iO(new kt6(this));
        this.tvHumidityValue$delegate = LazyKt__LazyJVMKt.iO(new mt6(this));
        this.tvVisibilityValue$delegate = LazyKt__LazyJVMKt.iO(new nt6(this));
        this.tvVisibilityUnit$delegate = LazyKt__LazyJVMKt.iO(new ot6(this));
        this.tvWindSpeedValue$delegate = LazyKt__LazyJVMKt.iO(new pt6(this));
        this.tvWindSpeedUnit$delegate = LazyKt__LazyJVMKt.iO(new qt6(this));
        this.tvPrecipitationValue$delegate = LazyKt__LazyJVMKt.iO(new at6(this));
        this.tvPrecipitationUnit$delegate = LazyKt__LazyJVMKt.iO(new lt6(this));
        this.todayIcon$delegate = LazyKt__LazyJVMKt.iO(new rt6(this));
        this.ivWeather1$delegate = LazyKt__LazyJVMKt.iO(new st6(this));
        this.tvWeatherMinValue1$delegate = LazyKt__LazyJVMKt.iO(new tt6(this));
        this.tvWeatherMaxValue1$delegate = LazyKt__LazyJVMKt.iO(new ut6(this));
        this.tvWeatherDate1$delegate = LazyKt__LazyJVMKt.iO(new vt6(this));
        this.ivWeather2$delegate = LazyKt__LazyJVMKt.iO(new wt6(this));
        this.tvWeatherMinValue2$delegate = LazyKt__LazyJVMKt.iO(new fs6(this));
        this.tvWeatherMaxValue2$delegate = LazyKt__LazyJVMKt.iO(new gs6(this));
        this.tvWeatherDate2$delegate = LazyKt__LazyJVMKt.iO(new is6(this));
        this.ivWeather3$delegate = LazyKt__LazyJVMKt.iO(new js6(this));
        this.tvWeatherMinValue3$delegate = LazyKt__LazyJVMKt.iO(new ks6(this));
        this.tvWeatherMaxValue3$delegate = LazyKt__LazyJVMKt.iO(new ls6(this));
        this.tvWeatherDate3$delegate = LazyKt__LazyJVMKt.iO(new ms6(this));
        this.ivWeather4$delegate = LazyKt__LazyJVMKt.iO(new ns6(this));
        this.tvWeatherMinValue4$delegate = LazyKt__LazyJVMKt.iO(new os6(this));
        this.tvWeatherMaxValue4$delegate = LazyKt__LazyJVMKt.iO(new qs6(this));
        this.tvWeatherDate4$delegate = LazyKt__LazyJVMKt.iO(new rs6(this));
        this.ivWeather5$delegate = LazyKt__LazyJVMKt.iO(new ss6(this));
        this.tvWeatherMinValue5$delegate = LazyKt__LazyJVMKt.iO(new us6(this));
        this.tvWeatherMaxValue5$delegate = LazyKt__LazyJVMKt.iO(new vs6(this));
        this.tvWeatherDate5$delegate = LazyKt__LazyJVMKt.iO(new ws6(this));
        this.ivWeather6$delegate = LazyKt__LazyJVMKt.iO(new xs6(this));
        this.tvWeatherMinValue6$delegate = LazyKt__LazyJVMKt.iO(new ys6(this));
        this.tvWeatherMaxValue6$delegate = LazyKt__LazyJVMKt.iO(new zs6(this));
        this.tvWeatherDate6$delegate = LazyKt__LazyJVMKt.iO(new bt6(this));
        this.ivWeather7$delegate = LazyKt__LazyJVMKt.iO(new ct6(this));
        this.tvWeatherMinValue7$delegate = LazyKt__LazyJVMKt.iO(new dt6(this));
        this.tvWeatherMaxValue7$delegate = LazyKt__LazyJVMKt.iO(new et6(this));
        this.tvWeatherDate7$delegate = LazyKt__LazyJVMKt.iO(new gt6(this));
        this.abhTitleCenter$delegate = LazyKt__LazyJVMKt.iO(new ht6(this));
        this.abhTitleRight$delegate = LazyKt__LazyJVMKt.iO(new it6(this));
        this.abhTitleLeft$delegate = LazyKt__LazyJVMKt.iO(new jt6(this));
        SPUtils r1 = a01.OXO1.IiI10X();
        Object r2 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r3 = new Gson().fromJson(r1.getString(AppUser.class.getName()), AppUser.class);
        if (r3 == null) goto L6;
        r2 = r3;
    L6:
        this.mAppUser = (AppUser) r2;
    }

    public static /* synthetic */ TextView I0iXXO(Weather2NewActivity r0) {
        return tvWeatherMaxValue1_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView I1(Weather2NewActivity r0) {
        return tvWeatherDate6_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView I1XOi1(Weather2NewActivity r0) {
        return tvWeatherDate5_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView II1Xi0(Weather2NewActivity r0) {
        return tvWeatherMaxValue4_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit IIX1OXO(Weather2NewActivity r0, BleConnector r1) {
        return onTitleRightClick$lambda$0(r0, r1);
    }

    public static /* synthetic */ TextView IXXOO(Weather2NewActivity r0) {
        return tvPrecipitationUnit_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView Ii1iii0(Weather2NewActivity r0) {
        return tvWeatherDate1_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView O001I(Weather2NewActivity r0) {
        return tvPrecipitationValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView O10IXXX0X(Weather2NewActivity r0) {
        return tvVisibilityValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView O1O(Weather2NewActivity r0) {
        return abhTitleCenter_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageView OII(Weather2NewActivity r0) {
        return ivWeather4_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView OIX0iXi(Weather2NewActivity r0) {
        return tvWeatherMaxValue7_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageView OO(Weather2NewActivity r0) {
        return ivWeather5_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView OX(Weather2NewActivity r0) {
        return tvWeatherMinValue5_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageView OX110i(Weather2NewActivity r0) {
        return todayIcon_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView OiIIX101O(Weather2NewActivity r0) {
        return tvUviValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView X01IiOiIi(Weather2NewActivity r0) {
        return tvWeatherDate2_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView X0O(Weather2NewActivity r0) {
        return tvWeatherName_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView X0i1O(Weather2NewActivity r0) {
        return tvWeatherMinValue1_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView X100O(Weather2NewActivity r0) {
        return tvWindSpeedUnit_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView X11I(Weather2NewActivity r0) {
        return tvWeatherMaxValue2_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView X11iII1O1(Weather2NewActivity r0) {
        return tvWeatherMaxValue5_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView X1IX(Weather2NewActivity r0) {
        return tvHumidityValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView X1ii(Weather2NewActivity r0) {
        return tvWeatherDate3_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageView XOX0O0(Weather2NewActivity r0) {
        return ivWeather6_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageView XX0(Weather2NewActivity r0) {
        return abhTitleLeft_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView XX1Oi(Weather2NewActivity r0) {
        return tvWeatherMinValue6_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView XXI(Weather2NewActivity r0) {
        return tvWeatherMinValue4_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView XXIIO1i11(Weather2NewActivity r0) {
        return tvWeatherTemp_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView XXO(Weather2NewActivity r0) {
        return tvWeatherDate4_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView XXX11i(Weather2NewActivity r0) {
        return tvWeatherMinValue7_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView XiOIO(Weather2NewActivity r0) {
        return tvWeatherMinValue2_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView XiOIii1(Weather2NewActivity r0) {
        return tvVisibilityUnit_delegate$lambda$0(r0);
    }

    private static final TextView abhTitleCenter_delegate$lambda$0(Weather2NewActivity r1) {
        return (TextView) r1.findViewById(R.id.abh_title_center);
    }

    private static final ImageView abhTitleLeft_delegate$lambda$0(Weather2NewActivity r1) {
        return (ImageView) r1.findViewById(R.id.abh_title_left);
    }

    private static final ImageView abhTitleRight_delegate$lambda$0(Weather2NewActivity r1) {
        return (ImageView) r1.findViewById(R.id.abh_title_right);
    }

    public static /* synthetic */ TextView i010I(Weather2NewActivity r0) {
        return tvWeatherMaxValue6_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView iI(Weather2NewActivity r0) {
        return tvWindSpeedValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView iIXi1iiXI(Weather2NewActivity r0) {
        return tvTemperatureValue_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView iIiiO(Weather2NewActivity r0) {
        return tvWeatherDate7_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageView iOO1ii1(Weather2NewActivity r0) {
        return ivWeather3_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageView iOOX010X(Weather2NewActivity r0) {
        return ivWeather2_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView iOiXi11II(Weather2NewActivity r0) {
        return tvWeatherMaxValue3_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageView iX(Weather2NewActivity r0) {
        return ivWeather1_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageView iX1O1(Weather2NewActivity r0) {
        return ivWeather7_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageView iXiX011(Weather2NewActivity r0) {
        return abhTitleRight_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView iXiiiO(Weather2NewActivity r0) {
        return tv_city_name_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView iiiO(Weather2NewActivity r0) {
        return tvWeatherMinValue3_delegate$lambda$0(r0);
    }

    private static final ImageView ivWeather1_delegate$lambda$0(Weather2NewActivity r1) {
        return (ImageView) r1.findViewById(R.id.weather1_icon);
    }

    private static final ImageView ivWeather2_delegate$lambda$0(Weather2NewActivity r1) {
        return (ImageView) r1.findViewById(R.id.weather2_icon);
    }

    private static final ImageView ivWeather3_delegate$lambda$0(Weather2NewActivity r1) {
        return (ImageView) r1.findViewById(R.id.weather3_icon);
    }

    private static final ImageView ivWeather4_delegate$lambda$0(Weather2NewActivity r1) {
        return (ImageView) r1.findViewById(R.id.weather4_icon);
    }

    private static final ImageView ivWeather5_delegate$lambda$0(Weather2NewActivity r1) {
        return (ImageView) r1.findViewById(R.id.weather5_icon);
    }

    private static final ImageView ivWeather6_delegate$lambda$0(Weather2NewActivity r1) {
        return (ImageView) r1.findViewById(R.id.weather6_icon);
    }

    private static final ImageView ivWeather7_delegate$lambda$0(Weather2NewActivity r1) {
        return (ImageView) r1.findViewById(R.id.weather7_icon);
    }

    private static final Unit onTitleRightClick$lambda$0(Weather2NewActivity r9, BleConnector r10) {
        Intrinsics.X0O(r10, "it");
        BaseBleConnector.sendInt8$default(r10, BleKey.TEMPERATURE_UNIT, BleKeyFlag.UPDATE, OiOX0i.iO(r9.mUnit), false, false, 24, null);
        r9.setDayData();
        r9.setRealData();
        boolean r11 = r9.mUnit;
        ImageView r12 = r9.getAbhTitleRight();
        if (r11 == false) goto L6;
        int r13 = R.mipmap.abh_weather_right_icon_f;
    L5:
        r12.setImageResource(r13);
        return Unit.OXO1;
    L6:
        r13 = R.mipmap.abh_weather_right_icon_c;
        goto L5
    }

    private final void setCityData() {
        SPUtils r0 = a01.OXO1.OXO1();
        WeatherRealtime r1 = (WeatherRealtime) new Gson().fromJson(r0.getString(b01.X111IO + '_' + WeatherRealtime.class.getName()), WeatherRealtime.class);
        if (r1 == null) goto L6;
        getTv_city_name().setVisibility(0);
        getTv_city_name().setText(r1.getName());
        return;
    L6:
        getTv_city_name().setVisibility(8);
    }

    private final void setDayData() {
        BleWeatherForecast2 r0 = (BleWeatherForecast2) BaseBleCache.getObject$default(BleCache.INSTANCE, BleKey.WEATHER_FORECAST2, BleWeatherForecast2.class, null, 4, null);
        if (r0 == null) goto L10;
        BleWeather2 r1 = r0.getMWeather1();
        Intrinsics.XXI(r1);
        int r2 = r1.getMMinTemperature();
        BleWeather2 r3 = r0.getMWeather1();
        Intrinsics.XXI(r3);
        int r4 = r3.getMMaxTemperature();
        getTvWeatherTemp().setText(weatherCentigradeToFahrenheit(r2) + weatherUnit() + "/" + weatherCentigradeToFahrenheit(r4) + weatherUnit());
        TextView r5 = getTvUviValue();
        BleWeather2 r6 = r0.getMWeather1();
        Intrinsics.XXI(r6);
        r5.setText(UtilsKt.X100O(r6.getMUltraVioletIntensity()));
        TextView r7 = getTvPrecipitationValue();
        BleWeather2 r8 = r0.getMWeather1();
        Intrinsics.XXI(r8);
        r7.setText(cp5.Ii0X0X(r8.getMPrecipitation(), this.mAppUser.getUnit()));
        TextView r9 = getTvPrecipitationUnit();
        if (this.mAppUser.getUnit() != 0) goto L7;
        String r10 = DateFormatUtils.MIN;
    L8:
        r9.setText(r10);
        TextView r11 = getTvWeatherMinValue1();
        BleWeather2 r12 = r0.getMWeather1();
        Intrinsics.XXI(r12);
        r11.setText(getTemp(r12.getMMinTemperature()));
        TextView r13 = getTvWeatherMaxValue1();
        BleWeather2 r14 = r0.getMWeather1();
        Intrinsics.XXI(r14);
        r13.setText(getTemp(r14.getMMaxTemperature()));
        ImageView r15 = getIvWeather1();
        BleWeather2 r16 = r0.getMWeather1();
        Intrinsics.XXI(r16);
        r15.setImageResource(UtilsKt.iOiXi11II(this, r16.getMWeatherCode()));
        getTvWeatherDate1().setText(getString(R.string.today));
        TextView r17 = getTvWeatherMinValue2();
        BleWeather2 r18 = r0.getMWeather2();
        Intrinsics.XXI(r18);
        r17.setText(getTemp(r18.getMMinTemperature()));
        TextView r19 = getTvWeatherMaxValue2();
        BleWeather2 r20 = r0.getMWeather2();
        Intrinsics.XXI(r20);
        r19.setText(getTemp(r20.getMMaxTemperature()));
        ImageView r21 = getIvWeather2();
        BleWeather2 r22 = r0.getMWeather2();
        Intrinsics.XXI(r22);
        r21.setImageResource(UtilsKt.iOiXi11II(this, r22.getMWeatherCode()));
        getTvWeatherDate2().setText(O0X11OiO.iOO1ii1(((long) r0.getMTime()) * 1000, 1).IiI10X());
        TextView r23 = getTvWeatherMinValue3();
        BleWeather2 r24 = r0.getMWeather3();
        Intrinsics.XXI(r24);
        r23.setText(getTemp(r24.getMMinTemperature()));
        TextView r25 = getTvWeatherMaxValue3();
        BleWeather2 r26 = r0.getMWeather3();
        Intrinsics.XXI(r26);
        r25.setText(getTemp(r26.getMMaxTemperature()));
        ImageView r27 = getIvWeather3();
        BleWeather2 r28 = r0.getMWeather3();
        Intrinsics.XXI(r28);
        r27.setImageResource(UtilsKt.iOiXi11II(this, r28.getMWeatherCode()));
        getTvWeatherDate3().setText(O0X11OiO.iOO1ii1(((long) r0.getMTime()) * 1000, 2).IiI10X());
        TextView r29 = getTvWeatherMinValue4();
        BleWeather2 r30 = r0.getMWeather4();
        Intrinsics.XXI(r30);
        r29.setText(getTemp(r30.getMMinTemperature()));
        TextView r31 = getTvWeatherMaxValue4();
        BleWeather2 r32 = r0.getMWeather4();
        Intrinsics.XXI(r32);
        r31.setText(getTemp(r32.getMMaxTemperature()));
        ImageView r33 = getIvWeather4();
        BleWeather2 r34 = r0.getMWeather4();
        Intrinsics.XXI(r34);
        r33.setImageResource(UtilsKt.iOiXi11II(this, r34.getMWeatherCode()));
        getTvWeatherDate4().setText(O0X11OiO.iOO1ii1(((long) r0.getMTime()) * 1000, 3).IiI10X());
        TextView r35 = getTvWeatherMinValue5();
        BleWeather2 r36 = r0.getMWeather5();
        Intrinsics.XXI(r36);
        r35.setText(getTemp(r36.getMMinTemperature()));
        TextView r37 = getTvWeatherMaxValue5();
        BleWeather2 r38 = r0.getMWeather5();
        Intrinsics.XXI(r38);
        r37.setText(getTemp(r38.getMMaxTemperature()));
        ImageView r39 = getIvWeather5();
        BleWeather2 r40 = r0.getMWeather5();
        Intrinsics.XXI(r40);
        r39.setImageResource(UtilsKt.iOiXi11II(this, r40.getMWeatherCode()));
        getTvWeatherDate5().setText(O0X11OiO.iOO1ii1(((long) r0.getMTime()) * 1000, 4).IiI10X());
        TextView r41 = getTvWeatherMinValue6();
        BleWeather2 r42 = r0.getMWeather6();
        Intrinsics.XXI(r42);
        r41.setText(getTemp(r42.getMMinTemperature()));
        TextView r43 = getTvWeatherMaxValue6();
        BleWeather2 r44 = r0.getMWeather6();
        Intrinsics.XXI(r44);
        r43.setText(getTemp(r44.getMMaxTemperature()));
        ImageView r45 = getIvWeather6();
        BleWeather2 r46 = r0.getMWeather6();
        Intrinsics.XXI(r46);
        r45.setImageResource(UtilsKt.iOiXi11II(this, r46.getMWeatherCode()));
        getTvWeatherDate6().setText(O0X11OiO.iOO1ii1(((long) r0.getMTime()) * 1000, 5).IiI10X());
        TextView r47 = getTvWeatherMinValue7();
        BleWeather2 r48 = r0.getMWeather7();
        Intrinsics.XXI(r48);
        r47.setText(getTemp(r48.getMMinTemperature()));
        TextView r49 = getTvWeatherMaxValue7();
        BleWeather2 r50 = r0.getMWeather7();
        Intrinsics.XXI(r50);
        r49.setText(getTemp(r50.getMMaxTemperature()));
        ImageView r51 = getIvWeather7();
        BleWeather2 r52 = r0.getMWeather7();
        Intrinsics.XXI(r52);
        r51.setImageResource(UtilsKt.iOiXi11II(this, r52.getMWeatherCode()));
        getTvWeatherDate7().setText(O0X11OiO.iOO1ii1(((long) r0.getMTime()) * 1000, 6).IiI10X());
        return;
    L7:
        r10 = "in";
        goto L8
    }

    private final void setRealData() {
        BleWeatherRealtime2 r0 = (BleWeatherRealtime2) BaseBleCache.getObject$default(BleCache.INSTANCE, BleKey.WEATHER_REALTIME2, BleWeatherRealtime2.class, null, 4, null);
        if (r0 == null) goto L10;
        BleWeather2 r1 = r0.getMWeather();
        Intrinsics.XXI(r1);
        int r2 = r1.getMWeatherCode();
        TextView r3 = getTvTemperatureValue();
        if (cp5.II1Xi0(this.mAppUser.getUnit()) != 1) goto L7;
        BleWeather2 r4 = r0.getMWeather();
        Intrinsics.XXI(r4);
        Object r5 = Float.valueOf(cp5.I0iXXO(r4.getMCurrentTemperature()));
    L8:
        r3.setText(String.valueOf(r5));
        BleWeather2 r6 = r0.getMWeather();
        Intrinsics.XXI(r6);
        int r7 = r6.getMCurrentTemperature();
        getTvTemperatureValue().setText(weatherCentigradeToFahrenheit(r7) + getString(R.string.degree));
        getTodayIcon().setImageResource(UtilsKt.iOiXi11II(this, r2));
        getTvWeatherName().setText(UtilsKt.i0X000X0O(this, r2));
        TextView r8 = getTvHumidityValue();
        BleWeather2 r9 = r0.getMWeather();
        Intrinsics.XXI(r9);
        r8.setText(String.valueOf(r9.getMHumidity()));
        TextView r10 = getTvVisibilityValue();
        BleWeather2 r11 = r0.getMWeather();
        Intrinsics.XXI(r11);
        r10.setText(String.valueOf(cp5.X1ii(r11.getMVisibility() * 1000, this.mAppUser.getUnit(), false, 4, null)));
        getTvVisibilityUnit().setText(getString(cp5.OiIIX101O(this.mAppUser.getUnit())));
        TextView r12 = getTvWindSpeedValue();
        BleWeather2 r13 = r0.getMWeather();
        Intrinsics.XXI(r13);
        r12.setText(String.valueOf(cp5.i11I(r13.getMWindSpeed(), this.mAppUser.getUnit())));
        return;
    L7:
        BleWeather2 r14 = r0.getMWeather();
        Intrinsics.XXI(r14);
        r5 = Integer.valueOf(r14.getMCurrentTemperature());
        goto L8
    }

    private static final ImageView todayIcon_delegate$lambda$0(Weather2NewActivity r1) {
        return (ImageView) r1.findViewById(R.id.today_icon);
    }

    private static final TextView tvHumidityValue_delegate$lambda$0(Weather2NewActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_humidity_value);
    }

    private static final TextView tvPrecipitationUnit_delegate$lambda$0(Weather2NewActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_precipitation_unit);
    }

    private static final TextView tvPrecipitationValue_delegate$lambda$0(Weather2NewActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_precipitation_value);
    }

    private static final TextView tvTemperatureValue_delegate$lambda$0(Weather2NewActivity r1) {
        return (TextView) r1.findViewById(R.id.nowWeather_temp);
    }

    private static final TextView tvUviValue_delegate$lambda$0(Weather2NewActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_uvi_value);
    }

    private static final TextView tvVisibilityUnit_delegate$lambda$0(Weather2NewActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_visibility_unit);
    }

    private static final TextView tvVisibilityValue_delegate$lambda$0(Weather2NewActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_visibility_value);
    }

    private static final TextView tvWeatherDate1_delegate$lambda$0(Weather2NewActivity r1) {
        return (TextView) r1.findViewById(R.id.weather1_date);
    }

    private static final TextView tvWeatherDate2_delegate$lambda$0(Weather2NewActivity r1) {
        return (TextView) r1.findViewById(R.id.weather2_date);
    }

    private static final TextView tvWeatherDate3_delegate$lambda$0(Weather2NewActivity r1) {
        return (TextView) r1.findViewById(R.id.weather3_date);
    }

    private static final TextView tvWeatherDate4_delegate$lambda$0(Weather2NewActivity r1) {
        return (TextView) r1.findViewById(R.id.weather4_date);
    }

    private static final TextView tvWeatherDate5_delegate$lambda$0(Weather2NewActivity r1) {
        return (TextView) r1.findViewById(R.id.weather5_date);
    }

    private static final TextView tvWeatherDate6_delegate$lambda$0(Weather2NewActivity r1) {
        return (TextView) r1.findViewById(R.id.weather6_date);
    }

    private static final TextView tvWeatherDate7_delegate$lambda$0(Weather2NewActivity r1) {
        return (TextView) r1.findViewById(R.id.weather7_date);
    }

    private static final TextView tvWeatherMaxValue1_delegate$lambda$0(Weather2NewActivity r1) {
        return (TextView) r1.findViewById(R.id.weather1_max_temp);
    }

    private static final TextView tvWeatherMaxValue2_delegate$lambda$0(Weather2NewActivity r1) {
        return (TextView) r1.findViewById(R.id.weather2_max_temp);
    }

    private static final TextView tvWeatherMaxValue3_delegate$lambda$0(Weather2NewActivity r1) {
        return (TextView) r1.findViewById(R.id.weather3_max_temp);
    }

    private static final TextView tvWeatherMaxValue4_delegate$lambda$0(Weather2NewActivity r1) {
        return (TextView) r1.findViewById(R.id.weather4_max_temp);
    }

    private static final TextView tvWeatherMaxValue5_delegate$lambda$0(Weather2NewActivity r1) {
        return (TextView) r1.findViewById(R.id.weather5_max_temp);
    }

    private static final TextView tvWeatherMaxValue6_delegate$lambda$0(Weather2NewActivity r1) {
        return (TextView) r1.findViewById(R.id.weather6_max_temp);
    }

    private static final TextView tvWeatherMaxValue7_delegate$lambda$0(Weather2NewActivity r1) {
        return (TextView) r1.findViewById(R.id.weather7_max_temp);
    }

    private static final TextView tvWeatherMinValue1_delegate$lambda$0(Weather2NewActivity r1) {
        return (TextView) r1.findViewById(R.id.weather1_min_temp);
    }

    private static final TextView tvWeatherMinValue2_delegate$lambda$0(Weather2NewActivity r1) {
        return (TextView) r1.findViewById(R.id.weather2_min_temp);
    }

    private static final TextView tvWeatherMinValue3_delegate$lambda$0(Weather2NewActivity r1) {
        return (TextView) r1.findViewById(R.id.weather3_min_temp);
    }

    private static final TextView tvWeatherMinValue4_delegate$lambda$0(Weather2NewActivity r1) {
        return (TextView) r1.findViewById(R.id.weather4_min_temp);
    }

    private static final TextView tvWeatherMinValue5_delegate$lambda$0(Weather2NewActivity r1) {
        return (TextView) r1.findViewById(R.id.weather5_min_temp);
    }

    private static final TextView tvWeatherMinValue6_delegate$lambda$0(Weather2NewActivity r1) {
        return (TextView) r1.findViewById(R.id.weather6_min_temp);
    }

    private static final TextView tvWeatherMinValue7_delegate$lambda$0(Weather2NewActivity r1) {
        return (TextView) r1.findViewById(R.id.weather7_min_temp);
    }

    private static final TextView tvWeatherName_delegate$lambda$0(Weather2NewActivity r1) {
        return (TextView) r1.findViewById(R.id.nowWeather_describe);
    }

    private static final TextView tvWeatherTemp_delegate$lambda$0(Weather2NewActivity r1) {
        return (TextView) r1.findViewById(R.id.nowWeather_describe_temp);
    }

    private static final TextView tvWindSpeedUnit_delegate$lambda$0(Weather2NewActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_wind_speed_unit);
    }

    private static final TextView tvWindSpeedValue_delegate$lambda$0(Weather2NewActivity r1) {
        return (TextView) r1.findViewById(R.id.tv_wind_speed_value);
    }

    private static final TextView tv_city_name_delegate$lambda$0(Weather2NewActivity r1) {
        return (TextView) r1.findViewById(R.id.nowWeather_city);
    }

    private final int weatherCentigradeToFahrenheit(int r2) {
        if (this.mUnit == true) goto L5;
        return r2;
    L5:
        return (int) cp5.I0iXXO(r2);
    }

    private final String weatherUnit() {
        if (this.mUnit == false) goto L6;
        String r0 = getString(R.string.fahrenheit);
        Intrinsics.XXI(r0);
        return r0;
    L6:
        String r1 = getString(R.string.degree_centigrade);
        Intrinsics.XXI(r1);
        return r1;
    }

    public final TextView getAbhTitleCenter() {
        return (TextView) getValue();
    }

    public final ImageView getAbhTitleLeft() {
        return (ImageView) getValue();
    }

    public final ImageView getAbhTitleRight() {
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

    public final boolean getMUnit() {
        return this.mUnit;
    }

    @aa1
    public final String getTemp(int r3) {
        boolean r1 = true;
        if (cp5.II1Xi0(this.mAppUser.getUnit()) == 1) goto L7;
        r1 = false;
    L7:
        return cp5.X01IiOiIi(this, r3, r1);
    }

    public final ImageView getTodayIcon() {
        return (ImageView) getValue();
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

    public final TextView getTvWeatherMaxValue1() {
        return (TextView) getValue();
    }

    public final TextView getTvWeatherMaxValue2() {
        return (TextView) getValue();
    }

    public final TextView getTvWeatherMaxValue3() {
        return (TextView) getValue();
    }

    public final TextView getTvWeatherMaxValue4() {
        return (TextView) getValue();
    }

    public final TextView getTvWeatherMaxValue5() {
        return (TextView) getValue();
    }

    public final TextView getTvWeatherMaxValue6() {
        return (TextView) getValue();
    }

    public final TextView getTvWeatherMaxValue7() {
        return (TextView) getValue();
    }

    public final TextView getTvWeatherMinValue1() {
        return (TextView) getValue();
    }

    public final TextView getTvWeatherMinValue2() {
        return (TextView) getValue();
    }

    public final TextView getTvWeatherMinValue3() {
        return (TextView) getValue();
    }

    public final TextView getTvWeatherMinValue4() {
        return (TextView) getValue();
    }

    public final TextView getTvWeatherMinValue5() {
        return (TextView) getValue();
    }

    public final TextView getTvWeatherMinValue6() {
        return (TextView) getValue();
    }

    public final TextView getTvWeatherMinValue7() {
        return (TextView) getValue();
    }

    public final TextView getTvWeatherName() {
        return (TextView) getValue();
    }

    public final TextView getTvWeatherTemp() {
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
        getAbhTitleRight().setVisibility(0);
        boolean r0 = OiOX0i.XIi00iiXO(BaseBleCache.getInt$default(BleCache.INSTANCE, BleKey.TEMPERATURE_UNIT, 0, null, 6, null));
        this.mUnit = r0;
        if (r0 == false) goto L6;
        ImageView r1 = getAbhTitleRight();
        int r2 = R.mipmap.abh_weather_right_icon_f;
    L5:
        r1.setImageResource(r2);
        setCityData();
        setRealData();
        setDayData();
        return;
    L6:
        r1 = getAbhTitleRight();
        r2 = R.mipmap.abh_weather_right_icon_c;
        goto L5
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_weather2_new;
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        finish();
    }

    public final void onTitleRightClick(@aa1 View r4) {
        Intrinsics.X0O(r4, "view");
        this.mUnit = !this.mUnit;
        X0IOiX1O.XIi00iiXO(false, new es6(this), 1, null);
    }

    public final void setMUnit(boolean r1) {
        this.mUnit = r1;
    }
}
