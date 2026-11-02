package com.sma.smartv3.biz.wa;

import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.pb;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: classes18.dex */
@DebugMetadata(c = "com.sma.smartv3.biz.wa.WAManager$startPollingCheckLoginStatus$1", f = "WAManager.kt", i = {0, 0, 0, 1, 1, 1}, l = {863, 868}, m = "invokeSuspend", n = {"retryCount", "maxRetries", "result", "retryCount", "maxRetries", "result"}, s = {"I$0", "I$1", "Z$0", "I$0", "I$1", "Z$0"}, v = 1)
public final class WAManager$startPollingCheckLoginStatus$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    int I$0;
    int I$1;
    boolean Z$0;
    int label;

    public WAManager$startPollingCheckLoginStatus$1(Continuation<? super WAManager$startPollingCheckLoginStatus$1> r2) {
        super(2, r2);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r1, Continuation<?> r2) {
        return new WAManager$startPollingCheckLoginStatus$1(r2);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
        return ((WAManager$startPollingCheckLoginStatus$1) create(r1, r2)).invokeSuspend(Unit.OXO1);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0079 -> B:22:0x007c). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object r10) {
        Object r0 = pb.I0iXXO();
        int r1 = this.label;
        if (r1 == 0) goto L10;
        if (r1 == 1) goto L9;
        if (r1 != 2) goto L8;
        int r2 = this.I$1;
        int r4 = this.I$0;
        ResultKt.X1ii(r10);
    L22:
        r4 = r4 + 1;
    L11:
        if (r4 >= r2) goto L23;
        WAManager r11 = WAManager.OXO1;
        boolean r5 = WAManager.XIi00iiXO(r11);
        i1O0OXO1O.OXO1.OXO1("WAManager checkLoginStatusBlock -> " + r4 + ", " + r5);
        if (r5 == false) goto L19;
        r11.i0X000X0O();
        this.I$0 = r4;
        this.I$1 = r2;
        this.Z$0 = r5;
        this.label = 1;
        if (DelayKt.XIi00iiXO(2000, this) == r0) goto L21;
    L17:
        WAManager.OXO1.OII();
        return Unit.OXO1;
    L21:
        return r0;
    L19:
        this.I$0 = r4;
        this.I$1 = r2;
        this.Z$0 = r5;
        this.label = 2;
        if (DelayKt.XIi00iiXO(2000, this) != r0) goto L22;
    L23:
        i1O0OXO1O.OXO1.OXO1("WAManager checkLoginQrcodeStatus -> timeout");
        WAManager.OXO1.i11I();
        return Unit.OXO1;
    L8:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L9:
        ResultKt.X1ii(r10);
        goto L17
    L10:
        ResultKt.X1ii(r10);
        r2 = 60;
        r4 = 0;
        goto L11
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
        return invoke2(r1, r2);
    }
}
