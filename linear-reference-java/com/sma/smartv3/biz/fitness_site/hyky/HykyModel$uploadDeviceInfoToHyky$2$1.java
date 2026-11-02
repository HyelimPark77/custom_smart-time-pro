package com.sma.smartv3.biz.fitness_site.hyky;

import com.android.mltcode.paycertificationapi.O1XIiIO;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.pb;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.Priority;
import com.google.gson.reflect.TypeToken;
import com.sma.smartv3.network.GetSNCodeHYKY;
import com.sma.smartv3.network.NetWorkUtils;
import java.lang.reflect.Type;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@DebugMetadata(c = "com.sma.smartv3.biz.fitness_site.hyky.HykyModel$uploadDeviceInfoToHyky$2$1", f = "HykyModel.kt", i = {1, 1, 1}, l = {33, 38}, m = "invokeSuspend", n = {"snInfo", "deviceID", "$i$a$-let-HykyModel$uploadDeviceInfoToHyky$2$1$1"}, s = {"L$0", "L$2", "I$0"}, v = 1)
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

    /* JADX WARN: Multi-variable type inference failed */
    public HykyModel$uploadDeviceInfoToHyky$2$1(HykyModel r1, String r2, Continuation<? super GetSNCodeHYKY.Response> r3, Continuation<? super HykyModel$uploadDeviceInfoToHyky$2$1> r4) {
        this.this$0 = r1;
        this.$mac = r2;
        this.$continuation = r3;
        super(2, r4);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r4, Continuation<?> r5) {
        return new HykyModel$uploadDeviceInfoToHyky$2$1(this.this$0, this.$mac, this.$continuation, r5);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
        return ((HykyModel$uploadDeviceInfoToHyky$2$1) create(r1, r2)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object r12) {
        Object r2 = pb.I0iXXO();
        int r3 = this.label;
        if (r3 == 0) goto L10;
        if (r3 == 1) goto L9;
        if (r3 != 2) goto L8;
        String r4 = (String) this.L$2;
        HykyModel r5 = (HykyModel) this.L$1;
        GetSNCodeHYKY.Response r6 = (GetSNCodeHYKY.Response) this.L$0;
        ResultKt.X1ii(r12);
        String r7 = r4;
        GetSNCodeHYKY.Response r8 = r6;
        final HykyModel r10 = r5;
    L24:
        if (((Boolean) r12).booleanValue() == false) goto L28;
        NetWorkUtils r13 = NetWorkUtils.INSTANCE;
        UploadDeviceHYKY.BodyData r9 = new UploadDeviceHYKY.BodyData(0, r7, r8.getCmei(), r8.getSn(), HykyUtils.INSTANCE.getDeviceMac(false), 1, null);
        final O1XIiIO<String> r14 = new HykyModel$uploadDeviceInfoToHyky$2$1$1$1(r10);
        String r11 = HykyAPI.INSTANCE.getBASE_URL_HYKY() + UploadDeviceHYKY.URL;
        HykyManager.Companion r15 = HykyManager.Companion;
        AndroidNetworking.post(r11).addHeaders("Authorization", r15.getInstance().getToken().getTokenType() + " " + r15.getInstance().getToken().getAccessToken()).addApplicationJsonBody(r9).setTag(r11).setPriority(Priority.HIGH).build().getAsParsed(TypeToken.getParameterized(HykyResponse.class, new Type[]{String.class}), new HykyModel$uploadDeviceInfoToHyky$2$1$invokeSuspend$lambda$0$$inlined$postHyky$1(r14));
    L28:
        return Unit.OXO1;
    L8:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L9:
        ResultKt.X1ii(r12);
    L13:
        GetSNCodeHYKY.Response r16 = (GetSNCodeHYKY.Response) r12;
        Continuation<GetSNCodeHYKY.Response> r17 = this.$continuation;
        Result.Companion r18 = Result.Companion;
        r17.resumeWith(Result.m6974constructorimpl(r16));
        if (r16 == null) goto L28;
        if (r16.deviceInfoExists() == false) goto L28;
        String r19 = HykyUtils.getDeviceID$default(HykyUtils.INSTANCE, null, 1, null);
        if (r19 == null) goto L28;
        HykyModel r20 = this.this$0;
        this.L$0 = r16;
        this.L$1 = r20;
        this.L$2 = r19;
        this.I$0 = 0;
        this.label = 2;
        Object r21 = r20.refreshToken(this);
        if (r21 != r2) goto L22;
    L21:
        return r2;
    L22:
        r8 = r16;
        r12 = r21;
        r10 = r20;
        r7 = r19;
        goto L24
    L10:
        ResultKt.X1ii(r12);
        HykyModel r110 = this.this$0;
        String r22 = this.$mac;
        this.label = 1;
        r12 = r110.getSnInfo(r22, this);
        if (r12 != r2) goto L13;
        goto L13
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
        return invoke2(r1, r2);
    }
}
