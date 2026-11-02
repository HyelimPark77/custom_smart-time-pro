package com.sma.smartv3.p610ui.translate.sparkchain;

import android.R;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.sma.smartv3.p608db.entity.TranslateEntity;
import com.sma.smartv3.p610ui.translate.TranslateMultiDeviceAdapter;
import com.sma.smartv3.p610ui.translate.sparkchain.TranslateSessionDetailActivity;
import com.sma.smartv3.util.ActivityUtilKt;
import com.sma.smartv3.util.audio_play.MediaPlayManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
public final class TranslateSessionDetailActivity extends BaseActivity {

    @aa1
    private final TranslateMultiDeviceAdapter adapter;

    @aa1
    private final Lazy audioPlayer$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.d16
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return TranslateSessionDetailActivity.audioPlayer_delegate$lambda$0(this.f6108IO);
        }
    });

    @aa1
    private String currentSessionId;

    @aa1
    private final Lazy viewModel$delegate;

    public static final class OXO1 implements TranslateMultiDeviceAdapter.XIi00iiXO {
        public OXO1() {
        }

        @Override // com.sma.smartv3.ui.translate.TranslateMultiDeviceAdapter.XIi00iiXO
        public void play(String path) {
            Intrinsics.X0O(path, "path");
            TranslateSessionDetailActivity.this.getAudioPlayer().OXO1(path);
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.sparkchain.TranslateSessionDetailActivity$initView$5 */
    @DebugMetadata(m39465c = "com.sma.smartv3.ui.translate.sparkchain.TranslateSessionDetailActivity$initView$5", m39466f = "TranslateSessionDetailActivity.kt", m39467i = {}, m39468l = {}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
    @SourceDebugExtension({"SMAP\nTranslateSessionDetailActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TranslateSessionDetailActivity.kt\ncom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailActivity$initView$5\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,124:1\n1869#2,2:125\n*S KotlinDebug\n*F\n+ 1 TranslateSessionDetailActivity.kt\ncom/sma/smartv3/ui/translate/sparkchain/TranslateSessionDetailActivity$initView$5\n*L\n75#1:125,2\n*E\n"})
    public static final class C190245 extends SuspendLambda implements Function2<List<? extends TranslateEntity>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C190245(Continuation<? super C190245> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C190245 c190245 = TranslateSessionDetailActivity.this.new C190245(continuation);
            c190245.L$0 = obj;
            return c190245;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Object invoke2(List<? extends TranslateEntity> list, Continuation<? super Unit> continuation) {
            return invoke2((List<TranslateEntity>) list, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List list = (List) this.L$0;
            C2798pb.I0iXXO();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.X1ii(obj);
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((TranslateEntity) it.next()).transferToAiMessageData());
            }
            TranslateSessionDetailActivity.this.adapter.submitData(arrayList);
            return Unit.OXO1;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<TranslateEntity> list, Continuation<? super Unit> continuation) {
            return ((C190245) create(list, continuation)).invokeSuspend(Unit.OXO1);
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.sparkchain.TranslateSessionDetailActivity$initView$6 */
    @DebugMetadata(m39465c = "com.sma.smartv3.ui.translate.sparkchain.TranslateSessionDetailActivity$initView$6", m39466f = "TranslateSessionDetailActivity.kt", m39467i = {}, m39468l = {}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
    public static final class C190256 extends SuspendLambda implements Function2<com.sma.smartv3.p610ui.ai_note.OXO1, Continuation<? super Unit>, Object> {
        final /* synthetic */ SwipeRefreshLayout $swipeRefreshLayout;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C190256(SwipeRefreshLayout swipeRefreshLayout, Continuation<? super C190256> continuation) {
            super(2, continuation);
            this.$swipeRefreshLayout = swipeRefreshLayout;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C190256 c190256 = new C190256(this.$swipeRefreshLayout, continuation);
            c190256.L$0 = obj;
            return c190256;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(com.sma.smartv3.p610ui.ai_note.OXO1 oxo1, Continuation<? super Unit> continuation) {
            return ((C190256) create(oxo1, continuation)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            com.sma.smartv3.p610ui.ai_note.OXO1 oxo1 = (com.sma.smartv3.p610ui.ai_note.OXO1) this.L$0;
            C2798pb.I0iXXO();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.X1ii(obj);
            if (oxo1 instanceof com.sma.smartv3.ui.ai_note.OXO1.XIi00iiXO) {
                this.$swipeRefreshLayout.setRefreshing(false);
            } else if (oxo1 instanceof com.sma.smartv3.ui.ai_note.OXO1.XO0O10) {
                this.$swipeRefreshLayout.setRefreshing(true);
            }
            return Unit.OXO1;
        }
    }

    public TranslateSessionDetailActivity() {
        TranslateMultiDeviceAdapter translateMultiDeviceAdapter = new TranslateMultiDeviceAdapter();
        translateMultiDeviceAdapter.setPlayListener(new OXO1());
        this.adapter = translateMultiDeviceAdapter;
        this.viewModel$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.e16
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return TranslateSessionDetailActivity.viewModel_delegate$lambda$0(this.f6318IO);
            }
        });
        this.currentSessionId = "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MediaPlayManager audioPlayer_delegate$lambda$0(TranslateSessionDetailActivity translateSessionDetailActivity) {
        return new MediaPlayManager(LifecycleOwnerKt.getLifecycleScope(translateSessionDetailActivity));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MediaPlayManager getAudioPlayer() {
        return (MediaPlayManager) this.audioPlayer$delegate.getValue();
    }

    private final TranslateSessionDetailViewModel getViewModel() {
        return (TranslateSessionDetailViewModel) this.viewModel$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(TranslateSessionDetailActivity translateSessionDetailActivity) {
        translateSessionDetailActivity.getViewModel().getAllSessionEntity(translateSessionDetailActivity.currentSessionId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showDeletePop() {
        final View viewFindViewById = getWindow().getDecorView().findViewById(R.id.content);
        final go0 go0Var = new go0(this, 0, 2, null);
        go0Var.O1O(com.sma.smartv3.pro.R.string.tip);
        go0Var.iOO1ii1("是否删除所有记录");
        go0Var.I0iXXO(false);
        go0Var.iX1O1(Integer.valueOf(com.sma.smartv3.pro.R.string.cancel), new Function0() { // from class: com.android.mltcode.paycertificationapi.a16
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return Boolean.valueOf(TranslateSessionDetailActivity.showDeletePop$lambda$0$0());
            }
        });
        go0Var.X1IX(com.sma.smartv3.pro.R.string.confirm, new Function0() { // from class: com.android.mltcode.paycertificationapi.b16
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return Boolean.valueOf(TranslateSessionDetailActivity.showDeletePop$lambda$0$1(this.f5645IO));
            }
        });
        viewFindViewById.post(new Runnable() { // from class: com.android.mltcode.paycertificationapi.c16
            @Override // java.lang.Runnable
            public final void run() {
                TranslateSessionDetailActivity.showDeletePop$lambda$0$2(this.f5878IO, go0Var, viewFindViewById);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showDeletePop$lambda$0$0() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showDeletePop$lambda$0$1(TranslateSessionDetailActivity translateSessionDetailActivity) {
        translateSessionDetailActivity.getViewModel().deleteSession();
        translateSessionDetailActivity.adapter.clear();
        translateSessionDetailActivity.finish();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showDeletePop$lambda$0$2(TranslateSessionDetailActivity translateSessionDetailActivity, go0 go0Var, View view) {
        if (translateSessionDetailActivity.isDestroyed()) {
            return;
        }
        Intrinsics.XXI(view);
        go0Var.I1XOi1(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TranslateSessionDetailViewModel viewModel_delegate$lambda$0(TranslateSessionDetailActivity translateSessionDetailActivity) {
        return (TranslateSessionDetailViewModel) new ViewModelProvider(translateSessionDetailActivity).get(TranslateSessionDetailViewModel.class);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        String mArg0 = getMArg0();
        if (mArg0 == null) {
            mArg0 = "";
        }
        this.currentSessionId = mArg0;
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) findViewById(com.sma.smartv3.pro.R.id.aiNoteSwipeRefreshLayout);
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() { // from class: com.android.mltcode.paycertificationapi.x06
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
            public final void onRefresh() {
                TranslateSessionDetailActivity.initView$lambda$0(this.OXO1);
            }
        });
        ((RecyclerView) findViewById(com.sma.smartv3.pro.R.id.aiNoteRv)).setAdapter(this.adapter);
        ((ImageView) findViewById(com.sma.smartv3.pro.R.id.abh_title_left)).setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.y06
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12278IO.finish();
            }
        });
        ((TextView) findViewById(com.sma.smartv3.pro.R.id.abh_title_center)).setText(getString(com.sma.smartv3.pro.R.string.interpretation_record));
        ImageView imageView = (ImageView) findViewById(com.sma.smartv3.pro.R.id.abh_title_right);
        imageView.setImageResource(com.sma.smartv3.pro.R.drawable.ic_delete);
        imageView.setVisibility(0);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.z06
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12493IO.showDeletePop();
            }
        });
        ActivityUtilKt.XIi00iiXO(this, getViewModel().getResultFlow(), null, new C190245(null), 2, null);
        ActivityUtilKt.XIi00iiXO(this, getViewModel().getStateFlow(), null, new C190256(swipeRefreshLayout, null), 2, null);
        getViewModel().getAllSessionEntity(this.currentSessionId);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return com.sma.smartv3.pro.R.layout.activity_translate_session_list;
    }

    @Override // com.bestmafen.androidbase.base.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        getAudioPlayer().stop();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }
}
