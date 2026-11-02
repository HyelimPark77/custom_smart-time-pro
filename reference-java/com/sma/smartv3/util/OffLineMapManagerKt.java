package com.sma.smartv3.util;

import android.app.Activity;
import android.view.View;
import com.android.mltcode.paycertificationapi.C3006uq;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.yb2;
import com.android.mltcode.paycertificationapi.yn0;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.ParsedRequestListener;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ironsource.C11921G5;
import com.sma.androidnetworklib.method.NetWork;
import com.sma.androidnetworklib.model.Response;
import com.sma.smartv3.model.OffLineAuthInfo;
import com.sma.smartv3.model.OffLineGenerateFileVo;
import com.sma.smartv3.model.OffLineUserSession;
import com.sma.smartv3.network.GetGomoreAuthKey;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.OffLineMapManagerKt;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.BleKeyFlag;
import com.szabh.smable3.component.BaseBleConnector;
import com.szabh.smable3.component.BleCache;
import com.szabh.smable3.component.BleConnector;
import com.szabh.smable3.entity.BleOptionalMapAuthInfo;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.OXO1;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nOffLineMapManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OffLineMapManager.kt\ncom/sma/smartv3/util/OffLineMapManagerKt\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 4 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n*L\n1#1,190:1\n18#2,2:191\n15#2:193\n15#2:224\n18#2,2:225\n15#2:227\n27#2,2:250\n18#2,2:252\n15#2:254\n304#3,11:194\n323#3:223\n312#3,3:228\n323#3:249\n282#3,11:255\n301#3:275\n383#4,18:205\n383#4,18:231\n278#4,8:266\n298#4:274\n*S KotlinDebug\n*F\n+ 1 OffLineMapManager.kt\ncom/sma/smartv3/util/OffLineMapManagerKt\n*L\n45#1:191,2\n45#1:193\n94#1:224\n103#1:225,2\n103#1:227\n133#1:250,2\n154#1:252,2\n154#1:254\n54#1:194,11\n54#1:223\n109#1:228,3\n109#1:249\n160#1:255,11\n160#1:275\n54#1:205,18\n109#1:231,18\n160#1:266,8\n160#1:274\n*E\n"})
public final class OffLineMapManagerKt {

    @aa1
    public static final String OXO1 = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCntVNj2x3Kw/0EndhE8+zOianIG0TdPtMrAwWPRwHLdNsd02lE4KsmkZW/9Ac1uno54vydj7D6/Bb0UAKJ5LaocX6nZ66DtYVKPS2Vr45F0shSnzJTGInk68EwrdWRWmZuNccVkDfntIKCjcbw5ha1lZ9EG66hBrJEJHR0Ru2/kwIDAQAB";

    @aa1
    public static final String XIi00iiXO = "https://map.iipii.net/user/login";

    /* JADX INFO: renamed from: iO */
    @aa1
    public static final String f54919iO = "https://map.iipii.net/optionalMap/generateFile";

    /* JADX INFO: renamed from: IO */
    public static /* synthetic */ void m38833IO(String str, String str2, Function1 function1, int i, Object obj) throws IllegalAccessException, InstantiationException {
        if ((i & 1) != 0) {
            str = "18928414055";
        }
        if ((i & 2) != 0) {
            str2 = yb2.OXO1.OXO1("666666", OXO1);
        }
        if ((i & 4) != 0) {
            function1 = null;
        }
        OIi0(str, str2, function1);
    }

