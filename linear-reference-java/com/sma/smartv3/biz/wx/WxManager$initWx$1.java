package com.sma.smartv3.biz.wx;

import android.text.TextUtils;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.pb;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes18.dex */
@DebugMetadata(c = "com.sma.smartv3.biz.wx.WxManager$initWx$1", f = "WxManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
public final class WxManager$initWx$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    int label;

    public WxManager$initWx$1(Continuation<? super WxManager$initWx$1> r2) {
        super(2, r2);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r1, Continuation<?> r2) {
        return new WxManager$initWx$1(r2);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
        return ((WxManager$initWx$1) create(r1, r2)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object r3) {
        pb.I0iXXO();
        if (this.label != 0) goto L10;
        ResultKt.X1ii(r3);
        WxManager r4 = WxManager.OXO1;
        if (TextUtils.isEmpty(r4.iIXi1iiXI()) == true) goto L8;
        WxManager.XXIIO1i11(r4, null, 1, null);
    L8:
        return Unit.OXO1;
    L10:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
        return invoke2(r1, r2);
    }
}
