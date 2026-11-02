package com.sma.smartv3.util;

import android.net.http.HttpException;
import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.IXiXI;
import com.android.mltcode.paycertificationapi.i1000;
import com.android.mltcode.paycertificationapi.iIX01Oi;
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
@DebugMetadata(m39465c = "com.sma.smartv3.util.NetUtil$activeThirdDevice$1", m39466f = "NetUtil.kt", m39467i = {0, 0, 0, 0, 1, 1}, m39468l = {149, 150}, m39469m = "invokeSuspend", m39470n = {"$this$flow", "$completion", "$i$f$safeApiCall", "$i$a$-safeApiCall-NetUtil$activeThirdDevice$1$result$1", "$this$flow", "result"}, m39472s = {"L$0", "L$1", "I$0", "I$1", "L$0", "L$1"}, m39473v = 1)
@SourceDebugExtension({"SMAP\nNetUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetUtil.kt\ncom/sma/smartv3/util/NetUtil$activeThirdDevice$1\n+ 2 NetResult.kt\ncom/sma/smartv3/util/net/NetResultKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,164:1\n16#2,6:165\n23#2,6:172\n1#3:171\n*S KotlinDebug\n*F\n+ 1 NetUtil.kt\ncom/sma/smartv3/util/NetUtil$activeThirdDevice$1\n*L\n149#1:165,6\n149#1:172,6\n149#1:171\n*E\n"})
public final class NetUtil$activeThirdDevice$1 extends SuspendLambda implements Function2<IXiXI<? super NetResult<? extends ThirdPartyDeviceData>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $text;
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetUtil$activeThirdDevice$1(String str, Continuation<? super NetUtil$activeThirdDevice$1> continuation) {
        super(2, continuation);
        this.$text = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        NetUtil$activeThirdDevice$1 netUtil$activeThirdDevice$1 = new NetUtil$activeThirdDevice$1(this.$text, continuation);
        netUtil$activeThirdDevice$1.L$0 = obj;
        return netUtil$activeThirdDevice$1;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(IXiXI<? super NetResult<ThirdPartyDeviceData>> iXiXI, Continuation<? super Unit> continuation) {
        return ((NetUtil$activeThirdDevice$1) create(iXiXI, continuation)).invokeSuspend(Unit.OXO1);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006a A[Catch: Exception -> 0x0074, HttpException -> 0x0077, IOException -> 0x00a0, TryCatch #5 {HttpException -> 0x0077, IOException -> 0x00a0, Exception -> 0x0074, blocks: (B:23:0x0062, B:25:0x006a, B:30:0x007a, B:33:0x0086, B:20:0x005a), top: B:57:0x005a }] */
    /* JADX WARN: Code duplicated, block: B:30:0x007a A[Catch: Exception -> 0x0074, HttpException -> 0x0077, IOException -> 0x00a0, TryCatch #5 {HttpException -> 0x0077, IOException -> 0x00a0, Exception -> 0x0074, blocks: (B:23:0x0062, B:25:0x006a, B:30:0x007a, B:33:0x0086, B:20:0x005a), top: B:57:0x005a }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0084  */
    /* JADX WARN: Code duplicated, block: B:41:0x009a  */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d4, code lost:
    
        if (r1.emit(r0, r10) == r2) goto L47;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        NetUtil$activeThirdDevice$1 netUtil$activeThirdDevice$1;
        Object oxo1;
        Exception exc;
        HttpException httpException;
        String message;
        ApiResponse apiResponse;
        String mesg;
        IXiXI iXiXI = (IXiXI) this.L$0;
        Object objI0iXXO = C2798pb.I0iXXO();
        int i = this.label;
        try {
            if (i != 0) {
                if (i == 1) {
                    try {
                        ResultKt.X1ii(obj);
                        netUtil$activeThirdDevice$1 = this;
                        apiResponse = (ApiResponse) obj;
                        if (apiResponse.isSuccess()) {
                            oxo1 = new NetResult.XIi00iiXO(apiResponse.getData());
                        } else {
                            mesg = apiResponse.getMesg();
                            if (mesg.length() == 0) {
                                mesg = "Business Error";
                            }
                            oxo1 = new NetResult.OXO1(mesg);
                        }
                    } catch (HttpException e) {
                        httpException = e;
                        netUtil$activeThirdDevice$1 = this;
                        oxo1 = new NetResult.OXO1("Http " + httpException.getMessage());
                    } catch (Exception e2) {
                        exc = e2;
                        netUtil$activeThirdDevice$1 = this;
                        message = exc.getMessage();
                        if (message == null) {
                            message = "Unknown Error";
                        }
                        oxo1 = new NetResult.OXO1(message);
                    }
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.X1ii(obj);
                }
                return Unit.OXO1;
            }
            ResultKt.X1ii(obj);
            String str = this.$text;
            try {
                iIX01Oi iix01oiXOO0ii0 = i1000.OXO1.XOO0ii0();
                this.L$0 = iXiXI;
                this.L$1 = SpillingKt.OXO1(this);
                this.I$0 = 0;
                this.I$1 = 0;
                this.label = 1;
                netUtil$activeThirdDevice$1 = this;
                try {
                    obj = iIX01Oi.OIi0(iix01oiXOO0ii0, str, null, netUtil$activeThirdDevice$1, 2, null);
                    if (obj != objI0iXXO) {
                        apiResponse = (ApiResponse) obj;
                        if (apiResponse.isSuccess()) {
                            oxo1 = new NetResult.XIi00iiXO(apiResponse.getData());
                        } else {
                            mesg = apiResponse.getMesg();
                            if (mesg.length() == 0) {
                                mesg = "Business Error";
                            }
                            oxo1 = new NetResult.OXO1(mesg);
                        }
                    }
                } catch (HttpException e3) {
                    e = e3;
                    httpException = e;
                    oxo1 = new NetResult.OXO1("Http " + httpException.getMessage());
                } catch (IOException unused) {
                    oxo1 = new NetResult.OXO1("Network Error");
                } catch (Exception e4) {
                    e = e4;
                    exc = e;
                    message = exc.getMessage();
                    if (message == null) {
                        message = "Unknown Error";
                    }
                    oxo1 = new NetResult.OXO1(message);
                }
            } catch (HttpException e5) {
                e = e5;
                netUtil$activeThirdDevice$1 = this;
            } catch (Exception e6) {
                e = e6;
                netUtil$activeThirdDevice$1 = this;
            }
            return objI0iXXO;
        } catch (IOException unused2) {
            netUtil$activeThirdDevice$1 = this;
        }
        netUtil$activeThirdDevice$1.L$0 = SpillingKt.OXO1(iXiXI);
        netUtil$activeThirdDevice$1.L$1 = SpillingKt.OXO1(oxo1);
        netUtil$activeThirdDevice$1.label = 2;
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: invoke */
    public /* bridge */ /* synthetic */ Object invoke2(IXiXI<? super NetResult<? extends ThirdPartyDeviceData>> iXiXI, Continuation<? super Unit> continuation) {
        return invoke2((IXiXI<? super NetResult<ThirdPartyDeviceData>>) iXiXI, continuation);
    }
}
