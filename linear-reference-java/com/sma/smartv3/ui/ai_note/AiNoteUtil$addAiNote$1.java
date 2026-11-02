package com.sma.smartv3.ui.ai_note;

import com.android.mltcode.paycertificationapi.cr4;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.pb;
import com.sma.smartv3.db.entity.AIRecords;
import com.sma.smartv3.util.audio_recorder.AudioFileOutputManager;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@DebugMetadata(c = "com.sma.smartv3.ui.ai_note.AiNoteUtil$addAiNote$1", f = "AiNoteUtil.kt", i = {0, 0, 1, 1, 1}, l = {183, 185}, m = "invokeSuspend", n = {"$this$invokeSuspend_u24lambda_u240", "$i$a$-apply-AiNoteUtil$addAiNote$1$1", "$this$invokeSuspend_u24lambda_u240", "audioPath", "$i$a$-apply-AiNoteUtil$addAiNote$1$1"}, s = {"L$1", "I$1", "L$1", "L$2", "I$1"}, v = 1)
public final class AiNoteUtil$addAiNote$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $type;
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;

    public AiNoteUtil$addAiNote$1(int r1, Continuation<? super AiNoteUtil$addAiNote$1> r2) {
        this.$type = r1;
        super(2, r2);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r2, Continuation<?> r3) {
        return new AiNoteUtil$addAiNote$1(this.$type, r3);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
        return ((AiNoteUtil$addAiNote$1) create(r1, r2)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object r31) {
        Object r1 = pb.I0iXXO();
        int r2 = this.label;
        if (r2 == 0) goto L10;
        if (r2 == 1) goto L9;
        if (r2 != 2) goto L8;
        int r3 = this.I$0;
        String r4 = (String) this.L$2;
        AudioFileOutputManager r5 = (AudioFileOutputManager) this.L$1;
        AudioFileOutputManager r6 = (AudioFileOutputManager) this.L$0;
        ResultKt.X1ii(r31);
        int r13 = r3;
    L18:
        cr4 r7 = AiNoteUtil.OIi0();
        String r15 = AiNoteUtil.OIX0iXi();
        Intrinsics.XXI(r15);
        if (r4 != null) goto L21;
        r4 = "";
    L21:
        long r8 = r7.I0iXXO(new AIRecords(0, 0, null, r13, 0, r15, null, 0, 0, 0, null, AiNoteUtil.XOO0ii0(), AiNoteUtil.X1ii(), null, r4, 0, null, 108503, null));
        i1O0OXO1O.OXO1.OXO1(AiNoteUtil.XXI() + " handleSparkChainAsrText result:" + r8);
        return Unit.OXO1;
    L8:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L9:
        int r9 = this.I$1;
        int r10 = this.I$0;
        AudioFileOutputManager r11 = (AudioFileOutputManager) this.L$1;
        AudioFileOutputManager r12 = (AudioFileOutputManager) this.L$0;
        ResultKt.X1ii(r31);
        int r14 = r9;
        int r16 = r10;
        AudioFileOutputManager r17 = r12;
    L14:
        String r18 = r11.iO();
        this.L$0 = r17;
        this.L$1 = SpillingKt.OXO1(r11);
        this.L$2 = r18;
        this.I$0 = r16;
        this.I$1 = r14;
        this.label = 2;
        if (r11.XO0O10(this) != r1) goto L17;
    L16:
        return r1;
    L17:
        r13 = r16;
        r4 = r18;
        goto L18
    L10:
        ResultKt.X1ii(r31);
        r11 = AiNoteUtil.O00();
        r16 = this.$type;
        this.L$0 = r11;
        this.L$1 = r11;
        this.I$0 = r16;
        r14 = 0;
        this.I$1 = 0;
        this.label = 1;
        if (r11.O00(this) == r1) goto L16;
        r17 = r11;
        goto L14
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
        return invoke2(r1, r2);
    }
}
