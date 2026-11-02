package com.sma.smartv3.biz.p607wx;

import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.goodix.ble.libcomx.task.ITaskSet;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes18.dex */
@DebugMetadata(m39465c = "com.sma.smartv3.biz.wx.WxManager$startPollingCheckLoginStatus$1", m39466f = "WxManager.kt", m39467i = {0, 0}, m39468l = {ITaskSet.EVT_SUBTASK_START}, m39469m = "invokeSuspend", m39470n = {"retryCount", "maxRetries"}, m39472s = {"I$0", "I$1"}, m39473v = 1)
public final class WxManager$startPollingCheckLoginStatus$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    int I$0;
    int I$1;
    int label;

    public WxManager$startPollingCheckLoginStatus$1(Continuation<? super WxManager$startPollingCheckLoginStatus$1> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WxManager$startPollingCheckLoginStatus$1(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
        return ((WxManager$startPollingCheckLoginStatus$1) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0024  */
    /* JADX WARN: Code duplicated, block: B:12:0x002c  */
    /* JADX WARN: Code duplicated, block: B:14:0x0035  */
    /* JADX WARN: Code duplicated, block: B:17:0x003c  */
    /* JADX WARN: Code duplicated, block: B:20:0x004c  */
    /* JADX WARN: Code duplicated, block: B:22:0x005a A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0058 -> B:23:0x005b). Please report as a decompilation issue!!! */
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
            if (r1 == 0) goto L1b
            if (r1 != r2) goto L13
            int r1 = r6.I$1
            int r3 = r6.I$0
            kotlin.ResultKt.X1ii(r7)
            goto L5b
        L13:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1b:
            kotlin.ResultKt.X1ii(r7)
            r7 = 0
            r1 = 24
            r3 = r7
        L22:
            if (r3 >= r1) goto L5d
            com.sma.smartv3.biz.wx.WxManager r7 = com.sma.smartv3.biz.p607wx.WxManager.OXO1
            boolean r4 = com.sma.smartv3.biz.p607wx.WxManager.IXXOO(r7)
            if (r4 == 0) goto L4c
            r7.XIIO11I()
            com.android.mltcode.paycertificationapi.n77 r0 = com.sma.smartv3.biz.p607wx.WxManager.X0O()
            if (r0 == 0) goto L3c
            boolean r0 = r0.OXO1()
            if (r0 != r2) goto L3c
            goto L3f
        L3c:
            r7.IO0iXO0O()
        L3f:
            com.android.mltcode.paycertificationapi.i1O0OXO1O r0 = com.android.mltcode.paycertificationapi.i1O0OXO1O.OXO1
            java.lang.String r1 = "WxManager checkLoginStatus 已登"
            r0.OXO1(r1)
            r7.iIi1()
            kotlin.Unit r7 = kotlin.Unit.OXO1
            return r7
        L4c:
            r6.I$0 = r3
            r6.I$1 = r1
            r6.label = r2
            r4 = 5000(0x1388, double:2.4703E-320)
            java.lang.Object r7 = kotlinx.coroutines.DelayKt.XIi00iiXO(r4, r6)
            if (r7 != r0) goto L5b
            return r0
        L5b:
            int r3 = r3 + r2
            goto L22
        L5d:
            com.android.mltcode.paycertificationapi.i1O0OXO1O r7 = com.android.mltcode.paycertificationapi.i1O0OXO1O.OXO1
            java.lang.String r0 = "WxManager startPollingCheckLoginStatus -> timeout"
            r7.OXO1(r0)
            com.sma.smartv3.biz.wx.WxManager r7 = com.sma.smartv3.biz.p607wx.WxManager.OXO1
            r7.X00O0()
            com.android.mltcode.paycertificationapi.n77 r7 = com.sma.smartv3.biz.p607wx.WxManager.X0O()
            if (r7 == 0) goto L72
            r7.XOO0ii0()
        L72:
            r7 = 0
            com.sma.smartv3.biz.p607wx.WxManager.X01IiOiIi(r7)
            kotlin.Unit r7 = kotlin.Unit.OXO1
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sma.smartv3.biz.p607wx.WxManager$startPollingCheckLoginStatus$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
