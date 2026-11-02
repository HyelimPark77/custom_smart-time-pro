package com.sma.smartv3.ui.translate.sparkchain;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(c = "com.sma.smartv3.ui.translate.sparkchain.LocalSparkChainTranslateUseCase", f = "LocalSparkChainTranslateUseCase.kt", i = {0, 0, 0}, l = {196}, m = "updateAiRecord", n = {"update", "$this$withLock_u24default$iv", "$i$f$withLock"}, s = {"L$0", "L$1", "I$0"}, v = 1)
public final class LocalSparkChainTranslateUseCase$updateAiRecord$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LocalSparkChainTranslateUseCase this$0;

    public LocalSparkChainTranslateUseCase$updateAiRecord$1(LocalSparkChainTranslateUseCase r1, Continuation<? super LocalSparkChainTranslateUseCase$updateAiRecord$1> r2) {
        this.this$0 = r1;
        super(r2);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @tb1
    public final Object invokeSuspend(@aa1 Object r2) {
        this.result = r2;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.iOOX010X(null, this);
    }
}
