package com.sma.smartv3.util;

import com.android.mltcode.paycertificationapi.IXiXI;
import com.android.mltcode.paycertificationapi.pb;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(c = "com.sma.smartv3.util.TimeUtil$audioTimeFlow$1$1", f = "TimeUtil.kt", i = {0, 0, 1, 1}, l = {26, 28}, m = "invokeSuspend", n = {"$this$flow", "elapsed", "$this$flow", "elapsed"}, s = {"L$0", "J$0", "L$0", "J$0"}, v = 1)
public final class TimeUtil$audioTimeFlow$1$1 extends SuspendLambda implements Function2<IXiXI<? super String>, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $interval;
    long J$0;
    private /* synthetic */ Object L$0;
    int label;

    public TimeUtil$audioTimeFlow$1$1(long r1, Continuation<? super TimeUtil$audioTimeFlow$1$1> r3) {
        this.$interval = r1;
        super(2, r3);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r4, Continuation<?> r5) {
        TimeUtil$audioTimeFlow$1$1 r0 = new TimeUtil$audioTimeFlow$1$1(this.$interval, r5);
        r0.L$0 = r4;
        return r0;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(IXiXI<? super String> r1, Continuation<? super Unit> r2) {
        return ((TimeUtil$audioTimeFlow$1$1) create(r1, r2)).invokeSuspend(Unit.OXO1);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004d -> B:11:0x002b). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object r10) {
        IXiXI r0 = (IXiXI) this.L$0;
        Object r1 = pb.I0iXXO();
        int r2 = this.label;
        if (r2 == 0) goto L10;
        if (r2 == 1) goto L9;
        if (r2 != 2) goto L8;
        long r5 = this.J$0;
        ResultKt.X1ii(r10);
    L11:
        long r7 = this.$interval;
        this.L$0 = r0;
        this.J$0 = r5;
        this.label = 1;
        if (DelayKt.XIi00iiXO(r7, this) == r1) goto L16;
    L14:
        r5 = r5 + this.$interval;
        String r11 = TimeUtil.OXO1.O00(r5);
        this.L$0 = r0;
        this.J$0 = r5;
        this.label = 2;
        if (r0.emit(r11, this) != r1) goto L11;
    L16:
        return r1;
    L8:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L9:
        r5 = this.J$0;
        ResultKt.X1ii(r10);
        goto L14
    L10:
        ResultKt.X1ii(r10);
        r5 = 0;
        goto L11
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(IXiXI<? super String> r1, Continuation<? super Unit> r2) {
        return invoke2(r1, r2);
    }
}
