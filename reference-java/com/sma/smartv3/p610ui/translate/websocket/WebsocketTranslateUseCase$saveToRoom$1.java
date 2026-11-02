package com.sma.smartv3.p610ui.translate.websocket;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(m39465c = "com.sma.smartv3.ui.translate.websocket.WebsocketTranslateUseCase", m39466f = "WebsocketTranslateUseCase.kt", m39467i = {1}, m39468l = {126, 128}, m39469m = "saveToRoom", m39470n = {"pcmFilePath"}, m39472s = {"L$0"}, m39473v = 1)
public final class WebsocketTranslateUseCase$saveToRoom$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ WebsocketTranslateUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebsocketTranslateUseCase$saveToRoom$1(WebsocketTranslateUseCase websocketTranslateUseCase, Continuation<? super WebsocketTranslateUseCase$saveToRoom$1> continuation) {
        super(continuation);
        this.this$0 = websocketTranslateUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @tb1
    public final Object invokeSuspend(@aa1 Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m38791I1(this);
    }
}
