package com.sma.smartv3.p610ui.ai_note;

import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.szabh.smable3.entity.BleRecordPacket;
import com.szabh.smable3.entity.Languages;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes19.dex */
@DebugMetadata(m39465c = "com.sma.smartv3.ui.ai_note.AiNoteUtil$saveAiNote$1", m39466f = "AiNoteUtil.kt", m39467i = {}, m39468l = {}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
public final class AiNoteUtil$saveAiNote$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    final /* synthetic */ BleRecordPacket $recordPacket;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AiNoteUtil$saveAiNote$1(BleRecordPacket bleRecordPacket, Continuation<? super AiNoteUtil$saveAiNote$1> continuation) {
        super(2, continuation);
        this.$recordPacket = bleRecordPacket;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AiNoteUtil$saveAiNote$1(this.$recordPacket, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
        return ((AiNoteUtil$saveAiNote$1) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        C2798pb.I0iXXO();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.X1ii(obj);
        AiNoteUtil aiNoteUtil = AiNoteUtil.OXO1;
        AiNoteUtil.OIX0iXi = this.$recordPacket.getMMode() == 6;
        AiNoteUtil.I0iXXO = this.$recordPacket.getMMode();
        Languages languages = Languages.INSTANCE;
        AiNoteUtil.I0IIOi = languages.formatAISparkTargetLang(this.$recordPacket.getMLanguage(), Languages.DEFAULT_LANGUAGE_ZH);
        AiNoteUtil.OIi0 = languages.formatAISparkTargetLang(this.$recordPacket.getMToLanguage(), Languages.DEFAULT_LANGUAGE);
        int mStatus = this.$recordPacket.getMStatus();
        if (mStatus == 0) {
            aiNoteUtil.XXX11i();
        } else if (mStatus == 1) {
            aiNoteUtil.II1Xi0().writeAudioStream(this.$recordPacket.getMPacket());
        } else if (mStatus == 2 || mStatus == 3) {
            aiNoteUtil.X1IX();
        } else if (mStatus == 5) {
            aiNoteUtil.m38319OX();
        }
        return Unit.OXO1;
    }
}
