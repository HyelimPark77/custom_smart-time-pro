package com.sma.smartv3.ui.ai;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.pb;
import com.bestmafen.androidbase.adapter.recyclerview.MultiItemTypeAdapter;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: classes19.dex */
@DebugMetadata(c = "com.sma.smartv3.ui.ai.AIChatActivity$processingEditTextKeyboard$2$1", f = "AIChatActivity.kt", i = {1, 1}, l = {174, 194}, m = "invokeSuspend", n = {"$this$invokeSuspend_u24lambda_u240", "$i$a$-run-AIChatActivity$processingEditTextKeyboard$2$1$1"}, s = {"L$1", "I$0"}, v = 1)
public final class AIChatActivity$processingEditTextKeyboard$2$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $keyboardHeight;
    final /* synthetic */ Ref.IntRef $recyclerViewHeight;
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ AIChatActivity this$0;

    public AIChatActivity$processingEditTextKeyboard$2$1(AIChatActivity r1, int r2, Ref.IntRef r3, Continuation<? super AIChatActivity$processingEditTextKeyboard$2$1> r4) {
        this.this$0 = r1;
        this.$keyboardHeight = r2;
        this.$recyclerViewHeight = r3;
        super(2, r4);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r4, Continuation<?> r5) {
        return new AIChatActivity$processingEditTextKeyboard$2$1(this.this$0, this.$keyboardHeight, this.$recyclerViewHeight, r5);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
        return ((AIChatActivity$processingEditTextKeyboard$2$1) create(r1, r2)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object r11) {
        Object r0 = pb.I0iXXO();
        int r1 = this.label;
        MultiItemTypeAdapter r6 = null;
        if (r1 == 0) goto L10;
        if (r1 == 1) goto L9;
        if (r1 != 2) goto L8;
        View r2 = (View) this.L$1;
        AIChatActivity r3 = (AIChatActivity) this.L$0;
        ResultKt.X1ii(r11);
    L43:
        RecyclerView r12 = AIChatActivity.access$getMRecyclerView(r3);
        MultiItemTypeAdapter r4 = AIChatActivity.access$getMAdapter$p(r3);
        if (r4 != null) goto L46;
        Intrinsics.XXO("mAdapter");
    L47:
        List r5 = r6.getDatas();
        Intrinsics.O10IXXX0X(r5, "getDatas(...)");
        r12.smoothScrollToPosition(CollectionsKt__CollectionsKt.X11iII1O1(r5));
    L49:
        return Unit.OXO1;
    L46:
        r6 = r4;
        goto L47
    L8:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L9:
        ResultKt.X1ii(r11);
    L13:
        View r13 = AIChatActivity.access$getViewKeyboardHeight(this.this$0);
        if (r13 == null) goto L49;
        int r7 = this.$keyboardHeight;
        AIChatActivity r8 = this.this$0;
        Ref.IntRef r9 = this.$recyclerViewHeight;
        if (r7 > 0) goto L20;
        r13.getLayoutParams().height = r7;
        r13.requestLayout();
        return Unit.OXO1;
    L20:
        if (AIChatActivity.access$getMRecyclerView(r8).getHeight() != r9.element) goto L22;
        r13.getLayoutParams().height = r7;
        r13.requestLayout();
        MultiItemTypeAdapter r10 = AIChatActivity.access$getMAdapter$p(r8);
        if (r10 != null) goto L27;
        Intrinsics.XXO("mAdapter");
        r10 = null;
    L27:
        if (r10.getDatas().isEmpty() == true) goto L29;
        MultiItemTypeAdapter r14 = AIChatActivity.access$getMAdapter$p(r8);
        if (r14 != null) goto L34;
        Intrinsics.XXO("mAdapter");
        r14 = null;
    L34:
        if (r14.getItemCount() <= 4) goto L39;
        RecyclerView r15 = AIChatActivity.access$getMRecyclerView(r8);
        MultiItemTypeAdapter r16 = AIChatActivity.access$getMAdapter$p(r8);
        if (r16 != null) goto L38;
        Intrinsics.XXO("mAdapter");
        r16 = null;
    L38:
        r15.scrollToPosition(r16.getItemCount() - 3);
    L39:
        this.L$0 = r8;
        this.L$1 = SpillingKt.OXO1(r13);
        this.I$0 = 0;
        this.label = 2;
        if (DelayKt.XIi00iiXO(50, this) != r0) goto L42;
    L41:
        return r0;
    L42:
        r3 = r8;
        goto L43
    L29:
        return Unit.OXO1;
    L22:
        return Unit.OXO1;
    L10:
        ResultKt.X1ii(r11);
        this.label = 1;
        if (DelayKt.XIi00iiXO(50, this) != r0) goto L13;
        goto L13
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
        return invoke2(r1, r2);
    }
}
