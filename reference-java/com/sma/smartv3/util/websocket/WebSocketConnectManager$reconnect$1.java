package com.sma.smartv3.util.websocket;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import io.socket.client.Manager;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(m39465c = "com.sma.smartv3.util.websocket.WebSocketConnectManager", m39466f = "WebSocketConnectManager.kt", m39467i = {0}, m39468l = {26}, m39469m = Manager.f56042I1, m39470n = {"request"}, m39472s = {"L$0"}, m39473v = 1)
public final class WebSocketConnectManager$reconnect$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ WebSocketConnectManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebSocketConnectManager$reconnect$1(WebSocketConnectManager webSocketConnectManager, Continuation<? super WebSocketConnectManager$reconnect$1> continuation) {
        super(continuation);
        this.this$0 = webSocketConnectManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @tb1
    public final Object invokeSuspend(@aa1 Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.O00(null, this);
    }
}
