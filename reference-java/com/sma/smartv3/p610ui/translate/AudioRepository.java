package com.sma.smartv3.p610ui.translate;

import com.android.mltcode.paycertificationapi.C2798pb;
import com.android.mltcode.paycertificationapi.IXOX0Xiii;
import com.android.mltcode.paycertificationapi.X0I1OO1;
import com.android.mltcode.paycertificationapi.XX01Oi;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.b06;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.i1Ii0IIi0;
import com.android.mltcode.paycertificationapi.iXOIii;
import com.android.mltcode.paycertificationapi.k85;
import com.android.mltcode.paycertificationapi.tb1;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.I0IIOi;
import kotlinx.coroutines.XiOIO;

/* JADX INFO: loaded from: classes3.dex */
public final class AudioRepository implements b06 {

    @aa1
    public final i00OIXiO OXO1;

    @aa1
    public final i1Ii0IIi0 XIi00iiXO;

    @aa1
    public final k85<Boolean> XO0O10;

    /* JADX INFO: renamed from: iO */
    @aa1
    public final X0I1OO1 f54822iO;

    public static final class OXO1 implements iXOIii {
        public final /* synthetic */ Function1<byte[], Unit> OXO1;

        /* JADX WARN: Multi-variable type inference failed */
        public OXO1(Function1<? super byte[], Unit> function1) {
            this.OXO1 = function1;
        }

        @Override // com.android.mltcode.paycertificationapi.iXOIii
        public final Object OXO1(byte[] bArr, Continuation<? super Unit> continuation) {
            this.OXO1.invoke2(bArr);
            return Unit.OXO1;
        }
    }

    /* JADX INFO: renamed from: com.sma.smartv3.ui.translate.AudioRepository$stop$1 */
    @DebugMetadata(m39465c = "com.sma.smartv3.ui.translate.AudioRepository$stop$1", m39466f = "AudioRepository.kt", m39467i = {}, m39468l = {114}, m39469m = "invokeSuspend", m39470n = {}, m39472s = {}, m39473v = 1)
    public static final class C189921 extends SuspendLambda implements Function2<i00OIXiO, Continuation<? super Unit>, Object> {
        int label;

