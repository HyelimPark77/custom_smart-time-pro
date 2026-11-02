package com.sma.smartv3.initializer;

import androidx.concurrent.futures.ListenableFutureKt;
import androidx.work.Operation;
import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
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
@DebugMetadata(m39465c = "com.sma.smartv3.initializer.WorkInitializer$addUploadDataRequest$2", m39466f = "WorkInitializer.kt", m39467i = {0, 0}, m39468l = {124}, m39469m = "invokeSuspend", m39470n = {"$this$await$iv", "$i$f$await"}, m39472s = {"L$0", "I$0"}, m39473v = 1)
@SourceDebugExtension({"SMAP\nWorkInitializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkInitializer.kt\ncom/sma/smartv3/initializer/WorkInitializer$addUploadDataRequest$2\n+ 2 Operation.kt\nandroidx/work/OperationKt\n*L\n1#1,123:1\n36#2:124\n*S KotlinDebug\n*F\n+ 1 WorkInitializer.kt\ncom/sma/smartv3/initializer/WorkInitializer$addUploadDataRequest$2\n*L\n91#1:124\n*E\n"})
public final class WorkInitializer$addUploadDataRequest$2 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    final /* synthetic */ Operation $operation;
    int I$0;
    Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WorkInitializer$addUploadDataRequest$2(Operation operation, Continuation<? super WorkInitializer$addUploadDataRequest$2> continuation) {
        super(2, continuation);
        this.$operation = operation;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WorkInitializer$addUploadDataRequest$2(this.$operation, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
        return ((WorkInitializer$addUploadDataRequest$2) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        i1O0OXO1O i1o0oxo1o;
        Object objI0iXXO = C2798pb.I0iXXO();
        int i = this.label;
        if (i == 0) {
            ResultKt.X1ii(obj);
            i1O0OXO1O i1o0oxo1o2 = i1O0OXO1O.OXO1;
            Operation operation = this.$operation;
            ListenableFuture<Operation.State.SUCCESS> result = operation.getResult();
            Intrinsics.O10IXXX0X(result, "result");
            this.L$0 = SpillingKt.OXO1(operation);
            this.L$1 = i1o0oxo1o2;
            this.I$0 = 0;
            this.label = 1;
            Object objAwait = ListenableFutureKt.await(result, this);
            if (objAwait == objI0iXXO) {
                return objI0iXXO;
            }
            i1o0oxo1o = i1o0oxo1o2;
            obj = objAwait;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i1o0oxo1o = (i1O0OXO1O) this.L$1;
            ResultKt.X1ii(obj);
        }
        Intrinsics.O10IXXX0X(obj, "result.await()");
        i1o0oxo1o.OXO1("WorkInitializer initialize : value = " + obj);
        return Unit.OXO1;
    }
}
