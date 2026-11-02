package com.sma.smartv3.biz.wa;

import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.pb;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: classes18.dex */
@DebugMetadata(c = "com.sma.smartv3.biz.wa.WAManager$startPollingGetLoginQrCode$1", f = "WAManager.kt", i = {0, 0, 0}, l = {560}, m = "invokeSuspend", n = {"result", "retryCount", "maxRetries"}, s = {"L$0", "I$0", "I$1"}, v = 1)
public final class WAManager$startPollingGetLoginQrCode$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<String, Unit> $callback;
    int I$0;
    int I$1;
    Object L$0;
    int label;

    /* JADX WARN: Multi-variable type inference failed */
    public WAManager$startPollingGetLoginQrCode$1(Function1<? super String, Unit> r1, Continuation<? super WAManager$startPollingGetLoginQrCode$1> r2) {
        this.$callback = r1;
        super(2, r2);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r2, Continuation<?> r3) {
        return new WAManager$startPollingGetLoginQrCode$1(this.$callback, r3);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
        return ((WAManager$startPollingGetLoginQrCode$1) create(r1, r2)).invokeSuspend(Unit.OXO1);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0050 -> B:20:0x0053). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object r7) {
        Object r0 = pb.I0iXXO();
        int r1 = this.label;
        if (r1 == 0) goto L8;
        if (r1 != 1) goto L7;
        int r2 = this.I$1;
        int r3 = this.I$0;
        String r4 = (String) this.L$0;
        ResultKt.X1ii(r7);
    L20:
        r3 = r3 + 1;
    L9:
        if (r3 >= r2) goto L21;
        String r8 = WAManager.O00(WAManager.OXO1);
        if (r8.length() <= 0) goto L17;
        Function1<String, Unit> r5 = this.$callback;
        if (r5 == null) goto L16;
        r5.invoke(r8);
    L16:
        return Unit.OXO1;
    L17:
        this.L$0 = SpillingKt.OXO1(r8);
        this.I$0 = r3;
        this.I$1 = r2;
        this.label = 1;
        if (DelayKt.XIi00iiXO(2000, this) != r0) goto L20;
        return r0;
    L21:
        i1O0OXO1O.OXO1.OXO1("WAManager getLoginQrCode -> timeout");
        Function1<String, Unit> r9 = this.$callback;
        if (r9 == null) goto L25;
        r9.invoke("");
    L25:
        return Unit.OXO1;
    L7:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L8:
        ResultKt.X1ii(r7);
        r2 = 30;
        r3 = 0;
        goto L9
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
        return invoke2(r1, r2);
    }
}
