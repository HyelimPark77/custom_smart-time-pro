package com.sma.smartv3.ui.ai_note;

import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.pb;
import com.szabh.smable3.entity.BleVoice;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes19.dex */
@DebugMetadata(c = "com.sma.smartv3.ui.ai_note.AiNoteUtil$sendMsgToDevice$1", f = "AiNoteUtil.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
public final class AiNoteUtil$sendMsgToDevice$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $text;
    final /* synthetic */ int $type;
    int label;

    public AiNoteUtil$sendMsgToDevice$1(String r1, int r2, Continuation<? super AiNoteUtil$sendMsgToDevice$1> r3) {
        this.$text = r1;
        this.$type = r2;
        super(2, r3);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
        return new AiNoteUtil$sendMsgToDevice$1(this.$text, this.$type, r4);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
        return ((AiNoteUtil$sendMsgToDevice$1) create(r1, r2)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object r12) {
        pb.I0iXXO();
        if (this.label != 0) goto L7;
        ResultKt.X1ii(r12);
        long r6 = System.currentTimeMillis();
        String r8 = this.$text;
        int r4 = AiNoteUtil.I0IIOi();
        BleVoice r1 = new BleVoice(this.$type, 0, r4, null, r6, r8, 10, null);
        AiNoteUtil.OXO1.XXIIO1i11(r1);
        return Unit.OXO1;
    L7:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
        return invoke2(r1, r2);
    }
}
