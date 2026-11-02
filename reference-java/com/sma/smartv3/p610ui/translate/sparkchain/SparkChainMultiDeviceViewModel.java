package com.sma.smartv3.p610ui.translate.sparkchain;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.I0OX;
import com.android.mltcode.paycertificationapi.IXOX0Xiii;
import com.android.mltcode.paycertificationapi.IXiXI;
import com.android.mltcode.paycertificationapi.XX01Oi;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i1iII1i1;
import com.android.mltcode.paycertificationapi.iOIXXXII0;
import com.android.mltcode.paycertificationapi.iX0XiO;
import com.android.mltcode.paycertificationapi.ii0iIIX0;
import com.android.mltcode.paycertificationapi.k85;
import com.android.mltcode.paycertificationapi.l85;
import com.android.mltcode.paycertificationapi.l94;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.ty0;
import com.android.mltcode.paycertificationapi.xp5;
import com.blankj.utilcode.util.SPUtils;
import com.google.gson.Gson;
import com.sma.smartv3.model.LanguageTranslationData;
import com.sma.smartv3.p610ui.translate.sparkchain.SparkChainMultiDeviceViewModel;
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
@SourceDebugExtension({"SMAP\nSparkChainMultiDeviceViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparkChainMultiDeviceViewModel.kt\ncom/sma/smartv3/ui/translate/sparkchain/SparkChainMultiDeviceViewModel\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,229:1\n32#2:230\n17#2:231\n19#2:235\n17#2:236\n19#2:240\n46#3:232\n51#3:234\n46#3:237\n51#3:239\n105#4:233\n105#4:238\n85#5,3:241\n85#5,3:244\n*S KotlinDebug\n*F\n+ 1 SparkChainMultiDeviceViewModel.kt\ncom/sma/smartv3/ui/translate/sparkchain/SparkChainMultiDeviceViewModel\n*L\n62#1:230\n62#1:231\n62#1:235\n63#1:236\n63#1:240\n62#1:232\n62#1:234\n63#1:237\n63#1:239\n62#1:233\n63#1:238\n178#1:241,3\n179#1:244,3\n*E\n"})
public final class SparkChainMultiDeviceViewModel extends ViewModel {

    @aa1
    private final String TAG;

    @aa1
    private final ty0<LanguageTranslationData> _leftLanguageFlow;

    @aa1
    private final ty0<LanguageTranslationData> _rightLanguageFlow;

    @aa1
    private final ii0iIIX0<iOIXXXII0> aiMessageFlow;

    @aa1
    private final l94<i1iII1i1> asrFlow;

    @aa1
    private final k85<I0OX> asrState;

    @aa1
    private final l94<String> audioPathFlow;
    private int deviceType;

    @aa1
    private final List<LanguageTranslationData> mLanguageTranslationList;

    @aa1
    private final k85<LanguageTranslationData> pageLeftLanguageFlow;

    @aa1
    private final k85<LanguageTranslationData> pageRightLanguageFlow;

    @aa1
    private final k85<Boolean> recording;

    @aa1
    private final ii0iIIX0<iOIXXXII0> saveFlow;

    @aa1
    private final l94<String> translateTextFlow;

    @aa1
    private final LocalSparkChainAsrTranslateUseCase useCase;

