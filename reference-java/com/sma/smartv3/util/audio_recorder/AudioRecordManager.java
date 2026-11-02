package com.sma.smartv3.util.audio_recorder;

import android.media.AudioRecord;
import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.C2954td;
import com.android.mltcode.paycertificationapi.IXOX0Xiii;
import com.android.mltcode.paycertificationapi.XX01Oi;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.iX0XiO;
import com.android.mltcode.paycertificationapi.ii0iIIX0;
import com.android.mltcode.paycertificationapi.k85;
import com.android.mltcode.paycertificationapi.l85;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.ty0;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.XiOIO;
import kotlinx.coroutines.channels.IiI10X;
import kotlinx.coroutines.channels.O00;

/* JADX INFO: loaded from: classes3.dex */
public final class AudioRecordManager {

    @aa1
    public final O00<byte[]> I0IIOi;

    /* JADX INFO: renamed from: IO */
    @aa1
    public final k85<Boolean> f54934IO;

    @tb1
    public AudioRecord IiI10X;

    @tb1
    public XiOIO O00;

    @tb1
    public XiOIO OIX0iXi;

    @aa1
    public final ty0<Boolean> OIi0;
    public final int OXO1;
    public final int XIi00iiXO;
    public final int XO0O10;
    public final int XOO0ii0;

    /* JADX INFO: renamed from: iO */
    public final int f54935iO;

    public AudioRecordManager() {
        this(0, 0, 0, 0, 15, null);
    }

    public final void I0IIOi(i00OIXiO i00oixio) {
        AudioRecord audioRecord = this.IiI10X;
        if (audioRecord != null) {
            try {
                if (audioRecord.getRecordingState() == 3) {
                    audioRecord.stop();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (this.IiI10X == null) {
            int minBufferSize = AudioRecord.getMinBufferSize(this.OXO1, this.XIi00iiXO, this.f54935iO);
            if (minBufferSize <= 0) {
                i1O0OXO1O.OXO1.OXO1("AudioRecord 参数不支持");
                return;
            }
            AudioRecord audioRecord2 = new AudioRecord(this.XOO0ii0, this.OXO1, this.XIi00iiXO, this.f54935iO, Math.max(this.XO0O10, minBufferSize));
            this.IiI10X = audioRecord2;
            if (audioRecord2.getState() != 1) {
                i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
                AudioRecord audioRecord3 = this.IiI10X;
                i1o0oxo1o.OXO1("AudioRecord 初始化失败 state=" + (audioRecord3 != null ? Integer.valueOf(audioRecord3.getState()) : null));
                AudioRecord audioRecord4 = this.IiI10X;
                if (audioRecord4 != null) {
                    audioRecord4.release();
                }
                this.IiI10X = null;
                return;
            }
        }
        AudioRecord audioRecord5 = this.IiI10X;
        if (audioRecord5 != null) {
            audioRecord5.startRecording();
        }
        this.OIi0.setValue(Boolean.TRUE);
        this.O00 = XX01Oi.IiI10X(i00oixio, IXOX0Xiii.m712iO(), null, new AudioRecordManager$startRecord$2(this, null), 2, null);
    }

    @aa1
    public final k85<Boolean> IiI10X() {
        return this.f54934IO;
    }

    @aa1
    public final ii0iIIX0<byte[]> O00() {
        return iX0XiO.iIIIiIO0(this.I0IIOi);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @tb1
    public final Object OIi0(@aa1 Continuation<? super Unit> continuation) {
        AudioRecordManager$stop$1 audioRecordManager$stop$1;
        if (continuation instanceof AudioRecordManager$stop$1) {
            audioRecordManager$stop$1 = (AudioRecordManager$stop$1) continuation;
            int i = audioRecordManager$stop$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                audioRecordManager$stop$1.label = i - Integer.MIN_VALUE;
            } else {
                audioRecordManager$stop$1 = new AudioRecordManager$stop$1(this, continuation);
            }
        } else {
            audioRecordManager$stop$1 = new AudioRecordManager$stop$1(this, continuation);
        }
        Object obj = audioRecordManager$stop$1.result;
        Object objI0iXXO = C2798pb.I0iXXO();
        int i2 = audioRecordManager$stop$1.label;
        if (i2 == 0) {
            ResultKt.X1ii(obj);
            XiOIO xiOIO = this.O00;
            if (xiOIO != null) {
                audioRecordManager$stop$1.label = 1;
                if (C2954td.I0iXXO(xiOIO, audioRecordManager$stop$1) == objI0iXXO) {
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
        this.OIi0.setValue(Boxing.OXO1(false));
        AudioRecord audioRecord = this.IiI10X;
        if (audioRecord != null) {
            try {
                try {
                    if (audioRecord.getRecordingState() == 3) {
                        audioRecord.stop();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                audioRecord.release();
            } catch (Throwable th) {
                audioRecord.release();
                throw th;
            }
        }
        this.IiI10X = null;
        return Unit.OXO1;
    }

    public final void XOO0ii0(@aa1 i00OIXiO scope) {
        Intrinsics.X0O(scope, "scope");
        if (this.OIi0.getValue().booleanValue()) {
            return;
        }
        I0IIOi(scope);
    }

    public AudioRecordManager(int i, int i2, int i3, int i4) {
        this.OXO1 = i;
        this.XIi00iiXO = i2;
        this.f54935iO = i3;
        this.XO0O10 = AudioRecord.getMinBufferSize(i, i2, i3) * i4;
        this.XOO0ii0 = 1;
        this.I0IIOi = IiI10X.XO0O10(0, null, null, 7, null);
        ty0<Boolean> ty0VarOXO1 = l85.OXO1(Boolean.FALSE);
        this.OIi0 = ty0VarOXO1;
        this.f54934IO = iX0XiO.XXI(ty0VarOXO1);
    }

    public /* synthetic */ AudioRecordManager(int i, int i2, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 16000 : i, (i5 & 2) != 0 ? 16 : i2, (i5 & 4) != 0 ? 2 : i3, (i5 & 8) != 0 ? 2 : i4);
    }
}
