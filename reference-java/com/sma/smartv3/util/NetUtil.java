package com.sma.smartv3.util;

import android.app.Activity;
import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.C3006uq;
import com.android.mltcode.paycertificationapi.I100X1;
import com.android.mltcode.paycertificationapi.IXOX0Xiii;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.iX0XiO;
import com.android.mltcode.paycertificationapi.ii0iIIX0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.yn0;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.ParsedRequestListener;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.SPUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sma.androidnetworklib.method.NetWork;
import com.sma.androidnetworklib.model.Response;
import com.sma.smartv3.dto.ThirdPartyDeviceData;
import com.sma.smartv3.model.AITranslatorText;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.network.Api;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.network.ToTranslatorText;
import com.sma.smartv3.p610ui.device.model.ThirdPartyDeviceFilterData;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.net.NetResult;
import com.sma.smartv3.util.websocket.data.TranslateOrderEntity;
import com.sma.smartv3.util.websocket.data.TranslationTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.OXO1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nNetUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetUtil.kt\ncom/sma/smartv3/util/NetUtil\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 4 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,164:1\n19#2:165\n15#2:166\n176#3,11:167\n196#3:186\n235#3,11:187\n246#3:199\n256#3:209\n252#4,7:178\n270#4:185\n278#4,8:200\n298#4:208\n1#5:198\n*S KotlinDebug\n*F\n+ 1 NetUtil.kt\ncom/sma/smartv3/util/NetUtil\n*L\n57#1:165\n57#1:166\n68#1:167,11\n68#1:186\n92#1:187,11\n92#1:199\n92#1:209\n68#1:178,7\n68#1:185\n92#1:200,8\n92#1:208\n92#1:198\n*E\n"})
public final class NetUtil {

    @aa1
    public static final NetUtil OXO1 = new NetUtil();

