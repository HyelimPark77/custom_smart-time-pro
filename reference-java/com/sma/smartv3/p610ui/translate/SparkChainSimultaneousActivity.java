package com.sma.smartv3.p610ui.translate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.XX01Oi;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.bs1;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.mq4;
import com.android.mltcode.paycertificationapi.oh6;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.zv6;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.ToastUtils;
import com.sma.smartv3.model.AIFunctionType;
import com.sma.smartv3.model.LanguageTranslationData;
import com.sma.smartv3.otherdevice.charge.ChooseLanguageActivity;
import com.sma.smartv3.p610ui.ai_note.AiNoteActivity;
import com.sma.smartv3.p610ui.translate.SparkChainSimultaneousActivity;
import com.sma.smartv3.p610ui.translate.sparkchain.SparkChainTranslateViewModelFactory;
import com.sma.smartv3.p610ui.translate.sparkchain.XunFeiTranslateViewModel;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.util.ActivityUtilKt;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.BleKeyFlag;
import com.szabh.smable3.component.BaseBleConnector;
import com.szabh.smable3.component.BleConnector;
import com.szabh.smable3.entity.BleVoice;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.XiOIO;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nSparkChainSimultaneousActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparkChainSimultaneousActivity.kt\ncom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,232:1\n87#2,7:233\n94#2,3:241\n70#2,7:244\n97#2:251\n173#2,7:252\n180#2,3:260\n143#2,7:263\n183#2:270\n173#2,7:271\n180#2,3:279\n143#2,7:282\n183#2:289\n1#3:240\n1#3:259\n1#3:278\n*S KotlinDebug\n*F\n+ 1 SparkChainSimultaneousActivity.kt\ncom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity\n*L\n116#1:233,7\n116#1:241,3\n116#1:244,7\n116#1:251\n143#1:252,7\n143#1:260,3\n143#1:263,7\n143#1:270\n158#1:271,7\n158#1:279,3\n158#1:282,7\n158#1:289\n116#1:240\n143#1:259\n158#1:278\n*E\n"})
public final class SparkChainSimultaneousActivity extends BaseActivity {

    @tb1
    private XiOIO loadingJob;
    private boolean rotateAnimationSwitching;

