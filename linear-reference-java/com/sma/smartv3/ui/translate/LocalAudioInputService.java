package com.sma.smartv3.ui.translate;

import com.android.mltcode.paycertificationapi.I100X1;
import com.android.mltcode.paycertificationapi.IXOX0Xiii;
import com.android.mltcode.paycertificationapi.X0I1OO1;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.iXOIii;
import com.android.mltcode.paycertificationapi.k85;
import com.android.mltcode.paycertificationapi.pb;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.td;
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

    @aa1
    public final k85<Boolean> iO;

    public LocalAudioInputService(@aa1 AudioRecordManager r2, @tb1 AudioFileOutputManager r3) {
        Intrinsics.X0O(r2, "audioRecorder");
        this.OXO1 = r2;
        this.XIi00iiXO = r3;
        this.iO = r2.IiI10X();
    }

    public static final /* synthetic */ AudioRecordManager OXO1(LocalAudioInputService r0) {
        return r0.OXO1;
    }

    public static final /* synthetic */ AudioFileOutputManager XOO0ii0(LocalAudioInputService r0) {
        return r0.XIi00iiXO;
    }

    @Override // com.android.mltcode.paycertificationapi.I0OiOOI1
    public void IiI10X(@aa1 i00OIXiO r9, @tb1 iXOIii r10) {
        Intrinsics.X0O(r9, "scope");
        XiOIO r0 = this.XO0O10;
        if (r0 == null) goto L5;
        XiOIO.OXO1.XIi00iiXO(r0, null, 1, null);
    L5:
        AudioFileOutputManager r1 = this.XIi00iiXO;
        if (r1 == null) goto L8;
        r1.XIi00iiXO(r9);
    L8:
        this.OXO1.XOO0ii0(r9);
        this.XO0O10 = I100X1.O00(r9, IXOX0Xiii.iO(), null, new LocalAudioInputService$start$1(this, r10, null), 2, null);
    }

    @Override // com.android.mltcode.paycertificationapi.I0OiOOI1
    @tb1
    public Object XIi00iiXO(@aa1 Continuation<? super Unit> r6) {
        if ((r6 instanceof LocalAudioInputService$stop$1) == false) goto L7;
        LocalAudioInputService$stop$1 r0 = (LocalAudioInputService$stop$1) r6;
        int r1 = r0.label;
        if ((r1 & Integer.MIN_VALUE) == 0) goto L7;
        r0.label = r1 - Integer.MIN_VALUE;
    L8:
        Object r7 = r0.result;
        Object r2 = pb.I0iXXO();
        int r3 = r0.label;
        if (r3 == 0) goto L16;
        if (r3 == 1) goto L15;
        if (r3 != 2) goto L14;
        ResultKt.X1ii(r7);
    L24:
        this.XO0O10 = null;
        return Unit.OXO1;
    L14:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L15:
        ResultKt.X1ii(r7);
    L19:
        XiOIO r8 = this.XO0O10;
        if (r8 == null) goto L24;
        r0.label = 2;
        if (td.I0iXXO(r8, r0) != r2) goto L24;
    L23:
        return r2;
    L16:
        ResultKt.X1ii(r7);
        AudioRecordManager r9 = this.OXO1;
        r0.label = 1;
        if (r9.OIi0(r0) != r2) goto L19;
    L7:
        r0 = new LocalAudioInputService$stop$1(this, r6);
        goto L8
    }

    @Override // com.android.mltcode.paycertificationapi.zq
    @tb1
    public Object XO0O10(@aa1 i00OIXiO r7, @aa1 Continuation<? super String> r8) {
        if ((r8 instanceof LocalAudioInputService$flushLocalAudioAndGetPath$1) == false) goto L7;
        LocalAudioInputService$flushLocalAudioAndGetPath$1 r0 = (LocalAudioInputService$flushLocalAudioAndGetPath$1) r8;
        int r1 = r0.label;
        if ((r1 & Integer.MIN_VALUE) == 0) goto L7;
        r0.label = r1 - Integer.MIN_VALUE;
    L8:
        Object r9 = r0.result;
        Object r2 = pb.I0iXXO();
        int r3 = r0.label;
        if (r3 == 0) goto L14;
        if (r3 != 1) goto L13;
        r7 = (i00OIXiO) r0.L$0;
        ResultKt.X1ii(r9);
    L19:
        i00OIXiO r4 = r7;
        AudioFileOutputManager r10 = this.XIi00iiXO;
        if (r10 == null) goto L22;
        String r11 = r10.iO();
    L23:
        I100X1.O00(r4, IXOX0Xiii.iO(), null, new LocalAudioInputService$flushLocalAudioAndGetPath$2(this, r4, null), 2, null);
        return r11;
    L22:
        r11 = null;
        goto L23
    L13:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L14:
        ResultKt.X1ii(r9);
        AudioFileOutputManager r12 = this.XIi00iiXO;
        if (r12 == null) goto L19;
        r0.L$0 = r7;
        r0.label = 1;
        if (r12.O00(r0) != r2) goto L19;
        return r2;
    L7:
        r0 = new LocalAudioInputService$flushLocalAudioAndGetPath$1(this, r8);
        goto L8
    }

    @Override // com.android.mltcode.paycertificationapi.I0OiOOI1
    public void clear() {
        XiOIO r0 = this.XO0O10;
        if (r0 == null) goto L5;
        XiOIO.OXO1.XIi00iiXO(r0, null, 1, null);
    L5:
        this.XO0O10 = null;
    }

    @Override // com.android.mltcode.paycertificationapi.I0OiOOI1
    @aa1
    public k85<Boolean> iO() {
        return this.iO;
    }

    public /* synthetic */ LocalAudioInputService(AudioRecordManager r1, AudioFileOutputManager r2, int r3, DefaultConstructorMarker r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = null;
    L5:
        this(r1, r2);
    }
}
