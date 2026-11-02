package com.sma.smartv3.p610ui.translate;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.OnBackPressedCallback;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.XX01Oi;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.bs1;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.iOIXXXII0;
import com.android.mltcode.paycertificationapi.oh6;
import com.android.mltcode.paycertificationapi.q62;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.zv6;
import com.bestmafen.androidbase.base.BaseActivity;
import com.blankj.utilcode.util.ToastUtils;
import com.sma.smartv3.model.LanguageTranslationData;
import com.sma.smartv3.otherdevice.charge.ChooseLanguageActivity;
import com.sma.smartv3.p610ui.translate.SparkChainMultiDeviceActivity;
import com.sma.smartv3.p610ui.translate.sparkchain.SparkChainMultiDeviceViewModel;
import com.sma.smartv3.p610ui.translate.sparkchain.SparkChainMultiDeviceViewModelFactory;
import com.sma.smartv3.p610ui.translate.sparkchain.TranslateSessionListActivity;
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

/* JADX INFO: loaded from: classes3.dex */
@SourceDebugExtension({"SMAP\nSparkChainMultiDeviceActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SparkChainMultiDeviceActivity.kt\ncom/sma/smartv3/ui/translate/SparkChainMultiDeviceActivity\n+ 2 Activity.kt\ncom/bestmafen/androidbase/extension/ActivityKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,273:1\n173#2,7:274\n180#2,3:282\n143#2,7:285\n183#2:292\n173#2,7:293\n180#2,3:301\n143#2,7:304\n183#2:311\n69#2,3:312\n72#2,5:316\n1#3:281\n1#3:300\n1#3:315\n*S KotlinDebug\n*F\n+ 1 SparkChainMultiDeviceActivity.kt\ncom/sma/smartv3/ui/translate/SparkChainMultiDeviceActivity\n*L\n158#1:274,7\n158#1:282,3\n158#1:285,7\n158#1:292\n170#1:293,7\n170#1:301,3\n170#1:304,7\n170#1:311\n179#1:312,3\n179#1:316,5\n158#1:281\n170#1:300\n179#1:315\n*E\n"})
public final class SparkChainMultiDeviceActivity extends BaseActivity {

    @aa1
    private final TranslateMultiDeviceAdapter adapter;
    private boolean rotateAnimationSwitching;