    @tb1
    public final Object IiI10X(@aa1 String str, @aa1 String str2, @aa1 String str3, @aa1 Continuation<? super NetResult<AITranslatorText>> continuation) throws Throwable {
        final SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.O00(continuation));
        HashMap mapXXX11i = OXO1.XXX11i(TuplesKt.OXO1(ToTranslatorText.FLAG_TEXT_FORM, str), TuplesKt.OXO1(ToTranslatorText.FLAG_TRANSLATION_LANGUAGE, str3), TuplesKt.OXO1(ToTranslatorText.FLAG_ORIGINAL_LANGUAGE, str2), TuplesKt.OXO1("source", "microsoft"));
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        final O1XIiIO<AITranslatorText> o1XIiIO = new O1XIiIO<AITranslatorText>() { // from class: com.sma.smartv3.util.NetUtil$getTransText$2$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(AITranslatorText aITranslatorText) {
                if (aITranslatorText == null || aITranslatorText.getText().length() <= 0) {
                    Continuation<NetResult<AITranslatorText>> continuation2 = safeContinuation;
                    Result.Companion companion = Result.Companion;
                    continuation2.resumeWith(Result.m48333constructorimpl(new NetResult.OXO1(UtilsKt.XXO(R.string.failed_in_translation))));
                } else {
                    Continuation<NetResult<AITranslatorText>> continuation3 = safeContinuation;
                    Result.Companion companion2 = Result.Companion;
                    continuation3.resumeWith(Result.m48333constructorimpl(new NetResult.XIi00iiXO(aITranslatorText)));
                }
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                Continuation<NetResult<AITranslatorText>> continuation2 = safeContinuation;
                Result.Companion companion = Result.Companion;
                continuation2.resumeWith(Result.m48333constructorimpl(new NetResult.OXO1(error)));
            }
        };
        Map<String, String> headersMap = netWorkUtils.getHeadersMap();
        final Activity activity = null;
        final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(null, null);
        String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), ToTranslatorText.URL);
        String str4 = strConvertBaseUrl + ToTranslatorText.URL;
        Map<String, ? extends Object> mapX111IO = OXO1.X111IO(mapXXX11i);
        mapX111IO.putAll(headersMap);
        Unit unit = Unit.OXO1;
        netWorkUtils.printParam(str4, mapX111IO);
        NetWork netWork = NetWork.OXO1;
        String str5 = strConvertBaseUrl + ToTranslatorText.URL;
        final O1XIiIO<Response<AITranslatorText>> o1XIiIO2 = new O1XIiIO<Response<AITranslatorText>>() { // from class: com.sma.smartv3.util.NetUtil$getTransText$lambda$0$$inlined$postV2$default$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(Response<AITranslatorText> response) {
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
        AndroidNetworking.post(str5).addHeaders(headersMap).addBodyParameter((Map<String, String>) mapXXX11i).setTag((Object) str5).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, AITranslatorText.class), new ParsedRequestListener<Response<AITranslatorText>>() { // from class: com.sma.smartv3.util.NetUtil$getTransText$lambda$0$$inlined$postV2$default$2
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(Response<AITranslatorText> response) {
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
        Object objXIi00iiXO = safeContinuation.XIi00iiXO();
        if (objXIi00iiXO == C2798pb.I0iXXO()) {
            DebugProbesKt.m39475iO(continuation);
        }
        return objXIi00iiXO;
    }

    @tb1
    public final Object O00(int i, int i2, @aa1 Continuation<? super NetResult<TranslateOrderEntity>> continuation) throws Throwable {
        final SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.O00(continuation));
        SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
        Object appUser = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
        if (objFromJson != null) {
            appUser = objFromJson;
        }
        AppUser appUser2 = (AppUser) appUser;
        if (appUser2.getIdentity().length() == 0) {
            Result.Companion companion = Result.Companion;
            safeContinuation.resumeWith(Result.m48333constructorimpl(new NetResult.OXO1(UtilsKt.XXO(R.string.user_no_login))));
        } else {
            HashMap mapXXX11i = OXO1.XXX11i(TuplesKt.OXO1("identity", appUser2.getIdentity()), TuplesKt.OXO1("pageNum", String.valueOf(i)), TuplesKt.OXO1("pageSize", String.valueOf(i2)), TuplesKt.OXO1("orderType", "Translate"));
            NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
            final O1XIiIO<TranslateOrderEntity> o1XIiIO = new O1XIiIO<TranslateOrderEntity>() { // from class: com.sma.smartv3.util.NetUtil$getTransOrderList$2$1
                @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
                public void handleResponse(TranslateOrderEntity translateOrderEntity) {
                    i1O0OXO1O.OXO1.OXO1("TransOrderList:" + translateOrderEntity);
                    Continuation<NetResult<TranslateOrderEntity>> continuation2 = safeContinuation;
                    Result.Companion companion2 = Result.Companion;
                    continuation2.resumeWith(Result.m48333constructorimpl(new NetResult.XIi00iiXO(translateOrderEntity)));
                }

                @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                public void handleError(String error) {
                    Intrinsics.X0O(error, "error");
                    i1O0OXO1O.OXO1.OXO1("TransOrderList:" + error);
                    Continuation<NetResult<TranslateOrderEntity>> continuation2 = safeContinuation;
                    Result.Companion companion2 = Result.Companion;
                    continuation2.resumeWith(Result.m48333constructorimpl(new NetResult.OXO1(error)));
                }
            };
            final Activity activity = null;
            final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(null, null);
            String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), "/order/select");
            netWorkUtils.printParam(strConvertBaseUrl + "/order/select", mapXXX11i);
            NetWork netWork = NetWork.OXO1;
            String str = strConvertBaseUrl + "/order/select";
            final O1XIiIO<Response<TranslateOrderEntity>> o1XIiIO2 = new O1XIiIO<Response<TranslateOrderEntity>>() { // from class: com.sma.smartv3.util.NetUtil$getTransOrderList$lambda$0$$inlined$post$default$1
                @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
                public void handleResponse(Response<TranslateOrderEntity> response) {
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
            AndroidNetworking.post(str).addBodyParameter((Map<String, String>) mapXXX11i).setTag((Object) str).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, TranslateOrderEntity.class), new ParsedRequestListener<Response<TranslateOrderEntity>>() { // from class: com.sma.smartv3.util.NetUtil$getTransOrderList$lambda$0$$inlined$post$default$2
                @Override // com.androidnetworking.interfaces.ParsedRequestListener
                /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
                public void onResponse(Response<TranslateOrderEntity> response) {
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
                    sb.append(", ");
                    sb.append(aNError != null ? aNError.getErrorDetail() : null);
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
        Object objXIi00iiXO = safeContinuation.XIi00iiXO();
        if (objXIi00iiXO == C2798pb.I0iXXO()) {
            DebugProbesKt.m39475iO(continuation);
        }
        return objXIi00iiXO;
    }

    @aa1
    public final ii0iIIX0<NetResult<ThirdPartyDeviceData>> OXO1(@aa1 String text) {
        Intrinsics.X0O(text, "text");
        return iX0XiO.iIX0i(iX0XiO.X00O0(new NetUtil$activeThirdDevice$1(text, null)), IXOX0Xiii.m712iO());
    }

    @aa1
    public final ii0iIIX0<NetResult<TranslationTime>> XIi00iiXO() {
        return iX0XiO.iIX0i(iX0XiO.X00O0(new NetUtil$getMockTranslationTime$1(null)), IXOX0Xiii.m712iO());
    }

    @tb1
    public final Object XO0O10(@aa1 Continuation<? super Unit> continuation) throws Throwable {
        Object objI0IIOi = I100X1.I0IIOi(IXOX0Xiii.m712iO(), new NetUtil$getThirdDeviceInfo$2(null), continuation);
        return objI0IIOi == C2798pb.I0iXXO() ? objI0IIOi : Unit.OXO1;
    }

    @tb1
    public final Object XOO0ii0(@aa1 String str, @aa1 String str2, @aa1 Continuation<? super String> continuation) {
        return I100X1.I0IIOi(IXOX0Xiii.m712iO(), new NetUtil$text2Audio$2(str2, str, null), continuation);
    }

    @aa1
    /* JADX INFO: renamed from: iO */
    public final ii0iIIX0<NetResult<List<ThirdPartyDeviceFilterData>>> m38832iO() {
        return iX0XiO.iIX0i(iX0XiO.X00O0(new NetUtil$getSupportedThirdDevice$1(null)), IXOX0Xiii.m712iO());
    }
}
