package com.sma.smartv3.ui.status;

import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.pb;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(c = "com.sma.smartv3.ui.status.MainStatusFragment$autoSyncData$1$run$1", f = "MainStatusFragment.kt", i = {}, l = {401}, m = "invokeSuspend", n = {}, s = {}, v = 1)
public final class MainStatusFragment$autoSyncData$1$run$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    int label;
    final /* synthetic */ MainStatusFragment this$0;

    public MainStatusFragment$autoSyncData$1$run$1(MainStatusFragment r1, Continuation<? super MainStatusFragment$autoSyncData$1$run$1> r2) {
        this.this$0 = r1;
        super(2, r2);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r2, Continuation<?> r3) {
        return new MainStatusFragment$autoSyncData$1$run$1(this.this$0, r3);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
        return ((MainStatusFragment$autoSyncData$1$run$1) create(r1, r2)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object r4) {
        Object r0 = pb.I0iXXO();
        int r1 = this.label;
        if (r1 == 0) goto L8;
        if (r1 != 1) goto L7;
        ResultKt.X1ii(r4);
    L11:
        this.this$0.getRefreshLayout().setRefreshing(false);
        return Unit.OXO1;
    L7:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L8:
        ResultKt.X1ii(r4);
        this.this$0.getRefreshLayout().setRefreshing(true);
        this.label = 1;
        if (DelayKt.XIi00iiXO(2000, this) != r0) goto L11;
        return r0;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
        return invoke2(r1, r2);
    }
}
