package com.sma.smartv3.p610ui.translate.sparkchain;

import android.R;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.sma.smartv3.p608db.entity.TranslateSessionWithFirstEntity;
import com.sma.smartv3.p610ui.ai_note.OXO1;
import com.sma.smartv3.p610ui.translate.sparkchain.TranslateSessionListActivity;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
public final class TranslateSessionListActivity extends BaseActivity {

    @aa1
    private final TranslateListAdapter adapter = new TranslateListAdapter();

    @aa1
    private final Lazy viewModel$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.l16
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return TranslateSessionListActivity.viewModel_delegate$lambda$0(this.f9332IO);
        }
    });

    /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.sparkchain.TranslateSessionListActivity$initView$5 */
    @DebugMetadata(m39465c = "com.sma.smartv3.ui.translate.sparkchain.TranslateSessionListActivity$initView$5", m39466f = "TranslateSessionListActivity.kt", m39467i = {}, m39468l = {}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
    @SourceDebugExtension({"SMAP\nTranslateSessionListActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TranslateSessionListActivity.kt\ncom/sma/smartv3/ui/translate/sparkchain/TranslateSessionListActivity$initView$5\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,104:1\n1869#2,2:105\n*S KotlinDebug\n*F\n+ 1 TranslateSessionListActivity.kt\ncom/sma/smartv3/ui/translate/sparkchain/TranslateSessionListActivity$initView$5\n*L\n62#1:105,2\n*E\n"})
    public static final class C190275 extends SuspendLambda implements Function2<List<? extends TranslateSessionWithFirstEntity>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C190275(Continuation<? super C190275> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C190275 c190275 = TranslateSessionListActivity.this.new C190275(continuation);
            c190275.L$0 = obj;
            return c190275;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Object invoke2(List<? extends TranslateSessionWithFirstEntity> list, Continuation<? super Unit> continuation) {
            return invoke2((List<TranslateSessionWithFirstEntity>) list, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List list = (List) this.L$0;
            C2798pb.I0iXXO();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.X1ii(obj);
            if (list != null) {
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((TranslateSessionWithFirstEntity) it.next()).getTranslations().transferToAiRecords());
                }
                TranslateSessionListActivity.this.getAdapter().submitData(arrayList);
            }
            return Unit.OXO1;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<TranslateSessionWithFirstEntity> list, Continuation<? super Unit> continuation) {
            return ((C190275) create(list, continuation)).invokeSuspend(Unit.OXO1);
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.sparkchain.TranslateSessionListActivity$initView$6 */
    @DebugMetadata(m39465c = "com.sma.smartv3.ui.translate.sparkchain.TranslateSessionListActivity$initView$6", m39466f = "TranslateSessionListActivity.kt", m39467i = {}, m39468l = {}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
    public static final class C190286 extends SuspendLambda implements Function2<OXO1, Continuation<? super Unit>, Object> {
        final /* synthetic */ SwipeRefreshLayout $swipeRefreshLayout;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C190286(SwipeRefreshLayout swipeRefreshLayout, Continuation<? super C190286> continuation) {
            super(2, continuation);
            this.$swipeRefreshLayout = swipeRefreshLayout;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C190286 c190286 = new C190286(this.$swipeRefreshLayout, continuation);
            c190286.L$0 = obj;
            return c190286;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(OXO1 oxo1, Continuation<? super Unit> continuation) {
            return ((C190286) create(oxo1, continuation)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            OXO1 oxo1 = (OXO1) this.L$0;
            C2798pb.I0iXXO();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.X1ii(obj);
            if (oxo1 instanceof OXO1.XIi00iiXO) {
                this.$swipeRefreshLayout.setRefreshing(false);
            } else if (oxo1 instanceof OXO1.XO0O10) {
                this.$swipeRefreshLayout.setRefreshing(true);
            }
            return Unit.OXO1;
        }
    }

    private final TranslateSessionViewModel getViewModel() {
        return (TranslateSessionViewModel) this.viewModel$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(TranslateSessionListActivity translateSessionListActivity) {
        translateSessionListActivity.getViewModel().getSparkChainSessionList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showDeletePop() {
        final View viewFindViewById = getWindow().getDecorView().findViewById(R.id.content);
        final go0 go0Var = new go0(this, 0, 2, null);
        go0Var.O1O(com.sma.smartv3.pro.R.string.tip);
        go0Var.iOO1ii1("是否删除所有记录");
        go0Var.I0iXXO(false);
        go0Var.iX1O1(Integer.valueOf(com.sma.smartv3.pro.R.string.cancel), new Function0() { // from class: com.android.mltcode.paycertificationapi.f16
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return Boolean.valueOf(TranslateSessionListActivity.showDeletePop$lambda$0$0());
            }
        });
        go0Var.X1IX(com.sma.smartv3.pro.R.string.confirm, new Function0() { // from class: com.android.mltcode.paycertificationapi.g16
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return Boolean.valueOf(TranslateSessionListActivity.showDeletePop$lambda$0$1(this.f6792IO));
            }
        });
        viewFindViewById.post(new Runnable() { // from class: com.android.mltcode.paycertificationapi.h16
            @Override // java.lang.Runnable
            public final void run() {
                TranslateSessionListActivity.showDeletePop$lambda$0$2(this.f7029IO, go0Var, viewFindViewById);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showDeletePop$lambda$0$0() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showDeletePop$lambda$0$1(TranslateSessionListActivity translateSessionListActivity) {
        translateSessionListActivity.getViewModel().deleteAllSparkChainSessionList();
        translateSessionListActivity.adapter.deleteAll();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showDeletePop$lambda$0$2(TranslateSessionListActivity translateSessionListActivity, go0 go0Var, View view) {
        if (translateSessionListActivity.isDestroyed()) {
            return;
        }
        Intrinsics.XXI(view);
        go0Var.I1XOi1(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TranslateSessionViewModel viewModel_delegate$lambda$0(TranslateSessionListActivity translateSessionListActivity) {
        return (TranslateSessionViewModel) new ViewModelProvider(translateSessionListActivity).get(TranslateSessionViewModel.class);
    }

    @aa1
    public final TranslateListAdapter getAdapter() {
        return this.adapter;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) findViewById(com.sma.smartv3.pro.R.id.aiNoteSwipeRefreshLayout);
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() { // from class: com.android.mltcode.paycertificationapi.i16
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
            public final void onRefresh() {
                TranslateSessionListActivity.initView$lambda$0(this.OXO1);
            }
        });
        ((RecyclerView) findViewById(com.sma.smartv3.pro.R.id.aiNoteRv)).setAdapter(this.adapter);
        ((ImageView) findViewById(com.sma.smartv3.pro.R.id.abh_title_left)).setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.j16
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8861IO.finish();
            }
        });
        ((TextView) findViewById(com.sma.smartv3.pro.R.id.abh_title_center)).setText(getString(com.sma.smartv3.pro.R.string.interpretation_record));
        ImageView imageView = (ImageView) findViewById(com.sma.smartv3.pro.R.id.abh_title_right);
        imageView.setImageResource(com.sma.smartv3.pro.R.drawable.ai_records_delete_icon);
        imageView.setVisibility(0);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.k16
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9090IO.showDeletePop();
            }
        });
        ActivityUtilKt.XIi00iiXO(this, getViewModel().getResultFlow(), null, new C190275(null), 2, null);
        ActivityUtilKt.XIi00iiXO(this, getViewModel().getStateFlow(), null, new C190286(swipeRefreshLayout, null), 2, null);
        getViewModel().getSparkChainSessionList();
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return com.sma.smartv3.pro.R.layout.activity_translate_session_list;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        getViewModel().getSparkChainSessionList();
    }
}
