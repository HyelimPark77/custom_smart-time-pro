package com.sma.smartv3.ui.translate.sparkchain;

import com.android.mltcode.paycertificationapi.I100X1;
import com.android.mltcode.paycertificationapi.IXOX0Xiii;
import com.android.mltcode.paycertificationapi.IiXI1X1OO;
import com.android.mltcode.paycertificationapi.aa1;
import com.android.mltcode.paycertificationapi.i00OIXiO;
import com.android.mltcode.paycertificationapi.i1O0OXO1O;
import com.android.mltcode.paycertificationapi.iX0XiO;
import com.android.mltcode.paycertificationapi.l94;
import com.android.mltcode.paycertificationapi.m94;
import com.android.mltcode.paycertificationapi.ry0;
import com.android.mltcode.paycertificationapi.sz0;
import com.android.mltcode.paycertificationapi.tb1;
import com.android.mltcode.paycertificationapi.uz0;
import com.blankj.utilcode.util.FileIOUtils;
import com.iflytek.sparkchain.core.tts.OnlineTTS;
import com.iflytek.sparkchain.core.tts.TTS;
import com.iflytek.sparkchain.core.tts.TTSCallbacks;
import java.io.File;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class SparkChainTTS {

    @aa1
    public final l94<String> IiI10X;

    @aa1
    public final ry0<String> O00;

    @aa1
    public final i00OIXiO OXO1;

    @aa1
    public final String XIi00iiXO;

    @aa1
    public File XO0O10;

    @aa1
    public final TTSCallbacks XOO0ii0;

    @tb1
    public OnlineTTS iO;

    public static final class OXO1 implements TTSCallbacks {
        public final /* synthetic */ SparkChainTTS OXO1;

        public OXO1(SparkChainTTS r1) {
            this.OXO1 = r1;
        }

        @Override // com.iflytek.sparkchain.core.tts.TTSCallbacks
        public void onError(TTS.TTSError r4, Object r5) {
            i1O0OXO1O r6 = i1O0OXO1O.OXO1;
            String r0 = SparkChainTTS.iO(this.OXO1);
            String r1 = null;
            if (r4 == null) goto L5;
            Integer r2 = Integer.valueOf(r4.getCode());
        L6:
            if (r4 == null) goto L8;
            r1 = r4.getErrMsg();
        L8:
            r6.OXO1(r0 + " onError:" + r2 + " " + r1 + " ");
            return;
        L5:
            r2 = null;
            goto L6
        }

        @Override // com.iflytek.sparkchain.core.tts.TTSCallbacks
        public void onResult(TTS.TTSResult r6, Object r7) {
            i1O0OXO1O r8 = i1O0OXO1O.OXO1;
            String r0 = SparkChainTTS.iO(this.OXO1);
            byte[] r1 = null;
            if (r6 == null) goto L5;
            Integer r2 = Integer.valueOf(r6.getStatus());
        L6:
            if (r6 == null) goto L10;
            byte[] r3 = r6.getData();
            if (r3 == null) goto L10;
            Integer r4 = Integer.valueOf(r3.length);
        L11:
            r8.OXO1(r0 + " onResult:" + r2 + " audioSize:" + r4);
            if (r6 == null) goto L14;
            r1 = r6.getData();
        L14:
            if (r1 == null) goto L16;
            FileIOUtils.writeFileFromBytesByStream(SparkChainTTS.OXO1(this.OXO1), r6.getData(), true);
        L16:
            if (r6 != null) goto L18;
            return;
        L18:
            if (r6.getStatus() != 2) goto L22;
            r8.OXO1(SparkChainTTS.iO(this.OXO1) + " 合成完成，文件大小=" + SparkChainTTS.OXO1(this.OXO1).length());
            ry0 r9 = SparkChainTTS.XO0O10(this.OXO1);
            String r10 = SparkChainTTS.OXO1(this.OXO1).getAbsolutePath();
            Intrinsics.O10IXXX0X(r10, "getAbsolutePath(...)");
            r9.iO(r10);
            return;
        L22:
            return;
        L10:
            r4 = null;
            goto L11
        L5:
            r2 = null;
            goto L6
        }
    }

    public SparkChainTTS(@aa1 i00OIXiO r7) {
        Intrinsics.X0O(r7, "scope");
        this.OXO1 = r7;
        this.XIi00iiXO = "SparkChainTTS";
        this.XO0O10 = new File(uz0.I0iXXO(sz0.OXO1), "ai_tts_" + System.currentTimeMillis() + IiXI1X1OO.O00 + UUID.randomUUID() + ".mp3");
        ry0<String> r8 = m94.XIi00iiXO(0, 24, null, 5, null);
        this.O00 = r8;
        this.IiI10X = iX0XiO.I0iXXO(r8);
        this.XOO0ii0 = new OXO1(this);
    }

    public static /* synthetic */ void OIi0(SparkChainTTS r0, String r1, String r2, int r3, Object r4) {
        if ((r3 & 2) == 0) goto L5;
        r2 = "x4_lingxiaolu_en";
    L5:
        r0.I0IIOi(r1, r2);
    }

    public static final /* synthetic */ File OXO1(SparkChainTTS r0) {
        return r0.XO0O10;
    }

    public static final /* synthetic */ OnlineTTS XIi00iiXO(SparkChainTTS r0) {
        return r0.iO;
    }

    public static final /* synthetic */ ry0 XO0O10(SparkChainTTS r0) {
        return r0.O00;
    }

    public static final /* synthetic */ String iO(SparkChainTTS r0) {
        return r0.XIi00iiXO;
    }

    public final void I0IIOi(@tb1 String r8, @aa1 String r9) {
        Intrinsics.X0O(r9, "pronunciationer");
        if (r8 != null) goto L5;
        return;
    L5:
        if (r8.length() != 0) goto L8;
        return;
    L8:
        if (this.iO != null) goto L10;
        this.iO = new OnlineTTS(r9);
    L10:
        OnlineTTS r0 = this.iO;
        if (r0 == null) goto L13;
        r0.vcn(r9);
        r0.aue("lame");
        r0.pitch(50);
        r0.speed(50);
        r0.bgs(0);
    L13:
        this.XO0O10 = new File(uz0.I0iXXO(sz0.OXO1), "ai_tts_" + System.currentTimeMillis() + IiXI1X1OO.O00 + UUID.randomUUID() + ".mp3");
        OnlineTTS r1 = this.iO;
        if (r1 == null) goto L16;
        r1.registerCallbacks(this.XOO0ii0);
    L16:
        i1O0OXO1O.OXO1.OXO1(this.XIi00iiXO + " " + r8 + " 合成人:" + r9 + " " + this.XO0O10.getAbsolutePath());
        I100X1.O00(this.OXO1, IXOX0Xiii.iO(), null, new SparkChainTTS$start$2(this, r8, null), 2, null);
    }

    @aa1
    public final TTSCallbacks IiI10X() {
        return this.XOO0ii0;
    }

    @aa1
    public final l94<String> O00() {
        return this.IiI10X;
    }

    public final void XOO0ii0() {
        OnlineTTS r0 = this.iO;
        if (r0 == null) goto L5;
        r0.stop();
    L5:
        this.iO = null;
    }
}
