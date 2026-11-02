package com.sma.smartv3.util.audio_recorder;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(c = "com.sma.smartv3.util.audio_recorder.AudioFileStreamWriter", f = "AudioFileStreamWriter.kt", i = {}, l = {52}, m = "waitWriteAudioAndCancel", n = {}, s = {}, v = 1)
public final class AudioFileStreamWriter$waitWriteAudioAndCancel$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AudioFileStreamWriter this$0;

    public AudioFileStreamWriter$waitWriteAudioAndCancel$1(AudioFileStreamWriter r1, Continuation<? super AudioFileStreamWriter$waitWriteAudioAndCancel$1> r2) {
        this.this$0 = r1;
        super(r2);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @tb1
    public final Object invokeSuspend(@aa1 Object r2) {
        this.result = r2;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.XXI(this);
    }
}
