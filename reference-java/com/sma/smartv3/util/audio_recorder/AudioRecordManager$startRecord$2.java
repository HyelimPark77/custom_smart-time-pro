package com.sma.smartv3.util.audio_recorder;

import android.media.AudioRecord;
import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.i00OIXiO;
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
@DebugMetadata(m39465c = "com.sma.smartv3.util.audio_recorder.AudioRecordManager$startRecord$2", m39466f = "AudioRecordManager.kt", m39467i = {0, 0, 0}, m39468l = {112}, m39469m = "invokeSuspend", m39470n = {"$this$launch", "buffer", "read"}, m39472s = {"L$0", "L$1", "I$0"}, m39473v = 1)
public final class AudioRecordManager$startRecord$2 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ AudioRecordManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AudioRecordManager$startRecord$2(AudioRecordManager audioRecordManager, Continuation<? super AudioRecordManager$startRecord$2> continuation) {
        super(2, continuation);
        this.this$0 = audioRecordManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AudioRecordManager$startRecord$2 audioRecordManager$startRecord$2 = new AudioRecordManager$startRecord$2(this.this$0, continuation);
        audioRecordManager$startRecord$2.L$0 = obj;
        return audioRecordManager$startRecord$2;
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
        return ((AudioRecordManager$startRecord$2) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        byte[] bArr;
        i00OIXiO i00oixio = (i00OIXiO) this.L$0;
        Object objI0iXXO = C2798pb.I0iXXO();
        int i = this.label;
        if (i == 0) {
            ResultKt.X1ii(obj);
            bArr = new byte[this.this$0.XO0O10];
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bArr = (byte[]) this.L$1;
            ResultKt.X1ii(obj);
        }
        while (true) {
            AudioRecord audioRecord = this.this$0.IiI10X;
            if (audioRecord == null || audioRecord.getRecordingState() != 3 || !I0IIOi.OIX0iXi(i00oixio)) {
                break;
            }
            AudioRecord audioRecord2 = this.this$0.IiI10X;
            int i2 = audioRecord2 != null ? audioRecord2.read(bArr, 0, bArr.length) : 0;
            if (i2 > 0 && ((Boolean) this.this$0.OIi0.getValue()).booleanValue()) {
                O00 o00 = this.this$0.I0IIOi;
                byte[] bArrCopyOf = Arrays.copyOf(bArr, i2);
                Intrinsics.O10IXXX0X(bArrCopyOf, "copyOf(...)");
                this.L$0 = i00oixio;
                this.L$1 = bArr;
                this.I$0 = i2;
                this.label = 1;
                if (o00.iIXi1iiXI(bArrCopyOf, this) == objI0iXXO) {
                    return objI0iXXO;
                }
            }
        }
        return Unit.OXO1;
    }
}
