package com.sma.smartv3.p610ui.translate.sparkchain;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.IXOX0Xiii;
import com.android.mltcode.paycertificationapi.IXiXI;
import com.android.mltcode.paycertificationapi.XX01Oi;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.iX0XiO;
import com.android.mltcode.paycertificationapi.ii0iIIX0;
import com.android.mltcode.paycertificationapi.k85;
import com.android.mltcode.paycertificationapi.l85;
import com.android.mltcode.paycertificationapi.l94;
import com.android.mltcode.paycertificationapi.mq4;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.ty0;
import com.blankj.utilcode.util.SPUtils;
import com.google.gson.Gson;
import com.sma.smartv3.model.LanguageTranslationData;
import com.sma.smartv3.p608db.entity.AIRecords;
import com.sma.smartv3.p610ui.translate.sparkchain.XunFeiTranslateViewModel;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.XiOIO;

/* JADX INFO: loaded from: classes3.dex */
public final class XunFeiTranslateViewModel extends ViewModel {

    @aa1
    private final String TAG;

    @aa1
    private final ty0<Boolean> _audioPlayFlag;

    @aa1
    private final ty0<mq4> _displayFlow;

    @aa1
    private final ty0<LanguageTranslationData> _leftLanguageFlow;

    @aa1
    private final ty0<LanguageTranslationData> _rightLanguageFlow;

    @aa1
    private final k85<Boolean> audioPlay;

    @aa1
    private final k85<mq4> displayFlow;

    @aa1
    private final k85<Boolean> isRecording;

    @aa1
    private final List<LanguageTranslationData> mLanguageTranslationList;

    @aa1
    private final k85<LanguageTranslationData> pageLeftLanguageFlow;

    @aa1
    private final k85<LanguageTranslationData> pageRightLanguageFlow;

    @aa1
    private final k85<Boolean> recordingAndTranslatingFlow;

    @aa1
    private final LocalSparkChainTranslateUseCase useCase;

    /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.sparkchain.XunFeiTranslateViewModel$1 */
    @DebugMetadata(m39465c = "com.sma.smartv3.ui.translate.sparkchain.XunFeiTranslateViewModel$1", m39466f = "SparkChainTranslateViewModel.kt", m39467i = {}, m39468l = {52}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
    @SourceDebugExtension({"SMAP\nSparkChainTranslateViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparkChainTranslateViewModel.kt\ncom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,170:1\n17#2:171\n19#2:175\n46#3:172\n51#3:174\n105#4:173\n*S KotlinDebug\n*F\n+ 1 SparkChainTranslateViewModel.kt\ncom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel$1\n*L\n51#1:171\n51#1:175\n51#1:172\n51#1:174\n51#1:173\n*E\n"})
    public static final class C190371 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.sparkchain.XunFeiTranslateViewModel$1$OXO1 */
        public static final class OXO1<T> implements IXiXI {

            /* JADX INFO: renamed from: IO */
            public final /* synthetic */ XunFeiTranslateViewModel f54864IO;

            public OXO1(XunFeiTranslateViewModel xunFeiTranslateViewModel) {
                this.f54864IO = xunFeiTranslateViewModel;
            }

            public static final Unit IiI10X(String str, String str2, AIRecords updateAiRecord) {
                Intrinsics.X0O(updateAiRecord, "$this$updateAiRecord");
                updateAiRecord.setMContent(str);
                updateAiRecord.setMExtraInfo(str2);
                return Unit.OXO1;
            }

            @Override // com.android.mltcode.paycertificationapi.IXiXI
            /* JADX INFO: renamed from: O00, reason: merged with bridge method [inline-methods] */
            public final Object emit(mq4 mq4Var, Continuation<? super Unit> continuation) {
                mq4 mq4Var2 = (mq4) this.f54864IO._displayFlow.getValue();
                String strOIi0 = mq4Var2.OIi0();
                String strOIi1 = mq4Var.OIi0();
                if (strOIi1 == null) {
                    strOIi1 = "";
                }
                final String str = strOIi0 + strOIi1;
                String strX1ii = mq4Var2.X1ii();
                String strX1ii2 = mq4Var.X1ii();
                final String str2 = strX1ii + (strX1ii2 != null ? strX1ii2 : "");
                this.f54864IO._displayFlow.setValue(new mq4(null, str, mq4Var.OIX0iXi(), null, str2, null, 41, null));
                Object objIOOX010X = this.f54864IO.useCase.iOOX010X(new Function1() { // from class: com.android.mltcode.paycertificationapi.q87
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj) {
                        return XunFeiTranslateViewModel.C190371.OXO1.IiI10X(str, str2, (AIRecords) obj);
                    }
                }, continuation);
                return objIOOX010X == C2798pb.I0iXXO() ? objIOOX010X : Unit.OXO1;
            }
        }

