package com.sma.smartv3.util;

import com.android.mltcode.paycertificationapi.IXiXI;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(m39465c = "com.sma.smartv3.util.TimeUtil$audioTimeFlow$1$1", m39466f = "TimeUtil.kt", m39467i = {0, 0, 1, 1}, m39468l = {26, 28}, m39469m = "invokeSuspend", m39470n = {"$this$flow", "elapsed", "$this$flow", "elapsed"}, m39472s = {"L$0", "J$0", "L$0", "J$0"}, m39473v = 1)
public final class TimeUtil$audioTimeFlow$1$1 extends SuspendLambda implements Function2<IXiXI<? super String>, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $interval;
    long J$0;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimeUtil$audioTimeFlow$1$1(long j, Continuation<? super TimeUtil$audioTimeFlow$1$1> continuation) {
        super(2, continuation);
        this.$interval = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        TimeUtil$audioTimeFlow$1$1 timeUtil$audioTimeFlow$1$1 = new TimeUtil$audioTimeFlow$1$1(this.$interval, continuation);
        timeUtil$audioTimeFlow$1$1.L$0 = obj;
        return timeUtil$audioTimeFlow$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(IXiXI<? super String> iXiXI, Continuation<? super Unit> continuation) {
        return ((TimeUtil$audioTimeFlow$1$1) create(iXiXI, continuation)).invokeSuspend(Unit.OXO1);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002b A[PHI: r5
  0x002b: PHI (r5v3 long) = (r5v0 long), (r5v2 long), (r5v5 long) binds: [B:10:0x0026, B:15:0x004d, B:6:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x003a A[PHI: r5
  0x003a: PHI (r5v1 long) = (r5v3 long), (r5v4 long) binds: [B:12:0x0037, B:9:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004d -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.L$0
            com.android.mltcode.paycertificationapi.IXiXI r0 = (com.android.mltcode.paycertificationapi.IXiXI) r0
            java.lang.Object r1 = com.android.mltcode.paycertificationapi.C2798pb.I0iXXO()
            int r2 = r9.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L26
            if (r2 == r4) goto L20
            if (r2 != r3) goto L18
            long r5 = r9.J$0
            kotlin.ResultKt.X1ii(r10)
            goto L2b
        L18:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L20:
            long r5 = r9.J$0
            kotlin.ResultKt.X1ii(r10)
            goto L3a
        L26:
            kotlin.ResultKt.X1ii(r10)
            r5 = 0
        L2b:
            long r7 = r9.$interval
            r9.L$0 = r0
            r9.J$0 = r5
            r9.label = r4
            java.lang.Object r10 = kotlinx.coroutines.DelayKt.XIi00iiXO(r7, r9)
            if (r10 != r1) goto L3a
            goto L4f
        L3a:
            long r7 = r9.$interval
            long r5 = r5 + r7
            com.sma.smartv3.util.TimeUtil r10 = com.sma.smartv3.util.TimeUtil.OXO1
            java.lang.String r10 = r10.O00(r5)
            r9.L$0 = r0
            r9.J$0 = r5
            r9.label = r3
            java.lang.Object r10 = r0.emit(r10, r9)
            if (r10 != r1) goto L2b
        L4f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sma.smartv3.util.TimeUtil$audioTimeFlow$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
