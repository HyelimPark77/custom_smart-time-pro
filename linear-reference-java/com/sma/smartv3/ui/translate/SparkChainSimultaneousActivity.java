package com.sma.smartv3.ui.translate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import com.android.mltcode.paycertificationapi.I100X1;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.ar4;
import com.android.mltcode.paycertificationapi.br4;
import com.android.mltcode.paycertificationapi.bs1;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.mq4;
import com.android.mltcode.paycertificationapi.nq4;
import com.android.mltcode.paycertificationapi.oh6;
import com.android.mltcode.paycertificationapi.oq4;
import com.android.mltcode.paycertificationapi.pb;
import com.android.mltcode.paycertificationapi.pq4;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.qq4;
import com.android.mltcode.paycertificationapi.rq4;
import com.android.mltcode.paycertificationapi.sq4;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.tq4;
import com.android.mltcode.paycertificationapi.uq4;
import com.android.mltcode.paycertificationapi.vq4;
import com.android.mltcode.paycertificationapi.wq4;
import com.android.mltcode.paycertificationapi.xq4;
import com.android.mltcode.paycertificationapi.yq4;
import com.android.mltcode.paycertificationapi.zq4;
import com.android.mltcode.paycertificationapi.zv6;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.ToastUtils;
import com.sma.smartv3.model.AIFunctionType;
import com.sma.smartv3.model.LanguageTranslationData;
import com.sma.smartv3.otherdevice.charge.ChooseLanguageActivity;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.ai_note.AiNoteActivity;
import com.sma.smartv3.ui.translate.sparkchain.SparkChainTranslateViewModelFactory;
import com.sma.smartv3.ui.translate.sparkchain.XunFeiTranslateViewModel;
import com.sma.smartv3.util.ActivityUtilKt;
import com.szabh.smable3.BleKey;
import com.szabh.smable3.BleKeyFlag;
import com.szabh.smable3.component.BaseBleConnector;
import com.szabh.smable3.component.BleConnector;
import com.szabh.smable3.entity.BleVoice;
import java.io.Serializable;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.XiOIO;

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nSparkChainSimultaneousActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparkChainSimultaneousActivity.kt\ncom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,232:1\n87#2,7:233\n94#2,3:241\n70#2,7:244\n97#2:251\n173#2,7:252\n180#2,3:260\n143#2,7:263\n183#2:270\n173#2,7:271\n180#2,3:279\n143#2,7:282\n183#2:289\n1#3:240\n1#3:259\n1#3:278\n*S KotlinDebug\n*F\n+ 1 SparkChainSimultaneousActivity.kt\ncom/sma/smartv3/ui/translate/SparkChainSimultaneousActivity\n*L\n116#1:233,7\n116#1:241,3\n116#1:244,7\n116#1:251\n143#1:252,7\n143#1:260,3\n143#1:263,7\n143#1:270\n158#1:271,7\n158#1:279,3\n158#1:282,7\n158#1:289\n116#1:240\n143#1:259\n158#1:278\n*E\n"})
public final class SparkChainSimultaneousActivity extends BaseActivity {

    @aa1
    private final Lazy abhTitleRight$delegate;

    @aa1
    private final Lazy dialogueTranslationLeftTv$delegate;

    @aa1
    private final Lazy dialogueTranslationRightTv$delegate;

    @aa1
    private final Lazy factory$delegate;

    @tb1
    private XiOIO loadingJob;

    @aa1
    private final Lazy originTextTv$delegate;

    @aa1
    private final Lazy recordIv$delegate;
    private boolean rotateAnimationSwitching;

    @aa1
    private final Lazy transformLanguageImg$delegate;

    @aa1
    private final Lazy translateTv$delegate;

    @aa1
    private final Lazy viewModel$delegate;