        public C190371(Continuation<? super C190371> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return XunFeiTranslateViewModel.this.new C190371(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
            return ((C190371) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objI0iXXO = C2798pb.I0iXXO();
            int i = this.label;
            if (i == 0) {
                ResultKt.X1ii(obj);
                final l94<mq4> l94VarI1XOi1 = XunFeiTranslateViewModel.this.useCase.I1XOi1();
                ii0iIIX0<mq4> ii0iiix0 = new ii0iIIX0<mq4>() { // from class: com.sma.smartv3.ui.translate.sparkchain.XunFeiTranslateViewModel$1$invokeSuspend$$inlined$filter$1

                    /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.sparkchain.XunFeiTranslateViewModel$1$invokeSuspend$$inlined$filter$1$2 */
                    @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 SparkChainTranslateViewModel.kt\ncom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel$1\n*L\n1#1,218:1\n18#2:219\n19#2:221\n51#3:220\n*E\n"})
                    public static final class C190322<T> implements IXiXI {

                        /* JADX INFO: renamed from: IO */
                        public final /* synthetic */ IXiXI f54866IO;

                        /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.sparkchain.XunFeiTranslateViewModel$1$invokeSuspend$$inlined$filter$1$2$1 */
                        @DebugMetadata(m39465c = "com.sma.smartv3.ui.translate.sparkchain.XunFeiTranslateViewModel$1$invokeSuspend$$inlined$filter$1$2", m39466f = "SparkChainTranslateViewModel.kt", m39467i = {0, 0, 0, 0, 0}, m39468l = {219}, m39469m = "emit", m39470n = {"value", "$completion", "value", "$this$filter_u24lambda_u240", "$i$a$-unsafeTransform-FlowKt__TransformKt$filter$1"}, m39472s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, m39473v = 1)
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
                                return C190322.this.emit(null, this);
                            }
                        }

                        public C190322(IXiXI iXiXI) {
                            this.f54866IO = iXiXI;
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
                                IXiXI iXiXI = this.f54866IO;
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
                        Object objCollect = l94VarI1XOi1.collect(new C190322(iXiXI), continuation);
                        return objCollect == C2798pb.I0iXXO() ? objCollect : Unit.OXO1;
                    }
                };
                OXO1 oxo1 = new OXO1(XunFeiTranslateViewModel.this);
                this.label = 1;
                if (ii0iiix0.collect(oxo1, this) == objI0iXXO) {
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

    /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.sparkchain.XunFeiTranslateViewModel$changeRecordStatus$1, reason: case insensitive filesystem */
    @DebugMetadata(m39465c = "com.sma.smartv3.ui.translate.sparkchain.XunFeiTranslateViewModel$changeRecordStatus$1", m39466f = "SparkChainTranslateViewModel.kt", m39467i = {}, m39468l = {}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
    public static final class C290281 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        int label;

        public C290281(Continuation<? super C290281> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return XunFeiTranslateViewModel.this.new C290281(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
            return ((C290281) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C2798pb.I0iXXO();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.X1ii(obj);
            boolean zBooleanValue = XunFeiTranslateViewModel.this.useCase.X0O().getValue().booleanValue();
            i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
            String str = XunFeiTranslateViewModel.this.TAG;
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" changeRecordStatus isStartRecord:");
            sb.append(!zBooleanValue);
            i1o0oxo1o.OXO1(sb.toString());
            if (!zBooleanValue) {
                ((LanguageTranslationData) XunFeiTranslateViewModel.this._leftLanguageFlow.getValue()).getTtsViuceName();
            }
            XunFeiTranslateViewModel.this.useCase.m38772I1();
            return Unit.OXO1;
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.sparkchain.XunFeiTranslateViewModel$initLanguages$1, reason: case insensitive filesystem */
    @DebugMetadata(m39465c = "com.sma.smartv3.ui.translate.sparkchain.XunFeiTranslateViewModel$initLanguages$1", m39466f = "SparkChainTranslateViewModel.kt", m39467i = {0, 0, 1, 1}, m39468l = {82, 83}, m39469m = "invokeSuspend", m39470n = {"mLeftLanguage", "mRightLanguage", "mLeftLanguage", "mRightLanguage"}, m39472s = {"L$0", "L$1", "L$0", "L$1"}, m39473v = 1)
    @SourceDebugExtension({"SMAP\nSparkChainTranslateViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparkChainTranslateViewModel.kt\ncom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel$initLanguages$1\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,170:1\n90#2:171\n90#2:172\n*S KotlinDebug\n*F\n+ 1 SparkChainTranslateViewModel.kt\ncom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel$initLanguages$1\n*L\n75#1:171\n79#1:172\n*E\n"})
    public static final class C290291 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        Object L$0;
        Object L$1;
        int label;

        public C290291(Continuation<? super C290291> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return XunFeiTranslateViewModel.this.new C290291(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
            return ((C290291) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x00dd, code lost:
        
            if (r10.emit(r1, r9) == r0) goto L22;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            LanguageTranslationData languageTranslationData;
            LanguageTranslationData languageTranslationData2;
            Object objI0iXXO = C2798pb.I0iXXO();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                    languageTranslationData2 = (LanguageTranslationData) this.L$1;
                    languageTranslationData = (LanguageTranslationData) this.L$0;
                    ResultKt.X1ii(obj);
                } else {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.X1ii(obj);
                }
                return Unit.OXO1;
            }
            ResultKt.X1ii(obj);
            a01 a01Var = a01.OXO1;
            SPUtils sPUtilsM1440iO = a01Var.m1440iO();
            LanguageTranslationData languageTranslationData3 = (LanguageTranslationData) new Gson().fromJson(sPUtilsM1440iO.getString(b01.OXii10I + '_' + LanguageTranslationData.class.getName()), LanguageTranslationData.class);
            if (languageTranslationData3 == null) {
                languageTranslationData3 = XunFeiTranslateViewModel.this.getMLanguageTranslationList().get(0);
            }
            SPUtils sPUtilsM1440iO2 = a01Var.m1440iO();
            LanguageTranslationData languageTranslationData4 = (LanguageTranslationData) new Gson().fromJson(sPUtilsM1440iO2.getString(b01.I011X + '_' + LanguageTranslationData.class.getName()), LanguageTranslationData.class);
            if (languageTranslationData4 == null) {
                languageTranslationData4 = XunFeiTranslateViewModel.this.getMLanguageTranslationList().get(1);
            }
            ty0 ty0Var = XunFeiTranslateViewModel.this._leftLanguageFlow;
            this.L$0 = SpillingKt.OXO1(languageTranslationData3);
            this.L$1 = languageTranslationData4;
            this.label = 1;
            if (ty0Var.emit(languageTranslationData3, this) != objI0iXXO) {
                languageTranslationData = languageTranslationData3;
                languageTranslationData2 = languageTranslationData4;
            }
            return objI0iXXO;
            ty0 ty0Var2 = XunFeiTranslateViewModel.this._rightLanguageFlow;
            this.L$0 = SpillingKt.OXO1(languageTranslationData);
            this.L$1 = SpillingKt.OXO1(languageTranslationData2);
            this.label = 2;
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.sparkchain.XunFeiTranslateViewModel$languageUpdate$1, reason: case insensitive filesystem */
    @DebugMetadata(m39465c = "com.sma.smartv3.ui.translate.sparkchain.XunFeiTranslateViewModel$languageUpdate$1", m39466f = "SparkChainTranslateViewModel.kt", m39467i = {}, m39468l = {}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
    public static final class C290301 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.sparkchain.XunFeiTranslateViewModel$languageUpdate$1$1 */
        @DebugMetadata(m39465c = "com.sma.smartv3.ui.translate.sparkchain.XunFeiTranslateViewModel$languageUpdate$1$1", m39466f = "SparkChainTranslateViewModel.kt", m39467i = {}, m39468l = {88}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ XunFeiTranslateViewModel this$0;

            /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.sparkchain.XunFeiTranslateViewModel$languageUpdate$1$1$OXO1 */
            public static final class OXO1<T> implements IXiXI {

                /* JADX INFO: renamed from: IO */
                public final /* synthetic */ XunFeiTranslateViewModel f54867IO;

                public OXO1(XunFeiTranslateViewModel xunFeiTranslateViewModel) {
                    this.f54867IO = xunFeiTranslateViewModel;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit IiI10X(LanguageTranslationData languageTranslationData, XO0O10 updateTranslatorConfig) {
                    Intrinsics.X0O(updateTranslatorConfig, "$this$updateTranslatorConfig");
                    updateTranslatorConfig.m38781I1(languageTranslationData.getRtasrLanguage());
                    updateTranslatorConfig.m38783OX(languageTranslationData.getTtsViuceName());
                    return Unit.OXO1;
                }

                @Override // com.android.mltcode.paycertificationapi.IXiXI
                /* JADX INFO: renamed from: O00, reason: merged with bridge method [inline-methods] */
                public final Object emit(final LanguageTranslationData languageTranslationData, Continuation<? super Unit> continuation) {
                    this.f54867IO.useCase.II1Xi0(new Function1() { // from class: com.android.mltcode.paycertificationapi.r87
                        @Override // kotlin.jvm.functions.Function1
                        /* JADX INFO: renamed from: invoke */
                        public final Object invoke2(Object obj) {
                            return XunFeiTranslateViewModel.C290301.AnonymousClass1.OXO1.IiI10X(languageTranslationData, (com.sma.smartv3.p610ui.translate.sparkchain.XO0O10) obj);
                        }
                    });
                    return Unit.OXO1;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(XunFeiTranslateViewModel xunFeiTranslateViewModel, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = xunFeiTranslateViewModel;
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
                Object objI0iXXO = C2798pb.I0iXXO();
                int i = this.label;
                if (i == 0) {
                    ResultKt.X1ii(obj);
                    k85<LanguageTranslationData> pageLeftLanguageFlow = this.this$0.getPageLeftLanguageFlow();
                    OXO1 oxo1 = new OXO1(this.this$0);
                    this.label = 1;
                    if (pageLeftLanguageFlow.collect(oxo1, this) == objI0iXXO) {
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

        /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.sparkchain.XunFeiTranslateViewModel$languageUpdate$1$2 */
        @DebugMetadata(m39465c = "com.sma.smartv3.ui.translate.sparkchain.XunFeiTranslateViewModel$languageUpdate$1$2", m39466f = "SparkChainTranslateViewModel.kt", m39467i = {}, m39468l = {96}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ XunFeiTranslateViewModel this$0;

            /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.sparkchain.XunFeiTranslateViewModel$languageUpdate$1$2$OXO1 */
            public static final class OXO1<T> implements IXiXI {

                /* JADX INFO: renamed from: IO */
                public final /* synthetic */ XunFeiTranslateViewModel f54868IO;

                public OXO1(XunFeiTranslateViewModel xunFeiTranslateViewModel) {
                    this.f54868IO = xunFeiTranslateViewModel;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit IiI10X(LanguageTranslationData languageTranslationData, XO0O10 updateTranslatorConfig) {
                    Intrinsics.X0O(updateTranslatorConfig, "$this$updateTranslatorConfig");
                    updateTranslatorConfig.OII(languageTranslationData.getRtasrLanguage());
                    return Unit.OXO1;
                }

                @Override // com.android.mltcode.paycertificationapi.IXiXI
                /* JADX INFO: renamed from: O00, reason: merged with bridge method [inline-methods] */
                public final Object emit(final LanguageTranslationData languageTranslationData, Continuation<? super Unit> continuation) {
                    this.f54868IO.useCase.II1Xi0(new Function1() { // from class: com.android.mltcode.paycertificationapi.s87
                        @Override // kotlin.jvm.functions.Function1
                        /* JADX INFO: renamed from: invoke */
                        public final Object invoke2(Object obj) {
                            return XunFeiTranslateViewModel.C290301.AnonymousClass2.OXO1.IiI10X(languageTranslationData, (com.sma.smartv3.p610ui.translate.sparkchain.XO0O10) obj);
                        }
                    });
                    return Unit.OXO1;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(XunFeiTranslateViewModel xunFeiTranslateViewModel, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = xunFeiTranslateViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object objI0iXXO = C2798pb.I0iXXO();
                int i = this.label;
                if (i == 0) {
                    ResultKt.X1ii(obj);
                    k85<LanguageTranslationData> pageRightLanguageFlow = this.this$0.getPageRightLanguageFlow();
                    OXO1 oxo1 = new OXO1(this.this$0);
                    this.label = 1;
                    if (pageRightLanguageFlow.collect(oxo1, this) == objI0iXXO) {
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

        public C290301(Continuation<? super C290301> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C290301 c290301 = XunFeiTranslateViewModel.this.new C290301(continuation);
            c290301.L$0 = obj;
            return c290301;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
            return ((C290301) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            i00OIXiO i00oixio = (i00OIXiO) this.L$0;
            C2798pb.I0iXXO();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.X1ii(obj);
            XX01Oi.IiI10X(i00oixio, null, null, new AnonymousClass1(XunFeiTranslateViewModel.this, null), 3, null);
            XX01Oi.IiI10X(i00oixio, null, null, new AnonymousClass2(XunFeiTranslateViewModel.this, null), 3, null);
            return Unit.OXO1;
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.sparkchain.XunFeiTranslateViewModel$pageExchangeLeftAndRightLanguage$1, reason: case insensitive filesystem */
    @DebugMetadata(m39465c = "com.sma.smartv3.ui.translate.sparkchain.XunFeiTranslateViewModel$pageExchangeLeftAndRightLanguage$1", m39466f = "SparkChainTranslateViewModel.kt", m39467i = {0}, m39468l = {119}, m39469m = "invokeSuspend", m39470n = {"mCacheLanguage"}, m39472s = {"L$0"}, m39473v = 1)
    @SourceDebugExtension({"SMAP\nSparkChainTranslateViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparkChainTranslateViewModel.kt\ncom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel$pageExchangeLeftAndRightLanguage$1\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,170:1\n85#2,3:171\n85#2,3:174\n*S KotlinDebug\n*F\n+ 1 SparkChainTranslateViewModel.kt\ncom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel$pageExchangeLeftAndRightLanguage$1\n*L\n120#1:171,3\n121#1:174,3\n*E\n"})
    public static final class C290311 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;

        public C290311(Continuation<? super C290311> continuation) {
            super(2, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(XunFeiTranslateViewModel xunFeiTranslateViewModel, AIRecords aIRecords) {
            aIRecords.setMTranslateLanguage(((LanguageTranslationData) xunFeiTranslateViewModel._rightLanguageFlow.getValue()).getTtsViuceName());
            aIRecords.setMTranslateToLanguage(((LanguageTranslationData) xunFeiTranslateViewModel._leftLanguageFlow.getValue()).getTtsViuceName());
            return Unit.OXO1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return XunFeiTranslateViewModel.this.new C290311(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
            return ((C290311) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objI0iXXO = C2798pb.I0iXXO();
            int i = this.label;
            if (i == 0) {
                ResultKt.X1ii(obj);
                LanguageTranslationData languageTranslationData = (LanguageTranslationData) XunFeiTranslateViewModel.this._leftLanguageFlow.getValue();
                XunFeiTranslateViewModel.this._leftLanguageFlow.setValue(XunFeiTranslateViewModel.this._rightLanguageFlow.getValue());
                XunFeiTranslateViewModel.this._rightLanguageFlow.setValue(languageTranslationData);
                LocalSparkChainTranslateUseCase localSparkChainTranslateUseCase = XunFeiTranslateViewModel.this.useCase;
                final XunFeiTranslateViewModel xunFeiTranslateViewModel = XunFeiTranslateViewModel.this;
                Function1<? super AIRecords, Unit> function1 = new Function1() { // from class: com.sma.smartv3.ui.translate.sparkchain.IiI10X
                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: invoke */
                    public final Object invoke2(Object obj2) {
                        return XunFeiTranslateViewModel.C290311.invokeSuspend$lambda$0(xunFeiTranslateViewModel, (AIRecords) obj2);
                    }
                };
                this.L$0 = SpillingKt.OXO1(languageTranslationData);
                this.label = 1;
                if (localSparkChainTranslateUseCase.iOOX010X(function1, this) == objI0iXXO) {
                    return objI0iXXO;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.X1ii(obj);
            }
            a01 a01Var = a01.OXO1;
            a01Var.m1440iO().put(b01.OXii10I + '_' + LanguageTranslationData.class.getName(), new Gson().toJson(XunFeiTranslateViewModel.this._leftLanguageFlow.getValue()), false);
            a01Var.m1440iO().put(b01.I011X + '_' + LanguageTranslationData.class.getName(), new Gson().toJson(XunFeiTranslateViewModel.this._rightLanguageFlow.getValue()), false);
            return Unit.OXO1;
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.sparkchain.XunFeiTranslateViewModel$pageLanguageSideUpdate$1, reason: case insensitive filesystem */
    @DebugMetadata(m39465c = "com.sma.smartv3.ui.translate.sparkchain.XunFeiTranslateViewModel$pageLanguageSideUpdate$1", m39466f = "SparkChainTranslateViewModel.kt", m39467i = {}, m39468l = {131, 135}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
    @SourceDebugExtension({"SMAP\nSparkChainTranslateViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparkChainTranslateViewModel.kt\ncom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel$pageLanguageSideUpdate$1\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,170:1\n85#2,3:171\n85#2,3:174\n*S KotlinDebug\n*F\n+ 1 SparkChainTranslateViewModel.kt\ncom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel$pageLanguageSideUpdate$1\n*L\n132#1:171,3\n136#1:174,3\n*E\n"})
    public static final class C290321 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $key;
        final /* synthetic */ LanguageTranslationData $mLanguage;
        int label;
        final /* synthetic */ XunFeiTranslateViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C290321(int i, XunFeiTranslateViewModel xunFeiTranslateViewModel, LanguageTranslationData languageTranslationData, Continuation<? super C290321> continuation) {
            super(2, continuation);
            this.$key = i;
            this.this$0 = xunFeiTranslateViewModel;
            this.$mLanguage = languageTranslationData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C290321(this.$key, this.this$0, this.$mLanguage, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
            return ((C290321) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
        }

        /* JADX WARN: Code duplicated, block: B:18:0x006b  */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
        
            if (r9.emit(r1, r8) == r0) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x0079, code lost:
        
            if (r9.emit(r1, r8) == r0) goto L20;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objI0iXXO = C2798pb.I0iXXO();
            int i = this.label;
            if (i == 0) {
                ResultKt.X1ii(obj);
                if (this.$key != 1) {
                    if (this.$key == 2) {
                        ty0 ty0Var = this.this$0._rightLanguageFlow;
                        LanguageTranslationData languageTranslationData = this.$mLanguage;
                        this.label = 2;
                    }
                    return Unit.OXO1;
                }
                ty0 ty0Var2 = this.this$0._leftLanguageFlow;
                LanguageTranslationData languageTranslationData2 = this.$mLanguage;
                this.label = 1;
                return objI0iXXO;
            }
            if (i == 1) {
                ResultKt.X1ii(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.X1ii(obj);
            }
            a01.OXO1.m1440iO().put(b01.I011X + '_' + LanguageTranslationData.class.getName(), new Gson().toJson(this.$mLanguage), false);
            return Unit.OXO1;
            a01.OXO1.m1440iO().put(b01.OXii10I + '_' + LanguageTranslationData.class.getName(), new Gson().toJson(this.$mLanguage), false);
            if (this.$key == 2) {
                ty0 ty0Var3 = this.this$0._rightLanguageFlow;
                LanguageTranslationData languageTranslationData3 = this.$mLanguage;
                this.label = 2;
            }
            return Unit.OXO1;
        }
    }

    public XunFeiTranslateViewModel(@aa1 LocalSparkChainTranslateUseCase useCase) {
        Intrinsics.X0O(useCase, "useCase");
        this.useCase = useCase;
        this.TAG = "XunFeiTranslateViewModel";
        this.mLanguageTranslationList = useCase.O10IXXX0X();
        ty0<LanguageTranslationData> ty0VarOXO1 = l85.OXO1(new LanguageTranslationData("中文", null, null, null, false, 0, null, 0, 254, null));
        this._leftLanguageFlow = ty0VarOXO1;
        this.pageLeftLanguageFlow = iX0XiO.XXI(ty0VarOXO1);
        ty0<LanguageTranslationData> ty0VarOXO2 = l85.OXO1(new LanguageTranslationData("中文", null, null, null, false, 0, null, 0, 254, null));
        this._rightLanguageFlow = ty0VarOXO2;
        this.pageRightLanguageFlow = iX0XiO.XXI(ty0VarOXO2);
        this.recordingAndTranslatingFlow = useCase.X0O();
        this.isRecording = useCase.iIiiO();
        ty0<Boolean> ty0VarOXO3 = l85.OXO1(Boolean.TRUE);
        this._audioPlayFlag = ty0VarOXO3;
        this.audioPlay = iX0XiO.XXI(ty0VarOXO3);
        ty0<mq4> ty0VarOXO4 = l85.OXO1(new mq4(null, null, "-10086", null, null, null, 59, null));
        this._displayFlow = ty0VarOXO4;
        this.displayFlow = ty0VarOXO4;
        languageUpdate();
        initLanguages();
        XX01Oi.IiI10X(ViewModelKt.getViewModelScope(this), IXOX0Xiii.m712iO(), null, new C190371(null), 2, null);
    }

    private final XiOIO initLanguages() {
        return XX01Oi.IiI10X(ViewModelKt.getViewModelScope(this), IXOX0Xiii.m712iO(), null, new C290291(null), 2, null);
    }

    public static /* synthetic */ boolean isEqualOtherLanguage$default(XunFeiTranslateViewModel xunFeiTranslateViewModel, LanguageTranslationData languageTranslationData, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return xunFeiTranslateViewModel.isEqualOtherLanguage(languageTranslationData, z);
    }

    public static /* synthetic */ void pageLanguageSideUpdate$default(XunFeiTranslateViewModel xunFeiTranslateViewModel, LanguageTranslationData languageTranslationData, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 1;
        }
        xunFeiTranslateViewModel.pageLanguageSideUpdate(languageTranslationData, i);
    }

    @aa1
    public final XiOIO changeRecordStatus() {
        return XX01Oi.IiI10X(ViewModelKt.getViewModelScope(this), IXOX0Xiii.m712iO(), null, new C290281(null), 2, null);
    }

    @aa1
    public final k85<Boolean> getAudioPlay() {
        return this.audioPlay;
    }

    @aa1
    public final k85<mq4> getDisplayFlow() {
        return this.displayFlow;
    }

    @aa1
    public final List<LanguageTranslationData> getMLanguageTranslationList() {
        return this.mLanguageTranslationList;
    }

    @aa1
    public final k85<LanguageTranslationData> getPageLeftLanguageFlow() {
        return this.pageLeftLanguageFlow;
    }

    @aa1
    public final k85<LanguageTranslationData> getPageRightLanguageFlow() {
        return this.pageRightLanguageFlow;
    }

    @aa1
    public final k85<Boolean> getRecordingAndTranslatingFlow() {
        return this.recordingAndTranslatingFlow;
    }

    public final boolean isEqualOtherLanguage(@tb1 LanguageTranslationData languageTranslationData, boolean z) {
        return languageTranslationData != null && Intrinsics.XOO0ii0(languageTranslationData.getName(), (z ? this.pageLeftLanguageFlow.getValue() : this.pageRightLanguageFlow.getValue()).getName());
    }

    @aa1
    public final k85<Boolean> isRecording() {
        return this.isRecording;
    }

    @aa1
    public final XiOIO languageUpdate() {
        return XX01Oi.IiI10X(ViewModelKt.getViewModelScope(this), IXOX0Xiii.m712iO(), null, new C290301(null), 2, null);
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        this.useCase.m38773IO();
    }

    @aa1
    public final XiOIO pageExchangeLeftAndRightLanguage() {
        return XX01Oi.IiI10X(ViewModelKt.getViewModelScope(this), IXOX0Xiii.m712iO(), null, new C290311(null), 2, null);
    }

    public final void pageLanguageSideUpdate(@tb1 LanguageTranslationData languageTranslationData, int i) {
        if (languageTranslationData != null) {
            XX01Oi.IiI10X(ViewModelKt.getViewModelScope(this), IXOX0Xiii.m712iO(), null, new C290321(i, this, languageTranslationData, null), 2, null);
        }
    }

    public final void ttsAndPlayUpdate() {
        this.useCase.X01IiOiIi(true);
    }
}
