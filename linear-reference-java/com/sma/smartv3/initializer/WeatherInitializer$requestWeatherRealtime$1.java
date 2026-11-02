package com.sma.smartv3.initializer;

import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.OIi1iX;
import com.android.mltcode.paycertificationapi.XI1XXXX;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.nv6;
import com.android.mltcode.paycertificationapi.ov6;
import com.android.mltcode.paycertificationapi.pv6;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.qv6;
import com.android.mltcode.paycertificationapi.rv6;
import com.android.mltcode.paycertificationapi.sv6;
import com.android.mltcode.paycertificationapi.tv6;
import com.google.gson.Gson;
import com.sma.smartv3.model.WeatherRealtime;
import com.sma.smartv3.util.UtilsKt;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.BleKeyFlag;
import com.szabh.smable3.component.BaseBleCache;
import com.szabh.smable3.component.BaseBleConnector;
import com.szabh.smable3.component.BleCache;
import com.szabh.smable3.component.BleConnector;
import com.szabh.smable3.entity.BleAirPressureCalibration;
import com.szabh.smable3.entity.BleWeather;
import com.szabh.smable3.entity.BleWeather2;
import com.szabh.smable3.entity.BleWeatherRealtime;
import com.szabh.smable3.entity.BleWeatherRealtime2;
import java.util.Calendar;
import java.util.Date;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nWeatherInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WeatherInitializer.kt\ncom/sma/smartv3/initializer/WeatherInitializer$requestWeatherRealtime$1\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,551:1\n85#2,3:552\n1#3:555\n*S KotlinDebug\n*F\n+ 1 WeatherInitializer.kt\ncom/sma/smartv3/initializer/WeatherInitializer$requestWeatherRealtime$1\n*L\n267#1:552,3\n*E\n"})
public final class WeatherInitializer$requestWeatherRealtime$1 implements O1XIiIO<WeatherRealtime> {
    public final /* synthetic */ double OXO1;

    public WeatherInitializer$requestWeatherRealtime$1(double r1) {
        this.OXO1 = r1;
    }

    private static final Unit I0iXXO(tv6 r2) {
        Intrinsics.X0O(r2, "it");
        r2.XXI(WeatherInitializer.O00(WeatherInitializer.IO) + XI1XXXX.iIiiO);
        return Unit.OXO1;
    }

    public static final Unit IO(tv6 r2) {
        Intrinsics.X0O(r2, "it");
        r2.XXI(WeatherInitializer.O00(WeatherInitializer.IO) + XI1XXXX.iIiiO);
        return Unit.OXO1;
    }

    public static /* synthetic */ Unit IiI10X(tv6 r0) {
        return IO(r0);
    }

    public static /* synthetic */ Unit O00(String r0, tv6 r1) {
        return XOO0ii0(r0, r1);
    }

    public static final Unit OIX0iXi(tv6 r2) {
        Intrinsics.X0O(r2, "it");
        r2.XXI(WeatherInitializer.O00(WeatherInitializer.IO) + "OK , but device not support realtime");
        return Unit.OXO1;
    }

    public static final Unit OIi0(WeatherRealtime r2, tv6 r3) {
        Intrinsics.X0O(r3, "it");
        r3.XXI(WeatherInitializer.O00(WeatherInitializer.IO) + r2);
        return Unit.OXO1;
    }

    public static /* synthetic */ Unit OXO1(WeatherRealtime r0, tv6 r1) {
        return OIi0(r0, r1);
    }

    public static /* synthetic */ Unit XIi00iiXO(tv6 r0) {
        return OIX0iXi(r0);
    }

    public static /* synthetic */ Unit XO0O10(tv6 r0) {
        return I0iXXO(r0);
    }

    public static final Unit XOO0ii0(String r2, tv6 r3) {
        Intrinsics.X0O(r3, "it");
        r3.XXI(WeatherInitializer.O00(WeatherInitializer.IO) + r2);
        return Unit.OXO1;
    }

    private static final Unit XXI(tv6 r2) {
        Intrinsics.X0O(r2, "it");
        r2.XXI(WeatherInitializer.O00(WeatherInitializer.IO) + "OK , but device not support realtime");
        return Unit.OXO1;
    }

    public static /* synthetic */ Unit iO(tv6 r0) {
        return XXI(r0);
    }

