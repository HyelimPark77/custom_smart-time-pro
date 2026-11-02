package com.sma.smartv3.biz;

import android.app.Activity;
import com.android.mltcode.paycertificationapi.C3006uq;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.yn0;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.ParsedRequestListener;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.SPUtils;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.sma.androidnetworklib.method.NetWork;
import com.sma.androidnetworklib.model.Response;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.model.BGEMMeasurementData;
import com.sma.smartv3.model.BGEMRangeAnalysisResult;
import com.sma.smartv3.model.BGEMResponse;
import com.sma.smartv3.model.BGEMUser;
import com.sma.smartv3.network.Api;
import com.sma.smartv3.network.BGEMAnalysis;
import com.sma.smartv3.network.BGEMUserAuthorise;
import com.sma.smartv3.network.BGEMUserUpdate;
import com.sma.smartv3.network.BGEMeasurementByDate;
import com.sma.smartv3.network.BGEMeasurementById;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.network.RequestBodyKt;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nBGEMManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BGEMManager.kt\ncom/sma/smartv3/biz/BGEMManager\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n*L\n1#1,158:1\n19#2:159\n15#2:160\n19#2:184\n15#2:185\n235#3,11:161\n246#3:173\n256#3:183\n235#3,11:186\n246#3:198\n256#3:208\n349#3,12:209\n371#3:239\n153#3,11:240\n164#3:252\n174#3:262\n153#3,11:263\n164#3:275\n174#3:285\n1#4:172\n1#4:197\n1#4:251\n1#4:274\n278#5,8:174\n298#5:182\n278#5,8:199\n298#5:207\n383#5,18:221\n226#5,8:253\n245#5:261\n226#5,8:276\n245#5:284\n*S KotlinDebug\n*F\n+ 1 BGEMManager.kt\ncom/sma/smartv3/biz/BGEMManager\n*L\n32#1:159\n32#1:160\n55#1:184\n55#1:185\n33#1:161,11\n33#1:173\n33#1:183\n56#1:186,11\n56#1:198\n56#1:208\n82#1:209,12\n82#1:239\n117#1:240,11\n117#1:252\n117#1:262\n142#1:263,11\n142#1:275\n142#1:285\n33#1:172\n56#1:197\n117#1:251\n142#1:274\n33#1:174,8\n33#1:182\n56#1:199,8\n56#1:207\n82#1:221,18\n117#1:253,8\n117#1:261\n142#1:276,8\n142#1:284\n*E\n"})
public final class BGEMManager {

    @aa1
    public static final BGEMManager OXO1 = new BGEMManager();

