package com.sma.smartv3.util.tts;

import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.pb;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(c = "com.sma.smartv3.util.tts.ServerTTSStrategy$execute$2", f = "ServerTTSStrategy.kt", i = {}, l = {44}, m = "invokeSuspend", n = {}, s = {}, v = 1)
public final class ServerTTSStrategy$execute$2 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super String>, Object> {
    final /* synthetic */ TTSData $ttsData;
    int label;
    final /* synthetic */ ServerTTSStrategy this$0;

    public ServerTTSStrategy$execute$2(ServerTTSStrategy r1, TTSData r2, Continuation<? super ServerTTSStrategy$execute$2> r3) {
        this.this$0 = r1;
        this.$ttsData = r2;
        super(2, r3);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
        return new ServerTTSStrategy$execute$2(this.this$0, this.$ttsData, r4);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO r1, Continuation<? super String> r2) {
        return ((ServerTTSStrategy$execute$2) create(r1, r2)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object r4) {
        Object r0 = pb.I0iXXO();
        int r1 = this.label;
        if (r1 == 0) goto L8;
        if (r1 != 1) goto L7;
        ResultKt.X1ii(r4);
        Object r5 = ((Result) r4).m6983unboximpl();
    L11:
        ServerTTSStrategy r2 = this.this$0;
        Throwable r3 = Result.m6977exceptionOrNullimpl(r5);
        if (r3 != null) goto L14;
        return r5;
    L14:
        i1O0OXO1O.OXO1.OXO1(ServerTTSStrategy.iO(r2) + " execute :" + r3.getMessage());
        return "";
    L7:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L8:
        ResultKt.X1ii(r4);
        ServerTTSStrategy r6 = this.this$0;
        TTSData r7 = this.$ttsData;
        this.label = 1;
        r5 = ServerTTSStrategy.XO0O10(r6, r7, this);
        if (r5 != r0) goto L11;
        return r0;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super String> r2) {
        return invoke2(r1, r2);
    }
}
