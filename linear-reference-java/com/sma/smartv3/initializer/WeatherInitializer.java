package com.sma.smartv3.initializer;

import android.app.Activity;
import android.app.Application;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.IO0OI;
import com.android.mltcode.paycertificationapi.O11XO1X;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.av6;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.bv6;
import com.android.mltcode.paycertificationapi.cv6;
import com.android.mltcode.paycertificationapi.ds1;
import com.android.mltcode.paycertificationapi.dv6;
import com.android.mltcode.paycertificationapi.ev6;
import com.android.mltcode.paycertificationapi.fv6;
import com.android.mltcode.paycertificationapi.gv6;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.ms;
import com.android.mltcode.paycertificationapi.ns;
import com.android.mltcode.paycertificationapi.oe5;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.s5;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.tv6;
import com.android.mltcode.paycertificationapi.uq;
import com.android.mltcode.paycertificationapi.zu6;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.bestmafen.androidbase.extension.PermissionStatus;
import com.blankj.utilcode.constant.PermissionConstants;
import com.blankj.utilcode.constant.TimeConstants;
import com.blankj.utilcode.util.AppUtils;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.NetworkUtils;
import com.blankj.utilcode.util.PermissionUtils;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.ThreadUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sma.androidnetworklib.method.NetWork;
import com.sma.androidnetworklib.model.Response;
import com.sma.smartv3.biz.UploadInfoManager;
import com.sma.smartv3.location.CustomLocation;
import com.sma.smartv3.model.WeatherForecast;
import com.sma.smartv3.model.WeatherRealtime;
import com.sma.smartv3.network.Api;
import com.sma.smartv3.network.GetWeatherForecast;
import com.sma.smartv3.network.GetWeatherRealtime;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.network.RequestBodyKt;
import com.sma.smartv3.pro.R;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.BleKeyFlag;
import com.szabh.smable3.component.BaseBleCache;
import com.szabh.smable3.component.BaseBleConnector;
import com.szabh.smable3.component.BleCache;
import com.szabh.smable3.component.BleConnector;
import com.szabh.smable3.entity.BleAgpsPrerequisite;
import com.szabh.smable3.entity.BleWeatherForecast;
import com.szabh.smable3.entity.BleWeatherForecast2;
import com.szabh.smable3.entity.BleWeatherRealtime;
import com.szabh.smable3.entity.BleWeatherRealtime2;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nWeatherInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WeatherInitializer.kt\ncom/sma/smartv3/initializer/WeatherInitializer\n+ 2 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n+ 5 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,551:1\n848#2,30:552\n878#2,3:583\n891#2,4:595\n905#2:607\n848#2,30:608\n878#2,3:639\n891#2,4:651\n905#2:663\n1#3:582\n1#3:638\n1#3:668\n226#4,8:586\n245#4:594\n252#4,7:599\n270#4:606\n226#4,8:642\n245#4:650\n252#4,7:655\n270#4:662\n23#5:664\n18#5,2:665\n15#5:667\n11#5,2:669\n24#5:671\n*S KotlinDebug\n*F\n+ 1 WeatherInitializer.kt\ncom/sma/smartv3/initializer/WeatherInitializer\n*L\n260#1:552,30\n260#1:583,3\n260#1:595,4\n260#1:607\n387#1:608,30\n387#1:639,3\n387#1:651,4\n387#1:663\n260#1:582\n387#1:638\n496#1:668\n260#1:586,8\n260#1:594\n260#1:599,7\n260#1:606\n387#1:642,8\n387#1:650\n387#1:655,7\n387#1:662\n496#1:664\n496#1:665,2\n496#1:667\n496#1:669,2\n496#1:671\n*E\n"})
public final class WeatherInitializer implements s5 {

    @aa1
    public static final String I1 = "Weather";

    @aa1
    public static final WeatherInitializer IO = null;
    public static final int X11iII1O1 = 12;

    @tb1
    public static ms X1IX = null;
    public static boolean XXX11i = false;
    public static final int iX1O1 = 1;

    public static final class OXO1 implements IO0OI {
        public OXO1() {
        }

        public static final Unit O00(CustomLocation r7, tv6 r8) {
            Intrinsics.X0O(r8, "it");
            r8.I0iXXO("lon:" + r7.IiI10X() + ", lat:" + r7.XO0O10() + ", altitude:" + r7.OXO1());
            return Unit.OXO1;
        }