    @aa1
    public static final String XIi00iiXO = "BGEMManager";

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void I0IIOi(BGEMManager bGEMManager, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        bGEMManager.XOO0ii0(function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: IO */
    public static /* synthetic */ void m38087IO(BGEMManager bGEMManager, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        bGEMManager.OIi0(function1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void IiI10X(BGEMManager bGEMManager, String str, O1XIiIO o1XIiIO, int i, Object obj) {
        if ((i & 2) != 0) {
            o1XIiIO = null;
        }
        bGEMManager.O00(str, o1XIiIO);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void XIi00iiXO(BGEMManager bGEMManager, Object obj, O1XIiIO o1XIiIO, int i, Object obj2) {
        if ((i & 2) != 0) {
            o1XIiIO = null;
        }
        bGEMManager.OXO1(obj, o1XIiIO);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void XO0O10(BGEMManager bGEMManager, String str, String str2, O1XIiIO o1XIiIO, int i, Object obj) {
        if ((i & 4) != 0) {
            o1XIiIO = null;
        }
        bGEMManager.m38088iO(str, str2, o1XIiIO);
    }

    public final void O00(@aa1 String measurementId, @tb1 final O1XIiIO<BGEMRangeAnalysisResult> o1XIiIO) {
        Intrinsics.X0O(measurementId, "measurementId");
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        String url = BGEMeasurementById.INSTANCE.getURL(measurementId);
        Map<String, String> mapM39417I1 = kotlin.collections.OXO1.m39417I1();
        final O1XIiIO<BGEMRangeAnalysisResult> o1XIiIO2 = new O1XIiIO<BGEMRangeAnalysisResult>() { // from class: com.sma.smartv3.biz.BGEMManager$measurementById$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(BGEMRangeAnalysisResult bGEMRangeAnalysisResult) {
                i1O0OXO1O.OXO1.OXO1("BGEMManager measurementById handleResponse -> " + bGEMRangeAnalysisResult);
                O1XIiIO<BGEMRangeAnalysisResult> o1XIiIO3 = o1XIiIO;
                if (o1XIiIO3 != null) {
                    o1XIiIO3.handleResponse(bGEMRangeAnalysisResult);
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                i1O0OXO1O.OXO1.OXO1("BGEMManager measurementById handleError -> " + error);
                O1XIiIO<BGEMRangeAnalysisResult> o1XIiIO3 = o1XIiIO;
                if (o1XIiIO3 != null) {
                    o1XIiIO3.handleError(error);
                }
            }
        };
        Map<String, String> headersMap = netWorkUtils.getHeadersMap();
        final Activity activity = null;
        final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(null, null);
        String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), url);
        Map<String, ? extends Object> mapX111IO = kotlin.collections.OXO1.X111IO(mapM39417I1);
        mapX111IO.putAll(headersMap);
        Unit unit = Unit.OXO1;
        netWorkUtils.printParam(strConvertBaseUrl + url, mapX111IO);
        NetWork netWork = NetWork.OXO1;
        String str = strConvertBaseUrl + url;
        final O1XIiIO<Response<BGEMRangeAnalysisResult>> o1XIiIO3 = new O1XIiIO<Response<BGEMRangeAnalysisResult>>() { // from class: com.sma.smartv3.biz.BGEMManager$measurementById$$inlined$getV2$default$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(Response<BGEMRangeAnalysisResult> response) {
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
        AndroidNetworking.get(str).addQueryParameter(mapM39417I1).setTag((Object) str).addHeaders(headersMap).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, BGEMRangeAnalysisResult.class), new ParsedRequestListener<Response<BGEMRangeAnalysisResult>>() { // from class: com.sma.smartv3.biz.BGEMManager$measurementById$$inlined$getV2$default$2
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(Response<BGEMRangeAnalysisResult> response) {
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

    public final void OIi0(@tb1 final Function1<? super Boolean, Unit> function1) {
        SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
        Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
        if (objFromJson != null) {
            appUser = objFromJson;
        }
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        HashMap<String, String> bGEMUserBody = RequestBodyKt.getBGEMUserBody(BGEMUser.Companion.m38251of((AppUser) appUser));
        final O1XIiIO<BGEMUser> o1XIiIO = new O1XIiIO<BGEMUser>() { // from class: com.sma.smartv3.biz.BGEMManager$userUpdate$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(BGEMUser bGEMUser) {
                i1O0OXO1O.OXO1.OXO1("BGEMManager userUpdate handleResponse -> " + bGEMUser);
                a01.OXO1.IiI10X().put(BGEMUser.class.getName(), new Gson().toJson(bGEMUser));
                Function1<Boolean, Unit> function2 = function1;
                if (function2 != null) {
                    function2.invoke2(Boolean.TRUE);
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                i1O0OXO1O.OXO1.OXO1("BGEMManager userUpdate handleError -> " + error);
                Function1<Boolean, Unit> function2 = function1;
                if (function2 != null) {
                    function2.invoke2(Boolean.FALSE);
                }
            }
        };
        Map<String, String> headersMap = netWorkUtils.getHeadersMap();
        final Activity activity = null;
        final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(null, null);
        String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), BGEMUserUpdate.URL);
        String str = strConvertBaseUrl + BGEMUserUpdate.URL;
        Map<String, ? extends Object> mapX111IO = kotlin.collections.OXO1.X111IO(bGEMUserBody);
        mapX111IO.putAll(headersMap);
        Unit unit = Unit.OXO1;
        netWorkUtils.printParam(str, mapX111IO);
        NetWork netWork = NetWork.OXO1;
        String str2 = strConvertBaseUrl + BGEMUserUpdate.URL;
        final O1XIiIO<Response<BGEMUser>> o1XIiIO2 = new O1XIiIO<Response<BGEMUser>>() { // from class: com.sma.smartv3.biz.BGEMManager$userUpdate$$inlined$postV2$default$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(Response<BGEMUser> response) {
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
        AndroidNetworking.post(str2).addHeaders(headersMap).addBodyParameter((Map<String, String>) bGEMUserBody).setTag((Object) str2).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, BGEMUser.class), new ParsedRequestListener<Response<BGEMUser>>() { // from class: com.sma.smartv3.biz.BGEMManager$userUpdate$$inlined$postV2$default$2
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(Response<BGEMUser> response) {
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

    public final void OXO1(@aa1 Object measurementData, @tb1 final O1XIiIO<BGEMResponse<BGEMMeasurementData>> o1XIiIO) {
        Intrinsics.X0O(measurementData, "measurementData");
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        final O1XIiIO<JsonObject> o1XIiIO2 = new O1XIiIO<JsonObject>() { // from class: com.sma.smartv3.biz.BGEMManager$analysis$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(JsonObject jsonObject) {
                i1O0OXO1O.OXO1.OXO1("BGEMManager analysis handleResponse -> " + jsonObject);
                try {
                    Object objFromJson = new Gson().fromJson(jsonObject, TypeToken.getParameterized(BGEMResponse.class, BGEMMeasurementData.class));
                    Intrinsics.X1ii(objFromJson, "null cannot be cast to non-null type com.sma.smartv3.model.BGEMResponse<com.sma.smartv3.model.BGEMMeasurementData>");
                    BGEMResponse<BGEMMeasurementData> bGEMResponse = (BGEMResponse) objFromJson;
                    O1XIiIO<BGEMResponse<BGEMMeasurementData>> o1XIiIO3 = o1XIiIO;
                    if (o1XIiIO3 != null) {
                        o1XIiIO3.handleResponse(bGEMResponse);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    O1XIiIO<BGEMResponse<BGEMMeasurementData>> o1XIiIO4 = o1XIiIO;
                    if (o1XIiIO4 != null) {
                        String localizedMessage = e.getLocalizedMessage();
                        Intrinsics.O10IXXX0X(localizedMessage, "getLocalizedMessage(...)");
                        o1XIiIO4.handleError(localizedMessage);
                    }
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                i1O0OXO1O.OXO1.OXO1("BGEMManager analysis handleError -> " + error);
                O1XIiIO<BGEMResponse<BGEMMeasurementData>> o1XIiIO3 = o1XIiIO;
                if (o1XIiIO3 != null) {
                    o1XIiIO3.handleError(error);
                }
            }
        };
        Map<String, String> headersMap = netWorkUtils.getHeadersMap();
        final Activity activity = null;
        final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(null, null);
        String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), BGEMAnalysis.URL);
        netWorkUtils.printParam(strConvertBaseUrl + BGEMAnalysis.URL, headersMap);
        NetWork netWork = NetWork.OXO1;
        String str = strConvertBaseUrl + BGEMAnalysis.URL;
        final O1XIiIO<Response<JsonObject>> o1XIiIO3 = new O1XIiIO<Response<JsonObject>>() { // from class: com.sma.smartv3.biz.BGEMManager$analysis$$inlined$postJsonV2$default$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(Response<JsonObject> response) {
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
        AndroidNetworking.post(str).addHeaders(headersMap).addApplicationJsonBody(measurementData).setTag((Object) str).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, JsonObject.class), new ParsedRequestListener<Response<JsonObject>>() { // from class: com.sma.smartv3.biz.BGEMManager$analysis$$inlined$postJsonV2$default$2
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(Response<JsonObject> response) {
                Intrinsics.X0O(response, "response");
                o1XIiIO3.handleResponse(response);
            }

            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            public void onError(ANError aNError) {
                o1XIiIO3.handleError(String.valueOf(aNError));
            }
        });
    }

    public final void XOO0ii0(@tb1 final Function1<? super Boolean, Unit> function1) {
        SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
        Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
        if (objFromJson != null) {
            appUser = objFromJson;
        }
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        HashMap<String, String> bGEMUserBody = RequestBodyKt.getBGEMUserBody(BGEMUser.Companion.m38251of((AppUser) appUser));
        final O1XIiIO<BGEMUser> o1XIiIO = new O1XIiIO<BGEMUser>() { // from class: com.sma.smartv3.biz.BGEMManager$userAuthorise$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(BGEMUser bGEMUser) {
                i1O0OXO1O.OXO1.OXO1("BGEMManager userAuthorise handleResponse -> " + bGEMUser);
                a01.OXO1.IiI10X().put(BGEMUser.class.getName(), new Gson().toJson(bGEMUser));
                Function1<Boolean, Unit> function2 = function1;
                if (function2 != null) {
                    function2.invoke2(Boolean.TRUE);
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                i1O0OXO1O.OXO1.OXO1("BGEMManager userAuthorise handleError -> " + error);
                Function1<Boolean, Unit> function2 = function1;
                if (function2 != null) {
                    function2.invoke2(Boolean.FALSE);
                }
            }
        };
        Map<String, String> headersMap = netWorkUtils.getHeadersMap();
        final Activity activity = null;
        final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(null, null);
        String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), BGEMUserAuthorise.URL);
        String str = strConvertBaseUrl + BGEMUserAuthorise.URL;
        Map<String, ? extends Object> mapX111IO = kotlin.collections.OXO1.X111IO(bGEMUserBody);
        mapX111IO.putAll(headersMap);
        Unit unit = Unit.OXO1;
        netWorkUtils.printParam(str, mapX111IO);
        NetWork netWork = NetWork.OXO1;
        String str2 = strConvertBaseUrl + BGEMUserAuthorise.URL;
        final O1XIiIO<Response<BGEMUser>> o1XIiIO2 = new O1XIiIO<Response<BGEMUser>>() { // from class: com.sma.smartv3.biz.BGEMManager$userAuthorise$$inlined$postV2$default$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(Response<BGEMUser> response) {
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
        AndroidNetworking.post(str2).addHeaders(headersMap).addBodyParameter((Map<String, String>) bGEMUserBody).setTag((Object) str2).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, BGEMUser.class), new ParsedRequestListener<Response<BGEMUser>>() { // from class: com.sma.smartv3.biz.BGEMManager$userAuthorise$$inlined$postV2$default$2
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(Response<BGEMUser> response) {
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

    /* JADX INFO: renamed from: iO */
    public final void m38088iO(@aa1 String startDate, @aa1 String endDate, @tb1 final O1XIiIO<BGEMRangeAnalysisResult[]> o1XIiIO) {
        Intrinsics.X0O(startDate, "startDate");
        Intrinsics.X0O(endDate, "endDate");
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        String url = BGEMeasurementByDate.INSTANCE.getURL(startDate, endDate);
        Map<String, String> mapM39417I1 = kotlin.collections.OXO1.m39417I1();
        final O1XIiIO<BGEMRangeAnalysisResult[]> o1XIiIO2 = new O1XIiIO<BGEMRangeAnalysisResult[]>() { // from class: com.sma.smartv3.biz.BGEMManager$measurementByDate$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(BGEMRangeAnalysisResult[] bGEMRangeAnalysisResultArr) {
                i1O0OXO1O.OXO1.OXO1("BGEMManager measurementByDate handleResponse -> " + (bGEMRangeAnalysisResultArr != null ? Integer.valueOf(bGEMRangeAnalysisResultArr.length) : null));
                O1XIiIO<BGEMRangeAnalysisResult[]> o1XIiIO3 = o1XIiIO;
                if (o1XIiIO3 != null) {
                    o1XIiIO3.handleResponse(bGEMRangeAnalysisResultArr);
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                i1O0OXO1O.OXO1.OXO1("BGEMManager measurementByDate handleError -> " + error);
                O1XIiIO<BGEMRangeAnalysisResult[]> o1XIiIO3 = o1XIiIO;
                if (o1XIiIO3 != null) {
                    o1XIiIO3.handleError(error);
                }
            }
        };
        Map<String, String> headersMap = netWorkUtils.getHeadersMap();
        final Activity activity = null;
        final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(null, null);
        String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), url);
        Map<String, ? extends Object> mapX111IO = kotlin.collections.OXO1.X111IO(mapM39417I1);
        mapX111IO.putAll(headersMap);
        Unit unit = Unit.OXO1;
        netWorkUtils.printParam(strConvertBaseUrl + url, mapX111IO);
        NetWork netWork = NetWork.OXO1;
        String str = strConvertBaseUrl + url;
        final O1XIiIO<Response<BGEMRangeAnalysisResult[]>> o1XIiIO3 = new O1XIiIO<Response<BGEMRangeAnalysisResult[]>>() { // from class: com.sma.smartv3.biz.BGEMManager$measurementByDate$$inlined$getV2$default$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(Response<BGEMRangeAnalysisResult[]> response) {
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
        AndroidNetworking.get(str).addQueryParameter(mapM39417I1).setTag((Object) str).addHeaders(headersMap).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, BGEMRangeAnalysisResult[].class), new ParsedRequestListener<Response<BGEMRangeAnalysisResult[]>>() { // from class: com.sma.smartv3.biz.BGEMManager$measurementByDate$$inlined$getV2$default$2
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(Response<BGEMRangeAnalysisResult[]> response) {
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
}
