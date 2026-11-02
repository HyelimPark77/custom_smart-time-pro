package com.sma.smartv3.ui.translate.websocket;

import com.android.mltcode.paycertificationapi.pb;
import com.sma.smartv3.util.websocket.ConnectionState;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(c = "com.sma.smartv3.ui.translate.websocket.WebsocketTranslateUseCase$connectedAndSpeakingFlow$1", f = "WebsocketTranslateUseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
public final class WebsocketTranslateUseCase$connectedAndSpeakingFlow$1 extends SuspendLambda implements Function3<ConnectionState, Boolean, Continuation<? super Boolean>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;

    public WebsocketTranslateUseCase$connectedAndSpeakingFlow$1(Continuation<? super WebsocketTranslateUseCase$connectedAndSpeakingFlow$1> r2) {
        super(3, r2);
    }

    public final Object invoke(ConnectionState r2, boolean r3, Continuation<? super Boolean> r4) {
        WebsocketTranslateUseCase$connectedAndSpeakingFlow$1 r0 = new WebsocketTranslateUseCase$connectedAndSpeakingFlow$1(r4);
        r0.L$0 = r2;
        r0.Z$0 = r3;
        return r0.invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object r4) {
        ConnectionState r0 = (ConnectionState) this.L$0;
        boolean r1 = this.Z$0;
        pb.I0iXXO();
        if (this.label != 0) goto L13;
        ResultKt.X1ii(r4);
        if (r1 == true) goto L7;
    L9:
        boolean r5 = false;
    L11:
        return Boxing.OXO1(r5);
    L7:
        if ((r0 instanceof ConnectionState.OXO1) == false) goto L9;
        r5 = true;
        goto L11
    L13:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(ConnectionState r1, Boolean r2, Continuation<? super Boolean> r3) {
        return invoke(r1, r2.booleanValue(), r3);
    }
}
