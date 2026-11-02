package com.sma.smartv3.util.net;

import android.net.http.HttpException;
import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.aa1;
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
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @tb1
    public static final <T> Object OXO1(@aa1 Function1<? super Continuation<? super ApiResponse<T>>, ? extends Object> function1, @aa1 Continuation<? super NetResult<? extends T>> continuation) {
        NetResultKt$safeApiCall$1 netResultKt$safeApiCall$1;
        if (continuation instanceof NetResultKt$safeApiCall$1) {
            netResultKt$safeApiCall$1 = (NetResultKt$safeApiCall$1) continuation;
            int i = netResultKt$safeApiCall$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                netResultKt$safeApiCall$1.label = i - Integer.MIN_VALUE;
            } else {
                netResultKt$safeApiCall$1 = new NetResultKt$safeApiCall$1(continuation);
            }
        } else {
            netResultKt$safeApiCall$1 = new NetResultKt$safeApiCall$1(continuation);
        }
        Object objInvoke2 = netResultKt$safeApiCall$1.result;
        Object objI0iXXO = C2798pb.I0iXXO();
        int i2 = netResultKt$safeApiCall$1.label;
        try {
            if (i2 == 0) {
                ResultKt.X1ii(objInvoke2);
                netResultKt$safeApiCall$1.L$0 = SpillingKt.OXO1(function1);
                netResultKt$safeApiCall$1.I$0 = 0;
                netResultKt$safeApiCall$1.label = 1;
                objInvoke2 = function1.invoke2(netResultKt$safeApiCall$1);
                if (objInvoke2 == objI0iXXO) {
                    return objI0iXXO;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.X1ii(objInvoke2);
            }
            ApiResponse apiResponse = (ApiResponse) objInvoke2;
            if (apiResponse.isSuccess()) {
                return new NetResult.XIi00iiXO(apiResponse.getData());
            }
            String mesg = apiResponse.getMesg();
            if (mesg.length() == 0) {
                mesg = "Business Error";
            }
            return new NetResult.OXO1(mesg);
        } catch (HttpException e) {
            return new NetResult.OXO1("Http " + e.getMessage());
        } catch (IOException unused) {
            return new NetResult.OXO1("Network Error");
        } catch (Exception e2) {
            String message = e2.getMessage();
            if (message == null) {
                message = "Unknown Error";
            }
            return new NetResult.OXO1(message);
        }
    }

    public static final <T> Object XIi00iiXO(Function1<? super Continuation<? super ApiResponse<T>>, ? extends Object> function1, Continuation<? super NetResult<? extends T>> continuation) {
        try {
            ApiResponse apiResponse = (ApiResponse) function1.invoke2(continuation);
            if (apiResponse.isSuccess()) {
                return new NetResult.XIi00iiXO(apiResponse.getData());
            }
            String mesg = apiResponse.getMesg();
            if (mesg.length() == 0) {
                mesg = "Business Error";
            }
            return new NetResult.OXO1(mesg);
        } catch (HttpException e) {
            return new NetResult.OXO1("Http " + e.getMessage());
        } catch (IOException unused) {
            return new NetResult.OXO1("Network Error");
        } catch (Exception e2) {
            String message = e2.getMessage();
            if (message == null) {
                message = "Unknown Error";
            }
            return new NetResult.OXO1(message);
        }
    }
}
