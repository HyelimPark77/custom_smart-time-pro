package com.sma.smartv3.util.tts;

import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(m39465c = "com.sma.smartv3.util.tts.ServerTTSStrategy", m39466f = "ServerTTSStrategy.kt", m39467i = {0, 0}, m39468l = {91}, m39469m = "requestTextToAudio-gIAlu-s", m39470n = {"ttsData", "$i$f$suspendCancellableCoroutine"}, m39472s = {"L$0", "I$0"}, m39473v = 1)
public final class ServerTTSStrategy$requestTextToAudio$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ServerTTSStrategy this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ServerTTSStrategy$requestTextToAudio$1(ServerTTSStrategy serverTTSStrategy, Continuation<? super ServerTTSStrategy$requestTextToAudio$1> continuation) {
        super(continuation);
        this.this$0 = serverTTSStrategy;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @tb1
    public final Object invokeSuspend(@aa1 Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objO00 = this.this$0.O00(null, this);
        return objO00 == C2798pb.I0iXXO() ? objO00 : Result.m48332boximpl(objO00);
    }
}