    @aa1
    private final Lazy originTextTv$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.yq4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SparkChainSimultaneousActivity.originTextTv_delegate$lambda$0(this.f12429IO);
        }
    });

    @aa1
    private final Lazy translateTv$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.zq4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SparkChainSimultaneousActivity.translateTv_delegate$lambda$0(this.f12674IO);
        }
    });

    @aa1
    private final Lazy recordIv$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ar4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SparkChainSimultaneousActivity.recordIv_delegate$lambda$0(this.f5548IO);
        }
    });

    @aa1
    private final Lazy abhTitleRight$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.br4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SparkChainSimultaneousActivity.abhTitleRight_delegate$lambda$0(this.f5798IO);
        }
    });

    @aa1
    private final Lazy transformLanguageImg$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.oq4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SparkChainSimultaneousActivity.transformLanguageImg_delegate$lambda$0(this.f10198IO);
        }
    });

    @aa1
    private final Lazy dialogueTranslationLeftTv$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.pq4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SparkChainSimultaneousActivity.dialogueTranslationLeftTv_delegate$lambda$0(this.f10422IO);
        }
    });

    @aa1
    private final Lazy dialogueTranslationRightTv$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.qq4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SparkChainSimultaneousActivity.dialogueTranslationRightTv_delegate$lambda$0(this.f10657IO);
        }
    });

    @aa1
    private final Lazy factory$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.rq4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SparkChainSimultaneousActivity.factory_delegate$lambda$0(this.f10876IO);
        }
    });

    @aa1
    private final Lazy viewModel$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.sq4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SparkChainSimultaneousActivity.viewModel_delegate$lambda$0(this.f11107IO);
        }
    });

    /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.SparkChainSimultaneousActivity$collectData$1 */
    @DebugMetadata(m39465c = "com.sma.smartv3.ui.translate.SparkChainSimultaneousActivity$collectData$1", m39466f = "SparkChainSimultaneousActivity.kt", m39467i = {}, m39468l = {}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
    public static final class C190051 extends SuspendLambda implements Function2<LanguageTranslationData, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C190051(Continuation<? super C190051> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C190051 c190051 = SparkChainSimultaneousActivity.this.new C190051(continuation);
            c190051.L$0 = obj;
            return c190051;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(LanguageTranslationData languageTranslationData, Continuation<? super Unit> continuation) {
            return ((C190051) create(languageTranslationData, continuation)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            LanguageTranslationData languageTranslationData = (LanguageTranslationData) this.L$0;
            C2798pb.I0iXXO();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.X1ii(obj);
            SparkChainSimultaneousActivity.this.getDialogueTranslationLeftTv().setText(languageTranslationData.getName());
            return Unit.OXO1;
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.SparkChainSimultaneousActivity$collectData$2 */
    @DebugMetadata(m39465c = "com.sma.smartv3.ui.translate.SparkChainSimultaneousActivity$collectData$2", m39466f = "SparkChainSimultaneousActivity.kt", m39467i = {}, m39468l = {}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
    public static final class C190022 extends SuspendLambda implements Function2<LanguageTranslationData, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C190022(Continuation<? super C190022> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C190022 c190022 = SparkChainSimultaneousActivity.this.new C190022(continuation);
            c190022.L$0 = obj;
            return c190022;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(LanguageTranslationData languageTranslationData, Continuation<? super Unit> continuation) {
            return ((C190022) create(languageTranslationData, continuation)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            LanguageTranslationData languageTranslationData = (LanguageTranslationData) this.L$0;
            C2798pb.I0iXXO();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.X1ii(obj);
            SparkChainSimultaneousActivity.this.getDialogueTranslationRightTv().setText(languageTranslationData.getName());
            return Unit.OXO1;
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.SparkChainSimultaneousActivity$collectData$3 */
    @DebugMetadata(m39465c = "com.sma.smartv3.ui.translate.SparkChainSimultaneousActivity$collectData$3", m39466f = "SparkChainSimultaneousActivity.kt", m39467i = {}, m39468l = {}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
    public static final class C190033 extends SuspendLambda implements Function2<mq4, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C190033(Continuation<? super C190033> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C190033 c190033 = SparkChainSimultaneousActivity.this.new C190033(continuation);
            c190033.L$0 = obj;
            return c190033;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(mq4 mq4Var, Continuation<? super Unit> continuation) {
            return ((C190033) create(mq4Var, continuation)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            mq4 mq4Var = (mq4) this.L$0;
            C2798pb.I0iXXO();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.X1ii(obj);
            SparkChainSimultaneousActivity.this.getOriginTextTv().setText(mq4Var.OIi0());
            SparkChainSimultaneousActivity.this.getTranslateTv().setText(mq4Var.X1ii());
            SparkChainSimultaneousActivity.this.sendMsgToDevice(mq4Var.OIi0(), mq4Var.X1ii());
            return Unit.OXO1;
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.SparkChainSimultaneousActivity$collectData$4 */
    @DebugMetadata(m39465c = "com.sma.smartv3.ui.translate.SparkChainSimultaneousActivity$collectData$4", m39466f = "SparkChainSimultaneousActivity.kt", m39467i = {}, m39468l = {}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
    public static final class C190044 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        /* synthetic */ boolean Z$0;
        int label;

        public C190044(Continuation<? super C190044> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C190044 c190044 = SparkChainSimultaneousActivity.this.new C190044(continuation);
            c190044.Z$0 = ((Boolean) obj).booleanValue();
            return c190044;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Object invoke2(Boolean bool, Continuation<? super Unit> continuation) {
            return invoke(bool.booleanValue(), continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z = this.Z$0;
            C2798pb.I0iXXO();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.X1ii(obj);
            if (z) {
                SparkChainSimultaneousActivity.this.getRecordIv().setImageResource(R.drawable.ic_binaural_stop);
            } else {
                SparkChainSimultaneousActivity.this.getRecordIv().setImageResource(R.drawable.ic_binaural_start);
            }
            return Unit.OXO1;
        }

        public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
            return ((C190044) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.OXO1);
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.SparkChainSimultaneousActivity$startRotateAnimation$1, reason: case insensitive filesystem */
    @DebugMetadata(m39465c = "com.sma.smartv3.ui.translate.SparkChainSimultaneousActivity$startRotateAnimation$1", m39466f = "SparkChainSimultaneousActivity.kt", m39467i = {}, m39468l = {183}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
    public static final class C290211 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        final /* synthetic */ RotateAnimation $rotateAnimation;
        int label;
        final /* synthetic */ SparkChainSimultaneousActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C290211(RotateAnimation rotateAnimation, SparkChainSimultaneousActivity sparkChainSimultaneousActivity, Continuation<? super C290211> continuation) {
            super(2, continuation);
            this.$rotateAnimation = rotateAnimation;
            this.this$0 = sparkChainSimultaneousActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C290211(this.$rotateAnimation, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
            return ((C290211) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objI0iXXO = C2798pb.I0iXXO();
            int i = this.label;
            if (i == 0) {
                ResultKt.X1ii(obj);
                this.label = 1;
                if (DelayKt.XIi00iiXO(500L, this) == objI0iXXO) {
                    return objI0iXXO;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.X1ii(obj);
            }
            this.$rotateAnimation.cancel();
            this.this$0.getTransformLanguageImg().clearAnimation();
            this.this$0.rotateAnimationSwitching = false;
            return Unit.OXO1;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView abhTitleRight_delegate$lambda$0(SparkChainSimultaneousActivity sparkChainSimultaneousActivity) {
        return (ImageView) sparkChainSimultaneousActivity.findViewById(R.id.abh_title_right);
    }

    private final void collectData() {
        ActivityUtilKt.XIi00iiXO(this, getViewModel().getPageLeftLanguageFlow(), null, new C190051(null), 2, null);
        ActivityUtilKt.XIi00iiXO(this, getViewModel().getPageRightLanguageFlow(), null, new C190022(null), 2, null);
        ActivityUtilKt.XIi00iiXO(this, getViewModel().getDisplayFlow(), null, new C190033(null), 2, null);
        ActivityUtilKt.XIi00iiXO(this, getViewModel().getRecordingAndTranslatingFlow(), null, new C190044(null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView dialogueTranslationLeftTv_delegate$lambda$0(SparkChainSimultaneousActivity sparkChainSimultaneousActivity) {
        return (TextView) sparkChainSimultaneousActivity.findViewById(R.id.dialogue_translation_left_tv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView dialogueTranslationRightTv_delegate$lambda$0(SparkChainSimultaneousActivity sparkChainSimultaneousActivity) {
        return (TextView) sparkChainSimultaneousActivity.findViewById(R.id.dialogue_translation_right_tv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SparkChainTranslateViewModelFactory factory_delegate$lambda$0(SparkChainSimultaneousActivity sparkChainSimultaneousActivity) {
        return new SparkChainTranslateViewModelFactory(zv6.OXO1.X1ii(LifecycleOwnerKt.getLifecycleScope(sparkChainSimultaneousActivity)));
    }

    private final ImageView getAbhTitleRight() {
        return (ImageView) this.abhTitleRight$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextView getDialogueTranslationLeftTv() {
        return (TextView) this.dialogueTranslationLeftTv$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextView getDialogueTranslationRightTv() {
        return (TextView) this.dialogueTranslationRightTv$delegate.getValue();
    }

    private final SparkChainTranslateViewModelFactory getFactory() {
        return (SparkChainTranslateViewModelFactory) this.factory$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextView getOriginTextTv() {
        return (TextView) this.originTextTv$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ImageView getRecordIv() {
        return (ImageView) this.recordIv$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ImageView getTransformLanguageImg() {
        return (ImageView) this.transformLanguageImg$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextView getTranslateTv() {
        return (TextView) this.translateTv$delegate.getValue();
    }

    private final XunFeiTranslateViewModel getViewModel() {
        return (XunFeiTranslateViewModel) this.viewModel$delegate.getValue();
    }

    private final void initListener() {
        q62 q62Var = q62.OXO1;
        if (q62.OiO0IOX(q62Var, null, 1, null) || q62Var.X0100I()) {
            getAbhTitleRight().setVisibility(0);
        }
        getAbhTitleRight().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.tq4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SparkChainSimultaneousActivity.initListener$lambda$0(this.f11336IO, view);
            }
        });
        ImageView recordIv = getRecordIv();
        Intrinsics.O10IXXX0X(recordIv, "<get-recordIv>(...)");
        oh6.XO0O10(recordIv, 0L, new Function1() { // from class: com.android.mltcode.paycertificationapi.uq4
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SparkChainSimultaneousActivity.initListener$lambda$1(this.f11548IO, (View) obj);
            }
        }, 1, null);
        getTransformLanguageImg().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.vq4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SparkChainSimultaneousActivity.initListener$lambda$2(this.f11789IO, view);
            }
        });
        getDialogueTranslationLeftTv().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.wq4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SparkChainSimultaneousActivity.initListener$lambda$3(this.f12018IO, view);
            }
        });
        getDialogueTranslationRightTv().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.xq4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SparkChainSimultaneousActivity.initListener$lambda$4(this.f12218IO, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListener$lambda$0(SparkChainSimultaneousActivity sparkChainSimultaneousActivity, View view) {
        int type = AIFunctionType.SIMULTANEOUS_INTERPRETATION.getType();
        Bundle bundle = new Bundle();
        bundle.putString("mArg0", null);
        bundle.putInt("mArg1", type);
        bundle.putParcelable("mArg2", null);
        bundle.putSerializable("mArg3", null);
        Intent intent = new Intent(sparkChainSimultaneousActivity, (Class<?>) AiNoteActivity.class);
        intent.putExtras(bundle);
        sparkChainSimultaneousActivity.startActivity(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initListener$lambda$1(final SparkChainSimultaneousActivity sparkChainSimultaneousActivity, View it) {
        Intrinsics.X0O(it, "it");
        bs1.OXO1.XIi00iiXO(new String[]{"android.permission.RECORD_AUDIO", "android.permission.MODIFY_AUDIO_SETTINGS"}, new Function0() { // from class: com.android.mltcode.paycertificationapi.nq4
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return SparkChainSimultaneousActivity.initListener$lambda$1$0(this.f9997IO);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initListener$lambda$1$0(SparkChainSimultaneousActivity sparkChainSimultaneousActivity) {
        sparkChainSimultaneousActivity.getViewModel().changeRecordStatus();
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListener$lambda$2(SparkChainSimultaneousActivity sparkChainSimultaneousActivity, View view) {
        if (sparkChainSimultaneousActivity.getViewModel().getRecordingAndTranslatingFlow().getValue().booleanValue()) {
            ToastUtils.showLong(sparkChainSimultaneousActivity.getString(R.string.recording_tip), new Object[0]);
        } else {
            sparkChainSimultaneousActivity.startRotateAnimation();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListener$lambda$3(SparkChainSimultaneousActivity sparkChainSimultaneousActivity, View view) {
        if (sparkChainSimultaneousActivity.getViewModel().getRecordingAndTranslatingFlow().getValue().booleanValue()) {
            ToastUtils.showLong(sparkChainSimultaneousActivity.getString(R.string.recording_tip), new Object[0]);
            return;
        }
        LanguageTranslationData value = sparkChainSimultaneousActivity.getViewModel().getPageLeftLanguageFlow().getValue();
        Bundle bundle = new Bundle();
        bundle.putString("mArg0", null);
        bundle.putInt("mArg1", 3);
        bundle.putParcelable("mArg2", null);
        bundle.putSerializable("mArg3", value);
        Intent intent = new Intent(sparkChainSimultaneousActivity, (Class<?>) ChooseLanguageActivity.class);
        intent.putExtras(bundle);
        sparkChainSimultaneousActivity.startActivityForResult(intent, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListener$lambda$4(SparkChainSimultaneousActivity sparkChainSimultaneousActivity, View view) {
        if (sparkChainSimultaneousActivity.getViewModel().getRecordingAndTranslatingFlow().getValue().booleanValue()) {
            ToastUtils.showLong(sparkChainSimultaneousActivity.getString(R.string.recording_tip), new Object[0]);
            return;
        }
        LanguageTranslationData value = sparkChainSimultaneousActivity.getViewModel().getPageRightLanguageFlow().getValue();
        Bundle bundle = new Bundle();
        bundle.putString("mArg0", null);
        bundle.putInt("mArg1", 3);
        bundle.putParcelable("mArg2", null);
        bundle.putSerializable("mArg3", value);
        Intent intent = new Intent(sparkChainSimultaneousActivity, (Class<?>) ChooseLanguageActivity.class);
        intent.putExtras(bundle);
        sparkChainSimultaneousActivity.startActivityForResult(intent, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView originTextTv_delegate$lambda$0(SparkChainSimultaneousActivity sparkChainSimultaneousActivity) {
        return (TextView) sparkChainSimultaneousActivity.findViewById(R.id.sparkChainOriginTextTv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView recordIv_delegate$lambda$0(SparkChainSimultaneousActivity sparkChainSimultaneousActivity) {
        return (ImageView) sparkChainSimultaneousActivity.findViewById(R.id.sparkChainRecordIv);
    }

    private final void sendAudioTextToDevice(BleVoice bleVoice) {
        if (q62.OXO1.I0OX()) {
            return;
        }
        BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.AUDIO_TEXT, BleKeyFlag.UPDATE, bleVoice, false, false, 24, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView transformLanguageImg_delegate$lambda$0(SparkChainSimultaneousActivity sparkChainSimultaneousActivity) {
        return (ImageView) sparkChainSimultaneousActivity.findViewById(R.id.transform_language_img);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView translateTv_delegate$lambda$0(SparkChainSimultaneousActivity sparkChainSimultaneousActivity) {
        return (TextView) sparkChainSimultaneousActivity.findViewById(R.id.sparkChainTranslationTextTv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final XunFeiTranslateViewModel viewModel_delegate$lambda$0(SparkChainSimultaneousActivity sparkChainSimultaneousActivity) {
        return (XunFeiTranslateViewModel) new ViewModelProvider(sparkChainSimultaneousActivity, sparkChainSimultaneousActivity.getFactory()).get(XunFeiTranslateViewModel.class);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        initListener();
        collectData();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_sparkchain_simultaneous;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, @tb1 Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            LanguageTranslationData languageTranslationData = (LanguageTranslationData) (intent != null ? intent.getSerializableExtra("language") : null);
            getViewModel().pageLanguageSideUpdate(languageTranslationData, 1);
            if (XunFeiTranslateViewModel.isEqualOtherLanguage$default(getViewModel(), languageTranslationData, false, 2, null)) {
                startRotateAnimation();
                return;
            }
            return;
        }
        if (i != 2) {
            return;
        }
        LanguageTranslationData languageTranslationData2 = (LanguageTranslationData) (intent != null ? intent.getSerializableExtra("language") : null);
        getViewModel().pageLanguageSideUpdate(languageTranslationData2, 2);
        if (getViewModel().isEqualOtherLanguage(languageTranslationData2, false)) {
            startRotateAnimation();
        }
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        finish();
    }

    public final void sendMsgToDevice(@tb1 String str, @tb1 String str2) {
        BleVoice bleVoice;
        BleVoice bleVoice2 = new BleVoice(0, 0, BleVoice.BleVoiceMode.SIMULTANEOUS.getFlag(), null, System.currentTimeMillis(), null, 42, null);
        if (str == null || str.length() == 0) {
            bleVoice = bleVoice2;
        } else {
            sendAudioTextToDevice(BleVoice.copy$default(bleVoice, 0, 0, 0, null, 0L, str, 31, null));
        }
        if (str2 == null || str2.length() == 0) {
            bleVoice = bleVoice2;
            return;
        } else {
            bleVoice = bleVoice2;
            sendAudioTextToDevice(BleVoice.copy$default(bleVoice, 1, 0, 0, null, 0L, str2, 30, null));
        }
    }

    public final void startRotateAnimation() {
        if (this.rotateAnimationSwitching) {
            return;
        }
        getViewModel().pageExchangeLeftAndRightLanguage();
        getTransformLanguageImg().clearAnimation();
        RotateAnimation rotateAnimation = new RotateAnimation(360.0f, 0.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation.setDuration(500L);
        rotateAnimation.setRepeatCount(-1);
        this.rotateAnimationSwitching = true;
        getTransformLanguageImg().startAnimation(rotateAnimation);
        XX01Oi.IiI10X(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C290211(rotateAnimation, this, null), 3, null);
    }
}
