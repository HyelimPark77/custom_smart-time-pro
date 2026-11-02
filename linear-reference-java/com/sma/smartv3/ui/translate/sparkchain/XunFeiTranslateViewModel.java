package com.sma.smartv3.ui.translate.sparkchain;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.android.mltcode.paycertificationapi.I100X1;
import com.android.mltcode.paycertificationapi.IXOX0Xiii;
import com.android.mltcode.paycertificationapi.IXiXI;
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
import com.android.mltcode.paycertificationapi.pb;
import com.android.mltcode.paycertificationapi.q87;
import com.android.mltcode.paycertificationapi.r87;
import com.android.mltcode.paycertificationapi.s87;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.ty0;
import com.blankj.utilcode.util.SPUtils;
import com.google.gson.Gson;
import com.sma.smartv3.db.entity.AIRecords;
import com.sma.smartv3.model.LanguageTranslationData;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
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

    /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.sparkchain.XunFeiTranslateViewModel$1, reason: invalid class name */
    @DebugMetadata(c = "com.sma.smartv3.ui.translate.sparkchain.XunFeiTranslateViewModel$1", f = "SparkChainTranslateViewModel.kt", i = {}, l = {52}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    @SourceDebugExtension({"SMAP\nSparkChainTranslateViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparkChainTranslateViewModel.kt\ncom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel$1\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,170:1\n17#2:171\n19#2:175\n46#3:172\n51#3:174\n105#4:173\n*S KotlinDebug\n*F\n+ 1 SparkChainTranslateViewModel.kt\ncom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel$1\n*L\n51#1:171\n51#1:175\n51#1:172\n51#1:174\n51#1:173\n*E\n"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ XunFeiTranslateViewModel this$0;

        /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.sparkchain.XunFeiTranslateViewModel$1$OXO1 */
        public static final class OXO1<T> implements IXiXI {
            public final /* synthetic */ XunFeiTranslateViewModel IO;

            public OXO1(XunFeiTranslateViewModel r1) {
                this.IO = r1;
            }

            public static final Unit IiI10X(String r1, String r2, AIRecords r3) {
                Intrinsics.X0O(r3, "$this$updateAiRecord");
                r3.setMContent(r1);
                r3.setMExtraInfo(r2);
                return Unit.OXO1;
            }

            public static /* synthetic */ Unit OXO1(String r0, String r1, AIRecords r2) {
                return IiI10X(r0, r1, r2);
            }

            public final Object O00(mq4 r15, Continuation<? super Unit> r16) {
                mq4 r0 = (mq4) XunFeiTranslateViewModel.access$get_displayFlow$p(this.IO).getValue();
                String r1 = r0.OIi0();
                String r2 = r15.OIi0();
                String r3 = "";
                if (r2 != null) goto L5;
                r2 = "";
            L5:
                final String r7 = r1 + r2;
                String r4 = r0.X1ii();
                String r5 = r15.X1ii();
                if (r5 == null) goto L9;
                r3 = r5;
            L9:
                final String r10 = r4 + r3;
                XunFeiTranslateViewModel.access$get_displayFlow$p(this.IO).setValue(new mq4(null, r7, r15.OIX0iXi(), null, r10, null, 41, null));
                Object r17 = XunFeiTranslateViewModel.access$getUseCase$p(this.IO).iOOX010X(new q87(r7, r10), r16);
                if (r17 != pb.I0iXXO()) goto L13;
                return r17;
            L13:
                return Unit.OXO1;
            }

            @Override // com.android.mltcode.paycertificationapi.IXiXI
            public /* bridge */ /* synthetic */ Object emit(Object r1, Continuation r2) {
                return O00((mq4) r1, r2);
            }
        }

        public AnonymousClass1(XunFeiTranslateViewModel r1, Continuation<? super AnonymousClass1> r2) {
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
            final l94<mq4> r6 = XunFeiTranslateViewModel.access$getUseCase$p(this.this$0).I1XOi1();
            ii0iIIX0<mq4> r2 = new XunFeiTranslateViewModel$1$invokeSuspend$$inlined$filter$1(r6);
            OXO1 r7 = new OXO1(this.this$0);
            this.label = 1;
            if (r2.collect(r7, this) != r0) goto L12;
            return r0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
            return invoke2(r1, r2);
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.sparkchain.XunFeiTranslateViewModel$changeRecordStatus$1, reason: invalid class name and case insensitive filesystem */
    @DebugMetadata(c = "com.sma.smartv3.ui.translate.sparkchain.XunFeiTranslateViewModel$changeRecordStatus$1", f = "SparkChainTranslateViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class C34951 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ XunFeiTranslateViewModel this$0;

        public C34951(XunFeiTranslateViewModel r1, Continuation<? super C34951> r2) {
            this.this$0 = r1;
            super(2, r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r2, Continuation<?> r3) {
            return new C34951(this.this$0, r3);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
            return ((C34951) create(r1, r2)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r5) {
            pb.I0iXXO();
            if (this.label != 0) goto L10;
            ResultKt.X1ii(r5);
            boolean r6 = XunFeiTranslateViewModel.access$getUseCase$p(this.this$0).X0O().getValue().booleanValue();
            i1O0OXO1O r0 = i1O0OXO1O.OXO1;
            String r1 = XunFeiTranslateViewModel.access$getTAG$p(this.this$0);
            StringBuilder r3 = new StringBuilder();
            r3.append(r1);
            r3.append(" changeRecordStatus isStartRecord:");
            r3.append(!r6);
            r0.OXO1(r3.toString());
            if (r6 == true) goto L7;
            ((LanguageTranslationData) XunFeiTranslateViewModel.access$get_leftLanguageFlow$p(this.this$0).getValue()).getTtsViuceName();
        L7:
            XunFeiTranslateViewModel.access$getUseCase$p(this.this$0).I1();
            return Unit.OXO1;
        L10:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
            return invoke2(r1, r2);
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.sparkchain.XunFeiTranslateViewModel$initLanguages$1, reason: invalid class name and case insensitive filesystem */
    @DebugMetadata(c = "com.sma.smartv3.ui.translate.sparkchain.XunFeiTranslateViewModel$initLanguages$1", f = "SparkChainTranslateViewModel.kt", i = {0, 0, 1, 1}, l = {82, 83}, m = "invokeSuspend", n = {"mLeftLanguage", "mRightLanguage", "mLeftLanguage", "mRightLanguage"}, s = {"L$0", "L$1", "L$0", "L$1"}, v = 1)
    @SourceDebugExtension({"SMAP\nSparkChainTranslateViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparkChainTranslateViewModel.kt\ncom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel$initLanguages$1\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,170:1\n90#2:171\n90#2:172\n*S KotlinDebug\n*F\n+ 1 SparkChainTranslateViewModel.kt\ncom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel$initLanguages$1\n*L\n75#1:171\n79#1:172\n*E\n"})
    public static final class C34961 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ XunFeiTranslateViewModel this$0;

        public C34961(XunFeiTranslateViewModel r1, Continuation<? super C34961> r2) {
            this.this$0 = r1;
            super(2, r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r2, Continuation<?> r3) {
            return new C34961(this.this$0, r3);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
            return ((C34961) create(r1, r2)).invokeSuspend(Unit.OXO1);
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
            ty0 r11 = XunFeiTranslateViewModel.access$get_rightLanguageFlow$p(this.this$0);
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
            ty0 r8 = XunFeiTranslateViewModel.access$get_leftLanguageFlow$p(this.this$0);
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

    /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.sparkchain.XunFeiTranslateViewModel$languageUpdate$1, reason: invalid class name and case insensitive filesystem */
    @DebugMetadata(c = "com.sma.smartv3.ui.translate.sparkchain.XunFeiTranslateViewModel$languageUpdate$1", f = "SparkChainTranslateViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class C34971 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ XunFeiTranslateViewModel this$0;

        /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.sparkchain.XunFeiTranslateViewModel$languageUpdate$1$1, reason: invalid class name and collision with other inner class name */
        @DebugMetadata(c = "com.sma.smartv3.ui.translate.sparkchain.XunFeiTranslateViewModel$languageUpdate$1$1", f = "SparkChainTranslateViewModel.kt", i = {}, l = {88}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        public static final class C05781 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ XunFeiTranslateViewModel this$0;

            /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.sparkchain.XunFeiTranslateViewModel$languageUpdate$1$1$OXO1 */
            public static final class OXO1<T> implements IXiXI {
                public final /* synthetic */ XunFeiTranslateViewModel IO;

                public OXO1(XunFeiTranslateViewModel r1) {
                    this.IO = r1;
                }

                private static final Unit IiI10X(LanguageTranslationData r1, XO0O10 r2) {
                    Intrinsics.X0O(r2, "$this$updateTranslatorConfig");
                    r2.I1(r1.getRtasrLanguage());
                    r2.OX(r1.getTtsViuceName());
                    return Unit.OXO1;
                }

                public static /* synthetic */ Unit OXO1(LanguageTranslationData r0, XO0O10 r1) {
                    return IiI10X(r0, r1);
                }

                public final Object O00(final LanguageTranslationData r2, Continuation<? super Unit> r3) {
                    XunFeiTranslateViewModel.access$getUseCase$p(this.IO).II1Xi0(new r87(r2));
                    return Unit.OXO1;
                }

                @Override // com.android.mltcode.paycertificationapi.IXiXI
                public /* bridge */ /* synthetic */ Object emit(Object r1, Continuation r2) {
                    return O00((LanguageTranslationData) r1, r2);
                }
            }

            public C05781(XunFeiTranslateViewModel r1, Continuation<? super C05781> r2) {
                this.this$0 = r1;
                super(2, r2);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation<Unit> create(Object r2, Continuation<?> r3) {
                return new C05781(this.this$0, r3);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
                return ((C05781) create(r1, r2)).invokeSuspend(Unit.OXO1);
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

        /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.sparkchain.XunFeiTranslateViewModel$languageUpdate$1$2, reason: invalid class name */
        @DebugMetadata(c = "com.sma.smartv3.ui.translate.sparkchain.XunFeiTranslateViewModel$languageUpdate$1$2", f = "SparkChainTranslateViewModel.kt", i = {}, l = {96}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        public static final class AnonymousClass2 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ XunFeiTranslateViewModel this$0;

            /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.sparkchain.XunFeiTranslateViewModel$languageUpdate$1$2$OXO1 */
            public static final class OXO1<T> implements IXiXI {
                public final /* synthetic */ XunFeiTranslateViewModel IO;

                public OXO1(XunFeiTranslateViewModel r1) {
                    this.IO = r1;
                }

                private static final Unit IiI10X(LanguageTranslationData r1, XO0O10 r2) {
                    Intrinsics.X0O(r2, "$this$updateTranslatorConfig");
                    r2.OII(r1.getRtasrLanguage());
                    return Unit.OXO1;
                }

                public static /* synthetic */ Unit OXO1(LanguageTranslationData r0, XO0O10 r1) {
                    return IiI10X(r0, r1);
                }

                public final Object O00(final LanguageTranslationData r2, Continuation<? super Unit> r3) {
                    XunFeiTranslateViewModel.access$getUseCase$p(this.IO).II1Xi0(new s87(r2));
                    return Unit.OXO1;
                }

                @Override // com.android.mltcode.paycertificationapi.IXiXI
                public /* bridge */ /* synthetic */ Object emit(Object r1, Continuation r2) {
                    return O00((LanguageTranslationData) r1, r2);
                }
            }

            public AnonymousClass2(XunFeiTranslateViewModel r1, Continuation<? super AnonymousClass2> r2) {
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

        public C34971(XunFeiTranslateViewModel r1, Continuation<? super C34971> r2) {
            this.this$0 = r1;
            super(2, r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
            C34971 r0 = new C34971(this.this$0, r4);
            r0.L$0 = r3;
            return r0;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
            return ((C34971) create(r1, r2)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r8) {
            i00OIXiO r1 = (i00OIXiO) this.L$0;
            pb.I0iXXO();
            if (this.label != 0) goto L7;
            ResultKt.X1ii(r8);
            I100X1.O00(r1, null, null, new C05781(this.this$0, null), 3, null);
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

    /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.sparkchain.XunFeiTranslateViewModel$pageExchangeLeftAndRightLanguage$1, reason: invalid class name and case insensitive filesystem */
    @DebugMetadata(c = "com.sma.smartv3.ui.translate.sparkchain.XunFeiTranslateViewModel$pageExchangeLeftAndRightLanguage$1", f = "SparkChainTranslateViewModel.kt", i = {0}, l = {119}, m = "invokeSuspend", n = {"mCacheLanguage"}, s = {"L$0"}, v = 1)
    @SourceDebugExtension({"SMAP\nSparkChainTranslateViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparkChainTranslateViewModel.kt\ncom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel$pageExchangeLeftAndRightLanguage$1\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,170:1\n85#2,3:171\n85#2,3:174\n*S KotlinDebug\n*F\n+ 1 SparkChainTranslateViewModel.kt\ncom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel$pageExchangeLeftAndRightLanguage$1\n*L\n120#1:171,3\n121#1:174,3\n*E\n"})
    public static final class C34981 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        Object L$0;
        int label;
        final /* synthetic */ XunFeiTranslateViewModel this$0;

        public C34981(XunFeiTranslateViewModel r1, Continuation<? super C34981> r2) {
            this.this$0 = r1;
            super(2, r2);
        }

        public static /* synthetic */ Unit O00(XunFeiTranslateViewModel r0, AIRecords r1) {
            return invokeSuspend$lambda$0(r0, r1);
        }

        private static final Unit invokeSuspend$lambda$0(XunFeiTranslateViewModel r1, AIRecords r2) {
            r2.setMTranslateLanguage(((LanguageTranslationData) XunFeiTranslateViewModel.access$get_rightLanguageFlow$p(r1).getValue()).getTtsViuceName());
            r2.setMTranslateToLanguage(((LanguageTranslationData) XunFeiTranslateViewModel.access$get_leftLanguageFlow$p(r1).getValue()).getTtsViuceName());
            return Unit.OXO1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r2, Continuation<?> r3) {
            return new C34981(this.this$0, r3);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
            return ((C34981) create(r1, r2)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r7) {
            Object r0 = pb.I0iXXO();
            int r1 = this.label;
            if (r1 == 0) goto L8;
            if (r1 != 1) goto L7;
            LanguageTranslationData r2 = (LanguageTranslationData) this.L$0;
            ResultKt.X1ii(r7);
        L11:
            a01 r8 = a01.OXO1;
            r8.iO().put(b01.OXii10I + '_' + LanguageTranslationData.class.getName(), new Gson().toJson(XunFeiTranslateViewModel.access$get_leftLanguageFlow$p(this.this$0).getValue()), false);
            r8.iO().put(b01.I011X + '_' + LanguageTranslationData.class.getName(), new Gson().toJson(XunFeiTranslateViewModel.access$get_rightLanguageFlow$p(this.this$0).getValue()), false);
            return Unit.OXO1;
        L7:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        L8:
            ResultKt.X1ii(r7);
            LanguageTranslationData r9 = (LanguageTranslationData) XunFeiTranslateViewModel.access$get_leftLanguageFlow$p(this.this$0).getValue();
            XunFeiTranslateViewModel.access$get_leftLanguageFlow$p(this.this$0).setValue(XunFeiTranslateViewModel.access$get_rightLanguageFlow$p(this.this$0).getValue());
            XunFeiTranslateViewModel.access$get_rightLanguageFlow$p(this.this$0).setValue(r9);
            LocalSparkChainTranslateUseCase r3 = XunFeiTranslateViewModel.access$getUseCase$p(this.this$0);
            final XunFeiTranslateViewModel r4 = this.this$0;
            Function1<? super AIRecords, Unit> r5 = new IiI10X(r4);
            this.L$0 = SpillingKt.OXO1(r9);
            this.label = 1;
            if (r3.iOOX010X(r5, this) != r0) goto L11;
            return r0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
            return invoke2(r1, r2);
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.sparkchain.XunFeiTranslateViewModel$pageLanguageSideUpdate$1, reason: invalid class name and case insensitive filesystem */
    @DebugMetadata(c = "com.sma.smartv3.ui.translate.sparkchain.XunFeiTranslateViewModel$pageLanguageSideUpdate$1", f = "SparkChainTranslateViewModel.kt", i = {}, l = {131, 135}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    @SourceDebugExtension({"SMAP\nSparkChainTranslateViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparkChainTranslateViewModel.kt\ncom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel$pageLanguageSideUpdate$1\n+ 2 SPUtils.kt\ncom/bestmafen/androidbase/extension/SPUtilsKt\n*L\n1#1,170:1\n85#2,3:171\n85#2,3:174\n*S KotlinDebug\n*F\n+ 1 SparkChainTranslateViewModel.kt\ncom/sma/smartv3/ui/translate/sparkchain/XunFeiTranslateViewModel$pageLanguageSideUpdate$1\n*L\n132#1:171,3\n136#1:174,3\n*E\n"})
    public static final class C34991 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        final /* synthetic */ int $key;
        final /* synthetic */ LanguageTranslationData $mLanguage;
        int label;
        final /* synthetic */ XunFeiTranslateViewModel this$0;

        public C34991(int r1, XunFeiTranslateViewModel r2, LanguageTranslationData r3, Continuation<? super C34991> r4) {
            this.$key = r1;
            this.this$0 = r2;
            this.$mLanguage = r3;
            super(2, r4);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r4, Continuation<?> r5) {
            return new C34991(this.$key, this.this$0, this.$mLanguage, r5);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
            return ((C34991) create(r1, r2)).invokeSuspend(Unit.OXO1);
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
            ty0 r10 = XunFeiTranslateViewModel.access$get_rightLanguageFlow$p(this.this$0);
            LanguageTranslationData r2 = this.$mLanguage;
            this.label = 2;
            if (r10.emit(r2, this) != r0) goto L21;
        L20:
            return r0;
        L10:
            ResultKt.X1ii(r9);
            if (this.$key != 1) goto L17;
            ty0 r11 = XunFeiTranslateViewModel.access$get_leftLanguageFlow$p(this.this$0);
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

    public XunFeiTranslateViewModel(@aa1 LocalSparkChainTranslateUseCase r13) {
        Intrinsics.X0O(r13, "useCase");
        this.useCase = r13;
        this.TAG = "XunFeiTranslateViewModel";
        this.mLanguageTranslationList = r13.O10IXXX0X();
        ty0<LanguageTranslationData> r0 = l85.OXO1(new LanguageTranslationData("中文", null, null, null, false, 0, null, 0, 254, null));
        this._leftLanguageFlow = r0;
        this.pageLeftLanguageFlow = iX0XiO.XXI(r0);
        ty0<LanguageTranslationData> r1 = l85.OXO1(new LanguageTranslationData("中文", null, null, null, false, 0, null, 0, 254, null));
        this._rightLanguageFlow = r1;
        this.pageRightLanguageFlow = iX0XiO.XXI(r1);
        this.recordingAndTranslatingFlow = r13.X0O();
        this.isRecording = r13.iIiiO();
        ty0<Boolean> r14 = l85.OXO1(Boolean.TRUE);
        this._audioPlayFlag = r14;
        this.audioPlay = iX0XiO.XXI(r14);
        int r7 = 59;
        Integer r2 = null;
        String r3 = null;
        String r4 = "-10086";
        Integer r6 = null;
        ty0<mq4> r15 = l85.OXO1(new mq4(r2, r3, r4, null, null, r6, r7, null));
        this._displayFlow = r15;
        this.displayFlow = r15;
        languageUpdate();
        initLanguages();
        I100X1.O00(ViewModelKt.getViewModelScope(this), IXOX0Xiii.iO(), null, new AnonymousClass1(this, null), 2, null);
    }

    public static final /* synthetic */ String access$getTAG$p(XunFeiTranslateViewModel r0) {
        return r0.TAG;
    }

    public static final /* synthetic */ LocalSparkChainTranslateUseCase access$getUseCase$p(XunFeiTranslateViewModel r0) {
        return r0.useCase;
    }

    public static final /* synthetic */ ty0 access$get_displayFlow$p(XunFeiTranslateViewModel r0) {
        return r0._displayFlow;
    }

    public static final /* synthetic */ ty0 access$get_leftLanguageFlow$p(XunFeiTranslateViewModel r0) {
        return r0._leftLanguageFlow;
    }

    public static final /* synthetic */ ty0 access$get_rightLanguageFlow$p(XunFeiTranslateViewModel r0) {
        return r0._rightLanguageFlow;
    }

    private final XiOIO initLanguages() {
        return I100X1.O00(ViewModelKt.getViewModelScope(this), IXOX0Xiii.iO(), null, new C34961(this, null), 2, null);
    }

    public static /* synthetic */ boolean isEqualOtherLanguage$default(XunFeiTranslateViewModel r0, LanguageTranslationData r1, boolean r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L6;
        r2 = true;
    L6:
        return r0.isEqualOtherLanguage(r1, r2);
    }

    public static /* synthetic */ void pageLanguageSideUpdate$default(XunFeiTranslateViewModel r0, LanguageTranslationData r1, int r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = 1;
    L5:
        r0.pageLanguageSideUpdate(r1, r2);
    }

    @aa1
    public final XiOIO changeRecordStatus() {
        return I100X1.O00(ViewModelKt.getViewModelScope(this), IXOX0Xiii.iO(), null, new C34951(this, null), 2, null);
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

    @aa1
    public final k85<Boolean> isRecording() {
        return this.isRecording;
    }

    @aa1
    public final XiOIO languageUpdate() {
        return I100X1.O00(ViewModelKt.getViewModelScope(this), IXOX0Xiii.iO(), null, new C34971(this, null), 2, null);
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        this.useCase.IO();
    }

    @aa1
    public final XiOIO pageExchangeLeftAndRightLanguage() {
        return I100X1.O00(ViewModelKt.getViewModelScope(this), IXOX0Xiii.iO(), null, new C34981(this, null), 2, null);
    }

    public final void pageLanguageSideUpdate(@tb1 LanguageTranslationData r7, int r8) {
        if (r7 == null) goto L5;
        I100X1.O00(ViewModelKt.getViewModelScope(this), IXOX0Xiii.iO(), null, new C34991(r8, this, r7, null), 2, null);
        return;
    }

    public final void ttsAndPlayUpdate() {
        this.useCase.X01IiOiIi(true);
    }
}
