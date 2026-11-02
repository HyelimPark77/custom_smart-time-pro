package com.sma.smartv3.util.audio_recorder;

import androidx.health.connect.client.records.CervicalMucusRecord;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(m39465c = "com.sma.smartv3.util.audio_recorder.AudioFileOutputManager", m39466f = "AudioFileOutputManager.kt", m39467i = {}, m39468l = {41}, m39469m = CervicalMucusRecord.Appearance.CLEAR, m39470n = {}, m39472s = {}, m39473v = 1)
public final class AudioFileOutputManager$clear$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AudioFileOutputManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioFileOutputManager$clear$1(AudioFileOutputManager audioFileOutputManager, Continuation<? super AudioFileOutputManager$clear$1> continuation) {
        super(continuation);
        this.this$0 = audioFileOutputManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @tb1
    public final Object invokeSuspend(@aa1 Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.OXO1(this);
    }
}
