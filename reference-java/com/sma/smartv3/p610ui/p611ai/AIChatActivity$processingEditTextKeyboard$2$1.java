package com.sma.smartv3.p610ui.p611ai;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.i00OIXiO;
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
@DebugMetadata(m39465c = "com.sma.smartv3.ui.ai.AIChatActivity$processingEditTextKeyboard$2$1", m39466f = "AIChatActivity.kt", m39467i = {1, 1}, m39468l = {174, 194}, m39469m = "invokeSuspend", m39470n = {"$this$invokeSuspend_u24lambda_u240", "$i$a$-run-AIChatActivity$processingEditTextKeyboard$2$1$1"}, m39472s = {"L$1", "I$0"}, m39473v = 1)
public final class AIChatActivity$processingEditTextKeyboard$2$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $keyboardHeight;
    final /* synthetic */ Ref.IntRef $recyclerViewHeight;
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ AIChatActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AIChatActivity$processingEditTextKeyboard$2$1(AIChatActivity aIChatActivity, int i, Ref.IntRef intRef, Continuation<? super AIChatActivity$processingEditTextKeyboard$2$1> continuation) {
        super(2, continuation);
        this.this$0 = aIChatActivity;
        this.$keyboardHeight = i;
        this.$recyclerViewHeight = intRef;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AIChatActivity$processingEditTextKeyboard$2$1(this.this$0, this.$keyboardHeight, this.$recyclerViewHeight, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
        return ((AIChatActivity$processingEditTextKeyboard$2$1) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:46:0x00cf  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AIChatActivity aIChatActivity;
        MultiItemTypeAdapter multiItemTypeAdapter;
        Object objI0iXXO = C2798pb.I0iXXO();
        int i = this.label;
        MultiItemTypeAdapter multiItemTypeAdapter2 = null;
        if (i == 0) {
            ResultKt.X1ii(obj);
            this.label = 1;
            if (DelayKt.XIi00iiXO(50L, this) != objI0iXXO) {
            }
            return objI0iXXO;
        }
        if (i == 1) {
            ResultKt.X1ii(obj);
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aIChatActivity = (AIChatActivity) this.L$0;
            ResultKt.X1ii(obj);
        }
        RecyclerView mRecyclerView = aIChatActivity.getMRecyclerView();
        multiItemTypeAdapter = aIChatActivity.mAdapter;
        if (multiItemTypeAdapter == null) {
            Intrinsics.XXO("mAdapter");
        } else {
            multiItemTypeAdapter2 = multiItemTypeAdapter;
        }
        List datas = multiItemTypeAdapter2.getDatas();
        Intrinsics.O10IXXX0X(datas, "getDatas(...)");
        mRecyclerView.smoothScrollToPosition(CollectionsKt__CollectionsKt.X11iII1O1(datas));
        return Unit.OXO1;
        View viewKeyboardHeight = this.this$0.getViewKeyboardHeight();
        if (viewKeyboardHeight != null) {
            int i2 = this.$keyboardHeight;
            AIChatActivity aIChatActivity2 = this.this$0;
            Ref.IntRef intRef = this.$recyclerViewHeight;
            if (i2 <= 0) {
                viewKeyboardHeight.getLayoutParams().height = i2;
                viewKeyboardHeight.requestLayout();
                return Unit.OXO1;
            }
            if (aIChatActivity2.getMRecyclerView().getHeight() != intRef.element) {
                return Unit.OXO1;
            }
            viewKeyboardHeight.getLayoutParams().height = i2;
            viewKeyboardHeight.requestLayout();
            MultiItemTypeAdapter multiItemTypeAdapter3 = aIChatActivity2.mAdapter;
            if (multiItemTypeAdapter3 == null) {
                Intrinsics.XXO("mAdapter");
                multiItemTypeAdapter3 = null;
            }
            if (multiItemTypeAdapter3.getDatas().isEmpty()) {
                return Unit.OXO1;
            }
            MultiItemTypeAdapter multiItemTypeAdapter4 = aIChatActivity2.mAdapter;
            if (multiItemTypeAdapter4 == null) {
                Intrinsics.XXO("mAdapter");
                multiItemTypeAdapter4 = null;
            }
            if (multiItemTypeAdapter4.getItemCount() > 4) {
                RecyclerView mRecyclerView2 = aIChatActivity2.getMRecyclerView();
                MultiItemTypeAdapter multiItemTypeAdapter5 = aIChatActivity2.mAdapter;
                if (multiItemTypeAdapter5 == null) {
                    Intrinsics.XXO("mAdapter");
                    multiItemTypeAdapter5 = null;
                }
                mRecyclerView2.scrollToPosition(multiItemTypeAdapter5.getItemCount() - 3);
            }
            this.L$0 = aIChatActivity2;
            this.L$1 = SpillingKt.OXO1(viewKeyboardHeight);
            this.I$0 = 0;
            this.label = 2;
            if (DelayKt.XIi00iiXO(50L, this) != objI0iXXO) {
                aIChatActivity = aIChatActivity2;
                RecyclerView mRecyclerView3 = aIChatActivity.getMRecyclerView();
                multiItemTypeAdapter = aIChatActivity.mAdapter;
                if (multiItemTypeAdapter == null) {
                    Intrinsics.XXO("mAdapter");
                } else {
                    multiItemTypeAdapter2 = multiItemTypeAdapter;
                }
                List datas2 = multiItemTypeAdapter2.getDatas();
                Intrinsics.O10IXXX0X(datas2, "getDatas(...)");
                mRecyclerView3.smoothScrollToPosition(CollectionsKt__CollectionsKt.X11iII1O1(datas2));
            }
            return objI0iXXO;
        }
        return Unit.OXO1;
    }
}