        public C189921(Continuation<? super C189921> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AudioRepository.this.new C189921(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(i00OIXiO i00oixio, Continuation<? super Unit> continuation) {
            return ((C189921) create(i00oixio, continuation)).invokeSuspend(Unit.OXO1);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object objI0iXXO = C2798pb.I0iXXO();
            int i = this.label;
            if (i == 0) {
                ResultKt.X1ii(obj);
                X0I1OO1 x0i1oo1 = AudioRepository.this.f54822iO;
                this.label = 1;
                if (x0i1oo1.XIi00iiXO(this) == objI0iXXO) {
                    return objI0iXXO;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.X1ii(obj);
            }
            return Unit.OXO1;
        }
    }

    public AudioRepository(@aa1 i00OIXiO scope, @aa1 i1Ii0IIi0 audioOutput, @aa1 X0I1OO1 audioInput) {
        Intrinsics.X0O(scope, "scope");
        Intrinsics.X0O(audioOutput, "audioOutput");
        Intrinsics.X0O(audioInput, "audioInput");
        this.OXO1 = scope;
        this.XIi00iiXO = audioOutput;
        this.f54822iO = audioInput;
        this.XO0O10 = audioInput.mo506iO();
    }

    public static /* synthetic */ void I0iXXO(AudioRepository audioRepository, iXOIii ixoiii, int i, Object obj) {
        if ((i & 1) != 0) {
            ixoiii = null;
        }
        audioRepository.OIX0iXi(ixoiii);
    }

    /* JADX INFO: renamed from: IO */
    public static /* synthetic */ void m38761IO(AudioRepository audioRepository, boolean z, iXOIii ixoiii, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        audioRepository.OIi0(z, ixoiii);
    }

    public final void I0IIOi(@tb1 iXOIii ixoiii) {
        this.f54822iO.IiI10X(this.OXO1, ixoiii);
    }

    @tb1
    public final Object I1XOi1(@aa1 Continuation<? super Unit> continuation) {
        Object objXIi00iiXO = this.XIi00iiXO.XIi00iiXO(continuation);
        return objXIi00iiXO == C2798pb.I0iXXO() ? objXIi00iiXO : Unit.OXO1;
    }

    public final void IiI10X() {
        this.XIi00iiXO.OXO1(this.OXO1);
    }

    @tb1
    public final Object O00(@aa1 Continuation<? super String> continuation) {
        return this.f54822iO.XO0O10(this.OXO1, continuation);
    }

    @aa1
    public final XiOIO O10IXXX0X() {
        return XX01Oi.IiI10X(this.OXO1, IXOX0Xiii.m712iO(), null, new AudioRepository$stopRecordAndStreamPlayer$1(this, null), 2, null);
    }

    public final void OIX0iXi(@tb1 iXOIii ixoiii) {
        this.f54822iO.IiI10X(this.OXO1, ixoiii);
        this.XIi00iiXO.OXO1(this.OXO1);
    }

    public final void OIi0(boolean z, @tb1 iXOIii ixoiii) {
        this.f54822iO.IiI10X(this.OXO1, ixoiii);
        if (z) {
            IiI10X();
        }
    }

    @Override // com.android.mltcode.paycertificationapi.b06
    public void OXO1(@aa1 Function1<? super byte[], Unit> audioByte) {
        Intrinsics.X0O(audioByte, "audioByte");
        this.f54822iO.IiI10X(this.OXO1, new OXO1(audioByte));
    }

    @tb1
    public final Object X0O(@aa1 Continuation<? super Unit> continuation) {
        Object objXIi00iiXO = this.f54822iO.XIi00iiXO(continuation);
        return objXIi00iiXO == C2798pb.I0iXXO() ? objXIi00iiXO : Unit.OXO1;
    }

    @aa1
    public final XiOIO X1ii() {
        return XX01Oi.IiI10X(this.OXO1, IXOX0Xiii.m712iO(), null, new AudioRepository$stopRecord$1(this, null), 2, null);
    }

    @tb1
    public final Object XO0O10(@aa1 Continuation<? super String> continuation) {
        return this.XIi00iiXO.XO0O10(this.OXO1, continuation);
    }

    public final void XOO0ii0() {
        this.XIi00iiXO.play();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0053, code lost:
    
        if (r7.XIi00iiXO(r0) == r1) goto L28;
     */
    @tb1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object XXI(@aa1 Continuation<? super Unit> continuation) {
        AudioRepository$stopAllJob$1 audioRepository$stopAllJob$1;
        if (continuation instanceof AudioRepository$stopAllJob$1) {
            audioRepository$stopAllJob$1 = (AudioRepository$stopAllJob$1) continuation;
            int i = audioRepository$stopAllJob$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                audioRepository$stopAllJob$1.label = i - Integer.MIN_VALUE;
            } else {
                audioRepository$stopAllJob$1 = new AudioRepository$stopAllJob$1(this, continuation);
            }
        } else {
            audioRepository$stopAllJob$1 = new AudioRepository$stopAllJob$1(this, continuation);
        }
        Object obj = audioRepository$stopAllJob$1.result;
        Object objI0iXXO = C2798pb.I0iXXO();
        int i2 = audioRepository$stopAllJob$1.label;
        try {
            if (i2 == 0) {
                ResultKt.X1ii(obj);
                X0I1OO1 x0i1oo1 = this.f54822iO;
                audioRepository$stopAllJob$1.label = 1;
                if (x0i1oo1.XIi00iiXO(audioRepository$stopAllJob$1) == objI0iXXO) {
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
            this.f54822iO.clear();
            this.XIi00iiXO.clear();
            return Unit.OXO1;
            i1Ii0IIi0 i1ii0iii0 = this.XIi00iiXO;
            audioRepository$stopAllJob$1.label = 2;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            I0IIOi.IiI10X(this.OXO1, null, 1, null);
        }
    }

    @Override // com.android.mltcode.paycertificationapi.b06
    @aa1
    /* JADX INFO: renamed from: iO */
    public k85<Boolean> mo628iO() {
        return this.XO0O10;
    }

    @Override // com.android.mltcode.paycertificationapi.b06
    public void stop() {
        XX01Oi.IiI10X(this.OXO1, IXOX0Xiii.m712iO(), null, new C189921(null), 2, null);
    }
}
