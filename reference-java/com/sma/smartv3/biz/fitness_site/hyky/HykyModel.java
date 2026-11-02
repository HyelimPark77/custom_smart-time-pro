package com.sma.smartv3.biz.fitness_site.hyky;

import android.app.Activity;
import android.util.Log;
import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.C3006uq;
import com.android.mltcode.paycertificationapi.IXOX0Xiii;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.XX01Oi;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.ng5;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.yn0;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.ANResponse;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.ParsedRequestListener;
import com.blankj.utilcode.util.LogUtils;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sma.androidnetworklib.method.NetWork;
import com.sma.androidnetworklib.model.Response;
import com.sma.smartv3.network.Api;
import com.sma.smartv3.network.GetAuthStatusHYKY;
import com.sma.smartv3.network.GetSNCodeHYKY;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.network.RequestBodyKt;
import java.util.HashMap;
import java.util.Map;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.OXO1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.I0IIOi;

/* JADX INFO: loaded from: classes18.dex */
@SourceDebugExtension({"SMAP\nHykyModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HykyModel.kt\ncom/sma/smartv3/biz/fitness_site/hyky/HykyModel\n+ 2 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 3 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n+ 4 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,233:1\n126#2,11:234\n146#2:253\n176#2,11:256\n196#2:275\n771#2,16:276\n802#2:292\n200#3,7:245\n218#3:252\n252#3,7:267\n270#3:274\n11#4,2:254\n*S KotlinDebug\n*F\n+ 1 HykyModel.kt\ncom/sma/smartv3/biz/fitness_site/hyky/HykyModel\n*L\n68#1:234,11\n68#1:253\n143#1:256,11\n143#1:275\n209#1:276,16\n209#1:292\n68#1:245,7\n68#1:252\n143#1:267,7\n143#1:274\n135#1:254,2\n*E\n"})
public final class HykyModel {

    @aa1
    private final i00OIXiO scope = I0IIOi.OXO1(IXOX0Xiii.m712iO().plus(ng5.m2716iO(null, 1, null)));

    @aa1
    private final String TAG = "HykyModel";

