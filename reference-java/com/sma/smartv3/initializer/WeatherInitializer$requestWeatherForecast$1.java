package com.sma.smartv3.initializer;

import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.OIi1iX;
import com.android.mltcode.paycertificationapi.XI1XXXX;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tv6;
import com.blankj.utilcode.util.LogUtils;
import com.sma.smartv3.initializer.WeatherInitializer$requestWeatherForecast$1;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nWeatherInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WeatherInitializer.kt\ncom/sma/smartv3/initializer/WeatherInitializer$requestWeatherForecast$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,551:1\n11561#2:552\n11896#2,2:553\n11898#2:556\n11561#2:557\n11896#2,3:558\n1#3:555\n*S KotlinDebug\n*F\n+ 1 WeatherInitializer.kt\ncom/sma/smartv3/initializer/WeatherInitializer$requestWeatherForecast$1\n*L\n395#1:552\n395#1:553,2\n395#1:556\n447#1:557\n447#1:558,3\n*E\n"})
public final class WeatherInitializer$requestWeatherForecast$1 implements O1XIiIO<WeatherForecast[]> {
    public static final Unit I0iXXO(tv6 it) {
        Intrinsics.X0O(it, "it");
        it.OIX0iXi(WeatherInitializer.f51281IO.I0iXXO() + XI1XXXX.iIiiO);
        return Unit.OXO1;
    }

    /* JADX INFO: renamed from: IO */
    public static final Unit m38240IO(tv6 it) {
        Intrinsics.X0O(it, "it");
        it.OIX0iXi(WeatherInitializer.f51281IO.I0iXXO() + XI1XXXX.iIiiO);
        return Unit.OXO1;
    }

    public static final Unit OIX0iXi(tv6 it) {
        Intrinsics.X0O(it, "it");
        it.OIX0iXi(WeatherInitializer.f51281IO.I0iXXO() + "OK , but device not support forecast");
        return Unit.OXO1;
    }

    public static final Unit OIi0(WeatherForecast[] weatherForecastArr, tv6 it) {
        Intrinsics.X0O(it, "it");
        String strI0iXXO = WeatherInitializer.f51281IO.I0iXXO();
        String string = Arrays.toString(weatherForecastArr);
        Intrinsics.O10IXXX0X(string, "toString(...)");
        it.OIX0iXi(strI0iXXO + string);
        return Unit.OXO1;
    }

    public static final Unit XOO0ii0(String str, tv6 it) {
        Intrinsics.X0O(it, "it");
        it.OIX0iXi(WeatherInitializer.f51281IO.I0iXXO() + str);
        return Unit.OXO1;
    }

    public static final Unit XXI(tv6 it) {
        Intrinsics.X0O(it, "it");
        it.OIX0iXi(WeatherInitializer.f51281IO.I0iXXO() + "OK , but device not support forecast");
        return Unit.OXO1;
    }

