package com.sma.smartv3.p610ui.ai_note;

import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.cr4;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.sma.smartv3.p608db.entity.AIRecords;
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
@DebugMetadata(m39465c = "com.sma.smartv3.ui.ai_note.AiNoteUtil$addAiNote$1", m39466f = "AiNoteUtil.kt", m39467i = {0, 0, 1, 1, 1}, m39468l = {183, 185}, m39469m = "invokeSuspend", m39470n = {"$this$invokeSuspend_u24lambda_u240", "$i$a$-apply-AiNoteUtil$addAiNote$1$1", "$this$invokeSuspend_u24lambda_u240", "audioPath", "$i$a$-apply-AiNoteUtil$addAiNote$1$1"}, m39472s = {"L$1", "I$1", "L$1", "L$2", "I$1"}, m39473v = 1)
public final class AiNoteUtil$addAiNote$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $type;
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AiNoteUtil$addAiNote$1(int i, Continuation<? super AiNoteUtil$addAiNote$1> continuation) {
        super(2, continuation);
        this.$type = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AiNoteUtil$addAiNote$1(this.$type, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
        return ((AiNoteUtil$addAiNote$1) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0087  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AudioFileOutputManager audioFileOutputManager;
        int i;
        int i2;
        AudioFileOutputManager audioFileOutputManager2;
        int i3;
        String str;
        Object objI0iXXO = C2798pb.I0iXXO();
        int i4 = this.label;
        if (i4 == 0) {
            ResultKt.X1ii(obj);
            audioFileOutputManager = AiNoteUtil.XOO0ii0;
            i = this.$type;
            this.L$0 = audioFileOutputManager;
            this.L$1 = audioFileOutputManager;
            this.I$0 = i;
            i2 = 0;
            this.I$1 = 0;
            this.label = 1;
            if (audioFileOutputManager.O00(this) != objI0iXXO) {
                audioFileOutputManager2 = audioFileOutputManager;
            }
            return objI0iXXO;
        }
        if (i4 == 1) {
            int i5 = this.I$1;
            int i6 = this.I$0;
            audioFileOutputManager = (AudioFileOutputManager) this.L$1;
            AudioFileOutputManager audioFileOutputManager3 = (AudioFileOutputManager) this.L$0;
            ResultKt.X1ii(obj);
            i2 = i5;
            i = i6;
            audioFileOutputManager2 = audioFileOutputManager3;
        } else {
            if (i4 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i7 = this.I$0;
            str = (String) this.L$2;
            ResultKt.X1ii(obj);
            i3 = i7;
        }
        cr4 cr4Var = AiNoteUtil.f54426IO;
        String str2 = AiNoteUtil.X1ii;
        Intrinsics.XXI(str2);
        if (str == null) {
            str = "";
        }
        long jI0iXXO = cr4Var.I0iXXO(new AIRecords(0, 0L, null, i3, 0, str2, null, 0, 0, 0, null, AiNoteUtil.I0IIOi, AiNoteUtil.OIi0, null, str, 0, null, 108503, null));
        i1O0OXO1O.OXO1.OXO1(AiNoteUtil.XIi00iiXO + " handleSparkChainAsrText result:" + jI0iXXO);
        return Unit.OXO1;
        String strMo711iO = audioFileOutputManager.mo711iO();
        this.L$0 = audioFileOutputManager2;
        this.L$1 = SpillingKt.OXO1(audioFileOutputManager);
        this.L$2 = strMo711iO;
        this.I$0 = i;
        this.I$1 = i2;
        this.label = 2;
        if (audioFileOutputManager.XO0O10(this) != objI0iXXO) {
            i3 = i;
            str = strMo711iO;
            cr4 cr4Var2 = AiNoteUtil.f54426IO;
            String str3 = AiNoteUtil.X1ii;
            Intrinsics.XXI(str3);
            if (str == null) {
                str = "";
            }
            long jI0iXXO2 = cr4Var2.I0iXXO(new AIRecords(0, 0L, null, i3, 0, str3, null, 0, 0, 0, null, AiNoteUtil.I0IIOi, AiNoteUtil.OIi0, null, str, 0, null, 108503, null));
            i1O0OXO1O.OXO1.OXO1(AiNoteUtil.XIi00iiXO + " handleSparkChainAsrText result:" + jI0iXXO2);
            return Unit.OXO1;
        }
        return objI0iXXO;
    }
}
