package com.sma.smartv3.ui.ai_note;

import com.android.mltcode.paycertificationapi.IXiXI;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.l94;
import com.android.mltcode.paycertificationapi.pb;
import com.sma.smartv3.ui.translate.sparkchain.XO0O10;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes19.dex */
@DebugMetadata(c = "com.sma.smartv3.ui.ai_note.AiNoteUtil$collectState$1", f = "AiNoteUtil.kt", i = {}, l = {129}, m = "invokeSuspend", n = {}, s = {}, v = 1)
public final class AiNoteUtil$collectState$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    int label;

    public static final class OXO1<T> implements IXiXI {
        public static final OXO1<T> IO = null;

        static {
            IO = new OXO1();
        }

        public OXO1() {
        }

        public final Object OXO1(boolean r13, Continuation<? super Unit> r14) {
            if (r13 == false) goto L4;
            AiNoteUtil r15 = AiNoteUtil.OXO1;
            AiNoteUtil.O10IXXX0X(r15).XOO0ii0(new XO0O10(AiNoteUtil.XOO0ii0(), AiNoteUtil.X1ii(), null, 0, null, false, null, 0, false, 508, null));
            AiNoteUtil.O00().XIi00iiXO(AiNoteUtil.IO(r15));
            r15.II1Xi0().startDecodeStream(AiNoteUtil.IiI10X());
        L6:
            return Unit.OXO1;
        L4:
            AiNoteUtil r16 = AiNoteUtil.OXO1;
            AiNoteUtil.O10IXXX0X(r16).I0IIOi();
            r16.II1Xi0().stopDecodeStream();
            goto L6
        }

        @Override // com.android.mltcode.paycertificationapi.IXiXI
        public /* bridge */ /* synthetic */ Object emit(Object r1, Continuation r2) {
            return OXO1(((Boolean) r1).booleanValue(), r2);
        }
    }

    public AiNoteUtil$collectState$1(Continuation<? super AiNoteUtil$collectState$1> r2) {
        super(2, r2);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r1, Continuation<?> r2) {
        return new AiNoteUtil$collectState$1(r2);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
        return ((AiNoteUtil$collectState$1) create(r1, r2)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object r4) {
        Object r0 = pb.I0iXXO();
        int r1 = this.label;
        if (r1 == 0) goto L8;
        if (r1 != 1) goto L6;
        ResultKt.X1ii(r4);
    L12:
        throw new KotlinNothingValueException();
    L6:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L8:
        ResultKt.X1ii(r4);
        l94<Boolean> r5 = AiNoteUtil.I0iXXO(AiNoteUtil.OXO1).O00();
        IXiXI<? super Boolean> r2 = OXO1.IO;
        this.label = 1;
        if (r5.collect(r2, this) != r0) goto L12;
        return r0;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
        return invoke2(r1, r2);
    }
}