    @Override // com.android.mltcode.paycertificationapi.O1XIiIO
    /* JADX INFO: renamed from: I0IIOi, reason: merged with bridge method [inline-methods] */
    public void handleResponse(final WeatherForecast[] weatherForecastArr) throws IllegalAccessException, InstantiationException {
        String string = Arrays.toString(weatherForecastArr);
        Intrinsics.O10IXXX0X(string, "toString(...)");
        LogUtils.m11128d("Weather requestWeatherForecast getWeatherForecast -> " + string);
        WeatherInitializer.f51281IO.m38237OX(new Function1() { // from class: com.android.mltcode.paycertificationapi.iv6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return WeatherInitializer$requestWeatherForecast$1.OIi0(weatherForecastArr, (tv6) obj);
            }
        });
        if (!q62.OXO1.i0IX1()) {
            if (weatherForecastArr != null) {
                ArrayList arrayList = new ArrayList(weatherForecastArr.length);
                for (WeatherForecast weatherForecast : weatherForecastArr) {
                    arrayList.add(new BleWeather(0, (int) weatherForecast.getTemp_max(), (int) weatherForecast.getTemp_min(), WeatherInitializer.f51281IO.OII(weatherForecast.getWeather_id()), (int) (((double) weatherForecast.getWind_speed()) * 3.6d), weatherForecast.getHumidity(), 0, weatherForecast.getUvi(), (int) weatherForecast.getRain(), 1, null));
                }
                BleWeatherForecast bleWeatherForecast = new BleWeatherForecast((int) (new Date().getTime() / 1000), (BleWeather) CollectionsKt___CollectionsKt.OI1O(arrayList, 0), (BleWeather) CollectionsKt___CollectionsKt.OI1O(arrayList, 1), (BleWeather) CollectionsKt___CollectionsKt.OI1O(arrayList, 2));
                q62 q62Var = q62.OXO1;
                if (!q62Var.I011X() || q62Var.I0OX()) {
                    WeatherInitializer.f51281IO.m38237OX(new Function1() { // from class: com.android.mltcode.paycertificationapi.mv6
                        @Override // kotlin.jvm.functions.Function1
                        /* JADX INFO: renamed from: invoke */
                        public final Object invoke2(Object obj) {
                            return WeatherInitializer$requestWeatherForecast$1.XXI((tv6) obj);
                        }
                    });
                    BaseBleCache.putObject$default(BleCache.INSTANCE, BleKey.WEATHER_FORECAST, bleWeatherForecast, null, 4, null);
                    return;
                } else {
                    if (BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.WEATHER_FORECAST, BleKeyFlag.UPDATE, bleWeatherForecast, false, false, 24, null)) {
                        WeatherInitializer.f51281IO.m38237OX(new Function1() { // from class: com.android.mltcode.paycertificationapi.lv6
                            @Override // kotlin.jvm.functions.Function1
                            /* JADX INFO: renamed from: invoke */
                            public final Object invoke2(Object obj) {
                                return WeatherInitializer$requestWeatherForecast$1.I0iXXO((tv6) obj);
                            }
                        });
                        return;
                    }
                    return;
                }
            }
            return;
        }
        if (weatherForecastArr != null) {
            ArrayList arrayList2 = new ArrayList(weatherForecastArr.length);
            for (WeatherForecast weatherForecast2 : weatherForecastArr) {
                Calendar calendar = Calendar.getInstance();
                long j = 1000;
                calendar.setTimeInMillis(weatherForecast2.getSys_sunrise() * j);
                Calendar calendar2 = Calendar.getInstance();
                calendar2.setTimeInMillis(weatherForecast2.getSys_sunset() * j);
                int temp_max = (int) weatherForecast2.getTemp_max();
                int temp_min = (int) weatherForecast2.getTemp_min();
                int temp_day = (int) weatherForecast2.getTemp_day();
                int iOII = WeatherInitializer.f51281IO.OII(weatherForecast2.getWeather_id());
                int wind_speed = (int) (((double) weatherForecast2.getWind_speed()) * 3.6d);
                int humidity = weatherForecast2.getHumidity();
                int uvi = weatherForecast2.getUvi();
                int rain = (int) weatherForecast2.getRain();
                Intrinsics.XXI(calendar);
                int iXOO0ii0 = OIi1iX.XOO0ii0(calendar);
                int iOIi0 = OIi1iX.OIi0(calendar);
                int iXXI = OIi1iX.XXI(calendar);
                Intrinsics.XXI(calendar2);
                arrayList2.add(new BleWeather2(temp_day, temp_max, temp_min, iOII, wind_speed, humidity, 0, uvi, rain, iXOO0ii0, iOIi0, iXXI, OIi1iX.XOO0ii0(calendar2), OIi1iX.OIi0(calendar2), OIi1iX.XXI(calendar2), 0, 0, 98304, null));
            }
            BleWeatherForecast2 bleWeatherForecast2 = new BleWeatherForecast2((int) (new Date().getTime() / 1000), null, (BleWeather2) CollectionsKt___CollectionsKt.OI1O(arrayList2, 0), (BleWeather2) CollectionsKt___CollectionsKt.OI1O(arrayList2, 1), (BleWeather2) CollectionsKt___CollectionsKt.OI1O(arrayList2, 2), (BleWeather2) CollectionsKt___CollectionsKt.OI1O(arrayList2, 3), (BleWeather2) CollectionsKt___CollectionsKt.OI1O(arrayList2, 4), (BleWeather2) CollectionsKt___CollectionsKt.OI1O(arrayList2, 5), (BleWeather2) CollectionsKt___CollectionsKt.OI1O(arrayList2, 6), 2, null);
            q62 q62Var2 = q62.OXO1;
            if (!q62Var2.I011X() || q62Var2.I0OX()) {
                WeatherInitializer.f51281IO.m38237OX(new Function1() { // from class: com.android.mltcode.paycertificationapi.kv6
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return WeatherInitializer$requestWeatherForecast$1.OIX0iXi((tv6) obj);
                    }
                });
                BaseBleCache.putObject$default(BleCache.INSTANCE, BleKey.WEATHER_FORECAST2, bleWeatherForecast2, null, 4, null);
            } else if (BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.WEATHER_FORECAST2, BleKeyFlag.UPDATE, bleWeatherForecast2, false, false, 24, null)) {
                WeatherInitializer.f51281IO.m38237OX(new Function1() { // from class: com.android.mltcode.paycertificationapi.jv6
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return WeatherInitializer$requestWeatherForecast$1.m38240IO((tv6) obj);
                    }
                });
            }
        }
    }

    @Override // com.android.mltcode.paycertificationapi.O1XIiIO
    public void handleError(final String error) throws IllegalAccessException, InstantiationException {
        Intrinsics.X0O(error, "error");
        i1O0OXO1O.OXO1.IiI10X("Weather requestWeatherForecast error -> " + error);
        WeatherInitializer.f51281IO.m38237OX(new Function1() { // from class: com.android.mltcode.paycertificationapi.hv6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return WeatherInitializer$requestWeatherForecast$1.XOO0ii0(error, (tv6) obj);
            }
        });
    }
}
