package com.sma.smartv3.p610ui.translate;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(m39465c = "com.sma.smartv3.ui.translate.TranslateEntityRepository", m39466f = "TranslateEntityRepository.kt", m39467i = {0, 0, 0, 0, 0}, m39468l = {192}, m39469m = "notifySttAudioEndChange", m39470n = {"path", "audioMessage", "finishedEntity", "$this$withLock_u24default$iv", "$i$f$withLock"}, m39472s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, m39473v = 1)
public final class TranslateEntityRepository$notifySttAudioEndChange$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ TranslateEntityRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TranslateEntityRepository$notifySttAudioEndChange$1(TranslateEntityRepository translateEntityRepository, Continuation<? super TranslateEntityRepository$notifySttAudioEndChange$1> continuation) {
        super(continuation);
        this.this$0 = translateEntityRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @tb1
    public final Object invokeSuspend(@aa1 Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m38765IO(null, null, this);
    }
}