    public static final Unit IiI10X(final String str, final Activity activity, boolean z) throws IllegalAccessException, InstantiationException {
        if (z) {
            i1O0OXO1O.OXO1.OXO1("getOffLineAuthInfo ->");
            HashMap map = new HashMap();
            map.put(GetGomoreAuthKey.DEVICE_ID, str);
            map.put("type", "0001");
            Object objFromJson = new Gson().fromJson(a01.OXO1.OXO1().getString(OffLineUserSession.class.getName()), (Class<Object>) OffLineUserSession.class);
            if (objFromJson == null) {
                objFromJson = OffLineUserSession.class.newInstance();
            }
            OffLineUserSession offLineUserSession = (OffLineUserSession) objFromJson;
            HashMap map2 = new HashMap();
            map2.put("Content-Type", C11921G5.f28906L);
            map2.put("token", offLineUserSession.getToken());
            map2.put("userId", offLineUserSession.getUserId());
            NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
            final O1XIiIO<OffLineAuthInfo> o1XIiIO = new O1XIiIO<OffLineAuthInfo>() { // from class: com.sma.smartv3.util.OffLineMapManagerKt$getOffLineAuthInfo$1$1
                @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
                public void handleResponse(OffLineAuthInfo offLineAuthInfo) {
                    i1O0OXO1O.OXO1.OXO1("getOffLineAuthInfo handleResponse");
                    if (offLineAuthInfo != null) {
                        BleOptionalMapAuthInfo bleOptionalMapAuthInfo = new BleOptionalMapAuthInfo(str, offLineAuthInfo.getAuthCode());
                        BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.OPTIONAL_MAP_AUTH_INFO, BleKeyFlag.UPDATE, bleOptionalMapAuthInfo, false, false, 24, null);
                        a01.OXO1.m1440iO().put(BleOptionalMapAuthInfo.class.getName(), new Gson().toJson(bleOptionalMapAuthInfo));
                    }
                }

                @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                public void handleError(String error) {
                    Intrinsics.X0O(error, "error");
                    OffLineMapManagerKt.m38834iO(error);
                    i1O0OXO1O.OXO1.OXO1("getOffLineAuthInfo error = " + error);
                }
            };
            final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(activity, null);
            netWorkUtils.printParam("https://map.iipii.net/auth/getAuthInfo", OXO1.Ii0i(OXO1.Ii0i(OXO1.m39417I1(), map2), map));
            NetWork netWork = NetWork.OXO1;
            final O1XIiIO<Response<OffLineAuthInfo>> o1XIiIO2 = new O1XIiIO<Response<OffLineAuthInfo>>() { // from class: com.sma.smartv3.util.OffLineMapManagerKt$getOffLineAuthInfo$lambda$0$$inlined$postParameterThirdParty$default$1
                @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
                public void handleResponse(Response<OffLineAuthInfo> response) {
                    NetWorkUtils netWorkUtils2 = NetWorkUtils.INSTANCE;
                    Activity activity2 = activity;
                    O1XIiIO o1XIiIO3 = o1XIiIO;
                    C3006uq c3006uq = c3006uqLoadPopup;
                    LogUtils.m11128d(yn0.I0IIOi + response);
                    if (response == null) {
                        response = new Response<>();
                        response.setCode(-1000);
                    }
                    netWorkUtils2.responseWhenCheck(activity2, response, o1XIiIO3);
                    if (c3006uq != null) {
                        c3006uq.dismiss();
                    }
                }

                @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                public void handleError(String error) {
                    Intrinsics.X0O(error, "error");
                    NetWorkUtils.INSTANCE.errorData(error, o1XIiIO, c3006uqLoadPopup);
                }
            };
            AndroidNetworking.post("https://map.iipii.net/auth/getAuthInfo").addHeaders((Map<String, String>) map2).addBodyParameter((Map<String, String>) map).setTag((Object) "https://map.iipii.net/auth/getAuthInfo").setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, OffLineAuthInfo.class), new ParsedRequestListener<Response<OffLineAuthInfo>>() { // from class: com.sma.smartv3.util.OffLineMapManagerKt$getOffLineAuthInfo$lambda$0$$inlined$postParameterThirdParty$default$2
                @Override // com.androidnetworking.interfaces.ParsedRequestListener
                /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
                public void onResponse(Response<OffLineAuthInfo> response) {
                    Intrinsics.X0O(response, "response");
                    o1XIiIO2.handleResponse(response);
                }

                @Override // com.androidnetworking.interfaces.ParsedRequestListener
                public void onError(ANError aNError) {
                    Response response;
                    if (aNError != null) {
                        aNError.printStackTrace();
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("errorCode:");
                    Integer numValueOf = null;
                    sb.append(aNError != null ? Integer.valueOf(aNError.getErrorCode()) : null);
                    sb.append(", errorBody:");
                    sb.append(aNError != null ? aNError.getErrorBody() : null);
                    sb.append(", errorDetail:");
                    sb.append(aNError != null ? aNError.getErrorDetail() : null);
                    sb.append(", exception:");
                    sb.append(aNError != null ? aNError.getLocalizedMessage() : null);
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
        return Unit.OXO1;
    }

    public static /* synthetic */ void O00(String str, Activity activity, int i, Object obj) throws IllegalAccessException, InstantiationException {
        if ((i & 2) != 0) {
            activity = null;
        }
        XO0O10(str, activity);
    }

    public static final void OIi0(@aa1 String phone, @aa1 String pwd, @tb1 final Function1<? super Boolean, Unit> function1) throws IllegalAccessException, InstantiationException {
        Intrinsics.X0O(phone, "phone");
        Intrinsics.X0O(pwd, "pwd");
        Object objFromJson = new Gson().fromJson(a01.OXO1.OXO1().getString(OffLineUserSession.class.getName()), (Class<Object>) OffLineUserSession.class);
        if (objFromJson == null) {
            objFromJson = OffLineUserSession.class.newInstance();
        }
        if (((OffLineUserSession) objFromJson).getToken().length() != 0) {
            if (function1 != null) {
                function1.invoke2(Boolean.TRUE);
                return;
            }
            return;
        }
        i1O0OXO1O.OXO1.OXO1("offLineUserLogin ->");
        HashMap map = new HashMap();
        map.put("pwd", pwd);
        map.put("phone", phone);
        HashMap map2 = new HashMap();
        map2.put("Content-Type", C11921G5.f28906L);
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        final O1XIiIO<OffLineUserSession> o1XIiIO = new O1XIiIO<OffLineUserSession>() { // from class: com.sma.smartv3.util.OffLineMapManagerKt$onOffLineUserLogin$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(OffLineUserSession offLineUserSession) throws IllegalAccessException, InstantiationException {
                i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
                i1o0oxo1o.OXO1("offLineUserLogin handleResponse result: " + offLineUserSession);
                if (offLineUserSession != null) {
                    a01.OXO1.OXO1().put(OffLineUserSession.class.getName(), new Gson().toJson(offLineUserSession));
                    Function1<Boolean, Unit> function2 = function1;
                    if (function2 != null) {
                        function2.invoke2(Boolean.TRUE);
                    }
                } else {
                    Function1<Boolean, Unit> function3 = function1;
                    if (function3 != null) {
                        function3.invoke2(Boolean.FALSE);
                    }
                }
                Object objFromJson2 = new Gson().fromJson(a01.OXO1.OXO1().getString(OffLineUserSession.class.getName()), (Class<Object>) OffLineUserSession.class);
                if (objFromJson2 == null) {
                    objFromJson2 = OffLineUserSession.class.newInstance();
                }
                i1o0oxo1o.OXO1("offLineUserLogin Preference Result:" + ((OffLineUserSession) objFromJson2));
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                i1O0OXO1O.OXO1.OXO1("offLineUserLogin error = " + error);
                ToastUtils.showLong(error, new Object[0]);
                Function1<Boolean, Unit> function2 = function1;
                if (function2 != null) {
                    function2.invoke2(Boolean.FALSE);
                }
            }
        };
        final Activity activity = null;
        final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(null, null);
        netWorkUtils.printParam(XIi00iiXO, OXO1.Ii0i(OXO1.Ii0i(OXO1.m39417I1(), map2), map));
        NetWork netWork = NetWork.OXO1;
        final O1XIiIO<Response<OffLineUserSession>> o1XIiIO2 = new O1XIiIO<Response<OffLineUserSession>>() { // from class: com.sma.smartv3.util.OffLineMapManagerKt$onOffLineUserLogin$$inlined$postJsonThirdParty$default$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(Response<OffLineUserSession> response) {
                NetWorkUtils netWorkUtils2 = NetWorkUtils.INSTANCE;
                Activity activity2 = activity;
                O1XIiIO o1XIiIO3 = o1XIiIO;
                C3006uq c3006uq = c3006uqLoadPopup;
                LogUtils.m11128d(yn0.I0IIOi + response);
                if (response == null) {
                    response = new Response<>();
                    response.setCode(-1000);
                }
                netWorkUtils2.responseWhenCheck(activity2, response, o1XIiIO3);
                if (c3006uq != null) {
                    c3006uq.dismiss();
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                NetWorkUtils.INSTANCE.errorData(error, o1XIiIO, c3006uqLoadPopup);
            }
        };
        AndroidNetworking.post(XIi00iiXO).addHeaders((Map<String, String>) map2).addApplicationJsonBody(map).setTag((Object) XIi00iiXO).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, OffLineUserSession.class), new ParsedRequestListener<Response<OffLineUserSession>>() { // from class: com.sma.smartv3.util.OffLineMapManagerKt$onOffLineUserLogin$$inlined$postJsonThirdParty$default$2
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(Response<OffLineUserSession> response) {
                Intrinsics.X0O(response, "response");
                o1XIiIO2.handleResponse(response);
            }

            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            public void onError(ANError aNError) {
                o1XIiIO2.handleError(String.valueOf(aNError));
            }
        });
    }

    public static final void XO0O10(@aa1 final String uuid, @tb1 final Activity activity) throws IllegalAccessException, InstantiationException {
        Intrinsics.X0O(uuid, "uuid");
        m38833IO(null, null, new Function1() { // from class: com.android.mltcode.paycertificationapi.wd1
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return OffLineMapManagerKt.IiI10X(uuid, activity, ((Boolean) obj).booleanValue());
            }
        }, 3, null);
    }

    public static final void XOO0ii0(double d, double d2, double d3, double d4, double d5, double d6, @tb1 final Activity activity, @tb1 View view, @tb1 final Function1<? super OffLineGenerateFileVo, Unit> function1) throws IllegalAccessException, InstantiationException {
        String mUuid;
        i1O0OXO1O.OXO1.OXO1("offLineGenerateFile ->");
        HashMap map = new HashMap();
        map.put("minLongitude", Double.valueOf(d));
        map.put("minLatitude", Double.valueOf(d2));
        map.put("maxLongitude", Double.valueOf(d3));
        map.put("maxLatitude", Double.valueOf(d4));
        a01 a01Var = a01.OXO1;
        BleOptionalMapAuthInfo bleOptionalMapAuthInfo = (BleOptionalMapAuthInfo) new Gson().fromJson(a01Var.m1440iO().getString(BleOptionalMapAuthInfo.class.getName()), BleOptionalMapAuthInfo.class);
        map.put("type", 1);
        if (bleOptionalMapAuthInfo == null || (mUuid = bleOptionalMapAuthInfo.getMUuid()) == null) {
            mUuid = "";
        }
        map.put("deviceUuid", mUuid);
        BleCache bleCache = BleCache.INSTANCE;
        map.put("manufacturer", bleCache.getMPlatform());
        map.put("model", bleCache.getMPrototype());
        map.put("reservedStorage", 0);
        map.put("locationLat", Double.valueOf(d6));
        map.put("locationLon", Double.valueOf(d5));
        Object objFromJson = new Gson().fromJson(a01Var.OXO1().getString(OffLineUserSession.class.getName()), (Class<Object>) OffLineUserSession.class);
        if (objFromJson == null) {
            objFromJson = OffLineUserSession.class.newInstance();
        }
        OffLineUserSession offLineUserSession = (OffLineUserSession) objFromJson;
        HashMap map2 = new HashMap();
        map2.put("Content-Type", C11921G5.f28906L);
        map2.put("token", offLineUserSession.getToken());
        map2.put("userId", offLineUserSession.getUserId());
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        final O1XIiIO<OffLineGenerateFileVo> o1XIiIO = new O1XIiIO<OffLineGenerateFileVo>() { // from class: com.sma.smartv3.util.OffLineMapManagerKt$getOffLineGenerateFile$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(OffLineGenerateFileVo offLineGenerateFileVo) {
                i1O0OXO1O.OXO1.OXO1("offLineGenerateFile handleResponse");
                if (offLineGenerateFileVo != null) {
                    Function1<OffLineGenerateFileVo, Unit> function2 = function1;
                    if (function2 != null) {
                        function2.invoke2(offLineGenerateFileVo);
                        return;
                    }
                    return;
                }
                Function1<OffLineGenerateFileVo, Unit> function3 = function1;
                if (function3 != null) {
                    function3.invoke2(null);
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                i1O0OXO1O.OXO1.OXO1("offLineGenerateFile error = " + error);
                OffLineMapManagerKt.m38834iO(error);
                Function1<OffLineGenerateFileVo, Unit> function2 = function1;
                if (function2 != null) {
                    function2.invoke2(null);
                }
            }
        };
        final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(activity, view);
        netWorkUtils.printParam(f54919iO, OXO1.Ii0i(OXO1.Ii0i(OXO1.m39417I1(), map2), map));
        NetWork netWork = NetWork.OXO1;
        final O1XIiIO<Response<OffLineGenerateFileVo>> o1XIiIO2 = new O1XIiIO<Response<OffLineGenerateFileVo>>() { // from class: com.sma.smartv3.util.OffLineMapManagerKt$getOffLineGenerateFile$$inlined$postJsonThirdParty$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(Response<OffLineGenerateFileVo> response) {
                NetWorkUtils netWorkUtils2 = NetWorkUtils.INSTANCE;
                Activity activity2 = activity;
                O1XIiIO o1XIiIO3 = o1XIiIO;
                C3006uq c3006uq = c3006uqLoadPopup;
                LogUtils.m11128d(yn0.I0IIOi + response);
                if (response == null) {
                    response = new Response<>();
                    response.setCode(-1000);
                }
                netWorkUtils2.responseWhenCheck(activity2, response, o1XIiIO3);
                if (c3006uq != null) {
                    c3006uq.dismiss();
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                NetWorkUtils.INSTANCE.errorData(error, o1XIiIO, c3006uqLoadPopup);
            }
        };
        AndroidNetworking.post(f54919iO).addHeaders((Map<String, String>) map2).addApplicationJsonBody(map).setTag((Object) f54919iO).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, OffLineGenerateFileVo.class), new ParsedRequestListener<Response<OffLineGenerateFileVo>>() { // from class: com.sma.smartv3.util.OffLineMapManagerKt$getOffLineGenerateFile$$inlined$postJsonThirdParty$2
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(Response<OffLineGenerateFileVo> response) {
                Intrinsics.X0O(response, "response");
                o1XIiIO2.handleResponse(response);
            }

            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            public void onError(ANError aNError) {
                o1XIiIO2.handleError(String.valueOf(aNError));
            }
        });
    }

    /* JADX INFO: renamed from: iO */
    public static final void m38834iO(String str) {
        if (StringsKt__StringsKt.OO1101010(str, "非法请求", 0, false, 6, null) > -1) {
            a01.OXO1.OXO1().remove(OffLineUserSession.class.getName());
            ToastUtils.showLong(R.string.request_error);
        } else if (StringsKt__StringsKt.OO1101010(str, "12002", 0, false, 6, null) > -1) {
            ToastUtils.showLong(R.string.map_request_error);
        } else {
            ToastUtils.showLong(str, new Object[0]);
        }
    }
}
