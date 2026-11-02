package com.sma.smartv3.biz.p606wa;

import com.android.mltcode.paycertificationapi.i00OIXiO;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes18.dex */
@DebugMetadata(m39465c = "com.sma.smartv3.biz.wa.WAManager$startPollingGetLoginQrCode$1", m39466f = "WAManager.kt", m39467i = {0, 0, 0}, m39468l = {560}, m39469m = "invokeSuspend", m39470n = {"result", "retryCount", "maxRetries"}, m39472s = {"L$0", "I$0", "I$1"}, m39473v = 1)
public final class WAManager$startPollingGetLoginQrCode$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<String, Unit> $callback;
    int I$0;
    int I$1;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public WAManager$startPollingGetLoginQrCode$1(Function1<? super String, Unit> function1, Continuation<? super WAManager$startPollingGetLoginQrCode$1> continuation) {
        super(2, continuation);
        this.$callback = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WAManager$startPollingGetLoginQrCode$1(this.$callback, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
        return ((WAManager$startPollingGetLoginQrCode$1) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:12:0x0034  */
    /* JADX WARN: Code duplicated, block: B:14:0x0038  */
    /* JADX WARN: Code duplicated, block: B:17:0x003e  */
    /* JADX WARN: Code duplicated, block: B:19:0x0052 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0050 -> B:20:0x0053). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = com.android.mltcode.paycertificationapi.C2798pb.I0iXXO()
            int r1 = r6.label
            r2 = 1
            if (r1 == 0) goto L1f
            if (r1 != r2) goto L17
            int r1 = r6.I$1
            int r3 = r6.I$0
            java.lang.Object r4 = r6.L$0
            java.lang.String r4 = (java.lang.String) r4
            kotlin.ResultKt.X1ii(r7)
            goto L53
        L17:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1f:
            kotlin.ResultKt.X1ii(r7)
            r7 = 0
            r1 = 30
            r3 = r7
        L26:
            if (r3 >= r1) goto L55
            com.sma.smartv3.biz.wa.WAManager r7 = com.sma.smartv3.biz.p606wa.WAManager.OXO1
            java.lang.String r7 = com.sma.smartv3.biz.p606wa.WAManager.O00(r7)
            int r4 = r7.length()
            if (r4 <= 0) goto L3e
            kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> r0 = r6.$callback
            if (r0 == 0) goto L3b
            r0.invoke2(r7)
        L3b:
            kotlin.Unit r7 = kotlin.Unit.OXO1
            return r7
        L3e:
            java.lang.Object r7 = kotlin.coroutines.jvm.internal.SpillingKt.OXO1(r7)
            r6.L$0 = r7
            r6.I$0 = r3
            r6.I$1 = r1
            r6.label = r2
            r4 = 2000(0x7d0, double:9.88E-321)
            java.lang.Object r7 = kotlinx.coroutines.DelayKt.XIi00iiXO(r4, r6)
            if (r7 != r0) goto L53
            return r0
        L53:
            int r3 = r3 + r2
            goto L26
        L55:
            com.android.mltcode.paycertificationapi.i1O0OXO1O r7 = com.android.mltcode.paycertificationapi.i1O0OXO1O.OXO1
            java.lang.String r0 = "WAManager getLoginQrCode -> timeout"
            r7.OXO1(r0)
            kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> r7 = r6.$callback
            if (r7 == 0) goto L65
            java.lang.String r0 = ""
            r7.invoke2(r0)
        L65:
            kotlin.Unit r7 = kotlin.Unit.OXO1
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sma.smartv3.biz.p606wa.WAManager$startPollingGetLoginQrCode$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
