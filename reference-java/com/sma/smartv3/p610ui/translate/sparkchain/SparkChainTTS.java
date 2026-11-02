package com.sma.smartv3.p610ui.translate.sparkchain;

import com.android.mltcode.paycertificationapi.IXOX0Xiii;
import com.android.mltcode.paycertificationapi.IiXI1X1OO;
import com.android.mltcode.paycertificationapi.XX01Oi;
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

    /* JADX INFO: renamed from: iO */
    @tb1
    public OnlineTTS f54858iO;

    public static final class OXO1 implements TTSCallbacks {
        public OXO1() {
        }

        @Override // com.iflytek.sparkchain.core.tts.TTSCallbacks
        public void onError(TTS.TTSError tTSError, Object obj) {
            i1O0OXO1O.OXO1.OXO1(SparkChainTTS.this.XIi00iiXO + " onError:" + (tTSError != null ? Integer.valueOf(tTSError.getCode()) : null) + " " + (tTSError != null ? tTSError.getErrMsg() : null) + " ");
        }

        @Override // com.iflytek.sparkchain.core.tts.TTSCallbacks
        public void onResult(TTS.TTSResult tTSResult, Object obj) {
            byte[] data;
            i1O0OXO1O i1o0oxo1o = i1O0OXO1O.OXO1;
            i1o0oxo1o.OXO1(SparkChainTTS.this.XIi00iiXO + " onResult:" + (tTSResult != null ? Integer.valueOf(tTSResult.getStatus()) : null) + " audioSize:" + ((tTSResult == null || (data = tTSResult.getData()) == null) ? null : Integer.valueOf(data.length)));
            if ((tTSResult != null ? tTSResult.getData() : null) != null) {
                FileIOUtils.writeFileFromBytesByStream(SparkChainTTS.this.XO0O10, tTSResult.getData(), true);
            }
            if (tTSResult == null || tTSResult.getStatus() != 2) {
                return;
            }
            i1o0oxo1o.OXO1(SparkChainTTS.this.XIi00iiXO + " 合成完成，文件大小=" + SparkChainTTS.this.XO0O10.length());
            ry0 ry0Var = SparkChainTTS.this.O00;
            String absolutePath = SparkChainTTS.this.XO0O10.getAbsolutePath();
            Intrinsics.O10IXXX0X(absolutePath, "getAbsolutePath(...)");
            ry0Var.mo3016iO(absolutePath);
        }
    }

    public SparkChainTTS(@aa1 i00OIXiO scope) {
        Intrinsics.X0O(scope, "scope");
        this.OXO1 = scope;
        this.XIi00iiXO = "SparkChainTTS";
        this.XO0O10 = new File(uz0.I0iXXO(sz0.OXO1), "ai_tts_" + System.currentTimeMillis() + IiXI1X1OO.O00 + UUID.randomUUID() + ".mp3");
        ry0<String> ry0VarXIi00iiXO = m94.XIi00iiXO(0, 24, null, 5, null);
        this.O00 = ry0VarXIi00iiXO;
        this.IiI10X = iX0XiO.I0iXXO(ry0VarXIi00iiXO);
        this.XOO0ii0 = new OXO1();
    }

    public static /* synthetic */ void OIi0(SparkChainTTS sparkChainTTS, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = "x4_lingxiaolu_en";
        }
        sparkChainTTS.I0IIOi(str, str2);
    }

    public final void I0IIOi(@tb1 String str, @aa1 String pronunciationer) {
        Intrinsics.X0O(pronunciationer, "pronunciationer");
        if (str == null || str.length() == 0) {
            return;
        }
        if (this.f54858iO == null) {
            this.f54858iO = new OnlineTTS(pronunciationer);
        }
        OnlineTTS onlineTTS = this.f54858iO;
        if (onlineTTS != null) {
            onlineTTS.vcn(pronunciationer);
            onlineTTS.aue("lame");
            onlineTTS.pitch(50);
            onlineTTS.speed(50);
            onlineTTS.bgs(0);
        }
        this.XO0O10 = new File(uz0.I0iXXO(sz0.OXO1), "ai_tts_" + System.currentTimeMillis() + IiXI1X1OO.O00 + UUID.randomUUID() + ".mp3");
        OnlineTTS onlineTTS2 = this.f54858iO;
        if (onlineTTS2 != null) {
            onlineTTS2.registerCallbacks(this.XOO0ii0);
        }
        i1O0OXO1O.OXO1.OXO1(this.XIi00iiXO + " " + str + " 合成人:" + pronunciationer + " " + this.XO0O10.getAbsolutePath());
        XX01Oi.IiI10X(this.OXO1, IXOX0Xiii.m712iO(), null, new SparkChainTTS$start$2(this, str, null), 2, null);
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
        OnlineTTS onlineTTS = this.f54858iO;
        if (onlineTTS != null) {
            onlineTTS.stop();
        }
        this.f54858iO = null;
    }
}
