package com.sma.smartv3.initializer;

import android.app.Activity;
import android.app.Application;
import com.android.mltcode.paycertificationapi.C2702ms;
import com.android.mltcode.paycertificationapi.C2743ns;
import com.android.mltcode.paycertificationapi.C3006uq;
import com.android.mltcode.paycertificationapi.I000IiI1O;
import com.android.mltcode.paycertificationapi.IO0OI;
import com.android.mltcode.paycertificationapi.InterfaceC2909s5;
import com.android.mltcode.paycertificationapi.O11XO1X;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.ds1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.oe5;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.sf5;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.tv6;
import com.android.mltcode.paycertificationapi.yn0;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.ParsedRequestListener;
import com.bestmafen.androidbase.extension.PermissionStatus;
import com.blankj.utilcode.constant.PermissionConstants;
import com.blankj.utilcode.constant.TimeConstants;
import com.blankj.utilcode.util.AppUtils;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.NetworkUtils;
import com.blankj.utilcode.util.PermissionUtils;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.ThreadUtils;
import com.goodix.ble.libcomx.task.TaskPipe;
import com.goodix.ble.p595gr.libdfu.task.sub.ResultCode;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.realsil.sdk.dfu.DfuConstants;
import com.sma.androidnetworklib.method.NetWork;
import com.sma.androidnetworklib.model.Response;
import com.sma.smartv3.biz.UploadInfoManager;
import com.sma.smartv3.initializer.WeatherInitializer;
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
public final class WeatherInitializer implements InterfaceC2909s5 {

    /* JADX INFO: renamed from: I1 */
    @aa1
    public static final String f51280I1 = "Weather";
    public static final int X11iII1O1 = 12;

    @tb1
    public static C2702ms X1IX = null;
    public static final int iX1O1 = 1;

    /* JADX INFO: renamed from: IO */
    @aa1
    public static final WeatherInitializer f51281IO = new WeatherInitializer();
    public static boolean XXX11i = true;

    public static final class OXO1 implements IO0OI {
        public static final Unit O00(CustomLocation customLocation, tv6 it) {
            Intrinsics.X0O(it, "it");
            it.I0iXXO("lon:" + customLocation.IiI10X() + ", lat:" + customLocation.XO0O10() + ", altitude:" + customLocation.OXO1());
            return Unit.OXO1;
        }

        public static final Unit XO0O10(String str, tv6 it) {
            Intrinsics.X0O(it, "it");
            it.I0iXXO(str);
            return Unit.OXO1;
        }

        @Override // com.android.mltcode.paycertificationapi.IO0OI
        public void OXO1(final CustomLocation location) throws IllegalAccessException, InstantiationException {
            Intrinsics.X0O(location, "location");
            WeatherInitializer weatherInitializer = WeatherInitializer.f51281IO;
            weatherInitializer.m38237OX(new Function1() { // from class: com.android.mltcode.paycertificationapi.bv6
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return WeatherInitializer.OXO1.O00(location, (tv6) obj);
                }
            });
            LogUtils.m11131v("Weather onLocationChange -> lon:" + location.IiI10X() + ", lat:" + location.XO0O10() + ", altitude:" + location.OXO1());
            weatherInitializer.X0O(location.IiI10X(), location.XO0O10(), location.OXO1());
            weatherInitializer.O10IXXX0X(location.IiI10X(), location.XO0O10());
            weatherInitializer.iIiiO();
        }

