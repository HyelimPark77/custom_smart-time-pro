package com.sma.smartv3.p610ui.translate.sparkchain;

import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.IXiXI;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.i1iII1i1;
import com.android.mltcode.paycertificationapi.ii0iIIX0;
import com.android.mltcode.paycertificationapi.l94;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(m39465c = "com.sma.smartv3.ui.translate.sparkchain.LocalSparkChainAsrTranslateUseCase$collectData$1", m39466f = "LocalSparkChainAsrTranslateUseCase.kt", m39467i = {}, m39468l = {79}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
@SourceDebugExtension({"SMAP\nLocalSparkChainAsrTranslateUseCase.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalSparkChainAsrTranslateUseCase.kt\ncom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase$collectData$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,137:1\n32#2:138\n17#2:139\n19#2:143\n17#2:144\n19#2:148\n49#2:149\n51#2:153\n46#3:140\n51#3:142\n46#3:145\n51#3:147\n46#3:150\n51#3:152\n105#4:141\n105#4:146\n105#4:151\n*S KotlinDebug\n*F\n+ 1 LocalSparkChainAsrTranslateUseCase.kt\ncom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase$collectData$1\n*L\n76#1:138\n76#1:139\n76#1:143\n77#1:144\n77#1:148\n78#1:149\n78#1:153\n76#1:140\n76#1:142\n77#1:145\n77#1:147\n78#1:150\n78#1:152\n76#1:141\n77#1:146\n78#1:151\n*E\n"})
public final class LocalSparkChainAsrTranslateUseCase$collectData$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ LocalSparkChainAsrTranslateUseCase this$0;

    public static final class OXO1<T> implements IXiXI {

        /* JADX INFO: renamed from: IO */
        public final /* synthetic */ LocalSparkChainAsrTranslateUseCase f54831IO;

        public OXO1(LocalSparkChainAsrTranslateUseCase localSparkChainAsrTranslateUseCase) {
            this.f54831IO = localSparkChainAsrTranslateUseCase;
        }

        @Override // com.android.mltcode.paycertificationapi.IXiXI
        /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
        public final Object emit(String str, Continuation<? super Unit> continuation) {
            this.f54831IO.O00.XO0O10(str, this.f54831IO.I0IIOi.X0O(), this.f54831IO.I0IIOi.iIiiO());
            this.f54831IO.m38769I1();
            return Unit.OXO1;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalSparkChainAsrTranslateUseCase$collectData$1(LocalSparkChainAsrTranslateUseCase localSparkChainAsrTranslateUseCase, Continuation<? super LocalSparkChainAsrTranslateUseCase$collectData$1> continuation) {
        super(2, continuation);
        this.this$0 = localSparkChainAsrTranslateUseCase;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new LocalSparkChainAsrTranslateUseCase$collectData$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
        return ((LocalSparkChainAsrTranslateUseCase$collectData$1) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objI0iXXO = C2798pb.I0iXXO();
        int i = this.label;
        if (i == 0) {
            ResultKt.X1ii(obj);
            final l94<i1iII1i1> l94VarO10IXXX0X = this.this$0.O10IXXX0X();
            final ii0iIIX0<Object> ii0iiix0 = new ii0iIIX0<Object>() { // from class: com.sma.smartv3.ui.translate.sparkchain.LocalSparkChainAsrTranslateUseCase$collectData$1$invokeSuspend$$inlined$filterIsInstance$1

                /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.sparkchain.LocalSparkChainAsrTranslateUseCase$collectData$1$invokeSuspend$$inlined$filterIsInstance$1$2 */
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n1#1,218:1\n18#2:219\n32#2:220\n19#2:221\n*E\n"})
                public static final class AnonymousClass2<T> implements IXiXI {

                    /* JADX INFO: renamed from: IO */
                    public final /* synthetic */ IXiXI f54835IO;

                    /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.sparkchain.LocalSparkChainAsrTranslateUseCase$collectData$1$invokeSuspend$$inlined$filterIsInstance$1$2$1 */
                    @DebugMetadata(m39465c = "com.sma.smartv3.ui.translate.sparkchain.LocalSparkChainAsrTranslateUseCase$collectData$1$invokeSuspend$$inlined$filterIsInstance$1$2", m39466f = "LocalSparkChainAsrTranslateUseCase.kt", m39467i = {0, 0, 0, 0, 0}, m39468l = {219}, m39469m = "emit", m39470n = {"value", "$completion", "value", "$this$filter_u24lambda_u240", "$i$a$-unsafeTransform-FlowKt__TransformKt$filter$1"}, m39472s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, m39473v = 1)
                    @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,218:1\n*E\n"})
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        int I$0;
                        Object L$0;
                        Object L$1;
                        Object L$2;
                        Object L$3;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @tb1
                        public final Object invokeSuspend(@aa1 Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(IXiXI iXiXI) {
                        this.f54835IO = iXiXI;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                    @Override // com.android.mltcode.paycertificationapi.IXiXI
                    @tb1
                    public final Object emit(Object obj, @aa1 Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            int i = anonymousClass1.label;
                            if ((i & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                        Object obj2 = anonymousClass1.result;
                        Object objI0iXXO = C2798pb.I0iXXO();
                        int i2 = anonymousClass1.label;
                        if (i2 == 0) {
                            ResultKt.X1ii(obj2);
                            IXiXI iXiXI = this.f54835IO;
                            if (obj instanceof i1iII1i1) {
                                anonymousClass1.L$0 = SpillingKt.OXO1(obj);
                                anonymousClass1.L$1 = SpillingKt.OXO1(anonymousClass1);
                                anonymousClass1.L$2 = SpillingKt.OXO1(obj);
                                anonymousClass1.L$3 = SpillingKt.OXO1(iXiXI);
                                anonymousClass1.I$0 = 0;
                                anonymousClass1.label = 1;
                                if (iXiXI.emit(obj, anonymousClass1) == objI0iXXO) {
                                    return objI0iXXO;
                                }
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.X1ii(obj2);
                        }
                        return Unit.OXO1;
                    }
                }

                @Override // com.android.mltcode.paycertificationapi.ii0iIIX0
                @tb1
                public Object collect(@aa1 IXiXI<? super Object> iXiXI, @aa1 Continuation continuation) {
                    Object objCollect = l94VarO10IXXX0X.collect(new AnonymousClass2(iXiXI), continuation);
                    return objCollect == C2798pb.I0iXXO() ? objCollect : Unit.OXO1;
                }
            };
            final ii0iIIX0<i1iII1i1> ii0iiix1 = new ii0iIIX0<i1iII1i1>() { // from class: com.sma.smartv3.ui.translate.sparkchain.LocalSparkChainAsrTranslateUseCase$collectData$1$invokeSuspend$$inlined$filter$1

                /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.sparkchain.LocalSparkChainAsrTranslateUseCase$collectData$1$invokeSuspend$$inlined$filter$1$2 */
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 LocalSparkChainAsrTranslateUseCase.kt\ncom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase$collectData$1\n*L\n1#1,218:1\n18#2:219\n19#2:221\n77#3:220\n*E\n"})
                public static final class AnonymousClass2<T> implements IXiXI {

                    /* JADX INFO: renamed from: IO */
                    public final /* synthetic */ IXiXI f54833IO;

                    /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.sparkchain.LocalSparkChainAsrTranslateUseCase$collectData$1$invokeSuspend$$inlined$filter$1$2$1 */
                    @DebugMetadata(m39465c = "com.sma.smartv3.ui.translate.sparkchain.LocalSparkChainAsrTranslateUseCase$collectData$1$invokeSuspend$$inlined$filter$1$2", m39466f = "LocalSparkChainAsrTranslateUseCase.kt", m39467i = {0, 0, 0, 0, 0}, m39468l = {219}, m39469m = "emit", m39470n = {"value", "$completion", "value", "$this$filter_u24lambda_u240", "$i$a$-unsafeTransform-FlowKt__TransformKt$filter$1"}, m39472s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, m39473v = 1)
                    @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,218:1\n*E\n"})
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        int I$0;
                        Object L$0;
                        Object L$1;
                        Object L$2;
                        Object L$3;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @tb1
                        public final Object invokeSuspend(@aa1 Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(IXiXI iXiXI) {
                        this.f54833IO = iXiXI;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                    @Override // com.android.mltcode.paycertificationapi.IXiXI
                    @tb1
                    public final Object emit(Object obj, @aa1 Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        Integer numIiI10X;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            int i = anonymousClass1.label;
                            if ((i & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                        Object obj2 = anonymousClass1.result;
                        Object objI0iXXO = C2798pb.I0iXXO();
                        int i2 = anonymousClass1.label;
                        if (i2 == 0) {
                            ResultKt.X1ii(obj2);
                            IXiXI iXiXI = this.f54833IO;
                            i1iII1i1 i1iii1i1 = (i1iII1i1) obj;
                            if (i1iii1i1.O00() != null && (numIiI10X = i1iii1i1.IiI10X()) != null && numIiI10X.intValue() == 2) {
                                anonymousClass1.L$0 = SpillingKt.OXO1(obj);
                                anonymousClass1.L$1 = SpillingKt.OXO1(anonymousClass1);
                                anonymousClass1.L$2 = SpillingKt.OXO1(obj);
                                anonymousClass1.L$3 = SpillingKt.OXO1(iXiXI);
                                anonymousClass1.I$0 = 0;
                                anonymousClass1.label = 1;
                                if (iXiXI.emit(obj, anonymousClass1) == objI0iXXO) {
                                    return objI0iXXO;
                                }
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.X1ii(obj2);
                        }
                        return Unit.OXO1;
                    }
                }

                @Override // com.android.mltcode.paycertificationapi.ii0iIIX0
                @tb1
                public Object collect(@aa1 IXiXI<? super i1iII1i1> iXiXI, @aa1 Continuation continuation) {
                    Object objCollect = ii0iiix0.collect(new AnonymousClass2(iXiXI), continuation);
                    return objCollect == C2798pb.I0iXXO() ? objCollect : Unit.OXO1;
                }
            };
            ii0iIIX0<String> ii0iiix2 = new ii0iIIX0<String>() { // from class: com.sma.smartv3.ui.translate.sparkchain.LocalSparkChainAsrTranslateUseCase$collectData$1$invokeSuspend$$inlined$map$1

                /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.sparkchain.LocalSparkChainAsrTranslateUseCase$collectData$1$invokeSuspend$$inlined$map$1$2 */
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 LocalSparkChainAsrTranslateUseCase.kt\ncom/sma/smartv3/ui/translate/sparkchain/LocalSparkChainAsrTranslateUseCase$collectData$1\n*L\n1#1,218:1\n50#2:219\n78#3:220\n*E\n"})
                public static final class AnonymousClass2<T> implements IXiXI {

                    /* JADX INFO: renamed from: IO */
                    public final /* synthetic */ IXiXI f54837IO;

                    /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.sparkchain.LocalSparkChainAsrTranslateUseCase$collectData$1$invokeSuspend$$inlined$map$1$2$1 */
                    @DebugMetadata(m39465c = "com.sma.smartv3.ui.translate.sparkchain.LocalSparkChainAsrTranslateUseCase$collectData$1$invokeSuspend$$inlined$map$1$2", m39466f = "LocalSparkChainAsrTranslateUseCase.kt", m39467i = {0, 0, 0, 0, 0}, m39468l = {219}, m39469m = "emit", m39470n = {"value", "$completion", "value", "$this$map_u24lambda_u245", "$i$a$-unsafeTransform-FlowKt__TransformKt$map$1"}, m39472s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, m39473v = 1)
                    @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1$emit$1\n*L\n1#1,218:1\n*E\n"})
                    public static final class AnonymousClass1 extends ContinuationImpl {
                        int I$0;
                        Object L$0;
                        Object L$1;
                        Object L$2;
                        Object L$3;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(Continuation continuation) {
                            super(continuation);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @tb1
                        public final Object invokeSuspend(@aa1 Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(IXiXI iXiXI) {
                        this.f54837IO = iXiXI;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                    @Override // com.android.mltcode.paycertificationapi.IXiXI
                    @tb1
                    public final Object emit(Object obj, @aa1 Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        if (continuation instanceof AnonymousClass1) {
                            anonymousClass1 = (AnonymousClass1) continuation;
                            int i = anonymousClass1.label;
                            if ((i & Integer.MIN_VALUE) != 0) {
                                anonymousClass1.label = i - Integer.MIN_VALUE;
                            } else {
                                anonymousClass1 = new AnonymousClass1(continuation);
                            }
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                        Object obj2 = anonymousClass1.result;
                        Object objI0iXXO = C2798pb.I0iXXO();
                        int i2 = anonymousClass1.label;
                        if (i2 == 0) {
                            ResultKt.X1ii(obj2);
                            IXiXI iXiXI = this.f54837IO;
                            String strO00 = ((i1iII1i1) obj).O00();
                            anonymousClass1.L$0 = SpillingKt.OXO1(obj);
                            anonymousClass1.L$1 = SpillingKt.OXO1(anonymousClass1);
                            anonymousClass1.L$2 = SpillingKt.OXO1(obj);
                            anonymousClass1.L$3 = SpillingKt.OXO1(iXiXI);
                            anonymousClass1.I$0 = 0;
                            anonymousClass1.label = 1;
                            if (iXiXI.emit(strO00, anonymousClass1) == objI0iXXO) {
                                return objI0iXXO;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.X1ii(obj2);
                        }
                        return Unit.OXO1;
                    }
                }

                @Override // com.android.mltcode.paycertificationapi.ii0iIIX0
                @tb1
                public Object collect(@aa1 IXiXI<? super String> iXiXI, @aa1 Continuation continuation) {
                    Object objCollect = ii0iiix1.collect(new AnonymousClass2(iXiXI), continuation);
                    return objCollect == C2798pb.I0iXXO() ? objCollect : Unit.OXO1;
                }
            };
            OXO1 oxo1 = new OXO1(this.this$0);
            this.label = 1;
            if (ii0iiix2.collect(oxo1, this) == objI0iXXO) {
                return objI0iXXO;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.X1ii(obj);
        }
        return Unit.OXO1;
    }
}
