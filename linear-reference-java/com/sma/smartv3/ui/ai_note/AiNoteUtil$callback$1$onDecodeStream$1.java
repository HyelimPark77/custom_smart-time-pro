package com.sma.smartv3.ui.ai_note;

import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.pb;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes19.dex */
@DebugMetadata(c = "com.sma.smartv3.ui.ai_note.AiNoteUtil$callback$1$onDecodeStream$1", f = "AiNoteUtil.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
public final class AiNoteUtil$callback$1$onDecodeStream$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    final /* synthetic */ byte[] $byte;
    int label;

    public AiNoteUtil$callback$1$onDecodeStream$1(byte[] r1, Continuation<? super AiNoteUtil$callback$1$onDecodeStream$1> r2) {
        this.$byte = r1;
        super(2, r2);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r2, Continuation<?> r3) {
        return new AiNoteUtil$callback$1$onDecodeStream$1(this.$byte, r3);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
        return ((AiNoteUtil$callback$1$onDecodeStream$1) create(r1, r2)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object r2) {
        pb.I0iXXO();
        if (this.label != 0) goto L7;
        ResultKt.X1ii(r2);
        AiNoteUtil.O10IXXX0X(AiNoteUtil.OXO1).OIi0(this.$byte);
        return Unit.OXO1;
    L7:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
        return invoke2(r1, r2);
    }
}
