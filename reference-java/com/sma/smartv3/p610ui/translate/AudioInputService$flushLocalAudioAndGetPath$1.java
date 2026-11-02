package com.sma.smartv3.p610ui.translate;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(m39465c = "com.sma.smartv3.ui.translate.AudioInputService", m39466f = "AudioInputService.kt", m39467i = {0}, m39468l = {47}, m39469m = "flushLocalAudioAndGetPath", m39470n = {"scope"}, m39472s = {"L$0"}, m39473v = 1)
public final class AudioInputService$flushLocalAudioAndGetPath$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AudioInputService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioInputService$flushLocalAudioAndGetPath$1(AudioInputService audioInputService, Continuation<? super AudioInputService$flushLocalAudioAndGetPath$1> continuation) {
        super(continuation);
        this.this$0 = audioInputService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @tb1
    public final Object invokeSuspend(@aa1 Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.XO0O10(null, this);
    }
}
