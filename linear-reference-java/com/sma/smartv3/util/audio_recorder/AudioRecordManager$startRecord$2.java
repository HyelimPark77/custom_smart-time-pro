package com.sma.smartv3.util.audio_recorder;

import android.media.AudioRecord;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.pb;
import java.util.Arrays;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.I0IIOi;
import kotlinx.coroutines.channels.O00;

/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(c = "com.sma.smartv3.util.audio_recorder.AudioRecordManager$startRecord$2", f = "AudioRecordManager.kt", i = {0, 0, 0}, l = {112}, m = "invokeSuspend", n = {"$this$launch", "buffer", "read"}, s = {"L$0", "L$1", "I$0"}, v = 1)
public final class AudioRecordManager$startRecord$2 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ AudioRecordManager this$0;

    public AudioRecordManager$startRecord$2(AudioRecordManager r1, Continuation<? super AudioRecordManager$startRecord$2> r2) {
        this.this$0 = r1;
        super(2, r2);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object r3, Continuation<?> r4) {
        AudioRecordManager$startRecord$2 r0 = new AudioRecordManager$startRecord$2(this.this$0, r4);
        r0.L$0 = r3;
        return r0;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO r1, Continuation<? super Unit> r2) {
        return ((AudioRecordManager$startRecord$2) create(r1, r2)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object r8) {
        i00OIXiO r0 = (i00OIXiO) this.L$0;
        Object r1 = pb.I0iXXO();
        int r2 = this.label;
        if (r2 == 0) goto L8;
        if (r2 != 1) goto L7;
        byte[] r3 = (byte[]) this.L$1;
        ResultKt.X1ii(r8);
    L9:
        AudioRecord r9 = AudioRecordManager.XIi00iiXO(this.this$0);
        if (r9 == null) goto L25;
        if (r9.getRecordingState() != 3) goto L25;
        if (I0IIOi.OIX0iXi(r0) == false) goto L25;
        AudioRecord r10 = AudioRecordManager.XIi00iiXO(this.this$0);
        int r4 = 0;
        if (r10 == null) goto L18;
        r4 = r10.read(r3, 0, r3.length);
    L18:
        if (r4 <= 0) goto L9;
        if (((Boolean) AudioRecordManager.XO0O10(this.this$0).getValue()).booleanValue() == false) goto L9;
        O00 r11 = AudioRecordManager.OXO1(this.this$0);
        byte[] r5 = Arrays.copyOf(r3, r4);
        Intrinsics.O10IXXX0X(r5, "copyOf(...)");
        this.L$0 = r0;
        this.L$1 = r3;
        this.I$0 = r4;
        this.label = 1;
        if (r11.iIXi1iiXI(r5, this) != r1) goto L9;
        return r1;
    L25:
        return Unit.OXO1;
    L7:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L8:
        ResultKt.X1ii(r8);
        r3 = new byte[AudioRecordManager.iO(this.this$0)];
        goto L9
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(i00OIXiO r1, Continuation<? super Unit> r2) {
        return invoke2(r1, r2);
    }
}
