package com.sma.smartv3.biz.p607wx;

import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes18.dex */
@DebugMetadata(m39465c = "com.sma.smartv3.biz.wx.WxManager$checkWsManagerConnected$1", m39466f = "WxManager.kt", m39467i = {0, 0}, m39468l = {520}, m39469m = "invokeSuspend", m39470n = {"retryCount", "maxRetries"}, m39472s = {"L$0", "I$0"}, m39473v = 1)
public final class WxManager$checkWsManagerConnected$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    int I$0;
    Object L$0;
    int label;

    public WxManager$checkWsManagerConnected$1(Continuation<? super WxManager$checkWsManagerConnected$1> continuation) {
        super(2, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invokeSuspend$lambda$0$0(boolean z) {
        i1O0OXO1O.OXO1.OXO1("WxManager getSnsSync = " + z);
        return Unit.OXO1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WxManager$checkWsManagerConnected$1(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
        return ((WxManager$checkWsManagerConnected$1) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002c  */
    /* JADX WARN: Code duplicated, block: B:13:0x003f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:16:0x0046  */
    /* JADX WARN: Code duplicated, block: B:18:0x0078  */
    /* JADX WARN: Code duplicated, block: B:20:0x007e  */
    /* JADX WARN: Code duplicated, block: B:21:0x0083  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x003d -> B:14:0x0040). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:16:0x0046
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = com.android.mltcode.paycertificationapi.C2798pb.I0iXXO()
            int r1 = r9.label
            r2 = 1
            if (r1 == 0) goto L1d
            if (r1 != r2) goto L15
            int r1 = r9.I$0
            java.lang.Object r3 = r9.L$0
            kotlin.jvm.internal.Ref$IntRef r3 = (kotlin.jvm.internal.Ref.IntRef) r3
            kotlin.ResultKt.X1ii(r10)
            goto L40
        L15:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1d:
            kotlin.ResultKt.X1ii(r10)
            kotlin.jvm.internal.Ref$IntRef r10 = new kotlin.jvm.internal.Ref$IntRef
            r10.<init>()
            r1 = 30
            r3 = r10
        L28:
            int r10 = r3.element
            if (r10 >= r1) goto L8e
            int r10 = r10 + 1
            r3.element = r10
            r9.L$0 = r3
            r9.I$0 = r1
            r9.label = r2
            r4 = 60000(0xea60, double:2.9644E-319)
            java.lang.Object r10 = kotlinx.coroutines.DelayKt.XIi00iiXO(r4, r9)
            if (r10 != r0) goto L40
            return r0
        L40:
            com.android.mltcode.paycertificationapi.n77 r10 = com.sma.smartv3.biz.p607wx.WxManager.X0O()
            if (r10 == 0) goto L28
            com.android.mltcode.paycertificationapi.i1O0OXO1O r4 = com.android.mltcode.paycertificationapi.i1O0OXO1O.OXO1
            boolean r5 = r10.OXO1()
            int r6 = r3.element
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "WxManager checkWsManagerConnected while -> isWsConnected = "
            r7.append(r8)
            r7.append(r5)
            java.lang.String r5 = " , retryCount = "
            r7.append(r5)
            r7.append(r6)
            java.lang.String r5 = ", maxRetries = "
            r7.append(r5)
            r7.append(r1)
            java.lang.String r5 = r7.toString()
            r4.OXO1(r5)
            boolean r10 = r10.OXO1()
            if (r10 == 0) goto L83
            kotlinx.coroutines.XiOIO r10 = com.sma.smartv3.biz.p607wx.WxManager.OIi0()
            if (r10 == 0) goto L28
            r4 = 0
            kotlinx.coroutines.XiOIO.OXO1.XIi00iiXO(r10, r4, r2, r4)
            goto L28
        L83:
            com.sma.smartv3.biz.wx.WxManager r10 = com.sma.smartv3.biz.p607wx.WxManager.OXO1
            com.sma.smartv3.biz.wx.OXO1 r4 = new com.sma.smartv3.biz.wx.OXO1
            r4.<init>()
            r10.XOIX(r4)
            goto L28
        L8e:
            kotlin.Unit r10 = kotlin.Unit.OXO1
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sma.smartv3.biz.p607wx.WxManager$checkWsManagerConnected$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
