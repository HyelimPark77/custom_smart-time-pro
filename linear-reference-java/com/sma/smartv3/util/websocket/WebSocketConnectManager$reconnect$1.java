package com.sma.smartv3.util.websocket;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import io.socket.client.Manager;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(c = "com.sma.smartv3.util.websocket.WebSocketConnectManager", f = "WebSocketConnectManager.kt", i = {0}, l = {26}, m = Manager.I1, n = {"request"}, s = {"L$0"}, v = 1)
public final class WebSocketConnectManager$reconnect$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ WebSocketConnectManager this$0;

    public WebSocketConnectManager$reconnect$1(WebSocketConnectManager r1, Continuation<? super WebSocketConnectManager$reconnect$1> r2) {
        this.this$0 = r1;
        super(r2);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @tb1
    public final Object invokeSuspend(@aa1 Object r2) {
        this.result = r2;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.O00(null, this);
    }
}
