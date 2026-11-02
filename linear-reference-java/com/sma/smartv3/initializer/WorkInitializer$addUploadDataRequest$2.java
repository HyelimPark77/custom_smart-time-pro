package com.sma.smartv3.initializer;

import androidx.concurrent.futures.ListenableFutureKt;
import androidx.work.Operation;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.pb;
import com.google.common.util.concurrent.ListenableFuture;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@DebugMetadata(c = "com.sma.smartv3.initializer.WorkInitializer$addUploadDataRequest$2", f = "WorkInitializer.kt", i = {0, 0}, l = {124}, m = "invokeSuspend", n = {"$this$await$iv", "$i$f$await"}, s = {"L$0", "I$0"}, v = 1)
@SourceDebugExtension({"SMAP\nWorkInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkInitializer.kt\ncom/sma/smartv3/initializer/WorkInitializer$addUploadDataRequest$2\n+ 2 Operation.kt\nandroidx/work/OperationKt\n*L\n1#1,123:1\n36#2:124\n*S KotlinDebug\n*F\n+ 1 WorkInitializer.kt\ncom/sma/smartv3/initializer/WorkInitializer$addUploadDataRequest$2\n*L\n91#1:124\n*E\n"})
public final class WorkInitializer$addUploadDataRequest$2 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    final /* synthetic */ Operation $operation;
    int I$0;
    Object L$0;
    Object L$1;
    int label;

    public WorkInitializer$addUploadDataRequest$2(Operation r1, Continuation<? super WorkInitializer$addUploadDataRequest$2> r2) {
        this.$operation = r1;
        super(2, r2);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r2, Continuation<?> r3) {
        return new WorkInitializer$addUploadDataRequest$2(this.$operation, r3);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
        return ((WorkInitializer$addUploadDataRequest$2) create(r1, r2)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object r6) {
        Object r0 = pb.I0iXXO();
        int r1 = this.label;
        if (r1 == 0) goto L8;
        if (r1 != 1) goto L7;
        i1O0OXO1O r2 = (i1O0OXO1O) this.L$1;
        Operation r3 = (Operation) this.L$0;
        ResultKt.X1ii(r6);
    L12:
        Intrinsics.O10IXXX0X(r6, "result.await()");
        r2.OXO1("WorkInitializer initialize : value = " + r6);
        return Unit.OXO1;
    L7:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L8:
        ResultKt.X1ii(r6);
        i1O0OXO1O r7 = i1O0OXO1O.OXO1;
        Operation r4 = this.$operation;
        ListenableFuture<Operation.State.SUCCESS> r5 = r4.getResult();
        Intrinsics.O10IXXX0X(r5, "result");
        this.L$0 = SpillingKt.OXO1(r4);
        this.L$1 = r7;
        this.I$0 = 0;
        this.label = 1;
        Object r8 = ListenableFutureKt.await(r5, this);
        if (r8 != r0) goto L11;
        return r0;
    L11:
        r2 = r7;
        r6 = r8;
        goto L12
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
        return invoke2(r1, r2);
    }
}
