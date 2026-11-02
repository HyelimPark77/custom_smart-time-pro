package com.sma.smartv3.p610ui.status;

import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(m39465c = "com.sma.smartv3.ui.status.MainStatusFragment$autoSyncData$1$run$1", m39466f = "MainStatusFragment.kt", m39467i = {}, m39468l = {401}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
public final class MainStatusFragment$autoSyncData$1$run$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ MainStatusFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainStatusFragment$autoSyncData$1$run$1(MainStatusFragment mainStatusFragment, Continuation<? super MainStatusFragment$autoSyncData$1$run$1> continuation) {
        super(2, continuation);
        this.this$0 = mainStatusFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MainStatusFragment$autoSyncData$1$run$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
        return ((MainStatusFragment$autoSyncData$1$run$1) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objI0iXXO = C2798pb.I0iXXO();
        int i = this.label;
        if (i == 0) {
            ResultKt.X1ii(obj);
            this.this$0.getRefreshLayout().setRefreshing(true);
            this.label = 1;
            if (DelayKt.XIi00iiXO(2000L, this) == objI0iXXO) {
                return objI0iXXO;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.X1ii(obj);
        }
        this.this$0.getRefreshLayout().setRefreshing(false);
        return Unit.OXO1;
    }
}
