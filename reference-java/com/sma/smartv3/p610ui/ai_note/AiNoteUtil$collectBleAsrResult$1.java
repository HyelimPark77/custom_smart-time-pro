package com.sma.smartv3.p610ui.ai_note;

import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.IXiXI;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.iX0XiO;
import com.android.mltcode.paycertificationapi.ii0iIIX0;
import com.android.mltcode.paycertificationapi.mq4;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.xp5;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@DebugMetadata(m39465c = "com.sma.smartv3.ui.ai_note.AiNoteUtil$collectBleAsrResult$1", m39466f = "AiNoteUtil.kt", m39467i = {}, m39468l = {153}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
@SourceDebugExtension({"SMAP\nAiNoteUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AiNoteUtil.kt\ncom/sma/smartv3/ui/ai_note/AiNoteUtil$collectBleAsrResult$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,238:1\n17#2:239\n19#2:243\n46#3:240\n51#3:242\n105#4:241\n*S KotlinDebug\n*F\n+ 1 AiNoteUtil.kt\ncom/sma/smartv3/ui/ai_note/AiNoteUtil$collectBleAsrResult$1\n*L\n152#1:239\n152#1:243\n152#1:240\n152#1:242\n152#1:241\n*E\n"})
public final class AiNoteUtil$collectBleAsrResult$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    int label;

    /* JADX INFO: renamed from: com.sma.smartv3.ui.ai_note.AiNoteUtil$collectBleAsrResult$1$1 */
    @DebugMetadata(m39465c = "com.sma.smartv3.ui.ai_note.AiNoteUtil$collectBleAsrResult$1$1", m39466f = "AiNoteUtil.kt", m39467i = {}, m39468l = {}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
    public static final class C186551 extends SuspendLambda implements Function2<mq4, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C186551(Continuation<? super C186551> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C186551 c186551 = new C186551(continuation);
            c186551.L$0 = obj;
            return c186551;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(mq4 mq4Var, Continuation<? super Unit> continuation) {
            return ((C186551) create(mq4Var, continuation)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            mq4 mq4Var = (mq4) this.L$0;
            C2798pb.I0iXXO();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.X1ii(obj);
            mq4Var.I0iXXO();
            return Unit.OXO1;
        }
    }

    public static final class OXO1<T> implements IXiXI {

        /* JADX INFO: renamed from: IO */
        public static final OXO1<T> f54428IO = new OXO1<>();

        @Override // com.android.mltcode.paycertificationapi.IXiXI
        /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
        public final Object emit(mq4 mq4Var, Continuation<? super Unit> continuation) {
            mq4 mq4Var2 = (mq4) AiNoteUtil.O10IXXX0X.getValue();
            String strOIi0 = mq4Var2.OIi0();
            String strOIi1 = mq4Var.OIi0();
            if (strOIi1 == null) {
                strOIi1 = "";
            }
            String str = strOIi0 + strOIi1;
            String strX1ii = mq4Var2.X1ii();
            String strX1ii2 = mq4Var.X1ii();
            AiNoteUtil.O10IXXX0X.setValue(new mq4(null, str, mq4Var.OIX0iXi(), null, strX1ii + (strX1ii2 != null ? strX1ii2 : ""), null, 41, null));
            String strOIi2 = mq4Var.OIi0();
            String strOXO1 = strOIi2 != null ? xp5.OXO1(strOIi2) : null;
            String strX1ii3 = mq4Var.X1ii();
            String strOXO2 = strX1ii3 != null ? xp5.OXO1(strX1ii3) : null;
            AiNoteUtil aiNoteUtil = AiNoteUtil.OXO1;
            AiNoteUtil.iX1O1(aiNoteUtil, strOXO1, 0, 2, null);
            if (!AiNoteUtil.OIX0iXi) {
                aiNoteUtil.m38320iI(strOXO2, 1);
            }
            return Unit.OXO1;
        }
    }

    public AiNoteUtil$collectBleAsrResult$1(Continuation<? super AiNoteUtil$collectBleAsrResult$1> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AiNoteUtil$collectBleAsrResult$1(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
        return ((AiNoteUtil$collectBleAsrResult$1) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objI0iXXO = C2798pb.I0iXXO();
        int i = this.label;
        if (i == 0) {
            ResultKt.X1ii(obj);
            final ii0iIIX0 ii0iiix0OXi001 = iX0XiO.OXi001(AiNoteUtil.OXO1.IXXOO().IiI10X(), new C186551(null));
            ii0iIIX0<mq4> ii0iiix0 = new ii0iIIX0<mq4>() { // from class: com.sma.smartv3.ui.ai_note.AiNoteUtil$collectBleAsrResult$1$invokeSuspend$$inlined$filter$1

                /* JADX INFO: renamed from: com.sma.smartv3.ui.ai_note.AiNoteUtil$collectBleAsrResult$1$invokeSuspend$$inlined$filter$1$2 */
                @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 AiNoteUtil.kt\ncom/sma/smartv3/ui/ai_note/AiNoteUtil$collectBleAsrResult$1\n*L\n1#1,218:1\n18#2:219\n19#2:221\n152#3:220\n*E\n"})
                public static final class C186562<T> implements IXiXI {

                    /* JADX INFO: renamed from: IO */
                    public final /* synthetic */ IXiXI f54430IO;

                    /* JADX INFO: renamed from: com.sma.smartv3.ui.ai_note.AiNoteUtil$collectBleAsrResult$1$invokeSuspend$$inlined$filter$1$2$1 */
                    @DebugMetadata(m39465c = "com.sma.smartv3.ui.ai_note.AiNoteUtil$collectBleAsrResult$1$invokeSuspend$$inlined$filter$1$2", m39466f = "AiNoteUtil.kt", m39467i = {0, 0, 0, 0, 0}, m39468l = {219}, m39469m = "emit", m39470n = {"value", "$completion", "value", "$this$filter_u24lambda_u240", "$i$a$-unsafeTransform-FlowKt__TransformKt$filter$1"}, m39472s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, m39473v = 1)
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
                            return C186562.this.emit(null, this);
                        }
                    }

                    public C186562(IXiXI iXiXI) {
                        this.f54430IO = iXiXI;
                    }

                    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                    @Override // com.android.mltcode.paycertificationapi.IXiXI
                    @tb1
                    public final Object emit(Object obj, @aa1 Continuation continuation) {
                        AnonymousClass1 anonymousClass1;
                        Integer numXXI;
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
                            IXiXI iXiXI = this.f54430IO;
                            mq4 mq4Var = (mq4) obj;
                            Integer numI0iXXO = mq4Var.I0iXXO();
                            if ((numI0iXXO != null && numI0iXXO.intValue() == 2) || ((numXXI = mq4Var.XXI()) != null && numXXI.intValue() == 2)) {
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
                public Object collect(@aa1 IXiXI<? super mq4> iXiXI, @aa1 Continuation continuation) {
                    Object objCollect = ii0iiix0OXi001.collect(new C186562(iXiXI), continuation);
                    return objCollect == C2798pb.I0iXXO() ? objCollect : Unit.OXO1;
                }
            };
            IXiXI<? super mq4> iXiXI = OXO1.f54428IO;
            this.label = 1;
            if (ii0iiix0.collect(iXiXI, this) == objI0iXXO) {
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
