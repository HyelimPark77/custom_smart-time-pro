package com.sma.smartv3.util;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.ii0iIIX0;
import com.android.mltcode.paycertificationapi.pb;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(c = "com.sma.smartv3.util.ActivityUtilKt$collectInLifecycle$1", f = "ActivityUtil.kt", i = {}, l = {30}, m = "invokeSuspend", n = {}, s = {}, v = 1)
public final class ActivityUtilKt$collectInLifecycle$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<T, Continuation<? super Unit>, Object> $collector;
    final /* synthetic */ ii0iIIX0<T> $flow;
    final /* synthetic */ Lifecycle.State $state;
    final /* synthetic */ LifecycleOwner $this_collectInLifecycle;
    int label;

    /* JADX INFO: renamed from: com.sma.smartv3.util.ActivityUtilKt$collectInLifecycle$1$1, reason: invalid class name */
    @DebugMetadata(c = "com.sma.smartv3.util.ActivityUtilKt$collectInLifecycle$1$1", f = "ActivityUtil.kt", i = {}, l = {31}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<T, Continuation<? super Unit>, Object> $collector;
        final /* synthetic */ ii0iIIX0<T> $flow;
        int label;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(ii0iIIX0<? extends T> r1, Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> r2, Continuation<? super AnonymousClass1> r3) {
            this.$flow = r1;
            this.$collector = r2;
            super(2, r3);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
            return new AnonymousClass1(this.$flow, this.$collector, r4);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
            return ((AnonymousClass1) create(r1, r2)).invokeSuspend(Unit.OXO1);
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
            java.lang.Object r0 = com.android.mltcode.paycertificationapi.pb.I0iXXO();
            int r1 = r4.label;
            if (r1 == 0) goto L8;
            if (r1 != 1) goto L6;
            kotlin.ResultKt.X1ii(r5);
        L11:
            kotlin.Unit r5 = kotlin.Unit.OXO1;
            return r5;
        L6:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw r5;
        L8:
            kotlin.ResultKt.X1ii(r5);
            com.android.mltcode.paycertificationapi.ii0iIIX0<T> r5 = r4.$flow;
            kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r3 = r4.$collector;
            com.sma.smartv3.util.ActivityUtilKt.OXO1 r1 = new com.sma.smartv3.util.ActivityUtilKt.OXO1(r3);
            r4.label = 1;
            com.sma.smartv3.util.ActivityUtilKt.OXO1 r1 = r1;
            kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation<? super kotlin.Unit>) r4;
            java.lang.Object r5 = r5.collect(r1, r4);
            if (r5 != r0) goto L11;
            return r0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
            return invoke2(r1, r2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ActivityUtilKt$collectInLifecycle$1(LifecycleOwner r1, Lifecycle.State r2, ii0iIIX0<? extends T> r3, Function2<? super T, ? super Continuation<? super Unit>, ? extends Object> r4, Continuation<? super ActivityUtilKt$collectInLifecycle$1> r5) {
        this.$this_collectInLifecycle = r1;
        this.$state = r2;
        this.$flow = r3;
        this.$collector = r4;
        super(2, r5);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r7, Continuation<?> r8) {
        return new ActivityUtilKt$collectInLifecycle$1(this.$this_collectInLifecycle, this.$state, this.$flow, this.$collector, r8);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
        return ((ActivityUtilKt$collectInLifecycle$1) create(r1, r2)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object r8) {
        Object r0 = pb.I0iXXO();
        int r1 = this.label;
        if (r1 == 0) goto L8;
        if (r1 != 1) goto L7;
        ResultKt.X1ii(r8);
    L12:
        return Unit.OXO1;
    L7:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L8:
        ResultKt.X1ii(r8);
        Lifecycle r9 = getLifecycle();
        Lifecycle.State r2 = this.$state;
        AnonymousClass1 r3 = new AnonymousClass1(this.$flow, this.$collector, null);
        this.label = 1;
        if (RepeatOnLifecycleKt.repeatOnLifecycle(r9, r2, r3, this) != r0) goto L12;
        return r0;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
        return invoke2(r1, r2);
    }
}
