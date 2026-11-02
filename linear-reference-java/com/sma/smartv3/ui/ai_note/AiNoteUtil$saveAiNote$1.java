package com.sma.smartv3.ui.ai_note;

import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.pb;
import com.szabh.smable3.entity.BleRecordPacket;
import com.szabh.smable3.entity.Languages;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes19.dex */
@DebugMetadata(c = "com.sma.smartv3.ui.ai_note.AiNoteUtil$saveAiNote$1", f = "AiNoteUtil.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
public final class AiNoteUtil$saveAiNote$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    final /* synthetic */ BleRecordPacket $recordPacket;
    int label;

    public AiNoteUtil$saveAiNote$1(BleRecordPacket r1, Continuation<? super AiNoteUtil$saveAiNote$1> r2) {
        this.$recordPacket = r1;
        super(2, r2);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r2, Continuation<?> r3) {
        return new AiNoteUtil$saveAiNote$1(this.$recordPacket, r3);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
        return ((AiNoteUtil$saveAiNote$1) create(r1, r2)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object r5) {
        pb.I0iXXO();
        if (this.label != 0) goto L26;
        ResultKt.X1ii(r5);
        AiNoteUtil r6 = AiNoteUtil.OXO1;
        if (this.$recordPacket.getMMode() != 6) goto L7;
        boolean r0 = true;
    L8:
        AiNoteUtil.XiOIO(r0);
        AiNoteUtil.XX0(this.$recordPacket.getMMode());
        Languages r1 = Languages.INSTANCE;
        AiNoteUtil.iIiiO(r1.formatAISparkTargetLang(this.$recordPacket.getMLanguage(), Languages.DEFAULT_LANGUAGE_ZH));
        AiNoteUtil.OiIIX101O(r1.formatAISparkTargetLang(this.$recordPacket.getMToLanguage(), Languages.DEFAULT_LANGUAGE));
        int r2 = this.$recordPacket.getMStatus();
        if (r2 == 0) goto L22;
        if (r2 != 1) goto L12;
        r6.II1Xi0().writeAudioStream(this.$recordPacket.getMPacket());
    L24:
        return Unit.OXO1;
    L12:
        if (r2 != 2) goto L14;
        AiNoteUtil.OII(r6);
        goto L24
    L14:
        if (r2 != 3) goto L16;
        AiNoteUtil.OII(r6);
        goto L24
    L16:
        if (r2 != 5) goto L24;
        AiNoteUtil.XO0O10(r6);
        goto L24
    L22:
        AiNoteUtil.XiOIii1(r6);
        goto L24
    L7:
        r0 = false;
        goto L8
    L26:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
        return invoke2(r1, r2);
    }
}
