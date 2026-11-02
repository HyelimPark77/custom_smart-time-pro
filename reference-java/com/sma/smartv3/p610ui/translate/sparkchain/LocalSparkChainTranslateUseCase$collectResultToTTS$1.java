package com.sma.smartv3.p610ui.translate.sparkchain;

import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.IXiXI;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.l94;
import com.android.mltcode.paycertificationapi.mq4;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(m39465c = "com.sma.smartv3.ui.translate.sparkchain.LocalSparkChainTranslateUseCase$collectResultToTTS$1", m39466f = "LocalSparkChainTranslateUseCase.kt", m39467i = {}, m39468l = {125}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
public final class LocalSparkChainTranslateUseCase$collectResultToTTS$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ LocalSparkChainTranslateUseCase this$0;

    public static final class OXO1<T> implements IXiXI {

        /* JADX INFO: renamed from: IO */
        public final /* synthetic */ LocalSparkChainTranslateUseCase f54847IO;

        public OXO1(LocalSparkChainTranslateUseCase localSparkChainTranslateUseCase) {
            this.f54847IO = localSparkChainTranslateUseCase;
        }

        @Override // com.android.mltcode.paycertificationapi.IXiXI
        /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
        public final Object emit(mq4 mq4Var, Continuation<? super Unit> continuation) {
            i1O0OXO1O.OXO1.OXO1(this.f54847IO.XOO0ii0 + " RESULT " + mq4Var);
            Integer numXXI = mq4Var.XXI();
            if (numXXI != null && numXXI.intValue() == 2 && this.f54847IO.O10IXXX0X.OiIIX101O()) {
                SparkChainTTS sparkChainTTS = this.f54847IO.O00;
                String strX1ii = mq4Var.X1ii();
                if (strX1ii == null) {
                    strX1ii = "";
                }
                sparkChainTTS.I0IIOi(strX1ii, this.f54847IO.O10IXXX0X.XiOIO());
            }
            return Unit.OXO1;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalSparkChainTranslateUseCase$collectResultToTTS$1(LocalSparkChainTranslateUseCase localSparkChainTranslateUseCase, Continuation<? super LocalSparkChainTranslateUseCase$collectResultToTTS$1> continuation) {
        super(2, continuation);
        this.this$0 = localSparkChainTranslateUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LocalSparkChainTranslateUseCase$collectResultToTTS$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
        return ((LocalSparkChainTranslateUseCase$collectResultToTTS$1) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objI0iXXO = C2798pb.I0iXXO();
        int i = this.label;
        if (i == 0) {
            ResultKt.X1ii(obj);
            l94<mq4> l94VarXiOIO = this.this$0.XiOIO();
            OXO1 oxo1 = new OXO1(this.this$0);
            this.label = 1;
            if (l94VarXiOIO.collect(oxo1, this) == objI0iXXO) {
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
