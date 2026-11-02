package com.sma.smartv3.util.audio_recorder;

import android.media.AudioRecord;
import com.android.mltcode.paycertificationapi.I100X1;
import com.android.mltcode.paycertificationapi.IXOX0Xiii;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.iX0XiO;
import com.android.mltcode.paycertificationapi.ii0iIIX0;
import com.android.mltcode.paycertificationapi.k85;
import com.android.mltcode.paycertificationapi.l85;
import com.android.mltcode.paycertificationapi.pb;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.td;
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

    @aa1
    public final k85<Boolean> IO;

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
    public final int iO;

    public AudioRecordManager() {
        int r1 = 0;
        int r2 = 0;
        int r3 = 0;
        int r4 = 0;
        this(r1, r2, r3, r4, 15, null);
    }

    public static final /* synthetic */ O00 OXO1(AudioRecordManager r0) {
        return r0.I0IIOi;
    }

    public static final /* synthetic */ AudioRecord XIi00iiXO(AudioRecordManager r0) {
        return r0.IiI10X;
    }

    public static final /* synthetic */ ty0 XO0O10(AudioRecordManager r0) {
        return r0.OIi0;
    }

    public static final /* synthetic */ int iO(AudioRecordManager r0) {
        return r0.XO0O10;
    }

    public final void I0IIOi(i00OIXiO r10) {
        AudioRecord r0 = this.IiI10X;
        if (r0 == null) goto L11;
    L8:
        e = move-exception;
        e.printStackTrace();
        goto L11
    L5:
        if (r0.getRecordingState() != 3) goto L11;
        r0.stop();     // Catch: Exception -> L8
    L11:
        if (this.IiI10X != null) goto L28;
        int r1 = AudioRecord.getMinBufferSize(this.OXO1, this.XIi00iiXO, this.iO);
        if (r1 > 0) goto L16;
        i1O0OXO1O.OXO1.OXO1("AudioRecord 参数不支持");
        return;
    L16:
        AudioRecord r2 = new AudioRecord(this.XOO0ii0, this.OXO1, this.XIi00iiXO, this.iO, Math.max(this.XO0O10, r1));
        this.IiI10X = r2;
        if (r2.getState() == 1) goto L28;
        i1O0OXO1O r11 = i1O0OXO1O.OXO1;
        AudioRecord r3 = this.IiI10X;
        if (r3 == null) goto L22;
        Integer r4 = Integer.valueOf(r3.getState());
    L23:
        r11.OXO1("AudioRecord 初始化失败 state=" + r4);
        AudioRecord r12 = this.IiI10X;
        if (r12 == null) goto L26;
        r12.release();
    L26:
        this.IiI10X = null;
        return;
    L22:
        r4 = null;
    L28:
        AudioRecord r5 = this.IiI10X;
        if (r5 == null) goto L31;
        r5.startRecording();
    L31:
        setValue(Boolean.TRUE);
        this.O00 = I100X1.O00(r10, IXOX0Xiii.iO(), null, new AudioRecordManager$startRecord$2(this, null), 2, null);
    }

    @aa1
    public final k85<Boolean> IiI10X() {
        return this.IO;
    }

    @aa1
    public final ii0iIIX0<byte[]> O00() {
        return iX0XiO.iIIIiIO0(this.I0IIOi);
    }

    @tb1
    public final Object OIi0(@aa1 Continuation<? super Unit> r5) {
        if ((r5 instanceof AudioRecordManager$stop$1) == false) goto L7;
        AudioRecordManager$stop$1 r0 = (AudioRecordManager$stop$1) r5;
        int r1 = r0.label;
        if ((r1 & Integer.MIN_VALUE) == 0) goto L7;
        r0.label = r1 - Integer.MIN_VALUE;
    L8:
        Object r6 = r0.result;
        Object r2 = pb.I0iXXO();
        int r3 = r0.label;
        if (r3 == 0) goto L14;
        if (r3 != 1) goto L13;
        ResultKt.X1ii(r6);
    L19:
        this.O00 = null;
        setValue(Boxing.OXO1(false));
        AudioRecord r4 = this.IiI10X;
        if (r4 != null) goto L36;
    L34:
        this.IiI10X = null;
        return Unit.OXO1;
    L36:
    L27:
        e = move-exception;
        e.printStackTrace();     // Catch: Throwable -> L25
    L29:
        r4.release();
    L25:
        th = move-exception;
        r4.release();
        throw th;
    L22:
        if (r4.getRecordingState() != 3) goto L29;
        r4.stop();     // Catch: Throwable -> L25 Exception -> L27
    L13:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L14:
        ResultKt.X1ii(r6);
        XiOIO r7 = this.O00;
        if (r7 == null) goto L19;
        r0.label = 1;
        if (td.I0iXXO(r7, r0) != r2) goto L19;
        return r2;
    L7:
        r0 = new AudioRecordManager$stop$1(this, r5);
        goto L8
    }

    public final void XOO0ii0(@aa1 i00OIXiO r2) {
        Intrinsics.X0O(r2, "scope");
        if (getValue().booleanValue() == false) goto L5;
        return;
    L5:
        I0IIOi(r2);
    }

    public AudioRecordManager(int r1, int r2, int r3, int r4) {
        this.OXO1 = r1;
        this.XIi00iiXO = r2;
        this.iO = r3;
        this.XO0O10 = AudioRecord.getMinBufferSize(r1, r2, r3) * r4;
        this.XOO0ii0 = 1;
        this.I0IIOi = IiI10X.XO0O10(0, null, null, 7, null);
        ty0<Boolean> r5 = l85.OXO1(Boolean.FALSE);
        this.OIi0 = r5;
        this.IO = iX0XiO.XXI(r5);
    }

    public /* synthetic */ AudioRecordManager(int r2, int r3, int r4, int r5, int r6, DefaultConstructorMarker r7) {
        if ((r6 & 1) == 0) goto L6;
        r2 = 16000;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r3 = 16;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r4 = 2;
    L12:
        if ((r6 & 8) == 0) goto L14;
        r5 = 2;
    L14:
        this(r2, r3, r4, r5);
    }
}
