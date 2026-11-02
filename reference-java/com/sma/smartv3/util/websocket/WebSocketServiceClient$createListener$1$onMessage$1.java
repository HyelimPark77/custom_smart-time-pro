package com.sma.smartv3.util.websocket;

import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.ry0;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(m39465c = "com.sma.smartv3.util.websocket.WebSocketServiceClient$createListener$1$onMessage$1", m39466f = "WebSocketServiceClient.kt", m39467i = {}, m39468l = {64}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
public final class WebSocketServiceClient$createListener$1$onMessage$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $text;
    int label;
    final /* synthetic */ WebSocketServiceClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebSocketServiceClient$createListener$1$onMessage$1(WebSocketServiceClient webSocketServiceClient, String str, Continuation<? super WebSocketServiceClient$createListener$1$onMessage$1> continuation) {
        super(2, continuation);
        this.this$0 = webSocketServiceClient;
        this.$text = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WebSocketServiceClient$createListener$1$onMessage$1(this.this$0, this.$text, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
        return ((WebSocketServiceClient$createListener$1$onMessage$1) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objI0iXXO = C2798pb.I0iXXO();
        int i = this.label;
        if (i == 0) {
            ResultKt.X1ii(obj);
            ry0 ry0Var = this.this$0.IiI10X;
            String str = this.$text;
            this.label = 1;
            if (ry0Var.emit(str, this) == objI0iXXO) {
                return objI0iXXO;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.X1ii(obj);
        }
        return Unit.OXO1;
    }
}
