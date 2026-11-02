package com.sma.smartv3.initializer;

import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.OIi1iX;
import com.android.mltcode.paycertificationapi.XI1XXXX;
import com.android.mltcode.paycertificationapi.hv6;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.iv6;
import com.android.mltcode.paycertificationapi.jv6;
import com.android.mltcode.paycertificationapi.kv6;
import com.android.mltcode.paycertificationapi.lv6;
import com.android.mltcode.paycertificationapi.mv6;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tv6;
import com.blankj.utilcode.util.LogUtils;
import com.sma.smartv3.model.WeatherForecast;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.BleKeyFlag;
import com.szabh.smable3.component.BaseBleCache;
import com.szabh.smable3.component.BaseBleConnector;
import com.szabh.smable3.component.BleCache;
import com.szabh.smable3.component.BleConnector;
import com.szabh.smable3.entity.BleWeather;
import com.szabh.smable3.entity.BleWeather2;
import com.szabh.smable3.entity.BleWeatherForecast;
import com.szabh.smable3.entity.BleWeatherForecast2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nWeatherInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WeatherInitializer.kt\ncom/sma/smartv3/initializer/WeatherInitializer$requestWeatherForecast$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,551:1\n11561#2:552\n11896#2,2:553\n11898#2:556\n11561#2:557\n11896#2,3:558\n1#3:555\n*S KotlinDebug\n*F\n+ 1 WeatherInitializer.kt\ncom/sma/smartv3/initializer/WeatherInitializer$requestWeatherForecast$1\n*L\n395#1:552\n395#1:553,2\n395#1:556\n447#1:557\n447#1:558,3\n*E\n"})
public final class WeatherInitializer$requestWeatherForecast$1 implements O1XIiIO<WeatherForecast[]> {
    public WeatherInitializer$requestWeatherForecast$1() {
    }

    public static final Unit I0iXXO(tv6 r2) {
        Intrinsics.X0O(r2, "it");
        r2.OIX0iXi(WeatherInitializer.O00(WeatherInitializer.IO) + XI1XXXX.iIiiO);
        return Unit.OXO1;
    }

    public static final Unit IO(tv6 r2) {
        Intrinsics.X0O(r2, "it");
        r2.OIX0iXi(WeatherInitializer.O00(WeatherInitializer.IO) + XI1XXXX.iIiiO);
        return Unit.OXO1;
    }

    public static /* synthetic */ Unit IiI10X(tv6 r0) {
        return I0iXXO(r0);
    }

    public static /* synthetic */ Unit O00(String r0, tv6 r1) {
        return XOO0ii0(r0, r1);
    }

    public static final Unit OIX0iXi(tv6 r2) {
        Intrinsics.X0O(r2, "it");
        r2.OIX0iXi(WeatherInitializer.O00(WeatherInitializer.IO) + "OK , but device not support forecast");
        return Unit.OXO1;
    }

    public static final Unit OIi0(WeatherForecast[] r2, tv6 r3) {
        Intrinsics.X0O(r3, "it");
        String r0 = WeatherInitializer.O00(WeatherInitializer.IO);
        String r4 = Arrays.toString(r2);
        Intrinsics.O10IXXX0X(r4, "toString(...)");
        r3.OIX0iXi(r0 + r4);
        return Unit.OXO1;
    }

    public static /* synthetic */ Unit OXO1(tv6 r0) {
        return XXI(r0);
    }

    public static /* synthetic */ Unit XIi00iiXO(tv6 r0) {
        return OIX0iXi(r0);
    }

    public static /* synthetic */ Unit XO0O10(tv6 r0) {
        return IO(r0);
    }

    public static final Unit XOO0ii0(String r2, tv6 r3) {
        Intrinsics.X0O(r3, "it");
        r3.OIX0iXi(WeatherInitializer.O00(WeatherInitializer.IO) + r2);
        return Unit.OXO1;
    }

    public static final Unit XXI(tv6 r2) {
        Intrinsics.X0O(r2, "it");
        r2.OIX0iXi(WeatherInitializer.O00(WeatherInitializer.IO) + "OK , but device not support forecast");
        return Unit.OXO1;
    }

    public static /* synthetic */ Unit iO(WeatherForecast[] r0, tv6 r1) {
        return OIi0(r0, r1);
    }

