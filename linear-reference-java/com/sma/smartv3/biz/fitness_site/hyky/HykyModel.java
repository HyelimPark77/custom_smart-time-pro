package com.sma.smartv3.biz.fitness_site.hyky;

import android.app.Activity;
import android.util.Log;
import com.android.mltcode.paycertificationapi.I100X1;
import com.android.mltcode.paycertificationapi.IXOX0Xiii;
import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.ng5;
import com.android.mltcode.paycertificationapi.pb;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uq;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.ANResponse;
import com.androidnetworking.common.Priority;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sma.androidnetworklib.method.NetWork;
import com.sma.androidnetworklib.model.Response;
import com.sma.smartv3.network.Api;
import com.sma.smartv3.network.GetAuthStatusHYKY;
import com.sma.smartv3.network.GetSNCodeHYKY;
import com.sma.smartv3.network.NetWorkUtils;
import com.sma.smartv3.network.RequestBodyKt;
import java.lang.reflect.Type;
import java.util.HashMap;
import kotlin.Pair;
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
    private final String TAG;

    @aa1
    private final i00OIXiO scope;

    /* JADX INFO: renamed from: com.sma.smartv3.biz.fitness_site.hyky.HykyModel$bindDeviceToHyky$1, reason: invalid class name */
    @DebugMetadata(c = "com.sma.smartv3.biz.fitness_site.hyky.HykyModel", f = "HykyModel.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1}, l = {189, 193}, m = "bindDeviceToHyky", n = {"phone", "deviceMAC", "sn", "cmei", "isBind", "phone", "deviceMAC", "sn", "cmei", "isBind"}, s = {"L$0", "L$1", "L$2", "L$3", "Z$0", "L$0", "L$1", "L$2", "L$3", "Z$0"}, v = 1)
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ HykyModel this$0;

        public AnonymousClass1(HykyModel r1, Continuation<? super AnonymousClass1> r2) {
            this.this$0 = r1;
            super(r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @tb1
        public final Object invokeSuspend(@aa1 Object r8) {
            this.result = r8;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.bindDeviceToHyky(false, null, null, null, null, this);
        }
    }

    public HykyModel() {
        this.scope = I0IIOi.OXO1(IXOX0Xiii.iO().plus(ng5.iO(null, 1, null)));
        this.TAG = "HykyModel";
    }

    public static final /* synthetic */ String access$getTAG$p(HykyModel r0) {
        return r0.TAG;
    }

    @tb1
    public final Object bindDevice(final boolean r16, @aa1 String r17, @aa1 String r18, @aa1 String r19, @aa1 String r20, @aa1 Continuation<? super Boolean> r21) {
        final SafeContinuation r3 = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.O00(r21));
        String r8 = HykyUtils.INSTANCE.getDeviceID(r18);
        if (r8 == null) goto L9;
        NetWorkUtils r4 = NetWorkUtils.INSTANCE;
        if (r16 == false) goto L7;
        int r12 = 1;
    L8:
        BindDeviceHYKY.BodyData r5 = new BindDeviceHYKY.BodyData(r17, 0, r8, r20, r19, r18, r12, 2, null);
        final O1XIiIO<String> r6 = new HykyModel$bindDevice$2$1$1(this, r16, r3);
        String r0 = HykyAPI.INSTANCE.getBASE_URL_HYKY() + BindDeviceHYKY.URL;
        HykyManager.Companion r7 = HykyManager.Companion;
        AndroidNetworking.post(r0).addHeaders("Authorization", r7.getInstance().getToken().getTokenType() + " " + r7.getInstance().getToken().getAccessToken()).addApplicationJsonBody(r5).setTag(r0).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(HykyResponse.class, new Type[]{String.class}), new HykyModel$bindDevice$lambda$0$0$$inlined$postHyky$1(r6));
    L10:
        Object r1 = r3.XIi00iiXO();
        if (r1 != pb.I0iXXO()) goto L13;
        DebugProbesKt.iO(r21);
    L13:
        return r1;
    L7:
        r12 = 2;
        goto L8
    L9:
        Result.Companion r2 = Result.Companion;
        r3.resumeWith(Result.m6974constructorimpl(Boxing.OXO1(false)));
        goto L10
    }

    @tb1
    public final Object bindDeviceToHyky(boolean r10, @aa1 String r11, @aa1 String r12, @aa1 String r13, @aa1 String r14, @aa1 Continuation<? super Boolean> r15) {
        if ((r15 instanceof AnonymousClass1) == false) goto L8;
        AnonymousClass1 r0 = (AnonymousClass1) r15;
        int r1 = r0.label;
        if ((r1 & Integer.MIN_VALUE) == 0) goto L8;
        r0.label = r1 - Integer.MIN_VALUE;
    L7:
        AnonymousClass1 r7 = r0;
        Object r16 = r7.result;
        Object r2 = pb.I0iXXO();
        int r3 = r7.label;
        if (r3 == 0) goto L19;
        if (r3 == 1) goto L17;
        if (r3 != 2) goto L16;
        String r17 = (String) r7.L$3;
        String r18 = (String) r7.L$2;
        String r19 = (String) r7.L$1;
        String r110 = (String) r7.L$0;
        ResultKt.X1ii(r16);
        return r16;
    L16:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L17:
        r10 = r7.Z$0;
        r14 = (String) r7.L$3;
        r13 = (String) r7.L$2;
        r12 = (String) r7.L$1;
        r11 = (String) r7.L$0;
        ResultKt.X1ii(r16);
    L18:
        String r4 = r12;
        String r5 = r13;
        String r6 = r14;
        if (((Boolean) r16).booleanValue() == false) goto L39;
        r7.L$0 = SpillingKt.OXO1(r11);
        r7.L$1 = SpillingKt.OXO1(r4);
        r7.L$2 = SpillingKt.OXO1(r5);
        r7.L$3 = SpillingKt.OXO1(r6);
        r7.Z$0 = r10;
        r7.label = 2;
        Object r111 = bindDevice(r10, r11, r4, r5, r6, r7);
        if (r111 != r2) goto L43;
    L42:
        return r2;
    L43:
        return r111;
    L39:
        return Boxing.OXO1(false);
    L19:
        ResultKt.X1ii(r16);
        i1O0OXO1O r112 = i1O0OXO1O.OXO1;
        String r8 = this.TAG;
        q62 r9 = q62.OXO1;
        r112.OXO1(r8 + " bindDevice : " + r10 + " " + r9.iIIX0XI());
        if (r9.iIIX0XI() == false) goto L45;
        if (r12.length() == 0) goto L45;
        if (r11.length() == 0) goto L45;
        if (r13.length() == 0) goto L45;
        if (r14.length() == 0) goto L45;
        r7.L$0 = r11;
        r7.L$1 = r12;
        r7.L$2 = r13;
        r7.L$3 = r14;
        r7.Z$0 = r10;
        r7.label = 1;
        r16 = refreshToken(r7);
        if (r16 != r2) goto L18;
    L45:
        return Boxing.OXO1(false);
    L8:
        r0 = new AnonymousClass1(this, r15);
        goto L7
    }

    @tb1
    public final Object checkAuthStatus(@aa1 String r9, @aa1 Continuation<? super Boolean> r10) {
        final SafeContinuation r0 = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.O00(r10));
        NetWorkUtils r1 = NetWorkUtils.INSTANCE;
        HashMap r11 = OXO1.XXX11i(new Pair[]{TuplesKt.OXO1("projectId", RequestBodyKt.PROJECT_ID), TuplesKt.OXO1("phone", r9)});
        final O1XIiIO<GetAuthStatusHYKY.ResStatus> r2 = new HykyModel$checkAuthStatus$2$1(this, r0);
        final Activity r3 = null;
        final uq r4 = r1.loadPopup(null, null);
        String r5 = r1.convertBaseUrl(Api.INSTANCE.getBASE_URL(), GetAuthStatusHYKY.URL);
        r1.printParam(r5 + GetAuthStatusHYKY.URL, r11);
        NetWork r6 = NetWork.OXO1;
        String r7 = r5 + GetAuthStatusHYKY.URL;
        final O1XIiIO<Response<GetAuthStatusHYKY.ResStatus>> r8 = new HykyModel$checkAuthStatus$lambda$0$$inlined$post$default$1(r3, r2, r4);
        AndroidNetworking.post(r7).addBodyParameter(r11).setTag(r7).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{GetAuthStatusHYKY.ResStatus.class}), new HykyModel$checkAuthStatus$lambda$0$$inlined$post$default$2(r8));
        Object r12 = r0.XIi00iiXO();
        if (r12 != pb.I0iXXO()) goto L5;
        DebugProbesKt.iO(r10);
    L5:
        return r12;
    }

    @aa1
    public final i00OIXiO getScope() {
        return this.scope;
    }

    @tb1
    public final Object getSnInfo(@aa1 String r9, @aa1 Continuation<? super GetSNCodeHYKY.Response> r10) {
        final SafeContinuation r0 = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.O00(r10));
        NetWorkUtils r1 = NetWorkUtils.INSTANCE;
        HashMap r11 = OXO1.XXX11i(new Pair[]{TuplesKt.OXO1("mac", r9)});
        final O1XIiIO<GetSNCodeHYKY.Response> r2 = new HykyModel$getSnInfo$2$1(this, r0);
        final Activity r3 = null;
        final uq r4 = r1.loadPopup(null, null);
        String r5 = r1.convertBaseUrl(Api.INSTANCE.getBASE_URL(), GetSNCodeHYKY.URL);
        r1.printParam(r5 + GetSNCodeHYKY.URL, r11);
        NetWork r6 = NetWork.OXO1;
        String r7 = r5 + GetSNCodeHYKY.URL;
        final O1XIiIO<Response<GetSNCodeHYKY.Response>> r8 = new HykyModel$getSnInfo$lambda$0$$inlined$get$default$1(r3, r2, r4);
        AndroidNetworking.get(r7).addQueryParameter(r11).setTag(r7).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(Response.class, new Type[]{GetSNCodeHYKY.Response.class}), new HykyModel$getSnInfo$lambda$0$$inlined$get$default$2(r8));
        Object r12 = r0.XIi00iiXO();
        if (r12 != pb.I0iXXO()) goto L5;
        DebugProbesKt.iO(r10);
    L5:
        return r12;
    }

    @tb1
    public final Object refreshToken(@aa1 Continuation<? super Boolean> r10) {
        SafeContinuation r2 = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.O00(r10));
        if (q62.OXO1.iIIX0XI() == true) goto L6;
        i1O0OXO1O.OXO1.OXO1(this.TAG + " refreshToken : return");
        Result.Companion r0 = Result.Companion;
        r2.resumeWith(Result.m6974constructorimpl(Boxing.OXO1(false)));
    L19:
        Object r1 = r2.XIi00iiXO();
        if (r1 != pb.I0iXXO()) goto L22;
        DebugProbesKt.iO(r10);
    L22:
        return r1;
    L6:
        if (HykyManager.Companion.getInstance().getToken().isExpired() == true) goto L8;
        i1O0OXO1O.OXO1.OXO1(this.TAG + " refreshToken : token未过期 return");
        Result.Companion r3 = Result.Companion;
        r2.resumeWith(Result.m6974constructorimpl(Boxing.OXO1(true)));
        goto L19
    L8:
        Log.d(this.TAG, "refreshToken");
        HykyResponse r4 = null;
        ANResponse r5 = AndroidNetworking.post(HykyAPI.INSTANCE.getBASE_URL_HYKY() + GetTokenHYKY.URL).setTag("HykyManager getToken").setPriority(Priority.HIGH).build().executeForParsed(TypeToken.getParameterized(HykyResponse.class, new Type[]{GetTokenHYKY.HykyTokenData.class}));     // Catch: Exception -> L23
        i1O0OXO1O.OXO1.OXO1(this.TAG + " refreshToken : response = " + r5);     // Catch: Exception -> L23
        if (r5.isSuccess() == false) goto L13;
        Object r6 = r5.getResult();     // Catch: Exception -> L23
        Intrinsics.X1ii(r6, "null cannot be cast to non-null type com.sma.smartv3.biz.fitness_site.hyky.HykyResponse<com.sma.smartv3.biz.fitness_site.hyky.GetTokenHYKY.HykyTokenData>");     // Catch: Exception -> L23
        r4 = (HykyResponse) r6;     // Catch: Exception -> L23
    L13:
        i1O0OXO1O.OXO1.OXO1(this.TAG + " refreshToken : newToken = " + r4);
        if (r4 == null) goto L18;
        GetTokenHYKY.HykyTokenData r7 = (GetTokenHYKY.HykyTokenData) r4.getData();
        if (r7 == null) goto L18;
        HykyManager.Companion.getInstance().setToken(r7);
        a01.OXO1.IiI10X().put(GetTokenHYKY.HykyTokenData.class.getName(), new Gson().toJson(r7));
        Result.Companion r8 = Result.Companion;
        r2.resumeWith(Result.m6974constructorimpl(Boxing.OXO1(true)));
    L18:
        Result.Companion r9 = Result.Companion;
        r2.resumeWith(Result.m6974constructorimpl(Boxing.OXO1(false)));
        goto L19
    }

    @tb1
    public final Object uploadDeviceInfoToHyky(@aa1 String r9, @aa1 Continuation<? super GetSNCodeHYKY.Response> r10) {
        SafeContinuation r0 = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.O00(r10));
        I100X1.O00(this.scope, null, null, new HykyModel$uploadDeviceInfoToHyky$2$1(this, r9, r0, null), 3, null);
        Object r11 = r0.XIi00iiXO();
        if (r11 != pb.I0iXXO()) goto L5;
        DebugProbesKt.iO(r10);
    L5:
        return r11;
    }
}
