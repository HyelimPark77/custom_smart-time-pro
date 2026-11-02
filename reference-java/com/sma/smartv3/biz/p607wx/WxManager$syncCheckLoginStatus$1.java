package com.sma.smartv3.biz.p607wx;

import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.ANResponse;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sma.smartv3.biz.p607wx.data.WxProfile;
import com.sma.smartv3.biz.p607wx.data.WxResponse;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@DebugMetadata(m39465c = "com.sma.smartv3.biz.wx.WxManager$syncCheckLoginStatus$1", m39466f = "WxManager.kt", m39467i = {}, m39468l = {}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
@SourceDebugExtension({"SMAP\nWxManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WxManager.kt\ncom/sma/smartv3/biz/wx/WxManager$syncCheckLoginStatus$1\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,1388:1\n11#2,2:1389\n*S KotlinDebug\n*F\n+ 1 WxManager.kt\ncom/sma/smartv3/biz/wx/WxManager$syncCheckLoginStatus$1\n*L\n863#1:1389,2\n*E\n"})
public final class WxManager$syncCheckLoginStatus$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    final /* synthetic */ Ref.BooleanRef $isLogin;
    final /* synthetic */ String $key;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WxManager$syncCheckLoginStatus$1(String str, Ref.BooleanRef booleanRef, Continuation<? super WxManager$syncCheckLoginStatus$1> continuation) {
        super(2, continuation);
        this.$key = str;
        this.$isLogin = booleanRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WxManager$syncCheckLoginStatus$1(this.$key, this.$isLogin, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
        return ((WxManager$syncCheckLoginStatus$1) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C2798pb.I0iXXO();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.X1ii(obj);
        WxManager wxManager = WxManager.OXO1;
        ANResponse aNResponseExecuteForParsed = AndroidNetworking.get(wxManager.OX110i()).addQueryParameter("key", this.$key).setTag((Object) wxManager.OX110i()).setPriority(Priority.HIGH).build().executeForParsed(TypeToken.getParameterized(WxResponse.class, WxProfile.class));
        if (aNResponseExecuteForParsed.isSuccess()) {
            Object result = aNResponseExecuteForParsed.getResult();
            Intrinsics.X1ii(result, "null cannot be cast to non-null type com.sma.smartv3.biz.wx.data.WxResponse<com.sma.smartv3.biz.wx.data.WxProfile>");
            WxResponse wxResponse = (WxResponse) result;
            i1O0OXO1O.OXO1.OXO1("WxManager syncCheckLoginStatus onResponse -> " + wxResponse);
            if (wxResponse.getData() != null) {
                a01.OXO1.m1440iO().put(WxProfile.class.getName(), new Gson().toJson(wxResponse.getData()));
                this.$isLogin.element = true;
            }
        } else {
            ANError error = aNResponseExecuteForParsed.getError();
            i1O0OXO1O.OXO1.XIi00iiXO("WxManager syncCheckLoginStatus -> network error: " + (error != null ? error.getErrorDetail() : null));
        }
        return Unit.OXO1;
    }
}
