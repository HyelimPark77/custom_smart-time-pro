package com.sma.smartv3.p610ui.trans_charge;

import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.C2954td;
import com.android.mltcode.paycertificationapi.IXOOiIIII;
import com.android.mltcode.paycertificationapi.IXOX0Xiii;
import com.android.mltcode.paycertificationapi.XX01Oi;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.bw6;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.i1Ii0IIi0;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.XiOIO;

/* JADX INFO: loaded from: classes3.dex */
public final class AudioOutputService implements i1Ii0IIi0 {

    @aa1
    public final bw6 OXO1;

    @aa1
    public final IXOOiIIII XIi00iiXO;

    /* JADX INFO: renamed from: iO */
    @tb1
    public XiOIO f54817iO;

    public AudioOutputService(@aa1 bw6 client, @aa1 IXOOiIIII audioManager) {
        Intrinsics.X0O(client, "client");
        Intrinsics.X0O(audioManager, "audioManager");
        this.OXO1 = client;
        this.XIi00iiXO = audioManager;
    }

    @Override // com.android.mltcode.paycertificationapi.iX1iI
    public void OXO1(@aa1 i00OIXiO scope) {
        Intrinsics.X0O(scope, "scope");
        this.f54817iO = XX01Oi.IiI10X(scope, IXOX0Xiii.m712iO(), null, new AudioOutputService$start$1(this, scope, null), 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.android.mltcode.paycertificationapi.iX1iI
    @tb1
    public Object XIi00iiXO(@aa1 Continuation<? super Unit> continuation) {
        AudioOutputService$stop$1 audioOutputService$stop$1;
        if (continuation instanceof AudioOutputService$stop$1) {
            audioOutputService$stop$1 = (AudioOutputService$stop$1) continuation;
            int i = audioOutputService$stop$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                audioOutputService$stop$1.label = i - Integer.MIN_VALUE;
            } else {
                audioOutputService$stop$1 = new AudioOutputService$stop$1(this, continuation);
            }
        } else {
            audioOutputService$stop$1 = new AudioOutputService$stop$1(this, continuation);
        }
        Object obj = audioOutputService$stop$1.result;
        Object objI0iXXO = C2798pb.I0iXXO();
        int i2 = audioOutputService$stop$1.label;
        if (i2 == 0) {
            ResultKt.X1ii(obj);
            XiOIO xiOIO = this.f54817iO;
            if (xiOIO != null) {
                audioOutputService$stop$1.label = 1;
                if (C2954td.I0iXXO(xiOIO, audioOutputService$stop$1) == objI0iXXO) {
                    return objI0iXXO;
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.X1ii(obj);
        }
        this.f54817iO = null;
        return Unit.OXO1;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.android.mltcode.paycertificationapi.InterfaceC3188zq
    @tb1
    public Object XO0O10(@aa1 i00OIXiO i00oixio, @aa1 Continuation<? super String> continuation) {
        AudioOutputService$flushLocalAudioAndGetPath$1 audioOutputService$flushLocalAudioAndGetPath$1;
        if (continuation instanceof AudioOutputService$flushLocalAudioAndGetPath$1) {
            audioOutputService$flushLocalAudioAndGetPath$1 = (AudioOutputService$flushLocalAudioAndGetPath$1) continuation;
            int i = audioOutputService$flushLocalAudioAndGetPath$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                audioOutputService$flushLocalAudioAndGetPath$1.label = i - Integer.MIN_VALUE;
            } else {
                audioOutputService$flushLocalAudioAndGetPath$1 = new AudioOutputService$flushLocalAudioAndGetPath$1(this, continuation);
            }
        } else {
            audioOutputService$flushLocalAudioAndGetPath$1 = new AudioOutputService$flushLocalAudioAndGetPath$1(this, continuation);
        }
        Object obj = audioOutputService$flushLocalAudioAndGetPath$1.result;
        Object objI0iXXO = C2798pb.I0iXXO();
        int i2 = audioOutputService$flushLocalAudioAndGetPath$1.label;
        if (i2 == 0) {
            ResultKt.X1ii(obj);
            IXOOiIIII iXOOiIIII = this.XIi00iiXO;
            audioOutputService$flushLocalAudioAndGetPath$1.L$0 = i00oixio;
            audioOutputService$flushLocalAudioAndGetPath$1.label = 1;
            if (iXOOiIIII.O00(audioOutputService$flushLocalAudioAndGetPath$1) == objI0iXXO) {
                return objI0iXXO;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i00oixio = (i00OIXiO) audioOutputService$flushLocalAudioAndGetPath$1.L$0;
            ResultKt.X1ii(obj);
        }
        i00OIXiO i00oixio2 = i00oixio;
        String strMo711iO = this.XIi00iiXO.mo711iO();
        XX01Oi.IiI10X(i00oixio2, IXOX0Xiii.m712iO(), null, new AudioOutputService$flushLocalAudioAndGetPath$2(this, i00oixio2, null), 2, null);
        return strMo711iO;
    }

    @Override // com.android.mltcode.paycertificationapi.iX1iI
    public void clear() {
        XiOIO xiOIO = this.f54817iO;
        if (xiOIO != null) {
            XiOIO.OXO1.XIi00iiXO(xiOIO, null, 1, null);
        }
        this.f54817iO = null;
    }

    @Override // com.android.mltcode.paycertificationapi.I1OO
    public void play() {
        i1O0OXO1O.OXO1.OXO1("LocalAudio Can't Play");
    }
}