    @aa1
    private final Lazy factory$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.yp4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SparkChainMultiDeviceActivity.factory_delegate$lambda$0(this.f12423IO);
        }
    });

    @aa1
    private final Lazy viewModel$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.zp4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SparkChainMultiDeviceActivity.viewModel_delegate$lambda$0(this.f12665IO);
        }
    });

    @aa1
    private final Lazy leftRecordIv$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.aq4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SparkChainMultiDeviceActivity.leftRecordIv_delegate$lambda$0(this.f5541IO);
        }
    });

    @aa1
    private final Lazy rightRecordIv$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.bq4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SparkChainMultiDeviceActivity.rightRecordIv_delegate$lambda$0(this.f5788IO);
        }
    });

    @aa1
    private final Lazy recyclerview$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.cq4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SparkChainMultiDeviceActivity.recyclerview_delegate$lambda$0(this.f6031IO);
        }
    });

    @aa1
    private final Lazy abhTitleRight$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.dq4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SparkChainMultiDeviceActivity.abhTitleRight_delegate$lambda$0(this.f6248IO);
        }
    });

    @aa1
    private final Lazy transformLanguageImg$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.eq4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SparkChainMultiDeviceActivity.transformLanguageImg_delegate$lambda$0(this.f6466IO);
        }
    });

    @aa1
    private final Lazy dialogueTranslationLeftTv$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.fq4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SparkChainMultiDeviceActivity.dialogueTranslationLeftTv_delegate$lambda$0(this.f6703IO);
        }
    });

    @aa1
    private final Lazy dialogueTranslationRightTv$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.gq4
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return SparkChainMultiDeviceActivity.dialogueTranslationRightTv_delegate$lambda$0(this.f6938IO);
        }
    });

    public static final class OXO1 implements TranslateMultiDeviceAdapter.XIi00iiXO {
        public OXO1() {
        }

        @Override // com.sma.smartv3.ui.translate.TranslateMultiDeviceAdapter.XIi00iiXO
        public void play(String path) {
            Intrinsics.X0O(path, "path");
            SparkChainMultiDeviceActivity.this.getViewModel().playAiMessageAudioPath(path);
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.SparkChainMultiDeviceActivity$collectData$1 */
    @DebugMetadata(m39465c = "com.sma.smartv3.ui.translate.SparkChainMultiDeviceActivity$collectData$1", m39466f = "SparkChainMultiDeviceActivity.kt", m39467i = {}, m39468l = {}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
    public static final class C190001 extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C190001(Continuation<? super C190001> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C190001 c190001 = SparkChainMultiDeviceActivity.this.new C190001(continuation);
            c190001.L$0 = obj;
            return c190001;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String str = (String) this.L$0;
            C2798pb.I0iXXO();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.X1ii(obj);
            SparkChainMultiDeviceActivity.this.getAdapter().updateLastAudioPathByEmpty(str);
            return Unit.OXO1;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(String str, Continuation<? super Unit> continuation) {
            return ((C190001) create(str, continuation)).invokeSuspend(Unit.OXO1);
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.SparkChainMultiDeviceActivity$collectData$2 */
    @DebugMetadata(m39465c = "com.sma.smartv3.ui.translate.SparkChainMultiDeviceActivity$collectData$2", m39466f = "SparkChainMultiDeviceActivity.kt", m39467i = {}, m39468l = {}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
    public static final class C189952 extends SuspendLambda implements Function2<iOIXXXII0, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C189952(Continuation<? super C189952> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C189952 c189952 = SparkChainMultiDeviceActivity.this.new C189952(continuation);
            c189952.L$0 = obj;
            return c189952;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(iOIXXXII0 ioixxxii0, Continuation<? super Unit> continuation) {
            return ((C189952) create(ioixxxii0, continuation)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            iOIXXXII0 ioixxxii0 = (iOIXXXII0) this.L$0;
            C2798pb.I0iXXO();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.X1ii(obj);
            SparkChainMultiDeviceActivity.this.getAdapter().add(ioixxxii0);
            SparkChainMultiDeviceActivity.this.getRecyclerview().scrollToPosition(SparkChainMultiDeviceActivity.this.getAdapter().getItemCount() - 1);
            SparkChainMultiDeviceActivity.this.prepareSendAudioText(ioixxxii0);
            return Unit.OXO1;
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.SparkChainMultiDeviceActivity$collectData$3 */
    @DebugMetadata(m39465c = "com.sma.smartv3.ui.translate.SparkChainMultiDeviceActivity$collectData$3", m39466f = "SparkChainMultiDeviceActivity.kt", m39467i = {}, m39468l = {}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
    public static final class C189963 extends SuspendLambda implements Function2<Boolean, Continuation<? super Unit>, Object> {
        /* synthetic */ boolean Z$0;
        int label;

        public C189963(Continuation<? super C189963> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C189963 c189963 = SparkChainMultiDeviceActivity.this.new C189963(continuation);
            c189963.Z$0 = ((Boolean) obj).booleanValue();
            return c189963;
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
            SparkChainMultiDeviceActivity.this.changeRecordState(z);
            return Unit.OXO1;
        }

        public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
            return ((C189963) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.OXO1);
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.SparkChainMultiDeviceActivity$collectData$4 */
    @DebugMetadata(m39465c = "com.sma.smartv3.ui.translate.SparkChainMultiDeviceActivity$collectData$4", m39466f = "SparkChainMultiDeviceActivity.kt", m39467i = {}, m39468l = {}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
    public static final class C189974 extends SuspendLambda implements Function2<LanguageTranslationData, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C189974(Continuation<? super C189974> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C189974 c189974 = SparkChainMultiDeviceActivity.this.new C189974(continuation);
            c189974.L$0 = obj;
            return c189974;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(LanguageTranslationData languageTranslationData, Continuation<? super Unit> continuation) {
            return ((C189974) create(languageTranslationData, continuation)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            LanguageTranslationData languageTranslationData = (LanguageTranslationData) this.L$0;
            C2798pb.I0iXXO();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.X1ii(obj);
            SparkChainMultiDeviceActivity.this.getDialogueTranslationLeftTv().setText(languageTranslationData.getName());
            return Unit.OXO1;
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.SparkChainMultiDeviceActivity$collectData$5 */
    @DebugMetadata(m39465c = "com.sma.smartv3.ui.translate.SparkChainMultiDeviceActivity$collectData$5", m39466f = "SparkChainMultiDeviceActivity.kt", m39467i = {}, m39468l = {}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
    public static final class C189985 extends SuspendLambda implements Function2<LanguageTranslationData, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C189985(Continuation<? super C189985> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C189985 c189985 = SparkChainMultiDeviceActivity.this.new C189985(continuation);
            c189985.L$0 = obj;
            return c189985;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(LanguageTranslationData languageTranslationData, Continuation<? super Unit> continuation) {
            return ((C189985) create(languageTranslationData, continuation)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            LanguageTranslationData languageTranslationData = (LanguageTranslationData) this.L$0;
            C2798pb.I0iXXO();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.X1ii(obj);
            SparkChainMultiDeviceActivity.this.getDialogueTranslationRightTv().setText(languageTranslationData.getName());
            return Unit.OXO1;
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.SparkChainMultiDeviceActivity$startRotateAnimation$1, reason: case insensitive filesystem */
    @DebugMetadata(m39465c = "com.sma.smartv3.ui.translate.SparkChainMultiDeviceActivity$startRotateAnimation$1", m39466f = "SparkChainMultiDeviceActivity.kt", m39467i = {}, m39468l = {216}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
    public static final class C290201 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        final /* synthetic */ RotateAnimation $rotateAnimation;
        int label;
        final /* synthetic */ SparkChainMultiDeviceActivity this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C290201(RotateAnimation rotateAnimation, SparkChainMultiDeviceActivity sparkChainMultiDeviceActivity, Continuation<? super C290201> continuation) {
            super(2, continuation);
            this.$rotateAnimation = rotateAnimation;
            this.this$0 = sparkChainMultiDeviceActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C290201(this.$rotateAnimation, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
            return ((C290201) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
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

    public SparkChainMultiDeviceActivity() {
        TranslateMultiDeviceAdapter translateMultiDeviceAdapter = new TranslateMultiDeviceAdapter();
        translateMultiDeviceAdapter.setPlayListener(new OXO1());
        this.adapter = translateMultiDeviceAdapter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView abhTitleRight_delegate$lambda$0(SparkChainMultiDeviceActivity sparkChainMultiDeviceActivity) {
        return (ImageView) sparkChainMultiDeviceActivity.findViewById(R.id.abh_title_right);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void changeRecordState(boolean z) {
        int i;
        ImageView leftRecordIv = getViewModel().isLeftEarType() ? getLeftRecordIv() : getRightRecordIv();
        if (z) {
            i = R.drawable.icon_translate_face_end;
        } else {
            i = getViewModel().isLeftEarType() ? R.drawable.icon_translate_face : R.drawable.icon_translate_face_blue;
        }
        leftRecordIv.setImageResource(i);
    }

    public static /* synthetic */ void changeRecordState$default(SparkChainMultiDeviceActivity sparkChainMultiDeviceActivity, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        sparkChainMultiDeviceActivity.changeRecordState(z);
    }

    private final void collectData() {
        ActivityUtilKt.XIi00iiXO(this, getViewModel().getAudioPathFlow(), null, new C190001(null), 2, null);
        ActivityUtilKt.XIi00iiXO(this, getViewModel().getAiMessageFlow(), null, new C189952(null), 2, null);
        ActivityUtilKt.XIi00iiXO(this, getViewModel().getRecording(), null, new C189963(null), 2, null);
        ActivityUtilKt.XIi00iiXO(this, getViewModel().getPageLeftLanguageFlow(), null, new C189974(null), 2, null);
        ActivityUtilKt.XIi00iiXO(this, getViewModel().getPageRightLanguageFlow(), null, new C189985(null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView dialogueTranslationLeftTv_delegate$lambda$0(SparkChainMultiDeviceActivity sparkChainMultiDeviceActivity) {
        return (TextView) sparkChainMultiDeviceActivity.findViewById(R.id.dialogue_translation_left_tv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextView dialogueTranslationRightTv_delegate$lambda$0(SparkChainMultiDeviceActivity sparkChainMultiDeviceActivity) {
        return (TextView) sparkChainMultiDeviceActivity.findViewById(R.id.dialogue_translation_right_tv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SparkChainMultiDeviceViewModelFactory factory_delegate$lambda$0(SparkChainMultiDeviceActivity sparkChainMultiDeviceActivity) {
        return new SparkChainMultiDeviceViewModelFactory(zv6.OXO1.m3424IO(LifecycleOwnerKt.getLifecycleScope(sparkChainMultiDeviceActivity)));
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

    private final SparkChainMultiDeviceViewModelFactory getFactory() {
        return (SparkChainMultiDeviceViewModelFactory) this.factory$delegate.getValue();
    }

    private final ImageView getLeftRecordIv() {
        return (ImageView) this.leftRecordIv$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RecyclerView getRecyclerview() {
        return (RecyclerView) this.recyclerview$delegate.getValue();
    }

    private final ImageView getRightRecordIv() {
        return (ImageView) this.rightRecordIv$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ImageView getTransformLanguageImg() {
        return (ImageView) this.transformLanguageImg$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SparkChainMultiDeviceViewModel getViewModel() {
        return (SparkChainMultiDeviceViewModel) this.viewModel$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initListener$lambda$0(final SparkChainMultiDeviceActivity sparkChainMultiDeviceActivity, View it) {
        Intrinsics.X0O(it, "it");
        bs1.OXO1.XIi00iiXO(new String[]{"android.permission.RECORD_AUDIO", "android.permission.MODIFY_AUDIO_SETTINGS"}, new Function0() { // from class: com.android.mltcode.paycertificationapi.qp4
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return SparkChainMultiDeviceActivity.initListener$lambda$0$0(this.f10652IO);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initListener$lambda$0$0(SparkChainMultiDeviceActivity sparkChainMultiDeviceActivity) {
        SparkChainMultiDeviceViewModel.setCurrentAudioDeviceType$default(sparkChainMultiDeviceActivity.getViewModel(), false, 1, null);
        sparkChainMultiDeviceActivity.getViewModel().startOrStopRecord();
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initListener$lambda$1(final SparkChainMultiDeviceActivity sparkChainMultiDeviceActivity, View it) {
        Intrinsics.X0O(it, "it");
        bs1.OXO1.XIi00iiXO(new String[]{"android.permission.RECORD_AUDIO", "android.permission.MODIFY_AUDIO_SETTINGS"}, new Function0() { // from class: com.android.mltcode.paycertificationapi.rp4
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return SparkChainMultiDeviceActivity.initListener$lambda$1$0(this.f10870IO);
            }
        });
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initListener$lambda$1$0(SparkChainMultiDeviceActivity sparkChainMultiDeviceActivity) {
        sparkChainMultiDeviceActivity.getViewModel().setCurrentAudioDeviceType(false);
        sparkChainMultiDeviceActivity.getViewModel().startOrStopRecord();
        return Unit.OXO1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListener$lambda$2(SparkChainMultiDeviceActivity sparkChainMultiDeviceActivity, View view) {
        if (sparkChainMultiDeviceActivity.getViewModel().getRecording().getValue().booleanValue()) {
            ToastUtils.showLong(sparkChainMultiDeviceActivity.getString(R.string.recording_tip), new Object[0]);
        } else {
            sparkChainMultiDeviceActivity.startRotateAnimation();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListener$lambda$3(SparkChainMultiDeviceActivity sparkChainMultiDeviceActivity, View view) {
        if (sparkChainMultiDeviceActivity.getViewModel().getRecording().getValue().booleanValue()) {
            ToastUtils.showLong(sparkChainMultiDeviceActivity.getString(R.string.recording_tip), new Object[0]);
            return;
        }
        LanguageTranslationData value = sparkChainMultiDeviceActivity.getViewModel().getPageLeftLanguageFlow().getValue();
        Bundle bundle = new Bundle();
        bundle.putString("mArg0", null);
        bundle.putInt("mArg1", 4);
        bundle.putParcelable("mArg2", null);
        bundle.putSerializable("mArg3", value);
        Intent intent = new Intent(sparkChainMultiDeviceActivity, (Class<?>) ChooseLanguageActivity.class);
        intent.putExtras(bundle);
        sparkChainMultiDeviceActivity.startActivityForResult(intent, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListener$lambda$4(SparkChainMultiDeviceActivity sparkChainMultiDeviceActivity, View view) {
        if (sparkChainMultiDeviceActivity.getViewModel().getRecording().getValue().booleanValue()) {
            ToastUtils.showLong(sparkChainMultiDeviceActivity.getString(R.string.recording_tip), new Object[0]);
            return;
        }
        LanguageTranslationData value = sparkChainMultiDeviceActivity.getViewModel().getPageRightLanguageFlow().getValue();
        Bundle bundle = new Bundle();
        bundle.putString("mArg0", null);
        bundle.putInt("mArg1", 4);
        bundle.putParcelable("mArg2", null);
        bundle.putSerializable("mArg3", value);
        Intent intent = new Intent(sparkChainMultiDeviceActivity, (Class<?>) ChooseLanguageActivity.class);
        intent.putExtras(bundle);
        sparkChainMultiDeviceActivity.startActivityForResult(intent, 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initListener$lambda$5(SparkChainMultiDeviceActivity sparkChainMultiDeviceActivity, View view) {
        sparkChainMultiDeviceActivity.startActivity(new Intent(sparkChainMultiDeviceActivity, (Class<?>) TranslateSessionListActivity.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView leftRecordIv_delegate$lambda$0(SparkChainMultiDeviceActivity sparkChainMultiDeviceActivity) {
        return (ImageView) sparkChainMultiDeviceActivity.findViewById(R.id.left_recording_img);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RecyclerView recyclerview_delegate$lambda$0(SparkChainMultiDeviceActivity sparkChainMultiDeviceActivity) {
        return (RecyclerView) sparkChainMultiDeviceActivity.findViewById(R.id.f51422rv);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView rightRecordIv_delegate$lambda$0(SparkChainMultiDeviceActivity sparkChainMultiDeviceActivity) {
        return (ImageView) sparkChainMultiDeviceActivity.findViewById(R.id.right_recording_img);
    }

    private final void sendAudioTextToDevice(BleVoice bleVoice) {
        if (q62.OXO1.I0OX()) {
            return;
        }
        BaseBleConnector.sendObject$default(BleConnector.INSTANCE, BleKey.AUDIO_TEXT, BleKeyFlag.UPDATE, bleVoice, false, false, 24, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ImageView transformLanguageImg_delegate$lambda$0(SparkChainMultiDeviceActivity sparkChainMultiDeviceActivity) {
        return (ImageView) sparkChainMultiDeviceActivity.findViewById(R.id.transform_language_img);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SparkChainMultiDeviceViewModel viewModel_delegate$lambda$0(SparkChainMultiDeviceActivity sparkChainMultiDeviceActivity) {
        return (SparkChainMultiDeviceViewModel) new ViewModelProvider(sparkChainMultiDeviceActivity, sparkChainMultiDeviceActivity.getFactory()).get(SparkChainMultiDeviceViewModel.class);
    }

    @aa1
    public final TranslateMultiDeviceAdapter getAdapter() {
        return this.adapter;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    public final void initListener() {
        getRecyclerview().setAdapter(this.adapter);
        ImageView leftRecordIv = getLeftRecordIv();
        Intrinsics.O10IXXX0X(leftRecordIv, "<get-leftRecordIv>(...)");
        oh6.XO0O10(leftRecordIv, 0L, new Function1() { // from class: com.android.mltcode.paycertificationapi.sp4
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SparkChainMultiDeviceActivity.initListener$lambda$0(this.f11103IO, (View) obj);
            }
        }, 1, null);
        ImageView rightRecordIv = getRightRecordIv();
        Intrinsics.O10IXXX0X(rightRecordIv, "<get-rightRecordIv>(...)");
        oh6.XO0O10(rightRecordIv, 0L, new Function1() { // from class: com.android.mltcode.paycertificationapi.tp4
            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2(Object obj) {
                return SparkChainMultiDeviceActivity.initListener$lambda$1(this.f11328IO, (View) obj);
            }
        }, 1, null);
        getTransformLanguageImg().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.up4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SparkChainMultiDeviceActivity.initListener$lambda$2(this.f11544IO, view);
            }
        });
        getDialogueTranslationLeftTv().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.vp4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SparkChainMultiDeviceActivity.initListener$lambda$3(this.f11783IO, view);
            }
        });
        getDialogueTranslationRightTv().setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.wp4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SparkChainMultiDeviceActivity.initListener$lambda$4(this.f12013IO, view);
            }
        });
        ((ImageView) findViewById(R.id.abh_title_right)).setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.xp4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SparkChainMultiDeviceActivity.initListener$lambda$5(this.f12214IO, view);
            }
        });
        getOnBackPressedDispatcher().addCallback(this, new OnBackPressedCallback() { // from class: com.sma.smartv3.ui.translate.SparkChainMultiDeviceActivity.initListener.7
            {
                super(true);
            }

            @Override // androidx.activity.OnBackPressedCallback
            public void handleOnBackPressed() {
                setEnabled(false);
                SparkChainMultiDeviceActivity.this.getViewModel().saveAllDataAndExit();
                SparkChainMultiDeviceActivity.this.getOnBackPressedDispatcher().onBackPressed();
                setEnabled(true);
            }
        });
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        initListener();
        collectData();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return R.layout.activity_sparkchain_multidevice;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, @tb1 Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            LanguageTranslationData languageTranslationData = (LanguageTranslationData) (intent != null ? intent.getSerializableExtra("language") : null);
            getViewModel().pageLanguageSideUpdate(languageTranslationData, 1);
            if (SparkChainMultiDeviceViewModel.isEqualOtherLanguage$default(getViewModel(), languageTranslationData, false, 2, null)) {
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

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
    }

    public final void onTitleLeftClick(@aa1 View view) {
        Intrinsics.X0O(view, "view");
        getViewModel().saveAllDataAndExit();
        finish();
    }

    public final void prepareSendAudioText(@aa1 iOIXXXII0 msgData) {
        Intrinsics.X0O(msgData, "msgData");
        BleVoice bleVoice = new BleVoice(0, 0, BleVoice.BleVoiceMode.AI_TRANSLATE.getFlag(), null, System.currentTimeMillis(), null, 42, null);
        String strXX0 = msgData.XX0();
        if (strXX0 != null && strXX0.length() != 0) {
            String strXX1 = msgData.XX0();
            sendAudioTextToDevice(BleVoice.copy$default(bleVoice, 0, 0, 0, null, 0L, strXX1 == null ? "" : strXX1, 31, null));
        }
        String strXiOIii1 = msgData.XiOIii1();
        if (strXiOIii1 == null || strXiOIii1.length() == 0) {
            return;
        }
        String strXiOIii2 = msgData.XiOIii1();
        sendAudioTextToDevice(BleVoice.copy$default(bleVoice, 1, 0, 0, null, 0L, strXiOIii2 == null ? "" : strXiOIii2, 30, null));
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
        XX01Oi.IiI10X(LifecycleOwnerKt.getLifecycleScope(this), null, null, new C290201(rotateAnimation, this, null), 3, null);
    }
}
