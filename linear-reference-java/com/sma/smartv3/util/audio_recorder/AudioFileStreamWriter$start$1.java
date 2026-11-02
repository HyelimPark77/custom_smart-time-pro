package com.sma.smartv3.util.audio_recorder;

import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.pb;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.channels.ChannelIterator;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(c = "com.sma.smartv3.util.audio_recorder.AudioFileStreamWriter$start$1", f = "AudioFileStreamWriter.kt", i = {}, l = {26}, m = "invokeSuspend", n = {}, s = {}, v = 1)
public final class AudioFileStreamWriter$start$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ AudioFileStreamWriter this$0;

    public AudioFileStreamWriter$start$1(AudioFileStreamWriter r1, Continuation<? super AudioFileStreamWriter$start$1> r2) {
        this.this$0 = r1;
        super(2, r2);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r2, Continuation<?> r3) {
        return new AudioFileStreamWriter$start$1(this.this$0, r3);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
        return ((AudioFileStreamWriter$start$1) create(r1, r2)).invokeSuspend(Unit.OXO1);
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0031 -> B:12:0x0034). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object r5) {
        Object r0 = pb.I0iXXO();
        int r1 = this.label;
        if (r1 == 0) goto L8;
        if (r1 != 1) goto L7;
        ChannelIterator r2 = (ChannelIterator) this.L$0;
        ResultKt.X1ii(r5);
    L13:
        if (((Boolean) r5).booleanValue() == false) goto L16;
        byte[] r6 = (byte[]) r2.next();
        AudioFileStreamWriter.IiI10X(this.this$0).write(r6);
    L9:
        this.L$0 = r2;
        this.label = 1;
        r5 = r2.XIi00iiXO(this);
        if (r5 != r0) goto L13;
        return r0;
    L16:
        return Unit.OXO1;
    L7:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L8:
        ResultKt.X1ii(r5);
        r2 = AudioFileStreamWriter.O00(this.this$0).iterator();
        goto L9
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
        return invoke2(r1, r2);
    }
}
