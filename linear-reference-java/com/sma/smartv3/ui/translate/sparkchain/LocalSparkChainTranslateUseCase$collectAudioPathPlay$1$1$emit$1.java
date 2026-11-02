package com.sma.smartv3.ui.translate.sparkchain;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(c = "com.sma.smartv3.ui.translate.sparkchain.LocalSparkChainTranslateUseCase$collectAudioPathPlay$1$1", f = "LocalSparkChainTranslateUseCase.kt", i = {0}, l = {138}, m = "emit", n = {"it"}, s = {"L$0"}, v = 1)
public final class LocalSparkChainTranslateUseCase$collectAudioPathPlay$1$1$emit$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LocalSparkChainTranslateUseCase$collectAudioPathPlay$1.AnonymousClass1<T> this$0;

    /* JADX WARN: Multi-variable type inference failed */
    public LocalSparkChainTranslateUseCase$collectAudioPathPlay$1$1$emit$1(LocalSparkChainTranslateUseCase$collectAudioPathPlay$1.AnonymousClass1<? super T> r1, Continuation<? super LocalSparkChainTranslateUseCase$collectAudioPathPlay$1$1$emit$1> r2) {
        this.this$0 = r1;
        super(r2);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.Continuation to com.sma.smartv3.ui.translate.sparkchain.LocalSparkChainTranslateUseCase$collectAudioPathPlay$1$1$emit$1 for r1v1 'this'  kotlin.coroutines.Continuation
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r2) {
        r1.result = r2;
        int r2 = r1.label;
        int r2 = r2 | Integer.MIN_VALUE;
        r1.label = r2;
        com.sma.smartv3.ui.translate.sparkchain.LocalSparkChainTranslateUseCase$collectAudioPathPlay$1.AnonymousClass1<T> r2 = r1.this$0;
        kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation<? super kotlin.Unit>) r1;
        java.lang.Object r2 = r2.O00(null, r1);
        return r2;
    }
}
