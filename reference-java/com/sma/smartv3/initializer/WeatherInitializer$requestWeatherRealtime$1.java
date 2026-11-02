package com.sma.smartv3.initializer;

import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.OIi1iX;
import com.android.mltcode.paycertificationapi.XI1XXXX;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tv6;
import com.google.gson.Gson;
import com.sma.smartv3.initializer.WeatherInitializer$requestWeatherRealtime$1;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nWeatherInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WeatherInitializer.kt\ncom/sma/smartv3/initializer/WeatherInitializer$requestWeatherRealtime$1\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,551:1\n85#2,3:552\n1#3:555\n*S KotlinDebug\n*F\n+ 1 WeatherInitializer.kt\ncom/sma/smartv3/initializer/WeatherInitializer$requestWeatherRealtime$1\n*L\n267#1:552,3\n*E\n"})
public final class WeatherInitializer$requestWeatherRealtime$1 implements O1XIiIO<WeatherRealtime> {
    public final /* synthetic */ double OXO1;

    public WeatherInitializer$requestWeatherRealtime$1(double d) {
        this.OXO1 = d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit I0iXXO(tv6 it) {
        Intrinsics.X0O(it, "it");
        it.XXI(WeatherInitializer.f51281IO.I0iXXO() + XI1XXXX.iIiiO);
        return Unit.OXO1;
    }

    /* JADX INFO: renamed from: IO */
    public static final Unit m38242IO(tv6 it) {
        Intrinsics.X0O(it, "it");
        it.XXI(WeatherInitializer.f51281IO.I0iXXO() + XI1XXXX.iIiiO);
        return Unit.OXO1;
    }

    public static final Unit OIX0iXi(tv6 it) {
        Intrinsics.X0O(it, "it");
        it.XXI(WeatherInitializer.f51281IO.I0iXXO() + "OK , but device not support realtime");
        return Unit.OXO1;
    }

    public static final Unit OIi0(WeatherRealtime weatherRealtime, tv6 it) {
        Intrinsics.X0O(it, "it");
        it.XXI(WeatherInitializer.f51281IO.I0iXXO() + weatherRealtime);
        return Unit.OXO1;
    }

    public static final Unit XOO0ii0(String str, tv6 it) {
        Intrinsics.X0O(it, "it");
        it.XXI(WeatherInitializer.f51281IO.I0iXXO() + str);
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit XXI(tv6 it) {
        Intrinsics.X0O(it, "it");
        it.XXI(WeatherInitializer.f51281IO.I0iXXO() + "OK , but device not support realtime");
        return Unit.OXO1;
    }

    @Override // com.android.mltcode.paycertificationapi.O1XIiIO
    /* JADX INFO: renamed from: I0IIOi, reason: merged with bridge method [inline-methods] */
    public void handleResponse(final WeatherRealtime weatherRealtime) throws IllegalAccessException, InstantiationException {
        q62 q62Var;
        int iOIi0;
        i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
        i1o0oxo1o.OXO1("Weather requestWeatherRealtime getWeather -> " + weatherRealtime);
        a01 a01Var = a01.OXO1;
        a01Var.OXO1().put(b01.X111IO + '_' + WeatherRealtime.class.getName(), new Gson().toJson(weatherRealtime), false);
        WeatherInitializer weatherInitializer = WeatherInitializer.f51281IO;
        weatherInitializer.m38237OX(new Function1() { // from class: com.android.mltcode.paycertificationapi.ov6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return WeatherInitializer$requestWeatherRealtime$1.OIi0(weatherRealtime, (tv6) obj);
            }
        });
        Date date = new Date();
        q62 q62Var2 = q62.OXO1;
        if (!q62Var2.i0IX1()) {
            q62Var = q62Var2;
            if (weatherRealtime != null) {
                BleWeatherRealtime bleWeatherRealtime = new BleWeatherRealtime((int) (date.getTime() / 1000), new BleWeather((int) weatherRealtime.getTemp(), 0, 0, weatherInitializer.OII(weatherRealtime.getWeather_id()), (int) (((double) weatherRealtime.getWind_speed()) * 3.6d), weatherRealtime.getHumidity(), weatherRealtime.getVisibility() / 1000, 0, (int) weatherRealtime.getRain_1h(), 134, null));
                if (!q62Var.iiX0i1IX() || q62Var.I0OX()) {
                    weatherInitializer.m38237OX(new Function1() { // from class: com.android.mltcode.paycertificationapi.sv6
                        @Override // kotlin.jvm.functions.Function1
                        /* JADX INFO: renamed from: invoke */
                        public final Object invoke2(Object obj) {
                            return WeatherInitializer$requestWeatherRealtime$1.XXI((tv6) obj);
                        }
                    });
                    BaseBleCache.putObject$default(BleCache.INSTANCE, BleKey.WEATHER_REALTIME, bleWeatherRealtime, null, 4, null);
                } else if (BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.WEATHER_REALTIME, BleKeyFlag.UPDATE, bleWeatherRealtime, false, false, 24, null)) {
                    a01Var.m1440iO().put(b01.iIXi1iiXI, System.currentTimeMillis());
                    weatherInitializer.m38237OX(new Function1() { // from class: com.android.mltcode.paycertificationapi.rv6
                        @Override // kotlin.jvm.functions.Function1
                        /* JADX INFO: renamed from: invoke */
                        public final Object invoke2(Object obj) {
                            return WeatherInitializer$requestWeatherRealtime$1.I0iXXO((tv6) obj);
                        }
                    });
                    I01XX0.XIi00iiXO(I01XX0.f1084IO, null, 2, null);
                }
            }
        } else if (weatherRealtime != null) {
            double d = this.OXO1;
            Calendar calendar = Calendar.getInstance();
            long j = 1000;
            calendar.setTimeInMillis(weatherRealtime.getSys_sunrise() * j);
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTimeInMillis(j * weatherRealtime.getSys_sunset());
            q62Var = q62Var2;
            int time = (int) (date.getTime() / 1000);
            String name = weatherRealtime.getName();
            int temp_max = (int) weatherRealtime.getTemp_max();
            int temp_min = (int) weatherRealtime.getTemp_min();
            int temp = (int) weatherRealtime.getTemp();
            int iOII = weatherInitializer.OII(weatherRealtime.getWeather_id());
            int wind_speed = (int) (((double) weatherRealtime.getWind_speed()) * 3.6d);
            int humidity = weatherRealtime.getHumidity();
            int visibility = weatherRealtime.getVisibility() / 1000;
            int rain_1h = (int) weatherRealtime.getRain_1h();
            Intrinsics.XXI(calendar);
            int iXOO0ii0 = OIi1iX.XOO0ii0(calendar);
            int iOIi1 = OIi1iX.OIi0(calendar);
            int iXXI = OIi1iX.XXI(calendar);
            Intrinsics.XXI(calendar2);
            BleWeatherRealtime2 bleWeatherRealtime2 = new BleWeatherRealtime2(time, name, new BleWeather2(temp, temp_max, temp_min, iOII, wind_speed, humidity, visibility, 0, rain_1h, iXOO0ii0, iOIi1, iXXI, OIi1iX.XOO0ii0(calendar2), OIi1iX.OIi0(calendar2), OIi1iX.XXI(calendar2), (int) d, 0, 65664, null));
            if (!q62Var.iiX0i1IX() || q62Var.I0OX()) {
                weatherInitializer.m38237OX(new Function1() { // from class: com.android.mltcode.paycertificationapi.qv6
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return WeatherInitializer$requestWeatherRealtime$1.OIX0iXi((tv6) obj);
                    }
                });
                BaseBleCache.putObject$default(BleCache.INSTANCE, BleKey.WEATHER_REALTIME2, bleWeatherRealtime2, null, 4, null);
            } else if (BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.WEATHER_REALTIME2, BleKeyFlag.UPDATE, bleWeatherRealtime2, false, false, 24, null)) {
                a01Var.m1440iO().put(b01.iIXi1iiXI, System.currentTimeMillis());
                weatherInitializer.m38237OX(new Function1() { // from class: com.android.mltcode.paycertificationapi.pv6
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return WeatherInitializer$requestWeatherRealtime$1.m38242IO((tv6) obj);
                    }
                });
                I01XX0.XIi00iiXO(I01XX0.f1084IO, null, 2, null);
            }
        } else {
            q62Var = q62Var2;
        }
        if (q62Var.I11iXOO() && weatherRealtime != null) {
            double d2 = this.OXO1;
            if (d2 == 0.0d || d2 == Double.MIN_VALUE) {
                i1o0oxo1o.IiI10X("Weather calculateAltitude -> " + weatherRealtime.getPressure());
                iOIi0 = (int) UtilsKt.OIi0((double) weatherRealtime.getPressure());
            } else {
                iOIi0 = (int) d2;
            }
            BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.AIR_PRESSURE_CALIBRATION, BleKeyFlag.UPDATE, new BleAirPressureCalibration(weatherRealtime.getPressure() * 100, iOIi0), false, false, 24, null);
        }
        weatherInitializer.XiOIO(true);
    }

    @Override // com.android.mltcode.paycertificationapi.O1XIiIO
    public void handleError(final String error) throws IllegalAccessException, InstantiationException {
        Intrinsics.X0O(error, "error");
        i1O0OXO1O.OXO1.IiI10X("Weather requestWeatherRealtime error -> " + error);
        WeatherInitializer weatherInitializer = WeatherInitializer.f51281IO;
        weatherInitializer.m38237OX(new Function1() { // from class: com.android.mltcode.paycertificationapi.nv6
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return WeatherInitializer$requestWeatherRealtime$1.XOO0ii0(error, (tv6) obj);
            }
        });
        weatherInitializer.XiOIO(true);
    }
}
