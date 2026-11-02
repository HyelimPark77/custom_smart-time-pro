package com.sma.smartv3.p610ui.translate.websocket;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(m39465c = "com.sma.smartv3.ui.translate.websocket.WebsocketTranslateUseCase$collectData$1$2$1", m39466f = "WebsocketTranslateUseCase.kt", m39467i = {0, 1}, m39468l = {156, 157}, m39469m = "emit", m39470n = {"it", "it"}, m39472s = {"L$0", "L$0"}, m39473v = 1)
public final class WebsocketTranslateUseCase$collectData$1$2$1$emit$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ WebsocketTranslateUseCase$collectData$1.C190422.AnonymousClass1<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WebsocketTranslateUseCase$collectData$1$2$1$emit$1(WebsocketTranslateUseCase$collectData$1.C190422.AnonymousClass1<? super T> anonymousClass1, Continuation<? super WebsocketTranslateUseCase$collectData$1$2$1$emit$1> continuation) {
        super(continuation);
        this.this$0 = anonymousClass1;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.Continuation to com.sma.smartv3.ui.translate.websocket.WebsocketTranslateUseCase$collectData$1$2$1$emit$1 for r1v1 'this'  kotlin.coroutines.Continuation
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r2) {
        /*
            r1 = this;
            r1.result = r2
            int r2 = r1.label
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 | r0
            r1.label = r2
            com.sma.smartv3.ui.translate.websocket.WebsocketTranslateUseCase$collectData$1$2$1<T> r2 = r1.this$0
            r0 = 0
            java.lang.Object r2 = r2.emit(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sma.smartv3.p610ui.translate.websocket.WebsocketTranslateUseCase$collectData$1$2$1$emit$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
