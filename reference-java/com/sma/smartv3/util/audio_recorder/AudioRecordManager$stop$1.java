package com.sma.smartv3.util.audio_recorder;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(m39465c = "com.sma.smartv3.util.audio_recorder.AudioRecordManager", m39466f = "AudioRecordManager.kt", m39467i = {}, m39468l = {120}, m39469m = "stop", m39470n = {}, m39472s = {}, m39473v = 1)
public final class AudioRecordManager$stop$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AudioRecordManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioRecordManager$stop$1(AudioRecordManager audioRecordManager, Continuation<? super AudioRecordManager$stop$1> continuation) {
        super(continuation);
        this.this$0 = audioRecordManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @tb1
    public final Object invokeSuspend(@aa1 Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.OIi0(this);
    }
}
