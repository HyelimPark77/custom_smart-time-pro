package com.sma.smartv3.ui.translate.sparkchain;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.android.mltcode.paycertificationapi.I0OX;
import com.android.mltcode.paycertificationapi.I100X1;
import com.android.mltcode.paycertificationapi.IXOX0Xiii;
import com.android.mltcode.paycertificationapi.IXiXI;
import com.android.mltcode.paycertificationapi.a01;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b01;
import com.android.mltcode.paycertificationapi.hq4;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.i1iII1i1;
import com.android.mltcode.paycertificationapi.iOIXXXII0;
import com.android.mltcode.paycertificationapi.iX0XiO;
import com.android.mltcode.paycertificationapi.ii0iIIX0;
import com.android.mltcode.paycertificationapi.iq4;
import com.android.mltcode.paycertificationapi.jq4;
import com.android.mltcode.paycertificationapi.k85;
import com.android.mltcode.paycertificationapi.kq4;
import com.android.mltcode.paycertificationapi.l85;
import com.android.mltcode.paycertificationapi.l94;
import com.android.mltcode.paycertificationapi.lq4;
import com.android.mltcode.paycertificationapi.pb;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.ty0;
import com.android.mltcode.paycertificationapi.xp5;
import com.blankj.utilcode.util.SPUtils;
import com.google.gson.Gson;
import com.sma.smartv3.model.LanguageTranslationData;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
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

    /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.sparkchain.SparkChainMultiDeviceViewModel$collectSaveFlow$1, reason: invalid class name */
    @DebugMetadata(c = "com.sma.smartv3.ui.translate.sparkchain.SparkChainMultiDeviceViewModel$collectSaveFlow$1", f = "SparkChainMultiDeviceViewModel.kt", i = {}, l = {87}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ SparkChainMultiDeviceViewModel this$0;

        /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.sparkchain.SparkChainMultiDeviceViewModel$collectSaveFlow$1$OXO1 */
        public static final class OXO1<T> implements IXiXI {
            public final /* synthetic */ SparkChainMultiDeviceViewModel IO;

            public OXO1(SparkChainMultiDeviceViewModel r1) {
                this.IO = r1;
            }

            public final Object OXO1(iOIXXXII0 r1, Continuation<? super Unit> r2) {
                SparkChainMultiDeviceViewModel.access$getUseCase$p(this.IO).OiIIX101O(r1);
                return Unit.OXO1;
            }

            @Override // com.android.mltcode.paycertificationapi.IXiXI
            public /* bridge */ /* synthetic */ Object emit(Object r1, Continuation r2) {
                return OXO1((iOIXXXII0) r1, r2);
            }
        }

        public AnonymousClass1(SparkChainMultiDeviceViewModel r1, Continuation<? super AnonymousClass1> r2) {
            this.this$0 = r1;
            super(2, r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r2, Continuation<?> r3) {
            return new AnonymousClass1(this.this$0, r3);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
            return ((AnonymousClass1) create(r1, r2)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r5) {
            Object r0 = pb.I0iXXO();
            int r1 = this.label;
            if (r1 == 0) goto L8;
            if (r1 != 1) goto L7;
            ResultKt.X1ii(r5);
        L12:
            return Unit.OXO1;
        L7:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        L8:
            ResultKt.X1ii(r5);
            ii0iIIX0 r6 = SparkChainMultiDeviceViewModel.access$getSaveFlow$p(this.this$0);
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

    /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.sparkchain.SparkChainMultiDeviceViewModel$initLanguages$1, reason: invalid class name and case insensitive filesystem */
    @DebugMetadata(c = "com.sma.smartv3.ui.translate.sparkchain.SparkChainMultiDeviceViewModel$initLanguages$1", f = "SparkChainMultiDeviceViewModel.kt", i = {0, 0, 1, 1}, l = {106, 107}, m = "invokeSuspend", n = {"mLeftLanguage", "mRightLanguage", "mLeftLanguage", "mRightLanguage"}, s = {"L$0", "L$1", "L$0", "L$1"}, v = 1)
    @SourceDebugExtension({"SMAP\nSparkChainMultiDeviceViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparkChainMultiDeviceViewModel.kt\ncom/sma/smartv3/ui/translate/sparkchain/SparkChainMultiDeviceViewModel$initLanguages$1\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,229:1\n90#2:230\n90#2:231\n*S KotlinDebug\n*F\n+ 1 SparkChainMultiDeviceViewModel.kt\ncom/sma/smartv3/ui/translate/sparkchain/SparkChainMultiDeviceViewModel$initLanguages$1\n*L\n99#1:230\n103#1:231\n*E\n"})
    public static final class C34891 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ SparkChainMultiDeviceViewModel this$0;

        public C34891(SparkChainMultiDeviceViewModel r1, Continuation<? super C34891> r2) {
            this.this$0 = r1;
            super(2, r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r2, Continuation<?> r3) {
            return new C34891(this.this$0, r3);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
            return ((C34891) create(r1, r2)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r10) {
            Object r0 = pb.I0iXXO();
            int r1 = this.label;
            if (r1 == 0) goto L10;
            if (r1 == 1) goto L9;
            if (r1 != 2) goto L8;
            LanguageTranslationData r2 = (LanguageTranslationData) this.L$1;
            LanguageTranslationData r3 = (LanguageTranslationData) this.L$0;
            ResultKt.X1ii(r10);
        L24:
            return Unit.OXO1;
        L8:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        L9:
            LanguageTranslationData r4 = (LanguageTranslationData) this.L$1;
            LanguageTranslationData r5 = (LanguageTranslationData) this.L$0;
            ResultKt.X1ii(r10);
        L20:
            ty0 r11 = SparkChainMultiDeviceViewModel.access$get_rightLanguageFlow$p(this.this$0);
            this.L$0 = SpillingKt.OXO1(r5);
            this.L$1 = SpillingKt.OXO1(r4);
            this.label = 2;
            if (r11.emit(r4, this) != r0) goto L24;
        L22:
            return r0;
        L10:
            ResultKt.X1ii(r10);
            a01 r12 = a01.OXO1;
            SPUtils r6 = r12.iO();
            LanguageTranslationData r7 = (LanguageTranslationData) new Gson().fromJson(r6.getString(b01.OXii10I + '_' + LanguageTranslationData.class.getName()), LanguageTranslationData.class);
            if (r7 != null) goto L13;
            r7 = this.this$0.getMLanguageTranslationList().get(0);
        L13:
            SPUtils r13 = r12.iO();
            LanguageTranslationData r14 = (LanguageTranslationData) new Gson().fromJson(r13.getString(b01.I011X + '_' + LanguageTranslationData.class.getName()), LanguageTranslationData.class);
            if (r14 != null) goto L16;
            r14 = this.this$0.getMLanguageTranslationList().get(1);
        L16:
            ty0 r8 = SparkChainMultiDeviceViewModel.access$get_leftLanguageFlow$p(this.this$0);
            this.L$0 = SpillingKt.OXO1(r7);
            this.L$1 = r14;
            this.label = 1;
            if (r8.emit(r7, this) == r0) goto L22;
            r5 = r7;
            r4 = r14;
            goto L20
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
            return invoke2(r1, r2);
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.sparkchain.SparkChainMultiDeviceViewModel$languageUpdate$1, reason: invalid class name and case insensitive filesystem */
    @DebugMetadata(c = "com.sma.smartv3.ui.translate.sparkchain.SparkChainMultiDeviceViewModel$languageUpdate$1", f = "SparkChainMultiDeviceViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class C34901 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ SparkChainMultiDeviceViewModel this$0;

        /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.sparkchain.SparkChainMultiDeviceViewModel$languageUpdate$1$1, reason: invalid class name and collision with other inner class name */
        @DebugMetadata(c = "com.sma.smartv3.ui.translate.sparkchain.SparkChainMultiDeviceViewModel$languageUpdate$1$1", f = "SparkChainMultiDeviceViewModel.kt", i = {}, l = {112}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        public static final class C05771 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ SparkChainMultiDeviceViewModel this$0;

            /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.sparkchain.SparkChainMultiDeviceViewModel$languageUpdate$1$1$OXO1 */
            public static final class OXO1<T> implements IXiXI {
                public final /* synthetic */ SparkChainMultiDeviceViewModel IO;

                public OXO1(SparkChainMultiDeviceViewModel r1) {
                    this.IO = r1;
                }

                public static final Unit IiI10X(LanguageTranslationData r1, XO0O10 r2) {
                    Intrinsics.X0O(r2, "$this$updateTranslatorConfig");
                    r2.I1(r1.getRtasrLanguage());
                    r2.OX(r1.getTtsViuceName());
                    return Unit.OXO1;
                }

                public static /* synthetic */ Unit OXO1(LanguageTranslationData r0, XO0O10 r1) {
                    return IiI10X(r0, r1);
                }

                public final Object O00(final LanguageTranslationData r2, Continuation<? super Unit> r3) {
                    SparkChainMultiDeviceViewModel.access$getUseCase$p(this.IO).iOOX010X(new kq4(r2));
                    return Unit.OXO1;
                }

                @Override // com.android.mltcode.paycertificationapi.IXiXI
                public /* bridge */ /* synthetic */ Object emit(Object r1, Continuation r2) {
                    return O00((LanguageTranslationData) r1, r2);
                }
            }

            public C05771(SparkChainMultiDeviceViewModel r1, Continuation<? super C05771> r2) {
                this.this$0 = r1;
                super(2, r2);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object r2, Continuation<?> r3) {
                return new C05771(this.this$0, r3);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
                return ((C05771) create(r1, r2)).invokeSuspend(Unit.OXO1);
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
                k85<LanguageTranslationData> r6 = this.this$0.getPageLeftLanguageFlow();
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

        /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.sparkchain.SparkChainMultiDeviceViewModel$languageUpdate$1$2, reason: invalid class name */
        @DebugMetadata(c = "com.sma.smartv3.ui.translate.sparkchain.SparkChainMultiDeviceViewModel$languageUpdate$1$2", f = "SparkChainMultiDeviceViewModel.kt", i = {}, l = {120}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ SparkChainMultiDeviceViewModel this$0;

            /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.sparkchain.SparkChainMultiDeviceViewModel$languageUpdate$1$2$OXO1 */
            public static final class OXO1<T> implements IXiXI {
                public final /* synthetic */ SparkChainMultiDeviceViewModel IO;

                public OXO1(SparkChainMultiDeviceViewModel r1) {
                    this.IO = r1;
                }

                private static final Unit IiI10X(LanguageTranslationData r1, XO0O10 r2) {
                    Intrinsics.X0O(r2, "$this$updateTranslatorConfig");
                    r2.XiOIii1(r1.getAsrLanguage());
                    r2.OII(r1.getRtasrLanguage());
                    return Unit.OXO1;
                }

                public static /* synthetic */ Unit OXO1(LanguageTranslationData r0, XO0O10 r1) {
                    return IiI10X(r0, r1);
                }

                public final Object O00(final LanguageTranslationData r2, Continuation<? super Unit> r3) {
                    SparkChainMultiDeviceViewModel.access$getUseCase$p(this.IO).iOOX010X(new lq4(r2));
                    return Unit.OXO1;
                }

                @Override // com.android.mltcode.paycertificationapi.IXiXI
                public /* bridge */ /* synthetic */ Object emit(Object r1, Continuation r2) {
                    return O00((LanguageTranslationData) r1, r2);
                }
            }

            public AnonymousClass2(SparkChainMultiDeviceViewModel r1, Continuation<? super AnonymousClass2> r2) {
                this.this$0 = r1;
                super(2, r2);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object r2, Continuation<?> r3) {
                return new AnonymousClass2(this.this$0, r3);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
                return ((AnonymousClass2) create(r1, r2)).invokeSuspend(Unit.OXO1);
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
                k85<LanguageTranslationData> r6 = this.this$0.getPageRightLanguageFlow();
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

        public C34901(SparkChainMultiDeviceViewModel r1, Continuation<? super C34901> r2) {
            this.this$0 = r1;
            super(2, r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
            C34901 r0 = new C34901(this.this$0, r4);
            r0.L$0 = r3;
            return r0;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
            return ((C34901) create(r1, r2)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r8) {
            i00OIXiO r1 = (i00OIXiO) this.L$0;
            pb.I0iXXO();
            if (this.label != 0) goto L7;
            ResultKt.X1ii(r8);
            I100X1.O00(r1, null, null, new C05771(this.this$0, null), 3, null);
            I100X1.O00(r1, null, null, new AnonymousClass2(this.this$0, null), 3, null);
            return Unit.OXO1;
        L7:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
            return invoke2(r1, r2);
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.sparkchain.SparkChainMultiDeviceViewModel$pageLanguageSideUpdate$1, reason: invalid class name and case insensitive filesystem */
    @DebugMetadata(c = "com.sma.smartv3.ui.translate.sparkchain.SparkChainMultiDeviceViewModel$pageLanguageSideUpdate$1", f = "SparkChainMultiDeviceViewModel.kt", i = {}, l = {189, 193}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    @SourceDebugExtension({"SMAP\nSparkChainMultiDeviceViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparkChainMultiDeviceViewModel.kt\ncom/sma/smartv3/ui/translate/sparkchain/SparkChainMultiDeviceViewModel$pageLanguageSideUpdate$1\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,229:1\n85#2,3:230\n85#2,3:233\n*S KotlinDebug\n*F\n+ 1 SparkChainMultiDeviceViewModel.kt\ncom/sma/smartv3/ui/translate/sparkchain/SparkChainMultiDeviceViewModel$pageLanguageSideUpdate$1\n*L\n190#1:230,3\n194#1:233,3\n*E\n"})
    public static final class C34911 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $key;
        final /* synthetic */ LanguageTranslationData $mLanguage;
        int label;
        final /* synthetic */ SparkChainMultiDeviceViewModel this$0;

        public C34911(int r1, SparkChainMultiDeviceViewModel r2, LanguageTranslationData r3, Continuation<? super C34911> r4) {
            this.$key = r1;
            this.this$0 = r2;
            this.$mLanguage = r3;
            super(2, r4);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r4, Continuation<?> r5) {
            return new C34911(this.$key, this.this$0, this.$mLanguage, r5);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
            return ((C34911) create(r1, r2)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r9) {
            Object r0 = pb.I0iXXO();
            int r1 = this.label;
            if (r1 == 0) goto L10;
            if (r1 == 1) goto L9;
            if (r1 != 2) goto L8;
            ResultKt.X1ii(r9);
        L21:
            a01.OXO1.iO().put(b01.I011X + '_' + LanguageTranslationData.class.getName(), new Gson().toJson(this.$mLanguage), false);
        L23:
            return Unit.OXO1;
        L8:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        L9:
            ResultKt.X1ii(r9);
        L15:
            a01.OXO1.iO().put(b01.OXii10I + '_' + LanguageTranslationData.class.getName(), new Gson().toJson(this.$mLanguage), false);
        L17:
            if (this.$key != 2) goto L23;
            ty0 r10 = SparkChainMultiDeviceViewModel.access$get_rightLanguageFlow$p(this.this$0);
            LanguageTranslationData r2 = this.$mLanguage;
            this.label = 2;
            if (r10.emit(r2, this) != r0) goto L21;
        L20:
            return r0;
        L10:
            ResultKt.X1ii(r9);
            if (this.$key != 1) goto L17;
            ty0 r11 = SparkChainMultiDeviceViewModel.access$get_leftLanguageFlow$p(this.this$0);
            LanguageTranslationData r3 = this.$mLanguage;
            this.label = 1;
            if (r11.emit(r3, this) != r0) goto L15;
            goto L15
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
            return invoke2(r1, r2);
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.sparkchain.SparkChainMultiDeviceViewModel$startRecordAndTranslate$1, reason: invalid class name and case insensitive filesystem */
    @DebugMetadata(c = "com.sma.smartv3.ui.translate.sparkchain.SparkChainMultiDeviceViewModel$startRecordAndTranslate$1", f = "SparkChainMultiDeviceViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class C34921 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ SparkChainMultiDeviceViewModel this$0;

        public C34921(SparkChainMultiDeviceViewModel r1, Continuation<? super C34921> r2) {
            this.this$0 = r1;
            super(2, r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r2, Continuation<?> r3) {
            return new C34921(this.this$0, r3);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
            return ((C34921) create(r1, r2)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r3) {
            pb.I0iXXO();
            if (this.label != 0) goto L7;
            ResultKt.X1ii(r3);
            i1O0OXO1O.OXO1.OXO1(SparkChainMultiDeviceViewModel.access$getTAG$p(this.this$0) + " startRecordAndTranslate");
            SparkChainMultiDeviceViewModel.access$getUseCase$p(this.this$0).OII();
            return Unit.OXO1;
        L7:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
            return invoke2(r1, r2);
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.sparkchain.SparkChainMultiDeviceViewModel$stopRecordAndTranslate$1, reason: invalid class name and case insensitive filesystem */
    @DebugMetadata(c = "com.sma.smartv3.ui.translate.sparkchain.SparkChainMultiDeviceViewModel$stopRecordAndTranslate$1", f = "SparkChainMultiDeviceViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class C34931 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ SparkChainMultiDeviceViewModel this$0;

        public C34931(SparkChainMultiDeviceViewModel r1, Continuation<? super C34931> r2) {
            this.this$0 = r1;
            super(2, r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r2, Continuation<?> r3) {
            return new C34931(this.this$0, r3);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
            return ((C34931) create(r1, r2)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r3) {
            pb.I0iXXO();
            if (this.label != 0) goto L7;
            ResultKt.X1ii(r3);
            i1O0OXO1O.OXO1.OXO1(SparkChainMultiDeviceViewModel.access$getTAG$p(this.this$0) + " stopRecordAndTranslate");
            SparkChainMultiDeviceViewModel.access$getUseCase$p(this.this$0).I1();
            return Unit.OXO1;
        L7:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
            return invoke2(r1, r2);
        }
    }

    public SparkChainMultiDeviceViewModel(@aa1 LocalSparkChainAsrTranslateUseCase r15) {
        Intrinsics.X0O(r15, "useCase");
        this.useCase = r15;
        this.TAG = "SparkChainMultiDeviceViewModel";
        final l94<i1iII1i1> r0 = r15.O10IXXX0X();
        this.asrFlow = r0;
        this.asrState = r15.X0O();
        l94<String> r1 = r15.IIX1OXO();
        this.translateTextFlow = r1;
        this.recording = r15.XiOIO();
        l94<String> r16 = r15.I1XOi1();
        this.audioPathFlow = r16;
        this.mLanguageTranslationList = XO0O10.IO.XIi00iiXO();
        ty0<LanguageTranslationData> r2 = l85.OXO1(new LanguageTranslationData("中文", null, null, null, false, 0, null, 0, 254, null));
        this._leftLanguageFlow = r2;
        this.pageLeftLanguageFlow = iX0XiO.XXI(r2);
        ty0<LanguageTranslationData> r3 = l85.OXO1(new LanguageTranslationData("中文", null, null, null, false, 0, null, 0, 254, null));
        this._rightLanguageFlow = r3;
        this.pageRightLanguageFlow = iX0XiO.XXI(r3);
        this.deviceType = 1;
        final ii0iIIX0<Object> r4 = new SparkChainMultiDeviceViewModel$special$$inlined$filterIsInstance$1(r0);
        ii0iIIX0<iOIXXXII0> r5 = iX0XiO.iiIOiX(iX0XiO.Ii0X0X(iX0XiO.iIi1(new SparkChainMultiDeviceViewModel$special$$inlined$filter$1(r4), r1, new SparkChainMultiDeviceViewModel$aiMessageFlow$2(this, null)), new jq4()));
        this.aiMessageFlow = r5;
        this.saveFlow = iX0XiO.IOI(r5, iX0XiO.iiIOiX(r16), new SparkChainMultiDeviceViewModel$saveFlow$1(null));
        languageUpdate();
        initLanguages();
        collectSaveFlow();
    }

    public static /* synthetic */ Unit OXO1(LanguageTranslationData r0, LanguageTranslationData r1, XO0O10 r2) {
        return changeAsrLanguages$lambda$0(r0, r1, r2);
    }

    public static /* synthetic */ boolean XIi00iiXO(iOIXXXII0 r0, iOIXXXII0 r1) {
        return aiMessageFlow$lambda$1(r0, r1);
    }

    public static final /* synthetic */ int access$getDeviceType$p(SparkChainMultiDeviceViewModel r0) {
        return r0.deviceType;
    }

    public static final /* synthetic */ ii0iIIX0 access$getSaveFlow$p(SparkChainMultiDeviceViewModel r0) {
        return r0.saveFlow;
    }

    public static final /* synthetic */ String access$getTAG$p(SparkChainMultiDeviceViewModel r0) {
        return r0.TAG;
    }

    public static final /* synthetic */ LocalSparkChainAsrTranslateUseCase access$getUseCase$p(SparkChainMultiDeviceViewModel r0) {
        return r0.useCase;
    }

    public static final /* synthetic */ ty0 access$get_leftLanguageFlow$p(SparkChainMultiDeviceViewModel r0) {
        return r0._leftLanguageFlow;
    }

    public static final /* synthetic */ ty0 access$get_rightLanguageFlow$p(SparkChainMultiDeviceViewModel r0) {
        return r0._rightLanguageFlow;
    }

    private static final boolean aiMessageFlow$lambda$1(iOIXXXII0 r3, iOIXXXII0 r4) {
        Intrinsics.X0O(r3, "old");
        Intrinsics.X0O(r4, "new");
        String r0 = r3.XX0();
        String r1 = null;
        if (r0 == null) goto L5;
        String r2 = xp5.XIi00iiXO(r0);
    L6:
        String r5 = r4.XX0();
        if (r5 == null) goto L9;
        String r6 = xp5.XIi00iiXO(r5);
    L11:
        if (Intrinsics.XOO0ii0(r2, r6) == true) goto L24;
        String r7 = r3.XiOIii1();
        if (r7 == null) goto L15;
        String r8 = xp5.XIi00iiXO(r7);
    L16:
        String r9 = r4.XiOIii1();
        if (r9 == null) goto L20;
        r1 = xp5.XIi00iiXO(r9);
    L20:
        if (Intrinsics.XOO0ii0(r8, r1) == true) goto L26;
        return false;
    L26:
        return true;
    L15:
        r8 = null;
        goto L16
    L24:
        return true;
    L9:
        r6 = null;
        goto L11
    L5:
        r2 = null;
        goto L6
    }

    private final void changeAsrLanguages(boolean r4) {
        final LanguageTranslationData r0 = getValue();
        final LanguageTranslationData r1 = getValue();
        if (r4 == true) goto L6;
        this.useCase.iOOX010X(new hq4(r0, r1));
        return;
    L6:
        this.useCase.iOOX010X(new iq4(r1, r0));
    }

    private static final Unit changeAsrLanguages$lambda$0(LanguageTranslationData r1, LanguageTranslationData r2, XO0O10 r3) {
        Intrinsics.X0O(r3, "$this$updateTranslatorConfig");
        r3.I1(r1.getRtasrLanguage());
        r3.OX(r1.getTtsViuceName());
        r3.XiOIii1(r2.getAsrLanguage());
        r3.OII(r2.getRtasrLanguage());
        return Unit.OXO1;
    }

    private static final Unit changeAsrLanguages$lambda$1(LanguageTranslationData r1, LanguageTranslationData r2, XO0O10 r3) {
        Intrinsics.X0O(r3, "$this$updateTranslatorConfig");
        r3.I1(r1.getRtasrLanguage());
        r3.OX(r1.getTtsViuceName());
        r3.XiOIii1(r2.getAsrLanguage());
        r3.OII(r2.getRtasrLanguage());
        return Unit.OXO1;
    }

    private final XiOIO collectSaveFlow() {
        return I100X1.O00(ViewModelKt.getViewModelScope(this), IXOX0Xiii.iO(), null, new AnonymousClass1(this, null), 2, null);
    }

    public static /* synthetic */ Unit iO(LanguageTranslationData r0, LanguageTranslationData r1, XO0O10 r2) {
        return changeAsrLanguages$lambda$1(r0, r1, r2);
    }

    private final XiOIO initLanguages() {
        return I100X1.O00(ViewModelKt.getViewModelScope(this), IXOX0Xiii.iO(), null, new C34891(this, null), 2, null);
    }

    public static /* synthetic */ boolean isEqualOtherLanguage$default(SparkChainMultiDeviceViewModel r0, LanguageTranslationData r1, boolean r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L6;
        r2 = true;
    L6:
        return r0.isEqualOtherLanguage(r1, r2);
    }

    public static /* synthetic */ void pageLanguageSideUpdate$default(SparkChainMultiDeviceViewModel r0, LanguageTranslationData r1, int r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = 1;
    L5:
        r0.pageLanguageSideUpdate(r1, r2);
    }

    public static /* synthetic */ void setCurrentAudioDeviceType$default(SparkChainMultiDeviceViewModel r0, boolean r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = true;
    L5:
        r0.setCurrentAudioDeviceType(r1);
    }

    private final XiOIO startRecordAndTranslate() {
        return I100X1.O00(ViewModelKt.getViewModelScope(this), IXOX0Xiii.iO(), null, new C34921(this, null), 2, null);
    }

    private final XiOIO stopRecordAndTranslate() {
        return I100X1.O00(ViewModelKt.getViewModelScope(this), IXOX0Xiii.iO(), null, new C34931(this, null), 2, null);
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

    public final boolean isEqualOtherLanguage(@tb1 LanguageTranslationData r1, boolean r2) {
        if (r2 == false) goto L4;
        LanguageTranslationData r3 = getValue();
    L5:
        if (r1 != null) goto L7;
        return false;
    L7:
        if (Intrinsics.XOO0ii0(r1.getName(), r3.getName()) == false) goto L12;
        return true;
    L12:
        return false;
    L4:
        r3 = getValue();
        goto L5
    }

    public final boolean isLeftEarType() {
        if (this.deviceType != 1) goto L5;
        return true;
    L5:
        return false;
    }

    @aa1
    public final XiOIO languageUpdate() {
        return I100X1.O00(ViewModelKt.getViewModelScope(this), IXOX0Xiii.iO(), null, new C34901(this, null), 2, null);
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        this.useCase.I0iXXO();
    }

    public final void pageExchangeLeftAndRightLanguage() {
        LanguageTranslationData r0 = getValue();
        setValue(getValue());
        setValue(r0);
        a01 r1 = a01.OXO1;
        r1.iO().put(b01.OXii10I + '_' + LanguageTranslationData.class.getName(), new Gson().toJson(getValue()), false);
        r1.iO().put(b01.I011X + '_' + LanguageTranslationData.class.getName(), new Gson().toJson(getValue()), false);
    }

    public final void pageLanguageSideUpdate(@tb1 LanguageTranslationData r7, int r8) {
        if (r7 == null) goto L5;
        I100X1.O00(ViewModelKt.getViewModelScope(this), IXOX0Xiii.iO(), null, new C34911(r8, this, r7, null), 2, null);
        return;
    }

    public final void playAiMessageAudioPath(@aa1 String r2) {
        Intrinsics.X0O(r2, "path");
        this.useCase.X1ii(r2);
    }

    public final void saveAllDataAndExit() {
        this.useCase.XX0();
    }

    public final void setCurrentAudioDeviceType(boolean r2) {
        if (r2 == false) goto L4;
        int r0 = 1;
    L5:
        this.deviceType = r0;
        changeAsrLanguages(r2);
        return;
    L4:
        r0 = 2;
        goto L5
    }

    public final void startOrStopRecord() {
        if (getValue().booleanValue() == false) goto L6;
        stopRecordAndTranslate();
        return;
    L6:
        startRecordAndTranslate();
    }
}
