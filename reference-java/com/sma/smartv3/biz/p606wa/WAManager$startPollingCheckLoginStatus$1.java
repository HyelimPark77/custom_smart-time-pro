package com.sma.smartv3.biz.p606wa;

import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes18.dex */
@DebugMetadata(m39465c = "com.sma.smartv3.biz.wa.WAManager$startPollingCheckLoginStatus$1", m39466f = "WAManager.kt", m39467i = {0, 0, 0, 1, 1, 1}, m39468l = {863, 868}, m39469m = "invokeSuspend", m39470n = {"retryCount", "maxRetries", "result", "retryCount", "maxRetries", "result"}, m39472s = {"I$0", "I$1", "Z$0", "I$0", "I$1", "Z$0"}, m39473v = 1)
public final class WAManager$startPollingCheckLoginStatus$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    int I$0;
    int I$1;
    boolean Z$0;
    int label;

    public WAManager$startPollingCheckLoginStatus$1(Continuation<? super WAManager$startPollingCheckLoginStatus$1> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new WAManager$startPollingCheckLoginStatus$1(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
        return ((WAManager$startPollingCheckLoginStatus$1) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002b  */
    /* JADX WARN: Code duplicated, block: B:14:0x0053  */
    /* JADX WARN: Code duplicated, block: B:19:0x006d  */
    /* JADX WARN: Code duplicated, block: B:23:0x007e  */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0062, code lost:
    
        if (kotlinx.coroutines.DelayKt.XIi00iiXO(2000, r9) == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0079, code lost:
    
        if (kotlinx.coroutines.DelayKt.XIi00iiXO(2000, r9) == r0) goto L21;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:12:0x002b, please report this as an issue */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0079 -> B:22:0x007c). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws InterruptedException {
        int i;
        int i2;
        WAManager wAManager;
        boolean zM38139I1;
        Object objI0iXXO = C2798pb.I0iXXO();
        int i3 = this.label;
        if (i3 == 0) {
            ResultKt.X1ii(obj);
            i = 60;
            i2 = 0;
            if (i2 < i) {
                i1O0OXO1O.OXO1.OXO1("WAManager checkLoginQrcodeStatus -> timeout");
                WAManager.OXO1.i11I();
                return Unit.OXO1;
            }
            wAManager = WAManager.OXO1;
            zM38139I1 = wAManager.m38139I1();
            i1O0OXO1O.OXO1.OXO1("WAManager checkLoginStatusBlock -> " + i2 + ", " + zM38139I1);
            if (zM38139I1) {
                wAManager.i0X000X0O();
                this.I$0 = i2;
                this.I$1 = i;
                this.Z$0 = zM38139I1;
                this.label = 1;
            } else {
                this.I$0 = i2;
                this.I$1 = i;
                this.Z$0 = zM38139I1;
                this.label = 2;
            }
            return objI0iXXO;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.I$1;
            i2 = this.I$0;
            ResultKt.X1ii(obj);
            i2++;
            if (i2 < i) {
                i1O0OXO1O.OXO1.OXO1("WAManager checkLoginQrcodeStatus -> timeout");
                WAManager.OXO1.i11I();
                return Unit.OXO1;
            }
            wAManager = WAManager.OXO1;
            zM38139I1 = wAManager.m38139I1();
            i1O0OXO1O.OXO1.OXO1("WAManager checkLoginStatusBlock -> " + i2 + ", " + zM38139I1);
            if (zM38139I1) {
                wAManager.i0X000X0O();
                this.I$0 = i2;
                this.I$1 = i;
                this.Z$0 = zM38139I1;
                this.label = 1;
            } else {
                this.I$0 = i2;
                this.I$1 = i;
                this.Z$0 = zM38139I1;
                this.label = 2;
            }
            return objI0iXXO;
        }
        ResultKt.X1ii(obj);
        WAManager.OXO1.OII();
        return Unit.OXO1;
    }
}
