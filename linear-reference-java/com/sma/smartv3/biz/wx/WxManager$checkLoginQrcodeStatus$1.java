package com.sma.smartv3.biz.wx;

import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.pb;
import com.androidnetworking.AndroidNetworking;
import com.androidnetworking.common.ANResponse;
import com.androidnetworking.common.Priority;
import com.androidnetworking.error.ANError;
import com.google.gson.reflect.TypeToken;
import com.sma.smartv3.biz.wx.data.WxLoginQrCodeState;
import com.sma.smartv3.biz.wx.data.WxLoginQrCodeStatus;
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

/* JADX INFO: loaded from: classes18.dex */
@DebugMetadata(c = "com.sma.smartv3.biz.wx.WxManager$checkLoginQrcodeStatus$1", f = "WxManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
public final class WxManager$checkLoginQrcodeStatus$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $key;
    final /* synthetic */ Ref.ObjectRef<WxLoginQrCodeState> $loginStatus;
    int label;

    public WxManager$checkLoginQrcodeStatus$1(String r1, Ref.ObjectRef<WxLoginQrCodeState> r2, Continuation<? super WxManager$checkLoginQrcodeStatus$1> r3) {
        this.$key = r1;
        this.$loginStatus = r2;
        super(2, r3);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
        return new WxManager$checkLoginQrcodeStatus$1(this.$key, this.$loginStatus, r4);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
        return ((WxManager$checkLoginQrcodeStatus$1) create(r1, r2)).invokeSuspend(Unit.OXO1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [T, com.sma.smartv3.biz.wx.data.WxLoginQrCodeState] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object r5) {
        pb.I0iXXO();
        if (this.label != 0) goto L35;
        ResultKt.X1ii(r5);
        ANResponse r6 = AndroidNetworking.get(WxManager.I0IIOi(WxManager.OXO1)).addQueryParameter("key", this.$key).setPriority(Priority.HIGH).build().executeForParsed(TypeToken.getParameterized(WxResponse.class, new Type[]{WxLoginQrCodeStatus.class}));
        if (r6.isSuccess() == false) goto L27;
        Object r7 = r6.getResult();
        Intrinsics.X1ii(r7, "null cannot be cast to non-null type com.sma.smartv3.biz.wx.data.WxResponse<com.sma.smartv3.biz.wx.data.WxLoginQrCodeStatus>");
        WxResponse r8 = (WxResponse) r7;
        i1O0OXO1O.OXO1.OXO1("WxManager checkLoginQrcodeStatus onResponse -> " + r8);
        Ref.ObjectRef<WxLoginQrCodeState> r1 = this.$loginStatus;
        if (r8.getData() != null) goto L9;
        T r9 = WxLoginQrCodeState.Error;
    L26:
        r1.element = r9;
    L33:
        return Unit.OXO1;
    L9:
        if (1 == ((WxLoginQrCodeStatus) r8.getData()).getState()) goto L11;
    L13:
        int r10 = ((WxLoginQrCodeStatus) r8.getData()).getState();
        if (r10 == 0) goto L24;
        if (r10 != 1) goto L17;
        r9 = WxLoginQrCodeState.Scanning;
        goto L26
    L17:
        if (r10 != 2) goto L19;
        r9 = WxLoginQrCodeState.Scanned;
        goto L26
    L19:
        if (r10 == 4) goto L21;
        r9 = WxLoginQrCodeState.Unknown;
        goto L26
    L21:
        r9 = WxLoginQrCodeState.ExitScanning;
        goto L26
    L24:
        r9 = WxLoginQrCodeState.NotScanned;
        goto L26
    L11:
        if (Intrinsics.XOO0ii0(((WxLoginQrCodeStatus) r8.getData()).getMsg(), "请提交验证码后登录") == false) goto L13;
        r9 = WxLoginQrCodeState.Verification;
        goto L26
    L27:
        ANError r11 = r6.getError();
        i1O0OXO1O r0 = i1O0OXO1O.OXO1;
        if (r11 == null) goto L30;
        String r12 = r11.getErrorDetail();
    L31:
        r0.XIi00iiXO("WxManager checkLoginQrcodeStatus -> network error: " + r12);
        this.$loginStatus.element = WxLoginQrCodeState.Error;
        goto L33
    L30:
        r12 = null;
        goto L31
    L35:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
        return invoke2(r1, r2);
    }
}
