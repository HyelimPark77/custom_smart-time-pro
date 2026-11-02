package com.sma.smartv3.ui.translate.sparkchain;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(c = "com.sma.smartv3.ui.translate.sparkchain.SparkChainSessionRepository", f = "SparkChainSessionRepository.kt", i = {0, 0, 0, 0, 0}, l = {192}, m = "saveToRoom", n = {"cachedEntities", JsonStorageKeyNames.SESSION_ID_KEY, "$this$withLock_u24default$iv", "batchSize", "$i$f$withLock"}, s = {"L$0", "L$1", "L$2", "I$0", "I$1"}, v = 1)
public final class SparkChainSessionRepository$saveToRoom$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SparkChainSessionRepository this$0;

    public SparkChainSessionRepository$saveToRoom$1(SparkChainSessionRepository r1, Continuation<? super SparkChainSessionRepository$saveToRoom$1> r2) {
        this.this$0 = r1;
        super(r2);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @tb1
    public final Object invokeSuspend(@aa1 Object r2) {
        this.result = r2;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.I0iXXO(0, this);
    }
}
