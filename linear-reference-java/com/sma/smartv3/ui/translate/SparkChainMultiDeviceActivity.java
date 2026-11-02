package com.sma.smartv3.ui.translate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.I100X1;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.aq4;
import com.android.mltcode.paycertificationapi.bq4;
import com.android.mltcode.paycertificationapi.bs1;
import com.android.mltcode.paycertificationapi.cq4;
import com.android.mltcode.paycertificationapi.dq4;
import com.android.mltcode.paycertificationapi.eq4;
import com.android.mltcode.paycertificationapi.fq4;
import com.android.mltcode.paycertificationapi.gq4;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.iOIXXXII0;
import com.android.mltcode.paycertificationapi.oh6;
import com.android.mltcode.paycertificationapi.pb;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.qp4;
import com.android.mltcode.paycertificationapi.rp4;
import com.android.mltcode.paycertificationapi.sp4;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.tp4;
import com.android.mltcode.paycertificationapi.up4;
import com.android.mltcode.paycertificationapi.vp4;
import com.android.mltcode.paycertificationapi.wp4;
import com.android.mltcode.paycertificationapi.xp4;
import com.android.mltcode.paycertificationapi.yp4;
import com.android.mltcode.paycertificationapi.zp4;
import com.android.mltcode.paycertificationapi.zv6;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.ToastUtils;
import com.sma.smartv3.model.LanguageTranslationData;
import com.sma.smartv3.otherdevice.charge.ChooseLanguageActivity;
import com.sma.smartv3.pro.R;
import com.sma.smartv3.ui.translate.sparkchain.SparkChainMultiDeviceViewModel;
import com.sma.smartv3.ui.translate.sparkchain.SparkChainMultiDeviceViewModelFactory;
import com.sma.smartv3.ui.translate.sparkchain.TranslateSessionListActivity;
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

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nSparkChainMultiDeviceActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparkChainMultiDeviceActivity.kt\ncom/sma/smartv3/ui/translate/SparkChainMultiDeviceActivity\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,273:1\n173#2,7:274\n180#2,3:282\n143#2,7:285\n183#2:292\n173#2,7:293\n180#2,3:301\n143#2,7:304\n183#2:311\n69#2,3:312\n72#2,5:316\n1#3:281\n1#3:300\n1#3:315\n*S KotlinDebug\n*F\n+ 1 SparkChainMultiDeviceActivity.kt\ncom/sma/smartv3/ui/translate/SparkChainMultiDeviceActivity\n*L\n158#1:274,7\n158#1:282,3\n158#1:285,7\n158#1:292\n170#1:293,7\n170#1:301,3\n170#1:304,7\n170#1:311\n179#1:312,3\n179#1:316,5\n158#1:281\n170#1:300\n179#1:315\n*E\n"})
public final class SparkChainMultiDeviceActivity extends BaseActivity {

    @aa1
    private final Lazy abhTitleRight$delegate;

    @aa1
    private final TranslateMultiDeviceAdapter adapter;

    @aa1
    private final Lazy dialogueTranslationLeftTv$delegate;

    @aa1
    private final Lazy dialogueTranslationRightTv$delegate;

    @aa1
    private final Lazy factory$delegate;

    @aa1
    private final Lazy leftRecordIv$delegate;

    @aa1
    private final Lazy recyclerview$delegate;

    @aa1
    private final Lazy rightRecordIv$delegate;
    private boolean rotateAnimationSwitching;

    @aa1
    private final Lazy transformLanguageImg$delegate;

    @aa1
    private final Lazy viewModel$delegate;

    public static final class OXO1 implements TranslateMultiDeviceAdapter.XIi00iiXO {
        public final /* synthetic */ SparkChainMultiDeviceActivity OXO1;

        public OXO1(SparkChainMultiDeviceActivity r1) {
            this.OXO1 = r1;
        }

