package com.sma.smartv3.biz.wx;

import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.n77;
import com.android.mltcode.paycertificationapi.pb;
import com.goodix.ble.libcomx.task.ITaskSet;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: classes18.dex */
@DebugMetadata(c = "com.sma.smartv3.biz.wx.WxManager$startPollingCheckLoginStatus$1", f = "WxManager.kt", i = {0, 0}, l = {ITaskSet.EVT_SUBTASK_START}, m = "invokeSuspend", n = {"retryCount", "maxRetries"}, s = {"I$0", "I$1"}, v = 1)
public final class WxManager$startPollingCheckLoginStatus$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    int I$0;
    int I$1;
    int label;

    public WxManager$startPollingCheckLoginStatus$1(Continuation<? super WxManager$startPollingCheckLoginStatus$1> r2) {
        super(2, r2);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r1, Continuation<?> r2) {
        return new WxManager$startPollingCheckLoginStatus$1(r2);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
        return ((WxManager$startPollingCheckLoginStatus$1) create(r1, r2)).invokeSuspend(Unit.OXO1);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0058 -> B:23:0x005b). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object r7) {
        Object r0 = pb.I0iXXO();
        int r1 = this.label;
        if (r1 == 0) goto L8;
        if (r1 != 1) goto L7;
        int r2 = this.I$1;
        int r3 = this.I$0;
        ResultKt.X1ii(r7);
    L23:
        r3 = r3 + 1;
    L9:
        if (r3 >= r2) goto L24;
        WxManager r8 = WxManager.OXO1;
        if (WxManager.IXXOO(r8) == false) goto L20;
        r8.XIIO11I();
        n77 r4 = WxManager.X0O();
        if (r4 != null) goto L15;
    L17:
        r8.IO0iXO0O();
    L18:
        i1O0OXO1O.OXO1.OXO1("WxManager checkLoginStatus 已登");
        r8.iIi1();
        return Unit.OXO1;
    L15:
        if (r4.OXO1() != true) goto L17;
    L20:
        this.I$0 = r3;
        this.I$1 = r2;
        this.label = 1;
        if (DelayKt.XIi00iiXO(5000, this) != r0) goto L23;
        return r0;
    L24:
        i1O0OXO1O.OXO1.OXO1("WxManager startPollingCheckLoginStatus -> timeout");
        WxManager.OXO1.X00O0();
        n77 r9 = WxManager.X0O();
        if (r9 == null) goto L27;
        r9.XOO0ii0();
    L27:
        WxManager.X01IiOiIi(null);
        return Unit.OXO1;
    L7:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L8:
        ResultKt.X1ii(r7);
        r2 = 24;
        r3 = 0;
        goto L9
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
        return invoke2(r1, r2);
    }
}
