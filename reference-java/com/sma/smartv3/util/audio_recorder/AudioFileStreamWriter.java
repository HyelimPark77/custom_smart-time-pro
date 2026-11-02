package com.sma.smartv3.util.audio_recorder;

import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.C2954td;
import com.android.mltcode.paycertificationapi.IXOX0Xiii;
import com.android.mltcode.paycertificationapi.XX01Oi;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.i0i0X0;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.util.audio_recorder.AudioFileStreamWriter;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.XiOIO;
import kotlinx.coroutines.channels.I0iXXO;
import kotlinx.coroutines.channels.IiI10X;
import kotlinx.coroutines.channels.O00;

/* JADX INFO: loaded from: classes3.dex */
public final class AudioFileStreamWriter implements i0i0X0 {

    @tb1
    public XiOIO O00;

    @aa1
    public final File OXO1;

    @aa1
    public final O00<byte[]> XIi00iiXO;

    @aa1
    public final Lazy XO0O10;

    /* JADX INFO: renamed from: iO */
    @aa1
    public final Lazy f54933iO;

    public AudioFileStreamWriter(@aa1 File file) throws IOException {
        Intrinsics.X0O(file, "file");
        this.OXO1 = file;
        this.XIi00iiXO = IiI10X.XO0O10(100, null, null, 6, null);
        this.f54933iO = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.IIXiXO
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return AudioFileStreamWriter.I0IIOi(this.f1679IO);
            }
        });
        this.XO0O10 = LazyKt__LazyJVMKt.m39307iO(new Function0() { // from class: com.android.mltcode.paycertificationapi.ii1iXiIX
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object invoke2() {
                return AudioFileStreamWriter.I0iXXO(this.f8560IO);
            }
        });
        if (file.exists()) {
            return;
        }
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        file.createNewFile();
    }

    public static final FileOutputStream I0IIOi(AudioFileStreamWriter audioFileStreamWriter) {
        return new FileOutputStream(audioFileStreamWriter.OXO1);
    }

    public static final BufferedOutputStream I0iXXO(AudioFileStreamWriter audioFileStreamWriter) {
        return new BufferedOutputStream(audioFileStreamWriter.m38854IO());
    }

    /* JADX INFO: renamed from: IO */
    public final FileOutputStream m38854IO() {
        return (FileOutputStream) this.f54933iO.getValue();
    }

    public final BufferedOutputStream OIX0iXi() {
        return (BufferedOutputStream) this.XO0O10.getValue();
    }

    @aa1
    public final File OIi0() {
        return this.OXO1;
    }

    @Override // com.android.mltcode.paycertificationapi.i0i0X0
    public void OXO1(@aa1 i00OIXiO scope) {
        Intrinsics.X0O(scope, "scope");
        this.O00 = XX01Oi.IiI10X(scope, IXOX0Xiii.m712iO(), null, new AudioFileStreamWriter$start$1(this, null), 2, null);
    }

    @Override // com.android.mltcode.paycertificationapi.i0i0X0
    @tb1
    public Object XIi00iiXO(@aa1 byte[] bArr, @aa1 Continuation<? super Unit> continuation) {
        Object objIIXi1iiXI = this.XIi00iiXO.iIXi1iiXI(bArr, continuation);
        return objIIXi1iiXI == C2798pb.I0iXXO() ? objIIXi1iiXI : Unit.OXO1;
    }

    public final boolean XOO0ii0() {
        return I0iXXO.OXO1.OXO1(this.XIi00iiXO, null, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @tb1
    public final Object XXI(@aa1 Continuation<? super Unit> continuation) {
        AudioFileStreamWriter$waitWriteAudioAndCancel$1 audioFileStreamWriter$waitWriteAudioAndCancel$1;
        if (continuation instanceof AudioFileStreamWriter$waitWriteAudioAndCancel$1) {
            audioFileStreamWriter$waitWriteAudioAndCancel$1 = (AudioFileStreamWriter$waitWriteAudioAndCancel$1) continuation;
            int i = audioFileStreamWriter$waitWriteAudioAndCancel$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                audioFileStreamWriter$waitWriteAudioAndCancel$1.label = i - Integer.MIN_VALUE;
            } else {
                audioFileStreamWriter$waitWriteAudioAndCancel$1 = new AudioFileStreamWriter$waitWriteAudioAndCancel$1(this, continuation);
            }
        } else {
            audioFileStreamWriter$waitWriteAudioAndCancel$1 = new AudioFileStreamWriter$waitWriteAudioAndCancel$1(this, continuation);
        }
        Object obj = audioFileStreamWriter$waitWriteAudioAndCancel$1.result;
        Object objI0iXXO = C2798pb.I0iXXO();
        int i2 = audioFileStreamWriter$waitWriteAudioAndCancel$1.label;
        if (i2 == 0) {
            ResultKt.X1ii(obj);
            XiOIO xiOIO = this.O00;
            if (xiOIO != null) {
                audioFileStreamWriter$waitWriteAudioAndCancel$1.label = 1;
                if (C2954td.I0iXXO(xiOIO, audioFileStreamWriter$waitWriteAudioAndCancel$1) == objI0iXXO) {
                    return objI0iXXO;
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.X1ii(obj);
        }
        this.O00 = null;
        return Unit.OXO1;
    }

    @Override // com.android.mltcode.paycertificationapi.i0i0X0
    public void close() {
        try {
            OIX0iXi().flush();
            OIX0iXi().close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
