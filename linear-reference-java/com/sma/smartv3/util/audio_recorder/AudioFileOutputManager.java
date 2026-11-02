package com.sma.smartv3.util.audio_recorder;

import com.android.mltcode.paycertificationapi.IXOOiIIII;
import com.android.mltcode.paycertificationapi.IiXI1X1OO;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.pb;
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

    @tb1
    public AudioFileStreamWriter iO;

    /* JADX WARN: Multi-variable type inference failed */
    public AudioFileOutputManager() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.android.mltcode.paycertificationapi.IXOOiIIII
    @tb1
    public Object IiI10X(@aa1 byte[] r2, @aa1 Continuation<? super Unit> r3) {
        AudioFileStreamWriter r0 = this.iO;
        if (r0 == null) goto L10;
        Object r4 = r0.XIi00iiXO(r2, r3);
        if (r4 != pb.I0iXXO()) goto L8;
        return r4;
    L8:
        return Unit.OXO1;
    L10:
        return Unit.OXO1;
    }

    @Override // com.android.mltcode.paycertificationapi.IXOOiIIII
    @tb1
    public Object O00(@aa1 Continuation<? super Unit> r2) {
        AudioFileStreamWriter r0 = this.iO;
        if (r0 == null) goto L10;
        Object r3 = r0.XXI(r2);
        if (r3 != pb.I0iXXO()) goto L8;
        return r3;
    L8:
        return Unit.OXO1;
    L10:
        return Unit.OXO1;
    }

    @Override // com.android.mltcode.paycertificationapi.IXOOiIIII
    @tb1
    public Object OXO1(@aa1 Continuation<? super Unit> r5) {
        if ((r5 instanceof AudioFileOutputManager$clear$1) == false) goto L7;
        AudioFileOutputManager$clear$1 r0 = (AudioFileOutputManager$clear$1) r5;
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
    L22:
        AudioFileStreamWriter r7 = this.iO;
        if (r7 == null) goto L26;
        r7.close();
    L26:
        return Unit.OXO1;
    L13:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L14:
        ResultKt.X1ii(r6);
        AudioFileStreamWriter r8 = this.iO;
        if (r8 == null) goto L17;
        Boxing.OXO1(r8.XOO0ii0());
    L17:
        AudioFileStreamWriter r9 = this.iO;
        if (r9 == null) goto L22;
        r0.label = 1;
        if (r9.XXI(r0) != r2) goto L22;
        return r2;
    L7:
        r0 = new AudioFileOutputManager$clear$1(this, r5);
        goto L8
    }

    @Override // com.android.mltcode.paycertificationapi.IXOOiIIII
    public void XIi00iiXO(@aa1 i00OIXiO r4) {
        Intrinsics.X0O(r4, "scope");
        AudioFileStreamWriter r0 = new AudioFileStreamWriter(new File(XOO0ii0()));
        r0.OXO1(r4);
        this.iO = r0;
    }

    @Override // com.android.mltcode.paycertificationapi.IXOOiIIII
    @tb1
    public Object XO0O10(@aa1 Continuation<? super Unit> r5) {
        if ((r5 instanceof AudioFileOutputManager$closeAudioWrite$1) == false) goto L7;
        AudioFileOutputManager$closeAudioWrite$1 r0 = (AudioFileOutputManager$closeAudioWrite$1) r5;
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
        AudioFileStreamWriter r7 = this.iO;
        if (r7 == null) goto L23;
        r7.close();
    L23:
        return Unit.OXO1;
    L13:
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    L14:
        ResultKt.X1ii(r6);
        AudioFileStreamWriter r8 = this.iO;
        if (r8 == null) goto L19;
        r0.label = 1;
        if (r8.XXI(r0) != r2) goto L19;
        return r2;
    L7:
        r0 = new AudioFileOutputManager$closeAudioWrite$1(this, r5);
        goto L8
    }

    public final String XOO0ii0() {
        long r0 = System.currentTimeMillis();
        String r2 = UUID.randomUUID().toString();
        Intrinsics.O10IXXX0X(r2, "toString(...)");
        String r1 = r0 + IiXI1X1OO.O00 + StringsKt___StringsKt.iX1iii(r2, 6);
        return this.XIi00iiXO + "/file/audio/" + r1 + FileUtils.FILE_EXTENSION_SEPARATOR + this.OXO1;
    }

    @Override // com.android.mltcode.paycertificationapi.IXOOiIIII
    @tb1
    public String iO() {
        AudioFileStreamWriter r0 = this.iO;
        if (r0 == null) goto L8;
        File r1 = r0.OIi0();
        if (r1 != null) goto L7;
        return null;
    L7:
        return r1.getAbsolutePath();
    L8:
        return null;
    }

    public AudioFileOutputManager(@aa1 String r2) {
        Intrinsics.X0O(r2, "fileExtension");
        this.OXO1 = r2;
        this.XIi00iiXO = PathUtils.getExternalAppDataPath();
    }

    public /* synthetic */ AudioFileOutputManager(String r1, int r2, DefaultConstructorMarker r3) {
        if ((r2 & 1) == 0) goto L5;
        r1 = "pcm";
    L5:
        this(r1);
    }
}
