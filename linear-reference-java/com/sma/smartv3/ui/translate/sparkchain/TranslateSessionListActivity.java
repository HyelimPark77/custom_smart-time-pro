package com.sma.smartv3.ui.translate.sparkchain;

import android.R;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.f16;
import com.android.mltcode.paycertificationapi.g16;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.h16;
import com.android.mltcode.paycertificationapi.i16;
import com.android.mltcode.paycertificationapi.j16;
import com.android.mltcode.paycertificationapi.k16;
import com.android.mltcode.paycertificationapi.l16;
import com.android.mltcode.paycertificationapi.pb;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.sma.smartv3.db.entity.TranslateSessionWithFirstEntity;
import com.sma.smartv3.util.ActivityUtilKt;
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
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
public final class TranslateSessionListActivity extends BaseActivity {

    @aa1
    private final TranslateListAdapter adapter;

    @aa1
    private final Lazy viewModel$delegate;

    /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.sparkchain.TranslateSessionListActivity$initView$5, reason: invalid class name */
    @DebugMetadata(c = "com.sma.smartv3.ui.translate.sparkchain.TranslateSessionListActivity$initView$5", f = "TranslateSessionListActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    @SourceDebugExtension({"SMAP\nTranslateSessionListActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TranslateSessionListActivity.kt\ncom/sma/smartv3/ui/translate/sparkchain/TranslateSessionListActivity$initView$5\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,104:1\n1869#2,2:105\n*S KotlinDebug\n*F\n+ 1 TranslateSessionListActivity.kt\ncom/sma/smartv3/ui/translate/sparkchain/TranslateSessionListActivity$initView$5\n*L\n62#1:105,2\n*E\n"})
    public static final class AnonymousClass5 extends SuspendLambda implements Function2<List<? extends TranslateSessionWithFirstEntity>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ TranslateSessionListActivity this$0;

        public AnonymousClass5(TranslateSessionListActivity r1, Continuation<? super AnonymousClass5> r2) {
            this.this$0 = r1;
            super(2, r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
            AnonymousClass5 r0 = new AnonymousClass5(this.this$0, r4);
            r0.L$0 = r3;
            return r0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(List<? extends TranslateSessionWithFirstEntity> r1, Continuation<? super Unit> r2) {
            return invoke2(r1, r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r3) {
            List r0 = (List) this.L$0;
            pb.I0iXXO();
            if (this.label != 0) goto L14;
            ResultKt.X1ii(r3);
            if (r0 == null) goto L12;
            ArrayList r4 = new ArrayList();
            Iterator r1 = r0.iterator();
        L8:
            if (r1.hasNext() == false) goto L10;
            r4.add(((TranslateSessionWithFirstEntity) r1.next()).getTranslations().transferToAiRecords());
            goto L8
        L10:
            this.this$0.getAdapter().submitData(r4);
        L12:
            return Unit.OXO1;
        L14:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<TranslateSessionWithFirstEntity> r1, Continuation<? super Unit> r2) {
            return ((AnonymousClass5) create(r1, r2)).invokeSuspend(Unit.OXO1);
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.sparkchain.TranslateSessionListActivity$initView$6, reason: invalid class name */
    @DebugMetadata(c = "com.sma.smartv3.ui.translate.sparkchain.TranslateSessionListActivity$initView$6", f = "TranslateSessionListActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class AnonymousClass6 extends SuspendLambda implements Function2<com.sma.smartv3.ui.ai_note.OXO1, Continuation<? super Unit>, Object> {
        final /* synthetic */ SwipeRefreshLayout $swipeRefreshLayout;
        /* synthetic */ Object L$0;
        int label;

        public AnonymousClass6(SwipeRefreshLayout r1, Continuation<? super AnonymousClass6> r2) {
            this.$swipeRefreshLayout = r1;
            super(2, r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
            AnonymousClass6 r0 = new AnonymousClass6(this.$swipeRefreshLayout, r4);
            r0.L$0 = r3;
            return r0;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(com.sma.smartv3.ui.ai_note.OXO1 r1, Continuation<? super Unit> r2) {
            return ((AnonymousClass6) create(r1, r2)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r3) {
            com.sma.smartv3.ui.ai_note.OXO1 r0 = (com.sma.smartv3.ui.ai_note.OXO1) this.L$0;
            pb.I0iXXO();
            if (this.label != 0) goto L13;
            ResultKt.X1ii(r3);
            if ((r0 instanceof com.sma.smartv3.ui.ai_note.OXO1.XIi00iiXO) == false) goto L8;
            setRefreshing(false);
        L11:
            return Unit.OXO1;
        L8:
            if ((r0 instanceof com.sma.smartv3.ui.ai_note.OXO1.XO0O10) == false) goto L11;
            setRefreshing(true);
            goto L11
        L13:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(com.sma.smartv3.ui.ai_note.OXO1 r1, Continuation<? super Unit> r2) {
            return invoke2(r1, r2);
        }
    }

    public TranslateSessionListActivity() {
        this.adapter = new TranslateListAdapter();
        this.viewModel$delegate = LazyKt__LazyJVMKt.iO(new l16(this));
    }

    public static /* synthetic */ void I0iXXO(TranslateSessionListActivity r0, View r1) {
        initView$lambda$1(r0, r1);
    }

    public static /* synthetic */ void I1XOi1(TranslateSessionListActivity r0, go0 r1, View r2) {
        showDeletePop$lambda$0$2(r0, r1, r2);
    }

    public static /* synthetic */ void O10IXXX0X(TranslateSessionListActivity r0, View r1) {
        initView$lambda$3$0(r0, r1);
    }

    public static /* synthetic */ boolean OIX0iXi(TranslateSessionListActivity r0) {
        return showDeletePop$lambda$0$1(r0);
    }

    public static /* synthetic */ TranslateSessionViewModel X0O(TranslateSessionListActivity r0) {
        return viewModel_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void X1ii(TranslateSessionListActivity r0) {
        initView$lambda$0(r0);
    }

    public static /* synthetic */ boolean XXI() {
        return showDeletePop$lambda$0$0();
    }

    private final TranslateSessionViewModel getViewModel() {
        return (TranslateSessionViewModel) getValue();
    }

    private static final void initView$lambda$0(TranslateSessionListActivity r0) {
        r0.getViewModel().getSparkChainSessionList();
    }

    private static final void initView$lambda$1(TranslateSessionListActivity r0, View r1) {
        r0.finish();
    }

    private static final void initView$lambda$3$0(TranslateSessionListActivity r0, View r1) {
        r0.showDeletePop();
    }

    private final void showDeletePop() {
        final View r0 = getWindow().getDecorView().findViewById(R.id.content);
        int r4 = 0;
        final go0 r1 = new go0(this, r4, 2, null);
        r1.O1O(com.sma.smartv3.pro.R.string.tip);
        r1.iOO1ii1("是否删除所有记录");
        r1.I0iXXO(false);
        r1.iX1O1(Integer.valueOf(com.sma.smartv3.pro.R.string.cancel), new f16());
        r1.X1IX(com.sma.smartv3.pro.R.string.confirm, new g16(this));
        r0.post(new h16(this, r1, r0));
    }

    private static final boolean showDeletePop$lambda$0$0() {
        return true;
    }

    private static final boolean showDeletePop$lambda$0$1(TranslateSessionListActivity r1) {
        r1.getViewModel().deleteAllSparkChainSessionList();
        r1.adapter.deleteAll();
        return true;
    }

    private static final void showDeletePop$lambda$0$2(TranslateSessionListActivity r0, go0 r1, View r2) {
        if (r0.isDestroyed() == true) goto L6;
        Intrinsics.XXI(r2);
        r1.I1XOi1(r2);
        return;
    }

    private static final TranslateSessionViewModel viewModel_delegate$lambda$0(TranslateSessionListActivity r1) {
        return (TranslateSessionViewModel) new ViewModelProvider(r1).get(TranslateSessionViewModel.class);
    }

    @aa1
    public final TranslateListAdapter getAdapter() {
        return this.adapter;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        SwipeRefreshLayout r0 = (SwipeRefreshLayout) findViewById(com.sma.smartv3.pro.R.id.aiNoteSwipeRefreshLayout);
        r0.setOnRefreshListener(new i16(this));
        ((RecyclerView) findViewById(com.sma.smartv3.pro.R.id.aiNoteRv)).setAdapter(this.adapter);
        ((ImageView) findViewById(com.sma.smartv3.pro.R.id.abh_title_left)).setOnClickListener(new j16(this));
        ((TextView) findViewById(com.sma.smartv3.pro.R.id.abh_title_center)).setText(getString(com.sma.smartv3.pro.R.string.interpretation_record));
        ImageView r1 = (ImageView) findViewById(com.sma.smartv3.pro.R.id.abh_title_right);
        r1.setImageResource(com.sma.smartv3.pro.R.drawable.ai_records_delete_icon);
        r1.setVisibility(0);
        r1.setOnClickListener(new k16(this));
        ActivityUtilKt.XIi00iiXO(this, getViewModel().getResultFlow(), null, new AnonymousClass5(this, null), 2, null);
        ActivityUtilKt.XIi00iiXO(this, getViewModel().getStateFlow(), null, new AnonymousClass6(r0, null), 2, null);
        getViewModel().getSparkChainSessionList();
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return com.sma.smartv3.pro.R.layout.activity_translate_session_list;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        getViewModel().getSparkChainSessionList();
    }
}
