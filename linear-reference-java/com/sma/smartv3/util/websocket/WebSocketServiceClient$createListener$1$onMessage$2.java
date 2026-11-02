package com.sma.smartv3.util.websocket;

import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.pb;
import com.android.mltcode.paycertificationapi.ry0;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import okio.ByteString;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(c = "com.sma.smartv3.util.websocket.WebSocketServiceClient$createListener$1$onMessage$2", f = "WebSocketServiceClient.kt", i = {}, l = {68}, m = "invokeSuspend", n = {}, s = {}, v = 1)
public final class WebSocketServiceClient$createListener$1$onMessage$2 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    final /* synthetic */ ByteString $bytes;
    int label;
    final /* synthetic */ WebSocketServiceClient this$0;

    public WebSocketServiceClient$createListener$1$onMessage$2(WebSocketServiceClient r1, ByteString r2, Continuation<? super WebSocketServiceClient$createListener$1$onMessage$2> r3) {
        this.this$0 = r1;
        this.$bytes = r2;
        super(2, r3);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
        return new WebSocketServiceClient$createListener$1$onMessage$2(this.this$0, this.$bytes, r4);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
        return ((WebSocketServiceClient$createListener$1$onMessage$2) create(r1, r2)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object r4) {
        Object r0 = pb.I0iXXO();
        int r1 = this.label;
        if (r1 == 0) goto L8;
        if (r1 != 1) goto L7;
        ResultKt.X1ii(r4);
    L12:
        return Unit.OXO1;
    L7:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L8:
        ResultKt.X1ii(r4);
        ry0 r5 = WebSocketServiceClient.XOO0ii0(this.this$0);
        ByteString r2 = this.$bytes;
        this.label = 1;
        if (r5.emit(r2, this) != r0) goto L12;
        return r0;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
        return invoke2(r1, r2);
    }
}
