package com.sma.smartv3.biz.p607wx;

import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.ANResponse;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.google.gson.reflect.TypeToken;
import com.sma.smartv3.biz.p607wx.data.WxLoginQrCodeState;
import com.sma.smartv3.biz.p607wx.data.WxLoginQrCodeStatus;
import com.sma.smartv3.biz.p607wx.data.WxResponse;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes18.dex */
@DebugMetadata(m39465c = "com.sma.smartv3.biz.wx.WxManager$checkLoginQrcodeStatus$1", m39466f = "WxManager.kt", m39467i = {}, m39468l = {}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
public final class WxManager$checkLoginQrcodeStatus$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $key;
    final /* synthetic */ Ref.ObjectRef<WxLoginQrCodeState> $loginStatus;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WxManager$checkLoginQrcodeStatus$1(String str, Ref.ObjectRef<WxLoginQrCodeState> objectRef, Continuation<? super WxManager$checkLoginQrcodeStatus$1> continuation) {
        super(2, continuation);
        this.$key = str;
        this.$loginStatus = objectRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WxManager$checkLoginQrcodeStatus$1(this.$key, this.$loginStatus, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
        return ((WxManager$checkLoginQrcodeStatus$1) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, com.sma.smartv3.biz.wx.data.WxLoginQrCodeState] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        T t;
        C2798pb.I0iXXO();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.X1ii(obj);
        ANResponse aNResponseExecuteForParsed = AndroidNetworking.get(WxManager.OXO1.iXiiiO()).addQueryParameter("key", this.$key).setPriority(Priority.HIGH).build().executeForParsed(TypeToken.getParameterized(WxResponse.class, WxLoginQrCodeStatus.class));
        if (aNResponseExecuteForParsed.isSuccess()) {
            Object result = aNResponseExecuteForParsed.getResult();
            Intrinsics.X1ii(result, "null cannot be cast to non-null type com.sma.smartv3.biz.wx.data.WxResponse<com.sma.smartv3.biz.wx.data.WxLoginQrCodeStatus>");
            WxResponse wxResponse = (WxResponse) result;
            i1O0OXO1O.OXO1.OXO1("WxManager checkLoginQrcodeStatus onResponse -> " + wxResponse);
            Ref.ObjectRef<WxLoginQrCodeState> objectRef = this.$loginStatus;
            if (wxResponse.getData() == null) {
                t = WxLoginQrCodeState.Error;
            } else if (1 == ((WxLoginQrCodeStatus) wxResponse.getData()).getState() && Intrinsics.XOO0ii0(((WxLoginQrCodeStatus) wxResponse.getData()).getMsg(), "请提交验证码后登录")) {
                t = WxLoginQrCodeState.Verification;
            } else {
                int state = ((WxLoginQrCodeStatus) wxResponse.getData()).getState();
                if (state == 0) {
                    t = WxLoginQrCodeState.NotScanned;
                } else if (state == 1) {
                    t = WxLoginQrCodeState.Scanning;
                } else if (state != 2) {
                    t = state != 4 ? WxLoginQrCodeState.Unknown : WxLoginQrCodeState.ExitScanning;
                } else {
                    t = WxLoginQrCodeState.Scanned;
                }
            }
            objectRef.element = t;
        } else {
            ANError error = aNResponseExecuteForParsed.getError();
            i1O0OXO1O.OXO1.XIi00iiXO("WxManager checkLoginQrcodeStatus -> network error: " + (error != null ? error.getErrorDetail() : null));
            this.$loginStatus.element = WxLoginQrCodeState.Error;
        }
        return Unit.OXO1;
    }
}
