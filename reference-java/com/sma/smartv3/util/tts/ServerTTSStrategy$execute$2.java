package com.sma.smartv3.util.tts;

import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(m39465c = "com.sma.smartv3.util.tts.ServerTTSStrategy$execute$2", m39466f = "ServerTTSStrategy.kt", m39467i = {}, m39468l = {44}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
public final class ServerTTSStrategy$execute$2 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super String>, Object> {
    final /* synthetic */ TTSData $ttsData;
    int label;
    final /* synthetic */ ServerTTSStrategy this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ServerTTSStrategy$execute$2(ServerTTSStrategy serverTTSStrategy, TTSData tTSData, Continuation<? super ServerTTSStrategy$execute$2> continuation) {
        super(2, continuation);
        this.this$0 = serverTTSStrategy;
        this.$ttsData = tTSData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ServerTTSStrategy$execute$2(this.this$0, this.$ttsData, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO i00oixio, Continuation<? super String> continuation) {
        return ((ServerTTSStrategy$execute$2) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objO00;
        Object objI0iXXO = C2798pb.I0iXXO();
        int i = this.label;
        if (i == 0) {
            ResultKt.X1ii(obj);
            ServerTTSStrategy serverTTSStrategy = this.this$0;
            TTSData tTSData = this.$ttsData;
            this.label = 1;
            objO00 = serverTTSStrategy.O00(tTSData, this);
            if (objO00 == objI0iXXO) {
                return objI0iXXO;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.X1ii(obj);
            objO00 = ((Result) obj).m48342unboximpl();
        }
        ServerTTSStrategy serverTTSStrategy2 = this.this$0;
        Throwable thM48336exceptionOrNullimpl = Result.m48336exceptionOrNullimpl(objO00);
        if (thM48336exceptionOrNullimpl == null) {
            return objO00;
        }
        i1O0OXO1O.OXO1.OXO1(serverTTSStrategy2.OXO1 + " execute :" + thM48336exceptionOrNullimpl.getMessage());
        return "";
    }
}
