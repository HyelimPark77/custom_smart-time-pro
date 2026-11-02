package com.sma.smartv3.util.audio_recorder;

import com.android.mltcode.paycertificationapi.I100X1;
import com.android.mltcode.paycertificationapi.IIXiXO;
import com.android.mltcode.paycertificationapi.IXOX0Xiii;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.i0i0X0;
import com.android.mltcode.paycertificationapi.ii1iXiIX;
import com.android.mltcode.paycertificationapi.pb;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.td;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
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

    @aa1
    public final Lazy iO;

    public AudioFileStreamWriter(@aa1 File r4) {
        Intrinsics.X0O(r4, "file");
        this.OXO1 = r4;
        this.XIi00iiXO = IiI10X.XO0O10(100, null, null, 6, null);
        this.iO = LazyKt__LazyJVMKt.iO(new IIXiXO(this));
        this.XO0O10 = LazyKt__LazyJVMKt.iO(new ii1iXiIX(this));
        if (r4.exists() == true) goto L9;
        File r0 = r4.getParentFile();
        if (r0 == null) goto L7;
        r0.mkdirs();
    L7:
        r4.createNewFile();
        return;
    }

    public static final FileOutputStream I0IIOi(AudioFileStreamWriter r1) {
        return new FileOutputStream(r1.OXO1);
    }

    public static final BufferedOutputStream I0iXXO(AudioFileStreamWriter r1) {
        return new BufferedOutputStream(r1.IO());
    }

    public static final /* synthetic */ BufferedOutputStream IiI10X(AudioFileStreamWriter r0) {
        return r0.OIX0iXi();
    }

    public static final /* synthetic */ O00 O00(AudioFileStreamWriter r0) {
        return r0.XIi00iiXO;
    }

    public static /* synthetic */ FileOutputStream XO0O10(AudioFileStreamWriter r0) {
        return I0IIOi(r0);
    }

    public static /* synthetic */ BufferedOutputStream iO(AudioFileStreamWriter r0) {
        return I0iXXO(r0);
    }

    public final FileOutputStream IO() {
        return (FileOutputStream) getValue();
    }

    public final BufferedOutputStream OIX0iXi() {
        return (BufferedOutputStream) getValue();
    }

    @aa1
    public final File OIi0() {
        return this.OXO1;
    }

    @Override // com.android.mltcode.paycertificationapi.i0i0X0
    public void OXO1(@aa1 i00OIXiO r8) {
        Intrinsics.X0O(r8, "scope");
        this.O00 = I100X1.O00(r8, IXOX0Xiii.iO(), null, new AudioFileStreamWriter$start$1(this, null), 2, null);
    }

    @Override // com.android.mltcode.paycertificationapi.i0i0X0
    @tb1
    public Object XIi00iiXO(@aa1 byte[] r2, @aa1 Continuation<? super Unit> r3) {
        Object r4 = iIXi1iiXI(r2, r3);
        if (r4 != pb.I0iXXO()) goto L6;
        return r4;
    L6:
        return Unit.OXO1;
    }

    public final boolean XOO0ii0() {
        return I0iXXO.OXO1.OXO1(this.XIi00iiXO, null, 1, null);
    }

    @tb1
    public final Object XXI(@aa1 Continuation<? super Unit> r5) {
        if ((r5 instanceof AudioFileStreamWriter$waitWriteAudioAndCancel$1) == false) goto L7;
        AudioFileStreamWriter$waitWriteAudioAndCancel$1 r0 = (AudioFileStreamWriter$waitWriteAudioAndCancel$1) r5;
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
        return Unit.OXO1;
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
        r0 = new AudioFileStreamWriter$waitWriteAudioAndCancel$1(this, r5);
        goto L8
    }

    @Override // com.android.mltcode.paycertificationapi.i0i0X0
    public void close() {
        OIX0iXi().flush();     // Catch: Exception -> L4
        OIX0iXi().close();     // Catch: Exception -> L4
        return;
    L4:
        e = move-exception;
        e.printStackTrace();
    }
}
