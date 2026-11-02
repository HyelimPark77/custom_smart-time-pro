package com.sma.smartv3.biz.p606wa;

import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.ANResponse;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.google.gson.reflect.TypeToken;
import com.sma.smartv3.biz.p606wa.data.WAProfile;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes18.dex */
@DebugMetadata(m39465c = "com.sma.smartv3.biz.wa.WAManager$checkLoginStatusBlock$1", m39466f = "WAManager.kt", m39467i = {}, m39468l = {}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
public final class WAManager$checkLoginStatusBlock$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    final /* synthetic */ Ref.BooleanRef $loginStatus;
    final /* synthetic */ String $token;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WAManager$checkLoginStatusBlock$1(String str, Ref.BooleanRef booleanRef, Continuation<? super WAManager$checkLoginStatusBlock$1> continuation) {
        super(2, continuation);
        this.$token = str;
        this.$loginStatus = booleanRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WAManager$checkLoginStatusBlock$1(this.$token, this.$loginStatus, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
        return ((WAManager$checkLoginStatusBlock$1) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C2798pb.I0iXXO();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.X1ii(obj);
        WAManager wAManager = WAManager.OXO1;
        ANResponse aNResponseExecuteForParsed = AndroidNetworking.get(wAManager.iOO1ii1()).addHeaders("Authorization", "Bearer " + this.$token).setTag((Object) wAManager.iOO1ii1()).setPriority(Priority.HIGH).build().executeForParsed(TypeToken.get(WAProfile.class));
        if (aNResponseExecuteForParsed.isSuccess()) {
            Object result = aNResponseExecuteForParsed.getResult();
            Intrinsics.X1ii(result, "null cannot be cast to non-null type com.sma.smartv3.biz.wa.data.WAProfile");
            WAProfile wAProfile = (WAProfile) result;
            i1O0OXO1O.OXO1.OXO1("WAManager checkLoginStatusBlock onResponse -> " + wAProfile);
            this.$loginStatus.element = wAProfile.getResponse() != null;
        } else {
            ANError error = aNResponseExecuteForParsed.getError();
            i1O0OXO1O.OXO1.XIi00iiXO("WAManager checkLoginStatusBlock -> network error: " + (error != null ? error.getErrorDetail() : null));
            this.$loginStatus.element = false;
        }
        return Unit.OXO1;
    }
}