        @Override // com.android.mltcode.paycertificationapi.IO0OI
        public void onError(final String message) throws IllegalAccessException, InstantiationException {
            Intrinsics.X0O(message, "message");
            WeatherInitializer weatherInitializer = WeatherInitializer.f51281IO;
            weatherInitializer.m38237OX(new Function1() { // from class: com.android.mltcode.paycertificationapi.cv6
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return WeatherInitializer.OXO1.XO0O10(message, (tv6) obj);
                }
            });
            weatherInitializer.iIiiO();
        }
    }

    @SourceDebugExtension({"SMAP\nWeatherInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WeatherInitializer.kt\ncom/sma/smartv3/initializer/WeatherInitializer$requestWeather$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,551:1\n1#2:552\n*E\n"})
    public static final class XIi00iiXO extends ThreadUtils.SimpleTask<Boolean> {
        public static final Unit I0IIOi(tv6 it) {
            Intrinsics.X0O(it, "it");
            it.X1ii(WeatherInitializer.f51281IO.I0iXXO() + "Location permission is not granted");
            return Unit.OXO1;
        }

        public static final Unit IiI10X(PermissionStatus status) throws IllegalAccessException, InstantiationException {
            Intrinsics.X0O(status, "status");
            if (status == PermissionStatus.GRANTED) {
                LogUtils.m11131v("Weather syncWeather -> start Location");
                C2702ms c2702ms = WeatherInitializer.X1IX;
                if (c2702ms != null) {
                    c2702ms.IiI10X(R.string.get_weather_and_phone_get_location_desc, false);
                }
                WeatherInitializer.f51281IO.m38237OX(new Function1() { // from class: com.android.mltcode.paycertificationapi.fv6
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return WeatherInitializer.XIi00iiXO.XOO0ii0((tv6) obj);
                    }
                });
            } else {
                LogUtils.m11131v("Weather syncWeather -> Location permission is not granted");
                WeatherInitializer.f51281IO.m38237OX(new Function1() { // from class: com.android.mltcode.paycertificationapi.gv6
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return WeatherInitializer.XIi00iiXO.I0IIOi((tv6) obj);
                    }
                });
            }
            return Unit.OXO1;
        }

        public static final Unit OIi0(tv6 it) {
            Intrinsics.X0O(it, "it");
            it.X1ii(WeatherInitializer.f51281IO.I0iXXO() + "Network is not available");
            return Unit.OXO1;
        }

        public static final Unit XOO0ii0(tv6 it) {
            Intrinsics.X0O(it, "it");
            it.X1ii("");
            it.I0iXXO(WeatherInitializer.f51281IO.I0iXXO() + "startLocation");
            return Unit.OXO1;
        }

        public void O00(boolean z) throws IllegalAccessException, InstantiationException {
            if (!z) {
                LogUtils.m11131v("Weather syncWeather -> Network is not available");
                WeatherInitializer.f51281IO.m38237OX(new Function1() { // from class: com.android.mltcode.paycertificationapi.ev6
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return WeatherInitializer.XIi00iiXO.OIi0((tv6) obj);
                    }
                });
                return;
            }
            LogUtils.m11131v("Weather syncWeather");
            String string = a01.OXO1.IiI10X().getString(b01.XX1Oi, "");
            if (!AppUtils.isAppForeground()) {
                Intrinsics.XXI(string);
                if (string.length() > 0) {
                    LogUtils.m11131v("App foreground false -- get Weather");
                    List listI1I = StringsKt__StringsKt.i1I(string, new String[]{I000IiI1O.C2156iO.XO0O10}, false, 0, 6, null);
                    double d = Double.parseDouble((String) listI1I.get(0));
                    double d2 = Double.parseDouble((String) listI1I.get(1));
                    double d3 = Double.parseDouble((String) (2 < listI1I.size() ? listI1I.get(2) : "0"));
                    WeatherInitializer weatherInitializer = WeatherInitializer.f51281IO;
                    weatherInitializer.X0O(d, d2, d3);
                    weatherInitializer.O10IXXX0X(d, d2);
                    return;
                }
            }
            LogUtils.m11131v("App foreground true -- get Weather");
            PermissionUtils permissionUtilsPermission = PermissionUtils.permission(PermissionConstants.LOCATION);
            Intrinsics.O10IXXX0X(permissionUtilsPermission, "permission(...)");
            ds1.m1690iO(permissionUtilsPermission, null, null, new Function1() { // from class: com.android.mltcode.paycertificationapi.dv6
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return WeatherInitializer.XIi00iiXO.IiI10X((PermissionStatus) obj);
                }
            }, 3, null);
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public /* bridge */ /* synthetic */ void onSuccess(Object obj) throws IllegalAccessException, InstantiationException {
            O00(((Boolean) obj).booleanValue());
        }

        @Override // com.blankj.utilcode.util.ThreadUtils.Task
        public Boolean doInBackground() {
            return Boolean.valueOf(NetworkUtils.isAvailable());
        }
    }

    public static /* synthetic */ void I1XOi1(WeatherInitializer weatherInitializer, double d, double d2, double d3, int i, Object obj) {
        if ((i & 4) != 0) {
            d3 = 0.0d;
        }
        weatherInitializer.X0O(d, d2, d3);
    }

    private final void IIX1OXO(final BleAgpsPrerequisite bleAgpsPrerequisite) {
        if (q62.OXO1.IIXXi1()) {
            NetWorkUtils.INSTANCE.findAltitudeByLocation(bleAgpsPrerequisite.getMLongitude(), bleAgpsPrerequisite.getMLatitude(), new O1XIiIO<Integer>() { // from class: com.sma.smartv3.initializer.WeatherInitializer$sendAGPSData$1
                @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
                public void handleResponse(Integer num) {
                    BleConnector bleConnector = BleConnector.INSTANCE;
                    BleKey bleKey = BleKey.AGPS_PREREQUISITE;
                    BleKeyFlag bleKeyFlag = BleKeyFlag.UPDATE;
                    BleAgpsPrerequisite bleAgpsPrerequisite2 = bleAgpsPrerequisite;
                    Intrinsics.XXI(num);
                    bleAgpsPrerequisite2.setMAltitude(num.intValue());
                    Unit unit = Unit.OXO1;
                    BaseBleConnector.sendObject$default(bleConnector, bleKey, bleKeyFlag, bleAgpsPrerequisite2, false, false, 24, null);
                }

                @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                public void handleError(String error) {
                    Intrinsics.X0O(error, "error");
                    BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.AGPS_PREREQUISITE, BleKeyFlag.UPDATE, bleAgpsPrerequisite, false, false, 24, null);
                }
            });
        } else {
            BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.AGPS_PREREQUISITE, BleKeyFlag.UPDATE, bleAgpsPrerequisite, false, false, 24, null);
        }
    }

    public static final Unit OiIIX101O(tv6 it) {
        Intrinsics.X0O(it, "it");
        it.X1ii("Device does not support weather");
        return Unit.OXO1;
    }

    public static final Unit XiOIii1(tv6 it) {
        Intrinsics.X0O(it, "it");
        it.X1ii(f51281IO.I0iXXO() + "BleConnector is not available");
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void iIiiO() {
        C2702ms c2702ms = X1IX;
        if (c2702ms != null) {
            c2702ms.I0IIOi();
        }
    }

    public final String I0iXXO() {
        return new SimpleDateFormat("yyyy/MM/dd HH:mm:ss ", Locale.getDefault()).format(new Date());
    }

    /* JADX INFO: renamed from: IO */
    public final boolean m38236IO() {
        if (q62.OXO1.i0IX1()) {
            BleWeatherForecast2 bleWeatherForecast2 = (BleWeatherForecast2) BaseBleCache.getObject$default(BleCache.INSTANCE, BleKey.WEATHER_FORECAST2, BleWeatherForecast2.class, null, 4, null);
            return bleWeatherForecast2 == null || new Date().getTime() - (((long) bleWeatherForecast2.getMTime()) * 1000) >= ((long) (a01.OXO1.IiI10X().getInt(b01.XXIIO1i11, 12) * TimeConstants.HOUR));
        }
        BleWeatherForecast bleWeatherForecast = (BleWeatherForecast) BaseBleCache.getObject$default(BleCache.INSTANCE, BleKey.WEATHER_FORECAST, BleWeatherForecast.class, null, 4, null);
        return bleWeatherForecast == null || new Date().getTime() - (((long) bleWeatherForecast.getMTime()) * 1000) >= ((long) (a01.OXO1.IiI10X().getInt(b01.XXIIO1i11, 12) * TimeConstants.HOUR));
    }

    public final void O10IXXX0X(double d, double d2) {
        String str;
        Type type;
        if (m38236IO()) {
            i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
            i1o0oxo1o.IiI10X("Weather requestWeatherForecast -> lon:" + d + ",lat:" + d2);
            NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
            HashMap<String, String> weatherForecastBody = RequestBodyKt.getWeatherForecastBody(d, d2);
            final WeatherInitializer$requestWeatherForecast$1 weatherInitializer$requestWeatherForecast$1 = new WeatherInitializer$requestWeatherForecast$1();
            Map<String, String> headersMap = netWorkUtils.getHeadersMap();
            final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(null, null);
            String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), GetWeatherForecast.URL);
            i72 i72Var = i72.OXO1;
            if (!i72Var.II1Xi0()) {
                netWorkUtils.printParam(strConvertBaseUrl + GetWeatherForecast.URL, kotlin.collections.OXO1.Ii0i(weatherForecastBody, headersMap));
                i1o0oxo1o.OXO1(UploadInfoManager.OXO1.XO0O10() + " getNewApiWeather : enableNewWeatherApi = " + i72Var.II1Xi0());
                NetWork netWork = NetWork.OXO1;
                String str2 = strConvertBaseUrl + GetWeatherForecast.URL;
                final Activity activity = null;
                final O1XIiIO<Response<WeatherForecast[]>> o1XIiIO = new O1XIiIO<Response<WeatherForecast[]>>() { // from class: com.sma.smartv3.initializer.WeatherInitializer$requestWeatherForecast$$inlined$getNewApiWeather$default$3
                    @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                    /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
                    public void handleResponse(Response<WeatherForecast[]> response) {
                        NetWorkUtils netWorkUtils2 = NetWorkUtils.INSTANCE;
                        Activity activity2 = activity;
                        O1XIiIO o1XIiIO2 = weatherInitializer$requestWeatherForecast$1;
                        C3006uq c3006uq = c3006uqLoadPopup;
                        LogUtils.m11128d(yn0.I0IIOi + response);
                        if (response == null) {
                            response = new Response<>();
                            response.setCode(-1000);
                        }
                        netWorkUtils2.responseWhenCheck(activity2, response, o1XIiIO2);
                        if (c3006uq != null) {
                            c3006uq.dismiss();
                        }
                    }

                    @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                    public void handleError(String error) {
                        Intrinsics.X0O(error, "error");
                        NetWorkUtils.INSTANCE.errorData(error, weatherInitializer$requestWeatherForecast$1, c3006uqLoadPopup);
                    }
                };
                AndroidNetworking.post(str2).addBodyParameter((Map<String, String>) weatherForecastBody).setTag((Object) str2).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, WeatherForecast[].class), new ParsedRequestListener<Response<WeatherForecast[]>>() { // from class: com.sma.smartv3.initializer.WeatherInitializer$requestWeatherForecast$$inlined$getNewApiWeather$default$4
                    @Override // com.androidnetworking.interfaces.ParsedRequestListener
                    /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
                    public void onResponse(Response<WeatherForecast[]> response) {
                        Intrinsics.X0O(response, "response");
                        o1XIiIO.handleResponse(response);
                    }

                    @Override // com.androidnetworking.interfaces.ParsedRequestListener
                    public void onError(ANError aNError) {
                        Response response;
                        StringBuilder sb = new StringBuilder();
                        sb.append("errorCode:");
                        Integer numValueOf = null;
                        sb.append(aNError != null ? Integer.valueOf(aNError.getErrorCode()) : null);
                        sb.append(", errorBody:");
                        sb.append(aNError != null ? aNError.getErrorBody() : null);
                        sb.append(", ");
                        sb.append(aNError != null ? aNError.getErrorDetail() : null);
                        LogUtils.m11128d(sb.toString());
                        if (aNError != null && (response = (Response) aNError.getErrorAsObject(Response.class)) != null) {
                            numValueOf = Integer.valueOf(response.getCode());
                        } else if (aNError != null) {
                            numValueOf = Integer.valueOf(aNError.getErrorCode());
                        }
                        o1XIiIO.handleError(String.valueOf(numValueOf));
                    }
                });
                return;
            }
            if (oe5.XIIIO(GetWeatherForecast.URL, GetWeatherRealtime.URL, true)) {
                str = GetWeatherRealtime.URL_V2;
            } else {
                str = oe5.XIIIO(GetWeatherForecast.URL, GetWeatherForecast.URL, true) ? GetWeatherForecast.URL_V2 : GetWeatherForecast.URL;
            }
            Map<String, String> mapX111IO = kotlin.collections.OXO1.X111IO(weatherForecastBody);
            try {
                if (mapX111IO.containsKey("lat")) {
                    String str3 = mapX111IO.get("lat");
                    Intrinsics.XXI(str3);
                    type = WeatherForecast[].class;
                    try {
                        mapX111IO.put("lat", new BigDecimal(str3).setScale(1, RoundingMode.DOWN).toString());
                    } catch (Exception unused) {
                    }
                } else {
                    type = WeatherForecast[].class;
                }
                if (mapX111IO.containsKey("lon")) {
                    String str4 = mapX111IO.get("lon");
                    Intrinsics.XXI(str4);
                    mapX111IO.put("lon", new BigDecimal(str4).setScale(1, RoundingMode.DOWN).toString());
                }
            } catch (Exception unused2) {
                type = WeatherForecast[].class;
            }
            String str5 = strConvertBaseUrl + GetWeatherForecast.URL;
            Map<String, ? extends Object> mapX111IO2 = kotlin.collections.OXO1.X111IO(weatherForecastBody);
            mapX111IO2.putAll(headersMap);
            Unit unit = Unit.OXO1;
            netWorkUtils.printParam(str5, mapX111IO2);
            i1O0OXO1O.OXO1.OXO1(UploadInfoManager.OXO1.XO0O10() + " getNewApiWeather : enableNewWeatherApi = " + i72.OXO1.II1Xi0());
            NetWork netWork2 = NetWork.OXO1;
            String str6 = strConvertBaseUrl + str;
            final Activity activity2 = null;
            final O1XIiIO<Response<WeatherForecast[]>> o1XIiIO2 = new O1XIiIO<Response<WeatherForecast[]>>() { // from class: com.sma.smartv3.initializer.WeatherInitializer$requestWeatherForecast$$inlined$getNewApiWeather$default$1
                @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
                public void handleResponse(Response<WeatherForecast[]> response) {
                    NetWorkUtils netWorkUtils2 = NetWorkUtils.INSTANCE;
                    Activity activity3 = activity2;
                    O1XIiIO o1XIiIO3 = weatherInitializer$requestWeatherForecast$1;
                    C3006uq c3006uq = c3006uqLoadPopup;
                    LogUtils.m11128d(yn0.I0IIOi + response);
                    if (response == null) {
                        response = new Response<>();
                        response.setCode(-1000);
                    }
                    netWorkUtils2.responseWhenCheck(activity3, response, o1XIiIO3);
                    if (c3006uq != null) {
                        c3006uq.dismiss();
                    }
                }

                @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                public void handleError(String error) {
                    Intrinsics.X0O(error, "error");
                    NetWorkUtils.INSTANCE.errorData(error, weatherInitializer$requestWeatherForecast$1, c3006uqLoadPopup);
                }
            };
            AndroidNetworking.get(str6).addQueryParameter(mapX111IO).setTag((Object) str6).addHeaders(headersMap).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, type), new ParsedRequestListener<Response<WeatherForecast[]>>() { // from class: com.sma.smartv3.initializer.WeatherInitializer$requestWeatherForecast$$inlined$getNewApiWeather$default$2
                @Override // com.androidnetworking.interfaces.ParsedRequestListener
                /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
                public void onResponse(Response<WeatherForecast[]> response) {
                    Intrinsics.X0O(response, "response");
                    o1XIiIO2.handleResponse(response);
                }

                @Override // com.androidnetworking.interfaces.ParsedRequestListener
                public void onError(ANError aNError) {
                    Response response;
                    StringBuilder sb = new StringBuilder();
                    sb.append("errorCode:");
                    Integer numValueOf = null;
                    sb.append(aNError != null ? Integer.valueOf(aNError.getErrorCode()) : null);
                    sb.append(", errorBody:");
                    sb.append(aNError != null ? aNError.getErrorBody() : null);
                    LogUtils.m11128d(sb.toString());
                    if (aNError != null && (response = (Response) aNError.getErrorAsObject(Response.class)) != null) {
                        numValueOf = Integer.valueOf(response.getCode());
                    } else if (aNError != null) {
                        numValueOf = Integer.valueOf(aNError.getErrorCode());
                    }
                    o1XIiIO2.handleError(String.valueOf(numValueOf));
                }
            });
        }
    }

    public final int OII(int i) {
        if (!q62.OXO1.OXIiiX()) {
            switch (i) {
                case 200:
                case 201:
                case 202:
                case 210:
                case 211:
                case 212:
                case 230:
                case 231:
                case 232:
                    return 6;
                case 300:
                case 301:
                case 302:
                case 310:
                case 311:
                case 312:
                case 313:
                case 314:
                case 321:
                case 500:
                case 501:
                case 502:
                case 503:
                case 504:
                case 511:
                case 520:
                case 521:
                case DfuConstants.PROGRESS_HAND_OVER_PROCESSING /* 522 */:
                case 531:
                    return 4;
                case 600:
                case 601:
                case 602:
                case 611:
                case 612:
                case IronSourceError.ERROR_BN_RELOAD_SKIP_INVISIBLE /* 613 */:
                case IronSourceError.ERROR_BN_LOAD_NO_CONFIG /* 615 */:
                case IronSourceError.ERROR_BN_UNSUPPORTED_SIZE /* 616 */:
                case IronSourceError.ERROR_DO_BN_LOAD_DURING_SHOW /* 620 */:
                case 621:
                case IronSourceError.ERROR_BN_RELOAD_SKIP_BANNER_LAYOUT_IS_NULL /* 622 */:
                    return 8;
                case 701:
                case IronSourceError.ERROR_NT_INSTANCE_LOAD_EMPTY_ADAPTER /* 711 */:
                case 721:
                case 741:
                    return 9;
                case 731:
                case 751:
                case TaskPipe.EVT_BUSY /* 761 */:
                case 762:
                    return 10;
                case 771:
                case 781:
                    return 7;
                case ResultCode.IMG_COLLISION /* 800 */:
                    return 1;
                case 801:
                    return 3;
                case 802:
                case 803:
                case 804:
                    return 2;
                default:
                    return 0;
            }
        }
        switch (i) {
            case 200:
            case 201:
            case 202:
            case 230:
            case 231:
            case 232:
                return 6;
            case 210:
            case 211:
            case 212:
                return 5;
            case 221:
                return 15;
            case 300:
            case 301:
            case 310:
            case 311:
            case 312:
            case 313:
            case 314:
            case 321:
                return 13;
            case 302:
            case 500:
            case 501:
            case 504:
            case 511:
            case 520:
            case 521:
            case DfuConstants.PROGRESS_HAND_OVER_PROCESSING /* 522 */:
            case 531:
                return 4;
            case 502:
            case 503:
                return 14;
            case 600:
                return 16;
            case 601:
                return 8;
            case 602:
            case IronSourceError.ERROR_BN_RELOAD_SKIP_BANNER_LAYOUT_IS_NULL /* 622 */:
                return 17;
            case 611:
            case 612:
            case IronSourceError.ERROR_BN_RELOAD_SKIP_INVISIBLE /* 613 */:
            case IronSourceError.ERROR_BN_LOAD_NO_CONFIG /* 615 */:
            case IronSourceError.ERROR_BN_UNSUPPORTED_SIZE /* 616 */:
            case IronSourceError.ERROR_DO_BN_LOAD_DURING_SHOW /* 620 */:
                return 18;
            case 621:
                return 20;
            case 701:
            case IronSourceError.ERROR_NT_INSTANCE_LOAD_EMPTY_ADAPTER /* 711 */:
            case 741:
                return 9;
            case 721:
                return 11;
            case 731:
            case 751:
            case TaskPipe.EVT_BUSY /* 761 */:
            case 762:
                return 10;
            case 771:
                return 7;
            case 781:
                return 19;
            case ResultCode.IMG_COLLISION /* 800 */:
                return 1;
            case 801:
                return 3;
            case 802:
            case 803:
            case 804:
                return 2;
            default:
                return 0;
        }
    }

    public final boolean OIX0iXi() {
        int i = a01.OXO1.IiI10X().getInt(b01.O1O, 1);
        if (q62.OXO1.i0IX1()) {
            BleWeatherRealtime2 bleWeatherRealtime2 = (BleWeatherRealtime2) BaseBleCache.getObject$default(BleCache.INSTANCE, BleKey.WEATHER_REALTIME2, BleWeatherRealtime2.class, null, 4, null);
            if (bleWeatherRealtime2 == null) {
                return true;
            }
            LogUtils.m11131v("Weather isTimeToSyncWeatherRealtime2 ->weatherRealtimeInterval:" + i + ", weatherRealtime:" + bleWeatherRealtime2);
            return new Date().getTime() - (((long) bleWeatherRealtime2.getMTime()) * 1000) >= ((long) (i * TimeConstants.HOUR));
        }
        BleWeatherRealtime bleWeatherRealtime = (BleWeatherRealtime) BaseBleCache.getObject$default(BleCache.INSTANCE, BleKey.WEATHER_REALTIME, BleWeatherRealtime.class, null, 4, null);
        if (bleWeatherRealtime == null) {
            return true;
        }
        LogUtils.m11131v("Weather isTimeToSyncWeatherRealtime ->weatherRealtimeInterval:" + i + ", weatherRealtime:" + bleWeatherRealtime);
        return new Date().getTime() - (((long) bleWeatherRealtime.getMTime()) * 1000) >= ((long) (i * TimeConstants.HOUR));
    }

    public final boolean OIi0() {
        return XXX11i;
    }

    /* JADX INFO: renamed from: OX */
    public final void m38237OX(Function1<? super tv6, Unit> function1) throws IllegalAccessException, InstantiationException {
        SPUtils sPUtilsXIi00iiXO = a01.OXO1.XIi00iiXO();
        Object objFromJson = new Gson().fromJson(sPUtilsXIi00iiXO.getString(tv6.class.getName()), (Class<Object>) tv6.class);
        if (objFromJson == null) {
            objFromJson = tv6.class.newInstance();
        }
        function1.invoke2(objFromJson);
        sPUtilsXIi00iiXO.put(tv6.class.getName(), new Gson().toJson(objFromJson));
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2909s5
    public void OXO1(@aa1 Application app) {
        Intrinsics.X0O(app, "app");
        O11XO1X.XO0O10().X1ii(this);
    }

    public final void X0O(double d, double d2, double d3) {
        String str;
        i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
        i1o0oxo1o.IiI10X("Weather requestWeatherRealtime -> lon:" + d + ",lat:" + d2 + ",altitude:" + d3);
        XXX11i = false;
        if (BleCache.INSTANCE.getMAGpsType() == 9) {
            IIX1OXO(new BleAgpsPrerequisite((float) d, (float) d2, (int) d3));
        }
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        HashMap<String, String> weatherRealtimeBody = RequestBodyKt.getWeatherRealtimeBody(d, d2);
        final WeatherInitializer$requestWeatherRealtime$1 weatherInitializer$requestWeatherRealtime$1 = new WeatherInitializer$requestWeatherRealtime$1(d3);
        Map<String, String> headersMap = netWorkUtils.getHeadersMap();
        final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(null, null);
        String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), GetWeatherRealtime.URL);
        i72 i72Var = i72.OXO1;
        if (!i72Var.II1Xi0()) {
            netWorkUtils.printParam(strConvertBaseUrl + GetWeatherRealtime.URL, kotlin.collections.OXO1.Ii0i(weatherRealtimeBody, headersMap));
            i1o0oxo1o.OXO1(UploadInfoManager.OXO1.XO0O10() + " getNewApiWeather : enableNewWeatherApi = " + i72Var.II1Xi0());
            NetWork netWork = NetWork.OXO1;
            String str2 = strConvertBaseUrl + GetWeatherRealtime.URL;
            final Activity activity = null;
            final O1XIiIO<Response<WeatherRealtime>> o1XIiIO = new O1XIiIO<Response<WeatherRealtime>>() { // from class: com.sma.smartv3.initializer.WeatherInitializer$requestWeatherRealtime$$inlined$getNewApiWeather$default$3
                @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
                public void handleResponse(Response<WeatherRealtime> response) {
                    NetWorkUtils netWorkUtils2 = NetWorkUtils.INSTANCE;
                    Activity activity2 = activity;
                    O1XIiIO o1XIiIO2 = weatherInitializer$requestWeatherRealtime$1;
                    C3006uq c3006uq = c3006uqLoadPopup;
                    LogUtils.m11128d(yn0.I0IIOi + response);
                    if (response == null) {
                        response = new Response<>();
                        response.setCode(-1000);
                    }
                    netWorkUtils2.responseWhenCheck(activity2, response, o1XIiIO2);
                    if (c3006uq != null) {
                        c3006uq.dismiss();
                    }
                }

                @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                public void handleError(String error) {
                    Intrinsics.X0O(error, "error");
                    NetWorkUtils.INSTANCE.errorData(error, weatherInitializer$requestWeatherRealtime$1, c3006uqLoadPopup);
                }
            };
            AndroidNetworking.post(str2).addBodyParameter((Map<String, String>) weatherRealtimeBody).setTag((Object) str2).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, WeatherRealtime.class), new ParsedRequestListener<Response<WeatherRealtime>>() { // from class: com.sma.smartv3.initializer.WeatherInitializer$requestWeatherRealtime$$inlined$getNewApiWeather$default$4
                @Override // com.androidnetworking.interfaces.ParsedRequestListener
                /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
                public void onResponse(Response<WeatherRealtime> response) {
                    Intrinsics.X0O(response, "response");
                    o1XIiIO.handleResponse(response);
                }

                @Override // com.androidnetworking.interfaces.ParsedRequestListener
                public void onError(ANError aNError) {
                    Response response;
                    StringBuilder sb = new StringBuilder();
                    sb.append("errorCode:");
                    Integer numValueOf = null;
                    sb.append(aNError != null ? Integer.valueOf(aNError.getErrorCode()) : null);
                    sb.append(", errorBody:");
                    sb.append(aNError != null ? aNError.getErrorBody() : null);
                    sb.append(", ");
                    sb.append(aNError != null ? aNError.getErrorDetail() : null);
                    LogUtils.m11128d(sb.toString());
                    if (aNError != null && (response = (Response) aNError.getErrorAsObject(Response.class)) != null) {
                        numValueOf = Integer.valueOf(response.getCode());
                    } else if (aNError != null) {
                        numValueOf = Integer.valueOf(aNError.getErrorCode());
                    }
                    o1XIiIO.handleError(String.valueOf(numValueOf));
                }
            });
            return;
        }
        if (oe5.XIIIO(GetWeatherRealtime.URL, GetWeatherRealtime.URL, true)) {
            str = GetWeatherRealtime.URL_V2;
        } else {
            str = oe5.XIIIO(GetWeatherRealtime.URL, GetWeatherForecast.URL, true) ? GetWeatherForecast.URL_V2 : GetWeatherRealtime.URL;
        }
        Map<String, String> mapX111IO = kotlin.collections.OXO1.X111IO(weatherRealtimeBody);
        try {
            if (mapX111IO.containsKey("lat")) {
                String str3 = mapX111IO.get("lat");
                Intrinsics.XXI(str3);
                mapX111IO.put("lat", new BigDecimal(str3).setScale(1, RoundingMode.DOWN).toString());
            }
            if (mapX111IO.containsKey("lon")) {
                String str4 = mapX111IO.get("lon");
                Intrinsics.XXI(str4);
                mapX111IO.put("lon", new BigDecimal(str4).setScale(1, RoundingMode.DOWN).toString());
            }
        } catch (Exception unused) {
        }
        String str5 = strConvertBaseUrl + GetWeatherRealtime.URL;
        Map<String, ? extends Object> mapX111IO2 = kotlin.collections.OXO1.X111IO(weatherRealtimeBody);
        mapX111IO2.putAll(headersMap);
        Unit unit = Unit.OXO1;
        netWorkUtils.printParam(str5, mapX111IO2);
        i1O0OXO1O.OXO1.OXO1(UploadInfoManager.OXO1.XO0O10() + " getNewApiWeather : enableNewWeatherApi = " + i72.OXO1.II1Xi0());
        NetWork netWork2 = NetWork.OXO1;
        String str6 = strConvertBaseUrl + str;
        final Activity activity2 = null;
        final O1XIiIO<Response<WeatherRealtime>> o1XIiIO2 = new O1XIiIO<Response<WeatherRealtime>>() { // from class: com.sma.smartv3.initializer.WeatherInitializer$requestWeatherRealtime$$inlined$getNewApiWeather$default$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(Response<WeatherRealtime> response) {
                NetWorkUtils netWorkUtils2 = NetWorkUtils.INSTANCE;
                Activity activity3 = activity2;
                O1XIiIO o1XIiIO3 = weatherInitializer$requestWeatherRealtime$1;
                C3006uq c3006uq = c3006uqLoadPopup;
                LogUtils.m11128d(yn0.I0IIOi + response);
                if (response == null) {
                    response = new Response<>();
                    response.setCode(-1000);
                }
                netWorkUtils2.responseWhenCheck(activity3, response, o1XIiIO3);
                if (c3006uq != null) {
                    c3006uq.dismiss();
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                NetWorkUtils.INSTANCE.errorData(error, weatherInitializer$requestWeatherRealtime$1, c3006uqLoadPopup);
            }
        };
        AndroidNetworking.get(str6).addQueryParameter(mapX111IO).setTag((Object) str6).addHeaders(headersMap).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, WeatherRealtime.class), new ParsedRequestListener<Response<WeatherRealtime>>() { // from class: com.sma.smartv3.initializer.WeatherInitializer$requestWeatherRealtime$$inlined$getNewApiWeather$default$2
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(Response<WeatherRealtime> response) {
                Intrinsics.X0O(response, "response");
                o1XIiIO2.handleResponse(response);
            }

            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            public void onError(ANError aNError) {
                Response response;
                StringBuilder sb = new StringBuilder();
                sb.append("errorCode:");
                Integer numValueOf = null;
                sb.append(aNError != null ? Integer.valueOf(aNError.getErrorCode()) : null);
                sb.append(", errorBody:");
                sb.append(aNError != null ? aNError.getErrorBody() : null);
                LogUtils.m11128d(sb.toString());
                if (aNError != null && (response = (Response) aNError.getErrorAsObject(Response.class)) != null) {
                    numValueOf = Integer.valueOf(response.getCode());
                } else if (aNError != null) {
                    numValueOf = Integer.valueOf(aNError.getErrorCode());
                }
                o1XIiIO2.handleError(String.valueOf(numValueOf));
            }
        });
    }

    public final void X1ii() {
        LogUtils.m11131v("Weather start requestWeather.....");
        ThreadUtils.executeByIo(new XIi00iiXO());
    }

    public final void XX0() {
        if (!XXX11i) {
            LogUtils.m11131v("Weather syncWeather -> the last Request not done");
            return;
        }
        if (!q62.OXO1.OXii10I()) {
            LogUtils.m11131v("Weather syncWeather -> Device does not support weather");
            m38237OX(new Function1() { // from class: com.android.mltcode.paycertificationapi.zu6
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return WeatherInitializer.OiIIX101O((tv6) obj);
                }
            });
            return;
        }
        if (!BleConnector.INSTANCE.isAvailable()) {
            LogUtils.m11131v("Weather syncWeather -> BleConnector is not available");
            m38237OX(new Function1() { // from class: com.android.mltcode.paycertificationapi.av6
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return WeatherInitializer.XiOIii1((tv6) obj);
                }
            });
        } else if (!OIX0iXi()) {
            LogUtils.m11131v("Weather syncWeather -> Not time to sync weather");
        } else if (BleInitializer.f51208IO.m38232OI()) {
            LogUtils.m11131v("Weather firmware update.....");
        } else {
            X1ii();
        }
    }

    @sf5(tag = b01.XiOIO)
    public final void XXI(@aa1 Object data) {
        Intrinsics.X0O(data, "data");
        if (BleConnector.INSTANCE.isBound()) {
            LogUtils.m11131v("Weather onLocationWhere");
            X1IX = C2743ns.XIi00iiXO(new OXO1(), false, 2, null);
        }
    }

    public final void XiOIO(boolean z) {
        XXX11i = z;
    }
}
