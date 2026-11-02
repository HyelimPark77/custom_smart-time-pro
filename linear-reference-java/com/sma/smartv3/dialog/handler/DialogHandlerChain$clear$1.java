package com.sma.smartv3.dialog.handler;

import androidx.health.connect.client.records.CervicalMucusRecord;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes19.dex */
@DebugMetadata(c = "com.sma.smartv3.dialog.handler.DialogHandlerChain", f = "DialogHandlerChain.kt", i = {0, 0}, l = {84}, m = CervicalMucusRecord.Appearance.CLEAR, n = {"$this$withLock_u24default$iv", "$i$f$withLock"}, s = {"L$0", "I$0"}, v = 1)
public final class DialogHandlerChain$clear$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ DialogHandlerChain this$0;

    public DialogHandlerChain$clear$1(DialogHandlerChain r1, Continuation<? super DialogHandlerChain$clear$1> r2) {
        this.this$0 = r1;
        super(r2);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @tb1
    public final Object invokeSuspend(@aa1 Object r2) {
        this.result = r2;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.iO(this);
    }
}
