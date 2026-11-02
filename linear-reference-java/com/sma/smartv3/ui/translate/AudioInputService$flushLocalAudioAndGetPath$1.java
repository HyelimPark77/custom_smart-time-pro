package com.sma.smartv3.ui.translate;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(c = "com.sma.smartv3.ui.translate.AudioInputService", f = "AudioInputService.kt", i = {0}, l = {47}, m = "flushLocalAudioAndGetPath", n = {"scope"}, s = {"L$0"}, v = 1)
public final class AudioInputService$flushLocalAudioAndGetPath$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AudioInputService this$0;

    public AudioInputService$flushLocalAudioAndGetPath$1(AudioInputService r1, Continuation<? super AudioInputService$flushLocalAudioAndGetPath$1> r2) {
        this.this$0 = r1;
        super(r2);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @tb1
    public final Object invokeSuspend(@aa1 Object r2) {
        this.result = r2;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.XO0O10(null, this);
    }
}
