package com.sma.smartv3.util.net;

import android.net.http.HttpException;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.o51;
import com.android.mltcode.paycertificationapi.pb;
import com.android.mltcode.paycertificationapi.tb1;
import java.io.IOException;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nNetResult.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetResult.kt\ncom/sma/smartv3/util/net/NetResultKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,31:1\n1#2:32\n*E\n"})
public final class NetResultKt {
    @tb1
    public static final <T> Object OXO1(@aa1 Function1<? super Continuation<? super ApiResponse<T>>, ? extends Object> r4, @aa1 Continuation<? super NetResult<? extends T>> r5) {
        if ((r5 instanceof NetResultKt$safeApiCall$1) == false) goto L7;
        NetResultKt$safeApiCall$1 r0 = (NetResultKt$safeApiCall$1) r5;
        int r1 = r0.label;
        if ((r1 & Integer.MIN_VALUE) == 0) goto L7;
        r0.label = r1 - Integer.MIN_VALUE;
    L8:
        Object r6 = r0.result;
        Object r2 = pb.I0iXXO();
        int r3 = r0.label;
        if (r3 == 0) goto L16;
        if (r3 != 1) goto L15;
        Function1 r7 = (Function1) r0.L$0;
        ResultKt.X1ii(r6);     // Catch: Exception -> L29 IOException -> L34 HttpException -> L35
    L20:
        ApiResponse r8 = (ApiResponse) r6;     // Catch: Exception -> L29 IOException -> L34 HttpException -> L35
        if (r8.isSuccess() == true) goto L23;
        String r9 = r8.getMesg();     // Catch: Exception -> L29 IOException -> L34 HttpException -> L35
        if (r9.length() != 0) goto L28;
        r9 = "Business Error";
    L28:
        return new NetResult.OXO1(r9);
    L23:
        return new NetResult.XIi00iiXO(r8.getData());
    L15:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L16:
        ResultKt.X1ii(r6);
        r0.L$0 = SpillingKt.OXO1(r4);     // Catch: Exception -> L29 IOException -> L34 HttpException -> L35
        r0.I$0 = 0;     // Catch: Exception -> L29 IOException -> L34 HttpException -> L35
        r0.label = 1;     // Catch: Exception -> L29 IOException -> L34 HttpException -> L35
        r6 = r4.invoke(r0);     // Catch: Exception -> L29 IOException -> L34 HttpException -> L35
        if (r6 != r2) goto L20;
        return r2;
    L35:
        e = move-exception;
        return new NetResult.OXO1("Http " + o51.OXO1(e));
    L29:
        e = move-exception;
        String r10 = e.getMessage();
        if (r10 != null) goto L39;
        r10 = "Unknown Error";
    L39:
        return new NetResult.OXO1(r10);
    L40:
        return new NetResult.OXO1("Network Error");
    L7:
        r0 = new NetResultKt$safeApiCall$1(r5);
        goto L8
    }

    public static final <T> Object XIi00iiXO(Function1<? super Continuation<? super ApiResponse<T>>, ? extends Object> r2, Continuation<? super NetResult<? extends T>> r3) {
        ApiResponse r4 = (ApiResponse) r2.invoke(r3);     // Catch: Exception -> L11 IOException -> L17 HttpException -> L18
        if (r4.isSuccess() == true) goto L5;
        String r5 = r4.getMesg();     // Catch: Exception -> L11 IOException -> L17 HttpException -> L18
        if (r5.length() != 0) goto L10;
        r5 = "Business Error";
    L10:
        return new NetResult.OXO1(r5);
    L5:
        return new NetResult.XIi00iiXO(r4.getData());
    L18:
        e = move-exception;
        return new NetResult.OXO1("Http " + o51.OXO1(e));
    L11:
        e = move-exception;
        String r6 = e.getMessage();
        if (r6 != null) goto L22;
        r6 = "Unknown Error";
    L22:
        return new NetResult.OXO1(r6);
    L23:
        return new NetResult.OXO1("Network Error");
    }
}
