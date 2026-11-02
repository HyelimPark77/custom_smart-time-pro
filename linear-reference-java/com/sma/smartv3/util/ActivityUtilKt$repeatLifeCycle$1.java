package com.sma.smartv3.util;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.pb;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(c = "com.sma.smartv3.util.ActivityUtilKt$repeatLifeCycle$1", f = "ActivityUtil.kt", i = {}, l = {18}, m = "invokeSuspend", n = {}, s = {}, v = 1)
public final class ActivityUtilKt$repeatLifeCycle$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<i00OIXiO, Continuation<? super Unit>, Object> $block;
    final /* synthetic */ LifecycleOwner $this_repeatLifeCycle;
    int label;

    /* JADX INFO: renamed from: com.sma.smartv3.util.ActivityUtilKt$repeatLifeCycle$1$1, reason: invalid class name */
    @DebugMetadata(c = "com.sma.smartv3.util.ActivityUtilKt$repeatLifeCycle$1$1", f = "ActivityUtil.kt", i = {0}, l = {19}, m = "invokeSuspend", n = {"$this$repeatOnLifecycle"}, s = {"L$0"}, v = 1)
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<i00OIXiO, Continuation<? super Unit>, Object> $block;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Function2<? super i00OIXiO, ? super Continuation<? super Unit>, ? extends Object> r1, Continuation<? super AnonymousClass1> r2) {
            this.$block = r1;
            super(2, r2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
            AnonymousClass1 r0 = new AnonymousClass1(this.$block, r4);
            r0.L$0 = r3;
            return r0;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
            return ((AnonymousClass1) create(r1, r2)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object r5) {
            i00OIXiO r0 = (i00OIXiO) this.L$0;
            Object r1 = pb.I0iXXO();
            int r2 = this.label;
            if (r2 == 0) goto L8;
            if (r2 != 1) goto L7;
            ResultKt.X1ii(r5);
        L12:
            return Unit.OXO1;
        L7:
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        L8:
            ResultKt.X1ii(r5);
            Function2<i00OIXiO, Continuation<? super Unit>, Object> r6 = this.$block;
            this.L$0 = SpillingKt.OXO1(r0);
            this.label = 1;
            if (r6.invoke(r0, this) != r1) goto L12;
            return r1;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
            return invoke2(r1, r2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ActivityUtilKt$repeatLifeCycle$1(LifecycleOwner r1, Function2<? super i00OIXiO, ? super Continuation<? super Unit>, ? extends Object> r2, Continuation<? super ActivityUtilKt$repeatLifeCycle$1> r3) {
        this.$this_repeatLifeCycle = r1;
        this.$block = r2;
        super(2, r3);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
        return new ActivityUtilKt$repeatLifeCycle$1(this.$this_repeatLifeCycle, this.$block, r4);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
        return ((ActivityUtilKt$repeatLifeCycle$1) create(r1, r2)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object r7) {
        Object r0 = pb.I0iXXO();
        int r1 = this.label;
        if (r1 == 0) goto L8;
        if (r1 != 1) goto L7;
        ResultKt.X1ii(r7);
    L12:
        return Unit.OXO1;
    L7:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L8:
        ResultKt.X1ii(r7);
        LifecycleOwner r8 = this.$this_repeatLifeCycle;
        Lifecycle.State r2 = Lifecycle.State.STARTED;
        AnonymousClass1 r3 = new AnonymousClass1(this.$block, null);
        this.label = 1;
        if (RepeatOnLifecycleKt.repeatOnLifecycle(r8, r2, r3, this) != r0) goto L12;
        return r0;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
        return invoke2(r1, r2);
    }
}
