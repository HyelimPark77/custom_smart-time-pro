package com.sma.smartv3.p610ui.trans_charge;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(m39465c = "com.sma.smartv3.ui.trans_charge.AudioOutputService", m39466f = "AudioOutputService.kt", m39467i = {}, m39468l = {35}, m39469m = "stop", m39470n = {}, m39472s = {}, m39473v = 1)
public final class AudioOutputService$stop$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AudioOutputService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioOutputService$stop$1(AudioOutputService audioOutputService, Continuation<? super AudioOutputService$stop$1> continuation) {
        super(continuation);
        this.this$0 = audioOutputService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @tb1
    public final Object invokeSuspend(@aa1 Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.XIi00iiXO(this);
    }
}
