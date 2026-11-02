package com.sma.smartv3.biz.wa;

import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.pb;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.ANResponse;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.google.gson.reflect.TypeToken;
import com.sma.smartv3.biz.wa.data.WAProfile;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes18.dex */
@DebugMetadata(c = "com.sma.smartv3.biz.wa.WAManager$checkLoginStatusBlock$1", f = "WAManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
public final class WAManager$checkLoginStatusBlock$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    final /* synthetic */ Ref.BooleanRef $loginStatus;
    final /* synthetic */ String $token;
    int label;

    public WAManager$checkLoginStatusBlock$1(String r1, Ref.BooleanRef r2, Continuation<? super WAManager$checkLoginStatusBlock$1> r3) {
        this.$token = r1;
        this.$loginStatus = r2;
        super(2, r3);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
        return new WAManager$checkLoginStatusBlock$1(this.$token, this.$loginStatus, r4);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
        return ((WAManager$checkLoginStatusBlock$1) create(r1, r2)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object r5) {
        pb.I0iXXO();
        if (this.label != 0) goto L18;
        ResultKt.X1ii(r5);
        WAManager r6 = WAManager.OXO1;
        ANResponse r7 = AndroidNetworking.get(WAManager.XO0O10(r6)).addHeaders("Authorization", "Bearer " + this.$token).setTag(WAManager.XO0O10(r6)).setPriority(Priority.HIGH).build().executeForParsed(TypeToken.get(WAProfile.class));
        boolean r1 = false;
        if (r7.isSuccess() == false) goto L10;
        Object r8 = r7.getResult();
        Intrinsics.X1ii(r8, "null cannot be cast to non-null type com.sma.smartv3.biz.wa.data.WAProfile");
        WAProfile r9 = (WAProfile) r8;
        i1O0OXO1O.OXO1.OXO1("WAManager checkLoginStatusBlock onResponse -> " + r9);
        Ref.BooleanRef r0 = this.$loginStatus;
        if (r9.getResponse() == null) goto L9;
        r1 = true;
    L9:
        r0.element = r1;
    L16:
        return Unit.OXO1;
    L10:
        ANError r10 = r7.getError();
        i1O0OXO1O r2 = i1O0OXO1O.OXO1;
        if (r10 == null) goto L13;
        String r11 = r10.getErrorDetail();
    L14:
        r2.XIi00iiXO("WAManager checkLoginStatusBlock -> network error: " + r11);
        this.$loginStatus.element = false;
        goto L16
    L13:
        r11 = null;
        goto L14
    L18:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
        return invoke2(r1, r2);
    }
}