    public void I0IIOi(final WeatherForecast[] r41) {
        String r1 = Arrays.toString(r41);
        Intrinsics.O10IXXX0X(r1, "toString(...)");
        LogUtils.d(new Object[]{"Weather requestWeatherForecast getWeatherForecast -> " + r1});
        WeatherInitializer.I0IIOi(WeatherInitializer.IO, new iv6(r41));
        if (q62.OXO1.i0IX1() == false) goto L19;
        if (r41 == null) goto L35;
        ArrayList r2 = new ArrayList(r41.length);
        int r9 = r41.length;
        int r10 = 0;
    L6:
        if (r10 >= r9) goto L8;
        WeatherForecast r11 = r41[r10];
        Calendar r12 = Calendar.getInstance();
        long r3 = 1000;
        r12.setTimeInMillis(r11.getSys_sunrise() * r3);
        Calendar r13 = Calendar.getInstance();
        r13.setTimeInMillis(r11.getSys_sunset() * r3);
        int r4 = (int) r11.getTemp_max();
        int r5 = (int) r11.getTemp_min();
        int r14 = (int) r11.getTemp_day();
        int r22 = WeatherInitializer.XOO0ii0(WeatherInitializer.IO, r11.getWeather_id());
        int r6 = (int) (((double) r11.getWind_speed()) * 3.6d);
        int r24 = r11.getHumidity();
        int r26 = r11.getUvi();
        int r7 = (int) r11.getRain();
        Intrinsics.XXI(r12);
        int r28 = OIi1iX.XOO0ii0(r12);
        int r29 = OIi1iX.OIi0(r12);
        int r30 = OIi1iX.XXI(r12);
        Intrinsics.XXI(r13);
        r2.add(new BleWeather2(r14, r4, r5, r22, r6, r24, 0, r26, r7, r28, r29, r30, OIi1iX.XOO0ii0(r13), OIi1iX.OIi0(r13), OIi1iX.XXI(r13), 0, 0, 98304, null));
        r10 = r10 + 1;
        goto L6
    L8:
        BleWeatherForecast2 r18 = new BleWeatherForecast2((int) (new Date().getTime() / 1000), null, (BleWeather2) CollectionsKt___CollectionsKt.OI1O(r2, 0), (BleWeather2) CollectionsKt___CollectionsKt.OI1O(r2, 1), (BleWeather2) CollectionsKt___CollectionsKt.OI1O(r2, 2), (BleWeather2) CollectionsKt___CollectionsKt.OI1O(r2, 3), (BleWeather2) CollectionsKt___CollectionsKt.OI1O(r2, 4), (BleWeather2) CollectionsKt___CollectionsKt.OI1O(r2, 5), (BleWeather2) CollectionsKt___CollectionsKt.OI1O(r2, 6), 2, null);
        q62 r0 = q62.OXO1;
        if (r0.I011X() == true) goto L11;
    L16:
        WeatherInitializer.I0IIOi(WeatherInitializer.IO, new kv6());
        BaseBleCache.putObject$default(BleCache.INSTANCE, BleKey.WEATHER_FORECAST2, r18, null, 4, null);
        return;
    L11:
        if (r0.I0OX() == true) goto L16;
        if (BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.WEATHER_FORECAST2, BleKeyFlag.UPDATE, r18, false, false, 24, null) == false) goto L36;
        WeatherInitializer.I0IIOi(WeatherInitializer.IO, new jv6());
        return;
    L36:
        return;
    L35:
        return;
    L19:
        if (r41 == null) goto L37;
        ArrayList r8 = new ArrayList(r41.length);
        int r15 = r41.length;
        int r16 = 0;
    L21:
        if (r16 >= r15) goto L23;
        WeatherForecast r17 = r41[r16];
        r8.add(new BleWeather(0, (int) r17.getTemp_max(), (int) r17.getTemp_min(), WeatherInitializer.XOO0ii0(WeatherInitializer.IO, r17.getWeather_id()), (int) (((double) r17.getWind_speed()) * 3.6d), r17.getHumidity(), 0, r17.getUvi(), (int) r17.getRain(), 1, null));
        r16 = r16 + 1;
        goto L21
    L23:
        BleWeatherForecast r19 = new BleWeatherForecast((int) (new Date().getTime() / 1000), (BleWeather) CollectionsKt___CollectionsKt.OI1O(r8, 0), (BleWeather) CollectionsKt___CollectionsKt.OI1O(r8, 1), (BleWeather) CollectionsKt___CollectionsKt.OI1O(r8, 2));
        q62 r20 = q62.OXO1;
        if (r20.I011X() == true) goto L26;
    L31:
        WeatherInitializer.I0IIOi(WeatherInitializer.IO, new mv6());
        BaseBleCache.putObject$default(BleCache.INSTANCE, BleKey.WEATHER_FORECAST, r19, null, 4, null);
        return;
    L26:
        if (r20.I0OX() == true) goto L31;
        if (BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.WEATHER_FORECAST, BleKeyFlag.UPDATE, r19, false, false, 24, null) == false) goto L38;
        WeatherInitializer.I0IIOi(WeatherInitializer.IO, new lv6());
        return;
    L38:
        return;
    }

    @Override // com.android.mltcode.paycertificationapi.O1XIiIO
    public void handleError(final String r4) {
        Intrinsics.X0O(r4, "error");
        i1O0OXO1O.OXO1.IiI10X("Weather requestWeatherForecast error -> " + r4);
        WeatherInitializer.I0IIOi(WeatherInitializer.IO, new hv6(r4));
    }

    @Override // com.android.mltcode.paycertificationapi.O1XIiIO
    public /* bridge */ /* synthetic */ void handleResponse(WeatherForecast[] r1) {
        I0IIOi(r1);
    }
}
