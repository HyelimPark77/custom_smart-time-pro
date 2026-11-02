package com.sma.smartv3.util;

import com.android.mltcode.paycertificationapi.IXiXI;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.iX0XiO;
import com.android.mltcode.paycertificationapi.ii0iIIX0;
import com.android.mltcode.paycertificationapi.pb;
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
@DebugMetadata(c = "com.sma.smartv3.util.TimeUtil$audioTimeFlow$$inlined$flatMapLatest$1", f = "TimeUtil.kt", i = {0, 0}, l = {189}, m = "invokeSuspend", n = {"$this$transformLatest", "it"}, s = {"L$0", "L$1"}, v = 1)
@SourceDebugExtension({"SMAP\nMerge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt$flatMapLatest$1\n+ 2 TimeUtil.kt\ncom/sma/smartv3/util/TimeUtil\n*L\n1#1,214:1\n22#2,9:215\n*E\n"})
public final class TimeUtil$audioTimeFlow$$inlined$flatMapLatest$1 extends SuspendLambda implements Function3<IXiXI<? super String>, Boolean, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $interval$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    public TimeUtil$audioTimeFlow$$inlined$flatMapLatest$1(Continuation r1, long r2) {
        this.$interval$inlined = r2;
        super(3, r1);
    }

    @tb1
    public final Object invoke(@aa1 IXiXI<? super String> r4, Boolean r5, @tb1 Continuation<? super Unit> r6) {
        TimeUtil$audioTimeFlow$$inlined$flatMapLatest$1 r0 = new TimeUtil$audioTimeFlow$$inlined$flatMapLatest$1(r6, this.$interval$inlined);
        r0.L$0 = r4;
        r0.L$1 = r5;
        return r0.invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @tb1
    public final Object invokeSuspend(@aa1 Object r8) {
        Object r0 = pb.I0iXXO();
        int r1 = this.label;
        if (r1 == 0) goto L8;
        if (r1 != 1) goto L7;
        IXiXI r2 = (IXiXI) this.L$0;
        ResultKt.X1ii(r8);
    L16:
        return Unit.OXO1;
    L7:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L8:
        ResultKt.X1ii(r8);
        IXiXI r9 = (IXiXI) this.L$0;
        Object r3 = this.L$1;
        if (((Boolean) r3).booleanValue() == true) goto L11;
        ii0iIIX0 r4 = iX0XiO.Ii0i();
    L12:
        this.L$0 = SpillingKt.OXO1(r9);
        this.L$1 = SpillingKt.OXO1(r3);
        this.label = 1;
        if (iX0XiO.IXOIIIO(r9, r4, this) != r0) goto L16;
        return r0;
    L11:
        r4 = iX0XiO.X00O0(new TimeUtil$audioTimeFlow$1$1(this.$interval$inlined, null));
        goto L12
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(IXiXI<? super String> r1, Boolean r2, Continuation<? super Unit> r3) {
        return invoke(r1, r2, r3);
    }
}
