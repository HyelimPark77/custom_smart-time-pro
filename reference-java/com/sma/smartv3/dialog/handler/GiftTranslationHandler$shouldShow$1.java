package com.sma.smartv3.dialog.handler;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes19.dex */
@DebugMetadata(m39465c = "com.sma.smartv3.dialog.handler.GiftTranslationHandler", m39466f = "GiftTranslationHandler.kt", m39467i = {0}, m39468l = {24}, m39469m = "shouldShow", m39470n = {"appUser"}, m39472s = {"L$0"}, m39473v = 1)
public final class GiftTranslationHandler$shouldShow$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GiftTranslationHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GiftTranslationHandler$shouldShow$1(GiftTranslationHandler giftTranslationHandler, Continuation<? super GiftTranslationHandler$shouldShow$1> continuation) {
        super(continuation);
        this.this$0 = giftTranslationHandler;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @tb1
    public final Object invokeSuspend(@aa1 Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.XIi00iiXO(this);
    }
}
