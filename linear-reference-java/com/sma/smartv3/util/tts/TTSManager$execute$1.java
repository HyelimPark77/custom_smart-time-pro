package com.sma.smartv3.util.tts;

import com.android.mltcode.paycertificationapi.X1XXX0I0;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.jl5;
import com.android.mltcode.paycertificationapi.pb;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SpillingKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(c = "com.sma.smartv3.util.tts.TTSManager$execute$1", f = "TTSManager.kt", i = {0}, l = {28}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"}, v = 1)
public final class TTSManager$execute$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    final /* synthetic */ TTSData $ttsData;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ TTSManager this$0;

    public TTSManager$execute$1(TTSManager r1, TTSData r2, Continuation<? super TTSManager$execute$1> r3) {
        this.this$0 = r1;
        this.$ttsData = r2;
        super(2, r3);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r4, Continuation<?> r5) {
        TTSManager$execute$1 r0 = new TTSManager$execute$1(this.this$0, this.$ttsData, r5);
        r0.L$0 = r4;
        return r0;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
        return ((TTSManager$execute$1) create(r1, r2)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object r6) {
        i00OIXiO r0 = (i00OIXiO) this.L$0;
        Object r1 = pb.I0iXXO();
        int r2 = this.label;
        if (r2 == 0) goto L8;
        if (r2 != 1) goto L7;
        ResultKt.X1ii(r6);
    L13:
        String r7 = (String) r6;
    L15:
        X1XXX0I0 r3 = TTSManager.OXO1(this.this$0);
        if (r3 == null) goto L19;
        r3.iO(r7);
    L19:
        return Unit.OXO1;
    L7:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L8:
        ResultKt.X1ii(r6);
        jl5 r8 = TTSManager.XIi00iiXO(this.this$0);
        if (r8 == null) goto L14;
        TTSData r4 = this.$ttsData;
        this.L$0 = SpillingKt.OXO1(r0);
        this.label = 1;
        r6 = r8.OXO1(r4, r0, this);
        if (r6 != r1) goto L13;
        return r1;
    L14:
        r7 = null;
        goto L15
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
        return invoke2(r1, r2);
    }
}
