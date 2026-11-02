package com.sma.smartv3.ui.ai_note;

import android.R;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.android.mltcode.paycertificationapi.Oi0I;
import com.android.mltcode.paycertificationapi.OiI1;
import com.android.mltcode.paycertificationapi.X011O;
import com.android.mltcode.paycertificationapi.X0IOi00I;
import com.android.mltcode.paycertificationapi.X11i1;
import com.android.mltcode.paycertificationapi.XI0O1;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.go0;
import com.android.mltcode.paycertificationapi.i010OOII;
import com.android.mltcode.paycertificationapi.pb;
import com.android.mltcode.paycertificationapi.tb1;
import com.bestmafen.androidbase.base.BaseActivity;
import com.sma.smartv3.db.entity.AIRecords;
import com.sma.smartv3.model.AIFunctionType;
import com.sma.smartv3.util.ActivityUtilKt;
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

/* JADX INFO: loaded from: classes19.dex */
public final class AiNoteActivity extends BaseActivity {

    @aa1
    private final AiNoteAdapter adapter;
    private int currentType;

    @aa1
    private final Lazy viewModel$delegate;

    /* JADX INFO: renamed from: com.sma.smartv3.ui.ai_note.AiNoteActivity$initView$5, reason: invalid class name */
    @DebugMetadata(c = "com.sma.smartv3.ui.ai_note.AiNoteActivity$initView$5", f = "AiNoteActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class AnonymousClass5 extends SuspendLambda implements Function2<List<? extends AIRecords>, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AiNoteActivity this$0;

        public AnonymousClass5(AiNoteActivity r1, Continuation<? super AnonymousClass5> r2) {
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
        public /* bridge */ /* synthetic */ Object invoke(List<? extends AIRecords> r1, Continuation<? super Unit> r2) {
            return invoke2(r1, r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r3) {
            List<AIRecords> r0 = (List) this.L$0;
            pb.I0iXXO();
            if (this.label != 0) goto L7;
            ResultKt.X1ii(r3);
            this.this$0.getAdapter().submitData(r0);
            return Unit.OXO1;
        L7:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(List<AIRecords> r1, Continuation<? super Unit> r2) {
            return ((AnonymousClass5) create(r1, r2)).invokeSuspend(Unit.OXO1);
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.ai_note.AiNoteActivity$initView$6, reason: invalid class name */
    @DebugMetadata(c = "com.sma.smartv3.ui.ai_note.AiNoteActivity$initView$6", f = "AiNoteActivity.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class AnonymousClass6 extends SuspendLambda implements Function2<OXO1, Continuation<? super Unit>, Object> {
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
        public final Object invoke2(OXO1 r1, Continuation<? super Unit> r2) {
            return ((AnonymousClass6) create(r1, r2)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r3) {
            OXO1 r0 = (OXO1) this.L$0;
            pb.I0iXXO();
            if (this.label != 0) goto L13;
            ResultKt.X1ii(r3);
            if ((r0 instanceof OXO1.XIi00iiXO) == false) goto L8;
            setRefreshing(false);
        L11:
            return Unit.OXO1;
        L8:
            if ((r0 instanceof OXO1.XO0O10) == false) goto L11;
            setRefreshing(true);
            goto L11
        L13:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(OXO1 r1, Continuation<? super Unit> r2) {
            return invoke2(r1, r2);
        }
    }

    public AiNoteActivity() {
        this.viewModel$delegate = LazyKt__LazyJVMKt.iO(new X0IOi00I(this));
        this.adapter = new AiNoteAdapter();
        this.currentType = AIFunctionType.AI_NOTE.getType();
    }

    public static /* synthetic */ AiNoteViewModel I0iXXO(AiNoteActivity r0) {
        return viewModel_delegate$lambda$0(r0);
    }

    public static /* synthetic */ void I1XOi1(AiNoteActivity r0, go0 r1, View r2) {
        showDeletePop$lambda$0$2(r0, r1, r2);
    }

    public static /* synthetic */ void O10IXXX0X(AiNoteActivity r0, View r1) {
        initView$lambda$3$0(r0, r1);
    }

    public static /* synthetic */ void OIX0iXi(AiNoteActivity r0) {
        initView$lambda$0(r0);
    }

    public static /* synthetic */ boolean X0O(AiNoteActivity r0) {
        return showDeletePop$lambda$0$1(r0);
    }

    public static /* synthetic */ void X1ii(AiNoteActivity r0, View r1) {
        initView$lambda$1(r0, r1);
    }

    public static /* synthetic */ boolean XXI() {
        return showDeletePop$lambda$0$0();
    }

    private final AiNoteViewModel getViewModel() {
        return (AiNoteViewModel) getValue();
    }

    private static final void initView$lambda$0(AiNoteActivity r1) {
        r1.getViewModel().getNotes(r1.currentType);
    }

    private static final void initView$lambda$1(AiNoteActivity r0, View r1) {
        r0.finish();
    }

    private static final void initView$lambda$3$0(AiNoteActivity r0, View r1) {
        r0.showDeletePop();
    }

    private final void showDeletePop() {
        final View r0 = getWindow().getDecorView().findViewById(R.id.content);
        int r4 = 0;
        final go0 r1 = new go0(this, r4, 2, null);
        r1.O1O(com.sma.smartv3.pro.R.string.tip);
        r1.iOO1ii1("是否删除所有记录");
        r1.I0iXXO(false);
        r1.iX1O1(Integer.valueOf(com.sma.smartv3.pro.R.string.cancel), new X11i1());
        r1.X1IX(com.sma.smartv3.pro.R.string.confirm, new i010OOII(this));
        r0.post(new OiI1(this, r1, r0));
    }

    private static final boolean showDeletePop$lambda$0$0() {
        return true;
    }

    private static final boolean showDeletePop$lambda$0$1(AiNoteActivity r1) {
        r1.getViewModel().deleteAllInfo();
        r1.adapter.clear();
        return true;
    }

    private static final void showDeletePop$lambda$0$2(AiNoteActivity r0, go0 r1, View r2) {
        if (r0.isDestroyed() == true) goto L6;
        Intrinsics.XXI(r2);
        r1.I1XOi1(r2);
        return;
    }

    private static final AiNoteViewModel viewModel_delegate$lambda$0(AiNoteActivity r1) {
        return (AiNoteViewModel) new ViewModelProvider(r1).get(AiNoteViewModel.class);
    }

    @aa1
    public final AiNoteAdapter getAdapter() {
        return this.adapter;
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void init(@tb1 Bundle r1) {
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public void initView() {
        if (getMArg1() <= 0) goto L5;
        int r0 = getMArg1();
    L6:
        this.currentType = r0;
        if (r0 != AIFunctionType.SIMULTANEOUS_INTERPRETATION.getType()) goto L10;
        int r1 = com.sma.smartv3.pro.R.string.interpretation_record;
    L9:
        String r2 = getString(r1);
        Intrinsics.XXI(r2);
        SwipeRefreshLayout r3 = (SwipeRefreshLayout) findViewById(com.sma.smartv3.pro.R.id.aiNoteSwipeRefreshLayout);
        r3.setOnRefreshListener(new X011O(this));
        ((RecyclerView) findViewById(com.sma.smartv3.pro.R.id.aiNoteRv)).setAdapter(this.adapter);
        ((ImageView) findViewById(com.sma.smartv3.pro.R.id.abh_title_left)).setOnClickListener(new Oi0I(this));
        ((TextView) findViewById(com.sma.smartv3.pro.R.id.abh_title_center)).setText(r2);
        ImageView r4 = (ImageView) findViewById(com.sma.smartv3.pro.R.id.abh_title_right);
        r4.setImageResource(com.sma.smartv3.pro.R.drawable.ic_delete);
        r4.setVisibility(0);
        r4.setOnClickListener(new XI0O1(this));
        ActivityUtilKt.XIi00iiXO(this, getViewModel().getAiNotesFLow(), null, new AnonymousClass5(this, null), 2, null);
        ActivityUtilKt.XIi00iiXO(this, getViewModel().getStateFlow(), null, new AnonymousClass6(r3, null), 2, null);
        getViewModel().getNotes(this.currentType);
        return;
    L10:
        r1 = com.sma.smartv3.pro.R.string.ai_note;
        goto L9
    L5:
        r0 = AIFunctionType.AI_NOTE.getType();
        goto L6
    }

    @Override // com.android.mltcode.paycertificationapi.k5
    public int layoutId() {
        return com.sma.smartv3.pro.R.layout.activity_ai_note;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        getViewModel().getNotes(this.currentType);
    }
}
