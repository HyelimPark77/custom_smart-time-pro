package com.sma.smartv3.util;

import android.net.http.HttpException;
import com.android.mltcode.paycertificationapi.IXiXI;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.i1000;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.iIX01Oi;
import com.android.mltcode.paycertificationapi.o51;
import com.android.mltcode.paycertificationapi.pb;
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
@DebugMetadata(c = "com.sma.smartv3.util.NetUtil$getMockTranslationTime$1", f = "NetUtil.kt", i = {0, 0, 1, 1, 1, 1, 1, 2, 2, 2}, l = {49, 51, 52}, m = "invokeSuspend", n = {"$this$flow", "appUser", "$this$flow", "appUser", "$completion", "$i$f$safeApiCall", "$i$a$-safeApiCall-NetUtil$getMockTranslationTime$1$result$1", "$this$flow", "appUser", "result"}, s = {"L$0", "L$1", "L$0", "L$1", "L$2", "I$0", "I$1", "L$0", "L$1", "L$2"}, v = 1)
@SourceDebugExtension({"SMAP\nNetUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetUtil.kt\ncom/sma/smartv3/util/NetUtil$getMockTranslationTime$1\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n+ 3 NetResult.kt\ncom/sma/smartv3/util/net/NetResultKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,164:1\n19#2:165\n15#2:166\n16#3,6:167\n23#3,6:174\n1#4:173\n*S KotlinDebug\n*F\n+ 1 NetUtil.kt\ncom/sma/smartv3/util/NetUtil$getMockTranslationTime$1\n*L\n47#1:165\n47#1:166\n51#1:167,6\n51#1:174,6\n51#1:173\n*E\n"})
public final class NetUtil$getMockTranslationTime$1 extends SuspendLambda implements Function2<IXiXI<? super NetResult<? extends TranslationTime>>, Continuation<? super Unit>, Object> {
    int I$0;
    int I$1;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    public NetUtil$getMockTranslationTime$1(Continuation<? super NetUtil$getMockTranslationTime$1> r2) {
        super(2, r2);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r2, Continuation<?> r3) {
        NetUtil$getMockTranslationTime$1 r0 = new NetUtil$getMockTranslationTime$1(r3);
        r0.L$0 = r2;
        return r0;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(IXiXI<? super NetResult<TranslationTime>> r1, Continuation<? super Unit> r2) {
        return ((NetUtil$getMockTranslationTime$1) create(r1, r2)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object r40) {
        IXiXI r6 = (IXiXI) this.L$0;
        Object r7 = pb.I0iXXO();
        int r0 = this.label;
        if (r0 == 0) goto L18;
        if (r0 == 1) goto L17;
        if (r0 == 2) goto L10;
        if (r0 != 3) goto L9;
        NetResult r1 = (NetResult) this.L$2;
        AppUser r2 = (AppUser) this.L$1;
        ResultKt.X1ii(r40);
    L54:
        i1O0OXO1O.OXO1.OXO1("TranslationTime Result :" + r1);
        return Unit.OXO1;
    L9:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L10:
        Continuation r3 = (Continuation) this.L$2;
        AppUser r4 = (AppUser) this.L$1;
        ResultKt.X1ii(r40);     // Catch: Exception -> L13 HttpException -> L15 IOException -> L56
        Object r5 = r40;
    L32:
        ApiResponse r8 = (ApiResponse) r5;     // Catch: Exception -> L13 HttpException -> L15 IOException -> L56
        if (r8.isSuccess() == false) goto L35;
        NetResult r9 = new NetResult.XIi00iiXO(r8.getData());     // Catch: Exception -> L13 HttpException -> L15 IOException -> L56
    L39:
        r1 = r9;
    L51:
        this.L$0 = SpillingKt.OXO1(r6);
        this.L$1 = SpillingKt.OXO1(r4);
        this.L$2 = r1;
        this.label = 3;
        if (r6.emit(r1, this) != r7) goto L54;
    L53:
        return r7;
    L35:
        String r10 = r8.getMesg();     // Catch: Exception -> L13 HttpException -> L15 IOException -> L56
        if (r10.length() != 0) goto L38;
        r10 = "Business Error";
    L38:
        r9 = new NetResult.OXO1(r10);     // Catch: Exception -> L13 HttpException -> L15 IOException -> L56
    L15:
        e = e;
    L50:
        r9 = new NetResult.OXO1("Http " + o51.OXO1(e));
    L13:
        e = e;
    L45:
        String r11 = e.getMessage();
        if (r11 != null) goto L48;
        r11 = "Unknown Error";
    L48:
        r9 = new NetResult.OXO1(r11);
    L49:
        r1 = new NetResult.OXO1("Network Error");
        goto L51
    L17:
        AppUser r12 = (AppUser) this.L$1;
        ResultKt.X1ii(r40);
    L27:
        AppUser r13 = r12;
        iIX01Oi r14 = i1000.OXO1.XOO0ii0();     // Catch: Exception -> L40 IOException -> L42 HttpException -> L43
        String r15 = r13.getIdentity();     // Catch: Exception -> L40 IOException -> L42 HttpException -> L43
        this.L$0 = r6;     // Catch: Exception -> L40 IOException -> L42 HttpException -> L43
        this.L$1 = SpillingKt.OXO1(r13);     // Catch: Exception -> L40 IOException -> L42 HttpException -> L43
        this.L$2 = SpillingKt.OXO1(this);     // Catch: Exception -> L40 IOException -> L42 HttpException -> L43
        this.I$0 = 0;     // Catch: Exception -> L40 IOException -> L42 HttpException -> L43
        this.I$1 = 0;     // Catch: Exception -> L40 IOException -> L42 HttpException -> L43
        this.label = 2;     // Catch: Exception -> L40 IOException -> L42 HttpException -> L43
        r5 = iIX01Oi.I0iXXO(r14, r15, null, this, 2, null);     // Catch: Exception -> L40 IOException -> L42 HttpException -> L43
        if (r5 == r7) goto L53;
        r4 = r13;
        goto L32
    L43:
        e = e;
        r4 = r13;
    L42:
        r4 = r13;
    L40:
        e = e;
        r4 = r13;
        goto L45
    L18:
        ResultKt.X1ii(r40);
        SPUtils r16 = a01.OXO1.IiI10X();
        Object r17 = new AppUser(0, null, null, null, null, null, null, 0, 0, 0.0f, 0.0f, null, null, null, null, null, null, 0.0f, 0.0f, 0, 0, null, null, null, null, null, false, 134217727, null);
        Object r18 = new Gson().fromJson(r16.getString(AppUser.class.getName()), AppUser.class);
        if (r18 == null) goto L22;
        r17 = r18;
    L22:
        r12 = (AppUser) r17;
        if (r12.getIdentity().length() != 0) goto L27;
        NetResult.OXO1 r19 = new NetResult.OXO1("User is not login");
        this.L$0 = r6;
        this.L$1 = r12;
        this.label = 1;
        if (r6.emit(r19, this) != r7) goto L27;
        goto L27
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(IXiXI<? super NetResult<? extends TranslationTime>> r1, Continuation<? super Unit> r2) {
        return invoke2(r1, r2);
    }
}
