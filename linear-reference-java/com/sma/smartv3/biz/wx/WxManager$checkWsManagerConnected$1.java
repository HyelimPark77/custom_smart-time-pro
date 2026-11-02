package com.sma.smartv3.biz.wx;

import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.n77;
import com.android.mltcode.paycertificationapi.pb;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.XiOIO;

/* JADX INFO: loaded from: classes18.dex */
@DebugMetadata(c = "com.sma.smartv3.biz.wx.WxManager$checkWsManagerConnected$1", f = "WxManager.kt", i = {0, 0}, l = {520}, m = "invokeSuspend", n = {"retryCount", "maxRetries"}, s = {"L$0", "I$0"}, v = 1)
public final class WxManager$checkWsManagerConnected$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    int I$0;
    Object L$0;
    int label;

    public WxManager$checkWsManagerConnected$1(Continuation<? super WxManager$checkWsManagerConnected$1> r2) {
        super(2, r2);
    }

    public static /* synthetic */ Unit O00(boolean r0) {
        return invokeSuspend$lambda$0$0(r0);
    }

    private static final Unit invokeSuspend$lambda$0$0(boolean r3) {
        i1O0OXO1O.OXO1.OXO1("WxManager getSnsSync = " + r3);
        return Unit.OXO1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r1, Continuation<?> r2) {
        return new WxManager$checkWsManagerConnected$1(r2);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
        return ((WxManager$checkWsManagerConnected$1) create(r1, r2)).invokeSuspend(Unit.OXO1);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x003d -> B:14:0x0040). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object r10) {
        Object r0 = pb.I0iXXO();
        int r1 = this.label;
        if (r1 == 0) goto L8;
        if (r1 != 1) goto L7;
        int r2 = this.I$0;
        Ref.IntRef r3 = (Ref.IntRef) this.L$0;
        ResultKt.X1ii(r10);
    L14:
        n77 r11 = WxManager.X0O();
        if (r11 != null) goto L16;
    L9:
        int r12 = r3.element;
        if (r12 >= r2) goto L23;
        r3.element = r12 + 1;
        this.L$0 = r3;
        this.I$0 = r2;
        this.label = 1;
        if (DelayKt.XIi00iiXO(60000, this) != r0) goto L14;
        return r0;
    L23:
        return Unit.OXO1;
    L16:
        i1O0OXO1O.OXO1.OXO1("WxManager checkWsManagerConnected while -> isWsConnected = " + r11.OXO1() + " , retryCount = " + r3.element + ", maxRetries = " + r2);
        if (r11.OXO1() == false) goto L21;
        XiOIO r13 = WxManager.OIi0();
        if (r13 == null) goto L9;
        XiOIO.OXO1.XIi00iiXO(r13, null, 1, null);
        goto L9
    L21:
        WxManager.OXO1.XOIX(new OXO1());
        goto L9
    L7:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L8:
        ResultKt.X1ii(r10);
        r2 = 30;
        r3 = new Ref.IntRef();
        goto L9
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
        return invoke2(r1, r2);
    }
}
