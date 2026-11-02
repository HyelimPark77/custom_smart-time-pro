package com.sma.smartv3.util.audio_recorder;

import com.android.mltcode.paycertificationapi.i00OIXiO;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(m39465c = "com.sma.smartv3.util.audio_recorder.AudioFileStreamWriter$start$1", m39466f = "AudioFileStreamWriter.kt", m39467i = {}, m39468l = {26}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
public final class AudioFileStreamWriter$start$1 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    Object L$0;
    int label;
    final /* synthetic */ AudioFileStreamWriter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioFileStreamWriter$start$1(AudioFileStreamWriter audioFileStreamWriter, Continuation<? super AudioFileStreamWriter$start$1> continuation) {
        super(2, continuation);
        this.this$0 = audioFileStreamWriter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AudioFileStreamWriter$start$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
        return ((AudioFileStreamWriter$start$1) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0033 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x003c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0031 -> B:12:0x0034). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = com.android.mltcode.paycertificationapi.C2798pb.I0iXXO()
            int r1 = r4.label
            r2 = 1
            if (r1 == 0) goto L1b
            if (r1 != r2) goto L13
            java.lang.Object r1 = r4.L$0
            kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
            kotlin.ResultKt.X1ii(r5)
            goto L34
        L13:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L1b:
            kotlin.ResultKt.X1ii(r5)
            com.sma.smartv3.util.audio_recorder.AudioFileStreamWriter r5 = r4.this$0
            kotlinx.coroutines.channels.O00 r5 = com.sma.smartv3.util.audio_recorder.AudioFileStreamWriter.O00(r5)
            kotlinx.coroutines.channels.ChannelIterator r5 = r5.iterator()
            r1 = r5
        L29:
            r4.L$0 = r1
            r4.label = r2
            java.lang.Object r5 = r1.XIi00iiXO(r4)
            if (r5 != r0) goto L34
            return r0
        L34:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L4c
            java.lang.Object r5 = r1.next()
            byte[] r5 = (byte[]) r5
            com.sma.smartv3.util.audio_recorder.AudioFileStreamWriter r3 = r4.this$0
            java.io.BufferedOutputStream r3 = com.sma.smartv3.util.audio_recorder.AudioFileStreamWriter.IiI10X(r3)
            r3.write(r5)
            goto L29
        L4c:
            kotlin.Unit r5 = kotlin.Unit.OXO1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sma.smartv3.util.audio_recorder.AudioFileStreamWriter$start$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
