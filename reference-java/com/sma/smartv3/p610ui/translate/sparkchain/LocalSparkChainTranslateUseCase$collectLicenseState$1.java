package com.sma.smartv3.p610ui.translate.sparkchain;

import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.IXiXI;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.l94;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(m39465c = "com.sma.smartv3.ui.translate.sparkchain.LocalSparkChainTranslateUseCase$collectLicenseState$1", m39466f = "LocalSparkChainTranslateUseCase.kt", m39467i = {}, m39468l = {152}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
public final class LocalSparkChainTranslateUseCase$collectLicenseState$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ LocalSparkChainTranslateUseCase this$0;

    public static final class OXO1<T> implements IXiXI {

        /* JADX INFO: renamed from: IO */
        public final /* synthetic */ LocalSparkChainTranslateUseCase f54846IO;

        public OXO1(LocalSparkChainTranslateUseCase localSparkChainTranslateUseCase) {
            this.f54846IO = localSparkChainTranslateUseCase;
        }

        public final Object OXO1(boolean z, Continuation<? super Unit> continuation) {
            i1O0OXO1O.OXO1.OXO1(this.f54846IO.XOO0ii0 + " License Change :" + z);
            if (z) {
                this.f54846IO.XO0O10.XOO0ii0(this.f54846IO.O10IXXX0X);
            } else {
                this.f54846IO.XO0O10.I0IIOi();
            }
            return Unit.OXO1;
        }

        @Override // com.android.mltcode.paycertificationapi.IXiXI
        public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
            return OXO1(((Boolean) obj).booleanValue(), continuation);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalSparkChainTranslateUseCase$collectLicenseState$1(LocalSparkChainTranslateUseCase localSparkChainTranslateUseCase, Continuation<? super LocalSparkChainTranslateUseCase$collectLicenseState$1> continuation) {
        super(2, continuation);
        this.this$0 = localSparkChainTranslateUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LocalSparkChainTranslateUseCase$collectLicenseState$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
        return ((LocalSparkChainTranslateUseCase$collectLicenseState$1) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objI0iXXO = C2798pb.I0iXXO();
        int i = this.label;
        if (i == 0) {
            ResultKt.X1ii(obj);
            l94<Boolean> l94VarO00 = this.this$0.f54844iO.O00();
            OXO1 oxo1 = new OXO1(this.this$0);
            this.label = 1;
            if (l94VarO00.collect(oxo1, this) == objI0iXXO) {
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