        public static /* synthetic */ Unit XIi00iiXO(CustomLocation r0, tv6 r1) {
            return O00(r0, r1);
        }

        public static final Unit XO0O10(String r1, tv6 r2) {
            Intrinsics.X0O(r2, "it");
            r2.I0iXXO(r1);
            return Unit.OXO1;
        }

        public static /* synthetic */ Unit iO(String r0, tv6 r1) {
            return XO0O10(r0, r1);
        }

        @Override // com.android.mltcode.paycertificationapi.IO0OI
        public void OXO1(final CustomLocation r10) {
            Intrinsics.X0O(r10, "location");
            WeatherInitializer r1 = WeatherInitializer.IO;
            WeatherInitializer.I0IIOi(r1, new bv6(r10));
            LogUtils.v(new Object[]{"Weather onLocationChange -> lon:" + r10.IiI10X() + ", lat:" + r10.XO0O10() + ", altitude:" + r10.OXO1()});
            r1.X0O(r10.IiI10X(), r10.XO0O10(), r10.OXO1());
            r1.O10IXXX0X(r10.IiI10X(), r10.XO0O10());
            WeatherInitializer.IiI10X(r1);
        }

        @Override // com.android.mltcode.paycertificationapi.IO0OI
        public void onError(final String r3) {
            Intrinsics.X0O(r3, "message");
            WeatherInitializer r0 = WeatherInitializer.IO;
            WeatherInitializer.I0IIOi(r0, new cv6(r3));
            WeatherInitializer.IiI10X(r0);
        }
    }

    @SourceDebugExtension({"SMAP\nWeatherInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WeatherInitializer.kt\ncom/sma/smartv3/initializer/WeatherInitializer$requestWeather$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,551:1\n1#2:552\n*E\n"})
    public static final class XIi00iiXO extends ThreadUtils.SimpleTask<Boolean> {
        public XIi00iiXO() {
        }

        public static final Unit I0IIOi(tv6 r2) {
            Intrinsics.X0O(r2, "it");
            r2.X1ii(WeatherInitializer.O00(WeatherInitializer.IO) + "Location permission is not granted");
            return Unit.OXO1;
        }

        public static final Unit IiI10X(PermissionStatus r2) {
            Intrinsics.X0O(r2, "status");
            if (r2 != PermissionStatus.GRANTED) goto L8;
            LogUtils.v(new Object[]{"Weather syncWeather -> start Location"});
            ms r3 = WeatherInitializer.XO0O10();
            if (r3 == null) goto L7;
            r3.IiI10X(R.string.get_weather_and_phone_get_location_desc, false);
        L7:
            WeatherInitializer.I0IIOi(WeatherInitializer.IO, new fv6());
        L10:
            return Unit.OXO1;
        L8:
            LogUtils.v(new Object[]{"Weather syncWeather -> Location permission is not granted"});
            WeatherInitializer.I0IIOi(WeatherInitializer.IO, new gv6());
            goto L10
        }

        public static final Unit OIi0(tv6 r2) {
            Intrinsics.X0O(r2, "it");
            r2.X1ii(WeatherInitializer.O00(WeatherInitializer.IO) + "Network is not available");
            return Unit.OXO1;
        }

        public static /* synthetic */ Unit OXO1(PermissionStatus r0) {
            return IiI10X(r0);
        }

        public static /* synthetic */ Unit XIi00iiXO(tv6 r0) {
            return I0IIOi(r0);
        }

        public static /* synthetic */ Unit XO0O10(tv6 r0) {
            return OIi0(r0);
        }

        public static final Unit XOO0ii0(tv6 r2) {
            Intrinsics.X0O(r2, "it");
            r2.X1ii("");
            r2.I0iXXO(WeatherInitializer.O00(WeatherInitializer.IO) + "startLocation");
            return Unit.OXO1;
        }

        public static /* synthetic */ Unit iO(tv6 r0) {
            return XOO0ii0(r0);
        }

