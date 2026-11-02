package com.sma.smartv3.p610ui.translate.sparkchain;

import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.IXiXI;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.k85;
import com.blankj.utilcode.util.ToastUtils;
import com.sma.smartv3.p610ui.translate.AudioRepository;
import com.sma.smartv3.p610ui.translate.sparkchain.LocalSparkChainTranslateUseCase$collectTranslatorState$1;
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
@DebugMetadata(m39465c = "com.sma.smartv3.ui.translate.sparkchain.LocalSparkChainTranslateUseCase$collectTranslatorState$1", m39466f = "LocalSparkChainTranslateUseCase.kt", m39467i = {}, m39468l = {105}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
public final class LocalSparkChainTranslateUseCase$collectTranslatorState$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ LocalSparkChainTranslateUseCase this$0;

    public static final class OXO1<T> implements IXiXI {

        /* JADX INFO: renamed from: IO */
        public final /* synthetic */ LocalSparkChainTranslateUseCase f54848IO;

        public OXO1(LocalSparkChainTranslateUseCase localSparkChainTranslateUseCase) {
            this.f54848IO = localSparkChainTranslateUseCase;
        }

        public static final Unit IiI10X(LocalSparkChainTranslateUseCase localSparkChainTranslateUseCase, byte[] data) {
            Intrinsics.X0O(data, "data");
            localSparkChainTranslateUseCase.XO0O10.OIi0(data);
            return Unit.OXO1;
        }

        @Override // com.android.mltcode.paycertificationapi.IXiXI
        /* JADX INFO: renamed from: O00, reason: merged with bridge method [inline-methods] */
        public final Object emit(O00 o00, Continuation<? super Unit> continuation) {
            i1O0OXO1O.OXO1.OXO1(this.f54848IO.XOO0ii0 + " STATE :" + o00);
            if (o00 instanceof O00.C19012iO) {
                AudioRepository audioRepository = this.f54848IO.XIi00iiXO;
                final LocalSparkChainTranslateUseCase localSparkChainTranslateUseCase = this.f54848IO;
                audioRepository.OXO1(new Function1() { // from class: com.android.mltcode.paycertificationapi.qr
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return LocalSparkChainTranslateUseCase$collectTranslatorState$1.OXO1.IiI10X(localSparkChainTranslateUseCase, (byte[]) obj);
                    }
                });
            } else if (o00 instanceof O00.OXO1) {
                ToastUtils.showLong(((O00.OXO1) o00).IiI10X(), new Object[0]);
                this.f54848IO.XIi00iiXO.stop();
            } else {
                this.f54848IO.XIi00iiXO.stop();
            }
            return Unit.OXO1;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalSparkChainTranslateUseCase$collectTranslatorState$1(LocalSparkChainTranslateUseCase localSparkChainTranslateUseCase, Continuation<? super LocalSparkChainTranslateUseCase$collectTranslatorState$1> continuation) {
        super(2, continuation);
        this.this$0 = localSparkChainTranslateUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LocalSparkChainTranslateUseCase$collectTranslatorState$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
        return ((LocalSparkChainTranslateUseCase$collectTranslatorState$1) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objI0iXXO = C2798pb.I0iXXO();
        int i = this.label;
        if (i == 0) {
            ResultKt.X1ii(obj);
            k85<O00> k85VarIIX1OXO = this.this$0.IIX1OXO();
            OXO1 oxo1 = new OXO1(this.this$0);
            this.label = 1;
            if (k85VarIIX1OXO.collect(oxo1, this) == objI0iXXO) {
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
