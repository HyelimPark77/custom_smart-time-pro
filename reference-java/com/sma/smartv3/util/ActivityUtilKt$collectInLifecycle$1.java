package com.sma.smartv3.util;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.ii0iIIX0;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(m39465c = "com.sma.smartv3.util.ActivityUtilKt$collectInLifecycle$1", m39466f = "ActivityUtil.kt", m39467i = {}, m39468l = {30}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
public final class ActivityUtilKt$collectInLifecycle$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<T, Continuation<? super Unit>, Object> $collector;
    final /* synthetic */ ii0iIIX0<T> $flow;
    final /* synthetic */ Lifecycle.State $state;
    final /* synthetic */ LifecycleOwner $this_collectInLifecycle;
    int label;

    /* JADX INFO: renamed from: com.sma.smartv3.util.ActivityUtilKt$collectInLifecycle$1$1 */
    @DebugMetadata(m39465c = "com.sma.smartv3.util.ActivityUtilKt$collectInLifecycle$1$1", m39466f = "ActivityUtil.kt", m39467i = {}, m39468l = {31}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
    public static final class C190451 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<T, Continuation<? super Unit>, Object> $collector;
        final /* synthetic */ ii0iIIX0<T> $flow;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C190451(ii0iIIX0<? extends T> ii0iiix0, Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super C190451> continuation) {
            super(2, continuation);
            this.$flow = ii0iiix0;
            this.$collector = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C190451(this.$flow, this.$collector, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
            return ((C190451) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.Continuation to com.sma.smartv3.util.ActivityUtilKt$collectInLifecycle$1$1 for r4v1 'this'  kotlin.coroutines.Continuation
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = com.android.mltcode.paycertificationapi.C2798pb.I0iXXO()
                int r1 = r4.label
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                kotlin.ResultKt.X1ii(r5)
                goto L2c
            Lf:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L17:
                kotlin.ResultKt.X1ii(r5)
                com.android.mltcode.paycertificationapi.ii0iIIX0<T> r5 = r4.$flow
                com.sma.smartv3.util.ActivityUtilKt$OXO1 r1 = new com.sma.smartv3.util.ActivityUtilKt$OXO1
                kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r3 = r4.$collector
                r1.<init>(r3)
                r4.label = r2
                java.lang.Object r5 = r5.collect(r1, r4)
                if (r5 != r0) goto L2c
                return r0
            L2c:
                kotlin.Unit r5 = kotlin.Unit.OXO1
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sma.smartv3.util.ActivityUtilKt$collectInLifecycle$1.C190451.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ActivityUtilKt$collectInLifecycle$1(LifecycleOwner lifecycleOwner, Lifecycle.State state, ii0iIIX0<? extends T> ii0iiix0, Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super ActivityUtilKt$collectInLifecycle$1> continuation) {
        super(2, continuation);
        this.$this_collectInLifecycle = lifecycleOwner;
        this.$state = state;
        this.$flow = ii0iiix0;
        this.$collector = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ActivityUtilKt$collectInLifecycle$1(this.$this_collectInLifecycle, this.$state, this.$flow, this.$collector, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
        return ((ActivityUtilKt$collectInLifecycle$1) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objI0iXXO = C2798pb.I0iXXO();
        int i = this.label;
        if (i == 0) {
            ResultKt.X1ii(obj);
            Lifecycle lifecycle = this.$this_collectInLifecycle.getLifecycle();
            Lifecycle.State state = this.$state;
            C190451 c190451 = new C190451(this.$flow, this.$collector, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycle, state, c190451, this) == objI0iXXO) {
                return objI0iXXO;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.X1ii(obj);
        }
        return Unit.OXO1;
    }
}
