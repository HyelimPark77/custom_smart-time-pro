package com.sma.smartv3.ui.translate.websocket;

import com.android.mltcode.paycertificationapi.i1O0OXO1O;
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
@DebugMetadata(c = "com.sma.smartv3.ui.translate.websocket.WebsocketTranslateUseCase$speakingOrConnectedFlow$1", f = "WebsocketTranslateUseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
public final class WebsocketTranslateUseCase$speakingOrConnectedFlow$1 extends SuspendLambda implements Function3<ConnectionState, Boolean, Continuation<? super Boolean>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ WebsocketTranslateUseCase this$0;

    public WebsocketTranslateUseCase$speakingOrConnectedFlow$1(WebsocketTranslateUseCase r1, Continuation<? super WebsocketTranslateUseCase$speakingOrConnectedFlow$1> r2) {
        this.this$0 = r1;
        super(3, r2);
    }

    public final Object invoke(ConnectionState r3, boolean r4, Continuation<? super Boolean> r5) {
        WebsocketTranslateUseCase$speakingOrConnectedFlow$1 r0 = new WebsocketTranslateUseCase$speakingOrConnectedFlow$1(this.this$0, r5);
        r0.L$0 = r3;
        r0.Z$0 = r4;
        return r0.invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object r6) {
        ConnectionState r0 = (ConnectionState) this.L$0;
        boolean r1 = this.Z$0;
        pb.I0iXXO();
        if (this.label != 0) goto L13;
        ResultKt.X1ii(r6);
        boolean r7 = r0 instanceof ConnectionState.OXO1;
        i1O0OXO1O.OXO1.OXO1(WebsocketTranslateUseCase.O00(this.this$0) + " ConnectState:" + r0 + " SpeakingState:" + r1);
        if (r7 == true) goto L9;
        if (r1 == true) goto L9;
        boolean r8 = false;
    L11:
        return Boxing.OXO1(r8);
    L9:
        r8 = true;
        goto L11
    L13:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(ConnectionState r1, Boolean r2, Continuation<? super Boolean> r3) {
        return invoke(r1, r2.booleanValue(), r3);
    }
}
