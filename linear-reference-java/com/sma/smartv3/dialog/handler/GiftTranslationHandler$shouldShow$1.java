package com.sma.smartv3.dialog.handler;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes19.dex */
@DebugMetadata(c = "com.sma.smartv3.dialog.handler.GiftTranslationHandler", f = "GiftTranslationHandler.kt", i = {0}, l = {24}, m = "shouldShow", n = {"appUser"}, s = {"L$0"}, v = 1)
public final class GiftTranslationHandler$shouldShow$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GiftTranslationHandler this$0;

    public GiftTranslationHandler$shouldShow$1(GiftTranslationHandler r1, Continuation<? super GiftTranslationHandler$shouldShow$1> r2) {
        this.this$0 = r1;
        super(r2);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @tb1
    public final Object invokeSuspend(@aa1 Object r2) {
        this.result = r2;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.XIi00iiXO(this);
    }
}
