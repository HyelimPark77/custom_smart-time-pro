package com.sma.smartv3.network;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;
import com.android.mltcode.paycertificationapi.C3006uq;
import com.android.mltcode.paycertificationapi.O0X11OiO;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.OOiOOO1OI;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.i72;
import com.android.mltcode.paycertificationapi.oe5;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.yn0;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.ParsedRequestListener;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.RegexUtils;
import com.blankj.utilcode.util.SPUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.facebook.internal.security.CertificateUtil;
import com.google.firebase.crashlytics.buildtools.reloc.org.apache.commons.cli.HelpFormatter;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sma.androidnetworklib.method.NetWork;
import com.sma.androidnetworklib.model.Response;
import com.sma.smartv3.biz.UploadInfoManager;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.model.BleDevice;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.UtilsKt;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.component.BaseBleCache;
import com.szabh.smable3.component.BleCache;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes19.dex */
@SourceDebugExtension({"SMAP\nRequestCommonMethod.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RequestCommonMethod.kt\ncom/sma/smartv3/network/RequestCommonMethod\n+ 2 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 3 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n+ 4 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,133:1\n183#2,4:134\n196#2:146\n176#2,11:150\n196#2:169\n176#2,11:173\n196#2:192\n252#3,7:138\n270#3:145\n252#3,7:161\n270#3:168\n252#3,7:184\n270#3:191\n19#4:147\n15#4:148\n90#4:149\n18#4,2:170\n15#4:172\n*S KotlinDebug\n*F\n+ 1 RequestCommonMethod.kt\ncom/sma/smartv3/network/RequestCommonMethod\n*L\n56#1:134,4\n56#1:146\n100#1:150,11\n100#1:169\n130#1:173,11\n130#1:192\n56#1:138,7\n56#1:145\n100#1:161,7\n100#1:168\n130#1:184,7\n130#1:191\n77#1:147\n77#1:148\n80#1:149\n115#1:170,2\n115#1:172\n*E\n"})
public final class RequestCommonMethod {

    @aa1
    public static final RequestCommonMethod INSTANCE = new RequestCommonMethod();

    private RequestCommonMethod() {
    }

