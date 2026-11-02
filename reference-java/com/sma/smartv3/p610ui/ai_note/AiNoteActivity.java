package com.sma.smartv3.p610ui.ai_note;

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
import com.sma.smartv3.model.AIFunctionType;
import com.sma.smartv3.p608db.entity.AIRecords;
import com.sma.smartv3.p610ui.ai_note.AiNoteActivity;
import com.sma.smartv3.util.ActivityUtilKt;
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

/* JADX INFO: loaded from: classes19.dex */
public final class AiNoteActivity extends BaseActivity {

    @aa1
    private final Lazy viewModel$delegate = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.X0IOi00I
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object invoke2() {
            return AiNoteActivity.viewModel_delegate$lambda$0(this.f3966IO);
        }
    });

    @aa1
    private final AiNoteAdapter adapter = new AiNoteAdapter();
    private int currentType = AIFunctionType.AI_NOTE.getType();

    /* JADX INFO: renamed from: com.sma.smartv3.ui.ai_note.AiNoteActivity$initView$5 */
    @DebugMetadata(m39465c = "com.sma.smartv3.ui.ai_note.AiNoteActivity$initView$5", m39466f = "AiNoteActivity.kt", m39467i = {}, m39468l = {}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
    public static final class C186505 extends SuspendLambda implements Function2<List<? extends AIRecords>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        public C186505(Continuation<? super C186505> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C186505 c186505 = AiNoteActivity.this.new C186505(continuation);
            c186505.L$0 = obj;
            return c186505;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: invoke */
        public /* bridge */ /* synthetic */ Object invoke2(List<? extends AIRecords> list, Continuation<? super Unit> continuation) {
            return invoke2((List<AIRecords>) list, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List<AIRecords> list = (List) this.L$0;
            C2798pb.I0iXXO();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.X1ii(obj);
            AiNoteActivity.this.getAdapter().submitData(list);
            return Unit.OXO1;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<AIRecords> list, Continuation<? super Unit> continuation) {
            return ((C186505) create(list, continuation)).invokeSuspend(Unit.OXO1);
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.ai_note.AiNoteActivity$initView$6 */
    @DebugMetadata(m39465c = "com.sma.smartv3.ui.ai_note.AiNoteActivity$initView$6", m39466f = "AiNoteActivity.kt", m39467i = {}, m39468l = {}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
    public static final class C186516 extends SuspendLambda implements Function2<OXO1, Continuation<? super Unit>, Object> {
        final /* synthetic */ SwipeRefreshLayout $swipeRefreshLayout;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C186516(SwipeRefreshLayout swipeRefreshLayout, Continuation<? super C186516> continuation) {
            super(2, continuation);
            this.$swipeRefreshLayout = swipeRefreshLayout;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C186516 c186516 = new C186516(this.$swipeRefreshLayout, continuation);
            c186516.L$0 = obj;
            return c186516;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(OXO1 oxo1, Continuation<? super Unit> continuation) {
            return ((C186516) create(oxo1, continuation)).invokeSuspend(Unit.OXO1);
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

    private final AiNoteViewModel getViewModel() {
        return (AiNoteViewModel) this.viewModel$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initView$lambda$0(AiNoteActivity aiNoteActivity) {
        aiNoteActivity.getViewModel().getNotes(aiNoteActivity.currentType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showDeletePop() {
        final View viewFindViewById = getWindow().getDecorView().findViewById(R.id.content);
        final go0 go0Var = new go0(this, 0, 2, null);
        go0Var.O1O(com.sma.smartv3.pro.R.string.tip);
        go0Var.iOO1ii1("是否删除所有记录");
        go0Var.I0iXXO(false);
        go0Var.iX1O1(Integer.valueOf(com.sma.smartv3.pro.R.string.cancel), new Function0() { // from class: com.android.mltcode.paycertificationapi.X11i1
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return Boolean.valueOf(AiNoteActivity.showDeletePop$lambda$0$0());
            }
        });
        go0Var.X1IX(com.sma.smartv3.pro.R.string.confirm, new Function0() { // from class: com.android.mltcode.paycertificationapi.i010OOII
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return Boolean.valueOf(AiNoteActivity.showDeletePop$lambda$0$1(this.f7295IO));
            }
        });
        viewFindViewById.post(new Runnable() { // from class: com.android.mltcode.paycertificationapi.OiI1
            @Override // java.lang.Runnable
            public final void run() {
                AiNoteActivity.showDeletePop$lambda$0$2(this.f3706IO, go0Var, viewFindViewById);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showDeletePop$lambda$0$0() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean showDeletePop$lambda$0$1(AiNoteActivity aiNoteActivity) {
        aiNoteActivity.getViewModel().deleteAllInfo();
        aiNoteActivity.adapter.clear();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showDeletePop$lambda$0$2(AiNoteActivity aiNoteActivity, go0 go0Var, View view) {
        if (aiNoteActivity.isDestroyed()) {
            return;
        }
        Intrinsics.XXI(view);
        go0Var.I1XOi1(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AiNoteViewModel viewModel_delegate$lambda$0(AiNoteActivity aiNoteActivity) {
        return (AiNoteViewModel) new ViewModelProvider(aiNoteActivity).get(AiNoteViewModel.class);
    }

    @aa1
    public final AiNoteAdapter getAdapter() {
        return this.adapter;
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void init(@tb1 Bundle bundle) {
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public void initView() {
        int mArg1 = getMArg1() > 0 ? getMArg1() : AIFunctionType.AI_NOTE.getType();
        this.currentType = mArg1;
        String string = getString(mArg1 == AIFunctionType.SIMULTANEOUS_INTERPRETATION.getType() ? com.sma.smartv3.pro.R.string.interpretation_record : com.sma.smartv3.pro.R.string.ai_note);
        Intrinsics.XXI(string);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) findViewById(com.sma.smartv3.pro.R.id.aiNoteSwipeRefreshLayout);
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() { // from class: com.android.mltcode.paycertificationapi.X011O
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
            public final void onRefresh() {
                AiNoteActivity.initView$lambda$0(this.OXO1);
            }
        });
        ((RecyclerView) findViewById(com.sma.smartv3.pro.R.id.aiNoteRv)).setAdapter(this.adapter);
        ((ImageView) findViewById(com.sma.smartv3.pro.R.id.abh_title_left)).setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.Oi0I
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f3625IO.finish();
            }
        });
        ((TextView) findViewById(com.sma.smartv3.pro.R.id.abh_title_center)).setText(string);
        ImageView imageView = (ImageView) findViewById(com.sma.smartv3.pro.R.id.abh_title_right);
        imageView.setImageResource(com.sma.smartv3.pro.R.drawable.ic_delete);
        imageView.setVisibility(0);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.android.mltcode.paycertificationapi.XI0O1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f4429IO.showDeletePop();
            }
        });
        ActivityUtilKt.XIi00iiXO(this, getViewModel().getAiNotesFLow(), null, new C186505(null), 2, null);
        ActivityUtilKt.XIi00iiXO(this, getViewModel().getStateFlow(), null, new C186516(swipeRefreshLayout, null), 2, null);
        getViewModel().getNotes(this.currentType);
    }

    @Override // com.android.mltcode.paycertificationapi.InterfaceC2603k5
    public int layoutId() {
        return com.sma.smartv3.pro.R.layout.activity_ai_note;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        getViewModel().getNotes(this.currentType);
    }
}