        public void O00(boolean r9) {
            if (r9 == false) goto L15;
            LogUtils.v(new Object[]{"Weather syncWeather"});
            String r2 = a01.OXO1.IiI10X().getString(b01.XX1Oi, "");
            if (AppUtils.isAppForeground() == true) goto L13;
            Intrinsics.XXI(r2);
            if (r2.length() <= 0) goto L13;
            LogUtils.v(new Object[]{"App foreground false -- get Weather"});
            List r10 = StringsKt__StringsKt.i1I(r2, new String[]{I000IiI1O.iO.XO0O10}, false, 0, 6, null);
            double r3 = Double.parseDouble((String) r10.get(0));
            double r4 = Double.parseDouble((String) r10.get(1));
            if (2 >= r10.size()) goto L10;
            Object r11 = r10.get(2);
        L11:
            double r6 = Double.parseDouble((String) r11);
            WeatherInitializer r1 = WeatherInitializer.IO;
            r1.X0O(r3, r4, r6);
            r1.O10IXXX0X(r3, r4);
            return;
        L10:
            r11 = "0";
        L13:
            LogUtils.v(new Object[]{"App foreground true -- get Weather"});
            PermissionUtils r0 = PermissionUtils.permission(new String[]{PermissionConstants.LOCATION});
            Intrinsics.O10IXXX0X(r0, "permission(...)");
            ds1.iO(r0, null, null, new dv6(), 3, null);
            return;
        L15:
            LogUtils.v(new Object[]{"Weather syncWeather -> Network is not available"});
            WeatherInitializer.I0IIOi(WeatherInitializer.IO, new ev6());
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public /* bridge */ /* synthetic */ Object doInBackground() {
            return doInBackground();
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public /* bridge */ /* synthetic */ void onSuccess(Object r1) {
            O00(((Boolean) r1).booleanValue());
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public Boolean doInBackground() {
            return Boolean.valueOf(NetworkUtils.isAvailable());
        }
    }

    static {
        IO = new WeatherInitializer();
        XXX11i = true;
    }

    public WeatherInitializer() {
    }

    public static final /* synthetic */ void I0IIOi(WeatherInitializer r0, Function1 r1) {
        r0.OX(r1);
    }

    public static /* synthetic */ void I1XOi1(WeatherInitializer r7, double r8, double r10, double r12, int r14, Object r15) {
        if ((r14 & 4) == 0) goto L5;
        r12 = 0.0d;
    L5:
        r7.X0O(r8, r10, r12);
    }

    private final void IIX1OXO(final BleAgpsPrerequisite r10) {
        if (q62.OXO1.IIXXi1() == true) goto L6;
        BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.AGPS_PREREQUISITE, BleKeyFlag.UPDATE, r10, false, false, 24, null);
        return;
    L6:
        NetWorkUtils.INSTANCE.findAltitudeByLocation(r10.getMLongitude(), r10.getMLatitude(), new WeatherInitializer$sendAGPSData$1(r10));
    }

    public static final /* synthetic */ void IiI10X(WeatherInitializer r0) {
        r0.iIiiO();
    }

    public static final /* synthetic */ String O00(WeatherInitializer r0) {
        return r0.I0iXXO();
    }

    public static final Unit OiIIX101O(tv6 r1) {
        Intrinsics.X0O(r1, "it");
        r1.X1ii("Device does not support weather");
        return Unit.OXO1;
    }

    public static /* synthetic */ Unit XIi00iiXO(tv6 r0) {
        return OiIIX101O(r0);
    }

    public static final /* synthetic */ ms XO0O10() {
        return X1IX;
    }

    public static final /* synthetic */ int XOO0ii0(WeatherInitializer r0, int r1) {
        return r0.OII(r1);
    }

    public static final Unit XiOIii1(tv6 r2) {
        Intrinsics.X0O(r2, "it");
        r2.X1ii(IO.I0iXXO() + "BleConnector is not available");
        return Unit.OXO1;
    }

    private final void iIiiO() {
        ms r0 = X1IX;
        if (r0 == null) goto L6;
        r0.I0IIOi();
        return;
    }

    public static /* synthetic */ Unit iO(tv6 r0) {
        return XiOIii1(r0);
    }

    public final String I0iXXO() {
        return new SimpleDateFormat("yyyy/MM/dd HH:mm:ss ", Locale.getDefault()).format(new Date());
    }

    public final boolean IO() {
        if (q62.OXO1.i0IX1() == false) goto L11;
        BleWeatherForecast2 r0 = (BleWeatherForecast2) BaseBleCache.getObject$default(BleCache.INSTANCE, BleKey.WEATHER_FORECAST2, BleWeatherForecast2.class, null, 4, null);
        if (r0 != null) goto L8;
        return true;
    L8:
        if ((new Date().getTime() - (((long) r0.getMTime()) * 1000)) < (a01.OXO1.IiI10X().getInt(b01.XXIIO1i11, 12) * TimeConstants.HOUR)) goto L10;
        return true;
    L10:
        return false;
    L11:
        BleWeatherForecast r1 = (BleWeatherForecast) BaseBleCache.getObject$default(BleCache.INSTANCE, BleKey.WEATHER_FORECAST, BleWeatherForecast.class, null, 4, null);
        if (r1 != null) goto L15;
        return true;
    L15:
        if ((new Date().getTime() - (((long) r1.getMTime()) * 1000)) < (a01.OXO1.IiI10X().getInt(b01.XXIIO1i11, 12) * TimeConstants.HOUR)) goto L17;
        return true;
    L17:
        return false;
    }

    public final void O10IXXX0X(double r19, double r21) {
        if (IO() == false) goto L34;
        i1O0OXO1O r4 = i1O0OXO1O.OXO1;
        r4.IiI10X("Weather requestWeatherForecast -> lon:" + r19 + ",lat:" + r21);
        NetWorkUtils r5 = NetWorkUtils.INSTANCE;
        HashMap<String, String> r6 = RequestBodyKt.getWeatherForecastBody(r19, r21);
        final WeatherInitializer$requestWeatherForecast$1 r7 = new WeatherInitializer$requestWeatherForecast$1();
        Map<String, String> r8 = r5.getHeadersMap();
        final uq r10 = r5.loadPopup(null, null);
        String r11 = r5.convertBaseUrl(Api.INSTANCE.getBASE_URL(), GetWeatherForecast.URL);
        i72 r13 = i72.OXO1;
        if (r13.II1Xi0() == true) goto L8;
        r5.printParam(r11 + GetWeatherForecast.URL, kotlin.collections.OXO1.Ii0i(r6, r8));
        r4.OXO1(UploadInfoManager.OXO1.XO0O10() + " getNewApiWeather : enableNewWeatherApi = " + r13.II1Xi0());
        NetWork r1 = NetWork.OXO1;
        String r2 = r11 + GetWeatherForecast.URL;
        final Activity r3 = null;
        final O1XIiIO<Response<WeatherForecast[]>> r9 = new WeatherInitializer$requestWeatherForecast$$inlined$getNewApiWeather$default$3(r3, r7, r10);
        AndroidNetworking.post(r2).addBodyParameter(r6).setTag(r2).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{WeatherForecast[].class}), new WeatherInitializer$requestWeatherForecast$$inlined$getNewApiWeather$default$4(r9));
        return;
    L8:
        if (oe5.XIIIO(GetWeatherForecast.URL, GetWeatherRealtime.URL, true) == false) goto L11;
        String r12 = GetWeatherRealtime.URL_V2;
    L14:
        Map<String, String> r14 = kotlin.collections.OXO1.X111IO(r6);
    L20:
        Type r20 = WeatherForecast[].class;
    L25:
        String r15 = r11 + GetWeatherForecast.URL;
        Map<String, ? extends Object> r16 = kotlin.collections.OXO1.X111IO(r6);
        r16.putAll(r8);
        Unit r17 = Unit.OXO1;
        r5.printParam(r15, r16);
        i1O0OXO1O.OXO1.OXO1(UploadInfoManager.OXO1.XO0O10() + " getNewApiWeather : enableNewWeatherApi = " + i72.OXO1.II1Xi0());
        NetWork r18 = NetWork.OXO1;
        String r22 = r11 + r12;
        final Activity r23 = null;
        final O1XIiIO<Response<WeatherForecast[]>> r24 = new WeatherInitializer$requestWeatherForecast$$inlined$getNewApiWeather$default$1(r23, r7, r10);
        AndroidNetworking.get(r22).addQueryParameter(r14).setTag(r22).addHeaders(r8).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{r20}), new WeatherInitializer$requestWeatherForecast$$inlined$getNewApiWeather$default$2(r24));
        return;
    L16:
        if (r14.containsKey("lat") == false) goto L21;
        String r110 = r14.get("lat");     // Catch: Exception -> L20
        Intrinsics.XXI(r110);     // Catch: Exception -> L20
        r20 = WeatherForecast[].class;
        r14.put("lat", new BigDecimal(r110).setScale(1, RoundingMode.DOWN).toString());     // Catch: Exception -> L29
    L23:
        if (r14.containsKey("lon") == false) goto L25;
        String r25 = r14.get("lon");     // Catch: Exception -> L29
        Intrinsics.XXI(r25);     // Catch: Exception -> L29
        r14.put("lon", new BigDecimal(r25).setScale(1, RoundingMode.DOWN).toString());     // Catch: Exception -> L29
        goto L25
    L21:
        r20 = WeatherForecast[].class;
        goto L23
    L11:
        if (oe5.XIIIO(GetWeatherForecast.URL, GetWeatherForecast.URL, true) == false) goto L13;
        r12 = GetWeatherForecast.URL_V2;
        goto L14
    L13:
        r12 = GetWeatherForecast.URL;
        goto L14
    }

    public final int OII(int r12) {
        if (q62.OXO1.OXIiiX() == false) goto L35;
        switch(r12) {
            case 200: goto L34;
            case 201: goto L34;
            case 202: goto L34;
            case 210: goto L32;
            case 211: goto L32;
            case 212: goto L32;
            case 221: goto L30;
            case 230: goto L34;
            case 231: goto L34;
            case 232: goto L34;
            case 300: goto L28;
            case 301: goto L28;
            case 302: goto L27;
            case 310: goto L28;
            case 311: goto L28;
            case 312: goto L28;
            case 313: goto L28;
            case 314: goto L28;
            case 321: goto L28;
            case 500: goto L27;
            case 501: goto L27;
            case 502: goto L25;
            case 503: goto L25;
            case 504: goto L27;
            case 511: goto L27;
            case 520: goto L27;
            case 521: goto L27;
            case 522: goto L27;
            case 531: goto L27;
            case 600: goto L23;
            case 601: goto L22;
            case 602: goto L20;
            case 611: goto L18;
            case 612: goto L18;
            case 613: goto L18;
            case 615: goto L18;
            case 616: goto L18;
            case 620: goto L18;
            case 621: goto L16;
            case 622: goto L20;
            case 701: goto L15;
            case 711: goto L15;
            case 721: goto L13;
            case 731: goto L12;
            case 741: goto L15;
            case 751: goto L12;
            case 761: goto L12;
            case 762: goto L12;
            case 771: goto L11;
            case 781: goto L9;
            case 800: goto L8;
            case 801: goto L7;
            case 802: goto L6;
            case 803: goto L6;
            case 804: goto L6;
            default: goto L5;
        };
    L5:
        return 0;
    L6:
        return 2;
    L7:
        return 3;
    L8:
        return 1;
    L9:
        return 19;
    L11:
        return 7;
    L12:
        return 10;
    L13:
        return 11;
    L15:
        return 9;
    L16:
        return 20;
    L18:
        return 18;
    L20:
        return 17;
    L22:
        return 8;
    L23:
        return 16;
    L25:
        return 14;
    L27:
        return 4;
    L28:
        return 13;
    L30:
        return 15;
    L32:
        return 5;
    L34:
        return 6;
    L35:
        switch(r12) {
            case 200: goto L45;
            case 201: goto L45;
            case 202: goto L45;
            case 210: goto L45;
            case 211: goto L45;
            case 212: goto L45;
            case 230: goto L45;
            case 231: goto L45;
            case 232: goto L45;
            case 300: goto L44;
            case 301: goto L44;
            case 302: goto L44;
            case 310: goto L44;
            case 311: goto L44;
            case 312: goto L44;
            case 313: goto L44;
            case 314: goto L44;
            case 321: goto L44;
            case 500: goto L44;
            case 501: goto L44;
            case 502: goto L44;
            case 503: goto L44;
            case 504: goto L44;
            case 511: goto L44;
            case 520: goto L44;
            case 521: goto L44;
            case 522: goto L44;
            case 531: goto L44;
            case 600: goto L43;
            case 601: goto L43;
            case 602: goto L43;
            case 611: goto L43;
            case 612: goto L43;
            case 613: goto L43;
            case 615: goto L43;
            case 616: goto L43;
            case 620: goto L43;
            case 621: goto L43;
            case 622: goto L43;
            case 701: goto L42;
            case 711: goto L42;
            case 721: goto L42;
            case 731: goto L41;
            case 741: goto L42;
            case 751: goto L41;
            case 761: goto L41;
            case 762: goto L41;
            case 771: goto L40;
            case 781: goto L40;
            case 800: goto L39;
            case 801: goto L38;
            case 802: goto L37;
            case 803: goto L37;
            case 804: goto L37;
            default: goto L36;
        };
    L36:
        return 0;
    L37:
        return 2;
    L38:
        return 3;
    L39:
        return 1;
    L40:
        return 7;
    L41:
        return 10;
    L42:
        return 9;
    L43:
        return 8;
    L44:
        return 4;
    L45:
        return 6;
    }

    public final boolean OIX0iXi() {
        int r0 = a01.OXO1.IiI10X().getInt(b01.O1O, 1);
        if (q62.OXO1.i0IX1() == false) goto L11;
        BleWeatherRealtime2 r1 = (BleWeatherRealtime2) BaseBleCache.getObject$default(BleCache.INSTANCE, BleKey.WEATHER_REALTIME2, BleWeatherRealtime2.class, null, 4, null);
        if (r1 != null) goto L7;
        return true;
    L7:
        LogUtils.v(new Object[]{"Weather isTimeToSyncWeatherRealtime2 ->weatherRealtimeInterval:" + r0 + ", weatherRealtime:" + r1});
        if ((new Date().getTime() - (((long) r1.getMTime()) * 1000)) < (r0 * TimeConstants.HOUR)) goto L10;
        return true;
    L10:
        return false;
    L11:
        BleWeatherRealtime r2 = (BleWeatherRealtime) BaseBleCache.getObject$default(BleCache.INSTANCE, BleKey.WEATHER_REALTIME, BleWeatherRealtime.class, null, 4, null);
        if (r2 != null) goto L14;
        return true;
    L14:
        LogUtils.v(new Object[]{"Weather isTimeToSyncWeatherRealtime ->weatherRealtimeInterval:" + r0 + ", weatherRealtime:" + r2});
        if ((new Date().getTime() - (((long) r2.getMTime()) * 1000)) < (r0 * TimeConstants.HOUR)) goto L17;
        return true;
    L17:
        return false;
    }

    public final boolean OIi0() {
        return XXX11i;
    }

    public final void OX(Function1<? super tv6, Unit> r5) {
        SPUtils r0 = a01.OXO1.XIi00iiXO();
        Object r1 = new Gson().fromJson(r0.getString(tv6.class.getName()), tv6.class);
        if (r1 != null) goto L5;
        r1 = tv6.class.newInstance();
    L5:
        r5.invoke(r1);
        r0.put(tv6.class.getName(), new Gson().toJson(r1));
    }

    @Override // com.android.mltcode.paycertificationapi.s5
    public void OXO1(@aa1 Application r2) {
        Intrinsics.X0O(r2, "app");
        O11XO1X.XO0O10().X1ii(this);
    }

    public final void X0O(double r20, double r22, double r24) {
        i1O0OXO1O r9 = i1O0OXO1O.OXO1;
        r9.IiI10X("Weather requestWeatherRealtime -> lon:" + r20 + ",lat:" + r22 + ",altitude:" + r24);
        XXX11i = false;
        if (BleCache.INSTANCE.getMAGpsType() != 9) goto L6;
        IIX1OXO(new BleAgpsPrerequisite((float) r20, (float) r22, (int) r24));
    L6:
        NetWorkUtils r11 = NetWorkUtils.INSTANCE;
        HashMap<String, String> r0 = RequestBodyKt.getWeatherRealtimeBody(r20, r22);
        final WeatherInitializer$requestWeatherRealtime$1 r1 = new WeatherInitializer$requestWeatherRealtime$1(r24);
        Map<String, String> r2 = r11.getHeadersMap();
        final uq r4 = r11.loadPopup(null, null);
        String r5 = r11.convertBaseUrl(Api.INSTANCE.getBASE_URL(), GetWeatherRealtime.URL);
        i72 r14 = i72.OXO1;
        if (r14.II1Xi0() == true) goto L9;
        r11.printParam(r5 + GetWeatherRealtime.URL, kotlin.collections.OXO1.Ii0i(r0, r2));
        r9.OXO1(UploadInfoManager.OXO1.XO0O10() + " getNewApiWeather : enableNewWeatherApi = " + r14.II1Xi0());
        NetWork r3 = NetWork.OXO1;
        String r6 = r5 + GetWeatherRealtime.URL;
        final Activity r7 = null;
        final O1XIiIO<Response<WeatherRealtime>> r8 = new WeatherInitializer$requestWeatherRealtime$$inlined$getNewApiWeather$default$3(r7, r1, r4);
        AndroidNetworking.post(r6).addBodyParameter(r0).setTag(r6).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{WeatherRealtime.class}), new WeatherInitializer$requestWeatherRealtime$$inlined$getNewApiWeather$default$4(r8));
        return;
    L9:
        if (oe5.XIIIO(GetWeatherRealtime.URL, GetWeatherRealtime.URL, true) == false) goto L12;
        String r10 = GetWeatherRealtime.URL_V2;
    L15:
        Map<String, String> r15 = kotlin.collections.OXO1.X111IO(r0);
        if (r15.containsKey("lat") == false) goto L20;
        String r18 = r15.get("lat");     // Catch: Exception -> L26
        Intrinsics.XXI(r18);     // Catch: Exception -> L26
        r15.put("lat", new BigDecimal(r18).setScale(1, RoundingMode.DOWN).toString());     // Catch: Exception -> L26
    L20:
        if (r15.containsKey("lon") == false) goto L22;
        String r12 = r15.get("lon");     // Catch: Exception -> L26
        Intrinsics.XXI(r12);     // Catch: Exception -> L26
        r15.put("lon", new BigDecimal(r12).setScale(1, RoundingMode.DOWN).toString());     // Catch: Exception -> L26
    L22:
        String r13 = r5 + GetWeatherRealtime.URL;
        Map<String, ? extends Object> r16 = kotlin.collections.OXO1.X111IO(r0);
        r16.putAll(r2);
        Unit r17 = Unit.OXO1;
        r11.printParam(r13, r16);
        i1O0OXO1O.OXO1.OXO1(UploadInfoManager.OXO1.XO0O10() + " getNewApiWeather : enableNewWeatherApi = " + i72.OXO1.II1Xi0());
        NetWork r19 = NetWork.OXO1;
        String r21 = r5 + r10;
        final Activity r23 = null;
        final O1XIiIO<Response<WeatherRealtime>> r25 = new WeatherInitializer$requestWeatherRealtime$$inlined$getNewApiWeather$default$1(r23, r1, r4);
        AndroidNetworking.get(r21).addQueryParameter(r15).setTag(r21).addHeaders(r2).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{WeatherRealtime.class}), new WeatherInitializer$requestWeatherRealtime$$inlined$getNewApiWeather$default$2(r25));
        return;
    L12:
        if (oe5.XIIIO(GetWeatherRealtime.URL, GetWeatherForecast.URL, true) == false) goto L14;
        r10 = GetWeatherForecast.URL_V2;
        goto L15
    L14:
        r10 = GetWeatherRealtime.URL;
        goto L15
    }

    public final void X1ii() {
        LogUtils.v(new Object[]{"Weather start requestWeather....."});
        ThreadUtils.executeByIo(new XIi00iiXO());
    }

    public final void XX0() {
        if (XXX11i == true) goto L7;
        LogUtils.v(new Object[]{"Weather syncWeather -> the last Request not done"});
        return;
    L7:
        if (q62.OXO1.OXii10I() == true) goto L11;
        LogUtils.v(new Object[]{"Weather syncWeather -> Device does not support weather"});
        OX(new zu6());
        return;
    L11:
        if (BleConnector.INSTANCE.isAvailable() == true) goto L15;
        LogUtils.v(new Object[]{"Weather syncWeather -> BleConnector is not available"});
        OX(new av6());
        return;
    L15:
        if (OIX0iXi() == true) goto L19;
        LogUtils.v(new Object[]{"Weather syncWeather -> Not time to sync weather"});
        return;
    L19:
        if (BleInitializer.IO.OI() == false) goto L22;
        LogUtils.v(new Object[]{"Weather firmware update....."});
        return;
    L22:
        X1ii();
    }

    @sf5(tag = b01.XiOIO)
    public final void XXI(@aa1 Object r4) {
        Intrinsics.X0O(r4, "data");
        if (BleConnector.INSTANCE.isBound() == false) goto L6;
        LogUtils.v(new Object[]{"Weather onLocationWhere"});
        X1IX = ns.XIi00iiXO(new OXO1(), false, 2, null);
        return;
    }

    public final void XiOIO(boolean r1) {
        XXX11i = r1;
    }
}
