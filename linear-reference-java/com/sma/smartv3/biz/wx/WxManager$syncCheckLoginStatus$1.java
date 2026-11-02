package com.sma.smartv3.biz.wx;

import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.pb;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.ANResponse;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sma.smartv3.biz.wx.data.WxProfile;
import com.sma.smartv3.biz.wx.data.WxResponse;
import java.lang.reflect.Type;
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
@DebugMetadata(c = "com.sma.smartv3.biz.wx.WxManager$syncCheckLoginStatus$1", f = "WxManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
@SourceDebugExtension({"SMAP\nWxManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WxManager.kt\ncom/sma/smartv3/biz/wx/WxManager$syncCheckLoginStatus$1\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,1388:1\n11#2,2:1389\n*S KotlinDebug\n*F\n+ 1 WxManager.kt\ncom/sma/smartv3/biz/wx/WxManager$syncCheckLoginStatus$1\n*L\n863#1:1389,2\n*E\n"})
public final class WxManager$syncCheckLoginStatus$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    final /* synthetic */ Ref.BooleanRef $isLogin;
    final /* synthetic */ String $key;
    int label;

    public WxManager$syncCheckLoginStatus$1(String r1, Ref.BooleanRef r2, Continuation<? super WxManager$syncCheckLoginStatus$1> r3) {
        this.$key = r1;
        this.$isLogin = r2;
        super(2, r3);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
        return new WxManager$syncCheckLoginStatus$1(this.$key, this.$isLogin, r4);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
        return ((WxManager$syncCheckLoginStatus$1) create(r1, r2)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object r6) {
        pb.I0iXXO();
        if (this.label != 0) goto L17;
        ResultKt.X1ii(r6);
        WxManager r7 = WxManager.OXO1;
        ANResponse r8 = AndroidNetworking.get(WxManager.IO(r7)).addQueryParameter("key", this.$key).setTag(WxManager.IO(r7)).setPriority(Priority.HIGH).build().executeForParsed(TypeToken.getParameterized(WxResponse.class, new Type[]{WxProfile.class}));
        if (r8.isSuccess() == false) goto L9;
        Object r9 = r8.getResult();
        Intrinsics.X1ii(r9, "null cannot be cast to non-null type com.sma.smartv3.biz.wx.data.WxResponse<com.sma.smartv3.biz.wx.data.WxProfile>");
        WxResponse r10 = (WxResponse) r9;
        i1O0OXO1O.OXO1.OXO1("WxManager syncCheckLoginStatus onResponse -> " + r10);
        if (r10.getData() == null) goto L15;
        a01.OXO1.iO().put(WxProfile.class.getName(), new Gson().toJson(r10.getData()));
        this.$isLogin.element = true;
    L15:
        return Unit.OXO1;
    L9:
        ANError r11 = r8.getError();
        i1O0OXO1O r0 = i1O0OXO1O.OXO1;
        if (r11 == null) goto L12;
        String r12 = r11.getErrorDetail();
    L13:
        r0.XIi00iiXO("WxManager syncCheckLoginStatus -> network error: " + r12);
        goto L15
    L12:
        r12 = null;
        goto L13
    L17:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
        return invoke2(r1, r2);
    }
}