        @Override // com.sma.smartv3.ui.translate.TranslateMultiDeviceAdapter.XIi00iiXO
        public void play(String r2) {
            Intrinsics.X0O(r2, "path");
            SparkChainMultiDeviceActivity.access$getViewModel(this.OXO1).playAiMessageAudioPath(r2);
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.SparkChainMultiDeviceActivity$collectData$1, reason: invalid class name */
    @DebugMetadata(c = "com.sma.smartv3.ui.translate.SparkChainMultiDeviceActivity$collectData$1", f = "SparkChainMultiDeviceActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ SparkChainMultiDeviceActivity this$0;

        public AnonymousClass1(SparkChainMultiDeviceActivity r1, Continuation<? super AnonymousClass1> r2) {
            this.this$0 = r1;
            super(2, r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
            AnonymousClass1 r0 = new AnonymousClass1(this.this$0, r4);
            r0.L$0 = r3;
            return r0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(String r1, Continuation<? super Unit> r2) {
            return invoke2(r1, r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r3) {
            String r0 = (String) this.L$0;
            pb.I0iXXO();
            if (this.label != 0) goto L7;
            ResultKt.X1ii(r3);
            this.this$0.getAdapter().updateLastAudioPathByEmpty(r0);
            return Unit.OXO1;
        L7:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(String r1, Continuation<? super Unit> r2) {
            return ((AnonymousClass1) create(r1, r2)).invokeSuspend(Unit.OXO1);
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.SparkChainMultiDeviceActivity$collectData$2, reason: invalid class name */
    @DebugMetadata(c = "com.sma.smartv3.ui.translate.SparkChainMultiDeviceActivity$collectData$2", f = "SparkChainMultiDeviceActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class AnonymousClass2 extends SuspendLambda implements Function2<iOIXXXII0, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ SparkChainMultiDeviceActivity this$0;

        public AnonymousClass2(SparkChainMultiDeviceActivity r1, Continuation<? super AnonymousClass2> r2) {
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
        public final Object invoke2(iOIXXXII0 r1, Continuation<? super Unit> r2) {
            return ((AnonymousClass2) create(r1, r2)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r3) {
            iOIXXXII0 r0 = (iOIXXXII0) this.L$0;
            pb.I0iXXO();
            if (this.label != 0) goto L7;
            ResultKt.X1ii(r3);
            this.this$0.getAdapter().add(r0);
            SparkChainMultiDeviceActivity.access$getRecyclerview(this.this$0).scrollToPosition(this.this$0.getAdapter().getItemCount() - 1);
            this.this$0.prepareSendAudioText(r0);
            return Unit.OXO1;
        L7:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(iOIXXXII0 r1, Continuation<? super Unit> r2) {
            return invoke2(r1, r2);
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.SparkChainMultiDeviceActivity$collectData$3, reason: invalid class name */
    @DebugMetadata(c = "com.sma.smartv3.ui.translate.SparkChainMultiDeviceActivity$collectData$3", f = "SparkChainMultiDeviceActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class AnonymousClass3 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        /* synthetic */ boolean Z$0;
        int label;
        final /* synthetic */ SparkChainMultiDeviceActivity this$0;

        public AnonymousClass3(SparkChainMultiDeviceActivity r1, Continuation<? super AnonymousClass3> r2) {
            this.this$0 = r1;
            super(2, r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
            AnonymousClass3 r0 = new AnonymousClass3(this.this$0, r4);
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
            if (this.label != 0) goto L7;
            ResultKt.X1ii(r3);
            SparkChainMultiDeviceActivity.access$changeRecordState(this.this$0, r0);
            return Unit.OXO1;
        L7:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public final Object invoke(boolean r1, Continuation<? super Unit> r2) {
            return ((AnonymousClass3) create(Boolean.valueOf(r1), r2)).invokeSuspend(Unit.OXO1);
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.SparkChainMultiDeviceActivity$collectData$4, reason: invalid class name */
    @DebugMetadata(c = "com.sma.smartv3.ui.translate.SparkChainMultiDeviceActivity$collectData$4", f = "SparkChainMultiDeviceActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class AnonymousClass4 extends SuspendLambda implements Function2<LanguageTranslationData, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ SparkChainMultiDeviceActivity this$0;

        public AnonymousClass4(SparkChainMultiDeviceActivity r1, Continuation<? super AnonymousClass4> r2) {
            this.this$0 = r1;
            super(2, r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
            AnonymousClass4 r0 = new AnonymousClass4(this.this$0, r4);
            r0.L$0 = r3;
            return r0;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(LanguageTranslationData r1, Continuation<? super Unit> r2) {
            return ((AnonymousClass4) create(r1, r2)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r3) {
            LanguageTranslationData r0 = (LanguageTranslationData) this.L$0;
            pb.I0iXXO();
            if (this.label != 0) goto L7;
            ResultKt.X1ii(r3);
            SparkChainMultiDeviceActivity.access$getDialogueTranslationLeftTv(this.this$0).setText(r0.getName());
            return Unit.OXO1;
        L7:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(LanguageTranslationData r1, Continuation<? super Unit> r2) {
            return invoke2(r1, r2);
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.SparkChainMultiDeviceActivity$collectData$5, reason: invalid class name */
    @DebugMetadata(c = "com.sma.smartv3.ui.translate.SparkChainMultiDeviceActivity$collectData$5", f = "SparkChainMultiDeviceActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class AnonymousClass5 extends SuspendLambda implements Function2<LanguageTranslationData, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ SparkChainMultiDeviceActivity this$0;

        public AnonymousClass5(SparkChainMultiDeviceActivity r1, Continuation<? super AnonymousClass5> r2) {
            this.this$0 = r1;
            super(2, r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
            AnonymousClass5 r0 = new AnonymousClass5(this.this$0, r4);
            r0.L$0 = r3;
            return r0;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(LanguageTranslationData r1, Continuation<? super Unit> r2) {
            return ((AnonymousClass5) create(r1, r2)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r3) {
            LanguageTranslationData r0 = (LanguageTranslationData) this.L$0;
            pb.I0iXXO();
            if (this.label != 0) goto L7;
            ResultKt.X1ii(r3);
            SparkChainMultiDeviceActivity.access$getDialogueTranslationRightTv(this.this$0).setText(r0.getName());
            return Unit.OXO1;
        L7:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(LanguageTranslationData r1, Continuation<? super Unit> r2) {
            return invoke2(r1, r2);
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.SparkChainMultiDeviceActivity$startRotateAnimation$1, reason: invalid class name and case insensitive filesystem */
    @DebugMetadata(c = "com.sma.smartv3.ui.translate.SparkChainMultiDeviceActivity$startRotateAnimation$1", f = "SparkChainMultiDeviceActivity.kt", i = {}, l = {216}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class C34871 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        final /* synthetic */ RotateAnimation $rotateAnimation;
        int label;
        final /* synthetic */ SparkChainMultiDeviceActivity this$0;

        public C34871(RotateAnimation r1, SparkChainMultiDeviceActivity r2, Continuation<? super C34871> r3) {
            this.$rotateAnimation = r1;
            this.this$0 = r2;
            super(2, r3);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
            return new C34871(this.$rotateAnimation, this.this$0, r4);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
            return ((C34871) create(r1, r2)).invokeSuspend(Unit.OXO1);
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
            SparkChainMultiDeviceActivity.access$getTransformLanguageImg(this.this$0).clearAnimation();
            SparkChainMultiDeviceActivity.access$setRotateAnimationSwitching$p(this.this$0, false);
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

    public SparkChainMultiDeviceActivity() {
        this.factory$delegate = LazyKt__LazyJVMKt.iO(new yp4(this));
        this.viewModel$delegate = LazyKt__LazyJVMKt.iO(new zp4(this));
        this.leftRecordIv$delegate = LazyKt__LazyJVMKt.iO(new aq4(this));
        this.rightRecordIv$delegate = LazyKt__LazyJVMKt.iO(new bq4(this));
        this.recyclerview$delegate = LazyKt__LazyJVMKt.iO(new cq4(this));
        this.abhTitleRight$delegate = LazyKt__LazyJVMKt.iO(new dq4(this));
        this.transformLanguageImg$delegate = LazyKt__LazyJVMKt.iO(new eq4(this));
        this.dialogueTranslationLeftTv$delegate = LazyKt__LazyJVMKt.iO(new fq4(this));
        this.dialogueTranslationRightTv$delegate = LazyKt__LazyJVMKt.iO(new gq4(this));
        TranslateMultiDeviceAdapter r0 = new TranslateMultiDeviceAdapter();
        r0.setPlayListener(new OXO1(this));
        this.adapter = r0;
    }

    public static /* synthetic */ SparkChainMultiDeviceViewModel I0iXXO(SparkChainMultiDeviceActivity r0) {
        return viewModel_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit I1(SparkChainMultiDeviceActivity r0) {
        return initListener$lambda$1$0(r0);
    }

    public static /* synthetic */ RecyclerView I1XOi1(SparkChainMultiDeviceActivity r0) {
        return recyclerview_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit IIX1OXO(SparkChainMultiDeviceActivity r0, View r1) {
        return initListener$lambda$0(r0, r1);
    }

    public static /* synthetic */ void O10IXXX0X(SparkChainMultiDeviceActivity r0, View r1) {
        initListener$lambda$2(r0, r1);
    }

    public static /* synthetic */ ImageView OII(SparkChainMultiDeviceActivity r0) {
        return abhTitleRight_delegate$lambda$0(r0);
    }

    public static /* synthetic */ ImageView OIX0iXi(SparkChainMultiDeviceActivity r0) {
        return rightRecordIv_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void OX(SparkChainMultiDeviceActivity r0, View r1) {
        initListener$lambda$5(r0, r1);
    }

    public static /* synthetic */ void OiIIX101O(SparkChainMultiDeviceActivity r0, View r1) {
        initListener$lambda$3(r0, r1);
    }

    public static /* synthetic */ void X0O(SparkChainMultiDeviceActivity r0, View r1) {
        initListener$lambda$4(r0, r1);
    }

    public static /* synthetic */ Unit X1ii(SparkChainMultiDeviceActivity r0, View r1) {
        return initListener$lambda$1(r0, r1);
    }

    public static /* synthetic */ ImageView XX0(SparkChainMultiDeviceActivity r0) {
        return leftRecordIv_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView XXI(SparkChainMultiDeviceActivity r0) {
        return dialogueTranslationLeftTv_delegate$lambda$0(r0);
    }

    public static /* synthetic */ SparkChainMultiDeviceViewModelFactory XiOIO(SparkChainMultiDeviceActivity r0) {
        return factory_delegate$lambda$0(r0);
    }

    public static /* synthetic */ Unit XiOIii1(SparkChainMultiDeviceActivity r0) {
        return initListener$lambda$0$0(r0);
    }

    private static final ImageView abhTitleRight_delegate$lambda$0(SparkChainMultiDeviceActivity r1) {
        return (ImageView) r1.findViewById(R.id.abh_title_right);
    }

    public static final /* synthetic */ void access$changeRecordState(SparkChainMultiDeviceActivity r0, boolean r1) {
        r0.changeRecordState(r1);
    }

    public static final /* synthetic */ TextView access$getDialogueTranslationLeftTv(SparkChainMultiDeviceActivity r0) {
        return r0.getDialogueTranslationLeftTv();
    }

    public static final /* synthetic */ TextView access$getDialogueTranslationRightTv(SparkChainMultiDeviceActivity r0) {
        return r0.getDialogueTranslationRightTv();
    }

    public static final /* synthetic */ RecyclerView access$getRecyclerview(SparkChainMultiDeviceActivity r0) {
        return r0.getRecyclerview();
    }

    public static final /* synthetic */ ImageView access$getTransformLanguageImg(SparkChainMultiDeviceActivity r0) {
        return r0.getTransformLanguageImg();
    }

    public static final /* synthetic */ SparkChainMultiDeviceViewModel access$getViewModel(SparkChainMultiDeviceActivity r0) {
        return r0.getViewModel();
    }

    public static final /* synthetic */ void access$setRotateAnimationSwitching$p(SparkChainMultiDeviceActivity r0, boolean r1) {
        r0.rotateAnimationSwitching = r1;
    }

    private final void changeRecordState(boolean r2) {
        if (getViewModel().isLeftEarType() == false) goto L5;
        ImageView r0 = getLeftRecordIv();
    L6:
        if (r2 == false) goto L9;
        int r3 = R.drawable.icon_translate_face_end;
    L12:
        r0.setImageResource(r3);
        return;
    L9:
        if (getViewModel().isLeftEarType() == false) goto L11;
        r3 = R.drawable.icon_translate_face;
        goto L12
    L11:
        r3 = R.drawable.icon_translate_face_blue;
        goto L12
    L5:
        r0 = getRightRecordIv();
        goto L6
    }

    public static /* synthetic */ void changeRecordState$default(SparkChainMultiDeviceActivity r0, boolean r1, int r2, Object r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = false;
    L5:
        r0.changeRecordState(r1);
    }

    private final void collectData() {
        ActivityUtilKt.XIi00iiXO(this, getViewModel().getAudioPathFlow(), null, new AnonymousClass1(this, null), 2, null);
        ActivityUtilKt.XIi00iiXO(this, getViewModel().getAiMessageFlow(), null, new AnonymousClass2(this, null), 2, null);
        ActivityUtilKt.XIi00iiXO(this, getViewModel().getRecording(), null, new AnonymousClass3(this, null), 2, null);
        ActivityUtilKt.XIi00iiXO(this, getViewModel().getPageLeftLanguageFlow(), null, new AnonymousClass4(this, null), 2, null);
        ActivityUtilKt.XIi00iiXO(this, getViewModel().getPageRightLanguageFlow(), null, new AnonymousClass5(this, null), 2, null);
    }

    private static final TextView dialogueTranslationLeftTv_delegate$lambda$0(SparkChainMultiDeviceActivity r1) {
        return (TextView) r1.findViewById(R.id.dialogue_translation_left_tv);
    }

    private static final TextView dialogueTranslationRightTv_delegate$lambda$0(SparkChainMultiDeviceActivity r1) {
        return (TextView) r1.findViewById(R.id.dialogue_translation_right_tv);
    }

    private static final SparkChainMultiDeviceViewModelFactory factory_delegate$lambda$0(SparkChainMultiDeviceActivity r2) {
        return new SparkChainMultiDeviceViewModelFactory(zv6.OXO1.IO(LifecycleOwnerKt.getLifecycleScope(r2)));
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

    private final SparkChainMultiDeviceViewModelFactory getFactory() {
        return (SparkChainMultiDeviceViewModelFactory) getValue();
    }

    private final ImageView getLeftRecordIv() {
        return (ImageView) getValue();
    }

    private final RecyclerView getRecyclerview() {
        return (RecyclerView) getValue();
    }

    private final ImageView getRightRecordIv() {
        return (ImageView) getValue();
    }

    private final ImageView getTransformLanguageImg() {
        return (ImageView) getValue();
    }

    private final SparkChainMultiDeviceViewModel getViewModel() {
        return (SparkChainMultiDeviceViewModel) getValue();
    }

    public static /* synthetic */ ImageView iIiiO(SparkChainMultiDeviceActivity r0) {
        return transformLanguageImg_delegate$lambda$0(r0);
    }

    public static /* synthetic */ TextView iOOX010X(SparkChainMultiDeviceActivity r0) {
        return dialogueTranslationRightTv_delegate$lambda$0(r0);
    }

    private static final Unit initListener$lambda$0(final SparkChainMultiDeviceActivity r2, View r3) {
        Intrinsics.X0O(r3, "it");
        bs1.OXO1.XIi00iiXO(new String[]{"android.permission.RECORD_AUDIO", "android.permission.MODIFY_AUDIO_SETTINGS"}, new qp4(r2));
        return Unit.OXO1;
    }

    private static final Unit initListener$lambda$0$0(SparkChainMultiDeviceActivity r4) {
        SparkChainMultiDeviceViewModel.setCurrentAudioDeviceType$default(r4.getViewModel(), false, 1, null);
        r4.getViewModel().startOrStopRecord();
        return Unit.OXO1;
    }

    private static final Unit initListener$lambda$1(final SparkChainMultiDeviceActivity r2, View r3) {
        Intrinsics.X0O(r3, "it");
        bs1.OXO1.XIi00iiXO(new String[]{"android.permission.RECORD_AUDIO", "android.permission.MODIFY_AUDIO_SETTINGS"}, new rp4(r2));
        return Unit.OXO1;
    }

    private static final Unit initListener$lambda$1$0(SparkChainMultiDeviceActivity r2) {
        r2.getViewModel().setCurrentAudioDeviceType(false);
        r2.getViewModel().startOrStopRecord();
        return Unit.OXO1;
    }

    private static final void initListener$lambda$2(SparkChainMultiDeviceActivity r0, View r1) {
        if (r0.getViewModel().getRecording().getValue().booleanValue() == false) goto L6;
        ToastUtils.showLong(r0.getString(R.string.recording_tip), new Object[0]);
        return;
    L6:
        r0.startRotateAnimation();
    }

    private static final void initListener$lambda$3(SparkChainMultiDeviceActivity r4, View r5) {
        if (r4.getViewModel().getRecording().getValue().booleanValue() == false) goto L6;
        ToastUtils.showLong(r4.getString(R.string.recording_tip), new Object[0]);
        return;
    L6:
        LanguageTranslationData r6 = r4.getViewModel().getPageLeftLanguageFlow().getValue();
        Bundle r0 = new Bundle();
        r0.putString("mArg0", null);
        r0.putInt("mArg1", 4);
        r0.putParcelable("mArg2", null);
        r0.putSerializable("mArg3", r6);
        Intent r7 = new Intent(r4, ChooseLanguageActivity.class);
        r7.putExtras(r0);
        r4.startActivityForResult(r7, 1);
    }

    private static final void initListener$lambda$4(SparkChainMultiDeviceActivity r4, View r5) {
        if (r4.getViewModel().getRecording().getValue().booleanValue() == false) goto L6;
        ToastUtils.showLong(r4.getString(R.string.recording_tip), new Object[0]);
        return;
    L6:
        LanguageTranslationData r6 = r4.getViewModel().getPageRightLanguageFlow().getValue();
        Bundle r0 = new Bundle();
        r0.putString("mArg0", null);
        r0.putInt("mArg1", 4);
        r0.putParcelable("mArg2", null);
        r0.putSerializable("mArg3", r6);
        Intent r7 = new Intent(r4, ChooseLanguageActivity.class);
        r7.putExtras(r0);
        r4.startActivityForResult(r7, 2);
    }

    private static final void initListener$lambda$5(SparkChainMultiDeviceActivity r1, View r2) {
        r1.startActivity(new Intent(r1, TranslateSessionListActivity.class));
    }

    private static final ImageView leftRecordIv_delegate$lambda$0(SparkChainMultiDeviceActivity r1) {
        return (ImageView) r1.findViewById(R.id.left_recording_img);
    }

    private static final RecyclerView recyclerview_delegate$lambda$0(SparkChainMultiDeviceActivity r1) {
        return (RecyclerView) r1.findViewById(R.id.rv);
    }

    private static final ImageView rightRecordIv_delegate$lambda$0(SparkChainMultiDeviceActivity r1) {
        return (ImageView) r1.findViewById(R.id.right_recording_img);
    }

    private final void sendAudioTextToDevice(BleVoice r10) {
        if (q62.OXO1.I0OX() == true) goto L6;
        BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.AUDIO_TEXT, BleKeyFlag.UPDATE, r10, false, false, 24, null);
        return;
    }

    private static final ImageView transformLanguageImg_delegate$lambda$0(SparkChainMultiDeviceActivity r1) {
        return (ImageView) r1.findViewById(R.id.transform_language_img);
    }

    private static final SparkChainMultiDeviceViewModel viewModel_delegate$lambda$0(SparkChainMultiDeviceActivity r2) {
        return (SparkChainMultiDeviceViewModel) new ViewModelProvider(r2, r2.getFactory()).get(SparkChainMultiDeviceViewModel.class);
    }

    @aa1
    public final TranslateMultiDeviceAdapter getAdapter() {
        return this.adapter;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    public final void initListener() {
        getRecyclerview().setAdapter(this.adapter);
        ImageView r2 = getLeftRecordIv();
        Intrinsics.O10IXXX0X(r2, "<get-leftRecordIv>(...)");
        oh6.XO0O10(r2, 0, new sp4(this), 1, null);
        ImageView r8 = getRightRecordIv();
        Intrinsics.O10IXXX0X(r8, "<get-rightRecordIv>(...)");
        oh6.XO0O10(r8, 0, new tp4(this), 1, null);
        getTransformLanguageImg().setOnClickListener(new up4(this));
        getDialogueTranslationLeftTv().setOnClickListener(new vp4(this));
        getDialogueTranslationRightTv().setOnClickListener(new wp4(this));
        ((ImageView) findViewById(R.id.abh_title_right)).setOnClickListener(new xp4(this));
        getOnBackPressedDispatcher().addCallback(this, new AnonymousClass7(this));
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        initListener();
        collectData();
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return R.layout.activity_sparkchain_multidevice;
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
        if (SparkChainMultiDeviceViewModel.isEqualOtherLanguage$default(getViewModel(), r9, false, 2, null) == false) goto L20;
        startRotateAnimation();
        return;
    L20:
        return;
    L14:
        r8 = null;
        goto L15
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
    }

    public final void onTitleLeftClick(@aa1 View r2) {
        Intrinsics.X0O(r2, "view");
        getViewModel().saveAllDataAndExit();
        finish();
    }

    public final void prepareSendAudioText(@aa1 iOIXXXII0 r21) {
        Intrinsics.X0O(r21, "msgData");
        long r8 = System.currentTimeMillis();
        BleVoice r10 = new BleVoice(0, 0, BleVoice.BleVoiceMode.AI_TRANSLATE.getFlag(), null, r8, null, 42, null);
        String r1 = r21.XX0();
        if (r1 != null) goto L5;
    L12:
        String r2 = r21.XiOIii1();
        if (r2 != null) goto L15;
        return;
    L15:
        if (r2.length() == 0) goto L24;
        String r3 = r21.XiOIii1();
        if (r3 != null) goto L20;
        String r17 = "";
    L21:
        sendAudioTextToDevice(BleVoice.copy$default(r10, 1, 0, 0, null, 0, r17, 30, null));
        return;
    L20:
        r17 = r3;
        goto L21
    L24:
        return;
    L5:
        if (r1.length() == 0) goto L12;
        String r4 = r21.XX0();
        if (r4 != null) goto L10;
        String r18 = "";
    L11:
        sendAudioTextToDevice(BleVoice.copy$default(r10, 0, 0, 0, null, 0, r18, 31, null));
        goto L12
    L10:
        r18 = r4;
        goto L11
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
        I100X1.O00(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C34871(r1, this, null), 3, null);
    }
}
