package com.sma.smartv3.util;

import android.net.http.HttpException;
import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.i1000;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.iIX01Oi;
import com.android.mltcode.paycertificationapi.oe5;
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
@DebugMetadata(m39465c = "com.sma.smartv3.util.NetUtil$getThirdDeviceInfo$2", m39466f = "NetUtil.kt", m39467i = {0, 0, 0, 0, 0}, m39468l = {119}, m39469m = "invokeSuspend", m39470n = {"bleInfo", "mac", "$completion", "$i$f$safeApiCall", "$i$a$-safeApiCall-NetUtil$getThirdDeviceInfo$2$result$1"}, m39472s = {"L$0", "L$1", "L$2", "I$0", "I$1"}, m39473v = 1)
@SourceDebugExtension({"SMAP\nNetUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetUtil.kt\ncom/sma/smartv3/util/NetUtil$getThirdDeviceInfo$2\n+ 2 NetResult.kt\ncom/sma/smartv3/util/net/NetResultKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,164:1\n16#2,6:165\n23#2,6:172\n1#3:171\n*S KotlinDebug\n*F\n+ 1 NetUtil.kt\ncom/sma/smartv3/util/NetUtil$getThirdDeviceInfo$2\n*L\n119#1:165,6\n119#1:172,6\n119#1:171\n*E\n"})
public final class NetUtil$getThirdDeviceInfo$2 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;

    public NetUtil$getThirdDeviceInfo$2(Continuation<? super NetUtil$getThirdDeviceInfo$2> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new NetUtil$getThirdDeviceInfo$2(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
        return ((NetUtil$getThirdDeviceInfo$2) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        NetResult oxo1;
        OXO1 oxo2;
        String strIXO0OOi;
        String strXiOIii1;
        OXO1 oxo3;
        Object objI0iXXO = C2798pb.I0iXXO();
        int i = this.label;
        try {
            try {
                try {
                    if (i == 0) {
                        ResultKt.X1ii(obj);
                        OXO1 oxo1XIi00iiXO = OXO1.I0iXXO.XIi00iiXO();
                        if (oxo1XIi00iiXO == null || (strXiOIii1 = oxo1XIi00iiXO.XiOIii1()) == null || (strIXO0OOi = oe5.IXO0OOi(strXiOIii1, CertificateUtil.DELIMITER, "", false, 4, null)) == null) {
                            strIXO0OOi = "";
                        }
                        iIX01Oi iix01oiXOO0ii0 = i1000.OXO1.XOO0ii0();
                        this.L$0 = oxo1XIi00iiXO;
                        this.L$1 = SpillingKt.OXO1(strIXO0OOi);
                        this.L$2 = SpillingKt.OXO1(this);
                        this.I$0 = 0;
                        this.I$1 = 0;
                        this.label = 1;
                        obj = iix01oiXOO0ii0.OXO1(strIXO0OOi, this);
                        oxo3 = oxo1XIi00iiXO;
                        if (obj == objI0iXXO) {
                            return objI0iXXO;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        OXO1 oxo4 = (OXO1) this.L$0;
                        ResultKt.X1ii(obj);
                        oxo3 = oxo4;
                    }
                    ApiResponse apiResponse = (ApiResponse) obj;
                    if (apiResponse.isSuccess()) {
                        oxo1 = new NetResult.XIi00iiXO(apiResponse.getData());
                        oxo2 = oxo3;
                    } else {
                        String mesg = apiResponse.getMesg();
                        if (mesg.length() == 0) {
                            mesg = "Business Error";
                        }
                        oxo1 = new NetResult.OXO1(mesg);
                        oxo2 = oxo3;
                    }
                } catch (HttpException e) {
                    oxo1 = new NetResult.OXO1("Http " + e.getMessage());
                    oxo2 = i;
                }
            } catch (IOException unused) {
                oxo1 = new NetResult.OXO1("Network Error");
                oxo2 = i;
            } catch (Exception e2) {
                String message = e2.getMessage();
                if (message == null) {
                    message = "Unknown Error";
                }
                oxo1 = new NetResult.OXO1(message);
                oxo2 = i;
            }
            if (oxo1 instanceof NetResult.OXO1) {
                ToastUtils.showLong(((NetResult.OXO1) oxo1).XO0O10(), new Object[0]);
            } else {
                if (!(oxo1 instanceof NetResult.XIi00iiXO)) {
                    throw new NoWhenBranchMatchedException();
                }
                if (oxo2 != 0) {
                    oxo2.i010I((ThirdPartyDeviceData) ((NetResult.XIi00iiXO) oxo1).XO0O10());
                }
                i1O0OXO1O.OXO1.OXO1("ThirdDeviceInfo:" + oxo2 + " " + ((NetResult.XIi00iiXO) oxo1).XO0O10());
            }
        } catch (Exception e3) {
            e3.printStackTrace();
        }
        return Unit.OXO1;
    }
}
