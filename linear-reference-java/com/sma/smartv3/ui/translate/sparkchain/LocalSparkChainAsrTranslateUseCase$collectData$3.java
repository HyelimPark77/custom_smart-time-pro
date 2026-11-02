package com.sma.smartv3.ui.translate.sparkchain;

import com.android.mltcode.paycertificationapi.IXiXI;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.l94;
import com.android.mltcode.paycertificationapi.pb;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(c = "com.sma.smartv3.ui.translate.sparkchain.LocalSparkChainAsrTranslateUseCase$collectData$3", f = "LocalSparkChainAsrTranslateUseCase.kt", i = {}, l = {94}, m = "invokeSuspend", n = {}, s = {}, v = 1)
public final class LocalSparkChainAsrTranslateUseCase$collectData$3 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ LocalSparkChainAsrTranslateUseCase this$0;

    public static final class OXO1<T> implements IXiXI {
        public final /* synthetic */ LocalSparkChainAsrTranslateUseCase IO;

        public OXO1(LocalSparkChainAsrTranslateUseCase r1) {
            this.IO = r1;
        }

        public final Object OXO1(String r1, Continuation<? super Unit> r2) {
            LocalSparkChainAsrTranslateUseCase.iO(this.IO).iO(r1);
            return Unit.OXO1;
        }

        @Override // com.android.mltcode.paycertificationapi.IXiXI
        public /* bridge */ /* synthetic */ Object emit(Object r1, Continuation r2) {
            return OXO1((String) r1, r2);
        }
    }

    public LocalSparkChainAsrTranslateUseCase$collectData$3(LocalSparkChainAsrTranslateUseCase r1, Continuation<? super LocalSparkChainAsrTranslateUseCase$collectData$3> r2) {
        this.this$0 = r1;
        super(2, r2);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r2, Continuation<?> r3) {
        return new LocalSparkChainAsrTranslateUseCase$collectData$3(this.this$0, r3);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
        return ((LocalSparkChainAsrTranslateUseCase$collectData$3) create(r1, r2)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object r5) {
        Object r0 = pb.I0iXXO();
        int r1 = this.label;
        if (r1 == 0) goto L8;
        if (r1 != 1) goto L6;
        ResultKt.X1ii(r5);
    L12:
        throw new KotlinNothingValueException();
    L6:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L8:
        ResultKt.X1ii(r5);
        l94<String> r6 = this.this$0.I1XOi1();
        OXO1 r2 = new OXO1(this.this$0);
        this.label = 1;
        if (r6.collect(r2, this) != r0) goto L12;
        return r0;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
        return invoke2(r1, r2);
    }
}
