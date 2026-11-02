package com.sma.smartv3.util;

import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.IXiXI;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.iX0XiO;
import com.android.mltcode.paycertificationapi.ii0iIIX0;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(m39465c = "com.sma.smartv3.util.TimeUtil$audioTimeFlow$$inlined$flatMapLatest$1", m39466f = "TimeUtil.kt", m39467i = {0, 0}, m39468l = {189}, m39469m = "invokeSuspend", m39470n = {"$this$transformLatest", "it"}, m39472s = {"L$0", "L$1"}, m39473v = 1)
@SourceDebugExtension({"SMAP\nMerge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1\n+ 2 TimeUtil.kt\ncom/sma/smartv3/util/TimeUtil\n*L\n1#1,214:1\n22#2,9:215\n*E\n"})
public final class TimeUtil$audioTimeFlow$$inlined$flatMapLatest$1 extends SuspendLambda implements Function3<IXiXI<? super String>, Boolean, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $interval$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimeUtil$audioTimeFlow$$inlined$flatMapLatest$1(Continuation continuation, long j) {
        super(3, continuation);
        this.$interval$inlined = j;
    }

    @Override // kotlin.jvm.functions.Function3
    @tb1
    public final Object invoke(@aa1 IXiXI<? super String> iXiXI, Boolean bool, @tb1 Continuation<? super Unit> continuation) {
        TimeUtil$audioTimeFlow$$inlined$flatMapLatest$1 timeUtil$audioTimeFlow$$inlined$flatMapLatest$1 = new TimeUtil$audioTimeFlow$$inlined$flatMapLatest$1(continuation, this.$interval$inlined);
        timeUtil$audioTimeFlow$$inlined$flatMapLatest$1.L$0 = iXiXI;
        timeUtil$audioTimeFlow$$inlined$flatMapLatest$1.L$1 = bool;
        return timeUtil$audioTimeFlow$$inlined$flatMapLatest$1.invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @tb1
    public final Object invokeSuspend(@aa1 Object obj) {
        Object objI0iXXO = C2798pb.I0iXXO();
        int i = this.label;
        if (i == 0) {
            ResultKt.X1ii(obj);
            IXiXI iXiXI = (IXiXI) this.L$0;
            Object obj2 = this.L$1;
            ii0iIIX0 ii0iiix0Ii0i = !((Boolean) obj2).booleanValue() ? iX0XiO.Ii0i() : iX0XiO.X00O0(new TimeUtil$audioTimeFlow$1$1(this.$interval$inlined, null));
            this.L$0 = SpillingKt.OXO1(iXiXI);
            this.L$1 = SpillingKt.OXO1(obj2);
            this.label = 1;
            if (iX0XiO.IXOIIIO(iXiXI, ii0iiix0Ii0i, this) == objI0iXXO) {
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
