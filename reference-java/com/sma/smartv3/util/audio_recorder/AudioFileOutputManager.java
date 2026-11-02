package com.sma.smartv3.util.audio_recorder;

import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.IXOOiIIII;
import com.android.mltcode.paycertificationapi.IiXI1X1OO;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.tb1;
import com.blankj.utilcode.util.PathUtils;
import com.tenmeter.smlibrary.utils.FileUtils;
import java.io.File;
import java.util.UUID;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt___StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class AudioFileOutputManager implements IXOOiIIII {

    @aa1
    public final String OXO1;
    public final String XIi00iiXO;

    /* JADX INFO: renamed from: iO */
    @tb1
    public AudioFileStreamWriter f54932iO;

    /* JADX WARN: Multi-variable type inference failed */
    public AudioFileOutputManager() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.android.mltcode.paycertificationapi.IXOOiIIII
    @tb1
    public Object IiI10X(@aa1 byte[] bArr, @aa1 Continuation<? super Unit> continuation) {
        Object objXIi00iiXO;
        AudioFileStreamWriter audioFileStreamWriter = this.f54932iO;
        return (audioFileStreamWriter == null || (objXIi00iiXO = audioFileStreamWriter.XIi00iiXO(bArr, continuation)) != C2798pb.I0iXXO()) ? Unit.OXO1 : objXIi00iiXO;
    }

    @Override // com.android.mltcode.paycertificationapi.IXOOiIIII
    @tb1
    public Object O00(@aa1 Continuation<? super Unit> continuation) {
        Object objXXI;
        AudioFileStreamWriter audioFileStreamWriter = this.f54932iO;
        return (audioFileStreamWriter == null || (objXXI = audioFileStreamWriter.XXI(continuation)) != C2798pb.I0iXXO()) ? Unit.OXO1 : objXXI;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.android.mltcode.paycertificationapi.IXOOiIIII
    @tb1
    public Object OXO1(@aa1 Continuation<? super Unit> continuation) {
        AudioFileOutputManager$clear$1 audioFileOutputManager$clear$1;
        if (continuation instanceof AudioFileOutputManager$clear$1) {
            audioFileOutputManager$clear$1 = (AudioFileOutputManager$clear$1) continuation;
            int i = audioFileOutputManager$clear$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                audioFileOutputManager$clear$1.label = i - Integer.MIN_VALUE;
            } else {
                audioFileOutputManager$clear$1 = new AudioFileOutputManager$clear$1(this, continuation);
            }
        } else {
            audioFileOutputManager$clear$1 = new AudioFileOutputManager$clear$1(this, continuation);
        }
        Object obj = audioFileOutputManager$clear$1.result;
        Object objI0iXXO = C2798pb.I0iXXO();
        int i2 = audioFileOutputManager$clear$1.label;
        if (i2 == 0) {
            ResultKt.X1ii(obj);
            AudioFileStreamWriter audioFileStreamWriter = this.f54932iO;
            if (audioFileStreamWriter != null) {
                Boxing.OXO1(audioFileStreamWriter.XOO0ii0());
            }
            AudioFileStreamWriter audioFileStreamWriter2 = this.f54932iO;
            if (audioFileStreamWriter2 != null) {
                audioFileOutputManager$clear$1.label = 1;
                if (audioFileStreamWriter2.XXI(audioFileOutputManager$clear$1) == objI0iXXO) {
                    return objI0iXXO;
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.X1ii(obj);
        }
        AudioFileStreamWriter audioFileStreamWriter3 = this.f54932iO;
        if (audioFileStreamWriter3 != null) {
            audioFileStreamWriter3.close();
        }
        return Unit.OXO1;
    }

    @Override // com.android.mltcode.paycertificationapi.IXOOiIIII
    public void XIi00iiXO(@aa1 i00OIXiO scope) {
        Intrinsics.X0O(scope, "scope");
        AudioFileStreamWriter audioFileStreamWriter = new AudioFileStreamWriter(new File(XOO0ii0()));
        audioFileStreamWriter.OXO1(scope);
        this.f54932iO = audioFileStreamWriter;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.android.mltcode.paycertificationapi.IXOOiIIII
    @tb1
    public Object XO0O10(@aa1 Continuation<? super Unit> continuation) {
        AudioFileOutputManager$closeAudioWrite$1 audioFileOutputManager$closeAudioWrite$1;
        if (continuation instanceof AudioFileOutputManager$closeAudioWrite$1) {
            audioFileOutputManager$closeAudioWrite$1 = (AudioFileOutputManager$closeAudioWrite$1) continuation;
            int i = audioFileOutputManager$closeAudioWrite$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                audioFileOutputManager$closeAudioWrite$1.label = i - Integer.MIN_VALUE;
            } else {
                audioFileOutputManager$closeAudioWrite$1 = new AudioFileOutputManager$closeAudioWrite$1(this, continuation);
            }
        } else {
            audioFileOutputManager$closeAudioWrite$1 = new AudioFileOutputManager$closeAudioWrite$1(this, continuation);
        }
        Object obj = audioFileOutputManager$closeAudioWrite$1.result;
        Object objI0iXXO = C2798pb.I0iXXO();
        int i2 = audioFileOutputManager$closeAudioWrite$1.label;
        if (i2 == 0) {
            ResultKt.X1ii(obj);
            AudioFileStreamWriter audioFileStreamWriter = this.f54932iO;
            if (audioFileStreamWriter != null) {
                audioFileOutputManager$closeAudioWrite$1.label = 1;
                if (audioFileStreamWriter.XXI(audioFileOutputManager$closeAudioWrite$1) == objI0iXXO) {
                    return objI0iXXO;
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.X1ii(obj);
        }
        AudioFileStreamWriter audioFileStreamWriter2 = this.f54932iO;
        if (audioFileStreamWriter2 != null) {
            audioFileStreamWriter2.close();
        }
        return Unit.OXO1;
    }

    public final String XOO0ii0() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        String string = UUID.randomUUID().toString();
        Intrinsics.O10IXXX0X(string, "toString(...)");
        String str = jCurrentTimeMillis + IiXI1X1OO.O00 + StringsKt___StringsKt.iX1iii(string, 6);
        return this.XIi00iiXO + "/file/audio/" + str + FileUtils.FILE_EXTENSION_SEPARATOR + this.OXO1;
    }

    @Override // com.android.mltcode.paycertificationapi.IXOOiIIII
    @tb1
    /* JADX INFO: renamed from: iO */
    public String mo711iO() {
        File fileOIi0;
        AudioFileStreamWriter audioFileStreamWriter = this.f54932iO;
        if (audioFileStreamWriter == null || (fileOIi0 = audioFileStreamWriter.OIi0()) == null) {
            return null;
        }
        return fileOIi0.getAbsolutePath();
    }

    public AudioFileOutputManager(@aa1 String fileExtension) {
        Intrinsics.X0O(fileExtension, "fileExtension");
        this.OXO1 = fileExtension;
        this.XIi00iiXO = PathUtils.getExternalAppDataPath();
    }

    public /* synthetic */ AudioFileOutputManager(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "pcm" : str);
    }
}
