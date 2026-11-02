package com.sma.smartv3.util.tts;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.pb;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(c = "com.sma.smartv3.util.tts.ServerTTSStrategy", f = "ServerTTSStrategy.kt", i = {0, 0}, l = {91}, m = "requestTextToAudio-gIAlu-s", n = {"ttsData", "$i$f$suspendCancellableCoroutine"}, s = {"L$0", "I$0"}, v = 1)
public final class ServerTTSStrategy$requestTextToAudio$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ServerTTSStrategy this$0;

    public ServerTTSStrategy$requestTextToAudio$1(ServerTTSStrategy r1, Continuation<? super ServerTTSStrategy$requestTextToAudio$1> r2) {
        this.this$0 = r1;
        super(r2);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @tb1
    public final Object invokeSuspend(@aa1 Object r2) {
        this.result = r2;
        this.label |= Integer.MIN_VALUE;
        Object r3 = ServerTTSStrategy.XO0O10(this.this$0, null, this);
        if (r3 != pb.I0iXXO()) goto L6;
        return r3;
    L6:
        return Result.m6973boximpl(r3);
    }
}
