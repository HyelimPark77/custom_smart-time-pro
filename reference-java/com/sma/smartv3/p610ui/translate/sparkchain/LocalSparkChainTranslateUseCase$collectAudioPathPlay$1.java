package com.sma.smartv3.p610ui.translate.sparkchain;

import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.IXiXI;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.l94;
import com.sma.smartv3.p608db.entity.AIRecords;
import com.sma.smartv3.p610ui.translate.sparkchain.LocalSparkChainTranslateUseCase$collectAudioPathPlay$1;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(m39465c = "com.sma.smartv3.ui.translate.sparkchain.LocalSparkChainTranslateUseCase$collectAudioPathPlay$1", m39466f = "LocalSparkChainTranslateUseCase.kt", m39467i = {}, m39468l = {137}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
public final class LocalSparkChainTranslateUseCase$collectAudioPathPlay$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ LocalSparkChainTranslateUseCase this$0;

    /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.sparkchain.LocalSparkChainTranslateUseCase$collectAudioPathPlay$1$1 */
    public static final class C190111<T> implements IXiXI {

        /* JADX INFO: renamed from: IO */
        public final /* synthetic */ LocalSparkChainTranslateUseCase f54845IO;

        public C190111(LocalSparkChainTranslateUseCase localSparkChainTranslateUseCase) {
            this.f54845IO = localSparkChainTranslateUseCase;
        }

        public static final Unit IiI10X(String str, AIRecords updateAiRecord) {
            Intrinsics.X0O(updateAiRecord, "$this$updateAiRecord");
            updateAiRecord.setMAudioPath(str);
            return Unit.OXO1;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // com.android.mltcode.paycertificationapi.IXiXI
        /* JADX INFO: renamed from: O00, reason: merged with bridge method [inline-methods] */
        public final Object emit(final String str, Continuation<? super Unit> continuation) {
            LocalSparkChainTranslateUseCase$collectAudioPathPlay$1$1$emit$1 localSparkChainTranslateUseCase$collectAudioPathPlay$1$1$emit$1;
            if (continuation instanceof LocalSparkChainTranslateUseCase$collectAudioPathPlay$1$1$emit$1) {
                localSparkChainTranslateUseCase$collectAudioPathPlay$1$1$emit$1 = (LocalSparkChainTranslateUseCase$collectAudioPathPlay$1$1$emit$1) continuation;
                int i = localSparkChainTranslateUseCase$collectAudioPathPlay$1$1$emit$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    localSparkChainTranslateUseCase$collectAudioPathPlay$1$1$emit$1.label = i - Integer.MIN_VALUE;
                } else {
                    localSparkChainTranslateUseCase$collectAudioPathPlay$1$1$emit$1 = new LocalSparkChainTranslateUseCase$collectAudioPathPlay$1$1$emit$1(this, continuation);
                }
            } else {
                localSparkChainTranslateUseCase$collectAudioPathPlay$1$1$emit$1 = new LocalSparkChainTranslateUseCase$collectAudioPathPlay$1$1$emit$1(this, continuation);
            }
            Object obj = localSparkChainTranslateUseCase$collectAudioPathPlay$1$1$emit$1.result;
            Object objI0iXXO = C2798pb.I0iXXO();
            int i2 = localSparkChainTranslateUseCase$collectAudioPathPlay$1$1$emit$1.label;
            if (i2 == 0) {
                ResultKt.X1ii(obj);
                LocalSparkChainTranslateUseCase localSparkChainTranslateUseCase = this.f54845IO;
                Function1<? super AIRecords, Unit> function1 = new Function1() { // from class: com.android.mltcode.paycertificationapi.pr
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj2) {
                        return LocalSparkChainTranslateUseCase$collectAudioPathPlay$1.C190111.IiI10X(str, (AIRecords) obj2);
                    }
                };
                localSparkChainTranslateUseCase$collectAudioPathPlay$1$1$emit$1.L$0 = str;
                localSparkChainTranslateUseCase$collectAudioPathPlay$1$1$emit$1.label = 1;
                if (localSparkChainTranslateUseCase.iOOX010X(function1, localSparkChainTranslateUseCase$collectAudioPathPlay$1$1$emit$1) == objI0iXXO) {
                    return objI0iXXO;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) localSparkChainTranslateUseCase$collectAudioPathPlay$1$1$emit$1.L$0;
                ResultKt.X1ii(obj);
            }
            this.f54845IO.f54843IO.mo1187iO(str);
            return Unit.OXO1;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalSparkChainTranslateUseCase$collectAudioPathPlay$1(LocalSparkChainTranslateUseCase localSparkChainTranslateUseCase, Continuation<? super LocalSparkChainTranslateUseCase$collectAudioPathPlay$1> continuation) {
        super(2, continuation);
        this.this$0 = localSparkChainTranslateUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LocalSparkChainTranslateUseCase$collectAudioPathPlay$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
        return ((LocalSparkChainTranslateUseCase$collectAudioPathPlay$1) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objI0iXXO = C2798pb.I0iXXO();
        int i = this.label;
        if (i == 0) {
            ResultKt.X1ii(obj);
            l94<String> l94VarO00 = this.this$0.O00.O00();
            C190111 c190111 = new C190111(this.this$0);
            this.label = 1;
            if (l94VarO00.collect(c190111, this) == objI0iXXO) {
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
