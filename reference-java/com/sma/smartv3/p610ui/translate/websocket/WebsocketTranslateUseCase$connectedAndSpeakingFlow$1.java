package com.sma.smartv3.p610ui.translate.websocket;

import com.android.mltcode.paycertificationapi.C2798pb;
import com.sma.smartv3.util.websocket.ConnectionState;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(m39465c = "com.sma.smartv3.ui.translate.websocket.WebsocketTranslateUseCase$connectedAndSpeakingFlow$1", m39466f = "WebsocketTranslateUseCase.kt", m39467i = {}, m39468l = {}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
public final class WebsocketTranslateUseCase$connectedAndSpeakingFlow$1 extends SuspendLambda implements Function3<ConnectionState, Boolean, Continuation<? super Boolean>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;

    public WebsocketTranslateUseCase$connectedAndSpeakingFlow$1(Continuation<? super WebsocketTranslateUseCase$connectedAndSpeakingFlow$1> continuation) {
        super(3, continuation);
    }

    public final Object invoke(ConnectionState connectionState, boolean z, Continuation<? super Boolean> continuation) {
        WebsocketTranslateUseCase$connectedAndSpeakingFlow$1 websocketTranslateUseCase$connectedAndSpeakingFlow$1 = new WebsocketTranslateUseCase$connectedAndSpeakingFlow$1(continuation);
        websocketTranslateUseCase$connectedAndSpeakingFlow$1.L$0 = connectionState;
        websocketTranslateUseCase$connectedAndSpeakingFlow$1.Z$0 = z;
        return websocketTranslateUseCase$connectedAndSpeakingFlow$1.invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ConnectionState connectionState = (ConnectionState) this.L$0;
        boolean z = this.Z$0;
        C2798pb.I0iXXO();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.X1ii(obj);
        return Boxing.OXO1(z && (connectionState instanceof ConnectionState.OXO1));
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(ConnectionState connectionState, Boolean bool, Continuation<? super Boolean> continuation) {
        return invoke(connectionState, bool.booleanValue(), continuation);
    }
}
