package com.sma.smartv3.util;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(m39465c = "com.sma.smartv3.util.ActivityUtilKt$repeatLifeCycle$1", m39466f = "ActivityUtil.kt", m39467i = {}, m39468l = {18}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
public final class ActivityUtilKt$repeatLifeCycle$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function2<i00OIXiO, Continuation<? super Unit>, Object> $block;
    final /* synthetic */ LifecycleOwner $this_repeatLifeCycle;
    int label;

    /* JADX INFO: renamed from: com.sma.smartv3.util.ActivityUtilKt$repeatLifeCycle$1$1 */
    @DebugMetadata(m39465c = "com.sma.smartv3.util.ActivityUtilKt$repeatLifeCycle$1$1", m39466f = "ActivityUtil.kt", m39467i = {0}, m39468l = {19}, m39469m = "invokeSuspend", m39470n = {"$this$repeatOnLifecycle"}, m39472s = {"L$0"}, m39473v = 1)
    public static final class C190461 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<i00OIXiO, Continuation<? super Unit>, Object> $block;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C190461(Function2<? super i00OIXiO, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super C190461> continuation) {
            super(2, continuation);
            this.$block = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C190461 c190461 = new C190461(this.$block, continuation);
            c190461.L$0 = obj;
            return c190461;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
            return ((C190461) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            i00OIXiO i00oixio = (i00OIXiO) this.L$0;
            Object objI0iXXO = C2798pb.I0iXXO();
            int i = this.label;
            if (i == 0) {
                ResultKt.X1ii(obj);
                Function2<i00OIXiO, Continuation<? super Unit>, Object> function2 = this.$block;
                this.L$0 = SpillingKt.OXO1(i00oixio);
                this.label = 1;
                if (function2.invoke2(i00oixio, this) == objI0iXXO) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ActivityUtilKt$repeatLifeCycle$1(LifecycleOwner lifecycleOwner, Function2<? super i00OIXiO, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super ActivityUtilKt$repeatLifeCycle$1> continuation) {
        super(2, continuation);
        this.$this_repeatLifeCycle = lifecycleOwner;
        this.$block = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ActivityUtilKt$repeatLifeCycle$1(this.$this_repeatLifeCycle, this.$block, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
        return ((ActivityUtilKt$repeatLifeCycle$1) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objI0iXXO = C2798pb.I0iXXO();
        int i = this.label;
        if (i == 0) {
            ResultKt.X1ii(obj);
            LifecycleOwner lifecycleOwner = this.$this_repeatLifeCycle;
            Lifecycle.State state = Lifecycle.State.STARTED;
            C190461 c190461 = new C190461(this.$block, null);
            this.label = 1;
            if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycleOwner, state, c190461, this) == objI0iXXO) {
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
