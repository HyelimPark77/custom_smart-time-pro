package com.sma.smartv3.p610ui.ai_note;

import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.IXiXI;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.l94;
import com.sma.smartv3.p610ui.translate.sparkchain.XO0O10;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes19.dex */
@DebugMetadata(m39465c = "com.sma.smartv3.ui.ai_note.AiNoteUtil$collectState$1", m39466f = "AiNoteUtil.kt", m39467i = {}, m39468l = {129}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
public final class AiNoteUtil$collectState$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    int label;

    public static final class OXO1<T> implements IXiXI {

        /* JADX INFO: renamed from: IO */
        public static final OXO1<T> f54431IO = new OXO1<>();

        public final Object OXO1(boolean z, Continuation<? super Unit> continuation) {
            if (z) {
                AiNoteUtil aiNoteUtil = AiNoteUtil.OXO1;
                aiNoteUtil.IXXOO().XOO0ii0(new XO0O10(AiNoteUtil.I0IIOi, AiNoteUtil.OIi0, null, 0, null, false, null, 0, false, 508, null));
                AiNoteUtil.XOO0ii0.XIi00iiXO(aiNoteUtil.i010I());
                aiNoteUtil.II1Xi0().startDecodeStream(AiNoteUtil.XXI);
            } else {
                AiNoteUtil aiNoteUtil2 = AiNoteUtil.OXO1;
                aiNoteUtil2.IXXOO().I0IIOi();
                aiNoteUtil2.II1Xi0().stopDecodeStream();
            }
            return Unit.OXO1;
        }

        @Override // com.android.mltcode.paycertificationapi.IXiXI
        public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return OXO1(((Boolean) obj).booleanValue(), continuation);
        }
    }

    public AiNoteUtil$collectState$1(Continuation<? super AiNoteUtil$collectState$1> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AiNoteUtil$collectState$1(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
        return ((AiNoteUtil$collectState$1) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objI0iXXO = C2798pb.I0iXXO();
        int i = this.label;
        if (i == 0) {
            ResultKt.X1ii(obj);
            l94<Boolean> l94VarO00 = AiNoteUtil.OXO1.m38321iX().O00();
            IXiXI<? super Boolean> iXiXI = OXO1.f54431IO;
            this.label = 1;
            if (l94VarO00.collect(iXiXI, this) == objI0iXXO) {
                return objI0iXXO;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.X1ii(obj);
        }
        throw new KotlinNothingValueException();
    }
}
