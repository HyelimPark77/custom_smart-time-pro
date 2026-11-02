package com.sma.smartv3.biz.p607wx;

import android.text.TextUtils;
import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes18.dex */
@DebugMetadata(m39465c = "com.sma.smartv3.biz.wx.WxManager$initWx$1", m39466f = "WxManager.kt", m39467i = {}, m39468l = {}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
public final class WxManager$initWx$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    int label;

    public WxManager$initWx$1(Continuation<? super WxManager$initWx$1> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WxManager$initWx$1(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
        return ((WxManager$initWx$1) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C2798pb.I0iXXO();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.X1ii(obj);
        WxManager wxManager = WxManager.OXO1;
        if (!TextUtils.isEmpty(wxManager.iIXi1iiXI())) {
            WxManager.XXIIO1i11(wxManager, null, 1, null);
        }
        return Unit.OXO1;
    }
}
