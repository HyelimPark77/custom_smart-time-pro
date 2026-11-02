package com.sma.smartv3.util;

import android.net.http.HttpException;
import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.IXiXI;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.i1000;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.iIX01Oi;
import com.blankj.utilcode.util.SPUtils;
import com.google.gson.Gson;
import com.sma.smartv3.model.AppUser;
import com.sma.smartv3.util.net.ApiResponse;
import com.sma.smartv3.util.net.NetResult;
import com.sma.smartv3.util.websocket.data.TranslationTime;
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
@DebugMetadata(m39465c = "com.sma.smartv3.util.NetUtil$getMockTranslationTime$1", m39466f = "NetUtil.kt", m39467i = {0, 0, 1, 1, 1, 1, 1, 2, 2, 2}, m39468l = {49, 51, 52}, m39469m = "invokeSuspend", m39470n = {"$this$flow", "appUser", "$this$flow", "appUser", "$completion", "$i$f$safeApiCall", "$i$a$-safeApiCall-NetUtil$getMockTranslationTime$1$result$1", "$this$flow", "appUser", "result"}, m39472s = {"L$0", "L$1", "L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2"}, m39473v = 1)
@SourceDebugExtension({"SMAP\nNetUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetUtil.kt\ncom/sma/smartv3/util/NetUtil$getMockTranslationTime$1\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 NetResult.kt\ncom/sma/smartv3/util/net/NetResultKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,164:1\n19#2:165\n15#2:166\n16#3,6:167\n23#3,6:174\n1#4:173\n*S KotlinDebug\n*F\n+ 1 NetUtil.kt\ncom/sma/smartv3/util/NetUtil$getMockTranslationTime$1\n*L\n47#1:165\n47#1:166\n51#1:167,6\n51#1:174,6\n51#1:173\n*E\n"})
public final class NetUtil$getMockTranslationTime$1 extends SuspendLambda implements Function2<IXiXI<? super NetResult<? extends TranslationTime>>, Continuation<? super Unit>, Object> {
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    public NetUtil$getMockTranslationTime$1(Continuation<? super NetUtil$getMockTranslationTime$1> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        NetUtil$getMockTranslationTime$1 netUtil$getMockTranslationTime$1 = new NetUtil$getMockTranslationTime$1(continuation);
        netUtil$getMockTranslationTime$1.L$0 = obj;
        return netUtil$getMockTranslationTime$1;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(IXiXI<? super NetResult<TranslationTime>> iXiXI, Continuation<? super Unit> continuation) {
        return ((NetUtil$getMockTranslationTime$1) create(iXiXI, continuation)).invokeSuspend(Unit.OXO1);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00fd A[Catch: Exception -> 0x003d, HttpException -> 0x0040, IOException -> 0x0130, TryCatch #4 {HttpException -> 0x0040, IOException -> 0x0130, Exception -> 0x003d, blocks: (B:11:0x0036, B:32:0x00f5, B:34:0x00fd, B:35:0x0107, B:38:0x0113), top: B:57:0x0036 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0107 A[Catch: Exception -> 0x003d, HttpException -> 0x0040, IOException -> 0x0130, TryCatch #4 {HttpException -> 0x0040, IOException -> 0x0130, Exception -> 0x003d, blocks: (B:11:0x0036, B:32:0x00f5, B:34:0x00fd, B:35:0x0107, B:38:0x0113), top: B:57:0x0036 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x0111  */
    /* JADX WARN: Code duplicated, block: B:47:0x012a  */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0167, code lost:
    
        if (r6.emit(r0, r39) == r7) goto L53;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        AppUser appUser;
        AppUser appUser2;
        AppUser appUser3;
        Object objI0iXXO;
        NetResult oxo1;
        String message;
        NetResult oxo2;
        ApiResponse apiResponse;
        String mesg;
        IXiXI iXiXI = (IXiXI) this.L$0;
        Object objI0iXXO2 = C2798pb.I0iXXO();
        int i = this.label;
        try {
            if (i == 0) {
                ResultKt.X1ii(obj);
                SPUtils sPUtilsIiI10X = a01.OXO1.IiI10X();
                Object appUser4 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
                Object objFromJson = new Gson().fromJson(sPUtilsIiI10X.getString(AppUser.class.getName()), (Class<Object>) AppUser.class);
                if (objFromJson != null) {
                    appUser4 = objFromJson;
                }
                appUser = (AppUser) appUser4;
                if (appUser.getIdentity().length() == 0) {
                    NetResult.OXO1 oxo3 = new NetResult.OXO1("User is not login");
                    this.L$0 = iXiXI;
                    this.L$1 = appUser;
                    this.label = 1;
                    if (iXiXI.emit(oxo3, this) != objI0iXXO2) {
                    }
                }
                return objI0iXXO2;
            }
            if (i == 1) {
                appUser = (AppUser) this.L$1;
                ResultKt.X1ii(obj);
            } else if (i == 2) {
                appUser3 = (AppUser) this.L$1;
                try {
                    ResultKt.X1ii(obj);
                    objI0iXXO = obj;
                    apiResponse = (ApiResponse) objI0iXXO;
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
                    e = e;
                    oxo1 = new NetResult.OXO1("Http " + e.getMessage());
                } catch (IOException unused) {
                    oxo2 = new NetResult.OXO1("Network Error");
                    this.L$0 = SpillingKt.OXO1(iXiXI);
                    this.L$1 = SpillingKt.OXO1(appUser3);
                    this.L$2 = oxo2;
                    this.label = 3;
                } catch (Exception e2) {
                    e = e2;
                    message = e.getMessage();
                    if (message == null) {
                        message = "Unknown Error";
                    }
                    oxo1 = new NetResult.OXO1(message);
                }
                oxo2 = oxo1;
                this.L$0 = SpillingKt.OXO1(iXiXI);
                this.L$1 = SpillingKt.OXO1(appUser3);
                this.L$2 = oxo2;
                this.label = 3;
            } else {
                if (i != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oxo2 = (NetResult) this.L$2;
                ResultKt.X1ii(obj);
            }
            i1O0OXO1O.OXO1.OXO1("TranslationTime Result :" + oxo2);
            return Unit.OXO1;
            iIX01Oi iix01oiXOO0ii0 = i1000.OXO1.XOO0ii0();
            String identity = appUser2.getIdentity();
            this.L$0 = iXiXI;
            this.L$1 = SpillingKt.OXO1(appUser2);
            this.L$2 = SpillingKt.OXO1(this);
            this.I$0 = 0;
            this.I$1 = 0;
            this.label = 2;
            objI0iXXO = iIX01Oi.I0iXXO(iix01oiXOO0ii0, identity, null, this, 2, null);
            if (objI0iXXO != objI0iXXO2) {
                appUser3 = appUser2;
                apiResponse = (ApiResponse) objI0iXXO;
                if (apiResponse.isSuccess()) {
                    oxo1 = new NetResult.XIi00iiXO(apiResponse.getData());
                } else {
                    mesg = apiResponse.getMesg();
                    if (mesg.length() == 0) {
                        mesg = "Business Error";
                    }
                    oxo1 = new NetResult.OXO1(mesg);
                }
                oxo2 = oxo1;
                this.L$0 = SpillingKt.OXO1(iXiXI);
                this.L$1 = SpillingKt.OXO1(appUser3);
                this.L$2 = oxo2;
                this.label = 3;
            }
        } catch (HttpException e3) {
            e = e3;
            appUser3 = appUser2;
            oxo1 = new NetResult.OXO1("Http " + e.getMessage());
        } catch (IOException unused2) {
            appUser3 = appUser2;
            oxo2 = new NetResult.OXO1("Network Error");
            this.L$0 = SpillingKt.OXO1(iXiXI);
            this.L$1 = SpillingKt.OXO1(appUser3);
            this.L$2 = oxo2;
            this.label = 3;
        } catch (Exception e4) {
            e = e4;
            appUser3 = appUser2;
            message = e.getMessage();
            if (message == null) {
                message = "Unknown Error";
            }
            oxo1 = new NetResult.OXO1(message);
        }
        appUser2 = appUser;
        return objI0iXXO2;
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: invoke */
    public /* bridge */ /* synthetic */ Object invoke2(IXiXI<? super NetResult<? extends TranslationTime>> iXiXI, Continuation<? super Unit> continuation) {
        return invoke2((IXiXI<? super NetResult<TranslationTime>>) iXiXI, continuation);
    }
}
