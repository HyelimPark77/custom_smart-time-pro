package com.sma.smartv3.biz.wx;

import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.pb;
import com.blankj.utilcode.util.NetworkUtils;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes18.dex */
@DebugMetadata(c = "com.sma.smartv3.biz.wx.WxManager$mWsStatusListener$1$onFailure$1", f = "WxManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
public final class WxManager$mWsStatusListener$1$onFailure$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    int label;

    public WxManager$mWsStatusListener$1$onFailure$1(Continuation<? super WxManager$mWsStatusListener$1$onFailure$1> r2) {
        super(2, r2);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r1, Continuation<?> r2) {
        return new WxManager$mWsStatusListener$1$onFailure$1(r2);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
        return ((WxManager$mWsStatusListener$1$onFailure$1) create(r1, r2)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object r4) {
        pb.I0iXXO();
        if (this.label != 0) goto L7;
        ResultKt.X1ii(r4);
        i1O0OXO1O.OXO1.OXO1("WxManager WsStatusListener onFailure  NetworkUtils.isAvailable() = " + NetworkUtils.isAvailable());
        return Unit.OXO1;
    L7:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
        return invoke2(r1, r2);
    }
}