    /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.sparkchain.SparkChainMultiDeviceViewModel$collectSaveFlow$1 */
    @DebugMetadata(m39465c = "com.sma.smartv3.ui.translate.sparkchain.SparkChainMultiDeviceViewModel$collectSaveFlow$1", m39466f = "SparkChainMultiDeviceViewModel.kt", m39467i = {}, m39468l = {87}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
    public static final class C190201 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        int label;

        /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.sparkchain.SparkChainMultiDeviceViewModel$collectSaveFlow$1$OXO1 */
        public static final class OXO1<T> implements IXiXI {

            /* JADX INFO: renamed from: IO */
            public final /* synthetic */ SparkChainMultiDeviceViewModel f54850IO;

            public OXO1(SparkChainMultiDeviceViewModel sparkChainMultiDeviceViewModel) {
                this.f54850IO = sparkChainMultiDeviceViewModel;
            }

            @Override // com.android.mltcode.paycertificationapi.IXiXI
            /* JADX INFO: renamed from: OXO1, reason: merged with bridge method [inline-methods] */
            public final Object emit(iOIXXXII0 ioixxxii0, Continuation<? super Unit> continuation) {
                this.f54850IO.useCase.OiIIX101O(ioixxxii0);
                return Unit.OXO1;
            }
        }

        public C190201(Continuation<? super C190201> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SparkChainMultiDeviceViewModel.this.new C190201(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
            return ((C190201) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objI0iXXO = C2798pb.I0iXXO();
            int i = this.label;
            if (i == 0) {
                ResultKt.X1ii(obj);
                ii0iIIX0 ii0iiix0 = SparkChainMultiDeviceViewModel.this.saveFlow;
                OXO1 oxo1 = new OXO1(SparkChainMultiDeviceViewModel.this);
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

    /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.sparkchain.SparkChainMultiDeviceViewModel$initLanguages$1, reason: case insensitive filesystem */
    @DebugMetadata(m39465c = "com.sma.smartv3.ui.translate.sparkchain.SparkChainMultiDeviceViewModel$initLanguages$1", m39466f = "SparkChainMultiDeviceViewModel.kt", m39467i = {0, 0, 1, 1}, m39468l = {106, 107}, m39469m = "invokeSuspend", m39470n = {"mLeftLanguage", "mRightLanguage", "mLeftLanguage", "mRightLanguage"}, m39472s = {"L$0", "L$1", "L$0", "L$1"}, m39473v = 1)
    @SourceDebugExtension({"SMAP\nSparkChainMultiDeviceViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparkChainMultiDeviceViewModel.kt\ncom/sma/smartv3/ui/translate/sparkchain/SparkChainMultiDeviceViewModel$initLanguages$1\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,229:1\n90#2:230\n90#2:231\n*S KotlinDebug\n*F\n+ 1 SparkChainMultiDeviceViewModel.kt\ncom/sma/smartv3/ui/translate/sparkchain/SparkChainMultiDeviceViewModel$initLanguages$1\n*L\n99#1:230\n103#1:231\n*E\n"})
    public static final class C290221 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        Object L$0;
        Object L$1;
        int label;

        public C290221(Continuation<? super C290221> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SparkChainMultiDeviceViewModel.this.new C290221(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
            return ((C290221) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
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
                languageTranslationData3 = SparkChainMultiDeviceViewModel.this.getMLanguageTranslationList().get(0);
            }
            SPUtils sPUtilsM1440iO2 = a01Var.m1440iO();
            LanguageTranslationData languageTranslationData4 = (LanguageTranslationData) new Gson().fromJson(sPUtilsM1440iO2.getString(b01.I011X + '_' + LanguageTranslationData.class.getName()), LanguageTranslationData.class);
            if (languageTranslationData4 == null) {
                languageTranslationData4 = SparkChainMultiDeviceViewModel.this.getMLanguageTranslationList().get(1);
            }
            ty0 ty0Var = SparkChainMultiDeviceViewModel.this._leftLanguageFlow;
            this.L$0 = SpillingKt.OXO1(languageTranslationData3);
            this.L$1 = languageTranslationData4;
            this.label = 1;
            if (ty0Var.emit(languageTranslationData3, this) != objI0iXXO) {
                languageTranslationData = languageTranslationData3;
                languageTranslationData2 = languageTranslationData4;
            }
            return objI0iXXO;
            ty0 ty0Var2 = SparkChainMultiDeviceViewModel.this._rightLanguageFlow;
            this.L$0 = SpillingKt.OXO1(languageTranslationData);
            this.L$1 = SpillingKt.OXO1(languageTranslationData2);
            this.label = 2;
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.sparkchain.SparkChainMultiDeviceViewModel$languageUpdate$1, reason: case insensitive filesystem */
    @DebugMetadata(m39465c = "com.sma.smartv3.ui.translate.sparkchain.SparkChainMultiDeviceViewModel$languageUpdate$1", m39466f = "SparkChainMultiDeviceViewModel.kt", m39467i = {}, m39468l = {}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
    public static final class C290231 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.sparkchain.SparkChainMultiDeviceViewModel$languageUpdate$1$1 */
        @DebugMetadata(m39465c = "com.sma.smartv3.ui.translate.sparkchain.SparkChainMultiDeviceViewModel$languageUpdate$1$1", m39466f = "SparkChainMultiDeviceViewModel.kt", m39467i = {}, m39468l = {112}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
        public static final class AnonymousClass1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ SparkChainMultiDeviceViewModel this$0;

            /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.sparkchain.SparkChainMultiDeviceViewModel$languageUpdate$1$1$OXO1 */
            public static final class OXO1<T> implements IXiXI {

                /* JADX INFO: renamed from: IO */
                public final /* synthetic */ SparkChainMultiDeviceViewModel f54851IO;

                public OXO1(SparkChainMultiDeviceViewModel sparkChainMultiDeviceViewModel) {
                    this.f54851IO = sparkChainMultiDeviceViewModel;
                }

                public static final Unit IiI10X(LanguageTranslationData languageTranslationData, XO0O10 updateTranslatorConfig) {
                    Intrinsics.X0O(updateTranslatorConfig, "$this$updateTranslatorConfig");
                    updateTranslatorConfig.m38781I1(languageTranslationData.getRtasrLanguage());
                    updateTranslatorConfig.m38783OX(languageTranslationData.getTtsViuceName());
                    return Unit.OXO1;
                }

                @Override // com.android.mltcode.paycertificationapi.IXiXI
                /* JADX INFO: renamed from: O00, reason: merged with bridge method [inline-methods] */
                public final Object emit(final LanguageTranslationData languageTranslationData, Continuation<? super Unit> continuation) {
                    this.f54851IO.useCase.iOOX010X(new Function1() { // from class: com.android.mltcode.paycertificationapi.kq4
                        @Override // kotlin.jvm.functions.Function1
                        /* JADX INFO: renamed from: invoke */
                        public final Object invoke2(Object obj) {
                            return SparkChainMultiDeviceViewModel.C290231.AnonymousClass1.OXO1.IiI10X(languageTranslationData, (com.sma.smartv3.p610ui.translate.sparkchain.XO0O10) obj);
                        }
                    });
                    return Unit.OXO1;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(SparkChainMultiDeviceViewModel sparkChainMultiDeviceViewModel, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = sparkChainMultiDeviceViewModel;
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

        /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.sparkchain.SparkChainMultiDeviceViewModel$languageUpdate$1$2 */
        @DebugMetadata(m39465c = "com.sma.smartv3.ui.translate.sparkchain.SparkChainMultiDeviceViewModel$languageUpdate$1$2", m39466f = "SparkChainMultiDeviceViewModel.kt", m39467i = {}, m39468l = {120}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ SparkChainMultiDeviceViewModel this$0;

            /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.sparkchain.SparkChainMultiDeviceViewModel$languageUpdate$1$2$OXO1 */
            public static final class OXO1<T> implements IXiXI {

                /* JADX INFO: renamed from: IO */
                public final /* synthetic */ SparkChainMultiDeviceViewModel f54852IO;

                public OXO1(SparkChainMultiDeviceViewModel sparkChainMultiDeviceViewModel) {
                    this.f54852IO = sparkChainMultiDeviceViewModel;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit IiI10X(LanguageTranslationData languageTranslationData, XO0O10 updateTranslatorConfig) {
                    Intrinsics.X0O(updateTranslatorConfig, "$this$updateTranslatorConfig");
                    updateTranslatorConfig.XiOIii1(languageTranslationData.getAsrLanguage());
                    updateTranslatorConfig.OII(languageTranslationData.getRtasrLanguage());
                    return Unit.OXO1;
                }

                @Override // com.android.mltcode.paycertificationapi.IXiXI
                /* JADX INFO: renamed from: O00, reason: merged with bridge method [inline-methods] */
                public final Object emit(final LanguageTranslationData languageTranslationData, Continuation<? super Unit> continuation) {
                    this.f54852IO.useCase.iOOX010X(new Function1() { // from class: com.android.mltcode.paycertificationapi.lq4
                        @Override // kotlin.jvm.functions.Function1
                        /* JADX INFO: renamed from: invoke */
                        public final Object invoke2(Object obj) {
                            return SparkChainMultiDeviceViewModel.C290231.AnonymousClass2.OXO1.IiI10X(languageTranslationData, (com.sma.smartv3.p610ui.translate.sparkchain.XO0O10) obj);
                        }
                    });
                    return Unit.OXO1;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(SparkChainMultiDeviceViewModel sparkChainMultiDeviceViewModel, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = sparkChainMultiDeviceViewModel;
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

        public C290231(Continuation<? super C290231> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C290231 c290231 = SparkChainMultiDeviceViewModel.this.new C290231(continuation);
            c290231.L$0 = obj;
            return c290231;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
            return ((C290231) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            i00OIXiO i00oixio = (i00OIXiO) this.L$0;
            C2798pb.I0iXXO();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.X1ii(obj);
            XX01Oi.IiI10X(i00oixio, null, null, new AnonymousClass1(SparkChainMultiDeviceViewModel.this, null), 3, null);
            XX01Oi.IiI10X(i00oixio, null, null, new AnonymousClass2(SparkChainMultiDeviceViewModel.this, null), 3, null);
            return Unit.OXO1;
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.sparkchain.SparkChainMultiDeviceViewModel$pageLanguageSideUpdate$1, reason: case insensitive filesystem */
    @DebugMetadata(m39465c = "com.sma.smartv3.ui.translate.sparkchain.SparkChainMultiDeviceViewModel$pageLanguageSideUpdate$1", m39466f = "SparkChainMultiDeviceViewModel.kt", m39467i = {}, m39468l = {189, 193}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
    @SourceDebugExtension({"SMAP\nSparkChainMultiDeviceViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparkChainMultiDeviceViewModel.kt\ncom/sma/smartv3/ui/translate/sparkchain/SparkChainMultiDeviceViewModel$pageLanguageSideUpdate$1\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,229:1\n85#2,3:230\n85#2,3:233\n*S KotlinDebug\n*F\n+ 1 SparkChainMultiDeviceViewModel.kt\ncom/sma/smartv3/ui/translate/sparkchain/SparkChainMultiDeviceViewModel$pageLanguageSideUpdate$1\n*L\n190#1:230,3\n194#1:233,3\n*E\n"})
    public static final class C290241 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $key;
        final /* synthetic */ LanguageTranslationData $mLanguage;
        int label;
        final /* synthetic */ SparkChainMultiDeviceViewModel this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C290241(int i, SparkChainMultiDeviceViewModel sparkChainMultiDeviceViewModel, LanguageTranslationData languageTranslationData, Continuation<? super C290241> continuation) {
            super(2, continuation);
            this.$key = i;
            this.this$0 = sparkChainMultiDeviceViewModel;
            this.$mLanguage = languageTranslationData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C290241(this.$key, this.this$0, this.$mLanguage, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
            return ((C290241) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
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

    /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.sparkchain.SparkChainMultiDeviceViewModel$startRecordAndTranslate$1, reason: case insensitive filesystem */
    @DebugMetadata(m39465c = "com.sma.smartv3.ui.translate.sparkchain.SparkChainMultiDeviceViewModel$startRecordAndTranslate$1", m39466f = "SparkChainMultiDeviceViewModel.kt", m39467i = {}, m39468l = {}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
    public static final class C290251 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        int label;

        public C290251(Continuation<? super C290251> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SparkChainMultiDeviceViewModel.this.new C290251(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
            return ((C290251) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C2798pb.I0iXXO();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.X1ii(obj);
            i1O0OXO1O.OXO1.OXO1(SparkChainMultiDeviceViewModel.this.TAG + " startRecordAndTranslate");
            SparkChainMultiDeviceViewModel.this.useCase.OII();
            return Unit.OXO1;
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.sparkchain.SparkChainMultiDeviceViewModel$stopRecordAndTranslate$1, reason: case insensitive filesystem */
    @DebugMetadata(m39465c = "com.sma.smartv3.ui.translate.sparkchain.SparkChainMultiDeviceViewModel$stopRecordAndTranslate$1", m39466f = "SparkChainMultiDeviceViewModel.kt", m39467i = {}, m39468l = {}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
    public static final class C290261 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        int label;

        public C290261(Continuation<? super C290261> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SparkChainMultiDeviceViewModel.this.new C290261(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
            return ((C290261) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            C2798pb.I0iXXO();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.X1ii(obj);
            i1O0OXO1O.OXO1.OXO1(SparkChainMultiDeviceViewModel.this.TAG + " stopRecordAndTranslate");
            SparkChainMultiDeviceViewModel.this.useCase.m38769I1();
            return Unit.OXO1;
        }
    }

    public SparkChainMultiDeviceViewModel(@aa1 LocalSparkChainAsrTranslateUseCase useCase) {
        Intrinsics.X0O(useCase, "useCase");
        this.useCase = useCase;
        this.TAG = "SparkChainMultiDeviceViewModel";
        final l94<i1iII1i1> l94VarO10IXXX0X = useCase.O10IXXX0X();
        this.asrFlow = l94VarO10IXXX0X;
        this.asrState = useCase.X0O();
        l94<String> l94VarIIX1OXO = useCase.IIX1OXO();
        this.translateTextFlow = l94VarIIX1OXO;
        this.recording = useCase.XiOIO();
        l94<String> l94VarI1XOi1 = useCase.I1XOi1();
        this.audioPathFlow = l94VarI1XOi1;
        this.mLanguageTranslationList = XO0O10.f54862IO.XIi00iiXO();
        ty0<LanguageTranslationData> ty0VarOXO1 = l85.OXO1(new LanguageTranslationData("中文", null, null, null, false, 0, null, 0, 254, null));
        this._leftLanguageFlow = ty0VarOXO1;
        this.pageLeftLanguageFlow = iX0XiO.XXI(ty0VarOXO1);
        ty0<LanguageTranslationData> ty0VarOXO2 = l85.OXO1(new LanguageTranslationData("中文", null, null, null, false, 0, null, 0, 254, null));
        this._rightLanguageFlow = ty0VarOXO2;
        this.pageRightLanguageFlow = iX0XiO.XXI(ty0VarOXO2);
        this.deviceType = 1;
        final ii0iIIX0<Object> ii0iiix0 = new ii0iIIX0<Object>() { // from class: com.sma.smartv3.ui.translate.sparkchain.SparkChainMultiDeviceViewModel$special$$inlined$filterIsInstance$1

            /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.sparkchain.SparkChainMultiDeviceViewModel$special$$inlined$filterIsInstance$1$2 */
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n*L\n1#1,218:1\n18#2:219\n32#2:220\n19#2:221\n*E\n"})
            public static final class AnonymousClass2<T> implements IXiXI {

                /* JADX INFO: renamed from: IO */
                public final /* synthetic */ IXiXI f54856IO;

                /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.sparkchain.SparkChainMultiDeviceViewModel$special$$inlined$filterIsInstance$1$2$1 */
                @DebugMetadata(m39465c = "com.sma.smartv3.ui.translate.sparkchain.SparkChainMultiDeviceViewModel$special$$inlined$filterIsInstance$1$2", m39466f = "SparkChainMultiDeviceViewModel.kt", m39467i = {0, 0, 0, 0, 0}, m39468l = {219}, m39469m = "emit", m39470n = {"value", "$completion", "value", "$this$filter_u24lambda_u240", "$i$a$-unsafeTransform-FlowKt__TransformKt$filter$1"}, m39472s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, m39473v = 1)
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
                    this.f54856IO = iXiXI;
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
                        IXiXI iXiXI = this.f54856IO;
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
        ii0iIIX0<iOIXXXII0> ii0iiix0IiIOiX = iX0XiO.iiIOiX(iX0XiO.Ii0X0X(iX0XiO.iIi1(new ii0iIIX0<i1iII1i1>() { // from class: com.sma.smartv3.ui.translate.sparkchain.SparkChainMultiDeviceViewModel$special$$inlined$filter$1

            /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.sparkchain.SparkChainMultiDeviceViewModel$special$$inlined$filter$1$2 */
            @SourceDebugExtension({"SMAP\nEmitters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 SparkChainMultiDeviceViewModel.kt\ncom/sma/smartv3/ui/translate/sparkchain/SparkChainMultiDeviceViewModel\n*L\n1#1,218:1\n18#2:219\n19#2:221\n63#3:220\n*E\n"})
            public static final class C190172<T> implements IXiXI {

                /* JADX INFO: renamed from: IO */
                public final /* synthetic */ IXiXI f54854IO;

                /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.sparkchain.SparkChainMultiDeviceViewModel$special$$inlined$filter$1$2$1 */
                @DebugMetadata(m39465c = "com.sma.smartv3.ui.translate.sparkchain.SparkChainMultiDeviceViewModel$special$$inlined$filter$1$2", m39466f = "SparkChainMultiDeviceViewModel.kt", m39467i = {0, 0, 0, 0, 0}, m39468l = {219}, m39469m = "emit", m39470n = {"value", "$completion", "value", "$this$filter_u24lambda_u240", "$i$a$-unsafeTransform-FlowKt__TransformKt$filter$1"}, m39472s = {"L$0", "L$1", "L$2", "L$3", "I$0"}, m39473v = 1)
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
                        return C190172.this.emit(null, this);
                    }
                }

                public C190172(IXiXI iXiXI) {
                    this.f54854IO = iXiXI;
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
                        IXiXI iXiXI = this.f54854IO;
                        Integer numIiI10X = ((i1iII1i1) obj).IiI10X();
                        if (numIiI10X != null && numIiI10X.intValue() == 2) {
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
                Object objCollect = ii0iiix0.collect(new C190172(iXiXI), continuation);
                return objCollect == C2798pb.I0iXXO() ? objCollect : Unit.OXO1;
            }
        }, l94VarIIX1OXO, new SparkChainMultiDeviceViewModel$aiMessageFlow$2(this, null)), new Function2() { // from class: com.android.mltcode.paycertificationapi.jq4
            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj, Object obj2) {
                return Boolean.valueOf(SparkChainMultiDeviceViewModel.aiMessageFlow$lambda$1((iOIXXXII0) obj, (iOIXXXII0) obj2));
            }
        }));
        this.aiMessageFlow = ii0iiix0IiIOiX;
        this.saveFlow = iX0XiO.IOI(ii0iiix0IiIOiX, iX0XiO.iiIOiX(l94VarI1XOi1), new SparkChainMultiDeviceViewModel$saveFlow$1(null));
        languageUpdate();
        initLanguages();
        collectSaveFlow();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean aiMessageFlow$lambda$1(iOIXXXII0 old, iOIXXXII0 ioixxxii0) {
        Intrinsics.X0O(old, "old");
        Intrinsics.X0O(ioixxxii0, "new");
        String strXX0 = old.XX0();
        String strXIi00iiXO = strXX0 != null ? xp5.XIi00iiXO(strXX0) : null;
        String strXX1 = ioixxxii0.XX0();
        if (Intrinsics.XOO0ii0(strXIi00iiXO, strXX1 != null ? xp5.XIi00iiXO(strXX1) : null)) {
            return true;
        }
        String strXiOIii1 = old.XiOIii1();
        String strXIi00iiXO2 = strXiOIii1 != null ? xp5.XIi00iiXO(strXiOIii1) : null;
        String strXiOIii2 = ioixxxii0.XiOIii1();
        return Intrinsics.XOO0ii0(strXIi00iiXO2, strXiOIii2 != null ? xp5.XIi00iiXO(strXiOIii2) : null);
    }

    private final void changeAsrLanguages(boolean z) {
        final LanguageTranslationData value = this.pageLeftLanguageFlow.getValue();
        final LanguageTranslationData value2 = this.pageRightLanguageFlow.getValue();
        if (z) {
            this.useCase.iOOX010X(new Function1() { // from class: com.android.mltcode.paycertificationapi.iq4
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SparkChainMultiDeviceViewModel.changeAsrLanguages$lambda$1(value2, value, (com.sma.smartv3.p610ui.translate.sparkchain.XO0O10) obj);
                }
            });
        } else {
            this.useCase.iOOX010X(new Function1() { // from class: com.android.mltcode.paycertificationapi.hq4
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: invoke */
                public final Object invoke2(Object obj) {
                    return SparkChainMultiDeviceViewModel.changeAsrLanguages$lambda$0(value, value2, (com.sma.smartv3.p610ui.translate.sparkchain.XO0O10) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit changeAsrLanguages$lambda$0(LanguageTranslationData languageTranslationData, LanguageTranslationData languageTranslationData2, XO0O10 updateTranslatorConfig) {
        Intrinsics.X0O(updateTranslatorConfig, "$this$updateTranslatorConfig");
        updateTranslatorConfig.m38781I1(languageTranslationData.getRtasrLanguage());
        updateTranslatorConfig.m38783OX(languageTranslationData.getTtsViuceName());
        updateTranslatorConfig.XiOIii1(languageTranslationData2.getAsrLanguage());
        updateTranslatorConfig.OII(languageTranslationData2.getRtasrLanguage());
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit changeAsrLanguages$lambda$1(LanguageTranslationData languageTranslationData, LanguageTranslationData languageTranslationData2, XO0O10 updateTranslatorConfig) {
        Intrinsics.X0O(updateTranslatorConfig, "$this$updateTranslatorConfig");
        updateTranslatorConfig.m38781I1(languageTranslationData.getRtasrLanguage());
        updateTranslatorConfig.m38783OX(languageTranslationData.getTtsViuceName());
        updateTranslatorConfig.XiOIii1(languageTranslationData2.getAsrLanguage());
        updateTranslatorConfig.OII(languageTranslationData2.getRtasrLanguage());
        return Unit.OXO1;
    }

    private final XiOIO collectSaveFlow() {
        return XX01Oi.IiI10X(ViewModelKt.getViewModelScope(this), IXOX0Xiii.m712iO(), null, new C190201(null), 2, null);
    }

    private final XiOIO initLanguages() {
        return XX01Oi.IiI10X(ViewModelKt.getViewModelScope(this), IXOX0Xiii.m712iO(), null, new C290221(null), 2, null);
    }

    public static /* synthetic */ boolean isEqualOtherLanguage$default(SparkChainMultiDeviceViewModel sparkChainMultiDeviceViewModel, LanguageTranslationData languageTranslationData, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return sparkChainMultiDeviceViewModel.isEqualOtherLanguage(languageTranslationData, z);
    }

    public static /* synthetic */ void pageLanguageSideUpdate$default(SparkChainMultiDeviceViewModel sparkChainMultiDeviceViewModel, LanguageTranslationData languageTranslationData, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 1;
        }
        sparkChainMultiDeviceViewModel.pageLanguageSideUpdate(languageTranslationData, i);
    }

    public static /* synthetic */ void setCurrentAudioDeviceType$default(SparkChainMultiDeviceViewModel sparkChainMultiDeviceViewModel, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        sparkChainMultiDeviceViewModel.setCurrentAudioDeviceType(z);
    }

    private final XiOIO startRecordAndTranslate() {
        return XX01Oi.IiI10X(ViewModelKt.getViewModelScope(this), IXOX0Xiii.m712iO(), null, new C290251(null), 2, null);
    }

    private final XiOIO stopRecordAndTranslate() {
        return XX01Oi.IiI10X(ViewModelKt.getViewModelScope(this), IXOX0Xiii.m712iO(), null, new C290261(null), 2, null);
    }

    @aa1
    public final ii0iIIX0<iOIXXXII0> getAiMessageFlow() {
        return this.aiMessageFlow;
    }

    @aa1
    public final l94<i1iII1i1> getAsrFlow() {
        return this.asrFlow;
    }

    @aa1
    public final k85<I0OX> getAsrState() {
        return this.asrState;
    }

    @aa1
    public final l94<String> getAudioPathFlow() {
        return this.audioPathFlow;
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
    public final k85<Boolean> getRecording() {
        return this.recording;
    }

    @aa1
    public final l94<String> getTranslateTextFlow() {
        return this.translateTextFlow;
    }

    public final boolean isEqualOtherLanguage(@tb1 LanguageTranslationData languageTranslationData, boolean z) {
        return languageTranslationData != null && Intrinsics.XOO0ii0(languageTranslationData.getName(), (z ? this.pageLeftLanguageFlow.getValue() : this.pageRightLanguageFlow.getValue()).getName());
    }

    public final boolean isLeftEarType() {
        return this.deviceType == 1;
    }

    @aa1
    public final XiOIO languageUpdate() {
        return XX01Oi.IiI10X(ViewModelKt.getViewModelScope(this), IXOX0Xiii.m712iO(), null, new C290231(null), 2, null);
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        this.useCase.I0iXXO();
    }

    public final void pageExchangeLeftAndRightLanguage() {
        LanguageTranslationData value = this._leftLanguageFlow.getValue();
        this._leftLanguageFlow.setValue(this._rightLanguageFlow.getValue());
        this._rightLanguageFlow.setValue(value);
        a01 a01Var = a01.OXO1;
        a01Var.m1440iO().put(b01.OXii10I + '_' + LanguageTranslationData.class.getName(), new Gson().toJson(this._leftLanguageFlow.getValue()), false);
        a01Var.m1440iO().put(b01.I011X + '_' + LanguageTranslationData.class.getName(), new Gson().toJson(this._rightLanguageFlow.getValue()), false);
    }

    public final void pageLanguageSideUpdate(@tb1 LanguageTranslationData languageTranslationData, int i) {
        if (languageTranslationData != null) {
            XX01Oi.IiI10X(ViewModelKt.getViewModelScope(this), IXOX0Xiii.m712iO(), null, new C290241(i, this, languageTranslationData, null), 2, null);
        }
    }

    public final void playAiMessageAudioPath(@aa1 String path) {
        Intrinsics.X0O(path, "path");
        this.useCase.X1ii(path);
    }

    public final void saveAllDataAndExit() {
        this.useCase.XX0();
    }

    public final void setCurrentAudioDeviceType(boolean z) {
        this.deviceType = z ? 1 : 2;
        changeAsrLanguages(z);
    }

    public final void startOrStopRecord() {
        if (this.recording.getValue().booleanValue()) {
            stopRecordAndTranslate();
        } else {
            startRecordAndTranslate();
        }
    }
}
