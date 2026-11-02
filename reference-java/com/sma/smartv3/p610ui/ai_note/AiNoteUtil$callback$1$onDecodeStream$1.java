package com.sma.smartv3.p610ui.ai_note;

import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes19.dex */
@DebugMetadata(m39465c = "com.sma.smartv3.ui.ai_note.AiNoteUtil$callback$1$onDecodeStream$1", m39466f = "AiNoteUtil.kt", m39467i = {}, m39468l = {}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
public final class AiNoteUtil$callback$1$onDecodeStream$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    final /* synthetic */ byte[] $byte;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AiNoteUtil$callback$1$onDecodeStream$1(byte[] bArr, Continuation<? super AiNoteUtil$callback$1$onDecodeStream$1> continuation) {
        super(2, continuation);
        this.$byte = bArr;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AiNoteUtil$callback$1$onDecodeStream$1(this.$byte, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
        return ((AiNoteUtil$callback$1$onDecodeStream$1) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C2798pb.I0iXXO();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.X1ii(obj);
        AiNoteUtil.OXO1.IXXOO().OIi0(this.$byte);
        return Unit.OXO1;
    }
}
