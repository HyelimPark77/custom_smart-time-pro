package com.sma.smartv3.p610ui.translate;

import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.IXOX0Xiii;
import com.android.mltcode.paycertificationapi.X0I1OO1;
import com.android.mltcode.paycertificationapi.XX01Oi;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.iXOIii;
import com.android.mltcode.paycertificationapi.k85;
import com.android.mltcode.paycertificationapi.tb1;
import com.sma.smartv3.util.audio_recorder.AudioFileOutputManager;
import com.sma.smartv3.util.audio_recorder.AudioRecordManager;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.XiOIO;

/* JADX INFO: loaded from: classes3.dex */
public final class AudioInputService implements X0I1OO1 {

    @aa1
    public final AudioRecordManager OXO1;

    @tb1
    public final AudioFileOutputManager XIi00iiXO;

    @aa1
    public final k85<Boolean> XO0O10;

    /* JADX INFO: renamed from: iO */
    @tb1
    public XiOIO f54819iO;

    public AudioInputService(@aa1 AudioRecordManager audioRecordManager, @tb1 AudioFileOutputManager audioFileOutputManager) {
        Intrinsics.X0O(audioRecordManager, "audioRecordManager");
        this.OXO1 = audioRecordManager;
        this.XIi00iiXO = audioFileOutputManager;
        this.XO0O10 = audioRecordManager.IiI10X();
    }

    @Override // com.android.mltcode.paycertificationapi.I0OiOOI1
    public void IiI10X(@aa1 i00OIXiO scope, @tb1 iXOIii ixoiii) {
        Intrinsics.X0O(scope, "scope");
        XiOIO xiOIO = this.f54819iO;
        if (xiOIO != null) {
            XiOIO.OXO1.XIi00iiXO(xiOIO, null, 1, null);
        }
        this.OXO1.XOO0ii0(scope);
        AudioFileOutputManager audioFileOutputManager = this.XIi00iiXO;
        if (audioFileOutputManager != null) {
            audioFileOutputManager.XIi00iiXO(scope);
        }
        this.f54819iO = XX01Oi.IiI10X(scope, IXOX0Xiii.m712iO(), null, new AudioInputService$start$1(this, ixoiii, null), 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0050, code lost:
    
        if (com.android.mltcode.paycertificationapi.C2954td.I0iXXO(r6, r0) == r1) goto L23;
     */
    @Override // com.android.mltcode.paycertificationapi.I0OiOOI1
    @tb1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object XIi00iiXO(@aa1 Continuation<? super Unit> continuation) {
        AudioInputService$stop$1 audioInputService$stop$1;
        if (continuation instanceof AudioInputService$stop$1) {
            audioInputService$stop$1 = (AudioInputService$stop$1) continuation;
            int i = audioInputService$stop$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                audioInputService$stop$1.label = i - Integer.MIN_VALUE;
            } else {
                audioInputService$stop$1 = new AudioInputService$stop$1(this, continuation);
            }
        } else {
            audioInputService$stop$1 = new AudioInputService$stop$1(this, continuation);
        }
        Object obj = audioInputService$stop$1.result;
        Object objI0iXXO = C2798pb.I0iXXO();
        int i2 = audioInputService$stop$1.label;
        if (i2 == 0) {
            ResultKt.X1ii(obj);
            AudioRecordManager audioRecordManager = this.OXO1;
            audioInputService$stop$1.label = 1;
            if (audioRecordManager.OIi0(audioInputService$stop$1) != objI0iXXO) {
            }
            return objI0iXXO;
        }
        if (i2 == 1) {
            ResultKt.X1ii(obj);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.X1ii(obj);
        }
        this.f54819iO = null;
        return Unit.OXO1;
        XiOIO xiOIO = this.f54819iO;
        if (xiOIO != null) {
            audioInputService$stop$1.label = 2;
        }
        this.f54819iO = null;
        return Unit.OXO1;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.android.mltcode.paycertificationapi.InterfaceC3188zq
    @tb1
    public Object XO0O10(@aa1 i00OIXiO i00oixio, @aa1 Continuation<? super String> continuation) {
        AudioInputService$flushLocalAudioAndGetPath$1 audioInputService$flushLocalAudioAndGetPath$1;
        if (continuation instanceof AudioInputService$flushLocalAudioAndGetPath$1) {
            audioInputService$flushLocalAudioAndGetPath$1 = (AudioInputService$flushLocalAudioAndGetPath$1) continuation;
            int i = audioInputService$flushLocalAudioAndGetPath$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                audioInputService$flushLocalAudioAndGetPath$1.label = i - Integer.MIN_VALUE;
            } else {
                audioInputService$flushLocalAudioAndGetPath$1 = new AudioInputService$flushLocalAudioAndGetPath$1(this, continuation);
            }
        } else {
            audioInputService$flushLocalAudioAndGetPath$1 = new AudioInputService$flushLocalAudioAndGetPath$1(this, continuation);
        }
        Object obj = audioInputService$flushLocalAudioAndGetPath$1.result;
        Object objI0iXXO = C2798pb.I0iXXO();
        int i2 = audioInputService$flushLocalAudioAndGetPath$1.label;
        if (i2 == 0) {
            ResultKt.X1ii(obj);
            AudioFileOutputManager audioFileOutputManager = this.XIi00iiXO;
            if (audioFileOutputManager != null) {
                audioInputService$flushLocalAudioAndGetPath$1.L$0 = i00oixio;
                audioInputService$flushLocalAudioAndGetPath$1.label = 1;
                if (audioFileOutputManager.O00(audioInputService$flushLocalAudioAndGetPath$1) == objI0iXXO) {
                    return objI0iXXO;
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i00oixio = (i00OIXiO) audioInputService$flushLocalAudioAndGetPath$1.L$0;
            ResultKt.X1ii(obj);
        }
        i00OIXiO i00oixio2 = i00oixio;
        AudioFileOutputManager audioFileOutputManager2 = this.XIi00iiXO;
        String strMo711iO = audioFileOutputManager2 != null ? audioFileOutputManager2.mo711iO() : null;
        XX01Oi.IiI10X(i00oixio2, IXOX0Xiii.m712iO(), null, new AudioInputService$flushLocalAudioAndGetPath$2(this, i00oixio2, null), 2, null);
        return strMo711iO;
    }

    @Override // com.android.mltcode.paycertificationapi.I0OiOOI1
    public void clear() {
        XiOIO xiOIO = this.f54819iO;
        if (xiOIO != null) {
            XiOIO.OXO1.XIi00iiXO(xiOIO, null, 1, null);
        }
        this.f54819iO = null;
    }

    @Override // com.android.mltcode.paycertificationapi.I0OiOOI1
    @aa1
    /* JADX INFO: renamed from: iO */
    public k85<Boolean> mo506iO() {
        return this.XO0O10;
    }

    public /* synthetic */ AudioInputService(AudioRecordManager audioRecordManager, AudioFileOutputManager audioFileOutputManager, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(audioRecordManager, (i & 2) != 0 ? null : audioFileOutputManager);
    }
}
