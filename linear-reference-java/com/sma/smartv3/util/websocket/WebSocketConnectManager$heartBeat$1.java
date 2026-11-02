package com.sma.smartv3.util.websocket;

import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.pb;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.I0IIOi;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(c = "com.sma.smartv3.util.websocket.WebSocketConnectManager$heartBeat$1", f = "WebSocketConnectManager.kt", i = {0}, l = {40}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"}, v = 1)
public final class WebSocketConnectManager$heartBeat$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ WebSocketConnectManager this$0;

    public WebSocketConnectManager$heartBeat$1(WebSocketConnectManager r1, Continuation<? super WebSocketConnectManager$heartBeat$1> r2) {
        this.this$0 = r1;
        super(2, r2);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
        WebSocketConnectManager$heartBeat$1 r0 = new WebSocketConnectManager$heartBeat$1(this.this$0, r4);
        r0.L$0 = r3;
        return r0;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
        return ((WebSocketConnectManager$heartBeat$1) create(r1, r2)).invokeSuspend(Unit.OXO1);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0036 -> B:20:0x0039). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object r7) {
        i00OIXiO r0 = (i00OIXiO) this.L$0;
        Object r1 = pb.I0iXXO();
        int r2 = this.label;
        if (r2 == 0) goto L8;
        if (r2 != 1) goto L7;
        ResultKt.X1ii(r7);
    L20:
        WebSocketConnectManager.OXO1(this.this$0).send("{\"type\":\"ping\"}");     // Catch: Exception -> L16
    L10:
        if (I0IIOi.OIX0iXi(r0) == false) goto L19;
        long r4 = WebSocketConnectManager.XIi00iiXO(this.this$0).I0iXXO();
        this.L$0 = r0;
        this.label = 1;
        if (DelayKt.XIi00iiXO(r4, this) != r1) goto L20;
        return r1;
    L19:
        return Unit.OXO1;
    L16:
        e = move-exception;
        e.printStackTrace();
        goto L10
    L7:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L8:
        ResultKt.X1ii(r7);
        goto L10
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
        return invoke2(r1, r2);
    }
}
