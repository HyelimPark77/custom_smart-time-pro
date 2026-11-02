package com.sma.smartv3.p610ui.translate.sparkchain;

import android.app.Activity;
import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.C3006uq;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.yn0;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.androidnetworking.interfaces.ParsedRequestListener;
import com.blankj.utilcode.util.LogUtils;
import com.blankj.utilcode.util.ToastUtils;
import com.google.gson.reflect.TypeToken;
import com.sma.androidnetworklib.method.NetWork;
import com.sma.androidnetworklib.model.Response;
import com.sma.smartv3.network.Api;
import com.sma.smartv3.network.GetSparkAuthorize;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.network.RequestBodyKt;
import java.util.HashMap;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.OXO1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(m39465c = "com.sma.smartv3.ui.translate.sparkchain.SparkLicenseManager$currentDeviceHasLicense$1", m39466f = "SparkLicenseManager.kt", m39467i = {}, m39468l = {}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
@SourceDebugExtension({"SMAP\nSparkLicenseManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparkLicenseManager.kt\ncom/sma/smartv3/ui/translate/sparkchain/SparkLicenseManager$currentDeviceHasLicense$1\n+ 2 NetWorkUtils.kt\ncom/sma/smartv3/network/NetWorkUtils\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 NetWork.kt\ncom/sma/androidnetworklib/method/NetWork\n*L\n1#1,99:1\n235#2,11:100\n246#2:112\n256#2:122\n1#3:111\n278#4,8:113\n298#4:121\n*S KotlinDebug\n*F\n+ 1 SparkLicenseManager.kt\ncom/sma/smartv3/ui/translate/sparkchain/SparkLicenseManager$currentDeviceHasLicense$1\n*L\n46#1:100,11\n46#1:112\n46#1:122\n46#1:111\n46#1:113,8\n46#1:121\n*E\n"})
public final class SparkLicenseManager$currentDeviceHasLicense$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ SparkLicenseManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SparkLicenseManager$currentDeviceHasLicense$1(SparkLicenseManager sparkLicenseManager, Continuation<? super SparkLicenseManager$currentDeviceHasLicense$1> continuation) {
        super(2, continuation);
        this.this$0 = sparkLicenseManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new SparkLicenseManager$currentDeviceHasLicense$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
        return ((SparkLicenseManager$currentDeviceHasLicense$1) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C2798pb.I0iXXO();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.X1ii(obj);
        if (this.this$0.I0IIOi.get()) {
            return Unit.OXO1;
        }
        this.this$0.I0IIOi.set(false);
        NetWorkUtils netWorkUtils = NetWorkUtils.INSTANCE;
        HashMap<String, String> sparkAuthorizeBody = RequestBodyKt.getSparkAuthorizeBody();
        final SparkLicenseManager sparkLicenseManager = this.this$0;
        final O1XIiIO<Boolean> o1XIiIO = new O1XIiIO<Boolean>() { // from class: com.sma.smartv3.ui.translate.sparkchain.SparkLicenseManager$currentDeviceHasLicense$1.1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(Boolean bool) {
                boolean zXOO0ii0 = Intrinsics.XOO0ii0(bool, Boolean.TRUE);
                i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
                i1o0oxo1o.OXO1(sparkLicenseManager.XIi00iiXO + " getSparkAuthorize result -> " + zXOO0ii0);
                if (zXOO0ii0) {
                    boolean zIiI10X = sparkLicenseManager.IiI10X();
                    sparkLicenseManager.IiI10X.mo3016iO(Boolean.valueOf(zIiI10X));
                    i1o0oxo1o.OXO1(sparkLicenseManager.XIi00iiXO + " InitResult  -> " + zIiI10X);
                } else {
                    ToastUtils.showLong("设备未授权", new Object[0]);
                    sparkLicenseManager.IiI10X.mo3016iO(Boolean.FALSE);
                }
                sparkLicenseManager.I0IIOi.set(false);
            }

            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            public void handleError(String error) {
                Intrinsics.X0O(error, "error");
                i1O0OXO1O.OXO1.OXO1(sparkLicenseManager.XIi00iiXO + " getSparkAuthorize error -> " + error);
                sparkLicenseManager.IiI10X.mo3016iO(Boolean.FALSE);
                sparkLicenseManager.I0IIOi.set(false);
                ToastUtils.showLong("设备未授权", new Object[0]);
            }
        };
        Map<String, String> headersMap = netWorkUtils.getHeadersMap();
        final Activity activity = null;
        final C3006uq c3006uqLoadPopup = netWorkUtils.loadPopup(null, null);
        String strConvertBaseUrl = netWorkUtils.convertBaseUrl(Api.INSTANCE.getBASE_URL(), GetSparkAuthorize.URL);
        String str = strConvertBaseUrl + GetSparkAuthorize.URL;
        Map<String, ? extends Object> mapX111IO = OXO1.X111IO(sparkAuthorizeBody);
        mapX111IO.putAll(headersMap);
        Unit unit = Unit.OXO1;
        netWorkUtils.printParam(str, mapX111IO);
        NetWork netWork = NetWork.OXO1;
        String str2 = strConvertBaseUrl + GetSparkAuthorize.URL;
        final O1XIiIO<Response<Boolean>> o1XIiIO2 = new O1XIiIO<Response<Boolean>>() { // from class: com.sma.smartv3.ui.translate.sparkchain.SparkLicenseManager$currentDeviceHasLicense$1$invokeSuspend$$inlined$postV2$default$1
            @Override // com.android.mltcode.paycertificationapi.O1XIiIO
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void handleResponse(Response<Boolean> response) {
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
        AndroidNetworking.post(str2).addHeaders(headersMap).addBodyParameter((Map<String, String>) sparkAuthorizeBody).setTag((Object) str2).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, Boolean.class), new ParsedRequestListener<Response<Boolean>>() { // from class: com.sma.smartv3.ui.translate.sparkchain.SparkLicenseManager$currentDeviceHasLicense$1$invokeSuspend$$inlined$postV2$default$2
            @Override // com.androidnetworking.interfaces.ParsedRequestListener
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public void onResponse(Response<Boolean> response) {
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
        return unit;
    }
}
