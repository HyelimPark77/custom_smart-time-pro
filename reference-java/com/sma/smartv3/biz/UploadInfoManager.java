package com.sma.smartv3.biz;

import android.app.Activity;
import android.app.Application;
import android.text.TextUtils;
import com.android.mltcode.paycertificationapi.C2702ms;
import com.android.mltcode.paycertificationapi.C2743ns;
import com.android.mltcode.paycertificationapi.C3006uq;
import com.android.mltcode.paycertificationapi.I01XX0;
import com.android.mltcode.paycertificationapi.IO0OI;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.oe5;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uz0;
import com.android.mltcode.paycertificationapi.yn0;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.ANRequest;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.ParsedRequestListener;
import com.blankj.utilcode.constant.PermissionConstants;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.PermissionUtils;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.blankj.utilcode.util.Utils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sma.androidnetworklib.method.NetWork;
import com.sma.androidnetworklib.model.Response;
import com.sma.smartv3.location.CustomLocation;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.model.WeatherRealtime;
import com.sma.smartv3.network.Api;
import com.sma.smartv3.network.AppUserUpdate;
import com.sma.smartv3.network.GetWeatherForecast;
import com.sma.smartv3.network.GetWeatherRealtime;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.network.NetWorkUtils$upload$$inlined$upload$1;
import com.sma.smartv3.network.RequestBodyKt;
import com.sma.smartv3.network.RequestCommonMethod;
import com.sma.smartv3.network.UploadNoLoginUserInfo;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.UtilsKt;
import com.szabh.smable3.component.BleConnector;
import java.io.File;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nUploadInfoManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UploadInfoManager.kt\ncom/sma/smartv3/biz/UploadInfoManager\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n*L\n1#1,252:1\n90#2:253\n19#2:254\n15#2:255\n90#2:256\n19#2:313\n15#2:314\n90#2:315\n90#2:376\n848#3,30:257\n878#3,3:288\n891#3,4:300\n905#3:312\n99#3,16:316\n123#3:355\n176#3,11:356\n196#3:375\n1#4:287\n226#5,8:291\n245#5:299\n252#5,7:304\n270#5:311\n116#5,23:332\n252#5,7:367\n270#5:374\n*S KotlinDebug\n*F\n+ 1 UploadInfoManager.kt\ncom/sma/smartv3/biz/UploadInfoManager\n*L\n64#1:253\n68#1:254\n68#1:255\n71#1:256\n156#1:313\n156#1:314\n159#1:315\n243#1:376\n123#1:257,30\n123#1:288,3\n123#1:300,4\n123#1:312\n184#1:316,16\n184#1:355\n211#1:356,11\n211#1:375\n123#1:287\n123#1:291,8\n123#1:299\n123#1:304,7\n123#1:311\n184#1:332,23\n211#1:367,7\n211#1:374\n*E\n"})
public final class UploadInfoManager {

    @aa1
    public static final UploadInfoManager OXO1 = new UploadInfoManager();

    @aa1
    public static final String XIi00iiXO = "UploadInfoManager";

