package com.sma.smartv3.p610ui.translate.sparkchain;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(m39465c = "com.sma.smartv3.ui.translate.sparkchain.SparkChainSessionRepository", m39466f = "SparkChainSessionRepository.kt", m39467i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, m39468l = {192}, m39469m = "addSttToList", m39470n = {"data", JsonStorageKeyNames.SESSION_ID_KEY, "requestId", "translate", "originText", "entity", "$this$withLock_u24default$iv", "createTime", "duration", "$i$f$withLock"}, m39472s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "J$0", "F$0", "I$0"}, m39473v = 1)
public final class SparkChainSessionRepository$addSttToList$1 extends ContinuationImpl {
    float F$0;
    int I$0;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SparkChainSessionRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SparkChainSessionRepository$addSttToList$1(SparkChainSessionRepository sparkChainSessionRepository, Continuation<? super SparkChainSessionRepository$addSttToList$1> continuation) {
        super(continuation);
        this.this$0 = sparkChainSessionRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @tb1
    public final Object invokeSuspend(@aa1 Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m38778iO(null, this);
    }
}
