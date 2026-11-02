package com.sma.smartv3.biz.fitness_site.hyky;

import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.ParsedRequestListener;
import com.blankj.utilcode.util.LogUtils;
import com.google.gson.reflect.TypeToken;
import com.sma.androidnetworklib.model.Response;
import com.sma.smartv3.network.GetSNCodeHYKY;
import com.sma.smartv3.network.NetWorkUtils;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@DebugMetadata(m39465c = "com.sma.smartv3.biz.fitness_site.hyky.HykyModel$uploadDeviceInfoToHyky$2$1", m39466f = "HykyModel.kt", m39467i = {1, 1, 1}, m39468l = {33, 38}, m39469m = "invokeSuspend", m39470n = {"snInfo", "deviceID", "$i$a$-let-HykyModel$uploadDeviceInfoToHyky$2$1$1"}, m39472s = {"L$0", "L$2", "I$0"}, m39473v = 1)
@SourceDebugExtension({"SMAP\nHykyModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HykyModel.kt\ncom/sma/smartv3/biz/fitness_site/hyky/HykyModel$uploadDeviceInfoToHyky$2$1\n+ 2 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n*L\n1#1,233:1\n771#2,16:234\n802#2:250\n*S KotlinDebug\n*F\n+ 1 HykyModel.kt\ncom/sma/smartv3/biz/fitness_site/hyky/HykyModel$uploadDeviceInfoToHyky$2$1\n*L\n41#1:234,16\n41#1:250\n*E\n"})
public final class HykyModel$uploadDeviceInfoToHyky$2$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    final /* synthetic */ Continuation<GetSNCodeHYKY.Response> $continuation;
    final /* synthetic */ String $mac;
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ HykyModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public HykyModel$uploadDeviceInfoToHyky$2$1(HykyModel hykyModel, String str, Continuation<? super GetSNCodeHYKY.Response> continuation, Continuation<? super HykyModel$uploadDeviceInfoToHyky$2$1> continuation2) {
        super(2, continuation2);
        this.this$0 = hykyModel;
        this.$mac = str;
        this.$continuation = continuation;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new HykyModel$uploadDeviceInfoToHyky$2$1(this.this$0, this.$mac, this.$continuation, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
        return ((HykyModel$uploadDeviceInfoToHyky$2$1) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x007e  */
    /* JADX WARN: Instruction removed from duplicated block: B:26:0x007e, please report this as an issue */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        String deviceID$default;
        GetSNCodeHYKY.Response response;
        final HykyModel hykyModel;
        String str;
        Object objI0iXXO = C2798pb.I0iXXO();
        int i = this.label;
        if (i == 0) {
            ResultKt.X1ii(obj);
            HykyModel hykyModel2 = this.this$0;
            String str2 = this.$mac;
            this.label = 1;
            obj = hykyModel2.getSnInfo(str2, this);
            if (obj != objI0iXXO) {
            }
            return objI0iXXO;
        }
        if (i == 1) {
            ResultKt.X1ii(obj);
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str3 = (String) this.L$2;
            HykyModel hykyModel3 = (HykyModel) this.L$1;
            GetSNCodeHYKY.Response response2 = (GetSNCodeHYKY.Response) this.L$0;
            ResultKt.X1ii(obj);
            str = str3;
            response = response2;
            hykyModel = hykyModel3;
        }
        if (((Boolean) obj).booleanValue()) {
            NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
            UploadDeviceHYKY.BodyData bodyData = new UploadDeviceHYKY.BodyData(0, str, response.getCmei(), response.getSn(), HykyUtils.INSTANCE.getDeviceMac(false), 1, null);
            final O1XIiIO<String> o1XIiIO = new O1XIiIO<String>() { // from class: com.sma.smartv3.biz.fitness_site.hyky.HykyModel$uploadDeviceInfoToHyky$2$1$1$1
                @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                public void handleError(String error) {
                    Intrinsics.X0O(error, "error");
                    i1O0OXO1O.OXO1.OXO1(hykyModel.TAG + " uploadDeviceInfoToHyky handleResponse: error = " + error);
                }

                @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                public void handleResponse(String str4) {
                    i1O0OXO1O.OXO1.OXO1(hykyModel.TAG + " uploadDeviceInfoToHyky handleResponse: success!");
                }
            };
            String str4 = HykyAPI.INSTANCE.getBASE_URL_HYKY() + UploadDeviceHYKY.URL;
            HykyManager.Companion companion = HykyManager.Companion;
            AndroidNetworking.post(str4).addHeaders("Authorization", companion.getInstance().getToken().getTokenType() + " " + companion.getInstance().getToken().getAccessToken()).addApplicationJsonBody(bodyData).setTag((Object) str4).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(HykyResponse.class, String.class), new ParsedRequestListener<HykyResponse<String>>() { // from class: com.sma.smartv3.biz.fitness_site.hyky.HykyModel$uploadDeviceInfoToHyky$2$1$invokeSuspend$lambda$0$$inlined$postHyky$1
                @Override // com.androidnetworking.interfaces.ParsedRequestListener
                public void onError(ANError aNError) {
                    Response response3;
                    Integer numValueOf = null;
                    LogUtils.m11128d("errorCode:" + (aNError != null ? Integer.valueOf(aNError.getErrorCode()) : null) + ", errorBody:" + (aNError != null ? aNError.getErrorBody() : null) + ", " + (aNError != null ? aNError.getErrorDetail() : null));
                    if (aNError != null && (response3 = (Response) aNError.getErrorAsObject(Response.class)) != null) {
                        numValueOf = Integer.valueOf(response3.getCode());
                    } else if (aNError != null) {
                        numValueOf = Integer.valueOf(aNError.getErrorCode());
                    }
                    O1XIiIO o1XIiIO2 = o1XIiIO;
                    if (o1XIiIO2 != null) {
                        o1XIiIO2.handleError(String.valueOf(numValueOf));
                    }
                }

                @Override // com.androidnetworking.interfaces.ParsedRequestListener
                public void onResponse(HykyResponse<String> response3) {
                    Intrinsics.X0O(response3, "response");
                    if (response3.getCode() == 200) {
                        O1XIiIO o1XIiIO2 = o1XIiIO;
                        if (o1XIiIO2 != null) {
                            o1XIiIO2.handleResponse(response3.getData());
                            return;
                        }
                        return;
                    }
                    O1XIiIO o1XIiIO3 = o1XIiIO;
                    if (o1XIiIO3 != null) {
                        o1XIiIO3.handleError(response3.getCode() + " " + response3.getMessage());
                    }
                }
            });
        }
        return Unit.OXO1;
        GetSNCodeHYKY.Response response3 = (GetSNCodeHYKY.Response) obj;
        Continuation<GetSNCodeHYKY.Response> continuation = this.$continuation;
        Result.Companion companion2 = Result.Companion;
        continuation.resumeWith(Result.m48333constructorimpl(response3));
        if (response3 != null && response3.deviceInfoExists() && (deviceID$default = HykyUtils.getDeviceID$default(HykyUtils.INSTANCE, null, 1, null)) != null) {
            HykyModel hykyModel4 = this.this$0;
            this.L$0 = response3;
            this.L$1 = hykyModel4;
            this.L$2 = deviceID$default;
            this.I$0 = 0;
            this.label = 2;
            Object objRefreshToken = hykyModel4.refreshToken(this);
            if (objRefreshToken != objI0iXXO) {
                response = response3;
                obj = objRefreshToken;
                hykyModel = hykyModel4;
                str = deviceID$default;
                if (((Boolean) obj).booleanValue()) {
                    NetWorkUtils netWorkUtils2 = NetWorkUtils.INSTANCE;
                    UploadDeviceHYKY.BodyData bodyData2 = new UploadDeviceHYKY.BodyData(0, str, response.getCmei(), response.getSn(), HykyUtils.INSTANCE.getDeviceMac(false), 1, null);
                    final O1XIiIO o1XIiIO2 = new O1XIiIO<String>() { // from class: com.sma.smartv3.biz.fitness_site.hyky.HykyModel$uploadDeviceInfoToHyky$2$1$1$1
                        @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                        public void handleError(String error) {
                            Intrinsics.X0O(error, "error");
                            i1O0OXO1O.OXO1.OXO1(hykyModel.TAG + " uploadDeviceInfoToHyky handleResponse: error = " + error);
                        }

                        @Override // com.android.mltcode.paycertificationapi.O1XIiIO
                        public void handleResponse(String str5) {
                            i1O0OXO1O.OXO1.OXO1(hykyModel.TAG + " uploadDeviceInfoToHyky handleResponse: success!");
                        }
                    };
                    String str5 = HykyAPI.INSTANCE.getBASE_URL_HYKY() + UploadDeviceHYKY.URL;
                    HykyManager.Companion companion3 = HykyManager.Companion;
                    AndroidNetworking.post(str5).addHeaders("Authorization", companion3.getInstance().getToken().getTokenType() + " " + companion3.getInstance().getToken().getAccessToken()).addApplicationJsonBody(bodyData2).setTag((Object) str5).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(HykyResponse.class, String.class), new ParsedRequestListener<HykyResponse<String>>() { // from class: com.sma.smartv3.biz.fitness_site.hyky.HykyModel$uploadDeviceInfoToHyky$2$1$invokeSuspend$lambda$0$$inlined$postHyky$1
                        @Override // com.androidnetworking.interfaces.ParsedRequestListener
                        public void onError(ANError aNError) {
                            Response response4;
                            Integer numValueOf = null;
                            LogUtils.m11128d("errorCode:" + (aNError != null ? Integer.valueOf(aNError.getErrorCode()) : null) + ", errorBody:" + (aNError != null ? aNError.getErrorBody() : null) + ", " + (aNError != null ? aNError.getErrorDetail() : null));
                            if (aNError != null && (response4 = (Response) aNError.getErrorAsObject(Response.class)) != null) {
                                numValueOf = Integer.valueOf(response4.getCode());
                            } else if (aNError != null) {
                                numValueOf = Integer.valueOf(aNError.getErrorCode());
                            }
                            O1XIiIO o1XIiIO3 = o1XIiIO2;
                            if (o1XIiIO3 != null) {
                                o1XIiIO3.handleError(String.valueOf(numValueOf));
                            }
                        }

                        @Override // com.androidnetworking.interfaces.ParsedRequestListener
                        public void onResponse(HykyResponse<String> response4) {
                            Intrinsics.X0O(response4, "response");
                            if (response4.getCode() == 200) {
                                O1XIiIO o1XIiIO3 = o1XIiIO2;
                                if (o1XIiIO3 != null) {
                                    o1XIiIO3.handleResponse(response4.getData());
                                    return;
                                }
                                return;
                            }
                            O1XIiIO o1XIiIO4 = o1XIiIO2;
                            if (o1XIiIO4 != null) {
                                o1XIiIO4.handleError(response4.getCode() + " " + response4.getMessage());
                            }
                        }
                    });
                }
            }
            return objI0iXXO;
        }
        return Unit.OXO1;
    }
}