    /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.SparkChainSimultaneousActivity$collectData$1, reason: invalid class name */
    @DebugMetadata(c = "com.sma.smartv3.ui.translate.SparkChainSimultaneousActivity$collectData$1", f = "SparkChainSimultaneousActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<LanguageTranslationData, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ SparkChainSimultaneousActivity this$0;

        public AnonymousClass1(SparkChainSimultaneousActivity r1, Continuation<? super AnonymousClass1> r2) {
            this.this$0 = r1;
            super(2, r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
            AnonymousClass1 r0 = new AnonymousClass1(this.this$0, r4);
            r0.L$0 = r3;
            return r0;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(LanguageTranslationData r1, Continuation<? super Unit> r2) {
            return ((AnonymousClass1) create(r1, r2)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r3) {
            LanguageTranslationData r0 = (LanguageTranslationData) this.L$0;
            pb.I0iXXO();
            if (this.label != 0) goto L7;
            ResultKt.X1ii(r3);
            SparkChainSimultaneousActivity.access$getDialogueTranslationLeftTv(this.this$0).setText(r0.getName());
            return Unit.OXO1;
        L7:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(LanguageTranslationData r1, Continuation<? super Unit> r2) {
            return invoke2(r1, r2);
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.SparkChainSimultaneousActivity$collectData$2, reason: invalid class name */
    @DebugMetadata(c = "com.sma.smartv3.ui.translate.SparkChainSimultaneousActivity$collectData$2", f = "SparkChainSimultaneousActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<LanguageTranslationData, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ SparkChainSimultaneousActivity this$0;

        public AnonymousClass2(SparkChainSimultaneousActivity r1, Continuation<? super AnonymousClass2> r2) {
            this.this$0 = r1;
            super(2, r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
            AnonymousClass2 r0 = new AnonymousClass2(this.this$0, r4);
            r0.L$0 = r3;
            return r0;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(LanguageTranslationData r1, Continuation<? super Unit> r2) {
            return ((AnonymousClass2) create(r1, r2)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r3) {
            LanguageTranslationData r0 = (LanguageTranslationData) this.L$0;
            pb.I0iXXO();
            if (this.label != 0) goto L7;
            ResultKt.X1ii(r3);
            SparkChainSimultaneousActivity.access$getDialogueTranslationRightTv(this.this$0).setText(r0.getName());
            return Unit.OXO1;
        L7:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(LanguageTranslationData r1, Continuation<? super Unit> r2) {
            return invoke2(r1, r2);
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.SparkChainSimultaneousActivity$collectData$3, reason: invalid class name */
    @DebugMetadata(c = "com.sma.smartv3.ui.translate.SparkChainSimultaneousActivity$collectData$3", f = "SparkChainSimultaneousActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<mq4, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ SparkChainSimultaneousActivity this$0;

        public AnonymousClass3(SparkChainSimultaneousActivity r1, Continuation<? super AnonymousClass3> r2) {
            this.this$0 = r1;
            super(2, r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
            AnonymousClass3 r0 = new AnonymousClass3(this.this$0, r4);
            r0.L$0 = r3;
            return r0;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(mq4 r1, Continuation<? super Unit> r2) {
            return ((AnonymousClass3) create(r1, r2)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r3) {
            mq4 r0 = (mq4) this.L$0;
            pb.I0iXXO();
            if (this.label != 0) goto L7;
            ResultKt.X1ii(r3);
            SparkChainSimultaneousActivity.access$getOriginTextTv(this.this$0).setText(r0.OIi0());
            SparkChainSimultaneousActivity.access$getTranslateTv(this.this$0).setText(r0.X1ii());
            this.this$0.sendMsgToDevice(r0.OIi0(), r0.X1ii());
            return Unit.OXO1;
        L7:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(mq4 r1, Continuation<? super Unit> r2) {
            return invoke2(r1, r2);
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.SparkChainSimultaneousActivity$collectData$4, reason: invalid class name */
    @DebugMetadata(c = "com.sma.smartv3.ui.translate.SparkChainSimultaneousActivity$collectData$4", f = "SparkChainSimultaneousActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        /* synthetic */ boolean Z$0;
        int label;
        final /* synthetic */ SparkChainSimultaneousActivity this$0;

        public AnonymousClass4(SparkChainSimultaneousActivity r1, Continuation<? super AnonymousClass4> r2) {
            this.this$0 = r1;
            super(2, r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
            AnonymousClass4 r0 = new AnonymousClass4(this.this$0, r4);
            r0.Z$0 = ((Boolean) r3).booleanValue();
            return r0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean r1, Continuation<? super Unit> r2) {
            return invoke(r1.booleanValue(), r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r3) {
            boolean r0 = this.Z$0;
            pb.I0iXXO();
            if (this.label != 0) goto L11;
            ResultKt.X1ii(r3);
            if (r0 == false) goto L7;
            SparkChainSimultaneousActivity.access$getRecordIv(this.this$0).setImageResource(R.drawable.ic_binaural_stop);
        L9:
            return Unit.OXO1;
        L7:
            SparkChainSimultaneousActivity.access$getRecordIv(this.this$0).setImageResource(R.drawable.ic_binaural_start);
            goto L9
        L11:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public final Object invoke(boolean r1, Continuation<? super Unit> r2) {
            return ((AnonymousClass4) create(Boolean.valueOf(r1), r2)).invokeSuspend(Unit.OXO1);
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.SparkChainSimultaneousActivity$startRotateAnimation$1, reason: invalid class name and case insensitive filesystem */
    @DebugMetadata(c = "com.sma.smartv3.ui.translate.SparkChainSimultaneousActivity$startRotateAnimation$1", f = "SparkChainSimultaneousActivity.kt", i = {}, l = {183}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class C34881 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        final /* synthetic */ RotateAnimation $rotateAnimation;
        int label;
        final /* synthetic */ SparkChainSimultaneousActivity this$0;

        public C34881(RotateAnimation r1, SparkChainSimultaneousActivity r2, Continuation<? super C34881> r3) {
            this.$rotateAnimation = r1;
            this.this$0 = r2;
            super(2, r3);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
            return new C34881(this.$rotateAnimation, this.this$0, r4);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
            return ((C34881) create(r1, r2)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r4) {
            Object r0 = pb.I0iXXO();
            int r1 = this.label;
            if (r1 == 0) goto L8;
            if (r1 != 1) goto L7;
            ResultKt.X1ii(r4);
        L11:
            this.$rotateAnimation.cancel();
            SparkChainSimultaneousActivity.access$getTransformLanguageImg(this.this$0).clearAnimation();
            SparkChainSimultaneousActivity.access$setRotateAnimationSwitching$p(this.this$0, false);
            return Unit.OXO1;
        L7:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        L8:
            ResultKt.X1ii(r4);
            this.label = 1;
            if (DelayKt.XIi00iiXO(500, this) != r0) goto L11;
            return r0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
            return invoke2(r1, r2);
        }
    }

    public SparkChainSimultaneousActivity() {
        this.originTextTv$delegate = LazyKt__LazyJVMKt.iO(new yq4(this));
        this.translateTv$delegate = LazyKt__LazyJVMKt.iO(new zq4(this));
        this.recordIv$delegate = LazyKt__LazyJVMKt.iO(new ar4(this));
        this.abhTitleRight$delegate = LazyKt__LazyJVMKt.iO(new br4(this));
        this.transformLanguageImg$delegate = LazyKt__LazyJVMKt.iO(new oq4(this));
        this.dialogueTranslationLeftTv$delegate = LazyKt__LazyJVMKt.iO(new pq4(this));
        this.dialogueTranslationRightTv$delegate = LazyKt__LazyJVMKt.iO(new qq4(this));
        this.factory$delegate = LazyKt__LazyJVMKt.iO(new rq4(this));
        this.viewModel$delegate = LazyKt__LazyJVMKt.iO(new sq4(this));
    }

    public static /* synthetic */ ImageView I0iXXO(SparkChainSimultaneousActivity r0) {
        return transformLanguageImg_delegate$lambda$0(r0);
    }

    public static /* synthetic */ XunFeiTranslateViewModel I1XOi1(SparkChainSimultaneousActivity r0) {
        return viewModel_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit IIX1OXO(SparkChainSimultaneousActivity r0) {
        return initListener$lambda$1$0(r0);
    }

    public static /* synthetic */ TextView O10IXXX0X(SparkChainSimultaneousActivity r0) {
        return translateTv_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void OII(SparkChainSimultaneousActivity r0, View r1) {
        initListener$lambda$3(r0, r1);
    }

    public static /* synthetic */ ImageView OIX0iXi(SparkChainSimultaneousActivity r0) {
        return recordIv_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageView OX(SparkChainSimultaneousActivity r0) {
        return abhTitleRight_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void OiIIX101O(SparkChainSimultaneousActivity r0, View r1) {
        initListener$lambda$0(r0, r1);
    }

    public static /* synthetic */ void X0O(SparkChainSimultaneousActivity r0, View r1) {
        initListener$lambda$4(r0, r1);
    }

    public static /* synthetic */ TextView X1ii(SparkChainSimultaneousActivity r0) {
        return originTextTv_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView XX0(SparkChainSimultaneousActivity r0) {
        return dialogueTranslationLeftTv_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit XXI(SparkChainSimultaneousActivity r0, View r1) {
        return initListener$lambda$1(r0, r1);
    }

    public static /* synthetic */ SparkChainTranslateViewModelFactory XiOIO(SparkChainSimultaneousActivity r0) {
        return factory_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void XiOIii1(SparkChainSimultaneousActivity r0, View r1) {
        initListener$lambda$2(r0, r1);
    }

    private static final ImageView abhTitleRight_delegate$lambda$0(SparkChainSimultaneousActivity r1) {
        return (ImageView) r1.findViewById(R.id.abh_title_right);
    }

    public static final /* synthetic */ TextView access$getDialogueTranslationLeftTv(SparkChainSimultaneousActivity r0) {
        return r0.getDialogueTranslationLeftTv();
    }

    public static final /* synthetic */ TextView access$getDialogueTranslationRightTv(SparkChainSimultaneousActivity r0) {
        return r0.getDialogueTranslationRightTv();
    }

    public static final /* synthetic */ TextView access$getOriginTextTv(SparkChainSimultaneousActivity r0) {
        return r0.getOriginTextTv();
    }

    public static final /* synthetic */ ImageView access$getRecordIv(SparkChainSimultaneousActivity r0) {
        return r0.getRecordIv();
    }

    public static final /* synthetic */ ImageView access$getTransformLanguageImg(SparkChainSimultaneousActivity r0) {
        return r0.getTransformLanguageImg();
    }

    public static final /* synthetic */ TextView access$getTranslateTv(SparkChainSimultaneousActivity r0) {
        return r0.getTranslateTv();
    }

    public static final /* synthetic */ void access$setRotateAnimationSwitching$p(SparkChainSimultaneousActivity r0, boolean r1) {
        r0.rotateAnimationSwitching = r1;
    }

    private final void collectData() {
        ActivityUtilKt.XIi00iiXO(this, getViewModel().getPageLeftLanguageFlow(), null, new AnonymousClass1(this, null), 2, null);
        ActivityUtilKt.XIi00iiXO(this, getViewModel().getPageRightLanguageFlow(), null, new AnonymousClass2(this, null), 2, null);
        ActivityUtilKt.XIi00iiXO(this, getViewModel().getDisplayFlow(), null, new AnonymousClass3(this, null), 2, null);
        ActivityUtilKt.XIi00iiXO(this, getViewModel().getRecordingAndTranslatingFlow(), null, new AnonymousClass4(this, null), 2, null);
    }

    private static final TextView dialogueTranslationLeftTv_delegate$lambda$0(SparkChainSimultaneousActivity r1) {
        return (TextView) r1.findViewById(R.id.dialogue_translation_left_tv);
    }

    private static final TextView dialogueTranslationRightTv_delegate$lambda$0(SparkChainSimultaneousActivity r1) {
        return (TextView) r1.findViewById(R.id.dialogue_translation_right_tv);
    }

    private static final SparkChainTranslateViewModelFactory factory_delegate$lambda$0(SparkChainSimultaneousActivity r2) {
        return new SparkChainTranslateViewModelFactory(zv6.OXO1.X1ii(LifecycleOwnerKt.getLifecycleScope(r2)));
    }

    private final ImageView getAbhTitleRight() {
        return (ImageView) getValue();
    }

    private final TextView getDialogueTranslationLeftTv() {
        return (TextView) getValue();
    }

    private final TextView getDialogueTranslationRightTv() {
        return (TextView) getValue();
    }

    private final SparkChainTranslateViewModelFactory getFactory() {
        return (SparkChainTranslateViewModelFactory) getValue();
    }

    private final TextView getOriginTextTv() {
        return (TextView) getValue();
    }

    private final ImageView getRecordIv() {
        return (ImageView) getValue();
    }

    private final ImageView getTransformLanguageImg() {
        return (ImageView) getValue();
    }

    private final TextView getTranslateTv() {
        return (TextView) getValue();
    }

    private final XunFeiTranslateViewModel getViewModel() {
        return (XunFeiTranslateViewModel) getValue();
    }

    public static /* synthetic */ TextView iIiiO(SparkChainSimultaneousActivity r0) {
        return dialogueTranslationRightTv_delegate$lambda$0(r0);
    }

    private final void initListener() {
        q62 r0 = q62.OXO1;
        if (q62.OiO0IOX(r0, null, 1, null) == false) goto L5;
    L6:
        getAbhTitleRight().setVisibility(0);
    L7:
        getAbhTitleRight().setOnClickListener(new tq4(this));
        ImageView r2 = getRecordIv();
        Intrinsics.O10IXXX0X(r2, "<get-recordIv>(...)");
        oh6.XO0O10(r2, 0, new uq4(this), 1, null);
        getTransformLanguageImg().setOnClickListener(new vq4(this));
        getDialogueTranslationLeftTv().setOnClickListener(new wq4(this));
        getDialogueTranslationRightTv().setOnClickListener(new xq4(this));
        return;
    L5:
        if (r0.X0100I() == false) goto L7;
        goto L6
    }

    private static final void initListener$lambda$0(SparkChainSimultaneousActivity r3, View r4) {
        int r5 = AIFunctionType.SIMULTANEOUS_INTERPRETATION.getType();
        Bundle r0 = new Bundle();
        r0.putString("mArg0", null);
        r0.putInt("mArg1", r5);
        r0.putParcelable("mArg2", null);
        r0.putSerializable("mArg3", null);
        Intent r6 = new Intent(r3, AiNoteActivity.class);
        r6.putExtras(r0);
        r3.startActivity(r6);
    }

    private static final Unit initListener$lambda$1(final SparkChainSimultaneousActivity r2, View r3) {
        Intrinsics.X0O(r3, "it");
        bs1.OXO1.XIi00iiXO(new String[]{"android.permission.RECORD_AUDIO", "android.permission.MODIFY_AUDIO_SETTINGS"}, new nq4(r2));
        return Unit.OXO1;
    }

    private static final Unit initListener$lambda$1$0(SparkChainSimultaneousActivity r0) {
        r0.getViewModel().changeRecordStatus();
        return Unit.OXO1;
    }

    private static final void initListener$lambda$2(SparkChainSimultaneousActivity r0, View r1) {
        if (r0.getViewModel().getRecordingAndTranslatingFlow().getValue().booleanValue() == false) goto L6;
        ToastUtils.showLong(r0.getString(R.string.recording_tip), new Object[0]);
        return;
    L6:
        r0.startRotateAnimation();
    }

    private static final void initListener$lambda$3(SparkChainSimultaneousActivity r4, View r5) {
        if (r4.getViewModel().getRecordingAndTranslatingFlow().getValue().booleanValue() == false) goto L6;
        ToastUtils.showLong(r4.getString(R.string.recording_tip), new Object[0]);
        return;
    L6:
        LanguageTranslationData r6 = r4.getViewModel().getPageLeftLanguageFlow().getValue();
        Bundle r0 = new Bundle();
        r0.putString("mArg0", null);
        r0.putInt("mArg1", 3);
        r0.putParcelable("mArg2", null);
        r0.putSerializable("mArg3", r6);
        Intent r7 = new Intent(r4, ChooseLanguageActivity.class);
        r7.putExtras(r0);
        r4.startActivityForResult(r7, 1);
    }

    private static final void initListener$lambda$4(SparkChainSimultaneousActivity r4, View r5) {
        if (r4.getViewModel().getRecordingAndTranslatingFlow().getValue().booleanValue() == false) goto L6;
        ToastUtils.showLong(r4.getString(R.string.recording_tip), new Object[0]);
        return;
    L6:
        LanguageTranslationData r6 = r4.getViewModel().getPageRightLanguageFlow().getValue();
        Bundle r0 = new Bundle();
        r0.putString("mArg0", null);
        r0.putInt("mArg1", 3);
        r0.putParcelable("mArg2", null);
        r0.putSerializable("mArg3", r6);
        Intent r7 = new Intent(r4, ChooseLanguageActivity.class);
        r7.putExtras(r0);
        r4.startActivityForResult(r7, 2);
    }

    private static final TextView originTextTv_delegate$lambda$0(SparkChainSimultaneousActivity r1) {
        return (TextView) r1.findViewById(R.id.sparkChainOriginTextTv);
    }

    private static final ImageView recordIv_delegate$lambda$0(SparkChainSimultaneousActivity r1) {
        return (ImageView) r1.findViewById(R.id.sparkChainRecordIv);
    }

    private final void sendAudioTextToDevice(BleVoice r10) {
        if (q62.OXO1.I0OX() == true) goto L6;
        BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.AUDIO_TEXT, BleKeyFlag.UPDATE, r10, false, false, 24, null);
        return;
    }

    private static final ImageView transformLanguageImg_delegate$lambda$0(SparkChainSimultaneousActivity r1) {
        return (ImageView) r1.findViewById(R.id.transform_language_img);
    }

    private static final TextView translateTv_delegate$lambda$0(SparkChainSimultaneousActivity r1) {
        return (TextView) r1.findViewById(R.id.sparkChainTranslationTextTv);
    }

    private static final XunFeiTranslateViewModel viewModel_delegate$lambda$0(SparkChainSimultaneousActivity r2) {
        return (XunFeiTranslateViewModel) new ViewModelProvider(r2, r2.getFactory()).get(XunFeiTranslateViewModel.class);
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        initListener();
        collectData();
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_sparkchain_simultaneous;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int r5, int r6, @tb1 Intent r7) {
        super.onActivityResult(r5, r6, r7);
        Serializable r2 = null;
        if (r5 == 1) goto L12;
        if (r5 != 2) goto L21;
        if (r7 == null) goto L8;
        r2 = r7.getSerializableExtra("language");
    L8:
        LanguageTranslationData r3 = (LanguageTranslationData) r2;
        getViewModel().pageLanguageSideUpdate(r3, 2);
        if (getViewModel().isEqualOtherLanguage(r3, false) == false) goto L19;
        startRotateAnimation();
        return;
    L19:
        return;
    L21:
        return;
    L12:
        if (r7 == null) goto L14;
        Serializable r8 = r7.getSerializableExtra("language");
    L15:
        LanguageTranslationData r9 = (LanguageTranslationData) r8;
        getViewModel().pageLanguageSideUpdate(r9, 1);
        if (XunFeiTranslateViewModel.isEqualOtherLanguage$default(getViewModel(), r9, false, 2, null) == false) goto L20;
        startRotateAnimation();
        return;
    L20:
        return;
    L14:
        r8 = null;
        goto L15
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        finish();
    }

    public final void sendMsgToDevice(@tb1 String r19, @tb1 String r20) {
        long r6 = System.currentTimeMillis();
        BleVoice r8 = new BleVoice(0, 0, BleVoice.BleVoiceMode.SIMULTANEOUS.getFlag(), null, r6, null, 42, null);
        if (r19 != null) goto L5;
    L6:
        BleVoice r9 = r8;
    L8:
        if (r20 != null) goto L10;
        return;
    L10:
        if (r20.length() == 0) goto L15;
        sendAudioTextToDevice(BleVoice.copy$default(r9, 1, 0, 0, null, 0, r20, 30, null));
        return;
    L15:
        return;
    L5:
        if (r19.length() == 0) goto L6;
        r9 = r8;
        sendAudioTextToDevice(BleVoice.copy$default(r9, 0, 0, 0, null, 0, r19, 31, null));
        goto L8
    }

    public final void startRotateAnimation() {
        if (this.rotateAnimationSwitching == false) goto L5;
        return;
    L5:
        getViewModel().pageExchangeLeftAndRightLanguage();
        getTransformLanguageImg().clearAnimation();
        RotateAnimation r1 = new RotateAnimation(360.0f, 0.0f, 1, 0.5f, 1, 0.5f);
        r1.setDuration(500);
        r1.setRepeatCount(-1);
        this.rotateAnimationSwitching = true;
        getTransformLanguageImg().startAnimation(r1);
        I100X1.O00(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C34881(r1, this, null), 3, null);
    }
}
