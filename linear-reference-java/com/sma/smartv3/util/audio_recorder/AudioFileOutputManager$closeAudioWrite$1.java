package com.sma.smartv3.util.audio_recorder;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(c = "com.sma.smartv3.util.audio_recorder.AudioFileOutputManager", f = "AudioFileOutputManager.kt", i = {}, l = {35}, m = "closeAudioWrite", n = {}, s = {}, v = 1)
public final class AudioFileOutputManager$closeAudioWrite$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AudioFileOutputManager this$0;

    public AudioFileOutputManager$closeAudioWrite$1(AudioFileOutputManager r1, Continuation<? super AudioFileOutputManager$closeAudioWrite$1> r2) {
        this.this$0 = r1;
        super(r2);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @tb1
    public final Object invokeSuspend(@aa1 Object r2) {
        this.result = r2;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.XO0O10(this);
    }
}
