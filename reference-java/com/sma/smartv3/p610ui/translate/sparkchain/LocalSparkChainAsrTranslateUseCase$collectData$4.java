package com.sma.smartv3.p610ui.translate.sparkchain;

import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.IXOX0Xiii;
import com.android.mltcode.paycertificationapi.IXiXI;
import com.android.mltcode.paycertificationapi.XX01Oi;
import com.android.mltcode.paycertificationapi.b06;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.l94;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.XiOIO;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(m39465c = "com.sma.smartv3.ui.translate.sparkchain.LocalSparkChainAsrTranslateUseCase$collectData$4", m39466f = "LocalSparkChainAsrTranslateUseCase.kt", m39467i = {}, m39468l = {99}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
public final class LocalSparkChainAsrTranslateUseCase$collectData$4 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ LocalSparkChainAsrTranslateUseCase this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalSparkChainAsrTranslateUseCase$collectData$4(LocalSparkChainAsrTranslateUseCase localSparkChainAsrTranslateUseCase, Continuation<? super LocalSparkChainAsrTranslateUseCase$collectData$4> continuation) {
        super(2, continuation);
        this.this$0 = localSparkChainAsrTranslateUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LocalSparkChainAsrTranslateUseCase$collectData$4(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
        return ((LocalSparkChainAsrTranslateUseCase$collectData$4) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objI0iXXO = C2798pb.I0iXXO();
        int i = this.label;
        if (i == 0) {
            ResultKt.X1ii(obj);
            l94<Boolean> l94VarO00 = this.this$0.f54830iO.O00();
            final LocalSparkChainAsrTranslateUseCase localSparkChainAsrTranslateUseCase = this.this$0;
            IXiXI<? super Boolean> iXiXI = new IXiXI() { // from class: com.sma.smartv3.ui.translate.sparkchain.LocalSparkChainAsrTranslateUseCase$collectData$4.1

                /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.sparkchain.LocalSparkChainAsrTranslateUseCase$collectData$4$1$1 */
                @DebugMetadata(m39465c = "com.sma.smartv3.ui.translate.sparkchain.LocalSparkChainAsrTranslateUseCase$collectData$4$1$1", m39466f = "LocalSparkChainAsrTranslateUseCase.kt", m39467i = {}, m39468l = {}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
                public static final class AnonymousClass1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
                    int label;
                    final /* synthetic */ LocalSparkChainAsrTranslateUseCase this$0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public AnonymousClass1(LocalSparkChainAsrTranslateUseCase localSparkChainAsrTranslateUseCase, Continuation<? super AnonymousClass1> continuation) {
                        super(2, continuation);
                        this.this$0 = localSparkChainAsrTranslateUseCase;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invokeSuspend$lambda$0(LocalSparkChainAsrTranslateUseCase localSparkChainAsrTranslateUseCase, byte[] bArr) {
                        localSparkChainAsrTranslateUseCase.XO0O10.m2725IO(bArr);
                        return Unit.OXO1;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        return new AnonymousClass1(this.this$0, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
                        return ((AnonymousClass1) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        C2798pb.I0iXXO();
                        if (this.label != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.X1ii(obj);
                        this.this$0.XO0O10.XOO0ii0(this.this$0.I0IIOi);
                        b06 b06Var = this.this$0.XIi00iiXO;
                        final LocalSparkChainAsrTranslateUseCase localSparkChainAsrTranslateUseCase = this.this$0;
                        b06Var.OXO1(new Function1() { // from class: com.sma.smartv3.ui.translate.sparkchain.OXO1
                            @Override // kotlin.jvm.functions.Function1
                            /* JADX INFO: renamed from: invoke */
                            public final Object invoke2(Object obj2) {
                                return LocalSparkChainAsrTranslateUseCase$collectData$4.C190101.AnonymousClass1.invokeSuspend$lambda$0(localSparkChainAsrTranslateUseCase, (byte[]) obj2);
                            }
                        });
                        return Unit.OXO1;
                    }
                }

                public final Object OXO1(boolean z, Continuation<? super Unit> continuation) {
                    XiOIO xiOIO;
                    if (z) {
                        XiOIO xiOIO2 = localSparkChainAsrTranslateUseCase.O10IXXX0X;
                        if (xiOIO2 != null && xiOIO2.isActive() && (xiOIO = localSparkChainAsrTranslateUseCase.O10IXXX0X) != null) {
                            XiOIO.OXO1.XIi00iiXO(xiOIO, null, 1, null);
                        }
                        LocalSparkChainAsrTranslateUseCase localSparkChainAsrTranslateUseCase2 = localSparkChainAsrTranslateUseCase;
                        localSparkChainAsrTranslateUseCase2.O10IXXX0X = XX01Oi.IiI10X(localSparkChainAsrTranslateUseCase2.OXO1, IXOX0Xiii.m712iO(), null, new AnonymousClass1(localSparkChainAsrTranslateUseCase, null), 2, null);
                    }
                    return Unit.OXO1;
                }

                @Override // com.android.mltcode.paycertificationapi.IXiXI
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return OXO1(((Boolean) obj2).booleanValue(), continuation);
                }
            };
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
