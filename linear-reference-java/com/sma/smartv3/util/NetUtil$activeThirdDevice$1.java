package com.sma.smartv3.util;

import android.net.http.HttpException;
import com.android.mltcode.paycertificationapi.IXiXI;
import com.android.mltcode.paycertificationapi.i1000;
import com.android.mltcode.paycertificationapi.iIX01Oi;
import com.android.mltcode.paycertificationapi.o51;
import com.android.mltcode.paycertificationapi.pb;
import com.sma.smartv3.dto.ThirdPartyDeviceData;
import com.sma.smartv3.util.net.ApiResponse;
import com.sma.smartv3.util.net.NetResult;
import java.io.IOException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(c = "com.sma.smartv3.util.NetUtil$activeThirdDevice$1", f = "NetUtil.kt", i = {0, 0, 0, 0, 1, 1}, l = {149, 150}, m = "invokeSuspend", n = {"$this$flow", "$completion", "$i$f$safeApiCall", "$i$a$-safeApiCall-NetUtil$activeThirdDevice$1$result$1", "$this$flow", "result"}, s = {"L$0", "L$1", "I$0", "I$1", "L$0", "L$1"}, v = 1)
@SourceDebugExtension({"SMAP\nNetUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetUtil.kt\ncom/sma/smartv3/util/NetUtil$activeThirdDevice$1\n+ 2 NetResult.kt\ncom/sma/smartv3/util/net/NetResultKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,164:1\n16#2,6:165\n23#2,6:172\n1#3:171\n*S KotlinDebug\n*F\n+ 1 NetUtil.kt\ncom/sma/smartv3/util/NetUtil$activeThirdDevice$1\n*L\n149#1:165,6\n149#1:172,6\n149#1:171\n*E\n"})
public final class NetUtil$activeThirdDevice$1 extends SuspendLambda implements Function2<IXiXI<? super NetResult<? extends ThirdPartyDeviceData>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $text;
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    public NetUtil$activeThirdDevice$1(String r1, Continuation<? super NetUtil$activeThirdDevice$1> r2) {
        this.$text = r1;
        super(2, r2);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
        NetUtil$activeThirdDevice$1 r0 = new NetUtil$activeThirdDevice$1(this.$text, r4);
        r0.L$0 = r3;
        return r0;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(IXiXI<? super NetResult<ThirdPartyDeviceData>> r1, Continuation<? super Unit> r2) {
        return ((NetUtil$activeThirdDevice$1) create(r1, r2)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object r11) {
        IXiXI r1 = (IXiXI) this.L$0;
        Object r2 = pb.I0iXXO();
        int r0 = this.label;
        if (r0 == 0) goto L17;
        if (r0 == 1) goto L9;
        if (r0 != 2) goto L8;
        NetResult r3 = (NetResult) this.L$1;
        ResultKt.X1ii(r11);
    L49:
        return Unit.OXO1;
    L8:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L9:
        Continuation r4 = (Continuation) this.L$1;
        ResultKt.X1ii(r11);     // Catch: Exception -> L12 IOException -> L14 HttpException -> L15
        NetUtil$activeThirdDevice$1 r7 = this;
    L23:
        ApiResponse r12 = (ApiResponse) r11;     // Catch: Exception -> L26 HttpException -> L28 IOException -> L50
        if (r12.isSuccess() == false) goto L30;
        Object r5 = new NetResult.XIi00iiXO(r12.getData());     // Catch: Exception -> L26 HttpException -> L28 IOException -> L50
    L45:
        r7.L$0 = SpillingKt.OXO1(r1);
        r7.L$1 = SpillingKt.OXO1(r5);
        r7.label = 2;
        if (r1.emit(r5, this) != r2) goto L49;
    L47:
        return r2;
    L30:
        String r13 = r12.getMesg();     // Catch: Exception -> L26 HttpException -> L28 IOException -> L50
        if (r13.length() != 0) goto L33;
        r13 = "Business Error";
    L33:
        r5 = new NetResult.OXO1(r13);     // Catch: Exception -> L26 HttpException -> L28 IOException -> L50
        goto L45
    L15:
        e = move-exception;
        HttpException r14 = e;
        r7 = this;
    L44:
        r5 = new NetResult.OXO1("Http " + o51.OXO1(r14));
    L12:
        e = move-exception;
        Exception r15 = e;
        r7 = this;
    L39:
        String r16 = r15.getMessage();
        if (r16 != null) goto L42;
        r16 = "Unknown Error";
    L42:
        r5 = new NetResult.OXO1(r16);
        goto L45
    L17:
        ResultKt.X1ii(r11);
        String r6 = this.$text;
        iIX01Oi r17 = i1000.OXO1.XOO0ii0();     // Catch: IOException -> L14 Exception -> L35 HttpException -> L37
        this.L$0 = r1;     // Catch: IOException -> L14 Exception -> L35 HttpException -> L37
        this.L$1 = SpillingKt.OXO1(this);     // Catch: IOException -> L14 Exception -> L35 HttpException -> L37
        this.I$0 = 0;     // Catch: IOException -> L14 Exception -> L35 HttpException -> L37
        this.I$1 = 0;     // Catch: IOException -> L14 Exception -> L35 HttpException -> L37
        this.label = 1;     // Catch: IOException -> L14 Exception -> L35 HttpException -> L37
        r7 = this;
        r11 = iIX01Oi.OIi0(r17, r6, null, r7, 2, null);     // Catch: Exception -> L26 HttpException -> L28 IOException -> L50
        if (r11 != r2) goto L23;
    L28:
        e = e;
    L29:
        r14 = e;
    L26:
        e = e;
    L27:
        r15 = e;
    L43:
        r5 = new NetResult.OXO1("Network Error");
        goto L45
    L37:
        e = e;
        r7 = this;
    L35:
        e = e;
        r7 = this;
    L14:
        r7 = this;
        goto L43
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(IXiXI<? super NetResult<? extends ThirdPartyDeviceData>> r1, Continuation<? super Unit> r2) {
        return invoke2(r1, r2);
    }
}
