package com.sma.smartv3.ui.translate;

import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(c = "com.sma.smartv3.ui.translate.AudioRepository", f = "AudioRepository.kt", i = {}, l = {96, 97}, m = "stopAllJob", n = {}, s = {}, v = 1)
public final class AudioRepository$stopAllJob$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AudioRepository this$0;

    public AudioRepository$stopAllJob$1(AudioRepository r1, Continuation<? super AudioRepository$stopAllJob$1> r2) {
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
