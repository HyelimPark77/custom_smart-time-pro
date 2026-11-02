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
public final class LocalAudioInputService implements X0I1OO1 {

    @aa1
    public final AudioRecordManager OXO1;

    @tb1
    public final AudioFileOutputManager XIi00iiXO;

    @tb1
    public XiOIO XO0O10;

    /* JADX INFO: renamed from: iO */
    @aa1
    public final k85<Boolean> f54824iO;

    public LocalAudioInputService(@aa1 AudioRecordManager audioRecorder, @tb1 AudioFileOutputManager audioFileOutputManager) {
        Intrinsics.X0O(audioRecorder, "audioRecorder");
        this.OXO1 = audioRecorder;
        this.XIi00iiXO = audioFileOutputManager;
        this.f54824iO = audioRecorder.IiI10X();
    }

    @Override // com.android.mltcode.paycertificationapi.I0OiOOI1
    public void IiI10X(@aa1 i00OIXiO scope, @tb1 iXOIii ixoiii) {
        Intrinsics.X0O(scope, "scope");
        XiOIO xiOIO = this.XO0O10;
        if (xiOIO != null) {
            XiOIO.OXO1.XIi00iiXO(xiOIO, null, 1, null);
        }
        AudioFileOutputManager audioFileOutputManager = this.XIi00iiXO;
        if (audioFileOutputManager != null) {
            audioFileOutputManager.XIi00iiXO(scope);
        }
        this.OXO1.XOO0ii0(scope);
        this.XO0O10 = XX01Oi.IiI10X(scope, IXOX0Xiii.m712iO(), null, new LocalAudioInputService$start$1(this, ixoiii, null), 2, null);
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
        LocalAudioInputService$stop$1 localAudioInputService$stop$1;
        if (continuation instanceof LocalAudioInputService$stop$1) {
            localAudioInputService$stop$1 = (LocalAudioInputService$stop$1) continuation;
            int i = localAudioInputService$stop$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                localAudioInputService$stop$1.label = i - Integer.MIN_VALUE;
            } else {
                localAudioInputService$stop$1 = new LocalAudioInputService$stop$1(this, continuation);
            }
        } else {
            localAudioInputService$stop$1 = new LocalAudioInputService$stop$1(this, continuation);
        }
        Object obj = localAudioInputService$stop$1.result;
        Object objI0iXXO = C2798pb.I0iXXO();
        int i2 = localAudioInputService$stop$1.label;
        if (i2 == 0) {
            ResultKt.X1ii(obj);
            AudioRecordManager audioRecordManager = this.OXO1;
            localAudioInputService$stop$1.label = 1;
            if (audioRecordManager.OIi0(localAudioInputService$stop$1) != objI0iXXO) {
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
        this.XO0O10 = null;
        return Unit.OXO1;
        XiOIO xiOIO = this.XO0O10;
        if (xiOIO != null) {
            localAudioInputService$stop$1.label = 2;
        }
        this.XO0O10 = null;
        return Unit.OXO1;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.android.mltcode.paycertificationapi.InterfaceC3188zq
    @tb1
    public Object XO0O10(@aa1 i00OIXiO i00oixio, @aa1 Continuation<? super String> continuation) {
        LocalAudioInputService$flushLocalAudioAndGetPath$1 localAudioInputService$flushLocalAudioAndGetPath$1;
        if (continuation instanceof LocalAudioInputService$flushLocalAudioAndGetPath$1) {
            localAudioInputService$flushLocalAudioAndGetPath$1 = (LocalAudioInputService$flushLocalAudioAndGetPath$1) continuation;
            int i = localAudioInputService$flushLocalAudioAndGetPath$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                localAudioInputService$flushLocalAudioAndGetPath$1.label = i - Integer.MIN_VALUE;
            } else {
                localAudioInputService$flushLocalAudioAndGetPath$1 = new LocalAudioInputService$flushLocalAudioAndGetPath$1(this, continuation);
            }
        } else {
            localAudioInputService$flushLocalAudioAndGetPath$1 = new LocalAudioInputService$flushLocalAudioAndGetPath$1(this, continuation);
        }
        Object obj = localAudioInputService$flushLocalAudioAndGetPath$1.result;
        Object objI0iXXO = C2798pb.I0iXXO();
        int i2 = localAudioInputService$flushLocalAudioAndGetPath$1.label;
        if (i2 == 0) {
            ResultKt.X1ii(obj);
            AudioFileOutputManager audioFileOutputManager = this.XIi00iiXO;
            if (audioFileOutputManager != null) {
                localAudioInputService$flushLocalAudioAndGetPath$1.L$0 = i00oixio;
                localAudioInputService$flushLocalAudioAndGetPath$1.label = 1;
                if (audioFileOutputManager.O00(localAudioInputService$flushLocalAudioAndGetPath$1) == objI0iXXO) {
                    return objI0iXXO;
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i00oixio = (i00OIXiO) localAudioInputService$flushLocalAudioAndGetPath$1.L$0;
            ResultKt.X1ii(obj);
        }
        i00OIXiO i00oixio2 = i00oixio;
        AudioFileOutputManager audioFileOutputManager2 = this.XIi00iiXO;
        String strMo711iO = audioFileOutputManager2 != null ? audioFileOutputManager2.mo711iO() : null;
        XX01Oi.IiI10X(i00oixio2, IXOX0Xiii.m712iO(), null, new LocalAudioInputService$flushLocalAudioAndGetPath$2(this, i00oixio2, null), 2, null);
        return strMo711iO;
    }

    @Override // com.android.mltcode.paycertificationapi.I0OiOOI1
    public void clear() {
        XiOIO xiOIO = this.XO0O10;
        if (xiOIO != null) {
            XiOIO.OXO1.XIi00iiXO(xiOIO, null, 1, null);
        }
        this.XO0O10 = null;
    }

    @Override // com.android.mltcode.paycertificationapi.I0OiOOI1
    @aa1
    /* JADX INFO: renamed from: iO */
    public k85<Boolean> mo506iO() {
        return this.f54824iO;
    }

    public /* synthetic */ LocalAudioInputService(AudioRecordManager audioRecordManager, AudioFileOutputManager audioFileOutputManager, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(audioRecordManager, (i & 2) != 0 ? null : audioFileOutputManager);
    }
}
