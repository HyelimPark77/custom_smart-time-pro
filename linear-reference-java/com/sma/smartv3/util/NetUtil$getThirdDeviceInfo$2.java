package com.sma.smartv3.util;

import android.net.http.HttpException;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.i1000;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.iIX01Oi;
import com.android.mltcode.paycertificationapi.o51;
import com.android.mltcode.paycertificationapi.oe5;
import com.android.mltcode.paycertificationapi.pb;
import com.blankj.utilcode.util.ToastUtils;
import com.facebook.internal.security.CertificateUtil;
import com.sma.smartv3.dto.OXO1;
import com.sma.smartv3.dto.ThirdPartyDeviceData;
import com.sma.smartv3.util.net.ApiResponse;
import com.sma.smartv3.util.net.NetResult;
import java.io.IOException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(c = "com.sma.smartv3.util.NetUtil$getThirdDeviceInfo$2", f = "NetUtil.kt", i = {0, 0, 0, 0, 0}, l = {119}, m = "invokeSuspend", n = {"bleInfo", "mac", "$completion", "$i$f$safeApiCall", "$i$a$-safeApiCall-NetUtil$getThirdDeviceInfo$2$result$1"}, s = {"L$0", "L$1", "L$2", "I$0", "I$1"}, v = 1)
@SourceDebugExtension({"SMAP\nNetUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetUtil.kt\ncom/sma/smartv3/util/NetUtil$getThirdDeviceInfo$2\n+ 2 NetResult.kt\ncom/sma/smartv3/util/net/NetResultKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,164:1\n16#2,6:165\n23#2,6:172\n1#3:171\n*S KotlinDebug\n*F\n+ 1 NetUtil.kt\ncom/sma/smartv3/util/NetUtil$getThirdDeviceInfo$2\n*L\n119#1:165,6\n119#1:172,6\n119#1:171\n*E\n"})
public final class NetUtil$getThirdDeviceInfo$2 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;

    public NetUtil$getThirdDeviceInfo$2(Continuation<? super NetUtil$getThirdDeviceInfo$2> r2) {
        super(2, r2);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r1, Continuation<?> r2) {
        return new NetUtil$getThirdDeviceInfo$2(r2);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
        return ((NetUtil$getThirdDeviceInfo$2) create(r1, r2)).invokeSuspend(Unit.OXO1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object r11) {
        Object r0 = pb.I0iXXO();
        int r1 = this.label;
        if (r1 == 0) goto L14;
        if (r1 != 1) goto L13;
        Continuation r2 = (Continuation) this.L$2;
        String r3 = (String) this.L$1;
        OXO1 r4 = (OXO1) this.L$0;
        ResultKt.X1ii(r11);     // Catch: Exception -> L8 HttpException -> L10 IOException -> L40
        OXO1 r5 = r4;
    L28:
        ApiResponse r12 = (ApiResponse) r11;     // Catch: Exception -> L8 HttpException -> L10 IOException -> L40
        if (r12.isSuccess() == false) goto L31;
        NetResult r6 = new NetResult.XIi00iiXO(r12.getData());     // Catch: Exception -> L8 HttpException -> L10 IOException -> L40
        OXO1 r7 = r5;
    L43:
        if ((r6 instanceof NetResult.OXO1) == false) goto L46;
        ToastUtils.showLong(((NetResult.OXO1) r6).XO0O10(), new Object[0]);     // Catch: Exception -> L22
    L54:
        return Unit.OXO1;
    L46:
        if ((r6 instanceof NetResult.XIi00iiXO) == false) goto L51;
        if (r7 == 0) goto L49;
        r7.i010I((ThirdPartyDeviceData) ((NetResult.XIi00iiXO) r6).XO0O10());     // Catch: Exception -> L22
    L49:
        i1O0OXO1O.OXO1.OXO1("ThirdDeviceInfo:" + r7 + " " + ((NetResult.XIi00iiXO) r6).XO0O10());     // Catch: Exception -> L22
        goto L54
    L51:
        throw new NoWhenBranchMatchedException();     // Catch: Exception -> L22
    L31:
        String r13 = r12.getMesg();     // Catch: Exception -> L8 HttpException -> L10 IOException -> L40
        if (r13.length() != 0) goto L34;
        r13 = "Business Error";
    L34:
        r6 = new NetResult.OXO1(r13);     // Catch: Exception -> L8 HttpException -> L10 IOException -> L40
        r7 = r5;
        goto L43
    L13:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L14:
        ResultKt.X1ii(r11);
        OXO1 r8 = OXO1.I0iXXO.XIi00iiXO();     // Catch: Exception -> L22
        if (r8 == null) goto L24;
        String r9 = r8.XiOIii1();     // Catch: Exception -> L22
        if (r9 == null) goto L24;
        String r14 = oe5.IXO0OOi(r9, CertificateUtil.DELIMITER, "", false, 4, null);     // Catch: Exception -> L22
        if (r14 == null) goto L24;
    L25:
        iIX01Oi r10 = i1000.OXO1.XOO0ii0();     // Catch: Exception -> L8 HttpException -> L10 IOException -> L40
        this.L$0 = r8;     // Catch: Exception -> L8 HttpException -> L10 IOException -> L40
        this.L$1 = SpillingKt.OXO1(r14);     // Catch: Exception -> L8 HttpException -> L10 IOException -> L40
        this.L$2 = SpillingKt.OXO1(this);     // Catch: Exception -> L8 HttpException -> L10 IOException -> L40
        this.I$0 = 0;     // Catch: Exception -> L8 HttpException -> L10 IOException -> L40
        this.I$1 = 0;     // Catch: Exception -> L8 HttpException -> L10 IOException -> L40
        this.label = 1;     // Catch: Exception -> L8 HttpException -> L10 IOException -> L40
        r11 = r10.OXO1(r14, this);     // Catch: Exception -> L8 HttpException -> L10 IOException -> L40
        r5 = r8;
        if (r11 != r0) goto L28;
        return r0;
    L24:
        r14 = "";
    L22:
        e = move-exception;
        e.printStackTrace();
    L10:
        e = move-exception;
        r6 = new NetResult.OXO1("Http " + o51.OXO1(e));     // Catch: Exception -> L22
        r7 = r1;
    L40:
        r6 = new NetResult.OXO1("Network Error");     // Catch: Exception -> L22
        r7 = r1;
    L8:
        e = move-exception;
        String r15 = e.getMessage();     // Catch: Exception -> L22
        if (r15 != null) goto L39;
        r15 = "Unknown Error";
    L39:
        r6 = new NetResult.OXO1(r15);     // Catch: Exception -> L22
        r7 = r1;
        goto L43
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
        return invoke2(r1, r2);
    }
}
