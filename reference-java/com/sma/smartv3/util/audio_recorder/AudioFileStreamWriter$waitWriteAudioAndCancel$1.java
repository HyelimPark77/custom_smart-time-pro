package com.sma.smartv3.util.audio_recorder;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(m39465c = "com.sma.smartv3.util.audio_recorder.AudioFileStreamWriter", m39466f = "AudioFileStreamWriter.kt", m39467i = {}, m39468l = {52}, m39469m = "waitWriteAudioAndCancel", m39470n = {}, m39472s = {}, m39473v = 1)
public final class AudioFileStreamWriter$waitWriteAudioAndCancel$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AudioFileStreamWriter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioFileStreamWriter$waitWriteAudioAndCancel$1(AudioFileStreamWriter audioFileStreamWriter, Continuation<? super AudioFileStreamWriter$waitWriteAudioAndCancel$1> continuation) {
        super(continuation);
        this.this$0 = audioFileStreamWriter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @tb1
    public final Object invokeSuspend(@aa1 Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.XXI(this);
    }
}