    public static /* synthetic */ String getPhoneWithCode$default(RequestCommonMethod requestCommonMethod, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "+86";
        }
        return requestCommonMethod.getPhoneWithCode(str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void requestVerificationCode$default(RequestCommonMethod requestCommonMethod, Activity activity, View view, String str, TextView textView, int i, O1XIiIO o1XIiIO, int i2, Object obj) {
        if ((i2 & 16) != 0) {
            i = 0;
        }
        int i3 = i;
        if ((i2 & 32) != 0) {
            o1XIiIO = null;
        }
        requestCommonMethod.requestVerificationCode(activity, view, str, textView, i3, o1XIiIO);
    }

    @aa1
    public final String getPhoneWithCode(@aa1 String code, @aa1 String text) {
        Intrinsics.X0O(code, "code");
        Intrinsics.X0O(text, "text");
        return code + HelpFormatter.DEFAULT_OPT_PREFIX + text;
    }

    public final void requestVerificationCode(@aa1 final Activity context, @tb1 View view, @aa1 String text, @aa1 final TextView showCountDownTimeView, int i, @tb1 final O1XIiIO<String> o1XIiIO) {
        Intrinsics.X0O(context, "context");
        Intrinsics.X0O(text, "text");
        Intrinsics.X0O(showCountDownTimeView, "showCountDownTimeView");
        if (StringsKt__StringsKt.iIi011O(text, "@", false, 2, null) || text.length() == 0) {
            if (!RegexUtils.isEmail(text)) {
                ToastUtils.showShort(R.string.email_format_error);
                return;
            }
        } else {
            if (!UtilsKt.IXOIIIO(text)) {
                ToastUtils.showShort(R.string.input_phone_format_error);
                return;
            }
            text = getPhoneWithCode$default(this, null, text, 1, null);
        }
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        HashMap<String, String> verificationCodeBody = RequestBodyKt.getVerificationCodeBody(text, i);
        final O1XIiIO<String> o1XIiIO2 = new O1XIiIO<String>() { // from class: com.sma.smartv3.network.RequestCommonMethod.requestVerificationCode.1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                O1XIiIO<String> o1XIiIO3 = o1XIiIO;
                if (o1XIiIO3 != null) {
                    o1XIiIO3.handleError(error);
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleResponse(String str) {
                ToastUtils.showLong(R.string.code_send_success);
                O0X11OiO.X100O(context, i72.OXO1.X01IiOiIi(), 1000L, showCountDownTimeView);
                O1XIiIO<String> o1XIiIO3 = o1XIiIO;
                if (o1XIiIO3 != null) {
                    o1XIiIO3.handleResponse(str);
                }
            }
        };
        final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(context, view);
        String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), VerificationCodeRequest.URL);
        netWorkUtils.printParam(strConvertBaseUrl + VerificationCodeRequest.URL, verificationCodeBody);
        NetWork netWork = NetWork.OXO1;
        String str = strConvertBaseUrl + VerificationCodeRequest.URL;
        final O1XIiIO<Response<String>> o1XIiIO3 = new O1XIiIO<Response<String>>() { // from class: com.sma.smartv3.network.RequestCommonMethod$requestVerificationCode$$inlined$post$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                NetWorkUtils.INSTANCE.errorData(error, o1XIiIO2, c3006uqLoadPopup);
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleResponse(Response<String> response) {
                NetWorkUtils netWorkUtils2 = NetWorkUtils.INSTANCE;
                Activity activity = context;
                O1XIiIO o1XIiIO4 = o1XIiIO2;
                C3006uq c3006uq = c3006uqLoadPopup;
                LogUtils.m11128d(yn0.I0IIOi + response);
                if (response == null) {
                    response = new Response<>();
                    response.setCode(-1000);
                }
                netWorkUtils2.responseWhenCheck(activity, response, o1XIiIO4);
                if (c3006uq != null) {
                    c3006uq.dismiss();
                }
            }
        };
        AndroidNetworking.post(str).addBodyParameter((Map<String, String>) verificationCodeBody).setTag((Object) str).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, String.class), new ParsedRequestListener<Response<String>>() { // from class: com.sma.smartv3.network.RequestCommonMethod$requestVerificationCode$$inlined$post$2
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

            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            public void onResponse(Response<String> response) {
                Intrinsics.X0O(response, "response");
                o1XIiIO3.handleResponse(response);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:13:0x00b5  */
    public final void updateDeviceInfo(@aa1 final O1XIiIO<String> callback) throws IllegalAccessException, InstantiationException {
        boolean z;
        Intrinsics.X0O(callback, "callback");
        final Activity activity = null;
        if (!i72.OXO1.X00110X()) {
            Object objFromJson = new Gson().fromJson(a01.OXO1.IiI10X().getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
            if (objFromJson == null) {
                objFromJson = AppUser.class.newInstance();
            }
            AppUser appUser = (AppUser) objFromJson;
            BleDevice bleDeviceOXO1 = OOiOOO1OI.OXO1.OXO1();
            HashMap map = new HashMap();
            map.put("identity", appUser.getIdentity());
            map.put("projectId", String.valueOf(appUser.getProjectId()));
            map.put("name", bleDeviceOXO1.getName());
            map.put("address", bleDeviceOXO1.getAddress());
            map.put("platform", bleDeviceOXO1.getPlatform());
            map.put("prototype", bleDeviceOXO1.getPrototype());
            map.put("firmwareFlag", bleDeviceOXO1.getFirmwareFlag());
            map.put("agpsType", String.valueOf(bleDeviceOXO1.getAgpsType()));
            map.put("version", bleDeviceOXO1.getVersion());
            map.put("extraInfo", bleDeviceOXO1.getExtraInfo());
            map.put("settings", bleDeviceOXO1.getSettings());
            NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
            final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(null, null);
            String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), UpdateDevice.URL);
            netWorkUtils.printParam(strConvertBaseUrl + UpdateDevice.URL, map);
            NetWork netWork = NetWork.OXO1;
            String str = strConvertBaseUrl + UpdateDevice.URL;
            final O1XIiIO<Response<String>> o1XIiIO = new O1XIiIO<Response<String>>() { // from class: com.sma.smartv3.network.RequestCommonMethod$updateDeviceInfo$$inlined$post$default$3
                @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                public void handleError(String error) {
                    Intrinsics.X0O(error, "error");
                    NetWorkUtils.INSTANCE.errorData(error, callback, c3006uqLoadPopup);
                }

                @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                public void handleResponse(Response<String> response) {
                    NetWorkUtils netWorkUtils2 = NetWorkUtils.INSTANCE;
                    Activity activity2 = activity;
                    O1XIiIO o1XIiIO2 = callback;
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
            };
            AndroidNetworking.post(str).addBodyParameter((Map<String, String>) map).setTag((Object) str).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, String.class), new ParsedRequestListener<Response<String>>() { // from class: com.sma.smartv3.network.RequestCommonMethod$updateDeviceInfo$$inlined$post$default$4
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

                @Override // com.androidnetworking.interfaces.ParsedRequestListener
                public void onResponse(Response<String> response) {
                    Intrinsics.X0O(response, "response");
                    o1XIiIO.handleResponse(response);
                }
            });
            return;
        }
        a01 a01Var = a01.OXO1;
        SPUtils sPUtilsIiI10X = a01Var.IiI10X();
        Object appUser2 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object objFromJson2 = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
        if (objFromJson2 != null) {
            appUser2 = objFromJson2;
        }
        if (((AppUser) appUser2).getIdentity().length() == 0) {
            SPUtils sPUtilsOXO1 = a01Var.OXO1();
            AppUser appUser3 = (AppUser) new Gson().fromJson(sPUtilsOXO1.getString(b01.O0O + '_' + AppUser.class.getName()), AppUser.class);
            if (appUser3 != null) {
                appUser2 = appUser3;
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        BleDevice bleDeviceOXO2 = OOiOOO1OI.OXO1.OXO1();
        HashMap map2 = new HashMap();
        AppUser appUser4 = (AppUser) appUser2;
        map2.put("identity", appUser4.getIdentity());
        map2.put("projectId", RequestBodyKt.PROJECT_ID);
        map2.put("bleName", bleDeviceOXO2.getName());
        map2.put("macAddress", oe5.IXO0OOi(bleDeviceOXO2.getAddress(), CertificateUtil.DELIMITER, "", false, 4, null));
        map2.put("platform", String.valueOf(UtilsKt.X1IX()));
        map2.put("devicePrototype", bleDeviceOXO2.getPrototype());
        map2.put("flag", bleDeviceOXO2.getFirmwareFlag());
        map2.put("firmwareVersion", bleDeviceOXO2.getVersion());
        map2.put("uiVersion", BaseBleCache.getString$default(BleCache.INSTANCE, BleKey.UI_PACK_VERSION, null, null, 6, null));
        map2.put("fontVersion", "0.0.1");
        NetWorkUtils netWorkUtils2 = NetWorkUtils.INSTANCE;
        final O1XIiIO<String> o1XIiIO2 = new O1XIiIO<String>() { // from class: com.sma.smartv3.network.RequestCommonMethod.updateDeviceInfo.2
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleResponse(String str2) {
            }
        };
        final C3006uq c3006uqLoadPopup2 = netWorkUtils2.loadPopup(null, null);
        String strConvertBaseUrl2 = netWorkUtils2.convertBaseUrl(Api.INSTANCE.getBASE_URL(), UpdateDevice2.URL);
        netWorkUtils2.printParam(strConvertBaseUrl2 + UpdateDevice2.URL, map2);
        NetWork netWork2 = NetWork.OXO1;
        String str2 = strConvertBaseUrl2 + UpdateDevice2.URL;
        final O1XIiIO<Response<String>> o1XIiIO3 = new O1XIiIO<Response<String>>() { // from class: com.sma.smartv3.network.RequestCommonMethod$updateDeviceInfo$$inlined$post$default$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                NetWorkUtils.INSTANCE.errorData(error, o1XIiIO2, c3006uqLoadPopup2);
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleResponse(Response<String> response) {
                NetWorkUtils netWorkUtils3 = NetWorkUtils.INSTANCE;
                Activity activity2 = activity;
                O1XIiIO o1XIiIO4 = o1XIiIO2;
                C3006uq c3006uq = c3006uqLoadPopup2;
                LogUtils.m11128d(yn0.I0IIOi + response);
                if (response == null) {
                    response = new Response<>();
                    response.setCode(-1000);
                }
                netWorkUtils3.responseWhenCheck(activity2, response, o1XIiIO4);
                if (c3006uq != null) {
                    c3006uq.dismiss();
                }
            }
        };
        AndroidNetworking.post(str2).addBodyParameter((Map<String, String>) map2).setTag((Object) str2).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, String.class), new ParsedRequestListener<Response<String>>() { // from class: com.sma.smartv3.network.RequestCommonMethod$updateDeviceInfo$$inlined$post$default$2
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

            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            public void onResponse(Response<String> response) {
                Intrinsics.X0O(response, "response");
                o1XIiIO3.handleResponse(response);
            }
        });
        appUser4.setSettings(bleDeviceOXO2.getSettings());
        if (z) {
            UploadInfoManager.OXO1.m38115IO(appUser4, callback);
        } else {
            UploadInfoManager.OXO1.I0IIOi(appUser4, callback);
        }
    }
}