    /* JADX INFO: renamed from: iO */
    @tb1
    public static C2702ms f50910iO;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void OIX0iXi(UploadInfoManager uploadInfoManager, AppUser appUser, O1XIiIO o1XIiIO, int i, Object obj) {
        if ((i & 2) != 0) {
            o1XIiIO = null;
        }
        uploadInfoManager.m38115IO(appUser, o1XIiIO);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void OIi0(UploadInfoManager uploadInfoManager, AppUser appUser, O1XIiIO o1XIiIO, int i, Object obj) {
        if ((i & 2) != 0) {
            o1XIiIO = null;
        }
        uploadInfoManager.I0IIOi(appUser, o1XIiIO);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: iO */
    public static /* synthetic */ void m38114iO(UploadInfoManager uploadInfoManager, double d, double d2, O1XIiIO o1XIiIO, int i, Object obj) {
        if ((i & 4) != 0) {
            o1XIiIO = null;
        }
        uploadInfoManager.XIi00iiXO(d, d2, o1XIiIO);
    }

    public final void I0IIOi(@aa1 AppUser appUser, @tb1 final O1XIiIO<String> o1XIiIO) {
        Intrinsics.X0O(appUser, "appUser");
        if (appUser.getHeight() == 0.0f && appUser.getWeight() == 0.0f) {
            ToastUtils.showLong(R.string.user_does_not_exist);
            return;
        }
        O00(appUser);
        LogUtils.m11128d(XIi00iiXO + " uploadLoginUserInfo -> " + appUser);
        final Activity activity = null;
        appUser.setThirdPlatform(null);
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        File fileI0IIOi = uz0.I0IIOi(sz0.OXO1);
        final O1XIiIO<AppUser> o1XIiIO2 = new O1XIiIO<AppUser>() { // from class: com.sma.smartv3.biz.UploadInfoManager$uploadLoginUserInfo$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(AppUser appUser2) {
                LogUtils.m11128d(UploadInfoManager.OXO1.XO0O10() + " save LoginUserInfo -> " + appUser2);
                a01.OXO1.IiI10X().put(AppUser.class.getName(), new Gson().toJson(appUser2));
                O1XIiIO<String> o1XIiIO3 = o1XIiIO;
                if (o1XIiIO3 != null) {
                    o1XIiIO3.handleResponse(new Gson().toJson(appUser2));
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                LogUtils.m11128d(UploadInfoManager.OXO1.XO0O10() + " uploadLoginUserInfo error -> " + error);
                O1XIiIO<String> o1XIiIO3 = o1XIiIO;
                if (o1XIiIO3 != null) {
                    o1XIiIO3.handleError(error);
                }
            }
        };
        final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(null, null);
        NetWork netWork = NetWork.OXO1;
        String str = Api.INSTANCE.getBASE_URL() + AppUserUpdate.URL;
        final O1XIiIO<Response<AppUser>> o1XIiIO3 = new O1XIiIO<Response<AppUser>>() { // from class: com.sma.smartv3.biz.UploadInfoManager$uploadLoginUserInfo$$inlined$upload$default$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(Response<AppUser> response) {
                NetWorkUtils netWorkUtils2 = NetWorkUtils.INSTANCE;
                Activity activity2 = activity;
                O1XIiIO o1XIiIO4 = o1XIiIO2;
                C3006uq c3006uq = c3006uqLoadPopup;
                LogUtils.m11128d(yn0.I0IIOi + response);
                if (response == null) {
                    response = new Response<>();
                    response.setCode(-1000);
                }
                netWorkUtils2.responseWhenCheck(activity2, response, o1XIiIO4);
                if (c3006uq != null) {
                    c3006uq.dismiss();
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                NetWorkUtils.INSTANCE.errorData(error, o1XIiIO2, c3006uqLoadPopup);
            }
        };
        ANRequest.MultiPartBuilder multiPartBuilderUpload = AndroidNetworking.upload(str);
        if (fileI0IIOi.exists()) {
            multiPartBuilderUpload.addMultipartFile("avatar", fileI0IIOi);
        }
        multiPartBuilderUpload.addMultipartParameter(appUser).setTag((Object) str).setPriority(Priority.HIGH).build().setUploadProgressListener(NetWorkUtils$upload$$inlined$upload$1.INSTANCE).getAsParsed(TypeToken.getParameterized(Response.class, AppUser.class), new ParsedRequestListener<Response<AppUser>>() { // from class: com.sma.smartv3.biz.UploadInfoManager$uploadLoginUserInfo$$inlined$upload$default$2
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(Response<AppUser> response) {
                Intrinsics.X0O(response, "response");
                o1XIiIO3.handleResponse(response);
            }

            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            public void onError(ANError aNError) {
                o1XIiIO3.handleError(String.valueOf(aNError));
            }
        });
    }

    public final void I0iXXO() {
        boolean z;
        a01 a01Var = a01.OXO1;
        SPUtils sPUtilsOXO1 = a01Var.OXO1();
        WeatherRealtime weatherRealtime = (WeatherRealtime) new Gson().fromJson(sPUtilsOXO1.getString(b01.X111IO + '_' + WeatherRealtime.class.getName()), WeatherRealtime.class);
        String str = XIi00iiXO;
        LogUtils.m11128d(str + " uploadPhoneInfo weather -> " + weatherRealtime);
        SPUtils sPUtilsIiI10X = a01Var.IiI10X();
        Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
        if (objFromJson != null) {
            appUser = objFromJson;
        }
        AppUser appUser2 = (AppUser) appUser;
        if (appUser2.getIdentity().length() == 0) {
            SPUtils sPUtilsOXO2 = a01Var.OXO1();
            AppUser appUser3 = (AppUser) new Gson().fromJson(sPUtilsOXO2.getString(b01.O0O + '_' + AppUser.class.getName()), AppUser.class);
            if (appUser3 == null) {
                OIX0iXi(this, appUser2, null, 2, null);
                return;
            } else {
                z = true;
                appUser2 = appUser3;
            }
        } else {
            z = false;
        }
        LogUtils.m11128d(str + " uploadPhoneInfo appUser -> " + z + " " + appUser2);
        if (weatherRealtime != null) {
            if (TextUtils.isEmpty(weatherRealtime.getName()) || Intrinsics.XOO0ii0(weatherRealtime.getName(), appUser2.getCity())) {
                return;
            }
            XOO0ii0();
            return;
        }
        if (PermissionUtils.isGranted(PermissionConstants.LOCATION)) {
            if (f50910iO == null) {
                f50910iO = C2743ns.XIi00iiXO(new IO0OI() { // from class: com.sma.smartv3.biz.UploadInfoManager$uploadPhoneInfo$1
                    @Override // com.android.mltcode.paycertificationapi.IO0OI
                    public void OXO1(CustomLocation location) {
                        Intrinsics.X0O(location, "location");
                        UploadInfoManager uploadInfoManager = UploadInfoManager.OXO1;
                        uploadInfoManager.XIi00iiXO(location.IiI10X(), location.XO0O10(), new O1XIiIO<WeatherRealtime>() { // from class: com.sma.smartv3.biz.UploadInfoManager$uploadPhoneInfo$1$onLocationChange$1
                            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
                            public void handleResponse(WeatherRealtime weatherRealtime2) throws IllegalAccessException, InstantiationException {
                                UploadInfoManager.OXO1.XOO0ii0();
                            }

                            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                            public void handleError(String error) {
                                Intrinsics.X0O(error, "error");
                            }
                        });
                        uploadInfoManager.IiI10X();
                    }

                    @Override // com.android.mltcode.paycertificationapi.IO0OI
                    public void onError(String message) {
                        Intrinsics.X0O(message, "message");
                        UploadInfoManager.OXO1.IiI10X();
                    }
                }, false, 2, null);
            }
            LogUtils.m11128d(str + " startLocation");
            C2702ms c2702ms = f50910iO;
            if (c2702ms != null) {
                c2702ms.IiI10X(R.string.get_weather_and_phone_get_location_desc, false);
            }
        }
    }

    /* JADX INFO: renamed from: IO */
    public final void m38115IO(@aa1 AppUser appUser, @tb1 final O1XIiIO<String> o1XIiIO) {
        Intrinsics.X0O(appUser, "appUser");
        O00(appUser);
        appUser.setServer(-1);
        LogUtils.m11128d(XIi00iiXO + " uploadNoLoginUserInfo -> " + appUser);
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        HashMap<String, String> uploadNoLoginUserInfo = RequestBodyKt.getUploadNoLoginUserInfo(appUser);
        final O1XIiIO<AppUser> o1XIiIO2 = new O1XIiIO<AppUser>() { // from class: com.sma.smartv3.biz.UploadInfoManager$uploadNoLoginUserInfo$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(AppUser appUser2) {
                LogUtils.m11128d(UploadInfoManager.OXO1.XO0O10() + " save NoLoginUserInfo -> " + appUser2);
                a01.OXO1.OXO1().put(b01.O0O + '_' + AppUser.class.getName(), new Gson().toJson(appUser2), false);
                I01XX0.XIi00iiXO(I01XX0.X0iO, null, 2, null);
                O1XIiIO<String> o1XIiIO3 = o1XIiIO;
                if (o1XIiIO3 != null) {
                    o1XIiIO3.handleResponse(new Gson().toJson(appUser2));
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                LogUtils.m11128d(UploadInfoManager.OXO1.XO0O10() + " uploadNoLoginUserInfo error -> " + error);
                O1XIiIO<String> o1XIiIO3 = o1XIiIO;
                if (o1XIiIO3 != null) {
                    o1XIiIO3.handleError(error);
                }
            }
        };
        final Activity activity = null;
        final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(null, null);
        String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), UploadNoLoginUserInfo.URL);
        netWorkUtils.printParam(strConvertBaseUrl + UploadNoLoginUserInfo.URL, uploadNoLoginUserInfo);
        NetWork netWork = NetWork.OXO1;
        String str = strConvertBaseUrl + UploadNoLoginUserInfo.URL;
        final O1XIiIO<Response<AppUser>> o1XIiIO3 = new O1XIiIO<Response<AppUser>>() { // from class: com.sma.smartv3.biz.UploadInfoManager$uploadNoLoginUserInfo$$inlined$post$default$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(Response<AppUser> response) {
                NetWorkUtils netWorkUtils2 = NetWorkUtils.INSTANCE;
                Activity activity2 = activity;
                O1XIiIO o1XIiIO4 = o1XIiIO2;
                C3006uq c3006uq = c3006uqLoadPopup;
                LogUtils.m11128d(yn0.I0IIOi + response);
                if (response == null) {
                    response = new Response<>();
                    response.setCode(-1000);
                }
                netWorkUtils2.responseWhenCheck(activity2, response, o1XIiIO4);
                if (c3006uq != null) {
                    c3006uq.dismiss();
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                NetWorkUtils.INSTANCE.errorData(error, o1XIiIO2, c3006uqLoadPopup);
            }
        };
        AndroidNetworking.post(str).addBodyParameter((Map<String, String>) uploadNoLoginUserInfo).setTag((Object) str).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, AppUser.class), new ParsedRequestListener<Response<AppUser>>() { // from class: com.sma.smartv3.biz.UploadInfoManager$uploadNoLoginUserInfo$$inlined$post$default$2
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(Response<AppUser> response) {
                Intrinsics.X0O(response, "response");
                o1XIiIO3.handleResponse(response);
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
                o1XIiIO3.handleError(String.valueOf(numValueOf));
            }
        });
    }

    public final void IiI10X() {
        C2702ms c2702ms = f50910iO;
        if (c2702ms != null) {
            c2702ms.I0IIOi();
        }
    }

    public final void O00(@aa1 AppUser appUser) {
        Intrinsics.X0O(appUser, "appUser");
        appUser.setServer(UtilsKt.iIXi1iiXI());
        appUser.setProjectId(58);
        appUser.setOsVersion(UtilsKt.X11iII1O1());
        appUser.setPhoneModel(UtilsKt.XXX11i());
        appUser.setPhoneIdentity(UtilsKt.XX1Oi());
        if (TextUtils.isEmpty(appUser.getCountry())) {
            Application app = Utils.getApp();
            Intrinsics.O10IXXX0X(app, "getApp(...)");
            appUser.setCountry(UtilsKt.iiiO(app));
        }
        SPUtils sPUtilsOXO1 = a01.OXO1.OXO1();
        WeatherRealtime weatherRealtime = (WeatherRealtime) new Gson().fromJson(sPUtilsOXO1.getString(b01.X111IO + '_' + WeatherRealtime.class.getName()), WeatherRealtime.class);
        if (weatherRealtime != null) {
            appUser.setCountry(weatherRealtime.getSys_country());
            if (!TextUtils.isEmpty(weatherRealtime.getName())) {
                appUser.setCity(weatherRealtime.getName());
            }
            appUser.setLongitude(weatherRealtime.getLon());
            appUser.setLatitude(weatherRealtime.getLat());
        }
    }

    public final void XIi00iiXO(double d, double d2, @tb1 final O1XIiIO<WeatherRealtime> o1XIiIO) {
        String str;
        Type type;
        LogUtils.m11128d(XIi00iiXO + " getCity -> " + d + ", " + d2);
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        HashMap<String, String> weatherRealtimeBody = RequestBodyKt.getWeatherRealtimeBody(d, d2);
        final O1XIiIO<WeatherRealtime> o1XIiIO2 = new O1XIiIO<WeatherRealtime>() { // from class: com.sma.smartv3.biz.UploadInfoManager$getCity$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(WeatherRealtime weatherRealtime) {
                LogUtils.m11128d(UploadInfoManager.OXO1.XO0O10() + " getWeather -> " + weatherRealtime);
                a01.OXO1.OXO1().put(b01.X111IO + '_' + WeatherRealtime.class.getName(), new Gson().toJson(weatherRealtime), false);
                O1XIiIO<WeatherRealtime> o1XIiIO3 = o1XIiIO;
                if (o1XIiIO3 != null) {
                    o1XIiIO3.handleResponse(weatherRealtime);
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                O1XIiIO<WeatherRealtime> o1XIiIO3 = o1XIiIO;
                if (o1XIiIO3 != null) {
                    o1XIiIO3.handleError(error);
                }
            }
        };
        Map<String, String> headersMap = netWorkUtils.getHeadersMap();
        final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(null, null);
        String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), GetWeatherRealtime.URL);
        i72 i72Var = i72.OXO1;
        if (!i72Var.II1Xi0()) {
            netWorkUtils.printParam(strConvertBaseUrl + GetWeatherRealtime.URL, kotlin.collections.OXO1.Ii0i(weatherRealtimeBody, headersMap));
            i1O0OXO1O.OXO1.OXO1(OXO1.XO0O10() + " getNewApiWeather : enableNewWeatherApi = " + i72Var.II1Xi0());
            NetWork netWork = NetWork.OXO1;
            String str2 = strConvertBaseUrl + GetWeatherRealtime.URL;
            final Activity activity = null;
            final O1XIiIO<Response<WeatherRealtime>> o1XIiIO3 = new O1XIiIO<Response<WeatherRealtime>>() { // from class: com.sma.smartv3.biz.UploadInfoManager$getCity$$inlined$getNewApiWeather$default$3
                @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
                public void handleResponse(Response<WeatherRealtime> response) {
                    NetWorkUtils netWorkUtils2 = NetWorkUtils.INSTANCE;
                    Activity activity2 = activity;
                    O1XIiIO o1XIiIO4 = o1XIiIO2;
                    C3006uq c3006uq = c3006uqLoadPopup;
                    LogUtils.m11128d(yn0.I0IIOi + response);
                    if (response == null) {
                        response = new Response<>();
                        response.setCode(-1000);
                    }
                    netWorkUtils2.responseWhenCheck(activity2, response, o1XIiIO4);
                    if (c3006uq != null) {
                        c3006uq.dismiss();
                    }
                }

                @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                public void handleError(String error) {
                    Intrinsics.X0O(error, "error");
                    NetWorkUtils.INSTANCE.errorData(error, o1XIiIO2, c3006uqLoadPopup);
                }
            };
            AndroidNetworking.post(str2).addBodyParameter((Map<String, String>) weatherRealtimeBody).setTag((Object) str2).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, WeatherRealtime.class), new ParsedRequestListener<Response<WeatherRealtime>>() { // from class: com.sma.smartv3.biz.UploadInfoManager$getCity$$inlined$getNewApiWeather$default$4
                @Override // com.androidnetworking.interfaces.ParsedRequestListener
                /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
                public void onResponse(Response<WeatherRealtime> response) {
                    Intrinsics.X0O(response, "response");
                    o1XIiIO3.handleResponse(response);
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
                    o1XIiIO3.handleError(String.valueOf(numValueOf));
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
                type = WeatherRealtime.class;
                try {
                    mapX111IO.put("lat", new BigDecimal(str3).setScale(1, RoundingMode.DOWN).toString());
                } catch (Exception unused) {
                }
            } else {
                type = WeatherRealtime.class;
            }
            if (mapX111IO.containsKey("lon")) {
                String str4 = mapX111IO.get("lon");
                Intrinsics.XXI(str4);
                mapX111IO.put("lon", new BigDecimal(str4).setScale(1, RoundingMode.DOWN).toString());
            }
        } catch (Exception unused2) {
            type = WeatherRealtime.class;
        }
        String str5 = strConvertBaseUrl + GetWeatherRealtime.URL;
        Map<String, ? extends Object> mapX111IO2 = kotlin.collections.OXO1.X111IO(weatherRealtimeBody);
        mapX111IO2.putAll(headersMap);
        Unit unit = Unit.OXO1;
        netWorkUtils.printParam(str5, mapX111IO2);
        i1O0OXO1O.OXO1.OXO1(OXO1.XO0O10() + " getNewApiWeather : enableNewWeatherApi = " + i72.OXO1.II1Xi0());
        NetWork netWork2 = NetWork.OXO1;
        String str6 = strConvertBaseUrl + str;
        final Activity activity2 = null;
        final O1XIiIO<Response<WeatherRealtime>> o1XIiIO4 = new O1XIiIO<Response<WeatherRealtime>>() { // from class: com.sma.smartv3.biz.UploadInfoManager$getCity$$inlined$getNewApiWeather$default$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(Response<WeatherRealtime> response) {
                NetWorkUtils netWorkUtils2 = NetWorkUtils.INSTANCE;
                Activity activity3 = activity2;
                O1XIiIO o1XIiIO5 = o1XIiIO2;
                C3006uq c3006uq = c3006uqLoadPopup;
                LogUtils.m11128d(yn0.I0IIOi + response);
                if (response == null) {
                    response = new Response<>();
                    response.setCode(-1000);
                }
                netWorkUtils2.responseWhenCheck(activity3, response, o1XIiIO5);
                if (c3006uq != null) {
                    c3006uq.dismiss();
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                NetWorkUtils.INSTANCE.errorData(error, o1XIiIO2, c3006uqLoadPopup);
            }
        };
        AndroidNetworking.get(str6).addQueryParameter(mapX111IO).setTag((Object) str6).addHeaders(headersMap).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, type), new ParsedRequestListener<Response<WeatherRealtime>>() { // from class: com.sma.smartv3.biz.UploadInfoManager$getCity$$inlined$getNewApiWeather$default$2
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(Response<WeatherRealtime> response) {
                Intrinsics.X0O(response, "response");
                o1XIiIO4.handleResponse(response);
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
                o1XIiIO4.handleError(String.valueOf(numValueOf));
            }
        });
    }

    @aa1
    public final String XO0O10() {
        return XIi00iiXO;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x00a5  */
    public final void XOO0ii0() throws IllegalAccessException, InstantiationException {
        boolean z;
        if (BleConnector.INSTANCE.isBound()) {
            RequestCommonMethod.INSTANCE.updateDeviceInfo(new O1XIiIO<String>() { // from class: com.sma.smartv3.biz.UploadInfoManager$uploadInfo$1
                @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
                public void handleResponse(String str) {
                    LogUtils.m11128d(UploadInfoManager.OXO1.XO0O10() + " updateDeviceInfo -> " + str);
                }

                @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                public void handleError(String error) {
                    Intrinsics.X0O(error, "error");
                    LogUtils.m11128d(UploadInfoManager.OXO1.XO0O10() + " updateDeviceInfo error -> " + error);
                }
            });
            return;
        }
        a01 a01Var = a01.OXO1;
        SPUtils sPUtilsIiI10X = a01Var.IiI10X();
        Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
        if (objFromJson != null) {
            appUser = objFromJson;
        }
        if (((AppUser) appUser).getIdentity().length() == 0) {
            SPUtils sPUtilsOXO1 = a01Var.OXO1();
            AppUser appUser2 = (AppUser) new Gson().fromJson(sPUtilsOXO1.getString(b01.O0O + '_' + AppUser.class.getName()), AppUser.class);
            if (appUser2 != null) {
                z = true;
                appUser = appUser2;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        if (z) {
            OIX0iXi(this, (AppUser) appUser, null, 2, null);
        } else {
            OIi0(this, (AppUser) appUser, null, 2, null);
        }
    }
}
