package com.sma.smartv3.util;

import android.net.http.HttpException;
import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.IXiXI;
import com.android.mltcode.paycertificationapi.i1000;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.iIX01Oi;
import com.sma.smartv3.p610ui.device.model.ThirdPartyDeviceFilterData;
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
@DebugMetadata(m39465c = "com.sma.smartv3.util.NetUtil$getSupportedThirdDevice$1", m39466f = "NetUtil.kt", m39467i = {0, 0, 0, 0, 1, 1}, m39468l = {158, 160}, m39469m = "invokeSuspend", m39470n = {"$this$flow", "$completion", "$i$f$safeApiCall", "$i$a$-safeApiCall-NetUtil$getSupportedThirdDevice$1$result$1", "$this$flow", "result"}, m39472s = {"L$0", "L$1", "I$0", "I$1", "L$0", "L$1"}, m39473v = 1)
@SourceDebugExtension({"SMAP\nNetUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetUtil.kt\ncom/sma/smartv3/util/NetUtil$getSupportedThirdDevice$1\n+ 2 NetResult.kt\ncom/sma/smartv3/util/net/NetResultKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,164:1\n16#2,6:165\n23#2,6:172\n1#3:171\n*S KotlinDebug\n*F\n+ 1 NetUtil.kt\ncom/sma/smartv3/util/NetUtil$getSupportedThirdDevice$1\n*L\n158#1:165,6\n158#1:172,6\n158#1:171\n*E\n"})
public final class NetUtil$getSupportedThirdDevice$1 extends SuspendLambda implements Function2<IXiXI<? super NetResult<? extends List<? extends ThirdPartyDeviceFilterData>>>, Continuation<? super Unit>, Object> {
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    public NetUtil$getSupportedThirdDevice$1(Continuation<? super NetUtil$getSupportedThirdDevice$1> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        NetUtil$getSupportedThirdDevice$1 netUtil$getSupportedThirdDevice$1 = new NetUtil$getSupportedThirdDevice$1(continuation);
        netUtil$getSupportedThirdDevice$1.L$0 = obj;
        return netUtil$getSupportedThirdDevice$1;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(IXiXI<? super NetResult<? extends List<ThirdPartyDeviceFilterData>>> iXiXI, Continuation<? super Unit> continuation) {
        return ((NetUtil$getSupportedThirdDevice$1) create(iXiXI, continuation)).invokeSuspend(Unit.OXO1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00cc, code lost:
    
        if (r0.emit(r2, r6) == r1) goto L36;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object oxo1;
        IXiXI iXiXI = (IXiXI) this.L$0;
        Object objI0iXXO = C2798pb.I0iXXO();
        int i = this.label;
        try {
            if (i != 0) {
                if (i == 1) {
                    ResultKt.X1ii(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.X1ii(obj);
                }
                return Unit.OXO1;
            }
            ResultKt.X1ii(obj);
            iIX01Oi iix01oiXOO0ii0 = i1000.OXO1.XOO0ii0();
            this.L$0 = iXiXI;
            this.L$1 = SpillingKt.OXO1(this);
            this.I$0 = 0;
            this.I$1 = 0;
            this.label = 1;
            obj = iIX01Oi.XIi00iiXO(iix01oiXOO0ii0, null, this, 1, null);
            if (obj == objI0iXXO) {
            }
            return objI0iXXO;
            ApiResponse apiResponse = (ApiResponse) obj;
            if (apiResponse.isSuccess()) {
                oxo1 = new NetResult.XIi00iiXO(apiResponse.getData());
            } else {
                String mesg = apiResponse.getMesg();
                if (mesg.length() == 0) {
                    mesg = "Business Error";
                }
                oxo1 = new NetResult.OXO1(mesg);
            }
        } catch (HttpException e) {
            oxo1 = new NetResult.OXO1("Http " + e.getMessage());
        } catch (IOException unused) {
            oxo1 = new NetResult.OXO1("Network Error");
        } catch (Exception e2) {
            String message = e2.getMessage();
            if (message == null) {
                message = "Unknown Error";
            }
            oxo1 = new NetResult.OXO1(message);
        }
        i1O0OXO1O.OXO1.OXO1("SupportedThirdDevice:" + oxo1);
        this.L$0 = SpillingKt.OXO1(iXiXI);
        this.L$1 = SpillingKt.OXO1(oxo1);
        this.label = 2;
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: invoke */
    public /* bridge */ /* synthetic */ Object invoke2(IXiXI<? super NetResult<? extends List<? extends ThirdPartyDeviceFilterData>>> iXiXI, Continuation<? super Unit> continuation) {
        return invoke2((IXiXI<? super NetResult<? extends List<ThirdPartyDeviceFilterData>>>) iXiXI, continuation);
    }
}