    public void I0IIOi(final WeatherRealtime r45) {
        i1O0OXO1O r2 = i1O0OXO1O.OXO1;
        r2.OXO1("Weather requestWeatherRealtime getWeather -> " + r45);
        a01 r3 = a01.OXO1;
        r3.OXO1().put(b01.X111IO + '_' + WeatherRealtime.class.getName(), new Gson().toJson(r45), false);
        WeatherInitializer r4 = WeatherInitializer.IO;
        WeatherInitializer.I0IIOi(r4, new ov6(r45));
        Date r5 = new Date();
        q62 r6 = q62.OXO1;
        if (r6.i0IX1() == false) goto L14;
        if (r45 == null) goto L13;
        double r13 = this.OXO1;
        Calendar r7 = Calendar.getInstance();
        long r8 = 1000;
        r7.setTimeInMillis(r45.getSys_sunrise() * r8);
        Calendar r11 = Calendar.getInstance();
        r11.setTimeInMillis(r8 * r45.getSys_sunset());
        q62 r9 = r6;
        int r10 = (int) (r5.getTime() / 1000);
        String r12 = r45.getName();
        int r14 = (int) r45.getTemp_max();
        int r15 = (int) r45.getTemp_min();
        int r1 = (int) r45.getTemp();
        int r28 = WeatherInitializer.XOO0ii0(r4, r45.getWeather_id());
        int r16 = (int) (((double) r45.getWind_speed()) * 3.6d);
        int r30 = r45.getHumidity();
        int r17 = r45.getVisibility() / 1000;
        int r18 = (int) r45.getRain_1h();
        Intrinsics.XXI(r7);
        int r34 = OIi1iX.XOO0ii0(r7);
        int r35 = OIi1iX.OIi0(r7);
        int r36 = OIi1iX.XXI(r7);
        Intrinsics.XXI(r11);
        BleWeatherRealtime2 r19 = new BleWeatherRealtime2(r10, r12, new BleWeather2(r1, r14, r15, r28, r16, r30, r17, 0, r18, r34, r35, r36, OIi1iX.XOO0ii0(r11), OIi1iX.OIi0(r11), OIi1iX.XXI(r11), (int) r13, 0, 65664, null));
        if (r9.iiX0i1IX() == true) goto L8;
    L12:
        WeatherInitializer.I0IIOi(r4, new qv6());
        BaseBleCache.putObject$default(BleCache.INSTANCE, BleKey.WEATHER_REALTIME2, r19, null, 4, null);
    L25:
        if (r9.I11iXOO() == false) goto L35;
        if (r45 == null) goto L35;
        double r20 = this.OXO1;
        if (r20 != 0.0d) goto L31;
    L32:
        r2.IiI10X("Weather calculateAltitude -> " + r45.getPressure());
        int r21 = (int) UtilsKt.OIi0((double) r45.getPressure());
    L34:
        BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.AIR_PRESSURE_CALIBRATION, BleKeyFlag.UPDATE, new BleAirPressureCalibration(r45.getPressure() * 100, r21), false, false, 24, null);
        goto L35
    L31:
        if (r20 == Double.MIN_VALUE) goto L32;
        r21 = (int) r20;
    L35:
        r4.XiOIO(true);
        return;
    L8:
        if (r9.I0OX() == true) goto L12;
        if (BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.WEATHER_REALTIME2, BleKeyFlag.UPDATE, r19, false, false, 24, null) == false) goto L25;
        r3.iO().put(b01.iIXi1iiXI, System.currentTimeMillis());
        WeatherInitializer.I0IIOi(r4, new pv6());
        I01XX0.XIi00iiXO(I01XX0.IO, null, 2, null);
        goto L25
    L13:
        r9 = r6;
        goto L25
    L14:
        r9 = r6;
        if (r45 == null) goto L25;
        BleWeatherRealtime r22 = new BleWeatherRealtime((int) (r5.getTime() / 1000), new BleWeather((int) r45.getTemp(), 0, 0, WeatherInitializer.XOO0ii0(r4, r45.getWeather_id()), (int) (((double) r45.getWind_speed()) * 3.6d), r45.getHumidity(), r45.getVisibility() / 1000, 0, (int) r45.getRain_1h(), 134, null));
        if (r9.iiX0i1IX() == true) goto L19;
    L23:
        WeatherInitializer.I0IIOi(r4, new sv6());
        BaseBleCache.putObject$default(BleCache.INSTANCE, BleKey.WEATHER_REALTIME, r22, null, 4, null);
        goto L25
    L19:
        if (r9.I0OX() == true) goto L23;
        if (BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.WEATHER_REALTIME, BleKeyFlag.UPDATE, r22, false, false, 24, null) == false) goto L25;
        r3.iO().put(b01.iIXi1iiXI, System.currentTimeMillis());
        WeatherInitializer.I0IIOi(r4, new rv6());
        I01XX0.XIi00iiXO(I01XX0.IO, null, 2, null);
        goto L25
    }

    @Override // com.android.mltcode.paycertificationapi.O1XIiIO
    public void handleError(final String r4) {
        Intrinsics.X0O(r4, "error");
        i1O0OXO1O.OXO1.IiI10X("Weather requestWeatherRealtime error -> " + r4);
        WeatherInitializer r0 = WeatherInitializer.IO;
        WeatherInitializer.I0IIOi(r0, new nv6(r4));
        r0.XiOIO(true);
    }

    @Override // com.android.mltcode.paycertificationapi.O1XIiIO
    public /* bridge */ /* synthetic */ void handleResponse(WeatherRealtime r1) {
        I0IIOi(r1);
    }
}