    /* JADX INFO: renamed from: com.sma.smartv3.biz.fitness_site.hyky.HykyModel$bindDeviceToHyky$1 */
    @DebugMetadata(m39465c = "com.sma.smartv3.biz.fitness_site.hyky.HykyModel", m39466f = "HykyModel.kt", m39467i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1}, m39468l = {189, 193}, m39469m = "bindDeviceToHyky", m39470n = {"phone", "deviceMAC", "sn", "cmei", "isBind", "phone", "deviceMAC", "sn", "cmei", "isBind"}, m39472s = {"L$0", "L$1", "L$2", "L$3", "Z$0", "L$0", "L$1", "L$2", "L$3", "Z$0"}, m39473v = 1)
    public static final class C154711 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C154711(Continuation<? super C154711> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @tb1
        public final Object invokeSuspend(@aa1 Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return HykyModel.this.bindDeviceToHyky(false, null, null, null, null, this);
        }
    }

    @tb1
    public final Object bindDevice(final boolean z, @aa1 String str, @aa1 String str2, @aa1 String str3, @aa1 String str4, @aa1 Continuation<? super Boolean> continuation) throws Throwable {
        final SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.O00(continuation));
        String deviceID = HykyUtils.INSTANCE.getDeviceID(str2);
        if (deviceID != null) {
            NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
            BindDeviceHYKY.BodyData bodyData = new BindDeviceHYKY.BodyData(str, 0, deviceID, str4, str3, str2, z ? 1 : 2, 2, null);
            final O1XIiIO<String> o1XIiIO = new O1XIiIO<String>() { // from class: com.sma.smartv3.biz.fitness_site.hyky.HykyModel$bindDevice$2$1$1
                @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                public void handleError(String error) {
                    Intrinsics.X0O(error, "error");
                    i1O0OXO1O.OXO1.OXO1(this.this$0.TAG + " bindDevice handleResponse: error = " + error);
                    Continuation<Boolean> continuation2 = safeContinuation;
                    Result.Companion companion = Result.Companion;
                    continuation2.resumeWith(Result.m48333constructorimpl(Boolean.FALSE));
                }

                @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                public void handleResponse(String str5) {
                    i1O0OXO1O.OXO1.OXO1(this.this$0.TAG + " bindDevice handleResponse: success! isBind = " + z);
                    Continuation<Boolean> continuation2 = safeContinuation;
                    Result.Companion companion = Result.Companion;
                    continuation2.resumeWith(Result.m48333constructorimpl(Boolean.TRUE));
                }
            };
            String str5 = HykyAPI.INSTANCE.getBASE_URL_HYKY() + BindDeviceHYKY.URL;
            HykyManager.Companion companion = HykyManager.Companion;
            AndroidNetworking.post(str5).addHeaders("Authorization", companion.getInstance().getToken().getTokenType() + " " + companion.getInstance().getToken().getAccessToken()).addApplicationJsonBody(bodyData).setTag((Object) str5).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(HykyResponse.class, String.class), new ParsedRequestListener<HykyResponse<String>>() { // from class: com.sma.smartv3.biz.fitness_site.hyky.HykyModel$bindDevice$lambda$0$0$$inlined$postHyky$1
                @Override // com.androidnetworking.interfaces.ParsedRequestListener
                public void onError(ANError aNError) {
                    Response response;
                    Integer numValueOf = null;
                    LogUtils.m11128d("errorCode:" + (aNError != null ? Integer.valueOf(aNError.getErrorCode()) : null) + ", errorBody:" + (aNError != null ? aNError.getErrorBody() : null) + ", " + (aNError != null ? aNError.getErrorDetail() : null));
                    if (aNError != null && (response = (Response) aNError.getErrorAsObject(Response.class)) != null) {
                        numValueOf = Integer.valueOf(response.getCode());
                    } else if (aNError != null) {
                        numValueOf = Integer.valueOf(aNError.getErrorCode());
                    }
                    O1XIiIO o1XIiIO2 = o1XIiIO;
                    if (o1XIiIO2 != null) {
                        o1XIiIO2.handleError(String.valueOf(numValueOf));
                    }
                }

                @Override // com.androidnetworking.interfaces.ParsedRequestListener
                public void onResponse(HykyResponse<String> response) {
                    Intrinsics.X0O(response, "response");
                    if (response.getCode() == 200) {
                        O1XIiIO o1XIiIO2 = o1XIiIO;
                        if (o1XIiIO2 != null) {
                            o1XIiIO2.handleResponse(response.getData());
                            return;
                        }
                        return;
                    }
                    O1XIiIO o1XIiIO3 = o1XIiIO;
                    if (o1XIiIO3 != null) {
                        o1XIiIO3.handleError(response.getCode() + " " + response.getMessage());
                    }
                }
            });
        } else {
            Result.Companion companion2 = Result.Companion;
            safeContinuation.resumeWith(Result.m48333constructorimpl(Boxing.OXO1(false)));
        }
        Object objXIi00iiXO = safeContinuation.XIi00iiXO();
        if (objXIi00iiXO == C2798pb.I0iXXO()) {
            DebugProbesKt.m39475iO(continuation);
        }
        return objXIi00iiXO;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @tb1
    public final Object bindDeviceToHyky(boolean z, @aa1 String str, @aa1 String str2, @aa1 String str3, @aa1 String str4, @aa1 Continuation<? super Boolean> continuation) {
        C154711 c154711;
        if (continuation instanceof C154711) {
            c154711 = (C154711) continuation;
            int i = c154711.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c154711.label = i - Integer.MIN_VALUE;
            } else {
                c154711 = new C154711(continuation);
            }
        } else {
            c154711 = new C154711(continuation);
        }
        C154711 c154712 = c154711;
        Object objRefreshToken = c154712.result;
        Object objI0iXXO = C2798pb.I0iXXO();
        int i2 = c154712.label;
        if (i2 == 0) {
            ResultKt.X1ii(objRefreshToken);
            i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
            String str5 = this.TAG;
            q62 q62Var = q62.OXO1;
            i1o0oxo1o.OXO1(str5 + " bindDevice : " + z + " " + q62Var.iIIX0XI());
            if (!q62Var.iIIX0XI() || str2.length() == 0 || str.length() == 0 || str3.length() == 0 || str4.length() == 0) {
                return Boxing.OXO1(false);
            }
            c154712.L$0 = str;
            c154712.L$1 = str2;
            c154712.L$2 = str3;
            c154712.L$3 = str4;
            c154712.Z$0 = z;
            c154712.label = 1;
            objRefreshToken = refreshToken(c154712);
            if (objRefreshToken != objI0iXXO) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.X1ii(objRefreshToken);
            return objRefreshToken;
        }
        z = c154712.Z$0;
        str4 = (String) c154712.L$3;
        str3 = (String) c154712.L$2;
        str2 = (String) c154712.L$1;
        str = (String) c154712.L$0;
        ResultKt.X1ii(objRefreshToken);
        String str6 = str2;
        String str7 = str3;
        String str8 = str4;
        if (!((Boolean) objRefreshToken).booleanValue()) {
            return Boxing.OXO1(false);
        }
        c154712.L$0 = SpillingKt.OXO1(str);
        c154712.L$1 = SpillingKt.OXO1(str6);
        c154712.L$2 = SpillingKt.OXO1(str7);
        c154712.L$3 = SpillingKt.OXO1(str8);
        c154712.Z$0 = z;
        c154712.label = 2;
        Object objBindDevice = bindDevice(z, str, str6, str7, str8, c154712);
        return objBindDevice == objI0iXXO ? objI0iXXO : objBindDevice;
    }

    @tb1
    public final Object checkAuthStatus(@aa1 String str, @aa1 Continuation<? super Boolean> continuation) {
        final SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.O00(continuation));
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        HashMap mapXXX11i = OXO1.XXX11i(TuplesKt.OXO1("projectId", RequestBodyKt.PROJECT_ID), TuplesKt.OXO1("phone", str));
        final O1XIiIO<GetAuthStatusHYKY.ResStatus> o1XIiIO = new O1XIiIO<GetAuthStatusHYKY.ResStatus>() { // from class: com.sma.smartv3.biz.fitness_site.hyky.HykyModel$checkAuthStatus$2$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                i1O0OXO1O.OXO1.OXO1(this.this$0.TAG + " handleError ->  " + error);
                Continuation<Boolean> continuation2 = safeContinuation;
                Result.Companion companion = Result.Companion;
                continuation2.resumeWith(Result.m48333constructorimpl(Boolean.valueOf(a01.OXO1.IiI10X().getBoolean(b01.OiO0IOX, false))));
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleResponse(GetAuthStatusHYKY.ResStatus resStatus) {
                i1O0OXO1O.OXO1.OXO1(this.this$0.TAG + " handleResponse ->  " + resStatus);
                if (resStatus == null) {
                    Continuation<Boolean> continuation2 = safeContinuation;
                    Result.Companion companion = Result.Companion;
                    continuation2.resumeWith(Result.m48333constructorimpl(Boolean.valueOf(a01.OXO1.IiI10X().getBoolean(b01.OiO0IOX, false))));
                } else {
                    Continuation<Boolean> continuation3 = safeContinuation;
                    a01.OXO1.IiI10X().put(b01.OiO0IOX, resStatus.isAuth());
                    Result.Companion companion2 = Result.Companion;
                    continuation3.resumeWith(Result.m48333constructorimpl(Boolean.valueOf(resStatus.isAuth())));
                }
            }
        };
        final Activity activity = null;
        final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(null, null);
        String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), GetAuthStatusHYKY.URL);
        netWorkUtils.printParam(strConvertBaseUrl + GetAuthStatusHYKY.URL, mapXXX11i);
        NetWork netWork = NetWork.OXO1;
        String str2 = strConvertBaseUrl + GetAuthStatusHYKY.URL;
        final O1XIiIO<Response<GetAuthStatusHYKY.ResStatus>> o1XIiIO2 = new O1XIiIO<Response<GetAuthStatusHYKY.ResStatus>>() { // from class: com.sma.smartv3.biz.fitness_site.hyky.HykyModel$checkAuthStatus$lambda$0$$inlined$post$default$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                NetWorkUtils.INSTANCE.errorData(error, o1XIiIO, c3006uqLoadPopup);
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleResponse(Response<GetAuthStatusHYKY.ResStatus> response) {
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
        };
        AndroidNetworking.post(str2).addBodyParameter((Map<String, String>) mapXXX11i).setTag((Object) str2).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, GetAuthStatusHYKY.ResStatus.class), new ParsedRequestListener<Response<GetAuthStatusHYKY.ResStatus>>() { // from class: com.sma.smartv3.biz.fitness_site.hyky.HykyModel$checkAuthStatus$lambda$0$$inlined$post$default$2
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

            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            public void onResponse(Response<GetAuthStatusHYKY.ResStatus> response) {
                Intrinsics.X0O(response, "response");
                o1XIiIO2.handleResponse(response);
            }
        });
        Object objXIi00iiXO = safeContinuation.XIi00iiXO();
        if (objXIi00iiXO == C2798pb.I0iXXO()) {
            DebugProbesKt.m39475iO(continuation);
        }
        return objXIi00iiXO;
    }

    @aa1
    public final i00OIXiO getScope() {
        return this.scope;
    }

    @tb1
    public final Object getSnInfo(@aa1 String str, @aa1 Continuation<? super GetSNCodeHYKY.Response> continuation) {
        final SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.O00(continuation));
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        HashMap mapXXX11i = OXO1.XXX11i(TuplesKt.OXO1("mac", str));
        final O1XIiIO<GetSNCodeHYKY.Response> o1XIiIO = new O1XIiIO<GetSNCodeHYKY.Response>() { // from class: com.sma.smartv3.biz.fitness_site.hyky.HykyModel$getSnInfo$2$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                i1O0OXO1O.OXO1.OXO1(this.this$0.TAG + " getSnInfo handleError ->  " + error);
                Continuation<GetSNCodeHYKY.Response> continuation2 = safeContinuation;
                Result.Companion companion = Result.Companion;
                continuation2.resumeWith(Result.m48333constructorimpl(null));
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleResponse(GetSNCodeHYKY.Response response) {
                i1O0OXO1O.OXO1.OXO1(this.this$0.TAG + " getSnInfo handleResponse ->  " + response);
                if (response != null) {
                    Continuation<GetSNCodeHYKY.Response> continuation2 = safeContinuation;
                    if (response.deviceInfoExists()) {
                        Result.Companion companion = Result.Companion;
                        continuation2.resumeWith(Result.m48333constructorimpl(response));
                        return;
                    }
                }
                Continuation<GetSNCodeHYKY.Response> continuation3 = safeContinuation;
                Result.Companion companion2 = Result.Companion;
                continuation3.resumeWith(Result.m48333constructorimpl(null));
            }
        };
        final Activity activity = null;
        final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(null, null);
        String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), GetSNCodeHYKY.URL);
        netWorkUtils.printParam(strConvertBaseUrl + GetSNCodeHYKY.URL, mapXXX11i);
        NetWork netWork = NetWork.OXO1;
        String str2 = strConvertBaseUrl + GetSNCodeHYKY.URL;
        final O1XIiIO<Response<GetSNCodeHYKY.Response>> o1XIiIO2 = new O1XIiIO<Response<GetSNCodeHYKY.Response>>() { // from class: com.sma.smartv3.biz.fitness_site.hyky.HykyModel$getSnInfo$lambda$0$$inlined$get$default$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                NetWorkUtils.INSTANCE.errorData(error, o1XIiIO, c3006uqLoadPopup);
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleResponse(Response<GetSNCodeHYKY.Response> response) {
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
        };
        AndroidNetworking.get(str2).addQueryParameter((Map<String, String>) mapXXX11i).setTag((Object) str2).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, GetSNCodeHYKY.Response.class), new ParsedRequestListener<Response<GetSNCodeHYKY.Response>>() { // from class: com.sma.smartv3.biz.fitness_site.hyky.HykyModel$getSnInfo$lambda$0$$inlined$get$default$2
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

            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            public void onResponse(Response<GetSNCodeHYKY.Response> response) {
                Intrinsics.X0O(response, "response");
                o1XIiIO2.handleResponse(response);
            }
        });
        Object objXIi00iiXO = safeContinuation.XIi00iiXO();
        if (objXIi00iiXO == C2798pb.I0iXXO()) {
            DebugProbesKt.m39475iO(continuation);
        }
        return objXIi00iiXO;
    }

    @tb1
    public final Object refreshToken(@aa1 Continuation<? super Boolean> continuation) throws Throwable {
        GetTokenHYKY.HykyTokenData hykyTokenData;
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.O00(continuation));
        if (!q62.OXO1.iIIX0XI()) {
            i1O0OXO1O.OXO1.OXO1(this.TAG + " refreshToken : return");
            Result.Companion companion = Result.Companion;
            safeContinuation.resumeWith(Result.m48333constructorimpl(Boxing.OXO1(false)));
        } else if (HykyManager.Companion.getInstance().getToken().isExpired()) {
            Log.d(this.TAG, "refreshToken");
            HykyResponse hykyResponse = null;
            try {
                ANResponse aNResponseExecuteForParsed = AndroidNetworking.post(HykyAPI.INSTANCE.getBASE_URL_HYKY() + GetTokenHYKY.URL).setTag((Object) "HykyManager getToken").setPriority(Priority.HIGH).build().executeForParsed(TypeToken.getParameterized(HykyResponse.class, GetTokenHYKY.HykyTokenData.class));
                i1O0OXO1O.OXO1.OXO1(this.TAG + " refreshToken : response = " + aNResponseExecuteForParsed);
                if (aNResponseExecuteForParsed.isSuccess()) {
                    Object result = aNResponseExecuteForParsed.getResult();
                    Intrinsics.X1ii(result, "null cannot be cast to non-null type com.sma.smartv3.biz.fitness_site.hyky.HykyResponse<com.sma.smartv3.biz.fitness_site.hyky.GetTokenHYKY.HykyTokenData>");
                    hykyResponse = (HykyResponse) result;
                }
            } catch (Exception unused) {
            }
            i1O0OXO1O.OXO1.OXO1(this.TAG + " refreshToken : newToken = " + hykyResponse);
            if (hykyResponse == null || (hykyTokenData = (GetTokenHYKY.HykyTokenData) hykyResponse.getData()) == null) {
                Result.Companion companion2 = Result.Companion;
                safeContinuation.resumeWith(Result.m48333constructorimpl(Boxing.OXO1(false)));
            } else {
                HykyManager.Companion.getInstance().setToken(hykyTokenData);
                a01.OXO1.IiI10X().put(GetTokenHYKY.HykyTokenData.class.getName(), new Gson().toJson(hykyTokenData));
                Result.Companion companion3 = Result.Companion;
                safeContinuation.resumeWith(Result.m48333constructorimpl(Boxing.OXO1(true)));
            }
        } else {
            i1O0OXO1O.OXO1.OXO1(this.TAG + " refreshToken : token未过期 return");
            Result.Companion companion4 = Result.Companion;
            safeContinuation.resumeWith(Result.m48333constructorimpl(Boxing.OXO1(true)));
        }
        Object objXIi00iiXO = safeContinuation.XIi00iiXO();
        if (objXIi00iiXO == C2798pb.I0iXXO()) {
            DebugProbesKt.m39475iO(continuation);
        }
        return objXIi00iiXO;
    }

    @tb1
    public final Object uploadDeviceInfoToHyky(@aa1 String str, @aa1 Continuation<? super GetSNCodeHYKY.Response> continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.O00(continuation));
        XX01Oi.IiI10X(this.scope, null, null, new HykyModel$uploadDeviceInfoToHyky$2$1(this, str, safeContinuation, null), 3, null);
        Object objXIi00iiXO = safeContinuation.XIi00iiXO();
        if (objXIi00iiXO == C2798pb.I0iXXO()) {
            DebugProbesKt.m39475iO(continuation);
        }
        return objXIi00iiXO;
    }
}
