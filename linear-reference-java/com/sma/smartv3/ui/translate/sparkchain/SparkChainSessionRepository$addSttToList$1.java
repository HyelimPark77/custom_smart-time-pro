package com.sma.smartv3.ui.translate.sparkchain;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(c = "com.sma.smartv3.ui.translate.sparkchain.SparkChainSessionRepository", f = "SparkChainSessionRepository.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {192}, m = "addSttToList", n = {"data", JsonStorageKeyNames.SESSION_ID_KEY, "requestId", "translate", "originText", "entity", "$this$withLock_u24default$iv", "createTime", "duration", "$i$f$withLock"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "J$0", "F$0", "I$0"}, v = 1)
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

    public SparkChainSessionRepository$addSttToList$1(SparkChainSessionRepository r1, Continuation<? super SparkChainSessionRepository$addSttToList$1> r2) {
        this.this$0 = r1;
        super(r2);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @tb1
    public final Object invokeSuspend(@aa1 Object r2) {
        this.result = r2;
        this.label |= Integer.MIN_VALUE;
        return SparkChainSessionRepository.OXO1(this.this$0, null, this);
    }
}
