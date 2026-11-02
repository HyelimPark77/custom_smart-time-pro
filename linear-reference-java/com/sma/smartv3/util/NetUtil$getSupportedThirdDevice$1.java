package com.sma.smartv3.util;

import android.net.http.HttpException;
import com.android.mltcode.paycertificationapi.IXiXI;
import com.android.mltcode.paycertificationapi.i1000;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.iIX01Oi;
import com.android.mltcode.paycertificationapi.o51;
import com.android.mltcode.paycertificationapi.pb;
import com.sma.smartv3.ui.device.model.ThirdPartyDeviceFilterData;
import com.sma.smartv3.util.net.ApiResponse;
import com.sma.smartv3.util.net.NetResult;
import java.io.IOException;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(c = "com.sma.smartv3.util.NetUtil$getSupportedThirdDevice$1", f = "NetUtil.kt", i = {0, 0, 0, 0, 1, 1}, l = {158, 160}, m = "invokeSuspend", n = {"$this$flow", "$completion", "$i$f$safeApiCall", "$i$a$-safeApiCall-NetUtil$getSupportedThirdDevice$1$result$1", "$this$flow", "result"}, s = {"L$0", "L$1", "I$0", "I$1", "L$0", "L$1"}, v = 1)
@SourceDebugExtension({"SMAP\nNetUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetUtil.kt\ncom/sma/smartv3/util/NetUtil$getSupportedThirdDevice$1\n+ 2 NetResult.kt\ncom/sma/smartv3/util/net/NetResultKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,164:1\n16#2,6:165\n23#2,6:172\n1#3:171\n*S KotlinDebug\n*F\n+ 1 NetUtil.kt\ncom/sma/smartv3/util/NetUtil$getSupportedThirdDevice$1\n*L\n158#1:165,6\n158#1:172,6\n158#1:171\n*E\n"})
public final class NetUtil$getSupportedThirdDevice$1 extends SuspendLambda implements Function2<IXiXI<? super NetResult<? extends List<? extends ThirdPartyDeviceFilterData>>>, Continuation<? super Unit>, Object> {
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    public NetUtil$getSupportedThirdDevice$1(Continuation<? super NetUtil$getSupportedThirdDevice$1> r2) {
        super(2, r2);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r2, Continuation<?> r3) {
        NetUtil$getSupportedThirdDevice$1 r0 = new NetUtil$getSupportedThirdDevice$1(r3);
        r0.L$0 = r2;
        return r0;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(IXiXI<? super NetResult<? extends List<ThirdPartyDeviceFilterData>>> r1, Continuation<? super Unit> r2) {
        return ((NetUtil$getSupportedThirdDevice$1) create(r1, r2)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object r7) {
        IXiXI r0 = (IXiXI) this.L$0;
        Object r1 = pb.I0iXXO();
        int r2 = this.label;
        if (r2 == 0) goto L16;
        if (r2 == 1) goto L9;
        if (r2 != 2) goto L8;
        NetResult r3 = (NetResult) this.L$1;
        ResultKt.X1ii(r7);
    L38:
        return Unit.OXO1;
    L8:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L9:
        Continuation r4 = (Continuation) this.L$1;
        ResultKt.X1ii(r7);     // Catch: Exception -> L12 HttpException -> L14 IOException -> L32
    L20:
        ApiResponse r8 = (ApiResponse) r7;     // Catch: Exception -> L12 HttpException -> L14 IOException -> L32
        if (r8.isSuccess() == false) goto L23;
        Object r5 = new NetResult.XIi00iiXO(r8.getData());     // Catch: Exception -> L12 HttpException -> L14 IOException -> L32
    L34:
        i1O0OXO1O.OXO1.OXO1("SupportedThirdDevice:" + r5);
        this.L$0 = SpillingKt.OXO1(r0);
        this.L$1 = SpillingKt.OXO1(r5);
        this.label = 2;
        if (r0.emit(r5, this) != r1) goto L38;
    L36:
        return r1;
    L23:
        String r9 = r8.getMesg();     // Catch: Exception -> L12 HttpException -> L14 IOException -> L32
        if (r9.length() != 0) goto L26;
        r9 = "Business Error";
    L26:
        r5 = new NetResult.OXO1(r9);     // Catch: Exception -> L12 HttpException -> L14 IOException -> L32
        goto L34
    L16:
        ResultKt.X1ii(r7);
        iIX01Oi r10 = i1000.OXO1.XOO0ii0();     // Catch: Exception -> L12 HttpException -> L14 IOException -> L32
        this.L$0 = r0;     // Catch: Exception -> L12 HttpException -> L14 IOException -> L32
        this.L$1 = SpillingKt.OXO1(this);     // Catch: Exception -> L12 HttpException -> L14 IOException -> L32
        this.I$0 = 0;     // Catch: Exception -> L12 HttpException -> L14 IOException -> L32
        this.I$1 = 0;     // Catch: Exception -> L12 HttpException -> L14 IOException -> L32
        this.label = 1;     // Catch: Exception -> L12 HttpException -> L14 IOException -> L32
        r7 = iIX01Oi.XIi00iiXO(r10, null, this, 1, null);     // Catch: Exception -> L12 HttpException -> L14 IOException -> L32
        if (r7 != r1) goto L20;
    L14:
        e = move-exception;
        r5 = new NetResult.OXO1("Http " + o51.OXO1(e));
    L32:
        r5 = new NetResult.OXO1("Network Error");
    L12:
        e = move-exception;
        String r11 = e.getMessage();
        if (r11 != null) goto L31;
        r11 = "Unknown Error";
    L31:
        r5 = new NetResult.OXO1(r11);
        goto L34
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(IXiXI<? super NetResult<? extends List<? extends ThirdPartyDeviceFilterData>>> r1, Continuation<? super Unit> r2) {
        return invoke2(r1, r2);
    }
}
